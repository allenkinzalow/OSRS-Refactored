import java.io.File;
import java.io.IOException;

public abstract class Entity extends Renderable {

   static RGBSprite[] headPrayerSprites;
   static RGBSprite[] hintIconSprites;
   int anInt2338 = 0;
   int anInt2339;
   public static final int anInt2340 = 44;
   int anInt2341 = 0;
   int anInt2342 = 1376304024;
   int standAnimationID = -1915601577;
   int nextAnimationID = -1771909735;
   int anInt2345;
   int anInt2346;
   int turn180AnimationID = 1371640443;
   boolean aBool2348 = false;
   int anInt2349 = -1812647143;
   int runAnimationID = 479130233;
   int anInt2351;
   boolean aBool2352;
   int textSpokenTime = 1424062716;
   int anInt2354;
   int anInt2355 = 0;
   int[] anIntArray2356 = new int[4];
   int anInt2357 = -645107359;
   int[] anIntArray2358 = new int[4];
   String textSpoken = null;
   int anInt2360;
   int anInt2361;
   int anInt2362 = 990422189;
   int anInt2363 = 0;
   static final int anInt2364 = 1024;
   int anInt2365 = 278541697;
   int anInt2366 = 0;
   int anInt2367 = 0;
   int anInt2368 = 821761185;
   int[] anIntArray2369 = new int[4];
   int walkAnimationID = 274256809;
   int anInt2371 = 0;
   int anInt2372 = 0;
   int anInt2373 = -1279943663;
   int anInt2374 = 0;
   int anInt2375 = 0;
   int turn90RightAnimationID = 514284795;
   int anInt2377 = 0;
   int turn90LeftAnimationID = 1417997611;
   int anInt2379;
   int anInt2380;
   int anInt2381;
   int anInt2382;
   int anInt2383;
   int anInt2384;
   int lastUpdated = 0;
   int anInt2386 = -1871246744;
   int anInt2387 = 0;
   int anInt2388;
   int anInt2389 = 1954972384;
   int anInt2390 = 0;
   int[] anIntArray2391 = new int[10];
   int[] anIntArray2392 = new int[10];
   boolean[] aBoolArray2393 = new boolean[10];
   int anInt2394;
   int anInt2395 = 0;
   int anInt2396 = 0;
   int anInt2397 = 0;
   static int anInt2398;

