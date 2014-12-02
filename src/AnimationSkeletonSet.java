public class AnimationSkeletonSet extends CacheableNode {

	static PingRequest aClass85_2259;
	static int anInt2260;
	static byte[][][] overlayRotations;
	public static final int anInt2262 = 202;
	static byte[][] loadedCharacterPixels;
	AnimationSkeleton[] animations;
	public static final int anInt2265 = 97;
	static final int anInt2266 = 70;
	static final int anInt2267 = 4096;
	public static final int anInt2268 = 60;


	AnimationSkeletonSet(AbstractIndex var1, AbstractIndex var2, int archiveID, boolean var4) {
		Deque var12 = new Deque();
		int var6 = var1.getFileCount(archiveID, (byte) -61);
		this.animations = new AnimationSkeleton[var6];
		int[] fileList = var1.method1013(archiveID, -140913151);
		int fileID = 0;

		while (fileID < fileList.length) {
			byte[] var8 = var1.getFile(archiveID, fileList[fileID], (byte) 7);
			AnimationSkin animSkin = null;
			int var10 = (var8[0] & 255) << 8 | var8[1] & 255;
			AnimationSkin var13 = (AnimationSkin) var12.getFront();

			while (true) {
				if (null != var13) {
					if (var13.anInt1630 * -1259948989 != var10) {
						var13 = (AnimationSkin) var12.getNext();
						continue;
					}

					animSkin = var13;
				}

				if (animSkin == null) {
					byte[] var11;
					if (var4) {
						var11 = var2.getFileData(0, var10, -28237808);
					} else {
						var11 = var2.getFileData(var10, 0, 1160605957);
					}

					animSkin = new AnimationSkin(var10, var11);
					var12.insertBack(animSkin);
				}

				this.animations[fileList[fileID]] = new AnimationSkeleton(var8, animSkin);
				++fileID;
				break;
			}
		}

	}

	public static BuildType[] method2557(byte var0) {
		return new BuildType[]{BuildType.aClass79_1234, BuildType.aClass79_1237, BuildType.aClass79_1232, BuildType.aClass79_1233};
	}

	public static void method2562(AbstractIndex var0, AbstractIndex var1, int var2) {
		IdentityKit.aClass74_2197 = var0;
		IdentityKit.aClass74_2201 = var1;
		IdentityKit.anInt2198 = IdentityKit.aClass74_2197.getFileCount(3, (byte) -64) * -1574854679;
	}

	public boolean method2563(int var1, byte var2) {
		return this.animations[var1].aBool606;
	}

	static final void decodeOtherMovement() {
		int numLocalPlayers = Client.packetBuffer.readBits(8);
		System.out.println("Local players: " + numLocalPlayers);
		int ptr;
		if (numLocalPlayers < Client.numLocalPlayers * -43742683) {
			for (ptr = numLocalPlayers; ptr < Client.numLocalPlayers * -43742683; ++ptr) {
				Client.indicesPendingRemoval[(Client.removedCounter += 1906858221) * 104842469 - 1] = Client.playerIndices[ptr];
			}
		}

		if (numLocalPlayers > Client.numLocalPlayers * -43742683) {
			throw new RuntimeException("");
		} else {
			Client.numLocalPlayers = 0;

			for (ptr = 0; ptr < numLocalPlayers; ++ptr) {
				int index = Client.playerIndices[ptr];
				Player var5 = Client.localPlayers[index];
				int moved = Client.packetBuffer.readBits(1);
				if (moved == 0) {
					Client.playerIndices[(Client.numLocalPlayers -= 1542815315) * -43742683 - 1] = index;
					var5.lastUpdated = Client.cycle * 1761958407;
				} else {
					int movetype = Client.packetBuffer.readBits(2);
					if (0 == movetype) {
						Client.playerIndices[(Client.numLocalPlayers -= 1542815315) * -43742683 - 1] = index;
						var5.lastUpdated = Client.cycle * 1761958407;
						Client.playersNeedingUpdating[(Client.updateReqCount -= 472402375) * -184592375 - 1] = index;
					} else {
						int var7;
						int var8;
						if (movetype == 1) {
							Client.playerIndices[(Client.numLocalPlayers -= 1542815315) * -43742683 - 1] = index;
							var5.lastUpdated = Client.cycle * 1761958407;
							var8 = Client.packetBuffer.readBits(3);
							var5.moveInDirection(var8, false, -548715931);
							var7 = Client.packetBuffer.readBits(1);
							if (1 == var7) {
								Client.playersNeedingUpdating[(Client.updateReqCount -= 472402375) * -184592375 - 1] = index;
							}
						} else if (2 == movetype) {
							Client.playerIndices[(Client.numLocalPlayers -= 1542815315) * -43742683 - 1] = index;
							var5.lastUpdated = Client.cycle * 1761958407;
							var8 = Client.packetBuffer.readBits(3);
							var5.moveInDirection(var8, true, -548715931);
							var7 = Client.packetBuffer.readBits(3);
							var5.moveInDirection(var7, true, -548715931);
							int maskUpdate = Client.packetBuffer.readBits(1);
							if (1 == maskUpdate) {
								Client.playersNeedingUpdating[(Client.updateReqCount -= 472402375) * -184592375 - 1] = index;
							}
						} else if (movetype == 3) {
							Client.indicesPendingRemoval[(Client.removedCounter += 1906858221) * 104842469 - 1] = index;
							System.out.println("Removed " + index);
						}
					}
				}
			}

		}
	}

	static void pushMessage(int type, String var1, String var2, int var3) {
		FloorDefinition.pushDirectMessage(type, var1, var2, (String) null, 403249369);
	}
}
