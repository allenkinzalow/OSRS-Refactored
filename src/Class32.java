import java.math.BigInteger;

public class Class32 {

   public static Class108_Sub4_Sub3 aClass108_Sub4_Sub3_464;
   static final int anInt465 = 1006;
   static int[] anIntArray466;
   static final int anInt467 = 31;
   static BigInteger aBigInteger468 = new BigInteger("aead8fe7a0e8b2255e84597f391815600a4e02746698fea7bfe1b20b5a1f7ba47a2d9af413facda26925eafa2f7be93e3354d67a1210bf67beec2251eafacfe7a819be666c900843421e009ec16529131893fba57528dab31ff64013cdabc00c35e832ada7da6aca3d8cd18100fe79f2133c07be414142d8ba636d49f30b25cb", 16);
   static BigInteger aBigInteger469 = new BigInteger("10001", 16);
   static final int anInt470 = 86;
   public static final int anInt471 = 136;


   static void method575(int var0, int var1, int var2, ObjectDefinition var3, int var4, int var5) {
      Class108_Sub6 var6 = new Class108_Sub6();
      var6.anInt1586 = var0 * 1684420457;
      var6.anInt1597 = var1 * -165275264;
      var6.anInt1588 = var2 * -1759027840;
      int var7 = var3.sizeX * 721302265;
      int var8 = var3.sizeY * -1917144319;
      if(var4 == 1 || var4 == 3) {
         var7 = var3.sizeY * -1917144319;
         var8 = var3.sizeX * 721302265;
      }

      var6.anInt1592 = (var1 + var7) * 1313562240;
      var6.anInt1590 = (var8 + var2) * 1941574784;
      var6.anInt1601 = var3.anInt2110 * -551779905;
      var6.anInt1591 = var3.anInt2083 * -973903232;
      var6.anInt1594 = var3.anInt2112 * 1346898945;
      var6.anInt1595 = var3.anInt2113 * -450728755;
      var6.anIntArray1596 = var3.anIntArray2084;
      if(var3.configChangeDest != null) {
         var6.aClass108_Sub20_Sub8_1599 = var3;
         var6.method1666(1640464938);
      }

      Class108_Sub6.aClass105_1587.insertBack(var6);
      if(var6.anIntArray1596 != null) {
         var6.anInt1589 = (var6.anInt1594 * 983197705 + (int)(Math.random() * (double)(var6.anInt1595 * -2112126659 - var6.anInt1594 * 983197705))) * 690388241;
      }
   }

   static int method576(RSInterface var0, int var1) {
      Class108_Sub19 var2 = (Class108_Sub19) Client.aClass101_2906.get(((long) (var0.interfaceHash * -1081473899) << 32) + (long) (var0.anInt1772 * -490007465));
      return var2 != null?var2.anInt1892:var0.anInt1830 * 956161607;
   }

   static final boolean method577(int var0, int var1) {
      if(var0 < 0) {
         return false;
      } else {
         int var2 = Client.menuActionIdentifiers[var0];
         if(var2 >= 2000) {
            var2 -= 2000;
         }

         return var2 == 1007;
      }
   }

