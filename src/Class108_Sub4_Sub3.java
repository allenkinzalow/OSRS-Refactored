
public class Class108_Sub4_Sub3 extends Class108_Sub4 {

   int[] anIntArray2303 = new int[16];
   int anInt2304 = 1768777984;
   int anInt2305 = -2005863104;
   int[] anIntArray2306 = new int[16];
   int[] anIntArray2307 = new int[16];
   int[] anIntArray2308 = new int[16];
   int[] anIntArray2309 = new int[16];
   int[] anIntArray2310 = new int[16];
   int[] anIntArray2311 = new int[16];
   int[] anIntArray2312 = new int[16];
   Class108_Sub21[][] aClass108_Sub21ArrayArray2313 = new Class108_Sub21[16][128];
   int[] anIntArray2314 = new int[16];
   int[] anIntArray2316 = new int[16];
   long aLong2317;
   int[] anIntArray2318 = new int[16];
   int[] anIntArray2319 = new int[16];
   int anInt2320;
   int[] anIntArray2321 = new int[16];
   Class108_Sub21[][] aClass108_Sub21ArrayArray2322 = new Class108_Sub21[16][128];
   int[] anIntArray2323 = new int[16];
   Class96 aClass96_2324 = new Class96();
   boolean aBool2325;
   int[] anIntArray2326 = new int[16];
   int anInt2327;
   HashTable aClass101_2328 = new HashTable(128);
   long aLong2329;
   Class108_Sub4_Sub4 aClass108_Sub4_Sub4_2330 = new Class108_Sub4_Sub4(this);


   public synchronized void method2603(int var1, int var2, short var3) {
      this.method2613(var1, var2, (short)-4232);
   }

   public synchronized void method2607(byte var1) {
      for(Class108_Sub22 var2 = (Class108_Sub22)this.aClass101_2328.method1304(); var2 != null; var2 = (Class108_Sub22)this.aClass101_2328.method1303()) {
         var2.method1998((byte)95);
      }

   }

   public synchronized void method2608(int var1) {
      for(Class108_Sub22 var2 = (Class108_Sub22)this.aClass101_2328.method1304(); null != var2; var2 = (Class108_Sub22)this.aClass101_2328.method1303()) {
         var2.unlink();
      }

   }

   public synchronized void method2609(RSSong var1, boolean var2, int var3) {
      this.method2610(307503530);
      this.aClass96_2324.method1257(var1.aByteArray1929);
      this.aBool2325 = var2;
      this.aLong2317 = 0L;
      int var5 = this.aClass96_2324.method1237();

      for(int var4 = 0; var4 < var5; ++var4) {
         if(var3 >= '\uffff') {
            return;
         }

         this.aClass96_2324.method1253(var4);
         this.aClass96_2324.method1218(var4);
         this.aClass96_2324.method1245(var4);
      }

      this.anInt2320 = this.aClass96_2324.method1226() * -1503622537;
      this.anInt2327 = this.aClass96_2324.anIntArray1370[this.anInt2320 * -1773113529] * -755470397;
      this.aLong2329 = this.aClass96_2324.method1250(this.anInt2327 * -1655015189) * 8401190353266218817L;
   }

   public synchronized void method2610(int var1) {
      this.aClass96_2324.method1215();
      this.method2673((byte)120);
   }

   public synchronized boolean method2611(int var1) {
      return this.aClass96_2324.method1260();
   }

   void method2613(int var1, int var2, short var3) {
      this.anIntArray2309[var1] = var2;
      this.anIntArray2311[var1] = var2 & -128;
      this.method2666(var1, var2, (byte)0);
   }

