import java.awt.Component;

public class AnimationDefinition extends CacheableNode {

   int[] anIntArray2118;
   public static AbstractIndex skeletonIndexReference;
   public int priority = 1109376177;
   public int[] frameIDs;
   public static AbstractIndex skinIndexReference;
   public int[] frameLengths;
   public int[] anIntArray2126;
   public int frameStep = -1338171561;
   int[] animationFlowControl;
   public boolean oneSquareAnimation = false;
   public int forcedPriority = -2058263741;
   public int leftHandItem = 1255064447;
   public int anInt2133 = -646022153;
   public int rightHandItem = -1102454537;
   static CacheableNodeMap animationDefMap = new CacheableNodeMap(64);
   public int delayType = 1420123926;
   public static AbstractIndex configIndexReference;
   public int resetWhenWalk = 1662613047;

   public static AnimationDefinition getAnimDefForID(int animationID, int var1) {
      AnimationDefinition animDef = (AnimationDefinition) animationDefMap.get((long) animationID);
      if(animDef != null) {
         return animDef;
      } else {
         byte[] var3 = configIndexReference.getFile(12, animationID, (byte) 7);
         animDef = new AnimationDefinition();
         if(var3 != null) {
            animDef.decode(new RSByteBuffer(var3), (byte) 55);
         }

         animDef.method2228(1399039780);
         animationDefMap.put(animDef, (long) animationID);
         return animDef;
      }
   }

   public static void clearAnimationDefMaps(byte var0) {
      animationDefMap.clearCacheMap();
      AnimationSkeletonSet.skeletonSetMap.clearCacheMap();
   }


   void decodeReadValues(RSByteBuffer buffer, int opcode, int var3) {
      int var4;
      int index;
      if(1 == opcode) {
         int frameCount = buffer.readUShort(-31010687);
         this.frameLengths = new int[frameCount];

         for(index = 0; index < frameCount; ++index) {
            this.frameLengths[index] = buffer.readUShort(-1773764172);
         }

         this.frameIDs = new int[frameCount];

         for(index = 0; index < frameCount; ++index) {
            this.frameIDs[index] = buffer.readUShort(491148125);
         }

         for(index = 0; index < frameCount; ++index) {
            this.frameIDs[index] += buffer.readUShort(1498912548) << 16;
         }

      } else if(2 == opcode) {
         this.frameStep = buffer.readUShort(-1084358402) * 1338171561;
      } else if(3 == opcode) {
         var4 = buffer.readUByte();
         this.animationFlowControl = new int[1 + var4];

         for(index = 0; index < var4; ++index) {
            this.animationFlowControl[index] = buffer.readUByte();
         }

         this.animationFlowControl[var4] = 9999999;
      } else if(opcode == 4) {
         this.oneSquareAnimation = true;
      } else if(opcode == 5) {
         this.forcedPriority = buffer.readUByte() * 447340711;
      } else if(opcode == 6) {
         this.leftHandItem = buffer.readUShort(332185638) * -1255064447;
      } else if(opcode == 7) {
         this.rightHandItem = buffer.readUShort(1308575847) * 1102454537;
      } else if(opcode == 8) {
         this.anInt2133 = buffer.readUByte() * 1381746781;
      } else if(opcode == 9) {
         this.resetWhenWalk = buffer.readUByte() * -1662613047;
      } else if(opcode == 10) {
         this.priority = buffer.readUByte() * -1109376177;
      } else if(opcode == 11) {
         this.delayType = buffer.readUByte() * -1437421685;
      } else if(opcode == 12) {
         var4 = buffer.readUByte();
         this.anIntArray2118 = new int[var4];

         for(index = 0; index < var4; ++index) {
            this.anIntArray2118[index] = buffer.readUShort(-995052076);
         }

         for(index = 0; index < var4; ++index) {
            this.anIntArray2118[index] += buffer.readUShort(92869147) << 16;
         }

      } else if(opcode == 13) {
         var4 = buffer.readUByte();
         this.anIntArray2126 = new int[var4];

         for(index = 0; index < var4; ++index) {
            this.anIntArray2126[index] = buffer.method1809(-254310000);
         }

      }
   }

   void method2228(int var1) {
      if(this.resetWhenWalk * 1194451065 == -1) {
         if(this.animationFlowControl != null) {
            this.resetWhenWalk = 969741202;
         } else {
            this.resetWhenWalk = 0;
         }
      }

      if(this.priority * -741149777 == -1) {
         if(null != this.animationFlowControl) {
            this.priority = 2076214942;
         } else {
            this.priority = 0;
         }
      }
   }

   public ModelRasterizer method2229(ModelRasterizer var1, int frame, int var3) {
      int frameID = this.frameIDs[frame];
      AnimationSkeletonSet skeletonSet = AnimationSkeletonSet.getAnimationSkeletonSet(frameID >> 16, 1418403418);
      frameID &= '\uffff';
      if(null == skeletonSet) {
         return var1.method2852(true);
      } else {
         ModelRasterizer var5 = var1.method2852(!skeletonSet.isStepAlpha(frameID, (byte) 74));
         var5.applyTransform(skeletonSet, frameID);
         return var5;
      }
   }

