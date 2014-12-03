import java.io.DataInputStream;
import java.net.URL;

public class World {

   int anInt558;
   int playerCount;
   int worldID;
   String aString561;
   String tooltip;
   int flagID;
   public static final int anInt564 = 169;
   static int[] anIntArray565;
   public static final String aString566 = "random.dat";
   static PaletteSprite[] worldFlagSprites;
   static final int anInt568 = 32768;
   int anInt569;


   boolean method639(int var1) {
      return (1 & this.anInt558 * 70871493) != 0;
   }

   boolean method640(int var1) {
      return (4 & this.anInt558 * 70871493) != 0;
   }

   static final void method643(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var2 >= 1) {
         if(var3 >= 1) {
            if(var2 <= 102) {
               if(var3 <= 102) {
                  if(!Client.lowMemory || VarpBit.plane * -570926309 == var0) {
                     int var15 = 0;
                     boolean var19 = true;
                     boolean var22 = false;
                     boolean var14 = false;
                     if(var1 == 0) {
                        var15 = Class56.gameScene.method427(var0, var2, var3);
                     }

                     if(1 == var1) {
                        var15 = Class56.gameScene.method425(var0, var2, var3);
                     }

                     if(var1 == 2) {
                        var15 = Class56.gameScene.method429(var0, var2, var3);
                     }

                     if(3 == var1) {
                        var15 = Class56.gameScene.fetchGroundTileDecorationHash(var0, var2, var3);
                     }

                     int var18;
                     if(var15 != 0) {
                        var18 = Class56.gameScene.method431(var0, var2, var3, var15);
                        int var36 = var15 >> 14 & 32767;
                        int var37 = var18 & 31;
                        int var35 = var18 >> 6 & 3;
                        ObjectDefinition var9;
                        if(var1 == 0) {
                           Class56.gameScene.method418(var0, var2, var3);
                           var9 = ChatMessagesContainer.getObjectDefForID(var36, (byte)0);
                           if(0 != var9.anInt2094 * 795821915) {
                              Client.clippingPlanes[var0].method1408(var2, var3, var37, var35, var9.aBool2114, (short)-29724);
                           }
                        }

                        if(var1 == 1) {
                           Class56.gameScene.method495(var0, var2, var3);
                        }

                        if(var1 == 2) {
                           Class56.gameScene.method420(var0, var2, var3);
                           var9 = ChatMessagesContainer.getObjectDefForID(var36, (byte)0);
                           if(var9.sizeX * 721302265 + var2 > 103) {
                              return;
                           }

                           if(var3 + var9.sizeX * 721302265 > 103) {
                              return;
                           }

                           if(var2 + var9.sizeY * -1917144319 > 103) {
                              return;
                           }

                           if(var3 + var9.sizeY * -1917144319 > 103) {
                              return;
                           }

                           if(0 != var9.anInt2094 * 795821915) {
                              Client.clippingPlanes[var0].method1412(var2, var3, var9.sizeX * 721302265, var9.sizeY * -1917144319, var35, var9.aBool2114, (byte)-10);
                           }
                        }

                        if(var1 == 3) {
                           Class56.gameScene.method421(var0, var2, var3);
                           var9 = ChatMessagesContainer.getObjectDefForID(var36, (byte)0);
                           if(var9.anInt2094 * 795821915 == 1) {
                              Client.clippingPlanes[var0].method1410(var2, var3, (byte)14);
                           }
                        }
                     }

                     if(var4 >= 0) {
                        var18 = var0;
                        if(var0 < 3 && 2 == (RegionReference.mapTileSettings[1][var2][var3] & 2)) {
                           var18 = var0 + 1;
                        }

                        Scene var33 = Class56.gameScene;
                        CollisionMap var20 = Client.clippingPlanes[var0];
                        ObjectDefinition var8 = ChatMessagesContainer.getObjectDefForID(var4, (byte)0);
                        int var17;
                        int var21;
                        if(var5 != 1 && 3 != var5) {
                           var17 = var8.sizeX * 721302265;
                           var21 = var8.sizeY * -1917144319;
                        } else {
                           var17 = var8.sizeY * -1917144319;
                           var21 = var8.sizeX * 721302265;
                        }

                        int var29;
                        int var30;
                        if(var2 + var17 <= 104) {
                           var30 = (var17 >> 1) + var2;
                           var29 = (var17 + 1 >> 1) + var2;
                        } else {
                           var30 = var2;
                           var29 = 1 + var2;
                        }

                        int var31;
                        int var32;
                        if(var3 + var21 <= 104) {
                           var31 = var3 + (var21 >> 1);
                           var32 = (var21 + 1 >> 1) + var3;
                        } else {
                           var31 = var3;
                           var32 = var3 + 1;
                        }

                        int[][] var24 = RegionReference.tileHeights[var18];
                        int var10 = var24[var29][var32] + var24[var30][var32] + var24[var29][var31] + var24[var30][var31] >> 2;
                        int var25 = (var17 << 6) + (var2 << 7);
                        int var26 = (var3 << 7) + (var21 << 6);
                        int var12 = (var4 << 14) + var2 + (var3 << 7) + 1073741824;
                        if(var8.anInt2088 * 619772583 == 0) {
                           var12 += Integer.MIN_VALUE;
                        }

                        int var13 = (var5 << 6) + var6;
                        if(var8.anInt2106 * -1988445921 == 1) {
                           var13 += 256;
                        }

                        Object var11;
                        if(var6 == 22) {
                           if(var8.animationID * -2061255559 == -1 && null == var8.configChangeDest) {
                              var11 = var8.method2180(22, var5, var24, var25, var10, var26, -687163306);
                           } else {
                              var11 = new GameObject(var4, 22, var5, var18, var2, var3, var8.animationID * -2061255559, true, (Renderable)null);
                           }

                           var33.method407(var0, var2, var3, var10, (Renderable)var11, var12, var13);
                           if(1 == var8.anInt2094 * 795821915) {
                              var20.method1409(var2, var3, 183213884);
                           }
                        } else if(10 != var6 && 11 != var6) {
                           if(var6 >= 12) {
                              if(var8.animationID * -2061255559 == -1 && var8.configChangeDest == null) {
                                 var11 = var8.method2180(var6, var5, var24, var25, var10, var26, -1910272688);
                              } else {
                                 var11 = new GameObject(var4, var6, var5, var18, var2, var3, var8.animationID * -2061255559, true, (Renderable)null);
                              }

                              var33.method411(var0, var2, var3, var10, 1, 1, (Renderable)var11, 0, var12, var13);
                              if(0 != var8.anInt2094 * 795821915) {
                                 var20.method1404(var2, var3, var17, var21, var8.aBool2114, 174023740);
                              }
                           } else if(0 == var6) {
                              if(-1 == var8.animationID * -2061255559 && null == var8.configChangeDest) {
                                 var11 = var8.method2180(0, var5, var24, var25, var10, var26, -1266796988);
                              } else {
                                 var11 = new GameObject(var4, 0, var5, var18, var2, var3, var8.animationID * -2061255559, true, (Renderable)null);
                              }

                              var33.method409(var0, var2, var3, var10, (Renderable)var11, (Renderable)null, RegionReference.anIntArray491[var5], 0, var12, var13);
                              if(var8.anInt2094 * 795821915 != 0) {
                                 var20.method1403(var2, var3, var6, var5, var8.aBool2114, -2050926990);
                              }
                           } else if(1 == var6) {
                              if(-1 == var8.animationID * -2061255559 && null == var8.configChangeDest) {
                                 var11 = var8.method2180(1, var5, var24, var25, var10, var26, -865296095);
                              } else {
                                 var11 = new GameObject(var4, 1, var5, var18, var2, var3, var8.animationID * -2061255559, true, (Renderable)null);
                              }

                              var33.method409(var0, var2, var3, var10, (Renderable)var11, (Renderable)null, RegionReference.anIntArray483[var5], 0, var12, var13);
                              if(var8.anInt2094 * 795821915 != 0) {
                                 var20.method1403(var2, var3, var6, var5, var8.aBool2114, -2050926990);
                              }
                           } else {
                              Object var16;
                              int var34;
                              if(var6 == 2) {
                                 var34 = 1 + var5 & 3;
                                 Object var38;
                                 if(-1 == var8.animationID * -2061255559 && null == var8.configChangeDest) {
                                    var38 = var8.method2180(2, 4 + var5, var24, var25, var10, var26, -1585925692);
                                    var16 = var8.method2180(2, var34, var24, var25, var10, var26, -1281374929);
                                 } else {
                                    var38 = new GameObject(var4, 2, 4 + var5, var18, var2, var3, var8.animationID * -2061255559, true, (Renderable)null);
                                    var16 = new GameObject(var4, 2, var34, var18, var2, var3, var8.animationID * -2061255559, true, (Renderable)null);
                                 }

                                 var33.method409(var0, var2, var3, var10, (Renderable)var38, (Renderable)var16, RegionReference.anIntArray491[var5], RegionReference.anIntArray491[var34], var12, var13);
                                 if(var8.anInt2094 * 795821915 != 0) {
                                    var20.method1403(var2, var3, var6, var5, var8.aBool2114, -2050926990);
                                 }
                              } else if(var6 == 3) {
                                 if(-1 == var8.animationID * -2061255559 && var8.configChangeDest == null) {
                                    var11 = var8.method2180(3, var5, var24, var25, var10, var26, -958787410);
                                 } else {
                                    var11 = new GameObject(var4, 3, var5, var18, var2, var3, var8.animationID * -2061255559, true, (Renderable)null);
                                 }

                                 var33.method409(var0, var2, var3, var10, (Renderable)var11, (Renderable)null, RegionReference.anIntArray483[var5], 0, var12, var13);
                                 if(0 != var8.anInt2094 * 795821915) {
                                    var20.method1403(var2, var3, var6, var5, var8.aBool2114, -2050926990);
                                 }
                              } else if(9 == var6) {
                                 if(var8.animationID * -2061255559 == -1 && var8.configChangeDest == null) {
                                    var11 = var8.method2180(var6, var5, var24, var25, var10, var26, -2084782052);
                                 } else {
                                    var11 = new GameObject(var4, var6, var5, var18, var2, var3, var8.animationID * -2061255559, true, (Renderable)null);
                                 }

                                 var33.method411(var0, var2, var3, var10, 1, 1, (Renderable)var11, 0, var12, var13);
                                 if(0 != var8.anInt2094 * 795821915) {
                                    var20.method1404(var2, var3, var17, var21, var8.aBool2114, -1075678248);
                                 }
                              } else if(var6 == 4) {
                                 if(-1 == var8.animationID * -2061255559 && var8.configChangeDest == null) {
                                    var11 = var8.method2180(4, var5, var24, var25, var10, var26, 290539454);
                                 } else {
                                    var11 = new GameObject(var4, 4, var5, var18, var2, var3, var8.animationID * -2061255559, true, (Renderable)null);
                                 }

                                 var33.method410(var0, var2, var3, var10, (Renderable)var11, (Renderable)null, RegionReference.anIntArray491[var5], 0, 0, 0, var12, var13);
                              } else {
                                 int var23;
                                 if(var6 == 5) {
                                    var34 = 16;
                                    var23 = var33.method427(var0, var2, var3);
                                    if(0 != var23) {
                                       var34 = ChatMessagesContainer.getObjectDefForID(var23 >> 14 & 32767, (byte)0).anInt2069 * -225839219;
                                    }

                                    if(-1 == var8.animationID * -2061255559 && null == var8.configChangeDest) {
                                       var16 = var8.method2180(4, var5, var24, var25, var10, var26, -705601015);
                                    } else {
                                       var16 = new GameObject(var4, 4, var5, var18, var2, var3, var8.animationID * -2061255559, true, (Renderable)null);
                                    }

                                    var33.method410(var0, var2, var3, var10, (Renderable)var16, (Renderable)null, RegionReference.anIntArray491[var5], 0, var34 * RegionReference.anIntArray493[var5], var34 * RegionReference.anIntArray494[var5], var12, var13);
                                 } else if(6 == var6) {
                                    var34 = 8;
                                    var23 = var33.method427(var0, var2, var3);
                                    if(var23 != 0) {
                                       var34 = ChatMessagesContainer.getObjectDefForID(var23 >> 14 & 32767, (byte)0).anInt2069 * -225839219 / 2;
                                    }

                                    if(-1 == var8.animationID * -2061255559 && var8.configChangeDest == null) {
                                       var16 = var8.method2180(4, var5 + 4, var24, var25, var10, var26, -428097195);
                                    } else {
                                       var16 = new GameObject(var4, 4, 4 + var5, var18, var2, var3, var8.animationID * -2061255559, true, (Renderable)null);
                                    }

                                    var33.method410(var0, var2, var3, var10, (Renderable)var16, (Renderable)null, 256, var5, RegionReference.anIntArray492[var5] * var34, var34 * RegionReference.anIntArray496[var5], var12, var13);
                                 } else if(7 == var6) {
                                    var23 = 2 + var5 & 3;
                                    if(var8.animationID * -2061255559 == -1 && null == var8.configChangeDest) {
                                       var11 = var8.method2180(4, var23 + 4, var24, var25, var10, var26, -2009025243);
                                    } else {
                                       var11 = new GameObject(var4, 4, var23 + 4, var18, var2, var3, var8.animationID * -2061255559, true, (Renderable)null);
                                    }

                                    var33.method410(var0, var2, var3, var10, (Renderable)var11, (Renderable)null, 256, var23, 0, 0, var12, var13);
                                 } else if(var6 == 8) {
                                    var34 = 8;
                                    var23 = var33.method427(var0, var2, var3);
                                    if(var23 != 0) {
                                       var34 = ChatMessagesContainer.getObjectDefForID(var23 >> 14 & 32767, (byte)0).anInt2069 * -225839219 / 2;
                                    }

                                    int var27 = 2 + var5 & 3;
                                    Object var28;
                                    if(var8.animationID * -2061255559 == -1 && var8.configChangeDest == null) {
                                       var16 = var8.method2180(4, 4 + var5, var24, var25, var10, var26, -1501559610);
                                       var28 = var8.method2180(4, 4 + var27, var24, var25, var10, var26, 174354862);
                                    } else {
                                       var16 = new GameObject(var4, 4, 4 + var5, var18, var2, var3, var8.animationID * -2061255559, true, (Renderable)null);
                                       var28 = new GameObject(var4, 4, 4 + var27, var18, var2, var3, var8.animationID * -2061255559, true, (Renderable)null);
                                    }

                                    var33.method410(var0, var2, var3, var10, (Renderable)var16, (Renderable)var28, 256, var5, RegionReference.anIntArray492[var5] * var34, var34 * RegionReference.anIntArray496[var5], var12, var13);
                                 }
                              }
                           }
                        } else {
                           if(-1 == var8.animationID * -2061255559 && var8.configChangeDest == null) {
                              var11 = var8.method2180(10, var5, var24, var25, var10, var26, -2108505414);
                           } else {
                              var11 = new GameObject(var4, 10, var5, var18, var2, var3, var8.animationID * -2061255559, true, (Renderable)null);
                           }

                           if(var11 != null) {
                              var33.method411(var0, var2, var3, var10, var17, var21, (Renderable)var11, var6 == 11?256:0, var12, var13);
                           }

                           if(0 != var8.anInt2094 * 795821915) {
                              var20.method1404(var2, var3, var17, var21, var8.aBool2114, -1647061534);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   static void method646(String var0, String var1, String var2, int var3) {
      Class4.aString74 = var0;
      Class4.aString64 = var1;
      Class4.aString55 = var2;
   }

   public static void method647(String var0, Throwable var1, int var2) {
      try {
         String var3 = "";
         if(var1 != null) {
            var3 = Friend.method664(var1, -2114862193);
         }

         if(var0 != null) {
            if(var1 != null) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var0;
         }

         System.out.println("Error: " + var3);
         var3 = var3.replace(':', '.');
         var3 = var3.replace('@', '_');
         var3 = var3.replace('&', '_');
         var3 = var3.replace('#', '_');
         if(RuntimeException_Sub1.anApplet2631 != null) {
            URL var4 = new URL(RuntimeException_Sub1.anApplet2631.getCodeBase(), "clienterror.ws?c=" + RuntimeException_Sub1.anInt2627 * -212885015 + "&u=" + RuntimeException_Sub1.aString2626 + "&v1=" + PingRequester.aString823 + "&v2=" + Class71.aString916 + "&e=" + var3);
            DataInputStream var5 = new DataInputStream(var4.openStream());
            var5.read();
            var5.close();
         }
      } catch (Exception var6) {
         ;
      }
   }
}
