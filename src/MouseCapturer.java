import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

public class MouseCapturer implements Runnable {

   static MouseCapturer mouseCapturer;
   int coordIndex = 0;
   int[] coordsX = new int[500];
   int[] coordsY = new int[500];
   boolean isRunning = true;
   static int[] anIntArray382;
   static PaletteSprite[] musicMuteButton;
   Object objectLock = new Object();

   static void method1117() {
      if(Client.aBool2881) {
         RSInterface var1 = RSInterface.method878(URLSession.anInt607 * 550337065, Client.anInt2936 * 1150893973, 1596774930);
         if(null != var1 && var1.anObjectArray1773 != null) {
            ClientScript var2 = new ClientScript();
            var2.parentInterface = var1;
            var2.parameters = var1.anObjectArray1773;
            ClientScript.executeScript(var2, -1545456412);
         }

         Client.aBool2881 = false;
         MouseInputHandler.method775(var1, -16054773);
      }
   }

   static final void method298(ContextMenuRow var0, int var1, int var2, short var3) {
      processMenuClickAction(var0.menuXInteraction * 313474189, var0.menuYInteraction * 209465825, var0.menuIdentifier * -647975407, var0.menuParameters * -2100227435, var0.menuActionPrefixes, var0.menuActionPrefixes, var1, var2, -457306493);
   }


   public void run() {
      for(; this.isRunning; Class108_Sub22.sleep(50L)) {
         Object var1 = this.objectLock;
         synchronized(var1) {
            if(this.coordIndex * 649608097 < 500) {
               this.coordsX[this.coordIndex * 649608097] = MouseInputHandler.mouseX * -367052265;
               this.coordsY[this.coordIndex * 649608097] = MouseInputHandler.mouseY * 1533395117;
               this.coordIndex -= 1191679903;
            }
         }
      }

   }

   protected static final void method392(int var0, String var1, Color var2, int var3) {
      try {
         Graphics var4 = ContextMenuRow.aCanvas3.getGraphics();
         if(null == WallDecoration.aFont305) {
            WallDecoration.aFont305 = new Font("Helvetica", 1, 13);
            Ignore.aFontMetrics398 = ContextMenuRow.aCanvas3.getFontMetrics(WallDecoration.aFont305);
         }

         if(Applet_Sub1.aBool2688) {
            Applet_Sub1.aBool2688 = false;
            var4.setColor(Color.black);
            var4.fillRect(0, 0, ProducingGraphicsBuffer.clientWidth * 1080367531, ProducingGraphicsBuffer.clientHeight * -2030626229);
         }

         if(var2 == null) {
            var2 = new Color(140, 17, 17);
         }

         try {
            if(CullingCluster.anImage646 == null) {
               CullingCluster.anImage646 = ContextMenuRow.aCanvas3.createImage(304, 34);
            }

            Graphics var5 = CullingCluster.anImage646.getGraphics();
            var5.setColor(var2);
            var5.drawRect(0, 0, 303, 33);
            var5.fillRect(2, 2, var0 * 3, 30);
            var5.setColor(Color.black);
            var5.drawRect(1, 1, 301, 31);
            var5.fillRect(var0 * 3 + 2, 2, 300 - var0 * 3, 30);
            var5.setFont(WallDecoration.aFont305);
            var5.setColor(Color.white);
            var5.drawString(var1, (304 - Ignore.aFontMetrics398.stringWidth(var1)) / 2, 22);
            var4.drawImage(CullingCluster.anImage646, ProducingGraphicsBuffer.clientWidth * 1080367531 / 2 - 152, ProducingGraphicsBuffer.clientHeight * -2030626229 / 2 - 18, (ImageObserver)null);
         } catch (Exception var8) {
            int var6 = ProducingGraphicsBuffer.clientWidth * 1080367531 / 2 - 152;
            int var7 = ProducingGraphicsBuffer.clientHeight * -2030626229 / 2 - 18;
            var4.setColor(var2);
            var4.drawRect(var6, var7, 303, 33);
            var4.fillRect(var6 + 2, var7 + 2, var0 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var6 + 1, 1 + var7, 301, 31);
            var4.fillRect(var0 * 3 + 2 + var6, 2 + var7, 300 - var0 * 3, 30);
            var4.setFont(WallDecoration.aFont305);
            var4.setColor(Color.white);
            var4.drawString(var1, var6 + (304 - Ignore.aFontMetrics398.stringWidth(var1)) / 2, 22 + var7);
         }
      } catch (Exception var9) {
         ContextMenuRow.aCanvas3.repaint();
      }
   }

   static void method394(short var0) {
      Class26.chatMessageMap.clear();
      Class26.aClass95_348.method1204();
      Class26.aClass97_349.method1272();
      Class26.anInt356 = 0;
   }

