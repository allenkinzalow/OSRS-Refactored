import java.awt.Component;

public class Class7 {

   public static int anInt94;
   long aLong96 = 0L;
   Class108_Sub4 aClass108_Sub4_97;
   long aLong98 = Timer.getCurrentTimeMillis(849846164) * -4011733572368827733L;
   static boolean aBool99;
   int anInt100;
   int anInt101;
   int anInt102;
   int anInt103 = -1834461984;
   int anInt104 = 0;
   int anInt105 = 0;
   int anInt106 = 0;
   long aLong107 = 0L;
   boolean aBool108 = true;
   int[] anIntArray109;
   int anInt110 = 0;
   Class108_Sub4[] aClass108_Sub4Array111 = new Class108_Sub4[8];
   Class108_Sub4[] aClass108_Sub4Array112 = new Class108_Sub4[8];


   public final synchronized void method117(Class108_Sub4 var1, byte var2) {
      this.aClass108_Sub4_97 = var1;
   }

   public final synchronized void method118(int var1) {
      if(null != this.anIntArray109) {
         long currentTime = Timer.getCurrentTimeMillis(849846164);

         try {
            if(7456707046250421593L * this.aLong96 != 0L) {
               if(currentTime < this.aLong96 * 7456707046250421593L) {
                  return;
               }

               this.method126(this.anInt100 * 741136993);
               this.aLong96 = 0L;
               this.aBool108 = true;
            }

            int var4 = this.method127();
            if(this.anInt106 * 709193625 - var4 > this.anInt104 * 812381273) {
               this.anInt104 = (this.anInt106 * 709193625 - var4) * 469505001;
            }

            int var5 = this.anInt101 * -90428333 + this.anInt102 * 167311139;
            if(256 + var5 > 16384) {
               var5 = 16128;
            }

            if(256 + var5 > this.anInt100 * 741136993) {
               this.anInt100 -= 1792637952;
               if(this.anInt100 * 741136993 > 16384) {
                  this.anInt100 = 1382563840;
               }

               this.method129();
               this.method126(this.anInt100 * 741136993);
               var4 = 0;
               this.aBool108 = true;
               if(256 + var5 > this.anInt100 * 741136993) {
                  var5 = this.anInt100 * 741136993 - 256;
                  this.anInt102 = (var5 - this.anInt101 * -90428333) * -68423541;
               }
            }

            while(var4 < var5) {
               this.method149(this.anIntArray109, 256);
               this.method135();
               var4 += 256;
            }

            if(currentTime > 4932359937672241967L * this.aLong107) {
               if(!this.aBool108) {
                  if(this.anInt104 * 812381273 == 0 && this.anInt105 * -38061871 == 0) {
                     this.method129();
                     this.aLong96 = -3313475961159951639L * (currentTime + 2000L);
                     return;
                  }

                  this.anInt102 = Math.min(this.anInt105 * -38061871, this.anInt104 * 812381273) * -68423541;
                  this.anInt105 = this.anInt104 * 1539630345;
               } else {
                  this.aBool108 = false;
               }

               this.anInt104 = 0;
               this.aLong107 = (currentTime + 2000L) * 8006159424412173263L;
            }

            this.anInt106 = var4 * -1923582807;
         } catch (Exception var7) {
            this.method129();
            this.aLong96 = (2000L + currentTime) * -3313475961159951639L;
         }

         try {
            if(currentTime > -2331002977663733757L * this.aLong98 + 500000L) {
               currentTime = this.aLong98 * -2331002977663733757L;
            }

            while(currentTime > -2331002977663733757L * this.aLong98 + 5000L) {
               this.method122(256, (short)255);
               this.aLong98 += -4011733572368827733L * (long)(256000 / (anInt94 * -322018941));
            }

         } catch (Exception var6) {
            this.aLong98 = currentTime * -4011733572368827733L;
         }
      }
   }

   public final void method119(byte var1) {
      this.aBool108 = true;
   }

   public final synchronized void method120(int var1) {
      this.aBool108 = true;

      try {
         this.method130();
      } catch (Exception var3) {
         this.method129();
         this.aLong96 = (Timer.getCurrentTimeMillis(849846164) + 2000L) * -3313475961159951639L;
      }
   }

   public final synchronized void method121(byte var1) {
      if(null != Class108_Sub20_Sub3.aClass14_1965) {
         boolean var3 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if(Class108_Sub20_Sub3.aClass14_1965.aClass7Array189[var2] == this) {
               Class108_Sub20_Sub3.aClass14_1965.aClass7Array189[var2] = null;
            }

            if(null != Class108_Sub20_Sub3.aClass14_1965.aClass7Array189[var2]) {
               var3 = false;
            }
         }

         if(var3) {
            Class108_Sub20_Sub3.aClass14_1965.aBool190 = true;

            while(Class108_Sub20_Sub3.aClass14_1965.aBool191) {
               Class108_Sub22.sleep(50L);
            }

            Class108_Sub20_Sub3.aClass14_1965 = null;
         }
      }

