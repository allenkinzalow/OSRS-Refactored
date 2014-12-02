
public class Rasterizer3D extends Rasterizer2D {

   static int alpha = 0;
   static boolean aBool2499 = false;
   static boolean aBool2500 = false;
   public static Interface2 anInterface2_2501;
   static int anInt2502;
   static final int anInt2503 = 50;
   static final int anInt2504 = 3500;
   static final int anInt2505 = 16;
   public static final int anInt2506 = 9;
   static final int anInt2507 = 3;
   static int centerX;
   static int centerY;
   public static int[] SINE = new int[2048];
   static int[] shadowDecay = new int[512];
   static int _bottomY;
   static int anInt2513;
   static int anInt2514;
   public static int[] COSINE = new int[2048];
   static int[] lineOffsets = new int[1024];
   public static int[] rgbTable = new int[65536];
   public static boolean aBool2518 = true;
   static int anInt2519;
   static int[] anIntArray2520 = new int[2048];
   static int anInt2521;
   static boolean restrictEdges = false;


   static final void drawTexturedLine(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
      if(restrictEdges) {
         if(var6 > anInt2502) {
            var6 = anInt2502;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var4 += var5;
         var7 += var8 * var5;
         int var17 = var6 - var5;
         int var15;
         int var16;
         int var10000;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         if(aBool2500) {
            var15 = var5 - centerX;
            var9 += (var12 >> 3) * var15;
            var10 += (var13 >> 3) * var15;
            var11 += (var14 >> 3) * var15;
            var19 = var11 >> 12;
            if(var19 != 0) {
               var20 = var9 / var19;
               var18 = var10 / var19;
               if(var20 < 0) {
                  var20 = 0;
               } else if(var20 > 4032) {
                  var20 = 4032;
               }
            } else {
               var20 = 0;
               var18 = 0;
            }

            var9 += var12;
            var10 += var13;
            var11 += var14;
            var19 = var11 >> 12;
            if(var19 != 0) {
               var22 = var9 / var19;
               var16 = var10 / var19;
               if(var22 < 0) {
                  var22 = 0;
               } else if(var22 > 4032) {
                  var22 = 4032;
               }
            } else {
               var22 = 0;
               var16 = 0;
            }

            var2 = (var20 << 20) + var18;
            var23 = (var22 - var20 >> 3 << 20) + (var16 - var18 >> 3);
            var17 >>= 3;
            var8 <<= 3;
            var21 = var7 >> 8;
            if(aBool2499) {
               if(var17 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var10000 = var2 + var23;
                     var20 = var22;
                     var18 = var16;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var19 = var11 >> 12;
                     if(var19 != 0) {
                        var22 = var9 / var19;
                        var16 = var10 / var19;
                        if(var22 < 0) {
                           var22 = 0;
                        } else if(var22 > 4032) {
                           var22 = 4032;
                        }
                     } else {
                        var22 = 0;
                        var16 = 0;
                     }

                     var2 = (var20 << 20) + var18;
                     var23 = (var22 - var20 >> 3 << 20) + (var16 - var18 >> 3);
                     var7 += var8;
                     var21 = var7 >> 8;
                     --var17;
                  } while(var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if(var17 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     --var17;
                  } while(var17 > 0);

               }
            } else {
               if(var17 > 0) {
                  do {
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var10000 = var2 + var23;
                     var20 = var22;
                     var18 = var16;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var19 = var11 >> 12;
                     if(var19 != 0) {
                        var22 = var9 / var19;
                        var16 = var10 / var19;
                        if(var22 < 0) {
                           var22 = 0;
                        } else if(var22 > 4032) {
                           var22 = 4032;
                        }
                     } else {
                        var22 = 0;
                        var16 = 0;
                     }

                     var2 = (var20 << 20) + var18;
                     var23 = (var22 - var20 >> 3 << 20) + (var16 - var18 >> 3);
                     var7 += var8;
                     var21 = var7 >> 8;
                     --var17;
                  } while(var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if(var17 > 0) {
                  do {
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     --var17;
                  } while(var17 > 0);

               }
            }
         } else {
            var15 = var5 - centerX;
            var9 += (var12 >> 3) * var15;
            var10 += (var13 >> 3) * var15;
            var11 += (var14 >> 3) * var15;
            var19 = var11 >> 14;
            if(var19 != 0) {
               var20 = var9 / var19;
               var18 = var10 / var19;
               if(var20 < 0) {
                  var20 = 0;
               } else if(var20 > 16256) {
                  var20 = 16256;
               }
            } else {
               var20 = 0;
               var18 = 0;
            }

            var9 += var12;
            var10 += var13;
            var11 += var14;
            var19 = var11 >> 14;
            if(var19 != 0) {
               var22 = var9 / var19;
               var16 = var10 / var19;
               if(var22 < 0) {
                  var22 = 0;
               } else if(var22 > 16256) {
                  var22 = 16256;
               }
            } else {
               var22 = 0;
               var16 = 0;
            }

            var2 = (var20 << 18) + var18;
            var23 = (var22 - var20 >> 3 << 18) + (var16 - var18 >> 3);
            var17 >>= 3;
            var8 <<= 3;
            var21 = var7 >> 8;
            if(aBool2499) {
               if(var17 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var10000 = var2 + var23;
                     var20 = var22;
                     var18 = var16;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var19 = var11 >> 14;
                     if(var19 != 0) {
                        var22 = var9 / var19;
                        var16 = var10 / var19;
                        if(var22 < 0) {
                           var22 = 0;
                        } else if(var22 > 16256) {
                           var22 = 16256;
                        }
                     } else {
                        var22 = 0;
                        var16 = 0;
                     }

                     var2 = (var20 << 18) + var18;
                     var23 = (var22 - var20 >> 3 << 18) + (var16 - var18 >> 3);
                     var7 += var8;
                     var21 = var7 >> 8;
                     --var17;
                  } while(var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if(var17 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     var2 += var23;
                     --var17;
                  } while(var17 > 0);

               }
            } else {
               if(var17 > 0) {
                  do {
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var10000 = var2 + var23;
                     var20 = var22;
                     var18 = var16;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var19 = var11 >> 14;
                     if(var19 != 0) {
                        var22 = var9 / var19;
                        var16 = var10 / var19;
                        if(var22 < 0) {
                           var22 = 0;
                        } else if(var22 > 16256) {
                           var22 = 16256;
                        }
                     } else {
                        var22 = 0;
                        var16 = 0;
                     }

                     var2 = (var20 << 18) + var18;
                     var23 = (var22 - var20 >> 3 << 18) + (var16 - var18 >> 3);
                     var7 += var8;
                     var21 = var7 >> 8;
                     --var17;
                  } while(var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if(var17 > 0) {
                  do {
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & '\uff00') * var21 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     --var17;
                  } while(var17 > 0);

               }
            }
         }
      }
   }

   static final void method2924(int var0, int var1, int var2, int var3) {
      anInt2502 = var2 - var0;
      _bottomY = var3 - var1;
      method2925();
      int var4;
      int var5;
      if(lineOffsets.length < _bottomY) {
         var5 = _bottomY;
         --var5;
         var5 |= var5 >>> 1;
         var5 |= var5 >>> 2;
         var5 |= var5 >>> 4;
         var5 |= var5 >>> 8;
         var5 |= var5 >>> 16;
         var4 = var5 + 1;
         lineOffsets = new int[var4];
      }

      var4 = var1 * width + var0;

      for(var5 = 0; var5 < _bottomY; ++var5) {
         lineOffsets[var5] = var4;
         var4 += width;
      }

   }

   public static final void method2925() {
      centerX = anInt2502 / 2;
      centerY = _bottomY / 2;
      anInt2519 = -centerX;
      anInt2513 = anInt2502 - centerX;
      anInt2514 = -centerY;
      anInt2521 = _bottomY - centerY;
   }

   public static final void method2926(int var0, int var1) {
      int var2 = lineOffsets[0];
      int var3 = var2 / width;
      int var4 = var2 - var3 * width;
      centerX = var0 - var4;
      centerY = var1 - var3;
      anInt2519 = -centerX;
      anInt2513 = anInt2502 - centerX;
      anInt2514 = -centerY;
      anInt2521 = _bottomY - centerY;
   }

   static final void calculatePalette(double var0, int var2, int var3) {
      var0 += Math.random() * 0.03D - 0.015D;
      int var21 = var2 * 128;

      for(int var13 = var2; var13 < var3; ++var13) {
         double var24 = (double)(var13 >> 3) / 64.0D + 0.0078125D;
         double var22 = (double)(var13 & 7) / 8.0D + 0.0625D;

         for(int var16 = 0; var16 < 128; ++var16) {
            double var7 = (double)var16 / 128.0D;
            double var19 = var7;
            double var4 = var7;
            double var14 = var7;
            if(var22 != 0.0D) {
               double var9;
               if(var7 < 0.5D) {
                  var9 = var7 * (1.0D + var22);
               } else {
                  var9 = var7 + var22 - var7 * var22;
               }

               double var11 = 2.0D * var7 - var9;
               double var17 = var24 + 0.3333333333333333D;
               if(var17 > 1.0D) {
                  --var17;
               }

               double var28 = var24 - 0.3333333333333333D;
               if(var28 < 0.0D) {
                  ++var28;
               }

               if(6.0D * var17 < 1.0D) {
                  var19 = var11 + (var9 - var11) * 6.0D * var17;
               } else if(2.0D * var17 < 1.0D) {
                  var19 = var9;
               } else if(3.0D * var17 < 2.0D) {
                  var19 = var11 + (var9 - var11) * (0.6666666666666666D - var17) * 6.0D;
               } else {
                  var19 = var11;
               }

               if(6.0D * var24 < 1.0D) {
                  var4 = var11 + (var9 - var11) * 6.0D * var24;
               } else if(2.0D * var24 < 1.0D) {
                  var4 = var9;
               } else if(3.0D * var24 < 2.0D) {
                  var4 = var11 + (var9 - var11) * (0.6666666666666666D - var24) * 6.0D;
               } else {
                  var4 = var11;
               }

               if(6.0D * var28 < 1.0D) {
                  var14 = var11 + (var9 - var11) * 6.0D * var28;
               } else if(2.0D * var28 < 1.0D) {
                  var14 = var9;
               } else if(3.0D * var28 < 2.0D) {
                  var14 = var11 + (var9 - var11) * (0.6666666666666666D - var28) * 6.0D;
               } else {
                  var14 = var11;
               }
            }

            int var31 = (int)(var19 * 256.0D);
            int var6 = (int)(var4 * 256.0D);
            int var32 = (int)(var14 * 256.0D);
            int var30 = (var31 << 16) + (var6 << 8) + var32;
            var30 = adjustBrightness(var30, var0);
            if(var30 == 0) {
               var30 = 1;
            }

            rgbTable[var21++] = var30;
         }
      }

   }

   static int adjustBrightness(int rgb, double brightness) {
      double r = (double)(rgb >> 16) / 256.0D;
      double g = (double)(rgb >> 8 & 255) / 256.0D;
      double b = (double)(rgb & 255) / 256.0D;
      r = Math.pow(r, brightness);
      g = Math.pow(g, brightness);
      b = Math.pow(b, brightness);
      int rBright = (int)(r * 256.0D);
      int gBRight = (int)(g * 256.0D);
      int bBright = (int)(b * 256.0D);
      return (rBright << 16) + (gBRight << 8) + bBright;
   }

   public static void method2931(int var0, int var1, int var2) {
      restrictEdges = var0 < 0 || var0 > anInt2502 || var1 < 0 || var1 > anInt2502 || var2 < 0 || var2 > anInt2502;
   }

   static final void method2932(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = var4 - var3;
      int var15 = var1 - var0;
      int var11 = var5 - var3;
      int var12 = var2 - var0;
      int var19 = var7 - var6;
      int var13 = var8 - var6;
      int var14;
      if(var2 != var1) {
         var14 = (var5 - var4 << 16) / (var2 - var1);
      } else {
         var14 = 0;
      }

      int var16;
      if(var1 != var0) {
         var16 = (var9 << 16) / var15;
      } else {
         var16 = 0;
      }

      int var17;
      if(var2 != var0) {
         var17 = (var11 << 16) / var12;
      } else {
         var17 = 0;
      }

      int var18 = var9 * var12 - var11 * var15;
      if(var18 != 0) {
         int var20 = (var19 * var12 - var13 * var15 << 8) / var18;
         int var10 = (var13 * var9 - var19 * var11 << 8) / var18;
         if(var0 <= var1 && var0 <= var2) {
            if(var0 < _bottomY) {
               if(var1 > _bottomY) {
                  var1 = _bottomY;
               }

               if(var2 > _bottomY) {
                  var2 = _bottomY;
               }

               var6 = (var6 << 8) - var20 * var3 + var20;
               if(var1 < var2) {
                  var5 = var3 <<= 16;
                  if(var0 < 0) {
                     var5 -= var17 * var0;
                     var3 -= var16 * var0;
                     var6 -= var10 * var0;
                     var0 = 0;
                  }

                  var4 <<= 16;
                  if(var1 < 0) {
                     var4 -= var14 * var1;
                     var1 = 0;
                  }

                  if((var0 == var1 || var17 >= var16) && (var0 != var1 || var17 <= var14)) {
                     var2 -= var1;
                     var1 -= var0;
                     var0 = lineOffsets[var0];

                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           while(true) {
                              --var2;
                              if(var2 < 0) {
                                 return;
                              }

                              drawShadedLine(renderPixels, var0, 0, 0, var4 >> 16, var5 >> 16, var6, var20);
                              var5 += var17;
                              var4 += var14;
                              var6 += var10;
                              var0 += width;
                           }
                        }

                        drawShadedLine(renderPixels, var0, 0, 0, var3 >> 16, var5 >> 16, var6, var20);
                        var5 += var17;
                        var3 += var16;
                        var6 += var10;
                        var0 += width;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var0;
                     var0 = lineOffsets[var0];

                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           while(true) {
                              --var2;
                              if(var2 < 0) {
                                 return;
                              }

                              drawShadedLine(renderPixels, var0, 0, 0, var5 >> 16, var4 >> 16, var6, var20);
                              var5 += var17;
                              var4 += var14;
                              var6 += var10;
                              var0 += width;
                           }
                        }

                        drawShadedLine(renderPixels, var0, 0, 0, var5 >> 16, var3 >> 16, var6, var20);
                        var5 += var17;
                        var3 += var16;
                        var6 += var10;
                        var0 += width;
                     }
                  }
               } else {
                  var4 = var3 <<= 16;
                  if(var0 < 0) {
                     var4 -= var17 * var0;
                     var3 -= var16 * var0;
                     var6 -= var10 * var0;
                     var0 = 0;
                  }

                  var5 <<= 16;
                  if(var2 < 0) {
                     var5 -= var14 * var2;
                     var2 = 0;
                  }

                  if((var0 == var2 || var17 >= var16) && (var0 != var2 || var14 <= var16)) {
                     var1 -= var2;
                     var2 -= var0;
                     var0 = lineOffsets[var0];

                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 return;
                              }

                              drawShadedLine(renderPixels, var0, 0, 0, var3 >> 16, var5 >> 16, var6, var20);
                              var5 += var14;
                              var3 += var16;
                              var6 += var10;
                              var0 += width;
                           }
                        }

                        drawShadedLine(renderPixels, var0, 0, 0, var3 >> 16, var4 >> 16, var6, var20);
                        var4 += var17;
                        var3 += var16;
                        var6 += var10;
                        var0 += width;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var0;
                     var0 = lineOffsets[var0];

                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 return;
                              }

                              drawShadedLine(renderPixels, var0, 0, 0, var5 >> 16, var3 >> 16, var6, var20);
                              var5 += var14;
                              var3 += var16;
                              var6 += var10;
                              var0 += width;
                           }
                        }

                        drawShadedLine(renderPixels, var0, 0, 0, var4 >> 16, var3 >> 16, var6, var20);
                        var4 += var17;
                        var3 += var16;
                        var6 += var10;
                        var0 += width;
                     }
                  }
               }
            }
         } else if(var1 <= var2) {
            if(var1 < _bottomY) {
               if(var2 > _bottomY) {
                  var2 = _bottomY;
               }

               if(var0 > _bottomY) {
                  var0 = _bottomY;
               }

               var7 = (var7 << 8) - var20 * var4 + var20;
               if(var2 < var0) {
                  var3 = var4 <<= 16;
                  if(var1 < 0) {
                     var3 -= var16 * var1;
                     var4 -= var14 * var1;
                     var7 -= var10 * var1;
                     var1 = 0;
                  }

                  var5 <<= 16;
                  if(var2 < 0) {
                     var5 -= var17 * var2;
                     var2 = 0;
                  }

                  if((var1 == var2 || var16 >= var14) && (var1 != var2 || var16 <= var17)) {
                     var0 -= var2;
                     var2 -= var1;
                     var1 = lineOffsets[var1];

                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           while(true) {
                              --var0;
                              if(var0 < 0) {
                                 return;
                              }

                              drawShadedLine(renderPixels, var1, 0, 0, var5 >> 16, var3 >> 16, var7, var20);
                              var3 += var16;
                              var5 += var17;
                              var7 += var10;
                              var1 += width;
                           }
                        }

                        drawShadedLine(renderPixels, var1, 0, 0, var4 >> 16, var3 >> 16, var7, var20);
                        var3 += var16;
                        var4 += var14;
                        var7 += var10;
                        var1 += width;
                     }
                  } else {
                     var0 -= var2;
                     var2 -= var1;
                     var1 = lineOffsets[var1];

                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           while(true) {
                              --var0;
                              if(var0 < 0) {
                                 return;
                              }

                              drawShadedLine(renderPixels, var1, 0, 0, var3 >> 16, var5 >> 16, var7, var20);
                              var3 += var16;
                              var5 += var17;
                              var7 += var10;
                              var1 += width;
                           }
                        }

                        drawShadedLine(renderPixels, var1, 0, 0, var3 >> 16, var4 >> 16, var7, var20);
                        var3 += var16;
                        var4 += var14;
                        var7 += var10;
                        var1 += width;
                     }
                  }
               } else {
                  var5 = var4 <<= 16;
                  if(var1 < 0) {
                     var5 -= var16 * var1;
                     var4 -= var14 * var1;
                     var7 -= var10 * var1;
                     var1 = 0;
                  }

                  var3 <<= 16;
                  if(var0 < 0) {
                     var3 -= var17 * var0;
                     var0 = 0;
                  }

                  if(var16 < var14) {
                     var2 -= var0;
                     var0 -= var1;
                     var1 = lineOffsets[var1];

                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           while(true) {
                              --var2;
                              if(var2 < 0) {
                                 return;
                              }

                              drawShadedLine(renderPixels, var1, 0, 0, var3 >> 16, var4 >> 16, var7, var20);
                              var3 += var17;
                              var4 += var14;
                              var7 += var10;
                              var1 += width;
                           }
                        }

                        drawShadedLine(renderPixels, var1, 0, 0, var5 >> 16, var4 >> 16, var7, var20);
                        var5 += var16;
                        var4 += var14;
                        var7 += var10;
                        var1 += width;
                     }
                  } else {
                     var2 -= var0;
                     var0 -= var1;
                     var1 = lineOffsets[var1];

                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           while(true) {
                              --var2;
                              if(var2 < 0) {
                                 return;
                              }

                              drawShadedLine(renderPixels, var1, 0, 0, var4 >> 16, var3 >> 16, var7, var20);
                              var3 += var17;
                              var4 += var14;
                              var7 += var10;
                              var1 += width;
                           }
                        }

                        drawShadedLine(renderPixels, var1, 0, 0, var4 >> 16, var5 >> 16, var7, var20);
                        var5 += var16;
                        var4 += var14;
                        var7 += var10;
                        var1 += width;
                     }
                  }
               }
            }
         } else if(var2 < _bottomY) {
            if(var0 > _bottomY) {
               var0 = _bottomY;
            }

            if(var1 > _bottomY) {
               var1 = _bottomY;
            }

            var8 = (var8 << 8) - var20 * var5 + var20;
            if(var0 < var1) {
               var4 = var5 <<= 16;
               if(var2 < 0) {
                  var4 -= var14 * var2;
                  var5 -= var17 * var2;
                  var8 -= var10 * var2;
                  var2 = 0;
               }

               var3 <<= 16;
               if(var0 < 0) {
                  var3 -= var16 * var0;
                  var0 = 0;
               }

               if(var14 < var17) {
                  var1 -= var0;
                  var0 -= var2;
                  var2 = lineOffsets[var2];

                  while(true) {
                     --var0;
                     if(var0 < 0) {
                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              return;
                           }

                           drawShadedLine(renderPixels, var2, 0, 0, var4 >> 16, var3 >> 16, var8, var20);
                           var4 += var14;
                           var3 += var16;
                           var8 += var10;
                           var2 += width;
                        }
                     }

                     drawShadedLine(renderPixels, var2, 0, 0, var4 >> 16, var5 >> 16, var8, var20);
                     var4 += var14;
                     var5 += var17;
                     var8 += var10;
                     var2 += width;
                  }
               } else {
                  var1 -= var0;
                  var0 -= var2;
                  var2 = lineOffsets[var2];

                  while(true) {
                     --var0;
                     if(var0 < 0) {
                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              return;
                           }

                           drawShadedLine(renderPixels, var2, 0, 0, var3 >> 16, var4 >> 16, var8, var20);
                           var4 += var14;
                           var3 += var16;
                           var8 += var10;
                           var2 += width;
                        }
                     }

                     drawShadedLine(renderPixels, var2, 0, 0, var5 >> 16, var4 >> 16, var8, var20);
                     var4 += var14;
                     var5 += var17;
                     var8 += var10;
                     var2 += width;
                  }
               }
            } else {
               var3 = var5 <<= 16;
               if(var2 < 0) {
                  var3 -= var14 * var2;
                  var5 -= var17 * var2;
                  var8 -= var10 * var2;
                  var2 = 0;
               }

               var4 <<= 16;
               if(var1 < 0) {
                  var4 -= var16 * var1;
                  var1 = 0;
               }

               if(var14 < var17) {
                  var0 -= var1;
                  var1 -= var2;
                  var2 = lineOffsets[var2];

                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              return;
                           }

                           drawShadedLine(renderPixels, var2, 0, 0, var4 >> 16, var5 >> 16, var8, var20);
                           var4 += var16;
                           var5 += var17;
                           var8 += var10;
                           var2 += width;
                        }
                     }

                     drawShadedLine(renderPixels, var2, 0, 0, var3 >> 16, var5 >> 16, var8, var20);
                     var3 += var14;
                     var5 += var17;
                     var8 += var10;
                     var2 += width;
                  }
               } else {
                  var0 -= var1;
                  var1 -= var2;
                  var2 = lineOffsets[var2];

                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              return;
                           }

                           drawShadedLine(renderPixels, var2, 0, 0, var5 >> 16, var4 >> 16, var8, var20);
                           var4 += var16;
                           var5 += var17;
                           var8 += var10;
                           var2 += width;
                        }
                     }

                     drawShadedLine(renderPixels, var2, 0, 0, var5 >> 16, var3 >> 16, var8, var20);
                     var3 += var14;
                     var5 += var17;
                     var8 += var10;
                     var2 += width;
                  }
               }
            }
         }
      }
   }

   Rasterizer3D() throws Throwable {
      throw new Error();
   }

   public static final void drawFlatTriangle(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if(var1 != var0) {
         var7 = (var4 - var3 << 16) / (var1 - var0);
      }

      int var8 = 0;
      if(var2 != var1) {
         var8 = (var5 - var4 << 16) / (var2 - var1);
      }

      int var9 = 0;
      if(var2 != var0) {
         var9 = (var3 - var5 << 16) / (var0 - var2);
      }

      if(var0 <= var1 && var0 <= var2) {
         if(var0 < _bottomY) {
            if(var1 > _bottomY) {
               var1 = _bottomY;
            }

            if(var2 > _bottomY) {
               var2 = _bottomY;
            }

            if(var1 < var2) {
               var5 = var3 <<= 16;
               if(var0 < 0) {
                  var5 -= var9 * var0;
                  var3 -= var7 * var0;
                  var0 = 0;
               }

               var4 <<= 16;
               if(var1 < 0) {
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               if((var0 == var1 || var9 >= var7) && (var0 != var1 || var9 <= var8)) {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = lineOffsets[var0];

                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              return;
                           }

                           drawScanLine(renderPixels, var0, var6, 0, var4 >> 16, var5 >> 16);
                           var5 += var9;
                           var4 += var8;
                           var0 += width;
                        }
                     }

                     drawScanLine(renderPixels, var0, var6, 0, var3 >> 16, var5 >> 16);
                     var5 += var9;
                     var3 += var7;
                     var0 += width;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = lineOffsets[var0];

                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              return;
                           }

                           drawScanLine(renderPixels, var0, var6, 0, var5 >> 16, var4 >> 16);
                           var5 += var9;
                           var4 += var8;
                           var0 += width;
                        }
                     }

                     drawScanLine(renderPixels, var0, var6, 0, var5 >> 16, var3 >> 16);
                     var5 += var9;
                     var3 += var7;
                     var0 += width;
                  }
               }
            } else {
               var4 = var3 <<= 16;
               if(var0 < 0) {
                  var4 -= var9 * var0;
                  var3 -= var7 * var0;
                  var0 = 0;
               }

               var5 <<= 16;
               if(var2 < 0) {
                  var5 -= var8 * var2;
                  var2 = 0;
               }

               if((var0 == var2 || var9 >= var7) && (var0 != var2 || var8 <= var7)) {
                  var1 -= var2;
                  var2 -= var0;
                  var0 = lineOffsets[var0];

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              return;
                           }

                           drawScanLine(renderPixels, var0, var6, 0, var3 >> 16, var5 >> 16);
                           var5 += var8;
                           var3 += var7;
                           var0 += width;
                        }
                     }

                     drawScanLine(renderPixels, var0, var6, 0, var3 >> 16, var4 >> 16);
                     var4 += var9;
                     var3 += var7;
                     var0 += width;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var0;
                  var0 = lineOffsets[var0];

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              return;
                           }

                           drawScanLine(renderPixels, var0, var6, 0, var5 >> 16, var3 >> 16);
                           var5 += var8;
                           var3 += var7;
                           var0 += width;
                        }
                     }

                     drawScanLine(renderPixels, var0, var6, 0, var4 >> 16, var3 >> 16);
                     var4 += var9;
                     var3 += var7;
                     var0 += width;
                  }
               }
            }
         }
      } else if(var1 <= var2) {
         if(var1 < _bottomY) {
            if(var2 > _bottomY) {
               var2 = _bottomY;
            }

            if(var0 > _bottomY) {
               var0 = _bottomY;
            }

            if(var2 < var0) {
               var3 = var4 <<= 16;
               if(var1 < 0) {
                  var3 -= var7 * var1;
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               var5 <<= 16;
               if(var2 < 0) {
                  var5 -= var9 * var2;
                  var2 = 0;
               }

               if((var1 == var2 || var7 >= var8) && (var1 != var2 || var7 <= var9)) {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = lineOffsets[var1];

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              return;
                           }

                           drawScanLine(renderPixels, var1, var6, 0, var5 >> 16, var3 >> 16);
                           var3 += var7;
                           var5 += var9;
                           var1 += width;
                        }
                     }

                     drawScanLine(renderPixels, var1, var6, 0, var4 >> 16, var3 >> 16);
                     var3 += var7;
                     var4 += var8;
                     var1 += width;
                  }
               } else {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = lineOffsets[var1];

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              return;
                           }

                           drawScanLine(renderPixels, var1, var6, 0, var3 >> 16, var5 >> 16);
                           var3 += var7;
                           var5 += var9;
                           var1 += width;
                        }
                     }

                     drawScanLine(renderPixels, var1, var6, 0, var3 >> 16, var4 >> 16);
                     var3 += var7;
                     var4 += var8;
                     var1 += width;
                  }
               }
            } else {
               var5 = var4 <<= 16;
               if(var1 < 0) {
                  var5 -= var7 * var1;
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               var3 <<= 16;
               if(var0 < 0) {
                  var3 -= var9 * var0;
                  var0 = 0;
               }

               if(var7 < var8) {
                  var2 -= var0;
                  var0 -= var1;
                  var1 = lineOffsets[var1];

                  while(true) {
                     --var0;
                     if(var0 < 0) {
                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              return;
                           }

                           drawScanLine(renderPixels, var1, var6, 0, var3 >> 16, var4 >> 16);
                           var3 += var9;
                           var4 += var8;
                           var1 += width;
                        }
                     }

                     drawScanLine(renderPixels, var1, var6, 0, var5 >> 16, var4 >> 16);
                     var5 += var7;
                     var4 += var8;
                     var1 += width;
                  }
               } else {
                  var2 -= var0;
                  var0 -= var1;
                  var1 = lineOffsets[var1];

                  while(true) {
                     --var0;
                     if(var0 < 0) {
                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              return;
                           }

                           drawScanLine(renderPixels, var1, var6, 0, var4 >> 16, var3 >> 16);
                           var3 += var9;
                           var4 += var8;
                           var1 += width;
                        }
                     }

                     drawScanLine(renderPixels, var1, var6, 0, var4 >> 16, var5 >> 16);
                     var5 += var7;
                     var4 += var8;
                     var1 += width;
                  }
               }
            }
         }
      } else if(var2 < _bottomY) {
         if(var0 > _bottomY) {
            var0 = _bottomY;
         }

         if(var1 > _bottomY) {
            var1 = _bottomY;
         }

         if(var0 < var1) {
            var4 = var5 <<= 16;
            if(var2 < 0) {
               var4 -= var8 * var2;
               var5 -= var9 * var2;
               var2 = 0;
            }

            var3 <<= 16;
            if(var0 < 0) {
               var3 -= var7 * var0;
               var0 = 0;
            }

            if(var8 < var9) {
               var1 -= var0;
               var0 -= var2;
               var2 = lineOffsets[var2];

               while(true) {
                  --var0;
                  if(var0 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        drawScanLine(renderPixels, var2, var6, 0, var4 >> 16, var3 >> 16);
                        var4 += var8;
                        var3 += var7;
                        var2 += width;
                     }
                  }

                  drawScanLine(renderPixels, var2, var6, 0, var4 >> 16, var5 >> 16);
                  var4 += var8;
                  var5 += var9;
                  var2 += width;
               }
            } else {
               var1 -= var0;
               var0 -= var2;
               var2 = lineOffsets[var2];

               while(true) {
                  --var0;
                  if(var0 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        drawScanLine(renderPixels, var2, var6, 0, var3 >> 16, var4 >> 16);
                        var4 += var8;
                        var3 += var7;
                        var2 += width;
                     }
                  }

                  drawScanLine(renderPixels, var2, var6, 0, var5 >> 16, var4 >> 16);
                  var4 += var8;
                  var5 += var9;
                  var2 += width;
               }
            }
         } else {
            var3 = var5 <<= 16;
            if(var2 < 0) {
               var3 -= var8 * var2;
               var5 -= var9 * var2;
               var2 = 0;
            }

            var4 <<= 16;
            if(var1 < 0) {
               var4 -= var7 * var1;
               var1 = 0;
            }

            if(var8 < var9) {
               var0 -= var1;
               var1 -= var2;
               var2 = lineOffsets[var2];

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           return;
                        }

                        drawScanLine(renderPixels, var2, var6, 0, var4 >> 16, var5 >> 16);
                        var4 += var7;
                        var5 += var9;
                        var2 += width;
                     }
                  }

                  drawScanLine(renderPixels, var2, var6, 0, var3 >> 16, var5 >> 16);
                  var3 += var8;
                  var5 += var9;
                  var2 += width;
               }
            } else {
               var0 -= var1;
               var1 -= var2;
               var2 = lineOffsets[var2];

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           return;
                        }

                        drawScanLine(renderPixels, var2, var6, 0, var5 >> 16, var4 >> 16);
                        var4 += var7;
                        var5 += var9;
                        var2 += width;
                     }
                  }

                  drawScanLine(renderPixels, var2, var6, 0, var5 >> 16, var3 >> 16);
                  var3 += var8;
                  var5 += var9;
                  var2 += width;
               }
            }
         }
      }
   }

   static final void drawScanLine(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      if(restrictEdges) {
         if(var5 > anInt2502) {
            var5 = anInt2502;
         }

         if(var4 < 0) {
            var4 = 0;
         }
      }

      if(var4 < var5) {
         var1 += var4;
         var3 = var5 - var4 >> 2;
         if(alpha == 0) {
            while(true) {
               --var3;
               if(var3 < 0) {
                  var3 = var5 - var4 & 3;

                  while(true) {
                     --var3;
                     if(var3 < 0) {
                        return;
                     }

                     var0[var1++] = var2;
                  }
               }

               var0[var1++] = var2;
               var0[var1++] = var2;
               var0[var1++] = var2;
               var0[var1++] = var2;
            }
         } else if(alpha == 254) {
            while(true) {
               --var3;
               if(var3 < 0) {
                  var3 = var5 - var4 & 3;

                  while(true) {
                     --var3;
                     if(var3 < 0) {
                        return;
                     }

                     var0[var1++] = var0[var1];
                  }
               }

               var0[var1++] = var0[var1];
               var0[var1++] = var0[var1];
               var0[var1++] = var0[var1];
               var0[var1++] = var0[var1];
            }
         } else {
            int var7 = alpha;
            int var8 = 256 - alpha;
            var2 = ((var2 & 16711935) * var8 >> 8 & 16711935) + ((var2 & '\uff00') * var8 >> 8 & '\uff00');

            while(true) {
               --var3;
               int var6;
               if(var3 < 0) {
                  var3 = var5 - var4 & 3;

                  while(true) {
                     --var3;
                     if(var3 < 0) {
                        return;
                     }

                     var6 = var0[var1];
                     var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & '\uff00') * var7 >> 8 & '\uff00');
                  }
               }

               var6 = var0[var1];
               var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & '\uff00') * var7 >> 8 & '\uff00');
               var6 = var0[var1];
               var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & '\uff00') * var7 >> 8 & '\uff00');
               var6 = var0[var1];
               var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & '\uff00') * var7 >> 8 & '\uff00');
               var6 = var0[var1];
               var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & '\uff00') * var7 >> 8 & '\uff00');
            }
         }
      }
   }

   static final void drawTexturedTriangle(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
      int[] texturePixels = anInterface2_2501.getTexturePixels(var18, -1037759622);
      int var21;
      if(texturePixels == null) {
         var21 = anInterface2_2501.method21(var18, -990146898);
         method2932(var0, var1, var2, var3, var4, var5, method2939(var21, var6), method2939(var21, var7), method2939(var21, var8));
      } else {
         aBool2500 = anInterface2_2501.method24(var18, 497566445);
         aBool2499 = anInterface2_2501.method23(var18, 1564709454);
         var21 = var4 - var3;
         int var26 = var1 - var0;
         int var27 = var5 - var3;
         int var31 = var2 - var0;
         int var28 = var7 - var6;
         int var23 = var8 - var6;
         int var29 = 0;
         if(var1 != var0) {
            var29 = (var4 - var3 << 16) / (var1 - var0);
         }

         int var30 = 0;
         if(var2 != var1) {
            var30 = (var5 - var4 << 16) / (var2 - var1);
         }

         int var22 = 0;
         if(var2 != var0) {
            var22 = (var3 - var5 << 16) / (var0 - var2);
         }

         int var32 = var21 * var31 - var27 * var26;
         if(var32 != 0) {
            int var41 = (var28 * var31 - var23 * var26 << 9) / var32;
            int var20 = (var23 * var21 - var28 * var27 << 9) / var32;
            var10 = var9 - var10;
            var13 = var12 - var13;
            var16 = var15 - var16;
            var11 -= var9;
            var14 -= var12;
            var17 -= var15;
            int var24 = var11 * var12 - var14 * var9 << 14;
            int var38 = var14 * var15 - var17 * var12 << 8;
            int var25 = var17 * var9 - var11 * var15 << 5;
            int var36 = var10 * var12 - var13 * var9 << 14;
            int var39 = var13 * var15 - var16 * var12 << 8;
            int var37 = var16 * var9 - var10 * var15 << 5;
            int var33 = var13 * var11 - var10 * var14 << 14;
            int var40 = var16 * var14 - var13 * var17 << 8;
            int var34 = var10 * var17 - var16 * var11 << 5;
            int var35;
            if(var0 <= var1 && var0 <= var2) {
               if(var0 < _bottomY) {
                  if(var1 > _bottomY) {
                     var1 = _bottomY;
                  }

                  if(var2 > _bottomY) {
                     var2 = _bottomY;
                  }

                  var6 = (var6 << 9) - var41 * var3 + var41;
                  if(var1 < var2) {
                     var5 = var3 <<= 16;
                     if(var0 < 0) {
                        var5 -= var22 * var0;
                        var3 -= var29 * var0;
                        var6 -= var20 * var0;
                        var0 = 0;
                     }

                     var4 <<= 16;
                     if(var1 < 0) {
                        var4 -= var30 * var1;
                        var1 = 0;
                     }

                     var35 = var0 - centerY;
                     var24 += var25 * var35;
                     var36 += var37 * var35;
                     var33 += var34 * var35;
                     if((var0 == var1 || var22 >= var29) && (var0 != var1 || var22 <= var30)) {
                        var2 -= var1;
                        var1 -= var0;
                        var0 = lineOffsets[var0];

                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 drawTexturedLine(renderPixels, texturePixels, 0, 0, var0, var4 >> 16, var5 >> 16, var6, var41, var24, var36, var33, var38, var39, var40);
                                 var5 += var22;
                                 var4 += var30;
                                 var6 += var20;
                                 var0 += width;
                                 var24 += var25;
                                 var36 += var37;
                                 var33 += var34;
                              }
                           }

                           drawTexturedLine(renderPixels, texturePixels, 0, 0, var0, var3 >> 16, var5 >> 16, var6, var41, var24, var36, var33, var38, var39, var40);
                           var5 += var22;
                           var3 += var29;
                           var6 += var20;
                           var0 += width;
                           var24 += var25;
                           var36 += var37;
                           var33 += var34;
                        }
                     } else {
                        var2 -= var1;
                        var1 -= var0;
                        var0 = lineOffsets[var0];

                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 drawTexturedLine(renderPixels, texturePixels, 0, 0, var0, var5 >> 16, var4 >> 16, var6, var41, var24, var36, var33, var38, var39, var40);
                                 var5 += var22;
                                 var4 += var30;
                                 var6 += var20;
                                 var0 += width;
                                 var24 += var25;
                                 var36 += var37;
                                 var33 += var34;
                              }
                           }

                           drawTexturedLine(renderPixels, texturePixels, 0, 0, var0, var5 >> 16, var3 >> 16, var6, var41, var24, var36, var33, var38, var39, var40);
                           var5 += var22;
                           var3 += var29;
                           var6 += var20;
                           var0 += width;
                           var24 += var25;
                           var36 += var37;
                           var33 += var34;
                        }
                     }
                  } else {
                     var4 = var3 <<= 16;
                     if(var0 < 0) {
                        var4 -= var22 * var0;
                        var3 -= var29 * var0;
                        var6 -= var20 * var0;
                        var0 = 0;
                     }

                     var5 <<= 16;
                     if(var2 < 0) {
                        var5 -= var30 * var2;
                        var2 = 0;
                     }

                     var35 = var0 - centerY;
                     var24 += var25 * var35;
                     var36 += var37 * var35;
                     var33 += var34 * var35;
                     if((var0 == var2 || var22 >= var29) && (var0 != var2 || var30 <= var29)) {
                        var1 -= var2;
                        var2 -= var0;
                        var0 = lineOffsets[var0];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var1;
                                 if(var1 < 0) {
                                    return;
                                 }

                                 drawTexturedLine(renderPixels, texturePixels, 0, 0, var0, var3 >> 16, var5 >> 16, var6, var41, var24, var36, var33, var38, var39, var40);
                                 var5 += var30;
                                 var3 += var29;
                                 var6 += var20;
                                 var0 += width;
                                 var24 += var25;
                                 var36 += var37;
                                 var33 += var34;
                              }
                           }

                           drawTexturedLine(renderPixels, texturePixels, 0, 0, var0, var3 >> 16, var4 >> 16, var6, var41, var24, var36, var33, var38, var39, var40);
                           var4 += var22;
                           var3 += var29;
                           var6 += var20;
                           var0 += width;
                           var24 += var25;
                           var36 += var37;
                           var33 += var34;
                        }
                     } else {
                        var1 -= var2;
                        var2 -= var0;
                        var0 = lineOffsets[var0];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var1;
                                 if(var1 < 0) {
                                    return;
                                 }

                                 drawTexturedLine(renderPixels, texturePixels, 0, 0, var0, var5 >> 16, var3 >> 16, var6, var41, var24, var36, var33, var38, var39, var40);
                                 var5 += var30;
                                 var3 += var29;
                                 var6 += var20;
                                 var0 += width;
                                 var24 += var25;
                                 var36 += var37;
                                 var33 += var34;
                              }
                           }

                           drawTexturedLine(renderPixels, texturePixels, 0, 0, var0, var4 >> 16, var3 >> 16, var6, var41, var24, var36, var33, var38, var39, var40);
                           var4 += var22;
                           var3 += var29;
                           var6 += var20;
                           var0 += width;
                           var24 += var25;
                           var36 += var37;
                           var33 += var34;
                        }
                     }
                  }
               }
            } else if(var1 <= var2) {
               if(var1 < _bottomY) {
                  if(var2 > _bottomY) {
                     var2 = _bottomY;
                  }

                  if(var0 > _bottomY) {
                     var0 = _bottomY;
                  }

                  var7 = (var7 << 9) - var41 * var4 + var41;
                  if(var2 < var0) {
                     var3 = var4 <<= 16;
                     if(var1 < 0) {
                        var3 -= var29 * var1;
                        var4 -= var30 * var1;
                        var7 -= var20 * var1;
                        var1 = 0;
                     }

                     var5 <<= 16;
                     if(var2 < 0) {
                        var5 -= var22 * var2;
                        var2 = 0;
                     }

                     var35 = var1 - centerY;
                     var24 += var25 * var35;
                     var36 += var37 * var35;
                     var33 += var34 * var35;
                     if((var1 == var2 || var29 >= var30) && (var1 != var2 || var29 <= var22)) {
                        var0 -= var2;
                        var2 -= var1;
                        var1 = lineOffsets[var1];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var0;
                                 if(var0 < 0) {
                                    return;
                                 }

                                 drawTexturedLine(renderPixels, texturePixels, 0, 0, var1, var5 >> 16, var3 >> 16, var7, var41, var24, var36, var33, var38, var39, var40);
                                 var3 += var29;
                                 var5 += var22;
                                 var7 += var20;
                                 var1 += width;
                                 var24 += var25;
                                 var36 += var37;
                                 var33 += var34;
                              }
                           }

                           drawTexturedLine(renderPixels, texturePixels, 0, 0, var1, var4 >> 16, var3 >> 16, var7, var41, var24, var36, var33, var38, var39, var40);
                           var3 += var29;
                           var4 += var30;
                           var7 += var20;
                           var1 += width;
                           var24 += var25;
                           var36 += var37;
                           var33 += var34;
                        }
                     } else {
                        var0 -= var2;
                        var2 -= var1;
                        var1 = lineOffsets[var1];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var0;
                                 if(var0 < 0) {
                                    return;
                                 }

                                 drawTexturedLine(renderPixels, texturePixels, 0, 0, var1, var3 >> 16, var5 >> 16, var7, var41, var24, var36, var33, var38, var39, var40);
                                 var3 += var29;
                                 var5 += var22;
                                 var7 += var20;
                                 var1 += width;
                                 var24 += var25;
                                 var36 += var37;
                                 var33 += var34;
                              }
                           }

                           drawTexturedLine(renderPixels, texturePixels, 0, 0, var1, var3 >> 16, var4 >> 16, var7, var41, var24, var36, var33, var38, var39, var40);
                           var3 += var29;
                           var4 += var30;
                           var7 += var20;
                           var1 += width;
                           var24 += var25;
                           var36 += var37;
                           var33 += var34;
                        }
                     }
                  } else {
                     var5 = var4 <<= 16;
                     if(var1 < 0) {
                        var5 -= var29 * var1;
                        var4 -= var30 * var1;
                        var7 -= var20 * var1;
                        var1 = 0;
                     }

                     var3 <<= 16;
                     if(var0 < 0) {
                        var3 -= var22 * var0;
                        var0 = 0;
                     }

                     var35 = var1 - centerY;
                     var24 += var25 * var35;
                     var36 += var37 * var35;
                     var33 += var34 * var35;
                     if(var29 < var30) {
                        var2 -= var0;
                        var0 -= var1;
                        var1 = lineOffsets[var1];

                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 drawTexturedLine(renderPixels, texturePixels, 0, 0, var1, var3 >> 16, var4 >> 16, var7, var41, var24, var36, var33, var38, var39, var40);
                                 var3 += var22;
                                 var4 += var30;
                                 var7 += var20;
                                 var1 += width;
                                 var24 += var25;
                                 var36 += var37;
                                 var33 += var34;
                              }
                           }

                           drawTexturedLine(renderPixels, texturePixels, 0, 0, var1, var5 >> 16, var4 >> 16, var7, var41, var24, var36, var33, var38, var39, var40);
                           var5 += var29;
                           var4 += var30;
                           var7 += var20;
                           var1 += width;
                           var24 += var25;
                           var36 += var37;
                           var33 += var34;
                        }
                     } else {
                        var2 -= var0;
                        var0 -= var1;
                        var1 = lineOffsets[var1];

                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 drawTexturedLine(renderPixels, texturePixels, 0, 0, var1, var4 >> 16, var3 >> 16, var7, var41, var24, var36, var33, var38, var39, var40);
                                 var3 += var22;
                                 var4 += var30;
                                 var7 += var20;
                                 var1 += width;
                                 var24 += var25;
                                 var36 += var37;
                                 var33 += var34;
                              }
                           }

                           drawTexturedLine(renderPixels, texturePixels, 0, 0, var1, var4 >> 16, var5 >> 16, var7, var41, var24, var36, var33, var38, var39, var40);
                           var5 += var29;
                           var4 += var30;
                           var7 += var20;
                           var1 += width;
                           var24 += var25;
                           var36 += var37;
                           var33 += var34;
                        }
                     }
                  }
               }
            } else if(var2 < _bottomY) {
               if(var0 > _bottomY) {
                  var0 = _bottomY;
               }

               if(var1 > _bottomY) {
                  var1 = _bottomY;
               }

               var8 = (var8 << 9) - var41 * var5 + var41;
               if(var0 < var1) {
                  var4 = var5 <<= 16;
                  if(var2 < 0) {
                     var4 -= var30 * var2;
                     var5 -= var22 * var2;
                     var8 -= var20 * var2;
                     var2 = 0;
                  }

                  var3 <<= 16;
                  if(var0 < 0) {
                     var3 -= var29 * var0;
                     var0 = 0;
                  }

                  var35 = var2 - centerY;
                  var24 += var25 * var35;
                  var36 += var37 * var35;
                  var33 += var34 * var35;
                  if(var30 < var22) {
                     var1 -= var0;
                     var0 -= var2;
                     var2 = lineOffsets[var2];

                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 return;
                              }

                              drawTexturedLine(renderPixels, texturePixels, 0, 0, var2, var4 >> 16, var3 >> 16, var8, var41, var24, var36, var33, var38, var39, var40);
                              var4 += var30;
                              var3 += var29;
                              var8 += var20;
                              var2 += width;
                              var24 += var25;
                              var36 += var37;
                              var33 += var34;
                           }
                        }

                        drawTexturedLine(renderPixels, texturePixels, 0, 0, var2, var4 >> 16, var5 >> 16, var8, var41, var24, var36, var33, var38, var39, var40);
                        var4 += var30;
                        var5 += var22;
                        var8 += var20;
                        var2 += width;
                        var24 += var25;
                        var36 += var37;
                        var33 += var34;
                     }
                  } else {
                     var1 -= var0;
                     var0 -= var2;
                     var2 = lineOffsets[var2];

                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 return;
                              }

                              drawTexturedLine(renderPixels, texturePixels, 0, 0, var2, var3 >> 16, var4 >> 16, var8, var41, var24, var36, var33, var38, var39, var40);
                              var4 += var30;
                              var3 += var29;
                              var8 += var20;
                              var2 += width;
                              var24 += var25;
                              var36 += var37;
                              var33 += var34;
                           }
                        }

                        drawTexturedLine(renderPixels, texturePixels, 0, 0, var2, var5 >> 16, var4 >> 16, var8, var41, var24, var36, var33, var38, var39, var40);
                        var4 += var30;
                        var5 += var22;
                        var8 += var20;
                        var2 += width;
                        var24 += var25;
                        var36 += var37;
                        var33 += var34;
                     }
                  }
               } else {
                  var3 = var5 <<= 16;
                  if(var2 < 0) {
                     var3 -= var30 * var2;
                     var5 -= var22 * var2;
                     var8 -= var20 * var2;
                     var2 = 0;
                  }

                  var4 <<= 16;
                  if(var1 < 0) {
                     var4 -= var29 * var1;
                     var1 = 0;
                  }

                  var35 = var2 - centerY;
                  var24 += var25 * var35;
                  var36 += var37 * var35;
                  var33 += var34 * var35;
                  if(var30 < var22) {
                     var0 -= var1;
                     var1 -= var2;
                     var2 = lineOffsets[var2];

                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           while(true) {
                              --var0;
                              if(var0 < 0) {
                                 return;
                              }

                              drawTexturedLine(renderPixels, texturePixels, 0, 0, var2, var4 >> 16, var5 >> 16, var8, var41, var24, var36, var33, var38, var39, var40);
                              var4 += var29;
                              var5 += var22;
                              var8 += var20;
                              var2 += width;
                              var24 += var25;
                              var36 += var37;
                              var33 += var34;
                           }
                        }

                        drawTexturedLine(renderPixels, texturePixels, 0, 0, var2, var3 >> 16, var5 >> 16, var8, var41, var24, var36, var33, var38, var39, var40);
                        var3 += var30;
                        var5 += var22;
                        var8 += var20;
                        var2 += width;
                        var24 += var25;
                        var36 += var37;
                        var33 += var34;
                     }
                  } else {
                     var0 -= var1;
                     var1 -= var2;
                     var2 = lineOffsets[var2];

                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           while(true) {
                              --var0;
                              if(var0 < 0) {
                                 return;
                              }

                              drawTexturedLine(renderPixels, texturePixels, 0, 0, var2, var5 >> 16, var4 >> 16, var8, var41, var24, var36, var33, var38, var39, var40);
                              var4 += var29;
                              var5 += var22;
                              var8 += var20;
                              var2 += width;
                              var24 += var25;
                              var36 += var37;
                              var33 += var34;
                           }
                        }

                        drawTexturedLine(renderPixels, texturePixels, 0, 0, var2, var5 >> 16, var3 >> 16, var8, var41, var24, var36, var33, var38, var39, var40);
                        var3 += var30;
                        var5 += var22;
                        var8 += var20;
                        var2 += width;
                        var24 += var25;
                        var36 += var37;
                        var33 += var34;
                     }
                  }
               }
            }
         }
      }
   }

   static final void method2936(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
      if(restrictEdges) {
         if(var6 > anInt2502) {
            var6 = anInt2502;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var4 += var5;
         var7 += var8 * var5;
         int var15 = var6 - var5;
         int var16;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         if(aBool2500) {
            var18 = var5 - centerX;
            var9 += var12 * var18;
            var10 += var13 * var18;
            var11 += var14 * var18;
            var19 = var11 >> 12;
            if(var19 != 0) {
               var20 = var9 / var19;
               var21 = var10 / var19;
            } else {
               var20 = 0;
               var21 = 0;
            }

            var9 += var12 * var15;
            var10 += var13 * var15;
            var11 += var14 * var15;
            var19 = var11 >> 12;
            if(var19 != 0) {
               var22 = var9 / var19;
               var23 = var10 / var19;
            } else {
               var22 = 0;
               var23 = 0;
            }

            var2 = (var20 << 20) + var21;
            var17 = ((var22 - var20) / var15 << 20) + (var23 - var21) / var15;
            var15 >>= 3;
            var8 <<= 3;
            var16 = var7 >> 8;
            if(aBool2499) {
               if(var15 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var7 += var8;
                     var16 = var7 >> 8;
                     --var15;
                  } while(var15 > 0);
               }

               var15 = var6 - var5 & 7;
               if(var15 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     --var15;
                  } while(var15 > 0);

               }
            } else {
               if(var15 > 0) {
                  do {
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     var7 += var8;
                     var16 = var7 >> 8;
                     --var15;
                  } while(var15 > 0);
               }

               var15 = var6 - var5 & 7;
               if(var15 > 0) {
                  do {
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     --var15;
                  } while(var15 > 0);

               }
            }
         } else {
            var18 = var5 - centerX;
            var9 += var12 * var18;
            var10 += var13 * var18;
            var11 += var14 * var18;
            var19 = var11 >> 14;
            if(var19 != 0) {
               var20 = var9 / var19;
               var21 = var10 / var19;
            } else {
               var20 = 0;
               var21 = 0;
            }

            var9 += var12 * var15;
            var10 += var13 * var15;
            var11 += var14 * var15;
            var19 = var11 >> 14;
            if(var19 != 0) {
               var22 = var9 / var19;
               var23 = var10 / var19;
            } else {
               var22 = 0;
               var23 = 0;
            }

            var2 = (var20 << 18) + var21;
            var17 = ((var22 - var20) / var15 << 18) + (var23 - var21) / var15;
            var15 >>= 3;
            var8 <<= 3;
            var16 = var7 >> 8;
            if(aBool2499) {
               if(var15 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     var7 += var8;
                     var16 = var7 >> 8;
                     --var15;
                  } while(var15 > 0);
               }

               var15 = var6 - var5 & 7;
               if(var15 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     var2 += var17;
                     --var15;
                  } while(var15 > 0);

               }
            } else {
               if(var15 > 0) {
                  do {
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     var7 += var8;
                     var16 = var7 >> 8;
                     --var15;
                  } while(var15 > 0);
               }

               var15 = var6 - var5 & 7;
               if(var15 > 0) {
                  do {
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     --var15;
                  } while(var15 > 0);

               }
            }
         }
      }
   }

   static final void method2937(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
      int[] var19 = anInterface2_2501.getTexturePixels(var18, -1633464899);
      int var22;
      if(var19 == null) {
         var22 = anInterface2_2501.method21(var18, -671846890);
         method2932(var0, var1, var2, var3, var4, var5, method2939(var22, var6), method2939(var22, var7), method2939(var22, var8));
      } else {
         aBool2500 = anInterface2_2501.method24(var18, 1192091588);
         aBool2499 = anInterface2_2501.method23(var18, 1562357298);
         var22 = var4 - var3;
         int var36 = var1 - var0;
         int var38 = var5 - var3;
         int var34 = var2 - var0;
         int var25 = var7 - var6;
         int var35 = var8 - var6;
         int var23 = 0;
         if(var1 != var0) {
            var23 = (var4 - var3 << 16) / (var1 - var0);
         }

         int var33 = 0;
         if(var2 != var1) {
            var33 = (var5 - var4 << 16) / (var2 - var1);
         }

         int var24 = 0;
         if(var2 != var0) {
            var24 = (var3 - var5 << 16) / (var0 - var2);
         }

         int var37 = var22 * var34 - var38 * var36;
         if(var37 != 0) {
            int var26 = (var25 * var34 - var35 * var36 << 9) / var37;
            int var39 = (var35 * var22 - var25 * var38 << 9) / var37;
            var10 = var9 - var10;
            var13 = var12 - var13;
            var16 = var15 - var16;
            var11 -= var9;
            var14 -= var12;
            var17 -= var15;
            int var27 = var11 * var12 - var14 * var9 << 14;
            int var29 = var14 * var15 - var17 * var12 << 5;
            int var40 = var17 * var9 - var11 * var15 << 5;
            int var20 = var10 * var12 - var13 * var9 << 14;
            int var30 = var13 * var15 - var16 * var12 << 5;
            int var21 = var16 * var9 - var10 * var15 << 5;
            int var28 = var13 * var11 - var10 * var14 << 14;
            int var31 = var16 * var14 - var13 * var17 << 5;
            int var32 = var10 * var17 - var16 * var11 << 5;
            int var41;
            if(var0 <= var1 && var0 <= var2) {
               if(var0 < _bottomY) {
                  if(var1 > _bottomY) {
                     var1 = _bottomY;
                  }

                  if(var2 > _bottomY) {
                     var2 = _bottomY;
                  }

                  var6 = (var6 << 9) - var26 * var3 + var26;
                  if(var1 < var2) {
                     var5 = var3 <<= 16;
                     if(var0 < 0) {
                        var5 -= var24 * var0;
                        var3 -= var23 * var0;
                        var6 -= var39 * var0;
                        var0 = 0;
                     }

                     var4 <<= 16;
                     if(var1 < 0) {
                        var4 -= var33 * var1;
                        var1 = 0;
                     }

                     var41 = var0 - centerY;
                     var27 += var40 * var41;
                     var20 += var21 * var41;
                     var28 += var32 * var41;
                     if((var0 == var1 || var24 >= var23) && (var0 != var1 || var24 <= var33)) {
                        var2 -= var1;
                        var1 -= var0;
                        var0 = lineOffsets[var0];

                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 method2936(renderPixels, var19, 0, 0, var0, var4 >> 16, var5 >> 16, var6, var26, var27, var20, var28, var29, var30, var31);
                                 var5 += var24;
                                 var4 += var33;
                                 var6 += var39;
                                 var0 += width;
                                 var27 += var40;
                                 var20 += var21;
                                 var28 += var32;
                              }
                           }

                           method2936(renderPixels, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6, var26, var27, var20, var28, var29, var30, var31);
                           var5 += var24;
                           var3 += var23;
                           var6 += var39;
                           var0 += width;
                           var27 += var40;
                           var20 += var21;
                           var28 += var32;
                        }
                     } else {
                        var2 -= var1;
                        var1 -= var0;
                        var0 = lineOffsets[var0];

                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 method2936(renderPixels, var19, 0, 0, var0, var5 >> 16, var4 >> 16, var6, var26, var27, var20, var28, var29, var30, var31);
                                 var5 += var24;
                                 var4 += var33;
                                 var6 += var39;
                                 var0 += width;
                                 var27 += var40;
                                 var20 += var21;
                                 var28 += var32;
                              }
                           }

                           method2936(renderPixels, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var6, var26, var27, var20, var28, var29, var30, var31);
                           var5 += var24;
                           var3 += var23;
                           var6 += var39;
                           var0 += width;
                           var27 += var40;
                           var20 += var21;
                           var28 += var32;
                        }
                     }
                  } else {
                     var4 = var3 <<= 16;
                     if(var0 < 0) {
                        var4 -= var24 * var0;
                        var3 -= var23 * var0;
                        var6 -= var39 * var0;
                        var0 = 0;
                     }

                     var5 <<= 16;
                     if(var2 < 0) {
                        var5 -= var33 * var2;
                        var2 = 0;
                     }

                     var41 = var0 - centerY;
                     var27 += var40 * var41;
                     var20 += var21 * var41;
                     var28 += var32 * var41;
                     if((var0 == var2 || var24 >= var23) && (var0 != var2 || var33 <= var23)) {
                        var1 -= var2;
                        var2 -= var0;
                        var0 = lineOffsets[var0];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var1;
                                 if(var1 < 0) {
                                    return;
                                 }

                                 method2936(renderPixels, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6, var26, var27, var20, var28, var29, var30, var31);
                                 var5 += var33;
                                 var3 += var23;
                                 var6 += var39;
                                 var0 += width;
                                 var27 += var40;
                                 var20 += var21;
                                 var28 += var32;
                              }
                           }

                           method2936(renderPixels, var19, 0, 0, var0, var3 >> 16, var4 >> 16, var6, var26, var27, var20, var28, var29, var30, var31);
                           var4 += var24;
                           var3 += var23;
                           var6 += var39;
                           var0 += width;
                           var27 += var40;
                           var20 += var21;
                           var28 += var32;
                        }
                     } else {
                        var1 -= var2;
                        var2 -= var0;
                        var0 = lineOffsets[var0];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var1;
                                 if(var1 < 0) {
                                    return;
                                 }

                                 method2936(renderPixels, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var6, var26, var27, var20, var28, var29, var30, var31);
                                 var5 += var33;
                                 var3 += var23;
                                 var6 += var39;
                                 var0 += width;
                                 var27 += var40;
                                 var20 += var21;
                                 var28 += var32;
                              }
                           }

                           method2936(renderPixels, var19, 0, 0, var0, var4 >> 16, var3 >> 16, var6, var26, var27, var20, var28, var29, var30, var31);
                           var4 += var24;
                           var3 += var23;
                           var6 += var39;
                           var0 += width;
                           var27 += var40;
                           var20 += var21;
                           var28 += var32;
                        }
                     }
                  }
               }
            } else if(var1 <= var2) {
               if(var1 < _bottomY) {
                  if(var2 > _bottomY) {
                     var2 = _bottomY;
                  }

                  if(var0 > _bottomY) {
                     var0 = _bottomY;
                  }

                  var7 = (var7 << 9) - var26 * var4 + var26;
                  if(var2 < var0) {
                     var3 = var4 <<= 16;
                     if(var1 < 0) {
                        var3 -= var23 * var1;
                        var4 -= var33 * var1;
                        var7 -= var39 * var1;
                        var1 = 0;
                     }

                     var5 <<= 16;
                     if(var2 < 0) {
                        var5 -= var24 * var2;
                        var2 = 0;
                     }

                     var41 = var1 - centerY;
                     var27 += var40 * var41;
                     var20 += var21 * var41;
                     var28 += var32 * var41;
                     if((var1 == var2 || var23 >= var33) && (var1 != var2 || var23 <= var24)) {
                        var0 -= var2;
                        var2 -= var1;
                        var1 = lineOffsets[var1];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var0;
                                 if(var0 < 0) {
                                    return;
                                 }

                                 method2936(renderPixels, var19, 0, 0, var1, var5 >> 16, var3 >> 16, var7, var26, var27, var20, var28, var29, var30, var31);
                                 var3 += var23;
                                 var5 += var24;
                                 var7 += var39;
                                 var1 += width;
                                 var27 += var40;
                                 var20 += var21;
                                 var28 += var32;
                              }
                           }

                           method2936(renderPixels, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7, var26, var27, var20, var28, var29, var30, var31);
                           var3 += var23;
                           var4 += var33;
                           var7 += var39;
                           var1 += width;
                           var27 += var40;
                           var20 += var21;
                           var28 += var32;
                        }
                     } else {
                        var0 -= var2;
                        var2 -= var1;
                        var1 = lineOffsets[var1];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var0;
                                 if(var0 < 0) {
                                    return;
                                 }

                                 method2936(renderPixels, var19, 0, 0, var1, var3 >> 16, var5 >> 16, var7, var26, var27, var20, var28, var29, var30, var31);
                                 var3 += var23;
                                 var5 += var24;
                                 var7 += var39;
                                 var1 += width;
                                 var27 += var40;
                                 var20 += var21;
                                 var28 += var32;
                              }
                           }

                           method2936(renderPixels, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var7, var26, var27, var20, var28, var29, var30, var31);
                           var3 += var23;
                           var4 += var33;
                           var7 += var39;
                           var1 += width;
                           var27 += var40;
                           var20 += var21;
                           var28 += var32;
                        }
                     }
                  } else {
                     var5 = var4 <<= 16;
                     if(var1 < 0) {
                        var5 -= var23 * var1;
                        var4 -= var33 * var1;
                        var7 -= var39 * var1;
                        var1 = 0;
                     }

                     var3 <<= 16;
                     if(var0 < 0) {
                        var3 -= var24 * var0;
                        var0 = 0;
                     }

                     var41 = var1 - centerY;
                     var27 += var40 * var41;
                     var20 += var21 * var41;
                     var28 += var32 * var41;
                     if(var23 < var33) {
                        var2 -= var0;
                        var0 -= var1;
                        var1 = lineOffsets[var1];

                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 method2936(renderPixels, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var7, var26, var27, var20, var28, var29, var30, var31);
                                 var3 += var24;
                                 var4 += var33;
                                 var7 += var39;
                                 var1 += width;
                                 var27 += var40;
                                 var20 += var21;
                                 var28 += var32;
                              }
                           }

                           method2936(renderPixels, var19, 0, 0, var1, var5 >> 16, var4 >> 16, var7, var26, var27, var20, var28, var29, var30, var31);
                           var5 += var23;
                           var4 += var33;
                           var7 += var39;
                           var1 += width;
                           var27 += var40;
                           var20 += var21;
                           var28 += var32;
                        }
                     } else {
                        var2 -= var0;
                        var0 -= var1;
                        var1 = lineOffsets[var1];

                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 method2936(renderPixels, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7, var26, var27, var20, var28, var29, var30, var31);
                                 var3 += var24;
                                 var4 += var33;
                                 var7 += var39;
                                 var1 += width;
                                 var27 += var40;
                                 var20 += var21;
                                 var28 += var32;
                              }
                           }

                           method2936(renderPixels, var19, 0, 0, var1, var4 >> 16, var5 >> 16, var7, var26, var27, var20, var28, var29, var30, var31);
                           var5 += var23;
                           var4 += var33;
                           var7 += var39;
                           var1 += width;
                           var27 += var40;
                           var20 += var21;
                           var28 += var32;
                        }
                     }
                  }
               }
            } else if(var2 < _bottomY) {
               if(var0 > _bottomY) {
                  var0 = _bottomY;
               }

               if(var1 > _bottomY) {
                  var1 = _bottomY;
               }

               var8 = (var8 << 9) - var26 * var5 + var26;
               if(var0 < var1) {
                  var4 = var5 <<= 16;
                  if(var2 < 0) {
                     var4 -= var33 * var2;
                     var5 -= var24 * var2;
                     var8 -= var39 * var2;
                     var2 = 0;
                  }

                  var3 <<= 16;
                  if(var0 < 0) {
                     var3 -= var23 * var0;
                     var0 = 0;
                  }

                  var41 = var2 - centerY;
                  var27 += var40 * var41;
                  var20 += var21 * var41;
                  var28 += var32 * var41;
                  if(var33 < var24) {
                     var1 -= var0;
                     var0 -= var2;
                     var2 = lineOffsets[var2];

                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 return;
                              }

                              method2936(renderPixels, var19, 0, 0, var2, var4 >> 16, var3 >> 16, var8, var26, var27, var20, var28, var29, var30, var31);
                              var4 += var33;
                              var3 += var23;
                              var8 += var39;
                              var2 += width;
                              var27 += var40;
                              var20 += var21;
                              var28 += var32;
                           }
                        }

                        method2936(renderPixels, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var8, var26, var27, var20, var28, var29, var30, var31);
                        var4 += var33;
                        var5 += var24;
                        var8 += var39;
                        var2 += width;
                        var27 += var40;
                        var20 += var21;
                        var28 += var32;
                     }
                  } else {
                     var1 -= var0;
                     var0 -= var2;
                     var2 = lineOffsets[var2];

                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 return;
                              }

                              method2936(renderPixels, var19, 0, 0, var2, var3 >> 16, var4 >> 16, var8, var26, var27, var20, var28, var29, var30, var31);
                              var4 += var33;
                              var3 += var23;
                              var8 += var39;
                              var2 += width;
                              var27 += var40;
                              var20 += var21;
                              var28 += var32;
                           }
                        }

                        method2936(renderPixels, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8, var26, var27, var20, var28, var29, var30, var31);
                        var4 += var33;
                        var5 += var24;
                        var8 += var39;
                        var2 += width;
                        var27 += var40;
                        var20 += var21;
                        var28 += var32;
                     }
                  }
               } else {
                  var3 = var5 <<= 16;
                  if(var2 < 0) {
                     var3 -= var33 * var2;
                     var5 -= var24 * var2;
                     var8 -= var39 * var2;
                     var2 = 0;
                  }

                  var4 <<= 16;
                  if(var1 < 0) {
                     var4 -= var23 * var1;
                     var1 = 0;
                  }

                  var41 = var2 - centerY;
                  var27 += var40 * var41;
                  var20 += var21 * var41;
                  var28 += var32 * var41;
                  if(var33 < var24) {
                     var0 -= var1;
                     var1 -= var2;
                     var2 = lineOffsets[var2];

                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           while(true) {
                              --var0;
                              if(var0 < 0) {
                                 return;
                              }

                              method2936(renderPixels, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var8, var26, var27, var20, var28, var29, var30, var31);
                              var4 += var23;
                              var5 += var24;
                              var8 += var39;
                              var2 += width;
                              var27 += var40;
                              var20 += var21;
                              var28 += var32;
                           }
                        }

                        method2936(renderPixels, var19, 0, 0, var2, var3 >> 16, var5 >> 16, var8, var26, var27, var20, var28, var29, var30, var31);
                        var3 += var33;
                        var5 += var24;
                        var8 += var39;
                        var2 += width;
                        var27 += var40;
                        var20 += var21;
                        var28 += var32;
                     }
                  } else {
                     var0 -= var1;
                     var1 -= var2;
                     var2 = lineOffsets[var2];

                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           while(true) {
                              --var0;
                              if(var0 < 0) {
                                 return;
                              }

                              method2936(renderPixels, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8, var26, var27, var20, var28, var29, var30, var31);
                              var4 += var23;
                              var5 += var24;
                              var8 += var39;
                              var2 += width;
                              var27 += var40;
                              var20 += var21;
                              var28 += var32;
                           }
                        }

                        method2936(renderPixels, var19, 0, 0, var2, var5 >> 16, var3 >> 16, var8, var26, var27, var20, var28, var29, var30, var31);
                        var3 += var33;
                        var5 += var24;
                        var8 += var39;
                        var2 += width;
                        var27 += var40;
                        var20 += var21;
                        var28 += var32;
                     }
                  }
               }
            }
         }
      }
   }

   static final int method2939(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         shadowDecay[var0] = '\u8000' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         anIntArray2520[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         SINE[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
         COSINE[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
      }

   }

   static final void drawShadedLine(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(restrictEdges) {
         if(var5 > anInt2502) {
            var5 = anInt2502;
         }

         if(var4 < 0) {
            var4 = 0;
         }
      }

      if(var4 < var5) {
         var1 += var4;
         var6 += var7 * var4;
         int var8;
         int var9;
         int var10;
         if(aBool2518) {
            var3 = var5 - var4 >> 2;
            var7 <<= 2;
            if(alpha == 0) {
               if(var3 > 0) {
                  do {
                     var2 = rgbTable[var6 >> 8];
                     var6 += var7;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     --var3;
                  } while(var3 > 0);
               }

               var3 = var5 - var4 & 3;
               if(var3 > 0) {
                  var2 = rgbTable[var6 >> 8];

                  do {
                     var0[var1++] = var2;
                     --var3;
                  } while(var3 > 0);

               }
            } else {
               var9 = alpha;
               var10 = 256 - alpha;
               if(var3 > 0) {
                  do {
                     var2 = rgbTable[var6 >> 8];
                     var6 += var7;
                     var2 = ((var2 & 16711935) * var10 >> 8 & 16711935) + ((var2 & '\uff00') * var10 >> 8 & '\uff00');
                     var8 = var0[var1];
                     var0[var1++] = var2 + ((var8 & 16711935) * var9 >> 8 & 16711935) + ((var8 & '\uff00') * var9 >> 8 & '\uff00');
                     var8 = var0[var1];
                     var0[var1++] = var2 + ((var8 & 16711935) * var9 >> 8 & 16711935) + ((var8 & '\uff00') * var9 >> 8 & '\uff00');
                     var8 = var0[var1];
                     var0[var1++] = var2 + ((var8 & 16711935) * var9 >> 8 & 16711935) + ((var8 & '\uff00') * var9 >> 8 & '\uff00');
                     var8 = var0[var1];
                     var0[var1++] = var2 + ((var8 & 16711935) * var9 >> 8 & 16711935) + ((var8 & '\uff00') * var9 >> 8 & '\uff00');
                     --var3;
                  } while(var3 > 0);
               }

               var3 = var5 - var4 & 3;
               if(var3 > 0) {
                  var2 = rgbTable[var6 >> 8];
                  var2 = ((var2 & 16711935) * var10 >> 8 & 16711935) + ((var2 & '\uff00') * var10 >> 8 & '\uff00');

                  do {
                     var8 = var0[var1];
                     var0[var1++] = var2 + ((var8 & 16711935) * var9 >> 8 & 16711935) + ((var8 & '\uff00') * var9 >> 8 & '\uff00');
                     --var3;
                  } while(var3 > 0);

               }
            }
         } else {
            var3 = var5 - var4;
            if(alpha == 0) {
               do {
                  var0[var1++] = rgbTable[var6 >> 8];
                  var6 += var7;
                  --var3;
               } while(var3 > 0);

            } else {
               var9 = alpha;
               var10 = 256 - alpha;

               do {
                  var2 = rgbTable[var6 >> 8];
                  var6 += var7;
                  var2 = ((var2 & 16711935) * var10 >> 8 & 16711935) + ((var2 & '\uff00') * var10 >> 8 & '\uff00');
                  var8 = var0[var1];
                  var0[var1++] = var2 + ((var8 & 16711935) * var9 >> 8 & 16711935) + ((var8 & '\uff00') * var9 >> 8 & '\uff00');
                  --var3;
               } while(var3 > 0);

            }
         }
      }
   }

   public static final void method2970() {
      method2924(topX, topY, bottomX, bottomY);
   }

   public static final void method2975(Interface2 var0) {
      anInterface2_2501 = var0;
   }

   public static final void method2976(double var0) {
      calculatePalette(var0, 0, 512);
   }
}
