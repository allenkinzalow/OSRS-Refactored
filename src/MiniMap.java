/**
 * Created by Allen Kinzalow on 1/23/2015.
 */
public class MiniMap {

    static PaletteSprite mapBackSprite;
    static RGBSprite compassSprite;
    static RGBSprite miniMapSprite;
    static int mapIconAmt = 0;
    static RGBSprite[] mapFunctionIcons;
    static RGBSprite[] visibleMapIcons = new RGBSprite[1000];
    static int[] mapIconTileX = new int[1000];
    static int[] mapIconTileY = new int[1000];
    static RGBSprite mapEdgeSprite;
    static PaletteSprite[] mapSceneIcons;
    static RGBSprite[] mapMarkerSprites;
    static RGBSprite[] mapDotSprites;

    static final void renderMinimap(int plane, byte var1) {
        int[] mapPixels = miniMapSprite.pixels;
        int mapLength = mapPixels.length;

        for (int pixel = 0; pixel < mapLength; ++pixel) {
            mapPixels[pixel] = 0;
        }

        int var7;
        int xTile;
        for (int y = 1; y < 103; ++y) {
            var7 = (103 - y) * 2048 + 24628;

            for (int x = 1; x < 103; ++x) {
                if (0 == (RegionReference.mapTileSettings[plane][x][y] & 24)) {
                    Scene.gameScene.drawMinimapTile(mapPixels, var7, 512, plane, x, y);
                }

                if (plane < 3 && (RegionReference.mapTileSettings[plane + 1][x][y] & 8) != 0) {
                    Scene.gameScene.drawMinimapTile(mapPixels, var7, 512, plane + 1, x, y);
                }

                var7 += 4;
            }
        }

        int primaryColor = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int secondaryColor = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        miniMapSprite.method2744();

        int yTile;
        for (int y = 1; y < 103; ++y) {
            for (int x = 1; x < 103; ++x) {
                if ((RegionReference.mapTileSettings[plane][x][y] & 24) == 0) {
                    drawMapScenes(plane, x, y, primaryColor, secondaryColor, -1813376301);
                }

                if (plane < 3 && (RegionReference.mapTileSettings[plane + 1][x][y] & 8) != 0) {
                    drawMapScenes(plane + 1, x, y, primaryColor, secondaryColor, -1813376301);
                }
            }
        }

        mapIconAmt = 0;

        for (xTile = 0; xTile < 104; ++xTile) {
            for (yTile = 0; yTile < 104; ++yTile) {
                int var6 = Scene.gameScene.fetchGroundTileDecorationHash(VarpBit.plane * -570926309, xTile, yTile);
                if (var6 != 0) {
                    var6 = var6 >> 14 & 32767;
                    int mapIconID = ObjectDefinition.getObjectDefForID(var6, (byte) 0).mapIconID * 334594829;
                    if (mapIconID >= 0) {
                        int xClip = xTile;
                        int yClip = yTile;
                        if (mapIconID != 22 && mapIconID != 29 && mapIconID != 34 && mapIconID != 36 && 46 != mapIconID && mapIconID != 47 && mapIconID != 48) {
                            int[][] clipData = Client.clippingPlanes[VarpBit.plane * -570926309].clipData;

                            for (int clipIndex = 0; clipIndex < 10; ++clipIndex) {
                                int var9 = (int) (Math.random() * 4.0D);
                                if (var9 == 0 && xClip > 0 && xClip > xTile - 3 && 0 == (clipData[xClip - 1][yClip] & 19136776)) {
                                    --xClip;
                                }

                                if (1 == var9 && xClip < 103 && xClip < 3 + xTile && 0 == (clipData[1 + xClip][yClip] & 19136896)) {
                                    ++xClip;
                                }

                                if (2 == var9 && yClip > 0 && yClip > yTile - 3 && (clipData[xClip][yClip - 1] & 19136770) == 0) {
                                    --yClip;
                                }

                                if (3 == var9 && yClip < 103 && yClip < yTile + 3 && (clipData[xClip][yClip + 1] & 19136800) == 0) {
                                    ++yClip;
                                }
                            }
                        }

                        visibleMapIcons[mapIconAmt * 396638539] = mapFunctionIcons[mapIconID];
                        mapIconTileX[mapIconAmt * 396638539] = xClip;
                        mapIconTileY[mapIconAmt * 396638539] = yClip;
                        mapIconAmt += 745179235;
                    }
                }
            }
        }

        Class63.aClass13_830.method260(-1763862346);
    }

