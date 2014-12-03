import java.util.Calendar;

public class Class5 {

   static Calendar aCalendar76 = Calendar.getInstance();
   static int[] anIntArray77 = new int[5];
   static int[][] anIntArrayArray78 = new int[5][5000];
   static int[] intStack = new int[1000];
   static String[] stringStack = new String[1000];
   static int anInt81 = 0;
   static Class51[] aClass51Array82 = new Class51[50];
   static PaletteSprite[] aClass108_Sub20_Sub15_Sub2Array83;
   static String[] dateString = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   static RGBSprite[] headPrayerSprites;
   static final int anInt86 = 200000;
   static final int anInt87 = 43;
   static final int anInt88 = 28;


   public static void method92(int interID, int var1) {
      if(-1 != interID) {
         if(RSInterface.interfacesLoadedArray[interID]) {
            RSInterface.interfaceIndexReference.method1026(interID, (byte)70);
            if(null != RSInterface.interface_cache[interID]) {
               boolean var3 = true;

               for(int componentID = 0; componentID < RSInterface.interface_cache[interID].length; ++componentID) {
                  if(null != RSInterface.interface_cache[interID][componentID]) {
                     if(RSInterface.interface_cache[interID][componentID].componentType * 942877543 != 2) {
                        RSInterface.interface_cache[interID][componentID] = null;
                     } else {
                        var3 = false;
                     }
                  }
               }

               if(var3) {
                  RSInterface.interface_cache[interID] = null;
               }

               RSInterface.interfacesLoadedArray[interID] = false;
            }
         }
      }
   }

   Class5() throws Throwable {
      throw new Error();
   }

   public static void method98(int var0) {
      Class108_Sub20_Sub2.aClass106_1955.method1371();
   }

   static PaletteSprite method99(AbstractIndex var0, int var1, int var2, byte var3) {
      return !Class108_Sub11.method1686(var0, var1, var2, -1425645056)?null:Class37.getLastLoadedPaletteSprite(1969691175);
   }

   public static final RGBSprite getItemSprite(int itemID, int amount, int var2, int var3, boolean exist, int var5) {
      long itemHash = ((long)var3 << 40) + ((long)var2 << 38) + (long)itemID + ((long)amount << 16);
      RGBSprite cachedSprite;
      if(!exist) {
         cachedSprite = (RGBSprite) ItemDefinition.itemSpriteMap.get(itemHash);
         if(cachedSprite != null) {
            return cachedSprite;
         }
      }

      ItemDefinition itemDef = AnimationDefinition.getItemDefinition(itemID, -221675425);
      if(amount > 1 && null != itemDef.countObj) {
         int countChangeID = -1;

         for(int amountIndex = 0; amountIndex < 10; ++amountIndex) {
            if(amount >= itemDef.countCo[amountIndex] && 0 != itemDef.countCo[amountIndex]) {
               countChangeID = itemDef.countObj[amountIndex];
            }
         }

         if(countChangeID != -1) {
            itemDef = AnimationDefinition.getItemDefinition(countChangeID, -1934683345);
         }
      }

      ModelRasterizer modelRasterizer = itemDef.renderItem(1, (byte)24);
      if(null == modelRasterizer) {
         return null;
      } else {
         RGBSprite sprite = null;
         if(-1 != itemDef.certTemplate * -910205763) {
            sprite = getItemSprite(itemDef.certLink * -616959653, 10, 1, 0, true, -944989678);
            if(null == sprite) {
               return null;
            }
         }

         int[] pixels = Rasterizer2D.renderPixels;
         int width = Rasterizer2D.width;
         int height = Rasterizer2D.height;
         int[] var18 = new int[4];
         Rasterizer2D.method2498(var18);
         cachedSprite = new RGBSprite(36, 32);
         Rasterizer2D.copySprite(cachedSprite.pixels, 36, 32);
         Rasterizer2D.resetPixels();
         Rasterizer3D.method2970();
         Rasterizer3D.method2926(16, 16);
         Rasterizer3D.aBool2518 = false;
         int zoom = itemDef.zoom2d * 609600173;
         if(exist) {
            zoom = (int)(1.5D * (double)zoom);
         } else if(var2 == 2) {
            zoom = (int)((double)zoom * 1.04D);
         }

         int var12 = Rasterizer3D.SINE[itemDef.xan2d * 36515425] * zoom >> 16;
         int var19 = zoom * Rasterizer3D.COSINE[itemDef.xan2d * 36515425] >> 16;
         modelRasterizer.method2855();
         modelRasterizer.method2916(0, itemDef.yan2d * 1922730437, itemDef.zan2d * 1605145061, itemDef.xan2d * 36515425, itemDef.xOffset2d * 1578900673, var12 + modelRasterizer.modelHeight * 782517621 / 2 + itemDef.yOffset2d * 1336895047, itemDef.yOffset2d * 1336895047 + var19);
         if(var2 >= 1) {
            cachedSprite.setPixels(1);
         }

         if(var2 >= 2) {
            cachedSprite.setPixels(16777215);
         }

         if(var3 != 0) {
            cachedSprite.method2814(var3);
         }

         Rasterizer2D.copySprite(cachedSprite.pixels, 36, 32);
         if(-1 != itemDef.certTemplate * -910205763) {
            sprite.method2746(0, 0);
         }

         if(!exist && (itemDef.stackable * 1548462817 == 1 || amount != 1) && -1 != amount) {
            RSFont var14 = ItemDefinition.itemAmountFont;
            String amountString;
            if(amount < 100000) {
               amountString = "<col=ffff00>" + amount + "</col>";
            } else if(amount < 10000000) {
               amountString = "<col=ffffff>" + amount / 1000 + StringConstants.ITEM_AMOUNT_K + "</col>";
            } else {
               amountString = "<col=00ff80>" + amount / 1000000 + StringConstants.ITEM_AMOUNT_M + "</col>";
            }

            var14.drawString(amountString, 0, 9, 16776960, 1);
         }

         if(!exist) {
            ItemDefinition.itemSpriteMap.put(cachedSprite, itemHash);
         }

         Rasterizer2D.copySprite(pixels, width, height);
         Rasterizer2D.method2551(var18);
         Rasterizer3D.method2970();
         Rasterizer3D.aBool2518 = true;
         return cachedSprite;
      }
   }

   static final void method102(String var0, int var1) {
      if(!var0.equals("")) {
         Client.secureBuffer.writePacket(107);
         Client.secureBuffer.writeByte(Class108_Sub20_Sub3.method2069(var0, (byte) 64));
         Client.secureBuffer.writeString(var0);
      }
   }

   static void method103(World var0, int var1) {
      if(var0.method639(-1669724324) != Client.aBool2710) {
         Client.aBool2710 = var0.method639(-1193505850);
         VertexNormal.method694(var0.method639(-1746405503), 39533622);
      }

      Applet_Sub1.aString2701 = var0.aString561;
      Client.worldID = var0.anInt569 * 773395199;
      Client.worldType = var0.anInt558 * -1835330739;
      Client.anInt2742 = -186785803 * (0 == Client.anInt2708 * -759629273?'\uaa4a':'\u9c40' + var0.anInt569 * -1443760287);
      Class26.anInt351 = (0 == Client.anInt2708 * -759629273?443:var0.anInt569 * -1443760287 + '\uc350') * 1733308657;
      IndexTable.anInt790 = Client.anInt2742 * 130259471;
   }
}
