
public class Class108_Sub4_Sub4 extends Class108_Sub4 {

   Deque aClass105_2333 = new Deque();
   Class108_Sub4_Sub1 aClass108_Sub4_Sub1_2334 = new Class108_Sub4_Sub1();
   Class108_Sub4_Sub3 aClass108_Sub4_Sub3_2337;


   void method2711(Class108_Sub21 var1, int var2, short var3) {
      if(0 != (this.aClass108_Sub4_Sub3_2337.anIntArray2316[var1.anInt1905 * 1560661155] & 4) && var1.anInt1909 * 572686857 < 0) {
         int var4 = this.aClass108_Sub4_Sub3_2337.anIntArray2321[var1.anInt1905 * 1560661155] / (Class7.anInt94 * -322018941);
         int var5 = (var4 + 1048575 - var1.anInt1915 * 128243681) / var4;
         var1.anInt1915 = (var2 * var4 + var1.anInt1915 * 128243681 & 1048575) * 894807073;
         if(var5 <= var2) {
            if(0 == this.aClass108_Sub4_Sub3_2337.anIntArray2310[var1.anInt1905 * 1560661155]) {
               var1.aClass108_Sub4_Sub2_1913 = Class108_Sub4_Sub2.method2366(var1.aClass108_Sub1_Sub1_1907, var1.aClass108_Sub4_Sub2_1913.method2380(), var1.aClass108_Sub4_Sub2_1913.method2379(), var1.aClass108_Sub4_Sub2_1913.method2372());
            } else {
               var1.aClass108_Sub4_Sub2_1913 = Class108_Sub4_Sub2.method2366(var1.aClass108_Sub1_Sub1_1907, var1.aClass108_Sub4_Sub2_1913.method2380(), 0, var1.aClass108_Sub4_Sub2_1913.method2372());
               this.aClass108_Sub4_Sub3_2337.method2616(var1, var1.aClass108_Sub22_1903.aShortArray1920[var1.anInt1900 * 1691952267] < 0, 1782807344);
            }

            if(var1.aClass108_Sub22_1903.aShortArray1920[var1.anInt1900 * 1691952267] < 0) {
               var1.aClass108_Sub4_Sub2_1913.method2396(-1);
            }

            var2 = var1.anInt1915 * 128243681 / var4;
         }
      }

      var1.aClass108_Sub4_Sub2_1913.method1602(var2);
   }

   protected Class108_Sub4 method1608() {
      Class108_Sub21 var1 = (Class108_Sub21)this.aClass105_2333.getFront();
      return (Class108_Sub4)(var1 == null?null:(null != var1.aClass108_Sub4_Sub2_1913?var1.aClass108_Sub4_Sub2_1913:this.method1599()));
   }

   protected Class108_Sub4 method1599() {
      while(true) {
         Class108_Sub21 var1 = (Class108_Sub21)this.aClass105_2333.getNext();
         if(var1 != null) {
            if(var1.aClass108_Sub4_Sub2_1913 == null) {
               continue;
            }

            return var1.aClass108_Sub4_Sub2_1913;
         }

         return null;
      }
   }

   protected int method1598() {
      return 0;
   }

   protected void method1601(int[] var1, int var2, int var3) {
      this.aClass108_Sub4_Sub1_2334.method1601(var1, var2, var3);

      for(Class108_Sub21 var4 = (Class108_Sub21)this.aClass105_2333.getFront(); var4 != null; var4 = (Class108_Sub21)this.aClass105_2333.getNext()) {
         if(!this.aClass108_Sub4_Sub3_2337.method2633(var4, 1666646633)) {
            int var5 = var2;
            int var6 = var3;

            do {
               if(var6 <= var4.anInt1904 * 1445111065) {
                  this.method2712(var4, var1, var5, var6, var5 + var6, (byte)-94);
                  var4.anInt1904 -= var6 * -1031084247;
                  break;
               }

               this.method2712(var4, var1, var5, var4.anInt1904 * 1445111065, var6 + var5, (byte)71);
               var5 += var4.anInt1904 * 1445111065;
               var6 -= var4.anInt1904 * 1445111065;
            } while(!this.aClass108_Sub4_Sub3_2337.method2634(var4, var1, var5, var6, (byte)25));
         }
      }

   }

