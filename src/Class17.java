
public class Class17 {

   static int[] anIntArray214;
   int anInt215;
   static int[] anIntArray216 = new int[]{256, 128, 86, 64};
   int[][] anIntArrayArray217;
   int[] anIntArray218;
   int[] anIntArray219;
   static boolean[] aBoolArray220;
   int[] anIntArray221;
   int[] anIntArray222;
   int[] anIntArray223;
   static int[] anIntArray224;


   static int method302(int[] var0, int var1) {
      int var2 = var0[var1];
      int var6 = -1;
      int var4 = Integer.MAX_VALUE;

      for(int var5 = 0; var5 < var1; ++var5) {
         int var3 = var0[var5];
         if(var3 > var2 && var3 < var4) {
            var6 = var5;
            var4 = var3;
         }
      }

      return var6;
   }

   void method304(int var1, int var2, int var3, int var4, float[] var5, int var6) {
      int var7 = var4 - var2;
      int var9 = var3 - var1;
      int var8 = var7 < 0?-var7:var7;
      int var10 = var7 / var9;
      int var14 = var2;
      int var11 = 0;
      int var13 = var7 < 0?var10 - 1:var10 + 1;
      var8 -= (var10 < 0?-var10:var10) * var9;
      var5[var1] *= RSSoundEffect_2.aFloatArray225[var2];
      if(var3 > var6) {
         var3 = var6;
      }

      for(int var12 = var1 + 1; var12 < var3; ++var12) {
         var11 += var8;
         if(var11 < var9) {
            var14 += var10;
         } else {
            var11 -= var9;
            var14 += var13;
         }

         var5[var12] *= RSSoundEffect_2.aFloatArray225[var14];
      }

   }

   int method305(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var4 - var2;
      int var9 = var3 - var1;
      int var7 = var6 < 0?-var6:var6;
      int var8 = var7 * (var5 - var1);
      int var10 = var8 / var9;
      return var6 < 0?var2 - var10:var2 + var10;
   }

   Class17() {
      int var7 = RSSoundEffect_2.method1643(16);
      if(var7 != 1) {
         throw new RuntimeException();
      } else {
         int var5 = RSSoundEffect_2.method1643(5);
         int var6 = 0;
         this.anIntArray218 = new int[var5];

         int var2;
         int var3;
         for(var2 = 0; var2 < var5; ++var2) {
            var3 = RSSoundEffect_2.method1643(4);
            this.anIntArray218[var2] = var3;
            if(var3 >= var6) {
               var6 = var3 + 1;
            }
         }

         this.anIntArray219 = new int[var6];
         this.anIntArray223 = new int[var6];
         this.anIntArray221 = new int[var6];
         this.anIntArrayArray217 = new int[var6][];

         int var4;
         for(var2 = 0; var2 < var6; ++var2) {
            this.anIntArray219[var2] = RSSoundEffect_2.method1643(3) + 1;
            var3 = this.anIntArray223[var2] = RSSoundEffect_2.method1643(2);
            if(var3 != 0) {
               this.anIntArray221[var2] = RSSoundEffect_2.method1643(8);
            }

            var3 = 1 << var3;
            int[] var8 = new int[var3];
            this.anIntArrayArray217[var2] = var8;

            for(var4 = 0; var4 < var3; ++var4) {
               var8[var4] = RSSoundEffect_2.method1643(8) - 1;
            }
         }

         this.anInt215 = RSSoundEffect_2.method1643(2) + 1;
         var2 = RSSoundEffect_2.method1643(4);
         var3 = 2;

         int var9;
         for(var9 = 0; var9 < var5; ++var9) {
            var3 += this.anIntArray219[this.anIntArray218[var9]];
         }

         this.anIntArray222 = new int[var3];
         this.anIntArray222[0] = 0;
         this.anIntArray222[1] = 1 << var2;
         var3 = 2;

         for(var9 = 0; var9 < var5; ++var9) {
            var4 = this.anIntArray218[var9];

            for(int var1 = 0; var1 < this.anIntArray219[var4]; ++var1) {
               this.anIntArray222[var3++] = RSSoundEffect_2.method1643(var2);
            }
         }

         if(anIntArray214 == null || anIntArray214.length < var3) {
            anIntArray214 = new int[var3];
            anIntArray224 = new int[var3];
            aBoolArray220 = new boolean[var3];
         }
      }
   }