   void method2615(int var1, int var2, int var3, int var4) {
      this.method2617(var1, var2, 64, (byte)84);
      if(0 != (this.anIntArray2316[var1] & 2)) {
         for(Class108_Sub21 var6 = (Class108_Sub21)this.aClass108_Sub4_Sub4_2330.aClass105_2333.method1332(); null != var6; var6 = (Class108_Sub21)this.aClass108_Sub4_Sub4_2330.aClass105_2333.method1342()) {
            if(var1 == var6.anInt1905 * 1560661155 && var6.anInt1909 * 572686857 < 0) {
               this.aClass108_Sub21ArrayArray2322[var1][var6.anInt1900 * 1691952267] = null;
               this.aClass108_Sub21ArrayArray2322[var1][var2] = var6;
               int var7 = var6.anInt1914 * -1223369821 + (var6.anInt1896 * -383288663 * var6.anInt1897 * 407709101 >> 12);
               var6.anInt1914 += (var2 - var6.anInt1900 * 1691952267 << 8) * -1306251253;
               var6.anInt1897 = (var7 - var6.anInt1914 * -1223369821) * 835028517;
               var6.anInt1896 = 479825920;
               var6.anInt1900 = var2 * 1880302371;
               return;
            }
         }
      }

      Class108_Sub22 var9 = (Class108_Sub22)this.aClass101_2328.get((long) this.anIntArray2312[var1]);
      if(null != var9) {
         Class108_Sub1_Sub1 var10 = var9.aClass108_Sub1_Sub1Array1919[var2];
         if(null != var10) {
            Class108_Sub21 var5 = new Class108_Sub21();
            var5.anInt1905 = var1 * 267732747;
            var5.aClass108_Sub22_1903 = var9;
            var5.aClass108_Sub1_Sub1_1907 = var10;
            var5.aClass100_1898 = var9.aClass100Array1927[var2];
            var5.anInt1899 = var9.aByteArray1924[var2] * 458231025;
            var5.anInt1900 = var2 * 1880302371;
            var5.anInt1901 = (1024 + var3 * var3 * var9.anInt1923 * -1660693305 * var9.aByteArray1921[var2] >> 11) * -1333087875;
            var5.anInt1902 = (var9.aByteArray1922[var2] & 255) * 775161837;
            var5.anInt1914 = ((var2 << 8) - (var9.aShortArray1920[var2] & 32767)) * -1306251253;
            var5.anInt1917 = 0;
            var5.anInt1908 = 0;
            var5.anInt1906 = 0;
            var5.anInt1909 = 2145670087;
            var5.anInt1910 = 0;
            if(0 == this.anIntArray2310[var1]) {
               var5.aClass108_Sub4_Sub2_1913 = Class108_Sub4_Sub2.method2366(var10, this.method2628(var5, (byte)-58), this.method2688(var5, 1676507158), this.method2630(var5, -687638983));
            } else {
               var5.aClass108_Sub4_Sub2_1913 = Class108_Sub4_Sub2.method2366(var10, this.method2628(var5, (byte)23), 0, this.method2630(var5, 135304976));
               this.method2616(var5, var9.aShortArray1920[var2] < 0, 1782807344);
            }

            if(var9.aShortArray1920[var2] < 0) {
               var5.aClass108_Sub4_Sub2_1913.method2396(-1);
            }

            if(var5.anInt1899 * 2024891409 >= 0) {
               Class108_Sub21 var8 = this.aClass108_Sub21ArrayArray2313[var1][var5.anInt1899 * 2024891409];
               if(var8 != null && var8.anInt1909 * 572686857 < 0) {
                  this.aClass108_Sub21ArrayArray2322[var1][var8.anInt1900 * 1691952267] = null;
                  var8.anInt1909 = 0;
               }

               this.aClass108_Sub21ArrayArray2313[var1][var5.anInt1899 * 2024891409] = var5;
            }

            this.aClass108_Sub4_Sub4_2330.aClass105_2333.insertBack(var5);
            this.aClass108_Sub21ArrayArray2322[var1][var2] = var5;
         }
      }
   }

   void method2616(Class108_Sub21 var1, boolean var2, int var3) {
      int var4 = var1.aClass108_Sub1_Sub1_1907.aByteArray2254.length;
      int var6;
      if(var2 && var1.aClass108_Sub1_Sub1_1907.aBool2255) {
         int var5 = var4 + var4 - var1.aClass108_Sub1_Sub1_1907.anInt2258;
         var6 = (int)((long)this.anIntArray2310[var1.anInt1905 * 1560661155] * (long)var5 >> 6);
         var4 <<= 8;
         if(var6 >= var4) {
            var6 = var4 + var4 - 1 - var6;
            var1.aClass108_Sub4_Sub2_1913.method2374(true);
         }
      } else {
         var6 = (int)((long)this.anIntArray2310[var1.anInt1905 * 1560661155] * (long)var4 >> 6);
      }

      var1.aClass108_Sub4_Sub2_1913.method2395(var6);
   }

