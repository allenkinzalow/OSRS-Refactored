import java.awt.datatransfer.Clipboard;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Friend {

   static int anInt620;
   String aString621;
   boolean aBool622;
   int anInt623;
   boolean aBool624;
   static Clipboard aClipboard625;
   static CacheIndex musicIndex_1;
   static int anInt627;
   int friendHash;
   String username;
   static final int anInt630 = 56;
   public static final int anInt631 = 13;
   static final int anInt632 = 90;
   public static final int anInt633 = 144;
   static final int anInt634 = 33;


   static final void method658(Entity var0, int var1, int var2) {
      ChatMessage.method2017(var0.anInt2394 * 171470795, var0.anInt2339 * 826764905, var1, (short)2048);
   }

   static final void method659(Player player, int var1, int var2, int var3, short var4) {
      if(player != Class108_Sub10.myPlayer) {
         if(Client.menuActionRow * 391839991 < 400) {
            String var6;
            if(player.skillLevel * -1817505683 == 0) {
               var6 = player.playerName + Class108_Sub13.method1702(player.combatLevel * -1769445007, Class108_Sub10.myPlayer.combatLevel * -1769445007, -409278148) + " " + Class47.OPEN_PAREN + StringConstants.COMBAT_LEVEL + player.combatLevel * -1769445007 + Class47.CLOSE_PAREN;
            } else {
               var6 = player.playerName + " " + Class47.OPEN_PAREN + StringConstants.SKILL_LEVEL + player.skillLevel * -1817505683 + Class47.CLOSE_PAREN;
            }

            int var7;
            if(Client.anInt2858 * -968945719 == 1) {
               Class4.method91(StringConstants.USE_OPTION, Client.aString2859 + " " + Class47.aString668 + " " + HuffmanEncoding.method690(16777215, -1661035400) + var6, 14, var1, var2, var3, 2121988882);
            } else if(Client.aBool2881) {
               if((Class68.anInt902 * 401025055 & 8) == 8) {
                  Class4.method91(Client.aString2941, Client.aString2819 + " " + Class47.aString668 + " " + HuffmanEncoding.method690(16777215, -1562299690) + var6, 15, var1, var2, var3, 1855827336);
               }
            } else {
               for(var7 = 7; var7 >= 0; --var7) {
                  if(null != Client.aStringArray2834[var7]) {
                     short var5 = 0;
                     if(Client.aStringArray2834[var7].equalsIgnoreCase(StringConstants.ATTACK_OPTION)) {
                        if(Client.aClass50_2733 == Class50.aClass50_701 || Class50.aClass50_698 == Client.aClass50_2733 && player.combatLevel * -1769445007 > Class108_Sub10.myPlayer.combatLevel * -1769445007) {
                           var5 = 2000;
                        }

                        if(0 != Class108_Sub10.myPlayer.playerTeamID * -1623092945 && 0 != player.playerTeamID * -1623092945) {
                           if(player.playerTeamID * -1623092945 == Class108_Sub10.myPlayer.playerTeamID * -1623092945) {
                              var5 = 2000;
                           } else {
                              var5 = 0;
                           }
                        }
                     } else if(Client.aBoolArray2835[var7]) {
                        var5 = 2000;
                     }

                     boolean var8 = false;
                     int var9 = var5 + Client.anIntArray2833[var7];
                     Class4.method91(Client.aStringArray2834[var7], HuffmanEncoding.method690(16777215, -1013443787) + var6, var9, var1, var2, var3, 1965101199);
                  }
               }
            }

            for(var7 = 0; var7 < Client.menuActionRow * 391839991; ++var7) {
               if(23 == Client.menuActionIdentifiers[var7]) {
                  Client.menuActionNames[var7] = HuffmanEncoding.method690(16777215, -1551597452) + var6;
                  return;
               }
            }

         }
      }
   }

   static final void method660(int var0) {
      if(Class50.aClass7_697 != null) {
         Class50.aClass7_697.method118(-1758693404);
      }

      if(Class2.aClass7_17 != null) {
         Class2.aClass7_17.method118(-1758693404);
      }
   }

   static void method661(int var0, int var1) {
      if(var0 == -3) {
         World.method646(StringConstants.CONNECTION_TIMED, StringConstants.aString1186, StringConstants.aString1137, 2040055828);
      } else if(var0 == -2) {
         World.method646(StringConstants.aString1032, StringConstants.ERROR_CONNECTING, StringConstants.aString1037, 2087566694);
      } else if(-1 == var0) {
         World.method646(StringConstants.aString1145, StringConstants.USE_DIFF_WORLD, StringConstants.aString996, 2016404146);
      } else if(var0 == 3) {
         World.method646(StringConstants.aString997, StringConstants.invalid_credentials, StringConstants.aString999, 2010710776);
      } else if(var0 == 4) {
         World.method646(StringConstants.ACCOUNT_DISABLED, StringConstants.checkMessages, StringConstants.aString1061, 1999852017);
      } else if(var0 == 5) {
         World.method646(StringConstants.ALREADY_LOGGED_IN, StringConstants.TRY_AGAIN_60, StringConstants.aString1005, 1904325528);
      } else if(6 == var0) {
         World.method646(StringConstants.RUNESCAPE_UPDATED, StringConstants.RELOAD_PAGE, StringConstants.aString1008, 2074988600);
      } else if(var0 == 7) {
         World.method646(StringConstants.aString1140, StringConstants.aString1010, StringConstants.aString1028, 2009116862);
      } else if(8 == var0) {
         World.method646(StringConstants.aString1012, StringConstants.aString1110, StringConstants.aString1014, 2121975743);
      } else if(var0 == 9) {
         World.method646(StringConstants.aString1123, StringConstants.aString1016, StringConstants.aString1017, 2098644501);
      } else if(10 == var0) {
         World.method646(StringConstants.aString1121, StringConstants.aString1019, StringConstants.aString1020, 2000279502);
      } else if(var0 == 11) {
         World.method646(StringConstants.aString1099, StringConstants.aString1073, StringConstants.aString1023, 2035660147);
      } else if(var0 == 12) {
         World.method646(StringConstants.aString1006, StringConstants.aString1178, StringConstants.aString1150, 1920138736);
      } else if(13 == var0) {
         World.method646(StringConstants.aString1027, StringConstants.aString1177, StringConstants.aString1029, 1857228447);
      } else if(var0 == 14) {
         World.method646(StringConstants.SERVER_IS_UPDATING, StringConstants.aString1031, StringConstants.aString957, 2116486952);
      } else if(var0 == 16) {
         World.method646(StringConstants.aString1033, StringConstants.aString1034, StringConstants.aString1035, 1940128662);
      } else if(17 == var0) {
         World.method646(StringConstants.aString1103, StringConstants.aString1011, StringConstants.aString1038, 1941692847);
      } else if(var0 == 18) {
         World.method646(StringConstants.aString1039, StringConstants.aString1040, StringConstants.aString1058, 1944674963);
      } else if(19 == var0) {
         World.method646(StringConstants.aString1042, StringConstants.aString1043, StringConstants.aString1120, 2133334204);
      } else if(20 == var0) {
         World.method646(StringConstants.aString1049, StringConstants.aString1052, StringConstants.aString1047, 2009880585);
      } else if(var0 == 22) {
         World.method646(StringConstants.aString1048, StringConstants.aString993, StringConstants.aString1050, 1961904868);
      } else if(23 == var0) {
         World.method646(StringConstants.aString1051, StringConstants.aString1100, StringConstants.aString1053, 2131800705);
      } else if(24 == var0) {
         World.method646(StringConstants.aString1054, StringConstants.aString1115, StringConstants.aString1056, 2133872138);
      } else if(var0 == 25) {
         World.method646(StringConstants.aString1057, StringConstants.aString1013, StringConstants.aString1059, 1919699222);
      } else if(26 == var0) {
         World.method646(StringConstants.BLOCKED_ADDRESS, StringConstants.aString1015, StringConstants.aString1077, 2014140630);
      } else if(var0 == 27) {
         World.method646(StringConstants.aString1112, StringConstants.aString1064, StringConstants.aString1065, 2098083073);
      } else if(31 == var0) {
         World.method646(StringConstants.aString1072, StringConstants.aString1046, StringConstants.aString1074, 2043189195);
      } else if(var0 == 32) {
         World.method646(StringConstants.aString1146, StringConstants.aString1076, StringConstants.aString1151, 2024856893);
      } else if(37 == var0) {
         World.method646(StringConstants.aString1078, StringConstants.aString1079, StringConstants.aString1080, 1888437246);
      } else if(38 == var0) {
         World.method646(StringConstants.aString1081, StringConstants.aString1082, StringConstants.aString1083, 2063699946);
      } else if(var0 == 55) {
         World.method646(StringConstants.aString1116, StringConstants.aString1085, StringConstants.aString1086, 2045399584);
      } else {
         if(56 == var0) {
            World.method646(StringConstants.aString1087, StringConstants.AUTHENTICATOR_APP, StringConstants.aString1089, 1934315757);
            IsaacRandomGen.method725(11, 1815863780);
            return;
         }

         if(var0 == 57) {
            World.method646(StringConstants.aString1090, StringConstants.aString1091, StringConstants.aString1092, 2055770067);
            IsaacRandomGen.method725(11, 1816939995);
            return;
         }

         World.method646(StringConstants.aString1093, StringConstants.aString1030, StringConstants.aString1117, 1963559549);
      }

      IsaacRandomGen.method725(10, 1388576886);
   }

   public static void method662(byte var0) {
      try {
         CacheConstants.cacheDataFile.method1547((byte)-124);

         for(int var1 = 0; var1 < Class112.anInt1454 * -607702267; ++var1) {
            CacheConstants.indexFileArray[var1].method1547((byte)-51);
         }

         CacheConstants.cache255File.method1547((byte)-22);
         CacheConstants.aClass123_1259.method1547((byte)-67);
      } catch (Exception var2) {
         ;
      }
   }

   public static int method663(byte[] var0, int var1, CharSequence var2, int var3) {
      int var4 = var2.length();
      int var7 = var1;

      for(int var5 = 0; var5 < var4; ++var5) {
         char var6 = var2.charAt(var5);
         if(var6 <= 127) {
            var0[var7++] = (byte)var6;
         } else if(var6 <= 2047) {
            var0[var7++] = (byte)(192 | var6 >> 6);
            var0[var7++] = (byte)(128 | var6 & 63);
         } else {
            var0[var7++] = (byte)(224 | var6 >> 12);
            var0[var7++] = (byte)(128 | var6 >> 6 & 63);
            var0[var7++] = (byte)(128 | var6 & 63);
         }
      }

      return var7 - var1;
   }

   static String method664(Throwable var0, int var1) throws IOException {
      String var3;
      if(var0 instanceof RuntimeException_Sub1) {
         RuntimeException_Sub1 var2 = (RuntimeException_Sub1)var0;
         var3 = var2.aString2632 + " | ";
         var0 = var2.aThrowable2630;
      } else {
         var3 = "";
      }

      StringWriter var13 = new StringWriter();
      PrintWriter var5 = new PrintWriter(var13);
      var0.printStackTrace(var5);
      var5.close();
      String var7 = var13.toString();
      BufferedReader var8 = new BufferedReader(new StringReader(var7));
      String var9 = var8.readLine();

      while(true) {
         String var4 = var8.readLine();
         if(var4 == null) {
            var3 = var3 + "| " + var9;
            return var3;
         }

         int var6 = var4.indexOf(40);
         int var10 = var4.indexOf(41, var6 + 1);
         if(var6 >= 0 && var10 >= 0) {
            String var11 = var4.substring(var6 + 1, var10);
            int var12 = var11.indexOf(".java:");
            if(var12 >= 0) {
               var11 = var11.substring(0, var12) + var11.substring(5 + var12);
               var3 = var3 + var11 + ' ';
               continue;
            }

            var4 = var4.substring(0, var6);
         }

         var4 = var4.trim();
         var4 = var4.substring(var4.lastIndexOf(32) + 1);
         var4 = var4.substring(var4.lastIndexOf(9) + 1);
         var3 = var3 + var4 + ' ';
      }
   }
}
