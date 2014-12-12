import java.awt.event.ActionEvent;

public abstract class Renderable extends CacheableNode {

   static RGBSprite[] mapDotSprites;
   public int modelHeight = 1465659208;


   protected ModelRasterizer getModelRasterizer(byte var1) {
      return null;
   }

   void renderAtPoint(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      ModelRasterizer var10 = this.getModelRasterizer((byte)39);
      if(var10 != null) {
         this.modelHeight = var10.modelHeight * 1;
         var10.renderAtPoint(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }
   }

   public static PaletteSprite method2488(AbstractIndex var0, String var1, String var2, byte var3) {
      int var4 = var0.getArchiveIDForName(var1, 1723285154);
      int var5 = var0.getFileIDForName(var4, var2);
      return Class5.method99(var0, var4, var5, (byte)0);
   }

   public static void method2491(PingRequester var0, Object var1, short var2) {
      if(var0.eventQueue != null) {
         for(int var3 = 0; var3 < 50 && var0.eventQueue.peekEvent() != null; ++var3) {
            Class108_Sub22.sleep(1L);
         }

         if(var1 != null) {
            var0.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }
      }
   }
}
