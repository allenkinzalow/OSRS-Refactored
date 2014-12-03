import java.io.FileOutputStream;
import java.util.Arrays;

public final class PlainTile {

	int anInt503;
	int anInt504;
	int anInt505;
	static final int anInt506 = 21;
	int anInt507;
	boolean aBool508 = true;
	int anInt509;
	public static final int anInt510 = 55;
	int colorRGB;
	public static final int anInt512 = 166;


	PlainTile(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.anInt503 = var1 * -512283729;
		this.anInt504 = var2 * -1586560989;
		this.anInt505 = var3 * -1642308895;
		this.anInt507 = var4 * -24447613;
		this.anInt509 = var5 * -2120248913;
		this.colorRGB = var6 * 1571358205;
		this.aBool508 = var7;
	}

	static final int method622(int var0, int var1, int var2) {
		if (-1 == var0) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 >= 2) {
				if (var1 > 126) {
					var1 = 126;
				}
			} else {
				var1 = 2;
			}

			return var1 + (var0 & '\uff80');
		}
	}

	public static byte[] fileToByteArray(Object fileObject, boolean newByteArray, int var2) {
		if (fileObject == null) {
			return null;
		} else if (fileObject instanceof byte[]) {
			byte[] fileData = (byte[]) ((byte[]) fileObject);
			if (newByteArray) {
				int fileLength = fileData.length;
				byte[] fileDataArray = new byte[fileLength];
				System.arraycopy(fileData, 0, fileDataArray, 0, fileLength);
				return fileDataArray;
			} else {
				return fileData;
			}
		} else if (fileObject instanceof Class66) {
			Class66 var3 = (Class66) fileObject;
			return var3.method891((byte) 46);
		} else {
			throw new IllegalArgumentException();
		}
	}

	static final void method624(boolean dynamic, byte var1) {
		Client.isAtDynamicMap = dynamic;
		int rx;
		int ry;
		int rid;
		int localx;
		int height;
		int cy;
		int nummaps;
		int cx;
		int localy;

		if (!Client.isAtDynamicMap) {
			localx = Client.packetBuffer.readUShortA();
			height = Client.packetBuffer.readUByte();
			cy = Client.packetBuffer.readUShortA();
			nummaps = (Client.anInt2927 * -574496637 - Client.packetBuffer.position * 798331555) / 16;
			Class47.anIntArrayArray673 = new int[nummaps][4];

			for (cx = 0; cx < nummaps; ++cx) {
				for (localy = 0; localy < 4; ++localy) {
					Class47.anIntArrayArray673[cx][localy] = Client.packetBuffer.readInt();
				}
			}

			cx = Client.packetBuffer.readUShortA();
			localy = Client.packetBuffer.readUShortLEA();

			System.out.printf("MapRegion: base=[%d, %d], localx=%d, %d, nummaps=%d, localy=%d%n", cx, cy, localx, height, nummaps, localy);

			GraphicsBuffer.mapCoordinates = new int[nummaps];
			Class32.anIntArray466 = new int[nummaps];
			ClientScript.anIntArray1649 = new int[nummaps];
			Class2.terrainData = new byte[nummaps][];
			ClientScriptDefinition.objectData = new byte[nummaps][];
			boolean var17 = false;
			if ((48 == cx / 8 || cx / 8 == 49) && cy / 8 == 48) {
				var17 = true;
			}

			if (48 == cx / 8 && cy / 8 == 148) {
				var17 = true;
			}

			nummaps = 0;

			for (rx = (cx - 6) / 8; rx <= (6 + cx) / 8; ++rx) {
				for (ry = (cy - 6) / 8; ry <= (6 + cy) / 8; ++ry) {
					rid = (rx << 8) + ry;
					if (!var17 || 49 != ry && ry != 149 && ry != 147 && rx != 50 && (rx != 49 || 47 != ry)) {
						GraphicsBuffer.mapCoordinates[nummaps] = rid;
						Class32.anIntArray466[nummaps] = PingRequester.landscapeIndex.method1005("m" + rx + "_" + ry, 1723285154);
						System.out.println("Keys for region " + rid + ": " + Arrays.toString(Class47.anIntArrayArray673[nummaps]));

						try {
							FileOutputStream fos = new FileOutputStream("keys/" + rid + ".txt");
							fos.write((Class47.anIntArrayArray673[nummaps][0] + "\n" + Class47.anIntArrayArray673[nummaps][1] + "\n" + Class47.anIntArrayArray673[nummaps][2] + "\n" + Class47.anIntArrayArray673[nummaps][3]).getBytes());
							fos.close();
						} catch (Exception orel) {
							orel.printStackTrace();
						}
						ClientScript.anIntArray1649[nummaps] = PingRequester.landscapeIndex.method1005("l" + rx + "_" + ry, 1723285154);
						++nummaps;
					}
				}
			}

			FriendsChatMember.method1684(cx, cy, height, localx, localy, (byte) 122);
		} else {
			localx = Client.packetBuffer.readUByte();
			height = Client.packetBuffer.readUShortA();
			cy = Client.packetBuffer.readUShortA();
			nummaps = Client.packetBuffer.readUShort(997153445);
			Client.packetBuffer.startBitMode();

			int var11;
			for (cx = 0; cx < 4; ++cx) {
				for (localy = 0; localy < 13; ++localy) {
					for (var11 = 0; var11 < 13; ++var11) {
						rx = Client.packetBuffer.readBits(1);
						if (1 == rx) {
							Client.anIntArrayArrayArray2766[cx][localy][var11] = Client.packetBuffer.readBits(26);
						} else {
							Client.anIntArrayArrayArray2766[cx][localy][var11] = -1;
						}
					}
				}
			}

			Client.packetBuffer.endBitAccess();
			cx = (Client.anInt2927 * -574496637 - Client.packetBuffer.position * 798331555) / 16;
			Class47.anIntArrayArray673 = new int[cx][4];

			for (localy = 0; localy < cx; ++localy) {
				for (var11 = 0; var11 < 4; ++var11) {
					Class47.anIntArrayArray673[localy][var11] = Client.packetBuffer.method1761(-1374722345);
				}
			}

			localy = Client.packetBuffer.readUShortLEA();
			GraphicsBuffer.mapCoordinates = new int[cx];
			Class32.anIntArray466 = new int[cx];
			ClientScript.anIntArray1649 = new int[cx];
			Class2.terrainData = new byte[cx][];
			ClientScriptDefinition.objectData = new byte[cx][];
			cx = 0;

			for (var11 = 0; var11 < 4; ++var11) {
				for (rx = 0; rx < 13; ++rx) {
					for (ry = 0; ry < 13; ++ry) {
						rid = Client.anIntArrayArrayArray2766[var11][rx][ry];
						if (rid != -1) {
							int var14 = rid >> 14 & 1023;
							int var15 = rid >> 3 & 2047;
							int var13 = var15 / 8 + (var14 / 8 << 8);

							int var12;
							for (var12 = 0; var12 < cx; ++var12) {
								if (var13 == GraphicsBuffer.mapCoordinates[var12]) {
									var13 = -1;
									break;
								}
							}

							if (-1 != var13) {
								GraphicsBuffer.mapCoordinates[cx] = var13;
								var12 = var13 >> 8 & 255;
								int var16 = var13 & 255;
								Class32.anIntArray466[cx] = PingRequester.landscapeIndex.method1005("m" + var12 + "_" + var16, 1723285154);
								ClientScript.anIntArray1649[cx] = PingRequester.landscapeIndex.method1005("l" + var12 + "_" + var16, 1723285154);
								try {
									FileOutputStream fos = new FileOutputStream("keys/" + var13 + ".txt");
									fos.write((Class47.anIntArrayArray673[cx][0] + "\n" + Class47.anIntArrayArray673[cx][1] + "\n" + Class47.anIntArrayArray673[cx][2] + "\n" + Class47.anIntArrayArray673[cx][3]).getBytes());
									fos.close();
								} catch (Exception orel) {
									orel.printStackTrace();
								}
								++cx;
							}
						}
					}
				}
			}

			FriendsChatMember.method1684(cy, height, localx, nummaps, localy, (byte) 100);
		}
	}

	static final void method625(RSInterface[] var0, int var1, int var2) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			RSInterface var4 = var0[var3];
			if (null != var4) {
				if (0 == var4.componentType * 942877543) {
					if (var4.aClass108_Sub17Array1879 != null) {
						method625(var4.aClass108_Sub17Array1879, var1, -1128005989);
					}

					Class108_Sub10 var5 = (Class108_Sub10) Client.aClass101_2866.get((long) (var4.interfaceHash * -1081473899));
					if (var5 != null) {
						int var6 = var5.anInt1653 * 1557246219;
						if (AbstractIndex.method1073(var6, -796628062)) {
							method625(RSInterface.interface_cache[var6], var1, -1128005989);
						}
					}
				}

				ClientScript var7;
				if (var1 == 0 && var4.anObjectArray1865 != null) {
					var7 = new ClientScript();
					var7.parentInterface = var4;
					var7.parameters = var4.anObjectArray1865;
					GameObject.executeScript(var7, -1719380925);
				}

				if (var1 == 1 && null != var4.anObjectArray1882) {
					if (var4.anInt1772 * -490007465 >= 0) {
						RSInterface var8 = Class108_Sub16.method1926(var4.interfaceHash * -1081473899, -644857330);
						if (null == var8 || null == var8.aClass108_Sub17Array1879 || var4.anInt1772 * -490007465 >= var8.aClass108_Sub17Array1879.length || var4 != var8.aClass108_Sub17Array1879[var4.anInt1772 * -490007465]) {
							continue;
						}
					}

					var7 = new ClientScript();
					var7.parentInterface = var4;
					var7.parameters = var4.anObjectArray1882;
					GameObject.executeScript(var7, -1283139918);
				}
			}
		}

	}

	static char method626(char var0, byte var1) {
		return 181 != var0 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}
}
