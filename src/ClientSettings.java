import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ClientSettings {

   static int settingsAmount = 328827591;
   boolean hideRoofs;
   boolean muteMusic;
   LinkedHashMap loginTrustList = new LinkedHashMap();



   ClientSettings(RSByteBuffer buffer) {
      if(null != buffer && buffer.buf != null) {
         int settingsSize = buffer.readUByte();
         if(settingsSize >= 0 && settingsSize <= settingsAmount * -1352803099) {
            if(buffer.readUByte() == 1) {
               this.hideRoofs = true;
            }

            if(settingsSize > 1) {
               this.muteMusic = buffer.readUByte() == 1;
            }

            if(settingsSize > 2) {
               int mapSize = buffer.readUByte();

               for(int mapIndex = 0; mapIndex < mapSize; ++mapIndex) {
                  int encodedUsername = buffer.readInt();
                  int authenticationHash = buffer.readInt();
                  this.loginTrustList.put(Integer.valueOf(encodedUsername), Integer.valueOf(authenticationHash));
               }

            }
         } else {
            this.method628(true, 837541280);
         }
      } else {
         this.method628(true, 352446489);
      }
   }

   void method628(boolean var1, int var2) {}

   ClientSettings() {
      this.method628(true, 1084484809);
   }

   RSByteBuffer getSettingsBuffer(int var1) {
      RSByteBuffer buffer = new RSByteBuffer(100);
      buffer.writeByte(settingsAmount * -1352803099);
      buffer.writeByte(this.hideRoofs ? 1 : 0);
      buffer.writeByte(this.muteMusic ? 1 : 0);
      buffer.writeByte(this.loginTrustList.size());
      Iterator settingsIterator = this.loginTrustList.entrySet().iterator();

      while(settingsIterator.hasNext()) {
         Entry user = (Entry)settingsIterator.next();
         buffer.writeInt(((Integer) user.getKey()).intValue());
         buffer.writeInt(((Integer) user.getValue()).intValue());
      }

      return buffer;
   }

   static int method636(int var0) {
      return 8;
   }

}
