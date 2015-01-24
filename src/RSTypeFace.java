import java.util.Random;

public abstract class RSTypeFace extends Rasterizer2D {

   static int anInt2635 = 0;
   static RSFont b12_full_font;
   static RSFont p11_full_font;
   int[] anIntArray2636;
   int[] characterWidths;
   static int alpha = 256;
   int[] anIntArray2639;
   int[] anIntArray2640;
   int anInt2641;
   byte[][] characerPixels = new byte[256][];
   public int anInt2643 = 0;
   public static PaletteSprite[] iconImageSet;
   int[] characterHeights;
   static int anInt2646 = -1;
   static int anInt2647 = -1;
   static int anInt2648 = -1;
   static int color = -1;
   static int anInt2650 = 0;
   static int anInt2651 = 0;
   static String[] aStringArray2652 = new String[100];
   byte[] aByteArray2653;
   static int anInt2654 = 0;
   static Random aRandom2655 = new Random();
   int anInt2656;

   static String getIconTag(int iconID, int var1) {
      return "<img=" + iconID + ">";
   }


   void method3086(byte[] fontData) {
      this.anIntArray2636 = new int[256];
      int var3;
      if(fontData.length == 257) {
         for(var3 = 0; var3 < this.anIntArray2636.length; ++var3) {
            this.anIntArray2636[var3] = fontData[var3] & 255;
         }

         this.anInt2643 = fontData[256] & 255;
      } else {
         var3 = 0;

         for(int var8 = 0; var8 < 256; ++var8) {
            this.anIntArray2636[var8] = fontData[var3++] & 255;
         }

         int[] var14 = new int[256];
         int[] var7 = new int[256];

         int var6;
         for(var6 = 0; var6 < 256; ++var6) {
            var14[var6] = fontData[var3++] & 255;
         }

         for(var6 = 0; var6 < 256; ++var6) {
            var7[var6] = fontData[var3++] & 255;
         }

         byte[][] var13 = new byte[256][];

         int var2;
         for(int var4 = 0; var4 < 256; ++var4) {
            var13[var4] = new byte[var14[var4]];
            byte var5 = 0;

            for(var2 = 0; var2 < var13[var4].length; ++var2) {
               var5 += fontData[var3++];
               var13[var4][var2] = var5;
            }
         }

         byte[][] var11 = new byte[256][];

         int var12;
         for(var12 = 0; var12 < 256; ++var12) {
            var11[var12] = new byte[var14[var12]];
            byte var10 = 0;

            for(int var9 = 0; var9 < var11[var12].length; ++var9) {
               var10 += fontData[var3++];
               var11[var12][var9] = var10;
            }
         }

         this.aByteArray2653 = new byte[65536];

         for(var12 = 0; var12 < 256; ++var12) {
            if(var12 != 32 && var12 != 160) {
               for(var2 = 0; var2 < 256; ++var2) {
                  if(var2 != 32 && var2 != 160) {
                     this.aByteArray2653[(var12 << 8) + var2] = (byte)method3087(var13, var11, var7, this.anIntArray2636, var14, var12, var2);
                  }
               }
            }
         }

         this.anInt2643 = var7[32] + var14[32];
      }
   }

   static int method3087(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var14 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if(var9 > var7) {
         var11 = var9;
      }

      int var13 = var14;
      if(var10 < var14) {
         var13 = var10;
      }

      int var8 = var3[var5];
      if(var3[var6] < var8) {
         var8 = var3[var6];
      }

      byte[] var16 = var1[var5];
      byte[] var15 = var0[var6];
      int var17 = var11 - var7;
      int var18 = var11 - var9;

      for(int var12 = var11; var12 < var13; ++var12) {
         int var19 = var16[var17++] + var15[var18++];
         if(var19 < var8) {
            var8 = var19;
         }
      }

      return -var8;
   }

   int method3088(char var1) {
      if(var1 == 160) {
         var1 = 32;
      }

      return this.anIntArray2636[CullingCluster.method671(var1, -1279426300) & 255];
   }

