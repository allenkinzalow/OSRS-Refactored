
public class ModelRasterizer extends Renderable {

   static int[] anIntArray2431 = new int[10];
   int[] vertexXCoordinate;
   static int vertexYModifier;
   int anInt2434 = 0;
   int vertexCoordinateCount = 0;
   int anInt2436;
   int[] vertexYCoordinate;
   int[] vertexZCoordinate;
   int[][] anIntArrayArray2439;
   int[] anIntArray2440;
   int[] anIntArray2441;
   int[] anIntArray2442;
   static int[][] anIntArrayArray2443 = new int[1600][512];
   int[] anIntArray2444;
   int[] anIntArray2445;
   byte[] aByteArray2446;
   byte[] triangleAlphaValues;
   static int[] projectedVertexX = new int[4096];
   static int[] anIntArray2449 = new int[2000];
   byte aByte2450 = 0;
   byte[] aByteArray2451;
   static byte[] aByteArray2452 = new byte[1];
   int[] anIntArray2453;
   int[] anIntArray2454;
   static final int anInt2455 = 50;
   int[][] anIntArrayArray2456;
   public boolean aBool2457 = false;
   int anInt2458 = 0;
   int anInt2459;
   int anInt2460;
   int anInt2461;
   int[] anIntArray2462;
   static final int anInt2463 = 9;
   static boolean[] aBoolArray2464 = new boolean[4096];
   static boolean[] aBoolArray2465 = new boolean[4096];
   int anInt2466;
   static int[] projectedVertexY = new int[4096];
   static int[] projectedVertexZ = new int[4096];
   static int[] cameraVertexX = new int[4096];
   static int[] cameraVertexY = new int[4096];
   static int[] cameraVertexZ = new int[4096];
   static final int anInt2472 = 1600;
   static int[] anIntArray2473 = Rasterizer3D.rgbTable;
   static int[] anIntArray2474 = new int[1600];
   static int[] anIntArray2475 = new int[12];
   static int[][] anIntArrayArray2476 = new int[12][2000];
   static byte[] aByteArray2477 = new byte[1];
   static int[] anIntArray2478 = new int[2000];
   static int[] anIntArray2479 = new int[12];
   static int[] anIntArray2480 = new int[10];
   short[] aShortArray2481;
   static int[] anIntArray2482 = new int[10];
   static int vertexXModifier;
   static ModelRasterizer aClass108_Sub20_Sub14_Sub3_2484 = new ModelRasterizer();
   static int vertexZModifier;
   public static boolean aBool2486 = false;
   public static int anInt2487 = 0;
   public static int anInt2488 = 0;
   int[] anIntArray2489;
   public static int anInt2490 = 0;
   static int[] SINE = Rasterizer3D.SINE;
   static int[] COSINE = Rasterizer3D.COSINE;
   static final int anInt2493 = 4096;
   static int[] anIntArray2494 = Rasterizer3D.anIntArray2520;
   public static int[] anIntArray2495 = new int[1000];
   static ModelRasterizer aClass108_Sub20_Sub14_Sub3_2496 = new ModelRasterizer();
   static final int anInt2497 = 3500;


   public ModelRasterizer method2852(boolean var1) {
      if(!var1 && aByteArray2477.length < this.anInt2458) {
         aByteArray2477 = new byte[this.anInt2458 + 100];
      }

      return this.method2854(var1, aClass108_Sub20_Sub14_Sub3_2484, aByteArray2477);
   }

