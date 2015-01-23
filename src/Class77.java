
public class Class77 {

   static Class43 aClass43_1203;
   public static short[][] aShortArrayArray1204 = new short[][]{{(short)6798, (short)107, (short)10283, (short)16, (short)4797, (short)7744, (short)5799, (short)4634, (short)-31839, (short)22433, (short)2983, (short)-11343, (short)8, (short)5281, (short)10438, (short)3650, (short)-27322, (short)-21845, (short)200, (short)571, (short)908, (short)21830, (short)28946, (short)-15701, (short)-14010}, {(short)8741, (short)12, (short)-1506, (short)-22374, (short)7735, (short)8404, (short)1701, (short)-27106, (short)24094, (short)10153, (short)-8915, (short)4783, (short)1341, (short)16578, (short)-30533, (short)25239, (short)8, (short)5281, (short)10438, (short)3650, (short)-27322, (short)-21845, (short)200, (short)571, (short)908, (short)21830, (short)28946, (short)-15701, (short)-14010}, {(short)25238, (short)8742, (short)12, (short)-1506, (short)-22374, (short)7735, (short)8404, (short)1701, (short)-27106, (short)24094, (short)10153, (short)-8915, (short)4783, (short)1341, (short)16578, (short)-30533, (short)8, (short)5281, (short)10438, (short)3650, (short)-27322, (short)-21845, (short)200, (short)571, (short)908, (short)21830, (short)28946, (short)-15701, (short)-14010}, {(short)4626, (short)11146, (short)6439, (short)12, (short)4758, (short)10270}, {(short)4550, (short)4537, (short)5681, (short)5673, (short)5790, (short)6806, (short)8076, (short)4574, (short)17050}};
   public static short[] aShortArray1205 = new short[]{(short)-10304, (short)9104, (short)-1, (short)-1, (short)-1};
   public static short[][] aShortArrayArray1206 = new short[][]{{(short)6554, (short)115, (short)10304, (short)28, (short)5702, (short)7756, (short)5681, (short)4510, (short)-31835, (short)22437, (short)2859, (short)-11339, (short)16, (short)5157, (short)10446, (short)3658, (short)-27314, (short)-21965, (short)472, (short)580, (short)784, (short)21966, (short)28950, (short)-15697, (short)-14002}, {(short)9104, (short)10275, (short)7595, (short)3610, (short)7975, (short)8526, (short)918, (short)-26734, (short)24466, (short)10145, (short)-6882, (short)5027, (short)1457, (short)16565, (short)-30545, (short)25486, (short)24, (short)5392, (short)10429, (short)3673, (short)-27335, (short)-21957, (short)192, (short)687, (short)412, (short)21821, (short)28835, (short)-15460, (short)-14019}, new short[0], new short[0], new short[0]};
   public static short[] aShortArray1208 = new short[]{(short)6798, (short)8741, (short)25238, (short)4626, (short)4550};


