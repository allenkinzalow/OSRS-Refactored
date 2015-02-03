
public final class RegionReference {

   static int[] anIntArray483 = new int[]{16, 32, 64, 128};
   static int[] blendedHue;
   static int anInt485 = 1529001613;
   static byte[][][] overlayFloorIds;
   static byte[][][] overlayClippingPaths;
   static byte[][][] aByteArrayArrayArray488;
   static int[] blendedSaturation;
   static int[] anIntArray491 = new int[]{1, 2, 4, 8};
   static int[] anIntArray492 = new int[]{1, -1, -1, 1};
   static int[] anIntArray493 = new int[]{1, 0, -1, 0};
   static int[] anIntArray494 = new int[]{0, -1, 0, 1};
   static byte[][][] mapTileSettings = new byte[4][104][104];
   static int[] anIntArray496 = new int[]{-1, -1, 1, 1};
   static int[][][] tileHeights = new int[4][105][105];
   static int lightnessRandomizer = ((int)(Math.random() * 33.0D) - 16) * 1990361651;
   static int hueRandomizer = ((int)(Math.random() * 17.0D) - 8) * -1535870085;
   static int[] objectLandscapeIDs;
   static byte[][] terrainData;
   static int[] terrainLandscapeIDs;
   static CacheIndex landscapeIndex;
   static byte[][][] overlayRotations;
   static int[][] tileLightingIntensity;


   static void method587(int indexID, IndexTable indexTable, CacheIndex cacheIndex, int var3) {
      byte[] var4 = null;
      Deque var5 = CacheRequestDispatcher.cacheIndexRequests;
      synchronized(var5) {
         CacheIndexRequest indexRequest = (CacheIndexRequest) CacheRequestDispatcher.cacheIndexRequests.getFront();

         while(indexRequest != null) {
            if((long)indexID != indexRequest.key || indexRequest.cacheIndexTable != indexTable || indexRequest.anInt1759 * -612139703 != 0) {
               indexRequest = (CacheIndexRequest) CacheRequestDispatcher.cacheIndexRequests.getNext();
            } else {
               var4 = indexRequest.indexData;
               break;
            }
         }
      }

      if(null != var4) {
         cacheIndex.method1906(indexTable, indexID, var4, true, 579837078);
      } else {
         byte[] data = indexTable.get(indexID, (byte)39);
         cacheIndex.method1906(indexTable, indexID, data, true, -1957699113);
      }
   }