   static final void processMenuClickAction(int var0, int var1, int action, int var3, String var4, String var5, int var6, int var7, int var8) {
      if(action >= 2000) {
         action -= 2000;
      }

      NPC var9;
      if(8 == action) {
         var9 = Client.localNPCs[var3];
         if(null != var9) {
            Client.anInt2810 = var6 * 366721763;
            Client.anInt2811 = var7 * 424609905;
            Client.anInt2813 = 1130026350;
            Client.anInt2829 = 0;
            Client.anInt2933 = var0 * -18058427;
            Client.anInt2894 = var1 * 1849977017;
            Client.secureBuffer.writePacket(61);
            Client.secureBuffer.writeInt(URLSession.anInt607 * 550337065);
            Client.secureBuffer.method1748(var3, 1231069106);
            Client.secureBuffer.method1748(Client.anInt2936 * 1150893973, 362745570);
            Client.secureBuffer.writeByteN(KeyFocusListener.aBoolArray895[82] ? 1 : 0, (byte) 1);
         }
      }

      Player var14;
      if(47 == action) {
         var14 = Client.localPlayers[var3];
         if(var14 != null) {
            Client.anInt2810 = var6 * 366721763;
            Client.anInt2811 = var7 * 424609905;
            Client.anInt2813 = 1130026350;
            Client.anInt2829 = 0;
            Client.anInt2933 = var0 * -18058427;
            Client.anInt2894 = var1 * 1849977017;
            Client.secureBuffer.writePacket(141);
            Client.secureBuffer.writeAShortLE(var3, (byte) -9);
            Client.secureBuffer.writeByte(KeyFocusListener.aBoolArray895[82] ? 1 : 0);
         }
      }

      if(7 == action) {
         var9 = Client.localNPCs[var3];
         if(null != var9) {
            Client.anInt2810 = var6 * 366721763;
            Client.anInt2811 = var7 * 424609905;
            Client.anInt2813 = 1130026350;
            Client.anInt2829 = 0;
            Client.anInt2933 = var0 * -18058427;
            Client.anInt2894 = var1 * 1849977017;
            Client.secureBuffer.writePacket(7);
            Client.secureBuffer.writeAShortLE(ClientScriptReference.anInt716 * 347376265, (byte) 40);
            Client.secureBuffer.method1748(var3, 1926022359);
            Client.secureBuffer.writeByteN(KeyFocusListener.aBoolArray895[82] ? 1 : 0, (byte) 1);
            Client.secureBuffer.method1856(Class50.anInt699 * -932350913, (short)-9226);
            Client.secureBuffer.method1749(GraphicsBuffer.anInt186 * 1933241883, -629923252);
         }
      }

      if(35 == action) {
         Client.secureBuffer.writePacket(166);
         Client.secureBuffer.writeAShortLE(var0, (byte) -24);
         Client.secureBuffer.writeInt(var1);
         Client.secureBuffer.method1748(var3, 633500188);
         Client.anInt2814 = 0;
         PlayerLoginDetails.aClass108_Sub17_75 = RSInterface.getInterfaceComponentForHash(var1, 313614678);
         Client.anInt2815 = var0 * 348736519;
      }

      if(34 == action) {
         Client.secureBuffer.writePacket(94);
         Client.secureBuffer.writeInt(var1);
         Client.secureBuffer.writeAShortLE(var0, (byte) 50);
         Client.secureBuffer.method1748(var3, 549911821);
         Client.anInt2814 = 0;
         PlayerLoginDetails.aClass108_Sub17_75 = RSInterface.getInterfaceComponentForHash(var1, -157109422);
         Client.anInt2815 = var0 * 348736519;
      }

      if(51 == action) {
         var14 = Client.localPlayers[var3];
         if(null != var14) {
            Client.anInt2810 = var6 * 366721763;
            Client.anInt2811 = var7 * 424609905;
            Client.anInt2813 = 1130026350;
            Client.anInt2829 = 0;
            Client.anInt2933 = var0 * -18058427;
            Client.anInt2894 = var1 * 1849977017;
            Client.secureBuffer.writePacket(179);
            Client.secureBuffer.method1749(var3, 23011369);
            Client.secureBuffer.writeByteN(KeyFocusListener.aBoolArray895[82] ? 1 : 0, (byte) 1);
         }
      }

      if(10 == action) {
         var9 = Client.localNPCs[var3];
         if(null != var9) {
            Client.anInt2810 = var6 * 366721763;
            Client.anInt2811 = var7 * 424609905;
            Client.anInt2813 = 1130026350;
            Client.anInt2829 = 0;
            Client.anInt2933 = var0 * -18058427;
            Client.anInt2894 = var1 * 1849977017;
            Client.secureBuffer.writePacket(4);
            Client.secureBuffer.writeAShortLE(var3, (byte) 25);
            Client.secureBuffer.writeByteN(KeyFocusListener.aBoolArray895[82] ? 1 : 0, (byte) 1);
         }
      }

      int var10;
      RSInterface var16;
      if(25 == action) {
         var16 = RSInterface.method878(var1, var0, 1652667486);
         if(var16 != null) {
            method1117();
            var10 = Class2.method41(Class32.method576(var16, 2018318857), -455189452);
            int var11 = var16.itemID * 703308511;
            RSInterface var12 = RSInterface.method878(var1, var0, 1557189892);
            if(null != var12 && var12.anObjectArray1849 != null) {
               ClientScript var13 = new ClientScript();
               var13.parentInterface = var12;
               var13.parameters = var12.anObjectArray1849;
               ClientScript.executeScript(var13, -1927772691);
            }

            Client.anInt2777 = var11 * 758271709;
            Client.aBool2881 = true;
            URLSession.anInt607 = var1 * -839073255;
            Client.anInt2936 = var0 * 362025917;
            Class68.anInt902 = var10 * 2015253471;
            MouseInputHandler.method775(var12, -16054773);
            Client.anInt2858 = 0;
            String var18;
            if(Class2.method41(Class32.method576(var16, 1329334005), 521131909) == 0) {
               var18 = null;
            } else if(null != var16.selectedActionName && var16.selectedActionName.trim().length() != 0) {
               var18 = var16.selectedActionName;
            } else {
               var18 = null;
            }

            Client.aString2941 = var18;
            if(Client.aString2941 == null) {
               Client.aString2941 = "Null";
            }

            if(var16.aBool1855) {
               Client.aString2819 = var16.aString1821 + HuffmanEncoding.method690(16777215, -429652547);
            } else {
               Client.aString2819 = HuffmanEncoding.method690('\uff00', -1531752159) + var16.spellName + HuffmanEncoding.method690(16777215, -1950040792);
            }
         }
      } else {
         if(action == 44) {
            var14 = Client.localPlayers[var3];
            if(var14 != null) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.anInt2933 = var0 * -18058427;
               Client.anInt2894 = var1 * 1849977017;
               Client.secureBuffer.writePacket(135);
               Client.secureBuffer.method1748(var3, 472841151);
               Client.secureBuffer.writeByte(KeyFocusListener.aBoolArray895[82] ? 1 : 0);
            }
         }

         if(action == 2) {
            Client.anInt2810 = var6 * 366721763;
            Client.anInt2811 = var7 * 424609905;
            Client.anInt2813 = 1130026350;
            Client.anInt2829 = 0;
            Client.anInt2933 = var0 * -18058427;
            Client.anInt2894 = var1 * 1849977017;
            Client.secureBuffer.writePacket(73);
            Client.secureBuffer.method1741(KeyFocusListener.aBoolArray895[82]?1:0, -63259956);
            Client.secureBuffer.method1856(URLSession.anInt607 * 550337065, (short)10992);
            Client.secureBuffer.writeShort(var3 >> 14 & 32767);
            Client.secureBuffer.method1748(var1 + SoundEffectWorker.anInt201 * -1743142671, 644872903);
            Client.secureBuffer.writeShort(Client.anInt2936 * 1150893973);
            Client.secureBuffer.method1749(var0 + Class100.anInt1388 * 263051377, -1889310408);
         }

         if(46 == action) {
            var14 = Client.localPlayers[var3];
            if(null != var14) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.anInt2933 = var0 * -18058427;
               Client.anInt2894 = var1 * 1849977017;
               Client.secureBuffer.writePacket(217);
               Client.secureBuffer.writeByte(KeyFocusListener.aBoolArray895[82] ? 1 : 0);
               Client.secureBuffer.writeShort(var3);
            }
         }