   ModelRasterizer method2854(boolean var1, ModelRasterizer var2, byte[] var3) {
      var2.vertexCoordinateCount = this.vertexCoordinateCount;
      var2.anInt2458 = this.anInt2458;
      var2.anInt2434 = this.anInt2434;
      if(var2.vertexXCoordinate == null || var2.vertexXCoordinate.length < this.vertexCoordinateCount) {
         var2.vertexXCoordinate = new int[this.vertexCoordinateCount + 100];
         var2.vertexYCoordinate = new int[this.vertexCoordinateCount + 100];
         var2.vertexZCoordinate = new int[this.vertexCoordinateCount + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.vertexCoordinateCount; ++var4) {
         var2.vertexXCoordinate[var4] = this.vertexXCoordinate[var4];
         var2.vertexYCoordinate[var4] = this.vertexYCoordinate[var4];
         var2.vertexZCoordinate[var4] = this.vertexZCoordinate[var4];
      }

      if(var1) {
         var2.triangleAlphaValues = this.triangleAlphaValues;
      } else {
         var2.triangleAlphaValues = var3;
         if(this.triangleAlphaValues == null) {
            for(var4 = 0; var4 < this.anInt2458; ++var4) {
               var2.triangleAlphaValues[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.anInt2458; ++var4) {
               var2.triangleAlphaValues[var4] = this.triangleAlphaValues[var4];
            }
         }
      }

      var2.anIntArray2440 = this.anIntArray2440;
      var2.anIntArray2441 = this.anIntArray2441;
      var2.anIntArray2442 = this.anIntArray2442;
      var2.anIntArray2445 = this.anIntArray2445;
      var2.anIntArray2444 = this.anIntArray2444;
      var2.anIntArray2489 = this.anIntArray2489;
      var2.aByteArray2446 = this.aByteArray2446;
      var2.aByteArray2451 = this.aByteArray2451;
      var2.aShortArray2481 = this.aShortArray2481;
      var2.aByte2450 = this.aByte2450;
      var2.anIntArray2462 = this.anIntArray2462;
      var2.anIntArray2453 = this.anIntArray2453;
      var2.anIntArray2454 = this.anIntArray2454;
      var2.anIntArrayArray2439 = this.anIntArrayArray2439;
      var2.anIntArrayArray2456 = this.anIntArrayArray2456;
      var2.aBool2457 = this.aBool2457;
      var2.anInt2466 = 0;
      return var2;
   }

   public void method2855() {
      if(this.anInt2466 != 1) {
         this.anInt2466 = 1;
         this.modelHeight = 0;
         this.anInt2459 = 0;
         this.anInt2460 = 0;

         for(int var1 = 0; var1 < this.vertexCoordinateCount; ++var1) {
            int var4 = this.vertexXCoordinate[var1];
            int var3 = this.vertexYCoordinate[var1];
            int var2 = this.vertexZCoordinate[var1];
            if(-var3 > this.modelHeight * 782517621) {
               this.modelHeight = -var3 * -741563683;
            }

            if(var3 > this.anInt2459) {
               this.anInt2459 = var3;
            }

            int var5 = var4 * var4 + var2 * var2;
            if(var5 > this.anInt2460) {
               this.anInt2460 = var5;
            }
         }

         this.anInt2460 = (int)(Math.sqrt((double)this.anInt2460) + 0.99D);
         this.anInt2436 = (int)(Math.sqrt((double)(this.anInt2460 * this.anInt2460 + this.modelHeight * 782517621 * this.modelHeight * 782517621)) + 0.99D);
         this.anInt2461 = this.anInt2436 + (int)(Math.sqrt((double)(this.anInt2460 * this.anInt2460 + this.anInt2459 * this.anInt2459)) + 0.99D);
      }
   }

   void method2856() {
      if(this.anInt2466 != 2) {
         this.anInt2466 = 2;
         this.anInt2460 = 0;

         for(int var1 = 0; var1 < this.vertexCoordinateCount; ++var1) {
            int var3 = this.vertexXCoordinate[var1];
            int var2 = this.vertexYCoordinate[var1];
            int var4 = this.vertexZCoordinate[var1];
            int var5 = var3 * var3 + var4 * var4 + var2 * var2;
            if(var5 > this.anInt2460) {
               this.anInt2460 = var5;
            }
         }

         this.anInt2460 = (int)(Math.sqrt((double)this.anInt2460) + 0.99D);
         this.anInt2436 = this.anInt2460;
         this.anInt2461 = this.anInt2460 + this.anInt2460;
      }
   }

   public int method2857() {
      this.method2855();
      return this.anInt2460;
   }

   public void applyTransform(AnimationSkeletonSet animSet, int frame) {
      if(this.anIntArrayArray2439 != null) {
         if(frame != -1) {
            AnimationSkeleton animation = animSet.animations[frame];
            AnimationSkin skins = animation.skin;
            vertexXModifier = 0;
            vertexYModifier = 0;
            vertexZModifier = 0;

            for(int step = 0; step < animation.stepCount; ++step) {
               int opcode = animation.opCodeTable[step];
               this.transformStep(skins.transformationTypes[opcode], skins.skinList[opcode], animation.translator_x[step], animation.translator_y[step], animation.translator_z[step]);
            }

            this.anInt2466 = 0;
         }
      }
   }

   public void method2859(AnimationSkeletonSet var1, int var2, AnimationSkeletonSet var3, int var4, int[] var5) {
      if(var2 != -1) {
         if(var5 != null && var4 != -1) {
            AnimationSkeleton var6 = var1.animations[var2];
            AnimationSkeleton var10 = var3.animations[var4];
            AnimationSkin var7 = var6.skin;
            vertexXModifier = 0;
            vertexYModifier = 0;
            vertexZModifier = 0;
            byte var11 = 0;
            int var13 = var11 + 1;
            int var9 = var5[var11];

            int var8;
            int var12;
            for(var12 = 0; var12 < var6.stepCount; ++var12) {
               for(var8 = var6.opCodeTable[var12]; var8 > var9; var9 = var5[var13++]) {
                  ;
               }

               if(var8 != var9 || var7.transformationTypes[var8] == 0) {
                  this.transformStep(var7.transformationTypes[var8], var7.skinList[var8], var6.translator_x[var12], var6.translator_y[var12], var6.translator_z[var12]);
               }
            }

            vertexXModifier = 0;
            vertexYModifier = 0;
            vertexZModifier = 0;
            var11 = 0;
            var13 = var11 + 1;
            var9 = var5[var11];

            for(var12 = 0; var12 < var10.stepCount; ++var12) {
               for(var8 = var10.opCodeTable[var12]; var8 > var9; var9 = var5[var13++]) {
                  ;
               }

               if(var8 == var9 || var7.transformationTypes[var8] == 0) {
                  this.transformStep(var7.transformationTypes[var8], var7.skinList[var8], var10.translator_x[var12], var10.translator_y[var12], var10.translator_z[var12]);
               }
            }

            this.anInt2466 = 0;
         } else {
            this.applyTransform(var1, var2);
         }
      }
   }

   void transformStep(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var8;
      int var10;
      int var11;
      int var12;
      if(var1 == 0) {
         var8 = 0;
         vertexXModifier = 0;
         vertexYModifier = 0;
         vertexZModifier = 0;

         for(var11 = 0; var11 < var6; ++var11) {
            int var19 = var2[var11];
            if(var19 < this.anIntArrayArray2439.length) {
               int[] var18 = this.anIntArrayArray2439[var19];

               for(var10 = 0; var10 < var18.length; ++var10) {
                  var12 = var18[var10];
                  vertexXModifier += this.vertexXCoordinate[var12];
                  vertexYModifier += this.vertexYCoordinate[var12];
                  vertexZModifier += this.vertexZCoordinate[var12];
                  ++var8;
               }
            }
         }

         if(var8 > 0) {
            vertexXModifier = vertexXModifier / var8 + var3;
            vertexYModifier = vertexYModifier / var8 + var4;
            vertexZModifier = vertexZModifier / var8 + var5;
         } else {
            vertexXModifier = var3;
            vertexYModifier = var4;
            vertexZModifier = var5;
         }
      } else {
         int var7;
         int[] var9;
         if(var1 == 1) {
            for(var8 = 0; var8 < var6; ++var8) {
               var11 = var2[var8];
               if(var11 < this.anIntArrayArray2439.length) {
                  var9 = this.anIntArrayArray2439[var11];

                  for(var7 = 0; var7 < var9.length; ++var7) {
                     var10 = var9[var7];
                     this.vertexXCoordinate[var10] += var3;
                     this.vertexYCoordinate[var10] += var4;
                     this.vertexZCoordinate[var10] += var5;
                  }
               }
            }

         } else if(var1 == 2) {
            for(var8 = 0; var8 < var6; ++var8) {
               var11 = var2[var8];
               if(var11 < this.anIntArrayArray2439.length) {
                  var9 = this.anIntArrayArray2439[var11];

                  for(var7 = 0; var7 < var9.length; ++var7) {
                     var10 = var9[var7];
                     this.vertexXCoordinate[var10] -= vertexXModifier;
                     this.vertexYCoordinate[var10] -= vertexYModifier;
                     this.vertexZCoordinate[var10] -= vertexZModifier;
                     var12 = (var3 & 255) * 8;
                     int var16 = (var4 & 255) * 8;
                     int var13 = (var5 & 255) * 8;
                     int var14;
                     int var15;
                     int var17;
                     if(var13 != 0) {
                        var14 = SINE[var13];
                        var15 = COSINE[var13];
                        var17 = this.vertexYCoordinate[var10] * var14 + this.vertexXCoordinate[var10] * var15 >> 16;
                        this.vertexYCoordinate[var10] = this.vertexYCoordinate[var10] * var15 - this.vertexXCoordinate[var10] * var14 >> 16;
                        this.vertexXCoordinate[var10] = var17;
                     }

                     if(var12 != 0) {
                        var14 = SINE[var12];
                        var15 = COSINE[var12];
                        var17 = this.vertexYCoordinate[var10] * var15 - this.vertexZCoordinate[var10] * var14 >> 16;
                        this.vertexZCoordinate[var10] = this.vertexYCoordinate[var10] * var14 + this.vertexZCoordinate[var10] * var15 >> 16;
                        this.vertexYCoordinate[var10] = var17;
                     }

                     if(var16 != 0) {
                        var14 = SINE[var16];
                        var15 = COSINE[var16];
                        var17 = this.vertexZCoordinate[var10] * var14 + this.vertexXCoordinate[var10] * var15 >> 16;
                        this.vertexZCoordinate[var10] = this.vertexZCoordinate[var10] * var15 - this.vertexXCoordinate[var10] * var14 >> 16;
                        this.vertexXCoordinate[var10] = var17;
                     }

                     this.vertexXCoordinate[var10] += vertexXModifier;
                     this.vertexYCoordinate[var10] += vertexYModifier;
                     this.vertexZCoordinate[var10] += vertexZModifier;
                  }
               }
            }

         } else if(var1 == 3) {
            for(var8 = 0; var8 < var6; ++var8) {
               var11 = var2[var8];
               if(var11 < this.anIntArrayArray2439.length) {
                  var9 = this.anIntArrayArray2439[var11];

                  for(var7 = 0; var7 < var9.length; ++var7) {
                     var10 = var9[var7];
                     this.vertexXCoordinate[var10] -= vertexXModifier;
                     this.vertexYCoordinate[var10] -= vertexYModifier;
                     this.vertexZCoordinate[var10] -= vertexZModifier;
                     this.vertexXCoordinate[var10] = this.vertexXCoordinate[var10] * var3 / 128;
                     this.vertexYCoordinate[var10] = this.vertexYCoordinate[var10] * var4 / 128;
                     this.vertexZCoordinate[var10] = this.vertexZCoordinate[var10] * var5 / 128;
                     this.vertexXCoordinate[var10] += vertexXModifier;
                     this.vertexYCoordinate[var10] += vertexYModifier;
                     this.vertexZCoordinate[var10] += vertexZModifier;
                  }
               }
            }

         } else if(var1 == 5) {
            if(this.anIntArrayArray2456 != null) {
               if(this.triangleAlphaValues != null) {
                  for(var8 = 0; var8 < var6; ++var8) {
                     var11 = var2[var8];
                     if(var11 < this.anIntArrayArray2456.length) {
                        var9 = this.anIntArrayArray2456[var11];

                        for(var7 = 0; var7 < var9.length; ++var7) {
                           var10 = var9[var7];
                           var12 = (this.triangleAlphaValues[var10] & 255) + var3 * 8;
                           if(var12 < 0) {
                              var12 = 0;
                           } else if(var12 > 255) {
                              var12 = 255;
                           }

                           this.triangleAlphaValues[var10] = (byte)var12;
                        }
                     }
                  }

               }
            }
         }
      }
   }

   public void method2862() {
      for(int var1 = 0; var1 < this.vertexCoordinateCount; ++var1) {
         this.vertexXCoordinate[var1] = -this.vertexXCoordinate[var1];
         this.vertexZCoordinate[var1] = -this.vertexZCoordinate[var1];
      }

      this.anInt2466 = 0;
   }

   public void method2863() {
      for(int var1 = 0; var1 < this.vertexCoordinateCount; ++var1) {
         int var2 = this.vertexZCoordinate[var1];
         this.vertexZCoordinate[var1] = this.vertexXCoordinate[var1];
         this.vertexXCoordinate[var1] = -var2;
      }

      this.anInt2466 = 0;
   }

   public void rotateX(int var1) {
      int var2 = SINE[var1];
      int var4 = COSINE[var1];

      for(int var3 = 0; var3 < this.vertexCoordinateCount; ++var3) {
         int var5 = this.vertexYCoordinate[var3] * var4 - this.vertexZCoordinate[var3] * var2 >> 16;
         this.vertexZCoordinate[var3] = this.vertexYCoordinate[var3] * var2 + this.vertexZCoordinate[var3] * var4 >> 16;
         this.vertexYCoordinate[var3] = var5;
      }

      this.anInt2466 = 0;
   }

   public void method2865(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.vertexCoordinateCount; ++var4) {
         this.vertexXCoordinate[var4] += var1;
         this.vertexYCoordinate[var4] += var2;
         this.vertexZCoordinate[var4] += var3;
      }

      this.anInt2466 = 0;
   }

   public void method2866(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.vertexCoordinateCount; ++var4) {
         this.vertexXCoordinate[var4] = this.vertexXCoordinate[var4] * var1 / 128;
         this.vertexYCoordinate[var4] = this.vertexYCoordinate[var4] * var2 / 128;
         this.vertexZCoordinate[var4] = this.vertexZCoordinate[var4] * var3 / 128;
      }

      this.anInt2466 = 0;
   }

