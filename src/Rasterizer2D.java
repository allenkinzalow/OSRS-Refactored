
public class Rasterizer2D extends CacheableNode {

   public static int renderHeight;
   public static int renderWidth;
   public static int[] renderPixels;
   public static int topY = 0;
   public static int bottomY = 0;
   protected static int bottomX = 0;
   protected static int topX = 0;


   public static void reset() {
      topX = 0;
      topY = 0;
      bottomX = renderWidth;
      bottomY = renderHeight;
   }

   static void drawVerticalLineAlpha(int x, int y, int height, int color, int alpha) {
      if(x >= topX) {
         if(x < bottomX) {
            if(y < topY) {
               height -= topY - y;
               y = topY;
            }

            if(y + height > bottomY) {
               height = bottomY - y;
            }

            int colorA = 256 - alpha;
            int colorR = (color >> 16 & 255) * alpha;
            int colorG = (color >> 8 & 255) * alpha;
            int colorB = (color & 255) * alpha;
            int pixelOffset = x + y * renderWidth;

            for(int pixelIndex = 0; pixelIndex < height; ++pixelIndex) {
               int r = (renderPixels[pixelOffset] >> 16 & 255) * colorA;
               int g = (renderPixels[pixelOffset] >> 8 & 255) * colorA;
               int b = (renderPixels[pixelOffset] & 255) * colorA;
               int pixel = (colorR + r >> 8 << 16) + (colorG + g >> 8 << 8) + (colorB + b >> 8);
               renderPixels[pixelOffset] = pixel;
               pixelOffset += renderWidth;
            }

         }
      }
   }

   public static void setRasterizerArea(int tX, int tY, int bX, int bY) {
      if(topX < tX) {
         topX = tX;
      }

      if(topY < tY) {
         topY = tY;
      }

      if(bottomX > bX) {
         bottomX = bX;
      }

      if(bottomY > bY) {
         bottomY = bY;
      }
   }

   public static void populateArea(int[] area) {
      area[0] = topX;
      area[1] = topY;
      area[2] = bottomX;
      area[3] = bottomY;
   }

