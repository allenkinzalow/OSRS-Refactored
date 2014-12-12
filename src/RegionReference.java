
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


   static void method587(int indexID, IndexTable indexTable, CacheIndex cacheIndex, int var3) {
      byte[] var4 = null;
      Deque var5 = Class86.cacheIndexRequests;
      synchronized(var5) {
         CacheIndexRequest var6 = (CacheIndexRequest)Class86.cacheIndexRequests.getFront();

         while(var6 != null) {
            if((long)indexID != var6.key || var6.cacheIndexTable != indexTable || var6.anInt1759 * -612139703 != 0) {
               var6 = (CacheIndexRequest)Class86.cacheIndexRequests.getNext();
            } else {
               var4 = var6.indexData;
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

   static final void method588(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8, short var9) {
      int var12;
      for(int var10 = 0; var10 < 8; ++var10) {
         for(var12 = 0; var12 < 8; ++var12) {
            if(var10 + var2 > 0 && var10 + var2 < 103 && var12 + var3 > 0 && var3 + var12 < 103) {
               var8[var1].clipData[var10 + var2][var3 + var12] &= -16777217;
            }
         }
      }

      RSByteBuffer var14 = new RSByteBuffer(var0);

      for(var12 = 0; var12 < 4; ++var12) {
         for(int var11 = 0; var11 < 64; ++var11) {
            for(int var13 = 0; var13 < 64; ++var13) {
               if(var4 == var12 && var11 >= var5 && var11 < 8 + var5 && var13 >= var6 && var13 < var6 + 8) {
                  ClientScriptDefinition.method2566(var14, var1, var2 + method621(var11 & 7, var13 & 7, var7, -617553596), var3 + Class43.method653(var11 & 7, var13 & 7, var7, 1379797264), 0, 0, var7, (byte)-58);
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

   static final void method608() {
      boolean finished = false;

      while(!finished) {
         finished = true;

         for(int menuActionID = 0; menuActionID < Client.menuActionRow * 391839991 - 1; ++menuActionID) {
            if(Client.menuActionIdentifiers[menuActionID] < 1000 && Client.menuActionIdentifiers[menuActionID + 1] > 1000) {
               String menuName = Client.menuActionNames[menuActionID];
               Client.menuActionNames[menuActionID] = Client.menuActionNames[1 + menuActionID];
               Client.menuActionNames[menuActionID + 1] = menuName;
               String menuNamePrefix = Client.menuActionNamePrefix[menuActionID];
               Client.menuActionNamePrefix[menuActionID] = Client.menuActionNamePrefix[menuActionID + 1];
               Client.menuActionNamePrefix[1 + menuActionID] = menuNamePrefix;
               int var3 = Client.menuActionIdentifiers[menuActionID];
               Client.menuActionIdentifiers[menuActionID] = Client.menuActionIdentifiers[1 + menuActionID];
               Client.menuActionIdentifiers[menuActionID + 1] = var3;
               int menuXInteraction = Client.menuActionXInteractions[menuActionID];
               Client.menuActionXInteractions[menuActionID] = Client.menuActionXInteractions[menuActionID + 1];
               Client.menuActionXInteractions[menuActionID + 1] = menuXInteraction;
               int menuYInteraction = Client.menuActionYInteractions[menuActionID];
               Client.menuActionYInteractions[menuActionID] = Client.menuActionYInteractions[1 + menuActionID];
               Client.menuActionYInteractions[menuActionID + 1] = menuYInteraction;
               int menuParam = Client.menuActionParameters[menuActionID];
               Client.menuActionParameters[menuActionID] = Client.menuActionParameters[1 + menuActionID];
               Client.menuActionParameters[1 + menuActionID] = menuParam;
               finished = false;
            }
         }
      }

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
      for(var4 = 0; var4 < Class2.terrainData.length; ++var4) {
         if(Class32.terrainLandscapeIDs[var4] != -1 && Class2.terrainData[var4] == null) {
            Class2.terrainData[var4] = PingRequester.landscapeIndex.getFile(Class32.terrainLandscapeIDs[var4], 0, (byte) 7);
            if(null == Class2.terrainData[var4]) {
               var6 = false;
               Client.anInt2759 -= 903859995;
            }
         }

         if(-1 != ClientScript.objectLandscapeIDs[var4] && ClientScriptDefinition.objectData[var4] == null) {
            ClientScriptDefinition.objectData[var4] = PingRequester.landscapeIndex.getFileData(ClientScript.objectLandscapeIDs[var4], 0, Class47.xteaMapKeys[var4]);
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
         for(var4 = 0; var4 < Class2.terrainData.length; ++var4) {
            byte[] data = ClientScriptDefinition.objectData[var4];
            if(data != null) {
               localX = (GraphicsBuffer.mapCoordinates[var4] >> 8) * 64 - Class100.anInt1388 * 263051377;
               localY = (GraphicsBuffer.mapCoordinates[var4] & 255) * 64 - Class15.anInt201 * -1743142671;
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
                           ObjectDefinition objectDef = ChatMessagesContainer.getObjectDefForID(var18, (byte)0);
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
            Class56.gameScene.method466();
            Friend.method660(-1760599228);
            System.gc();

            for(int plane = 0; plane < 4; ++plane) {
               Client.clippingPlanes[plane].method1402(1566511345);
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
            int terrainDataAmt = Class2.terrainData.length;
            ChatMessage.method2010((short)-14602);
            Class23.method343(true, (byte)-61);
            int var7;
            int var41;
            int var42;
            int var46;
            if(!Client.isAtDynamicMap) {
               byte[] terrainData;
               for(var37 = 0; var37 < terrainDataAmt; ++var37) {
                  localX = (GraphicsBuffer.mapCoordinates[var37] >> 8) * 64 - Class100.anInt1388 * 263051377;
                  localY = (GraphicsBuffer.mapCoordinates[var37] & 255) * 64 - Class15.anInt201 * -1743142671;
                  terrainData = Class2.terrainData[var37];
                  if(terrainData != null) {
                     Friend.method660(1338432946);
                     var7 = Friend.anInt620 * 1203260360 - 48;
                     var41 = BuildType.anInt1238 * 1374898232 - 48;
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

                     RSByteBuffer var45 = new RSByteBuffer(terrainData);

                     for(int plane = 0; plane < 4; ++plane) {
                        for(var5 = 0; var5 < 64; ++var5) {
                           for(var46 = 0; var46 < 64; ++var46) {
                              ClientScriptDefinition.method2566(var45, plane, var5 + localX, var46 + localY, var7, var41, 0, (byte)-40);
                           }
                        }
                     }
                  }
               }

               for(var37 = 0; var37 < terrainDataAmt; ++var37) {
                  localX = (GraphicsBuffer.mapCoordinates[var37] >> 8) * 64 - Class100.anInt1388 * 263051377;
                  localY = (GraphicsBuffer.mapCoordinates[var37] & 255) * 64 - Class15.anInt201 * -1743142671;
                  terrainData = Class2.terrainData[var37];
                  if(terrainData == null && BuildType.anInt1238 * -365008633 < 800) {
                     Friend.method660(1989703340);
                     Class19.method337(localX, localY, 64, 64, 1185887909);
                  }
               }

               Class23.method343(true, (byte)17);

               for(var37 = 0; var37 < terrainDataAmt; ++var37) {
                  byte[] objectData = ClientScriptDefinition.objectData[var37];
                  if(objectData != null) {
                     localY = (GraphicsBuffer.mapCoordinates[var37] >> 8) * 64 - Class100.anInt1388 * 263051377;
                     var42 = (GraphicsBuffer.mapCoordinates[var37] & 255) * 64 - Class15.anInt201 * -1743142671;
                     Friend.method660(-967525957);
                     ProducingGraphicsBuffer.method1593(objectData, localY, var42, Class56.gameScene, Client.clippingPlanes, (byte)8);
                  }
               }
            }

            int var39;
            if(Client.isAtDynamicMap) {
               for(var37 = 0; var37 < 4; ++var37) {
                  Friend.method660(519229201);

                  for(localX = 0; localX < 13; ++localX) {
                     for(localY = 0; localY < 13; ++localY) {
                        boolean var43 = false;
                        var7 = Client.anIntArrayArrayArray2766[var37][localX][localY];
                        if(var7 != -1) {
                           var41 = var7 >> 24 & 3;
                           var39 = var7 >> 1 & 3;
                           var18 = var7 >> 14 & 1023;
                           var12 = var7 >> 3 & 2047;
                           var5 = var12 / 8 + (var18 / 8 << 8);

                           for(var46 = 0; var46 < GraphicsBuffer.mapCoordinates.length; ++var46) {
                              if(GraphicsBuffer.mapCoordinates[var46] == var5 && Class2.terrainData[var46] != null) {
                                 method588(Class2.terrainData[var46], var37, localX * 8, localY * 8, var41, (var18 & 7) * 8, (var12 & 7) * 8, var39, Client.clippingPlanes, (short)-28440);
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
                           var41 = var42 >> 1 & 3;
                           var39 = var42 >> 14 & 1023;
                           var18 = var42 >> 3 & 2047;
                           var12 = (var39 / 8 << 8) + var18 / 8;

                           for(var5 = 0; var5 < GraphicsBuffer.mapCoordinates.length; ++var5) {
                              if(var12 == GraphicsBuffer.mapCoordinates[var5] && null != ClientScriptDefinition.objectData[var5]) {
                                 byte[] var47 = ClientScriptDefinition.objectData[var5];
                                 var20 = localX * 8;
                                 var21 = localY * 8;
                                 var15 = (var39 & 7) * 8;
                                 var22 = (var18 & 7) * 8;
                                 Scene scene = Class56.gameScene;
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
                                          ObjectDefinition objectDef = ChatMessagesContainer.getObjectDefForID(var25, (byte)0);
                                          int var1 = var20 + Class108_Sub15.method1922(var34 & 7, var32 & 7, var41, objectDef.sizeX * 721302265, objectDef.sizeY * -1917144319, var29, 1637745452);
                                          int var2 = var21 + BuildType.method1093(var34 & 7, var32 & 7, var41, objectDef.sizeX * 721302265, objectDef.sizeY * -1917144319, var29, 1023920987);
                                          if(var1 > 0 && var2 > 0 && var1 < 103 && var2 < 103) {
                                             int var9 = var37;
                                             if(2 == (mapTileSettings[1][var1][var2] & 2)) {
                                                var9 = var37 - 1;
                                             }

                                             CollisionMap var10 = null;
                                             if(var9 >= 0) {
                                                var10 = collisionMAp[var9];
                                             }

                                             Class53_Sub1.method1891(var37, var1, var2, var25, var29 + var41 & 3, var30, scene, var10, (short)-21330);
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
            Class1.createRegionScene(Class56.gameScene, Client.clippingPlanes, -2017189657);
            Class23.method343(true, (byte)78);
            var37 = anInt485 * -1362129233;
            if(var37 > VarpBit.plane * -570926309) {
               var37 = VarpBit.plane * -570926309;
            }

            if(var37 < VarpBit.plane * -570926309 - 1) {
               var37 = VarpBit.plane * -570926309 - 1;
            }

            if(Client.lowMemory) {
               Class56.gameScene.method566(anInt485 * -1362129233);
            } else {
               Class56.gameScene.method566(0);
            }

            for(localX = 0; localX < 104; ++localX) {
               for(localY = 0; localY < 104; ++localY) {
                  Class104.spawnGroundItem(localX, localY, (byte)-103);
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

            ObjectDefinition.objectModelCache.method1371();
            if(UnderlayDefinition.aFrame2150 != null) {
               Client.secureBuffer.writePacket(144);
               Client.secureBuffer.writeInt(1057001181);
            }

            if(!Client.isAtDynamicMap) {
               localX = (Friend.anInt620 * 687278457 - 6) / 8;
               localY = (6 + Friend.anInt620 * 687278457) / 8;
               var42 = (BuildType.anInt1238 * -365008633 - 6) / 8;
               var7 = (6 + BuildType.anInt1238 * -365008633) / 8;

               for(var41 = localX - 1; var41 <= 1 + localY; ++var41) {
                  for(var39 = var42 - 1; var39 <= var7 + 1; ++var39) {
                     if(var41 < localX || var41 > localY || var39 < var42 || var39 > var7) {
                        PingRequester.landscapeIndex.method1024("m" + var41 + "_" + var39);
                        PingRequester.landscapeIndex.method1024("l" + var41 + "_" + var39);
                     }
                  }
               }
            }

            IsaacRandomGen.method725(30, 1937946649);
            Friend.method660(-1920226045);
            GZIPDecompressor.underlayFloorIds = (byte[][][])null;
            overlayFloorIds = (byte[][][])null;
            overlayClippingPaths = (byte[][][])null;
            AnimationSkeletonSet.overlayRotations = (byte[][][])null;
            Class19.tileCullingBitset = (int[][][])null;
            aByteArrayArrayArray488 = (byte[][][])null;
            Class19.tileLightingIntensity = (int[][])null;
            blendedHue = null;
            blendedSaturation = null;
            IndexTable.blendedLightness = null;
            LoginHandler.blendedHueDivisor = null;
            Wall.blendedDirectionTracker = null;
            Client.secureBuffer.writePacket(133);
            Class15.method296((byte) -80);
         }
      }
   }
}
