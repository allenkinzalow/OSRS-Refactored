import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class URLSession {

   static int anInt607;
   SessionRequest aClass85_608;
   DataInputStream aDataInputStream609;
   byte[] aByteArray610 = new byte[4];
   int anInt611;
   int anInt613;
   long aLong614;
   byte[] aByteArray616;
   int anInt618;
   static int anInt619;


   URLSession(SessionRequestWorker var1, URL var2) {
      this.aClass85_608 = var1.submitURLConnectionSession(var2, (short) 128);
      this.anInt618 = 0;
      this.aLong614 = (Timer.getCurrentTimeMillis(849846164) + 30000L) * 7909828926640958115L;
   }

   byte[] getByteData(byte var1) throws IOException {
      if(Timer.getCurrentTimeMillis(849846164) > this.aLong614 * -2717684605281117941L) {
         throw new IOException();
      } else {
         if(this.anInt618 * 230308155 == 0) {
            if(2 == this.aClass85_608.anInt1292) {
               throw new IOException();
            }

            if(1 == this.aClass85_608.anInt1292) {
               this.aDataInputStream609 = (DataInputStream)this.aClass85_608.connectionObject;
               this.anInt618 = 47200243;
            }
         }

         int var2;
         if(this.anInt618 * 230308155 == 1) {
            var2 = this.aDataInputStream609.available();
            if(var2 > 0) {
               if(this.anInt611 * -213046751 + var2 > 4) {
                  var2 = 4 - this.anInt611 * -213046751;
               }

               this.anInt611 += this.aDataInputStream609.read(this.aByteArray610, this.anInt611 * -213046751, var2) * -512173599;
               if(this.anInt611 * -213046751 == 4) {
                  int var3 = (new RSByteBuffer(this.aByteArray610)).readInt();
                  this.aByteArray616 = new byte[var3];
                  this.anInt618 = 94400486;
               }
            }
         }

         if(2 == this.anInt618 * 230308155) {
            var2 = this.aDataInputStream609.available();
            if(var2 > 0) {
               if(this.anInt613 * 870755821 + var2 > this.aByteArray616.length) {
                  var2 = this.aByteArray616.length - this.anInt613 * 870755821;
               }

               this.anInt613 += this.aDataInputStream609.read(this.aByteArray616, this.anInt613 * 870755821, var2) * -1017464859;
               if(this.aByteArray616.length == this.anInt613 * 870755821) {
                  return this.aByteArray616;
               }
            }
         }

         return null;
      }
   }

   public static int method653(int var0, int var1, int var2, int var3) {
      var2 &= 3;
      return var2 == 0?var1:(1 == var2?7 - var0:(var2 == 2?7 - var1:var0));
   }

   static final void method654(RSInterface var0, int var1, int var2, int var3, int var4, int var5, int var6, short var7) {
      if(Client.aBool2785) {
         Client.anInt2876 = -1376733408;
      } else {
         Client.anInt2876 = 0;
      }

      Client.aBool2785 = false;
      int var8;
      if(MouseInputHandler.anInt769 * 1251070677 == 1 || !Class100.aBool1391 && MouseInputHandler.anInt769 * 1251070677 == 4) {
         if(var5 >= var1 && var5 < 16 + var1 && var6 >= var2 && var6 < var2 + 16) {
            var0.scrollPosition += 870547396;
            MouseInputHandler.method775(var0, -16054773);
         } else if(var5 >= var1 && var5 < 16 + var1 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.scrollPosition -= 870547396;
            MouseInputHandler.method775(var0, -16054773);
         } else if(var5 >= var1 - Client.anInt2876 * -342560631 && var5 < Client.anInt2876 * -342560631 + 16 + var1 && var6 >= 16 + var2 && var6 < var2 + var3 - 16) {
            var8 = var3 * (var3 - 32) / var4;
            if(var8 < 8) {
               var8 = 8;
            }

            int var9 = var6 - var2 - 16 - var8 / 2;
            int var10 = var3 - 32 - var8; 
            var0.scrollPosition = (var4 - var3) * var9 / var10 * -1291378673;
            MouseInputHandler.method775(var0, -16054773);
            Client.aBool2785 = true;
         }
      }

      if(0 != Client.mouseWheelRotation * 1785327937) {
         var8 = var0.height * -1281443035;
         if(var5 >= var1 - var8) {
            if(var6 >= var2) {
               if(var5 < var1 + 16) {
                  if(var6 <= var2 + var3) {
                     var0.scrollPosition += Client.mouseWheelRotation * -1805664669;
                     MouseInputHandler.method775(var0, -16054773);
                  }
               }
            }
         }
      }
   }

   static void method655(int var0, int var1, int var2, int var3, int var4) {
      for(Class108_Sub6 var5 = (Class108_Sub6)Class108_Sub6.aClass105_1587.getFront(); var5 != null; var5 = (Class108_Sub6)Class108_Sub6.aClass105_1587.getNext()) {
         if(-1 != var5.anInt1601 * -2120283541 || var5.anIntArray1596 != null) {
            int var6 = 0;
            if(var1 > var5.anInt1592 * 1803785365) {
               var6 += var1 - var5.anInt1592 * 1803785365;
            } else if(var1 < var5.anInt1597 * 197103355) {
               var6 += var5.anInt1597 * 197103355 - var1;
            }

            if(var2 > var5.anInt1590 * 1697474585) {
               var6 += var2 - var5.anInt1590 * 1697474585;
            } else if(var2 < var5.anInt1588 * 1074447987) {
               var6 += var5.anInt1588 * 1074447987 - var2;
            }

            if(var6 - 64 <= var5.anInt1591 * -1934421145 && Client.anInt2940 * 769647509 != 0 && var5.anInt1586 * -798373671 == var0) {
               var6 -= 64;
               if(var6 < 0) {
                  var6 = 0;
               }

               int var7 = Client.anInt2940 * 769647509 * (var5.anInt1591 * -1934421145 - var6) / (var5.anInt1591 * -1934421145);
               if(var5.aClass108_Sub4_Sub2_1593 == null) {
                  if(var5.anInt1601 * -2120283541 >= 0) {
                     RSSoundEffect var8 = RSSoundEffect.getSoundEffect(RSSoundEffect.soundEffectsIndex_1, var5.anInt1601 * -2120283541, 0);
                     if(null != var8) {
                        Class108_Sub1_Sub1 var9 = var8.method104().method2555(GameObject.aClass19_2428);
                        Class108_Sub4_Sub2 var10 = Class108_Sub4_Sub2.method2365(var9, 100, var7);
                        var10.method2396(-1);
                        Class26.aClass108_Sub4_Sub1_352.method2050(var10);
                        var5.aClass108_Sub4_Sub2_1593 = var10;
                     }
                  }
               } else {
                  var5.aClass108_Sub4_Sub2_1593.method2368(var7);
               }

               if(null == var5.aClass108_Sub4_Sub2_1598) {
                  if(var5.anIntArray1596 != null && (var5.anInt1589 -= var3 * 690388241) * -1615064079 <= 0) {
                     int var12 = (int)(Math.random() * (double)var5.anIntArray1596.length);
                     RSSoundEffect var13 = RSSoundEffect.getSoundEffect(RSSoundEffect.soundEffectsIndex_1, var5.anIntArray1596[var12], 0);
                     if(var13 != null) {
                        Class108_Sub1_Sub1 var14 = var13.method104().method2555(GameObject.aClass19_2428);
                        Class108_Sub4_Sub2 var11 = Class108_Sub4_Sub2.method2365(var14, 100, var7);
                        var11.method2396(0);
                        Class26.aClass108_Sub4_Sub1_352.method2050(var11);
                        var5.aClass108_Sub4_Sub2_1598 = var11;
                        var5.anInt1589 = (var5.anInt1594 * 983197705 + (int)(Math.random() * (double)(var5.anInt1595 * -2112126659 - var5.anInt1594 * 983197705))) * 690388241;
                     }
                  }
               } else {
                  var5.aClass108_Sub4_Sub2_1598.method2368(var7);
                  if(!var5.aClass108_Sub4_Sub2_1598.hasPrevious()) {
                     var5.aClass108_Sub4_Sub2_1598 = null;
                  }
               }
            } else {
               if(null != var5.aClass108_Sub4_Sub2_1593) {
                  Class26.aClass108_Sub4_Sub1_352.method2037(var5.aClass108_Sub4_Sub2_1593);
                  var5.aClass108_Sub4_Sub2_1593 = null;
               }

               if(null != var5.aClass108_Sub4_Sub2_1598) {
                  Class26.aClass108_Sub4_Sub1_352.method2037(var5.aClass108_Sub4_Sub2_1598);
                  var5.aClass108_Sub4_Sub2_1598 = null;
               }
            }
         }
      }

   }

   static void initializeClient(int var0) {
      int var1;
      if(0 == Client.currentLoadingStep * -2390161) {
         Scene.gameScene = new Scene(4, 104, 104, RegionReference.tileHeights);

         for(var1 = 0; var1 < 4; ++var1) {
            Client.clippingPlanes[var1] = new CollisionMap(104, 104);
         }

         MiniMap.miniMapSprite = new RGBSprite(512, 512);
         PlayerLoginDetails.currentLoadingStatus = StringUtilities.PREPARE_GAME_ENGINE;
         PlayerLoginDetails.anInt52 = 2012125629;
         Client.currentLoadingStep = 966940460;
      } else {
         int var2;
         int var3;
         int var4;
         int var5;
         if(Client.currentLoadingStep * -2390161 == 20) {
            int[] var30 = new int[9];

            for(var2 = 0; var2 < 9; ++var2) {
               var3 = 15 + var2 * 32 + 128;
               var4 = var3 * 3 + 600;
               var5 = Rasterizer3D.SINE[var3];
               var30[var2] = var5 * var4 >> 16;
            }

            Scene.method476(var30, 500, 800, 512, 334);
            PlayerLoginDetails.currentLoadingStatus = StringUtilities.PREPARED_VISIBILTY_MAP;
            PlayerLoginDetails.anInt52 = -270716038;
            Client.currentLoadingStep = -697072958; 
         } else if(30 == Client.currentLoadingStep * -2390161) {
            Projectile.skeletonIndex = CacheIndex.initCacheIndex(0, false, true, true, -517502665);
            AnimationSkin.skinIndex = CacheIndex.initCacheIndex(1, false, true, true, -224103278);
            AbstractIndex.configIndex = CacheIndex.initCacheIndex(2, true, false, true, -868873085);
            OverlayFloorDefinition.interfaceIndex = CacheIndex.initCacheIndex(3, false, true, true, -377716183);
            RSSoundEffect.soundEffectsIndex_1 = CacheIndex.initCacheIndex(4, false, true, true, -1122417526);
            RegionReference.landscapeIndex = CacheIndex.initCacheIndex(5, true, true, true, -1364602569);
            Friend.musicIndex_1 = CacheIndex.initCacheIndex(6, true, true, false, -1649811484);
            Class47.modelIndex = CacheIndex.initCacheIndex(7, false, true, true, -1786151476);
            Class23.spriteIndex = CacheIndex.initCacheIndex(8, false, true, true, -1203260803);
            PlayerLoginDetails.textureIndex = CacheIndex.initCacheIndex(9, false, true, true, -1786660079);
            HuffmanEncoding.huffmanIndex = CacheIndex.initCacheIndex(10, false, true, true, -1850067732);
            ClientParameter.musicIndex_2 = CacheIndex.initCacheIndex(11, false, true, true, -596901743);
            Class108_Sub13.clientScriptIndex = CacheIndex.initCacheIndex(12, false, true, true, -2145575712);
            RSFont.fontIndex = CacheIndex.initCacheIndex(13, true, false, true, -1957495351);
            HuffmanEncoding.soundEffectsIndex_2 = CacheIndex.initCacheIndex(14, false, true, false, -1772317315);
            IsaacRandomGen.soundEffectsIndex_3 = CacheIndex.initCacheIndex(15, false, true, true, -483363239);
            PlayerLoginDetails.currentLoadingStatus = StringUtilities.CONNECTING_UPDATE_SERVER;
            PlayerLoginDetails.anInt52 = -541432076;
            Client.currentLoadingStep = 1933880920; 
         } else if(40 == Client.currentLoadingStep * -2390161) {
            byte var29 = 0;
            int loadIndexPercent = var29 + Projectile.skeletonIndex.method1899((byte)35) * 4 / 100;
            loadIndexPercent += AnimationSkin.skinIndex.method1899((byte)-3) * 4 / 100;
            loadIndexPercent += AbstractIndex.configIndex.method1899((byte)38) * 2 / 100;
            loadIndexPercent += OverlayFloorDefinition.interfaceIndex.method1899((byte)-30) * 2 / 100;
            loadIndexPercent += RSSoundEffect.soundEffectsIndex_1.method1899((byte)31) * 6 / 100;
            loadIndexPercent += RegionReference.landscapeIndex.method1899((byte)-51) * 4 / 100;
            loadIndexPercent += Friend.musicIndex_1.method1899((byte)28) * 2 / 100;
            loadIndexPercent += Class47.modelIndex.method1899((byte)-35) * 60 / 100;
            loadIndexPercent += Class23.spriteIndex.method1899((byte)79) * 2 / 100;
            loadIndexPercent += PlayerLoginDetails.textureIndex.method1899((byte)-13) * 2 / 100;
            loadIndexPercent += HuffmanEncoding.huffmanIndex.method1899((byte)42) * 2 / 100;
            loadIndexPercent += ClientParameter.musicIndex_2.method1899((byte)17) * 2 / 100;
            loadIndexPercent += Class108_Sub13.clientScriptIndex.method1899((byte)-31) * 2 / 100;
            loadIndexPercent += RSFont.fontIndex.method1899((byte)-5) * 2 / 100;
            loadIndexPercent += HuffmanEncoding.soundEffectsIndex_2.method1899((byte)-80) * 2 / 100;
            loadIndexPercent += IsaacRandomGen.soundEffectsIndex_3.method1899((byte)-89) * 2 / 100;
            if(100 != loadIndexPercent) {
               if(loadIndexPercent != 0) {
                  PlayerLoginDetails.currentLoadingStatus = StringUtilities.CHECK_UPDATES + loadIndexPercent + "%";
               }

               PlayerLoginDetails.anInt52 = -812148114;
            } else {
               PlayerLoginDetails.currentLoadingStatus = StringUtilities.LOADED_UPDATE_LIST;
               PlayerLoginDetails.anInt52 = -812148114;
               Client.currentLoadingStep = 1101874211;
            }
         } else if(Client.currentLoadingStep * -2390161 == 45) {
            Projectile.method2986(22050, !Client.lowMemory, 2, -2143336532);
            Class108_Sub4_Sub3 var28 = new Class108_Sub4_Sub3();
            var28.method2603(9, 128, (short)-16228);
            Class2.aClass7_17 = SoundEffectWorker.method284(ClientScriptMap.sessionRequestWorker, ContextMenuRow.aCanvas3, 0, 22050, -1059713629);
            Class2.aClass7_17.method117(var28, (byte)46);
            Entity.method2740(IsaacRandomGen.soundEffectsIndex_3, HuffmanEncoding.soundEffectsIndex_2, RSSoundEffect.soundEffectsIndex_1, var28, -685492007);
            Class50.aClass7_697 = SoundEffectWorker.method284(ClientScriptMap.sessionRequestWorker, ContextMenuRow.aCanvas3, 1, 2048, 1579217328);
            Class26.aClass108_Sub4_Sub1_352 = new Class108_Sub4_Sub1();
            Class50.aClass7_697.method117(Class26.aClass108_Sub4_Sub1_352, (byte)-45);
            GameObject.aClass19_2428 = new Class19(22050, Class7.anInt94 * -322018941);
            PlayerLoginDetails.currentLoadingStatus = StringUtilities.PREPARING_SOUND_ENGINE;
            PlayerLoginDetails.anInt52 = 1199977515;
            Client.currentLoadingStep = 269867502;
         } else {
            int fileID;
            CacheIndex var17;
            if(Client.currentLoadingStep * -2390161 == 50) {
               var1 = 0;
               RSFont loadedFont;
               CacheIndex var23;
               if(null == RSTypeFace.p11_full_font) {
                  var17 = Class23.spriteIndex;
                  var23 = RSFont.fontIndex;
                  var5 = var17.getArchiveIDForName("p11_full", 1723285154);
                  fileID = var17.getFileIDForName(var5, "");
                  loadedFont = ItemDefinition.loadFont(var17, var23, var5, fileID, 1102237653);
                  RSTypeFace.p11_full_font = loadedFont;
               } else {
                  ++var1;
               }

               if(null == ObjectDefinition.p12_full_font) {
                  var17 = Class23.spriteIndex;
                  var23 = RSFont.fontIndex;
                  var5 = var17.getArchiveIDForName("p12_full", 1723285154);
                  fileID = var17.getFileIDForName(var5, "");
                  loadedFont = ItemDefinition.loadFont(var17, var23, var5, fileID, 1541584219);
                  ObjectDefinition.p12_full_font = loadedFont;
               } else {
                  ++var1;
               }

               if(RSTypeFace.b12_full_font == null) {
                  var17 = Class23.spriteIndex;
                  var23 = RSFont.fontIndex;
                  var5 = var17.getArchiveIDForName("b12_full", 1723285154);
                  fileID = var17.getFileIDForName(var5, "");
                  loadedFont = ItemDefinition.loadFont(var17, var23, var5, fileID, 388816519);
                  RSTypeFace.b12_full_font = loadedFont;
               } else {
                  ++var1;
               }

               if(var1 < 3) {
                  PlayerLoginDetails.currentLoadingStatus = StringUtilities.LOADING_FONTS + var1 * 100 / 3 + "%";
                  PlayerLoginDetails.anInt52 = -1082864152;
               } else {
                  MachineInformation.aMachineInformation_1422 = new MachineInformation(true);
                  PlayerLoginDetails.currentLoadingStatus = StringUtilities.loading_fonts_2;
                  PlayerLoginDetails.anInt52 = -1082864152;
                  Client.currentLoadingStep = -1394145916;
               }
            } else {
               CacheIndex var15;
               if(60 == Client.currentLoadingStep * -2390161) {
                  var15 = HuffmanEncoding.huffmanIndex;
                  CacheIndex spriteIndexRef = Class23.spriteIndex;
                  var4 = 0;
                  if(var15.containsFileForAFName("title.jpg", "")) {
                     ++var4;
                  }

                  if(spriteIndexRef.containsFileForAFName("logo", "")) {
                     ++var4;
                  }

                  if(spriteIndexRef.containsFileForAFName("titlebox", "")) {
                     ++var4;
                  }

                  if(spriteIndexRef.containsFileForAFName("titlebutton", "")) {
                     ++var4;
                  }

                  if(spriteIndexRef.containsFileForAFName("runes", "")) {
                     ++var4;
                  }

                  if(spriteIndexRef.containsFileForAFName("title_mute", "")) {
                     ++var4;
                  }

                  if(spriteIndexRef.containsFileForEmptyArchiveName("options_radio_buttons,0")) {
                     ++var4;
                  }

                  if(spriteIndexRef.containsFileForEmptyArchiveName("options_radio_buttons,2")) {
                     ++var4;
                  }

                  spriteIndexRef.containsFileForAFName("sl_back", "");
                  spriteIndexRef.containsFileForAFName("sl_flags", "");
                  spriteIndexRef.containsFileForAFName("sl_arrows", "");
                  spriteIndexRef.containsFileForAFName("sl_stars", "");
                  spriteIndexRef.containsFileForAFName("sl_button", "");
                  var5 = ClientSettings.method636(-567828897);
                  if(var4 < var5) {
                     PlayerLoginDetails.currentLoadingStatus = StringUtilities.LOADING_TITLE_SCREEN + var4 * 100 / var5 + "%";
                     PlayerLoginDetails.anInt52 = -1353580190;
                  } else {
                     PlayerLoginDetails.currentLoadingStatus = StringUtilities.LOADED_TITLE_SCREEN;
                     PlayerLoginDetails.anInt52 = -1353580190;
                     IsaacRandomGen.method725(5, 1461889300);
                     Client.currentLoadingStep = 1236807962;
                  }
               } else if(70 == Client.currentLoadingStep * -2390161) {
                  if(!AbstractIndex.configIndex.loadArchive((byte)0)) {
                     PlayerLoginDetails.currentLoadingStatus = StringUtilities.loading_config + AbstractIndex.configIndex.getTotalCompletion(-1933073496) + "%";
                     PlayerLoginDetails.anInt52 = -1624296228;
                  } else {
                     Projectile.method2987(AbstractIndex.configIndex, 2132047014);
                     CacheIndex configIndex = AbstractIndex.configIndex;
                     UnderlayDefinition.aClass74_2147 = configIndex;
                     AnimationSkeletonSet.method2562(AbstractIndex.configIndex, Class47.modelIndex, -55235630);
                     Player.method3179(AbstractIndex.configIndex, Class47.modelIndex, Client.lowMemory, 1498802843);
                     Class9.method219(AbstractIndex.configIndex, Class47.modelIndex, 2070505710);
                     var15 = AbstractIndex.configIndex;
                     var17 = Class47.modelIndex;
                     boolean var18 = Client.aBool2710;
                     RSFont p11_reference = RSTypeFace.p11_full_font;
                     ItemDefinition.configIndexReference = var15;
                     ItemDefinition.modelIndexReference = var17;
                     ItemDefinition.aBool1974 = var18;
                     ItemDefinition.configIndexReference.getFileCount(10);
                     ItemDefinition.itemAmountFont = p11_reference;
                     CacheIndex var22 = AbstractIndex.configIndex;
                     CacheIndex skeletonIndex = Projectile.skeletonIndex;
                     CacheIndex skinIndex = AnimationSkin.skinIndex;
                     AnimationDefinition.configIndexReference = var22;
                     AnimationDefinition.skeletonIndexReference = skeletonIndex;
                     AnimationDefinition.skinIndexReference = skinIndex;
                     NPCDefinition.method2300(AbstractIndex.configIndex, Class47.modelIndex, -610787023);
                     Ignore.method399(AbstractIndex.configIndex, (byte)59);
                     Class2.method39(AbstractIndex.configIndex, 558494300);
                     CacheIndex var20 = OverlayFloorDefinition.interfaceIndex;
                     CacheIndex modelIndex = Class47.modelIndex;
                     CacheIndex spriteIndex = Class23.spriteIndex;
                     CacheIndex fontIndex = RSFont.fontIndex;
                     RSInterface.interfaceIndexReference = var20;
                     RSInterface.modelIndexRef_intermedia = modelIndex;
                     RSInterface.aClass74_1765 = spriteIndex;
                     VarpBit.aClass74_1954 = fontIndex;
                     RSInterface.interface_cache = new RSInterface[RSInterface.interfaceIndexReference.getArchiveCount()][];
                     RSInterface.interfacesLoadedArray = new boolean[RSInterface.interfaceIndexReference.getArchiveCount()];
                     CacheIndex var13 = AbstractIndex.configIndex;
                     Class108_Sub20_Sub3.configIndexReference = var13;
                     CacheIndex var14 = AbstractIndex.configIndex;
                     ClientScriptMap.configIndexReference = var14;

                     /*int amountToDump = configIndex.getFileCount(10);
                     PlayerLoginDetails.currentLoadingStatus = "Dumping " + amountToDump + " Item Sprites...";
                     System.out.println(System.getProperty("user.dir"));
                     for(int itemID = 0; itemID < 300; itemID++) {
                        RGBSprite itemSprite = ItemDefinition.getItemSprite(itemID, 1, 1, 0, false, 1256224427);
                        if(itemSprite == null)
                           continue;
                        BufferedImage image = itemSprite.getBufferedImage();
                        File dump = new File("./data/" + itemID + ".png");
                        try {
                           ImageIO.write(image, "png", dump);
                        } catch (IOException e) {
                           e.printStackTrace();
                        }
                        //System.out.println("Dumped Item Sprite: " + itemID);
                     }*/

                     PlayerLoginDetails.currentLoadingStatus = StringUtilities.loaded_config;
                     PlayerLoginDetails.anInt52 = -1624296228;
                     Client.currentLoadingStep = -427205456;
                  }
               } else if(Client.currentLoadingStep * -2390161 != 80) {
                  if(Client.currentLoadingStep * -2390161 == 90) {
                     if(!PlayerLoginDetails.textureIndex.loadArchive((byte)0)) {
                        PlayerLoginDetails.currentLoadingStatus = StringUtilities.LOADING_TEXTURES + PlayerLoginDetails.textureIndex.getTotalCompletion(-930110056) + "%";
                        PlayerLoginDetails.anInt52 = 1858522954;
                     } else {
                        TextureLoader var25 = new TextureLoader(PlayerLoginDetails.textureIndex, Class23.spriteIndex, 20, 0.8D, Client.lowMemory ? 64 : 128);
                        Rasterizer3D.method2975(var25);
                        Rasterizer3D.method2976(0.8D);
                        PlayerLoginDetails.currentLoadingStatus = StringUtilities.LOADED_TEXTURES;
                        PlayerLoginDetails.anInt52 = 1858522954;
                        Client.currentLoadingStep = -1124278414;
                     }
                  } else if(Client.currentLoadingStep * -2390161 == 110) {
                     MouseCapturer.mouseCapturer = new MouseCapturer();
                     ClientScriptMap.sessionRequestWorker.submitRunnableSession(MouseCapturer.mouseCapturer, 10, -1542608488);
                     PlayerLoginDetails.currentLoadingStatus = StringUtilities.aString1143;
                     PlayerLoginDetails.anInt52 = -1685737298;
                     Client.currentLoadingStep = 1506675464;
                  } else if(Client.currentLoadingStep * -2390161 == 120) {
                     if(!HuffmanEncoding.huffmanIndex.containsFileForAFName("huffman", "")) {
                        PlayerLoginDetails.currentLoadingStatus = StringUtilities.LOADING_WORDPACK + 0 + "%";
                        PlayerLoginDetails.anInt52 = 837099872;
                     } else {
                        HuffmanEncoding huffmanEncoding = new HuffmanEncoding(HuffmanEncoding.huffmanIndex.getFileForArchiveFileName("huffman", ""));
                        HuffmanEncoding.huffmanEncoding = huffmanEncoding;
                        PlayerLoginDetails.currentLoadingStatus = StringUtilities.LOADED_WORDPACK;
                        PlayerLoginDetails.anInt52 = 837099872;
                        Client.currentLoadingStep = -157337954;
                     }
                  } else if(Client.currentLoadingStep * -2390161 == 130) {
                     if(!OverlayFloorDefinition.interfaceIndex.loadArchive((byte)0)) {
                        PlayerLoginDetails.currentLoadingStatus = StringUtilities.LOADING_WIDGETS + OverlayFloorDefinition.interfaceIndex.getTotalCompletion(-1371113890) * 4 / 5 + "%";
                        PlayerLoginDetails.anInt52 = 1587806916;
                     } else if(!Class108_Sub13.clientScriptIndex.loadArchive((byte)0)) {
                        PlayerLoginDetails.currentLoadingStatus = StringUtilities.LOADING_WIDGETS + (80 + Class108_Sub13.clientScriptIndex.getTotalCompletion(-1578244141) / 6) + "%";
                        PlayerLoginDetails.anInt52 = 1587806916;
                     } else if(!RSFont.fontIndex.loadArchive((byte)0)) {
                        PlayerLoginDetails.currentLoadingStatus = StringUtilities.LOADING_WIDGETS + (96 + RSFont.fontIndex.getTotalCompletion(-2010012967) / 20) + "%";
                        PlayerLoginDetails.anInt52 = 1587806916;
                     } else { 
                        PlayerLoginDetails.currentLoadingStatus = StringUtilities.LOADED_WIDGETS;
                        PlayerLoginDetails.anInt52 = 1587806916;
                        Client.currentLoadingStep = -1821351372;
                     }
                  } else if(Client.currentLoadingStep * -2390161 == 140) {
                     IsaacRandomGen.method725(10, 1484506403);
                  }
               } else {
                  var1 = 0;
                  if(null == MiniMap.compassSprite) {
                     MiniMap.compassSprite = RGBSprite.getRGBSpriteForName(Class23.spriteIndex, "compass", "", 1534280704);
                  } else {
                     ++var1;
                  }

                  if(MiniMap.mapEdgeSprite == null) {
                     MiniMap.mapEdgeSprite = RGBSprite.getRGBSpriteForName(Class23.spriteIndex, "mapedge", "", 1534280704);
                  } else {
                     ++var1;
                  }

                  if(MiniMap.mapSceneIcons == null) {
                     MiniMap.mapSceneIcons = PaletteSprite.loadPaletteSpriteSet(Class23.spriteIndex, "mapscene", "", (byte) -93);
                  } else {
                     ++var1;
                  }

                  if(MiniMap.mapFunctionIcons == null) {
                     MiniMap.mapFunctionIcons = RGBSprite.loadRGBSpriteSetForNames(Class23.spriteIndex, "mapfunction", "", (short) 15254);
                  } else {
                     ++var1;
                  }

                  if(Client.hitmarkSprites == null) {
                     Client.hitmarkSprites = RGBSprite.loadRGBSpriteSetForNames(Class23.spriteIndex, "hitmarks", "", (short) -2282);
                  } else {
                     ++var1;
                  }

                  if(null == Wall.headIconSprites) {
                     Wall.headIconSprites = RGBSprite.loadRGBSpriteSetForNames(Class23.spriteIndex, "headicons_pk", "", (short) -28645);
                  } else {
                     ++var1;
                  }

                  if(null == Entity.headPrayerSprites) {
                     Entity.headPrayerSprites = RGBSprite.loadRGBSpriteSetForNames(Class23.spriteIndex, "headicons_prayer", "", (short) 93);
                  } else {
                     ++var1;
                  }

                  if(null == Entity.hintIconSprites) {
                     Entity.hintIconSprites = RGBSprite.loadRGBSpriteSetForNames(Class23.spriteIndex, "headicons_hint", "", (short) -138);
                  } else {
                     ++var1;
                  }

                  if(MiniMap.mapMarkerSprites == null) {
                     MiniMap.mapMarkerSprites = RGBSprite.loadRGBSpriteSetForNames(Class23.spriteIndex, "mapmarker", "", (short) 13167);
                  } else {
                     ++var1;
                  }

                  if(WallDecoration.crossSprites == null) {
                     WallDecoration.crossSprites = RGBSprite.loadRGBSpriteSetForNames(Class23.spriteIndex, "cross", "", (short) -18025);
                  } else {
                     ++var1;
                  }

                  if(MiniMap.mapDotSprites == null) {
                     MiniMap.mapDotSprites = RGBSprite.loadRGBSpriteSetForNames(Class23.spriteIndex, "mapdots", "", (short) -667);
                  } else {
                     ++var1;
                  }

                  if(IndexTable.scrollBarSprites == null) {
                     IndexTable.scrollBarSprites = PaletteSprite.loadPaletteSpriteSet(Class23.spriteIndex, "scrollbar", "", (byte) -5);
                  } else {
                     ++var1;
                  }

                  if(Projectile.crownSprites == null) {
                     Projectile.crownSprites = PaletteSprite.loadPaletteSpriteSet(Class23.spriteIndex, "mod_icons", "", (byte) -11);
                  } else {
                     ++var1;
                  }

                  if(null == MiniMap.mapBackSprite) {
                     MiniMap.mapBackSprite = PaletteSprite.getPaletteSpriteForName(Class23.spriteIndex, "mapback", "", (byte) 2);
                  } else {
                     ++var1;
                  }

                  if(var1 < 14) {
                     PlayerLoginDetails.currentLoadingStatus = StringUtilities.LOADING_SPRITES + var1 * 100 / 14 + "%";
                     PlayerLoginDetails.anInt52 = -1895012266;
                  } else {
                     RSTypeFace.iconImageSet = Projectile.crownSprites;
                     MiniMap.mapEdgeSprite.method2792();
                     var2 = (int)(Math.random() * 21.0D) - 10;
                     var3 = (int)(Math.random() * 21.0D) - 10;
                     var4 = (int)(Math.random() * 21.0D) - 10;
                     var5 = (int)(Math.random() * 41.0D) - 20;

                     for(int mapicon = 0; mapicon < MiniMap.mapFunctionIcons.length; ++mapicon) {
                        MiniMap.mapFunctionIcons[mapicon].alterColor(var2 + var5, var5 + var3, var5 + var4);
                     }

                     MiniMap.mapSceneIcons[0].mixPalette(var2 + var5, var5 + var3, var4 + var5);
                     Ignore.anIntArray397 = new int[33];
                     ChatMessagesContainer.anIntArray332 = new int[33];
                     OverlayFloorDefinition.anIntArray2221 = new int[151];
                     Varp.anIntArray2043 = new int[151];
                     fileID = 0;

                     int var6;
                     int var7;
                     int var10;
                     while(fileID < 33) {
                        var7 = 999;
                        var10 = 0;
                        var6 = 0;

                        while(true) {
                           if(var6 < 34) {
                              label521: {
                                 if(MiniMap.mapBackSprite.pixels[fileID * MiniMap.mapBackSprite.anInt2413 + var6] == 0) {
                                    if(999 == var7) {
                                       var7 = var6;
                                    }
                                 } else if(var7 != 999) {
                                    var10 = var6;
                                    break label521;
                                 }

                                 ++var6;
                                 continue;
                              }
                           }

                           Ignore.anIntArray397[fileID] = var7;
                           ChatMessagesContainer.anIntArray332[fileID] = var10 - var7;
                           ++fileID;
                           break;
                        }
                     }

                     fileID = 5;

                     while(fileID < 156) {
                        var7 = 999;
                        var10 = 0;
                        var6 = 25;

                        while(true) {
                           if(var6 < 172) {
                              label522: {
                                 if(MiniMap.mapBackSprite.pixels[fileID * MiniMap.mapBackSprite.anInt2413 + var6] == 0 && (var6 > 34 || fileID > 34)) {
                                    if(var7 == 999) {
                                       var7 = var6;
                                    }
                                 } else if(var7 != 999) {
                                    var10 = var6;
                                    break label522;
                                 }

                                 ++var6;
                                 continue;
                              }
                           }

                           OverlayFloorDefinition.anIntArray2221[fileID - 5] = var7 - 25;
                           Varp.anIntArray2043[fileID - 5] = var10 - var7;
                           ++fileID;
                           break;
                        }
                     }

                     PlayerLoginDetails.currentLoadingStatus = StringUtilities.LOADED_SPRITES;
                     PlayerLoginDetails.anInt52 = -1895012266;
                     Client.currentLoadingStep = -2091218874;
                  }
               }
            }
         }
      }
   }
}
