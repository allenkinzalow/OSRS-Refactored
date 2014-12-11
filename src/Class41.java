
public class Class41 {

   static RGBSprite aClass108_Sub20_Sub15_Sub1_588;


   static final void method649(byte var0) {
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      int var7;
      int var8;
      int var9;
      int var10;
      int var14;
      int var16;
      int var43;
      if(Client.packetID * -1441472435 == 85) {
         var7 = Client.packetBuffer.readUByte();
         var3 = (var7 >> 4 & 7) + Class47.anInt676 * 2072343465;
         var4 = GraphicsBuffer.anInt185 * -1392404635 + (var7 & 7);
         var8 = var3 + Client.packetBuffer.readByte();
         var9 = var4 + Client.packetBuffer.readByte();
         var2 = Client.packetBuffer.method1721(-236607885);
         var10 = Client.packetBuffer.readUShort(-1134785183);
         var5 = Client.packetBuffer.readUByte() * 4;
         var1 = Client.packetBuffer.readUByte() * 4;
         var43 = Client.packetBuffer.readUShort(-1885066906);
         var14 = Client.packetBuffer.readUShort(-1678913366);
         int var42 = Client.packetBuffer.readUByte();
         var16 = Client.packetBuffer.readUByte();
         if(var3 >= 0) {
            if(var4 >= 0) {
               if(var3 < 104) {
                  if(var4 < 104) {
                     if(var8 >= 0) {
                        if(var9 >= 0) {
                           if(var8 < 104) {
                              if(var9 < 104) {
                                 if('\uffff' != var10) {
                                    var3 = 64 + var3 * 128;
                                    var4 = 64 + var4 * 128;
                                    var8 = var8 * 128 + 64;
                                    var9 = var9 * 128 + 64;
                                    Projectile var41 = new Projectile(var10, VarpBit.plane * -570926309, var3, var4, ClientScript.getFloorDrawHeight(var3, var4, VarpBit.plane * -570926309, 671885400) - var5, var43 + Client.cycle * -637317861, Client.cycle * -637317861 + var14, var42, var16, var2, var1);
                                    var41.method2979(var8, var9, ClientScript.getFloorDrawHeight(var8, var9, VarpBit.plane * -570926309, 1440857988) - var1, Client.cycle * -637317861 + var43, (byte)0);
                                    Client.projectileDeque.insertBack(var41);
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } else if(29 == Client.packetID * -1441472435) {
         var7 = Client.packetBuffer.method1742(-1494849731);
         var3 = (var7 >> 4 & 7) + Class47.anInt676 * 2072343465;
         var4 = GraphicsBuffer.anInt185 * -1392404635 + (var7 & 7);
         var8 = Client.packetBuffer.readUByte();
         var9 = var8 >> 2;
         var2 = var8 & 3;
         var10 = Client.anIntArray2767[var9];
         var5 = Client.packetBuffer.readUShortA();
         if(var3 >= 0) {
            if(var4 >= 0) {
               if(var3 < 104) {
                  if(var4 < 104) {
                     Class51.method705(VarpBit.plane * -570926309, var3, var4, var10, var5, var9, var2, 0, -1, (byte)86);
                  }
               }
            }
         }
      } else {
         Item var34;
         if(Client.packetID * -1441472435 == 67) {
            var7 = Client.packetBuffer.readUNegByte((byte) -102);
            var3 = Class47.anInt676 * 2072343465 + (var7 >> 4 & 7);
            var4 = GraphicsBuffer.anInt185 * -1392404635 + (var7 & 7);
            var8 = Client.packetBuffer.readUShortLEA();
            var9 = Client.packetBuffer.readUShortA();
            if(var3 >= 0) {
               if(var4 >= 0) {
                  if(var3 < 104) {
                     if(var4 < 104) {
                        var34 = new Item();
                        var34.itemID = var8 * -1979951989;
                        var34.anInt2614 = var9 * 872772091;
                        if(Client.groundItemArray[VarpBit.plane * -570926309][var3][var4] == null) {
                           Client.groundItemArray[VarpBit.plane * -570926309][var3][var4] = new Deque();
                        }

                        Client.groundItemArray[VarpBit.plane * -570926309][var3][var4].insertBack(var34);
                        Class104.spawnGroundItem(var3, var4, (byte)-83);
                     }
                  }
               }
            }
         } else if(92 == Client.packetID * -1441472435) {
            var7 = Client.packetBuffer.method1751((byte)0);
            var3 = (var7 >> 4 & 7) + Class47.anInt676 * 2072343465;
            var4 = GraphicsBuffer.anInt185 * -1392404635 + (var7 & 7);
            var8 = Client.packetBuffer.method1751((byte)-45);
            var9 = var8 >> 2;
            var2 = var8 & 3;
            var10 = Client.anIntArray2767[var9];
            if(var3 >= 0) {
               if(var4 >= 0) {
                  if(var3 < 104) {
                     if(var4 < 104) {
                        Class51.method705(VarpBit.plane * -570926309, var3, var4, var10, -1, var9, var2, 0, -1, (byte)86);
                     }
                  }
               }
            }
         } else if(Client.packetID * -1441472435 == 126) {
            var7 = Client.packetBuffer.method1751((byte)1);
            var3 = (var7 >> 4 & 7) + Class47.anInt676 * 2072343465;
            var4 = GraphicsBuffer.anInt185 * -1392404635 + (var7 & 7);
            var8 = Client.packetBuffer.method1751((byte)-21);
            var9 = var8 >> 2;
            var2 = var8 & 3;
            var10 = Client.anIntArray2767[var9];
            var5 = Client.packetBuffer.readUShort(612053457);
            if(var3 >= 0) {
               if(var4 >= 0) {
                  if(var3 < 103) {
                     if(var4 < 103) {
                        if(var10 == 0) {
                           Wall var30 = Class56.gameScene.getWall(VarpBit.plane * -570926309, var3, var4);
                           if(null != var30) {
                              var43 = var30.anInt337 * 639818003 >> 14 & 32767;
                              if(var9 == 2) {
                                 var30.aClass108_Sub20_Sub14_338 = new GameObject(var43, 2, 4 + var2, VarpBit.plane * -570926309, var3, var4, var5, false, var30.aClass108_Sub20_Sub14_338);
                                 var30.aClass108_Sub20_Sub14_343 = new GameObject(var43, 2, 1 + var2 & 3, VarpBit.plane * -570926309, var3, var4, var5, false, var30.aClass108_Sub20_Sub14_343);
                              } else {
                                 var30.aClass108_Sub20_Sub14_338 = new GameObject(var43, var9, var2, VarpBit.plane * -570926309, var3, var4, var5, false, var30.aClass108_Sub20_Sub14_338);
                              }
                           }
                        }

                        if(var10 == 1) {
                           WallDecoration var31 = Class56.gameScene.method424(VarpBit.plane * -570926309, var3, var4);
                           if(var31 != null) {
                              var43 = var31.anInt302 * 414599861 >> 14 & 32767;
                              if(var9 != 4 && 5 != var9) {
                                 if(var9 == 6) {
                                    var31.renderable = new GameObject(var43, 4, var2 + 4, VarpBit.plane * -570926309, var3, var4, var5, false, var31.renderable);
                                 } else if(var9 == 7) {
                                    var31.renderable = new GameObject(var43, 4, (2 + var2 & 3) + 4, VarpBit.plane * -570926309, var3, var4, var5, false, var31.renderable);
                                 } else if(var9 == 8) {
                                    var31.renderable = new GameObject(var43, 4, 4 + var2, VarpBit.plane * -570926309, var3, var4, var5, false, var31.renderable);
                                    var31.aClass108_Sub20_Sub14_301 = new GameObject(var43, 4, (var2 + 2 & 3) + 4, VarpBit.plane * -570926309, var3, var4, var5, false, var31.aClass108_Sub20_Sub14_301);
                                 }
                              } else {
                                 var31.renderable = new GameObject(var43, 4, var2, VarpBit.plane * -570926309, var3, var4, var5, false, var31.renderable);
                              }
                           }
                        }

                        if(var10 == 2) {
                           InteractableObject var32 = Class56.gameScene.method502(VarpBit.plane * -570926309, var3, var4);
                           if(11 == var9) {
                              var9 = 10;
                           }

                           if(var32 != null) {
                              var32.renderableObject = new GameObject(var32.anInt586 * 380600017 >> 14 & 32767, var9, var2, VarpBit.plane * -570926309, var3, var4, var5, false, var32.renderableObject);
                           }
                        }

                        if(var10 == 3) {
                           FloorDecoration var33 = Class56.gameScene.method426(VarpBit.plane * -570926309, var3, var4);
                           if(var33 != null) {
                              var33.renderable = new GameObject(var33.hash * 1276953639 >> 14 & 32767, 22, var2, VarpBit.plane * -570926309, var3, var4, var5, false, var33.renderable);
                           }
                        }
                     }
                  }
               }
            }
         } else if(Client.packetID * -1441472435 == 155) {
            var7 = Client.packetBuffer.readUNegByte((byte) -88);
            var3 = Class47.anInt676 * 2072343465 + (var7 >> 4 & 7);
            var4 = (var7 & 7) + GraphicsBuffer.anInt185 * -1392404635;
            var8 = Client.packetBuffer.readUShort(-1645594780);
            if(var3 >= 0) {
               if(var4 >= 0) {
                  if(var3 < 104) {
                     if(var4 < 104) {
                        Deque var38 = Client.groundItemArray[VarpBit.plane * -570926309][var3][var4];
                        if(var38 != null) {
                           for(var34 = (Item)var38.getFront(); null != var34; var34 = (Item)var38.getNext()) {
                              if(var34.itemID * -1672318173 == (var8 & 32767)) {
                                 var34.unlink();
                                 break;
                              }
                           }

                           if(var38.getFront() == null) {
                              Client.groundItemArray[VarpBit.plane * -570926309][var3][var4] = null;
                           }

                           Class104.spawnGroundItem(var3, var4, (byte)-53);
                        }
                     }
                  }
               }
            }
         } else if(Client.packetID * -1441472435 == 216) {
            var7 = Client.packetBuffer.readUByte();
            var3 = (var7 >> 4 & 7) + Class47.anInt676 * 2072343465;
            var4 = (var7 & 7) + GraphicsBuffer.anInt185 * -1392404635;
            var8 = Client.packetBuffer.readUShort(-2107498996);
            var9 = Client.packetBuffer.readUShort(-853534202);
            var2 = Client.packetBuffer.readUShort(458080493);
            if(var3 >= 0) {
               if(var4 >= 0) {
                  if(var3 < 104) {
                     if(var4 < 104) {
                        Deque var40 = Client.groundItemArray[VarpBit.plane * -570926309][var3][var4];
                        if(null != var40) {
                           for(Item var36 = (Item)var40.getFront(); null != var36; var36 = (Item)var40.getNext()) {
                              if(var36.itemID * -1672318173 == (var8 & 32767) && var36.anInt2614 * -767037133 == var9) {
                                 var36.anInt2614 = var2 * 872772091;
                                 break;
                              }
                           }

                           Class104.spawnGroundItem(var3, var4, (byte)-103);
                        }
                     }
                  }
               }
            }
         } else {
            if(Client.packetID * -1441472435 == 232) {
               var7 = Client.packetBuffer.readUByte();
               var3 = (var7 >> 4 & 7) + Class47.anInt676 * 2072343465;
               var4 = GraphicsBuffer.anInt185 * -1392404635 + (var7 & 7);
               var8 = Client.packetBuffer.readUShort(692339192);
               var9 = Client.packetBuffer.readUByte();
               var2 = var9 >> 4 & 15;
               var10 = var9 & 7;
               var5 = Client.packetBuffer.readUByte();
               if(var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                  var1 = var2 + 1;
                  if(Player.myPlayer.anIntArray2391[0] >= var3 - var1 && Player.myPlayer.anIntArray2391[0] <= var3 + var1 && Player.myPlayer.anIntArray2392[0] >= var4 - var1 && Player.myPlayer.anIntArray2392[0] <= var4 + var1 && Client.anInt2940 * 769647509 != 0 && var10 > 0 && Client.anInt2895 * 348809069 < 50) {
                     Client.anIntArray2942[Client.anInt2895 * 348809069] = var8;
                     Client.anIntArray2757[Client.anInt2895 * 348809069] = var10;
                     Client.anIntArray2944[Client.anInt2895 * 348809069] = var5;
                     Client.aClass6Array2741[Client.anInt2895 * 348809069] = null;
                     Client.anIntArray2704[Client.anInt2895 * 348809069] = (var3 << 16) + (var4 << 8) + var2;
                     Client.anInt2895 -= 1862223259;
                  }
               }
            }

            if(71 == Client.packetID * -1441472435) {
               byte var37 = Client.packetBuffer.method1745(-2107066480);
               var3 = Client.packetBuffer.readUShort(1946211270);
               byte var35 = Client.packetBuffer.method1759(-1320409240);
               var8 = Client.packetBuffer.readUShortA();
               var9 = Client.packetBuffer.readUShortLEA();
               var2 = Client.packetBuffer.readUNegByte((byte) 6);
               var10 = var2 >> 2;
               var5 = var2 & 3;
               var1 = Client.anIntArray2767[var10];
               byte var17 = Client.packetBuffer.method1786(90331565);
               var14 = Client.packetBuffer.method1706(179884786);
               byte var15 = Client.packetBuffer.method1786(-1755877301);
               var16 = Client.packetBuffer.method1742(-1494849731);
               int var12 = Class47.anInt676 * 2072343465 + (var16 >> 4 & 7);
               int var18 = GraphicsBuffer.anInt185 * -1392404635 + (var16 & 7);
               Player var19;
               if(var3 == Client.anInt2823 * 1800645115) {
                  var19 = Player.myPlayer;
               } else {
                  var19 = Client.localPlayers[var3];
               }

               if(null != var19) {
                  ObjectDefinition var22 = ChatMessagesContainer.getObjectDefForID(var9, (byte)0);
                  int var11;
                  int var20;
                  if(1 != var5 && var5 != 3) {
                     var11 = var22.sizeX * 721302265;
                     var20 = var22.sizeY * -1917144319;
                  } else {
                     var11 = var22.sizeY * -1917144319;
                     var20 = var22.sizeX * 721302265;
                  }

                  int var26 = (var11 >> 1) + var12;
                  int var27 = var12 + (var11 + 1 >> 1);
                  int var28 = var18 + (var20 >> 1);
                  int var29 = var18 + (1 + var20 >> 1);
                  int[][] var25 = RegionReference.tileHeights[VarpBit.plane * -570926309];
                  int var24 = var25[var27][var28] + var25[var26][var28] + var25[var26][var29] + var25[var27][var29] >> 2;
                  int var13 = (var11 << 6) + (var12 << 7);
                  int var21 = (var18 << 7) + (var20 << 6);
                  ModelRasterizer var6 = var22.method2180(var10, var5, var25, var13, var24, var21, -1494204670);
                  if(null != var6) {
                     Class51.method705(VarpBit.plane * -570926309, var12, var18, var1, -1, 0, 0, 1 + var8, 1 + var14, (byte)86);
                     var19.anInt2665 = (var8 + Client.cycle * -637317861) * 2092902079;
                     var19.anInt2670 = (Client.cycle * -637317861 + var14) * 267310813;
                     var19.aClass108_Sub20_Sub14_Sub3_2675 = var6;
                     var19.anInt2672 = var12 * -2128181120 + var11 * -1064090560;
                     var19.anInt2674 = var20 * -1134761280 + var18 * 2025444736;
                     var19.anInt2673 = var24 * 880030843;
                     byte var23;
                     if(var35 > var15) {
                        var23 = var35;
                        var35 = var15;
                        var15 = var23;
                     }

                     if(var17 > var37) {
                        var23 = var17;
                        var17 = var37;
                        var37 = var23;
                     }

                     var19.anInt2678 = (var35 + var12) * 82395293;
                     var19.anInt2664 = (var12 + var15) * -403536941;
                     var19.anInt2677 = (var18 + var17) * -1121384461;
                     var19.anInt2679 = (var18 + var37) * -412354279;
                  }
               }
            }

            if(250 == Client.packetID * -1441472435) {
               var7 = Client.packetBuffer.readUByte();
               var3 = (var7 >> 4 & 7) + Class47.anInt676 * 2072343465;
               var4 = GraphicsBuffer.anInt185 * -1392404635 + (var7 & 7);
               var8 = Client.packetBuffer.readUShort(-966794264);
               var9 = Client.packetBuffer.readUByte();
               var2 = Client.packetBuffer.readUShort(1911472437);
               if(var3 >= 0) {
                  if(var4 >= 0) {
                     if(var3 < 104) {
                        if(var4 < 104) {
                           var3 = var3 * 128 + 64;
                           var4 = 64 + var4 * 128;
                           Class108_Sub20_Sub14_Sub6 var39 = new Class108_Sub20_Sub14_Sub6(var8, VarpBit.plane * -570926309, var3, var4, ClientScript.getFloorDrawHeight(var3, var4, VarpBit.plane * -570926309, 1602261234) - var9, var2, Client.cycle * -637317861);
                           Client.aClass105_2928.insertBack(var39);
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
