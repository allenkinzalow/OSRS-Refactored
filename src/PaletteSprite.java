
public final class PaletteSprite extends Rasterizer2D {

   static int[] lastLoadedPaletteSpriteWidth;
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
       if (!FriendsChatMember.loadPaletteSprite(var0, var4, var6, -1818735158)) {
           var5 = null;
       } else {
           PaletteSprite[] var8 = new PaletteSprite[Class9.anInt125 * 2039617935];

           for (int var9 = 0; var9 < Class9.anInt125 * 2039617935; ++var9) {
               PaletteSprite var7 = var8[var9] = new PaletteSprite();
               var7.anInt2418 = Class9.anInt122 * 93011449;
               var7.anInt2412 = Class9.anInt121 * -1272520477;
               var7.anInt2415 = Class88.anIntArray1316[var9];
               var7.anInt2411 = Class9.anIntArray123[var9];
               var7.anInt2413 = lastLoadedPaletteSpriteWidth[var9];
               var7.anInt2414 = Class9.anIntArray126[var9];
               var7.palette = Class9.anIntArray130;
               var7.pixels = AnimationSkeletonSet.loadedCharacterPixels[var9];
           }

           resetLastPaletteValues((byte) 82);
           var5 = var8;
       }

       return var5;
   }

   public static PaletteSprite getLastLoadedPaletteSprite(int var0) {
      PaletteSprite paletteSprite = new PaletteSprite();
      paletteSprite.anInt2418 = Class9.anInt122 * 93011449;
      paletteSprite.anInt2412 = Class9.anInt121 * -1272520477;
      paletteSprite.anInt2415 = Class88.anIntArray1316[0];
      paletteSprite.anInt2411 = Class9.anIntArray123[0];
      paletteSprite.anInt2413 = lastLoadedPaletteSpriteWidth[0];
      paletteSprite.anInt2414 = Class9.anIntArray126[0];
      paletteSprite.palette = Class9.anIntArray130;
      paletteSprite.pixels = AnimationSkeletonSet.loadedCharacterPixels[0];
      resetLastPaletteValues((byte) 112);
      return paletteSprite;
   }

   public static void decodePaletteSprite(byte[] data, int var1) {
      RSByteBuffer buffer = new RSByteBuffer(data);
      buffer.position = (data.length - 2) * 537964811;
      Class9.anInt125 = buffer.readUShort(635512719) * -241769105;
      Class88.anIntArray1316 = new int[Class9.anInt125 * 2039617935];
      Class9.anIntArray123 = new int[Class9.anInt125 * 2039617935];
      lastLoadedPaletteSpriteWidth = new int[Class9.anInt125 * 2039617935];
      Class9.anIntArray126 = new int[Class9.anInt125 * 2039617935];
      AnimationSkeletonSet.loadedCharacterPixels = new byte[Class9.anInt125 * 2039617935][];
      buffer.position = (data.length - 7 - Class9.anInt125 * -862925704) * 537964811;
      Class9.anInt122 = buffer.readUShort(-821144934) * -1400179639;
      Class9.anInt121 = buffer.readUShort(-1985241913) * -187603765;
      int var3 = (buffer.readUByte() & 255) + 1;

      int var6;
      for(var6 = 0; var6 < Class9.anInt125 * 2039617935; ++var6) {
         Class88.anIntArray1316[var6] = buffer.readUShort(-517797873);
      }

      for(var6 = 0; var6 < Class9.anInt125 * 2039617935; ++var6) {
         Class9.anIntArray123[var6] = buffer.readUShort(119520541);
      }

      for(var6 = 0; var6 < Class9.anInt125 * 2039617935; ++var6) {
         lastLoadedPaletteSpriteWidth[var6] = buffer.readUShort(-1397296091);
      }

      for(var6 = 0; var6 < Class9.anInt125 * 2039617935; ++var6) {
         Class9.anIntArray126[var6] = buffer.readUShort(-1007194691);
      }

      buffer.position = (data.length - 7 - Class9.anInt125 * -862925704 - (var3 - 1) * 3) * 537964811;
      Class9.anIntArray130 = new int[var3];

      for(var6 = 1; var6 < var3; ++var6) {
         Class9.anIntArray130[var6] = buffer.method1809(-263273200);
         if(0 == Class9.anIntArray130[var6]) {
            Class9.anIntArray130[var6] = 1;
         }
      }

      buffer.position = 0;

      for(var6 = 0; var6 < Class9.anInt125 * 2039617935; ++var6) {
         int var7 = lastLoadedPaletteSpriteWidth[var6];
         int var9 = Class9.anIntArray126[var6];
         int var10 = var7 * var9;
         byte[] var11 = new byte[var10];
         AnimationSkeletonSet.loadedCharacterPixels[var6] = var11;
         int var4 = buffer.readUByte();
         int var5;
         if(var4 == 0) {
            for(var5 = 0; var5 < var10; ++var5) {
               var11[var5] = buffer.readByte();
            }
         } else if(1 == var4) {
            for(var5 = 0; var5 < var7; ++var5) {
               for(int var8 = 0; var8 < var9; ++var8) {
                  var11[var7 * var8 + var5] = buffer.readByte();
               }
            }
         }
      }

   }

   static PaletteSprite getPaletteSprite(AbstractIndex spriteIndex, int archiveID, int fileID, byte var3) {
      return !FriendsChatMember.loadPaletteSprite(spriteIndex, archiveID, fileID, -1425645056) ? null : getLastLoadedPaletteSprite(1969691175);
   }

   static void resetLastPaletteValues(byte var0) {
      Class88.anIntArray1316 = null;
      Class9.anIntArray123 = null;
      lastLoadedPaletteSpriteWidth = null;
      Class9.anIntArray126 = null;
      Class9.anIntArray130 = null;
      AnimationSkeletonSet.loadedCharacterPixels = (byte[][])null;
   }


   public void drawSprite(int var1, int var2) {
      var1 += this.anInt2415;
      var2 += this.anInt2411;
      int var5 = var1 + var2 * renderWidth;
      int var6 = 0;
      int var7 = this.anInt2414;
      int var8 = this.anInt2413;
      int var3 = renderWidth - var8;
      int var9 = 0;
      int var4;
      if(var2 < topY) {
         var4 = topY - var2;
         var7 -= var4;
         var2 = topY;
         var6 += var4 * var8;
         var5 += var4 * renderWidth;
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
