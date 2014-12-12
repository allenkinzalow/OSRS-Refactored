
public class EquipmentKit {

   long equipmentHash;
   int[] bodyPartColors;
   public boolean isFemale;
   long aLong1336;
   public static short[][] aShortArrayArray1337;
   public static short[][] aShortArrayArray1338;
   int[] bodyPartIDs;
   static int[] anIntArray1340 = new int[]{8, 11, 4, 6, 9, 7, 10};
   public static CacheableNodeMap equipmentMap = new CacheableNodeMap(260);
   int anInt1342;
   static int anInt1344;


   public int method1168(int var1) {
      return -1 == this.anInt1342 * -11560425?this.bodyPartIDs[1] + (this.bodyPartIDs[11] << 5) + (this.bodyPartIDs[8] << 10) + (this.bodyPartIDs[0] << 15) + (this.bodyPartColors[0] << 25) + (this.bodyPartColors[4] << 20):305419896 + Class108_Sub12.getNPCDefForID(this.anInt1342 * -11560425, 1146350365).npcID * 140673707;
   }

   public void method1169(int var1, boolean var2, int var3) {
      if(var1 != 1 || !this.isFemale) {
         int var4 = this.bodyPartIDs[anIntArray1340[var1]];
         if(0 != var4) {
            var4 -= 256;
 
            IdentityKit identityKit;
            do {
               if(!var2) {
                  --var4;
                  if(var4 < 0) {
                     var4 = IdentityKit.anInt2198 * -841275303 - 1;
                  }
               } else {
                  ++var4;
                  if(var4 >= IdentityKit.anInt2198 * -841275303) {
                     var4 = 0;
                  }
               }

               identityKit = GZIPDecompressor.getIDKForBodyPart(var4, -1591400417);
            } while(null == identityKit || identityKit.nonSelectable || identityKit.bodyPartID * 1565583129 != (this.isFemale?7:0) + var1);

            this.bodyPartIDs[anIntArray1340[var1]] = 256 + var4;
            this.method1200((byte)-1);
         }
      }
   }

   public void method1170(boolean var1, byte var2) {
      if(this.isFemale != var1) {
         this.initialize((int[])null, this.bodyPartColors, var1, -1, -1809930983);
      }
   }

   public void method1171(RSByteBuffer buffer, int var2) {
      buffer.writeByte(this.isFemale ? 1 : 0);

      int index;
      for(index = 0; index < 7; ++index) {
         int bodyPartID = this.bodyPartIDs[anIntArray1340[index]];
         if(bodyPartID == 0) {
            buffer.writeByte(-1);
         } else {
            buffer.writeByte(bodyPartID - 256);
         }
      }

      for(index = 0; index < 5; ++index) {
         buffer.writeByte(this.bodyPartColors[index]);
      }

   }