   final void method2867(int var1) {
      int var2 = Rasterizer3D.centerX;
      int var19 = Rasterizer3D.centerY;
      int var3 = 0;
      int var4 = this.anIntArray2440[var1];
      int var5 = this.anIntArray2441[var1];
      int var6 = this.anIntArray2442[var1];
      int var16 = cameraVertexZ[var4];
      int var17 = cameraVertexZ[var5]; 
      int var18 = cameraVertexZ[var6];
      if(this.triangleAlphaValues == null) {
         Rasterizer3D.alpha = 0;
      } else {
         Rasterizer3D.alpha = this.triangleAlphaValues[var1] & 255;
      }

      int var7;
      int var10;
      int var11;
      int var12;
      if(var16 >= 50) {
         anIntArray2480[var3] = projectedVertexX[var4];
         anIntArray2431[var3] = projectedVertexY[var4];
         anIntArray2482[var3++] = this.anIntArray2445[var1];
      } else {
         var10 = cameraVertexX[var4];
         var11 = cameraVertexY[var4];
         var12 = this.anIntArray2445[var1];
         if(var18 >= 50) {
            var7 = (50 - var16) * anIntArray2494[var18 - var16];
            anIntArray2480[var3] = var2 + (var10 + ((cameraVertexX[var6] - var10) * var7 >> 16) << 9) / 50;
            anIntArray2431[var3] = var19 + (var11 + ((cameraVertexY[var6] - var11) * var7 >> 16) << 9) / 50;
            anIntArray2482[var3++] = var12 + ((this.anIntArray2489[var1] - var12) * var7 >> 16);
         }

         if(var17 >= 50) {
            var7 = (50 - var16) * anIntArray2494[var17 - var16];
            anIntArray2480[var3] = var2 + (var10 + ((cameraVertexX[var5] - var10) * var7 >> 16) << 9) / 50;
            anIntArray2431[var3] = var19 + (var11 + ((cameraVertexY[var5] - var11) * var7 >> 16) << 9) / 50;
            anIntArray2482[var3++] = var12 + ((this.anIntArray2444[var1] - var12) * var7 >> 16);
         }
      }

      if(var17 >= 50) {
         anIntArray2480[var3] = projectedVertexX[var5];
         anIntArray2431[var3] = projectedVertexY[var5];
         anIntArray2482[var3++] = this.anIntArray2444[var1];
      } else {
         var10 = cameraVertexX[var5];
         var11 = cameraVertexY[var5];
         var12 = this.anIntArray2444[var1];
         if(var16 >= 50) {
            var7 = (50 - var17) * anIntArray2494[var16 - var17];
            anIntArray2480[var3] = var2 + (var10 + ((cameraVertexX[var4] - var10) * var7 >> 16) << 9) / 50;
            anIntArray2431[var3] = var19 + (var11 + ((cameraVertexY[var4] - var11) * var7 >> 16) << 9) / 50;
            anIntArray2482[var3++] = var12 + ((this.anIntArray2445[var1] - var12) * var7 >> 16);
         }

         if(var18 >= 50) {
            var7 = (50 - var17) * anIntArray2494[var18 - var17];
            anIntArray2480[var3] = var2 + (var10 + ((cameraVertexX[var6] - var10) * var7 >> 16) << 9) / 50;
            anIntArray2431[var3] = var19 + (var11 + ((cameraVertexY[var6] - var11) * var7 >> 16) << 9) / 50;
            anIntArray2482[var3++] = var12 + ((this.anIntArray2489[var1] - var12) * var7 >> 16);
         }
      }

      if(var18 >= 50) {
         anIntArray2480[var3] = projectedVertexX[var6];
         anIntArray2431[var3] = projectedVertexY[var6];
         anIntArray2482[var3++] = this.anIntArray2489[var1];
      } else {
         var10 = cameraVertexX[var6];
         var11 = cameraVertexY[var6];
         var12 = this.anIntArray2489[var1];
         if(var17 >= 50) {
            var7 = (50 - var18) * anIntArray2494[var17 - var18];
            anIntArray2480[var3] = var2 + (var10 + ((cameraVertexX[var5] - var10) * var7 >> 16) << 9) / 50;
            anIntArray2431[var3] = var19 + (var11 + ((cameraVertexY[var5] - var11) * var7 >> 16) << 9) / 50;
            anIntArray2482[var3++] = var12 + ((this.anIntArray2444[var1] - var12) * var7 >> 16);
         }

         if(var16 >= 50) {
            var7 = (50 - var18) * anIntArray2494[var16 - var18];
            anIntArray2480[var3] = var2 + (var10 + ((cameraVertexX[var4] - var10) * var7 >> 16) << 9) / 50;
            anIntArray2431[var3] = var19 + (var11 + ((cameraVertexY[var4] - var11) * var7 >> 16) << 9) / 50;
            anIntArray2482[var3++] = var12 + ((this.anIntArray2445[var1] - var12) * var7 >> 16);
         }
      }

      var10 = anIntArray2480[0];
      var11 = anIntArray2480[1];
      var12 = anIntArray2480[2];
      var7 = anIntArray2431[0];
      int var8 = anIntArray2431[1];
      int var9 = anIntArray2431[2];
      Rasterizer3D.restrictEdges = false;
      int var13;
      int var14;
      int var15;
      int var20;
      if(var3 == 3) {
         if(var10 < 0 || var11 < 0 || var12 < 0 || var10 > Rasterizer3D.anInt2502 || var11 > Rasterizer3D.anInt2502 || var12 > Rasterizer3D.anInt2502) {
            Rasterizer3D.restrictEdges = true;
         }

         if(this.aShortArray2481 != null && this.aShortArray2481[var1] != -1) {
            if(this.aByteArray2451 != null && this.aByteArray2451[var1] != -1) {
               var20 = this.aByteArray2451[var1] & 255;
               var13 = this.anIntArray2462[var20];
               var14 = this.anIntArray2453[var20];
               var15 = this.anIntArray2454[var20];
            } else {
               var13 = var4;
               var14 = var5;
               var15 = var6;
            }

            if(this.anIntArray2489[var1] == -1) {
               Rasterizer3D.drawTexturedTriangle(var7, var8, var9, var10, var11, var12, this.anIntArray2445[var1], this.anIntArray2445[var1], this.anIntArray2445[var1], cameraVertexX[var13], cameraVertexX[var14], cameraVertexX[var15], cameraVertexY[var13], cameraVertexY[var14], cameraVertexY[var15], cameraVertexZ[var13], cameraVertexZ[var14], cameraVertexZ[var15], this.aShortArray2481[var1]);
            } else {
               Rasterizer3D.drawTexturedTriangle(var7, var8, var9, var10, var11, var12, anIntArray2482[0], anIntArray2482[1], anIntArray2482[2], cameraVertexX[var13], cameraVertexX[var14], cameraVertexX[var15], cameraVertexY[var13], cameraVertexY[var14], cameraVertexY[var15], cameraVertexZ[var13], cameraVertexZ[var14], cameraVertexZ[var15], this.aShortArray2481[var1]);
            }
         } else if(this.anIntArray2489[var1] == -1) {
            Rasterizer3D.drawFlatTriangle(var7, var8, var9, var10, var11, var12, anIntArray2473[this.anIntArray2445[var1]]);
         } else {
            Rasterizer3D.method2932(var7, var8, var9, var10, var11, var12, anIntArray2482[0], anIntArray2482[1], anIntArray2482[2]);
         }
      }

      if(var3 == 4) {
         if(var10 < 0 || var11 < 0 || var12 < 0 || var10 > Rasterizer3D.anInt2502 || var11 > Rasterizer3D.anInt2502 || var12 > Rasterizer3D.anInt2502 || anIntArray2480[3] < 0 || anIntArray2480[3] > Rasterizer3D.anInt2502) {
            Rasterizer3D.restrictEdges = true;
         }

         if(this.aShortArray2481 != null && this.aShortArray2481[var1] != -1) {
            if(this.aByteArray2451 != null && this.aByteArray2451[var1] != -1) {
               var20 = this.aByteArray2451[var1] & 255;
               var13 = this.anIntArray2462[var20];
               var14 = this.anIntArray2453[var20];
               var15 = this.anIntArray2454[var20];
            } else {
               var13 = var4;
               var14 = var5;
               var15 = var6;
            }

            short var21 = this.aShortArray2481[var1];
            if(this.anIntArray2489[var1] == -1) {
               Rasterizer3D.drawTexturedTriangle(var7, var8, var9, var10, var11, var12, this.anIntArray2445[var1], this.anIntArray2445[var1], this.anIntArray2445[var1], cameraVertexX[var13], cameraVertexX[var14], cameraVertexX[var15], cameraVertexY[var13], cameraVertexY[var14], cameraVertexY[var15], cameraVertexZ[var13], cameraVertexZ[var14], cameraVertexZ[var15], var21);
               Rasterizer3D.drawTexturedTriangle(var7, var9, anIntArray2431[3], var10, var12, anIntArray2480[3], this.anIntArray2445[var1], this.anIntArray2445[var1], this.anIntArray2445[var1], cameraVertexX[var13], cameraVertexX[var14], cameraVertexX[var15], cameraVertexY[var13], cameraVertexY[var14], cameraVertexY[var15], cameraVertexZ[var13], cameraVertexZ[var14], cameraVertexZ[var15], var21);
            } else {
               Rasterizer3D.drawTexturedTriangle(var7, var8, var9, var10, var11, var12, anIntArray2482[0], anIntArray2482[1], anIntArray2482[2], cameraVertexX[var13], cameraVertexX[var14], cameraVertexX[var15], cameraVertexY[var13], cameraVertexY[var14], cameraVertexY[var15], cameraVertexZ[var13], cameraVertexZ[var14], cameraVertexZ[var15], var21);
               Rasterizer3D.drawTexturedTriangle(var7, var9, anIntArray2431[3], var10, var12, anIntArray2480[3], anIntArray2482[0], anIntArray2482[2], anIntArray2482[3], cameraVertexX[var13], cameraVertexX[var14], cameraVertexX[var15], cameraVertexY[var13], cameraVertexY[var14], cameraVertexY[var15], cameraVertexZ[var13], cameraVertexZ[var14], cameraVertexZ[var15], var21);
            }
         } else if(this.anIntArray2489[var1] == -1) {
            var13 = anIntArray2473[this.anIntArray2445[var1]];
            Rasterizer3D.drawFlatTriangle(var7, var8, var9, var10, var11, var12, var13);
            Rasterizer3D.drawFlatTriangle(var7, var9, anIntArray2431[3], var10, var12, anIntArray2480[3], var13);
         } else {
            Rasterizer3D.method2932(var7, var8, var9, var10, var11, var12, anIntArray2482[0], anIntArray2482[1], anIntArray2482[2]);
            Rasterizer3D.method2932(var7, var9, anIntArray2431[3], var10, var12, anIntArray2480[3], anIntArray2482[0], anIntArray2482[2], anIntArray2482[3]);
         }
      }
   }

