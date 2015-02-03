import java.awt.*;
import java.awt.image.*;

public final class RGBSprite extends Rasterizer2D {

   /*int offsetY;
   int clipWidth;
   int setY;
   int offsetX;
   public int maxHeight;
   public int maxWidth;
   public int[] pixels;

   public BufferedImage getBufferedImage() {
      BufferedImage bi = new BufferedImage(this.clipWidth, this.setY, BufferedImage.TYPE_INT_RGB);
      bi.setRGB(0, 0, this.clipWidth, this.setY, pixels, 0, this.clipWidth);
      Image img = makeColorTransparent(bi, new Color(0, 0, 0));
      BufferedImage trans = imageToBufferedImage(img);
      return trans;
   }

   public static Image makeColorTransparent(BufferedImage im, final Color color) {
      RGBImageFilter filter = new RGBImageFilter() {
         public int markerRGB = color.getRGB() | 0xFF000000;
         public final int filterRGB(int x, int y, int rgb) {
            if ((rgb | 0xFF000000) == markerRGB) {
               return 0x00FFFFFF & rgb;
            } else {
               return rgb;
            }
         }
      };
      ImageProducer ip = new FilteredImageSource(im.getSource(), filter);
      return Toolkit.getDefaultToolkit().createImage(ip);
   }

   private static BufferedImage imageToBufferedImage(Image image) {
      BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
      Graphics2D g2 = bufferedImage.createGraphics();
      g2.drawImage(image, 0, 0, null);
      g2.dispose();
      return bufferedImage;
   }

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
            var8.maxHeight = Class9.anInt122 * 93011449;
            var8.maxWidth = Class9.anInt121 * -1272520477;
            var8.offsetY = Class88.anIntArray1316[var6];
            var8.offsetX = Class9.anIntArray123[var6];
            var8.clipWidth = PaletteSprite.lastLoadedPaletteSpriteWidth[var6];
            var8.setY = Class9.anIntArray126[var6];
            int var5 = var8.clipWidth * var8.setY;
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
         int var29 = ((this.clipWidth << 4) - var1) * var21 + -var2 * var20;
         int var34 = -((this.clipWidth << 4) - var1) * var20 + -var2 * var21;
         int var32 = -var1 * var21 + ((this.setY << 4) - var2) * var20;
         int var26 = -(-var1) * var20 + ((this.setY << 4) - var2) * var21;
         int var27 = ((this.clipWidth << 4) - var1) * var21 + ((this.setY << 4) - var2) * var20;
         int var28 = -((this.clipWidth << 4) - var1) * var20 + ((this.setY << 4) - var2) * var21;
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
               int var12 = var25 * clipWidth + var31;
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
                     for(var7 = var30; var7 < 0; var12 += clipWidth) {
                        var35 = var12;
                        var15 = var8;
                        var13 = var10;
                        var17 = var24;
                        if(var8 >= 0 && var10 >= 0 && var8 - (this.clipWidth << 12) < 0 && var10 - (this.setY << 12) < 0) {
                           for(; var17 < 0; ++var17) {
                              var33 = this.pixels[(var13 >> 12) * this.clipWidth + (var15 >> 12)];
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
                     for(var7 = var30; var7 < 0; var12 += clipWidth) {
                        var35 = var12;
                        var15 = var8;
                        var13 = var10 + (var14 * var9 >> 4);
                        var17 = var24;
                        if(var8 >= 0 && var8 - (this.clipWidth << 12) < 0) {
                           if((var16 = var13 - (this.setY << 12)) >= 0) {
                              var16 = (var9 - var16) / var9;
                              var17 = var24 + var16;
                              var13 += var9 * var16;
                              var35 = var12 + var16;
                           }

                           if((var16 = (var13 - var9) / var9) > var17) {
                              var17 = var16;
                           }

                           while(var17 < 0) {
                              var33 = this.pixels[(var13 >> 12) * this.clipWidth + (var15 >> 12)];
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
                     for(var7 = var30; var7 < 0; var12 += clipWidth) {
                        var35 = var12;
                        var15 = var8;
                        var13 = var10 + (var14 * var9 >> 4);
                        var17 = var24;
                        if(var8 >= 0 && var8 - (this.clipWidth << 12) < 0) {
                           if(var13 < 0) {
                              var16 = (var9 - 1 - var13) / var9;
                              var17 = var24 + var16;
                              var13 += var9 * var16;
                              var35 = var12 + var16;
                           }

                           if((var16 = (1 + var13 - (this.setY << 12) - var9) / var9) > var17) {
                              var17 = var16;
                           }

                           while(var17 < 0) {
                              var33 = this.pixels[(var13 >> 12) * this.clipWidth + (var15 >> 12)];
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
                     for(var7 = var30; var7 < 0; var12 += clipWidth) {
                        var35 = var12;
                        var15 = var8 + (var14 * var11 >> 4);
                        var13 = var10;
                        var17 = var24;
                        if(var10 >= 0 && var10 - (this.setY << 12) < 0) {
                           if((var16 = var15 - (this.clipWidth << 12)) >= 0) {
                              var16 = (var11 - var16) / var11;
                              var17 = var24 + var16;
                              var15 += var11 * var16;
                              var35 = var12 + var16;
                           }

                           if((var16 = (var15 - var11) / var11) > var17) {
                              var17 = var16;
                           }

                           while(var17 < 0) {
                              var33 = this.pixels[(var13 >> 12) * this.clipWidth + (var15 >> 12)];
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
                     for(var7 = var30; var7 < 0; var12 += clipWidth) {
                        var35 = var12;
                        var15 = var8 + (var14 * var11 >> 4);
                        var13 = var10 + (var14 * var9 >> 4);
                        var17 = var24;
                        if((var16 = var15 - (this.clipWidth << 12)) >= 0) {
                           var16 = (var11 - var16) / var11;
                           var17 = var24 + var16;
                           var15 += var11 * var16;
                           var13 += var9 * var16;
                           var35 = var12 + var16;
                        }

                        if((var16 = (var15 - var11) / var11) > var17) {
                           var17 = var16;
                        }

                        if((var16 = var13 - (this.setY << 12)) >= 0) {
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
                           var33 = this.pixels[(var13 >> 12) * this.clipWidth + (var15 >> 12)];
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
                     for(var7 = var30; var7 < 0; var12 += clipWidth) {
                        var35 = var12;
                        var15 = var8 + (var14 * var11 >> 4);
                        var13 = var10 + (var14 * var9 >> 4);
                        var17 = var24;
                        if((var16 = var15 - (this.clipWidth << 12)) >= 0) {
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

                        if((var16 = (1 + var13 - (this.setY << 12) - var9) / var9) > var17) {
                           var17 = var16;
                        }

                        while(var17 < 0) {
                           var33 = this.pixels[(var13 >> 12) * this.clipWidth + (var15 >> 12)];
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
                  for(var7 = var30; var7 < 0; var12 += clipWidth) {
                     var35 = var12;
                     var15 = var8 + (var14 * var11 >> 4);
                     var13 = var10;
                     var17 = var24;
                     if(var10 >= 0 && var10 - (this.setY << 12) < 0) {
                        if(var15 < 0) {
                           var16 = (var11 - 1 - var15) / var11;
                           var17 = var24 + var16;
                           var15 += var11 * var16;
                           var35 = var12 + var16;
                        }

                        if((var16 = (1 + var15 - (this.clipWidth << 12) - var11) / var11) > var17) {
                           var17 = var16;
                        }

                        while(var17 < 0) {
                           var33 = this.pixels[(var13 >> 12) * this.clipWidth + (var15 >> 12)];
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
                  for(var7 = var30; var7 < 0; var12 += clipWidth) {
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

                     if((var16 = (1 + var15 - (this.clipWidth << 12) - var11) / var11) > var17) {
                        var17 = var16;
                     }

                     if((var16 = var13 - (this.setY << 12)) >= 0) {
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
                        var33 = this.pixels[(var13 >> 12) * this.clipWidth + (var15 >> 12)];
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
                  for(var7 = var30; var7 < 0; var12 += clipWidth) {
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

                     if((var16 = (1 + var15 - (this.clipWidth << 12) - var11) / var11) > var17) {
                        var17 = var16;
                     }

                     if(var13 < 0) {
                        var16 = (var9 - 1 - var13) / var9;
                        var17 += var16;
                        var15 += var11 * var16;
                        var13 += var9 * var16;
                        var35 += var16;
                     }

                     if((var16 = (1 + var13 - (this.setY << 12) - var9) / var9) > var17) {
                        var17 = var16;
                     }

                     while(var17 < 0) {
                        var33 = this.pixels[(var13 >> 12) * this.clipWidth + (var15 >> 12)];
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

   public RGBSprite(int clipWidth, int setY) {
      this.pixels = new int[clipWidth * setY];
      this.clipWidth = this.maxWidth = clipWidth;
      this.setY = this.maxHeight = setY;
      this.offsetY = 0;
      this.offsetX = 0;
   }

   public RGBSprite method2743() {
      RGBSprite var1 = new RGBSprite(this.clipWidth, this.setY);
      var1.maxWidth = this.maxWidth;
      var1.maxHeight = this.maxHeight;
      var1.offsetX = this.maxWidth - this.clipWidth - this.offsetX;
      var1.offsetY = this.offsetY;

      for(int var2 = 0; var2 < this.setY; ++var2) {
         for(int var3 = 0; var3 < this.clipWidth; ++var3) {
            var1.pixels[var2 * this.clipWidth + var3] = this.pixels[var2 * this.clipWidth + this.clipWidth - 1 - var3];
         }
      }

      return var1;
   }

   public void method2744() {
      copySprite(this.pixels, this.clipWidth, this.setY);
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
      int var4 = x + y * clipWidth;
      int var8 = 0;
      int var6 = this.setY;
      int var3 = this.clipWidth;
      int var9 = clipWidth - var3;
      int var7 = 0;
      int var5;
      if(y < topY) {
         var5 = topY - y;
         var6 -= var5;
         y = topY;
         var8 += var5 * var3;
         var4 += var5 * clipWidth;
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
      int[] newPixels = new int[this.clipWidth * this.setY];
      int pos = 0;

      for(int y = this.setY - 1; y >= 0; --y) {
         for(int x = 0; x < this.clipWidth; ++x) {
            newPixels[pos++] = this.pixels[x + y * this.clipWidth];
         }
      }

      this.pixels = newPixels;
      this.offsetY = this.maxHeight - this.setY - this.offsetY;
   }

   public void setPixels(int newPixel) {
      int[] newPixels = new int[this.clipWidth * this.setY];
      int pos = 0;

      for(int y = 0; y < this.setY; ++y) {
         for(int x = 0; x < this.clipWidth; ++x) {
            int pixel = this.pixels[pos];
            if(pixel == 0) {
               if(x > 0 && this.pixels[pos - 1] != 0) {
                  pixel = newPixel;
               } else if(y > 0 && this.pixels[pos - this.clipWidth] != 0) {
                  pixel = newPixel;
               } else if(x < this.clipWidth - 1 && this.pixels[pos + 1] != 0) {
                  pixel = newPixel;
               } else if(y < this.setY - 1 && this.pixels[pos + this.clipWidth] != 0) {
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
         int var17 = var1 + var2 * clipWidth;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               renderPixels[var19++] = this.pixels[(var20 >> 16) + (var21 >> 16) * this.clipWidth];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += clipWidth;
         }

      } catch (Exception var22) {
         ;
      }
   }

   public void method2756(int var1, int var2, int var3, int var4) {
      if(var3 > 0) {
         if(var4 > 0) {
            int var10 = this.clipWidth;
            int var5 = this.setY;
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

            var14 = var1 + var2 * clipWidth;
            int var8 = clipWidth - var3;
            if(var2 + var4 > bottomY) {
               var4 -= var2 + var4 - bottomY;
            }

            int var9;
            if(var2 < topY) {
               var9 = topY - var2;
               var4 -= var9;
               var14 += var9 * clipWidth;
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
         int var7 = var1 + var2 * clipWidth;
         int var11 = 0;
         int var8 = this.setY;
         int var5 = this.clipWidth;
         int var9 = clipWidth - var5;
         int var10 = 0;
         int var6;
         if(var2 < topY) {
            var6 = topY - var2;
            var8 -= var6;
            var2 = topY;
            var11 += var6 * var5;
            var7 += var6 * clipWidth;
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
            int var15 = this.clipWidth;
            int var10 = this.setY;
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

            var6 = var1 + var2 * clipWidth;
            int var14 = clipWidth - var3;
            if(var2 + var4 > bottomY) {
               var4 -= var2 + var4 - bottomY;
            }

            int var7;
            if(var2 < topY) {
               var7 = topY - var2;
               var4 -= var7;
               var6 += var7 * clipWidth;
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
         int var16 = var1 + var2 * clipWidth;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.pixels[(var18 >> 16) + (var19 >> 16) * this.clipWidth];
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
            var16 += clipWidth;
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
      int var8 = var1 + var2 * clipWidth;
      int var5 = 0;
      int var3 = this.setY;
      int var6 = this.clipWidth;
      int var9 = clipWidth - var6;
      int var4 = 0;
      int var7;
      if(var2 < topY) {
         var7 = topY - var2;
         var3 -= var7;
         var2 = topY;
         var5 += var7 * var6;
         var8 += var7 * clipWidth;
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
         int var10 = var2 + var3 * clipWidth;
         int var7 = 0;
         int var6 = this.setY;
         int var4 = this.clipWidth;
         int var8 = clipWidth - var4;
         int var9 = 0;
         int var5;
         if(var3 < topY) {
            var5 = topY - var3;
            var6 -= var5;
            var3 = topY;
            var7 += var5 * var4;
            var10 += var5 * clipWidth;
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
      if(this.clipWidth != this.maxWidth || this.setY != this.maxHeight) {
         int xOff = offset;
         if(offset > this.offsetX) {
            xOff = this.offsetX;
         }

         int xPos = offset;
         if(offset + this.offsetX + this.clipWidth > this.maxWidth) {
            xPos = this.maxWidth - this.offsetX - this.clipWidth;
         }

         int yOff = offset;
         if(offset > this.offsetY) {
            yOff = this.offsetY;
         }

         int yPos = offset;
         if(offset + this.offsetY + this.setY > this.maxHeight) {
            yPos = this.maxHeight - this.offsetY - this.setY;
         }

         int newWidth = this.clipWidth + xOff + xPos;
         int newHeight = this.setY + yOff + yPos;
         int[] newPixels = new int[newWidth * newHeight];

         for(int y = 0; y < this.setY; ++y) {
            for(int x = 0; x < this.clipWidth; ++x) {
               newPixels[(y + yOff) * newWidth + x + xOff] = this.pixels[y * this.clipWidth + x];
            }
         }

         this.pixels = newPixels;
         this.clipWidth = newWidth;
         this.setY = newHeight;
         this.offsetX -= xOff;
         this.offsetY -= yOff;
      }
   }

   public void method2792() {
      if(this.clipWidth != this.maxWidth || this.setY != this.maxHeight) {
         int[] newPixels = new int[this.maxWidth * this.maxHeight];

         for(int y = 0; y < this.setY; ++y) {
            for(int x = 0; x < this.clipWidth; ++x) {
               newPixels[(y + this.offsetY) * this.maxWidth + x + this.offsetX] = this.pixels[y * this.clipWidth + x];
            }
         }

         this.pixels = newPixels;
         this.clipWidth = this.maxWidth;
         this.setY = this.maxHeight;
         this.offsetX = 0;
         this.offsetY = 0;
      }
   }

   public void method2814(int newPixel) {
      for(int yPos = this.setY - 1; yPos > 0; --yPos) {
         int xOff = yPos * this.clipWidth;

         for(int xPos = this.clipWidth - 1; xPos > 0; --xPos) {
            if(this.pixels[xPos + xOff] == 0 && this.pixels[xPos + xOff - 1 - this.clipWidth] != 0) {
               this.pixels[xPos + xOff] = newPixel;
            }
         }
      }

   }

   public void method2818(int var1, int var2, int var3) {
      var1 += this.offsetX;
      var2 += this.offsetY;
      int var6 = var1 + var2 * clipWidth;
      int var10 = 0;
      int var7 = this.setY;
      int var4 = this.clipWidth;
      int var8 = clipWidth - var4;
      int var9 = 0;
      int var5;
      if(var2 < topY) {
         var5 = topY - var2;
         var7 -= var5;
         var2 = topY;
         var10 += var5 * var4;
         var6 += var5 * clipWidth;
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
      int[] newPixels = new int[this.clipWidth * this.setY];
      int pos = 0;

      for(int y = 0; y < this.setY; ++y) {
         for(int x = this.clipWidth - 1; x >= 0; --x) {
            newPixels[pos++] = this.pixels[x + y * this.clipWidth];
         }
      }

      this.pixels = newPixels;
      this.offsetX = this.maxWidth - this.clipWidth - this.offsetX;
   }

   public RGBSprite(byte[] imageData, Component var2) {
      try {
         Image var3 = Toolkit.getDefaultToolkit().createImage(imageData);
         MediaTracker var4 = new MediaTracker(var2);
         var4.addImage(var3, 0);
         var4.waitForAll();
         this.clipWidth = var3.getWidth(var2);
         this.setY = var3.getHeight(var2);
         this.maxWidth = this.clipWidth;
         this.maxHeight = this.setY;
         this.offsetX = 0;
         this.offsetY = 0;
         this.pixels = new int[this.clipWidth * this.setY];
         PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.clipWidth, this.setY, this.pixels, 0, this.clipWidth);
         var5.grabPixels();
      } catch (InterruptedException var6) {
         ;
      }
   }*/