   ModelRasterizer getTransformedRasterizer(ModelRasterizer var1, int frame, int var3) {
      int frameID = this.frameIDs[frame];
      AnimationSkeletonSet skeletonSet = AnimationSkeletonSet.getAnimationSkeletonSet(frameID >> 16, 1925624292);
      frameID &= '\uffff';
      if(skeletonSet == null) {
         return var1.method2907(true);
      } else {
         ModelRasterizer var4 = var1.method2907(!skeletonSet.isStepAlpha(frameID, (byte) 74));
         var4.applyTransform(skeletonSet, frameID);
         return var4;
      }
   }

   void decode(RSByteBuffer buffer, byte var2) {
      while(true) {
         int opcode = buffer.readUByte();
         if(opcode == 0) {
            if(var2 == 55) {
               return;
            }

            return;
         }

         this.decodeReadValues(buffer, opcode, 2136357157);
      }
   }

   public ModelRasterizer method2233(ModelRasterizer var1, int frameID, byte var3) {
      int var4 = this.frameIDs[frameID];
      AnimationSkeletonSet var8 = AnimationSkeletonSet.getAnimationSkeletonSet(var4 >> 16, 432968839);
      var4 &= '\uffff';
      if(null == var8) {
         return var1.method2852(true);
      } else {
         AnimationSkeletonSet var6 = null;
         int var7 = 0;
         if(this.anIntArray2118 != null && frameID < this.anIntArray2118.length) {
            var7 = this.anIntArray2118[frameID];
            var6 = AnimationSkeletonSet.getAnimationSkeletonSet(var7 >> 16, 506279496);
            var7 &= '\uffff';
         }

         ModelRasterizer var5;
         if(var6 != null && var7 != '\uffff') {
            var5 = var1.method2852(!var8.isStepAlpha(var4, (byte) 74) & !var6.isStepAlpha(var7, (byte) 74));
            var5.applyTransform(var8, var4);
            var5.applyTransform(var6, var7);
            return var5;
         } else {
            var5 = var1.method2852(!var8.isStepAlpha(var4, (byte) 74));
            var5.applyTransform(var8, var4);
            return var5;
         }
      }
   }

   static String method2234(RSInterface var0, byte var1) {
      return Class2.method41(Class32.method576(var0, 1127152712), -1093430107) == 0?null:(null != var0.selectedActionName && var0.selectedActionName.trim().length() != 0?var0.selectedActionName:null);
   }

   ModelRasterizer method2235(ModelRasterizer var1, int var2, int var3, int var4) {
      var2 = this.frameIDs[var2];
      AnimationSkeletonSet skeleton = AnimationSkeletonSet.getAnimationSkeletonSet(var2 >> 16, 1592292260);
      var2 &= '\uffff';
      if(skeleton == null) {
         return var1.method2852(true);
      } else {
         ModelRasterizer rasterizer = var1.method2852(!skeleton.isStepAlpha(var2, (byte) 74));
         var3 &= 3;
         if(1 == var3) {
            rasterizer.method2863();
         } else if(var3 == 2) {
            rasterizer.method2862();
         } else if(var3 == 3) {
            rasterizer.rotate90();
         }

         rasterizer.applyTransform(skeleton, var2);
         if(var3 == 1) {
            rasterizer.rotate90();
         } else if(var3 == 2) {
            rasterizer.method2862();
         } else if(var3 == 3) {
            rasterizer.method2863();
         }

         return rasterizer;
      }
   }

   public static void method2237(Component var0, byte var1) {
      var0.addMouseListener(MouseInputHandler.mouseInputHandler);
      var0.addMouseMotionListener(MouseInputHandler.mouseInputHandler);
      var0.addFocusListener(MouseInputHandler.mouseInputHandler);
   }

   public ModelRasterizer method2265(ModelRasterizer var1, int var2, AnimationDefinition var3, int var4, byte var5) {
      var2 = this.frameIDs[var2];
      AnimationSkeletonSet var6 = AnimationSkeletonSet.getAnimationSkeletonSet(var2 >> 16, 1825573478);
      var2 &= '\uffff';
      if(var6 == null) {
         return var3.method2229(var1, var4, -1345282556);
      } else {
         var4 = var3.frameIDs[var4];
         AnimationSkeletonSet var7 = AnimationSkeletonSet.getAnimationSkeletonSet(var4 >> 16, 743656016);
         var4 &= '\uffff';
         ModelRasterizer rasterizer;
         if(var7 == null) {
            rasterizer = var1.method2852(!var6.isStepAlpha(var2, (byte) 74));
            rasterizer.applyTransform(var6, var2);
            return rasterizer;
         } else {
            rasterizer = var1.method2852(!var6.isStepAlpha(var2, (byte) 74) & !var7.isStepAlpha(var4, (byte) 74));
            rasterizer.method2859(var6, var2, var7, var4, this.animationFlowControl);
            return rasterizer;
         }
      }
   }
}