   static final void method578(Entity var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(null != var0) {
         if(var0.method2731(-1454140729)) {
            NPCDefinition var7;
            if(var0 instanceof NPC) {
               var7 = ((NPC)var0).definition;
               if(var7.anIntArray2185 != null) {
                  var7 = var7.method2290(1115175037);
               }

               if(var7 == null) {
                  return;
               }
            }

            int var9;
            if(var1 < Client.numLocalPlayers * -43742683) {
               var9 = 30;
               Player var8 = (Player)var0;
               if(var8.aBool2682) {
                  return;
               }

               if(var8.pkicon * -1088697045 != -1 || -1 != var8.prayicon * -497976645) {
                  Friend.method658(var0, var0.anInt2386 * 2106405885 + 15, 798331555);
                  if(Client.anInt2808 * 1642143199 > -1) {
                     if(-1 != var8.pkicon * -1088697045) {
                        Wall.headIconSprites[var8.pkicon * -1088697045].method2746(var2 + Client.anInt2808 * 1642143199 - 12, Client.anInt2809 * -2062084395 + var3 - var9);
                        var9 += 25;
                     }

                     if(var8.prayicon * -497976645 != -1) {
                        Class5.headPrayerSprites[var8.prayicon * -497976645].method2746(var2 + Client.anInt2808 * 1642143199 - 12, var3 + Client.anInt2809 * -2062084395 - var9);
                        var9 += 25;
                     }
                  }
               }

               if(var1 >= 0 && Client.anInt2723 * -927004421 == 10 && Client.anInt2795 * 1790148709 == Client.playerIndices[var1]) {
                  Friend.method658(var0, 15 + var0.anInt2386 * 2106405885, 798331555);
                  if(Client.anInt2808 * 1642143199 > -1) {
                     Class9.hintIconSprites[1].method2746(var2 + Client.anInt2808 * 1642143199 - 12, Client.anInt2809 * -2062084395 + var3 - var9);
                  }
               }
            } else {
               var7 = ((NPC)var0).definition;
               if(var7.anIntArray2185 != null) {
                  var7 = var7.method2290(1942286194);
               }

               if(var7.headIcon * 1203154221 >= 0 && var7.headIcon * 1203154221 < Class5.headPrayerSprites.length) {
                  Friend.method658(var0, 15 + var0.anInt2386 * 2106405885, 798331555);
                  if(Client.anInt2808 * 1642143199 > -1) {
                     Class5.headPrayerSprites[var7.headIcon * 1203154221].method2746(var2 + Client.anInt2808 * 1642143199 - 12, var3 + Client.anInt2809 * -2062084395 - 30);
                  }
               }

               if(1 == Client.anInt2723 * -927004421 && Client.npcIndices[var1 - Client.numLocalPlayers * -43742683] == Client.anInt2724 * -923839899 && Client.cycle * -637317861 % 20 < 10) {
                  Friend.method658(var0, 15 + var0.anInt2386 * 2106405885, 798331555);
                  if(Client.anInt2808 * 1642143199 > -1) {
                     Class9.hintIconSprites[0].method2746(Client.anInt2808 * 1642143199 + var2 - 12, Client.anInt2809 * -2062084395 + var3 - 28);
                  }
               }
            }

            if(var0.textSpoken != null && (var1 >= Client.numLocalPlayers * -43742683 || Client.anInt2779 * 220652897 == 4 || !var0.aBool2352 && (Client.anInt2779 * 220652897 == 0 || 3 == Client.anInt2779 * 220652897 || 1 == Client.anInt2779 * 220652897 && GroundItem.method581(((Player)var0).playerName, false, (byte)-77)))) {
               Friend.method658(var0, var0.anInt2386 * 2106405885, 798331555);
               if(Client.anInt2808 * 1642143199 > -1 && Client.anInt2804 * 1837064243 < Client.anInt2797 * -797118177) {
                  Client.anIntArray2817[Client.anInt2804 * 1837064243] = Class94.b12_full_font.getTextWidth(var0.textSpoken) / 2;
                  Client.anIntArray2800[Client.anInt2804 * 1837064243] = Class94.b12_full_font.anInt2643;
                  Client.anIntArray2798[Client.anInt2804 * 1837064243] = Client.anInt2808 * 1642143199;
                  Client.anIntArray2799[Client.anInt2804 * 1837064243] = Client.anInt2809 * -2062084395;
                  Client.anIntArray2776[Client.anInt2804 * 1837064243] = var0.anInt2377 * 638780813;
                  Client.anIntArray2763[Client.anInt2804 * 1837064243] = var0.anInt2355 * 580693971;
                  Client.anIntArray2947[Client.anInt2804 * 1837064243] = var0.anInt2353 * 419314599;
                  Client.aStringArray2805[Client.anInt2804 * 1837064243] = var0.textSpoken;
                  Client.anInt2804 += 1959435003;
               }
            }

            if(var0.anInt2342 * 166319025 > Client.cycle * -637317861) {
               Friend.method658(var0, 15 + var0.anInt2386 * 2106405885, 798331555);
               if(Client.anInt2808 * 1642143199 > -1) {
                  if(var1 < Client.numLocalPlayers * -43742683) {
                     var9 = 30;
                  } else {
                     NPCDefinition var10 = ((NPC)var0).definition;
                     var9 = var10.anInt2184 * -530501559;
                  }

                  int var11 = var9 * var0.anInt2360 * -1545297959 / (var0.anInt2361 * 769152649);
                  if(var11 > var9) {
                     var11 = var9;
                  } else if(0 == var11 && var0.anInt2360 * -1545297959 > 0) {
                     var11 = 1;
                  }

                  Rasterizer2D.drawFilledRectangle(var2 + Client.anInt2808 * 1642143199 - var9 / 2, Client.anInt2809 * -2062084395 + var3 - 3, var11, 5, '\uff00');
                  Rasterizer2D.drawFilledRectangle(var11 + (Client.anInt2808 * 1642143199 + var2 - var9 / 2), Client.anInt2809 * -2062084395 + var3 - 3, var9 - var11, 5, 16711680);
               }
            }

            for(var9 = 0; var9 < 4; ++var9) {
               if(var0.anIntArray2369[var9] > Client.cycle * -637317861) {
                  Friend.method658(var0, var0.anInt2386 * 2106405885 / 2, 798331555);
                  if(Client.anInt2808 * 1642143199 > -1) {
                     if(1 == var9) {
                        Client.anInt2809 -= 948236740;
                     }

                     if(var9 == 2) {
                        Client.anInt2808 += 1379728431;
                        Client.anInt2809 += 1673365278;
                     }

                     if(3 == var9) {
                        Client.anInt2808 -= 1379728431;
                        Client.anInt2809 += 1673365278;
                     }

                     Client.hitmarkSprites[var0.anIntArray2356[var9]].method2746(Client.anInt2808 * 1642143199 + var2 - 12, var3 + Client.anInt2809 * -2062084395 - 12);
                     Class2.p11_full_font.drawStringCenter(Integer.toString(var0.anIntArray2358[var9]), Client.anInt2808 * 1642143199 + var2 - 1, 3 + var3 + Client.anInt2809 * -2062084395, 16777215, 0);
                  }
               }
            }

         }
      }
   }

   Class32() throws Throwable {
      throw new Error();
   }

   static int method579(CharSequence var0, int var1, boolean var2, int var3) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var6 = false;
         int var9 = 0;
         int var7 = var0.length();

         for(int var5 = 0; var5 < var7; ++var5) {
            char var8 = var0.charAt(var5);
            if(0 == var5) {
               if(var8 == 45) {
                  var4 = true;
                  continue;
               }

               if(43 == var8 && var2) {
                  continue;
               }
            }

            int var11;
            if(var8 >= 48 && var8 <= 57) {
               var11 = var8 - 48;
            } else if(var8 >= 65 && var8 <= 90) {
               var11 = var8 - 55;
            } else {
               if(var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var11 = var8 - 87;
            }

            if(var11 >= var1) {
               throw new NumberFormatException();
            }

            if(var4) {
               var11 = -var11;
            }

            int var10 = var11 + var9 * var1;
            if(var10 / var1 != var9) {
               throw new NumberFormatException();
            }

            var9 = var10;
            var6 = true;
         }

         if(!var6) {
            throw new NumberFormatException();
         } else {
            return var9;
         }
      } else {
         throw new IllegalArgumentException("");
      }
   }
}
