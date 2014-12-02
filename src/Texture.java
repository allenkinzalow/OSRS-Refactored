
public class Texture extends Node {

   int[] pixels;
   static final int anInt1522 = 3;
   static final int anInt1523 = 0;
   int anInt1524;
   boolean aBool1525 = false;
   boolean aBool1526;
   int[] textureFileIDs;
   int[] anIntArray1528;
   int[] anIntArray1529;
   int[] anIntArray1530;
   int anInt1531;
   int anInt1532;
   static final int anInt1533 = 2;
   static final int anInt1534 = 1;
   static int[] anIntArray1535;


   void resetPixels() {
      this.pixels = null;
   }

   void method1549(int var1) {
      if(this.pixels != null) {
         int var2;
         int var3;
         short var5;
         int var6;
         int var7;
         int var8;
         int[] var10;
         if(this.anInt1531 == 1 || this.anInt1531 == 3) {
            if(anIntArray1535 == null || anIntArray1535.length < this.pixels.length) {
               anIntArray1535 = new int[this.pixels.length];
            }

            if(this.pixels.length == 4096) {
               var5 = 64;
            } else {
               var5 = 128;
            }

            var6 = this.pixels.length;
            var8 = var5 * var1 * this.anInt1532;
            var7 = var6 - 1;
            if(this.anInt1531 == 1) {
               var8 = -var8;
            }

            for(var2 = 0; var2 < var6; ++var2) {
               var3 = var2 + var8 & var7;
               anIntArray1535[var2] = this.pixels[var3];
            }

            var10 = this.pixels;
            this.pixels = anIntArray1535;
            anIntArray1535 = var10;
         }

         if(this.anInt1531 == 2 || this.anInt1531 == 4) {
            if(anIntArray1535 == null || anIntArray1535.length < this.pixels.length) {
               anIntArray1535 = new int[this.pixels.length];
            }

            if(this.pixels.length == 4096) {
               var5 = 64;
            } else {
               var5 = 128;
            }

            var6 = this.pixels.length;
            var8 = var1 * this.anInt1532;
            var7 = var5 - 1;
            if(this.anInt1531 == 2) {
               var8 = -var8;
            }

            for(var2 = 0; var2 < var6; var2 += var5) {
               for(var3 = 0; var3 < var5; ++var3) {
                  int var4 = var2 + var3;
                  int var9 = var2 + (var3 + var8 & var7);
                  anIntArray1535[var4] = this.pixels[var9];
               }
            }

            var10 = this.pixels;
            this.pixels = anIntArray1535;
            anIntArray1535 = var10;
         }
      }
   }

   boolean initTexturePixels(double brightness, int dimmension, AbstractIndex spriteIndex) {
      int fileID;
      for(fileID = 0; fileID < this.textureFileIDs.length; ++fileID) {
         if(spriteIndex.getFirstData_2(this.textureFileIDs[fileID], 1982703291) == null) {
            return false;
         }
      }

      int dimmensionLength = dimmension * dimmension;
      this.pixels = new int[dimmensionLength];

      for(int texFileID = 0; texFileID < this.textureFileIDs.length; ++texFileID) { 
         int file_id = this.textureFileIDs[texFileID];
         byte[] imageData = spriteIndex.getFirstData(file_id, 790696077);
         boolean hasSprite;
         if(null == imageData) {
            hasSprite = false;
         } else {
            WallDecoration.method338(imageData, 878628031);
            hasSprite = true;
         }

         PaletteSprite spritePalette;
         if(!hasSprite) {
            spritePalette = null;
         } else {
            spritePalette = Class37.getLastLoadedPaletteSprite(1143767647);
         }

         spritePalette.method2844();
         byte[] palettePixels = spritePalette.pixels;
         int[] palette = spritePalette.palette;
         int var13 = this.anIntArray1530[texFileID];
         if((var13 & -16777216) == 16777216) {
            ;
         }

         if((var13 & -16777216) == 33554432) {
            ;
         }

         int var6;
         int var8;
         int var15;
         int var16;
         if((var13 & -16777216) == 50331648) {
            var6 = var13 & 16711935;
            var16 = var13 >> 8 & 255;

            for(var8 = 0; var8 < palette.length; ++var8) {
               var15 = palette[var8];
               if((var15 & '\uffff') == var15 >> 8) {
                  var15 &= 255;
                  palette[var8] = var6 * var15 >> 8 & 16711935 | var16 * var15 & '\uff00';
               }
            }
         }

         for(var6 = 0; var6 < palette.length; ++var6) {
            palette[var6] = Rasterizer3D.adjustBrightness(palette[var6], brightness);
         }

         if(texFileID == 0) {
            var6 = 0;
         } else {
            var6 = this.anIntArray1528[texFileID - 1];
         }

         if(texFileID == 0) {
            ;
         }

         if(var6 == 0) {
            if(spritePalette.anInt2413 == dimmension) {
               for(int pixelPos = 0; pixelPos < dimmensionLength; ++pixelPos) {
                  this.pixels[pixelPos] = palette[palettePixels[pixelPos] & 255];
               }
            } else if(spritePalette.anInt2413 == 64 && dimmension == 128) {
               int pixelPos = 0;

               for(var8 = 0; var8 < dimmension; ++var8) {
                  for(var15 = 0; var15 < dimmension; ++var15) {
                     this.pixels[pixelPos++] = palette[palettePixels[(var15 >> 1) + (var8 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if(spritePalette.anInt2413 != 128 || dimmension != 64) {
                  throw new RuntimeException();
               }

               int pixelPos = 0;

               for(var8 = 0; var8 < dimmension; ++var8) {
                  for(var15 = 0; var15 < dimmension; ++var15) {
                     this.pixels[pixelPos++] = palette[palettePixels[(var15 << 1) + (var8 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if(var6 == 1) {
            ;
         }

         if(var6 == 2) {
            ;
         }

         if(var6 == 3) {
            ;
         }
      }

      return true;
   }

   Texture(RSByteBuffer buffer) {
      this.anInt1524 = buffer.readUShort(-262834476);
      this.aBool1526 = buffer.readUByte() == 1;
      int var2 = buffer.readUByte();
      if(var2 >= 1 && var2 <= 4) {
         this.textureFileIDs = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.textureFileIDs[var3] = buffer.readUShort(-903004129);
         }

         if(var2 > 1) {
            this.anIntArray1528 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.anIntArray1528[var3] = buffer.readUByte();
            }
         }

         if(var2 > 1) {
            this.anIntArray1529 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.anIntArray1529[var3] = buffer.readUByte();
            }
         }

         this.anIntArray1530 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.anIntArray1530[var3] = buffer.readInt();
         }

         this.anInt1531 = buffer.readUByte();
         this.anInt1532 = buffer.readUByte();
         this.pixels = null;
      } else {
         throw new RuntimeException();
      }
   }
}
