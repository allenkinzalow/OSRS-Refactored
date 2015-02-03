import java.awt.Component;

public class GameObject extends Renderable {

   int anInt2419;
   int anInt2421;
   int anInt2422;
   int anInt2423;
   AnimationDefinition animationSequence;
   int objectID;
   int animationFrame;
   int animationCycleDelay;
   static Class19 aClass19_2428;
   int anInt2429;


   public static void method2845(Component var0, int var1) {
      var0.removeMouseListener(MouseInputHandler.mouseInputHandler);
      var0.removeMouseMotionListener(MouseInputHandler.mouseInputHandler);
      var0.removeFocusListener(MouseInputHandler.mouseInputHandler);
      MouseInputHandler.anInt766 = 0;
   }

   GameObject(int var1, int var2, int var3, int var4, int var5, int var6, int animationId, boolean var8, Renderable var9) {
      this.objectID = var1 * -315739107;
      this.anInt2419 = var2 * -786417823;
      this.anInt2421 = var3 * 1406947857;
      this.anInt2429 = var4 * -646924351;
      this.anInt2423 = var5 * 1844025323;
      this.anInt2422 = var6 * 1013731623;
      if(-1 != animationId) {
         this.animationSequence = AnimationDefinition.getAnimDefForID(animationId, 2098064037);
         this.animationFrame = 0;
         this.animationCycleDelay = Client.cycle * -238286763 + 1355118769;
         if(this.animationSequence.delayType * -95027165 == 0 && null != var9 && var9 instanceof GameObject) {
            GameObject var10 = (GameObject)var9;
            if(var10.animationSequence == this.animationSequence) {
               this.animationFrame = var10.animationFrame * 1;
               this.animationCycleDelay = var10.animationCycleDelay * 1;
               return;
            }
         }

         if(var8) {
            if(-1 != this.animationSequence.frameStep * 1569702809) {
               this.animationFrame = (int)(Math.random() * (double)this.animationSequence.frameIDs.length) * 958071567;
               this.animationCycleDelay -= (int)(Math.random() * (double)this.animationSequence.frameLengths[this.animationFrame * -1661891601]) * -1355118769;
            }
         }
      }
   }

   static void method2846(Applet_Sub1 var0, byte var1) {
      if(1 != MouseInputHandler.clickType * 1629072957) {
         if(Class100.aBool1391) {
            return;
         }

         if(MouseInputHandler.clickType * 1629072957 != 4) {
            return;
         }
      }

      short var2 = 280;
      if(MouseInputHandler.mousePressX * 472132205 >= var2 && MouseInputHandler.mousePressX * 472132205 <= var2 + 14 && MouseInputHandler.mousePressY * 1498262827 >= 4 && MouseInputHandler.mousePressY * 1498262827 <= 18) {
         MachineInformation.method1923(0, 0, (byte) 102);
      } else if(MouseInputHandler.mousePressX * 472132205 >= var2 + 15 && MouseInputHandler.mousePressX * 472132205 <= var2 + 80 && MouseInputHandler.mousePressY * 1498262827 >= 4 && MouseInputHandler.mousePressY * 1498262827 <= 18) {
         MachineInformation.method1923(0, 1, (byte) 93);
      } else {
         short var3 = 390;
         if(MouseInputHandler.mousePressX * 472132205 >= var3 && MouseInputHandler.mousePressX * 472132205 <= var3 + 14 && MouseInputHandler.mousePressY * 1498262827 >= 4 && MouseInputHandler.mousePressY * 1498262827 <= 18) {
            MachineInformation.method1923(1, 0, (byte) 113);
         } else if(MouseInputHandler.mousePressX * 472132205 >= 15 + var3 && MouseInputHandler.mousePressX * 472132205 <= var3 + 80 && MouseInputHandler.mousePressY * 1498262827 >= 4 && MouseInputHandler.mousePressY * 1498262827 <= 18) {
            MachineInformation.method1923(1, 1, (byte) 123);
         } else {
            short var4 = 500;
            if(MouseInputHandler.mousePressX * 472132205 >= var4 && MouseInputHandler.mousePressX * 472132205 <= var4 + 14 && MouseInputHandler.mousePressY * 1498262827 >= 4 && MouseInputHandler.mousePressY * 1498262827 <= 18) {
               MachineInformation.method1923(2, 0, (byte) 52);
            } else if(MouseInputHandler.mousePressX * 472132205 >= var4 + 15 && MouseInputHandler.mousePressX * 472132205 <= var4 + 80 && MouseInputHandler.mousePressY * 1498262827 >= 4 && MouseInputHandler.mousePressY * 1498262827 <= 18) {
               MachineInformation.method1923(2, 1, (byte) 61);
            } else {
               short var5 = 610;
               if(MouseInputHandler.mousePressX * 472132205 >= var5 && MouseInputHandler.mousePressX * 472132205 <= 14 + var5 && MouseInputHandler.mousePressY * 1498262827 >= 4 && MouseInputHandler.mousePressY * 1498262827 <= 18) {
                  MachineInformation.method1923(3, 0, (byte) 107);
               } else if(MouseInputHandler.mousePressX * 472132205 >= 15 + var5 && MouseInputHandler.mousePressX * 472132205 <= var5 + 80 && MouseInputHandler.mousePressY * 1498262827 >= 4 && MouseInputHandler.mousePressY * 1498262827 <= 18) {
                  MachineInformation.method1923(3, 1, (byte) 116);
               } else if(MouseInputHandler.mousePressX * 472132205 >= 708 && MouseInputHandler.mousePressY * 1498262827 >= 4 && MouseInputHandler.mousePressX * 472132205 <= 758 && MouseInputHandler.mousePressY * 1498262827 <= 20) {
                  PlayerLoginDetails.worldListOpen = false;
                  PlayerLoginDetails.clientBackgroundLeft.drawSprite(0, 0);
                  Class41.clientBackgroundRight.drawSprite(382, 0);
                  IndexTable.clientLogo.drawSprite(382 - IndexTable.clientLogo.anInt2413 / 2, 18);
               } else if(PlayerLoginDetails.hoveredWorldID * -202005965 != -1) {
                  World var6 = World.worldList[PlayerLoginDetails.hoveredWorldID * -202005965];
                  World.method103(var6, -1418644820);
                  PlayerLoginDetails.worldListOpen = false;
                  PlayerLoginDetails.clientBackgroundLeft.drawSprite(0, 0);
                  Class41.clientBackgroundRight.drawSprite(382, 0);
                  IndexTable.clientLogo.drawSprite(382 - IndexTable.clientLogo.anInt2413 / 2, 18);
               }
            }
         }
      }
   }

