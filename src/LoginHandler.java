import java.io.IOException;
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


	public static RSInterface method878(int var0, int var1, int var2) {
		RSInterface var3 = CacheIndexRequest.getInterfaceComponentForHash(var0, 2146838109);
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
		if (AbstractIndex.method1073(var0, -1764806403)) {
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

			int var1;
			if (Client.loginStage * -1241953979 == 3) {
				if (null != Class2.aClass7_17) {
					Class2.aClass7_17.method119((byte) 84);
				}

				if (null != Class50.aClass7_697) {
					Class50.aClass7_697.method119((byte) 61);
				}

				var1 = Varp.loginConnection.read();
				if (Class2.aClass7_17 != null) {
					Class2.aClass7_17.method119((byte) -8);
				}

				if (null != Class50.aClass7_697) {
					Class50.aClass7_697.method119((byte) 68);
				}

				if (0 != var1) {
					Friend.method661(var1, -16711936);
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
				Client.secureBuffer.writeByte(Class4.aClass76_65.method32(-1397647336));

				Client.secureBuffer.writeInt(xteakeys[0]);
				Client.secureBuffer.writeInt(xteakeys[1]);
				Client.secureBuffer.writeInt(xteakeys[2]);
				Client.secureBuffer.writeInt(xteakeys[3]);

				System.out.println("Asshat: " +(Class4.aClass76_65.anInt1197 * -1956627331));
				switch (Class4.aClass76_65.anInt1197 * -1956627331) {
					case 0:
						Client.secureBuffer.position += 8751192;
						break;
					case 1:
						Client.secureBuffer.writeInt((Integer) Ignore.aClass37_386.aLinkedHashMap530.get(Integer.valueOf(ProducingGraphicsBuffer.method1595(Class4.typedUsername, 698639797))));
						Client.secureBuffer.position -= 2143108052; // -4 aka +4
						break;
					case 2:
					case 3:
						Client.secureBuffer.writeTriByte(AnimationSkeletonSet.anInt2260 * -348856905);
						Client.secureBuffer.position -= 1605143241; // -5 aka +5
				}

				Client.secureBuffer.writeString(Class4.typedPassword);

				if (!Loader.local)
					Client.secureBuffer.doRSA(Class32.rsaExponent, Class32.rsaModulus, (byte) 1);

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
				Client.loginBuffer.writeString(Class4.typedUsername);
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
				RSByteBuffer machineBUf = new RSByteBuffer(Class104.aClass108_Sub15_1422.calculateMachineInfoSize((byte) -109));
				Class104.aClass108_Sub15_1422.writeMachineInfo(machineBUf, (byte) 68);

				Client.loginBuffer.writeBytes(machineBUf.buf, 0, machineBUf.buf.length, (byte) -53);
				Client.loginBuffer.writeInt(Projectile.skeletonIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(AnimationSkin.skinIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(AbstractIndex.configIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(FloorDefinition.interfaceIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(Class118.soundEffectsIndex_1.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(PingRequester.landscapeIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(Friend.musicIndex_1.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(Class47.modelIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(Class23.spriteIndex.anInt935 * -1983334491);
				Client.loginBuffer.writeInt(Class4.textureIndex.anInt935 * -1983334491);
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
				var1 = Varp.loginConnection.read();
				if (21 == var1 && 20 == Client.loginLoadingStage * 1315883169) {
					Client.loginStage = 132459227;
				} else if (2 == var1) {
					Client.loginStage = 783871477;
				} else {
					if (var1 == 15 && Client.loginLoadingStage * 1315883169 == 40) {
						Client.secureBuffer.position = 0;
						Client.packetBuffer.position = 0;
						Client.packetID = 859744123;
						Client.anInt2803 = 2024851459;
						Client.anInt2755 = -1505993085;
						Client.anInt2756 = -2134126195;
						Client.anInt2927 = 0;
						Client.anInt2918 = 0;
						Client.anInt2722 = 0;
						Client.menuActionRow = 0;
						Client.actionMenuOpen = false;
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

					if (var1 != 23 || Client.anInt2740 * -1069435249 >= 1) {
						Friend.method661(var1, -16711936);
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
				World.method646(StringConstants.RECENT_WORLD, StringConstants.TRANSFER_TIMER, Client.anInt2751 * -1211848589 / 60 + StringConstants.TRANSFER_SECONDS, 2038890483);
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
						var3 = ProducingGraphicsBuffer.method1595(Class4.typedUsername, 698639797);
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
					Client.anInt2927 = (a= Client.packetBuffer.readUShort(-838299460)) * 1182625323;
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
							Friend.method661(-3, -16711936);
						}
					}
				} else if (Varp.loginConnection.available() >= Client.anInt2927 * -574496637) {
					Client.packetBuffer.position = 0;
					Varp.loginConnection.read(Client.packetBuffer.buf, 0, Client.anInt2927 * -574496637);
					Client.lastMousePressTime = 5205271143587660129L;
					Client.anInt2714 = -1445469673;
					ClientScript.mouseCapturer.coordIndex = 0;
					focusGained = true;
					Client.lastSentFocusGained = true;
					Client.aLong2925 = -1524832735365646447L;
					Class119.method1480((byte) 3);
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
					Client.menuActionRow = 0;
					Client.actionMenuOpen = false;
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

					for (var1 = 0; var1 < 2048; ++var1) {
						Client.localPlayers[var1] = null;
						Client.cachedAppearances[var1] = null;
					}

					for (var1 = 0; var1 < '\u8000'; ++var1) {
						Client.localNPCs[var1] = null;
					}

					Player.myPlayer = Client.localPlayers[2047] = new Player();
					Client.anInt2837 = 739185759;
					Client.projectileDeque.method1333();
					Client.aClass105_2928.method1333();

					for (var1 = 0; var1 < 4; ++var1) {
						for (var2 = 0; var2 < 104; ++var2) {
							for (var3 = 0; var3 < 104; ++var3) {
								Client.groundItemArray[var1][var2][var3] = null;
							}
						}
					}

					Client.aClass105_2939 = new Deque();
					Client.anInt2954 = 0;
					Client.friendListCount = 0;
					Client.ignoreListCount = 0;

					for (var1 = 0; var1 < Varp.anInt2045 * -1989920909; ++var1) {
						Varp var18 = SpotAnim.method2149(var1, (byte) 4);
						if (null != var18) {
							Class88.anIntArray1317[var1] = 0;
							Class88.configSettings[var1] = 0;
						}
					}

					for (var1 = 0; var1 < Client.anIntArray2864.length; ++var1) {
						Client.anIntArray2864[var1] = -1;
					}

					Client.anInt2789 = 801480023;
					if (-1 != Client.openInterfaceID * 1523906617) {
						Class5.method92(Client.openInterfaceID * 1523906617);
					}

					for (Class108_Sub10 var17 = (Class108_Sub10) Client.aClass101_2866.method1304(); null != var17; var17 = (Class108_Sub10) Client.aClass101_2866.method1303()) {
						Class108_Sub10.method1682(var17, true, (short) 272);
					}

					Client.openInterfaceID = -1256289801;
					Client.aClass101_2866 = new HashTable(8);
					Client.aClass108_Sub17_2869 = null;
					Client.actionMenuOpen = false;
					Client.menuActionRow = 0;
					Client.aClass93_2926.initialize((int[]) null, new int[]{0, 0, 0, 0, 0}, false, -1, -1809930983);

					for (var1 = 0; var1 < 8; ++var1) {
						Client.aStringArray2834[var1] = null;
						Client.aBoolArray2835[var1] = false;
					}

					Class108_Sub12.aClass101_1673 = new HashTable(32);
					Client.aBool2874 = true;

					for (var1 = 0; var1 < 100; ++var1) {
						Client.aBoolArray2909[var1] = true;
					}

					Client.aString2967 = null;
					Class27.anInt363 = 0;
					Class50.friendsChatList = null;
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
				Friend.method661(-2, -16711936);
			}
		}
	}
}
