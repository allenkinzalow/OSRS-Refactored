
public final class Class108_Sub20_Sub14_Sub6 extends Renderable {

   AnimationDefinition animDefinition;
   int anInt2602;
   int anInt2603;
   int anInt2604 = 0;
   int anInt2605;
   int anInt2606;
   static int anInt2607;
   int anInt2608;
   int anInt2609;
   int anInt2610 = 0;
   boolean aBool2612 = false;


   static AnimationSkeletonSet method3072(int animationID, int var1) {
      AnimationSkeletonSet skeletonSet = (AnimationSkeletonSet)AnimationDefinition.animDefCache.get((long)animationID);
      if(null != skeletonSet) {
         return skeletonSet;
      } else {
         skeletonSet = RegionReference.method617(AnimationDefinition.skeletonIndexReference, AnimationDefinition.skinIndexReference, animationID, false, 949323318);
         if(null != skeletonSet) {
            AnimationDefinition.animDefCache.put(skeletonSet, (long)animationID);
         }

         return skeletonSet;
      }
   }

   final void method3073(int var1, int var2) {
      if(!this.aBool2612) {
         this.anInt2604 += var1 * -810584273;

         while(this.anInt2604 * -1437388849 > this.animDefinition.frameLengths[this.anInt2610 * -533807825]) {
            this.anInt2604 -= this.animDefinition.frameLengths[this.anInt2610 * -533807825] * -810584273;
            this.anInt2610 += 192915919;
            if(this.anInt2610 * -533807825 >= this.animDefinition.frameDelays.length) {
               this.aBool2612 = true;
               return;
            }
         }

      }
   }

   protected final ModelRasterizer getModelRasterizer(byte var1) {
      SpotAnim spotAnim = SpotAnim.getSpotAnimForID(this.anInt2608 * -217366671, (byte) 0);
      ModelRasterizer var3;
      if(this.aBool2612) {
         var3 = spotAnim.getModelRasterizer(-1, -380943559);
      } else {
         var3 = spotAnim.getModelRasterizer(this.anInt2610 * -533807825, -380943559);
      }

      return var3 != null?var3:null;
   }

   Class108_Sub20_Sub14_Sub6(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.anInt2608 = var1 * -135552623;
      this.anInt2603 = var2 * 934010437;
      this.anInt2609 = var3 * 1751415445;
      this.anInt2605 = var4 * -1986090103;
      this.anInt2606 = var5 * -818243291;
      this.anInt2602 = (var7 + var6) * 1819958065;
      int animationID = SpotAnim.getSpotAnimForID(this.anInt2608 * -217366671, (byte) 0).animationID * 338579353;
      if(animationID != -1) {
         this.aBool2612 = false;
         this.animDefinition = CullingCluster.method672(animationID, 1927934523);
      } else {
         this.aBool2612 = true;
      }
   }

   public static boolean method3075(int var0, int var1) {
      return (var0 >> 30 & 1) != 0;
   }
}
