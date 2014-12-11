import java.awt.Font;

public final class WallDecoration {

   int anInt293;
   int anInt294;
   int anInt296;
   static RGBSprite[] crossSprites;
   int anInt298;
   int anInt299;
   public Renderable renderable;
   public Renderable aClass108_Sub20_Sub14_301;
   public int anInt302 = 0;
   int anInt303 = 0;
   int anInt304;
   static Font aFont305;
   int face;


   public static void method338(byte[] data, int var1) {
      RSByteBuffer buffer = new RSByteBuffer(data);
      buffer.position = (data.length - 2) * 537964811;
      Class9.anInt125 = buffer.readUShort(635512719) * -241769105;
      Class88.anIntArray1316 = new int[Class9.anInt125 * 2039617935];
      Class9.anIntArray123 = new int[Class9.anInt125 * 2039617935];
      Class36.anIntArray514 = new int[Class9.anInt125 * 2039617935];
      Class9.anIntArray126 = new int[Class9.anInt125 * 2039617935];
      AnimationSkeletonSet.loadedCharacterPixels = new byte[Class9.anInt125 * 2039617935][];
      buffer.position = (data.length - 7 - Class9.anInt125 * -862925704) * 537964811;
      Class9.anInt122 = buffer.readUShort(-821144934) * -1400179639;
      Class9.anInt121 = buffer.readUShort(-1985241913) * -187603765;
      int var3 = (buffer.readUByte() & 255) + 1;

      int var6;
      for(var6 = 0; var6 < Class9.anInt125 * 2039617935; ++var6) {
         Class88.anIntArray1316[var6] = buffer.readUShort(-517797873);
      }

      for(var6 = 0; var6 < Class9.anInt125 * 2039617935; ++var6) {
         Class9.anIntArray123[var6] = buffer.readUShort(119520541);
      }

      for(var6 = 0; var6 < Class9.anInt125 * 2039617935; ++var6) {
         Class36.anIntArray514[var6] = buffer.readUShort(-1397296091);
      }

      for(var6 = 0; var6 < Class9.anInt125 * 2039617935; ++var6) {
         Class9.anIntArray126[var6] = buffer.readUShort(-1007194691);
      }

      buffer.position = (data.length - 7 - Class9.anInt125 * -862925704 - (var3 - 1) * 3) * 537964811;
      Class9.anIntArray130 = new int[var3];

      for(var6 = 1; var6 < var3; ++var6) {
         Class9.anIntArray130[var6] = buffer.method1809(-263273200);
         if(0 == Class9.anIntArray130[var6]) {
            Class9.anIntArray130[var6] = 1;
         }
      }

      buffer.position = 0;

      for(var6 = 0; var6 < Class9.anInt125 * 2039617935; ++var6) {
         int var7 = Class36.anIntArray514[var6];
         int var9 = Class9.anIntArray126[var6];
         int var10 = var7 * var9;
         byte[] var11 = new byte[var10];
         AnimationSkeletonSet.loadedCharacterPixels[var6] = var11;
         int var4 = buffer.readUByte();
         int var5;
         if(var4 == 0) {
            for(var5 = 0; var5 < var10; ++var5) {
               var11[var5] = buffer.readByte();
            }
         } else if(1 == var4) {
            for(var5 = 0; var5 < var7; ++var5) {
               for(int var8 = 0; var8 < var9; ++var8) {
                  var11[var7 * var8 + var5] = buffer.readByte();
               }
            }
         }
      }

   }

   static boolean isOnIgnore(String rawUsername, int var1) {
      if(null == rawUsername) {
         return false; 
      } else {
         String decodedUsername = Class108_Sub10.method1683(rawUsername, UnderlayDefinition.aClass116_2142, -1906056421);

         for(int var4 = 0; var4 < Client.ignoreListCount * -1283681697; ++var4) {
            Ignore ignore = Client.ignoreList[var4];
            if(decodedUsername.equalsIgnoreCase(Class108_Sub10.method1683(ignore.username, UnderlayDefinition.aClass116_2142, -1974944439))) {
               return true;
            }

            if(decodedUsername.equalsIgnoreCase(Class108_Sub10.method1683(ignore.aString387, UnderlayDefinition.aClass116_2142, -1976347131))) {
               return true;
            }
         }

         return false;
      }
   }

}