   void method2617(int var1, int var2, int var3, byte var4) {
      Class108_Sub21 var5 = this.aClass108_Sub21ArrayArray2322[var1][var2];
      if(var5 != null) {
         this.aClass108_Sub21ArrayArray2322[var1][var2] = null;
         if(0 != (this.anIntArray2316[var1] & 2)) {
            for(Class108_Sub21 var6 = (Class108_Sub21)this.aClass108_Sub4_Sub4_2330.aClass105_2333.getFront(); var6 != null; var6 = (Class108_Sub21)this.aClass108_Sub4_Sub4_2330.aClass105_2333.getNext()) {
               if(var6.anInt1905 * 1560661155 == var5.anInt1905 * 1560661155 && var6.anInt1909 * 572686857 < 0 && var5 != var6) {
                  var5.anInt1909 = 0;
                  return;
               }
            }

         } else {
            var5.anInt1909 = 0;
         }
      }
   }

   void method2618(int var1, int var2, int var3, int var4) {}

   void method2619(int var1, int var2, int var3) {}

   void method2621(int var1, byte var2) {
      for(Class108_Sub21 var3 = (Class108_Sub21)this.aClass108_Sub4_Sub4_2330.aClass105_2333.getFront(); var3 != null; var3 = (Class108_Sub21)this.aClass108_Sub4_Sub4_2330.aClass105_2333.getNext()) {
         if(var1 < 0 || var1 == var3.anInt1905 * 1560661155) {
            if(var3.aClass108_Sub4_Sub2_1913 != null) {
               var3.aClass108_Sub4_Sub2_1913.method2431(Class7.anInt94 * -322018941 / 100);
               if(var3.aClass108_Sub4_Sub2_1913.method2381()) {
                  this.aClass108_Sub4_Sub4_2330.aClass108_Sub4_Sub1_2334.method2050(var3.aClass108_Sub4_Sub2_1913);
               }

               var3.method1985(1830731980);
            }

            if(var3.anInt1909 * 572686857 < 0) {
               this.aClass108_Sub21ArrayArray2322[var3.anInt1905 * 1560661155][var3.anInt1900 * 1691952267] = null;
            }

            var3.unlink();
         }
      }

   }

   void method2625(int var1, int var2) {
      if((this.anIntArray2316[var1] & 2) != 0) {
         for(Class108_Sub21 var3 = (Class108_Sub21)this.aClass108_Sub4_Sub4_2330.aClass105_2333.getFront(); var3 != null; var3 = (Class108_Sub21)this.aClass108_Sub4_Sub4_2330.aClass105_2333.getNext()) {
            if(var3.anInt1905 * 1560661155 == var1 && null == this.aClass108_Sub21ArrayArray2322[var1][var3.anInt1900 * 1691952267] && var3.anInt1909 * 572686857 < 0) {
               var3.anInt1909 = 0;
            }
         }

      }
   }

