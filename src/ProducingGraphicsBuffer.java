import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

/**
 * 2d rasterizer?
 * @author allen_000
 *
 */
public final class ProducingGraphicsBuffer extends GraphicsBuffer implements ImageProducer, ImageObserver {

   ColorModel colorModel;
   ImageConsumer imageConsumer;
   static int clientWidth;
   static int clientHeight;


   public final void method261(Graphics var1, int var2, int var3, int var4) {
      this.method1574(783983762);
      var1.drawImage(this.image, var2, var3, this);
   }

   public final void method270(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      this.method1572(var2, var3, var4, var5, (short)-30544);
      Shape var7 = var1.getClip();
      var1.clipRect(var2, var3, var4, var5);
      var1.drawImage(this.image, 0, 0, this);
      var1.setClip(var7);
   }

   public synchronized void addConsumer(ImageConsumer var1) {
      this.imageConsumer = var1;
      var1.setDimensions(this.anInt187 * 582735203, this.anInt181 * 915298425);
      var1.setProperties((Hashtable)null);
      var1.setColorModel(this.colorModel);
      var1.setHints(14);
   }

   public synchronized void removeConsumer(ImageConsumer var1) {
      if(this.imageConsumer == var1) {
         this.imageConsumer = null;
      }
   }

   static final void addToIgnoreList(String toAdd, boolean var1, int var2) {
      if(null != toAdd) {
         if((Client.ignoreListCount * -1283681697 < 100 || Client.anInt2758 * -1950682749 == 1) && Client.ignoreListCount * -1283681697 < 400) {
            String var4 = Class108_Sub10.method1683(toAdd, UnderlayDefinition.aClass116_2142, -2116168234);
            if(var4 != null) {
               String var3;
               int var5;
               String var6;
               for(var5 = 0; var5 < Client.ignoreListCount * -1283681697; ++var5) {
                  Ignore ignore = Client.ignoreList[var5];
                  var6 = Class108_Sub10.method1683(ignore.username, UnderlayDefinition.aClass116_2142, -2090939739);
                  if(var6 != null && var6.equals(var4)) {
                     AnimationSkeletonSet.pushMessage(31, "", toAdd + StringConstants.ALREADY_ON_IGNORE, -448196024);
                     return;
                  }

                  if(ignore.aString387 != null) {
                     var3 = Class108_Sub10.method1683(ignore.aString387, UnderlayDefinition.aClass116_2142, -1955095237);
                     if(null != var3 && var3.equals(var4)) {
                        AnimationSkeletonSet.pushMessage(31, "", toAdd + StringConstants.ALREADY_ON_IGNORE, 7202132);
                        return;
                     }
                  }
               }

               for(var5 = 0; var5 < Client.friendListCount * -163737695; ++var5) {
                  Friend friend = Client.friendList[var5];
                  var6 = Class108_Sub10.method1683(friend.username, UnderlayDefinition.aClass116_2142, -2065261776);
                  if(null != var6 && var6.equals(var4)) {
                     AnimationSkeletonSet.pushMessage(31, "", StringConstants.PLEASE_REMOVE_2 + toAdd + StringConstants.aString1124, 123811380);
                     return;
                  }

                  if(null != friend.aString621) {
                     var3 = Class108_Sub10.method1683(friend.aString621, UnderlayDefinition.aClass116_2142, -1855974988);
                     if(null != var3 && var3.equals(var4)) {
                        AnimationSkeletonSet.pushMessage(31, "", StringConstants.PLEASE_REMOVE_2 + toAdd + StringConstants.aString1124, -855994111);
                        return;
                     }
                  }
               }

               if(Class108_Sub10.method1683(Player.myPlayer.playerName, UnderlayDefinition.aClass116_2142, -1968874516).equals(var4)) {
                  AnimationSkeletonSet.pushMessage(31, "", StringConstants.aString1105, -1446835517);
               } else {
                  Client.secureBuffer.writePacket(222);
                  Client.secureBuffer.writeByte(Class108_Sub20_Sub3.method2069(toAdd, (byte) 64));
                  Client.secureBuffer.writeString(toAdd);
               }
            }
         } else {
            AnimationSkeletonSet.pushMessage(31, "", StringConstants.aString1063, 300930071);
         }
      }
   }

