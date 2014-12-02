
public class RSSoundEffect_2 extends Node {

   int anInt1551;
   int anInt1552;
   int anInt1553;
   static Class8[] aClass8Array1554;
   boolean aBool1555;
   byte[][] aByteArrayArray1556;
   static int anInt1557;
   float[] aFloatArray1558;
   static int anInt1559;
   int anInt1560;
   static int anInt1561;
   static float[] aFloatArray1562;
   static Class17[] aClass17Array1563;
   static Class12[] aClass12Array1564;
   static Class18[] aClass18Array1565;
   static boolean[] aBoolArray1566;
   static int[] anIntArray1567;
   static boolean aBool1568 = false;
   static int[] anIntArray1569;
   int anInt1570;
   int anInt1571;
   boolean aBool1572;
   static byte[] aByteArray1573;
   static float[] aFloatArray1574;
   static float[] aFloatArray1575;
   static float[] aFloatArray1576;
   static int anInt1577;
   static float[] aFloatArray1578;
   static float[] aFloatArray1579;
   static float[] aFloatArray1580;
   static int[] anIntArray1581;
   byte[] aByteArray1582;
   int anInt1583;
   int anInt1584;


   static int method1618() {
      int var0 = aByteArray1573[anInt1577] >> anInt1559 & 1;
      ++anInt1559;
      anInt1577 += anInt1559 >> 3;
      anInt1559 &= 7;
      return var0;
   }

   void method1621(byte[] var1) {
      RSByteBuffer var2 = new RSByteBuffer(var1);
      this.anInt1552 = var2.readInt();
      this.anInt1553 = var2.readInt();
      this.anInt1560 = var2.readInt();
      this.anInt1584 = var2.readInt();
      if(this.anInt1584 < 0) {
         this.anInt1584 = ~this.anInt1584;
         this.aBool1555 = true;
      }

      int var3 = var2.readInt();
      this.aByteArrayArray1556 = new byte[var3][];

      for(int var6 = 0; var6 < var3; ++var6) {
         int var5 = 0;

         int var4;
         do {
            var4 = var2.readUByte();
            var5 += var4;
         } while(var4 >= 255);

         byte[] var7 = new byte[var5];
         var2.readBytes(var7, 0, var5, -1425419212);
         this.aByteArrayArray1556[var6] = var7;
      }

   }

