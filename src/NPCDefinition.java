
public class NPCDefinition extends CacheableNode {

   short[] recolorToFind;
   public int anInt2156 = 1788385184;
   public static CacheableNodeMap npcDefinitionCache = new CacheableNodeMap(64);
   public static CacheableNodeMap npcRasterizerMap = new CacheableNodeMap(50);
   public int npcID;
   public String name = "null";
   short[] recolorToReplace;
   int[] models;
   int[] models_2;
   public int stanceAnimation = -906549221;
   public int anInt2165 = -1780667505;
   public int tileSpacesOccupied = -1831019197;
   public int walkAnimation = -233911407;
   short[] retextureToReplace;
   public int rotate90RightAnimation = -1964792167;
   public boolean aBool2170 = true;
   int resizeX = -1571968896;
   int contrast = 0;
   public int rotate180Animation = 579834709;
   int anInt2174 = -1832674521;
   public String[] options = new String[5];
   public boolean renderOnMinimap = true;
   public int combatLevel = -2125382685;
   public int rotate90LeftAnimation = 107633;
   int resizeY = 957515136;
   public boolean hasRenderPriority = false;
   int ambient = 0;
   static AbstractIndex aClass74_2182;
   public int headIcon = 337827163;
   public int anInt2184 = -1239106770;
   public int[] anIntArray2185;
   short[] retextureToFind;
   int anInt2187 = -40212193;
   public boolean isClickable = true;
   public int anInt2189 = 1304499145;
   public boolean aBool2190 = false;
   static AbstractIndex configIndexReference;
   static RSInterface aClass108_Sub17_2193;
   static byte aByte2194;

   public static NPCDefinition getNPCDefForID(int npcID, int var1) {
      NPCDefinition npcDef = (NPCDefinition) npcDefinitionCache.get((long) npcID);
      if(npcDef != null) {
         return npcDef;
      } else {
         byte[] npcDefData = configIndexReference.getFile(9, npcID, (byte) 7);
         npcDef = new NPCDefinition();
         npcDef.npcID = npcID * -582391805;
         if(npcDefData != null) {
            npcDef.decode(new RSByteBuffer(npcDefData), 1749628579);
         }

         npcDef.method2285((byte)11);
         npcDefinitionCache.put(npcDef, (long) npcID);
         return npcDef;
      }
   }


   public boolean method2284(byte var1) {
      if(this.anIntArray2185 == null) {
         return true;
      } else {
         int var2 = -1;
         if(-1 != this.anInt2174 * 1518197609) {
            var2 = BuildType.method1094(this.anInt2174 * 1518197609, -511913587);
         } else if(-1 != this.anInt2187 * -1146999519) {
            var2 = Class88.configSettings[this.anInt2187 * -1146999519];
         }

         return var2 >= 0 && var2 < this.anIntArray2185.length && this.anIntArray2185[var2] != -1;
      }
   }

   void method2285(byte var1) {}

   public final RSModel method2286(byte var1) {
      if(this.anIntArray2185 != null) {
         NPCDefinition def = this.method2290(2109152235);
         return null == def ? null : def.method2286((byte)23);
      } else if(null == this.models_2) {
         return null;
      } else {
         boolean hasModel = false;

         for(int var4 = 0; var4 < this.models_2.length; ++var4) {
            if(!aClass74_2182.containsFile(this.models_2[var4], 0, 1151584293)) {
               hasModel = true;
            }
         }

         if(hasModel) {
            return null;
         } else {
            RSModel[] models = new RSModel[this.models_2.length];

            for(int index = 0; index < this.models_2.length; ++index) {
               models[index] = RSModel.decodeModel(aClass74_2182, this.models_2[index], 0);
            }

            RSModel model;
            if(1 == models.length) {
               model = models[0];
            } else {
               model = new RSModel(models, models.length);
            }

            int changeIndex;
            if(this.recolorToFind != null) {
               for(changeIndex = 0; changeIndex < this.recolorToFind.length; ++changeIndex) {
                  model.findReplaceColor(this.recolorToFind[changeIndex], this.recolorToReplace[changeIndex]);
               }
            }

            if(null != this.retextureToFind) {
               for(changeIndex = 0; changeIndex < this.retextureToFind.length; ++changeIndex) {
                  model.findReplaceTexture(this.retextureToFind[changeIndex], this.retextureToReplace[changeIndex]);
               }
            }

            return model;
         }
      }
   }

