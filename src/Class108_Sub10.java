
public class Class108_Sub10 extends Node {

   int anInt1652;
   int anInt1653;
   static int[] anIntArray1655;
   static RSInterface aClass108_Sub17_1656;
   boolean aBool1657 = false;


   public static void method1681(int var0) {
      ObjectDefinition.objectDefMap.clearCacheMap();
      ObjectDefinition.objectModelCache.clearCacheMap();
      ObjectDefinition.aClass106_2079.clearCacheMap();
      ObjectDefinition.objectRasterizerMap.clearCacheMap();
   }

   static final void method1682(Class108_Sub10 var0, boolean var1, short var2) {
      int var3 = var0.anInt1653 * 1557246219;
      int var4 = (int)var0.key;
      var0.unlink();
      if(var1) {
         RSInterface.removeLoadedInterface(var3);
      }

      HuffmanEncoding.method691(var3, 1744562904);
      RSInterface var5 = RSInterface.getInterfaceComponentForHash(var4, 1444513607);
      if(var5 != null) {
         MouseInputHandler.method775(var5, -16054773);
      }

      Applet_Sub1.method3282((byte)56);
      if(-1 != Client.openInterfaceID * 1523906617) {
         LoginHandler.method882(Client.openInterfaceID * 1523906617, 1, (byte)35);
      }
   }

   public static String method1683(CharSequence var0, Class116 var1, int var2) {
      if(null == var0) {
         return null;
      } else {
         int var5 = 0;

         int var6;
         for(var6 = var0.length(); var5 < var6 && method1394(var0.charAt(var5), 848678187); ++var5) {
            ;
         }

         while(var6 > var5 && method1394(var0.charAt(var6 - 1), -1938358645)) {
            --var6;
         }

         int var7 = var6 - var5;
         if(var7 >= 1) {
            byte var8;
            if(null == var1) {
               var8 = 12;
            } else {
               switch(var1.anInt1480 * 605961063) {
               case 1:
                  var8 = 20;
                  break;
               default:
                  var8 = 12;
               }
            }

            if(var7 <= var8) {
               StringBuilder var9 = new StringBuilder(var7);

               for(int var15 = var5; var15 < var6; ++var15) {
                  char var10 = var0.charAt(var15);
                  boolean var11;
                  if(Character.isISOControl(var10)) {
                     var11 = false;
                  } else {
                     boolean var3 = var10 >= 48 && var10 <= 57 || var10 >= 65 && var10 <= 90 || var10 >= 97 && var10 <= 122;
                     if(var3) {
                        var11 = true;
                     } else {
                        char[] var4 = StringUtilities.aCharArray1486;
                        int var12 = 0;

                        label108:
                        while(true) {
                           char var13;
                           if(var12 >= var4.length) {
                              var4 = StringUtilities.aCharArray1485;

                              for(var12 = 0; var12 < var4.length; ++var12) {
                                 var13 = var4[var12];
                                 if(var13 == var10) {
                                    var11 = true;
                                    break label108;
                                 }
                              }

                              var11 = false;
                              break;
                           }

                           var13 = var4[var12];
                           if(var10 == var13) {
                              var11 = true;
                              break;
                           }

                           ++var12;
                        }
                     }
                  }

                  if(var11) {
                     char var14;
                     switch(var10) {
                     case 32:
                     case 45:
                     case 95:
                     case 160:
                        var14 = 95;
                        break;
                     case 35:
                     case 91:
                     case 93:
                        var14 = var10;
                        break;
                     case 192:
                     case 193:
                     case 194:
                     case 195:
                     case 196:
                     case 224:
                     case 225:
                     case 226:
                     case 227:
                     case 228:
                        var14 = 97;
                        break;
                     case 199:
                     case 231:
                        var14 = 99;
                        break;
                     case 200:
                     case 201:
                     case 202:
                     case 203:
                     case 232:
                     case 233:
                     case 234:
                     case 235:
                        var14 = 101;
                        break;
                     case 205:
                     case 206:
                     case 207:
                     case 237:
                     case 238:
                     case 239:
                        var14 = 105;
                        break;
                     case 209:
                     case 241:
                        var14 = 110;
                        break;
                     case 210:
                     case 211:
                     case 212:
                     case 213:
                     case 214:
                     case 242:
                     case 243:
                     case 244:
                     case 245:
                     case 246:
                        var14 = 111;
                        break;
                     case 217:
                     case 218:
                     case 219:
                     case 220:
                     case 249:
                     case 250:
                     case 251:
                     case 252:
                        var14 = 117;
                        break;
                     case 223:
                        var14 = 98;
                        break;
                     case 255:
                     case 376:
                        var14 = 121;
                        break;
                     default:
                        var14 = Character.toLowerCase(var10);
                     }

                     if(0 != var14) {
                        var9.append(var14);
                     }
                  }
               }

               if(var9.length() == 0) {
                  return null;
               }

               return var9.toString();
            }
         }

         return null;
      }
   }

   static final boolean method1394(char var0, int var1) {
      return 160 == var0 || 32 == var0 || var0 == 95 || 45 == var0;
   }
}
