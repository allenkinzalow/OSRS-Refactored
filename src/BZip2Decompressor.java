
public final class BZip2Decompressor {

   static final int anInt907 = 0;
   static final int anInt908 = 16;
   static final int anInt909 = 23;
   static final int anInt910 = 1;
   static final int anInt911 = 50;
   static final int anInt912 = 6;
   static final int anInt913 = 4096;
   static BZip2Context aClass20_914 = new BZip2Context();


   static void method942(BZip2Context var0) {
      byte var1 = var0.aByte254;
      int var8 = var0.anInt241 * 2009016803;
      int var2 = var0.anInt263 * -1543994689;
      int var3 = var0.anInt261 * 247545101;
      int[] var12 = InteractableObject.anIntArray584;
      int var5 = var0.anInt260 * 295494949;
      byte[] var9 = var0.aByteArray251;
      int var6 = var0.anInt274 * -642309875;
      int var10 = var0.anInt252 * 1337047901;
      int var7 = var0.anInt278 * 52134945 + 1;

      label109:
      while(true) {
         if(var8 > 0) {
            while(true) {
               if(var10 == 0) {
                  break label109;
               }

               if(var8 == 1) {
                  if(var10 == 0) {
                     var8 = 1;
                     break label109;
                  }

                  var9[var6] = var1;
                  ++var6;
                  --var10;
                  break;
               }

               var9[var6] = var1;
               --var8;
               ++var6;
               --var10;
            }
         }

         boolean var13 = true;

         byte var11;
         while(var13) {
            var13 = false;
            if(var2 == var7) {
               var8 = 0;
               break label109;
            }

            var1 = (byte)var3;
            var5 = var12[var5];
            var11 = (byte)(var5 & 255);
            var5 >>= 8;
            ++var2;
            if(var11 != var3) {
               var3 = var11;
               if(var10 == 0) {
                  var8 = 1;
                  break label109;
               }

               var9[var6] = var1;
               ++var6;
               --var10;
               var13 = true;
            } else if(var2 == var7) {
               if(var10 == 0) {
                  var8 = 1;
                  break label109;
               }

               var9[var6] = var1;
               ++var6;
               --var10;
               var13 = true;
            }
         }

         var8 = 2;
         var5 = var12[var5];
         var11 = (byte)(var5 & 255);
         var5 >>= 8;
         ++var2;
         if(var2 != var7) {
            if(var11 != var3) {
               var3 = var11;
            } else {
               var8 = 3;
               var5 = var12[var5];
               var11 = (byte)(var5 & 255);
               var5 >>= 8;
               ++var2;
               if(var2 != var7) {
                  if(var11 != var3) {
                     var3 = var11;
                  } else {
                     var5 = var12[var5];
                     var11 = (byte)(var5 & 255);
                     var5 >>= 8;
                     ++var2;
                     var8 = (var11 & 255) + 4;
                     var5 = var12[var5];
                     var3 = (byte)(var5 & 255);
                     var5 >>= 8;
                     ++var2;
                  }
               }
            }
         }
      }

      int var4 = var0.anInt277 * -48753147;
      var0.anInt277 += (var10 - var10) * 1287472845;
      if(var0.anInt277 * -48753147 < var4) {
         ;
      }

      var0.aByte254 = var1;
      var0.anInt241 = var8 * 983393227;
      var0.anInt263 = var2 * 1735650623;
      var0.anInt261 = var3 * 1337776581;
      InteractableObject.anIntArray584 = var12;
      var0.anInt260 = var5 * -1540182355;
      var0.aByteArray251 = var9;
      var0.anInt274 = var6 * 1668519365;
      var0.anInt252 = var10 * -860131083;
   }

   public static int method943(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      BZip2Context var5 = aClass20_914;
      synchronized(var5) {
         aClass20_914.aByteArray247 = var2;
         aClass20_914.anInt248 = var4 * 603905575;
         aClass20_914.aByteArray251 = var0;
         aClass20_914.anInt274 = 0;
         aClass20_914.anInt252 = var1 * -860131083;
         aClass20_914.anInt257 = 0;
         aClass20_914.anInt256 = 0;
         aClass20_914.anInt249 = 0;
         aClass20_914.anInt277 = 0;
         method945(aClass20_914);
         var1 -= aClass20_914.anInt252 * 1337047901;
         aClass20_914.aByteArray247 = null;
         aClass20_914.aByteArray251 = null;
         return var1;
      }
   }