   static void method1623(byte[] var0) {
      method1631(var0, 0);
      anInt1557 = 1 << method1643(4);
      anInt1561 = 1 << method1643(4);
      aFloatArray1580 = new float[anInt1561];

      int var1;
      int var2;
      int var3;
      int var4;
      int var6;
      for(var6 = 0; var6 < 2; ++var6) {
         var1 = var6 != 0?anInt1561:anInt1557;
         var3 = var1 >> 1;
         var4 = var1 >> 2;
         var2 = var1 >> 3;
         float[] var7 = new float[var3];

         for(int var9 = 0; var9 < var4; ++var9) {
            var7[var9 * 2] = (float)Math.cos((double)(var9 * 4) * 3.141592653589793D / (double)var1);
            var7[var9 * 2 + 1] = -((float)Math.sin((double)(var9 * 4) * 3.141592653589793D / (double)var1));
         }

         float[] var20 = new float[var3];

         for(int var10 = 0; var10 < var4; ++var10) {
            var20[var10 * 2] = (float)Math.cos((double)(var10 * 2 + 1) * 3.141592653589793D / (double)(var1 * 2));
            var20[var10 * 2 + 1] = (float)Math.sin((double)(var10 * 2 + 1) * 3.141592653589793D / (double)(var1 * 2));
         }

         float[] var21 = new float[var4];

         for(int var8 = 0; var8 < var2; ++var8) {
            var21[var8 * 2] = (float)Math.cos((double)(var8 * 4 + 2) * 3.141592653589793D / (double)var1);
            var21[var8 * 2 + 1] = -((float)Math.sin((double)(var8 * 4 + 2) * 3.141592653589793D / (double)var1));
         }

         int[] var19 = new int[var2];
         int var13 = Class14.method281(var2 - 1, (byte)101);

         for(int var11 = 0; var11 < var2; ++var11) {
            int var15 = var11;
            int var5 = var13;

            int var14;
            for(var14 = 0; var5 > 0; --var5) {
               var14 = var14 << 1 | var15 & 1;
               var15 >>>= 1;
            }

            var19[var11] = var14;
         }

         if(var6 != 0) {
            aFloatArray1562 = var7;
            aFloatArray1578 = var20;
            aFloatArray1579 = var21;
            anIntArray1581 = var19;
         } else {
            aFloatArray1574 = var7;
            aFloatArray1575 = var20;
            aFloatArray1576 = var21;
            anIntArray1569 = var19;
         }
      }

      var6 = method1643(8) + 1;
      aClass8Array1554 = new Class8[var6];

      for(var1 = 0; var1 < var6; ++var1) {
         aClass8Array1554[var1] = new Class8();
      }

      var1 = method1643(6) + 1;

      for(var3 = 0; var3 < var1; ++var3) {
         method1643(16);
      }

      var1 = method1643(6) + 1;
      aClass17Array1563 = new Class17[var1];

      for(var3 = 0; var3 < var1; ++var3) {
         aClass17Array1563[var3] = new Class17();
      }

      var3 = method1643(6) + 1;
      aClass12Array1564 = new Class12[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         aClass12Array1564[var4] = new Class12();
      }

      var4 = method1643(6) + 1;
      aClass18Array1565 = new Class18[var4];

      for(var2 = 0; var2 < var4; ++var2) {
         aClass18Array1565[var2] = new Class18();
      }

      var2 = method1643(6) + 1;
      aBoolArray1566 = new boolean[var2];
      anIntArray1567 = new int[var2];

      for(int var18 = 0; var18 < var2; ++var18) {
         aBoolArray1566[var18] = method1618() != 0;
         method1643(16);
         method1643(16);
         anIntArray1567[var18] = method1643(8);
      }

   }