    static final void drawMapScenes(int var0, int xPos, int yPos, int var3, int var4, int var5) {
       int var6 = Scene.gameScene.fetchWallObjectHash(var0, xPos, yPos);
       int var7;
       int var8;
       int var9;
       int var10;
       int var11;
       int objectID;
       if(var6 != 0) {
          var8 = Scene.gameScene.method431(var0, xPos, yPos, var6);
          var9 = var8 >> 6 & 3;
          var7 = var8 & 31;
          var10 = var3;
          if(var6 > 0) {
             var10 = var4;
          }

          int[] pixels = miniMapSprite.pixels;
          var11 = xPos * 4 + 24624 + (103 - yPos) * 2048;
          objectID = var6 >> 14 & 32767;
          ObjectDefinition objectDef = ObjectDefinition.getObjectDefForID(objectID, (byte) 0);
          if(objectDef.mapSceneID * -368925089 != -1) {
             PaletteSprite sprite = mapSceneIcons[objectDef.mapSceneID * -368925089];
             if(sprite != null) {
                int var16 = (objectDef.sizeX * -1409758236 - sprite.anInt2413) / 2;
                int var17 = (objectDef.sizeY * 921357316 - sprite.anInt2414) / 2;
                sprite.drawSprite(var16 + 48 + xPos * 4, (104 - yPos - objectDef.sizeY * -1917144319) * 4 + 48 + var17);
             }
          } else {
             if(0 == var7 || 2 == var7) {
                if(var9 == 0) {
                   pixels[var11] = var10;
                   pixels[var11 + 512] = var10;
                   pixels[1024 + var11] = var10;
                   pixels[var11 + 1536] = var10;
                } else if(var9 == 1) {
                   pixels[var11] = var10;
                   pixels[var11 + 1] = var10;
                   pixels[var11 + 2] = var10;
                   pixels[3 + var11] = var10;
                } else if(2 == var9) {
                   pixels[var11 + 3] = var10;
                   pixels[512 + 3 + var11] = var10;
                   pixels[1024 + var11 + 3] = var10;
                   pixels[var11 + 3 + 1536] = var10;
                } else if(3 == var9) {
                   pixels[var11 + 1536] = var10;
                   pixels[1 + var11 + 1536] = var10;
                   pixels[2 + var11 + 1536] = var10;
                   pixels[3 + 1536 + var11] = var10;
                }
             }

             if(var7 == 3) {
                if(var9 == 0) {
                   pixels[var11] = var10;
                } else if(var9 == 1) {
                   pixels[3 + var11] = var10;
                } else if(var9 == 2) {
                   pixels[1536 + var11 + 3] = var10;
                } else if(3 == var9) {
                   pixels[var11 + 1536] = var10;
                }
             }

             if(2 == var7) {
                if(3 == var9) {
                   pixels[var11] = var10;
                   pixels[512 + var11] = var10;
                   pixels[var11 + 1024] = var10;
                   pixels[var11 + 1536] = var10;
                } else if(var9 == 0) {
                   pixels[var11] = var10;
                   pixels[1 + var11] = var10;
                   pixels[var11 + 2] = var10;
                   pixels[var11 + 3] = var10;
                } else if(1 == var9) {
                   pixels[var11 + 3] = var10;
                   pixels[var11 + 3 + 512] = var10;
                   pixels[1024 + var11 + 3] = var10;
                   pixels[var11 + 3 + 1536] = var10;
                } else if(var9 == 2) {
                   pixels[var11 + 1536] = var10;
                   pixels[1 + var11 + 1536] = var10;
                   pixels[var11 + 1536 + 2] = var10;
                   pixels[3 + 1536 + var11] = var10;
                }
             }
          }
       }

       var6 = Scene.gameScene.fetchTileInteractableHash(var0, xPos, yPos);
       if(0 != var6) {
          var8 = Scene.gameScene.method431(var0, xPos, yPos, var6);
          var9 = var8 >> 6 & 3;
          var7 = var8 & 31;
          var10 = var6 >> 14 & 32767;
          ObjectDefinition objectDef = ObjectDefinition.getObjectDefForID(var10, (byte) 0);
          int var22;
          if(-1 != objectDef.mapSceneID * -368925089) {
             PaletteSprite sprite = mapSceneIcons[objectDef.mapSceneID * -368925089];
             if(sprite != null) {
                int xOFf = (objectDef.sizeX * -1409758236 - sprite.anInt2413) / 2;
                int yOff = (objectDef.sizeY * 921357316 - sprite.anInt2414) / 2;
                sprite.drawSprite(xOFf + xPos * 4 + 48, (104 - yPos - objectDef.sizeY * -1917144319) * 4 + 48 + yOff);
             }
          } else if(9 == var7) {
             var11 = 15658734;
             if(var6 > 0) {
                var11 = 15597568;
             }

             int[] var21 = miniMapSprite.pixels;
             var22 = (103 - yPos) * 2048 + xPos * 4 + 24624;
             if(var9 != 0 && var9 != 2) {
                var21[var22] = var11;
                var21[var22 + 512 + 1] = var11;
                var21[var22 + 1024 + 2] = var11;
                var21[var22 + 1536 + 3] = var11;
             } else {
                var21[var22 + 1536] = var11;
                var21[1024 + var22 + 1] = var11;
                var21[var22 + 512 + 2] = var11;
                var21[var22 + 3] = var11;
             }
          }
       }

       var6 = Scene.gameScene.fetchGroundTileDecorationHash(var0, xPos, yPos);
       if(var6 != 0) {
          var8 = var6 >> 14 & 32767;
          ObjectDefinition var19 = ObjectDefinition.getObjectDefForID(var8, (byte) 0);
          if(-1 != var19.mapSceneID * -368925089) {
             PaletteSprite var18 = mapSceneIcons[var19.mapSceneID * -368925089];
             if(null != var18) {
                var10 = (var19.sizeX * -1409758236 - var18.anInt2413) / 2;
                int var24 = (var19.sizeY * 921357316 - var18.anInt2414) / 2;
                var18.drawSprite(xPos * 4 + 48 + var10, var24 + (104 - yPos - var19.sizeY * -1917144319) * 4 + 48);
             }
          }
       }
    }