   public void requestTopDownLeftRightResend(ImageConsumer var1) {}

   synchronized void method1572(int var1, int var2, int var3, int var4, short var5) {
      if(this.imageConsumer == null) {
         if(var5 >= 128) {
            ;
         }
      } else {
         this.imageConsumer.setPixels(var1, var2, var3, var4, this.colorModel, this.anIntArray180, var1 + var2 * this.anInt187 * 582735203, this.anInt187 * 582735203);
         this.imageConsumer.imageComplete(2);
      }
   }

   public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
      return true;
   }

   synchronized void method1574(int var1) {
      if(null != this.imageConsumer) {
         this.imageConsumer.setPixels(0, 0, this.anInt187 * 582735203, this.anInt181 * 915298425, this.colorModel, this.anIntArray180, 0, this.anInt187 * 582735203);
         this.imageConsumer.imageComplete(2);
      }
   }

   public void startProduction(ImageConsumer var1) {
      this.addConsumer(var1);
   }

   final void method259(int var1, int var2, Component var3, int var4) {
      this.anInt187 = var1 * 1736201291;
      this.anInt181 = var2 * -1826582071;
      this.anIntArray180 = new int[1 + var2 * var1];
      this.colorModel = new DirectColorModel(32, 16711680, '\uff00', 255);
      this.image = var3.createImage(this);
      this.method1574(32747610);
      var3.prepareImage(this.image, this);
      this.method1574(1781833208);
      var3.prepareImage(this.image, this);
      this.method1574(-1985100434);
      var3.prepareImage(this.image, this);
      this.method260(-1810235468);
   }

   public synchronized boolean isConsumer(ImageConsumer var1) {
      return this.imageConsumer == var1;
   }

   static final void method1593(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4, byte var5) {
      RSByteBuffer var6 = new RSByteBuffer(var0);
      int var10 = -1;

      while(true) {
         int var9 = var6.readSmart((short) -14454);
         if(var9 == 0) {
            return;
         }

         var10 += var9;
         int var13 = 0;

         while(true) {
            int var12 = var6.readSmart((short) -8214);
            if(var12 == 0) {
               break;
            }

            var13 += var12 - 1;
            int var14 = var13 & 63;
            int var15 = var13 >> 6 & 63;
            int var16 = var13 >> 12;
            int var17 = var6.readUByte();
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            int var7 = var15 + var1;
            int var8 = var2 + var14;
            if(var7 > 0 && var8 > 0 && var7 < 103 && var8 < 103) {
               int var11 = var16;
               if(2 == (RegionReference.mapTileSettings[1][var7][var8] & 2)) {
                  var11 = var16 - 1;
               }

               CollisionMap var20 = null;
               if(var11 >= 0) {
                  var20 = var4[var11];
               }

               Class53_Sub1.method1891(var16, var7, var8, var10, var19, var18, var3, var20, (short)-4427);
            }
         }
      }
   }

   static final void renderMapDotSprite(int xPos, int yPos, int var2, int var3, RGBSprite mapDotSprite) {
      if(null != mapDotSprite) {
         int delta = Client.anInt2775 * 1889215063 + Client.anInt2771 * -44898889 & 2047;
         int radius = var3 * var3 + var2 * var2;
         if(radius <= 6400) {
            int var11 = Rasterizer3D.SINE[delta];
            int var10 = Rasterizer3D.COSINE[delta];
            var11 = var11 * 256 / (Client.anInt2957 * 331969371 + 256);
            var10 = var10 * 256 / (Client.anInt2957 * 331969371 + 256);
            int xOffset = var2 * var10 + var3 * var11 >> 16;
            int yOffset = var3 * var10 - var2 * var11 >> 16;
            if(radius > 2500) {
               mapDotSprite.method2778(Class63.mapBackSprite, xPos + 94 + xOffset - mapDotSprite.maxWidth / 2 + 4, yPos + 83 - yOffset - mapDotSprite.maxHeight / 2 - 4);
            } else {
               mapDotSprite.method2746(4 + (94 + xPos + xOffset - mapDotSprite.maxWidth / 2), 83 + yPos - yOffset - mapDotSprite.maxHeight / 2 - 4);
            }
         }
      }
   }

   public static int method1595(CharSequence var0, int var1) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + var0.charAt(var4);
      }

      return var3;
   }
}