   static void method945(BZip2Context var0) {
      boolean var1 = false;
      boolean var26 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var2 = false;
      boolean var28 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var30 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var22 = false;
      boolean var17 = false;
      int var32 = 0;
      int[] var18 = null;
      int[] var19 = null;
      int[] var20 = null;
      var0.anInt258 = -1830703817;
      if(InteractableObject.anIntArray584 == null) {
         InteractableObject.anIntArray584 = new int[var0.anInt258 * 748486240];
      }

      boolean var33 = true;

      while(var33) {
         byte var21 = method946(var0);
         if(var21 == 23) {
            return;
         }

         var21 = method946(var0);
         var21 = method946(var0);
         var21 = method946(var0);
         var21 = method946(var0);
         var21 = method946(var0);
         var21 = method946(var0);
         var21 = method946(var0);
         var21 = method946(var0);
         var21 = method946(var0);
         var21 = method959(var0);
         if(var21 != 0) {
            ;
         }

         var0.anInt259 = 0;
         var21 = method946(var0);
         var0.anInt259 = (var0.anInt259 * 1431801971 << 8 | var21 & 255) * 27104443;
         var21 = method946(var0);
         var0.anInt259 = (var0.anInt259 * 1431801971 << 8 | var21 & 255) * 27104443;
         var21 = method946(var0);
         var0.anInt259 = (var0.anInt259 * 1431801971 << 8 | var21 & 255) * 27104443;

         int var35;
         for(var35 = 0; var35 < 16; ++var35) {
            var21 = method959(var0);
            if(var21 == 1) {
               var0.aBoolArray255[var35] = true;
            } else {
               var0.aBoolArray255[var35] = false;
            }
         }

         for(var35 = 0; var35 < 256; ++var35) {
            var0.aBoolArray266[var35] = false;
         }

         int var52;
         for(var35 = 0; var35 < 16; ++var35) {
            if(var0.aBoolArray255[var35]) {
               for(var52 = 0; var52 < 16; ++var52) {
                  var21 = method959(var0);
                  if(var21 == 1) {
                     var0.aBoolArray266[var35 * 16 + var52] = true;
                  }
               }
            }
         }

         method949(var0);
         int var38 = var0.anInt265 * 471785321 + 2;
         int var39 = method948(3, var0);
         int var40 = method948(15, var0);
         var35 = 0;

         while(var35 < var40) {
            var52 = 0;

            while(true) {
               var21 = method959(var0);
               if(var21 == 0) {
                  var0.aByteArray243[var35] = (byte)var52;
                  ++var35;
                  break;
               }

               ++var52;
            }
         }

         byte[] var27 = new byte[6];

         byte var23;
         for(var23 = 0; var23 < var39; var27[var23] = var23++) {
            ;
         }

         for(var35 = 0; var35 < var40; ++var35) {
            var23 = var0.aByteArray243[var35];

            byte var29;
            for(var29 = var27[var23]; var23 > 0; --var23) {
               var27[var23] = var27[var23 - 1];
            }

            var27[0] = var29;
            var0.aByteArray271[var35] = var29;
         }

         int var37;
         for(var37 = 0; var37 < var39; ++var37) {
            int var56 = method948(5, var0);
            var35 = 0;

            while(var35 < var38) {
               while(true) {
                  var21 = method959(var0);
                  if(var21 == 0) {
                     var0.aByteArrayArray273[var37][var35] = (byte)var56;
                     ++var35;
                     break;
                  }

                  var21 = method959(var0);
                  if(var21 == 0) {
                     ++var56;
                  } else {
                     --var56;
                  }
               }
            }
         }

         for(var37 = 0; var37 < var39; ++var37) {
            byte var25 = 32;
            byte var31 = 0;

            for(var35 = 0; var35 < var38; ++var35) {
               if(var0.aByteArrayArray273[var37][var35] > var31) {
                  var31 = var0.aByteArrayArray273[var37][var35];
               }

               if(var0.aByteArrayArray273[var37][var35] < var25) {
                  var25 = var0.aByteArrayArray273[var37][var35];
               }
            }

            method956(var0.anIntArrayArray262[var37], var0.anIntArrayArray275[var37], var0.anIntArrayArray276[var37], var0.aByteArrayArray273[var37], var25, var31, var38);
            var0.anIntArray268[var37] = var25;
         }

         int var41 = var0.anInt265 * 471785321 + 1;
         int var42 = -1;
         byte var43 = 0;

         for(var35 = 0; var35 <= 255; ++var35) {
            var0.anIntArray272[var35] = 0;
         }

         int var51 = 4095;

         int var53;
         int var55;
         for(var53 = 15; var53 >= 0; --var53) {
            for(var55 = 15; var55 >= 0; --var55) {
               var0.aByteArray269[var51] = (byte)(var53 * 16 + var55);
               --var51;
            }

            var0.anIntArray270[var53] = var51 + 1;
         }

         int var54 = 0;
         byte var49;
         if(var43 == 0) {
            ++var42;
            var43 = 50;
            var49 = var0.aByteArray271[var42];
            var32 = var0.anIntArray268[var49];
            var18 = var0.anIntArrayArray262[var49];
            var20 = var0.anIntArrayArray276[var49];
            var19 = var0.anIntArrayArray275[var49];
         }

         int var44 = var43 - 1;
         int var47 = var32;

         int var48;
         byte var50;
         for(var48 = method948(var32, var0); var48 > var18[var47]; var48 = var48 << 1 | var50) {
            ++var47;
            var50 = method959(var0);
         }

         int var36 = var20[var48 - var19[var47]];

         while(var36 != var41) {
            if(var36 != 0 && var36 != 1) {
               int var16 = var36 - 1;
               int var10;
               if(var16 < 16) {
                  var10 = var0.anIntArray270[0];

                  for(var21 = var0.aByteArray269[var10 + var16]; var16 > 3; var16 -= 4) {
                     int var24 = var10 + var16;
                     var0.aByteArray269[var24] = var0.aByteArray269[var24 - 1];
                     var0.aByteArray269[var24 - 1] = var0.aByteArray269[var24 - 2];
                     var0.aByteArray269[var24 - 2] = var0.aByteArray269[var24 - 3];
                     var0.aByteArray269[var24 - 3] = var0.aByteArray269[var24 - 4];
                  }

                  while(var16 > 0) {
                     var0.aByteArray269[var10 + var16] = var0.aByteArray269[var10 + var16 - 1];
                     --var16;
                  }

                  var0.aByteArray269[var10] = var21;
               } else {
                  int var11 = var16 / 16;
                  int var34 = var16 % 16;
                  var10 = var0.anIntArray270[var11] + var34;

                  for(var21 = var0.aByteArray269[var10]; var10 > var0.anIntArray270[var11]; --var10) {
                     var0.aByteArray269[var10] = var0.aByteArray269[var10 - 1];
                  }

                  ++var0.anIntArray270[var11];

                  while(var11 > 0) {
                     --var0.anIntArray270[var11];
                     var0.aByteArray269[var0.anIntArray270[var11]] = var0.aByteArray269[var0.anIntArray270[var11 - 1] + 16 - 1];
                     --var11;
                  }

                  --var0.anIntArray270[0];
                  var0.aByteArray269[var0.anIntArray270[0]] = var21;
                  if(var0.anIntArray270[0] == 0) {
                     var51 = 4095;

                     for(var53 = 15; var53 >= 0; --var53) {
                        for(var55 = 15; var55 >= 0; --var55) {
                           var0.aByteArray269[var51] = var0.aByteArray269[var0.anIntArray270[var53] + var55];
                           --var51;
                        }

                        var0.anIntArray270[var53] = var51 + 1;
                     }
                  }
               }

               ++var0.anIntArray272[var0.aByteArray267[var21 & 255] & 255];
               InteractableObject.anIntArray584[var54] = var0.aByteArray267[var21 & 255] & 255;
               ++var54;
               if(var44 == 0) {
                  ++var42;
                  var44 = 50;
                  var49 = var0.aByteArray271[var42];
                  var32 = var0.anIntArray268[var49];
                  var18 = var0.anIntArrayArray262[var49];
                  var20 = var0.anIntArrayArray276[var49];
                  var19 = var0.anIntArrayArray275[var49];
               }

               --var44;
               var47 = var32;

               for(var48 = method948(var32, var0); var48 > var18[var47]; var48 = var48 << 1 | var50) {
                  ++var47;
                  var50 = method959(var0);
               }

               var36 = var20[var48 - var19[var47]];
            } else {
               int var45 = -1;
               int var46 = 1;

               do {
                  if(var36 == 0) {
                     var45 += var46 * 1;
                  } else if(var36 == 1) {
                     var45 += var46 * 2;
                  }

                  var46 *= 2;
                  if(var44 == 0) {
                     ++var42;
                     var44 = 50;
                     var49 = var0.aByteArray271[var42];
                     var32 = var0.anIntArray268[var49];
                     var18 = var0.anIntArrayArray262[var49];
                     var20 = var0.anIntArrayArray276[var49];
                     var19 = var0.anIntArrayArray275[var49];
                  }

                  --var44;
                  var47 = var32;

                  for(var48 = method948(var32, var0); var48 > var18[var47]; var48 = var48 << 1 | var50) {
                     ++var47;
                     var50 = method959(var0);
                  }

                  var36 = var20[var48 - var19[var47]];
               } while(var36 == 0 || var36 == 1);

               ++var45;
               var21 = var0.aByteArray267[var0.aByteArray269[var0.anIntArray270[0]] & 255];

               for(var0.anIntArray272[var21 & 255] += var45; var45 > 0; --var45) {
                  InteractableObject.anIntArray584[var54] = var21 & 255;
                  ++var54;
               }
            }
         }

         var0.anInt241 = 0;
         var0.aByte254 = 0;
         var0.anIntArray250[0] = 0;

         for(var35 = 1; var35 <= 256; ++var35) {
            var0.anIntArray250[var35] = var0.anIntArray272[var35 - 1];
         }

         for(var35 = 1; var35 <= 256; ++var35) {
            var0.anIntArray250[var35] += var0.anIntArray250[var35 - 1];
         }

         for(var35 = 0; var35 < var54; ++var35) {
            var21 = (byte)(InteractableObject.anIntArray584[var35] & 255);
            InteractableObject.anIntArray584[var0.anIntArray250[var21 & 255]] |= var35 << 8;
            ++var0.anIntArray250[var21 & 255];
         }

         var0.anInt260 = (InteractableObject.anIntArray584[var0.anInt259 * 1431801971] >> 8) * -1540182355;
         var0.anInt263 = 0;
         var0.anInt260 = InteractableObject.anIntArray584[var0.anInt260 * 295494949] * -1540182355;
         var0.anInt261 = (byte)(var0.anInt260 * 295494949 & 255) * 1337776581;
         var0.anInt260 = (var0.anInt260 * 295494949 >> 8) * -1540182355;
         var0.anInt263 += 1735650623;
         var0.anInt278 = var54 * 1437925345;
         method942(var0);
         if(var0.anInt263 * -1543994689 == var0.anInt278 * 52134945 + 1 && var0.anInt241 * 2009016803 == 0) {
            var33 = true;
         } else {
            var33 = false;
         }
      }

   }

