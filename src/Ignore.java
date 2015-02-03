import java.awt.FontMetrics;

public class Ignore {

   static ClientSettings clientSettings;
   String displayName;
   static SessionRequest gameSession;
   static Class65 aClass65_389;
   String username;
   static int[] anIntArray397;
   static FontMetrics aFontMetrics398;


   public static void method399(AbstractIndex var0, byte var1) {
      VarpBit.aClass74_1951 = var0;
   }

   static boolean isOnIgnore(String rawUsername, int var1) {
      if(null == rawUsername) {
         return false;
      } else {
         String decodedUsername = Class108_Sub10.method1683(rawUsername, UnderlayDefinition.aClass116_2142, -1906056421);

         for(int var4 = 0; var4 < Client.ignoreListCount * -1283681697; ++var4) {
            Ignore ignore = Client.ignoreList[var4];
            if(decodedUsername.equalsIgnoreCase(Class108_Sub10.method1683(ignore.username, UnderlayDefinition.aClass116_2142, -1974944439))) {
               return true;
            }

            if(decodedUsername.equalsIgnoreCase(Class108_Sub10.method1683(ignore.displayName, UnderlayDefinition.aClass116_2142, -1976347131))) {
               return true;
            }
         }

         return false;
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
                     ChatMessagesContainer.pushMessage(31, "", toAdd + StringUtilities.ALREADY_ON_IGNORE, -448196024);
                     return;
                  }

                  if(ignore.displayName != null) {
                     var3 = Class108_Sub10.method1683(ignore.displayName, UnderlayDefinition.aClass116_2142, -1955095237);
                     if(null != var3 && var3.equals(var4)) {
                        ChatMessagesContainer.pushMessage(31, "", toAdd + StringUtilities.ALREADY_ON_IGNORE, 7202132);
                        return;
                     }
                  }
               }

               for(var5 = 0; var5 < Client.friendListCount * -163737695; ++var5) {
                  Friend friend = Client.friendList[var5];
                  var6 = Class108_Sub10.method1683(friend.username, UnderlayDefinition.aClass116_2142, -2065261776);
                  if(null != var6 && var6.equals(var4)) {
                     ChatMessagesContainer.pushMessage(31, "", StringUtilities.PLEASE_REMOVE_2 + toAdd + StringUtilities.aString1124, 123811380);
                     return;
                  }

                  if(null != friend.displayName) {
                     var3 = Class108_Sub10.method1683(friend.displayName, UnderlayDefinition.aClass116_2142, -1855974988);
                     if(null != var3 && var3.equals(var4)) {
                        ChatMessagesContainer.pushMessage(31, "", StringUtilities.PLEASE_REMOVE_2 + toAdd + StringUtilities.aString1124, -855994111);
                        return;
                     }
                  }
               }

               if(Class108_Sub10.method1683(Player.myPlayer.playerName, UnderlayDefinition.aClass116_2142, -1968874516).equals(var4)) {
                  ChatMessagesContainer.pushMessage(31, "", StringUtilities.aString1105, -1446835517);
               } else {
                  Client.secureBuffer.writePacket(222);
                  Client.secureBuffer.writeByte(StringUtilities.getStringLengthPlusOne(toAdd));
                  Client.secureBuffer.writeString(toAdd);
               }
            }
         } else {
            ChatMessagesContainer.pushMessage(31, "", StringUtilities.aString1063, 300930071);
         }
      }
   }
}
