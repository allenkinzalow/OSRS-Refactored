
public class SoundFilter {

   int[][][] anIntArrayArrayArray134 = new int[2][2][4];
   static final int anInt135 = 4;
   static int anInt136;
   int[][][] anIntArrayArrayArray137 = new int[2][2][4];
   int[] anIntArray138 = new int[2];
   static float[][] aFloatArrayArray139 = new float[2][8];
   static int[][] anIntArrayArray140 = new int[2][8];
   static float aFloat141;
   int[] anIntArray142 = new int[2];
   static final float aFloat143 = 100.0F;
   static final float aFloat144 = 8.0F;
   static final float aFloat145 = 32.703197F;


   final void method232(RSByteBuffer var1, SoundTrackEnvelope var2) {
      int var3 = var1.readUByte();
      this.anIntArray138[0] = var3 >> 4;
      this.anIntArray138[1] = var3 & 15;
      if(var3 == 0) {
         int[] var7 = this.anIntArray142;
         this.anIntArray142[1] = 0;
         var7[0] = 0;
      } else {
         this.anIntArray142[0] = var1.readUShort(990335838);
         this.anIntArray142[1] = var1.readUShort(488385557);
         int var6 = var1.readUByte();

         int var4;
         int var5;
         for(var4 = 0; var4 < 2; ++var4) {
            for(var5 = 0; var5 < this.anIntArray138[var4]; ++var5) {
               this.anIntArrayArrayArray134[var4][0][var5] = var1.readUShort(423530524);
               this.anIntArrayArrayArray137[var4][0][var5] = var1.readUShort(-1874643617);
            }
         }

         for(var4 = 0; var4 < 2; ++var4) {
            for(var5 = 0; var5 < this.anIntArray138[var4]; ++var5) {
               if((var6 & 1 << var4 * 4 << var5) != 0) {
                  this.anIntArrayArrayArray134[var4][1][var5] = var1.readUShort(-93805715);
                  this.anIntArrayArrayArray137[var4][1][var5] = var1.readUShort(-1057826566);
               } else {
                  this.anIntArrayArrayArray134[var4][1][var5] = this.anIntArrayArrayArray134[var4][0][var5];
                  this.anIntArrayArrayArray137[var4][1][var5] = this.anIntArrayArrayArray137[var4][0][var5];
               }
            }
         }

         if(var6 != 0 || this.anIntArray142[1] != this.anIntArray142[0]) {
            var2.method44(var1);
         }
      }
   }

   float method233(int var1, int var2, float var3) {
      float var4 = (float)this.anIntArrayArrayArray137[var1][0][var2] + var3 * (float)(this.anIntArrayArrayArray137[var1][1][var2] - this.anIntArrayArrayArray137[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   float method234(int var1, int var2, float var3) {
      float var4 = (float)this.anIntArrayArrayArray134[var1][0][var2] + var3 * (float)(this.anIntArrayArrayArray134[var1][1][var2] - this.anIntArrayArrayArray134[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method240(var4);
   }

   int method235(int var1, float var2) {
      float var5;
      if(var1 == 0) {
         var5 = (float)this.anIntArray142[0] + (float)(this.anIntArray142[1] - this.anIntArray142[0]) * var2;
         var5 *= 0.0030517578F;
         aFloat141 = (float)Math.pow(0.1D, (double)(var5 / 20.0F));
         anInt136 = (int)(aFloat141 * 65536.0F);
      }

      if(this.anIntArray138[var1] == 0) {
         return 0;
      } else {
         var5 = this.method233(var1, 0, var2);
         aFloatArrayArray139[var1][0] = -2.0F * var5 * (float)Math.cos((double)this.method234(var1, 0, var2));
         aFloatArrayArray139[var1][1] = var5 * var5;

         int var3;
         for(var3 = 1; var3 < this.anIntArray138[var1]; ++var3) {
            var5 = this.method233(var1, var3, var2);
            float var6 = -2.0F * var5 * (float)Math.cos((double)this.method234(var1, var3, var2));
            float var7 = var5 * var5;
            aFloatArrayArray139[var1][var3 * 2 + 1] = aFloatArrayArray139[var1][var3 * 2 - 1] * var7;
            aFloatArrayArray139[var1][var3 * 2] = aFloatArrayArray139[var1][var3 * 2 - 1] * var6 + aFloatArrayArray139[var1][var3 * 2 - 2] * var7;

            for(int var4 = var3 * 2 - 1; var4 >= 2; --var4) {
               aFloatArrayArray139[var1][var4] += aFloatArrayArray139[var1][var4 - 1] * var6 + aFloatArrayArray139[var1][var4 - 2] * var7;
            }

            aFloatArrayArray139[var1][1] += aFloatArrayArray139[var1][0] * var6 + var7;
            aFloatArrayArray139[var1][0] += var6;
         }

         if(var1 == 0) {
            for(var3 = 0; var3 < this.anIntArray138[0] * 2; ++var3) {
               aFloatArrayArray139[0][var3] *= aFloat141;
            }
         }

         for(var3 = 0; var3 < this.anIntArray138[var1] * 2; ++var3) {
            anIntArrayArray140[var1][var3] = (int)(aFloatArrayArray139[var1][var3] * 65536.0F);
         }

         return this.anIntArray138[var1] * 2;
      }
   }

   static float method240(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }
}