   int offsetX;
   int spriteWidth;
   int spriteHeight;
   int offsetY;
   public int maxHeight;
   public int maxWidth;
   public int[] pixels;

   public static RGBSprite getRGBSprite(AbstractIndex index, int archiveId, int fileId, byte var3) {
      if(!PaletteSprite.loadPaletteSprite(index, archiveId, fileId, -1593817854)) {
         return null;
      } else {
         RGBSprite sprite = new RGBSprite();
         sprite.maxWidth = Class9.anInt122 * 93011449;
         sprite.maxHeight = Class9.anInt121 * -1272520477;
         sprite.offsetX = Class88.anIntArray1316[0];
         sprite.offsetY = Class9.anIntArray123[0];
         sprite.spriteWidth = PaletteSprite.lastLoadedPaletteSpriteWidth[0];
         sprite.spriteHeight = Class9.anIntArray126[0];
         int dimmension = sprite.spriteWidth * sprite.spriteHeight;
         byte[] var6 = RSFont.loadedCharacterPixels[0];
         sprite.pixels = new int[dimmension];

         for(int pos = 0; pos < dimmension; ++pos) {
            sprite.pixels[pos] = Class9.anIntArray130[var6[pos] & 255];
         }

         PaletteSprite.resetLastPaletteValues((byte) 99);
         return sprite;
      }
   }