      this.method129();
      this.anIntArray109 = null;
   }

   final void method122(int var1, short var2) {
      this.anInt110 -= var1 * 1776937165;
      if(this.anInt110 * 1593328645 < 0) {
         this.anInt110 = 0;
      }

      if(null != this.aClass108_Sub4_97) {
         this.aClass108_Sub4_97.method1602(var1);
      }
   }

   final void method124(Class108_Sub4 var1, int var2, int var3) {
      int var4 = var2 >> 5;
      Class108_Sub4 var5 = this.aClass108_Sub4Array112[var4];
      if(var5 == null) {
         this.aClass108_Sub4Array111[var4] = var1;
      } else {
         var5.aClass108_Sub4_1544 = var1;
      }

      this.aClass108_Sub4Array112[var4] = var1;
      var1.anInt1543 = var2;
   }

   void method125(Component var1) throws Exception {}

   void method126(int var1) throws Exception {}

   int method127() throws Exception {
      return this.anInt100 * 741136993;
   }

   void method129() {}

   void method130() throws Exception {}

   void method135() throws Exception {}

   final void method149(int[] var1, int var2) {
      int var3 = var2;
      if(aBool99) {
         var3 = var2 << 1;
      }

      ArrayUtil.method861(var1, 0, var3);
      this.anInt110 -= var2 * 1776937165;
      if(null != this.aClass108_Sub4_97 && this.anInt110 * 1593328645 <= 0) {
         this.anInt110 += (anInt94 * -322018941 >> 4) * 1776937165;
         AbstractMouseWheel.method980(this.aClass108_Sub4_97, (byte) 105);
         this.method124(this.aClass108_Sub4_97, this.aClass108_Sub4_97.method1596(), -983992405);
         int var7 = 0;
         int var4 = 255;

         int var6;
         Class108_Sub4 var12;
         label135:
         for(var6 = 7; 0 != var4; --var6) {
            int var5;
            int var10;
            if(var6 < 0) {
               var5 = var6 & 3;
               var10 = -(var6 >> 2);
            } else {
               var5 = var6;
               var10 = 0;
            }

            for(int var11 = var4 >>> var5 & 286331153; var11 != 0; var11 >>>= 4) {
               if(0 != (var11 & 1)) {
                  var4 &= ~(1 << var5);
                  var12 = null;
                  Class108_Sub4 var8 = this.aClass108_Sub4Array111[var5];

                  while(var8 != null) {
                     Class108_Sub1 var13 = var8.aClass108_Sub1_1545;
                     if(null != var13 && var13.anInt1520 > var10) {
                        var4 |= 1 << var5;
                        var12 = var8;
                        var8 = var8.aClass108_Sub4_1544;
                     } else {
                        var8.aBool1546 = true;
                        int var14 = var8.method1598();
                        var7 += var14;
                        if(var13 != null) {
                           var13.anInt1520 += var14;
                        }

                        if(var7 >= this.anInt103 * -346012393) {
                           break label135;
                        }

                        Class108_Sub4 var15 = var8.method1608();
                        if(null != var15) {
                           for(int var9 = var8.anInt1543; null != var15; var15 = var8.method1599()) {
                              this.method124(var15, var9 * var15.method1596() >> 8, -983992405);
                           }
                        }

                        Class108_Sub4 var17 = var8.aClass108_Sub4_1544;
                        var8.aClass108_Sub4_1544 = null;
                        if(var12 == null) {
                           this.aClass108_Sub4Array111[var5] = var17;
                        } else {
                           var12.aClass108_Sub4_1544 = var17;
                        }

                        if(var17 == null) {
                           this.aClass108_Sub4Array112[var5] = var12;
                        }

                        var8 = var17;
                     }
                  }
               }

               var5 += 4;
               ++var10;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            Class108_Sub4 var16 = this.aClass108_Sub4Array111[var6];
            Class108_Sub4[] var18 = this.aClass108_Sub4Array111;
            this.aClass108_Sub4Array112[var6] = null;

            for(var18[var6] = null; var16 != null; var16 = var12) {
               var12 = var16.aClass108_Sub4_1544;
               var16.aClass108_Sub4_1544 = null;
            }
         }
      }

      if(this.anInt110 * 1593328645 < 0) {
         this.anInt110 = 0;
      }

      if(this.aClass108_Sub4_97 != null) {
         this.aClass108_Sub4_97.method1601(var1, 0, var2);
      }

      this.aLong98 = Timer.getCurrentTimeMillis(849846164) * -4011733572368827733L;
   }

   static final void method180(int var0) {
      if(Client.anInt2753 * 1884872449 > 0) {
         InteractableObject.method648('\uff00');
      } else {
         IsaacRandomGen.method725(40, 2105282132);
         Class16.aGameConnection_211 = Varp.loginConnection;
         Varp.loginConnection = null;
      }
   }
}