         if(action == 29) {
            Client.secureBuffer.writePacket(76);
            Client.secureBuffer.writeInt(var1);
            var16 = RSInterface.getInterfaceComponentForHash(var1, 1584549312);
            if(var16.opcodes != null && var16.opcodes[0][0] == 5) {
               var10 = var16.opcodes[0][1];
               if(Class88.configSettings[var10] != var16.conditionValues[0]) {
                  Class88.configSettings[var10] = var16.conditionValues[0];
                  CacheConstants.method1097(var10, (byte)-13);
               }
            }
         }

         if(6 == action) {
            Client.anInt2810 = var6 * 366721763;
            Client.anInt2811 = var7 * 424609905;
            Client.anInt2813 = 1130026350;
            Client.anInt2829 = 0;
            Client.anInt2933 = var0 * -18058427;
            Client.anInt2894 = var1 * 1849977017;
            Client.secureBuffer.writePacket(181);
            Client.secureBuffer.method1748(SoundEffectWorker.anInt201 * -1743142671 + var1, 1607608390);
            Client.secureBuffer.method1749(Class100.anInt1388 * 263051377 + var0, -1581910653);
            Client.secureBuffer.writeAShortLE(var3 >> 14 & 32767, (byte) 28);
            Client.secureBuffer.writeByte(KeyFocusListener.aBoolArray895[82] ? 1 : 0);
         }

         if(23 == action) {
            Scene.gameScene.method438(VarpBit.plane * -570926309, var0, var1);
         }

