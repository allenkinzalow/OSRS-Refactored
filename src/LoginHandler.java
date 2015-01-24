import java.awt.*;
import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.util.Arrays;
import java.util.Iterator;

public class LoginHandler {

	static int anInt837 = 0;
	static int anInt838 = 0;
	static byte[][] aByteArrayArray839 = new byte[1000][];
	static byte[][] aByteArrayArray840 = new byte[250][];
	public static char aChar841;
	static int[] blendedHueDivisor;
	protected static boolean focusGained;
	static int anInt845 = 0;
	static byte[][] aByteArrayArray846 = new byte[50][];
	static BigInteger rsaExponent = new BigInteger("10001", 16);
	static BigInteger rsaModulus = new BigInteger("aead8fe7a0e8b2255e84597f391815600a4e02746698fea7bfe1b20b5a1f7ba47a2d9af413facda26925eafa2f7be93e3354d67a1210bf67beec2251eafacfe7a819be666c900843421e009ec16529131893fba57528dab31ff64013cdabc00c35e832ada7da6aca3d8cd18100fe79f2133c07be414142d8ba636d49f30b25cb", 16);


	public static RSInterface method878(int var0, int var1, int var2) {
		RSInterface var3 = RSInterface.getInterfaceComponentForHash(var0, 2146838109);
		return var1 == -1 ? var3 : (null != var3 && null != var3.aClass108_Sub17Array1879 && var1 < var3.aClass108_Sub17Array1879.length ? var3.aClass108_Sub17Array1879[var1] : null);
	}

	static synchronized byte[] method879(int var0, byte var1) {
		byte[] var2;
		if (100 == var0 && anInt845 * 703977321 > 0) {
			var2 = aByteArrayArray839[(anInt845 -= 1389635801) * 703977321];
			aByteArrayArray839[anInt845 * 703977321] = null;
			return var2;
		} else if (var0 == 5000 && anInt837 * -1780909837 > 0) {
			var2 = aByteArrayArray840[(anInt837 -= 300048443) * -1780909837];
			aByteArrayArray840[anInt837 * -1780909837] = null;
			return var2;
		} else if (var0 == 30000 && anInt838 * 1323425105 > 0) {
			var2 = aByteArrayArray846[(anInt838 += 2126804047) * 1323425105];
			aByteArrayArray846[anInt838 * 1323425105] = null;
			return var2;
		} else {
			return new byte[var0];
		}
	}

	LoginHandler() throws Throwable {
		throw new Error();
	}

	static final void method882(int var0, int var1, byte var2) {
		if (RSInterface.loadInterface(var0, -1764806403)) {
			PlainTile.method625(RSInterface.interface_cache[var0], var1, -1128005989);
		}
	}