   static final void drawMapScenes(int var0, int xPos, int yPos, int var3, int var4, int var5) {
      int var6 = Class56.gameScene.fetchWallObjectHash(var0, xPos, yPos);
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int objectID;
      if(var6 != 0) {
         var8 = Class56.gameScene.method431(var0, xPos, yPos, var6);
         var9 = var8 >> 6 & 3;
         var7 = var8 & 31;
         var10 = var3;
         if(var6 > 0) {
            var10 = var4;
         }

         int[] pixels = Client.miniMapSprite.pixels;
         var11 = xPos * 4 + 24624 + (103 - yPos) * 2048;
         objectID = var6 >> 14 & 32767;
         ObjectDefinition objectDef = ObjectDefinition.getObjectDefForID(objectID, (byte) 0);
         if(objectDef.mapSceneID * -368925089 != -1) {
            PaletteSprite sprite = ChatMessagesContainer.mapSceneIcons[objectDef.mapSceneID * -368925089];
            if(sprite != null) {
               int var16 = (objectDef.sizeX * -1409758236 - sprite.anInt2413) / 2;
               int var17 = (objectDef.sizeY * 921357316 - sprite.anInt2414) / 2;
               sprite.drawSprite(var16 + 48 + xPos * 4, (104 - yPos - objectDef.sizeY * -1917144319) * 4 + 48 + var17);
            }
         } else {
            if(0 == var7 || 2 == var7) {
               if(var9 == 0) {
                  pixels[var11] = var10;
                  pixels[var11 + 512] = var10;
                  pixels[1024 + var11] = var10;
                  pixels[var11 + 1536] = var10;
               } else if(var9 == 1) {
                  pixels[var11] = var10;
                  pixels[var11 + 1] = var10;
                  pixels[var11 + 2] = var10;
                  pixels[3 + var11] = var10;
               } else if(2 == var9) {
                  pixels[var11 + 3] = var10;
                  pixels[512 + 3 + var11] = var10;
                  pixels[1024 + var11 + 3] = var10;
                  pixels[var11 + 3 + 1536] = var10;
               } else if(3 == var9) {
                  pixels[var11 + 1536] = var10;
                  pixels[1 + var11 + 1536] = var10;
                  pixels[2 + var11 + 1536] = var10;
                  pixels[3 + 1536 + var11] = var10;
               }
            }

            if(var7 == 3) {
               if(var9 == 0) {
                  pixels[var11] = var10;
               } else if(var9 == 1) {
                  pixels[3 + var11] = var10;
               } else if(var9 == 2) {
                  pixels[1536 + var11 + 3] = var10;
               } else if(3 == var9) {
                  pixels[var11 + 1536] = var10;
               }
            }

            if(2 == var7) {
               if(3 == var9) {
                  pixels[var11] = var10;
                  pixels[512 + var11] = var10;
                  pixels[var11 + 1024] = var10;
                  pixels[var11 + 1536] = var10;
               } else if(var9 == 0) {
                  pixels[var11] = var10;
                  pixels[1 + var11] = var10;
                  pixels[var11 + 2] = var10;
                  pixels[var11 + 3] = var10;
               } else if(1 == var9) {
                  pixels[var11 + 3] = var10;
                  pixels[var11 + 3 + 512] = var10;
                  pixels[1024 + var11 + 3] = var10;
                  pixels[var11 + 3 + 1536] = var10;
               } else if(var9 == 2) {
                  pixels[var11 + 1536] = var10;
                  pixels[1 + var11 + 1536] = var10;
                  pixels[var11 + 1536 + 2] = var10;
                  pixels[3 + 1536 + var11] = var10;
               }
            }
         }
      }

      var6 = Class56.gameScene.fetchTileInteractableHash(var0, xPos, yPos);
      if(0 != var6) {
         var8 = Class56.gameScene.method431(var0, xPos, yPos, var6);
         var9 = var8 >> 6 & 3;
         var7 = var8 & 31;
         var10 = var6 >> 14 & 32767;
         ObjectDefinition objectDef = ObjectDefinition.getObjectDefForID(var10, (byte) 0);
         int var22;
         if(-1 != objectDef.mapSceneID * -368925089) {
            PaletteSprite sprite = ChatMessagesContainer.mapSceneIcons[objectDef.mapSceneID * -368925089];
            if(sprite != null) {
               int xOFf = (objectDef.sizeX * -1409758236 - sprite.anInt2413) / 2;
               int yOff = (objectDef.sizeY * 921357316 - sprite.anInt2414) / 2;
               sprite.drawSprite(xOFf + xPos * 4 + 48, (104 - yPos - objectDef.sizeY * -1917144319) * 4 + 48 + yOff);
            }
         } else if(9 == var7) {
            var11 = 15658734;
            if(var6 > 0) {
               var11 = 15597568;
            }

            int[] var21 = Client.miniMapSprite.pixels;
            var22 = (103 - yPos) * 2048 + xPos * 4 + 24624;
            if(var9 != 0 && var9 != 2) {
               var21[var22] = var11;
               var21[var22 + 512 + 1] = var11;
               var21[var22 + 1024 + 2] = var11;
               var21[var22 + 1536 + 3] = var11;
            } else {
               var21[var22 + 1536] = var11;
               var21[1024 + var22 + 1] = var11;
               var21[var22 + 512 + 2] = var11;
               var21[var22 + 3] = var11;
            }
         }
      }

      var6 = Class56.gameScene.fetchGroundTileDecorationHash(var0, xPos, yPos);
      if(var6 != 0) {
         var8 = var6 >> 14 & 32767;
         ObjectDefinition var19 = ObjectDefinition.getObjectDefForID(var8, (byte) 0);
         if(-1 != var19.mapSceneID * -368925089) {
            PaletteSprite var18 = ChatMessagesContainer.mapSceneIcons[var19.mapSceneID * -368925089];
            if(null != var18) {
               var10 = (var19.sizeX * -1409758236 - var18.anInt2413) / 2;
               int var24 = (var19.sizeY * 921357316 - var18.anInt2414) / 2;
               var18.drawSprite(xPos * 4 + 48 + var10, var24 + (104 - yPos - var19.sizeY * -1917144319) * 4 + 48);
            }
         }
      }
   }

   Class77() throws Throwable {
      throw new Error();
   }

}
