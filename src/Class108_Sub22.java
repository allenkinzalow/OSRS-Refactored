
public class Class108_Sub22 extends Node {

   int[] anIntArray1918 = new int[128];
   Class108_Sub1_Sub1[] aClass108_Sub1_Sub1Array1919 = new Class108_Sub1_Sub1[128];
   short[] aShortArray1920 = new short[128];
   byte[] aByteArray1921 = new byte[128];
   byte[] aByteArray1922 = new byte[128];
   int anInt1923;
   byte[] aByteArray1924 = new byte[128];
   static final int anInt1925 = 71;
   public static final int anInt1926 = 37;
   Class100[] aClass100Array1927 = new Class100[128];


   boolean method1990(Class15 var1, byte[] var2, int[] var3, int var4) {
      boolean var5 = true;
      int var9 = 0;
      Class108_Sub1_Sub1 var7 = null;

      for(int var6 = 0; var6 < 128; ++var6) {
         if(var2 == null || 0 != var2[var6]) {
            int var8 = this.anIntArray1918[var6];
            if(0 != var8) {
               if(var8 != var9) {
                  var9 = var8--;
                  if(0 == (var8 & 1)) {
                     var7 = var1.method287(var8 >> 2, var3, -2105358309);
                  } else {
                     var7 = var1.method299(var8 >> 2, var3, 374023760);
                  }

                  if(null == var7) {
                     var5 = false;
                  }
               }

               if(var7 != null) {
                  this.aClass108_Sub1_Sub1Array1919[var6] = var7;
                  this.anIntArray1918[var6] = 0;
               }
            }
         }
      }

      return var5;
   }

   static final void method1991(int var0) {
      for(int var1 = 0; var1 < Client.anInt2895 * 348809069; ++var1) {
         --Client.anIntArray2944[var1];
         if(Client.anIntArray2944[var1] < -10) {
            Client.anInt2895 += 1862223259;

            for(int var3 = var1; var3 < Client.anInt2895 * 348809069; ++var3) {
               Client.anIntArray2942[var3] = Client.anIntArray2942[var3 + 1];
               Client.aClass6Array2741[var3] = Client.aClass6Array2741[1 + var3];
               Client.anIntArray2757[var3] = Client.anIntArray2757[var3 + 1];
               Client.anIntArray2944[var3] = Client.anIntArray2944[1 + var3];
               Client.anIntArray2704[var3] = Client.anIntArray2704[var3 + 1];
            }

            --var1;
         } else {
            RSSoundEffect var11 = Client.aClass6Array2741[var1];
            if(null == var11) {
               RSSoundEffect var10000 = (RSSoundEffect)null;
               var11 = RSSoundEffect.getSoundEffect(Class118.soundEffectsIndex_1, Client.anIntArray2942[var1], 0);
               if(var11 == null) {
                  continue;
               }

               Client.anIntArray2944[var1] += var11.method106();
               Client.aClass6Array2741[var1] = var11;
            }

            if(Client.anIntArray2944[var1] < 0) {
               int var8;
               if(0 != Client.anIntArray2704[var1]) {
                  int var2 = (Client.anIntArray2704[var1] & 255) * 128;
                  int var6 = Client.anIntArray2704[var1] >> 16 & 255;
                  int var5 = 64 + var6 * 128 - Class108_Sub10.myPlayer.anInt2394 * 171470795;
                  if(var5 < 0) {
                     var5 = -var5;
                  }

                  int var7 = Client.anIntArray2704[var1] >> 8 & 255;
                  int var4 = 64 + var7 * 128 - Class108_Sub10.myPlayer.anInt2339 * 826764905;
                  if(var4 < 0) {
                     var4 = -var4;
                  }

                  int var9 = var4 + var5 - 128;
                  if(var9 > var2) {
                     Client.anIntArray2944[var1] = -100;
                     continue;
                  }

                  if(var9 < 0) {
                     var9 = 0;
                  }

                  var8 = (var2 - var9) * Client.anInt2940 * 769647509 / var2;
               } else {
                  var8 = Client.anInt2812 * -24031449;
               }

               if(var8 > 0) {
                  Class108_Sub1_Sub1 var10 = var11.method104().method2555(GameObject.aClass19_2428);
                  Class108_Sub4_Sub2 var12 = Class108_Sub4_Sub2.method2365(var10, 100, var8);
                  var12.method2396(Client.anIntArray2757[var1] - 1);
                  Class26.aClass108_Sub4_Sub1_352.method2050(var12);
               }

               Client.anIntArray2944[var1] = -100;
            }
         }
      }

      if(Client.aBool2938) {
         if(!Player.method3182(40074042)) {
            if(0 != Client.anInt2873 * 99489839 && Client.anInt2937 * 111831401 != -1) {
               AnimationSkin.method1677(Friend.musicIndex_1, Client.anInt2937 * 111831401, 0, Client.anInt2873 * 99489839, false, -1987354603);
            }

            Client.aBool2938 = false;
         }
      }
   }

