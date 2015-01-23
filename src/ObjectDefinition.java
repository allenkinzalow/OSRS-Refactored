import java.awt.Graphics;

public class ObjectDefinition extends CacheableNode {

   short[] retextureToFind;
   static AbstractIndex aClass74_2066;
   static AbstractIndex aClass74_2067;
   static CacheableNodeMap objectDefMap = new CacheableNodeMap(64);
   public int anInt2069 = -1652411312;
   boolean isSolid = false;
   static CacheableNodeMap objectRasterizerMap = new CacheableNodeMap(30);
   static RSModel[] modelParts = new RSModel[4];
   public String name = "null";
   int[] objectModels;
   int[] objectTypes;
   public static CacheableNodeMap objectModelCache = new CacheableNodeMap(500);
   short[] recolorToFind;
   public int mapIconID = 372177979;
   static CacheableNodeMap aClass106_2079 = new CacheableNodeMap(30);
   short[] textureToReplace;
   public int sizeX = 160821065;
   public int sizeY = 1617841409;
   public int anInt2083 = 0;
   public int[] anIntArray2084;
   int offsetX = 0;
   static boolean aBool2086 = false;
   boolean nonFlatShading = false;
   public int anInt2088 = -1212747031;
   public int animationID = 706875959;
   int varpID = -155117661;
   int ambient = 0;
   int contrast = 0;
   public String[] actions = new String[5];
   public int anInt2094 = 385819046;
   public int mapSceneID = 1833486945;
   short[] recolorToReplace;
   public boolean aBool2097 = true;
   int modelSizeX = 1552764032;
   int modelSizeHeight = 636925568;
   int modelSizeY = 408014720;
   public int objectID;
   int offsetHeight = 0;
   int offsetY = 0;
   public boolean aBool2104 = false;
   int anInt2105 = 359794785;
   public int anInt2106 = -1443463903;
   public int[] configChangeDest;
   boolean aBool2108 = false;
   int configId = -1070845109;
   public int anInt2110 = 2019882883;
   public boolean aBool2111 = false;
   public int anInt2112 = 0;
   public int anInt2113 = 0;
   public boolean aBool2114 = true;
   static RSFont p12_full_font;

   public static ObjectDefinition getObjectDefForID(int objectID, byte var1) {
       ObjectDefinition objectDef = (ObjectDefinition) objectDefMap.get((long) objectID);
       if (objectDef != null) {
           return objectDef;
       } else {
           byte[] objectData = aClass74_2066.getFile(6, objectID, (byte) 7);
           objectDef = new ObjectDefinition();
           objectDef.objectID = objectID * -743597329;
           if (null != objectData) {
               objectDef.decode(new RSByteBuffer(objectData), (byte) 79);
           }

           objectDef.method2174(1656964186);
           if (objectDef.isSolid) {
               objectDef.anInt2094 = 0;
               objectDef.aBool2114 = false;
           }

           objectDefMap.put(objectDef, (long) objectID);
           return objectDef;
       }
   }


   void method2174(int var1) {
      if(this.anInt2088 * 619772583 == -1) {
         this.anInt2088 = 0;
         if(this.objectModels != null && (this.objectTypes == null || this.objectTypes[0] == 10)) {
            this.anInt2088 = 1212747031;
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            if(this.actions[var2] != null) {
               this.anInt2088 = 1212747031;
            }
         }
      }

      if(-1 == this.anInt2106 * -1988445921) {
         this.anInt2106 = 1443463903 * (0 != this.anInt2094 * 795821915?1:0);
      }
   }