   public static void resetPixels() {
      int var0 = 0;

      int var1;
      for(var1 = renderWidth * renderHeight - 7; var0 < var1; renderPixels[var0++] = 0) {
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

   public static void setRasterizationRect(int x, int y, int bX, int bY) {
      if(x < 0) {
         x = 0;
      }

      if(y < 0) {
         y = 0;
      }

      if(bX > renderWidth) {
         bX = renderWidth;
      }

      if(bY > renderHeight) {
         bY = renderHeight;
      }

      topX = x;
      topY = y;
      bottomX = bX;
      bottomY = bY;
   }

   public static void method2503(int x, int y, int width, int height, int var4, int var5) {
      int var6 = 0;
      int var12 = 65536 / height;
      if(x < topX) {
         width -= topX - x;
         x = topX;
      }

      if(y < topY) {
         var6 += (topY - y) * var12;
         height -= topY - y;
         y = topY;
      }

      if(x + width > bottomX) {
         width = bottomX - x;
      }

      if(y + height > bottomY) {
         height = bottomY - y;
      }

      int distance = Rasterizer2D.renderWidth - width;
      int pixelOffset = x + y * Rasterizer2D.renderWidth;

      for(int pixelIndex = -height; pixelIndex < 0; ++pixelIndex) {
         int var11 = 65536 - var6 >> 8;
         int var13 = var6 >> 8;
         int pixel = ((var4 & 16711935) * var11 + (var5 & 16711935) * var13 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var13 & 16711680) >>> 8;

         for(int var10 = -width; var10 < 0; ++var10) {
            renderPixels[pixelOffset++] = pixel;
         }

         pixelOffset += distance;
         var6 += var12;
      }

   }

   public static void drawUnfilledRectangle(int var0, int var1, int var2, int var3, int var4) {
      drawHorizontalLine(var0, var1, var2, var4);
      drawHorizontalLine(var0, var1 + var3 - 1, var2, var4);
      drawVerticalLine(var0, var1, var3, var4);
      drawVerticalLine(var0 + var2 - 1, var1, var3, var4);
   }

   public static void method2505(int var0, int var1, int var2, int var3, int var4, int var5) {
      drawHorizontalLineAlpha(var0, var1, var2, var4, var5);
      drawHorizontalLineAlpha(var0, var1 + var3 - 1, var2, var4, var5);
      if(var3 >= 3) {
         drawVerticalLineAlpha(var0, var1 + 1, var3 - 2, var4, var5);
         drawVerticalLineAlpha(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }
   }

   public static void drawHorizontalLine(int x, int y, int length, int color) {
      if(y >= topY) {
         if(y < bottomY) {
            if(x < topX) {
               length -= topX - x;
               x = topX;
            }

            if(x + length > bottomX) {
               length = bottomX - x;
            }

            int pixelOffset = x + y * renderWidth;

            for(int pixel = 0; pixel < length; ++pixel) {
               renderPixels[pixelOffset + pixel] = color;
            }

         }
      }
   }

   public static void drawVerticalLine(int x, int y, int length, int color) {
      if(x >= topX) {
         if(x < bottomX) {
            if(y < topY) {
               length -= topY - y;
               y = topY;
            }

            if(y + length > bottomY) {
               length = bottomY - y;
            }

            int pixelOffset = x + y * renderWidth;

            for(int pixel = 0; pixel < length; ++pixel) {
               renderPixels[pixelOffset + pixel * renderWidth] = color;
            }

         }
      }
   }

   public static void method2510(int x, int y, int xLength, int yLength, int color) {
      xLength -= x;
      yLength -= y;
      if(yLength == 0) {
         if(xLength >= 0) {
            drawHorizontalLine(x, y, xLength + 1, color);
         } else {
            drawHorizontalLine(x + xLength, y, -xLength + 1, color);
         }
      } else if(xLength == 0) {
         if(yLength >= 0) {
            drawVerticalLine(x, y, yLength + 1, color);
         } else {
            drawVerticalLine(x, y + yLength, -yLength + 1, color);
         }
      } else {
         if(xLength + yLength < 0) {
            x += xLength;
            xLength = -xLength;
            y += yLength;
            yLength = -yLength;
         }

         int var5;
         int var6;
         if(xLength <= yLength) {
            x <<= 16;
            x += '\u8000';
            xLength <<= 16;
            var6 = (int)Math.floor((double)xLength / (double)yLength + 0.5D);
            yLength += y;
            if(y < topY) {
               x += var6 * (topY - y);
               y = topY;
            }

            if(yLength >= bottomY) {
               yLength = bottomY - 1;
            }

            while(y <= yLength) {
               var5 = x >> 16;
               if(var5 >= topX && var5 < bottomX) {
                  renderPixels[var5 + y * renderWidth] = color;
               }

               x += var6;
               ++y;
            }

         } else {
            y <<= 16;
            y += '\u8000';
            yLength <<= 16;
            var6 = (int)Math.floor((double)yLength / (double)xLength + 0.5D);
            xLength += x;
            if(x < topX) {
               y += var6 * (topX - x);
               x = topX;
            }

            if(xLength >= bottomX) {
               xLength = bottomX - 1;
            }

            while(x <= xLength) {
               var5 = y >> 16;
               if(var5 >= topY && var5 < bottomY) {
                  renderPixels[x + var5 * renderWidth] = color;
               }

               y += var6;
               ++x;
            }

         }
      }
   }

   public static void method2511(int x, int y, int pixelColor, int[] offsets, int[] var4) {
      int position = x + y * renderWidth;

      for(int pixelIndex = 0; pixelIndex < offsets.length; ++pixelIndex) {
         int pixelOffset = position + offsets[pixelIndex];

         for(int index = -var4[pixelIndex]; index < 0; ++index) {
            renderPixels[pixelOffset++] = pixelColor;
         }

         position += renderWidth;
      }

   }

   public static void copySprite(int[] var0, int var1, int var2) {
      renderPixels = var0;
      renderWidth = var1;
      renderHeight = var2;
      setRasterizationRect(0, 0, var1, var2);
   }

   public static void method2529(int x, int y, int width, int height, int color, int var5) {
      if(x < topX) {
         width -= topX - x;
         x = topX;
      }

      if(y < topY) {
         height -= topY - y;
         y = topY;
      }

      if(x + width > bottomX) {
         width = bottomX - x;
      }

      if(y + height > bottomY) {
         height = bottomY - y;
      }

      color = ((color & 16711935) * var5 >> 8 & 16711935) + ((color & '\uff00') * var5 >> 8 & '\uff00');
      int alpha = 256 - var5;
      int var9 = Rasterizer2D.renderWidth - width;
      int pixelOffset = x + y * Rasterizer2D.renderWidth;

      for(int var6 = 0; var6 < height; ++var6) {
         for(int var10 = -width; var10 < 0; ++var10) {
            int pixelColor = renderPixels[pixelOffset];
            pixelColor = ((pixelColor & 16711935) * alpha >> 8 & 16711935) + ((pixelColor & '\uff00') * alpha >> 8 & '\uff00');
            renderPixels[pixelOffset++] = color + pixelColor;
         }

         pixelOffset += var9;
      }

   }

   static void drawHorizontalLineAlpha(int x, int y, int width, int color, int alpha) {
      if(y >= topY) {
         if(y < bottomY) {
            if(x < topX) {
               width -= topX - x;
               x = topX;
            }

            if(x + width > bottomX) {
               width = bottomX - x;
            }

            int colorAlpha = 256 - alpha;
            int colorR = (color >> 16 & 255) * alpha;
            int colorG = (color >> 8 & 255) * alpha;
            int colorB = (color & 255) * alpha;
            int pixelOffset = x + y * Rasterizer2D.renderWidth;

            for(int pixelIndex = 0; pixelIndex < width; ++pixelIndex) {
               int r = (renderPixels[pixelOffset] >> 16 & 255) * colorAlpha;
               int g = (renderPixels[pixelOffset] >> 8 & 255) * colorAlpha;
               int b = (renderPixels[pixelOffset] & 255) * colorAlpha;
               int pixel = (colorR + r >> 8 << 16) + (colorG + g >> 8 << 8) + (colorB + b >> 8);
               renderPixels[pixelOffset++] = pixel;
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

   public static void drawFilledRectangle(int x, int y, int width, int height, int color) {
      if(x < topX) {
         width -= topX - x;
         x = topX;
      }

      if(y < topY) {
         height -= topY - y;
         y = topY;
      }

      if(x + width > bottomX) {
         width = bottomX - x;
      }

      if(y + height > bottomY) {
         height = bottomY - y;
      }

      int distance = Rasterizer2D.renderWidth - width;
      int pixelOffset = x + y * Rasterizer2D.renderWidth;

      for(int yIndex = -height; yIndex < 0; ++yIndex) {
         for(int xIndex = -width; xIndex < 0; ++xIndex) {
            renderPixels[pixelOffset++] = color;
         }

         pixelOffset += distance;
      }

   }
}
