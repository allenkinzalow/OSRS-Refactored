
public class IdentityKit extends CacheableNode {

   public boolean nonSelectable = false;
   static AbstractIndex aClass74_2197;
   public static int anInt2198;
   static CacheableNodeMap identityKitMap = new CacheableNodeMap(64);
   static AbstractIndex aClass74_2201;
   short[] recolorToFind;
   short[] recolorToReplace;
   short[] retextureToFind;
   short[] retextureToReplace;
   int[] headModels = new int[]{-1, -1, -1, -1, -1};
   public int bodyPartID = -1546880297;
   int[] bodyModels;

   public static IdentityKit getIDKForBodyPart(int bodyPartID, int var1) {
      IdentityKit idk = (IdentityKit) identityKitMap.get((long) bodyPartID);
      if(null == idk) {
         byte[] idkData = aClass74_2197.getFile(3, bodyPartID, (byte) 7);
         idk = new IdentityKit();
         if(idkData != null) {
            idk.decode(new RSByteBuffer(idkData), -1216155848);
         }

         identityKitMap.put(idk, (long) bodyPartID);
         return idk;
      } else {
         return idk;
      }
   }


   void decode(RSByteBuffer buffer, int var2) {
      while(true) {
         int opcode = buffer.readUByte();
         if(opcode == 0) {
            return;
         }

         this.decodeReadValues(buffer, opcode, -1030645904);
      }
   }

   void decodeReadValues(RSByteBuffer buffer, int opcode, int var3) {
      if(opcode == 1) {
         this.bodyPartID = buffer.readUByte() * 1546880297;
      } else {
         int length;
         int index;
         if(2 == opcode) {
            length = buffer.readUByte();
            this.bodyModels = new int[length];

            for(index = 0; index < length; ++index) {
               this.bodyModels[index] = buffer.readUShort(906234891);
            }

         } else if(opcode == 3) {
            this.nonSelectable = true;
         } else if(40 == opcode) {
            length = buffer.readUByte();
            this.recolorToFind = new short[length];
            this.recolorToReplace = new short[length];

            for(index = 0; index < length; ++index) {
               this.recolorToFind[index] = (short)buffer.readUShort(102812475);
               this.recolorToReplace[index] = (short)buffer.readUShort(1055599139);
            }

         } else if(41 != opcode) {
            if(opcode >= 60) {
               if(opcode < 70) {
                  this.headModels[opcode - 60] = buffer.readUShort(-1655328365);
               }
            }
         } else {
            length = buffer.readUByte();
            this.retextureToFind = new short[length];
            this.retextureToReplace = new short[length];

            for(index = 0; index < length; ++index) {
               this.retextureToFind[index] = (short)buffer.readUShort(-1618854199);
               this.retextureToReplace[index] = (short)buffer.readUShort(-531168099);
            }

         }
      }
   }

   public boolean hasHeadModel(int var1) {
      boolean hasHeadModel = true;

      for(int var3 = 0; var3 < 5; ++var3) {
         if(this.headModels[var3] != -1 && !aClass74_2201.containsFile(this.headModels[var3], 0, 1151584293)) {
            hasHeadModel = false;
         }
      }

      return hasHeadModel;
   }

   public RSModel getHeadModel(int var1) {
      RSModel[] models = new RSModel[5];
      int modelIndex = 0;

      for(int index = 0; index < 5; ++index) {
         if(this.headModels[index] != -1) {
            models[modelIndex++] = RSModel.decodeModel(aClass74_2201, this.headModels[index], 0);
         }
      }

      RSModel model = new RSModel(models, modelIndex);
      int changeIndex;
      if(null != this.recolorToFind) {
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

   public RSModel getModel(int var1) {
      if(null == this.bodyModels) {
         return null;
      } else {
         RSModel[] models = new RSModel[this.bodyModels.length];

         for(int modelIndex = 0; modelIndex < this.bodyModels.length; ++modelIndex) {
            models[modelIndex] = RSModel.decodeModel(aClass74_2201, this.bodyModels[modelIndex], 0);
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

   static final void method2339(byte var0) {
      Client.packetBuffer.startBitMode();
      int var2 = Client.packetBuffer.readBits(8);
      int var4;
      if(var2 < Client.anInt2749 * -1829405175) {
         for(var4 = var2; var4 < Client.anInt2749 * -1829405175; ++var4) {
            Client.indicesPendingRemoval[(Client.removedCounter += 1906858221) * 104842469 - 1] = Client.npcIndices[var4];
         }
      }

      if(var2 > Client.anInt2749 * -1829405175) {
         throw new RuntimeException("");
      } else {
         Client.anInt2749 = 0;

         for(var4 = 0; var4 < var2; ++var4) {
            int var1 = Client.npcIndices[var4];
            NPC var3 = Client.localNPCs[var1];
            int var5 = Client.packetBuffer.readBits(1);
            if(0 == var5) {
               Client.npcIndices[(Client.anInt2749 += 995848249) * -1829405175 - 1] = var1;
               var3.lastUpdated = Client.cycle * 1761958407;
            } else {
               int var7 = Client.packetBuffer.readBits(2);
               if(var7 == 0) {
                  Client.npcIndices[(Client.anInt2749 += 995848249) * -1829405175 - 1] = var1;
                  var3.lastUpdated = Client.cycle * 1761958407;
                  Client.playersNeedingUpdating[(Client.updateReqCount -= 472402375) * -184592375 - 1] = var1;
               } else {
                  int var6;
                  int var8;
                  if(var7 == 1) {
                     Client.npcIndices[(Client.anInt2749 += 995848249) * -1829405175 - 1] = var1;
                     var3.lastUpdated = Client.cycle * 1761958407;
                     var8 = Client.packetBuffer.readBits(3);
                     var3.moveInDirection(var8, false, -548715931);
                     var6 = Client.packetBuffer.readBits(1);
                     if(var6 == 1) {
                        Client.playersNeedingUpdating[(Client.updateReqCount -= 472402375) * -184592375 - 1] = var1;
                     }
                  } else if(2 == var7) {
                     Client.npcIndices[(Client.anInt2749 += 995848249) * -1829405175 - 1] = var1;
                     var3.lastUpdated = Client.cycle * 1761958407;
                     var8 = Client.packetBuffer.readBits(3);
                     var3.moveInDirection(var8, true, -548715931);
                     var6 = Client.packetBuffer.readBits(3);
                     var3.moveInDirection(var6, true, -548715931);
                     int var9 = Client.packetBuffer.readBits(1);
                     if(1 == var9) {
                        Client.playersNeedingUpdating[(Client.updateReqCount -= 472402375) * -184592375 - 1] = var1;
                     }
                  } else if(var7 == 3) {
                     Client.indicesPendingRemoval[(Client.removedCounter += 1906858221) * 104842469 - 1] = var1;
                  }
               }
            }
         }

      }
   }

   public boolean hasBodyModel(int var1) {
      if(null == this.bodyModels) {
         return true;
      } else {
         boolean hasBodyModel = true;

         for(int var2 = 0; var2 < this.bodyModels.length; ++var2) {
            if(!aClass74_2201.containsFile(this.bodyModels[var2], 0, 1151584293)) {
               hasBodyModel = false;
            }
         }

         return hasBodyModel;
      }
   }
}