   public int getTextWidth(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if(var6 == 60) {
               var2 = var5;
            } else {
               if(var6 == 62 && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if(var7.equals("lt")) {
                     var6 = 60;
                  } else {
                     if(!var7.equals("gt")) {
                        if(var7.startsWith("img=")) {
                           try {
                              int var8 = VertexNormal.method692(var7.substring(4), 2055164932);
                              var4 += iconImageSet[var8].anInt2418;
                              var3 = -1;
                           } catch (Exception var9) {
                              ;
                           }
                        }
                        continue;
                     }

                     var6 = 62;
                  }
               }

               if(var6 == 160) {
                  var6 = 32;
               }

               if(var2 == -1) {
                  var4 += this.anIntArray2636[(char)(CullingCluster.method671(var6, -1279426300) & 255)];
                  if(this.aByteArray2653 != null && var3 != -1) {
                     var4 += this.aByteArray2653[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   int method3090(String var1, int[] var2, String[] var3) {
      if(var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if(var15 == 60) {
               var10 = var14;
            } else {
               if(var15 == 62 && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if(var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if(var16.equals("lt")) {
                     var4 += this.method3088('<');
                     if(this.aByteArray2653 != null && var11 != -1) {
                        var4 += this.aByteArray2653[(var11 << 8) + 60];
                     }

                     var11 = 60;
                  } else if(var16.equals("gt")) {
                     var4 += this.method3088('>');
                     if(this.aByteArray2653 != null && var11 != -1) {
                        var4 += this.aByteArray2653[(var11 << 8) + 62];
                     }

                     var11 = 62;
                  } else if(var16.startsWith("img=")) {
                     try {
                        int var17 = VertexNormal.method692(var16.substring(4), 1894759240);
                        var4 += iconImageSet[var17].anInt2418;
                        var11 = 0;
                     } catch (Exception var18) {
                        ;
                     }
                  }

                  var15 = 0;
               }

               if(var10 == -1) {
                  if(var15 != 0) {
                     var6.append(var15);
                     var4 += this.method3088(var15);
                     if(this.aByteArray2653 != null && var11 != -1) {
                        var4 += this.aByteArray2653[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if(var15 == 32) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if(var2 != null && var4 > var2[var12 < var2.length?var12:var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if(var15 == 45) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if(var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   public int method3091(String var1, int var2) {
      int var3 = this.method3090(var1, new int[]{var2}, aStringArray2652);
      int maxWidth = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int charWidth = this.getTextWidth(aStringArray2652[var5]);
         if(charWidth > maxWidth) {
            maxWidth = charWidth;
         }
      }

      return maxWidth;
   }

   public int method3092(String var1, int var2) {
      return this.method3090(var1, new int[]{var2}, aStringArray2652);
   }

   public static String appendLTGTTags(String message) {
      int messageLength = message.length();
      int var5 = 0;

      for(int charIndex = 0; charIndex < messageLength; ++charIndex) {
         char character = message.charAt(charIndex);
         if(character == 60 || character == 62) {
            var5 += 3;
         }
      }

      StringBuilder appendedString = new StringBuilder(messageLength + var5);

      for(int charIndex = 0; charIndex < messageLength; ++charIndex) {
         char character = message.charAt(charIndex);
         if(character == 60) {
            appendedString.append("<lt>"); 
         } else if(character == 62) {
            appendedString.append("<gt>");
         } else {
            appendedString.append(character);
         }
      }

      return appendedString.toString();
   }

   public void drawString(String message, int x, int y, int var4, int var5) {
      if(message != null) {
         this.method3113(var4, var5);
         this.drawBasicString(message, x, y);
      }
   }

   public void method3095(String message, int x, int y, int var4, int var5) {
      if(message != null) {
         this.method3113(var4, var5);
         this.drawBasicString(message, x - this.getTextWidth(message), y);
      }
   }

   public void drawStringCenter(String message, int x, int y, int var4, int var5) {
      if(message != null) {
         this.method3113(var4, var5);
         this.drawBasicString(message, x - this.getTextWidth(message) / 2, y);
      }
   }

   public int method3097(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var1 == null) {
         return 0;
      } else {
         this.method3113(var6, var7);
         if(var10 == 0) {
            var10 = this.anInt2643;
         }

         int[] var12 = new int[]{var4};
         if(var5 < this.anInt2656 + this.anInt2641 + var10 && var5 < var10 + var10) {
            var12 = null;
         }

         int var11 = this.method3090(var1, var12, aStringArray2652);
         if(var9 == 3 && var11 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if(var9 == 0) {
            var14 = var3 + this.anInt2656;
         } else if(var9 == 1) {
            var14 = var3 + this.anInt2656 + (var5 - this.anInt2656 - this.anInt2641 - (var11 - 1) * var10) / 2;
         } else if(var9 == 2) {
            var14 = var3 + var5 - this.anInt2641 - (var11 - 1) * var10;
         } else {
            var13 = (var5 - this.anInt2656 - this.anInt2641 - (var11 - 1) * var10) / (var11 + 1);
            if(var13 < 0) {
               var13 = 0;
            }

            var14 = var3 + this.anInt2656 + var13;
            var10 += var13;
         }

         for(var13 = 0; var13 < var11; ++var13) {
            if(var8 == 0) {
               this.drawBasicString(aStringArray2652[var13], var2, var14);
            } else if(var8 == 1) {
               this.drawBasicString(aStringArray2652[var13], var2 + (var4 - this.getTextWidth(aStringArray2652[var13])) / 2, var14);
            } else if(var8 == 2) {
               this.drawBasicString(aStringArray2652[var13], var2 + var4 - this.getTextWidth(aStringArray2652[var13]), var14);
            } else if(var13 == var11 - 1) {
               this.drawBasicString(aStringArray2652[var13], var2, var14);
            } else {
               this.method3116(aStringArray2652[var13], var4);
               this.drawBasicString(aStringArray2652[var13], var2, var14);
               anInt2650 = 0;
            }

            var14 += var10;
         }

         return var11;
      }
   }

   public void method3100(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 != null) {
         this.method3113(var4, var5);
         double var9 = 7.0D - (double)var7 / 8.0D;
         if(var9 < 0.0D) {
            var9 = 0.0D;
         }

         int[] var8 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var8[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var9);
         }

         this.drawSeededString(var1, var2 - this.getTextWidth(var1) / 2, var3, (int[])null, var8);
      }
   }

   public void drawShadedSeededAlphaString(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3113(var4, var5);
         aRandom2655.setSeed((long)var6);
         alpha = 192 + (aRandom2655.nextInt() & 31);
         int[] var8 = new int[var1.length()];
         int var7 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var8[var9] = var7;
            if((aRandom2655.nextInt() & 3) == 0) {
               ++var7;
            }
         }

         this.drawSeededString(var1, var2, var3, var8, (int[])null);
      }
   }

   void method3103(String var1) {
      try {
         if(var1.startsWith("col=")) {
            anInt2651 = Class84.method1121(var1.substring(4), 16, (byte)41);
         } else if(var1.equals("/col")) {
            anInt2651 = anInt2635;
         } else if(var1.startsWith("str=")) {
            anInt2646 = Class84.method1121(var1.substring(4), 16, (byte)2);
         } else if(var1.equals("str")) {
            anInt2646 = 8388608;
         } else if(var1.equals("/str")) {
            anInt2646 = -1;
         } else if(var1.startsWith("u=")) {
            anInt2647 = Class84.method1121(var1.substring(2), 16, (byte)114);
         } else if(var1.equals("u")) {
            anInt2647 = 0;
         } else if(var1.equals("/u")) {
            anInt2647 = -1;
         } else if(var1.startsWith("shad=")) {
            color = Class84.method1121(var1.substring(5), 16, (byte)7);
         } else if(var1.equals("shad")) {
            color = 0;
         } else if(var1.equals("/shad")) {
            color = anInt2648;
         } else if(var1.equals("br")) {
            this.method3113(anInt2635, anInt2648);
         }
      } catch (Exception var3) {
         ;
      }
   }

   static void drawCharacterPixels(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var11 = -var6; var11 < 0; ++var11) {
         int var10;
         for(var10 = var9; var10 < 0; ++var10) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var10 = var5; var10 < 0; ++var10) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   /**
    * I think...
    * @param message
    * @param x
    * @param y
    * @param var4
    * @param var5
    */
   void drawSeededString(String message, int x, int y, int[] var4, int[] var5) {
      y -= this.anInt2643;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int characterIndex = 0; characterIndex < message.length(); ++characterIndex) {
         if(message.charAt(characterIndex) != 0) {
            char character = (char)(CullingCluster.method671(message.charAt(characterIndex), -1279426300) & 255);
            if(character == 60) {
               var6 = characterIndex;
            } else {
               int height;
               int var13;
               int var14;
               if(character == 62 && var6 != -1) {
                  String var11 = message.substring(var6 + 1, characterIndex);
                  var6 = -1;
                  if(var11.equals("lt")) {
                     character = 60;
                  } else {
                     if(!var11.equals("gt")) {
                        if(var11.startsWith("img=")) {
                           try {
                              if(var4 != null) {
                                 height = var4[var8];
                              } else {
                                 height = 0;
                              }

                              if(var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              var14 = VertexNormal.method692(var11.substring(4), 1922533226);
                              PaletteSprite spritePalette = iconImageSet[var14];
                              spritePalette.drawSprite(x + height, y + this.anInt2643 - spritePalette.anInt2412 + var13);
                              x += spritePalette.anInt2418;
                              var7 = -1;
                           } catch (Exception var16) {
                              ;
                           }
                        } else {
                           this.method3103(var11);
                        }
                        continue;
                     }

                     character = 62;
                  }
               }

               if(character == 160) {
                  character = 32;
               }

               if(var6 == -1) {
                  if(this.aByteArray2653 != null && var7 != -1) {
                     x += this.aByteArray2653[(var7 << 8) + character];
                  }

                  int width = this.characterWidths[character];
                  height = this.characterHeights[character];
                  if(var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if(var5 != null) {
                     var14 = var5[var8];
                  } else {
                     var14 = 0;
                  }

                  ++var8;
                  if(character != 32) {
                     if(alpha == 256) {
                        if(color != -1) {
                           drawCharacter(this.characerPixels[character], x + this.anIntArray2639[character] + 1 + var13, y + this.anIntArray2640[character] + 1 + var14, width, height, color);
                        }

                        this.method3136(this.characerPixels[character], x + this.anIntArray2639[character] + var13, y + this.anIntArray2640[character] + var14, width, height, anInt2651);
                     } else {
                        if(color != -1) {
                           drawAlphaCharacter(this.characerPixels[character], x + this.anIntArray2639[character] + 1 + var13, y + this.anIntArray2640[character] + 1 + var14, width, height, color, alpha);
                        }

                        this.method3108(this.characerPixels[character], x + this.anIntArray2639[character] + var13, y + this.anIntArray2640[character] + var14, width, height, anInt2651, alpha);
                     }
                  } else if(anInt2650 > 0) {
                     anInt2654 += anInt2650;
                     x += anInt2654 >> 8;
                     anInt2654 &= 255;
                  }

                  int var15 = this.anIntArray2636[character];
                  if(anInt2646 != -1) {
                     drawHorizontalLine(x, y + (int) ((double) this.anInt2643 * 0.7D), var15, anInt2646);
                  }

                  if(anInt2647 != -1) {
                     drawHorizontalLine(x, y + this.anInt2643, var15, anInt2647);
                  }

                  x += var15;
                  var7 = character;
               }
            }
         }
      }

   }

   public void method3107(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3113(var4, var5);
         int[] var8 = new int[var1.length()];

         for(int var7 = 0; var7 < var1.length(); ++var7) {
            var8[var7] = (int)(Math.sin((double)var7 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.drawSeededString(var1, var2 - this.getTextWidth(var1) / 2, var3, (int[])null, var8);
      }
   }

   abstract void method3108(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   static void drawCharacter(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * renderWidth;
      int var10 = renderWidth - var3;
      int var8 = 0;
      int var7 = 0;
      int var9;
      if(var2 < topY) {
         var9 = topY - var2;
         var4 -= var9;
         var2 = topY;
         var7 += var9 * var3;
         var6 += var9 * renderWidth;
      }

      if(var2 + var4 > bottomY) {
         var4 -= var2 + var4 - bottomY;
      }

      if(var1 < topX) {
         var9 = topX - var1;
         var3 -= var9;
         var1 = topX;
         var7 += var9;
         var6 += var9;
         var8 += var9;
         var10 += var9;
      }

      if(var1 + var3 > bottomX) {
         var9 = var1 + var3 - bottomX;
         var3 -= var9;
         var8 += var9;
         var10 += var9;
      }

      if(var3 > 0) {
         if(var4 > 0) {
            drawCharacterPixels(renderPixels, var0, var5, var7, var6, var3, var4, var10, var8);
         }
      }
   }

   void method3113(int var1, int var2) {
      anInt2646 = -1;
      anInt2647 = -1;
      anInt2648 = var2;
      color = var2;
      anInt2635 = var1;
      anInt2651 = var1;
      alpha = 256;
      anInt2650 = 0;
      anInt2654 = 0;
   }

   void method3116(String var1, int var2) {
      int var3 = 0;
      boolean var5 = false;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         char var4 = var1.charAt(var6);
         if(var4 == 60) {
            var5 = true;
         } else if(var4 == 62) {
            var5 = false;
         } else if(!var5 && var4 == 32) {
            ++var3;
         }
      }

      if(var3 > 0) {
         anInt2650 = (var2 - this.getTextWidth(var1) << 8) / var3;
      }
   }

   RSTypeFace(byte[] var1) {
      this.method3086(var1);
   }

   public void method3131(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3113(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var9 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var9[var8] = (int)(Math.sin((double)var8 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.drawSeededString(var1, var2 - this.getTextWidth(var1) / 2, var3, var7, var9);
      }
   }

   RSTypeFace(byte[] var1, int[] var2, int[] var3, int[] characterWidths, int[] characterHeights, int[] var6, byte[][] characterPixels) {
      this.anIntArray2639 = var2;
      this.anIntArray2640 = var3;
      this.characterWidths = characterWidths;
      this.characterHeights = characterHeights;
      this.method3086(var1);
      this.characerPixels = characterPixels;
      int var10 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var8 = 0; var8 < 256; ++var8) {
         if(this.anIntArray2640[var8] < var10 && this.characterHeights[var8] != 0) {
            var10 = this.anIntArray2640[var8];
         }

         if(this.anIntArray2640[var8] + this.characterHeights[var8] > var9) {
            var9 = this.anIntArray2640[var8] + this.characterHeights[var8];
         }
      }

      this.anInt2656 = this.anInt2643 - var10;
      this.anInt2641 = var9 - this.anInt2643;
   }

   abstract void method3136(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   static void drawCharacterPixelsAlpha(int[] rasterizerPixels, byte[] characterPixels, int color, int characterPixel, int rasterizerPixel, int width, int height, int rasterizerPixelOffset, int var8, int alpha) {
      color = ((color & 16711935) * alpha & -16711936) + ((color & '\uff00') * alpha & 16711680) >> 8;
      alpha = 256 - alpha;

      for(int heightCounter = -height; heightCounter < 0; ++heightCounter) {
         for(int widthCounter = -width; widthCounter < 0; ++widthCounter) {
            if(characterPixels[characterPixel++] != 0) {
               int rasterizerPixelColor = rasterizerPixels[rasterizerPixel];
               rasterizerPixels[rasterizerPixel++] = (((rasterizerPixelColor & 16711935) * alpha & -16711936) + ((rasterizerPixelColor & '\uff00') * alpha & 16711680) >> 8) + color;
            } else {
               ++rasterizerPixel;
            }
         }

         rasterizerPixel += rasterizerPixelOffset;
         characterPixel += var8;
      }

   }

   void drawBasicString(String message, int var2, int var3) {
      var3 -= this.anInt2643;
      int var4 = -1;
      int var5 = -1;

      for(int characterIndex = 0; characterIndex < message.length(); ++characterIndex) {
         if(message.charAt(characterIndex) != 0) {
            char character = (char)(CullingCluster.method671(message.charAt(characterIndex), -1279426300) & 255);
            if(character == 60) {
               var4 = characterIndex;
            } else {
               int var9;
               if(character == 62 && var4 != -1) {
                  String var8 = message.substring(var4 + 1, characterIndex);
                  var4 = -1;
                  if(var8.equals("lt")) {
                     character = 60;
                  } else {
                     if(!var8.equals("gt")) {
                        if(var8.startsWith("img=")) {
                           try {
                              var9 = VertexNormal.method692(var8.substring(4), 1972669162);
                              PaletteSprite icon = iconImageSet[var9];
                              icon.drawSprite(var2, var3 + this.anInt2643 - icon.anInt2412);
                              var2 += icon.anInt2418;
                              var5 = -1;
                           } catch (Exception var11) {
                              ;
                           }
                        } else {
                           this.method3103(var8);
                        }
                        continue;
                     }

                     character = 62;
                  }
               }

               if(character == 160) {
                  character = 32;
               }

               if(var4 == -1) {
                  if(this.aByteArray2653 != null && var5 != -1) {
                     var2 += this.aByteArray2653[(var5 << 8) + character];
                  }

                  int var12 = this.characterWidths[character];
                  var9 = this.characterHeights[character];
                  if(character != 32) {
                     if(alpha == 256) {
                        if(color != -1) {
                           drawCharacter(this.characerPixels[character], var2 + this.anIntArray2639[character] + 1, var3 + this.anIntArray2640[character] + 1, var12, var9, color);
                        }

                        this.method3136(this.characerPixels[character], var2 + this.anIntArray2639[character], var3 + this.anIntArray2640[character], var12, var9, anInt2651);
                     } else {
                        if(color != -1) {
                           drawAlphaCharacter(this.characerPixels[character], var2 + this.anIntArray2639[character] + 1, var3 + this.anIntArray2640[character] + 1, var12, var9, color, alpha);
                        }

                        this.method3108(this.characerPixels[character], var2 + this.anIntArray2639[character], var3 + this.anIntArray2640[character], var12, var9, anInt2651, alpha);
                     }
                  } else if(anInt2650 > 0) {
                     anInt2654 += anInt2650;
                     var2 += anInt2654 >> 8;
                     anInt2654 &= 255;
                  }

                  int var10 = this.anIntArray2636[character];
                  if(anInt2646 != -1) {
                     drawHorizontalLine(var2, var3 + (int) ((double) this.anInt2643 * 0.7D), var10, anInt2646);
                  }

                  if(anInt2647 != -1) {
                     drawHorizontalLine(var2, var3 + this.anInt2643 + 1, var10, anInt2647);
                  }

                  var2 += var10;
                  var5 = character;
               }
            }
         }
      }

   }

   static void drawAlphaCharacter(byte[] characterPixels, int x, int y, int width, int height, int color, int alpha) {
      int rasterizerPixel = x + y * Rasterizer2D.renderWidth;
      int rasterizerPixelOffset = Rasterizer2D.renderWidth - width;
      int characterPixelOffset = 0;
      int characterPixel = 0;
      int offset;
      if(y < topY) {
         offset = topY - y;
         height -= offset;
         y = topY;
         characterPixel += offset * width;
         rasterizerPixel += offset * Rasterizer2D.renderWidth;
      }

      if(y + height > bottomY) {
         height -= y + height - bottomY;
      }

      if(x < topX) {
         offset = topX - x;
         width -= offset;
         x = topX;
         characterPixel += offset;
         rasterizerPixel += offset;
         characterPixelOffset += offset;
         rasterizerPixelOffset += offset;
      }

      if(x + width > bottomX) {
         offset = x + width - bottomX;
         width -= offset;
         characterPixelOffset += offset;
         rasterizerPixelOffset += offset;
      }

      if(width > 0) {
         if(height > 0) {
            drawCharacterPixelsAlpha(renderPixels, characterPixels, color, characterPixel, rasterizerPixel, width, height, rasterizerPixelOffset, characterPixelOffset, alpha);
         }
      }
   }
}
