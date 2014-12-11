
public class FloorDefinition extends CacheableNode {

   public int anInt2211 = -1326535891;
   public static CacheableNodeMap floorMap = new CacheableNodeMap(64);
   public int rgbColor = 0;
   public int textureID = 1132421109;
   public boolean hideUnderlay = true;
   public int hue;
   public int saturation;
   public int luminosity;
   public int anInt2220;
   static int[] anIntArray2221;
   public int anInt2222;
   static int anInt2223;
   public int anInt2224;
   public static AbstractIndex configArchive_ref_floor;
   static CacheIndex interfaceIndex;


   static void pushDirectMessage(int messageType, String messagePrefix, String messageString, String messageSuffix, int var4) {
      ChatMessagesContainer messageContainer = (ChatMessagesContainer)Class26.chatMessageMap.get(Integer.valueOf(messageType));
      if(messageContainer == null) {
         messageContainer = new ChatMessagesContainer();
         Class26.chatMessageMap.put(Integer.valueOf(messageType), messageContainer);
      }

      ChatMessage chatMessage = messageContainer.submitNewMessage(messageType, messagePrefix, messageString, messageSuffix, -1626872444);
      Class26.aClass95_348.method1203(chatMessage, (long)(chatMessage.anInt1944 * -1818271001));
      Class26.aClass97_349.method1273(chatMessage);
      Client.anInt2896 = Client.anInt2731 * 2056637341;
   }

   public void method2344(byte var1) {
      if(-1 != this.anInt2211 * 839525211) {
         this.method2350(this.anInt2211 * 839525211, -1938383251);
         this.anInt2220 = this.hue * 890988859;
         this.anInt2224 = this.saturation * -982524585;
         this.anInt2222 = this.luminosity * -1041102161;
      }

      this.method2350(this.rgbColor * 308395211, -1842183126);
   }

   public void decode(RSByteBuffer buffer, int var2, int var3) {
      while(true) {
         int opcode = buffer.readUByte();
         if(opcode == 0) {
            return;
         }

         this.decodeReadValues(buffer, opcode, var2, -873388298);
      }
   }

   void decodeReadValues(RSByteBuffer buffer, int opcode, int var3, int var4) {
      if(opcode == 1) {
         this.rgbColor = buffer.method1809(509311392) * -609892125;
      } else if(2 == opcode) {
         this.textureID = buffer.readUByte() * -1132421109;
      } else if(5 == opcode) {
         this.hideUnderlay = false;
      } else if(opcode == 7) {
         this.anInt2211 = buffer.method1809(1421061973) * 1326535891;
      } else if(opcode == 8) {
         ;
      }
   }

   void method2350(int color, int var2) {
      double r = (double)(color >> 16 & 255) / 256.0D;
      double g = (double)(color >> 8 & 255) / 256.0D;
      double b = (double)(color & 255) / 256.0D;
      double var11 = r;
      if(g < r) {
         var11 = g;
      }

      if(b < var11) {
         var11 = b;
      }

      double var7 = r;
      if(g > r) {
         var7 = g;
      }

      if(b > var7) {
         var7 = b;
      }

      double var13 = 0.0D;
      double var15 = 0.0D;
      double var17 = (var11 + var7) / 2.0D;
      if(var11 != var7) {
         if(var17 < 0.5D) {
            var15 = (var7 - var11) / (var7 + var11);
         }

         if(var17 >= 0.5D) {
            var15 = (var7 - var11) / (2.0D - var7 - var11);
         }

         if(var7 == r) {
            var13 = (g - b) / (var7 - var11);
         } else if(g == var7) {
            var13 = (b - r) / (var7 - var11) + 2.0D;
         } else if(b == var7) {
            var13 = (r - g) / (var7 - var11) + 4.0D;
         }
      }

      var13 /= 6.0D;
      this.hue = (int)(var13 * 256.0D) * -1764580359;
      this.saturation = (int)(var15 * 256.0D) * -1027121431;
      this.luminosity = (int)(var17 * 256.0D) * 868943657;
      if(this.saturation * -24553127 < 0) {
         this.saturation = 0;
      } else if(this.saturation * -24553127 > 255) {
         this.saturation = 77040151;
      }

      if(this.luminosity * -715881191 < 0) {
         this.luminosity = 0;
      } else if(this.luminosity * -715881191 > 255) {
         this.luminosity = -1757666857;
      }
   }
}
