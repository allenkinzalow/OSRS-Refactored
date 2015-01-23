import java.io.File;

public class CacheConstants {

   public static File aFile1252;
   public static final int anInt1253 = 1048576;
   public static final int anInt1254 = 255;
   public static File aFile1255;
   public static final int anInt1256 = 217;
   public static final String aString1257 = "rw";
   public static final String CACHE_DATA = "main_file_cache.dat2";
   public static CacheFile aClass123_1259 = null;
   public static CacheFile cacheDataFile = null;
   public static final int anInt1261 = 134;
   public static CacheFile[] indexFileArray;
   static final int anInt1263 = 3;
   public static final int anInt1264 = 126;
   public static final int anInt1265 = 94;
   public static final int anInt1266 = 69;
   public static CacheFile cache255File = null;
   public static final String CACHE_INDEX = "main_file_cache.idx";
   public static final int anInt1269 = 1048576000;
   public static int indexCount;


   CacheConstants() throws Throwable {
      throw new Error();
   }

   static final void method1097(int configID, byte var1) {
      Client.method3554(-1192704029);
      ChatMessagesContainer.method346(151864213);
      int config = AnimatedGraphic.method2149(configID, (byte) 4).configType * -1110014191;
      if(0 != config) {
         int value = Class88.configSettings[configID];
         if(1 == config) { // adjust lighting
            if(1 == value) {
               Rasterizer3D.method2976(0.9D);
               ((TextureLoader)Rasterizer3D.anTextureImage_2501).method384(0.9D);
            }

            if(2 == value) {
               Rasterizer3D.method2976(0.8D);
               ((TextureLoader)Rasterizer3D.anTextureImage_2501).method384(0.8D);
            }

            if(value == 3) {
               Rasterizer3D.method2976(0.7D);
               ((TextureLoader)Rasterizer3D.anTextureImage_2501).method384(0.7D);
            }

            if(value == 4) {
               Rasterizer3D.method2976(0.6D);
               ((TextureLoader)Rasterizer3D.anTextureImage_2501).method384(0.6D);
            }

            ItemDefinition.itemSpriteMap.clearCacheMap();
         }

         if(config == 3) {
            short var6 = 0;
            if(0 == value) {
               var6 = 255;
            }

            if(1 == value) {
               var6 = 192;
            }

            if(2 == value) {
               var6 = 128;
            }

            if(value == 3) {
               var6 = 64;
            }

            if(value == 4) {
               var6 = 0;
            }

            if(Client.anInt2873 * 99489839 != var6) {
               if(0 == Client.anInt2873 * 99489839 && -1 != Client.anInt2937 * 111831401) {
                  AnimationSkin.method1677(Friend.musicIndex_1, Client.anInt2937 * 111831401, 0, var6, false, -1604315584);
                  Client.aBool2938 = false;
               } else if(var6 == 0) {
                  Class32.aClass108_Sub4_Sub3_464.method2610(1521857055);
                  SongReference.anInt1325 = -771978757;
                  RSInterface.aClass74_1889 = null;
                  Client.aBool2938 = false;
               } else if(0 != SongReference.anInt1325 * 485824819) {
                  SoundEffectWorker.anInt362 = var6 * 495527089;
               } else {
                  Class32.aClass108_Sub4_Sub3_464.method2637(var6, -2140515307);
               }

               Client.anInt2873 = var6 * -1954664753;
            }
         }

         if(4 == config) { // adjust volume
            if(0 == value) {
               Client.anInt2812 = 1472404201;
            }

            if(value == 1) {
               Client.anInt2812 = 267532448;
            }

            if(2 == value) {
               Client.anInt2812 = -1253300800;
            }

            if(3 == value) {
               Client.anInt2812 = 1520833248;
            }

            if(value == 4) {
               Client.anInt2812 = 0;
            }
         }

         if(5 == config) {
            Client.anInt2765 = value * -378103873;
         }

         if(6 == config) { //show spoken effects
            Client.anInt2867 = value * 705214635;
         }

         if(config == 9) {
            Client.anInt2730 = value * 520486425;
         }

         if(10 == config) {
            if(0 == value) {
               Client.anInt2940 = -1491759421;
            }

            if(1 == value) {
               Client.anInt2940 = -958535968;
            }

            if(value == 2) {
               Client.anInt2940 = -2070679744;
            }

            if(3 == value) {
               Client.anInt2940 = 1112143776;
            }

            if(4 == value) {
               Client.anInt2940 = 0;
            }
         }

         if(17 == config) {
            Client.anInt2789 = (value & '\uffff') * -801480023;
         }

         if(config == 18) {
            Class50[] var9 = new Class50[]{Class50.aClass50_694, Class50.aClass50_698, Class50.aClass50_701};
            Class50[] var7 = var9;
            int var4 = 0;

            Class50 var8;
            while(true) {
               if(var4 >= var7.length) {
                  var8 = null;
                  break;
               }

               Class50 var3 = var7[var4];
               if(value == var3.method32(-1397647336)) {
                  var8 = var3;
                  break;
               }

               ++var4;
            }

            Client.aClass50_2733 = (Class50)var8;
            if(null == Client.aClass50_2733) {
               Client.aClass50_2733 = Class50.aClass50_698;
            }
         }

         if(config == 19) {
            if(-1 == value) {
               Client.anInt2837 = 739185759;
            } else {
               Client.anInt2837 = (value & 2047) * -739185759;
            }
         }
      }
   }

   static long method1102(CharSequence var0, int var1) {
      long var2 = 0L;
      int var6 = var0.length();

      for(int var5 = 0; var5 < var6; ++var5) {
         var2 *= 37L;
         char var4 = var0.charAt(var5);
         if(var4 >= 65 && var4 <= 90) {
            var2 += (long)(var4 + 1 - 65);
         } else if(var4 >= 97 && var4 <= 122) {
            var2 += (long)(var4 + 1 - 97);
         } else if(var4 >= 48 && var4 <= 57) {
            var2 += (long)(var4 + 27 - 48);
         }

         if(var2 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var2 % 37L && 0L != var2) {
         var2 /= 37L;
      }

      return var2;
   }
}
