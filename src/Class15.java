import java.awt.Component;

public class Class15 {

   AbstractIndex soundEffectIndex_R1;
   AbstractIndex soundEffectIndex_R2;
   HashTable aClass101_200 = new HashTable(256);
   static int anInt201;
   HashTable aClass101_202 = new HashTable(256);
   public static final int anInt203 = 57;


   public static final Class7 method284(PingRequester var0, Component var1, int var2, int var3, int var4) {
      if(Class7.anInt94 * -322018941 == 0) {
         throw new IllegalStateException();
      } else if(var2 >= 0 && var2 < 2) {
         if(var3 < 256) {
            var3 = 256;
         }

         try {
            Class7_Sub2 var8 = new Class7_Sub2();
            var8.anIntArray109 = new int[(Class7.aBool99?2:1) * 256];
            var8.anInt101 = var3 * -1751713829;
            var8.method125(var1);
            var8.anInt100 = (1024 + (var3 & -1024)) * -844805727;
            if(var8.anInt100 * 741136993 > 16384) {
               var8.anInt100 = 1382563840;
            }

            var8.method126(var8.anInt100 * 741136993);
            if(Class71.anInt918 * 523094787 > 0 && null == Class108_Sub20_Sub3.aClass14_1965) {
               Class108_Sub20_Sub3.aClass14_1965 = new Class14();
               Class108_Sub20_Sub3.aClass14_1965.aClass61_192 = var0;
               var0.method820(Class108_Sub20_Sub3.aClass14_1965, Class71.anInt918 * 523094787, -1606001026);
            }

            if(null != Class108_Sub20_Sub3.aClass14_1965) {
               if(null != Class108_Sub20_Sub3.aClass14_1965.aClass7Array189[var2]) {
                  throw new IllegalArgumentException();
               }

               Class108_Sub20_Sub3.aClass14_1965.aClass7Array189[var2] = var8;
            }

            return var8;
         } catch (Throwable var7) {
            try {
               Class7_Sub1 var5 = new Class7_Sub1(var0, var2);
               var5.anIntArray109 = new int[(Class7.aBool99?2:1) * 256];
               var5.anInt101 = var3 * -1751713829;
               var5.method125(var1);
               var5.anInt100 = 1382563840;
               var5.method126(var5.anInt100 * 741136993);
               if(Class71.anInt918 * 523094787 > 0 && null == Class108_Sub20_Sub3.aClass14_1965) {
                  Class108_Sub20_Sub3.aClass14_1965 = new Class14();
                  Class108_Sub20_Sub3.aClass14_1965.aClass61_192 = var0;
                  var0.method820(Class108_Sub20_Sub3.aClass14_1965, Class71.anInt918 * 523094787, -1673424199);
               }

               if(null != Class108_Sub20_Sub3.aClass14_1965) {
                  if(null != Class108_Sub20_Sub3.aClass14_1965.aClass7Array189[var2]) {
                     throw new IllegalArgumentException();
                  }

                  Class108_Sub20_Sub3.aClass14_1965.aClass7Array189[var2] = var5;
               }

               return var5;
            } catch (Throwable var6) {
               return new Class7();
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   Class108_Sub1_Sub1 method286(int var1, int var2, int[] var3, int var4) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long soundHash = (long)var5;
      Class108_Sub1_Sub1 var8 = (Class108_Sub1_Sub1)this.aClass101_202.get(soundHash);
      if(var8 != null) {
         return var8;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         RSSoundEffect soundEffect = RSSoundEffect.getSoundEffect(this.soundEffectIndex_R1, var1, var2);
         if(soundEffect == null) {
            return null;
         } else {
            var8 = soundEffect.method104();
            this.aClass101_202.put(var8, soundHash);
            if(null != var3) {
               var3[0] -= var8.aByteArray2254.length;
            }

            return var8;
         }
      }
   }

   public Class108_Sub1_Sub1 method287(int var1, int[] var2, int var3) {
      if(this.soundEffectIndex_R1.getArchiveCount(-1518157725) == 1) {
         return this.method286(0, var1, var2, 858320185);
      } else if(this.soundEffectIndex_R1.getFileCount(var1, (byte)-17) == 1) {
         return this.method286(var1, 0, var2, 969022476);
      } else {
         throw new RuntimeException();
      }
   }

   public static void method288(int var0, int var1) {
      Class91.anInt1325 = -771978757;
      RSInterface.aClass74_1889 = null;
      Class91.anInt1329 = 2020957493;
      OnlineFriend.anInt1511 = 1300146319;
      Class27.anInt362 = 0;
      FriendsChatMember.aBool1669 = false;
      ClientScriptDefinition.anInt2281 = var0 * 1352655839;
   }

   public Class15(AbstractIndex var1, AbstractIndex var2) {
      this.soundEffectIndex_R1 = var1;
      this.soundEffectIndex_R2 = var2;
   }

   static final void loadAndRenderRegion(byte var0) {
      Class23.method343(false, (byte)2);
      Client.anInt2759 = 0;
      boolean var6 = true;

      int var4;
      for(var4 = 0; var4 < Class2.terrainData.length; ++var4) {
         if(Class32.anIntArray466[var4] != -1 && Class2.terrainData[var4] == null) {
            Class2.terrainData[var4] = PingRequester.landscapeIndex.getFile(Class32.anIntArray466[var4], 0, (byte) 7);
            if(null == Class2.terrainData[var4]) {
               var6 = false;
               Client.anInt2759 -= 903859995;
            }
         }

         if(-1 != ClientScript.anIntArray1649[var4] && ClientScriptDefinition.objectData[var4] == null) {
            ClientScriptDefinition.objectData[var4] = PingRequester.landscapeIndex.getFileData(ClientScript.anIntArray1649[var4], 0, Class47.anIntArrayArray673[var4], -1241964609);
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
               localY = (GraphicsBuffer.mapCoordinates[var4] & 255) * 64 - anInt201 * -1743142671;
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
               GameDefinition.method1107(StringConstants.LOADING_PLEASE_WAIT + Class47.LINE_BREAK + Class47.OPEN_PAREN + 100 + "%" + Class47.CLOSE_PAREN, true, 70955211);
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
                     RegionReference.mapTileSettings[plane][x][y] = 0;
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
                  localY = (GraphicsBuffer.mapCoordinates[var37] & 255) * 64 - anInt201 * -1743142671;
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
                  localY = (GraphicsBuffer.mapCoordinates[var37] & 255) * 64 - anInt201 * -1743142671;
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
                     var42 = (GraphicsBuffer.mapCoordinates[var37] & 255) * 64 - anInt201 * -1743142671;
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
                                 RegionReference.method588(Class2.terrainData[var46], var37, localX * 8, localY * 8, var41, (var18 & 7) * 8, (var12 & 7) * 8, var39, Client.clippingPlanes, (short)-28440);
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
                                             if(2 == (RegionReference.mapTileSettings[1][var1][var2] & 2)) {
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
            var37 = RegionReference.anInt485 * -1362129233;
            if(var37 > VarpBit.plane * -570926309) {
               var37 = VarpBit.plane * -570926309;
            }

            if(var37 < VarpBit.plane * -570926309 - 1) {
               var37 = VarpBit.plane * -570926309 - 1;
            }

            if(Client.lowMemory) {
               Class56.gameScene.method566(RegionReference.anInt485 * -1362129233);
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
                        PingRequester.landscapeIndex.method1024("m" + var41 + "_" + var39, 502735334);
                        PingRequester.landscapeIndex.method1024("l" + var41 + "_" + var39, -638943443);
                     }
                  }
               }
            }

            IsaacRandomGen.method725(30, 1937946649);
            Friend.method660(-1920226045);
            GZIPDecompressor.underlayFloorIds = (byte[][][])null;
            RegionReference.overlayFloorIds = (byte[][][])null;
            RegionReference.overlayClippingPaths = (byte[][][])null;
            AnimationSkeletonSet.overlayRotations = (byte[][][])null;
            Class19.tileCullingBitset = (int[][][])null;
            RegionReference.aByteArrayArrayArray488 = (byte[][][])null;
            Class19.tileLightingIntensity = (int[][])null;
            RegionReference.blendedHue = null;
            RegionReference.blendedSaturation = null;
            IndexTable.blendedLightness = null;
            LoginHandler.blendedHueDivisor = null;
            Wall.blendedDirectionTracker = null;
            Client.secureBuffer.writePacket(133);
            method296((byte)-80);
         }
      }
   }

   protected static final void method296(byte var0) {
      Class36.clientTimer.method720(51940008);

      int var1;
      for(var1 = 0; var1 < 32; ++var1) {
         Applet_Sub1.aLongArray2696[var1] = 0L;
      }

      for(var1 = 0; var1 < 32; ++var1) {
         Applet_Sub1.aLongArray2694[var1] = 0L;
      }

      Class100.anInt1384 = 0;
   }

   Class108_Sub1_Sub1 method297(int archiveID, int fileID, int[] var3, int var4) {
      int var5 = fileID ^ (archiveID << 4 & '\uffff' | archiveID >>> 12);
      var5 |= archiveID << 16;
      long var7 = (long)var5 ^ 4294967296L;
      Class108_Sub1_Sub1 var6 = (Class108_Sub1_Sub1)this.aClass101_202.get(var7);
      if(var6 != null) {
         return var6;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         RSSoundEffect_2 var9 = (RSSoundEffect_2)this.aClass101_200.get(var7);
         if(var9 == null) {
            var9 = RSSoundEffect_2.method1626(this.soundEffectIndex_R2, archiveID, fileID);
            if(null == var9) {
               return null;
            }

            this.aClass101_200.put(var9, var7);
         }

         var6 = var9.method1627(var3);
         if(null == var6) {
            return null;
         } else {
            var9.unlink();
            this.aClass101_202.put(var6, var7);
            return var6;
         }
      }
   }

   static final void method298(Class1 var0, int var1, int var2, short var3) {
      MouseCapturer.processClickAction(var0.anInt7 * 313474189, var0.anInt2 * 209465825, var0.anInt4 * -647975407, var0.anInt6 * -2100227435, var0.aString5, var0.aString5, var1, var2, -457306493);
   }

   public Class108_Sub1_Sub1 method299(int var1, int[] var2, int var3) {
      if(this.soundEffectIndex_R2.getArchiveCount(1980436864) == 1) {
         return this.method297(0, var1, var2, -91606107);
      } else if(this.soundEffectIndex_R2.getFileCount(var1, (byte)-26) == 1) {
         return this.method297(var1, 0, var2, 430158387);
      } else {
         throw new RuntimeException();
      }
   }
}