   float[] method1624(int var1) {
      method1631(this.aByteArrayArray1556[var1], 0);
      method1618();
      int var4 = method1643(Class14.method281(anIntArray1567.length - 1, (byte)81));
      boolean var5 = aBoolArray1566[var4];
      int var16 = var5?anInt1561:anInt1557;
      boolean var12 = false;
      boolean var11 = false;
      if(var5) {
         var12 = method1618() != 0;
         var11 = method1618() != 0;
      }

      int var21 = var16 >> 1;
      int var18;
      int var19;
      int var20;
      if(var5 && !var12) {
         var20 = (var16 >> 2) - (anInt1557 >> 2);
         var18 = (var16 >> 2) + (anInt1557 >> 2);
         var19 = anInt1557 >> 1;
      } else {
         var20 = 0;
         var18 = var21;
         var19 = var16 >> 1;
      }

      int var22;
      int var23;
      int var24;
      if(var5 && !var11) {
         var22 = var16 - (var16 >> 2) - (anInt1557 >> 2);
         var24 = var16 - (var16 >> 2) + (anInt1557 >> 2);
         var23 = anInt1557 >> 1;
      } else {
         var22 = var21;
         var24 = var16;
         var23 = var16 >> 1;
      }

      Class18 var3 = aClass18Array1565[anIntArray1567[var4]];
      int var15 = var3.anInt227;
      int var2 = var3.anIntArray228[var15];
      boolean var17 = !aClass17Array1563[var2].method318();
      boolean var47 = var17;

      for(var2 = 0; var2 < var3.anInt229; ++var2) {
         Class12 var26 = aClass12Array1564[var3.anIntArray226[var2]];
         float[] var14 = aFloatArray1580;
         var26.method255(var14, var16 >> 1, var47);
      }

      int var49;
      if(!var17) {
         var2 = var3.anInt227;
         var49 = var3.anIntArray228[var2];
         aClass17Array1563[var49].method307(aFloatArray1580, var16 >> 1);
      }

      int var46;
      if(var17) {
         for(var2 = var16 >> 1; var2 < var16; ++var2) {
            aFloatArray1580[var2] = 0.0F;
         }
      } else {
         var2 = var16 >> 1;
         var49 = var16 >> 2;
         var46 = var16 >> 3;
         float[] var7 = aFloatArray1580;

         int var27;
         for(var27 = 0; var27 < var2; ++var27) {
            var7[var27] *= 0.5F;
         }

         for(var27 = var2; var27 < var16; ++var27) {
            var7[var27] = -var7[var16 - var27 - 1];
         }

         float[] var51 = var5?aFloatArray1562:aFloatArray1574;
         float[] var38 = var5?aFloatArray1578:aFloatArray1575;
         float[] var39 = var5?aFloatArray1579:aFloatArray1576;
         int[] var32 = var5?anIntArray1581:anIntArray1569;

         float var6;
         int var8;
         float var9;
         float var10;
         float var13;
         for(var8 = 0; var8 < var49; ++var8) {
            var6 = var7[var8 * 4] - var7[var16 - var8 * 4 - 1];
            var9 = var7[var8 * 4 + 2] - var7[var16 - var8 * 4 - 3];
            var13 = var51[var8 * 2];
            var10 = var51[var8 * 2 + 1];
            var7[var16 - var8 * 4 - 1] = var6 * var13 - var9 * var10;
            var7[var16 - var8 * 4 - 3] = var6 * var10 + var9 * var13;
         }

         float var25;
         float var33;
         for(var8 = 0; var8 < var46; ++var8) {
            var6 = var7[var2 + 3 + var8 * 4];
            var9 = var7[var2 + 1 + var8 * 4];
            var13 = var7[var8 * 4 + 3];
            var10 = var7[var8 * 4 + 1];
            var7[var2 + 3 + var8 * 4] = var6 + var13;
            var7[var2 + 1 + var8 * 4] = var9 + var10;
            var25 = var51[var2 - 4 - var8 * 4];
            var33 = var51[var2 - 3 - var8 * 4];
            var7[var8 * 4 + 3] = (var6 - var13) * var25 - (var9 - var10) * var33;
            var7[var8 * 4 + 1] = (var9 - var10) * var25 + (var6 - var13) * var33;
         }

         var8 = Class14.method281(var16 - 1, (byte)14);

         int var41;
         int var43;
         int var44;
         int var45;
         for(var41 = 0; var41 < var8 - 3; ++var41) {
            var43 = var16 >> var41 + 2;
            var45 = 8 << var41;

            for(var44 = 0; var44 < 2 << var41; ++var44) {
               int var48 = var16 - var43 * 2 * var44;
               int var54 = var16 - var43 * (var44 * 2 + 1);

               for(int var28 = 0; var28 < var16 >> var41 + 4; ++var28) {
                  int var30 = var28 * 4;
                  float var35 = var7[var48 - 1 - var30];
                  float var37 = var7[var48 - 3 - var30];
                  float var36 = var7[var54 - 1 - var30];
                  float var34 = var7[var54 - 3 - var30];
                  var7[var48 - 1 - var30] = var35 + var36;
                  var7[var48 - 3 - var30] = var37 + var34;
                  float var29 = var51[var28 * var45];
                  float var31 = var51[var28 * var45 + 1];
                  var7[var54 - 1 - var30] = (var35 - var36) * var29 - (var37 - var34) * var31;
                  var7[var54 - 3 - var30] = (var37 - var34) * var29 + (var35 - var36) * var31;
               }
            }
         }

         for(var41 = 1; var41 < var46 - 1; ++var41) {
            var43 = var32[var41];
            if(var41 < var43) {
               var45 = var41 * 8;
               var44 = var43 * 8;
               var25 = var7[var45 + 1];
               var7[var45 + 1] = var7[var44 + 1];
               var7[var44 + 1] = var25;
               var25 = var7[var45 + 3];
               var7[var45 + 3] = var7[var44 + 3];
               var7[var44 + 3] = var25;
               var25 = var7[var45 + 5];
               var7[var45 + 5] = var7[var44 + 5];
               var7[var44 + 5] = var25;
               var25 = var7[var45 + 7];
               var7[var45 + 7] = var7[var44 + 7];
               var7[var44 + 7] = var25;
            }
         }

         for(var41 = 0; var41 < var2; ++var41) {
            var7[var41] = var7[var41 * 2 + 1];
         }

         for(var41 = 0; var41 < var46; ++var41) {
            var7[var16 - 1 - var41 * 2] = var7[var41 * 4];
            var7[var16 - 2 - var41 * 2] = var7[var41 * 4 + 1];
            var7[var16 - var49 - 1 - var41 * 2] = var7[var41 * 4 + 2];
            var7[var16 - var49 - 2 - var41 * 2] = var7[var41 * 4 + 3];
         }

         for(var41 = 0; var41 < var46; ++var41) {
            var9 = var39[var41 * 2];
            var13 = var39[var41 * 2 + 1];
            var10 = var7[var2 + var41 * 2];
            var25 = var7[var2 + var41 * 2 + 1];
            var33 = var7[var16 - 2 - var41 * 2];
            float var52 = var7[var16 - 1 - var41 * 2];
            float var53 = var13 * (var10 - var33) + var9 * (var25 + var52);
            var7[var2 + var41 * 2] = (var10 + var33 + var53) * 0.5F;
            var7[var16 - 2 - var41 * 2] = (var10 + var33 - var53) * 0.5F;
            var53 = var13 * (var25 + var52) - var9 * (var10 - var33);
            var7[var2 + var41 * 2 + 1] = (var25 - var52 + var53) * 0.5F;
            var7[var16 - 1 - var41 * 2] = (-var25 + var52 + var53) * 0.5F;
         }

         for(var41 = 0; var41 < var49; ++var41) {
            var7[var41] = var7[var41 * 2 + var2] * var38[var41 * 2] + var7[var41 * 2 + 1 + var2] * var38[var41 * 2 + 1];
            var7[var2 - 1 - var41] = var7[var41 * 2 + var2] * var38[var41 * 2 + 1] - var7[var41 * 2 + 1 + var2] * var38[var41 * 2];
         }

         for(var41 = 0; var41 < var49; ++var41) {
            var7[var16 - var49 + var41] = -var7[var41];
         }

         for(var41 = 0; var41 < var49; ++var41) {
            var7[var41] = var7[var49 + var41];
         }

         for(var41 = 0; var41 < var49; ++var41) {
            var7[var49 + var41] = -var7[var49 - var41 - 1];
         }

         for(var41 = 0; var41 < var49; ++var41) {
            var7[var2 + var41] = var7[var16 - var41 - 1];
         }

         for(var41 = var20; var41 < var18; ++var41) {
            var9 = (float)Math.sin(((double)(var41 - var20) + 0.5D) / (double)var19 * 0.5D * 3.141592653589793D);
            aFloatArray1580[var41] *= (float)Math.sin(1.5707963267948966D * (double)var9 * (double)var9);
         }

         for(var41 = var22; var41 < var24; ++var41) {
            var9 = (float)Math.sin(((double)(var41 - var22) + 0.5D) / (double)var23 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            aFloatArray1580[var41] *= (float)Math.sin(1.5707963267948966D * (double)var9 * (double)var9);
         }
      }

      float[] var40 = null;
      if(this.anInt1570 > 0) {
         var49 = this.anInt1570 + var16 >> 2;
         var40 = new float[var49];
         int var42;
         if(!this.aBool1572) {
            for(var46 = 0; var46 < this.anInt1571; ++var46) {
               var42 = (this.anInt1570 >> 1) + var46;
               var40[var46] += this.aFloatArray1558[var42];
            }
         }

         if(!var17) {
            for(var46 = var20; var46 < var16 >> 1; ++var46) {
               var42 = var40.length - (var16 >> 1) + var46;
               var40[var42] += aFloatArray1580[var46];
            }
         }
      }

      float[] var50 = this.aFloatArray1558;
      this.aFloatArray1558 = aFloatArray1580;
      aFloatArray1580 = var50;
      this.anInt1570 = var16;
      this.anInt1571 = var24 - (var16 >> 1);
      this.aBool1572 = var17;
      return var40;
   }

   static boolean method1625(AbstractIndex var0) {
      if(!aBool1568) {
         byte[] var1 = var0.getFile(0, 0, (byte) 7);
         if(var1 == null) {
            return false;
         }

         method1623(var1);
         aBool1568 = true;
      }

      return true;
   }

   static RSSoundEffect_2 method1626(AbstractIndex soundEffectsIndex_R2, int var1, int var2) {
      if(!method1625(soundEffectsIndex_R2)) {
         soundEffectsIndex_R2.containsFile(var1, var2, 1151584293);
         return null;
      } else {
         byte[] soundData = soundEffectsIndex_R2.getFile(var1, var2, (byte) 7);
         return soundData == null ? null : new RSSoundEffect_2(soundData);
      }
   }

   RSSoundEffect_2(byte[] var1) {
      this.method1621(var1);
   }

   Class108_Sub1_Sub1 method1627(int[] var1) {
      if(var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if(this.aByteArray1582 == null) {
            this.anInt1570 = 0;
            this.aFloatArray1558 = new float[anInt1561];
            this.aByteArray1582 = new byte[this.anInt1553];
            this.anInt1583 = 0;
            this.anInt1551 = 0;
         }

         for(; this.anInt1551 < this.aByteArrayArray1556.length; ++this.anInt1551) {
            if(var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var3 = this.method1624(this.anInt1551);
            if(var3 != null) {
               int var4 = this.anInt1583;
               int var5 = var3.length;
               if(var5 > this.anInt1553 - var4) {
                  var5 = this.anInt1553 - var4;
               }

               for(int var6 = 0; var6 < var5; ++var6) {
                  int var2 = (int)(128.0F + var3[var6] * 128.0F);
                  if((var2 & -256) != 0) {
                     var2 = ~var2 >> 31;
                  }

                  this.aByteArray1582[var4++] = (byte)(var2 - 128);
               }

               if(var1 != null) {
                  var1[0] -= var4 - this.anInt1583;
               }

               this.anInt1583 = var4;
            }
         }

         this.aFloatArray1558 = null;
         byte[] var7 = this.aByteArray1582;
         this.aByteArray1582 = null;
         return new Class108_Sub1_Sub1(this.anInt1552, var7, this.anInt1560, this.anInt1584, this.aBool1555);
      }
   }

   static void method1631(byte[] var0, int var1) {
      aByteArray1573 = var0;
      anInt1577 = var1;
      anInt1559 = 0;
   }

   static int method1643(int var0) {
      int var1 = 0;

      int var2;
      int var4;
      for(var4 = 0; var0 >= 8 - anInt1559; var0 -= var2) {
         var2 = 8 - anInt1559;
         int var3 = (1 << var2) - 1;
         var1 += (aByteArray1573[anInt1577] >> anInt1559 & var3) << var4;
         anInt1559 = 0;
         ++anInt1577;
         var4 += var2;
      }

      if(var0 > 0) {
         var2 = (1 << var0) - 1;
         var1 += (aByteArray1573[anInt1577] >> anInt1559 & var2) << var4;
         anInt1559 += var0;
      }

      return var1;
   }

   static float method1647(int var0) {
      int var1 = var0 & 2097151;
      int var3 = var0 & Integer.MIN_VALUE;
      int var2 = (var0 & 2145386496) >> 21;
      if(var3 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var2 - 788)));
   }
}