   static byte method946(BZip2Context var0) {
      return (byte)method948(8, var0);
   }

   static int method948(int var0, BZip2Context var1) {
      while(var1.anInt257 * -561833317 < var0) {
         var1.anInt256 = (var1.anInt256 * 212893323 << 8 | var1.aByteArray247[var1.anInt248 * -1482772073] & 255) * -1592952541;
         var1.anInt257 += 152165528;
         var1.anInt248 += 603905575;
         var1.anInt249 += 6244225;
         if(var1.anInt249 * 515438721 == 0) {
            ;
         }
      }

      int var2 = var1.anInt256 * 212893323 >> var1.anInt257 * -561833317 - var0 & (1 << var0) - 1;
      var1.anInt257 -= var0 * -1591592045;
      return var2;
   }

   static void method949(BZip2Context var0) {
      var0.anInt265 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if(var0.aBoolArray266[var1]) {
            var0.aByteArray267[var0.anInt265 * 471785321] = (byte)var1;
            var0.anInt265 += 960209113;
         }
      }

   }

   BZip2Decompressor() throws Throwable {
      throw new Error();
   }

   static void method956(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var9;
      for(var9 = var4; var9 <= var5; ++var9) {
         for(int var8 = 0; var8 < var6; ++var8) {
            if(var3[var8] == var9) {
               var2[var7] = var8;
               ++var7;
            }
         }
      }

      for(var9 = 0; var9 < 23; ++var9) {
         var1[var9] = 0;
      }

      for(var9 = 0; var9 < var6; ++var9) {
         ++var1[var3[var9] + 1];
      }

      for(var9 = 1; var9 < 23; ++var9) {
         var1[var9] += var1[var9 - 1];
      }

      for(var9 = 0; var9 < 23; ++var9) {
         var0[var9] = 0;
      }

      int var10 = 0;

      for(var9 = var4; var9 <= var5; ++var9) {
         var10 += var1[var9 + 1] - var1[var9];
         var0[var9] = var10 - 1;
         var10 <<= 1;
      }

      for(var9 = var4 + 1; var9 <= var5; ++var9) {
         var1[var9] = (var0[var9 - 1] + 1 << 1) - var1[var9];
      }

   }

   static byte method959(BZip2Context var0) {
      return (byte)method948(1, var0);
   }
}