   void decodeReadValues(RSByteBuffer buffer, int opcode, int var3) {
      int length;
      int index;
      if(1 == opcode) {
         length = buffer.readUByte();
         this.models = new int[length];

         for(index = 0; index < length; ++index) {
            this.models[index] = buffer.readUShort(52332284);
         }

      } else if(2 == opcode) {
         this.name = buffer.getString_2((byte)8);
      } else if(12 == opcode) {
         this.tileSpacesOccupied = buffer.readUByte() * -1831019197;
      } else if(opcode == 13) {
         this.stanceAnimation = buffer.readUShort(4426424) * 906549221;
      } else if(opcode == 14) {
         this.walkAnimation = buffer.readUShort(-699548163) * 233911407;
      } else if(15 == opcode) {
         this.anInt2165 = buffer.readUShort(936825416) * 1780667505;
      } else if(opcode == 16) {
         this.anInt2189 = buffer.readUShort(1857822009) * -1304499145;
      } else if(17 == opcode) {
         this.walkAnimation = buffer.readUShort(-1737440751) * 233911407;
         this.rotate180Animation = buffer.readUShort(-1308650808) * -579834709;
         this.rotate90RightAnimation = buffer.readUShort(-1748302646) * 1964792167;
         this.rotate90LeftAnimation = buffer.readUShort(1585988243) * -107633;
      } else if(opcode >= 30 && opcode < 35) {
         this.options[opcode - 30] = buffer.getString_2((byte)8);
         if(this.options[opcode - 30].equalsIgnoreCase(StringUtilities.hidden)) {
            this.options[opcode - 30] = null;
         }
      } else if(opcode == 40) {
         length = buffer.readUByte();
         this.recolorToFind = new short[length];
         this.recolorToReplace = new short[length];

         for(index = 0; index < length; ++index) {
            this.recolorToFind[index] = (short)buffer.readUShort(1947818045);
            this.recolorToReplace[index] = (short)buffer.readUShort(494335516);
         }

      } else if(opcode == 41) {
         length = buffer.readUByte();
         this.retextureToFind = new short[length];
         this.retextureToReplace = new short[length];

         for(index = 0; index < length; ++index) {
            this.retextureToFind[index] = (short)buffer.readUShort(324766106);
            this.retextureToReplace[index] = (short)buffer.readUShort(756595030);
         }

      } else if(60 != opcode) {
         if(opcode == 93) {
            this.renderOnMinimap = false;
         } else if(95 == opcode) {
            this.combatLevel = buffer.readUShort(906851437) * 2125382685;
         } else if(97 == opcode) {
            this.resizeX = buffer.readUShort(1622111407) * 457481041;
         } else if(98 == opcode) {
            this.resizeY = buffer.readUShort(-441691492) * 1852974347;
         } else if(opcode == 99) {
            this.hasRenderPriority = true;
         } else if(100 == opcode) {
            this.ambient = buffer.readByte() * -708908987;
         } else if(101 == opcode) {
            this.contrast = buffer.readByte() * -2134291199;
         } else if(opcode == 102) {
            this.headIcon = buffer.readUShort(-812238191) * -337827163;
         } else if(103 == opcode) {
            this.anInt2156 = buffer.readUShort(-862599685) * 190104765;
         } else if(opcode == 106) {
            this.anInt2174 = buffer.readUShort(1012331088) * 1832674521;
            if('\uffff' == this.anInt2174 * 1518197609) {
               this.anInt2174 = -1832674521;
            }

            this.anInt2187 = buffer.readUShort(-1383073713) * 40212193;
            if('\uffff' == this.anInt2187 * -1146999519) {
               this.anInt2187 = -40212193;
            }

            length = buffer.readUByte();
            this.anIntArray2185 = new int[length + 1];

            for(index = 0; index <= length; ++index) {
               this.anIntArray2185[index] = buffer.readUShort(1407741382);
               if(this.anIntArray2185[index] == '\uffff') {
                  this.anIntArray2185[index] = -1;
               }
            }

         } else if(107 == opcode) {
            this.isClickable = false;
         } else if(opcode == 109) {
            this.aBool2170 = false;
         } else if(opcode == 111) {
            this.aBool2190 = true;
         } else if(opcode == 112) {
            this.anInt2184 = buffer.readUByte() * 2106180089;
         }
      } else {
         length = buffer.readUByte();
         this.models_2 = new int[length];

         for(index = 0; index < length; ++index) {
            this.models_2[index] = buffer.readUShort(-768547129);
         }

      }
   }