   void method2626(int var1, byte var2) {
      int var3 = var1 & 240;
      int var4;
      int var5;
      int var6;
      if(var3 == 128) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method2617(var4, var5, var6, (byte)46);
      } else if(144 == var3) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if(var6 > 0) {
            this.method2615(var4, var5, var6, 359294600);
         } else {
            this.method2617(var4, var5, 64, (byte)101);
         }
      } else if(160 == var3) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method2618(var4, var5, var6, -612250196);
      } else if(176 == var3) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if(0 == var5) {
            this.anIntArray2311[var4] = (var6 << 14) + (this.anIntArray2311[var4] & -2080769);
         }

         if(var5 == 32) {
            this.anIntArray2311[var4] = (var6 << 7) + (this.anIntArray2311[var4] & -16257);
         }

         if(var5 == 1) {
            this.anIntArray2323[var4] = (var6 << 7) + (this.anIntArray2323[var4] & -16257);
         }

         if(var5 == 33) {
            this.anIntArray2323[var4] = (this.anIntArray2323[var4] & -128) + var6;
         }

         if(5 == var5) {
            this.anIntArray2314[var4] = (this.anIntArray2314[var4] & -16257) + (var6 << 7);
         }

         if(var5 == 37) {
            this.anIntArray2314[var4] = (this.anIntArray2314[var4] & -128) + var6;
         }

         if(var5 == 7) {
            this.anIntArray2303[var4] = (var6 << 7) + (this.anIntArray2303[var4] & -16257);
         }

         if(var5 == 39) {
            this.anIntArray2303[var4] = var6 + (this.anIntArray2303[var4] & -128);
         }

         if(10 == var5) {
            this.anIntArray2307[var4] = (var6 << 7) + (this.anIntArray2307[var4] & -16257);
         }

         if(var5 == 42) {
            this.anIntArray2307[var4] = (this.anIntArray2307[var4] & -128) + var6;
         }

         if(var5 == 11) {
            this.anIntArray2308[var4] = (var6 << 7) + (this.anIntArray2308[var4] & -16257);
         }

         if(var5 == 43) {
            this.anIntArray2308[var4] = var6 + (this.anIntArray2308[var4] & -128);
         }

         if(var5 == 64) {
            if(var6 >= 64) {
               this.anIntArray2316[var4] |= 1;
            } else {
               this.anIntArray2316[var4] &= -2;
            }
         }

         if(var5 == 65) {
            if(var6 >= 64) {
               this.anIntArray2316[var4] |= 2;
            } else {
               this.method2625(var4, 1731392087);
               this.anIntArray2316[var4] &= -3;
            }
         }

         if(var5 == 99) {
            this.anIntArray2306[var4] = (this.anIntArray2306[var4] & 127) + (var6 << 7);
         }

         if(var5 == 98) {
            this.anIntArray2306[var4] = var6 + (this.anIntArray2306[var4] & 16256);
         }

         if(101 == var5) {
            this.anIntArray2306[var4] = (var6 << 7) + 16384 + (this.anIntArray2306[var4] & 127);
         }

         if(var5 == 100) {
            this.anIntArray2306[var4] = (this.anIntArray2306[var4] & 16256) + 16384 + var6;
         }

         if(120 == var5) {
            this.method2621(var4, (byte)-51);
         }

         if(var5 == 121) {
            this.method2660(var4, -2065934660);
         }

         if(123 == var5) {
            this.method2638(var4, 1729120777);
         }

         int var7;
         if(6 == var5) {
            var7 = this.anIntArray2306[var4];
            if(16384 == var7) {
               this.anIntArray2318[var4] = (this.anIntArray2318[var4] & -16257) + (var6 << 7);
            }
         }

         if(var5 == 38) {
            var7 = this.anIntArray2306[var4];
            if(var7 == 16384) {
               this.anIntArray2318[var4] = (this.anIntArray2318[var4] & -128) + var6;
            }
         }

         if(var5 == 16) {
            this.anIntArray2310[var4] = (this.anIntArray2310[var4] & -16257) + (var6 << 7);
         }

         if(var5 == 48) {
            this.anIntArray2310[var4] = var6 + (this.anIntArray2310[var4] & -128);
         }

         if(81 == var5) {
            if(var6 >= 64) {
               this.anIntArray2316[var4] |= 4;
            } else {
               this.method2636(var4, (byte)4);
               this.anIntArray2316[var4] &= -5;
            }
         }

         if(var5 == 17) {
            this.method2627(var4, (var6 << 7) + (this.anIntArray2326[var4] & -16257), (byte)10);
         }

         if(var5 == 49) {
            this.method2627(var4, var6 + (this.anIntArray2326[var4] & -128), (byte)-26);
         }
      } else if(192 == var3) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method2666(var4, var5 + this.anIntArray2311[var4], (byte)0);
      } else if(var3 == 208) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method2619(var4, var5, 2018436549);
      } else if(var3 == 224) {
         var4 = var1 & 15;
         var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method2631(var4, var5, -410784695);
      } else {
         var3 = var1 & 255;
         if(255 == var3) {
            this.method2673((byte)66);
         }
      }
   }

   void method2627(int var1, int var2, byte var3) {
      this.anIntArray2326[var1] = var2;
      this.anIntArray2321[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
   }

   int method2628(Class108_Sub21 var1, byte var2) {
      int var3 = (var1.anInt1896 * -383288663 * var1.anInt1897 * 407709101 >> 12) + var1.anInt1914 * -1223369821;
      var3 += (this.anIntArray2319[var1.anInt1905 * 1560661155] - 8192) * this.anIntArray2318[var1.anInt1905 * 1560661155] >> 12;
      Class100 var4 = var1.aClass100_1898;
      int var6;
      if(var4.anInt1380 * 1769407603 > 0 && (var4.anInt1383 * -1426573449 > 0 || this.anIntArray2323[var1.anInt1905 * 1560661155] > 0)) {
         var6 = var4.anInt1383 * -1426573449 << 2;
         int var5 = var4.anInt1385 * 1297400291 << 1;
         if(var1.anInt1911 * 537300453 < var5) {
            var6 = var6 * var1.anInt1911 * 537300453 / var5;
         }

         var6 += this.anIntArray2323[var1.anInt1905 * 1560661155] >> 7;
         double var7 = Math.sin(0.01227184630308513D * (double)(var1.anInt1912 * 28037891 & 511));
         var3 += (int)(var7 * (double)var6);
      }

      var6 = (int)((double)(var1.aClass108_Sub1_Sub1_1907.anInt2256 * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var3) / (double)(Class7.anInt94 * -322018941) + 0.5D);
      return var6 < 1?1:var6;
   }

   int method2630(Class108_Sub21 var1, int var2) {
      int var3 = this.anIntArray2307[var1.anInt1905 * 1560661155];
      return var3 >= 8192?16384 - (32 + (16384 - var3) * (128 - var1.anInt1902 * 399076837) >> 6):32 + var1.anInt1902 * 399076837 * var3 >> 6;
   }

   protected synchronized Class108_Sub4 method1608() {
      return this.aClass108_Sub4_Sub4_2330;
   }

   protected synchronized Class108_Sub4 method1599() {
      return null;
   }

   protected synchronized int method1598() {
      return 0;
   }

   void method2631(int var1, int var2, int var3) {
      this.anIntArray2319[var1] = var2;
   }

   protected synchronized void method1602(int var1) {
      if(this.aClass96_2324.method1260()) {
         int var2 = this.anInt2305 * -1161489819 * this.aClass96_2324.anInt1360 / (Class7.anInt94 * -322018941);

         do {
            long var3 = (long)var2 * (long)var1 + this.aLong2317 * 34629965969141187L;
            if(1032238624146028737L * this.aLong2329 - var3 >= 0L) {
               this.aLong2317 = 6465582686444694251L * var3;
               break;
            }

            int var5 = (int)(((long)var2 + (this.aLong2329 * 1032238624146028737L - 34629965969141187L * this.aLong2317) - 1L) / (long)var2);
            this.aLong2317 += (long)var2 * (long)var5 * 6465582686444694251L;
            this.aClass108_Sub4_Sub4_2330.method1602(var5);
            var1 -= var5;
            this.method2632((byte)0);
         } while(this.aClass96_2324.method1260());
      }

      this.aClass108_Sub4_Sub4_2330.method1602(var1);
   }

   void method2632(byte var1) {
      int var2 = this.anInt2320 * -1773113529;
      int var6 = this.anInt2327 * -1655015189;

      long var4;
      for(var4 = this.aLong2329 * 1032238624146028737L; var6 == this.anInt2327 * -1655015189; var4 = this.aClass96_2324.method1250(var6)) {
         while(var6 == this.aClass96_2324.anIntArray1370[var2]) {
            this.aClass96_2324.method1253(var2);
            int var3 = this.aClass96_2324.method1221(var2);
            if(1 == var3) {
               this.aClass96_2324.method1220();
               this.aClass96_2324.method1245(var2);
               if(this.aClass96_2324.method1227()) {
                  if(!this.aBool2325 || var6 == 0) {
                     this.method2673((byte)112);
                     this.aClass96_2324.method1215();
                     return;
                  }

                  this.aClass96_2324.method1228(var4);
               }
               break;
            }

            if(0 != (var3 & 128)) {
               this.method2626(var3, (byte)78);
            }

            this.aClass96_2324.method1218(var2);
            this.aClass96_2324.method1245(var2);
         }

         var2 = this.aClass96_2324.method1226();
         var6 = this.aClass96_2324.anIntArray1370[var2];
      }

      this.anInt2320 = var2 * -1503622537;
      this.anInt2327 = var6 * -755470397;
      this.aLong2329 = var4 * 8401190353266218817L;
   }

   boolean method2633(Class108_Sub21 var1, int var2) {
      if(var1.aClass108_Sub4_Sub2_1913 == null) {
         if(var1.anInt1909 * 572686857 >= 0) {
            var1.unlink();
            if(var1.anInt1899 * 2024891409 > 0 && this.aClass108_Sub21ArrayArray2313[var1.anInt1905 * 1560661155][var1.anInt1899 * 2024891409] == var1) {
               this.aClass108_Sub21ArrayArray2313[var1.anInt1905 * 1560661155][var1.anInt1899 * 2024891409] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   boolean method2634(Class108_Sub21 var1, int[] var2, int var3, int var4, byte var5) {
      var1.anInt1904 = Class7.anInt94 * -322018941 / 100 * -1031084247;
      if(var1.anInt1909 * 572686857 >= 0 && (var1.aClass108_Sub4_Sub2_1913 == null || var1.aClass108_Sub4_Sub2_1913.method2371())) {
         var1.method1985(1914608220);
         var1.unlink();
         if(var1.anInt1899 * 2024891409 > 0 && var1 == this.aClass108_Sub21ArrayArray2313[var1.anInt1905 * 1560661155][var1.anInt1899 * 2024891409]) {
            this.aClass108_Sub21ArrayArray2313[var1.anInt1905 * 1560661155][var1.anInt1899 * 2024891409] = null;
         }

         return true;
      } else {
         int var7 = var1.anInt1896 * -383288663;
         if(var7 > 0) {
            var7 -= (int)(16.0D * Math.pow(2.0D, (double)this.anIntArray2314[var1.anInt1905 * 1560661155] * 4.921259842519685E-4D) + 0.5D);
            if(var7 < 0) {
               var7 = 0;
            }

            var1.anInt1896 = var7 * 401721753;
         }

         var1.aClass108_Sub4_Sub2_1913.method2478(this.method2628(var1, (byte)-47));
         Class100 var6 = var1.aClass100_1898;
         boolean var8 = false;
         var1.anInt1911 += 973203437;
         var1.anInt1912 += var6.anInt1380 * -562719279;
         double var9 = (double)((var1.anInt1900 * 1691952267 - 60 << 8) + (var1.anInt1896 * -383288663 * var1.anInt1897 * 407709101 >> 12)) * 5.086263020833333E-6D;
         if(var6.anInt1379 * 1980850049 > 0) {
            if(var6.anInt1378 * -2081761487 > 0) {
               var1.anInt1917 += (int)(128.0D * Math.pow(2.0D, (double)(var6.anInt1378 * -2081761487) * var9) + 0.5D) * 1510120121;
            } else {
               var1.anInt1917 += 21847168;
            }
         }

         if(var6.aByteArray1382 != null) {
            if(var6.anInt1377 * 210630017 > 0) {
               var1.anInt1908 += (int)(128.0D * Math.pow(2.0D, var9 * (double)(var6.anInt1377 * 210630017)) + 0.5D) * -1717834601;
            } else {
               var1.anInt1908 -= 839496832;
            }

            while(var1.anInt1906 * -1230782901 < var6.aByteArray1382.length - 2 && var1.anInt1908 * -2147069145 > (var6.aByteArray1382[var1.anInt1906 * -1230782901 + 2] & 255) << 8) {
               var1.anInt1906 += 457520838;
            }

            if(var1.anInt1906 * -1230782901 == var6.aByteArray1382.length - 2 && 0 == var6.aByteArray1382[1 + var1.anInt1906 * -1230782901]) {
               var8 = true;
            }
         }

         if(var1.anInt1909 * 572686857 >= 0 && var6.aByteArray1387 != null && 0 == (this.anIntArray2316[var1.anInt1905 * 1560661155] & 1) && (var1.anInt1899 * 2024891409 < 0 || this.aClass108_Sub21ArrayArray2313[var1.anInt1905 * 1560661155][var1.anInt1899 * 2024891409] != var1)) {
            if(var6.anInt1381 * 298652485 > 0) {
               var1.anInt1909 += (int)(128.0D * Math.pow(2.0D, var9 * (double)(var6.anInt1381 * 298652485)) + 0.5D) * -2145670087;
            } else {
               var1.anInt1909 += 232135808;
            }

            while(var1.anInt1910 * 474053289 < var6.aByteArray1387.length - 2 && var1.anInt1909 * 572686857 > (var6.aByteArray1387[2 + var1.anInt1910 * 474053289] & 255) << 8) {
               var1.anInt1910 += 787452722;
            }

            if(var6.aByteArray1387.length - 2 == var1.anInt1910 * 474053289) {
               var8 = true;
            }
         }

         if(var8) {
            var1.aClass108_Sub4_Sub2_1913.method2431(var1.anInt1904 * 1445111065);
            if(null != var2) {
               var1.aClass108_Sub4_Sub2_1913.method1601(var2, var3, var4);
            } else {
               var1.aClass108_Sub4_Sub2_1913.method1602(var4);
            }

            if(var1.aClass108_Sub4_Sub2_1913.method2381()) {
               this.aClass108_Sub4_Sub4_2330.aClass108_Sub4_Sub1_2334.method2050(var1.aClass108_Sub4_Sub2_1913);
            }

            var1.method1985(2139883995);
            if(var1.anInt1909 * 572686857 >= 0) {
               var1.unlink();
               if(var1.anInt1899 * 2024891409 > 0 && this.aClass108_Sub21ArrayArray2313[var1.anInt1905 * 1560661155][var1.anInt1899 * 2024891409] == var1) {
                  this.aClass108_Sub21ArrayArray2313[var1.anInt1905 * 1560661155][var1.anInt1899 * 2024891409] = null;
               }
            }

            return true;
         } else {
            var1.aClass108_Sub4_Sub2_1913.method2377(var1.anInt1904 * 1445111065, this.method2688(var1, -804289521), this.method2630(var1, -99215315));
            return false;
         }
      }
   }

   void method2636(int var1, byte var2) {
      if((this.anIntArray2316[var1] & 4) != 0) {
         for(Class108_Sub21 var3 = (Class108_Sub21)this.aClass108_Sub4_Sub4_2330.aClass105_2333.getFront(); var3 != null; var3 = (Class108_Sub21)this.aClass108_Sub4_Sub4_2330.aClass105_2333.getNext()) {
            if(var1 == var3.anInt1905 * 1560661155) {
               var3.anInt1915 = 0;
            }
         }

      }
   }

   protected synchronized void method1601(int[] var1, int var2, int var3) {
      if(this.aClass96_2324.method1260()) {
         int var4 = this.aClass96_2324.anInt1360 * this.anInt2305 * -1161489819 / (Class7.anInt94 * -322018941);

         do {
            long var6 = 34629965969141187L * this.aLong2317 + (long)var3 * (long)var4;
            if(1032238624146028737L * this.aLong2329 - var6 >= 0L) {
               this.aLong2317 = 6465582686444694251L * var6;
               break;
            }

            int var5 = (int)(((long)var4 + (this.aLong2329 * 1032238624146028737L - 34629965969141187L * this.aLong2317) - 1L) / (long)var4);
            this.aLong2317 += (long)var4 * (long)var5 * 6465582686444694251L;
            this.aClass108_Sub4_Sub4_2330.method1601(var1, var2, var5);
            var2 += var5;
            var3 -= var5;
            this.method2632((byte)0);
         } while(this.aClass96_2324.method1260());
      }

      this.aClass108_Sub4_Sub4_2330.method1601(var1, var2, var3);
   }

   public synchronized void method2637(int var1, int var2) {
      this.anInt2304 = var1 * -1570149015;
   }

   void method2638(int var1, int var2) {
      for(Class108_Sub21 var3 = (Class108_Sub21)this.aClass108_Sub4_Sub4_2330.aClass105_2333.getFront(); var3 != null; var3 = (Class108_Sub21)this.aClass108_Sub4_Sub4_2330.aClass105_2333.getNext()) {
         if((var1 < 0 || var1 == var3.anInt1905 * 1560661155) && var3.anInt1909 * 572686857 < 0) {
            this.aClass108_Sub21ArrayArray2322[var3.anInt1905 * 1560661155][var3.anInt1900 * 1691952267] = null;
            var3.anInt1909 = 0;
         }
      }

   }

   void method2660(int var1, int var2) {
      if(var1 >= 0) {
         this.anIntArray2303[var1] = 12800;
         this.anIntArray2307[var1] = 8192;
         this.anIntArray2308[var1] = 16383;
         this.anIntArray2319[var1] = 8192;
         this.anIntArray2323[var1] = 0;
         this.anIntArray2314[var1] = 8192;
         this.method2625(var1, 1979901439);
         this.method2636(var1, (byte)4);
         this.anIntArray2316[var1] = 0;
         this.anIntArray2306[var1] = 32767;
         this.anIntArray2318[var1] = 256;
         this.anIntArray2310[var1] = 0;
         this.method2627(var1, 8192, (byte)33);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method2660(var1, 809371271);
         }

      }
   }

   void method2666(int var1, int var2, byte var3) {
      if(this.anIntArray2312[var1] != var2) {
         this.anIntArray2312[var1] = var2;

         for(int var4 = 0; var4 < 128; ++var4) {
            this.aClass108_Sub21ArrayArray2313[var1][var4] = null;
         }

      }
   }

   public synchronized boolean method2668(RSSong var1, AbstractIndex var2, SoundEffectWorker var3, int var4, int var5) {
      var1.method2001();
      boolean var12 = true;
      int[] var11 = null;
      if(var4 > 0) {
         var11 = new int[]{var4};
      }

      for(Class108_Sub18 var9 = (Class108_Sub18)var1.aClass101_1928.method1304(); var9 != null; var9 = (Class108_Sub18)var1.aClass101_1928.method1303()) {
         int var7 = (int)var9.key;
         Class108_Sub22 var8 = (Class108_Sub22)this.aClass101_2328.get((long) var7);
         if(var8 == null) {
            byte[] var10 = var2.getFirstData(var7, -1464621970);
            Class108_Sub22 var6;
            if(var10 == null) {
               var6 = null;
            } else {
               var6 = new Class108_Sub22(var10);
            }

            var8 = var6;
            if(var6 == null) {
               var12 = false;
               continue;
            }

            this.aClass101_2328.put(var6, (long)var7);
         }

         if(!var8.method1990(var3, var9.aByteArray1891, var11, 627554980)) {
            var12 = false;
         }
      }

      if(var12) {
         var1.method2003();
      }

      return var12;
   }

   void method2673(byte var1) {
      this.method2621(-1, (byte)-94);
      this.method2660(-1, 1677578695);

      int var2;
      for(var2 = 0; var2 < 16; ++var2) {
         if(var1 <= 1) {
            return;
         }

         this.anIntArray2312[var2] = this.anIntArray2309[var2];
      }

      for(var2 = 0; var2 < 16; ++var2) {
         if(var1 <= 1) {
            return;
         }

         this.anIntArray2311[var2] = this.anIntArray2309[var2] & -128;
      }

   }

   public Class108_Sub4_Sub3() {
      this.method2673((byte)47);
   }

   int method2688(Class108_Sub21 var1, int var2) {
      Class100 var3 = var1.aClass100_1898;
      int var5 = this.anIntArray2303[var1.anInt1905 * 1560661155] * this.anIntArray2308[var1.anInt1905 * 1560661155] + 4096 >> 13;
      var5 = 16384 + var5 * var5 >> 15;
      var5 = var1.anInt1901 * -482078763 * var5 + 16384 >> 15;
      var5 = var5 * this.anInt2304 * 971895513 + 128 >> 8;
      if(var3.anInt1379 * 1980850049 > 0) {
         var5 = (int)((double)var5 * Math.pow(0.5D, (double)(var3.anInt1379 * 1980850049) * (double)(var1.anInt1917 * 201280393) * 1.953125E-5D) + 0.5D);
      }

      int var4;
      int var6;
      int var7;
      int var8;
      if(null != var3.aByteArray1382) {
         var4 = var1.anInt1908 * -2147069145;
         var6 = var3.aByteArray1382[1 + var1.anInt1906 * -1230782901];
         if(var1.anInt1906 * -1230782901 < var3.aByteArray1382.length - 2) {
            var7 = (var3.aByteArray1382[var1.anInt1906 * -1230782901] & 255) << 8;
            var8 = (var3.aByteArray1382[2 + var1.anInt1906 * -1230782901] & 255) << 8;
            var6 += (var3.aByteArray1382[3 + var1.anInt1906 * -1230782901] - var6) * (var4 - var7) / (var8 - var7);
         }

         var5 = var5 * var6 + 32 >> 6;
      }

      if(var1.anInt1909 * 572686857 > 0 && null != var3.aByteArray1387) {
         var4 = var1.anInt1909 * 572686857;
         var6 = var3.aByteArray1387[1 + var1.anInt1910 * 474053289];
         if(var1.anInt1910 * 474053289 < var3.aByteArray1387.length - 2) {
            var7 = (var3.aByteArray1387[var1.anInt1910 * 474053289] & 255) << 8;
            var8 = (var3.aByteArray1387[2 + var1.anInt1910 * 474053289] & 255) << 8;
            var6 += (var3.aByteArray1387[var1.anInt1910 * 474053289 + 3] - var6) * (var4 - var7) / (var8 - var7);
         }

         var5 = 32 + var5 * var6 >> 6;
      }

      return var5;
   }

   public int method2691(int var1) {
      return this.anInt2304 * 971895513;
   }
}