   protected void method1602(int var1) {
      this.aClass108_Sub4_Sub1_2334.method1602(var1);

      for(Class108_Sub21 var2 = (Class108_Sub21)this.aClass105_2333.getFront(); null != var2; var2 = (Class108_Sub21)this.aClass105_2333.getNext()) {
         if(!this.aClass108_Sub4_Sub3_2337.method2633(var2, 1666646633)) {
            int var3 = var1;

            do {
               if(var3 <= var2.anInt1904 * 1445111065) {
                  this.method2711(var2, var3, (short)382);
                  var2.anInt1904 -= var3 * -1031084247;
                  break;
               }

               this.method2711(var2, var2.anInt1904 * 1445111065, (short)382);
               var3 -= var2.anInt1904 * 1445111065;
            } while(!this.aClass108_Sub4_Sub3_2337.method2634(var2, (int[])null, 0, var3, (byte)89));
         }
      }

   }

   void method2712(Class108_Sub21 var1, int[] var2, int var3, int var4, int var5, byte var6) {
      if((this.aClass108_Sub4_Sub3_2337.anIntArray2316[var1.anInt1905 * 1560661155] & 4) != 0 && var1.anInt1909 * 572686857 < 0) {
         int var7 = this.aClass108_Sub4_Sub3_2337.anIntArray2321[var1.anInt1905 * 1560661155] / (Class7.anInt94 * -322018941);

         while(true) {
            int var9 = (1048575 + var7 - var1.anInt1915 * 128243681) / var7;
            if(var9 > var4) {
               var1.anInt1915 += var4 * var7 * 894807073;
               break;
            }

            var1.aClass108_Sub4_Sub2_1913.method1601(var2, var3, var9);
            var3 += var9;
            var4 -= var9;
            var1.anInt1915 += (var7 * var9 - 1048576) * 894807073;
            int var10 = Class7.anInt94 * -322018941 / 100;
            int var8 = 262144 / var7;
            if(var8 < var10) {
               var10 = var8;
            }

            Class108_Sub4_Sub2 var11 = var1.aClass108_Sub4_Sub2_1913;
            if(0 == this.aClass108_Sub4_Sub3_2337.anIntArray2310[var1.anInt1905 * 1560661155]) {
               var1.aClass108_Sub4_Sub2_1913 = Class108_Sub4_Sub2.method2366(var1.aClass108_Sub1_Sub1_1907, var11.method2380(), var11.method2379(), var11.method2372());
            } else {
               var1.aClass108_Sub4_Sub2_1913 = Class108_Sub4_Sub2.method2366(var1.aClass108_Sub1_Sub1_1907, var11.method2380(), 0, var11.method2372());
               this.aClass108_Sub4_Sub3_2337.method2616(var1, var1.aClass108_Sub22_1903.aShortArray1920[var1.anInt1900 * 1691952267] < 0, 1782807344);
               var1.aClass108_Sub4_Sub2_1913.method2376(var10, var11.method2379());
            }

            if(var1.aClass108_Sub22_1903.aShortArray1920[var1.anInt1900 * 1691952267] < 0) {
               var1.aClass108_Sub4_Sub2_1913.method2396(-1);
            }

            var11.method2431(var10);
            var11.method1601(var2, var3, var5 - var3);
            if(var11.method2381()) {
               this.aClass108_Sub4_Sub1_2334.method2050(var11);
            }
         }
      }

      var1.aClass108_Sub4_Sub2_1913.method1601(var2, var3, var4);
   }

