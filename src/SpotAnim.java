import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class SpotAnim extends CacheableNode {

   int resizeX = 1063384192;
   public static CacheableNodeMap spotAnimCache = new CacheableNodeMap(64);
   public static CacheableNodeMap spotAnimRasterizerMap = new CacheableNodeMap(30);
   short[] retextureToFind;
   short[] recolorToReplace;
   public int animationID = -2018612393;
   short[] recolorToFind;
   static AbstractIndex aClass74_2029;
   int ambient = 0;
   short[] retextureToReplace;
   int gfxID;
   int resizeY = 1782475648;
   int rotation = 0;
   int modelID;
   int contrast = 0;
   static GameConnection aGameConnection_2037;

   public static SpotAnim getSpotAnimForID(int spotAnimID, byte var1) {
      SpotAnim gfx = (SpotAnim) spotAnimCache.get((long) spotAnimID);
      if(null == gfx) {
         byte[] gfxData = aClass74_2029.getFile(13, spotAnimID, (byte) 7);
         gfx = new SpotAnim();
         gfx.gfxID = spotAnimID * 409213277;
         if(null != gfxData) {
            gfx.decode(new RSByteBuffer(gfxData), (short)2000);
         }

         spotAnimCache.put(gfx, (long) spotAnimID);
         return gfx;
      } else {
         return gfx;
      }
   }


   void decodeReadValues(RSByteBuffer buffer, int opcode, short var3) {
      if(1 == opcode) {
         this.modelID = buffer.readUShort(677228819) * -749621645;
      } else if(opcode == 2) {
         this.animationID = buffer.readUShort(186397237) * 2018612393;
      } else if(opcode == 4) {
         this.resizeX = buffer.readUShort(2105751761) * -1098988567;
      } else if(opcode == 5) {
         this.resizeY = buffer.readUShort(1201255550) * 1960082647;
      } else if(opcode == 6) {
         this.rotation = buffer.readUShort(1372627912) * 1158714527;
      } else if(7 == opcode) {
         this.ambient = buffer.readUByte() * 16173221;
      } else if(8 == opcode) {
         this.contrast = buffer.readUByte() * 1578004691;
      } else {
         int length;
         int index;
         if(opcode == 40) {
            length = buffer.readUByte();
            this.recolorToFind = new short[length];
            this.recolorToReplace = new short[length];

            for(index = 0; index < length; ++index) {
               this.recolorToFind[index] = (short)buffer.readUShort(752649136);
               this.recolorToReplace[index] = (short)buffer.readUShort(-420508325);
            }

         } else if(opcode == 41) {
            length = buffer.readUByte();
            this.retextureToFind = new short[length];
            this.retextureToReplace = new short[length];

            for(index = 0; index < length; ++index) {
               this.retextureToFind[index] = (short)buffer.readUShort(-1120583205);
               this.retextureToReplace[index] = (short)buffer.readUShort(-1801121443);
            }

         }
      }
   }

   public final ModelRasterizer getModelRasterizer(int var1, int var2) {
      ModelRasterizer rasterizer = (ModelRasterizer)spotAnimRasterizerMap.get((long)(this.gfxID * 1660224245));
      if(rasterizer == null) {
         RSModel model = RSModel.decodeModel(Class54.aClass74_734, this.modelID * 1982703291, 0);
         if(model == null) {
            return null;
         }

         int changeIndex;
         if(this.recolorToFind != null) {
            for(changeIndex = 0; changeIndex < this.recolorToFind.length; ++changeIndex) {
               model.findReplaceColor(this.recolorToFind[changeIndex], this.recolorToReplace[changeIndex]);
            }
         }

         if(this.retextureToFind != null) {
            for(changeIndex = 0; changeIndex < this.retextureToFind.length; ++changeIndex) {
               model.findReplaceTexture(this.retextureToFind[changeIndex], this.retextureToReplace[changeIndex]);
            }
         }

         rasterizer = model.createModelRasterizer(this.ambient * -305406163 + 64, 850 + this.contrast * 1963157339, -30, -50, -30);
         spotAnimRasterizerMap.put(rasterizer, (long)(this.gfxID * 1660224245));
      }

      ModelRasterizer modifiedRasterizer;
      if(-1 != this.animationID * 338579353 && -1 != var1) {
         modifiedRasterizer = AnimationDefinition.getAnimDefForID(this.animationID * 338579353, 1824710055).method2231(rasterizer, var1, 728619396);
      } else {
         modifiedRasterizer = rasterizer.method2907(true);
      }

      if(this.resizeX * -1874574247 != 128 || 128 != this.resizeY * 834811623) {
         modifiedRasterizer.method2866(this.resizeX * -1874574247, this.resizeY * 834811623, this.resizeX * -1874574247);
      }

      if(0 != this.rotation * 1541900127) {
         if(this.rotation * 1541900127 == 90) {
            modifiedRasterizer.rotate90();
         }

         if(180 == this.rotation * 1541900127) {
            modifiedRasterizer.rotate90();
            modifiedRasterizer.rotate90();
         }

         if(this.rotation * 1541900127 == 270) {
            modifiedRasterizer.rotate90();
            modifiedRasterizer.rotate90();
            modifiedRasterizer.rotate90();
         }
      }

      return modifiedRasterizer;
   }

   void decode(RSByteBuffer buffer, short var2) {
      while(true) {
         int opcode = buffer.readUByte();
         if(opcode == 0) {
            return;
         }

         this.decodeReadValues(buffer, opcode, (short)-7985);
      }
   }

   public static void method2137(String var0, boolean var1, boolean var2, byte var3) {
      if(!var1) {
         Class108_Sub13.openDocument(var0, 3, "openjs", 1913475607);
      } else {
         if(!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
               ;
            }
         }

         if(Class56.operatingSystem.startsWith("win") && !var2) {
            Class108_Sub13.openDocument(var0, 0, "openjs", -76807875);
         } else if(Class56.operatingSystem.startsWith("mac")) {
            Class108_Sub13.openDocument(var0, 1, "openjs", 397857714);
         } else {
            Class108_Sub13.openDocument(var0, 2, "openjs", 1248309380);
         }
      }
   }

   static final void method2148(NPCDefinition npcDef, int var1, int var2, int var3, int var4) {
      if(Client.menuActionRow * 391839991 < 400) {
         if(null != npcDef.anIntArray2185) {
            npcDef = npcDef.method2290(2122847973);
         }

         if(null != npcDef) {
            if(npcDef.isClickable) {
               if(!npcDef.aBool2190 || var1 == Client.anInt2789 * -1399758439) {
                  String var7 = npcDef.name;
                  if(npcDef.combatLevel * -1840374219 != 0) {
                     var7 = var7 + Class108_Sub13.method1702(npcDef.combatLevel * -1840374219, Player.myPlayer.combatLevel * -1769445007, -1429433422) + " " + Class47.OPEN_PAREN + StringUtilities.COMBAT_LEVEL + npcDef.combatLevel * -1840374219 + Class47.CLOSE_PAREN;
                  }

                  if(1 == Client.anInt2858 * -968945719) {
                     Class4.method91(StringUtilities.USE_OPTION, Client.aString2859 + " " + Class47.aString668 + " " + HuffmanEncoding.method690(16776960, -1747962050) + var7, 7, var1, var2, var3, 1892745466);
                  } else if(Client.aBool2881) {
                     if((Class68.anInt902 * 401025055 & 2) == 2) {
                        Class4.method91(Client.aString2941, Client.aString2819 + " " + Class47.aString668 + " " + HuffmanEncoding.method690(16776960, -1649201849) + var7, 8, var1, var2, var3, 1878248083);
                     }
                  } else {
                     String[] npcOptions = npcDef.options;
                     if(Client.aBool2744) {
                        npcOptions = Class23.method341(npcOptions, -33011240);
                     }

                     int optionIndex;
                     if(npcOptions != null) {
                        for(optionIndex = 4; optionIndex >= 0; --optionIndex) {
                           if(npcOptions[optionIndex] != null && !npcOptions[optionIndex].equalsIgnoreCase(StringUtilities.ATTACK_OPTION)) {
                              byte var5 = 0;
                              if(0 == optionIndex) {
                                 var5 = 9;
                              }

                              if(optionIndex == 1) {
                                 var5 = 10;
                              }

                              if(2 == optionIndex) {
                                 var5 = 11; 
                              }

                              if(3 == optionIndex) {
                                 var5 = 12;
                              }

                              if(4 == optionIndex) {
                                 var5 = 13;
                              }

                              Class4.method91(npcOptions[optionIndex], HuffmanEncoding.method690(16776960, -1431624152) + var7, var5, var1, var2, var3, 1885794417);
                           }
                        }
                     }

                     if(null != npcOptions) {
                        for(optionIndex = 4; optionIndex >= 0; --optionIndex) {
                           if(npcOptions[optionIndex] != null && npcOptions[optionIndex].equalsIgnoreCase(StringUtilities.ATTACK_OPTION)) {
                              short var10 = 0;
                              if(Class50.aClass50_701 == Client.aClass50_2733 || Class50.aClass50_698 == Client.aClass50_2733 && npcDef.combatLevel * -1840374219 > Player.myPlayer.combatLevel * -1769445007) {
                                 var10 = 2000;
                              }

                              int var9 = 0;
                              if(0 == optionIndex) {
                                 var9 = var10 + 9;
                              }

                              if(optionIndex == 1) {
                                 var9 = var10 + 10;
                              }

                              if(optionIndex == 2) {
                                 var9 = var10 + 11;
                              }

                              if(optionIndex == 3) {
                                 var9 = var10 + 12;
                              }

                              if(4 == optionIndex) {
                                 var9 = var10 + 13;
                              }

                              Class4.method91(npcOptions[optionIndex], HuffmanEncoding.method690(16776960, -997355682) + var7, var9, var1, var2, var3, 1856696720);
                           }
                        }
                     }

                     Class4.method91(StringUtilities.EXAMINE_OPTION, HuffmanEncoding.method690(16776960, -769408508) + var7, 1003, var1, var2, var3, 1961932451);
                  }
               }
            }
         }
      }
   }

   public static Varp method2149(int var0, byte var1) {
      Varp varp = (Varp)Varp.varpCacheMap.get((long)var0);
      if(null != varp) {
         return varp;
      } else {
         byte[] var3 = Class36.configIndex_ref.getFile(16, var0, (byte) 7);
         varp = new Varp();
         if(var3 != null) {
            varp.decode(new RSByteBuffer(var3), -1057715015);
         }

         Varp.varpCacheMap.put(varp, (long)var0);
         return varp;
      }
   }
}
