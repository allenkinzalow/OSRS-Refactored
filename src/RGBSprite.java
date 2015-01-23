import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public final class RGBSprite extends Rasterizer2D {

   int offsetY;
   int width;
   int height;
   int offsetX;
   static final int anInt2403 = 12;
   static final int anInt2404 = 4095;
   public int maxHeight;
   static final int anInt2406 = 15;
   public int maxWidth;
   static final int anInt2408 = 8;
   public int[] pixels;
   static final int anInt2410 = 4;

   public static RGBSprite[] loadRGBSpriteSetForNames(AbstractIndex spriteIndex, String archiveName, String fileName, short var3) {
      int archiveID = spriteIndex.getArchiveIDForName(archiveName, 1723285154);
      int fileID = spriteIndex.getFileIDForName(archiveID, fileName);
      return loadRGBSpriteSet(spriteIndex, archiveID, fileID, -893370861);
   }

   static RGBSprite[] loadRGBSpriteSet(AbstractIndex var0, int var1, int var2, int var3) {
       if (!FriendsChatMember.loadPaletteSprite(var0, var1, var2, -1626517407)) {
           return null;
       } else {
           RGBSprite[] var7 = new RGBSprite[Class9.anInt125 * 2039617935];

           for (int var6 = 0; var6 < Class9.anInt125 * 2039617935; ++var6) {
               RGBSprite var8 = var7[var6] = new RGBSprite();
               var8.maxWidth = Class9.anInt122 * 93011449;
               var8.maxHeight = Class9.anInt121 * -1272520477;
               var8.offsetX = Class88.anIntArray1316[var6];
               var8.offsetY = Class9.anIntArray123[var6];
               var8.width = PaletteSprite.lastLoadedPaletteSpriteWidth[var6];
               var8.height = Class9.anIntArray126[var6];
               int var5 = var8.width * var8.height;
               byte[] var9 = AnimationSkeletonSet.loadedCharacterPixels[var6];
               var8.pixels = new int[var5];

               for (int var4 = 0; var4 < var5; ++var4) {
                   var8.pixels[var4] = Class9.anIntArray130[var9[var4] & 255];
               }
           }

           PaletteSprite.resetLastPaletteValues((byte) 93);
           return var7;
       }
   }


   void method2741(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var6 != 0) {
         var1 -= this.offsetX << 4;
         var2 -= this.offsetY << 4;
         double var18 = (double)(var5 & '\uffff') * 9.587379924285257E-5D;
         int var20 = (int)Math.floor(Math.sin(var18) * (double)var6 + 0.5D);
         int var21 = (int)Math.floor(Math.cos(var18) * (double)var6 + 0.5D);
         int var22 = -var1 * var21 + -var2 * var20;
         int var23 = -(-var1) * var20 + -var2 * var21;
         int var29 = ((this.width << 4) - var1) * var21 + -var2 * var20;
         int var34 = -((this.width << 4) - var1) * var20 + -var2 * var21;
         int var32 = -var1 * var21 + ((this.height << 4) - var2) * var20;
         int var26 = -(-var1) * var20 + ((this.height << 4) - var2) * var21;
         int var27 = ((this.width << 4) - var1) * var21 + ((this.height << 4) - var2) * var20;
         int var28 = -((this.width << 4) - var1) * var20 + ((this.height << 4) - var2) * var21;
         int var24;
         int var31;
         if(var22 < var29) {
            var31 = var22;
            var24 = var29;
         } else {
            var31 = var29;
            var24 = var22;
         }

         if(var32 < var31) {
            var31 = var32;
         }

         if(var27 < var31) {
            var31 = var27;
         }

         if(var32 > var24) {
            var24 = var32;
         }

         if(var27 > var24) {
            var24 = var27;
         }

         int var25;
         int var30;
         if(var23 < var34) {
            var25 = var23;
            var30 = var34;
         } else {
            var25 = var34;
            var30 = var23;
         }

         if(var26 < var25) {
            var25 = var26;
         }

         if(var28 < var25) {
            var25 = var28;
         }

         if(var26 > var30) {
            var30 = var26;
         }

         if(var28 > var30) {
            var30 = var28;
         }

         var31 >>= 12;
         var24 = var24 + 4095 >> 12;
         var25 >>= 12;
         var30 = var30 + 4095 >> 12;
         var31 += var3;
         var24 += var3;
         var25 += var4;
         var30 += var4;
         var31 >>= 4;
         var24 = var24 + 15 >> 4;
         var25 >>= 4;
         var30 = var30 + 15 >> 4;
         if(var31 < topX) {
            var31 = topX;
         }

         if(var24 > bottomX) {
            var24 = bottomX;
         }

         if(var25 < topY) {
            var25 = topY;
         }

         if(var30 > bottomY) {
            var30 = bottomY;
         }

         var24 = var31 - var24;
         if(var24 < 0) {
            var30 = var25 - var30;
            if(var30 < 0) {
               int var12 = var25 * width + var31;
               double var36 = 1.6777216E7D / (double)var6;
               int var9 = (int)Math.floor(Math.sin(var18) * var36 + 0.5D);
               int var11 = (int)Math.floor(Math.cos(var18) * var36 + 0.5D);
               int var14 = (var31 << 4) + 8 - var3;
               int var38 = (var25 << 4) + 8 - var4;
               int var8 = (var1 << 8) - (var38 * var9 >> 4);
               int var10 = (var2 << 8) + (var38 * var11 >> 4);
               int var7;
               int var13;
               int var15;
               int var16;
               int var17;
               int var33;
               int var35;
               if(var11 == 0) {
                  if(var9 == 0) {
                     for(var7 = var30; var7 < 0; var12 += width) {
                        var35 = var12;
                        var15 = var8;
                        var13 = var10;
                        var17 = var24;
                        if(var8 >= 0 && var10 >= 0 && var8 - (this.width << 12) < 0 && var10 - (this.height << 12) < 0) {
                           for(; var17 < 0; ++var17) {
                              var33 = this.pixels[(var13 >> 12) * this.width + (var15 >> 12)];
                              if(var33 != 0) {
                                 renderPixels[var35++] = var33;
                              } else {
                                 ++var35;
                              }
                           }
                        }

                        ++var7;
                     }

                  } else if(var9 < 0) {
                     for(var7 = var30; var7 < 0; var12 += width) {
                        var35 = var12;
                        var15 = var8;
                        var13 = var10 + (var14 * var9 >> 4);
                        var17 = var24;
                        if(var8 >= 0 && var8 - (this.width << 12) < 0) {
                           if((var16 = var13 - (this.height << 12)) >= 0) {
                              var16 = (var9 - var16) / var9;
                              var17 = var24 + var16;
                              var13 += var9 * var16;
                              var35 = var12 + var16;
                           }

                           if((var16 = (var13 - var9) / var9) > var17) {
                              var17 = var16;
                           }

                           while(var17 < 0) {
                              var33 = this.pixels[(var13 >> 12) * this.width + (var15 >> 12)];
                              if(var33 != 0) {
                                 renderPixels[var35++] = var33;
                              } else {
                                 ++var35;
                              }

                              var13 += var9;
                              ++var17;
                           }
                        }

                        ++var7;
                        var8 -= var9;
                     }

                  } else {
                     for(var7 = var30; var7 < 0; var12 += width) {
                        var35 = var12;
                        var15 = var8;
                        var13 = var10 + (var14 * var9 >> 4);
                        var17 = var24;
                        if(var8 >= 0 && var8 - (this.width << 12) < 0) {
                           if(var13 < 0) {
                              var16 = (var9 - 1 - var13) / var9;
                              var17 = var24 + var16;
                              var13 += var9 * var16;
                              var35 = var12 + var16;
                           }

                           if((var16 = (1 + var13 - (this.height << 12) - var9) / var9) > var17) {
                              var17 = var16;
                           }

                           while(var17 < 0) {
                              var33 = this.pixels[(var13 >> 12) * this.width + (var15 >> 12)];
                              if(var33 != 0) {
                                 renderPixels[var35++] = var33;
                              } else {
                                 ++var35;
                              }

                              var13 += var9;
                              ++var17;
                           }
                        }

                        ++var7;
                        var8 -= var9;
                     }

                  }
               } else if(var11 < 0) {
                  if(var9 == 0) {
                     for(var7 = var30; var7 < 0; var12 += width) {
                        var35 = var12;
                        var15 = var8 + (var14 * var11 >> 4);
                        var13 = var10;
                        var17 = var24;
                        if(var10 >= 0 && var10 - (this.height << 12) < 0) {
                           if((var16 = var15 - (this.width << 12)) >= 0) {
                              var16 = (var11 - var16) / var11;
                              var17 = var24 + var16;
                              var15 += var11 * var16;
                              var35 = var12 + var16;
                           }

                           if((var16 = (var15 - var11) / var11) > var17) {
                              var17 = var16;
                           }

                           while(var17 < 0) {
                              var33 = this.pixels[(var13 >> 12) * this.width + (var15 >> 12)];
                              if(var33 != 0) {
                                 renderPixels[var35++] = var33;
                              } else {
                                 ++var35;
                              }

                              var15 += var11;
                              ++var17;
                           }
                        }

                        ++var7;
                        var10 += var11;
                     }

                  } else if(var9 < 0) {
                     for(var7 = var30; var7 < 0; var12 += width) {
                        var35 = var12;
                        var15 = var8 + (var14 * var11 >> 4);
                        var13 = var10 + (var14 * var9 >> 4);
                        var17 = var24;
                        if((var16 = var15 - (this.width << 12)) >= 0) {
                           var16 = (var11 - var16) / var11;
                           var17 = var24 + var16;
                           var15 += var11 * var16;
                           var13 += var9 * var16;
                           var35 = var12 + var16;
                        }

                        if((var16 = (var15 - var11) / var11) > var17) {
                           var17 = var16;
                        }

                        if((var16 = var13 - (this.height << 12)) >= 0) {
                           var16 = (var9 - var16) / var9;
                           var17 += var16;
                           var15 += var11 * var16;
                           var13 += var9 * var16;
                           var35 += var16;
                        }

                        if((var16 = (var13 - var9) / var9) > var17) {
                           var17 = var16;
                        }

                        while(var17 < 0) {
                           var33 = this.pixels[(var13 >> 12) * this.width + (var15 >> 12)];
                           if(var33 != 0) {
                              renderPixels[var35++] = var33;
                           } else {
                              ++var35;
                           }

                           var15 += var11;
                           var13 += var9;
                           ++var17;
                        }

                        ++var7;
                        var8 -= var9;
                        var10 += var11;
                     }

                  } else {
                     for(var7 = var30; var7 < 0; var12 += width) {
                        var35 = var12;
                        var15 = var8 + (var14 * var11 >> 4);
                        var13 = var10 + (var14 * var9 >> 4);
                        var17 = var24;
                        if((var16 = var15 - (this.width << 12)) >= 0) {
                           var16 = (var11 - var16) / var11;
                           var17 = var24 + var16;
                           var15 += var11 * var16;
                           var13 += var9 * var16;
                           var35 = var12 + var16;
                        }

                        if((var16 = (var15 - var11) / var11) > var17) {
                           var17 = var16;
                        }

                        if(var13 < 0) {
                           var16 = (var9 - 1 - var13) / var9;
                           var17 += var16;
                           var15 += var11 * var16;
                           var13 += var9 * var16;
                           var35 += var16;
                        }

                        if((var16 = (1 + var13 - (this.height << 12) - var9) / var9) > var17) {
                           var17 = var16;
                        }

                        while(var17 < 0) {
                           var33 = this.pixels[(var13 >> 12) * this.width + (var15 >> 12)];
                           if(var33 != 0) {
                              renderPixels[var35++] = var33;
                           } else {
                              ++var35;
                           }

                           var15 += var11;
                           var13 += var9;
                           ++var17;
                        }

                        ++var7;
                        var8 -= var9;
                        var10 += var11;
                     }

                  }
               } else if(var9 == 0) {
                  for(var7 = var30; var7 < 0; var12 += width) {
                     var35 = var12;
                     var15 = var8 + (var14 * var11 >> 4);
                     var13 = var10;
                     var17 = var24;
                     if(var10 >= 0 && var10 - (this.height << 12) < 0) {
                        if(var15 < 0) {
                           var16 = (var11 - 1 - var15) / var11;
                           var17 = var24 + var16;
                           var15 += var11 * var16;
                           var35 = var12 + var16;
                        }

                        if((var16 = (1 + var15 - (this.width << 12) - var11) / var11) > var17) {
                           var17 = var16;
                        }

                        while(var17 < 0) {
                           var33 = this.pixels[(var13 >> 12) * this.width + (var15 >> 12)];
                           if(var33 != 0) {
                              renderPixels[var35++] = var33;
                           } else {
                              ++var35;
                           }

                           var15 += var11;
                           ++var17;
                        }
                     }

                     ++var7;
                     var10 += var11;
                  }

               } else if(var9 < 0) {
                  for(var7 = var30; var7 < 0; var12 += width) {
                     var35 = var12;
                     var15 = var8 + (var14 * var11 >> 4);
                     var13 = var10 + (var14 * var9 >> 4);
                     var17 = var24;
                     if(var15 < 0) {
                        var16 = (var11 - 1 - var15) / var11;
                        var17 = var24 + var16;
                        var15 += var11 * var16;
                        var13 += var9 * var16;
                        var35 = var12 + var16;
                     }

                     if((var16 = (1 + var15 - (this.width << 12) - var11) / var11) > var17) {
                        var17 = var16;
                     }

                     if((var16 = var13 - (this.height << 12)) >= 0) {
                        var16 = (var9 - var16) / var9;
                        var17 += var16;
                        var15 += var11 * var16;
                        var13 += var9 * var16;
                        var35 += var16;
                     }

                     if((var16 = (var13 - var9) / var9) > var17) {
                        var17 = var16;
                     }

                     while(var17 < 0) {
                        var33 = this.pixels[(var13 >> 12) * this.width + (var15 >> 12)];
                        if(var33 != 0) {
                           renderPixels[var35++] = var33;
                        } else {
                           ++var35;
                        }

                        var15 += var11;
                        var13 += var9;
                        ++var17;
                     }

                     ++var7;
                     var8 -= var9;
                     var10 += var11;
                  }

               } else {
                  for(var7 = var30; var7 < 0; var12 += width) {
                     var35 = var12;
                     var15 = var8 + (var14 * var11 >> 4);
                     var13 = var10 + (var14 * var9 >> 4);
                     var17 = var24;
                     if(var15 < 0) {
                        var16 = (var11 - 1 - var15) / var11;
                        var17 = var24 + var16;
                        var15 += var11 * var16;
                        var13 += var9 * var16;
                        var35 = var12 + var16;
                     }

                     if((var16 = (1 + var15 - (this.width << 12) - var11) / var11) > var17) {
                        var17 = var16;
                     }

                     if(var13 < 0) {
                        var16 = (var9 - 1 - var13) / var9;
                        var17 += var16;
                        var15 += var11 * var16;
                        var13 += var9 * var16;
                        var35 += var16;
                     }

                     if((var16 = (1 + var13 - (this.height << 12) - var9) / var9) > var17) {
                        var17 = var16;
                     }

                     while(var17 < 0) {
                        var33 = this.pixels[(var13 >> 12) * this.width + (var15 >> 12)];
                        if(var33 != 0) {
                           renderPixels[var35++] = var33;
                        } else {
                           ++var35;
                        }

                        var15 += var11;
                        var13 += var9;
                        ++var17;
                     }

                     ++var7;
                     var8 -= var9;
                     var10 += var11;
                  }

               }
            }
         }
      }
   }

   public RGBSprite(int width, int height) {
      this.pixels = new int[width * height];
      this.width = this.maxWidth = width;
      this.height = this.maxHeight = height;
      this.offsetY = 0;
      this.offsetX = 0;
   }

   public RGBSprite method2743() {
      RGBSprite var1 = new RGBSprite(this.width, this.height);
      var1.maxWidth = this.maxWidth;
      var1.maxHeight = this.maxHeight;
      var1.offsetX = this.maxWidth - this.width - this.offsetX;
      var1.offsetY = this.offsetY;

      for(int var2 = 0; var2 < this.height; ++var2) {
         for(int var3 = 0; var3 < this.width; ++var3) {
            var1.pixels[var2 * this.width + var3] = this.pixels[var2 * this.width + this.width - 1 - var3];
         }
      }

      return var1;
   }

   public void method2744() {
      copySprite(this.pixels, this.width, this.height);
   }

   public void alterColor(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.pixels.length; ++var4) {
         int var6 = this.pixels[var4];
         if(var6 != 0) {
            int var7 = var6 >> 16 & 255;
            var7 += var1;
            if(var7 < 1) {
               var7 = 1;
            } else if(var7 > 255) {
               var7 = 255;
            }

            int var5 = var6 >> 8 & 255;
            var5 += var2;
            if(var5 < 1) {
               var5 = 1;
            } else if(var5 > 255) {
               var5 = 255;
            }

            int var8 = var6 & 255;
            var8 += var3;
            if(var8 < 1) {
               var8 = 1;
            } else if(var8 > 255) {
               var8 = 255;
            }

            this.pixels[var4] = (var7 << 16) + (var5 << 8) + var8;
         }
      }

   }

   public void method2746(int x, int y) {
      x += this.offsetX;
      y += this.offsetY;
      int var4 = x + y * width;
      int var8 = 0;
      int var6 = this.height;
      int var3 = this.width;
      int var9 = width - var3;
      int var7 = 0;
      int var5;
      if(y < topY) {
         var5 = topY - y;
         var6 -= var5;
         y = topY;
         var8 += var5 * var3;
         var4 += var5 * width;
      }

      if(y + var6 > bottomY) {
         var6 -= y + var6 - bottomY;
      }

      if(x < topX) {
         var5 = topX - x;
         var3 -= var5;
         x = topX;
         var8 += var5;
         var4 += var5;
         var7 += var5;
         var9 += var5;
      }

      if(x + var3 > bottomX) {
         var5 = x + var3 - bottomX;
         var3 -= var5;
         var7 += var5;
         var9 += var5;
      }

      if(var3 > 0) {
         if(var6 > 0) {
            method2770(renderPixels, this.pixels, 0, var8, var4, var3, var6, var9, var7);
         }
      }
   }

   public void flipHorizontal() {
      int[] newPixels = new int[this.width * this.height];
      int pos = 0;

      for(int y = this.height - 1; y >= 0; --y) {
         for(int x = 0; x < this.width; ++x) {
            newPixels[pos++] = this.pixels[x + y * this.width];
         }
      }

      this.pixels = newPixels;
      this.offsetY = this.maxHeight - this.height - this.offsetY;
   }

   public void setPixels(int newPixel) {
      int[] newPixels = new int[this.width * this.height];
      int pos = 0;

      for(int y = 0; y < this.height; ++y) {
         for(int x = 0; x < this.width; ++x) {
            int pixel = this.pixels[pos];
            if(pixel == 0) {
               if(x > 0 && this.pixels[pos - 1] != 0) {
                  pixel = newPixel;
               } else if(y > 0 && this.pixels[pos - this.width] != 0) {
                  pixel = newPixel;
               } else if(x < this.width - 1 && this.pixels[pos + 1] != 0) {
                  pixel = newPixel;
               } else if(y < this.height - 1 && this.pixels[pos + this.width] != 0) {
                  pixel = newPixel;
               }
            }

            newPixels[pos++] = pixel;
         }
      }

      this.pixels = newPixels;
   }

   static void drawAlphaSprite(int[] var0, int[] var1, int var2, int var3, int var4, int offset, int originalDeviation, int var7, int var8, int var9, int var10, int var11, int opacity) {
      int var13 = 256 - opacity;
      int var18 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = (var4 >> 16) * var11;

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if(var2 != 0) {
               int var14 = var0[offset];
               var0[offset++] = ((var2 & 16711935) * opacity + (var14 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * opacity + (var14 & '\uff00') * var13 & 16711680) >> 8;
            } else {
               ++offset;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var18;
         offset += originalDeviation;
      }

   }

   static void method2753(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
            ;
         }

         var3 += var6;
         var2 += var7;
      }

   }

   public void method2755(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
         int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * width;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               renderPixels[var19++] = this.pixels[(var20 >> 16) + (var21 >> 16) * this.width];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += width;
         }

      } catch (Exception var22) {
         ;
      }
   }

   public void method2756(int var1, int var2, int var3, int var4) {
      if(var3 > 0) {
         if(var4 > 0) {
            int var10 = this.width;
            int var5 = this.height;
            int var11 = 0;
            int var6 = 0;
            int var15 = this.maxWidth;
            int var13 = this.maxHeight;
            int var12 = (var15 << 16) / var3;
            int var7 = (var13 << 16) / var4;
            int var14;
            if(this.offsetX > 0) {
               var14 = ((this.offsetX << 16) + var12 - 1) / var12;
               var1 += var14;
               var11 += var14 * var12 - (this.offsetX << 16);
            }

            if(this.offsetY > 0) {
               var14 = ((this.offsetY << 16) + var7 - 1) / var7;
               var2 += var14;
               var6 += var14 * var7 - (this.offsetY << 16);
            }

            if(var10 < var15) {
               var3 = ((var10 << 16) - var11 + var12 - 1) / var12;
            }

            if(var5 < var13) {
               var4 = ((var5 << 16) - var6 + var7 - 1) / var7;
            }

            var14 = var1 + var2 * width;
            int var8 = width - var3;
            if(var2 + var4 > bottomY) {
               var4 -= var2 + var4 - bottomY;
            }

            int var9;
            if(var2 < topY) {
               var9 = topY - var2;
               var4 -= var9;
               var14 += var9 * width;
               var6 += var7 * var9;
            }

            if(var1 + var3 > bottomX) {
               var9 = var1 + var3 - bottomX;
               var3 -= var9;
               var8 += var9;
            }

            if(var1 < topX) {
               var9 = topX - var1;
               var3 -= var9;
               var14 += var9;
               var11 += var12 * var9;
               var8 += var9;
            }

            method2757(renderPixels, this.pixels, 0, var11, var6, var14, var8, var3, var4, var12, var7, var10);
         }
      }
   }

   static void method2757(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            var2 = var1[(var3 >> 16) + var14];
            if(var2 != 0) {
               var0[var5++] = var2;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   public void drawSpriteAlpha(int var1, int var2, int var3, int var4) {
      if(var3 == 256) {
         this.method2746(var1, var2);
      } else {
         var1 += this.offsetX;
         var2 += this.offsetY;
         int var7 = var1 + var2 * width;
         int var11 = 0;
         int var8 = this.height;
         int var5 = this.width;
         int var9 = width - var5;
         int var10 = 0;
         int var6;
         if(var2 < topY) {
            var6 = topY - var2;
            var8 -= var6;
            var2 = topY;
            var11 += var6 * var5;
            var7 += var6 * width;
         }

         if(var2 + var8 > bottomY) {
            var8 -= var2 + var8 - bottomY;
         }

         if(var1 < topX) {
            var6 = topX - var1;
            var5 -= var6;
            var1 = topX;
            var11 += var6;
            var7 += var6;
            var10 += var6;
            var9 += var6;
         }

         if(var1 + var5 > bottomX) {
            var6 = var1 + var5 - bottomX;
            var5 -= var6;
            var10 += var6;
            var9 += var6;
         }

         if(var5 > 0) {
            if(var8 > 0) {
               method2763(renderPixels, this.pixels, 0, var11, var7, var5, var8, var9, var10, var3, var4);
            }
         }
      }
   }

   static void method2761(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if(var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void method2762(int var1, int var2, int var3, int var4, int var5) {
      if(var3 > 0) {
         if(var4 > 0) {
            int var15 = this.width;
            int var10 = this.height;
            int var11 = 0;
            int var8 = 0;
            int var16 = this.maxWidth;
            int var13 = this.maxHeight;
            int var12 = (var16 << 16) / var3;
            int var9 = (var13 << 16) / var4;
            int var6;
            if(this.offsetX > 0) {
               var6 = ((this.offsetX << 16) + var12 - 1) / var12;
               var1 += var6;
               var11 += var6 * var12 - (this.offsetX << 16);
            }

            if(this.offsetY > 0) {
               var6 = ((this.offsetY << 16) + var9 - 1) / var9;
               var2 += var6;
               var8 += var6 * var9 - (this.offsetY << 16);
            }

            if(var15 < var16) {
               var3 = ((var15 << 16) - var11 + var12 - 1) / var12;
            }

            if(var10 < var13) {
               var4 = ((var10 << 16) - var8 + var9 - 1) / var9;
            }

            var6 = var1 + var2 * width;
            int var14 = width - var3;
            if(var2 + var4 > bottomY) {
               var4 -= var2 + var4 - bottomY;
            }

            int var7;
            if(var2 < topY) {
               var7 = topY - var2;
               var4 -= var7;
               var6 += var7 * width;
               var8 += var9 * var7;
            }

            if(var1 + var3 > bottomX) {
               var7 = var1 + var3 - bottomX;
               var3 -= var7;
               var14 += var7;
            }

            if(var1 < topX) {
               var7 = topX - var1;
               var3 -= var7;
               var6 += var7;
               var11 += var12 * var7;
               var14 += var7;
            }

            drawAlphaSprite(renderPixels, this.pixels, 0, var11, var8, var6, var14, var3, var4, var12, var9, var15, var5);
         }
      }
   }

   static void method2763(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var13 = (var10 & 16711935) * var11 & -16711936;
      int var14 = (var10 & '\uff00') * var11 & 16711680;
      var10 = (var13 | var14) >>> 8;

      for(int var15 = -var6; var15 < 0; ++var15) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var13 = (var2 & 16711935) * var9 & -16711936;
               var14 = (var2 & '\uff00') * var9 & 16711680;
               var0[var4++] = ((var13 | var14) >>> 8) + var10;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void method2765(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0D);
         int var13 = (int)(Math.cos(var7) * 65536.0D);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * width;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.pixels[(var18 >> 16) + (var19 >> 16) * this.width];
               if(var20 != 0) {
                  renderPixels[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += width;
         }

      } catch (Exception var21) {
         ;
      }
   }

   public void method2766(int var1, int var2, int var3, int var4) {
      this.method2741(this.maxWidth << 3, this.maxHeight << 3, var1 << 4, var2 << 4, var3, var4);
   }

   public void drawSprite(int var1, int var2) {
      var1 += this.offsetX;
      var2 += this.offsetY;
      int var8 = var1 + var2 * width;
      int var5 = 0;
      int var3 = this.height;
      int var6 = this.width;
      int var9 = width - var6;
      int var4 = 0;
      int var7;
      if(var2 < topY) {
         var7 = topY - var2;
         var3 -= var7;
         var2 = topY;
         var5 += var7 * var6;
         var8 += var7 * width;
      }

      if(var2 + var3 > bottomY) {
         var3 -= var2 + var3 - bottomY;
      }

      if(var1 < topX) {
         var7 = topX - var1;
         var6 -= var7;
         var1 = topX;
         var5 += var7;
         var8 += var7;
         var4 += var7;
         var9 += var7;
      }

      if(var1 + var6 > bottomX) {
         var7 = var1 + var6 - bottomX;
         var6 -= var7;
         var4 += var7;
         var9 += var7;
      }

      if(var6 > 0) {
         if(var3 > 0) {
            method2753(renderPixels, this.pixels, var5, var8, var6, var3, var9, var4);
         }
      }
   }

   static void method2768(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, byte[] var11) {
      int var12 = -(var6 >> 2);
      var6 = -(var6 & 3);

      for(int var14 = -var7; var14 < 0; ++var14) {
         int var13;
         for(var13 = var12; var13 < 0; ++var13) {
            var2 = var1[var3++];
            if(var2 != 0 && var11[var5] == 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            ++var5;
            var2 = var1[var3++];
            if(var2 != 0 && var11[var5] == 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            ++var5;
            var2 = var1[var3++];
            if(var2 != 0 && var11[var5] == 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            ++var5;
            var2 = var1[var3++];
            if(var2 != 0 && var11[var5] == 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            ++var5;
         }

         for(var13 = var6; var13 < 0; ++var13) {
            var2 = var1[var3++];
            if(var2 != 0 && var11[var5] == 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            ++var5;
         }

         var4 += var8;
         var3 += var9;
         var5 += var10;
      }

   }

   RGBSprite() {}

   static void method2770(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void method2778(PaletteSprite var1, int var2, int var3) {
      if(bottomX - topX == var1.anInt2413 && bottomY - topY == var1.anInt2414) {
         var2 += this.offsetX;
         var3 += this.offsetY;
         int var10 = var2 + var3 * width;
         int var7 = 0;
         int var6 = this.height;
         int var4 = this.width;
         int var8 = width - var4;
         int var9 = 0;
         int var5;
         if(var3 < topY) {
            var5 = topY - var3;
            var6 -= var5;
            var3 = topY;
            var7 += var5 * var4;
            var10 += var5 * width;
         }

         if(var3 + var6 > bottomY) {
            var6 -= var3 + var6 - bottomY;
         }

         if(var2 < topX) {
            var5 = topX - var2;
            var4 -= var5;
            var2 = topX;
            var7 += var5;
            var10 += var5;
            var9 += var5;
            var8 += var5;
         }

         if(var2 + var4 > bottomX) {
            var5 = var2 + var4 - bottomX;
            var4 -= var5;
            var9 += var5;
            var8 += var5;
         }

         if(var4 > 0) {
            if(var6 > 0) {
               var5 = var2 - topX + (var3 - topY) * var1.anInt2413;
               int var11 = var1.anInt2413 - var4;
               method2768(renderPixels, this.pixels, 0, var7, var10, var5, var4, var6, var8, var9, var11, var1.pixels);
            }
         }
      } else {
         throw new IllegalStateException();
      }
   }

   public void method2782(int offset) {
      if(this.width != this.maxWidth || this.height != this.maxHeight) {
         int xOff = offset;
         if(offset > this.offsetX) {
            xOff = this.offsetX;
         }

         int xPos = offset;
         if(offset + this.offsetX + this.width > this.maxWidth) {
            xPos = this.maxWidth - this.offsetX - this.width;
         }

         int yOff = offset;
         if(offset > this.offsetY) {
            yOff = this.offsetY;
         }

         int yPos = offset;
         if(offset + this.offsetY + this.height > this.maxHeight) {
            yPos = this.maxHeight - this.offsetY - this.height;
         }

         int newWidth = this.width + xOff + xPos;
         int newHeight = this.height + yOff + yPos;
         int[] newPixels = new int[newWidth * newHeight];

         for(int y = 0; y < this.height; ++y) {
            for(int x = 0; x < this.width; ++x) {
               newPixels[(y + yOff) * newWidth + x + xOff] = this.pixels[y * this.width + x];
            }
         }

         this.pixels = newPixels;
         this.width = newWidth;
         this.height = newHeight;
         this.offsetX -= xOff;
         this.offsetY -= yOff;
      }
   }

   public void method2792() {
      if(this.width != this.maxWidth || this.height != this.maxHeight) {
         int[] newPixels = new int[this.maxWidth * this.maxHeight];

         for(int y = 0; y < this.height; ++y) {
            for(int x = 0; x < this.width; ++x) {
               newPixels[(y + this.offsetY) * this.maxWidth + x + this.offsetX] = this.pixels[y * this.width + x];
            }
         }

         this.pixels = newPixels;
         this.width = this.maxWidth;
         this.height = this.maxHeight;
         this.offsetX = 0;
         this.offsetY = 0;
      }
   }

   public void method2814(int newPixel) {
      for(int yPos = this.height - 1; yPos > 0; --yPos) {
         int xOff = yPos * this.width;

         for(int xPos = this.width - 1; xPos > 0; --xPos) {
            if(this.pixels[xPos + xOff] == 0 && this.pixels[xPos + xOff - 1 - this.width] != 0) {
               this.pixels[xPos + xOff] = newPixel;
            }
         }
      }

   }

   public void method2818(int var1, int var2, int var3) {
      var1 += this.offsetX;
      var2 += this.offsetY;
      int var6 = var1 + var2 * width;
      int var10 = 0;
      int var7 = this.height;
      int var4 = this.width;
      int var8 = width - var4;
      int var9 = 0;
      int var5;
      if(var2 < topY) {
         var5 = topY - var2;
         var7 -= var5;
         var2 = topY;
         var10 += var5 * var4;
         var6 += var5 * width;
      }

      if(var2 + var7 > bottomY) {
         var7 -= var2 + var7 - bottomY;
      }

      if(var1 < topX) {
         var5 = topX - var1;
         var4 -= var5;
         var1 = topX;
         var10 += var5;
         var6 += var5;
         var9 += var5;
         var8 += var5;
      }

      if(var1 + var4 > bottomX) {
         var5 = var1 + var4 - bottomX;
         var4 -= var5;
         var9 += var5;
         var8 += var5;
      }

      if(var4 > 0) {
         if(var7 > 0) {
            method2761(renderPixels, this.pixels, 0, var10, var6, var4, var7, var8, var9, var3);
         }
      }
   }

   public void flipVertical() {
      int[] newPixels = new int[this.width * this.height];
      int pos = 0;

      for(int y = 0; y < this.height; ++y) {
         for(int x = this.width - 1; x >= 0; --x) {
            newPixels[pos++] = this.pixels[x + y * this.width];
         }
      }

      this.pixels = newPixels;
      this.offsetX = this.maxWidth - this.width - this.offsetX;
   }

   public RGBSprite(byte[] imageData, Component var2) {
      try {
         Image var3 = Toolkit.getDefaultToolkit().createImage(imageData);
         MediaTracker var4 = new MediaTracker(var2);
         var4.addImage(var3, 0);
         var4.waitForAll();
         this.width = var3.getWidth(var2);
         this.height = var3.getHeight(var2);
         this.maxWidth = this.width;
         this.maxHeight = this.height;
         this.offsetX = 0;
         this.offsetY = 0;
         this.pixels = new int[this.width * this.height];
         PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.width, this.height, this.pixels, 0, this.width);
         var5.grabPixels();
      } catch (InterruptedException var6) {
         ;
      }
   }
}