   public ModelRasterizer getModelRasterizer(AnimationDefinition animDef, int var2, AnimationDefinition interAnimDef, int var4, int var5) {
      if(-1 != this.anInt1342 * -11560425) {
         return Class108_Sub12.getNPCDefForID(this.anInt1342 * -11560425, -1058486413).method2288(animDef, var2, interAnimDef, var4, (byte)1);
      } else {
         long bodyEquipmentHash = this.aLong1336 * -6070883008633819357L;
         int[] bodyPartIDs = this.bodyPartIDs;
         if(null != animDef && (animDef.leftHandItem * -855964799 >= 0 || animDef.rightHandItem * 1718165305 >= 0)) {
            bodyPartIDs = new int[12];

            for(int var13 = 0; var13 < 12; ++var13) {
               bodyPartIDs[var13] = this.bodyPartIDs[var13];
            }

            if(animDef.leftHandItem * -855964799 >= 0) {
               bodyEquipmentHash += (long)(animDef.leftHandItem * -855964799 - this.bodyPartIDs[5] << 40);
               bodyPartIDs[5] = animDef.leftHandItem * -855964799;
            }

            if(animDef.rightHandItem * 1718165305 >= 0) {
               bodyEquipmentHash += (long)(animDef.rightHandItem * 1718165305 - this.bodyPartIDs[3] << 48);
               bodyPartIDs[3] = animDef.rightHandItem * 1718165305;
            }
         }

         ModelRasterizer rasterizer = (ModelRasterizer)equipmentMap.get(bodyEquipmentHash);
         if(null == rasterizer) {
            boolean hasModel = false;

            int bodyPartId;
            for(int bodyPartIndex = 0; bodyPartIndex < 12; ++bodyPartIndex) {
               bodyPartId = bodyPartIDs[bodyPartIndex];
               if(bodyPartId >= 256 && bodyPartId < 512 && !GZIPDecompressor.getIDKForBodyPart(bodyPartId - 256, -1105406816).hasBodyModel(-1030866702)) {
                  hasModel = true;
               }

               if(bodyPartId >= 512 && !ItemDefinition.getItemDefinition(bodyPartId - 512, -1578938847).hasModel(this.isFemale, 294627738)) {
                  hasModel = true;
               }
            }

            if(hasModel) {
               if(-1L != 6250630413404837739L * this.equipmentHash) {
                  rasterizer = (ModelRasterizer)equipmentMap.get(6250630413404837739L * this.equipmentHash);
               }

               if(rasterizer == null) {
                  return null;
               }
            }

            if(rasterizer == null) {
               RSModel[] bodyParts = new RSModel[12];
               bodyPartId = 0;

               int bodyPartID;
               for(int bodyPartIndex = 0; bodyPartIndex < 12; ++bodyPartIndex) {
                  bodyPartID = bodyPartIDs[bodyPartIndex];
                  RSModel bodyPartModel;
                  if(bodyPartID >= 256 && bodyPartID < 512) {
                     bodyPartModel = GZIPDecompressor.getIDKForBodyPart(bodyPartID - 256, -66503897).getModel(-1329593252);
                     if(bodyPartModel != null) {
                        bodyParts[bodyPartId++] = bodyPartModel;
                     }
                  }

                  if(bodyPartID >= 512) {
                     bodyPartModel = ItemDefinition.getItemDefinition(bodyPartID - 512, -1930723805).getModel(this.isFemale, (byte)-119);
                     if(null != bodyPartModel) {
                        bodyParts[bodyPartId++] = bodyPartModel;
                     }
                  }
               }

               RSModel completeModel = new RSModel(bodyParts, bodyPartId);

               for(bodyPartID = 0; bodyPartID < 5; ++bodyPartID) {
                  if(this.bodyPartColors[bodyPartID] < aShortArrayArray1338[bodyPartID].length) {
                     completeModel.findReplaceColor(Class88.aShortArray1318[bodyPartID], aShortArrayArray1338[bodyPartID][this.bodyPartColors[bodyPartID]]);
                  }

                  if(this.bodyPartColors[bodyPartID] < aShortArrayArray1337[bodyPartID].length) {
                     completeModel.findReplaceColor(FriendsChatMember.aShortArray1668[bodyPartID], aShortArrayArray1337[bodyPartID][this.bodyPartColors[bodyPartID]]);
                  }
               }

               rasterizer = completeModel.createModelRasterizer(64, 850, -30, -50, -30);
               equipmentMap.put(rasterizer, bodyEquipmentHash);
               this.equipmentHash = bodyEquipmentHash * -6214236993221763773L;
            }
         }

         if(animDef == null && null == interAnimDef) {
            return rasterizer;
         } else {
            ModelRasterizer animatedRasterizer;
            if(null != animDef && interAnimDef != null) {
               animatedRasterizer = animDef.method2265(rasterizer, var2, interAnimDef, var4, (byte)-117);
            } else if(null != animDef) {
               animatedRasterizer = animDef.method2229(rasterizer, var2, -1345282556);
            } else {
               animatedRasterizer = interAnimDef.method2229(rasterizer, var4, -1345282556);
            }

            return animatedRasterizer;
         }
      }
   }

   RSModel getModel(byte var1) {
      if(this.anInt1342 * -11560425 != -1) {
         return Class108_Sub12.getNPCDefForID(this.anInt1342 * -11560425, 1247515359).method2286((byte)115);
      } else {
         boolean hasModel = false;

         int bodyPartId;
         for(int bodyPartIndex = 0; bodyPartIndex < 12; ++bodyPartIndex) {
            bodyPartId = this.bodyPartIDs[bodyPartIndex];
            if(bodyPartId >= 256 && bodyPartId < 512 && !GZIPDecompressor.getIDKForBodyPart(bodyPartId - 256, -636787522).hasHeadModel(1561830083)) {
               hasModel = true;
            }

            if(bodyPartId >= 512 && !ItemDefinition.getItemDefinition(bodyPartId - 512, -645591119).hasHeadModel(this.isFemale, (byte)-113)) {
               hasModel = true;
            }
         }

         if(hasModel) {
            return null;
         } else {
            RSModel[] bodyPartModels = new RSModel[12];
            bodyPartId = 0;

            int bodyPartID;
            for(int bodyPartIndex = 0; bodyPartIndex < 12; ++bodyPartIndex) {
               bodyPartID = this.bodyPartIDs[bodyPartIndex];
               RSModel bodyModel;
               if(bodyPartID >= 256 && bodyPartID < 512) {
                  bodyModel = GZIPDecompressor.getIDKForBodyPart(bodyPartID - 256, -539438048).getHeadModel(-1038604602);
                  if(null != bodyModel) {
                     bodyPartModels[bodyPartId++] = bodyModel;
                  }
               }

               if(bodyPartID >= 512) {
                  bodyModel = ItemDefinition.getItemDefinition(bodyPartID - 512, -2036828498).getHeadModel(this.isFemale, -935663576);
                  if(bodyModel != null) {
                     bodyPartModels[bodyPartId++] = bodyModel;
                  }
               }
            }

            RSModel completeModel = new RSModel(bodyPartModels, bodyPartId);

            for(bodyPartID = 0; bodyPartID < 5; ++bodyPartID) {
               if(this.bodyPartColors[bodyPartID] < aShortArrayArray1338[bodyPartID].length) {
                  completeModel.findReplaceColor(Class88.aShortArray1318[bodyPartID], aShortArrayArray1338[bodyPartID][this.bodyPartColors[bodyPartID]]);
               }

               if(this.bodyPartColors[bodyPartID] < aShortArrayArray1337[bodyPartID].length) {
                  completeModel.findReplaceColor(FriendsChatMember.aShortArray1668[bodyPartID], aShortArrayArray1337[bodyPartID][this.bodyPartColors[bodyPartID]]);
               }
            }

            return completeModel;
         }
      }
   }