         if(action == 38) {
            method1117();
            var16 = RSInterface.getInterfaceComponentForHash(var1, 85390855);
            Client.anInt2858 = 145635961;
            ClientScriptReference.anInt716 = var0 * 368315321;
            Class50.anInt699 = var1 * 1367636927;
            GraphicsBuffer.anInt186 = var3 * 1301691411;
            MouseInputHandler.method775(var16, -16054773);
            Client.aString2859 = HuffmanEncoding.method690(16748608, -1314495165) + ItemDefinition.getItemDefinition(var3, -1261910875).name + HuffmanEncoding.method690(16777215, -1950959351);
            if(null == Client.aString2859) {
               Client.aString2859 = "null";
            }
         } else {
            if(16 == action) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.anInt2933 = var0 * -18058427;
               Client.anInt2894 = var1 * 1849977017;
               Client.secureBuffer.writePacket(121);
               Client.secureBuffer.method1748(Class100.anInt1388 * 263051377 + var0, 1790864214);
               Client.secureBuffer.writeAShortLE(SoundEffectWorker.anInt201 * -1743142671 + var1, (byte) -108);
               Client.secureBuffer.method1749(var3, 1691460253);
               Client.secureBuffer.writeByte(KeyFocusListener.aBoolArray895[82] ? 1 : 0);
               Client.secureBuffer.method1846(Class50.anInt699 * -932350913, 1138540527);
               Client.secureBuffer.writeShort(ClientScriptReference.anInt716 * 347376265);
               Client.secureBuffer.writeShort(GraphicsBuffer.anInt186 * 1933241883);
            }