   void method307(float[] var1, int var2) {
      int var3 = this.anIntArray222.length;
      int var11 = anIntArray216[this.anInt215 - 1];
      boolean[] var6 = aBoolArray220;
      aBoolArray220[1] = true;
      var6[0] = true;

      int var4;
      int var7;
      int var8;
      int var9;
      int var10;
      for(var8 = 2; var8 < var3; ++var8) {
         var4 = method317(anIntArray214, var8);
         var9 = method302(anIntArray214, var8);
         var7 = this.method305(anIntArray214[var4], anIntArray224[var4], anIntArray214[var9], anIntArray224[var9], anIntArray214[var8]);
         var10 = anIntArray224[var8];
         int var12 = var11 - var7;
         int var14 = (var12 < var7?var12:var7) << 1;
         if(var10 != 0) {
            boolean[] var15 = aBoolArray220;
            aBoolArray220[var9] = true;
            var15[var4] = true;
            aBoolArray220[var8] = true;
            if(var10 >= var14) {
               anIntArray224[var8] = var12 > var7?var10 - var7 + var7:var7 - var10 + var12 - 1;
            } else {
               anIntArray224[var8] = (var10 & 1) != 0?var7 - (var10 + 1) / 2:var7 + var10 / 2;
            }
         } else {
            aBoolArray220[var8] = false;
            anIntArray224[var8] = var7;
         }
      }

      this.method314(0, var3 - 1);
      var8 = 0;
      var4 = anIntArray224[0] * this.anInt215;

      for(var9 = 1; var9 < var3; ++var9) {
         if(aBoolArray220[var9]) {
            var7 = anIntArray214[var9];
            var10 = anIntArray224[var9] * this.anInt215;
            this.method304(var8, var4, var7, var10, var1, var2);
            if(var7 >= var2) {
               return;
            }

            var8 = var7;
            var4 = var10;
         }
      }

      float var16 = RSSoundEffect_2.aFloatArray225[var4];

      for(var7 = var8; var7 < var2; ++var7) {
         var1[var7] *= var16;
      }

   }

   void method314(int var1, int var2) {
      if(var1 < var2) {
         int var3 = var1;
         int var4 = anIntArray214[var1];
         int var5 = anIntArray224[var1];
         boolean var8 = aBoolArray220[var1];

         for(int var6 = var1 + 1; var6 <= var2; ++var6) {
            int var7 = anIntArray214[var6];
            if(var7 < var4) {
               anIntArray214[var3] = var7;
               anIntArray224[var3] = anIntArray224[var6];
               aBoolArray220[var3] = aBoolArray220[var6];
               ++var3;
               anIntArray214[var6] = anIntArray214[var3];
               anIntArray224[var6] = anIntArray224[var3];
               aBoolArray220[var6] = aBoolArray220[var3];
            }
         }

         anIntArray214[var3] = var4;
         anIntArray224[var3] = var5;
         aBoolArray220[var3] = var8;
         this.method314(var1, var3 - 1);
         this.method314(var3 + 1, var2);
      }
   }

   static int method317(int[] var0, int var1) {
      int var2 = var0[var1];
      int var3 = -1;
      int var4 = Integer.MIN_VALUE;

      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = var0[var5];
         if(var6 < var2 && var6 > var4) {
            var3 = var5;
            var4 = var6;
         }
      }

      return var3;
   }

   boolean method318() {
      boolean var1 = RSSoundEffect_2.method1618() != 0;
      if(!var1) {
         return false;
      } else {
         int var6 = this.anIntArray222.length;

         int var5;
         for(var5 = 0; var5 < var6; ++var5) {
            anIntArray214[var5] = this.anIntArray222[var5];
         }

         var5 = anIntArray216[this.anInt215 - 1];
         int var8 = Class14.method281(var5 - 1, (byte)126);
         anIntArray224[0] = RSSoundEffect_2.method1643(var8);
         anIntArray224[1] = RSSoundEffect_2.method1643(var8);
         int var9 = 2;

         for(int var7 = 0; var7 < this.anIntArray218.length; ++var7) {
            int var2 = this.anIntArray218[var7];
            int var12 = this.anIntArray219[var2];
            int var4 = this.anIntArray223[var2];
            int var10 = (1 << var4) - 1;
            int var3 = 0;
            if(var4 > 0) {
               var3 = RSSoundEffect_2.aClass8Array1554[this.anIntArray221[var2]].method183();
            }

            for(int var11 = 0; var11 < var12; ++var11) {
               int var13 = this.anIntArrayArray217[var2][var3 & var10];
               var3 >>>= var4;
               anIntArray224[var9++] = var13 >= 0?RSSoundEffect_2.aClass8Array1554[var13].method183():0;
            }
         }

         return true;
      }
   }
}