   public static String method1180(CharSequence var0, byte var1) {
      String var2 = ClientScript.method1680(CacheConstants.method1102(var0, 1886585479));
      if(var2 == null) {
         var2 = "";
      }

      return var2;
   }

   public void initialize(int[] bodyPartIDs, int[] colors, boolean isFemale, int var4, int var5) {
      if(bodyPartIDs == null) {
         bodyPartIDs = new int[12];

         for(int var7 = 0; var7 < 7; ++var7) {
            for(int bodyPartID = 0; bodyPartID < IdentityKit.anInt2198 * -841275303; ++bodyPartID) {
               IdentityKit identityKit = GZIPDecompressor.getIDKForBodyPart(bodyPartID, -517576834);
               if(null != identityKit && !identityKit.nonSelectable && identityKit.bodyPartID * 1565583129 == (isFemale ? 7 : 0) + var7) {
                  bodyPartIDs[anIntArray1340[var7]] = bodyPartID + 256;
                  break;
               }
            }
         }
      }

      this.bodyPartIDs = bodyPartIDs;
      this.bodyPartColors = colors;
      this.isFemale = isFemale;
      this.anInt1342 = var4 * 660422055;
      this.method1200((byte)-1);
   }

   public void method1195(int var1, boolean var2, byte var3) {
      int var4 = this.bodyPartColors[var1];
      boolean var5;
      if(!var2) {
         do {
            --var4;
            if(var4 < 0) {
               var4 = aShortArrayArray1338[var1].length - 1;
            }

            if(var1 == 4 && var4 == 8) {
               var5 = false;
            } else {
               var5 = true;
            }
         } while(!var5);
      } else {
         do {
            ++var4;
            if(var4 >= aShortArrayArray1338[var1].length) {
               var4 = 0;
            }

            if(var1 == 4 && 8 == var4) {
               var5 = false;
            } else {
               var5 = true;
            }
         } while(!var5);
      }

      this.bodyPartColors[var1] = var4;
      this.method1200((byte)-1);
   }

   void method1200(byte var1) {
      long var2 = -6070883008633819357L * this.aLong1336;
      int var6 = this.bodyPartIDs[5];
      int var5 = this.bodyPartIDs[9];
      this.bodyPartIDs[5] = var5;
      this.bodyPartIDs[9] = var6;
      this.aLong1336 = 0L;

      int var4;
      for(var4 = 0; var4 < 12; ++var4) {
         this.aLong1336 = (-6070883008633819357L * this.aLong1336 << 4) * -4957266024856192885L;
         if(this.bodyPartIDs[var4] >= 256) {
            this.aLong1336 += -4957266024856192885L * (long)(this.bodyPartIDs[var4] - 256);
         }
      }

      if(this.bodyPartIDs[0] >= 256) {
         this.aLong1336 += -4957266024856192885L * (long)(this.bodyPartIDs[0] - 256 >> 4);
      }

      if(this.bodyPartIDs[1] >= 256) {
         this.aLong1336 += (long)(this.bodyPartIDs[1] - 256 >> 8) * -4957266024856192885L;
      }

      for(var4 = 0; var4 < 5; ++var4) {
         this.aLong1336 = -4957266024856192885L * (this.aLong1336 * -6070883008633819357L << 3);
         this.aLong1336 += -4957266024856192885L * (long)this.bodyPartColors[var4];
      }

      this.aLong1336 = -4957266024856192885L * (this.aLong1336 * -6070883008633819357L << 1);
      this.aLong1336 += -4957266024856192885L * (long)(this.isFemale?1:0);
      this.bodyPartIDs[5] = var6;
      this.bodyPartIDs[9] = var5;
      if(0L != var2) {
         if(-6070883008633819357L * this.aLong1336 != var2) {
            equipmentMap.method1363(var2);
         }
      }
   }
}