            if(action == 20) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.anInt2933 = var0 * -18058427;
               Client.anInt2894 = var1 * 1849977017;
               Client.secureBuffer.writePacket(156);
               Client.secureBuffer.writeAShortLE(var3, (byte) 43);
               Client.secureBuffer.method1748(SoundEffectWorker.anInt201 * -1743142671 + var1, 1189055494);
               Client.secureBuffer.writeShort(var0 + Class100.anInt1388 * 263051377);
               Client.secureBuffer.method1739(KeyFocusListener.aBoolArray895[82]?1:0, (byte)64);
            }

            if(11 == action) {
               var9 = Client.localNPCs[var3];
               if(null != var9) {
                  Client.anInt2810 = var6 * 366721763;
                  Client.anInt2811 = var7 * 424609905;
                  Client.anInt2813 = 1130026350;
                  Client.anInt2829 = 0;
                  Client.anInt2933 = var0 * -18058427;
                  Client.anInt2894 = var1 * 1849977017;
                  Client.secureBuffer.writePacket(240);
                  Client.secureBuffer.writeAShortLE(var3, (byte) 33);
                  Client.secureBuffer.method1739(KeyFocusListener.aBoolArray895[82]?1:0, (byte)64);
               }
            }

            if(action == 36) {
               Client.secureBuffer.writePacket(214);
               Client.secureBuffer.method1846(var1, 1124162814);
               Client.secureBuffer.writeAShortLE(var3, (byte) 40);
               Client.secureBuffer.writeShort(var0);
               Client.anInt2814 = 0;
               PlayerLoginDetails.aClass108_Sub17_75 = RSInterface.getInterfaceComponentForHash(var1, -1100246226);
               Client.anInt2815 = var0 * 348736519;
            }

            if(1 == action) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.anInt2933 = var0 * -18058427;
               Client.anInt2894 = var1 * 1849977017;
               Client.secureBuffer.writePacket(75);
               Client.secureBuffer.method1748(GraphicsBuffer.anInt186 * 1933241883, 680629541);
               Client.secureBuffer.writeShort(ClientScriptReference.anInt716 * 347376265);
               Client.secureBuffer.method1749(Class100.anInt1388 * 263051377 + var0, -1306402772);
               Client.secureBuffer.method1756(Class50.anInt699 * -932350913, -1833483696);
               Client.secureBuffer.writeAShortLE(var1 + SoundEffectWorker.anInt201 * -1743142671, (byte) -72);
               Client.secureBuffer.writeByte(KeyFocusListener.aBoolArray895[82] ? 1 : 0);
               Client.secureBuffer.method1749(var3 >> 14 & 32767, 1097899835);
            }

            if(action == 50) {
               var14 = Client.localPlayers[var3];
               if(var14 != null) {
                  Client.anInt2810 = var6 * 366721763;
                  Client.anInt2811 = var7 * 424609905;
                  Client.anInt2813 = 1130026350;
                  Client.anInt2829 = 0;
                  Client.anInt2933 = var0 * -18058427;
                  Client.anInt2894 = var1 * 1849977017;
                  Client.secureBuffer.writePacket(82);
                  Client.secureBuffer.method1749(var3, 898036361);
                  Client.secureBuffer.writeByte(KeyFocusListener.aBoolArray895[82] ? 1 : 0);
               }
            }

            if(action == 17) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.anInt2933 = var0 * -18058427;
               Client.anInt2894 = var1 * 1849977017;
               Client.secureBuffer.writePacket(102);
               Client.secureBuffer.writeShort(Client.anInt2936 * 1150893973);
               Client.secureBuffer.method1749(var3, -150877459);
               Client.secureBuffer.writeShort(SoundEffectWorker.anInt201 * -1743142671 + var1);
               Client.secureBuffer.method1846(URLSession.anInt607 * 550337065, -692938648);
               Client.secureBuffer.method1739(KeyFocusListener.aBoolArray895[82]?1:0, (byte)64);
               Client.secureBuffer.method1749(var0 + Class100.anInt1388 * 263051377, -1021378590);
            }

            if(21 == action) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.anInt2933 = var0 * -18058427;
               Client.anInt2894 = var1 * 1849977017;
               Client.secureBuffer.writePacket(198);
               Client.secureBuffer.method1749(var3, -505699973);
               Client.secureBuffer.method1748(SoundEffectWorker.anInt201 * -1743142671 + var1, 747659863);
               Client.secureBuffer.writeByte(KeyFocusListener.aBoolArray895[82] ? 1 : 0);
               Client.secureBuffer.method1748(var0 + Class100.anInt1388 * 263051377, 1053772673);
            }

            if(action == 19) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.anInt2933 = var0 * -18058427;
               Client.anInt2894 = var1 * 1849977017;
               Client.secureBuffer.writePacket(37);
               Client.secureBuffer.writeByte(KeyFocusListener.aBoolArray895[82] ? 1 : 0);
               Client.secureBuffer.method1748(var0 + Class100.anInt1388 * 263051377, 414512284);
               Client.secureBuffer.writeShort(SoundEffectWorker.anInt201 * -1743142671 + var1);
               Client.secureBuffer.writeShort(var3);
            }

            if(48 == action) {
               var14 = Client.localPlayers[var3];
               if(var14 != null) {
                  Client.anInt2810 = var6 * 366721763;
                  Client.anInt2811 = var7 * 424609905;
                  Client.anInt2813 = 1130026350;
                  Client.anInt2829 = 0;
                  Client.anInt2933 = var0 * -18058427;
                  Client.anInt2894 = var1 * 1849977017;
                  Client.secureBuffer.writePacket(115);
                  Client.secureBuffer.method1741(KeyFocusListener.aBoolArray895[82]?1:0, 2087413390);
                  Client.secureBuffer.method1749(var3, 952542646);
               }
            }

            if(1002 == action) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.secureBuffer.writePacket(108);
               Client.secureBuffer.writeShort(var3 >> 14 & 32767);
            }

            if(action == 1005) {
               var16 = RSInterface.getInterfaceComponentForHash(var1, 1369089814);
               if(var16 != null && var16.widgetItemAmounts[var0] >= 100000) {
                  ChatMessagesContainer.pushMessage(27, "", var16.widgetItemAmounts[var0] + " x " + ItemDefinition.getItemDefinition(var3, -1527750240).name, -796549522);
               } else {
                  Client.secureBuffer.writePacket(138);
                  Client.secureBuffer.writeAShortLE(var3, (byte) 121);
               }

               Client.anInt2814 = 0;
               PlayerLoginDetails.aClass108_Sub17_75 = RSInterface.getInterfaceComponentForHash(var1, 301935455);
               Client.anInt2815 = var0 * 348736519;
            }

            if(action == 45) {
               var14 = Client.localPlayers[var3];
               if(var14 != null) {
                  Client.anInt2810 = var6 * 366721763;
                  Client.anInt2811 = var7 * 424609905;
                  Client.anInt2813 = 1130026350;
                  Client.anInt2829 = 0;
                  Client.anInt2933 = var0 * -18058427;
                  Client.anInt2894 = var1 * 1849977017;
                  Client.secureBuffer.writePacket(36);
                  Client.secureBuffer.method1748(var3, 2134316941);
                  Client.secureBuffer.method1741(KeyFocusListener.aBoolArray895[82]?1:0, 2117999352);
               }
            }

            if(action == 13) {
               var9 = Client.localNPCs[var3];
               if(null != var9) {
                  Client.anInt2810 = var6 * 366721763;
                  Client.anInt2811 = var7 * 424609905;
                  Client.anInt2813 = 1130026350;
                  Client.anInt2829 = 0;
                  Client.anInt2933 = var0 * -18058427;
                  Client.anInt2894 = var1 * 1849977017;
                  Client.secureBuffer.writePacket(224);
                  Client.secureBuffer.method1739(KeyFocusListener.aBoolArray895[82]?1:0, (byte)64);
                  Client.secureBuffer.method1748(var3, 1127457387);
               }
            }

            if(58 == action) {
               var16 = RSInterface.method878(var1, var0, 1645722285);
               if(var16 != null) {
                  Client.secureBuffer.writePacket(95);
                  Client.secureBuffer.method1749(Client.anInt2936 * 1150893973, -891314067);
                  Client.secureBuffer.method1846(URLSession.anInt607 * 550337065, 75023682);
                  Client.secureBuffer.writeInt(var1);
                  Client.secureBuffer.writeAShortLE(var16.itemID * 703308511, (byte) 82);
                  Client.secureBuffer.method1748(var0, 2020925017);
                  Client.secureBuffer.method1748(Client.anInt2777 * 87161205, 558371845);
               }
            }

            if(action == 9) {
               var9 = Client.localNPCs[var3];
               if(null != var9) {
                  Client.anInt2810 = var6 * 366721763;
                  Client.anInt2811 = var7 * 424609905;
                  Client.anInt2813 = 1130026350;
                  Client.anInt2829 = 0;
                  Client.anInt2933 = var0 * -18058427;
                  Client.anInt2894 = var1 * 1849977017;
                  Client.secureBuffer.writePacket(53);
                  Client.secureBuffer.method1748(var3, 1528156717);
                  Client.secureBuffer.method1741(KeyFocusListener.aBoolArray895[82]?1:0, 180180259);
               }
            }

            if(action == 14) {
               var14 = Client.localPlayers[var3];
               if(var14 != null) {
                  Client.anInt2810 = var6 * 366721763;
                  Client.anInt2811 = var7 * 424609905;
                  Client.anInt2813 = 1130026350;
                  Client.anInt2829 = 0;
                  Client.anInt2933 = var0 * -18058427;
                  Client.anInt2894 = var1 * 1849977017;
                  Client.secureBuffer.writePacket(189);
                  Client.secureBuffer.writeAShortLE(var3, (byte) 81);
                  Client.secureBuffer.writeByteN(KeyFocusListener.aBoolArray895[82] ? 1 : 0, (byte) 1);
                  Client.secureBuffer.method1846(Class50.anInt699 * -932350913, 1425634725);
                  Client.secureBuffer.method1749(ClientScriptReference.anInt716 * 347376265, -229664252);
                  Client.secureBuffer.method1749(GraphicsBuffer.anInt186 * 1933241883, 1833666005);
               }
            }

            if(action == 57 || 1007 == action) {
               var16 = RSInterface.method878(var1, var0, 2027572823);
               if(null != var16) {
                  GraphicsBuffer.method279(var3, var1, var0, var16.itemID * 703308511, var5, (byte)1);
               }
            }

            if(action == 30 && null == Client.aClass108_Sub17_2869) {
               Client.secureBuffer.writePacket(250);
               Client.secureBuffer.writeInt(var1);
               Client.secureBuffer.writeAShortLE(var0, (byte) -50);
               Client.aClass108_Sub17_2869 = RSInterface.method878(var1, var0, 1913423174);
               MouseInputHandler.method775(Client.aClass108_Sub17_2869, -16054773);
            }

            if(action == 18) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.anInt2933 = var0 * -18058427;
               Client.anInt2894 = var1 * 1849977017;
               Client.secureBuffer.writePacket(173);
               Client.secureBuffer.method1739(KeyFocusListener.aBoolArray895[82]?1:0, (byte)64);
               Client.secureBuffer.writeShort(SoundEffectWorker.anInt201 * -1743142671 + var1);
               Client.secureBuffer.method1748(var0 + Class100.anInt1388 * 263051377, 1900636204);
               Client.secureBuffer.writeAShortLE(var3, (byte) -36);
            }

            if(12 == action) {
               var9 = Client.localNPCs[var3];
               if(var9 != null) {
                  Client.anInt2810 = var6 * 366721763;
                  Client.anInt2811 = var7 * 424609905;
                  Client.anInt2813 = 1130026350;
                  Client.anInt2829 = 0;
                  Client.anInt2933 = var0 * -18058427;
                  Client.anInt2894 = var1 * 1849977017;
                  Client.secureBuffer.writePacket(86);
                  Client.secureBuffer.writeByte(KeyFocusListener.aBoolArray895[82] ? 1 : 0);
                  Client.secureBuffer.writeAShortLE(var3, (byte) -30);
               }
            }

            if(action == 39) {
               Client.secureBuffer.writePacket(45);
               Client.secureBuffer.writeAShortLE(var3, (byte) -21);
               Client.secureBuffer.writeShort(var0);
               Client.secureBuffer.writeInt(var1);
               Client.anInt2814 = 0;
               PlayerLoginDetails.aClass108_Sub17_75 = RSInterface.getInterfaceComponentForHash(var1, -1288459718);
               Client.anInt2815 = var0 * 348736519;
            }

            if(action == 1003) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               var9 = Client.localNPCs[var3];
               if(null != var9) {
                  NPCDefinition var15 = var9.definition;
                  if(null != var15.anIntArray2185) {
                     var15 = var15.method2290(1167855165);
                  }

                  if(null != var15) {
                     Client.secureBuffer.writePacket(210);
                     Client.secureBuffer.writeShort(var15.npcID * 140673707);
                  }
               }
            }

            if(4 == action) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.anInt2933 = var0 * -18058427;
               Client.anInt2894 = var1 * 1849977017;
               Client.secureBuffer.writePacket(21);
               Client.secureBuffer.method1739(KeyFocusListener.aBoolArray895[82]?1:0, (byte)64);
               Client.secureBuffer.writeShort(var0 + Class100.anInt1388 * 263051377);
               Client.secureBuffer.writeShort(var3 >> 14 & 32767);
               Client.secureBuffer.method1749(SoundEffectWorker.anInt201 * -1743142671 + var1, -1496871258);
            }

            if(31 == action) {
               Client.secureBuffer.writePacket(197);
               Client.secureBuffer.method1748(var3, 2053735188);
               Client.secureBuffer.method1856(Class50.anInt699 * -932350913, (short)7608);
               Client.secureBuffer.method1756(var1, -1927771435);
               Client.secureBuffer.writeShort(GraphicsBuffer.anInt186 * 1933241883);
               Client.secureBuffer.writeAShortLE(ClientScriptReference.anInt716 * 347376265, (byte) -78);
               Client.secureBuffer.writeShort(var0);
               Client.anInt2814 = 0;
               PlayerLoginDetails.aClass108_Sub17_75 = RSInterface.getInterfaceComponentForHash(var1, -574993050);
               Client.anInt2815 = var0 * 348736519;
            }

            if(49 == action) {
               var14 = Client.localPlayers[var3];
               if(var14 != null) {
                  Client.anInt2810 = var6 * 366721763;
                  Client.anInt2811 = var7 * 424609905;
                  Client.anInt2813 = 1130026350;
                  Client.anInt2829 = 0;
                  Client.anInt2933 = var0 * -18058427;
                  Client.anInt2894 = var1 * 1849977017;
                  Client.secureBuffer.writePacket(62);
                  Client.secureBuffer.method1748(var3, 130069191);
                  Client.secureBuffer.method1741(KeyFocusListener.aBoolArray895[82]?1:0, 1856833355);
               }
            }

            if(15 == action) {
               var14 = Client.localPlayers[var3];
               if(null != var14) {
                  Client.anInt2810 = var6 * 366721763;
                  Client.anInt2811 = var7 * 424609905;
                  Client.anInt2813 = 1130026350;
                  Client.anInt2829 = 0;
                  Client.anInt2933 = var0 * -18058427;
                  Client.anInt2894 = var1 * 1849977017;
                  Client.secureBuffer.writePacket(243);
                  Client.secureBuffer.writeInt(URLSession.anInt607 * 550337065);
                  Client.secureBuffer.writeByte(KeyFocusListener.aBoolArray895[82] ? 1 : 0);
                  Client.secureBuffer.method1748(var3, 1189777157);
                  Client.secureBuffer.writeShort(Client.anInt2936 * 1150893973);
               }
            }

            if(action == 40) {
               Client.secureBuffer.writePacket(192);
               Client.secureBuffer.method1846(var1, 48492867);
               Client.secureBuffer.writeShort(var0);
               Client.secureBuffer.writeShort(var3);
               Client.anInt2814 = 0;
               PlayerLoginDetails.aClass108_Sub17_75 = RSInterface.getInterfaceComponentForHash(var1, -441282165);
               Client.anInt2815 = var0 * 348736519;
            }

            if(1004 == action) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.secureBuffer.writePacket(138);
               Client.secureBuffer.writeAShortLE(var3, (byte) 17);
            }

            if(action == 5) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.anInt2933 = var0 * -18058427;
               Client.anInt2894 = var1 * 1849977017;
               Client.secureBuffer.writePacket(200);
               Client.secureBuffer.method1749(var1 + SoundEffectWorker.anInt201 * -1743142671, 2074979363);
               Client.secureBuffer.writeShort(Class100.anInt1388 * 263051377 + var0);
               Client.secureBuffer.method1741(KeyFocusListener.aBoolArray895[82]?1:0, -1376015126);
               Client.secureBuffer.writeAShortLE(var3 >> 14 & 32767, (byte) 102);
            }

            if(action == 32) {
               Client.secureBuffer.writePacket(106);
               Client.secureBuffer.writeAShortLE(var3, (byte) -85);
               Client.secureBuffer.writeInt(URLSession.anInt607 * 550337065);
               Client.secureBuffer.method1856(var1, (short)12988);
               Client.secureBuffer.method1748(var0, 2031611315);
               Client.secureBuffer.writeShort(Client.anInt2936 * 1150893973);
               Client.anInt2814 = 0;
               PlayerLoginDetails.aClass108_Sub17_75 = RSInterface.getInterfaceComponentForHash(var1, 132181058);
               Client.anInt2815 = var0 * 348736519;
            }

            if(action == 41) {
               Client.secureBuffer.writePacket(134);
               Client.secureBuffer.writeAShortLE(var3, (byte) 33);
               Client.secureBuffer.method1856(var1, (short)16036);
               Client.secureBuffer.method1749(var0, -1438123625);
               Client.anInt2814 = 0;
               PlayerLoginDetails.aClass108_Sub17_75 = RSInterface.getInterfaceComponentForHash(var1, 1810241022);
               Client.anInt2815 = var0 * 348736519;
            }

            if(action == 37) {
               Client.secureBuffer.writePacket(154);
               Client.secureBuffer.method1748(var3, 559777971);
               Client.secureBuffer.method1756(var1, -1928840621);
               Client.secureBuffer.writeShort(var0);
               Client.anInt2814 = 0;
               PlayerLoginDetails.aClass108_Sub17_75 = RSInterface.getInterfaceComponentForHash(var1, 460391601);
               Client.anInt2815 = var0 * 348736519;
            }

            if(action == 1001) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.anInt2933 = var0 * -18058427;
               Client.anInt2894 = var1 * 1849977017;
               Client.secureBuffer.writePacket(47);
               Client.secureBuffer.writeAShortLE(Class100.anInt1388 * 263051377 + var0, (byte) -52);
               Client.secureBuffer.writeAShortLE(SoundEffectWorker.anInt201 * -1743142671 + var1, (byte) -55);
               Client.secureBuffer.writeShort(var3 >> 14 & 32767);
               Client.secureBuffer.writeByte(KeyFocusListener.aBoolArray895[82] ? 1 : 0);
            }

            if(22 == action) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.anInt2933 = var0 * -18058427;
               Client.anInt2894 = var1 * 1849977017;
               Client.secureBuffer.writePacket(206);
               Client.secureBuffer.method1748(var1 + SoundEffectWorker.anInt201 * -1743142671, 1536319643);
               Client.secureBuffer.method1749(Class100.anInt1388 * 263051377 + var0, 435245811);
               Client.secureBuffer.method1739(KeyFocusListener.aBoolArray895[82]?1:0, (byte)64);
               Client.secureBuffer.writeAShortLE(var3, (byte) 24);
            }

            if(24 == action) {
               var16 = RSInterface.getInterfaceComponentForHash(var1, -665063327);
               boolean var17 = true;
               if(var16.anInt1886 * -917776085 > 0) {
                  var17 = Js5Request.method2601(var16, 2038053305);
               }

               if(var17) {
                  Client.secureBuffer.writePacket(76);
                  Client.secureBuffer.writeInt(var1);
               }
            }

            if(3 == action) {
               Client.anInt2810 = var6 * 366721763;
               Client.anInt2811 = var7 * 424609905;
               Client.anInt2813 = 1130026350;
               Client.anInt2829 = 0;
               Client.anInt2933 = var0 * -18058427;
               Client.anInt2894 = var1 * 1849977017;
               Client.secureBuffer.writePacket(19);
               Client.secureBuffer.writeByte(KeyFocusListener.aBoolArray895[82] ? 1 : 0);
               Client.secureBuffer.writeAShortLE(var3 >> 14 & 32767, (byte) 95);
               Client.secureBuffer.writeShort(var1 + SoundEffectWorker.anInt201 * -1743142671);
               Client.secureBuffer.method1748(var0 + Class100.anInt1388 * 263051377, 779398760);
            }

            if(33 == action) {
               Client.secureBuffer.writePacket(150);
               Client.secureBuffer.method1748(var3, 124066371);
               Client.secureBuffer.writeShort(var0);
               Client.secureBuffer.method1756(var1, -2053811755);
               Client.anInt2814 = 0;
               PlayerLoginDetails.aClass108_Sub17_75 = RSInterface.getInterfaceComponentForHash(var1, 1994956264);
               Client.anInt2815 = var0 * 348736519;
            }

            if(42 == action) {
               Client.secureBuffer.writePacket(241);
               Client.secureBuffer.method1748(var0, 1255470738);
               Client.secureBuffer.method1756(var1, -2063254425);
               Client.secureBuffer.writeShort(var3);
               Client.anInt2814 = 0;
               PlayerLoginDetails.aClass108_Sub17_75 = RSInterface.getInterfaceComponentForHash(var1, 1577880397);
               Client.anInt2815 = var0 * 348736519;
            }

            if(26 == action) {
               Class108_Sub12.method1690(262144);
            }

            if(action == 43) {
               Client.secureBuffer.writePacket(255);
               Client.secureBuffer.writeShort(var3);
               Client.secureBuffer.writeAShortLE(var0, (byte) -14);
               Client.secureBuffer.method1856(var1, (short)23622);
               Client.anInt2814 = 0;
               PlayerLoginDetails.aClass108_Sub17_75 = RSInterface.getInterfaceComponentForHash(var1, -523205181);
               Client.anInt2815 = var0 * 348736519;
            }

            if(28 == action) {
               Client.secureBuffer.writePacket(76);
               Client.secureBuffer.writeInt(var1);
               var16 = RSInterface.getInterfaceComponentForHash(var1, 1644616497);
               if(var16.opcodes != null && 5 == var16.opcodes[0][0]) {
                  var10 = var16.opcodes[0][1];
                  Class88.configSettings[var10] = 1 - Class88.configSettings[var10];
                  CacheConstants.method1097(var10, (byte)-110);
               }
            }

            if(Client.anInt2858 * -968945719 != 0) {
               Client.anInt2858 = 0;
               MouseInputHandler.method775(RSInterface.getInterfaceComponentForHash(Class50.anInt699 * -932350913, -392227452), -16054773);
            }

            if(Client.aBool2881) {
               method1117();
            }

            if(PlayerLoginDetails.aClass108_Sub17_75 != null) {
               if(Client.anInt2814 * 1648294801 == 0) {
                  MouseInputHandler.method775(PlayerLoginDetails.aClass108_Sub17_75, -16054773);
               }
            }
         }
      }
   }

}
