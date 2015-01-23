import java.applet.Applet;

public class Class56 {

   static String operatingSystem = null;
   static Scene gameScene;
   static int[] anIntArray755;
   static Applet anApplet756 = null;
   static int[] anIntArray757;
   static RGBSprite[] mapMarkerSprites;


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
         int var1 = RegionReference.getFloorDrawHeight(BZip2Context.xCameraPos * 1217916071, CacheFileAccessor.anInt1490 * 1498802843, VarpBit.plane * -570926309, 1561513194);
         return var1 - ClientScript.anInt1645 * 699100371 < 800 && (RegionReference.mapTileSettings[VarpBit.plane * -570926309][BZip2Context.xCameraPos * 1217916071 >> 7][CacheFileAccessor.anInt1490 * 1498802843 >> 7] & 4) != 0?VarpBit.plane * -570926309:3;
      } else {
         return VarpBit.plane * -570926309;
      }
   }
}