	static final void method884(int var0) {
		try {
			if (Client.loginStage * -1241953979 == 0) {
				if (null != Varp.loginConnection) {
					Varp.loginConnection.disconnect();
					Varp.loginConnection = null;
				}

				Ignore.aClass85_388 = null;
				Client.aBool2719 = false;
				Client.anInt2739 = 0;
				Client.loginStage = -1821777523;
			}

			if (1 == Client.loginStage * -1241953979) {
				if (null == Ignore.aClass85_388) {
					Ignore.aClass85_388 = ClientScriptMap.pringRequester.method816(Applet_Sub1.aString2701, IndexTable.anInt790 * -2083273005, 505204762);
				}

				if (Ignore.aClass85_388.anInt1292 == 2) {
					throw new IOException();
				}

				if (Ignore.aClass85_388.anInt1292 == 1) {
					Varp.loginConnection = new GameConnection((Socket) Ignore.aClass85_388.anObject1294, ClientScriptMap.pringRequester);
					Ignore.aClass85_388 = null;
					Client.loginStage = 651412250;
				}
			}

			if (Client.loginStage * -1241953979 == 2) {
				Client.secureBuffer.position = 0;
				Client.secureBuffer.writeByte(14);
				Varp.loginConnection.writeBytes(Client.secureBuffer.buf, 0, 1);
				Client.packetBuffer.position = 0;
				Client.loginStage = -1170365273;
			}

			int responseCode;
			if (Client.loginStage * -1241953979 == 3) {
				if (null != Class2.aClass7_17) {
					Class2.aClass7_17.method119((byte) 84);
				}

				if (null != Class50.aClass7_697) {
					Class50.aClass7_697.method119((byte) 61);
				}

				responseCode = Varp.loginConnection.read();
				if (Class2.aClass7_17 != null) {
					Class2.aClass7_17.method119((byte) -8);
				}

				if (null != Class50.aClass7_697) {
					Class50.aClass7_697.method119((byte) 68);
				}

				if (0 != responseCode) {
					Friend.interpretResponseCode(responseCode, -16711936);
					return;
				}

				Client.packetBuffer.position = 0;
				Client.loginStage = -518953023;
			}

			final int orel = 1605143241 * 798331555;

			int var2;
			int var3;
			if (5 == Client.loginStage * -1241953979) {
				int[] xteakeys = new int[]{(int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D)};

				Client.secureBuffer.position = 0;
				Client.secureBuffer.writeByte(1);
				Client.secureBuffer.writeByte(PlayerLoginDetails.aClass76_65.getID(-1397647336));

				Client.secureBuffer.writeInt(xteakeys[0]);
				Client.secureBuffer.writeInt(xteakeys[1]);
				Client.secureBuffer.writeInt(xteakeys[2]);
				Client.secureBuffer.writeInt(xteakeys[3]);

				System.out.println("Asshat: " +(PlayerLoginDetails.aClass76_65.anInt1197 * -1956627331));
				switch (PlayerLoginDetails.aClass76_65.anInt1197 * -1956627331) {
					case 0:
						Client.secureBuffer.position += 8751192;
						break;
					case 1:
						Client.secureBuffer.writeInt((Integer) Ignore.aClass37_386.aLinkedHashMap530.get(Integer.valueOf(ProducingGraphicsBuffer.method1595(PlayerLoginDetails.typedUsername, 698639797))));
						Client.secureBuffer.position -= 2143108052; // -4 aka +4
						break;
					case 2:
					case 3:
						Client.secureBuffer.writeTriByte(AnimationSkeletonSet.anInt2260 * -348856905);
						Client.secureBuffer.position -= 1605143241; // -5 aka +5
				}

				Client.secureBuffer.writeString(PlayerLoginDetails.typedPassword);

				if (!Loader.local)
					Client.secureBuffer.doRSA(rsaExponent, rsaModulus, (byte) 1);

				Client.loginBuffer.position = 0;

				if (40 == Client.loginLoadingStage * 1315883169) {
					Client.loginBuffer.writeByte(18);
				} else {
					Client.loginBuffer.writeByte(16);
				}

				Client.loginBuffer.writeShort(0);
				var2 = Client.loginBuffer.position * 798331555;//mark pos
				Client.loginBuffer.writeInt(60);

				Client.loginBuffer.writeBytes(Client.secureBuffer.buf, 0, Client.secureBuffer.position * 798331555, (byte) -6);

				var3 = Client.loginBuffer.position * 798331555;//mark
				Client.loginBuffer.writeString(PlayerLoginDetails.typedUsername);
				Client.loginBuffer.writeByte(Client.lowMemory ? 1 : 0);
				RSPacketBuffer var4 = Client.loginBuffer;
				byte[] randomDat = new byte[24];

				int var6;
				try {
					CacheConstants.aClass123_1259.seekTo(0L);
					CacheConstants.aClass123_1259.method1531(randomDat, -358310929);

					for (var6 = 0; var6 < 24 && randomDat[var6] == 0; ++var6) {
						;
					}

					if (var6 >= 24) {
						throw new IOException();
					}
				} catch (Exception var10) {
					for (int var7 = 0; var7 < 24; ++var7) {
						randomDat[var7] = -1;
					}
				}

				var4.writeBytes(randomDat, 0, 24, (byte) -52);
				RSByteBuffer machineBUf = new RSByteBuffer(MachineInformation.aMachineInformation_1422.calculateMachineInfoSize((byte) -109));
				MachineInformation.aMachineInformation_1422.writeMachineInfo(machineBUf, (byte) 68);

				Client.loginBuffer.writeBytes(machineBUf.buf, 0, machineBUf.buf.length, (byte) -53);
				Client.loginBuffer.writeInt(Projectile.skeletonIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(AnimationSkin.skinIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(AbstractIndex.configIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(OverlayFloorDefinition.interfaceIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(RSSoundEffect.soundEffectsIndex_1.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(PingRequester.landscapeIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(Friend.musicIndex_1.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(Class47.modelIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(Class23.spriteIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(PlayerLoginDetails.textureIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(RuntimeException_Sub1.huffmanIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(ClientParameter.musicIndex_2.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(Class108_Sub13.clientScriptIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(Class54.fontIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(HuffmanEncoding.soundEffectsIndex_2.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(IsaacRandomGen.soundEffectsIndex_3.anInt935 * -1983334491);

				System.out.println("Their rand: " + Arrays.toString(xteakeys));
				if (!Loader.local)
					Client.loginBuffer.doXTEA(xteakeys, var3, Client.loginBuffer.position * 798331555, (byte) 102);

				Client.loginBuffer.endShort(Client.loginBuffer.position * 798331555 - var2, -393321369);
				Varp.loginConnection.writeBytes(Client.loginBuffer.buf, 0, Client.loginBuffer.position * 798331555);
				Client.secureBuffer.setCipherSet(xteakeys, -1376347399);

				for (var6 = 0; var6 < 4; ++var6) {
					xteakeys[var6] += 50;
				}

				Client.packetBuffer.setCipherSet(xteakeys, -835082735);
				Client.loginStage = 1954236750;
			}

			final int paki = 1954236750 * -1241953979;

			if (Client.loginStage * -1241953979 == 6 && Varp.loginConnection.available() > 0) {
				responseCode = Varp.loginConnection.read();
				if (21 == responseCode && 20 == Client.loginLoadingStage * 1315883169) {
					Client.loginStage = 132459227;
				} else if (2 == responseCode) {
					Client.loginStage = 783871477;
				} else {
					if (responseCode == 15 && Client.loginLoadingStage * 1315883169 == 40) {
						Client.secureBuffer.position = 0;
						Client.packetBuffer.position = 0;
						Client.packetID = 859744123;
						Client.anInt2803 = 2024851459;
						Client.anInt2755 = -1505993085;
						Client.anInt2756 = -2134126195;
						Client.packetSize = 0;
						Client.anInt2918 = 0;
						Client.anInt2722 = 0;
						ContextMenu.contextMenuRow = 0;
						ContextMenu.contextMenuOpen = false;
						Client.anInt2935 = 0;
						Client.anInt2933 = 0;

						for (var2 = 0; var2 < Client.localPlayers.length; ++var2) {
							if (null != Client.localPlayers[var2]) {
								Client.localPlayers[var2].anInt2362 = 990422189;
							}
						}

						for (var2 = 0; var2 < Client.localNPCs.length; ++var2) {
							if (null != Client.localNPCs[var2]) {
								Client.localNPCs[var2].anInt2362 = 990422189;
							}
						}

						Class108_Sub12.aClass101_1673 = new HashTable(32);
						IsaacRandomGen.method725(30, 2013187263);

						for (var2 = 0; var2 < 100; ++var2) {
							Client.aBoolArray2909[var2] = true;
						}

						return;
					}

					if (responseCode != 23 || Client.anInt2740 * -1069435249 >= 1) {
						Friend.interpretResponseCode(responseCode, -16711936);
						return;
					}

					Client.anInt2740 += 990685295;
					Client.loginStage = 0;
				}
			}

			if (7 == Client.loginStage * -1241953979 && Varp.loginConnection.available() > 0) {
				Client.anInt2751 = (Varp.loginConnection.read() + 3) * 2112240596;
				Client.loginStage = -1689318296;
			}

			if (8 == Client.loginStage * -1241953979) {
				Client.anInt2739 = 0;
				World.setResponseString(StringUtilities.RECENT_WORLD, StringUtilities.TRANSFER_TIMER, Client.anInt2751 * -1211848589 / 60 + StringUtilities.TRANSFER_SECONDS, 2038890483);
				if ((Client.anInt2751 += 1825948485) * -1211848589 <= 0) {
					Client.loginStage = 0;
				}
			} else {
				if (Client.loginStage * -1241953979 == 9 && Varp.loginConnection.available() >= 13) {
					boolean var13 = Varp.loginConnection.read() == 1;
					Varp.loginConnection.read(Client.packetBuffer.buf, 0, 4);
					Client.packetBuffer.position = 0;
					boolean var14 = false;
					if (var13) {
						var2 = Client.packetBuffer.readPacket(-1684324366) << 24;
						var2 |= Client.packetBuffer.readPacket(-1684324366) << 16;
						var2 |= Client.packetBuffer.readPacket(-1684324366) << 8;
						var2 |= Client.packetBuffer.readPacket(-1684324366);
						var3 = ProducingGraphicsBuffer.method1595(PlayerLoginDetails.typedUsername, 698639797);
						if (Ignore.aClass37_386.aLinkedHashMap530.size() >= 10 && !Ignore.aClass37_386.aLinkedHashMap530.containsKey(Integer.valueOf(var3))) {
							Iterator var15 = Ignore.aClass37_386.aLinkedHashMap530.entrySet().iterator();
							var15.next();
							var15.remove();
						}

						Ignore.aClass37_386.aLinkedHashMap530.put(Integer.valueOf(var3), Integer.valueOf(var2));
						Timer.method713(-760339476);
					}

					int r=0;
					Client.rights = (r=Varp.loginConnection.read()) * 203290551;
					Client.aBool2949 = Varp.loginConnection.read() == 1;
					Client.anInt2823 = Varp.loginConnection.read() * 1510013235;
					Client.anInt2823 = (Client.anInt2823 * 1800645115 << 8) * 1510013235;
					Client.anInt2823 += Varp.loginConnection.read() * 1510013235;
					Client.anInt2758 = Varp.loginConnection.read() * 1532011819;
					System.out.println("Rights: " + r + ", " + (Client.anInt2823 * 0x6b53a9fb));
					Varp.loginConnection.read(Client.packetBuffer.buf, 0, 1);
					Client.packetBuffer.position = 0;
					int a;
					Client.packetID = (a= Client.packetBuffer.readPacket(-1684324366)) * -859744123;
					System.out.println("They gif us " + a);
					Varp.loginConnection.read(Client.packetBuffer.buf, 0, 2);
					Client.packetBuffer.position = 0;
					Client.packetSize = (a= Client.packetBuffer.readUShort(-838299460)) * 1182625323;
					System.out.println("Size " + a);
					if (1 == Client.anInt2758 * -1950682749) {
						try {
							Class69.method941(Client.aclient2703, "zap", -1264925457);
						} catch (Throwable var9) {
							;
						}
					} else {
						try {
							Class69.method941(Client.aclient2703, "unzap", -1264925457);
						} catch (Throwable var8) {
							;
						}
					}

					Client.loginStage = -1037906046;
				}

				if (Client.loginStage * -1241953979 != 10) {
					Client.anInt2739 -= 1911851163;
					if (Client.anInt2739 * -588520851 > 2000) {
						if (Client.anInt2740 * -1069435249 < 1) {
							if (IndexTable.anInt790 * -2083273005 == Client.anInt2742 * 1455199325) {
								IndexTable.anInt790 = Class26.anInt351 * 2139936523;
							} else {
								IndexTable.anInt790 = Client.anInt2742 * 130259471;
							}

							Client.anInt2740 += 990685295;
							Client.loginStage = 0;
						} else {
							Friend.interpretResponseCode(-3, -16711936);
						}
					}
				} else if (Varp.loginConnection.available() >= Client.packetSize * -574496637) {
					Client.packetBuffer.position = 0;
					Varp.loginConnection.read(Client.packetBuffer.buf, 0, Client.packetSize * -574496637);
					Client.lastMousePressTime = 5205271143587660129L;
					Client.anInt2714 = -1445469673;
					MouseCapturer.mouseCapturer.coordIndex = 0;
					focusGained = true;
					Client.lastSentFocusGained = true;
					Client.aLong2925 = -1524832735365646447L;
					method1480((byte) 3);
					Client.secureBuffer.position = 0;
					Client.packetBuffer.position = 0;
					Client.packetID = 859744123;
					Client.anInt2803 = 2024851459;
					Client.anInt2755 = -1505993085;
					Client.anInt2756 = -2134126195;
					Client.anInt2918 = 0;
					Client.anInt2722 = 0;
					Client.anInt2753 = 0;
					Client.anInt2723 = 0;
					ContextMenu.contextMenuRow = 0;
					ContextMenu.contextMenuOpen = false;
					ItemDefinition.method2100(0, -1768089869);
					MouseCapturer.method394((short) 256);
					Client.anInt2858 = 0;
					Client.aBool2881 = false;
					Client.anInt2895 = 0;
					Client.anInt2768 = ((int) (Math.random() * 100.0D) - 50) * 1178297339;
					Client.anInt2770 = ((int) (Math.random() * 110.0D) - 55) * 1305982351;
					Client.anInt2772 = ((int) (Math.random() * 80.0D) - 40) * -1062023641;
					Client.anInt2775 = ((int) (Math.random() * 120.0D) - 60) * -1362302617;
					Client.anInt2957 = ((int) (Math.random() * 30.0D) - 20) * 341935315;
					Client.anInt2771 = ((int) (Math.random() * 20.0D) - 10 & 2047) * -790493177;
					Client.anInt2935 = 0;
					Client.lastKnownPlane = 1405183137;
					Client.anInt2933 = 0;
					Client.anInt2894 = 0;
					Client.aClass50_2733 = Class50.aClass50_698;
					Client.numLocalPlayers = 0;
					Client.anInt2749 = 0;

					for (responseCode = 0; responseCode < 2048; ++responseCode) {
						Client.localPlayers[responseCode] = null;
						Client.cachedAppearances[responseCode] = null;
					}

					for (responseCode = 0; responseCode < '\u8000'; ++responseCode) {
						Client.localNPCs[responseCode] = null;
					}

					Player.myPlayer = Client.localPlayers[2047] = new Player();
					Client.anInt2837 = 739185759;
					Client.projectileDeque.method1333();
					Client.aClass105_2928.method1333();

					for (responseCode = 0; responseCode < 4; ++responseCode) {
						for (var2 = 0; var2 < 104; ++var2) {
							for (var3 = 0; var3 < 104; ++var3) {
								Client.groundItemArray[responseCode][var2][var3] = null;
							}
						}
					}

					Client.aClass105_2939 = new Deque();
					Client.anInt2954 = 0;
					Client.friendListCount = 0;
					Client.ignoreListCount = 0;

					for (responseCode = 0; responseCode < Varp.anInt2045 * -1989920909; ++responseCode) {
						Varp var18 = AnimatedGraphic.method2149(responseCode, (byte) 4);
						if (null != var18) {
							Class88.anIntArray1317[responseCode] = 0;
							Class88.configSettings[responseCode] = 0;
						}
					}

					for (responseCode = 0; responseCode < Client.anIntArray2864.length; ++responseCode) {
						Client.anIntArray2864[responseCode] = -1;
					}

					Client.anInt2789 = 801480023;
					if (-1 != Client.openInterfaceID * 1523906617) {
						RSInterface.removeLoadedInterface(Client.openInterfaceID * 1523906617);
					}

					for (Class108_Sub10 var17 = (Class108_Sub10) Client.aClass101_2866.method1304(); null != var17; var17 = (Class108_Sub10) Client.aClass101_2866.method1303()) {
						Class108_Sub10.method1682(var17, true, (short) 272);
					}

					Client.openInterfaceID = -1256289801;
					Client.aClass101_2866 = new HashTable(8);
					Client.aClass108_Sub17_2869 = null;
					ContextMenu.contextMenuOpen = false;
					ContextMenu.contextMenuRow = 0;
					Client.aClass93_2926.initialize((int[]) null, new int[]{0, 0, 0, 0, 0}, false, -1, -1809930983);

					for (responseCode = 0; responseCode < 8; ++responseCode) {
						Client.aStringArray2834[responseCode] = null;
						Client.aBoolArray2835[responseCode] = false;
					}

					Class108_Sub12.aClass101_1673 = new HashTable(32);
					Client.aBool2874 = true;

					for (responseCode = 0; responseCode < 100; ++responseCode) {
						Client.aBoolArray2909[responseCode] = true;
					}

					Client.aString2967 = null;
					Friend.friendsChatListCount = 0;
					FriendsChatMember.friendsChatList = null;
					Friend.anInt620 = 964554551;
					PlainTile.loadIncomingMap(false, (byte) 117);
					Client.packetID = 859744123;
				}
			}
		} catch (IOException var11) {
			if (Client.anInt2740 * -1069435249 < 1) {
				if (IndexTable.anInt790 * -2083273005 == Client.anInt2742 * 1455199325) {
					IndexTable.anInt790 = Class26.anInt351 * 2139936523;
				} else {
					IndexTable.anInt790 = Client.anInt2742 * 130259471;
				}

				Client.anInt2740 += 990685295;
				Client.loginStage = 0;
			} else {
				Friend.interpretResponseCode(-2, -16711936);
			}
		}
	}

	public static void method1480(byte var0) {
       Class92.aClass92_1447 = new Class92();
    }

	static void processLoginAndWorldListClick(Applet_Sub1 var0, int var1) {
       if(PlayerLoginDetails.worldListOpen) {
          GameObject.method2846(var0, (byte)-11);
       } else {
          if((MouseInputHandler.clickType * 1629072957 == 1 || !Class100.aBool1391 && MouseInputHandler.clickType * 1629072957 == 4) && MouseInputHandler.mousePressX * 472132205 >= 715 && MouseInputHandler.mousePressY * 1498262827 >= 453) {
             Ignore.aClass37_386.aBool529 = !Ignore.aClass37_386.aBool529;
             Timer.method713(-1567766695);
             if(!Ignore.aClass37_386.aBool529) {
                RSSong.playSong(Friend.musicIndex_1, "scape main", "", 255, false, (byte) 1);
             } else {
                Class32.aClass108_Sub4_Sub3_464.method2610(410806899);
                SongReference.anInt1325 = -771978757;
                RSInterface.aClass74_1889 = null;
             }
          }

          if(5 != Client.loginLoadingStage * 1315883169) {
             PlayerLoginDetails.anInt50 -= 1909601071;
             if(Client.loginLoadingStage * 1315883169 == 10 || Client.loginLoadingStage * 1315883169 == 11) {
                if(0 == Client.anInt2712 * 148074329) {
                   if(1 == MouseInputHandler.clickType * 1629072957 || !Class100.aBool1391 && 4 == MouseInputHandler.clickType * 1629072957) {
                      byte var2 = 5;
                      short var4 = 463;
                      byte var6 = 100;
                      byte var5 = 35;
                      if(MouseInputHandler.mousePressX * 472132205 >= var2 && MouseInputHandler.mousePressX * 472132205 <= var2 + var6 && MouseInputHandler.mousePressY * 1498262827 >= var4 && MouseInputHandler.mousePressY * 1498262827 <= var5 + var4) {
                         World.method3180(-525999435);
                         return;
                      }
                   }

                   if(null != Class77.aClass43_1203) {
                      World.method3180(1624557494);
                   }
                }

                int clickType = MouseInputHandler.clickType * 1629072957;
                int xPos = MouseInputHandler.mousePressX * 472132205;
                int yPos = MouseInputHandler.mousePressY * 1498262827;
                if(!Class100.aBool1391 && 4 == clickType) {
                   clickType = 1;
                }

                short var7;
                short var13;
                if(0 == PlayerLoginDetails.anInt54 * 2105711249) {
                   var13 = 302;
                   var7 = 291;
                   if(clickType == 1 && xPos >= var13 - 75 && xPos <= var13 + 75 && yPos >= var7 - 20 && yPos <= 20 + var7) {
                      AnimatedGraphic.method2137(PlayerLoginDetails.method81("secure", true, (byte) 4) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, (byte) 26);
                   }

                   var13 = 462;
                   if(1 == clickType) {
                      if(xPos >= var13 - 75) {
                         if(xPos <= var13 + 75) {
                            if(yPos >= var7 - 20) {
                               if(yPos <= var7 + 20) {
                                  if((Client.worldType * 164398169 & 4) != 0) {
                                     if(0 != (Client.worldType * 164398169 & 1024)) {
                                        PlayerLoginDetails.aString74 = StringUtilities.HIGH_RISK_PVP_WORLD;
                                        PlayerLoginDetails.aString64 = StringUtilities.aString1171;
                                        PlayerLoginDetails.aString55 = StringUtilities.aString1185;
                                     } else {
                                        PlayerLoginDetails.aString74 = StringUtilities.HIGH_RISK_PVP_WORLD;
                                        PlayerLoginDetails.aString64 = StringUtilities.aString1165;
                                        PlayerLoginDetails.aString55 = StringUtilities.aString1166;
                                     }

                                     PlayerLoginDetails.anInt54 = -1920702863;
                                     PlayerLoginDetails.anInt62 = 0;
                                  } else if((Client.worldType * 164398169 & 1024) != 0) {
                                     PlayerLoginDetails.aString74 = StringUtilities.aString1167;
                                     PlayerLoginDetails.aString64 = StringUtilities.aString1168;
                                     PlayerLoginDetails.aString55 = StringUtilities.aString1169;
                                     PlayerLoginDetails.anInt54 = -1920702863;
                                     PlayerLoginDetails.anInt62 = 0;
                                  } else {
                                     PlayerLoginDetails.aString74 = StringUtilities.aString1160;
                                     PlayerLoginDetails.aString64 = StringUtilities.aString1101;
                                     PlayerLoginDetails.aString55 = StringUtilities.aString1162;
                                     PlayerLoginDetails.anInt54 = 453561570;
                                     PlayerLoginDetails.anInt62 = 0;
                                  }
                               }
                            }
                         }
                      }
                   }
                } else if(PlayerLoginDetails.anInt54 * 2105711249 == 1) {
                   while(GraphicsBuffer.method278(1941552803)) {
                      if(Class9.anInt124 * 1025603675 == 84) {
                         PlayerLoginDetails.aString74 = StringUtilities.aString1160;
                         PlayerLoginDetails.aString64 = StringUtilities.aString1101;
                         PlayerLoginDetails.aString55 = StringUtilities.aString1162;
                         PlayerLoginDetails.anInt54 = 453561570;
                         PlayerLoginDetails.anInt62 = 0;
                      } else if(Class9.anInt124 * 1025603675 == 13) {
                         PlayerLoginDetails.anInt54 = 0;
                      }
                   }

                   var13 = 302;
                   var7 = 321;
                   if(1 == clickType && xPos >= var13 - 75 && xPos <= 75 + var13 && yPos >= var7 - 20 && yPos <= var7 + 20) {
                      PlayerLoginDetails.aString74 = StringUtilities.aString1160;
                      PlayerLoginDetails.aString64 = StringUtilities.aString1101;
                      PlayerLoginDetails.aString55 = StringUtilities.aString1162;
                      PlayerLoginDetails.anInt54 = 453561570;
                      PlayerLoginDetails.anInt62 = 0;
                   }

                   var13 = 462;
                   if(1 == clickType) {
                      if(xPos >= var13 - 75) {
                         if(xPos <= var13 + 75) {
                            if(yPos >= var7 - 20) {
                               if(yPos <= 20 + var7) {
                                  PlayerLoginDetails.anInt54 = 0;
                               }
                            }
                         }
                      }
                   }
                } else if(PlayerLoginDetails.anInt54 * 2105711249 == 2) {
                   var13 = 231;
                   int var15 = var13 + 30;
                   if(clickType == 1 && yPos >= var15 - 15 && yPos < var15) {
                      PlayerLoginDetails.anInt62 = 0;
                   }

                   var15 += 15;
                   if(clickType == 1 && yPos >= var15 - 15 && yPos < var15) {
                      PlayerLoginDetails.anInt62 = -547575295;
                   }

                   var15 += 15;
                   var7 = 302;
                   short var11 = 321;
                   if(clickType == 1 && xPos >= var7 - 75 && xPos <= var7 + 75 && yPos >= var11 - 20 && yPos <= var11 + 20) {
                      PlayerLoginDetails.typedUsername = PlayerLoginDetails.typedUsername.trim();
                      if(PlayerLoginDetails.typedUsername.length() == 0) {
                         World.setResponseString(StringUtilities.aString1066, StringUtilities.PLEASE_ENTER_USER_EMAIL, StringUtilities.aString982, 2129771750);
                      } else if(PlayerLoginDetails.typedPassword.length() == 0) {
                         World.setResponseString(StringUtilities.aString1096, StringUtilities.PLEASE_ENTER_PASS, StringUtilities.aString1071, 1994617895);
                      } else {
                         World.setResponseString(StringUtilities.aString1175, StringUtilities.aString1176, StringUtilities.aString1094, 1896835022);
                         PlayerLoginDetails.aClass76_65 = Ignore.aClass37_386.aLinkedHashMap530.containsKey(Integer.valueOf(ProducingGraphicsBuffer.method1595(PlayerLoginDetails.typedUsername, 698639797)))?Class76.aClass76_1200:Class76.aClass76_1199;
                         IsaacRandomGen.method725(20, 1805521706);
                      }
                   } else {
                      var7 = 462;
                      if(1 == clickType && xPos >= var7 - 75 && xPos <= 75 + var7 && yPos >= var11 - 20 && yPos <= var11 + 20) {
                         PlayerLoginDetails.anInt54 = 0;
                         PlayerLoginDetails.typedUsername = "";
                         PlayerLoginDetails.typedPassword = "";
                         AnimationSkeletonSet.anInt2260 = 0;
                         BuildType.enteredPin = "";
                         PlayerLoginDetails.trustComputer = true;
                      }

                      while(GraphicsBuffer.method278(-429939348)) {
                         boolean var16 = false;
                         int var9 = 0;

                         while(true) {
                            if(var9 < PlayerLoginDetails.validCharacters.length()) {
                               if(aChar841 != PlayerLoginDetails.validCharacters.charAt(var9)) {
                                  ++var9;
                                  continue;
                               }

                               var16 = true;
                            }

                            if(Class9.anInt124 * 1025603675 == 13) {
                               PlayerLoginDetails.anInt54 = 0;
                               PlayerLoginDetails.typedUsername = "";
                               PlayerLoginDetails.typedPassword = "";
                               AnimationSkeletonSet.anInt2260 = 0;
                               BuildType.enteredPin = "";
                               PlayerLoginDetails.trustComputer = true;
                               break;
                            }

                            if(PlayerLoginDetails.anInt62 * 1502041601 == 0) {
                               if(85 == Class9.anInt124 * 1025603675 && PlayerLoginDetails.typedUsername.length() > 0) {
                                  PlayerLoginDetails.typedUsername = PlayerLoginDetails.typedUsername.substring(0, PlayerLoginDetails.typedUsername.length() - 1);
                               }

                               if(84 == Class9.anInt124 * 1025603675 || 80 == Class9.anInt124 * 1025603675) {
                                  PlayerLoginDetails.anInt62 = -547575295;
                               }

                               if(var16 && PlayerLoginDetails.typedUsername.length() < 320) {
                                  PlayerLoginDetails.typedUsername = PlayerLoginDetails.typedUsername + aChar841;
                               }
                               break;
                            }

                            if(1 != PlayerLoginDetails.anInt62 * 1502041601) {
                               break;
                            }

                            if(Class9.anInt124 * 1025603675 == 85 && PlayerLoginDetails.typedPassword.length() > 0) {
                               PlayerLoginDetails.typedPassword = PlayerLoginDetails.typedPassword.substring(0, PlayerLoginDetails.typedPassword.length() - 1);
                            }

                            if(84 == Class9.anInt124 * 1025603675 || 80 == Class9.anInt124 * 1025603675) {
                               PlayerLoginDetails.anInt62 = 0;
                            }

                            if(84 == Class9.anInt124 * 1025603675) {
                               PlayerLoginDetails.typedUsername = PlayerLoginDetails.typedUsername.trim();
                               if(PlayerLoginDetails.typedUsername.length() == 0) {
                                  World.setResponseString(StringUtilities.aString1066, StringUtilities.PLEASE_ENTER_USER_EMAIL, StringUtilities.aString982, 1994248243);
                                  return;
                               }

                               if(PlayerLoginDetails.typedPassword.length() == 0) {
                                  World.setResponseString(StringUtilities.aString1096, StringUtilities.PLEASE_ENTER_PASS, StringUtilities.aString1071, 1951485667);
                                  return;
                               }

                               World.setResponseString(StringUtilities.aString1175, StringUtilities.aString1176, StringUtilities.aString1094, 1956224355);
                               PlayerLoginDetails.aClass76_65 = Ignore.aClass37_386.aLinkedHashMap530.containsKey(Integer.valueOf(ProducingGraphicsBuffer.method1595(PlayerLoginDetails.typedUsername, 698639797)))?Class76.aClass76_1200:Class76.aClass76_1199;
                               IsaacRandomGen.method725(20, 1408783702);
                               return;
                            }

                            if(var16 && PlayerLoginDetails.typedPassword.length() < 20) {
                               PlayerLoginDetails.typedPassword = PlayerLoginDetails.typedPassword + aChar841;
                            }
                            break;
                         }
                      }

                   }
                } else if(4 == PlayerLoginDetails.anInt54 * 2105711249) {
                   var13 = 302;
                   var7 = 321;
                   if(1 == clickType && xPos >= var13 - 75 && xPos <= 75 + var13 && yPos >= var7 - 20 && yPos <= 20 + var7) {
                      BuildType.enteredPin.trim();
                      if(BuildType.enteredPin.length() != 6) {
                         World.setResponseString(StringUtilities.aString1153, StringUtilities.AUTH_PIN_ENTER, StringUtilities.aString984, 2140301062);
                      } else {
                         AnimationSkeletonSet.anInt2260 = Integer.parseInt(BuildType.enteredPin) * -1042182137;
                         BuildType.enteredPin = "";
                         PlayerLoginDetails.aClass76_65 = PlayerLoginDetails.trustComputer?Class76.aClass76_1198:Class76.aClass76_1201;
                         World.setResponseString(StringUtilities.aString1175, StringUtilities.aString1176, StringUtilities.aString1094, 1981202273);
                         IsaacRandomGen.method725(20, 1910610971);
                      }
                   } else {
                      if(1 == clickType && xPos >= 373 && xPos <= 512 && yPos >= 263 && yPos <= 296) {
                         PlayerLoginDetails.trustComputer = !PlayerLoginDetails.trustComputer;
                      }

                      if(clickType == 1 && xPos >= 348 && xPos <= 416 && yPos >= 351 && yPos <= 363) {
                         AnimatedGraphic.method2137(PlayerLoginDetails.method81("secure", true, (byte) 4) + "m=totp-authenticator/disableTOTPRequest", true, false, (byte) -11);
                      }

                      var13 = 462;
                      if(clickType == 1 && xPos >= var13 - 75 && xPos <= var13 + 75 && yPos >= var7 - 20 && yPos <= 20 + var7) {
                         PlayerLoginDetails.anInt54 = 0;
                         PlayerLoginDetails.typedUsername = "";
                         PlayerLoginDetails.typedPassword = "";
                         AnimationSkeletonSet.anInt2260 = 0;
                         BuildType.enteredPin = "";
                      }

                      while(GraphicsBuffer.method278(-1121639400)) {
                         boolean var3 = false;
                         int var8 = 0;

                         while(true) {
                            if(var8 < PlayerLoginDetails.aString46.length()) {
                               if(aChar841 != PlayerLoginDetails.aString46.charAt(var8)) {
                                  ++var8;
                                  continue;
                               }

                               var3 = true;
                            }

                            if(13 == Class9.anInt124 * 1025603675) {
                               PlayerLoginDetails.anInt54 = 0;
                               PlayerLoginDetails.typedUsername = "";
                               PlayerLoginDetails.typedPassword = "";
                               AnimationSkeletonSet.anInt2260 = 0;
                               BuildType.enteredPin = "";
                            } else {
                               if(85 == Class9.anInt124 * 1025603675 && BuildType.enteredPin.length() > 0) {
                                  BuildType.enteredPin = BuildType.enteredPin.substring(0, BuildType.enteredPin.length() - 1);
                               }

                               if(84 == Class9.anInt124 * 1025603675) {
                                  BuildType.enteredPin.trim();
                                  if(BuildType.enteredPin.length() != 6) {
                                     World.setResponseString(StringUtilities.aString1153, StringUtilities.AUTH_PIN_ENTER, StringUtilities.aString984, 2014560043);
                                     return;
                                  }

                                  AnimationSkeletonSet.anInt2260 = Integer.parseInt(BuildType.enteredPin) * -1042182137;
                                  BuildType.enteredPin = "";
                                  PlayerLoginDetails.aClass76_65 = PlayerLoginDetails.trustComputer?Class76.aClass76_1198:Class76.aClass76_1201;
                                  World.setResponseString(StringUtilities.aString1175, StringUtilities.aString1176, StringUtilities.aString1094, 2071091536);
                                  IsaacRandomGen.method725(20, 1944863421);
                                  return;
                               }

                               if(var3 && BuildType.enteredPin.length() < 6) {
                                  BuildType.enteredPin = BuildType.enteredPin + aChar841;
                               }
                            }
                            break;
                         }
                      }

                   }
                }
             }
          }
       }
    }

	static void setupLoginScreen(Component var0, AbstractIndex index, AbstractIndex var2, boolean var3, int var4, int var5) {
       if(PlayerLoginDetails.aBool58) {
          if(var4 == 4) {
             PlayerLoginDetails.anInt54 = 907123140;
          }
       } else {
          PlayerLoginDetails.anInt54 = var4 * -1920702863;
          Rasterizer2D.resetPixels();
          byte[] var6 = index.getFileForArchiveFileName("title.jpg", "");
          PlayerLoginDetails.clientBackgroundLeft = new RGBSprite(var6, var0);
          Class41.clientBackgroundRight = PlayerLoginDetails.clientBackgroundLeft.method2743();
          IndexTable.clientLogo = Renderable.method2488(var2, "logo", "", (byte)2);
          PlayerLoginDetails.titleBox = Renderable.method2488(var2, "titlebox", "", (byte)2);
          PlayerLoginDetails.titleButton = Renderable.method2488(var2, "titlebutton", "", (byte) 2);
          Class5.fireRuneSprites = PaletteSprite.loadPaletteSpriteSet(var2, "runes", "", (byte) -13);
          MouseCapturer.musicMuteButton = PaletteSprite.loadPaletteSpriteSet(var2, "title_mute", "", (byte) -15);
          PlayerLoginDetails.radioButtonOptions = Renderable.method2488(var2, "options_radio_buttons,0", "", (byte)2);
          GroundItem.radioButtonOptions_2 = Renderable.method2488(var2, "options_radio_buttons,2", "", (byte)2);
          MouseCapturer.anIntArray382 = new int[256];

          int var7;
          for(var7 = 0; var7 < 64; ++var7) {
             MouseCapturer.anIntArray382[var7] = var7 * 262144;
          }

          for(var7 = 0; var7 < 64; ++var7) {
             MouseCapturer.anIntArray382[var7 + 64] = var7 * 1024 + 16711680;
          }

          for(var7 = 0; var7 < 64; ++var7) {
             MouseCapturer.anIntArray382[var7 + 128] = 16776960 + var7 * 4;
          }

          for(var7 = 0; var7 < 64; ++var7) {
             MouseCapturer.anIntArray382[var7 + 192] = 16777215;
          }

          Class56.anIntArray757 = new int[256];

          for(var7 = 0; var7 < 64; ++var7) {
             Class56.anIntArray757[var7] = var7 * 1024;
          }

          for(var7 = 0; var7 < 64; ++var7) {
             Class56.anIntArray757[64 + var7] = '\uff00' + var7 * 4;
          }

          for(var7 = 0; var7 < 64; ++var7) {
             Class56.anIntArray757[var7 + 128] = '\uffff' + var7 * 262144;
          }

          for(var7 = 0; var7 < 64; ++var7) {
             Class56.anIntArray757[var7 + 192] = 16777215;
          }

          Client.anIntArray2966 = new int[256];

          for(var7 = 0; var7 < 64; ++var7) {
             Client.anIntArray2966[var7] = var7 * 4;
          }

          for(var7 = 0; var7 < 64; ++var7) {
             Client.anIntArray2966[var7 + 64] = var7 * 262144 + 255;
          }

          for(var7 = 0; var7 < 64; ++var7) {
             Client.anIntArray2966[128 + var7] = var7 * 1024 + 16711935;
          }

          for(var7 = 0; var7 < 64; ++var7) {
             Client.anIntArray2966[192 + var7] = 16777215;
          }

          Class108_Sub10.anIntArray1655 = new int[256];
          Class56.anIntArray755 = new int['\u8000'];
          Class16.anIntArray204 = new int['\u8000'];
          ChatMessage.method2013((PaletteSprite)null, -1052073150);
          Class65.anIntArray860 = new int['\u8000'];
          World.anIntArray565 = new int['\u8000'];
          if(var3) {
             PlayerLoginDetails.typedUsername = "";
             PlayerLoginDetails.typedPassword = "";
          }

          AnimationSkeletonSet.anInt2260 = 0;
          BuildType.enteredPin = "";
          PlayerLoginDetails.trustComputer = true;
          PlayerLoginDetails.worldListOpen = false;
          if(!Ignore.aClass37_386.aBool529) {
             CacheIndex musicIndex = Friend.musicIndex_1;
             int var8 = musicIndex.getArchiveIDForName("scape main", 1723285154);
             int var9 = musicIndex.getFileIDForName(var8, "");
             SongReference.anInt1325 = -771978757;
             RSInterface.aClass74_1889 = musicIndex;
             SongReference.anInt1329 = var8 * -2020957493;
             OnlineFriend.anInt1511 = var9 * -1300146319;
             SoundEffectWorker.anInt362 = 1805356111;
             FriendsChatMember.aBool1669 = false;
             ClientScriptDefinition.anInt2281 = -1589655618;
          } else {
             SoundEffectWorker.method288(2, 1880141009);
          }

          ClientScriptMap.method2171(false, -969315198);
          PlayerLoginDetails.aBool58 = true;
          PlayerLoginDetails.clientBackgroundLeft.drawSprite(0, 0);
          Class41.clientBackgroundRight.drawSprite(382, 0);
          IndexTable.clientLogo.drawSprite(382 - IndexTable.clientLogo.anInt2413 / 2, 18);
       }
    }
}
