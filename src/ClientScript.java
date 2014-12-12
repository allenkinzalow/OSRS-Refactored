
public class ClientScript extends Node {

   static MouseCapturer mouseCapturer;
   static int[] intLocals;
   boolean aBool1636;
   int mouseX;
   Object[] parameters;
   int mouseY;
   int anInt1640;
   RSInterface aClass108_Sub17_1641;
   String aString1642;
   int keyChar;
   RSInterface parentInterface;
   static int anInt1645;
   int keyCode;
   static int[] objectLandscapeIDs;


   static final int getFloorDrawHeight(int var0, int var1, int var2, int var3) {
      int var4 = var0 >> 7;
      int var7 = var1 >> 7;
      if(var4 >= 0 && var7 >= 0 && var4 <= 103 && var7 <= 103) {
         int var6 = var2;
         if(var2 < 3 && (RegionReference.mapTileSettings[1][var4][var7] & 2) == 2) {
            var6 = var2 + 1;
         }

         int var5 = var0 & 127;
         int var8 = var1 & 127;
         int var9 = var5 * RegionReference.tileHeights[var6][1 + var4][var7] + (128 - var5) * RegionReference.tileHeights[var6][var4][var7] >> 7;
         int var10 = RegionReference.tileHeights[var6][var4 + 1][1 + var7] * var5 + (128 - var5) * RegionReference.tileHeights[var6][var4][var7 + 1] >> 7;
         return (128 - var8) * var9 + var8 * var10 >> 7;
      } else {
         return 0;
      }
   }

   static void method1679(byte var0) {
      Class88.anIntArray1316 = null;
      Class9.anIntArray123 = null;
      Class36.anIntArray514 = null;
      Class9.anIntArray126 = null;
      Class9.anIntArray130 = null;
      AnimationSkeletonSet.loadedCharacterPixels = (byte[][])null;
   }

   public static String method1680(long var0) {
      if(var0 > 0L && var0 < 6582952005840035281L) {
         if(var0 % 37L == 0L) {
            return null;
         } else {
            int var6 = 0;

            for(long var2 = var0; 0L != var2; var2 /= 37L) {
               ++var6;
            }

            char var4;
            StringBuilder var5;
            for(var5 = new StringBuilder(var6); 0L != var0; var5.append(var4)) {
               long var8 = var0;
               var0 /= 37L;
               var4 = StringUtilities.aCharArray1455[(int)(var8 - 37L * var0)];
               if(95 == var4) {
                  int var7 = var5.length() - 1;
                  var5.setCharAt(var7, Character.toUpperCase(var5.charAt(var7)));
                  var4 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

}