   Class108_Sub22(byte[] var1) {
      RSByteBuffer var4 = new RSByteBuffer(var1);

      int var7;
      for(var7 = 0; 0 != var4.buf[var4.position * 798331555 + var7]; ++var7) {
         ;
      }

      byte[] var36 = new byte[var7];

      int var11;
      for(var11 = 0; var11 < var7; ++var11) {
         var36[var11] = var4.readByte();
      }

      var4.position += 537964811;
      ++var7;
      var11 = var4.position * 798331555;
      var4.position += var7 * 537964811;

      int var15;
      for(var15 = 0; 0 != var4.buf[var15 + var4.position * 798331555]; ++var15) {
         ;
      }

      byte[] var16 = new byte[var15];

      int var19;
      for(var19 = 0; var19 < var15; ++var19) {
         var16[var19] = var4.readByte();
      }

      var4.position += 537964811;
      ++var15;
      var19 = var4.position * 798331555;
      var4.position += var15 * 537964811;

      int var20;
      for(var20 = 0; var4.buf[var20 + var4.position * 798331555] != 0; ++var20) {
         ;
      }

      byte[] var22 = new byte[var20];

      for(int var21 = 0; var21 < var20; ++var21) {
         var22[var21] = var4.readByte();
      }

      var4.position += 537964811;
      ++var20;
      byte[] var45 = new byte[var20];
      int var5;
      int var23;
      if(var20 > 1) {
         var45[1] = 1;
         int var6 = 1;
         var23 = 2;

         for(var5 = 2; var5 < var20; ++var5) {
            int var12 = var4.readUByte();
            if(0 == var12) {
               var6 = var23++;
            } else {
               if(var12 <= var6) {
                  --var12;
               }

               var6 = var12;
            }

            var45[var5] = (byte)var6;
         }
      } else {
         var23 = var20;
      }

      Class100[] var40 = new Class100[var23];

      Class100 var41;
      for(var5 = 0; var5 < var40.length; ++var5) {
         var41 = var40[var5] = new Class100();
         int var17 = var4.readUByte();
         if(var17 > 0) {
            var41.aByteArray1382 = new byte[var17 * 2];
         }

         var17 = var4.readUByte();
         if(var17 > 0) {
            var41.aByteArray1387 = new byte[var17 * 2 + 2];
            var41.aByteArray1387[1] = 64;
         }
      }

      var5 = var4.readUByte();
      byte[] var42 = var5 > 0?new byte[var5 * 2]:null;
      var5 = var4.readUByte();
      byte[] var43 = var5 > 0?new byte[var5 * 2]:null;

      int var32;
      for(var32 = 0; 0 != var4.buf[var4.position * 798331555 + var32]; ++var32) {
         ;
      }

      byte[] var14 = new byte[var32];

      int var13;
      for(var13 = 0; var13 < var32; ++var13) {
         var14[var13] = var4.readByte();
      }

      var4.position += 537964811;
      ++var32;
      var13 = 0;

      int var33;
      for(var33 = 0; var33 < 128; ++var33) {
         var13 += var4.readUByte();
         this.aShortArray1920[var33] = (short)var13;
      }

      var13 = 0;

      for(var33 = 0; var33 < 128; ++var33) {
         var13 += var4.readUByte();
         this.aShortArray1920[var33] = (short)(this.aShortArray1920[var33] + (var13 << 8));
      }

      var33 = 0;
      int var31 = 0;
      int var34 = 0;

      int var18;
      for(var18 = 0; var18 < 128; ++var18) {
         if(0 == var33) {
            if(var31 < var14.length) {
               var33 = var14[var31++];
            } else {
               var33 = -1;
            }

            var34 = var4.method1733(744369885);
         }

         this.aShortArray1920[var18] = (short)(this.aShortArray1920[var18] + ((var34 - 1 & 2) << 14));
         this.anIntArray1918[var18] = var34;
         --var33;
      }

      var33 = 0;
      var31 = 0;
      var18 = 0;

      int var35;
      for(var35 = 0; var35 < 128; ++var35) {
         if(this.anIntArray1918[var35] != 0) {
            if(0 == var33) {
               if(var31 < var36.length) {
                  var33 = var36[var31++];
               } else {
                  var33 = -1;
               }

               var18 = var4.buf[var11++] - 1;
            }

            this.aByteArray1924[var35] = (byte)var18;
            --var33;
         }
      }

      var33 = 0;
      var31 = 0;
      var35 = 0;

      for(int var30 = 0; var30 < 128; ++var30) {
         if(0 != this.anIntArray1918[var30]) {
            if(0 == var33) {
               if(var31 < var16.length) {
                  var33 = var16[var31++];
               } else {
                  var33 = -1;
               }

               var35 = var4.buf[var19++] + 16 << 2;
            }

            this.aByteArray1922[var30] = (byte)var35;
            --var33;
         }
      }

      var33 = 0;
      var31 = 0;
      Class100 var49 = null;

      int var37;
      for(var37 = 0; var37 < 128; ++var37) {
         if(0 != this.anIntArray1918[var37]) {
            if(0 == var33) {
               var49 = var40[var45[var31]];
               if(var31 < var22.length) {
                  var33 = var22[var31++];
               } else {
                  var33 = -1;
               }
            }

            this.aClass100Array1927[var37] = var49;
            --var33;
         }
      }

      var33 = 0;
      var31 = 0;
      var37 = 0;

      int var2;
      for(var2 = 0; var2 < 128; ++var2) {
         if(0 == var33) {
            if(var31 < var14.length) {
               var33 = var14[var31++];
            } else {
               var33 = -1;
            }

            if(this.anIntArray1918[var2] > 0) {
               var37 = var4.readUByte() + 1;
            }
         }

         this.aByteArray1921[var2] = (byte)var37;
         --var33;
      }

      this.anInt1923 = (var4.readUByte() + 1) * 384347383;

      Class100 var24;
      int var26;
      for(var2 = 0; var2 < var23; ++var2) {
         var24 = var40[var2];
         if(var24.aByteArray1382 != null) {
            for(var26 = 1; var26 < var24.aByteArray1382.length; var26 += 2) {
               var24.aByteArray1382[var26] = var4.readByte();
            }
         }

         if(null != var24.aByteArray1387) {
            for(var26 = 3; var26 < var24.aByteArray1387.length - 2; var26 += 2) {
               var24.aByteArray1387[var26] = var4.readByte();
            }
         }
      }

      if(null != var42) {
         for(var2 = 1; var2 < var42.length; var2 += 2) {
            var42[var2] = var4.readByte();
         }
      }

      if(var43 != null) {
         for(var2 = 1; var2 < var43.length; var2 += 2) {
            var43[var2] = var4.readByte();
         }
      }

      for(var2 = 0; var2 < var23; ++var2) {
         var24 = var40[var2];
         if(var24.aByteArray1387 != null) {
            var13 = 0;

            for(var26 = 2; var26 < var24.aByteArray1387.length; var26 += 2) {
               var13 = var13 + 1 + var4.readUByte();
               var24.aByteArray1387[var26] = (byte)var13;
            }
         }
      }

      for(var2 = 0; var2 < var23; ++var2) {
         var24 = var40[var2];
         if(null != var24.aByteArray1382) {
            var13 = 0;

            for(var26 = 2; var26 < var24.aByteArray1382.length; var26 += 2) {
               var13 = var13 + 1 + var4.readUByte();
               var24.aByteArray1382[var26] = (byte)var13;
            }
         }
      }

      byte var3;
      int var8;
      int var27;
      int var29;
      int var38;
      byte var39;
      if(var42 != null) {
         var13 = var4.readUByte();
         var42[0] = (byte)var13;

         for(var2 = 2; var2 < var42.length; var2 += 2) {
            var13 = var13 + 1 + var4.readUByte();
            var42[var2] = (byte)var13;
         }

         var39 = var42[0];
         byte var46 = var42[1];

         for(var26 = 0; var26 < var39; ++var26) {
            this.aByteArray1921[var26] = (byte)(var46 * this.aByteArray1921[var26] + 32 >> 6);
         }

         for(var26 = 2; var26 < var42.length; var26 += 2) {
            var3 = var42[var26];
            byte var25 = var42[var26 + 1];
            var27 = (var3 - var39) * var46 + (var3 - var39) / 2;

            for(var8 = var39; var8 < var3; ++var8) {
               var29 = Class27.method376(var27, var3 - var39, -532096506);
               this.aByteArray1921[var8] = (byte)(32 + this.aByteArray1921[var8] * var29 >> 6);
               var27 += var25 - var46;
            }

            var39 = var3;
            var46 = var25;
         }

         for(var38 = var39; var38 < 128; ++var38) {
            this.aByteArray1921[var38] = (byte)(32 + var46 * this.aByteArray1921[var38] >> 6);
         }

         var41 = null;
      }

      if(null != var43) {
         var13 = var4.readUByte();
         var43[0] = (byte)var13;

         for(var2 = 2; var2 < var43.length; var2 += 2) {
            var13 = var13 + 1 + var4.readUByte();
            var43[var2] = (byte)var13;
         }

         var39 = var43[0];
         int var48 = var43[1] << 1;

         for(var26 = 0; var26 < var39; ++var26) {
            var38 = var48 + (this.aByteArray1922[var26] & 255);
            if(var38 < 0) {
               var38 = 0;
            }

            if(var38 > 128) {
               var38 = 128;
            }

            this.aByteArray1922[var26] = (byte)var38;
         }

         int var47;
         for(var26 = 2; var26 < var43.length; var26 += 2) {
            var3 = var43[var26];
            var47 = var43[1 + var26] << 1;
            var27 = var48 * (var3 - var39) + (var3 - var39) / 2;

            for(var8 = var39; var8 < var3; ++var8) {
               int var28 = var3 - var39;
               int var9 = var27 >>> 31;
               var29 = (var27 + var9) / var28 - var9;
               int var10 = (this.aByteArray1922[var8] & 255) + var29;
               if(var10 < 0) {
                  var10 = 0;
               }

               if(var10 > 128) {
                  var10 = 128;
               }

               this.aByteArray1922[var8] = (byte)var10;
               var27 += var47 - var48;
            }

            var39 = var3;
            var48 = var47;
         }

         for(var38 = var39; var38 < 128; ++var38) {
            var47 = var48 + (this.aByteArray1922[var38] & 255);
            if(var47 < 0) {
               var47 = 0;
            }

            if(var47 > 128) {
               var47 = 128;
            }

            this.aByteArray1922[var38] = (byte)var47;
         }

         Object var44 = null;
      }

      for(var2 = 0; var2 < var23; ++var2) {
         var40[var2].anInt1379 = var4.readUByte() * 1689182337;
      }

      for(var2 = 0; var2 < var23; ++var2) {
         var24 = var40[var2];
         if(null != var24.aByteArray1382) {
            var24.anInt1377 = var4.readUByte() * 1669352065;
         }

         if(null != var24.aByteArray1387) {
            var24.anInt1381 = var4.readUByte() * -838367347;
         }

         if(var24.anInt1379 * 1980850049 > 0) {
            var24.anInt1378 = var4.readUByte() * -807853615;
         }
      }

      for(var2 = 0; var2 < var23; ++var2) {
         var40[var2].anInt1380 = var4.readUByte() * 1837187259;
      }

      for(var2 = 0; var2 < var23; ++var2) {
         var24 = var40[var2];
         if(var24.anInt1380 * 1769407603 > 0) {
            var24.anInt1383 = var4.readUByte() * 1373622855;
         }
      }

      for(var2 = 0; var2 < var23; ++var2) {
         var24 = var40[var2];
         if(var24.anInt1383 * -1426573449 > 0) {
            var24.anInt1385 = var4.readUByte() * 1286376395;
         }
      }

   }

   static void method1996(int var0, byte var1) {
      if(var0 >= 0) {
         int var7 = Client.menuActionXInteractions[var0];
         int var3 = Client.menuActionYInteractions[var0];
         int var4 = Client.menuActionIdentifiers[var0];
         int var5 = Client.menuActionParameters[var0];
         String var6 = Client.menuActionNamePrefix[var0];
         String var2 = Client.menuActionNames[var0];
         MouseCapturer.processClickAction(var7, var3, var4, var5, var6, var2, MouseInputHandler.anInt774 * 472132205, MouseInputHandler.anInt778 * 1498262827, 1721706574);
      }
   }

   public static void sleep(long timeout) {
      if(timeout > 0L) {
         if(timeout % 10L != 0L) {
            ChatMessagesContainer.sleep(timeout);
         } else {
            ChatMessagesContainer.sleep(timeout - 1L);
            ChatMessagesContainer.sleep(1L);
         }
      }
   }

   void method1998(byte var1) {
      this.anIntArray1918 = null;
   }
}
