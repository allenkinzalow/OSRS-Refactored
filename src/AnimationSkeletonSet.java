/**
 *
 * Contains a map for the skeleton of each frame in an animation.
 */
public class AnimationSkeletonSet extends CacheableNode {

	static SessionRequest js5Session;
	static CacheableNodeMap skeletonSetMap = new CacheableNodeMap(100);
	AnimationSkeleton[] animationSkeletons;


	AnimationSkeletonSet(AbstractIndex skeletonIndex, AbstractIndex skinIndex, int animationID, boolean var4) {
		Deque skinDeque = new Deque();
		int skeletonCount = skeletonIndex.getFileCount(animationID);
		this.animationSkeletons = new AnimationSkeleton[skeletonCount];
		int[] fileList = skeletonIndex.getFileIDs(animationID);
		int fileIDIndex = 0;

		while (fileIDIndex < fileList.length) {
			byte[] skeletonData = skeletonIndex.getFile(animationID, fileList[fileIDIndex], (byte) 7);
			AnimationSkin animSkin = null;
			int skinID = (skeletonData[0] & 255) << 8 | skeletonData[1] & 255;
			AnimationSkin skin = (AnimationSkin) skinDeque.getFront();

			while (true) {
				if (null != skin) {
					if (skin.skinId * -1259948989 != skinID) {
						skin = (AnimationSkin) skinDeque.getNext();
						continue;
					}

					animSkin = skin;
				}

				if (animSkin == null) {
					byte[] skinData;
					if (var4) {
						skinData = skinIndex.getFileData(0, skinID, -28237808);
					} else {
						skinData = skinIndex.getFileData(skinID, 0, 1160605957);
					}

					animSkin = new AnimationSkin(skinID, skinData);
					skinDeque.insertBack(animSkin);
				}

				this.animationSkeletons[fileList[fileIDIndex]] = new AnimationSkeleton(skeletonData, animSkin);
				++fileIDIndex;
				break;
			}
		}

	}

	public static void method2562(AbstractIndex var0, AbstractIndex var1, int var2) {
		IdentityKit.aClass74_2197 = var0;
		IdentityKit.aClass74_2201 = var1;
		IdentityKit.anInt2198 = IdentityKit.aClass74_2197.getFileCount(3) * -1574854679;
	}

	public static AnimationSkeletonSet initAnimSkeletonSet(AbstractIndex skeletonIndex, AbstractIndex skinIndex, int animationID, boolean firstArchive, int var4) {
       boolean shouldContinue = true;
       int[] fileIDs = skeletonIndex.getFileIDs(animationID);

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

	static AnimationSkeletonSet getAnimationSkeletonSet(int animationID, int var1) {
       AnimationSkeletonSet skeletonSet = (AnimationSkeletonSet) skeletonSetMap.get((long)animationID);
       if(null != skeletonSet) {
          return skeletonSet;
       } else {
          skeletonSet = initAnimSkeletonSet(AnimationDefinition.skeletonIndexReference, AnimationDefinition.skinIndexReference, animationID, false, 949323318);
          if(null != skeletonSet) {
             skeletonSetMap.put(skeletonSet, (long) animationID);
          }

          return skeletonSet;
       }
    }

	public boolean isStepAlpha(int skeletonID, byte var2) {
		return this.animationSkeletons[skeletonID].hasAlpha;
	}

}