   void readValues(RSByteBuffer buffer, int opcode, byte var3) {
      int length;
      int index;
      if(1 == opcode) {
         length = buffer.readUByte();
         if(length > 0) {
            if(this.objectModels != null && !aBool2086) {
               buffer.position += length * 1613894433;
            } else {
               this.objectTypes = new int[length];
               this.objectModels = new int[length];

               for(index = 0; index < length; ++index) {
                  this.objectModels[index] = buffer.readUShort(30093367);
                  this.objectTypes[index] = buffer.readUByte();
               }

            }
         }
      } else if(opcode == 2) {
         this.name = buffer.getString_2((byte)8);
      } else if(opcode == 5) {
         length = buffer.readUByte();
         if(length > 0) {
            if(this.objectModels != null && !aBool2086) {
               buffer.position += length * 1075929622;
            } else {
               this.objectTypes = null;
               this.objectModels = new int[length];

               for(index = 0; index < length; ++index) {
                  this.objectModels[index] = buffer.readUShort(111457044);
               }

            }
         }
      } else if(opcode == 14) {
         this.sizeX = buffer.readUByte() * 160821065;
      } else if(15 == opcode) {
         this.sizeY = buffer.readUByte() * 1617841409;
      } else if(opcode == 17) {
         this.anInt2094 = 0;
         this.aBool2114 = false;
      } else if(opcode == 18) {
         this.aBool2114 = false;
      } else if(opcode == 19) {
         this.anInt2088 = buffer.readUByte() * 1212747031;
      } else if(opcode == 21) {
         this.anInt2105 = 0;
      } else if(22 == opcode) {
         this.nonFlatShading = true;
      } else if(opcode == 23) {
         this.aBool2111 = true;
      } else if(24 == opcode) {
         this.animationID = buffer.readUShort(-2015425395) * -706875959;
         if(this.animationID * -2061255559 == '\uffff') {
            this.animationID = 706875959;
         }
      } else if(opcode == 27) {
         this.anInt2094 = 192909523;
      } else if(opcode == 28) {
         this.anInt2069 = buffer.readUByte() * -1177017531;
      } else if(opcode == 29) {
         this.ambient = buffer.readByte() * 1258891821; 
      } else if(opcode == 39) {
         this.contrast = buffer.readByte() * 1640621175;
      } else if(opcode >= 30 && opcode < 35) {
         this.actions[opcode - 30] = buffer.getString_2((byte)8);
         if(this.actions[opcode - 30].equalsIgnoreCase(StringUtilities.hidden)) {
            this.actions[opcode - 30] = null;
         }
      } else if(opcode == 40) {
         length = buffer.readUByte();
         this.recolorToFind = new short[length];
         this.recolorToReplace = new short[length];

         for(index = 0; index < length; ++index) {
            this.recolorToFind[index] = (short)buffer.readUShort(-109183735);
            this.recolorToReplace[index] = (short)buffer.readUShort(-1115671999);
         }

      } else if(opcode == 41) {
         length = buffer.readUByte();
         this.retextureToFind = new short[length];
         this.textureToReplace = new short[length];

         for(index = 0; index < length; ++index) {
            this.retextureToFind[index] = (short)buffer.readUShort(-664605432);
            this.textureToReplace[index] = (short)buffer.readUShort(1934273499);
         }

      } else if(opcode == 60) {
         this.mapIconID = buffer.readUShort(143333498) * -372177979;
      } else if(62 == opcode) {
         this.aBool2108 = true;
      } else if(opcode == 64) {
         this.aBool2097 = false;
      } else if(opcode == 65) {
         this.modelSizeX = buffer.readUShort(-715197571) * -256304487;
      } else if(opcode == 66) {
         this.modelSizeHeight = buffer.readUShort(-474218959) * -263459475;
      } else if(67 == opcode) {
         this.modelSizeY = buffer.readUShort(1930440634) * 741385119;
      } else if(opcode == 68) {
         this.mapSceneID = buffer.readUShort(-1155524686) * -1833486945;
      } else if(opcode == 69) {
         buffer.readUByte();
      } else if(70 == opcode) {
         this.offsetX = buffer.method1721(1809603362) * -1391406571;
      } else if(opcode == 71) {
         this.offsetHeight = buffer.method1721(2099914280) * 1514348897;
      } else if(opcode == 72) {
         this.offsetY = buffer.method1721(157392555) * 1774538351;
      } else if(73 == opcode) {
         this.aBool2104 = true;
      } else if(74 == opcode) {
         this.isSolid = true;
      } else if(opcode == 75) {
         this.anInt2106 = buffer.readUByte() * 1443463903;
      } else if(opcode == 77) {
         this.varpID = buffer.readUShort(-1916310180) * 155117661;
         if(this.varpID * 1083452405 == '\uffff') {
            this.varpID = -155117661;
         }

         this.configId = buffer.readUShort(12300167) * 1070845109;
         if(this.configId * 436978077 == '\uffff') {
            this.configId = -1070845109;
         }

         length = buffer.readUByte();
         this.configChangeDest = new int[length + 1];

         for(index = 0; index <= length; ++index) {
            this.configChangeDest[index] = buffer.readUShort(1213113923);
            if('\uffff' == this.configChangeDest[index]) {
               this.configChangeDest[index] = -1;
            }
         }

      } else if(opcode == 78) {
         this.anInt2110 = buffer.readUShort(1769393296) * -2019882883;
         this.anInt2083 = buffer.readUByte() * 1809952891;
      } else if(opcode != 79) {
         if(opcode == 81) {
            this.anInt2105 = buffer.readUByte() * -1913151744;
         }
      } else {
         this.anInt2112 = buffer.readUShort(2115200290) * 794753593;
         this.anInt2113 = buffer.readUShort(2144895569) * 1040365161;
         this.anInt2083 = buffer.readUByte() * 1809952891;
         length = buffer.readUByte();
         this.anIntArray2084 = new int[length];

         for(index = 0; index < length; ++index) {
            this.anIntArray2084[index] = buffer.readUShort(-1591880095);
         }

      }
   }

   public final ModelRasterizer getModelRasterizer(int var1, int var2, int[][] var3, int var4, int var5, int var6, AnimationDefinition var7, int var8, byte var9) {
      long var11;
      if(null == this.objectTypes) {
         var11 = (long)((this.objectID * 1809503247 << 10) + var2);
      } else {
         var11 = (long)(var2 + (var1 << 3) + (this.objectID * 1809503247 << 10));
      }

      ModelRasterizer rasterizer = (ModelRasterizer)objectRasterizerMap.get(var11);
      if(null == rasterizer) {
         RSModel model = this.getModel(var1, var2);
         if(model == null) {
            return null;
         }

         rasterizer = model.createModelRasterizer(this.ambient * 1931392421 + 64, 768 + this.contrast * 1677734895, -50, -10, -50);
         objectRasterizerMap.put(rasterizer, var11);
      }

      if(var7 == null && -1 == this.anInt2105 * -1274452897) {
         return rasterizer;
      } else {
         if(var7 != null) {
            rasterizer = var7.method2235(rasterizer, var8, var2, -1782676945);
         } else {
            rasterizer = rasterizer.method2852(true);
         }

         if(this.anInt2105 * -1274452897 >= 0) {
            rasterizer = rasterizer.method2890(var3, var4, var5, var6, false, this.anInt2105 * -1274452897);
         }

         return rasterizer;
      }
   }

   public final boolean method2178(byte var1) {
      if(this.objectModels == null) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.objectModels.length; ++var3) {
            var2 &= aClass74_2067.containsFile(this.objectModels[var3] & '\uffff', 0, 1151584293);
         }

