import java.awt.Component;

public class AnimationDefinition extends CacheableNode {

   int[] anIntArray2118;
   public static AbstractIndex skeletonIndexReference;
   static CacheableNodeMap animDefCache = new CacheableNodeMap(100);
   public static final int anInt2121 = 143;
   public int priority = 1109376177;
   public int[] frameDelays;
   public static AbstractIndex skinIndexReference;
   public int[] frameLengths;
   public int[] anIntArray2126;
   public int frameStep = -1338171561;
   int[] animationFlowControl;
   public boolean oneSquareAnimation = false;
   public int forcedPriority = -2058263741;
   public int leftHandItem = 1255064447;
   static final int anInt2132 = 72;
   public int anInt2133 = -646022153;
   public int rightHandItem = -1102454537;
   static CacheableNodeMap aClass106_2135 = new CacheableNodeMap(64);
   public int delayType = 1420123926;
   static final int anInt2137 = 46;
   static final int anInt2138 = 500;
   static final int anInt2139 = 14;
   public static AbstractIndex configIndexReference;
   public int resetWhenWalk = 1662613047;


   void method2227(RSByteBuffer buffer, int opcode, int var3) {
      int var4;
      int index;
      if(1 == opcode) {
         int frameCount = buffer.readUShort(-31010687);
         this.frameLengths = new int[frameCount];

         for(index = 0; index < frameCount; ++index) {
            this.frameLengths[index] = buffer.readUShort(-1773764172);
         }

         this.frameDelays = new int[frameCount];

         for(index = 0; index < frameCount; ++index) {
            this.frameDelays[index] = buffer.readUShort(491148125);
         }

         for(index = 0; index < frameCount; ++index) {
            this.frameDelays[index] += buffer.readUShort(1498912548) << 16;
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

   public ModelRasterizer method2229(ModelRasterizer var1, int var2, int var3) {
      var2 = this.frameDelays[var2];
      AnimationSkeletonSet var4 = Class108_Sub20_Sub14_Sub6.method3072(var2 >> 16, 1418403418);
      var2 &= '\uffff';
      if(null == var4) {
         return var1.method2852(true);
      } else {
         ModelRasterizer var5 = var1.method2852(!var4.method2563(var2, (byte)74));
         var5.applyTransform(var4, var2);
         return var5;
      }
   }

   ModelRasterizer method2231(ModelRasterizer var1, int var2, int var3) {
      var2 = this.frameDelays[var2];
      AnimationSkeletonSet var5 = Class108_Sub20_Sub14_Sub6.method3072(var2 >> 16, 1925624292);
      var2 &= '\uffff';
      if(var5 == null) {
         return var1.method2907(true);
      } else {
         ModelRasterizer var4 = var1.method2907(!var5.method2563(var2, (byte)74));
         var4.applyTransform(var5, var2);
         return var4;
      }
   }

   void method2232(RSByteBuffer var1, byte var2) {
      while(true) {
         int var3 = var1.readUByte();
         if(var3 == 0) {
            if(var2 == 55) {
               return;
            }

            return;
         }

         this.method2227(var1, var3, 2136357157);
      }
   }

   public ModelRasterizer method2233(ModelRasterizer var1, int var2, byte var3) {
      int var4 = this.frameDelays[var2];
      AnimationSkeletonSet var8 = Class108_Sub20_Sub14_Sub6.method3072(var4 >> 16, 432968839);
      var4 &= '\uffff';
      if(null == var8) {
         return var1.method2852(true);
      } else {
         AnimationSkeletonSet var6 = null;
         int var7 = 0;
         if(this.anIntArray2118 != null && var2 < this.anIntArray2118.length) {
            var7 = this.anIntArray2118[var2];
            var6 = Class108_Sub20_Sub14_Sub6.method3072(var7 >> 16, 506279496);
            var7 &= '\uffff';
         }

         ModelRasterizer var5;
         if(var6 != null && var7 != '\uffff') {
            var5 = var1.method2852(!var8.method2563(var4, (byte)74) & !var6.method2563(var7, (byte)74));
            var5.applyTransform(var8, var4);
            var5.applyTransform(var6, var7);
            return var5;
         } else {
            var5 = var1.method2852(!var8.method2563(var4, (byte)74));
            var5.applyTransform(var8, var4);
            return var5;
         }
      }
   }

   static String method2234(RSInterface var0, byte var1) {
      return Class2.method41(Class32.method576(var0, 1127152712), -1093430107) == 0?null:(null != var0.selectedActionName && var0.selectedActionName.trim().length() != 0?var0.selectedActionName:null);
   }

   ModelRasterizer method2235(ModelRasterizer var1, int var2, int var3, int var4) {
      var2 = this.frameDelays[var2];
      AnimationSkeletonSet var6 = Class108_Sub20_Sub14_Sub6.method3072(var2 >> 16, 1592292260);
      var2 &= '\uffff';
      if(var6 == null) {
         return var1.method2852(true);
      } else {
         ModelRasterizer rasterizer = var1.method2852(!var6.method2563(var2, (byte)74));
         var3 &= 3;
         if(1 == var3) {
            rasterizer.method2863();
         } else if(var3 == 2) {
            rasterizer.method2862();
         } else if(var3 == 3) {
            rasterizer.rotate90();
         }

         rasterizer.applyTransform(var6, var2);
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

   public static ItemDefinition getItemDefinition(int itemID, int var1) {
      ItemDefinition definition = (ItemDefinition) ItemDefinition.itemDefinitionMap.get((long)itemID);
      if(definition != null) {
         return definition;
      } else {
         byte[] byteArray = ItemDefinition.configIndexReference.getFile(10, itemID, (byte) 7);
         definition = new ItemDefinition();
         definition.itemID = itemID * 803537925;
         if(null != byteArray) {
            definition.decode(new RSByteBuffer(byteArray), (byte) 104);
         }

         definition.method2089((byte)-97);
         if(definition.notedTemplate * -910205763 != -1) {
            definition.method2123(getItemDefinition(definition.notedTemplate * -910205763, -702304258), getItemDefinition(definition.notedID * -616959653, -471384956), 2075734647);
         }

         if(!ItemDefinition.aBool1974 && definition.members) {
            definition.name = StringConstants.MEMBERS_OBJECT;
            definition.options = null;
            definition.interfaceOptions = null;
            definition.team = 0;
         }

         ItemDefinition.itemDefinitionMap.put(definition, (long)itemID);
         return definition;
      }
   }

   static final void renderActionMenu(byte var0) {
      int xPos = Class51.actionMenuX * -745630459;
      int yPos = MouseInputHandler.actionMenuY * -740301953;
      int width = Class54.actionMenuWidth * 1703965243;
      int height = Item.actionMenuHeight * 720768655;
      int chooseColor = 6116423;
      Rasterizer2D.drawFilledRectangle(xPos, yPos, width, height, chooseColor);
      Rasterizer2D.drawFilledRectangle(1 + xPos, 1 + yPos, width - 2, 16, 0);
      Rasterizer2D.drawUnfilledRectangle(xPos + 1, yPos + 18, width - 2, height - 19, 0);
      RSTypeFace.b12_full_font.drawString(StringConstants.CHOOSE_OPTION, 3 + xPos, yPos + 14, chooseColor, -1);
      int mouseX = MouseInputHandler.mouseX * -367052265;
      int mouseY = MouseInputHandler.mouseY * 1533395117;

      int color;
      int var10;
      int yOffset;
      for(var10 = 0; var10 < Client.menuActionRow * 391839991; ++var10) {
         yOffset = yPos + 31 + (Client.menuActionRow * 391839991 - 1 - var10) * 15;
         color = 16777215;
         if(mouseX > xPos && mouseX < xPos + width && mouseY > yOffset - 13 && mouseY < yOffset + 3) {
            color = 16776960;
         }

         RSFont b12_full = RSTypeFace.b12_full_font;
         String menuActionName;
         if(Client.menuActionNames[var10].length() > 0) {
            menuActionName = Client.menuActionNamePrefix[var10] + StringConstants.aString1109 + Client.menuActionNames[var10];
         } else {
            menuActionName = Client.menuActionNamePrefix[var10];
         }

         b12_full.drawString(menuActionName, xPos + 3, yOffset, color, 0);
      }

      var10 = Class51.actionMenuX * -745630459;
      yOffset = MouseInputHandler.actionMenuY * -740301953;
      color = Class54.actionMenuWidth * 1703965243;
      int var14 = Item.actionMenuHeight * 720768655;

      for(int var13 = 0; var13 < Client.anInt2907 * -792079877; ++var13) {
         if(Client.anIntArray2912[var13] + Client.anIntArray2914[var13] > var10 && Client.anIntArray2912[var13] < color + var10 && Client.anIntArray2913[var13] + Client.anIntArray2905[var13] > yOffset && Client.anIntArray2913[var13] < var14 + yOffset) {
            Client.aBoolArray2910[var13] = true;
         }
      }

   }

   public ModelRasterizer method2265(ModelRasterizer var1, int var2, AnimationDefinition var3, int var4, byte var5) {
      var2 = this.frameDelays[var2];
      AnimationSkeletonSet var6 = Class108_Sub20_Sub14_Sub6.method3072(var2 >> 16, 1825573478);
      var2 &= '\uffff';
      if(var6 == null) {
         return var3.method2229(var1, var4, -1345282556);
      } else {
         var4 = var3.frameDelays[var4];
         AnimationSkeletonSet var7 = Class108_Sub20_Sub14_Sub6.method3072(var4 >> 16, 743656016);
         var4 &= '\uffff';
         ModelRasterizer rasterizer;
         if(var7 == null) {
            rasterizer = var1.method2852(!var6.method2563(var2, (byte)74));
            rasterizer.applyTransform(var6, var2);
            return rasterizer;
         } else {
            rasterizer = var1.method2852(!var6.method2563(var2, (byte)74) & !var7.method2563(var4, (byte)74));
            rasterizer.method2859(var6, var2, var7, var4, this.animationFlowControl);
            return rasterizer;
         }
      }
   }
}
