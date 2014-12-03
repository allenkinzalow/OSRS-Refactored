
public class ChatMessage extends CacheableNode {

   String messagePrefix;
   int messagePushTime;
   int messageType;
   String messageString;
   String messageSuffix;
   int anInt1944 = Class50.method697((byte)0) * -1473343273;
   static final int anInt1945 = 24;
   static final int anInt1946 = 88;


   static void method2010(short var0) {
      for(Class108_Sub6 var1 = (Class108_Sub6)Class108_Sub6.aClass105_1587.getFront(); null != var1; var1 = (Class108_Sub6)Class108_Sub6.aClass105_1587.getNext()) {
         if(var1.aClass108_Sub4_Sub2_1593 != null) {
            Class26.aClass108_Sub4_Sub1_352.method2037(var1.aClass108_Sub4_Sub2_1593);
            var1.aClass108_Sub4_Sub2_1593 = null;
         }

         if(null != var1.aClass108_Sub4_Sub2_1598) {
            Class26.aClass108_Sub4_Sub1_352.method2037(var1.aClass108_Sub4_Sub2_1598);
            var1.aClass108_Sub4_Sub2_1598 = null;
         }
      }

      Class108_Sub6.aClass105_1587.method1333();
   }

   static final void method2013(PaletteSprite var0, int var1) {
      short var2 = 256;

      int var3;
      for(var3 = 0; var3 < Class56.anIntArray755.length; ++var3) {
         Class56.anIntArray755[var3] = 0;
      }

      int var5;
      for(var3 = 0; var3 < 5000; ++var3) {
         var5 = (int)(Math.random() * 128.0D * (double)var2);
         Class56.anIntArray755[var5] = (int)(Math.random() * 256.0D);
      }

      int var6;
      int var7;
      for(var3 = 0; var3 < 20; ++var3) {
         for(var5 = 1; var5 < var2 - 1; ++var5) {
            for(var6 = 1; var6 < 127; ++var6) {
               var7 = (var5 << 7) + var6;
               Class16.anIntArray204[var7] = (Class56.anIntArray755[128 + var7] + Class56.anIntArray755[var7 - 128] + Class56.anIntArray755[var7 - 1] + Class56.anIntArray755[var7 + 1]) / 4;
            }
         }

         int[] var9 = Class56.anIntArray755;
         Class56.anIntArray755 = Class16.anIntArray204;
         Class16.anIntArray204 = var9;
      }

      if(var0 != null) {
         var3 = 0;

         for(var5 = 0; var5 < var0.anInt2414; ++var5) {
            for(var6 = 0; var6 < var0.anInt2413; ++var6) {
               if(var0.pixels[var3++] != 0) {
                  var7 = 16 + var6 + var0.anInt2415;
                  int var8 = var5 + 16 + var0.anInt2411;
                  int var4 = (var8 << 7) + var7;
                  Class56.anIntArray755[var4] = 0;
               }
            }
         }

      }
   }

   ChatMessage(int messageType, String var2, String var3, String var4) {
      this.messagePushTime = Client.cycle * 1628301579;
      this.messageType = messageType * -1886945487;
      this.messagePrefix = var2;
      this.messageString = var3;
      this.messageSuffix = var4;
   }

   public static RGBSprite method2016(AbstractIndex index, int archiveId, int fileId, byte var3) {
      if(!Class108_Sub11.method1686(index, archiveId, fileId, -1593817854)) {
         return null;
      } else {
         RGBSprite sprite = new RGBSprite();
         sprite.maxWidth = Class9.anInt122 * 93011449;
         sprite.maxHeight = Class9.anInt121 * -1272520477;
         sprite.offsetX = Class88.anIntArray1316[0];
         sprite.offsetY = Class9.anIntArray123[0];
         sprite.width = Class36.anIntArray514[0];
         sprite.height = Class9.anIntArray126[0];
         int dimmension = sprite.width * sprite.height;
         byte[] var6 = AnimationSkeletonSet.loadedCharacterPixels[0];
         sprite.pixels = new int[dimmension]; 

         for(int pos = 0; pos < dimmension; ++pos) {
            sprite.pixels[pos] = Class9.anIntArray130[var6[pos] & 255];
         }

         ClientScript.method1679((byte)99);
         return sprite;
      }
   }

   static final void method2017(int var0, int var1, int var2, short var3) {
      if(var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var4 = ClientScript.getFloorDrawHeight(var0, var1, Class108_Sub20_Sub2.plane * -570926309, 1332864502) - var2;
         var0 -= BZip2Context.anInt279 * 1217916071;
         var4 -= ClientScript.anInt1645 * 699100371;
         var1 -= CacheFileAccessor.anInt1490 * 1498802843;
         int var6 = Rasterizer3D.SINE[RuntimeException_Sub1.anInt2625 * -611182019];
         int var5 = Rasterizer3D.COSINE[RuntimeException_Sub1.anInt2625 * -611182019];
         int var8 = Rasterizer3D.SINE[GameConnection.anInt811 * -1717637923];
         int var9 = Rasterizer3D.COSINE[GameConnection.anInt811 * -1717637923];
         int var7 = var0 * var9 + var1 * var8 >> 16;
         var1 = var1 * var9 - var8 * var0 >> 16;
         var0 = var7;
         var7 = var4 * var5 - var1 * var6 >> 16;
         var1 = var4 * var6 + var5 * var1 >> 16;
         if(var1 >= 50) {
            Client.anInt2808 = (256 + (var0 << 9) / var1) * 1626005023;
            Client.anInt2809 = ((var7 << 9) / var1 + 167) * 1121153661;
         } else {
            Client.anInt2808 = -1626005023;
            Client.anInt2809 = -1121153661;
         }
      } else {
         Client.anInt2808 = -1626005023;
         Client.anInt2809 = -1121153661;
      }
   }

   static final void method2018(byte var0) {
      for(Class108_Sub20_Sub14_Sub6 var1 = (Class108_Sub20_Sub14_Sub6) Client.aClass105_2928.getFront(); var1 != null; var1 = (Class108_Sub20_Sub14_Sub6) Client.aClass105_2928.getNext()) {
         if(var1.anInt2603 * -1644198771 == Class108_Sub20_Sub2.plane * -570926309 && !var1.aBool2612) {
            if(Client.cycle * -637317861 >= var1.anInt2602 * 813112785) {
               var1.method3073(Client.anInt2780 * 468305965, 65919374);
               if(var1.aBool2612) {
                  var1.unlink();
               } else {
                  Class56.gameScene.method412(var1.anInt2603 * -1644198771, var1.anInt2609 * -743735107, var1.anInt2605 * 1383152313, var1.anInt2606 * -1829119315, 60, var1, 0, -1, false);
               }
            }
         } else {
            var1.unlink();
         }
      }

   }

   void method2019(int var1, String var2, String var3, String var4, int var5) {
      this.anInt1944 = Class50.method697((byte)0) * -1473343273;
      this.messagePushTime = Client.cycle * 1628301579;
      this.messageType = var1 * -1886945487;
      this.messagePrefix = var2;
      this.messageString = var3;
      this.messageSuffix = var4;
   }

   public static int method2021(int var0, byte var1) {
      return var0 > 0?1:(var0 < 0?-1:0);
   }
}
