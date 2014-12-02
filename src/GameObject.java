import java.awt.Component;

public class GameObject extends Renderable {

   int anInt2419;
   static final int anInt2420 = 2;
   int anInt2421;
   int anInt2422;
   int anInt2423;
   AnimationDefinition animationSequence;
   int objectID;
   int animationFrame;
   int animationCycleDelay;
   static Class19 aClass19_2428;
   int anInt2429;
   static final int anInt2430 = 64;


   public static void method2845(Component var0, int var1) {
      var0.removeMouseListener(MouseInputHandler.aClass58_775);
      var0.removeMouseMotionListener(MouseInputHandler.aClass58_775);
      var0.removeFocusListener(MouseInputHandler.aClass58_775);
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
         this.animationSequence = CullingCluster.method672(animationId, 2098064037);
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
               this.animationFrame = (int)(Math.random() * (double)this.animationSequence.frameDelays.length) * 958071567;
               this.animationCycleDelay -= (int)(Math.random() * (double)this.animationSequence.frameLengths[this.animationFrame * -1661891601]) * -1355118769;
            }
         }
      }
   }

   static void method2846(Applet_Sub1 var0, byte var1) {
      if(1 != MouseInputHandler.anInt780 * 1629072957) {
         if(Class100.aBool1391) {
            return;
         }

         if(MouseInputHandler.anInt780 * 1629072957 != 4) {
            return;
         }
      }

      short var2 = 280;
      if(MouseInputHandler.anInt774 * 472132205 >= var2 && MouseInputHandler.anInt774 * 472132205 <= var2 + 14 && MouseInputHandler.anInt778 * 1498262827 >= 4 && MouseInputHandler.anInt778 * 1498262827 <= 18) {
         Class108_Sub15.method1923(0, 0, (byte)102);
      } else if(MouseInputHandler.anInt774 * 472132205 >= var2 + 15 && MouseInputHandler.anInt774 * 472132205 <= var2 + 80 && MouseInputHandler.anInt778 * 1498262827 >= 4 && MouseInputHandler.anInt778 * 1498262827 <= 18) {
         Class108_Sub15.method1923(0, 1, (byte)93);
      } else {
         short var3 = 390;
         if(MouseInputHandler.anInt774 * 472132205 >= var3 && MouseInputHandler.anInt774 * 472132205 <= var3 + 14 && MouseInputHandler.anInt778 * 1498262827 >= 4 && MouseInputHandler.anInt778 * 1498262827 <= 18) {
            Class108_Sub15.method1923(1, 0, (byte)113);
         } else if(MouseInputHandler.anInt774 * 472132205 >= 15 + var3 && MouseInputHandler.anInt774 * 472132205 <= var3 + 80 && MouseInputHandler.anInt778 * 1498262827 >= 4 && MouseInputHandler.anInt778 * 1498262827 <= 18) {
            Class108_Sub15.method1923(1, 1, (byte)123);
         } else {
            short var4 = 500;
            if(MouseInputHandler.anInt774 * 472132205 >= var4 && MouseInputHandler.anInt774 * 472132205 <= var4 + 14 && MouseInputHandler.anInt778 * 1498262827 >= 4 && MouseInputHandler.anInt778 * 1498262827 <= 18) {
               Class108_Sub15.method1923(2, 0, (byte)52);
            } else if(MouseInputHandler.anInt774 * 472132205 >= var4 + 15 && MouseInputHandler.anInt774 * 472132205 <= var4 + 80 && MouseInputHandler.anInt778 * 1498262827 >= 4 && MouseInputHandler.anInt778 * 1498262827 <= 18) {
               Class108_Sub15.method1923(2, 1, (byte)61);
            } else {
               short var5 = 610;
               if(MouseInputHandler.anInt774 * 472132205 >= var5 && MouseInputHandler.anInt774 * 472132205 <= 14 + var5 && MouseInputHandler.anInt778 * 1498262827 >= 4 && MouseInputHandler.anInt778 * 1498262827 <= 18) {
                  Class108_Sub15.method1923(3, 0, (byte)107);
               } else if(MouseInputHandler.anInt774 * 472132205 >= 15 + var5 && MouseInputHandler.anInt774 * 472132205 <= var5 + 80 && MouseInputHandler.anInt778 * 1498262827 >= 4 && MouseInputHandler.anInt778 * 1498262827 <= 18) {
                  Class108_Sub15.method1923(3, 1, (byte)116);
               } else if(MouseInputHandler.anInt774 * 472132205 >= 708 && MouseInputHandler.anInt778 * 1498262827 >= 4 && MouseInputHandler.anInt774 * 472132205 <= 758 && MouseInputHandler.anInt778 * 1498262827 <= 20) {
                  Class4.worldListOpen = false;
                  Class4.aClass108_Sub20_Sub15_Sub1_40.drawSprite(0, 0);
                  Class41.aClass108_Sub20_Sub15_Sub1_588.drawSprite(382, 0);
                  IndexTable.clientLogo.drawSprite(382 - IndexTable.clientLogo.anInt2413 / 2, 18);
               } else if(Class4.hoveredWorldID * -202005965 != -1) {
                  World var6 = Class4.worldList[Class4.hoveredWorldID * -202005965];
                  Class5.method103(var6, -1418644820);
                  Class4.worldListOpen = false;
                  Class4.aClass108_Sub20_Sub15_Sub1_40.drawSprite(0, 0);
                  Class41.aClass108_Sub20_Sub15_Sub1_588.drawSprite(382, 0);
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
            if(this.animationFrame * -1661891601 >= this.animationSequence.frameDelays.length) {
               this.animationFrame -= this.animationSequence.frameStep * -589676297;
               if(this.animationFrame * -1661891601 < 0 || this.animationFrame * -1661891601 >= this.animationSequence.frameDelays.length) {
                  this.animationSequence = null;
                  break;
               }
            }
         }

         this.animationCycleDelay = (Client.cycle * -637317861 - var4) * -1355118769;
      }

      ObjectDefinition objectDef = ChatMessagesContainer.getObjectDefForID(this.objectID * -1212535243, (byte)0);
      if(null != objectDef.configChangeDest) {
         objectDef = objectDef.method2184((byte)45);
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

   static final void method2847(int var0, int var1, byte var2) {
      if(Client.anInt2935 * -1279723019 == 0 || 3 == Client.anInt2935 * -1279723019) {
         if(MouseInputHandler.anInt780 * 1629072957 != 1) {
            if(Class100.aBool1391) {
               return;
            }

            if(4 != MouseInputHandler.anInt780 * 1629072957) {
               return;
            }
         }

         int var5 = MouseInputHandler.anInt774 * 472132205 - 25 - var0;
         int var4 = MouseInputHandler.anInt778 * 1498262827 - 5 - var1;
         if(var5 >= 0) {
            if(var4 >= 0) {
               if(var5 < 146) {
                  if(var4 < 151) {
                     if(var5 < 0 || var5 > 23 || var4 < 117 || var4 > 142) {
                        var5 -= 73;
                        var4 -= 75;
                        int var6 = Client.anInt2771 * -44898889 + Client.anInt2775 * 1889215063 & 2047;
                        int var7 = Rasterizer3D.SINE[var6];
                        int var8 = Rasterizer3D.COSINE[var6];
                        var7 = var7 * (Client.anInt2957 * 331969371 + 256) >> 8;
                        var8 = var8 * (Client.anInt2957 * 331969371 + 256) >> 8;
                        int var9 = var8 * var5 + var4 * var7 >> 11;
                        int var10 = var4 * var8 - var7 * var5 >> 11;
                        int var3 = var9 + Class108_Sub10.myPlayer.anInt2394 * 171470795 >> 7;
                        int var11 = Class108_Sub10.myPlayer.anInt2339 * 826764905 - var10 >> 7;
                        Client.secureBuffer.writePacket(52);
                        Client.secureBuffer.writeByte(18);
                        Client.secureBuffer.writeByteN(!KeyFocusListener.aBoolArray895[82] ? 0 : (KeyFocusListener.aBoolArray895[81] ? 2 : 1), (byte) 1);
                        Client.secureBuffer.writeAShortLE(var11 + Class15.anInt201 * -1743142671, (byte) -66);
                        Client.secureBuffer.writeAShortLE(var3 + Class100.anInt1388 * 263051377, (byte) 35);
                        Client.secureBuffer.writeByte(var5);
                        Client.secureBuffer.writeByte(var4);
                        Client.secureBuffer.writeShort(Client.anInt2771 * -44898889);
                        Client.secureBuffer.writeByte(57);
                        Client.secureBuffer.writeByte(Client.anInt2775 * 1889215063);
                        Client.secureBuffer.writeByte(Client.anInt2957 * 331969371);
                        Client.secureBuffer.writeByte(89);
                        Client.secureBuffer.writeShort(Class108_Sub10.myPlayer.anInt2394 * 171470795);
                        Client.secureBuffer.writeShort(Class108_Sub10.myPlayer.anInt2339 * 826764905);
                        Client.secureBuffer.writeByte(63);
                        Client.anInt2933 = var3 * -18058427;
                        Client.anInt2894 = var11 * 1849977017;
                     }
                  }
               }
            }
         }
      }
   }

   static void executeScript(ClientScript script, int var1) {
      ClientScriptMap.executeScript(script, 200000, (short)-28048);
   }
}
