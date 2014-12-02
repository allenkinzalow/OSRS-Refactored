
public class Class108_Sub4_Sub2 extends Class108_Sub4 {

   boolean aBool2228;
   int anInt2229;
   int anInt2230;
   int anInt2231;
   int anInt2232;
   int anInt2233;
   int anInt2234;
   int anInt2235;
   int anInt2236;
   int anInt2237;
   int anInt2238;
   int anInt2239;
   int anInt2240;
   int anInt2241;
   int anInt2242;


   Class108_Sub4_Sub2(Class108_Sub1_Sub1 var1, int var2, int var3) {
      this.aClass108_Sub1_1545 = var1;
      this.anInt2236 = var1.anInt2258;
      this.anInt2230 = var1.anInt2257;
      this.aBool2228 = var1.aBool2255;
      this.anInt2237 = var2;
      this.anInt2239 = var3;
      this.anInt2231 = 8192;
      this.anInt2240 = 0;
      this.method2367();
   }

   Class108_Sub4_Sub2(Class108_Sub1_Sub1 var1, int var2, int var3, int var4) {
      this.aClass108_Sub1_1545 = var1;
      this.anInt2236 = var1.anInt2258;
      this.anInt2230 = var1.anInt2257;
      this.aBool2228 = var1.aBool2255;
      this.anInt2237 = var2;
      this.anInt2239 = var3;
      this.anInt2231 = var4;
      this.anInt2240 = 0;
      this.method2367();
   }

   public static Class108_Sub4_Sub2 method2365(Class108_Sub1_Sub1 var0, int var1, int var2) {
      return var0.aByteArray2254 != null && var0.aByteArray2254.length != 0?new Class108_Sub4_Sub2(var0, (int)((long)var0.anInt2256 * 256L * (long)var1 / (long)(Class7.anInt94 * -2137123028)), var2 << 6):null;
   }

   public static Class108_Sub4_Sub2 method2366(Class108_Sub1_Sub1 var0, int var1, int var2, int var3) {
      return var0.aByteArray2254 != null && var0.aByteArray2254.length != 0?new Class108_Sub4_Sub2(var0, var1, var2, var3):null;
   }

   void method2367() {
      this.anInt2232 = this.anInt2239;
      this.anInt2238 = method2469(this.anInt2239, this.anInt2231);
      this.anInt2234 = method2411(this.anInt2239, this.anInt2231);
   }

   protected int method1598() {
      return this.anInt2239 == 0 && this.anInt2241 == 0?0:1;
   }

   public synchronized void method2368(int var1) {
      this.method2370(var1 << 6, this.method2372());
   }

   synchronized void method2369(int var1) {
      this.method2370(var1, this.method2372());
   }

   synchronized void method2370(int var1, int var2) {
      this.anInt2239 = var1;
      this.anInt2231 = var2;
      this.anInt2241 = 0;
      this.method2367();
   }