   static final void processEntityTextSpoken(int var0) {
      int index;
      int entityIndex;
      for(index = -1; index < Client.numLocalPlayers * -43742683; ++index) {
         if(index == -1) {
            entityIndex = 2047;
         } else {
            entityIndex = Client.playerIndices[index];
         }

         Player player = Client.localPlayers[entityIndex];
         if(player != null && player.textSpokenTime * 419314599 > 0) {
            player.textSpokenTime -= 1259781143;
            if(0 == player.textSpokenTime * 419314599) {
               player.textSpoken = null;
            }
         }
      }

      for(index = 0; index < Client.anInt2749 * -1829405175; ++index) {
         entityIndex = Client.npcIndices[index];
         NPC npc = Client.localNPCs[entityIndex];
         if(npc != null && npc.textSpokenTime * 419314599 > 0) {
            npc.textSpokenTime -= 1259781143;
            if(0 == npc.textSpokenTime * 419314599) {
               npc.textSpoken = null;
            }
         }
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
                        headPrayerSprites[var8.prayicon * -497976645].method2746(var2 + Client.anInt2808 * 1642143199 - 12, var3 + Client.anInt2809 * -2062084395 - var9);
                        var9 += 25;
                     }
                  }
               }

               if(var1 >= 0 && Client.anInt2723 * -927004421 == 10 && Client.anInt2795 * 1790148709 == Client.playerIndices[var1]) {
                  Friend.method658(var0, 15 + var0.anInt2386 * 2106405885, 798331555);
                  if(Client.anInt2808 * 1642143199 > -1) {
                     hintIconSprites[1].method2746(var2 + Client.anInt2808 * 1642143199 - 12, Client.anInt2809 * -2062084395 + var3 - var9);
                  }
               }
            } else {
               var7 = ((NPC)var0).definition;
               if(var7.anIntArray2185 != null) {
                  var7 = var7.method2290(1942286194);
               }

               if(var7.headIcon * 1203154221 >= 0 && var7.headIcon * 1203154221 < headPrayerSprites.length) {
                  Friend.method658(var0, 15 + var0.anInt2386 * 2106405885, 798331555);
                  if(Client.anInt2808 * 1642143199 > -1) {
                     headPrayerSprites[var7.headIcon * 1203154221].method2746(var2 + Client.anInt2808 * 1642143199 - 12, var3 + Client.anInt2809 * -2062084395 - 30);
                  }
               }

               if(1 == Client.anInt2723 * -927004421 && Client.npcIndices[var1 - Client.numLocalPlayers * -43742683] == Client.anInt2724 * -923839899 && Client.cycle * -637317861 % 20 < 10) {
                  Friend.method658(var0, 15 + var0.anInt2386 * 2106405885, 798331555);
                  if(Client.anInt2808 * 1642143199 > -1) {
                     hintIconSprites[0].method2746(Client.anInt2808 * 1642143199 + var2 - 12, Client.anInt2809 * -2062084395 + var3 - 28);
                  }
               }
            }

            if(var0.textSpoken != null && (var1 >= Client.numLocalPlayers * -43742683 || Client.anInt2779 * 220652897 == 4 || !var0.aBool2352 && (Client.anInt2779 * 220652897 == 0 || 3 == Client.anInt2779 * 220652897 || 1 == Client.anInt2779 * 220652897 && Friend.isFriend(((Player) var0).playerName, false, (byte) -77)))) {
               Friend.method658(var0, var0.anInt2386 * 2106405885, 798331555);
               if(Client.anInt2808 * 1642143199 > -1 && Client.anInt2804 * 1837064243 < Client.anInt2797 * -797118177) {
                  Client.anIntArray2817[Client.anInt2804 * 1837064243] = RSTypeFace.b12_full_font.getTextWidth(var0.textSpoken) / 2;
                  Client.anIntArray2800[Client.anInt2804 * 1837064243] = RSTypeFace.b12_full_font.anInt2643;
                  Client.anIntArray2798[Client.anInt2804 * 1837064243] = Client.anInt2808 * 1642143199;
                  Client.anIntArray2799[Client.anInt2804 * 1837064243] = Client.anInt2809 * -2062084395;
                  Client.anIntArray2776[Client.anInt2804 * 1837064243] = var0.anInt2377 * 638780813;
                  Client.anIntArray2763[Client.anInt2804 * 1837064243] = var0.anInt2355 * 580693971;
                  Client.anIntArray2947[Client.anInt2804 * 1837064243] = var0.textSpokenTime * 419314599;
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
                     RSTypeFace.p11_full_font.drawStringCenter(Integer.toString(var0.anIntArray2358[var9]), Client.anInt2808 * 1642143199 + var2 - 1, 3 + var3 + Client.anInt2809 * -2062084395, 16777215, 0);
                  }
               }
            }

         }
      }
   }


   final void method2720(int var1, int var2, boolean var3, int var4) {
      if(-1 != this.anInt2368 * 1647325343 && AnimationDefinition.getAnimDefForID(this.anInt2368 * 1647325343, 1641627705).priority * -741149777 == 1) {
         this.anInt2368 = 821761185;
      }

      if(!var3) {
         int var6 = var1 - this.anIntArray2391[0];
         int var5 = var2 - this.anIntArray2392[0];
         if(var6 >= -8 && var6 <= 8 && var5 >= -8 && var5 <= 8) {
            if(this.anInt2390 * 2120122927 < 9) {
               this.anInt2390 -= 97254193;
            }

            for(int var7 = this.anInt2390 * 2120122927; var7 > 0; --var7) {
               this.anIntArray2391[var7] = this.anIntArray2391[var7 - 1];
               this.anIntArray2392[var7] = this.anIntArray2392[var7 - 1];
               this.aBoolArray2393[var7] = this.aBoolArray2393[var7 - 1];
            }

            this.anIntArray2391[0] = var1;
            this.anIntArray2392[0] = var2;
            this.aBoolArray2393[0] = false;
            return;
         }
      }

      this.anInt2390 = 0;
      this.anInt2395 = 0;
      this.anInt2338 = 0;
      this.anIntArray2391[0] = var1;
      this.anIntArray2392[0] = var2;
      this.anInt2394 = this.anInt2349 * -139651392 + this.anIntArray2391[0] * 1650389376;
      this.anInt2339 = this.anInt2349 * -835243968 + this.anIntArray2392[0] * 511765632;
   }

   final void moveInDirection(int var1, boolean var2, int var3) {
      int var4 = this.anIntArray2391[0];
      int var6 = this.anIntArray2392[0];
      if(var1 == 0) {
         --var4;
         ++var6;
      }

      if(1 == var1) {
         ++var6;
      }

      if(2 == var1) {
         ++var4;
         ++var6;
      }

      if(3 == var1) {
         --var4;
      }

      if(4 == var1) {
         ++var4;
      }

      if(var1 == 5) {
         --var4;
         --var6;
      }

      if(var1 == 6) {
         --var6;
      }

      if(var1 == 7) {
         ++var4;
         --var6;
      }

      if(-1 != this.anInt2368 * 1647325343 && AnimationDefinition.getAnimDefForID(this.anInt2368 * 1647325343, 1655630672).priority * -741149777 == 1) {
         this.anInt2368 = 821761185;
      }

      if(this.anInt2390 * 2120122927 < 9) {
         this.anInt2390 -= 97254193;
      }

      for(int var5 = this.anInt2390 * 2120122927; var5 > 0; --var5) {
         this.anIntArray2391[var5] = this.anIntArray2391[var5 - 1];
         this.anIntArray2392[var5] = this.anIntArray2392[var5 - 1];
         this.aBoolArray2393[var5] = this.aBoolArray2393[var5 - 1];
      }

      this.anIntArray2391[0] = var4;
      this.anIntArray2392[0] = var6;
      this.aBoolArray2393[0] = var2;
   }

   final void method2723(int var1) {
      this.anInt2390 = 0;
      this.anInt2395 = 0;
   }

   final void method2724(int var1, int var2, int var3, byte var4) {
      for(int var5 = 0; var5 < 4; ++var5) {
         if(this.anIntArray2369[var5] <= var3) {
            this.anIntArray2358[var5] = var1;
            this.anIntArray2356[var5] = var2;
            this.anIntArray2369[var5] = 70 + var3;
            return;
         }
      }

   }

   boolean method2731(int var1) {
      return false;
   } 

   public static void method2738(int var0) {
      MouseInputHandler var1 = MouseInputHandler.mouseInputHandler;
      synchronized(var1) {
         MouseInputHandler.anInt769 = MouseInputHandler.anInt766 * -858751625;
         MouseInputHandler.mouseX = MouseInputHandler.lastMouseX * 32439049;
         MouseInputHandler.mouseY = MouseInputHandler.lastMouseY * 798849249;
         MouseInputHandler.clickType = MouseInputHandler.anInt772 * -1523567063;
         MouseInputHandler.mousePressX = MouseInputHandler.lastMousePressX * -483110349;
         MouseInputHandler.mousePressY = MouseInputHandler.lastMousePressY * -126237837;
         MouseInputHandler.mousePressTime = 5391577938838581487L * MouseInputHandler.lastMousePressTime;
         MouseInputHandler.anInt772 = 0;
      }
   }

   public static boolean method2740(AbstractIndex soundEffect3, AbstractIndex soundEffect2, AbstractIndex soundEffect1, Class108_Sub4_Sub3 var3, int var4) {
      SongReference.soundEffectIndex_R3 = soundEffect3;
      SongReference.soundEffectIndex_R2 = soundEffect2;
      RSSoundEffect.soundEffectIndex_R1 = soundEffect1;
      Class32.aClass108_Sub4_Sub3_464 = var3;
      return true;
   }
}
