
public class Class8 {

   int anInt115;
   int anInt116;
   int[] anIntArray117;
   int[] anIntArray118;
   float[][] aFloatArrayArray119;
   int[] anIntArray120;


   Class8() {
      RSSoundEffect_2.method1643(24);
      this.anInt115 = RSSoundEffect_2.method1643(16);
      this.anInt116 = RSSoundEffect_2.method1643(24);
      this.anIntArray117 = new int[this.anInt116];
      boolean var4 = RSSoundEffect_2.method1618() != 0;
      int var1;
      int var5;
      int var6;
      if(var4) {
         var5 = 0;

         for(var6 = RSSoundEffect_2.method1643(5) + 1; var5 < this.anInt116; ++var6) {
            int var10 = RSSoundEffect_2.method1643(Class14.method281(this.anInt116 - var5, (byte)91));

            for(var1 = 0; var1 < var10; ++var1) {
               this.anIntArray117[var5++] = var6;
            }
         }
      } else {
         boolean var14 = RSSoundEffect_2.method1618() != 0;

         for(var6 = 0; var6 < this.anInt116; ++var6) {
            if(var14 && RSSoundEffect_2.method1618() == 0) {
               this.anIntArray117[var6] = 0;
            } else {
               this.anIntArray117[var6] = RSSoundEffect_2.method1643(5) + 1;
            }
         }
      }

      this.method190();
      var5 = RSSoundEffect_2.method1643(4);
      if(var5 > 0) {
         float var15 = RSSoundEffect_2.method1647(RSSoundEffect_2.method1643(32));
         float var16 = RSSoundEffect_2.method1647(RSSoundEffect_2.method1643(32));
         var1 = RSSoundEffect_2.method1643(4) + 1;
         boolean var8 = RSSoundEffect_2.method1618() != 0;
         int var9;
         if(var5 == 1) {
            var9 = method196(this.anInt116, this.anInt115);
         } else {
            var9 = this.anInt116 * this.anInt115;
         }

         this.anIntArray118 = new int[var9];

         int var7;
         for(var7 = 0; var7 < var9; ++var7) {
            this.anIntArray118[var7] = RSSoundEffect_2.method1643(var1);
         }

         this.aFloatArrayArray119 = new float[this.anInt116][this.anInt115];
         float var3;
         int var11;
         int var12;
         if(var5 == 1) {
            for(var7 = 0; var7 < this.anInt116; ++var7) {
               var3 = 0.0F;
               var12 = 1;

               for(var11 = 0; var11 < this.anInt115; ++var11) {
                  int var17 = var7 / var12 % var9;
                  float var2 = (float)this.anIntArray118[var17] * var16 + var15 + var3;
                  this.aFloatArrayArray119[var7][var11] = var2;
                  if(var8) {
                     var3 = var2;
                  }

                  var12 *= var9;
               }
            }

         } else {
            for(var7 = 0; var7 < this.anInt116; ++var7) {
               var3 = 0.0F;
               var12 = var7 * this.anInt115;

               for(var11 = 0; var11 < this.anInt115; ++var11) {
                  float var13 = (float)this.anIntArray118[var12] * var16 + var15 + var3;
                  this.aFloatArrayArray119[var7][var11] = var13;
                  if(var8) {
                     var3 = var13;
                  }

                  ++var12;
               }
            }

         }
      }
   }

   int method183() {
      int var1;
      for(var1 = 0; this.anIntArray120[var1] >= 0; var1 = RSSoundEffect_2.method1618() == 0?var1 + 1:this.anIntArray120[var1]) {
         ;
      }

      return ~this.anIntArray120[var1];
   }

   float[] method184() {
      return this.aFloatArrayArray119[this.method183()];
   }

   void method190() {
      int[] var1 = new int[this.anInt116];
      int[] var10 = new int[33];

      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var9;
      for(var6 = 0; var6 < this.anInt116; ++var6) {
         var4 = this.anIntArray117[var6];
         if(var4 != 0) {
            var7 = 1 << 32 - var4;
            var9 = var10[var4];
            var1[var6] = var9;
            int var8;
            if((var9 & var7) != 0) {
               var2 = var10[var4 - 1];
            } else {
               var2 = var9 | var7;

               for(var5 = var4 - 1; var5 >= 1; --var5) {
                  var8 = var10[var5];
                  if(var8 != var9) {
                     break;
                  }

                  var3 = 1 << 32 - var5;
                  if((var8 & var3) != 0) {
                     var10[var5] = var10[var5 - 1];
                     break;
                  }

                  var10[var5] = var8 | var3;
               }
            }

            var10[var4] = var2;

            for(var5 = var4 + 1; var5 <= 32; ++var5) {
               var8 = var10[var5];
               if(var8 == var9) {
                  var10[var5] = var2;
               }
            }
         }
      }

      this.anIntArray120 = new int[8];
      int var12 = 0;

      for(var6 = 0; var6 < this.anInt116; ++var6) {
         var4 = this.anIntArray117[var6];
         if(var4 != 0) {
            var7 = var1[var6];
            var9 = 0;

            for(var2 = 0; var2 < var4; ++var2) {
               var5 = Integer.MIN_VALUE >>> var2;
               if((var7 & var5) != 0) {
                  if(this.anIntArray120[var9] == 0) {
                     this.anIntArray120[var9] = var12;
                  }

                  var9 = this.anIntArray120[var9];
               } else {
                  ++var9;
               }

               if(var9 >= this.anIntArray120.length) {
                  int[] var11 = new int[this.anIntArray120.length * 2];

                  for(var3 = 0; var3 < this.anIntArray120.length; ++var3) {
                     var11[var3] = this.anIntArray120[var3];
                  }

                  this.anIntArray120 = var11;
               }

               var5 >>>= 1;
            }

            this.anIntArray120[var9] = ~var6;
            if(var9 >= var12) {
               var12 = var9 + 1;
            }
         }
      }

   }

   static int method196(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; Class1.method36(var2, var1, 2030633151) > var0; --var2) {
         ;
      }

      return var2;
   }
}
