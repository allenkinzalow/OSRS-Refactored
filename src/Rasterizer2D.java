
public class Rasterizer2D extends CacheableNode {

   public static int height;
   public static int width;
   public static int[] renderPixels;
   public static int topY = 0;
   public static int bottomY = 0;
   protected static int bottomX = 0;
   protected static int topX = 0;


   public static void method2495() {
      topX = 0;
      topY = 0;
      bottomX = width;
      bottomY = height;
   }

   static void method2496(int var0, int var1, int var2, int var3, int var4) {
      if(var0 >= topX) {
         if(var0 < bottomX) {
            if(var1 < topY) {
               var2 -= topY - var1;
               var1 = topY;
            }

            if(var1 + var2 > bottomY) {
               var2 = bottomY - var1;
            }

            int var13 = 256 - var4;
            int var5 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var9 = (var3 & 255) * var4;
            int var14 = var0 + var1 * width;

            for(int var12 = 0; var12 < var2; ++var12) {
               int var6 = (renderPixels[var14] >> 16 & 255) * var13;
               int var8 = (renderPixels[var14] >> 8 & 255) * var13;
               int var10 = (renderPixels[var14] & 255) * var13;
               int var11 = (var5 + var6 >> 8 << 16) + (var7 + var8 >> 8 << 8) + (var9 + var10 >> 8);
               renderPixels[var14] = var11;
               var14 += width;
            }

         }
      }
   }

   public static void method2497(int var0, int var1, int var2, int var3) {
      if(topX < var0) {
         topX = var0;
      }

      if(topY < var1) {
         topY = var1;
      }

      if(bottomX > var2) {
         bottomX = var2;
      }

      if(bottomY > var3) {
         bottomY = var3;
      }
   }

   public static void method2498(int[] var0) {
      var0[0] = topX;
      var0[1] = topY;
      var0[2] = bottomX;
      var0[3] = bottomY;
   }

   public static void resetPixels() {
      int var0 = 0;

      int var1;
      for(var1 = width * height - 7; var0 < var1; renderPixels[var0++] = 0) {
         renderPixels[var0++] = 0;
         renderPixels[var0++] = 0;
         renderPixels[var0++] = 0;
         renderPixels[var0++] = 0;
         renderPixels[var0++] = 0;
         renderPixels[var0++] = 0;
         renderPixels[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; renderPixels[var0++] = 0) {
         ;
      }

   }

   public static void setRasterizationRect(int var0, int var1, int var2, int var3) {
      if(var0 < 0) {
         var0 = 0;
      }

      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 > width) {
         var2 = width;
      }

      if(var3 > height) {
         var3 = height;
      }

      topX = var0;
      topY = var1;
      bottomX = var2;
      bottomY = var3;
   }

