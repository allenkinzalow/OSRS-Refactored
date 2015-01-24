
public class Varp extends CacheableNode {

   static GameConnection loginConnection;
   public static CacheableNodeMap varpCacheMap = new CacheableNodeMap(64);
   public int configType = 0;
   static int anInt2042;
   static int[] anIntArray2043;
   public static int anInt2045;


   void decode(RSByteBuffer buffer, int var2) {
      while(true) {
         int opcode = buffer.readUByte();
         if(opcode == 0) {
            return;
         }

         this.decodeReadValues(buffer, opcode, (byte)1);
      }
   }

   static final void method2152(int x, int y, int var2, int var3, RGBSprite var4, byte var5) {
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
            double rotationAngle = Math.atan2((double)var14, (double)var15);
            int yRot = (int)(Math.sin(rotationAngle) * 63.0D);
            int xRot = (int)(Math.cos(rotationAngle) * 57.0D);
            MiniMap.mapEdgeSprite.method2765(yRot + 94 + x + 4 - 10, 83 + y - xRot - 20, 20, 20, 15, 15, rotationAngle, 256);
         }
      } else {
         ProducingGraphicsBuffer.renderMapDotSprite(x, y, var2, var3, var4);
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

   void decodeReadValues(RSByteBuffer buffer, int opcode, byte var3) {
      if(opcode == 5) {
         this.configType = buffer.readUShort(-1888641034) * 1511475697;
      }
   }

   static final int method2160(int var0, int var1, int var2, byte var3) {
      int var4 = 256 - var2;
      return ((var0 & '\uff00') * var4 + var2 * (var1 & '\uff00') & 16711680) + ((var1 & 16711935) * var2 + var4 * (var0 & 16711935) & -16711936) >> 8;
   }

}