   public final ModelRasterizer method2288(AnimationDefinition var1, int var2, AnimationDefinition var3, int var4, byte var5) {
      if(this.anIntArray2185 != null) {
         NPCDefinition def = this.method2290(1617209938);
         return null == def ? null : def.method2288(var1, var2, var3, var4, (byte)1);
      } else {
         ModelRasterizer rasterizer = (ModelRasterizer)npcRasterizerMap.get((long)(this.npcID * 140673707));
         if(rasterizer == null) {
            boolean hasModel = false;

            for(int var9 = 0; var9 < this.models.length; ++var9) {
               if(!aClass74_2182.containsFile(this.models[var9], 0, 1151584293)) {
                  hasModel = true;
               }
            }

            if(hasModel) {
               return null;
            }

            RSModel[] models = new RSModel[this.models.length];

            int index;
            for(index = 0; index < this.models.length; ++index) {
               models[index] = RSModel.decodeModel(aClass74_2182, this.models[index], 0);
            }

            RSModel model;
            if(1 == models.length) {
               model = models[0];
            } else {
               model = new RSModel(models, models.length); // combine the models
            }

            if(this.recolorToFind != null) {
               for(index = 0; index < this.recolorToFind.length; ++index) {
                  model.findReplaceColor(this.recolorToFind[index], this.recolorToReplace[index]);
               }
            }

            if(null != this.retextureToFind) {
               for(index = 0; index < this.retextureToFind.length; ++index) {
                  model.findReplaceTexture(this.retextureToFind[index], this.retextureToReplace[index]);
               }
            }

            rasterizer = model.createModelRasterizer(64 + this.ambient * -611325299, this.contrast * -656507131 + 850, -30, -50, -30);
            npcRasterizerMap.put(rasterizer, (long)(this.npcID * 140673707));
         }

         ModelRasterizer modifiedRasterizer;
         if(null != var1 && null != var3) {
            modifiedRasterizer = var1.method2265(rasterizer, var2, var3, var4, (byte)-62);
         } else if(null != var1) {
            modifiedRasterizer = var1.method2229(rasterizer, var2, -1345282556);
         } else if(var3 != null) {
            modifiedRasterizer = var3.method2229(rasterizer, var4, -1345282556);
         } else {
            modifiedRasterizer = rasterizer.method2852(true);
         }

         if(128 != this.resizeX * 1618316721 || 128 != this.resizeY * 1034256035) {
            modifiedRasterizer.resizeModel(this.resizeX * 1618316721, this.resizeY * 1034256035, this.resizeX * 1618316721);
         }

         return modifiedRasterizer;
      }
   }

   public final NPCDefinition method2290(int var1) {
      int var2 = -1;
      if(this.anInt2174 * 1518197609 != -1) {
         var2 = BuildType.method1094(this.anInt2174 * 1518197609, -511913587);
      } else if(this.anInt2187 * -1146999519 != -1) {
         var2 = Class88.configSettings[this.anInt2187 * -1146999519];
      }

      return var2 >= 0 && var2 < this.anIntArray2185.length && this.anIntArray2185[var2] != -1? getNPCDefForID(this.anIntArray2185[var2], -606019968):null;
   }

   static final void method2293(Entity var0, short var1) {
      if(var0.anInt2383 * -1116714413 == Client.cycle * -637317861 || var0.anInt2368 * 1647325343 == -1 || var0.anInt2371 * 843883743 != 0 || 1 + var0.anInt2396 * -1771177583 > AnimationDefinition.getAnimDefForID(var0.anInt2368 * 1647325343, 1579955150).frameLengths[var0.anInt2341 * -2111206063]) {
         int var2 = var0.anInt2383 * -1116714413 - var0.anInt2382 * 651118561;
         int var7 = Client.cycle * -637317861 - var0.anInt2382 * 651118561;
         int var3 = var0.anInt2346 * -433366912 + var0.anInt2349 * -316782016;
         int var4 = var0.anInt2349 * -316782016 + var0.anInt2380 * 661235840;
         int var5 = var0.anInt2379 * 1768262016 + var0.anInt2349 * -316782016;
         int var6 = var0.anInt2351 * 1269671808 + var0.anInt2349 * -316782016;
         var0.anInt2394 = ((var2 - var7) * var3 + var7 * var5) / var2 * 1254407651;
         var0.anInt2339 = (var4 * (var2 - var7) + var7 * var6) / var2 * 71107033;
      }

      var0.anInt2338 = 0;
      if(var0.anInt2384 * -341799005 == 0) {
         var0.anInt2354 = -257029120;
      }

      if(1 == var0.anInt2384 * -341799005) {
         var0.anInt2354 = -385543680;
      }

      if(2 == var0.anInt2384 * -341799005) {
         var0.anInt2354 = 0;
      }

      if(3 == var0.anInt2384 * -341799005) {
         var0.anInt2354 = -128514560;
      }

      var0.anInt2345 = var0.anInt2354 * -1989806541;
   }

   public static void method2300(AbstractIndex var0, AbstractIndex var1, int var2) {
      AnimatedGraphic.aClass74_2029 = var0;
      Class54.aClass74_734 = var1;
   }

   void decode(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUByte();
         if(0 == var3) {
            return;
         }

         this.decodeReadValues(var1, var3, 2061156913);
      }
   }

}