   public final void renderSingle(int var1, int var2, int var3, int var4, int var5, int zoomSine, int zoomCosine, int var8) {
      anIntArray2474[0] = -1;
      if(this.anInt2466 != 2 && this.anInt2466 != 1) {
         this.method2856();
      }

      int baseDrawX = Rasterizer3D.centerX;
      int baseDrawY = Rasterizer3D.centerY;
      int var11 = SINE[var1];
      int var12 = COSINE[var1];
      int var13 = SINE[var2];
      int var14 = COSINE[var2];
      int var15 = SINE[var3];
      int var16 = COSINE[var3];
      int rotSine_1 = SINE[var4];
      int rotCosine_1 = COSINE[var4];
      int zoom = zoomSine * rotSine_1 + zoomCosine * rotCosine_1 >> 16;

      for(int vertex = 0; vertex < this.vertexCoordinateCount; ++vertex) {
         int baseVertexX = this.vertexXCoordinate[vertex];
         int baseVertexY = this.vertexYCoordinate[vertex];
         int baseVertexZ = this.vertexZCoordinate[vertex];
         int calculatedVertex;
         if(var3 != 0) {
            calculatedVertex = baseVertexY * var15 + baseVertexX * var16 >> 16;
            baseVertexY = baseVertexY * var16 - baseVertexX * var15 >> 16;
            baseVertexX = calculatedVertex;
         }

         if(var1 != 0) {
            calculatedVertex = baseVertexY * var12 - baseVertexZ * var11 >> 16;
            baseVertexZ = baseVertexY * var11 + baseVertexZ * var12 >> 16;
            baseVertexY = calculatedVertex;
         }

         if(var2 != 0) {
            calculatedVertex = baseVertexZ * var13 + baseVertexX * var14 >> 16;
            baseVertexZ = baseVertexZ * var14 - baseVertexX * var13 >> 16;
            baseVertexX = calculatedVertex;
         }

         baseVertexX += var5;
         baseVertexY += zoomSine;
         baseVertexZ += zoomCosine;
         calculatedVertex = baseVertexY * rotCosine_1 - baseVertexZ * rotSine_1 >> 16;
         baseVertexZ = baseVertexY * rotSine_1 + baseVertexZ * rotCosine_1 >> 16;
         projectedVertexZ[vertex] = baseVertexZ - zoom;
         projectedVertexX[vertex] = baseDrawX + (baseVertexX << 9) / var8;
         projectedVertexY[vertex] = baseDrawY + (calculatedVertex << 9) / var8;
         if(this.anInt2434 > 0) {
            cameraVertexX[vertex] = baseVertexX;
            cameraVertexY[vertex] = calculatedVertex;
            cameraVertexZ[vertex] = baseVertexZ;
         }
      }

      try {
         this.translateToScreen(false, false, 0);
      } catch (Exception var25) {
         ;
      }
   }