    static final void renderMiniMap(int xPos, int yPos, int var2, short var3) {
        Friend.method660(-2023108021);
        Rasterizer2D.setRasterizationRect(xPos, yPos, xPos + mapBackSprite.anInt2413, mapBackSprite.anInt2414 + yPos);
        if (2 != Client.anInt2935 * -1279723019 && Client.anInt2935 * -1279723019 != 5) {
            int rotation = Client.anInt2775 * 1889215063 + Client.anInt2771 * -44898889 & 2047;
            int var9 = Player.myPlayer.anInt2394 * 171470795 / 32 + 48;
            int var10 = 464 - Player.myPlayer.anInt2339 * 826764905 / 32;

            miniMapSprite.method2755(25 + xPos, 5 + yPos, 146, 151, var9, var10, rotation, 256 + Client.anInt2957 * 331969371, OverlayFloorDefinition.anIntArray2221, Varp.anIntArray2043);

            int var5;
            int var6;
            int var7;
            /* Render map info icons */
            for (var5 = 0; var5 < mapIconAmt * 396638539; ++var5) {
                var6 = mapIconTileX[var5] * 4 + 2 - Player.myPlayer.anInt2394 * 171470795 / 32;
                var7 = mapIconTileY[var5] * 4 + 2 - Player.myPlayer.anInt2339 * 826764905 / 32;
                ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var6, var7, visibleMapIcons[var5]);
            }

            int var11;
            int var12;
            for (int x = 0; x < 104; ++x) {
                for (int y = 0; y < 104; ++y) {
                    Deque groundItem = Client.groundItemArray[VarpBit.plane * -570926309][x][y];
                    if (groundItem != null) {
                        var11 = x * 4 + 2 - Player.myPlayer.anInt2394 * 171470795 / 32;
                        var12 = y * 4 + 2 - Player.myPlayer.anInt2339 * 826764905 / 32;
                        ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var11, var12, mapDotSprites[0]);
                    }
                }
            }