   public boolean method2371() {
      return this.anInt2240 < 0 || this.anInt2240 >= ((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254.length << 8;
   }

   public synchronized int method2372() {
      return this.anInt2231 >= 0?this.anInt2231:-1;
   }

   public synchronized void method2374(boolean var1) {
      this.anInt2237 = (this.anInt2237 ^ this.anInt2237 >> 31) + (this.anInt2237 >>> 31);
      if(var1) {
         this.anInt2237 = -this.anInt2237;
      }
   }

   void method2375() {
      if(this.anInt2241 != 0) {
         if(this.anInt2239 == Integer.MIN_VALUE) {
            this.anInt2239 = 0;
         }

         this.anInt2241 = 0;
         this.method2367();
      }
   }

   public synchronized void method2376(int var1, int var2) {
      this.method2377(var1, var2, this.method2372());
   }

   public synchronized void method2377(int var1, int var2, int var3) {
      if(var1 == 0) {
         this.method2370(var2, var3);
      } else {
         int var4 = method2469(var2, var3);
         int var6 = method2411(var2, var3);
         if(this.anInt2238 == var4 && this.anInt2234 == var6) {
            this.anInt2241 = 0;
         } else {
            int var5 = var2 - this.anInt2232;
            if(this.anInt2232 - var2 > var5) {
               var5 = this.anInt2232 - var2;
            }

            if(var4 - this.anInt2238 > var5) {
               var5 = var4 - this.anInt2238;
            }

            if(this.anInt2238 - var4 > var5) {
               var5 = this.anInt2238 - var4;
            }

            if(var6 - this.anInt2234 > var5) {
               var5 = var6 - this.anInt2234;
            }

            if(this.anInt2234 - var6 > var5) {
               var5 = this.anInt2234 - var6;
            }

            if(var1 > var5) {
               var1 = var5;
            }

            this.anInt2241 = var1;
            this.anInt2239 = var2;
            this.anInt2231 = var3;
            this.anInt2229 = (var2 - this.anInt2232) / var1;
            this.anInt2233 = (var4 - this.anInt2238) / var1;
            this.anInt2242 = (var6 - this.anInt2234) / var1;
         }
      }
   }

   public synchronized int method2379() {
      return this.anInt2239 == Integer.MIN_VALUE?0:this.anInt2239;
   }

   public synchronized int method2380() {
      return this.anInt2237 < 0?-this.anInt2237:this.anInt2237;
   }

   public boolean method2381() {
      return this.anInt2241 != 0;
   }

   protected Class108_Sub4 method1608() {
      return null;
   }

   public synchronized void method1602(int var1) {
      if(this.anInt2241 > 0) {
         if(var1 >= this.anInt2241) {
            if(this.anInt2239 == Integer.MIN_VALUE) {
               this.anInt2239 = 0;
               this.anInt2234 = 0;
               this.anInt2238 = 0;
               this.anInt2232 = 0;
               this.unlink();
               var1 = this.anInt2241;
            }

            this.anInt2241 = 0;
            this.method2367();
         } else {
            this.anInt2232 += this.anInt2229 * var1;
            this.anInt2238 += this.anInt2233 * var1;
            this.anInt2234 += this.anInt2242 * var1;
            this.anInt2241 -= var1;
         }
      }

      Class108_Sub1_Sub1 var7 = (Class108_Sub1_Sub1)this.aClass108_Sub1_1545;
      int var3 = this.anInt2236 << 8;
      int var4 = this.anInt2230 << 8;
      int var2 = var7.aByteArray2254.length << 8;
      int var5 = var4 - var3;
      if(var5 <= 0) {
         this.anInt2235 = 0;
      }

      if(this.anInt2240 < 0) {
         if(this.anInt2237 <= 0) {
            this.method2375();
            this.unlink();
            return;
         }

         this.anInt2240 = 0;
      }

      if(this.anInt2240 >= var2) {
         if(this.anInt2237 >= 0) {
            this.method2375();
            this.unlink();
            return;
         }

         this.anInt2240 = var2 - 1;
      }

      this.anInt2240 += this.anInt2237 * var1;
      if(this.anInt2235 < 0) {
         if(!this.aBool2228) {
            if(this.anInt2237 < 0) {
               if(this.anInt2240 < var3) {
                  this.anInt2240 = var4 - 1 - (var4 - 1 - this.anInt2240) % var5;
               }
            } else if(this.anInt2240 >= var4) {
               this.anInt2240 = var3 + (this.anInt2240 - var3) % var5;
            }
         } else {
            if(this.anInt2237 < 0) {
               if(this.anInt2240 >= var3) {
                  return;
               }

               this.anInt2240 = var3 + var3 - 1 - this.anInt2240;
               this.anInt2237 = -this.anInt2237;
            }

            while(this.anInt2240 >= var4) {
               this.anInt2240 = var4 + var4 - 1 - this.anInt2240;
               this.anInt2237 = -this.anInt2237;
               if(this.anInt2240 >= var3) {
                  return;
               }

               this.anInt2240 = var3 + var3 - 1 - this.anInt2240;
               this.anInt2237 = -this.anInt2237;
            }

         }
      } else {
         if(this.anInt2235 > 0) {
            if(this.aBool2228) {
               label183: {
                  if(this.anInt2237 < 0) {
                     if(this.anInt2240 >= var3) {
                        return;
                     }

                     this.anInt2240 = var3 + var3 - 1 - this.anInt2240;
                     this.anInt2237 = -this.anInt2237;
                     if(--this.anInt2235 == 0) {
                        break label183;
                     }
                  }

                  do {
                     if(this.anInt2240 < var4) {
                        return;
                     }

                     this.anInt2240 = var4 + var4 - 1 - this.anInt2240;
                     this.anInt2237 = -this.anInt2237;
                     if(--this.anInt2235 == 0) {
                        break;
                     }

                     if(this.anInt2240 >= var3) {
                        return;
                     }

                     this.anInt2240 = var3 + var3 - 1 - this.anInt2240;
                     this.anInt2237 = -this.anInt2237;
                  } while(--this.anInt2235 != 0);
               }
            } else {
               int var6;
               if(this.anInt2237 < 0) {
                  if(this.anInt2240 >= var3) {
                     return;
                  }

                  var6 = (var4 - 1 - this.anInt2240) / var5;
                  if(var6 < this.anInt2235) {
                     this.anInt2240 += var5 * var6;
                     this.anInt2235 -= var6;
                     return;
                  }

                  this.anInt2240 += var5 * this.anInt2235;
                  this.anInt2235 = 0;
               } else {
                  if(this.anInt2240 < var4) {
                     return;
                  }

                  var6 = (this.anInt2240 - var3) / var5;
                  if(var6 < this.anInt2235) {
                     this.anInt2240 -= var5 * var6;
                     this.anInt2235 -= var6;
                     return;
                  }

                  this.anInt2240 -= var5 * this.anInt2235;
                  this.anInt2235 = 0;
               }
            }
         }

         if(this.anInt2237 < 0) {
            if(this.anInt2240 < 0) {
               this.anInt2240 = -1;
               this.method2375();
               this.unlink();
            }
         } else if(this.anInt2240 >= var2) {
            this.anInt2240 = var2;
            this.method2375();
            this.unlink();
         }
      }
   }

   int method2386(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.anInt2241 > 0) {
            int var6 = var2 + this.anInt2241;
            if(var6 > var4) {
               var6 = var4;
            }

            this.anInt2241 += var2;
            if(this.anInt2237 == -256 && (this.anInt2240 & 255) == 0) {
               if(Class7.aBool99) {
                  var2 = method2433(0, ((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2238, this.anInt2234, this.anInt2233, this.anInt2242, 0, var6, var3, this);
               } else {
                  var2 = method2466(((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2232, this.anInt2229, 0, var6, var3, this);
               }
            } else if(Class7.aBool99) {
               var2 = method2400(0, 0, ((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2238, this.anInt2234, this.anInt2233, this.anInt2242, 0, var6, var3, this, this.anInt2237, var5);
            } else {
               var2 = method2399(0, 0, ((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2232, this.anInt2229, 0, var6, var3, this, this.anInt2237, var5);
            }

            this.anInt2241 -= var2;
            if(this.anInt2241 != 0) {
               return var2;
            }

            if(!this.method2401()) {
               continue;
            }

            return var4;
         }

         if(this.anInt2237 == -256 && (this.anInt2240 & 255) == 0) {
            if(Class7.aBool99) {
               return method2428(0, ((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2238, this.anInt2234, 0, var4, var3, this);
            }

            return method2406(((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2232, 0, var4, var3, this);
         }

         if(Class7.aBool99) {
            return method2392(0, 0, ((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2238, this.anInt2234, 0, var4, var3, this, this.anInt2237, var5);
         }

         return method2391(0, 0, ((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2232, 0, var4, var3, this, this.anInt2237, var5);
      }
   }

   static int method2388(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class108_Sub4_Sub2 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.anInt2240 = var2 << 8;
      return var3;
   }

   static int method2389(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class108_Sub4_Sub2 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.anInt2240 = var3 << 8;
      return var4 >> 1;
   }

   int method1596() {
      int var1 = this.anInt2232 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if(this.anInt2235 == 0) {
         var1 -= var1 * this.anInt2240 / (((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254.length << 8);
      } else if(this.anInt2235 >= 0) {
         var1 -= var1 * this.anInt2236 / ((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254.length;
      }

      return var1 > 255?255:var1;
   }

   static int method2391(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class108_Sub4_Sub2 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.anInt2240 = var4;
      return var5;
   }

   static int method2392(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class108_Sub4_Sub2 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.anInt2240 = var4;
      return var5 >> 1;
   }

   static int method2393(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class108_Sub4_Sub2 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.anInt2238 += var9.anInt2233 * (var6 - var3);
      var9.anInt2234 += var9.anInt2242 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.anInt2232 = var4 >> 2;
      var9.anInt2240 = var2 << 8;
      return var3;
   }

   static int method2394(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class108_Sub4_Sub2 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.anInt2232 += var12.anInt2229 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.anInt2238 = var5 >> 2;
      var12.anInt2234 = var6 >> 2;
      var12.anInt2240 = var3 << 8;
      return var4 >> 1;
   }

   public synchronized void method2395(int var1) {
      int var2 = ((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254.length << 8;
      if(var1 < -1) {
         var1 = -1;
      }

      if(var1 > var2) {
         var1 = var2;
      }

      this.anInt2240 = var1;
   }

   public synchronized void method2396(int var1) {
      this.anInt2235 = var1;
   }

   static int method2397(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class108_Sub4_Sub2 var11, int var12, int var13) {
      var11.anInt2238 -= var11.anInt2233 * var5;
      var11.anInt2234 -= var11.anInt2242 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.anInt2238 += var11.anInt2233 * var5;
      var11.anInt2234 += var11.anInt2242 * var5;
      var11.anInt2232 = var6;
      var11.anInt2240 = var4;
      return var5;
   }

   static int method2398(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class108_Sub4_Sub2 var13, int var14, int var15) {
      var13.anInt2232 -= var13.anInt2229 * var5;
      if(var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.anInt2232 += var13.anInt2229 * var5;
      var13.anInt2238 = var6;
      var13.anInt2234 = var7;
      var13.anInt2240 = var4;
      return var5;
   }

   static int method2399(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class108_Sub4_Sub2 var11, int var12, int var13) {
      var11.anInt2238 -= var11.anInt2233 * var5;
      var11.anInt2234 -= var11.anInt2242 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.anInt2238 += var11.anInt2233 * var5;
      var11.anInt2234 += var11.anInt2242 * var5;
      var11.anInt2232 = var6;
      var11.anInt2240 = var4;
      return var5;
   }

   static int method2400(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class108_Sub4_Sub2 var13, int var14, int var15) {
      var13.anInt2232 -= var13.anInt2229 * var5;
      if(var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.anInt2232 += var13.anInt2229 * var5;
      var13.anInt2238 = var6;
      var13.anInt2234 = var7;
      var13.anInt2240 = var4;
      return var5;
   }

   boolean method2401() {
      int var1 = this.anInt2239;
      int var2;
      int var3;
      if(var1 == Integer.MIN_VALUE) {
         var2 = 0;
         var3 = 0;
         var1 = 0;
      } else {
         var3 = method2469(var1, this.anInt2231);
         var2 = method2411(var1, this.anInt2231);
      }

      if(this.anInt2232 == var1 && this.anInt2238 == var3 && this.anInt2234 == var2) {
         if(this.anInt2239 == Integer.MIN_VALUE) {
            this.anInt2239 = 0;
            this.anInt2234 = 0;
            this.anInt2238 = 0;
            this.anInt2232 = 0;
            this.unlink();
            return true;
         } else {
            this.method2367();
            return false;
         }
      } else {
         if(this.anInt2232 < var1) {
            this.anInt2229 = 1;
            this.anInt2241 = var1 - this.anInt2232;
         } else if(this.anInt2232 > var1) {
            this.anInt2229 = -1;
            this.anInt2241 = this.anInt2232 - var1;
         } else {
            this.anInt2229 = 0;
         }

         if(this.anInt2238 < var3) {
            this.anInt2233 = 1;
            if(this.anInt2241 == 0 || this.anInt2241 > var3 - this.anInt2238) {
               this.anInt2241 = var3 - this.anInt2238;
            }
         } else if(this.anInt2238 > var3) {
            this.anInt2233 = -1;
            if(this.anInt2241 == 0 || this.anInt2241 > this.anInt2238 - var3) {
               this.anInt2241 = this.anInt2238 - var3;
            }
         } else {
            this.anInt2233 = 0;
         }

         if(this.anInt2234 < var2) {
            this.anInt2242 = 1;
            if(this.anInt2241 == 0 || this.anInt2241 > var2 - this.anInt2234) {
               this.anInt2241 = var2 - this.anInt2234;
            }
         } else if(this.anInt2234 > var2) {
            this.anInt2242 = -1;
            if(this.anInt2241 == 0 || this.anInt2241 > this.anInt2234 - var2) {
               this.anInt2241 = this.anInt2234 - var2;
            }
         } else {
            this.anInt2242 = 0;
         }

         return false;
      }
   }

   static int method2402(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class108_Sub4_Sub2 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.anInt2240 = var4;
      return var5;
   }

   static int method2405(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class108_Sub4_Sub2 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.anInt2240 = var4;
      return var5 >> 1;
   }

   static int method2406(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class108_Sub4_Sub2 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.anInt2240 = var2 << 8;
      return var3;
   }

   int method2407(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.anInt2241 > 0) {
            int var6 = var2 + this.anInt2241;
            if(var6 > var4) {
               var6 = var4;
            }

            this.anInt2241 += var2;
            if(this.anInt2237 == 256 && (this.anInt2240 & 255) == 0) {
               if(Class7.aBool99) {
                  var2 = method2394(0, ((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2238, this.anInt2234, this.anInt2233, this.anInt2242, 0, var6, var3, this);
               } else {
                  var2 = method2393(((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2232, this.anInt2229, 0, var6, var3, this);
               }
            } else if(Class7.aBool99) {
               var2 = method2398(0, 0, ((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2238, this.anInt2234, this.anInt2233, this.anInt2242, 0, var6, var3, this, this.anInt2237, var5);
            } else {
               var2 = method2397(0, 0, ((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2232, this.anInt2229, 0, var6, var3, this, this.anInt2237, var5);
            }

            this.anInt2241 -= var2;
            if(this.anInt2241 != 0) {
               return var2;
            }

            if(!this.method2401()) {
               continue;
            }

            return var4;
         }

         if(this.anInt2237 == 256 && (this.anInt2240 & 255) == 0) {
            if(Class7.aBool99) {
               return method2389(0, ((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2238, this.anInt2234, 0, var4, var3, this);
            }

            return method2388(((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2232, 0, var4, var3, this);
         }

         if(Class7.aBool99) {
            return method2405(0, 0, ((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2238, this.anInt2234, 0, var4, var3, this, this.anInt2237, var5);
         }

         return method2402(0, 0, ((Class108_Sub1_Sub1)this.aClass108_Sub1_1545).aByteArray2254, var1, this.anInt2240, var2, this.anInt2232, 0, var4, var3, this, this.anInt2237, var5);
      }
   }

   protected Class108_Sub4 method1599() {
      return null;
   }

   static int method2411(int var0, int var1) {
      return var1 >= 0?(int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D):-var0;
   }

   static int method2428(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class108_Sub4_Sub2 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.anInt2240 = var3 << 8;
      return var4 >> 1;
   }

   public synchronized void method2431(int var1) {
      if(var1 == 0) {
         this.method2369(0);
         this.unlink();
      } else if(this.anInt2238 == 0 && this.anInt2234 == 0) {
         this.anInt2241 = 0;
         this.anInt2239 = 0;
         this.anInt2232 = 0;
         this.unlink();
      } else {
         int var2 = -this.anInt2232;
         if(this.anInt2232 > var2) {
            var2 = this.anInt2232;
         }

         if(-this.anInt2238 > var2) {
            var2 = -this.anInt2238;
         }

         if(this.anInt2238 > var2) {
            var2 = this.anInt2238;
         }

         if(-this.anInt2234 > var2) {
            var2 = -this.anInt2234;
         }

         if(this.anInt2234 > var2) {
            var2 = this.anInt2234;
         }

         if(var1 > var2) {
            var1 = var2;
         }

         this.anInt2241 = var1;
         this.anInt2239 = Integer.MIN_VALUE;
         this.anInt2229 = -this.anInt2232 / var1;
         this.anInt2233 = -this.anInt2238 / var1;
         this.anInt2242 = -this.anInt2234 / var1;
      }
   }

   static int method2433(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class108_Sub4_Sub2 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.anInt2232 += var12.anInt2229 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.anInt2238 = var5 >> 2;
      var12.anInt2234 = var6 >> 2;
      var12.anInt2240 = var3 << 8;
      return var4 >> 1;
   }

   public synchronized void method1601(int[] var1, int var2, int var3) {
      if(this.anInt2239 == 0 && this.anInt2241 == 0) {
         this.method1602(var3);
      } else {
         Class108_Sub1_Sub1 var5 = (Class108_Sub1_Sub1)this.aClass108_Sub1_1545;
         int var10 = this.anInt2236 << 8;
         int var6 = this.anInt2230 << 8;
         int var7 = var5.aByteArray2254.length << 8;
         int var8 = var6 - var10;
         if(var8 <= 0) {
            this.anInt2235 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if(this.anInt2240 < 0) {
            if(this.anInt2237 <= 0) {
               this.method2375();
               this.unlink();
               return;
            }

            this.anInt2240 = 0;
         }

         if(this.anInt2240 >= var7) {
            if(this.anInt2237 >= 0) {
               this.method2375();
               this.unlink();
               return;
            }

            this.anInt2240 = var7 - 1;
         }

         if(this.anInt2235 < 0) {
            if(this.aBool2228) {
               if(this.anInt2237 < 0) {
                  var9 = this.method2386(var1, var2, var10, var3, var5.aByteArray2254[this.anInt2236]);
                  if(this.anInt2240 >= var10) {
                     return;
                  }

                  this.anInt2240 = var10 + var10 - 1 - this.anInt2240;
                  this.anInt2237 = -this.anInt2237;
               }

               while(true) {
                  var9 = this.method2407(var1, var9, var6, var3, var5.aByteArray2254[this.anInt2230 - 1]);
                  if(this.anInt2240 < var6) {
                     return;
                  }

                  this.anInt2240 = var6 + var6 - 1 - this.anInt2240;
                  this.anInt2237 = -this.anInt2237;
                  var9 = this.method2386(var1, var9, var10, var3, var5.aByteArray2254[this.anInt2236]);
                  if(this.anInt2240 >= var10) {
                     return;
                  }

                  this.anInt2240 = var10 + var10 - 1 - this.anInt2240;
                  this.anInt2237 = -this.anInt2237;
               }
            } else if(this.anInt2237 < 0) {
               while(true) {
                  var9 = this.method2386(var1, var9, var10, var3, var5.aByteArray2254[this.anInt2230 - 1]);
                  if(this.anInt2240 >= var10) {
                     return;
                  }

                  this.anInt2240 = var6 - 1 - (var6 - 1 - this.anInt2240) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method2407(var1, var9, var6, var3, var5.aByteArray2254[this.anInt2236]);
                  if(this.anInt2240 < var6) {
                     return;
                  }

                  this.anInt2240 = var10 + (this.anInt2240 - var10) % var8;
               }
            }
         } else {
            if(this.anInt2235 > 0) {
               if(this.aBool2228) {
                  label184: {
                     if(this.anInt2237 < 0) {
                        var9 = this.method2386(var1, var2, var10, var3, var5.aByteArray2254[this.anInt2236]);
                        if(this.anInt2240 >= var10) {
                           return;
                        }

                        this.anInt2240 = var10 + var10 - 1 - this.anInt2240;
                        this.anInt2237 = -this.anInt2237;
                        if(--this.anInt2235 == 0) {
                           break label184;
                        }
                     }

                     do {
                        var9 = this.method2407(var1, var9, var6, var3, var5.aByteArray2254[this.anInt2230 - 1]);
                        if(this.anInt2240 < var6) {
                           return;
                        }

                        this.anInt2240 = var6 + var6 - 1 - this.anInt2240;
                        this.anInt2237 = -this.anInt2237;
                        if(--this.anInt2235 == 0) {
                           break;
                        }

                        var9 = this.method2386(var1, var9, var10, var3, var5.aByteArray2254[this.anInt2236]);
                        if(this.anInt2240 >= var10) {
                           return;
                        }

                        this.anInt2240 = var10 + var10 - 1 - this.anInt2240;
                        this.anInt2237 = -this.anInt2237;
                     } while(--this.anInt2235 != 0);
                  }
               } else {
                  int var4;
                  if(this.anInt2237 < 0) {
                     while(true) {
                        var9 = this.method2386(var1, var9, var10, var3, var5.aByteArray2254[this.anInt2230 - 1]);
                        if(this.anInt2240 >= var10) {
                           return;
                        }

                        var4 = (var6 - 1 - this.anInt2240) / var8;
                        if(var4 >= this.anInt2235) {
                           this.anInt2240 += var8 * this.anInt2235;
                           this.anInt2235 = 0;
                           break;
                        }

                        this.anInt2240 += var8 * var4;
                        this.anInt2235 -= var4;
                     }
                  } else {
                     while(true) {
                        var9 = this.method2407(var1, var9, var6, var3, var5.aByteArray2254[this.anInt2236]);
                        if(this.anInt2240 < var6) {
                           return;
                        }

                        var4 = (this.anInt2240 - var10) / var8;
                        if(var4 >= this.anInt2235) {
                           this.anInt2240 -= var8 * this.anInt2235;
                           this.anInt2235 = 0;
                           break;
                        }

                        this.anInt2240 -= var8 * var4;
                        this.anInt2235 -= var4;
                     }
                  }
               }
            }

            if(this.anInt2237 < 0) {
               this.method2386(var1, var9, 0, var3, 0);
               if(this.anInt2240 < 0) {
                  this.anInt2240 = -1;
                  this.method2375();
                  this.unlink();
               }
            } else {
               this.method2407(var1, var9, var7, var3, 0);
               if(this.anInt2240 >= var7) {
                  this.anInt2240 = var7;
                  this.method2375();
                  this.unlink();
               }
            }
         }
      }
   }

   static int method2466(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class108_Sub4_Sub2 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.anInt2238 += var9.anInt2233 * (var6 - var3);
      var9.anInt2234 += var9.anInt2242 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.anInt2232 = var4 >> 2;
      var9.anInt2240 = var2 << 8;
      return var3;
   }

   static int method2469(int var0, int var1) {
      return var1 >= 0?(int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D):var0;
   }

   public synchronized void method2478(int var1) {
      if(this.anInt2237 < 0) {
         this.anInt2237 = -var1;
      } else {
         this.anInt2237 = var1;
      }
   }
}