   final void translateToScreen(boolean var1, boolean var2, int var3) {
      if(this.anInt2461 < 1600) {
         int var5;
         for(var5 = 0; var5 < this.anInt2461; ++var5) {
            anIntArray2474[var5] = 0;
         }

         int var4;
         int var7;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var19;
         for(var5 = 0; var5 < this.anInt2458; ++var5) {
            if(this.anIntArray2489[var5] != -2) {
               var14 = this.anIntArray2440[var5];
               var13 = this.anIntArray2441[var5];
               var15 = this.anIntArray2442[var5];
               var12 = projectedVertexX[var14];
               var11 = projectedVertexX[var13];
               var4 = projectedVertexX[var15];
               int var8;
               if(var1 && (var12 == -5000 || var11 == -5000 || var4 == -5000)) {
                  var8 = cameraVertexX[var14];
                  var16 = cameraVertexX[var13];
                  var7 = cameraVertexX[var15];
                  int var18 = cameraVertexY[var14];
                  var19 = cameraVertexY[var13];
                  int var20 = cameraVertexY[var15];
                  int var6 = cameraVertexZ[var14];
                  int var17 = cameraVertexZ[var13];
                  int var9 = cameraVertexZ[var15];
                  var8 -= var16;
                  var7 -= var16;
                  var18 -= var19;
                  var20 -= var19;
                  var6 -= var17;
                  var9 -= var17;
                  int var21 = var18 * var9 - var6 * var20;
                  int var10 = var6 * var7 - var8 * var9;
                  int var22 = var8 * var20 - var18 * var7;
                  if(var16 * var21 + var19 * var10 + var17 * var22 > 0) {
                     aBoolArray2465[var5] = true;
                     int var23 = (projectedVertexZ[var14] + projectedVertexZ[var13] + projectedVertexZ[var15]) / 3 + this.anInt2436;
                     anIntArrayArray2443[var23][anIntArray2474[var23]++] = var5;
                  }
               } else {
                  if(var2 && this.method2873(anInt2487, anInt2488, projectedVertexY[var14], projectedVertexY[var13], projectedVertexY[var15], var12, var11, var4)) {
                     anIntArray2495[anInt2490++] = var3;
                     var2 = false;
                  }

                  if((var12 - var11) * (projectedVertexY[var15] - projectedVertexY[var13]) - (projectedVertexY[var14] - projectedVertexY[var13]) * (var4 - var11) > 0) {
                     aBoolArray2465[var5] = false;
                     if(var12 >= 0 && var11 >= 0 && var4 >= 0 && var12 <= Rasterizer3D.anInt2502 && var11 <= Rasterizer3D.anInt2502 && var4 <= Rasterizer3D.anInt2502) {
                        aBoolArray2464[var5] = false;
                     } else {
                        aBoolArray2464[var5] = true;
                     }

                     var8 = (projectedVertexZ[var14] + projectedVertexZ[var13] + projectedVertexZ[var15]) / 3 + this.anInt2436;
                     anIntArrayArray2443[var8][anIntArray2474[var8]++] = var5;
                  }
               }
            }
         }

         int[] var27;
         if(this.aByteArray2446 == null) {
            for(var5 = this.anInt2461 - 1; var5 >= 0; --var5) {
               var14 = anIntArray2474[var5];
               if(var14 > 0) {
                  var27 = anIntArrayArray2443[var5];

                  for(var15 = 0; var15 < var14; ++var15) {
                     this.method2903(var27[var15]);
                  }
               }
            }

         } else {
            for(var5 = 0; var5 < 12; ++var5) {
               anIntArray2475[var5] = 0;
               anIntArray2479[var5] = 0;
            }

            for(var5 = this.anInt2461 - 1; var5 >= 0; --var5) {
               var14 = anIntArray2474[var5];
               if(var14 > 0) {
                  var27 = anIntArrayArray2443[var5];

                  for(var15 = 0; var15 < var14; ++var15) {
                     var12 = var27[var15];
                     byte var26 = this.aByteArray2446[var12];
                     var4 = anIntArray2475[var26]++;
                     anIntArrayArray2476[var26][var4] = var12;
                     if(var26 < 10) {
                        anIntArray2479[var26] += var5;
                     } else if(var26 == 10) {
                        anIntArray2449[var4] = var5;
                     } else {
                        anIntArray2478[var4] = var5;
                     }
                  }
               }
            }

            var5 = 0;
            if(anIntArray2475[1] > 0 || anIntArray2475[2] > 0) {
               var5 = (anIntArray2479[1] + anIntArray2479[2]) / (anIntArray2475[1] + anIntArray2475[2]);
            }

            var14 = 0;
            if(anIntArray2475[3] > 0 || anIntArray2475[4] > 0) {
               var14 = (anIntArray2479[3] + anIntArray2479[4]) / (anIntArray2475[3] + anIntArray2475[4]);
            }

            var13 = 0;
            if(anIntArray2475[6] > 0 || anIntArray2475[8] > 0) {
               var13 = (anIntArray2479[6] + anIntArray2479[8]) / (anIntArray2475[6] + anIntArray2475[8]);
            }

            var12 = 0;
            var11 = anIntArray2475[10];
            int[] var24 = anIntArrayArray2476[10];
            int[] var25 = anIntArray2449;
            if(var12 == var11) {
               var12 = 0;
               var11 = anIntArray2475[11];
               var24 = anIntArrayArray2476[11];
               var25 = anIntArray2478;
            }

            if(var12 < var11) {
               var15 = var25[var12];
            } else {
               var15 = -1000;
            }

            for(var16 = 0; var16 < 10; ++var16) {
               while(var16 == 0 && var15 > var5) {
                  this.method2903(var24[var12++]);
                  if(var12 == var11 && var24 != anIntArrayArray2476[11]) {
                     var12 = 0;
                     var11 = anIntArray2475[11];
                     var24 = anIntArrayArray2476[11];
                     var25 = anIntArray2478;
                  }

                  if(var12 < var11) {
                     var15 = var25[var12];
                  } else {
                     var15 = -1000;
                  }
               }

               while(var16 == 3 && var15 > var14) {
                  this.method2903(var24[var12++]);
                  if(var12 == var11 && var24 != anIntArrayArray2476[11]) {
                     var12 = 0;
                     var11 = anIntArray2475[11];
                     var24 = anIntArrayArray2476[11];
                     var25 = anIntArray2478;
                  }

                  if(var12 < var11) {
                     var15 = var25[var12];
                  } else {
                     var15 = -1000;
                  }
               }

               while(var16 == 5 && var15 > var13) {
                  this.method2903(var24[var12++]);
                  if(var12 == var11 && var24 != anIntArrayArray2476[11]) {
                     var12 = 0;
                     var11 = anIntArray2475[11];
                     var24 = anIntArrayArray2476[11];
                     var25 = anIntArray2478;
                  }

                  if(var12 < var11) {
                     var15 = var25[var12];
                  } else {
                     var15 = -1000;
                  }
               }

               var7 = anIntArray2475[var16];
               int[] var28 = anIntArrayArray2476[var16];

               for(var19 = 0; var19 < var7; ++var19) {
                  this.method2903(var28[var19]);
               }
            }

            while(var15 != -1000) {
               this.method2903(var24[var12++]);
               if(var12 == var11 && var24 != anIntArrayArray2476[11]) {
                  var12 = 0;
                  var24 = anIntArrayArray2476[11];
                  var11 = anIntArray2475[11];
                  var25 = anIntArray2478;
               }

               if(var12 < var11) {
                  var15 = var25[var12];
               } else {
                  var15 = -1000;
               }
            }

         }
      }
   }