            for (int npcIndex = 0; npcIndex < Client.anInt2749 * -1829405175; ++npcIndex) {
                NPC var14 = Client.localNPCs[Client.npcIndices[npcIndex]];
                if (null != var14 && var14.method2731(644893995)) {
                    NPCDefinition npcDef = var14.definition;
                    if (npcDef != null && npcDef.anIntArray2185 != null) {
                        npcDef = npcDef.method2290(1244745727);
                    }

                    if (npcDef != null && npcDef.renderOnMinimap && npcDef.isClickable) {
                        var11 = var14.anInt2394 * 171470795 / 32 - Player.myPlayer.anInt2394 * 171470795 / 32;
                        var12 = var14.anInt2339 * 826764905 / 32 - Player.myPlayer.anInt2339 * 826764905 / 32;
                        ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var11, var12, mapDotSprites[1]);
                    }
                }
            }

            /* Draw players */
            for (int playerIndex = 0; playerIndex < Client.numLocalPlayers * -43742683; ++playerIndex) {
                Player player = Client.localPlayers[Client.playerIndices[playerIndex]];
                if (player != null && player.method2731(-1011231754) && !player.aBool2682) {
                    var7 = player.anInt2394 * 171470795 / 32 - Player.myPlayer.anInt2394 * 171470795 / 32;
                    var11 = player.anInt2339 * 826764905 / 32 - Player.myPlayer.anInt2339 * 826764905 / 32;
                    boolean isFriend = false;
                    if (Friend.isFriend(player.playerName, true, (byte) 1)) {
                        isFriend = true;
                    }

                    boolean isFriendsChat = false;

                    for (int friendsChatIndex = 0; friendsChatIndex < Friend.friendsChatListCount * 1727166727; ++friendsChatIndex) {
                        if (player.playerName.equals(FriendsChatMember.friendsChatList[friendsChatIndex].username)) {
                            isFriendsChat = true;
                            break;
                        }
                    }

                    boolean onTeam = false;
                    if (Player.myPlayer.playerTeamID * -1623092945 != 0 && 0 != player.playerTeamID * -1623092945 && Player.myPlayer.playerTeamID * -1623092945 == player.playerTeamID * -1623092945) {
                        onTeam = true;
                    }

                    if (isFriend) {
                        ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var7, var11, mapDotSprites[3]);
                    } else if (onTeam) {
                        ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var7, var11, mapDotSprites[4]);
                    } else if (isFriendsChat) {
                        ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var7, var11, mapDotSprites[5]);
                    } else {
                        ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var7, var11, mapDotSprites[2]);
                    }
                }
            }

            if (Client.anInt2723 * -927004421 != 0 && Client.cycle * -637317861 % 20 < 10) {
                if (1 == Client.anInt2723 * -927004421 && Client.anInt2724 * -923839899 >= 0 && Client.anInt2724 * -923839899 < Client.localNPCs.length) {
                    NPC npcDef = Client.localNPCs[Client.anInt2724 * -923839899];
                    if (npcDef != null) {
                        var6 = npcDef.anInt2394 * 171470795 / 32 - Player.myPlayer.anInt2394 * 171470795 / 32;
                        var7 = npcDef.anInt2339 * 826764905 / 32 - Player.myPlayer.anInt2339 * 826764905 / 32;
                        Varp.method2152(xPos, yPos, var6, var7, mapMarkerSprites[1], (byte) 127);
                    }
                }

                if (2 == Client.anInt2723 * -927004421) {
                    var5 = 2 + (Client.anInt2726 * -1027873740 - Class100.anInt1388 * 1052205508) - Player.myPlayer.anInt2394 * 171470795 / 32;
                    var6 = Client.anInt2727 * 444255620 - SoundEffectWorker.anInt201 * 1617363908 + 2 - Player.myPlayer.anInt2339 * 826764905 / 32;
                    Varp.method2152(xPos, yPos, var5, var6, mapMarkerSprites[1], (byte) 127);
                }

                if (Client.anInt2723 * -927004421 == 10 && Client.anInt2795 * 1790148709 >= 0 && Client.anInt2795 * 1790148709 < Client.localPlayers.length) {
                    Player player = Client.localPlayers[Client.anInt2795 * 1790148709];
                    if (player != null) {
                        var6 = player.anInt2394 * 171470795 / 32 - Player.myPlayer.anInt2394 * 171470795 / 32;
                        var7 = player.anInt2339 * 826764905 / 32 - Player.myPlayer.anInt2339 * 826764905 / 32;
                        Varp.method2152(xPos, yPos, var6, var7, mapMarkerSprites[1], (byte) 84);
                    }
                }
            }

            if (0 != Client.anInt2933 * -1708054643) {
                var5 = 2 + Client.anInt2933 * 1757716020 - Player.myPlayer.anInt2394 * 171470795 / 32;
                var6 = Client.anInt2894 * -520325596 + 2 - Player.myPlayer.anInt2339 * 826764905 / 32;
                ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var5, var6, mapMarkerSprites[0]);
            }

            if (!Player.myPlayer.aBool2682) {
                Rasterizer2D.drawFilledRectangle(xPos + 93 + 4, 82 + yPos - 4, 3, 3, 16777215);
            }
        } else {
            Rasterizer2D.method2511(25 + xPos, 5 + yPos, 0, OverlayFloorDefinition.anIntArray2221, Varp.anIntArray2043);
        }

        if (Client.anInt2935 * -1279723019 < 3) {
            compassSprite.method2755(xPos, yPos, 33, 33, 25, 25, Client.anInt2771 * -44898889, 256, Ignore.anIntArray397, ChatMessagesContainer.anIntArray332);
        } else {
            Rasterizer2D.method2511(xPos, yPos, 0, Ignore.anIntArray397, ChatMessagesContainer.anIntArray332);
        }

        if (Client.aBoolArray2831[var2]) {
            mapBackSprite.drawSprite(xPos, yPos);
        }

        Client.aBoolArray2910[var2] = true;
    }
}