   public static RGBSprite getRGBSpriteForName(AbstractIndex spriteIndex, String archiveName, String fileName, int var3) {
      int archiveID = spriteIndex.getArchiveIDForName(archiveName, 1723285154);
      int fileID = spriteIndex.getFileIDForName(archiveID, fileName);
      return getRGBSprite(spriteIndex, archiveID, fileID, (byte) 80);
   }


   public BufferedImage getBufferedImage() {
      BufferedImage bi = new BufferedImage(spriteWidth, spriteHeight, BufferedImage.TYPE_INT_RGB);
      bi.setRGB(0, 0, spriteWidth, spriteHeight, pixels, 0, spriteWidth);
      Image img = makeColorTransparent(bi, new Color(0, 0, 0));
      BufferedImage trans = imageToBufferedImage(img);
      return trans;
   }

   public static Image makeColorTransparent(BufferedImage im, final Color color) {
      RGBImageFilter filter = new RGBImageFilter() {
         public int markerRGB = color.getRGB() | 0xFF000000;
         public final int filterRGB(int x, int y, int rgb) {
            if ((rgb | 0xFF000000) == markerRGB) {
               return 0x00FFFFFF & rgb;
            } else {
               return rgb;
            }
         }
      };
      ImageProducer ip = new FilteredImageSource(im.getSource(), filter);
      return Toolkit.getDefaultToolkit().createImage(ip);
   }

