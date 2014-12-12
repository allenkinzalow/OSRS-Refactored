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
		int var6 = var1.getFileCount(archiveID);
		this.animations = new AnimationSkeleton[var6];
		int[] fileList = var1.method1013(archiveID);
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
		IdentityKit.anInt2198 = IdentityKit.aClass74_2197.getFileCount(3) * -1574854679;
	}

	public static AnimationSkeletonSet initAnimSkeletonSet(AbstractIndex skeletonIndex, AbstractIndex skinIndex, int animationID, boolean firstArchive, int var4) {
       boolean shouldContinue = true;
       int[] fileIDs = skeletonIndex.method1013(animationID);

       for(int fileIndex = 0; fileIndex < fileIDs.length; ++fileIndex) {
          byte[] skeletonData = skeletonIndex.getFileData(animationID, fileIDs[fileIndex], -1906233178);
          if(skeletonData == null) {
             shouldContinue = false;
          } else {
             int skinID = (skeletonData[0] & 255) << 8 | skeletonData[1] & 255;
             byte[] skinData;
             if(firstArchive) {
                skinData = skinIndex.getFileData(0, skinID, -1658429547);
             } else {
                skinData = skinIndex.getFileData(skinID, 0, 288212166);
             }

             if(null == skinData) {
                shouldContinue = false;
             }
          }
       }

       if(!shouldContinue) {
          return null;
       } else {
          try {
             return new AnimationSkeletonSet(skeletonIndex, skinIndex, animationID, firstArchive);
          } catch (Exception var11) {
             return null;
          }
       }
    }

	public boolean method2563(int var1, byte var2) {
		return this.animations[var1].aBool606;
	}

}
