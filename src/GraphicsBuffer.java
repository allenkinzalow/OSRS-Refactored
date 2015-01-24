import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

public abstract class GraphicsBuffer {

   static int[] mapCoordinates;
   public int[] anIntArray180;
   int anInt181;
   Image image;
   static int anInt183;
   static int anInt185;
   static int anInt186;
   int anInt187;


   abstract void method259(int var1, int var2, Component var3, int var4);

   public final void method260(int var1) {
      Rasterizer2D.copySprite(this.anIntArray180, this.anInt187 * 582735203, this.anInt181 * 915298425);
   }

   public abstract void method261(Graphics var1, int var2, int var3, int var4);

   public abstract void method270(Graphics var1, int var2, int var3, int var4, int var5, int var6);

   static final void method277(int var0) {
      Scene.aBool411 = false;
      Client.lowMemory = false;
   }

   public static final boolean method278(int var0) {
      KeyFocusListener var1 = KeyFocusListener.keyFocusListener;
      synchronized(var1) {
         if(KeyFocusListener.anInt892 * -1955530573 == KeyFocusListener.anInt894 * -1530747793) {
            return false;
         } else {
            Class9.anInt124 = KeyFocusListener.anIntArray889[KeyFocusListener.anInt892 * -1955530573] * 956233683;
            LoginHandler.aChar841 = KeyFocusListener.aCharArray888[KeyFocusListener.anInt892 * -1955530573];
            KeyFocusListener.anInt892 = (KeyFocusListener.anInt892 * -1955530573 + 1 & 127) * -2003667333;
            return true;
         }
      }
   }

   static void method279(int var0, int var1, int var2, int var3, String var4, byte var5) {
      RSInterface var6 = LoginHandler.method878(var1, var2, 1492993418);
      if(var6 != null) {
         if(null != var6.anObjectArray1795) {
            ClientScript var7 = new ClientScript();
            var7.parentInterface = var6;
            var7.anInt1640 = var0 * -1232467355;
            var7.aString1642 = var4;
            var7.parameters = var6.anObjectArray1795;
            GameObject.executeScript(var7, -1381816630);
         }

         boolean var8 = true;
         if(var6.anInt1886 * -917776085 > 0) {
            var8 = Js5Request.method2601(var6, 1732111304);
         }

         if(var8) {
            if(Class9.method231(Class32.method576(var6, 1075359101), var0 - 1, 273333538)) {
               if(1 == var0) {
                  Client.secureBuffer.writePacket(99);
                  Client.secureBuffer.writeInt(var1);
                  Client.secureBuffer.writeShort(var2);
                  Client.secureBuffer.writeShort(var3);
               }

               if(var0 == 2) {
                  Client.secureBuffer.writePacket(215);
                  Client.secureBuffer.writeInt(var1);
                  Client.secureBuffer.writeShort(var2);
                  Client.secureBuffer.writeShort(var3);
               }

               if(var0 == 3) {
                  Client.secureBuffer.writePacket(69);
                  Client.secureBuffer.writeInt(var1);
                  Client.secureBuffer.writeShort(var2);
                  Client.secureBuffer.writeShort(var3);
               }

               if(var0 == 4) {
                  Client.secureBuffer.writePacket(130);
                  Client.secureBuffer.writeInt(var1);
                  Client.secureBuffer.writeShort(var2);
                  Client.secureBuffer.writeShort(var3);
               }

               if(var0 == 5) {
                  Client.secureBuffer.writePacket(145);
                  Client.secureBuffer.writeInt(var1);
                  Client.secureBuffer.writeShort(var2);
                  Client.secureBuffer.writeShort(var3);
               }

               if(var0 == 6) {
                  Client.secureBuffer.writePacket(23);
                  Client.secureBuffer.writeInt(var1);
                  Client.secureBuffer.writeShort(var2);
                  Client.secureBuffer.writeShort(var3);
               }

               if(7 == var0) {
                  Client.secureBuffer.writePacket(172);
                  Client.secureBuffer.writeInt(var1);
                  Client.secureBuffer.writeShort(var2);
                  Client.secureBuffer.writeShort(var3);
               }

               if(8 == var0) {
                  Client.secureBuffer.writePacket(38);
                  Client.secureBuffer.writeInt(var1);
                  Client.secureBuffer.writeShort(var2);
                  Client.secureBuffer.writeShort(var3);
               }

               if(9 == var0) {
                  Client.secureBuffer.writePacket(57);
                  Client.secureBuffer.writeInt(var1);
                  Client.secureBuffer.writeShort(var2);
                  Client.secureBuffer.writeShort(var3);
               }

               if(10 == var0) {
                  Client.secureBuffer.writePacket(93);
                  Client.secureBuffer.writeInt(var1);
                  Client.secureBuffer.writeShort(var2);
                  Client.secureBuffer.writeShort(var3);
               }
            }
         }
      }
   }
}