         return var2;
      }
   }

   public final Renderable method2179(int var1, int var2, int[][] var3, int var4, int var5, int var6, byte var7) {
      long var8;
      if(null == this.objectTypes) {
         var8 = (long)(var2 + (this.objectID * 1809503247 << 10));
      } else {
         var8 = (long)(var2 + (this.objectID * 1809503247 << 10) + (var1 << 3));
      }

      Object var10 = (Renderable)aClass106_2079.get(var8);
      if(var10 == null) {
         RSModel var11 = this.getModel(var1, var2);
         if(var11 == null) {
            return null;
         }

         if(!this.nonFlatShading) {
            var10 = var11.createModelRasterizer(64 + this.ambient * 1931392421, 768 + this.contrast * 1677734895, -50, -10, -50);
         } else {
            var11.aShort2565 = (short)(this.ambient * 1931392421 + 64);
            var11.aShort2589 = (short)(this.contrast * 1677734895 + 768);
            var11.method3008();
            var10 = var11;
         }

         aClass106_2079.put((CacheableNode)var10, var8);
      }

      if(this.nonFlatShading) {
         var10 = ((RSModel)var10).method2996();
      }

      if(this.anInt2105 * -1274452897 >= 0) {
         if(var10 instanceof ModelRasterizer) {
            var10 = ((ModelRasterizer)var10).method2890(var3, var4, var5, var6, true, this.anInt2105 * -1274452897);
         } else if(var10 instanceof RSModel) {
            var10 = ((RSModel)var10).method3043(var3, var4, var5, var6, true, this.anInt2105 * -1274452897);
         }
      }

      return (Renderable)var10;
   }

   public final ModelRasterizer method2180(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
      long var8;
      if(this.objectTypes != null) {
         var8 = (long)((var1 << 3) + (this.objectID * 1809503247 << 10) + var2);
      } else {
         var8 = (long)(var2 + (this.objectID * 1809503247 << 10));
      }

      ModelRasterizer var11 = (ModelRasterizer)objectRasterizerMap.get(var8);
      if(null == var11) {
         RSModel var10 = this.getModel(var1, var2);
         if(var10 == null) {
            return null;
         }

         var11 = var10.createModelRasterizer(this.ambient * 1931392421 + 64, this.contrast * 1677734895 + 768, -50, -10, -50);
         objectRasterizerMap.put(var11, var8);
      }

      if(this.anInt2105 * -1274452897 >= 0) {
         var11 = var11.method2890(var3, var4, var5, var6, true, this.anInt2105 * -1274452897);
      }

      return var11;
   }

   public final boolean method2183(int var1, int var2) {
      if(this.objectTypes != null) {
         for(int var5 = 0; var5 < this.objectTypes.length; ++var5) {
            if(var1 == this.objectTypes[var5]) {
               return aClass74_2067.containsFile(this.objectModels[var5] & '\uffff', 0, 1151584293);
            }
         }

         return true;
      } else if(null == this.objectModels) {
         return true;
      } else if(10 != var1) {
         return true;
      } else {
         boolean var3 = true;

         for(int var4 = 0; var4 < this.objectModels.length; ++var4) {
            var3 &= aClass74_2067.containsFile(this.objectModels[var4] & '\uffff', 0, 1151584293);
         }

         return var3;
      }
   }

   public final ObjectDefinition getDefinitionForStatus(byte var1) {
      int var2 = -1;
      if(this.varpID * 1083452405 != -1) {
         var2 = BuildType.method1094(this.varpID * 1083452405, -511913587);
      } else if(this.configId * 436978077 != -1) {
         var2 = Class88.configSettings[this.configId * 436978077];
      }

      return var2 >= 0 && var2 < this.configChangeDest.length && -1 != this.configChangeDest[var2] ? 
    		  getObjectDefForID(this.configChangeDest[var2], (byte) 0) : null;
   }

   void decode(RSByteBuffer buffer, byte var2) {
      while(true) {
         int opcode = buffer.readUByte();
         if(opcode == 0) {
            return;
         }

         this.readValues(buffer, opcode, (byte)26);
      }
   }

   public static void method2199() {
      OverlayFloorDefinition.overlayFloorMap.clearCacheMap();
   }

   public boolean method2206() {
      if(null == this.configChangeDest) {
         return -1 != this.anInt2110 * 849129685 || null != this.anIntArray2084;
      } else {
         for(int var2 = 0; var2 < this.configChangeDest.length; ++var2) {
            if(this.configChangeDest[var2] != -1) {
               ObjectDefinition var3 = getObjectDefForID(this.configChangeDest[var2], (byte) 0);
               if(var3.anInt2110 * 849129685 != -1 || null != var3.anIntArray2084) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   final RSModel getModel(int type, int face) {
      RSModel model = null;
      int modelID;
      boolean var7;
      int modelLength;
      if(this.objectTypes == null) {
         if(type != 10) {
            return null;
         }

         if(this.objectModels == null) {
            return null;
         }

         var7 = this.aBool2108;
         if(2 == type && face > 3) {
            var7 = !var7;
         }

         modelLength = this.objectModels.length;

         for(int modelIndex = 0; modelIndex < modelLength; ++modelIndex) {
            modelID = this.objectModels[modelIndex];
            if(var7) {
               modelID += 65536;
            }

            model = (RSModel)objectModelCache.get((long)modelID);
            if(null == model) {
               model = RSModel.decodeModel(aClass74_2067, modelID & '\uffff', 0);
               if(model == null) {
                  return null;
               }

               if(var7) {
                  model.mirrorModel();
               }

               objectModelCache.put(model, (long)modelID);
            }

            if(modelLength > 1) {
               modelParts[modelIndex] = model;
            }
         }

         if(modelLength > 1) {
            model = new RSModel(modelParts, modelLength);
         }
      } else {
         int modelCount = -1;

         for(modelLength = 0; modelLength < this.objectTypes.length; ++modelLength) {
            if(this.objectTypes[modelLength] == type) {
               modelCount = modelLength;
               break;
            }
         }

         if(modelCount == -1) {
            return null;
         }

         modelLength = this.objectModels[modelCount];
         boolean mirror = this.aBool2108 ^ face > 3;
         if(mirror) {
            modelLength += 65536;
         }

         model = (RSModel)objectModelCache.get((long)modelLength);
         if(model == null) {
            model = RSModel.decodeModel(aClass74_2067, modelLength & '\uffff', 0);
            if(model == null) {
               return null;
            }

            if(mirror) {
               model.mirrorModel();
            }

            objectModelCache.put(model, (long)modelLength);
         }
      }

      if(this.modelSizeX * -718759511 == 128 && 128 == this.modelSizeHeight * -163044251 && 128 == this.modelSizeY * -184043425) {
         var7 = false;
      } else {
         var7 = true;
      }

      boolean var12;
      if(0 == this.offsetX * -987796163 && this.offsetHeight * -1018346847 == 0 && this.offsetY * -849227633 == 0) {
         var12 = false;
      } else {
         var12 = true;
      }

      RSModel modifiedModel = new RSModel(model, face == 0 && !var7 && !var12, this.recolorToFind == null, null == this.retextureToFind, true);
      if(type == 4 && face > 3) {
         modifiedModel.method2999(256);
         modifiedModel.translate(45, 0, -45);
      }

      face &= 3;
      if(face == 1) {
         modifiedModel.method3038();
      } else if(face == 2) {
         modifiedModel.method3028();
      } else if(face == 3) {
         modifiedModel.method3001();
      }

      if(null != this.recolorToFind) {
         for(modelID = 0; modelID < this.recolorToFind.length; ++modelID) {
            modifiedModel.findReplaceColor(this.recolorToFind[modelID], this.recolorToReplace[modelID]);
         }
      }

      if(null != this.retextureToFind) {
         for(modelID = 0; modelID < this.retextureToFind.length; ++modelID) {
            modifiedModel.findReplaceTexture(this.retextureToFind[modelID], this.textureToReplace[modelID]);
         }
      }

      if(var7) {
         modifiedModel.resizeModel(this.modelSizeX * -718759511, this.modelSizeHeight * -163044251, this.modelSizeY * -184043425);
      }

      if(var12) {
         modifiedModel.translate(this.offsetX * -987796163, this.offsetHeight * -1018346847, this.offsetY * -849227633);
      }

      return modifiedModel;
   }

   static void renderLoginAndWorldList(RSFont b12_full, RSFont p11_full, int var2) {
      byte var3;
      int var6;
      int passwordLength;
      int charIndex;
      short var22;
      short var24;
      short var25;
      int var26;
      int var29;
      int var30;
      int pinLength;
      int var39;
      Graphics var40;
      int var41;
      if(Class4.worldListOpen) {
         if(World.worldBackSprites == null) {
            World.worldBackSprites = RGBSprite.loadRGBSpriteSetForNames(Class23.spriteIndex, "sl_back", "", (short) 10222);
         }

         if(null == World.worldFlagSprites) {
            World.worldFlagSprites = PaletteSprite.loadPaletteSpriteSet(Class23.spriteIndex, "sl_flags", "", (byte) -85);
         }

         if(null == RuntimeException_Sub1.worldSortArrowSprites) {
            RuntimeException_Sub1.worldSortArrowSprites = PaletteSprite.loadPaletteSpriteSet(Class23.spriteIndex, "sl_arrows", "", (byte) -42);
         }

         if(null == KeyFocusListener.worldTypeSprites) {
            KeyFocusListener.worldTypeSprites = PaletteSprite.loadPaletteSpriteSet(Class23.spriteIndex, "sl_stars", "", (byte) -111);
         }

         Rasterizer2D.drawFilledRectangle(0, 23, 765, 480, 0);
         Rasterizer2D.method2503(0, 0, 125, 23, 12425273, 9135624);
         Rasterizer2D.method2503(125, 0, 640, 23, 5197647, 2697513);
         b12_full.drawStringCenter(StringUtilities.SELECT_WORLD, 62, 15, 0, -1);
         if(KeyFocusListener.worldTypeSprites != null) {
            KeyFocusListener.worldTypeSprites[1].drawSprite(140, 1);
            p11_full.drawString(StringUtilities.MEMBERS_WORLD, 152, 10, 16777215, -1);
            KeyFocusListener.worldTypeSprites[0].drawSprite(140, 12);
            p11_full.drawString(StringUtilities.FREE_WORLD, 152, 21, 16777215, -1);
         }

         if(RuntimeException_Sub1.worldSortArrowSprites != null) {
            var22 = 280;
            if(Class4.anIntArray56[0] == 0 && 0 == Class4.anIntArray63[0]) {
               RuntimeException_Sub1.worldSortArrowSprites[2].drawSprite(var22, 4);
            } else {
               RuntimeException_Sub1.worldSortArrowSprites[0].drawSprite(var22, 4);
            }

            if(0 == Class4.anIntArray56[0] && 1 == Class4.anIntArray63[0]) {
               RuntimeException_Sub1.worldSortArrowSprites[3].drawSprite(15 + var22, 4);
            } else {
               RuntimeException_Sub1.worldSortArrowSprites[1].drawSprite(var22 + 15, 4);
            }

            b12_full.drawString(StringUtilities.WORLD_ID, 32 + var22, 17, 16777215, -1);
            var24 = 390;
            if(1 == Class4.anIntArray56[0] && 0 == Class4.anIntArray63[0]) {
               RuntimeException_Sub1.worldSortArrowSprites[2].drawSprite(var24, 4);
            } else {
               RuntimeException_Sub1.worldSortArrowSprites[0].drawSprite(var24, 4);
            }

            if(Class4.anIntArray56[0] == 1 && Class4.anIntArray63[0] == 1) {
               RuntimeException_Sub1.worldSortArrowSprites[3].drawSprite(15 + var24, 4);
            } else {
               RuntimeException_Sub1.worldSortArrowSprites[1].drawSprite(15 + var24, 4);
            }

            b12_full.drawString(StringUtilities.WORLD_PLAYERS, var24 + 32, 17, 16777215, -1);
            var25 = 500;
            if(2 == Class4.anIntArray56[0] && Class4.anIntArray63[0] == 0) {
               RuntimeException_Sub1.worldSortArrowSprites[2].drawSprite(var25, 4);
            } else {
               RuntimeException_Sub1.worldSortArrowSprites[0].drawSprite(var25, 4);
            }

            if(Class4.anIntArray56[0] == 2 && Class4.anIntArray63[0] == 1) {
               RuntimeException_Sub1.worldSortArrowSprites[3].drawSprite(15 + var25, 4);
            } else {
               RuntimeException_Sub1.worldSortArrowSprites[1].drawSprite(15 + var25, 4);
            }

            b12_full.drawString(StringUtilities.WORLD_LOCATION, var25 + 32, 17, 16777215, -1);
            short xOffset = 610;
            if(3 == Class4.anIntArray56[0] && Class4.anIntArray63[0] == 0) {
               RuntimeException_Sub1.worldSortArrowSprites[2].drawSprite(xOffset, 4);
            } else {
               RuntimeException_Sub1.worldSortArrowSprites[0].drawSprite(xOffset, 4);
            }

            if(Class4.anIntArray56[0] == 3 && 1 == Class4.anIntArray63[0]) {
               RuntimeException_Sub1.worldSortArrowSprites[3].drawSprite(15 + xOffset, 4);
            } else {
               RuntimeException_Sub1.worldSortArrowSprites[1].drawSprite(15 + xOffset, 4);
            }

            b12_full.drawString(StringUtilities.WORLD_TYPE, 32 + xOffset, 17, 16777215, -1);
         }

         Rasterizer2D.drawFilledRectangle(708, 4, 50, 16, 0);
         p11_full.drawStringCenter(StringUtilities.CANCEL_OPTION, 733, 16, 16777215, -1);
         Class4.hoveredWorldID = 2115622661;
         if(null != World.worldBackSprites) {
            var3 = 88;
            byte var34 = 19;
            var26 = 765 / (1 + var3);
            var6 = 480 / (1 + var34);

            do {
               do {
                  var29 = var6;
                  var30 = var26;
                  if(var6 * (var26 - 1) >= Class4.worldCount * 301546367) {
                     --var26;
                  }

                  if(var26 * (var6 - 1) >= Class4.worldCount * 301546367) {
                     --var6;
                  }

                  if(var26 * (var6 - 1) >= Class4.worldCount * 301546367) {
                     --var6;
                  }
               } while(var29 != var6);
            } while(var26 != var30);

            var29 = (765 - var3 * var26) / (var26 + 1);
            if(var29 > 5) {
               var29 = 5;
            }

            var30 = (480 - var34 * var6) / (1 + var6);
            if(var30 > 5) {
               var30 = 5;
            }

            int xOffset = (765 - var26 * var3 - var29 * (var26 - 1)) / 2;
            int yOffset = (480 - var6 * var34 - var30 * (var6 - 1)) / 2;
            int yPos = 23 + yOffset;
            int xPos = xOffset;
            charIndex = 0;
            boolean hovering = false;

            int worldID;
            for(worldID = 0; worldID < Class4.worldCount * 301546367; ++worldID) {
               World world = Class4.worldList[worldID];
               boolean canHover = true;
               String playerCount = Integer.toString(world.playerCount * 649230499);
               if(world.playerCount * 649230499 == -1) {
                  playerCount = StringUtilities.WORLD_OFF;
                  canHover = false;
               } else if(world.playerCount * 649230499 > 1980) {
                  playerCount = StringUtilities.WORLD_FULL;
                  canHover = false;
               }

               byte worldBackSpriteID;
               if(world.method640(-407301246)) {
                  if(world.method639(-1905877036)) {
                     worldBackSpriteID = 3;
                  } else {
                     worldBackSpriteID = 2;
                  }
               } else if(world.method639(-2089505657)) {
                  worldBackSpriteID = 1;
               } else {
                  worldBackSpriteID = 0;
               }

               if(MouseInputHandler.mouseX * -367052265 >= xPos && MouseInputHandler.mouseY * 1533395117 >= yPos && MouseInputHandler.mouseX * -367052265 < var3 + xPos && MouseInputHandler.mouseY * 1533395117 < var34 + yPos && canHover) {
                  Class4.hoveredWorldID = worldID * -2115622661;
                  World.worldBackSprites[worldBackSpriteID].drawSpriteAlpha(xPos, yPos, 128, 16777215);
                  hovering = true;
               } else {
                  World.worldBackSprites[worldBackSpriteID].drawSprite(xPos, yPos);
               }

               if(null != World.worldFlagSprites) {
                  World.worldFlagSprites[(world.method639(-2142516703) ? 8 : 0) + world.flagID * -2114773551].drawSprite(29 + xPos, yPos);
               }

               b12_full.drawStringCenter(Integer.toString(world.anInt569 * -1443760287), xPos + 15, 5 + var34 / 2 + yPos, 0, -1);
               p11_full.drawStringCenter(playerCount, 60 + xPos, 5 + yPos + var34 / 2, 268435455, -1);
               yPos += var30 + var34;
               ++charIndex;
               if(charIndex >= var6) {
                  yPos = 23 + yOffset;
                  xPos += var29 + var3;
                  charIndex = 0;
               }
            }

            if(hovering) {
               worldID = p11_full.getTextWidth(Class4.worldList[Class4.hoveredWorldID * -202005965].tooltip) + 6;
               int var42 = 8 + p11_full.anInt2643;
               Rasterizer2D.drawFilledRectangle(MouseInputHandler.mouseX * -367052265 - worldID / 2, 5 + 20 + MouseInputHandler.mouseY * 1533395117, worldID, var42, 16777120);
               Rasterizer2D.drawUnfilledRectangle(MouseInputHandler.mouseX * -367052265 - worldID / 2, MouseInputHandler.mouseY * 1533395117 + 20 + 5, worldID, var42, 0);
               p11_full.drawStringCenter(Class4.worldList[Class4.hoveredWorldID * -202005965].tooltip, MouseInputHandler.mouseX * -367052265, 5 + MouseInputHandler.mouseY * 1533395117 + 20 + p11_full.anInt2643 + 4, 0, -1);
            }
         }

         try {
            var40 = Class1.aCanvas3.getGraphics();
            Class63.aClass13_830.method261(var40, 0, 0, -537550817);
         } catch (Exception var20) {
            Class1.aCanvas3.repaint();
         }
      } else {
         int var4;
         if(Client.loginLoadingStage * 1315883169 == 0 || 5 == Client.loginLoadingStage * 1315883169) {
            var3 = 20;
            b12_full.drawStringCenter(StringUtilities.RUNESCAPE_LOADING_PLEASE_WAIT, 382, 245 - var3, 16777215, -1);
            var4 = 253 - var3;
            Rasterizer2D.drawUnfilledRectangle(230, var4, 304, 34, 9179409);
            Rasterizer2D.drawUnfilledRectangle(231, 1 + var4, 302, 32, 0);
            Rasterizer2D.drawFilledRectangle(232, var4 + 2, Class4.anInt52 * 1915498427, 30, 9179409);
            Rasterizer2D.drawFilledRectangle(232 + Class4.anInt52 * 1915498427, 2 + var4, 300 - Class4.anInt52 * 1915498427, 30, 0);
            b12_full.drawStringCenter(Class4.currentLoadingStatus, 382, 276 - var3, 16777215, -1);
         }

         String enterUsername;
         String enterPassword;
         String typedPassword;
         String hiddenPassword;
         char[] hiddenCharacters;
         int var23;
         if(20 == Client.loginLoadingStage * 1315883169) {
            Class4.titleBox.drawSprite(382 - Class4.titleBox.anInt2413 / 2, 271 - Class4.titleBox.anInt2414 / 2);
            int yPos = 211;
            b12_full.drawStringCenter(Class4.aString74, 382, yPos, 16776960, 0);
            int yPos_1 = yPos + 15;
            b12_full.drawStringCenter(Class4.aString64, 382, yPos_1, 16776960, 0);
            yPos_1 += 15;
            b12_full.drawStringCenter(Class4.aString55, 382, yPos_1, 16776960, 0);
            yPos_1 += 15;
            yPos_1 += 10;
            if(4 != Class4.anInt54 * 2105711249) {
               b12_full.drawString(StringUtilities.LOGIN, 272, yPos_1, 16777215, 0);
               var24 = 200;

               for(enterUsername = Class4.typedUsername; b12_full.getTextWidth(enterUsername) > var24; enterUsername = enterUsername.substring(0, enterUsername.length() - 1)) {
                  ; 
               }

               b12_full.drawString(RSTypeFace.appendLTGTTags(enterUsername), 312, yPos_1, 16777215, 0);
               yPos_1 += 15;
               enterPassword = StringUtilities.PASSWORD;
               typedPassword = Class4.typedPassword;
               passwordLength = typedPassword.length();
               hiddenCharacters = new char[passwordLength];

               for(charIndex = 0; charIndex < passwordLength; ++charIndex) {
                  hiddenCharacters[charIndex] = 42;
               }

               hiddenPassword = new String(hiddenCharacters);
               b12_full.drawString(enterPassword + hiddenPassword, 274, yPos_1, 16777215, 0);
               yPos_1 += 15;
            }
         }

         if(Client.loginLoadingStage * 1315883169 == 10 || 11 == Client.loginLoadingStage * 1315883169) {
            Class4.titleBox.drawSprite(202, 171);
            if(Class4.anInt54 * 2105711249 == 0) {
               var22 = 251;
               b12_full.drawStringCenter(StringUtilities.WELCOME_TO_RUNESCAPE, 382, var22, 16776960, 0);
               var23 = var22 + 30;
               var24 = 302;
               var25 = 291;
               Class4.titleButton.drawSprite(var24 - 73, var25 - 20);
               b12_full.method3097(StringUtilities.NEW_USER_BUTTON, var24 - 73, var25 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var24 = 462;
               Class4.titleButton.drawSprite(var24 - 73, var25 - 20);
               b12_full.method3097(StringUtilities.EXISTING_USER_BUTTON, var24 - 73, var25 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if(Class4.anInt54 * 2105711249 == 1) {
               b12_full.drawStringCenter(StringUtilities.WARNING, 382, 211, 16776960, 0);
               var22 = 236;
               b12_full.drawStringCenter(Class4.aString74, 382, var22, 16777215, 0);
               var23 = var22 + 15;
               b12_full.drawStringCenter(Class4.aString64, 382, var23, 16777215, 0);
               var23 += 15;
               b12_full.drawStringCenter(Class4.aString55, 382, var23, 16777215, 0);
               var23 += 15;
               var24 = 302;
               var25 = 321;
               Class4.titleButton.drawSprite(var24 - 73, var25 - 20);
               b12_full.drawStringCenter(StringUtilities.CONTINUE_MENU, var24, var25 + 5, 16777215, 0);
               var24 = 462;
               Class4.titleButton.drawSprite(var24 - 73, var25 - 20);
               b12_full.drawStringCenter(StringUtilities.CANCEL_OPTION, var24, var25 + 5, 16777215, 0);
            } else {
               short var36;
               if(Class4.anInt54 * 2105711249 == 2) {
                  var22 = 211;
                  b12_full.drawStringCenter(Class4.aString74, 382, var22, 16776960, 0);
                  var23 = var22 + 15;
                  b12_full.drawStringCenter(Class4.aString64, 382, var23, 16776960, 0);
                  var23 += 15;
                  b12_full.drawStringCenter(Class4.aString55, 382, var23, 16776960, 0);
                  var23 += 15;
                  var23 += 10;
                  b12_full.drawString(StringUtilities.LOGIN, 272, var23, 16777215, 0);
                  var24 = 200;

                  for(enterUsername = Class4.typedUsername; b12_full.getTextWidth(enterUsername) > var24; enterUsername = enterUsername.substring(1)) {
                     ;
                  }

                  b12_full.drawString(RSTypeFace.appendLTGTTags(enterUsername) + (0 == Class4.anInt62 * 1502041601 & Client.cycle * -637317861 % 40 < 20?HuffmanEncoding.method690(16776960, -638653094) + Class47.FLASHING_CURSOR:""), 312, var23, 16777215, 0);
                  var23 += 15;
                  enterPassword = StringUtilities.PASSWORD;
                  typedPassword = Class4.typedPassword;
                  passwordLength = typedPassword.length();
                  hiddenCharacters = new char[passwordLength];

                  for(charIndex = 0; charIndex < passwordLength; ++charIndex) {
                     hiddenCharacters[charIndex] = 42;
                  }

                  hiddenPassword = new String(hiddenCharacters);
                  b12_full.drawString(enterPassword + hiddenPassword + (1 == Class4.anInt62 * 1502041601 & Client.cycle * -637317861 % 40 < 20?HuffmanEncoding.method690(16776960, -915868611) + Class47.FLASHING_CURSOR:""), 274, var23, 16777215, 0);
                  var23 += 15;
                  short var33 = 302;
                  var36 = 321;
                  Class4.titleButton.drawSprite(var33 - 73, var36 - 20);
                  b12_full.drawStringCenter(StringUtilities.LOGIN_BUTTON, var33, var36 + 5, 16777215, 0);
                  var33 = 462;
                  Class4.titleButton.drawSprite(var33 - 73, var36 - 20);
                  b12_full.drawStringCenter(StringUtilities.CANCEL_OPTION, var33, 5 + var36, 16777215, 0);
               } else if(4 == Class4.anInt54 * 2105711249) { // authenticaor
                  b12_full.drawStringCenter(StringUtilities.AUTHENTICATOR, 382, 211, 16776960, 0);
                  var22 = 236;
                  b12_full.drawStringCenter(Class4.aString74, 382, var22, 16777215, 0);
                  var23 = var22 + 15;
                  b12_full.drawStringCenter(Class4.aString64, 382, var23, 16777215, 0);
                  var23 += 15;
                  b12_full.drawStringCenter(Class4.aString55, 382, var23, 16777215, 0);
                  var23 += 15;
                  String enterPin = StringUtilities.PIN_ENTER;
                  String typedPin = BuildType.enteredPin;
                  pinLength = typedPin.length();
                  char[] hiddenPin = new char[pinLength];

                  for(passwordLength = 0; passwordLength < pinLength; ++passwordLength) {
                     hiddenPin[passwordLength] = 42;
                  }

                  String hiddenPinString = new String(hiddenPin);
                  b12_full.drawString(enterPin + hiddenPinString + (Client.cycle * -637317861 % 40 < 20 ? HuffmanEncoding.method690(16776960, -1546608071) + Class47.FLASHING_CURSOR : ""), 274, var23, 16777215, 0);
                  var23 -= 8;
                  b12_full.drawString(StringUtilities.TRUST_COMPUTER, 373, var23, 16776960, 0);
                  var23 += 15;
                  b12_full.drawString(StringUtilities.THIRTY_DAYS, 373, var23, 16776960, 0);
                  int radioX = 373 + b12_full.getTextWidth(StringUtilities.THIRTY_DAYS) + 15;
                  int radioY = var23 - b12_full.anInt2643;
                  PaletteSprite radioButton;
                  if(Class4.trustComputer) {
                     radioButton = GroundItem.radioButtonOptions_2;
                  } else {
                     radioButton = Class4.radioButtonOptions;
                  }

                  radioButton.drawSprite(radioX, radioY);
                  var23 += 15;
                  var36 = 302;
                  short var38 = 321;
                  Class4.titleButton.drawSprite(var36 - 73, var38 - 20);
                  b12_full.drawStringCenter(StringUtilities.CONTINUE_MENU, var36, 5 + var38, 16777215, 0);
                  var36 = 462;
                  Class4.titleButton.drawSprite(var36 - 73, var38 - 20);
                  b12_full.drawStringCenter(StringUtilities.CANCEL_OPTION, var36, 5 + var38, 16777215, 0);
                  p11_full.drawStringCenter(StringUtilities.CANT_LOGIN_QUESTION, 382, 36 + var38, 255, 0);
               }
            }
         }

         if(Class4.anInt50 * -368964559 > 0) {
            GroundItem.method582(Class4.anInt50 * -368964559, (short)128);
            Class4.anInt50 = 0;
         }

         var22 = 256;
         if(Class4.anInt57 * 250523231 > 0) {
            for(var4 = 0; var4 < 256; ++var4) {
               if(Class4.anInt57 * 250523231 > 768) {
                  Class108_Sub10.anIntArray1655[var4] = Varp.method2160(MouseCapturer.anIntArray382[var4], Class56.anIntArray757[var4], 1024 - Class4.anInt57 * 250523231, (byte)51);
               } else if(Class4.anInt57 * 250523231 > 256) {
                  Class108_Sub10.anIntArray1655[var4] = Class56.anIntArray757[var4];
               } else {
                  Class108_Sub10.anIntArray1655[var4] = Varp.method2160(Class56.anIntArray757[var4], MouseCapturer.anIntArray382[var4], 256 - Class4.anInt57 * 250523231, (byte)70);
               }
            }
         } else if(Class4.anInt67 * -713414969 > 0) {
            for(var4 = 0; var4 < 256; ++var4) {
               if(Class4.anInt67 * -713414969 > 768) {
                  Class108_Sub10.anIntArray1655[var4] = Varp.method2160(MouseCapturer.anIntArray382[var4], Client.anIntArray2966[var4], 1024 - Class4.anInt67 * -713414969, (byte)-82);
               } else if(Class4.anInt67 * -713414969 > 256) {
                  Class108_Sub10.anIntArray1655[var4] = Client.anIntArray2966[var4];
               } else {
                  Class108_Sub10.anIntArray1655[var4] = Varp.method2160(Client.anIntArray2966[var4], MouseCapturer.anIntArray382[var4], 256 - Class4.anInt67 * -713414969, (byte)32);
               }
            }
         } else {
            for(var4 = 0; var4 < 256; ++var4) {
               Class108_Sub10.anIntArray1655[var4] = MouseCapturer.anIntArray382[var4];
            }
         }

         Rasterizer2D.setRasterizationRect(0, 9, 128, var22 + 7);
         Class4.aClass108_Sub20_Sub15_Sub1_40.drawSprite(0, 0);
         Rasterizer2D.reset();
         var4 = 0;
         var26 = 6885;

         for(var6 = 1; var6 < var22 - 1; ++var6) {
            var29 = (var22 - var6) * Class4.anIntArray45[var6] / var22;
            var30 = var29 + 22;
            if(var30 < 0) {
               var30 = 0;
            }

            var4 += var30;

            for(pinLength = var30; pinLength < 128; ++pinLength) {
               var39 = Class65.anIntArray860[var4++];
               if(0 != var39) {
                  passwordLength = var39;
                  var41 = 256 - var39;
                  var39 = Class108_Sub10.anIntArray1655[var39];
                  charIndex = Class63.aClass13_830.anIntArray180[var26];
                  Class63.aClass13_830.anIntArray180[var26++] = ((var39 & 16711935) * passwordLength + (charIndex & 16711935) * var41 & -16711936) + (var41 * (charIndex & '\uff00') + (var39 & '\uff00') * passwordLength & 16711680) >> 8;
               } else {
                  ++var26;
               }
            }

            var26 += var30 + 765 - 128;
         }

         Rasterizer2D.setRasterizationRect(637, 9, 765, 7 + var22);
         Class41.aClass108_Sub20_Sub15_Sub1_588.drawSprite(382, 0);
         Rasterizer2D.reset();
         var4 = 0;
         var26 = 7546;

         for(var6 = 1; var6 < var22 - 1; ++var6) {
            var29 = (var22 - var6) * Class4.anIntArray45[var6] / var22;
            var30 = 103 - var29;
            var26 += var29;

            for(pinLength = 0; pinLength < var30; ++pinLength) {
               var39 = Class65.anIntArray860[var4++];
               if(var39 != 0) {
                  passwordLength = var39;
                  var41 = 256 - var39;
                  var39 = Class108_Sub10.anIntArray1655[var39];
                  charIndex = Class63.aClass13_830.anIntArray180[var26];
                  Class63.aClass13_830.anIntArray180[var26++] = ((var39 & 16711935) * passwordLength + var41 * (charIndex & 16711935) & -16711936) + ((var39 & '\uff00') * passwordLength + (charIndex & '\uff00') * var41 & 16711680) >> 8;
               } else {
                  ++var26;
               }
            }

            var4 += 128 - var30;
            var26 += 765 - var30 - var29;
         }

         MouseCapturer.aClass108_Sub20_Sub15_Sub2Array383[Ignore.aClass37_386.aBool529?1:0].drawSprite(725, 463);
         if(Client.loginLoadingStage * 1315883169 > 5 && Client.anInt2712 * 148074329 == 0) {
            if(World.switchWorldSprite != null) {
               var3 = 5;
               var24 = 463;
               byte var32 = 100;
               byte var27 = 35;
               World.switchWorldSprite.drawSprite(var3, var24);
               b12_full.drawStringCenter(StringUtilities.aString1114 + " " + Client.worldID * 292541855, var3 + var32 / 2, var24 + var27 / 2 - 2, 16777215, 0);
               if(null != Class77.aClass43_1203) {
                  p11_full.drawStringCenter(StringUtilities.LOADING, var32 / 2 + var3, 12 + var24 + var27 / 2, 16777215, 0);
               } else {
                  p11_full.drawStringCenter(StringUtilities.CLICK_TO_SWITCH, var32 / 2 + var3, 12 + var24 + var27 / 2, 16777215, 0);
               }
            } else {
               World.switchWorldSprite = Renderable.method2488(Class23.spriteIndex, "sl_button", "", (byte)2);
            }
         }

         try {
            var40 = Class1.aCanvas3.getGraphics();
            Class63.aClass13_830.method261(var40, 0, 0, -1151766827);
         } catch (Exception var21) {
            Class1.aCanvas3.repaint();
         }
      }
   }

   static final void method2223(byte var0) {
      int var1 = Client.anInt2768 * -2022691021 + Player.myPlayer.anInt2394 * 171470795;
      int var5 = Client.anInt2770 * 2011548015 + Player.myPlayer.anInt2339 * 826764905;
      if(Item.anInt2616 * -1461479521 - var1 < -500 || Item.anInt2616 * -1461479521 - var1 > 500 || GroundItem.anInt480 * -1594540275 - var5 < -500 || GroundItem.anInt480 * -1594540275 - var5 > 500) {
         Item.anInt2616 = var1 * -865352609;
         GroundItem.anInt480 = var5 * 1115269061;
      }

      if(var1 != Item.anInt2616 * -1461479521) {
         Item.anInt2616 += (var1 - Item.anInt2616 * -1461479521) / 16 * -865352609;
      }

      if(GroundItem.anInt480 * -1594540275 != var5) {
         GroundItem.anInt480 += (var5 - GroundItem.anInt480 * -1594540275) / 16 * 1115269061;
      }

      int var6;
      int var7;
      if(4 == MouseInputHandler.anInt769 * 1251070677 && Class100.aBool1391) {
         var6 = MouseInputHandler.mouseY * 1533395117 - Client.anInt2792 * -134901111;
         Client.anInt2790 = var6 * 949003262;
         Client.anInt2792 = 1239778233 * (var6 != -1 && var6 != 1?(MouseInputHandler.mouseY * 1533395117 + Client.anInt2792 * -134901111) / 2:MouseInputHandler.mouseY * 1533395117);
         var7 = Client.anInt2791 * -1026874455 - MouseInputHandler.mouseX * -367052265;
         Client.anInt2846 = var7 * 806733954;
         Client.anInt2791 = (var7 != -1 && var7 != 1?(Client.anInt2791 * -1026874455 + MouseInputHandler.mouseX * -367052265) / 2:MouseInputHandler.mouseX * -367052265) * -1079496551;
      } else {
         if(KeyFocusListener.aBoolArray895[96]) {
            Client.anInt2846 += (-24 - Client.anInt2846 * -223138879) / 2 * 403366977;
         } else if(KeyFocusListener.aBoolArray895[97]) {
            Client.anInt2846 += (24 - Client.anInt2846 * -223138879) / 2 * 403366977;
         } else {
            Client.anInt2846 = Client.anInt2846 * -223138879 / 2 * 403366977;
         }

         if(KeyFocusListener.aBoolArray895[98]) {
            Client.anInt2790 += (12 - Client.anInt2790 * -512512513) / 2 * 474501631;
         } else if(KeyFocusListener.aBoolArray895[99]) {
            Client.anInt2790 += (-12 - Client.anInt2790 * -512512513) / 2 * 474501631;
         } else {
            Client.anInt2790 = Client.anInt2790 * -512512513 / 2 * 474501631;
         }

         Client.anInt2792 = MouseInputHandler.mouseY * -840842235;
         Client.anInt2791 = MouseInputHandler.mouseX * 262539199;
      }

      Client.anInt2771 = (Client.anInt2846 * -223138879 / 2 + Client.anInt2771 * -44898889 & 2047) * -790493177;
      Client.anInt2816 += Client.anInt2790 * -512512513 / 2 * -1569679973;
      if(Client.anInt2816 * 1501284499 < 128) {
         Client.anInt2816 = 944426368;
      }

      if(Client.anInt2816 * 1501284499 > 383) {
         Client.anInt2816 = 107991781;
      }

      var6 = Item.anInt2616 * -1461479521 >> 7;
      var7 = GroundItem.anInt480 * -1594540275 >> 7;
      int var8 = RegionReference.getFloorDrawHeight(Item.anInt2616 * -1461479521, GroundItem.anInt480 * -1594540275, VarpBit.plane * -570926309, 1820764416);
      int var9 = 0;
      int var3;
      if(var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
         for(var3 = var6 - 4; var3 <= var6 + 4; ++var3) {
            for(int var4 = var7 - 4; var4 <= 4 + var7; ++var4) {
               int var2 = VarpBit.plane * -570926309;
               if(var2 < 3 && (RegionReference.mapTileSettings[1][var3][var4] & 2) == 2) {
                  ++var2;
               }

               int var10 = var8 - RegionReference.tileHeights[var2][var3][var4];
               if(var10 > var9) {
                  var9 = var10;
               }
            }
         }
      }

      var3 = var9 * 192;
      if(var3 > 98048) {
         var3 = 98048;
      }

      if(var3 < '\u8000') {
         var3 = '\u8000';
      }

      if(var3 > Client.anInt2754 * 1184886937) {
         Client.anInt2754 += (var3 - Client.anInt2754 * 1184886937) / 24 * 1907844009;
      } else if(var3 < Client.anInt2754 * 1184886937) {
         Client.anInt2754 += (var3 - Client.anInt2754 * 1184886937) / 80 * 1907844009;
      }
   }

   static final void method2224(byte var0) {
      for(int var1 = -1; var1 < Client.numLocalPlayers * -43742683; ++var1) {
         int var2;
         if(var1 == -1) {
            var2 = 2047;
         } else {
            var2 = Client.playerIndices[var1];
         }

         Player var3 = Client.localPlayers[var2];
         if(null != var3) {
            KeyFocusListener.method904(var3, 1, -350621275);
         }
      }

   }
}
