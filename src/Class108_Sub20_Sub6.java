
public class Class108_Sub20_Sub6 extends CacheableNode {

   static GameConnection loginConnection;
   public static CacheableNodeMap aClass106_2040 = new CacheableNodeMap(64);
   public int anInt2041 = 0;
   static int anInt2042;
   static int[] anIntArray2043;
   static final int anInt2044 = 28;
   public static int anInt2045;
   static final int anInt2046 = 1048576;
   public static final int anInt2047 = 155;
   public static final int anInt2048 = 164;
   static final int anInt2049 = 104;
   public static final int anInt2050 = 0;


   void method2151(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUByte();
         if(var3 == 0) {
            return;
         }

         this.method2159(var1, var3, (byte)1);
      }
   }

   static final void method2152(int var0, int var1, int var2, int var3, RGBSprite var4, byte var5) {
      int var6 = var2 * var2 + var3 * var3;
      if(var6 > 4225 && var6 < 90000) {
         if(var5 > 4) {
            int var12 = Client.anInt2775 * 1889215063 + Client.anInt2771 * -44898889 & 2047;
            int var11 = Rasterizer3D.SINE[var12];
            int var13 = Rasterizer3D.COSINE[var12];
            var11 = var11 * 256 / (256 + Client.anInt2957 * 331969371);
            var13 = var13 * 256 / (Client.anInt2957 * 331969371 + 256);
            int var14 = var3 * var11 + var13 * var2 >> 16;
            int var15 = var13 * var3 - var11 * var2 >> 16;
            double var9 = Math.atan2((double)var14, (double)var15);
            int var7 = (int)(Math.sin(var9) * 63.0D);
            int var8 = (int)(Math.cos(var9) * 57.0D);
            IdentityKit.mapEdgeSprite.method2765(var7 + 94 + var0 + 4 - 10, 83 + var1 - var8 - 20, 20, 20, 15, 15, var9, 256);
         }
      } else {
         ProducingGraphicsBuffer.method1594(var0, var1, var2, var3, var4);
      }
   }

   static final int packHSL(int hue, int saturation, int luminosity, int var3) {
      if(luminosity > 179) {
         saturation /= 2;
      }

      if(luminosity > 192) {
         saturation /= 2;
      }

      if(luminosity > 217) {
         saturation /= 2;
      }

      if(luminosity > 243) {
         saturation /= 2;
      }

      int var4 = (hue / 4 << 10) + (saturation / 32 << 7) + luminosity / 2;
      return var4;
   }

   void method2159(RSByteBuffer var1, int var2, byte var3) {
      if(var2 == 5) {
         this.anInt2041 = var1.readUShort(-1888641034) * 1511475697;
      }
   }

   static final int method2160(int var0, int var1, int var2, byte var3) {
      int var4 = 256 - var2;
      return ((var0 & '\uff00') * var4 + var2 * (var1 & '\uff00') & 16711680) + ((var1 & 16711935) * var2 + var4 * (var0 & 16711935) & -16711936) >> 8;
   }

}