   static final void method588(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] collisionMap, short var9) {
      int var12;
      for(int var10 = 0; var10 < 8; ++var10) {
         for(var12 = 0; var12 < 8; ++var12) {
            if(var10 + var2 > 0 && var10 + var2 < 103 && var12 + var3 > 0 && var3 + var12 < 103) {
               collisionMap[var1].clipData[var10 + var2][var3 + var12] &= -16777217;
            }
         }
      }

      RSByteBuffer var14 = new RSByteBuffer(var0);

      for(var12 = 0; var12 < 4; ++var12) {
         for(int var11 = 0; var11 < 64; ++var11) {
            for(int var13 = 0; var13 < 64; ++var13) {
               if(var4 == var12 && var11 >= var5 && var11 < 8 + var5 && var13 >= var6 && var13 < var6 + 8) {
                  ClientScriptDefinition.method2566(var14, var1, var2 + method621(var11 & 7, var13 & 7, var7, -617553596), var3 + URLSession.method653(var11 & 7, var13 & 7, var7, 1379797264), 0, 0, var7, (byte)-58);
               } else {
                  ClientScriptDefinition.method2566(var14, 0, -1, -1, 0, 0, 0, (byte)-48);
               }
            }
         }
      }

   }

   RegionReference() throws Throwable {
      throw new Error();
   }

   static final byte[] method618(byte[] var0) {
      RSByteBuffer var2 = new RSByteBuffer(var0);
      int var6 = var2.readUByte();
      int var5 = var2.readInt();
      if(var5 >= 0 && (AbstractIndex.anInt945 * -2077097137 == 0 || var5 <= AbstractIndex.anInt945 * -2077097137)) {
         if(var6 == 0) {
            byte[] var7 = new byte[var5];
            var2.readBytes(var7, 0, var5, -765811799);
            return var7;
         } else {
            int targsize = var2.readInt();
	         if (targsize < 0 || targsize > 1000000) {
		         return new byte[100];
	         }

            if(targsize >= 0 && (AbstractIndex.anInt945 * -2077097137 == 0 || targsize <= AbstractIndex.anInt945 * -2077097137)) {
               byte[] var3 = new byte[targsize];
               if(1 == var6) {
                  BZip2Decompressor.method943(var3, targsize, var0, var5, 9);
               } else {
                  AbstractIndex.aClass45_936.method666(var2, var3, (byte)85);
               }

               return var3;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   public static int method621(int var0, int var1, int var2, int var3) {
      var2 &= 3;
      return var2 == 0?var0:(var2 == 1?var1:(var2 == 2?7 - var0:7 - var1));
   }

   static final void loadAndRenderRegion(byte var0) {
      Class23.method343(false, (byte)2);
      Client.anInt2759 = 0;
      boolean var6 = true;

      int var4;
      for(var4 = 0; var4 < terrainData.length; ++var4) {
         if(terrainLandscapeIDs[var4] != -1 && terrainData[var4] == null) {
            terrainData[var4] = landscapeIndex.getFile(terrainLandscapeIDs[var4], 0, (byte) 7);
            if(null == terrainData[var4]) {
               var6 = false;
               Client.anInt2759 -= 903859995;
            }
         }

         if(-1 != objectLandscapeIDs[var4] && ClientScriptDefinition.objectData[var4] == null) {
            ClientScriptDefinition.objectData[var4] = landscapeIndex.getFileData(objectLandscapeIDs[var4], 0, Class47.xteaMapKeys[var4]);
            if(ClientScriptDefinition.objectData[var4] == null) {
               var6 = false;
               Client.anInt2759 -= 903859995;
            }
         }
      }

      if(!var6) {
         Client.anInt2943 = -877411717;
      } else {
         Client.anInt2761 = 0;
         var6 = true;

         int localY;
         int var5;
         int var12;
         int localX;
         int var15;
         int var18;
         int var20;
         int var21;
         int var22;
         for(var4 = 0; var4 < terrainData.length; ++var4) {
            byte[] data = ClientScriptDefinition.objectData[var4];
            if(data != null) {
               localX = (GraphicsBuffer.mapCoordinates[var4] >> 8) * 64 - Class100.anInt1388 * 263051377;
               localY = (GraphicsBuffer.mapCoordinates[var4] & 255) * 64 - SoundEffectWorker.anInt201 * -1743142671;
               if(Client.isAtDynamicMap) {
                  localX = 10;
                  localY = 10;
               }

               boolean var16 = true;
               RSByteBuffer buffer = new RSByteBuffer(data);
               var18 = -1;

               label601:
               while(true) {
                  var12 = buffer.readSmart((short) -6739);
                  if(0 == var12) {
                     var6 &= var16;
                     break;
                  }

                  var18 += var12;
                  var5 = 0;
                  boolean var19 = false;

                  while(true) {
                     while(!var19) {
                        var20 = buffer.readSmart((short) 9493);
                        if(var20 == 0) {
                           continue label601;
                        }

                        var5 += var20 - 1;
                        var21 = var5 & 63;
                        var15 = var5 >> 6 & 63;
                        var22 = buffer.readUByte() >> 2;
                        int var23 = localX + var15;
                        int var8 = localY + var21;
                        if(var23 > 0 && var8 > 0 && var23 < 103 && var8 < 103) {
                           ObjectDefinition objectDef = ObjectDefinition.getObjectDefForID(var18, (byte) 0);
                           if(var22 != 22 || !Client.lowMemory || 0 != objectDef.anInt2088 * 619772583 || 1 == objectDef.anInt2094 * 795821915 || objectDef.aBool2104) {
                              if(!objectDef.method2178((byte)82)) {
                                 Client.anInt2761 += 1702706361;
                                 var16 = false;
                              }

                              var19 = true;
                           }
                        }
                     }

                     var20 = buffer.readSmart((short) -1218);
                     if(0 == var20) {
                        break;
                     }

                     buffer.readUByte();
                  }
               }
            }
         }

         if(!var6) {
            Client.anInt2943 = -1754823434;
         } else {
            if(Client.anInt2943 * 1299172531 != 0) {
               GameDefinition.method1107(StringUtilities.LOADING_PLEASE_WAIT + Class47.LINE_BREAK + Class47.OPEN_PAREN + 100 + "%" + Class47.CLOSE_PAREN, true, 70955211);
            }

            Friend.method660(-2046935339);
            Class68.method929(-951349097);
            Friend.method660(-2073637062);
            Scene.gameScene.method466();
            Friend.method660(-1760599228);
            System.gc();

            for(int plane = 0; plane < 4; ++plane) {
               Client.clippingPlanes[plane].reset(1566511345);
            }

            int var37;
            for(int plane = 0; plane < 4; ++plane) {
               for(int x = 0; x < 104; ++x) {
                  for(int y = 0; y < 104; ++y) {
                     mapTileSettings[plane][x][y] = 0;
                  }
               }
            }

            Friend.method660(-1819534949);
            ChatMessagesContainer.method354(-1576804199);
            int terrainDataAmt = terrainData.length;
            ChatMessage.method2010((short)-14602);
            Class23.method343(true, (byte)-61);
            int var7;
            int x;
            int var42;
            int var46;
            if(!Client.isAtDynamicMap) {
               byte[] terrainDataPlane;
               for(var37 = 0; var37 < terrainDataAmt; ++var37) {
                  localX = (GraphicsBuffer.mapCoordinates[var37] >> 8) * 64 - Class100.anInt1388 * 263051377;
                  localY = (GraphicsBuffer.mapCoordinates[var37] & 255) * 64 - SoundEffectWorker.anInt201 * -1743142671;
                  terrainDataPlane = terrainData[var37];
                  if(terrainDataPlane != null) {
                     Friend.method660(1338432946);
                     var7 = Friend.anInt620 * 1203260360 - 48;
                     x = BuildType.anInt1238 * 1374898232 - 48;
                     CollisionMap[] collisionMap = Client.clippingPlanes;

                     for(var18 = 0; var18 < 4; ++var18) {
                        for(var12 = 0; var12 < 64; ++var12) {
                           for(var5 = 0; var5 < 64; ++var5) {
                              if(localX + var12 > 0 && localX + var12 < 103 && localY + var5 > 0 && var5 + localY < 103) {
                                 collisionMap[var18].clipData[var12 + localX][localY + var5] &= -16777217;
                              }
                           }
                        }
                     }

                     RSByteBuffer var45 = new RSByteBuffer(terrainDataPlane);

                     for(int plane = 0; plane < 4; ++plane) {
                        for(var5 = 0; var5 < 64; ++var5) {
                           for(var46 = 0; var46 < 64; ++var46) {
                              ClientScriptDefinition.method2566(var45, plane, var5 + localX, var46 + localY, var7, x, 0, (byte)-40);
                           }
                        }
                     }
                  }
               }

               for(var37 = 0; var37 < terrainDataAmt; ++var37) {
                  localX = (GraphicsBuffer.mapCoordinates[var37] >> 8) * 64 - Class100.anInt1388 * 263051377;
                  localY = (GraphicsBuffer.mapCoordinates[var37] & 255) * 64 - SoundEffectWorker.anInt201 * -1743142671;
                  terrainDataPlane = terrainData[var37];
                  if(terrainDataPlane == null && BuildType.anInt1238 * -365008633 < 800) {
                     Friend.method660(1989703340);
                     Class19.method337(localX, localY, 64, 64, 1185887909);
                  }
               }

               Class23.method343(true, (byte)17);

               for(var37 = 0; var37 < terrainDataAmt; ++var37) {
                  byte[] objectData = ClientScriptDefinition.objectData[var37];
                  if(objectData != null) {
                     localY = (GraphicsBuffer.mapCoordinates[var37] >> 8) * 64 - Class100.anInt1388 * 263051377;
                     var42 = (GraphicsBuffer.mapCoordinates[var37] & 255) * 64 - SoundEffectWorker.anInt201 * -1743142671;
                     Friend.method660(-967525957);
                     loadObjectMap(objectData, localY, var42, Scene.gameScene, Client.clippingPlanes, (byte) 8);
                  }
               }
            }

            int y;
            if(Client.isAtDynamicMap) {
               for(var37 = 0; var37 < 4; ++var37) {
                  Friend.method660(519229201);

                  for(localX = 0; localX < 13; ++localX) {
                     for(localY = 0; localY < 13; ++localY) {
                        boolean var43 = false;
                        var7 = Client.anIntArrayArrayArray2766[var37][localX][localY];
                        if(var7 != -1) {
                           x = var7 >> 24 & 3;
                           y = var7 >> 1 & 3;
                           var18 = var7 >> 14 & 1023;
                           var12 = var7 >> 3 & 2047;
                           var5 = var12 / 8 + (var18 / 8 << 8);

                           for(var46 = 0; var46 < GraphicsBuffer.mapCoordinates.length; ++var46) {
                              if(GraphicsBuffer.mapCoordinates[var46] == var5 && terrainData[var46] != null) {
                                 method588(terrainData[var46], var37, localX * 8, localY * 8, x, (var18 & 7) * 8, (var12 & 7) * 8, y, Client.clippingPlanes, (short)-28440);
                                 var43 = true;
                                 break;
                              }
                           }
                        }

                        if(!var43) {
                           Class50.method701(var37, localX * 8, localY * 8, 279683649);
                        }
                     }
                  }
               }

               for(var37 = 0; var37 < 13; ++var37) {
                  for(localX = 0; localX < 13; ++localX) {
                     localY = Client.anIntArrayArrayArray2766[0][var37][localX];
                     if(-1 == localY) {
                        Class19.method337(var37 * 8, localX * 8, 8, 8, 1185887909);
                     }
                  }
               }

               Class23.method343(true, (byte)18);

               for(var37 = 0; var37 < 4; ++var37) {
                  Friend.method660(-680338046);

                  for(localX = 0; localX < 13; ++localX) {
                     label457:
                     for(localY = 0; localY < 13; ++localY) {
                        var42 = Client.anIntArrayArrayArray2766[var37][localX][localY];
                        if(var42 != -1) {
                           var7 = var42 >> 24 & 3;
                           x = var42 >> 1 & 3;
                           y = var42 >> 14 & 1023;
                           var18 = var42 >> 3 & 2047;
                           var12 = (y / 8 << 8) + var18 / 8;

                           for(var5 = 0; var5 < GraphicsBuffer.mapCoordinates.length; ++var5) {
                              if(var12 == GraphicsBuffer.mapCoordinates[var5] && null != ClientScriptDefinition.objectData[var5]) {
                                 byte[] var47 = ClientScriptDefinition.objectData[var5];
                                 var20 = localX * 8;
                                 var21 = localY * 8;
                                 var15 = (y & 7) * 8;
                                 var22 = (var18 & 7) * 8;
                                 Scene scene = Scene.gameScene;
                                 CollisionMap[] collisionMAp = Client.clippingPlanes;
                                 RSByteBuffer var49 = new RSByteBuffer(var47);
                                 int var25 = -1;

                                 while(true) {
                                    int var33 = var49.readSmart((short) -23098);
                                    if(var33 == 0) {
                                       continue label457;
                                    }

                                    var25 += var33;
                                    int var27 = 0;

                                    while(true) {
                                       int var31 = var49.readSmart((short) 7442);
                                       if(var31 == 0) {
                                          break;
                                       }

                                       var27 += var31 - 1;
                                       int var32 = var27 & 63;
                                       int var34 = var27 >> 6 & 63;
                                       int var28 = var27 >> 12;
                                       int var35 = var49.readUByte();
                                       int var30 = var35 >> 2;
                                       int var29 = var35 & 3;
                                       if(var7 == var28 && var34 >= var15 && var34 < var15 + 8 && var32 >= var22 && var32 < 8 + var22) {
                                          ObjectDefinition objectDef = ObjectDefinition.getObjectDefForID(var25, (byte) 0);
                                          int var1 = var20 + MachineInformation.method1922(var34 & 7, var32 & 7, x, objectDef.sizeX * 721302265, objectDef.sizeY * -1917144319, var29, 1637745452);
                                          int var2 = var21 + BuildType.method1093(var34 & 7, var32 & 7, x, objectDef.sizeX * 721302265, objectDef.sizeY * -1917144319, var29, 1023920987);
                                          if(var1 > 0 && var2 > 0 && var1 < 103 && var2 < 103) {
                                             int var9 = var37;
                                             if(2 == (mapTileSettings[1][var1][var2] & 2)) {
                                                var9 = var37 - 1;
                                             }

                                             CollisionMap var10 = null;
                                             if(var9 >= 0) {
                                                var10 = collisionMAp[var9];
                                             }

                                             Class53_Sub1.setupObjectCollisionMap(var37, var1, var2, var25, var29 + x & 3, var30, scene, var10, (short) -21330);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            Class23.method343(true, (byte)-65);
            Class68.method929(-1479308946);
            Friend.method660(-990519810);
            createRegionScene(Scene.gameScene, Client.clippingPlanes, -2017189657);
            Class23.method343(true, (byte)78);
            var37 = anInt485 * -1362129233;
            if(var37 > VarpBit.plane * -570926309) {
               var37 = VarpBit.plane * -570926309;
            }

            if(var37 < VarpBit.plane * -570926309 - 1) {
               var37 = VarpBit.plane * -570926309 - 1;
            }

            if(Client.lowMemory) {
               Scene.gameScene.method566(anInt485 * -1362129233);
            } else {
               Scene.gameScene.method566(0);
            }

            for(localX = 0; localX < 104; ++localX) {
               for(localY = 0; localY < 104; ++localY) {
                  Scene.spawnGroundItem(localX, localY, (byte) -103);
               }
            }

            Friend.method660(418778366);

            for(Class108_Sub13 var44 = (Class108_Sub13) Client.aClass105_2939.getFront(); var44 != null; var44 = (Class108_Sub13) Client.aClass105_2939.getNext()) {
               if(-1 == var44.anInt1690 * 1336924445) {
                  var44.anInt1689 = 0;
                  FriendsChatMember.method1685(var44, (byte)0);
               } else {
                  var44.unlink();
               }
            }

            ObjectDefinition.objectModelCache.clearCacheMap();
            if(UnderlayDefinition.aFrame2150 != null) {
               Client.secureBuffer.writePacket(144);
               Client.secureBuffer.writeInt(1057001181);
            }

            if(!Client.isAtDynamicMap) {
               localX = (Friend.anInt620 * 687278457 - 6) / 8;
               localY = (6 + Friend.anInt620 * 687278457) / 8;
               var42 = (BuildType.anInt1238 * -365008633 - 6) / 8;
               var7 = (6 + BuildType.anInt1238 * -365008633) / 8;

               for(x = localX - 1; x <= 1 + localY; ++x) {
                  for(y = var42 - 1; y <= var7 + 1; ++y) {
                     if(x < localX || x > localY || y < var42 || y > var7) {
                        landscapeIndex.loadArchiveForName("m" + x + "_" + y);
                        landscapeIndex.loadArchiveForName("l" + x + "_" + y);
                     }
                  }
               }
            }

            IsaacRandomGen.method725(30, 1937946649);
            Friend.method660(-1920226045);
            GZIPDecompressor.underlayFloorIds = (byte[][][])null;
            overlayFloorIds = (byte[][][])null;
            overlayClippingPaths = (byte[][][])null;
            overlayRotations = (byte[][][])null;
            Class19.tileCullingBitset = (int[][][])null;
            aByteArrayArrayArray488 = (byte[][][])null;
            tileLightingIntensity = (int[][])null;
            blendedHue = null;
            blendedSaturation = null;
            IndexTable.blendedLightness = null;
            LoginHandler.blendedHueDivisor = null;
            Wall.blendedDirectionTracker = null;
            Client.secureBuffer.writePacket(133);
            SoundEffectWorker.method296((byte) -80);
         }
      }
   }

   static final int getFloorDrawHeight(int var0, int var1, int var2, int var3) {
      int var4 = var0 >> 7;
      int var7 = var1 >> 7;
      if(var4 >= 0 && var7 >= 0 && var4 <= 103 && var7 <= 103) {
         int var6 = var2;
         if(var2 < 3 && (mapTileSettings[1][var4][var7] & 2) == 2) {
            var6 = var2 + 1;
         }

         int var5 = var0 & 127;
         int var8 = var1 & 127;
         int var9 = var5 * tileHeights[var6][1 + var4][var7] + (128 - var5) * tileHeights[var6][var4][var7] >> 7;
         int var10 = tileHeights[var6][var4 + 1][1 + var7] * var5 + (128 - var5) * tileHeights[var6][var4][var7 + 1] >> 7;
         return (128 - var8) * var9 + var8 * var10 >> 7;
      } else {
         return 0;
      }
   }

   static final void createRegionScene(Scene scene, CollisionMap[] collisionMaps, int var2) {
       int plane;
       int x;
       int y;
       int originalPlane;
       for (plane = 0; plane < 4; ++plane) {
           for (x = 0; x < 104; ++x) {
               for (y = 0; y < 104; ++y) {
                   if ((mapTileSettings[plane][x][y] & 1) == 1) {
                       originalPlane = plane;
                       if ((mapTileSettings[1][x][y] & 2) == 2) {
                           originalPlane = plane - 1;
                       }

                       if (originalPlane >= 0) {
                           collisionMaps[originalPlane].markBlocked(x, y);
                       }
                   }
               }
           }
       }

       hueRandomizer += ((int) (Math.random() * 5.0D) - 2) * -1535870085;
       if (hueRandomizer * -2073023565 < -8) {
           hueRandomizer = -597941208;
       }

       if (hueRandomizer * -2073023565 > 8) {
           hueRandomizer = 597941208;
       }

       lightnessRandomizer += ((int) (Math.random() * 5.0D) - 2) * 1990361651;
       if (lightnessRandomizer * -1983624965 < -16) {
           lightnessRandomizer = -1781015344;
       }

       if (lightnessRandomizer * -1983624965 > 16) {
           lightnessRandomizer = 1781015344;
       }

       int var6;
       int var8;
       int yPos;
       int xPos;
       int floorIDFetch;
       int var25;
       int xHeightDifference;
       int var27;
       int yHeightDifference;
       int hueDivisor;
       for (plane = 0; plane < 4; ++plane) {
           byte[][] var46 = aByteArrayArrayArray488[plane];
           var27 = (int) Math.sqrt(5100.0D);
           var25 = var27 * 768 >> 8;

           int directionalLightIntensity;
           int var13;
           for (yPos = 1; yPos < 103; ++yPos) {
               for (xPos = 1; xPos < 103; ++xPos) {
                   xHeightDifference = tileHeights[plane][1 + xPos][yPos] - tileHeights[plane][xPos - 1][yPos];
                   yHeightDifference = tileHeights[plane][xPos][yPos + 1] - tileHeights[plane][xPos][yPos - 1];
                   hueDivisor = (int) Math.sqrt((double) (yHeightDifference * yHeightDifference + xHeightDifference * xHeightDifference + 65536));
                   floorIDFetch = (xHeightDifference << 8) / hueDivisor;
                   var8 = 65536 / hueDivisor;
                   var6 = (yHeightDifference << 8) / hueDivisor;
                   directionalLightIntensity = 96 + (var6 * -50 + floorIDFetch * -50 + var8 * -10) / var25;
                   var13 = (var46[xPos][yPos - 1] >> 2) + (var46[xPos - 1][yPos] >> 2) + (var46[1 + xPos][yPos] >> 3) + (var46[xPos][yPos + 1] >> 3) + (var46[xPos][yPos] >> 1);
                   tileLightingIntensity[xPos][yPos] = directionalLightIntensity - var13;
               }
           }

           for (yPos = 0; yPos < 104; ++yPos) {
               blendedHue[yPos] = 0;
               blendedSaturation[yPos] = 0;
               IndexTable.blendedLightness[yPos] = 0;
               LoginHandler.blendedHueDivisor[yPos] = 0;
               Wall.blendedDirectionTracker[yPos] = 0;
           }

           for (yPos = -5; yPos < 109; ++yPos) {
               for (xPos = 0; xPos < 104; ++xPos) {
                   xHeightDifference = 5 + yPos;
                   if (xHeightDifference >= 0 && xHeightDifference < 104) {
                       int floorId = GZIPDecompressor.underlayFloorIds[plane][xHeightDifference][xPos] & 255;
                       if (floorId > 0) {
                           floorIDFetch = floorId - 1;
                           UnderlayDefinition underlayDef = (UnderlayDefinition) UnderlayDefinition.aClass106_2143.get((long) floorIDFetch);
                           UnderlayDefinition floor;
                           if (null != underlayDef) {
                               floor = underlayDef;
                           } else {
                               byte[] floorData = UnderlayDefinition.aClass74_2147.getFile(1, floorIDFetch, (byte) 7);
                               underlayDef = new UnderlayDefinition();
                               if (floorData != null) {
                                   underlayDef.method2271(new RSByteBuffer(floorData), floorIDFetch, -1852305296);
                               }

                               underlayDef.method2278(749738555);
                               UnderlayDefinition.aClass106_2143.put(underlayDef, (long) floorIDFetch);
                               floor = underlayDef;
                           }

                           blendedHue[xPos] += floor.hue * -1957387667;
                           blendedSaturation[xPos] += floor.saturation * -1288752181;
                           IndexTable.blendedLightness[xPos] += floor.luminosity * -1539409761;
                           LoginHandler.blendedHueDivisor[xPos] += floor.hueDivisor * -1997240389;
                           ++Wall.blendedDirectionTracker[xPos];
                       }
                   }

                   yHeightDifference = yPos - 5;
                   if (yHeightDifference >= 0 && yHeightDifference < 104) {
                       hueDivisor = GZIPDecompressor.underlayFloorIds[plane][yHeightDifference][xPos] & 255;
                       if (hueDivisor > 0) {
                           var8 = hueDivisor - 1;
                           UnderlayDefinition underlayDef = (UnderlayDefinition) UnderlayDefinition.aClass106_2143.get((long) var8);
                           UnderlayDefinition floor;
                           if (null != underlayDef) {
                               floor = underlayDef;
                           } else {
                               byte[] var49 = UnderlayDefinition.aClass74_2147.getFile(1, var8, (byte) 7);
                               underlayDef = new UnderlayDefinition();
                               if (var49 != null) {
                                   underlayDef.method2271(new RSByteBuffer(var49), var8, -1852305296);
                               }

                               underlayDef.method2278(288310807);
                               UnderlayDefinition.aClass106_2143.put(underlayDef, (long) var8);
                               floor = underlayDef;
                           }

                           blendedHue[xPos] -= floor.hue * -1957387667;
                           blendedSaturation[xPos] -= floor.saturation * -1288752181;
                           IndexTable.blendedLightness[xPos] -= floor.luminosity * -1539409761;
                           LoginHandler.blendedHueDivisor[xPos] -= floor.hueDivisor * -1997240389;
                           --Wall.blendedDirectionTracker[xPos];
                       }
                   }
               }

               if (yPos >= 1 && yPos < 103) {
                   xPos = 0;
                   xHeightDifference = 0;
                   yHeightDifference = 0;
                   hueDivisor = 0;
                   int blendedDirection = 0;

                   for (var8 = -5; var8 < 109; ++var8) {
                       var6 = var8 + 5;
                       if (var6 >= 0 && var6 < 104) {
                           xPos += blendedHue[var6];
                           xHeightDifference += blendedSaturation[var6];
                           yHeightDifference += IndexTable.blendedLightness[var6];
                           hueDivisor += LoginHandler.blendedHueDivisor[var6];
                           blendedDirection += Wall.blendedDirectionTracker[var6];
                       }

                       directionalLightIntensity = var8 - 5;
                       if (directionalLightIntensity >= 0 && directionalLightIntensity < 104) {
                           xPos -= blendedHue[directionalLightIntensity];
                           xHeightDifference -= blendedSaturation[directionalLightIntensity];
                           yHeightDifference -= IndexTable.blendedLightness[directionalLightIntensity];
                           hueDivisor -= LoginHandler.blendedHueDivisor[directionalLightIntensity];
                           blendedDirection -= Wall.blendedDirectionTracker[directionalLightIntensity];
                       }

                       if (var8 >= 1 && var8 < 103) {
                           if (Client.lowMemory && 0 == (mapTileSettings[0][yPos][var8] & 2)) {
                               if (0 != (mapTileSettings[plane][yPos][var8] & 16)) {
                                   continue;
                               }

                               if ((mapTileSettings[plane][yPos][var8] & 8) != 0) {
                                   var13 = 0;
                               } else if (plane > 0 && (mapTileSettings[1][yPos][var8] & 2) != 0) {
                                   var13 = plane - 1;
                               } else {
                                   var13 = plane;
                               }

                               if (Client.anInt2890 * -158871381 != var13) {
                                   continue;
                               }
                           }

                           if (plane < anInt485 * -1362129233) {
                               anInt485 = plane * -1850046385;
                           }

                           int underlayFloorID = GZIPDecompressor.underlayFloorIds[plane][yPos][var8] & 255;
                           int overlayFloorID = overlayFloorIds[plane][yPos][var8] & 255;
                           if (underlayFloorID > 0 || overlayFloorID > 0) {
                               int vertexSouthWest = tileHeights[plane][yPos][var8];
                               int vertexSouthEast = tileHeights[plane][1 + yPos][var8];
                               int vertexNorthEast = tileHeights[plane][yPos + 1][var8 + 1];
                               int vertexNorthWest = tileHeights[plane][yPos][1 + var8];
                               int var19 = tileLightingIntensity[yPos][var8];
                               int var20 = tileLightingIntensity[1 + yPos][var8];
                               int var21 = tileLightingIntensity[1 + yPos][1 + var8];
                               int var22 = tileLightingIntensity[yPos][var8 + 1];
                               int var18 = -1;
                               int hslBitset = -1;
                               int hue;
                               int luminosity;
                               int saturation;
                               if (underlayFloorID > 0) {
                                   hue = xPos * 256 / hueDivisor;
                                   saturation = xHeightDifference / blendedDirection;
                                   luminosity = yHeightDifference / blendedDirection;
                                   var18 = Varp.packHSL(hue, saturation, luminosity, 1298455127);
                                   hue = hue + hueRandomizer * -2073023565 & 255;
                                   luminosity += lightnessRandomizer * -1983624965;
                                   if (luminosity < 0) {
                                       luminosity = 0;
                                   } else if (luminosity > 255) {
                                       luminosity = 255;
                                   }

                                   hslBitset = Varp.packHSL(hue, saturation, luminosity, 1802545195);
                               }

                               OverlayFloorDefinition overlayDef;
                               if (plane > 0) {
                                   boolean hideUnderlay = true;
                                   if (underlayFloorID == 0 && overlayClippingPaths[plane][yPos][var8] != 0) {
                                       hideUnderlay = false;
                                   }

                                   if (overlayFloorID > 0) {
                                       int overlayID = overlayFloorID - 1;
                                       overlayDef = (OverlayFloorDefinition) OverlayFloorDefinition.overlayFloorMap.get((long) overlayID);
                                       OverlayFloorDefinition floor;
                                       if (null != overlayDef) {
                                           floor = overlayDef;
                                       } else {
                                           byte[] floorData = OverlayFloorDefinition.configArchive_ref_floor.getFile(4, overlayID, (byte) 7);
                                           overlayDef = new OverlayFloorDefinition();
                                           if (floorData != null) {
                                               overlayDef.decode(new RSByteBuffer(floorData), overlayID, 198180841);
                                           }

                                           overlayDef.method2344((byte) -47);
                                           OverlayFloorDefinition.overlayFloorMap.put(overlayDef, (long) overlayID);
                                           floor = overlayDef;
                                       }

                                       if (!floor.hideUnderlay) {
                                           hideUnderlay = false;
                                       }
                                   }

                                   if (hideUnderlay && vertexSouthEast == vertexSouthWest && vertexSouthWest == vertexNorthEast && vertexNorthWest == vertexSouthWest) {
                                       Class19.tileCullingBitset[plane][yPos][var8] |= 2340;
                                   }
                               }

                               hue = 0;
                               if (-1 != hslBitset) {
                                   hue = Rasterizer3D.rgbTable[PlainTile.method622(hslBitset, 96, -1685737298)];
                               }

                               if (0 == overlayFloorID) {
                                   scene.method406(plane, yPos, var8, 0, 0, -1, vertexSouthWest, vertexSouthEast, vertexNorthEast, vertexNorthWest, PlainTile.method622(var18, var19, -1685737298), PlainTile.method622(var18, var20, -1685737298), PlainTile.method622(var18, var21, -1685737298), PlainTile.method622(var18, var22, -1685737298), 0, 0, 0, 0, hue, 0);
                               } else {
                                   saturation = 1 + overlayClippingPaths[plane][yPos][var8];
                                   byte rotation = overlayRotations[plane][yPos][var8];
                                   int floorID = overlayFloorID - 1;
                                   OverlayFloorDefinition overlayFloorDef = (OverlayFloorDefinition) OverlayFloorDefinition.overlayFloorMap.get((long) floorID);
                                   if (overlayFloorDef != null) {
                                       overlayDef = overlayFloorDef;
                                   } else {
                                       byte[] floorData = OverlayFloorDefinition.configArchive_ref_floor.getFile(4, floorID, (byte) 7);
                                       overlayFloorDef = new OverlayFloorDefinition();
                                       if (null != floorData) {
                                           overlayFloorDef.decode(new RSByteBuffer(floorData), floorID, -656471882);
                                       }

                                       overlayFloorDef.method2344((byte) -37);
                                       OverlayFloorDefinition.overlayFloorMap.put(overlayFloorDef, (long) floorID);
                                       overlayDef = overlayFloorDef;
                                   }

                                   int textureID = overlayDef.textureID * 1133570979;
                                   int var38;
                                   int var41;
                                   int var43;
                                   int var44;
                                   if (textureID >= 0) {
                                       var41 = Rasterizer3D.anTextureImage_2501.method21(textureID, 72614764);
                                       var44 = -1;
                                   } else if (overlayDef.rgbColor * 308395211 == 16711935) {
                                       var44 = -2;
                                       textureID = -1;
                                       var41 = -2;
                                   } else {
                                       var44 = Varp.packHSL(overlayDef.hue * 1297919561, overlayDef.saturation * -24553127, overlayDef.luminosity * -715881191, 1552822455);
                                       var43 = overlayDef.hue * 1297919561 + hueRandomizer * -2073023565 & 255;
                                       var38 = overlayDef.luminosity * -715881191 + lightnessRandomizer * -1983624965;
                                       if (var38 < 0) {
                                           var38 = 0;
                                       } else if (var38 > 255) {
                                           var38 = 255;
                                       }

                                       var41 = Varp.packHSL(var43, overlayDef.saturation * -24553127, var38, 1506801862);
                                   }

                                   var43 = 0;
                                   if (-2 != var41) {
                                       var43 = Rasterizer3D.rgbTable[CacheIndexRequest.method1927(var41, 96, 1263009375)];
                                   }

                                   if (overlayDef.anInt2211 * 839525211 != -1) {
                                       var38 = hueRandomizer * -2073023565 + overlayDef.anInt2220 * -1618940341 & 255;
                                       int var40 = overlayDef.anInt2222 * -1393574217 + lightnessRandomizer * -1983624965;
                                       if (var40 < 0) {
                                           var40 = 0;
                                       } else if (var40 > 255) {
                                           var40 = 255;
                                       }

                                       var41 = Varp.packHSL(var38, overlayDef.anInt2224 * -1327914801, var40, 1654676153);
                                       var43 = Rasterizer3D.rgbTable[CacheIndexRequest.method1927(var41, 96, 1171927012)];
                                   }

                                   scene.method406(plane, yPos, var8, saturation, rotation, textureID, vertexSouthWest, vertexSouthEast, vertexNorthEast, vertexNorthWest, PlainTile.method622(var18, var19, -1685737298), PlainTile.method622(var18, var20, -1685737298), PlainTile.method622(var18, var21, -1685737298), PlainTile.method622(var18, var22, -1685737298), CacheIndexRequest.method1927(var44, var19, 499533796), CacheIndexRequest.method1927(var44, var20, 953040577), CacheIndexRequest.method1927(var44, var21, 523883285), CacheIndexRequest.method1927(var44, var22, 659891708), hue, var43);
                               }
                           }
                       }
                   }
               }
           }

           for (yPos = 1; yPos < 103; ++yPos) {
               for (xPos = 1; xPos < 103; ++xPos) {
                   if (0 != (mapTileSettings[plane][xPos][yPos] & 8)) {
                       var8 = 0;
                   } else if (plane > 0 && 0 != (mapTileSettings[1][xPos][yPos] & 2)) {
                       var8 = plane - 1;
                   } else {
                       var8 = plane;
                   }

                   scene.method462(plane, xPos, yPos, var8);
               }
           }

           GZIPDecompressor.underlayFloorIds[plane] = null;
           overlayFloorIds[plane] = null;
           overlayClippingPaths[plane] = null;
           overlayRotations[plane] = null;
           aByteArrayArrayArray488[plane] = null;
       }

       scene.method486(-50, -10, -50);

       for (plane = 0; plane < 104; ++plane) {
           for (x = 0; x < 104; ++x) {
               if ((mapTileSettings[1][plane][x] & 2) == 2) {
                   scene.method403(plane, x);
               }
           }
       }

       plane = 1;
       x = 2;
       y = 4;

       for (originalPlane = 0; originalPlane < 4; ++originalPlane) {
           if (originalPlane > 0) {
               plane <<= 3;
               x <<= 3;
               y <<= 3;
           }

           for (int var23 = 0; var23 <= originalPlane; ++var23) {
               for (int var35 = 0; var35 <= 104; ++var35) {
                   for (int var36 = 0; var36 <= 104; ++var36) {
                       short var53;
                       if (0 != (Class19.tileCullingBitset[var23][var36][var35] & plane)) {
                           var27 = var35;
                           var25 = var35;
                           yPos = var23;

                           for (xPos = var23; var27 > 0 && 0 != (Class19.tileCullingBitset[var23][var36][var27 - 1] & plane); --var27) {
                               ;
                           }

                           while (var25 < 104 && 0 != (Class19.tileCullingBitset[var23][var36][1 + var25] & plane)) {
                               ++var25;
                           }

                           label517:
                           while (yPos > 0) {
                               for (xHeightDifference = var27; xHeightDifference <= var25; ++xHeightDifference) {
                                   if (0 == (Class19.tileCullingBitset[yPos - 1][var36][xHeightDifference] & plane)) {
                                       break label517;
                                   }
                               }

                               --yPos;
                           }

                           label528:
                           while (xPos < originalPlane) {
                               for (xHeightDifference = var27; xHeightDifference <= var25; ++xHeightDifference) {
                                   if (0 == (Class19.tileCullingBitset[xPos + 1][var36][xHeightDifference] & plane)) {
                                       break label528;
                                   }
                               }

                               ++xPos;
                           }

                           xHeightDifference = (1 + (var25 - var27)) * (1 + xPos - yPos);
                           if (xHeightDifference >= 8) {
                               var53 = 240;
                               hueDivisor = tileHeights[xPos][var36][var27] - var53;
                               floorIDFetch = tileHeights[yPos][var36][var27];
                               Scene.addCullingCluster(originalPlane, 1, var36 * 128, var36 * 128, var27 * 128, var25 * 128 + 128, hueDivisor, floorIDFetch);

                               for (var8 = yPos; var8 <= xPos; ++var8) {
                                   for (var6 = var27; var6 <= var25; ++var6) {
                                       Class19.tileCullingBitset[var8][var36][var6] &= ~plane;
                                   }
                               }
                           }
                       }

                       if ((Class19.tileCullingBitset[var23][var36][var35] & x) != 0) {
                           var27 = var36;
                           var25 = var36;
                           yPos = var23;

                           for (xPos = var23; var27 > 0 && (Class19.tileCullingBitset[var23][var27 - 1][var35] & x) != 0; --var27) {
                               ;
                           }

                           while (var25 < 104 && (Class19.tileCullingBitset[var23][1 + var25][var35] & x) != 0) {
                               ++var25;
                           }

                           label566:
                           while (yPos > 0) {
                               for (xHeightDifference = var27; xHeightDifference <= var25; ++xHeightDifference) {
                                   if ((Class19.tileCullingBitset[yPos - 1][xHeightDifference][var35] & x) == 0) {
                                       break label566;
                                   }
                               }

                               --yPos;
                           }

                           label577:
                           while (xPos < originalPlane) {
                               for (xHeightDifference = var27; xHeightDifference <= var25; ++xHeightDifference) {
                                   if (0 == (Class19.tileCullingBitset[xPos + 1][xHeightDifference][var35] & x)) {
                                       break label577;
                                   }
                               }

                               ++xPos;
                           }

                           xHeightDifference = (xPos + 1 - yPos) * (1 + (var25 - var27));
                           if (xHeightDifference >= 8) {
                               var53 = 240;
                               hueDivisor = tileHeights[xPos][var27][var35] - var53;
                               floorIDFetch = tileHeights[yPos][var27][var35];
                               Scene.addCullingCluster(originalPlane, 2, var27 * 128, var25 * 128 + 128, var35 * 128, var35 * 128, hueDivisor, floorIDFetch);

                               for (var8 = yPos; var8 <= xPos; ++var8) {
                                   for (var6 = var27; var6 <= var25; ++var6) {
                                       Class19.tileCullingBitset[var8][var6][var35] &= ~x;
                                   }
                               }
                           }
                       }

                       if ((Class19.tileCullingBitset[var23][var36][var35] & y) != 0) {
                           var27 = var36;
                           var25 = var36;
                           yPos = var35;

                           for (xPos = var35; yPos > 0 && 0 != (Class19.tileCullingBitset[var23][var36][yPos - 1] & y); --yPos) {
                               ;
                           }

                           while (xPos < 104 && 0 != (Class19.tileCullingBitset[var23][var36][xPos + 1] & y)) {
                               ++xPos;
                           }

                           label616:
                           while (var27 > 0) {
                               for (xHeightDifference = yPos; xHeightDifference <= xPos; ++xHeightDifference) {
                                   if ((Class19.tileCullingBitset[var23][var27 - 1][xHeightDifference] & y) == 0) {
                                       break label616;
                                   }
                               }

                               --var27;
                           }

                           label627:
                           while (var25 < 104) {
                               for (xHeightDifference = yPos; xHeightDifference <= xPos; ++xHeightDifference) {
                                   if (0 == (Class19.tileCullingBitset[var23][var25 + 1][xHeightDifference] & y)) {
                                       break label627;
                                   }
                               }

                               ++var25;
                           }

                           if ((var25 - var27 + 1) * (1 + (xPos - yPos)) >= 4) {
                               xHeightDifference = tileHeights[var23][var27][yPos];
                               Scene.addCullingCluster(originalPlane, 4, var27 * 128, var25 * 128 + 128, yPos * 128, 128 + xPos * 128, xHeightDifference, xHeightDifference);

                               for (yHeightDifference = var27; yHeightDifference <= var25; ++yHeightDifference) {
                                   for (hueDivisor = yPos; hueDivisor <= xPos; ++hueDivisor) {
                                       Class19.tileCullingBitset[var23][yHeightDifference][hueDivisor] &= ~y;
                                   }
                               }
                           }
                       }
                   }
               }
           }
       }

   }

   static final void loadObjectMap(byte[] objectData, int localX, int localY, Scene var3, CollisionMap[] var4, byte var5) {
      RSByteBuffer objectDataBuffer = new RSByteBuffer(objectData);
      int var10 = -1;

      while(true) {
         int var9 = objectDataBuffer.readSmart((short) -14454);
         if(var9 == 0) {
            return;
         }

         var10 += var9;
         int var13 = 0;

         while(true) {
            int var12 = objectDataBuffer.readSmart((short) -8214);
            if(var12 == 0) {
               break;
            }

            var13 += var12 - 1;
            int var14 = var13 & 63;
            int var15 = var13 >> 6 & 63;
            int var16 = var13 >> 12;
            int var17 = objectDataBuffer.readUByte();
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            int var7 = var15 + localX;
            int var8 = localY + var14;
            if(var7 > 0 && var8 > 0 && var7 < 103 && var8 < 103) {
               int var11 = var16;
               if(2 == (mapTileSettings[1][var7][var8] & 2)) {
                  var11 = var16 - 1;
               }

               CollisionMap var20 = null;
               if(var11 >= 0) {
                  var20 = var4[var11];
               }

               Class53_Sub1.setupObjectCollisionMap(var16, var7, var8, var10, var19, var18, var3, var20, (short) -4427);
            }
         }
      }
   }
}