   static final int method2713(RSInterface var0, int var1, short var2) {
      if(var0.opcodes != null && var1 < var0.opcodes.length) {
         try {
            int[] var3 = var0.opcodes[var1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;

            while(true) {
               int var7 = var3[var5++];
               int var8 = 0;
               byte var9 = 0;
               if(0 == var7) {
                  return var4;
               }

               if(var7 == 1) {
                  var8 = Client.skillLevels[var3[var5++]];
               }

               if(2 == var7) {
                  var8 = Client.anIntArray2843[var3[var5++]];
               }

               if(var7 == 3) {
                  var8 = Client.skillXPs[var3[var5++]];
               }

               int var10;
               RSInterface var11;
               int var12;
               int var13;
               if(4 == var7) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = CacheIndexRequest.getInterfaceComponentForHash(var10, 1426632239);
                  var12 = var3[var5++];
                  if(var12 != -1 && (!AnimationDefinition.getItemDefinition(var12, 14463529).members || Client.aBool2710)) {
                     for(var13 = 0; var13 < var11.widgetItems.length; ++var13) {
                        if(var11.widgetItems[var13] == var12 + 1) {
                           var8 += var11.widgetItemAmounts[var13];
                        }
                     }
                  }
               }

               if(var7 == 5) {
                  var8 = Class88.configSettings[var3[var5++]];
               }

               if(6 == var7) {
                  var8 = Class84.anIntArray1284[Client.anIntArray2843[var3[var5++]] - 1];
               }

               if(var7 == 7) {
                  var8 = Class88.configSettings[var3[var5++]] * 100 / '\ub71b';
               }

               if(var7 == 8) {
                  var8 = Player.myPlayer.combatLevel * -1769445007;
               }

               if(var7 == 9) {
                  for(var10 = 0; var10 < 25; ++var10) {
                     if(Class84.aBoolArray1282[var10]) {
                        var8 += Client.anIntArray2843[var10];
                     }
                  }
               }

               if(var7 == 10) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = CacheIndexRequest.getInterfaceComponentForHash(var10, 77589357);
                  var12 = var3[var5++];
                  if(-1 != var12 && (!AnimationDefinition.getItemDefinition(var12, -1377973379).members || Client.aBool2710)) {
                     for(var13 = 0; var13 < var11.widgetItems.length; ++var13) {
                        if(var11.widgetItems[var13] == 1 + var12) {
                           var8 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if(var7 == 11) {
                  var8 = Client.anInt2870 * -459978045;
               }

               if(12 == var7) {
                  var8 = Client.anInt2871 * -409161997;
               }

               if(13 == var7) {
                  var10 = Class88.configSettings[var3[var5++]];
                  int var15 = var3[var5++];
                  var8 = 0 != (var10 & 1 << var15)?1:0;
               }

               if(14 == var7) {
                  var10 = var3[var5++];
                  var8 = BuildType.method1094(var10, -511913587);
               }

               if(var7 == 15) {
                  var9 = 1;
               }

               if(16 == var7) {
                  var9 = 2;
               }

               if(var7 == 17) {
                  var9 = 3;
               }

               if(18 == var7) {
                  var8 = (Player.myPlayer.anInt2394 * 171470795 >> 7) + Class100.anInt1388 * 263051377;
               }

               if(19 == var7) {
                  var8 = (Player.myPlayer.anInt2339 * 826764905 >> 7) + Class15.anInt201 * -1743142671;
               }

               if(20 == var7) {
                  var8 = var3[var5++];
               }

               if(var9 == 0) {
                  if(var6 == 0) {
                     var4 += var8;
                  }

                  if(1 == var6) {
                     var4 -= var8;
                  }

                  if(2 == var6 && var8 != 0) {
                     var4 /= var8;
                  }

                  if(var6 == 3) {
                     var4 *= var8;
                  }

                  var6 = 0;
               } else {
                  var6 = var9;
               }
            }
         } catch (Exception var14) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   Class108_Sub4_Sub4(Class108_Sub4_Sub3 var1) {
      this.aClass108_Sub4_Sub3_2337 = var1;
   }
}
