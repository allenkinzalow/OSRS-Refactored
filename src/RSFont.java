
public final class RSFont extends RSTypeFace {

   public RSFont(byte[] var1) {
      super(var1);
   }

   final void method3136(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * renderWidth;
      int var11 = renderWidth - var4;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if(var3 < topY) {
         var10 = topY - var3;
         var5 -= var10;
         var3 = topY;
         var9 += var10 * var4;
         var7 += var10 * renderWidth;
      }

      if(var3 + var5 > bottomY) {
         var5 -= var3 + var5 - bottomY;
      }

      if(var2 < topX) {
         var10 = topX - var2;
         var4 -= var10;
         var2 = topX;
         var9 += var10;
         var7 += var10;
         var8 += var10;
         var11 += var10;
      }

      if(var2 + var4 > bottomX) {
         var10 = var2 + var4 - bottomX;
         var4 -= var10;
         var8 += var10;
         var11 += var10;
      }

      if(var4 > 0) {
         if(var5 > 0) {
            drawCharacterPixels(renderPixels, var1, var6, var9, var7, var4, var5, var11, var8);
         }
      }
   }

   final void method3108(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * renderWidth;
      int var11 = renderWidth - var4;
      int var12 = 0;
      int var10 = 0;
      int var9;
      if(var3 < topY) {
         var9 = topY - var3;
         var5 -= var9;
         var3 = topY;
         var10 += var9 * var4;
         var8 += var9 * renderWidth;
      }

      if(var3 + var5 > bottomY) {
         var5 -= var3 + var5 - bottomY;
      }

      if(var2 < topX) {
         var9 = topX - var2;
         var4 -= var9;
         var2 = topX;
         var10 += var9;
         var8 += var9;
         var12 += var9;
         var11 += var9;
      }

      if(var2 + var4 > bottomX) {
         var9 = var2 + var4 - bottomX;
         var4 -= var9;
         var12 += var9;
         var11 += var9;
      }

      if(var4 > 0) {
         if(var5 > 0) {
            drawCharacterPixelsAlpha(renderPixels, var1, var6, var10, var8, var4, var5, var11, var12, var7);
         }
      }
   }

   public RSFont(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }
}
