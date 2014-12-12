
public final class PaletteSprite extends Rasterizer2D {

   public int anInt2411;
   public int anInt2412;
   public int anInt2413;
   public int anInt2414;
   public int anInt2415;
   public int[] palette;
   public byte[] pixels;
   public int anInt2418;

   public static PaletteSprite[] loadPaletteSpriteSet(AbstractIndex var0, String var1, String var2, byte var3) {
       int var4 = var0.getArchiveIDForName(var1, 1723285154);
       int var6 = var0.getFileIDForName(var4, var2);
       PaletteSprite[] var5;
       if (!FriendsChatMember.method1686(var0, var4, var6, -1818735158)) {
           var5 = null;
       } else {
           PaletteSprite[] var8 = new PaletteSprite[Class9.anInt125 * 2039617935];

           for (int var9 = 0; var9 < Class9.anInt125 * 2039617935; ++var9) {
               PaletteSprite var7 = var8[var9] = new PaletteSprite();
               var7.anInt2418 = Class9.anInt122 * 93011449;
               var7.anInt2412 = Class9.anInt121 * -1272520477;
               var7.anInt2415 = Class88.anIntArray1316[var9];
               var7.anInt2411 = Class9.anIntArray123[var9];
               var7.anInt2413 = Class36.anIntArray514[var9];
               var7.anInt2414 = Class9.anIntArray126[var9];
               var7.palette = Class9.anIntArray130;
               var7.pixels = AnimationSkeletonSet.loadedCharacterPixels[var9];
           }

           ClientScript.method1679((byte) 82);
           var5 = var8;
       }

       return var5;
   }


   public void drawSprite(int var1, int var2) {
      var1 += this.anInt2415;
      var2 += this.anInt2411;
      int var5 = var1 + var2 * width;
      int var6 = 0;
      int var7 = this.anInt2414;
      int var8 = this.anInt2413;
      int var3 = width - var8;
      int var9 = 0;
      int var4;
      if(var2 < topY) {
         var4 = topY - var2;
         var7 -= var4;
         var2 = topY;
         var6 += var4 * var8;
         var5 += var4 * width;
      }

      if(var2 + var7 > bottomY) {
         var7 -= var2 + var7 - bottomY;
      }

      if(var1 < topX) {
         var4 = topX - var1;
         var8 -= var4;
         var1 = topX;
         var6 += var4;
         var5 += var4;
         var9 += var4;
         var3 += var4;
      }

      if(var1 + var8 > bottomX) {
         var4 = var1 + var8 - bottomX;
         var8 -= var4;
         var9 += var4;
         var3 += var4;
      }

      if(var8 > 0) {
         if(var7 > 0) {
            method2832(renderPixels, this.pixels, this.palette, var6, var5, var8, var7, var3, var9);
         }
      }
   }

   static void method2832(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         byte var11;
         int var12;
         for(var12 = var9; var12 < 0; ++var12) {
            var11 = var1[var3++];
            if(var11 != 0) {
               var0[var4++] = var2[var11 & 255];
            } else {
               ++var4;
            }

            var11 = var1[var3++];
            if(var11 != 0) {
               var0[var4++] = var2[var11 & 255];
            } else {
               ++var4;
            }

            var11 = var1[var3++];
            if(var11 != 0) {
               var0[var4++] = var2[var11 & 255];
            } else {
               ++var4;
            }

            var11 = var1[var3++];
            if(var11 != 0) {
               var0[var4++] = var2[var11 & 255];
            } else {
               ++var4;
            }
         }

         for(var12 = var5; var12 < 0; ++var12) {
            var11 = var1[var3++];
            if(var11 != 0) {
               var0[var4++] = var2[var11 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void mixPalette(int red, int green, int blue) {
      for(int index = 0; index < this.palette.length; ++index) {
         int r = this.palette[index] >> 16 & 255;
         r += red;
         if(r < 0) {
            r = 0;
         } else if(r > 255) {
            r = 255;
         }

         int g = this.palette[index] >> 8 & 255;
         g += green;
         if(g < 0) {
            g = 0;
         } else if(g > 255) {
            g = 255;
         }

         int b = this.palette[index] & 255;
         b += blue;
         if(b < 0) {
            b = 0;
         } else if(b > 255) {
            b = 255;
         }

         this.palette[index] = (r << 16) + (g << 8) + b;
      }

   }

   public void method2844() {
      if(this.anInt2413 != this.anInt2418 || this.anInt2414 != this.anInt2412) {
         byte[] var1 = new byte[this.anInt2418 * this.anInt2412];
         int var4 = 0;

         for(int var3 = 0; var3 < this.anInt2414; ++var3) {
            for(int var2 = 0; var2 < this.anInt2413; ++var2) {
               var1[var2 + this.anInt2415 + (var3 + this.anInt2411) * this.anInt2418] = this.pixels[var4++];
            }
         }

         this.pixels = var1;
         this.anInt2413 = this.anInt2418;
         this.anInt2414 = this.anInt2412;
         this.anInt2415 = 0;
         this.anInt2411 = 0;
      }
   }
}
