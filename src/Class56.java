import java.applet.Applet;

public class Class56 {

   public static final int anInt749 = 63;
   static String aString750 = null;
   static final int anInt751 = 1;
   static Scene gameScene;
   static final int anInt753 = 3;
   public static final int anInt754 = 121;
   static int[] anIntArray755;
   static Applet anApplet756 = null;
   static int[] anIntArray757;
   public static final int anInt758 = 47;
   static RGBSprite[] mapMarkerSprites;
   static final int anInt760 = 2;


   Class56() throws Throwable {
      throw new Error();
   }

   protected static final void method744(int var0) {
      CullingCluster.anImage646 = null;
      WallDecoration.aFont305 = null;
      Ignore.aFontMetrics398 = null;
   }

   static final int method745(int var0) {
      if(!Ignore.aClass37_386.aBool528) {
         int var1 = ClientScript.getFloorDrawHeight(BZip2Context.anInt279 * 1217916071, CacheFileAccessor.anInt1490 * 1498802843, Class108_Sub20_Sub2.plane * -570926309, 1561513194);
         return var1 - ClientScript.anInt1645 * 699100371 < 800 && (RegionReference.mapTileSettings[Class108_Sub20_Sub2.plane * -570926309][BZip2Context.anInt279 * 1217916071 >> 7][CacheFileAccessor.anInt1490 * 1498802843 >> 7] & 4) != 0?Class108_Sub20_Sub2.plane * -570926309:3;
      } else {
         return Class108_Sub20_Sub2.plane * -570926309;
      }
   }
}
