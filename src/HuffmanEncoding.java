/**
 * Credits to Lazaro for this class.
 */
public class HuffmanEncoding {

   public static HuffmanEncoding huffmanEncoding;
   int[] chatMask;
   int[] chatDecryptKeys;
   static CacheIndex soundEffectsIndex_2;
   byte[] chatBitSizes;


   public int decrypt(byte[] var1, int var2, byte[] var3, int var4, int var5, int var6) {
      if(0 == var5) {
         return 0;
      } else {
         int var7 = 0;
         var5 += var4;
         int var8 = var2;

         while(true) {
            byte textByte = var1[var8];
            if(textByte < 0) {
               var7 = this.chatDecryptKeys[var7];
            } else {
               ++var7;
            }

            int var10;
            if((var10 = this.chatDecryptKeys[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if(0 != (textByte & 64)) {
               var7 = this.chatDecryptKeys[var7];
            } else {
               ++var7;
            }

            if((var10 = this.chatDecryptKeys[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if((textByte & 32) != 0) {
               var7 = this.chatDecryptKeys[var7];
            } else {
               ++var7;
            }

            if((var10 = this.chatDecryptKeys[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if((textByte & 16) != 0) {
               var7 = this.chatDecryptKeys[var7];
            } else {
               ++var7;
            }

            if((var10 = this.chatDecryptKeys[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if(0 != (textByte & 8)) {
               var7 = this.chatDecryptKeys[var7];
            } else {
               ++var7;
            }

            if((var10 = this.chatDecryptKeys[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if((textByte & 4) != 0) {
               var7 = this.chatDecryptKeys[var7];
            } else {
               ++var7;
            }

            if((var10 = this.chatDecryptKeys[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if(0 != (textByte & 2)) {
               var7 = this.chatDecryptKeys[var7];
            } else {
               ++var7;
            }

            if((var10 = this.chatDecryptKeys[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if((textByte & 1) != 0) {
               var7 = this.chatDecryptKeys[var7];
            } else {
               ++var7;
            }

            if((var10 = this.chatDecryptKeys[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            ++var8;
         }

         return 1 + var8 - var2;
      }
   }

   public HuffmanEncoding(byte[] var1) {
      int var6 = var1.length;
      this.chatMask = new int[var6];
      this.chatBitSizes = var1;
      int[] var2 = new int[33];
      this.chatDecryptKeys = new int[8];
      int var13 = 0;

      for(int var11 = 0; var11 < var6; ++var11) {
         byte var9 = var1[var11];
         if(var9 != 0) {
            int var10 = 1 << 32 - var9;
            int var12 = var2[var9];
            this.chatMask[var11] = var12;
            int var3;
            int var4;
            int var5;
            int var14;
            if((var12 & var10) != 0) {
               var14 = var2[var9 - 1];
            } else {
               var14 = var12 | var10;

               for(var3 = var9 - 1; var3 >= 1; --var3) {
                  var4 = var2[var3];
                  if(var4 != var12) {
                     break;
                  }

                  var5 = 1 << 32 - var3;
                  if((var4 & var5) != 0) {
                     var2[var3] = var2[var3 - 1];
                     break;
                  }

                  var2[var3] = var4 | var5;
               }
            }

            var2[var9] = var14;

            for(var3 = var9 + 1; var3 <= 32; ++var3) {
               if(var12 == var2[var3]) {
                  var2[var3] = var14;
               }
            }

            var3 = 0;

            for(var4 = 0; var4 < var9; ++var4) {
               var5 = Integer.MIN_VALUE >>> var4;
               if(0 != (var12 & var5)) {
                  if(this.chatDecryptKeys[var3] == 0) {
                     this.chatDecryptKeys[var3] = var13;
                  }

                  var3 = this.chatDecryptKeys[var3];
               } else {
                  ++var3;
               }

               if(var3 >= this.chatDecryptKeys.length) {
                  int[] var7 = new int[this.chatDecryptKeys.length * 2];

                  for(int var8 = 0; var8 < this.chatDecryptKeys.length; ++var8) {
                     var7[var8] = this.chatDecryptKeys[var8];
                  }

                  this.chatDecryptKeys = var7;
               }

               var5 >>>= 1;
            }

            this.chatDecryptKeys[var3] = ~var11;
            if(var3 >= var13) {
               var13 = 1 + var3;
            }
         }
      }

   }

   public int encrypt(byte[] dest, int var2, int var3, byte[] var4, int var5, int var6) {
      int var7 = 0;
      int var9 = var5 << 3;

      for(var3 += var2; var2 < var3; ++var2) {
         int textByte = dest[var2] & 255;
         int mask = this.chatMask[textByte];
         byte size = this.chatBitSizes[textByte];
         if(0 == size) {
            throw new RuntimeException("");
         }

         int destOffset2 = var9 >> 3;
         int bitoffset = var9 & 7;
         var7 &= -bitoffset >> 31;
         int byteSize = destOffset2 + (bitoffset + size - 1 >> 3);
         bitoffset += 24;
         var4[destOffset2] = (byte)(var7 |= mask >>> bitoffset);
         if(destOffset2 < byteSize) {
            ++destOffset2;
            bitoffset -= 8;
            var4[destOffset2] = (byte)(var7 = mask >>> bitoffset);
            if(destOffset2 < byteSize) {
               ++destOffset2;
               bitoffset -= 8;
               var4[destOffset2] = (byte)(var7 = mask >>> bitoffset);
               if(destOffset2 < byteSize) {
                  ++destOffset2;
                  bitoffset -= 8;
                  var4[destOffset2] = (byte)(var7 = mask >>> bitoffset);
                  if(destOffset2 < byteSize) {
                     ++destOffset2;
                     bitoffset -= 8;
                     var4[destOffset2] = (byte)(var7 = mask << -bitoffset);
                  }
               }
            }
         }

         var9 += size;
      }

      return (var9 + 7 >> 3) - var5;
   }

   static String method690(int var0, int var1) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   static void method691(int var0, int var1) {
      for(Class108_Sub19 var2 = (Class108_Sub19) Client.aClass101_2906.method1304(); var2 != null; var2 = (Class108_Sub19) Client.aClass101_2906.method1303()) {
         if((long)var0 == (var2.key >> 48 & 65535L)) {
            var2.unlink();
         }
      }

   }
}