   private static BufferedImage imageToBufferedImage(Image image) {
      BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
      Graphics2D g2 = bufferedImage.createGraphics();
      g2.drawImage(image, 0, 0, null);
      g2.dispose();
      return bufferedImage;
   }

   public static RGBSprite[] loadRGBSpriteSetForNames(AbstractIndex spriteIndex, String archiveName, String fileName, short var3) {
      int archiveID = spriteIndex.getArchiveIDForName(archiveName, 1723285154);
      int fileID = spriteIndex.getFileIDForName(archiveID, fileName);
      return loadRGBSpriteSet(spriteIndex, archiveID, fileID, -893370861);
   }

   static RGBSprite[] loadRGBSpriteSet(AbstractIndex var0, int var1, int var2, int var3) {
      if (!PaletteSprite.loadPaletteSprite(var0, var1, var2, -1626517407)) {
         return null;
      } else {
         RGBSprite[] var7 = new RGBSprite[Class9.anInt125 * 2039617935];

         for (int var6 = 0; var6 < Class9.anInt125 * 2039617935; ++var6) {
            RGBSprite var8 = var7[var6] = new RGBSprite();
            var8.maxHeight = Class9.anInt122 * 93011449;
            var8.maxWidth = Class9.anInt121 * -1272520477;
            var8.offsetX = Class88.anIntArray1316[var6];
            var8.offsetY = Class9.anIntArray123[var6];
            var8.spriteWidth = PaletteSprite.lastLoadedPaletteSpriteWidth[var6];
            var8.spriteHeight = Class9.anIntArray126[var6];
            int var5 = var8.spriteWidth * var8.spriteHeight;
            byte[] var9 = RSFont.loadedCharacterPixels[var6];
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
         var1 -= this.offsetY << 4;
         var2 -= this.offsetX << 4;
         double var18 = (double)(var5 & '\uffff') * 9.587379924285257E-5D;
         int var20 = (int)Math.floor(Math.sin(var18) * (double)var6 + 0.5D);
         int var21 = (int)Math.floor(Math.cos(var18) * (double)var6 + 0.5D);
         int var22 = -var1 * var21 + -var2 * var20;
         int var23 = -(-var1) * var20 + -var2 * var21;
         int var29 = ((this.spriteWidth << 4) - var1) * var21 + -var2 * var20;
         int var34 = -((this.spriteWidth << 4) - var1) * var20 + -var2 * var21;
         int var32 = -var1 * var21 + ((this.spriteHeight << 4) - var2) * var20;
         int var26 = -(-var1) * var20 + ((this.spriteHeight << 4) - var2) * var21;
         int var27 = ((this.spriteWidth << 4) - var1) * var21 + ((this.spriteHeight << 4) - var2) * var20;
         int var28 = -((this.spriteWidth << 4) - var1) * var20 + ((this.spriteHeight << 4) - var2) * var21;
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
               int var12 = var25 * renderWidth + var31;
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
                     for(var7 = var30; var7 < 0; var12 += renderWidth) {
                        var35 = var12;
                        var15 = var8;
                        var13 = var10;
                        var17 = var24;
                        if(var8 >= 0 && var10 >= 0 && var8 - (this.spriteWidth << 12) < 0 && var10 - (this.spriteHeight << 12) < 0) {
                           for(; var17 < 0; ++var17) {
                              var33 = this.pixels[(var13 >> 12) * this.spriteWidth + (var15 >> 12)];
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
                     for(var7 = var30; var7 < 0; var12 += renderWidth) {
                        var35 = var12;
                        var15 = var8;
                        var13 = var10 + (var14 * var9 >> 4);
                        var17 = var24;
                        if(var8 >= 0 && var8 - (this.spriteWidth << 12) < 0) {
                           if((var16 = var13 - (this.spriteHeight << 12)) >= 0) {
                              var16 = (var9 - var16) / var9;
                              var17 = var24 + var16;
                              var13 += var9 * var16;
                              var35 = var12 + var16;
                           }

                           if((var16 = (var13 - var9) / var9) > var17) {
                              var17 = var16;
                           }

                           while(var17 < 0) {
                              var33 = this.pixels[(var13 >> 12) * this.spriteWidth + (var15 >> 12)];
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
                     for(var7 = var30; var7 < 0; var12 += renderWidth) {
                        var35 = var12;
                        var15 = var8;
                        var13 = var10 + (var14 * var9 >> 4);
                        var17 = var24;
                        if(var8 >= 0 && var8 - (this.spriteWidth << 12) < 0) {
                           if(var13 < 0) {
                              var16 = (var9 - 1 - var13) / var9;
                              var17 = var24 + var16;
                              var13 += var9 * var16;
                              var35 = var12 + var16;
                           }

                           if((var16 = (1 + var13 - (this.spriteHeight << 12) - var9) / var9) > var17) {
                              var17 = var16;
                           }

                           while(var17 < 0) {
                              var33 = this.pixels[(var13 >> 12) * this.spriteWidth + (var15 >> 12)];
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
                     for(var7 = var30; var7 < 0; var12 += renderWidth) {
                        var35 = var12;
                        var15 = var8 + (var14 * var11 >> 4);
                        var13 = var10;
                        var17 = var24;
                        if(var10 >= 0 && var10 - (this.spriteHeight << 12) < 0) {
                           if((var16 = var15 - (this.spriteWidth << 12)) >= 0) {
                              var16 = (var11 - var16) / var11;
                              var17 = var24 + var16;
                              var15 += var11 * var16;
                              var35 = var12 + var16;
                           }

                           if((var16 = (var15 - var11) / var11) > var17) {
                              var17 = var16;
                           }

                           while(var17 < 0) {
                              var33 = this.pixels[(var13 >> 12) * this.spriteWidth + (var15 >> 12)];
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
                     for(var7 = var30; var7 < 0; var12 += renderWidth) {
                        var35 = var12;
                        var15 = var8 + (var14 * var11 >> 4);
                        var13 = var10 + (var14 * var9 >> 4);
                        var17 = var24;
                        if((var16 = var15 - (this.spriteWidth << 12)) >= 0) {
                           var16 = (var11 - var16) / var11;
                           var17 = var24 + var16;
                           var15 += var11 * var16;
                           var13 += var9 * var16;
                           var35 = var12 + var16;
                        }

                        if((var16 = (var15 - var11) / var11) > var17) {
                           var17 = var16;
                        }

                        if((var16 = var13 - (this.spriteHeight << 12)) >= 0) {
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
                           var33 = this.pixels[(var13 >> 12) * this.spriteWidth + (var15 >> 12)];
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
                     for(var7 = var30; var7 < 0; var12 += renderWidth) {
                        var35 = var12;
                        var15 = var8 + (var14 * var11 >> 4);
                        var13 = var10 + (var14 * var9 >> 4);
                        var17 = var24;
                        if((var16 = var15 - (this.spriteWidth << 12)) >= 0) {
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

                        if((var16 = (1 + var13 - (this.spriteHeight << 12) - var9) / var9) > var17) {
                           var17 = var16;
                        }

                        while(var17 < 0) {
                           var33 = this.pixels[(var13 >> 12) * this.spriteWidth + (var15 >> 12)];
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
                  for(var7 = var30; var7 < 0; var12 += renderWidth) {
                     var35 = var12;
                     var15 = var8 + (var14 * var11 >> 4);
                     var13 = var10;
                     var17 = var24;
                     if(var10 >= 0 && var10 - (this.spriteHeight << 12) < 0) {
                        if(var15 < 0) {
                           var16 = (var11 - 1 - var15) / var11;
                           var17 = var24 + var16;
                           var15 += var11 * var16;
                           var35 = var12 + var16;
                        }

                        if((var16 = (1 + var15 - (this.spriteWidth << 12) - var11) / var11) > var17) {
                           var17 = var16;
                        }

                        while(var17 < 0) {
                           var33 = this.pixels[(var13 >> 12) * this.spriteWidth + (var15 >> 12)];
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
                  for(var7 = var30; var7 < 0; var12 += renderWidth) {
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

                     if((var16 = (1 + var15 - (this.spriteWidth << 12) - var11) / var11) > var17) {
                        var17 = var16;
                     }

                     if((var16 = var13 - (this.spriteHeight << 12)) >= 0) {
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
                        var33 = this.pixels[(var13 >> 12) * this.spriteWidth + (var15 >> 12)];
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
                  for(var7 = var30; var7 < 0; var12 += renderWidth) {
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

                     if((var16 = (1 + var15 - (this.spriteWidth << 12) - var11) / var11) > var17) {
                        var17 = var16;
                     }

                     if(var13 < 0) {
                        var16 = (var9 - 1 - var13) / var9;
                        var17 += var16;
                        var15 += var11 * var16;
                        var13 += var9 * var16;
                        var35 += var16;
                     }

                     if((var16 = (1 + var13 - (this.spriteHeight << 12) - var9) / var9) > var17) {
                        var17 = var16;
                     }

                     while(var17 < 0) {
                        var33 = this.pixels[(var13 >> 12) * this.spriteWidth + (var15 >> 12)];
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

   public RGBSprite(int var1, int var2) {
      this.pixels = new int[var1 * var2];
      this.spriteWidth = this.maxWidth = var1;
      this.spriteHeight = this.maxHeight = var2;
      this.offsetX = 0;
      this.offsetY = 0;
   }

   public RGBSprite method2743() {
      RGBSprite var1 = new RGBSprite(this.spriteWidth, this.spriteHeight);
      var1.maxWidth = this.maxWidth;
      var1.maxHeight = this.maxHeight;
      var1.offsetY = this.maxWidth - this.spriteWidth - this.offsetY;
      var1.offsetX = this.offsetX;

      for(int var2 = 0; var2 < this.spriteHeight; ++var2) {
         for(int var3 = 0; var3 < this.spriteWidth; ++var3) {
            var1.pixels[var2 * this.spriteWidth + var3] = this.pixels[var2 * this.spriteWidth + this.spriteWidth - 1 - var3];
         }
      }

      return var1;
   }

   public void method2744() {
      copySprite(this.pixels, this.spriteWidth, this.spriteHeight);
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
      x += this.offsetY;
      y += this.offsetX;
      int var4 = x + y * renderWidth;
      int var8 = 0;
      int var6 = this.spriteHeight;
      int var3 = this.spriteWidth;
      int var9 = renderWidth - var3;
      int var7 = 0;
      int var5;
      if(y < topY) {
         var5 = topY - y;
         var6 -= var5;
         y = topY;
         var8 += var5 * var3;
         var4 += var5 * renderWidth;
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
      int[] var1 = new int[this.spriteWidth * this.spriteHeight];
      int var4 = 0;

      for(int var2 = this.spriteHeight - 1; var2 >= 0; --var2) {
         for(int var3 = 0; var3 < this.spriteWidth; ++var3) {
            var1[var4++] = this.pixels[var3 + var2 * this.spriteWidth];
         }
      }

      this.pixels = var1;
      this.offsetX = this.maxHeight - this.spriteHeight - this.offsetX;
   }

   public void setPixels(int var1) {
      int[] var2 = new int[this.spriteWidth * this.spriteHeight];
      int var4 = 0;

      for(int var5 = 0; var5 < this.spriteHeight; ++var5) {
         for(int var3 = 0; var3 < this.spriteWidth; ++var3) {
            int var6 = this.pixels[var4];
            if(var6 == 0) {
               if(var3 > 0 && this.pixels[var4 - 1] != 0) {
                  var6 = var1;
               } else if(var5 > 0 && this.pixels[var4 - this.spriteWidth] != 0) {
                  var6 = var1;
               } else if(var3 < this.spriteWidth - 1 && this.pixels[var4 + 1] != 0) {
                  var6 = var1;
               } else if(var5 < this.spriteHeight - 1 && this.pixels[var4 + this.spriteWidth] != 0) {
                  var6 = var1;
               }
            }

            var2[var4++] = var6;
         }
      }

      this.pixels = var2;
   }

   static void method2751(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = 256 - var12;
      int var18 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = (var4 >> 16) * var11;

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if(var2 != 0) {
               int var14 = var0[var5];
               var0[var5++] = ((var2 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var14 & '\uff00') * var13 & 16711680) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var18;
         var5 += var6;
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
         int var17 = var1 + var2 * renderWidth;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               renderPixels[var19++] = this.pixels[(var20 >> 16) + (var21 >> 16) * this.spriteWidth];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += renderWidth;
         }

      } catch (Exception var22) {
         ;
      }
   }

   public void method2756(int var1, int var2, int var3, int var4) {
      if(var3 > 0) {
         if(var4 > 0) {
            int var10 = this.spriteWidth;
            int var5 = this.spriteHeight;
            int var11 = 0;
            int var6 = 0;
            int var15 = this.maxWidth;
            int var13 = this.maxHeight;
            int var12 = (var15 << 16) / var3;
            int var7 = (var13 << 16) / var4;
            int var14;
            if(this.offsetY > 0) {
               var14 = ((this.offsetY << 16) + var12 - 1) / var12;
               var1 += var14;
               var11 += var14 * var12 - (this.offsetY << 16);
            }

            if(this.offsetX > 0) {
               var14 = ((this.offsetX << 16) + var7 - 1) / var7;
               var2 += var14;
               var6 += var14 * var7 - (this.offsetX << 16);
            }

            if(var10 < var15) {
               var3 = ((var10 << 16) - var11 + var12 - 1) / var12;
            }

            if(var5 < var13) {
               var4 = ((var5 << 16) - var6 + var7 - 1) / var7;
            }

            var14 = var1 + var2 * renderWidth;
            int var8 = renderWidth - var3;
            if(var2 + var4 > bottomY) {
               var4 -= var2 + var4 - bottomY;
            }

            int var9;
            if(var2 < topY) {
               var9 = topY - var2;
               var4 -= var9;
               var14 += var9 * renderWidth;
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
         var1 += this.offsetY;
         var2 += this.offsetX;
         int var7 = var1 + var2 * renderWidth;
         int var11 = 0;
         int var8 = this.spriteHeight;
         int var5 = this.spriteWidth;
         int var9 = renderWidth - var5;
         int var10 = 0;
         int var6;
         if(var2 < topY) {
            var6 = topY - var2;
            var8 -= var6;
            var2 = topY;
            var11 += var6 * var5;
            var7 += var6 * renderWidth;
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
            int var15 = this.spriteWidth;
            int var10 = this.spriteHeight;
            int var11 = 0;
            int var8 = 0;
            int var16 = this.maxWidth;
            int var13 = this.maxHeight;
            int var12 = (var16 << 16) / var3;
            int var9 = (var13 << 16) / var4;
            int var6;
            if(this.offsetY > 0) {
               var6 = ((this.offsetY << 16) + var12 - 1) / var12;
               var1 += var6;
               var11 += var6 * var12 - (this.offsetY << 16);
            }

            if(this.offsetX > 0) {
               var6 = ((this.offsetX << 16) + var9 - 1) / var9;
               var2 += var6;
               var8 += var6 * var9 - (this.offsetX << 16);
            }

            if(var15 < var16) {
               var3 = ((var15 << 16) - var11 + var12 - 1) / var12;
            }

            if(var10 < var13) {
               var4 = ((var10 << 16) - var8 + var9 - 1) / var9;
            }

            var6 = var1 + var2 * renderWidth;
            int var14 = renderWidth - var3;
            if(var2 + var4 > bottomY) {
               var4 -= var2 + var4 - bottomY;
            }

            int var7;
            if(var2 < topY) {
               var7 = topY - var2;
               var4 -= var7;
               var6 += var7 * renderWidth;
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

            method2751(renderPixels, this.pixels, 0, var11, var8, var6, var14, var3, var4, var12, var9, var15, var5);
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
         int var16 = var1 + var2 * renderWidth;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.pixels[(var18 >> 16) + (var19 >> 16) * this.spriteWidth];
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
            var16 += renderWidth;
         }

      } catch (Exception var21) {
         ;
      }
   }

   public void method2766(int var1, int var2, int var3, int var4) {
      this.method2741(this.maxWidth << 3, this.maxHeight << 3, var1 << 4, var2 << 4, var3, var4);
   }

   public void drawSprite(int var1, int var2) {
      var1 += this.offsetY;
      var2 += this.offsetX;
      int var8 = var1 + var2 * renderWidth;
      int var5 = 0;
      int var3 = this.spriteHeight;
      int var6 = this.spriteWidth;
      int var9 = renderWidth - var6;
      int var4 = 0;
      int var7;
      if(var2 < topY) {
         var7 = topY - var2;
         var3 -= var7;
         var2 = topY;
         var5 += var7 * var6;
         var8 += var7 * renderWidth;
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
         var2 += this.offsetY;
         var3 += this.offsetX;
         int var10 = var2 + var3 * renderWidth;
         int var7 = 0;
         int var6 = this.spriteHeight;
         int var4 = this.spriteWidth;
         int var8 = renderWidth - var4;
         int var9 = 0;
         int var5;
         if(var3 < topY) {
            var5 = topY - var3;
            var6 -= var5;
            var3 = topY;
            var7 += var5 * var4;
            var10 += var5 * renderWidth;
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

   public void method2782(int var1) {
      if(this.spriteWidth != this.maxWidth || this.spriteHeight != this.maxHeight) {
         int var3 = var1;
         if(var1 > this.offsetY) {
            var3 = this.offsetY;
         }

         int var4 = var1;
         if(var1 + this.offsetY + this.spriteWidth > this.maxWidth) {
            var4 = this.maxWidth - this.offsetY - this.spriteWidth;
         }

         int var8 = var1;
         if(var1 > this.offsetX) {
            var8 = this.offsetX;
         }

         int var9 = var1;
         if(var1 + this.offsetX + this.spriteHeight > this.maxHeight) {
            var9 = this.maxHeight - this.offsetX - this.spriteHeight;
         }

         int var5 = this.spriteWidth + var3 + var4;
         int var6 = this.spriteHeight + var8 + var9;
         int[] var7 = new int[var5 * var6];

         for(int var10 = 0; var10 < this.spriteHeight; ++var10) {
            for(int var2 = 0; var2 < this.spriteWidth; ++var2) {
               var7[(var10 + var8) * var5 + var2 + var3] = this.pixels[var10 * this.spriteWidth + var2];
            }
         }

         this.pixels = var7;
         this.spriteWidth = var5;
         this.spriteHeight = var6;
         this.offsetY -= var3;
         this.offsetX -= var8;
      }
   }

   public void method2792() {
      if(this.spriteWidth != this.maxWidth || this.spriteHeight != this.maxHeight) {
         int[] var1 = new int[this.maxWidth * this.maxHeight];

         for(int var2 = 0; var2 < this.spriteHeight; ++var2) {
            for(int var3 = 0; var3 < this.spriteWidth; ++var3) {
               var1[(var2 + this.offsetX) * this.maxWidth + var3 + this.offsetY] = this.pixels[var2 * this.spriteWidth + var3];
            }
         }

         this.pixels = var1;
         this.spriteWidth = this.maxWidth;
         this.spriteHeight = this.maxHeight;
         this.offsetY = 0;
         this.offsetX = 0;
      }
   }

   public void method2814(int var1) {
      for(int var2 = this.spriteHeight - 1; var2 > 0; --var2) {
         int var3 = var2 * this.spriteWidth;

         for(int var4 = this.spriteWidth - 1; var4 > 0; --var4) {
            if(this.pixels[var4 + var3] == 0 && this.pixels[var4 + var3 - 1 - this.spriteWidth] != 0) {
               this.pixels[var4 + var3] = var1;
            }
         }
      }

   }

   public void method2818(int var1, int var2, int var3) {
      var1 += this.offsetY;
      var2 += this.offsetX;
      int var6 = var1 + var2 * renderWidth;
      int var10 = 0;
      int var7 = this.spriteHeight;
      int var4 = this.spriteWidth;
      int var8 = renderWidth - var4;
      int var9 = 0;
      int var5;
      if(var2 < topY) {
         var5 = topY - var2;
         var7 -= var5;
         var2 = topY;
         var10 += var5 * var4;
         var6 += var5 * renderWidth;
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
      int[] var1 = new int[this.spriteWidth * this.spriteHeight];
      int var4 = 0;

      for(int var2 = 0; var2 < this.spriteHeight; ++var2) {
         for(int var3 = this.spriteWidth - 1; var3 >= 0; --var3) {
            var1[var4++] = this.pixels[var3 + var2 * this.spriteWidth];
         }
      }

      this.pixels = var1;
      this.offsetY = this.maxWidth - this.spriteWidth - this.offsetY;
   }

   public RGBSprite(byte[] var1, Component var2) {
      try {
         Image var3 = Toolkit.getDefaultToolkit().createImage(var1);
         MediaTracker var4 = new MediaTracker(var2);
         var4.addImage(var3, 0);
         var4.waitForAll();
         this.spriteWidth = var3.getWidth(var2);
         this.spriteHeight = var3.getHeight(var2);
         this.maxWidth = this.spriteWidth;
         this.maxHeight = this.spriteHeight;
         this.offsetY = 0;
         this.offsetX = 0;
         this.pixels = new int[this.spriteWidth * this.spriteHeight];
         PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.spriteWidth, this.spriteHeight, this.pixels, 0, this.spriteWidth);
         var5.grabPixels();
      } catch (InterruptedException var6) {
         ;
      }
   }
   
}
