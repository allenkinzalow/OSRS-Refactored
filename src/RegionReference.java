
public final class RegionReference {

   static int[] anIntArray483 = new int[]{16, 32, 64, 128};
   static int[] blendedHue;
   static int anInt485 = 1529001613;
   static byte[][][] overlayFloorIds;
   static byte[][][] overlayClippingPaths;
   static byte[][][] aByteArrayArrayArray488;
   static final int anInt489 = 12;
   static int[] blendedSaturation;
   static int[] anIntArray491 = new int[]{1, 2, 4, 8};
   static int[] anIntArray492 = new int[]{1, -1, -1, 1};
   static int[] anIntArray493 = new int[]{1, 0, -1, 0};
   static int[] anIntArray494 = new int[]{0, -1, 0, 1};
   static byte[][][] mapTileSettings = new byte[4][104][104];
   static int[] anIntArray496 = new int[]{-1, -1, 1, 1};
   static int[][][] tileHeights = new int[4][105][105];
   static int lightnessRandomizer = ((int)(Math.random() * 33.0D) - 16) * 1990361651;
   static int hueRandomizer = ((int)(Math.random() * 17.0D) - 8) * -1535870085;
   static final int anInt500 = 74;
   public static final int anInt501 = 96;
   static final int anInt502 = 2340;


   static void method587(int var0, IndexTable var1, CacheIndex var2, int var3) {
      byte[] var4 = null;
      Deque var5 = Class86.aClass105_1300;
      synchronized(var5) {
         Class108_Sub16 var6 = (Class108_Sub16)Class86.aClass105_1300.getFront();

         while(var6 != null) {
            if((long)var0 != var6.key || var6.aClass59_1757 != var1 || var6.anInt1759 * -612139703 != 0) {
               var6 = (Class108_Sub16)Class86.aClass105_1300.getNext();
            } else {
               var4 = var6.aByteArray1754;
               break;
            }
         }
      }

      if(null != var4) {
         var2.method1906(var1, var0, var4, true, 579837078);
      } else {
         byte[] var9 = var1.get(var0, (byte)39);
         var2.method1906(var1, var0, var9, true, -1957699113);
      }
   }

   static final void method588(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8, short var9) {
      int var12;
      for(int var10 = 0; var10 < 8; ++var10) {
         for(var12 = 0; var12 < 8; ++var12) {
            if(var10 + var2 > 0 && var10 + var2 < 103 && var12 + var3 > 0 && var3 + var12 < 103) {
               var8[var1].clipData[var10 + var2][var3 + var12] &= -16777217;
            }
         }
      }

      RSByteBuffer var14 = new RSByteBuffer(var0);

      for(var12 = 0; var12 < 4; ++var12) {
         for(int var11 = 0; var11 < 64; ++var11) {
            for(int var13 = 0; var13 < 64; ++var13) {
               if(var4 == var12 && var11 >= var5 && var11 < 8 + var5 && var13 >= var6 && var13 < var6 + 8) {
                  ClientScriptDefinition.method2566(var14, var1, var2 + method621(var11 & 7, var13 & 7, var7, -617553596), var3 + Class43.method653(var11 & 7, var13 & 7, var7, 1379797264), 0, 0, var7, (byte)-58);
               } else {
                  ClientScriptDefinition.method2566(var14, 0, -1, -1, 0, 0, 0, (byte)-48);
               }
            }
         }
      }

   }

   RegionReference() throws Throwable {
      throw new Error();
   }

   static final void method608(byte var0) {
      boolean var1 = false;

      while(!var1) {
         var1 = true;

         for(int var2 = 0; var2 < Client.menuActionRow * 391839991 - 1; ++var2) {
            if(Client.menuActionIdentifiers[var2] < 1000 && Client.menuActionIdentifiers[var2 + 1] > 1000) {
               String var4 = Client.menuActionNames[var2];
               Client.menuActionNames[var2] = Client.menuActionNames[1 + var2];
               Client.menuActionNames[var2 + 1] = var4;
               String var5 = Client.menuActionNamePrefix[var2];
               Client.menuActionNamePrefix[var2] = Client.menuActionNamePrefix[var2 + 1];
               Client.menuActionNamePrefix[1 + var2] = var5;
               int var3 = Client.menuActionIdentifiers[var2];
               Client.menuActionIdentifiers[var2] = Client.menuActionIdentifiers[1 + var2];
               Client.menuActionIdentifiers[var2 + 1] = var3;
               var3 = Client.menuActionXInteractions[var2];
               Client.menuActionXInteractions[var2] = Client.menuActionXInteractions[var2 + 1];
               Client.menuActionXInteractions[var2 + 1] = var3;
               var3 = Client.menuActionYInteractions[var2];
               Client.menuActionYInteractions[var2] = Client.menuActionYInteractions[1 + var2];
               Client.menuActionYInteractions[var2 + 1] = var3;
               var3 = Client.menuActionParameters[var2];
               Client.menuActionParameters[var2] = Client.menuActionParameters[1 + var2];
               Client.menuActionParameters[1 + var2] = var3;
               var1 = false;
            }
         }
      }

   }

   public static RGBSprite[] loadImageSet(AbstractIndex var0, String var1, String var2, short var3) {
      int var4 = var0.method1005(var1, 1723285154);
      int var5 = var0.getFileForName(var4, var2, (byte)0);
      return NPC.method3167(var0, var4, var5, -893370861);
   }

   public static AnimationSkeletonSet method617(AbstractIndex var0, AbstractIndex var1, int var2, boolean var3, int var4) {
      boolean var5 = true;
      int[] var6 = var0.method1013(var2, 1171371672);

      for(int var7 = 0; var7 < var6.length; ++var7) {
         byte[] var8 = var0.getFileData(var2, var6[var7], -1906233178);
         if(var8 == null) {
            var5 = false;
         } else {
            int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
            byte[] var10;
            if(var3) {
               var10 = var1.getFileData(0, var9, -1658429547);
            } else {
               var10 = var1.getFileData(var9, 0, 288212166);
            }

            if(null == var10) {
               var5 = false;
            }
         }
      }

      if(!var5) {
         return null;
      } else {
         try {
            return new AnimationSkeletonSet(var0, var1, var2, var3);
         } catch (Exception var11) {
            return null;
         }
      }
   }

   static final byte[] method618(byte[] var0, byte var1) {
      RSByteBuffer var2 = new RSByteBuffer(var0);
      int var6 = var2.readUByte();
      int var5 = var2.readInt();
      if(var5 >= 0 && (AbstractIndex.anInt945 * -2077097137 == 0 || var5 <= AbstractIndex.anInt945 * -2077097137)) {
         if(var6 == 0) {
            byte[] var7 = new byte[var5];
            var2.readBytes(var7, 0, var5, -765811799);
            return var7;
         } else {
            int targsize = var2.readInt();
	         if (targsize < 0 || targsize > 1000000) {
		         return new byte[100];
	         }

            if(targsize >= 0 && (AbstractIndex.anInt945 * -2077097137 == 0 || targsize <= AbstractIndex.anInt945 * -2077097137)) {
               byte[] var3 = new byte[targsize];
               if(1 == var6) {
                  BZip2Decompressor.method943(var3, targsize, var0, var5, 9);
               } else {
                  AbstractIndex.aClass45_936.method666(var2, var3, (byte)85);
               }

               return var3;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   public static int method621(int var0, int var1, int var2, int var3) {
      var2 &= 3;
      return var2 == 0?var0:(var2 == 1?var1:(var2 == 2?7 - var0:7 - var1));
   }
}
