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