   public static void method2503(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;
      int var12 = 65536 / var3;
      if(var0 < topX) {
         var2 -= topX - var0;
         var0 = topX;
      }

      if(var1 < topY) {
         var6 += (topY - var1) * var12;
         var3 -= topY - var1;
         var1 = topY;
      }

      if(var0 + var2 > bottomX) {
         var2 = bottomX - var0;
      }

      if(var1 + var3 > bottomY) {
         var3 = bottomY - var1;
      }

      int var8 = width - var2;
      int var9 = var0 + var1 * width;

      for(int var7 = -var3; var7 < 0; ++var7) {
         int var11 = 65536 - var6 >> 8;
         int var13 = var6 >> 8;
         int var14 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var13 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var13 & 16711680) >>> 8;

         for(int var10 = -var2; var10 < 0; ++var10) {
            renderPixels[var9++] = var14;
         }

         var9 += var8;
         var6 += var12;
      }

   }

   public static void drawUnfilledRectangle(int var0, int var1, int var2, int var3, int var4) {
      method2506(var0, var1, var2, var4);
      method2506(var0, var1 + var3 - 1, var2, var4);
      method2508(var0, var1, var3, var4);
      method2508(var0 + var2 - 1, var1, var3, var4);
   }

   public static void method2505(int var0, int var1, int var2, int var3, int var4, int var5) {
      method2531(var0, var1, var2, var4, var5);
      method2531(var0, var1 + var3 - 1, var2, var4, var5);
      if(var3 >= 3) {
         method2496(var0, var1 + 1, var3 - 2, var4, var5);
         method2496(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }
   }

   public static void method2506(int var0, int var1, int var2, int var3) {
      if(var1 >= topY) {
         if(var1 < bottomY) {
            if(var0 < topX) {
               var2 -= topX - var0;
               var0 = topX;
            }

            if(var0 + var2 > bottomX) {
               var2 = bottomX - var0;
            }

            int var5 = var0 + var1 * width;

            for(int var4 = 0; var4 < var2; ++var4) {
               renderPixels[var5 + var4] = var3;
            }

         }
      }
   }

   public static void method2508(int var0, int var1, int var2, int var3) {
      if(var0 >= topX) {
         if(var0 < bottomX) {
            if(var1 < topY) {
               var2 -= topY - var1;
               var1 = topY;
            }

            if(var1 + var2 > bottomY) {
               var2 = bottomY - var1;
            }

            int var4 = var0 + var1 * width;

            for(int var5 = 0; var5 < var2; ++var5) {
               renderPixels[var4 + var5 * width] = var3;
            }

         }
      }
   }

   public static void method2510(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if(var3 == 0) {
         if(var2 >= 0) {
            method2506(var0, var1, var2 + 1, var4);
         } else {
            method2506(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if(var2 == 0) {
         if(var3 >= 0) {
            method2508(var0, var1, var3 + 1, var4);
         } else {
            method2508(var0, var1 + var3, -var3 + 1, var4);
         }
      } else {
         if(var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if(var2 <= var3) {
            var0 <<= 16;
            var0 += '\u8000';
            var2 <<= 16;
            var6 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if(var1 < topY) {
               var0 += var6 * (topY - var1);
               var1 = topY;
            }

            if(var3 >= bottomY) {
               var3 = bottomY - 1;
            }

            while(var1 <= var3) {
               var5 = var0 >> 16;
               if(var5 >= topX && var5 < bottomX) {
                  renderPixels[var5 + var1 * width] = var4;
               }

               var0 += var6;
               ++var1;
            }

         } else {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var6 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if(var0 < topX) {
               var1 += var6 * (topX - var0);
               var0 = topX;
            }

            if(var2 >= bottomX) {
               var2 = bottomX - 1;
            }

            while(var0 <= var2) {
               var5 = var1 >> 16;
               if(var5 >= topY && var5 < bottomY) {
                  renderPixels[var0 + var5 * width] = var4;
               }

               var1 += var6;
               ++var0;
            }

         }
      }
   }

   public static void method2511(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * width;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            renderPixels[var6++] = var2;
         }

         var5 += width;
      }

   }

   public static void copySprite(int[] var0, int var1, int var2) {
      renderPixels = var0;
      width = var1;
      height = var2;
      setRasterizationRect(0, 0, var1, var2);
   }

   public static void method2529(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0 < topX) {
         var2 -= topX - var0;
         var0 = topX;
      }

      if(var1 < topY) {
         var3 -= topY - var1;
         var1 = topY;
      }

      if(var0 + var2 > bottomX) {
         var2 = bottomX - var0;
      }

      if(var1 + var3 > bottomY) {
         var3 = bottomY - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
      int var11 = 256 - var5;
      int var9 = width - var2;
      int var7 = var0 + var1 * width;

      for(int var6 = 0; var6 < var3; ++var6) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var8 = renderPixels[var7];
            var8 = ((var8 & 16711935) * var11 >> 8 & 16711935) + ((var8 & '\uff00') * var11 >> 8 & '\uff00');
            renderPixels[var7++] = var4 + var8;
         }

         var7 += var9;
      }

   }

   static void method2531(int var0, int var1, int var2, int var3, int var4) {
      if(var1 >= topY) {
         if(var1 < bottomY) {
            if(var0 < topX) {
               var2 -= topX - var0;
               var0 = topX;
            }

            if(var0 + var2 > bottomX) {
               var2 = bottomX - var0;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var12 = (var3 >> 8 & 255) * var4;
            int var7 = (var3 & 255) * var4;
            int var8 = var0 + var1 * width;

            for(int var10 = 0; var10 < var2; ++var10) {
               int var14 = (renderPixels[var8] >> 16 & 255) * var5;
               int var11 = (renderPixels[var8] >> 8 & 255) * var5;
               int var13 = (renderPixels[var8] & 255) * var5;
               int var9 = (var6 + var14 >> 8 << 16) + (var12 + var11 >> 8 << 8) + (var7 + var13 >> 8);
               renderPixels[var8++] = var9;
            }

         }
      }
   }

   public static void method2551(int[] var0) {
      topX = var0[0];
      topY = var0[1];
      bottomX = var0[2];
      bottomY = var0[3];
   }

   public static void drawFilledRectangle(int var0, int var1, int var2, int var3, int var4) {
      if(var0 < topX) {
         var2 -= topX - var0;
         var0 = topX;
      }

      if(var1 < topY) {
         var3 -= topY - var1;
         var1 = topY;
      }

      if(var0 + var2 > bottomX) {
         var2 = bottomX - var0;
      }

      if(var1 + var3 > bottomY) {
         var3 = bottomY - var1;
      }

      int var5 = width - var2;
      int var6 = var0 + var1 * width;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            renderPixels[var6++] = var4;
         }

         var6 += var5;
      }

   }
}