   final boolean method2873(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return var2 < var3 && var2 < var4 && var2 < var5?false:(var2 > var3 && var2 > var4 && var2 > var5?false:(var1 < var6 && var1 < var7 && var1 < var8?false:var1 <= var6 || var1 <= var7 || var1 <= var8));
   }

   public ModelRasterizer(ModelRasterizer[] var1, int var2) {
      boolean var4 = false;
      boolean var3 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.vertexCoordinateCount = 0;
      this.anInt2458 = 0;
      this.anInt2434 = 0;
      this.aByte2450 = -1;

      ModelRasterizer var7;
      int var9;
      for(var9 = 0; var9 < var2; ++var9) {
         var7 = var1[var9];
         if(var7 != null) {
            this.vertexCoordinateCount += var7.vertexCoordinateCount;
            this.anInt2458 += var7.anInt2458;
            this.anInt2434 += var7.anInt2434;
            if(var7.aByteArray2446 != null) {
               var4 = true;
            } else {
               if(this.aByte2450 == -1) {
                  this.aByte2450 = var7.aByte2450;
               }

               if(this.aByte2450 != var7.aByte2450) {
                  var4 = true;
               }
            }

            var3 |= var7.triangleAlphaValues != null;
            var5 |= var7.aShortArray2481 != null;
            var6 |= var7.aByteArray2451 != null;
         }
      }

      this.vertexXCoordinate = new int[this.vertexCoordinateCount];
      this.vertexYCoordinate = new int[this.vertexCoordinateCount];
      this.vertexZCoordinate = new int[this.vertexCoordinateCount];
      this.anIntArray2440 = new int[this.anInt2458];
      this.anIntArray2441 = new int[this.anInt2458];
      this.anIntArray2442 = new int[this.anInt2458];
      this.anIntArray2445 = new int[this.anInt2458];
      this.anIntArray2444 = new int[this.anInt2458];
      this.anIntArray2489 = new int[this.anInt2458];
      if(var4) {
         this.aByteArray2446 = new byte[this.anInt2458];
      }

      if(var3) {
         this.triangleAlphaValues = new byte[this.anInt2458];
      }

      if(var5) {
         this.aShortArray2481 = new short[this.anInt2458];
      }

      if(var6) {
         this.aByteArray2451 = new byte[this.anInt2458];
      }

      if(this.anInt2434 > 0) {
         this.anIntArray2462 = new int[this.anInt2434];
         this.anIntArray2453 = new int[this.anInt2434];
         this.anIntArray2454 = new int[this.anInt2434];
      }

      this.vertexCoordinateCount = 0;
      this.anInt2458 = 0;
      this.anInt2434 = 0;

      for(var9 = 0; var9 < var2; ++var9) {
         var7 = var1[var9];
         if(var7 != null) {
            int var8;
            for(var8 = 0; var8 < var7.anInt2458; ++var8) {
               this.anIntArray2440[this.anInt2458] = var7.anIntArray2440[var8] + this.vertexCoordinateCount;
               this.anIntArray2441[this.anInt2458] = var7.anIntArray2441[var8] + this.vertexCoordinateCount;
               this.anIntArray2442[this.anInt2458] = var7.anIntArray2442[var8] + this.vertexCoordinateCount;
               this.anIntArray2445[this.anInt2458] = var7.anIntArray2445[var8];
               this.anIntArray2444[this.anInt2458] = var7.anIntArray2444[var8];
               this.anIntArray2489[this.anInt2458] = var7.anIntArray2489[var8];
               if(var4) {
                  if(var7.aByteArray2446 != null) {
                     this.aByteArray2446[this.anInt2458] = var7.aByteArray2446[var8];
                  } else {
                     this.aByteArray2446[this.anInt2458] = var7.aByte2450;
                  }
               }

               if(var3 && var7.triangleAlphaValues != null) {
                  this.triangleAlphaValues[this.anInt2458] = var7.triangleAlphaValues[var8];
               }

               if(var5) {
                  if(var7.aShortArray2481 != null) {
                     this.aShortArray2481[this.anInt2458] = var7.aShortArray2481[var8];
                  } else {
                     this.aShortArray2481[this.anInt2458] = -1;
                  }
               }

               if(var6) {
                  if(var7.aByteArray2451 != null && var7.aByteArray2451[var8] != -1) {
                     this.aByteArray2451[this.anInt2458] = (byte)(var7.aByteArray2451[var8] + this.anInt2434);
                  } else {
                     this.aByteArray2451[this.anInt2458] = -1;
                  }
               }

               ++this.anInt2458;
            }

            for(var8 = 0; var8 < var7.anInt2434; ++var8) {
               this.anIntArray2462[this.anInt2434] = var7.anIntArray2462[var8] + this.vertexCoordinateCount;
               this.anIntArray2453[this.anInt2434] = var7.anIntArray2453[var8] + this.vertexCoordinateCount;
               this.anIntArray2454[this.anInt2434] = var7.anIntArray2454[var8] + this.vertexCoordinateCount;
               ++this.anInt2434;
            }

            for(var8 = 0; var8 < var7.vertexCoordinateCount; ++var8) {
               this.vertexXCoordinate[this.vertexCoordinateCount] = var7.vertexXCoordinate[var8];
               this.vertexYCoordinate[this.vertexCoordinateCount] = var7.vertexYCoordinate[var8];
               this.vertexZCoordinate[this.vertexCoordinateCount] = var7.vertexZCoordinate[var8];
               ++this.vertexCoordinateCount;
            }
         }
      }

   }