   protected final ModelRasterizer getModelRasterizer(byte var1) {
      if(this.animationSequence != null) {
         int var4 = Client.cycle * -637317861 - this.animationCycleDelay * 469381039;
         if(var4 > 100 && this.animationSequence.frameStep * 1569702809 > 0) {
            var4 = 100;
         }

         while(var4 > this.animationSequence.frameLengths[this.animationFrame * -1661891601]) {
            var4 -= this.animationSequence.frameLengths[this.animationFrame * -1661891601];
            this.animationFrame += 958071567;
            if(this.animationFrame * -1661891601 >= this.animationSequence.frameIDs.length) {
               this.animationFrame -= this.animationSequence.frameStep * -589676297;
               if(this.animationFrame * -1661891601 < 0 || this.animationFrame * -1661891601 >= this.animationSequence.frameIDs.length) {
                  this.animationSequence = null;
                  break;
               }
            }
         }

         this.animationCycleDelay = (Client.cycle * -637317861 - var4) * -1355118769;
      }

      ObjectDefinition objectDef = ObjectDefinition.getObjectDefForID(this.objectID * -1212535243, (byte) 0);
      if(null != objectDef.configChangeDest) {
         objectDef = objectDef.getDefinitionForStatus((byte)45);
      }

      if(null == objectDef) {
         return null;
      } else {
         int var2;
         int var6;
         if(this.anInt2421 * 732749553 != 1 && 3 != this.anInt2421 * 732749553) {
            var2 = objectDef.sizeX * 721302265;
            var6 = objectDef.sizeY * -1917144319;
         } else {
            var2 = objectDef.sizeY * -1917144319;
            var6 = objectDef.sizeX * 721302265;
         }

         int var3 = (var2 >> 1) + this.anInt2423 * 1055512771;
         int var8 = (var2 + 1 >> 1) + this.anInt2423 * 1055512771;
         int var11 = (var6 >> 1) + this.anInt2422 * 1182011031;
         int var10 = (1 + var6 >> 1) + this.anInt2422 * 1182011031;
         int[][] var9 = RegionReference.tileHeights[this.anInt2429 * -1057531839];
         int var12 = var9[var3][var10] + var9[var3][var11] + var9[var8][var11] + var9[var8][var10] >> 2;
         int var5 = (this.anInt2423 * 1055512771 << 7) + (var2 << 6);
         int var7 = (var6 << 6) + (this.anInt2422 * 1182011031 << 7);
         return objectDef.getModelRasterizer(this.anInt2419 * -1433883487, this.anInt2421 * 732749553, var9, var5, var12, var7, this.animationSequence, this.animationFrame * -1661891601, (byte)1);
      }
   }

}
