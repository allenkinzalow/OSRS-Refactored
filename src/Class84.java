
public class Class84 {

   public static boolean[] aBoolArray1282 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
   public static int[] anIntArray1284 = new int[99];


   static void method1119(CacheIndex var0, int var1, int var2) {
      if(Class50.aClass108_Sub14_693 != null) {
         Class50.aClass108_Sub14_693.position = var1 * 8751192 - 1605143241;
         int var3 = Class50.aClass108_Sub14_693.readInt();
         int var4 = Class50.aClass108_Sub14_693.readInt();
         var0.setInformation(var3, var4, 1387721033);
      } else {
         Js5Request.submitJs5Request(null, 255, 255, 0, (byte) 0, true, (byte) 77);
         Class78.aClass74_Sub1Array1214[var1] = var0;
      }
   }

   static {
      int var0 = 0;

      for(int var2 = 0; var2 < 99; ++var2) {
         int var3 = 1 + var2;
         int var1 = (int)((double)var3 + 300.0D * Math.pow(2.0D, (double)var3 / 7.0D));
         var0 += var1;
         anIntArray1284[var2] = var0 / 4;
      }

   }

   Class84() throws Throwable {
      throw new Error();
   }

   static final void method1120(int var0, int var1, int var2, int var3, int var4, int var5) {
      IndexTable.scrollBarSprites[0].drawSprite(var0, var1);
      IndexTable.scrollBarSprites[1].drawSprite(var0, var1 + var3 - 16);
      Rasterizer2D.drawFilledRectangle(var0, 16 + var1, 16, var3 - 32, Client.anInt2781 * 1582542053);
      int var7 = (var3 - 32) * var3 / var4;
      if(var7 < 8) {
         var7 = 8;
      }

      int var6 = var2 * (var3 - 32 - var7) / (var4 - var3);
      Rasterizer2D.drawFilledRectangle(var0, var6 + var1 + 16, 16, var7, Client.anInt2782 * -1489754135);
      Rasterizer2D.drawVerticalLine(var0, var6 + var1 + 16, var7, Client.anInt2784 * 1934976019);
      Rasterizer2D.drawVerticalLine(1 + var0, 16 + var1 + var6, var7, Client.anInt2784 * 1934976019);
      Rasterizer2D.drawHorizontalLine(var0, var6 + 16 + var1, 16, Client.anInt2784 * 1934976019);
      Rasterizer2D.drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.anInt2784 * 1934976019);
      Rasterizer2D.drawVerticalLine(15 + var0, var1 + 16 + var6, var7, Client.anInt2783 * -964724323);
      Rasterizer2D.drawVerticalLine(14 + var0, var6 + var1 + 17, var7 - 1, Client.anInt2783 * -964724323);
      Rasterizer2D.drawHorizontalLine(var0, var7 + 15 + var1 + var6, 16, Client.anInt2783 * -964724323);
      Rasterizer2D.drawHorizontalLine(var0 + 1, var7 + var6 + 14 + var1, 15, Client.anInt2783 * -964724323);
   }

   public static int method1121(CharSequence var0, int var1, byte var2) {
      return Class32.method579(var0, var1, true, 70597305);
   }
}