   public ModelRasterizer method2890(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method2855();
      int var17 = var2 - this.anInt2460;
      int var8 = var2 + this.anInt2460;
      int var7 = var4 - this.anInt2460;
      int var16 = var4 + this.anInt2460;
      if(var17 >= 0 && var8 + 128 >> 7 < var1.length && var7 >= 0 && var16 + 128 >> 7 < var1[0].length) {
         var17 >>= 7;
         var8 = var8 + 127 >> 7;
         var7 >>= 7;
         var16 = var16 + 127 >> 7;
         if(var1[var17][var7] == var3 && var1[var8][var7] == var3 && var1[var17][var16] == var3 && var1[var8][var16] == var3) {
            return this;
         } else {
            ModelRasterizer var9;
            if(var5) {
               var9 = new ModelRasterizer();
               var9.vertexCoordinateCount = this.vertexCoordinateCount;
               var9.anInt2458 = this.anInt2458;
               var9.anInt2434 = this.anInt2434;
               var9.vertexXCoordinate = this.vertexXCoordinate;
               var9.vertexZCoordinate = this.vertexZCoordinate;
               var9.anIntArray2440 = this.anIntArray2440;
               var9.anIntArray2441 = this.anIntArray2441;
               var9.anIntArray2442 = this.anIntArray2442;
               var9.anIntArray2445 = this.anIntArray2445;
               var9.anIntArray2444 = this.anIntArray2444;
               var9.anIntArray2489 = this.anIntArray2489;
               var9.aByteArray2446 = this.aByteArray2446;
               var9.triangleAlphaValues = this.triangleAlphaValues;
               var9.aByteArray2451 = this.aByteArray2451;
               var9.aShortArray2481 = this.aShortArray2481;
               var9.aByte2450 = this.aByte2450;
               var9.anIntArray2462 = this.anIntArray2462;
               var9.anIntArray2453 = this.anIntArray2453;
               var9.anIntArray2454 = this.anIntArray2454;
               var9.anIntArrayArray2439 = this.anIntArrayArray2439;
               var9.anIntArrayArray2456 = this.anIntArrayArray2456;
               var9.aBool2457 = this.aBool2457;
               var9.vertexYCoordinate = new int[var9.vertexCoordinateCount];
            } else {
               var9 = this;
            }

            int var10;
            int var11;
            int var12;
            int var13;
            int var14;
            int var15;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var19 = 0; var19 < var9.vertexCoordinateCount; ++var19) {
                  var20 = this.vertexXCoordinate[var19] + var2;
                  var18 = this.vertexZCoordinate[var19] + var4;
                  var12 = var20 & 127;
                  var15 = var18 & 127;
                  var10 = var20 >> 7;
                  var11 = var18 >> 7;
                  var14 = var1[var10][var11] * (128 - var12) + var1[var10 + 1][var11] * var12 >> 7;
                  var13 = var1[var10][var11 + 1] * (128 - var12) + var1[var10 + 1][var11 + 1] * var12 >> 7;
                  var21 = var14 * (128 - var15) + var13 * var15 >> 7;
                  var9.vertexYCoordinate[var19] = this.vertexYCoordinate[var19] + var21 - var3;
               }
            } else {
               for(var19 = 0; var19 < var9.vertexCoordinateCount; ++var19) {
                  var20 = (-this.vertexYCoordinate[var19] << 16) / (this.modelHeight * 782517621);
                  if(var20 < var6) {
                     var18 = this.vertexXCoordinate[var19] + var2;
                     var12 = this.vertexZCoordinate[var19] + var4;
                     var15 = var18 & 127;
                     var10 = var12 & 127;
                     var11 = var18 >> 7;
                     var14 = var12 >> 7;
                     var13 = var1[var11][var14] * (128 - var15) + var1[var11 + 1][var14] * var15 >> 7;
                     var21 = var1[var11][var14 + 1] * (128 - var15) + var1[var11 + 1][var14 + 1] * var15 >> 7;
                     int var22 = var13 * (128 - var10) + var21 * var10 >> 7;
                     var9.vertexYCoordinate[var19] = this.vertexYCoordinate[var19] + (var22 - var3) * (var6 - var20) / var6;
                  }
               }
            }

            var9.anInt2466 = 0;
            return var9;
         }
      } else {
         return this;
      }
   }

   ModelRasterizer() {}

   void renderAtPoint(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      anIntArray2474[0] = -1;
      if(this.anInt2466 != 1) {
         this.method2855();
      }

      int var10 = var8 * var5 - var6 * var4 >> 16;
      int var11 = var7 * var2 + var10 * var3 >> 16;
      int var12 = this.anInt2460 * var3 >> 16;
      int var13 = var11 + var12;
      if(var13 > 50) {
         if(var11 < 3500) {
            int var14 = var8 * var4 + var6 * var5 >> 16;
            int var15 = var14 - this.anInt2460 << 9;
            if(var15 / var13 < Rasterizer3D.anInt2513) {
               int var16 = var14 + this.anInt2460 << 9;
               if(var16 / var13 > Rasterizer3D.anInt2519) {
                  int var17 = var7 * var3 - var10 * var2 >> 16;
                  int var18 = this.anInt2460 * var2 >> 16;
                  int var19 = var17 + var18 << 9;
                  if(var19 / var13 > Rasterizer3D.anInt2514) {
                     int var20 = var18 + (this.modelHeight * 782517621 * var3 >> 16);
                     int var21 = var17 - var20 << 9;
                     if(var21 / var13 < Rasterizer3D.anInt2521) {
                        int var22 = var12 + (this.modelHeight * 782517621 * var2 >> 16);
                        boolean var23 = false;
                        boolean var24 = false;
                        if(var11 - var22 <= 50) {
                           var24 = true;
                        }

                        boolean var25 = var24 || this.anInt2434 > 0;
                        boolean var26 = false;
                        int var27;
                        int var28;
                        int var29;
                        if(var9 > 0 && aBool2486) {
                           var27 = var11 - var12;
                           if(var27 <= 50) {
                              var27 = 50;
                           }

                           if(var14 > 0) {
                              var15 /= var13;
                              var16 /= var27;
                           } else {
                              var16 /= var13;
                              var15 /= var27;
                           }

                           if(var17 > 0) {
                              var21 /= var13;
                              var19 /= var27;
                           } else {
                              var19 /= var13;
                              var21 /= var27;
                           }

                           var28 = anInt2487 - Rasterizer3D.centerX;
                           var29 = anInt2488 - Rasterizer3D.centerY;
                           if(var28 > var15 && var28 < var16 && var29 > var21 && var29 < var19) {
                              if(this.aBool2457) {
                                 anIntArray2495[anInt2490++] = var9;
                              } else {
                                 var26 = true;
                              }
                           }
                        }

                        var27 = Rasterizer3D.centerX;
                        var28 = Rasterizer3D.centerY;
                        var29 = 0;
                        int var30 = 0;
                        if(var1 != 0) {
                           var29 = SINE[var1];
                           var30 = COSINE[var1];
                        }

                        for(int var31 = 0; var31 < this.vertexCoordinateCount; ++var31) {
                           int var32 = this.vertexXCoordinate[var31];
                           int var33 = this.vertexYCoordinate[var31];
                           int var34 = this.vertexZCoordinate[var31];
                           int var35;
                           if(var1 != 0) {
                              var35 = var34 * var29 + var32 * var30 >> 16;
                              var34 = var34 * var30 - var32 * var29 >> 16;
                              var32 = var35;
                           }

                           var32 += var6;
                           var33 += var7;
                           var34 += var8;
                           var35 = var34 * var4 + var32 * var5 >> 16;
                           var34 = var34 * var5 - var32 * var4 >> 16;
                           var32 = var35;
                           var35 = var33 * var3 - var34 * var2 >> 16;
                           var34 = var33 * var2 + var34 * var3 >> 16;
                           projectedVertexZ[var31] = var34 - var11;
                           if(var34 >= 50) {
                              projectedVertexX[var31] = var27 + (var32 << 9) / var34;
                              projectedVertexY[var31] = var28 + (var35 << 9) / var34;
                           } else {
                              projectedVertexX[var31] = -5000;
                              var23 = true;
                           }

                           if(var25) {
                              cameraVertexX[var31] = var32;
                              cameraVertexY[var31] = var35;
                              cameraVertexZ[var31] = var34;
                           }
                        }

                        try {
                           this.translateToScreen(var23, var26, var9);
                        } catch (Exception var36) {
                           ;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   final void method2903(int var1) {
      if(aBoolArray2465[var1]) {
         this.method2867(var1);
      } else {
         int var2 = this.anIntArray2440[var1];
         int var3 = this.anIntArray2441[var1];
         int var4 = this.anIntArray2442[var1];
         Rasterizer3D.restrictEdges = aBoolArray2464[var1];
         if(this.triangleAlphaValues == null) {
            Rasterizer3D.alpha = 0;
         } else {
            Rasterizer3D.alpha = this.triangleAlphaValues[var1] & 255;
         }

         if(this.aShortArray2481 != null && this.aShortArray2481[var1] != -1) {
            int var5;
            int var6;
            int var7;
            if(this.aByteArray2451 != null && this.aByteArray2451[var1] != -1) {
               int var8 = this.aByteArray2451[var1] & 255;
               var5 = this.anIntArray2462[var8];
               var6 = this.anIntArray2453[var8];
               var7 = this.anIntArray2454[var8];
            } else {
               var5 = var2;
               var6 = var3;
               var7 = var4;
            }

            if(this.anIntArray2489[var1] == -1) {
               Rasterizer3D.drawTexturedTriangle(projectedVertexY[var2], projectedVertexY[var3], projectedVertexY[var4], projectedVertexX[var2], projectedVertexX[var3], projectedVertexX[var4], this.anIntArray2445[var1], this.anIntArray2445[var1], this.anIntArray2445[var1], cameraVertexX[var5], cameraVertexX[var6], cameraVertexX[var7], cameraVertexY[var5], cameraVertexY[var6], cameraVertexY[var7], cameraVertexZ[var5], cameraVertexZ[var6], cameraVertexZ[var7], this.aShortArray2481[var1]);
            } else {
               Rasterizer3D.drawTexturedTriangle(projectedVertexY[var2], projectedVertexY[var3], projectedVertexY[var4], projectedVertexX[var2], projectedVertexX[var3], projectedVertexX[var4], this.anIntArray2445[var1], this.anIntArray2444[var1], this.anIntArray2489[var1], cameraVertexX[var5], cameraVertexX[var6], cameraVertexX[var7], cameraVertexY[var5], cameraVertexY[var6], cameraVertexY[var7], cameraVertexZ[var5], cameraVertexZ[var6], cameraVertexZ[var7], this.aShortArray2481[var1]);
            }
         } else if(this.anIntArray2489[var1] == -1) {
            Rasterizer3D.drawFlatTriangle(projectedVertexY[var2], projectedVertexY[var3], projectedVertexY[var4], projectedVertexX[var2], projectedVertexX[var3], projectedVertexX[var4], anIntArray2473[this.anIntArray2445[var1]]);
         } else {
            Rasterizer3D.method2932(projectedVertexY[var2], projectedVertexY[var3], projectedVertexY[var4], projectedVertexX[var2], projectedVertexX[var3], projectedVertexX[var4], this.anIntArray2445[var1], this.anIntArray2444[var1], this.anIntArray2489[var1]);
         }
      }
   }

   public void rotate90() {
      for(int var1 = 0; var1 < this.vertexCoordinateCount; ++var1) {
         int var2 = this.vertexXCoordinate[var1];
         this.vertexXCoordinate[var1] = this.vertexZCoordinate[var1];
         this.vertexZCoordinate[var1] = -var2;
      }

      this.anInt2466 = 0;
   }

   public ModelRasterizer method2907(boolean var1) {
      if(!var1 && aByteArray2452.length < this.anInt2458) {
         aByteArray2452 = new byte[this.anInt2458 + 100];
      }

      return this.method2854(var1, aClass108_Sub20_Sub14_Sub3_2496, aByteArray2452);
   }

   public final void method2916(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      anIntArray2474[0] = -1;
      if(this.anInt2466 != 2 && this.anInt2466 != 1) {
         this.method2856();
      }

      int var8 = Rasterizer3D.centerX;
      int var9 = Rasterizer3D.centerY;
      int var10 = SINE[var1];
      int var11 = COSINE[var1];
      int var12 = SINE[var2];
      int var13 = COSINE[var2];
      int var14 = SINE[var3];
      int var15 = COSINE[var3];
      int var16 = SINE[var4];
      int var17 = COSINE[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.vertexCoordinateCount; ++var19) {
         int var20 = this.vertexXCoordinate[var19];
         int var21 = this.vertexYCoordinate[var19];
         int var22 = this.vertexZCoordinate[var19];
         int var23;
         if(var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if(var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if(var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         projectedVertexZ[var19] = var22 - var18;
         projectedVertexX[var19] = var8 + (var20 << 9) / var22;
         projectedVertexY[var19] = var9 + (var23 << 9) / var22;
         if(this.anInt2434 > 0) {
            cameraVertexX[var19] = var20;
            cameraVertexY[var19] = var23;
            cameraVertexZ[var19] = var22;
         }
      }

      try {
         this.translateToScreen(false, false, 0);
      } catch (Exception var24) {
         ;
      }
   }
}
