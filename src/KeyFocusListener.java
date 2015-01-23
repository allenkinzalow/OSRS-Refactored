import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class KeyFocusListener implements KeyListener, FocusListener {

   public static int anInt871 = 0;
   public static volatile int anInt875 = 0;
   static int[] anIntArray876 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   public static int anInt877 = 0;
   static PaletteSprite[] worldTypeSprites;
   public static int[] anIntArray885 = new int[128];
   public static KeyFocusListener keyFocusListener = new KeyFocusListener();
   public static int anInt887 = 0;
   static char[] aCharArray888 = new char[128];
   static int[] anIntArray889 = new int[128];
   public static int[] anIntArray890 = new int[128];
   public static int anInt892 = 0;
   public static int anInt894 = 0;
   public static boolean[] aBoolArray895 = new boolean[112];
   public static int anInt897 = 0;


   public final synchronized void keyReleased(KeyEvent var1) {
      if(null != keyFocusListener) {
         anInt875 = 0;
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < anIntArray876.length) {
            var2 = anIntArray876[var2] & -129;
         } else {
            var2 = -1;
         }

         if(anInt887 * -614955533 >= 0 && var2 >= 0) {
            anIntArray885[anInt887 * -614955533] = ~var2;
            anInt887 = (anInt887 * -614955533 + 1 & 127) * 88447803;
            if(anInt887 * -614955533 == anInt877 * -622858425) {
               anInt887 = -88447803;
            }
         }
      }

      var1.consume();
   }

   static final void method904(Entity var0, int var1, int var2) {
      int var3;
      int var4;
      int var5;
      int var8;
      if(var0.anInt2382 * 651118561 > Client.cycle * -637317861) {
         var5 = var0.anInt2382 * 651118561 - Client.cycle * -637317861;
         var3 = var0.anInt2349 * -316782016 + var0.anInt2346 * -433366912;
         var4 = var0.anInt2380 * 661235840 + var0.anInt2349 * -316782016;
         var0.anInt2394 += (var3 - var0.anInt2394 * 171470795) / var5 * 1254407651;
         var0.anInt2339 += (var4 - var0.anInt2339 * 826764905) / var5 * 71107033;
         var0.anInt2338 = 0;
         if(0 == var0.anInt2384 * -341799005) {
            var0.anInt2354 = -257029120;
         }

         if(var0.anInt2384 * -341799005 == 1) {
            var0.anInt2354 = -385543680;
         }

         if(var0.anInt2384 * -341799005 == 2) {
            var0.anInt2354 = 0;
         }

         if(3 == var0.anInt2384 * -341799005) {
            var0.anInt2354 = -128514560;
         }
      } else if(var0.anInt2383 * -1116714413 >= Client.cycle * -637317861) {
         NPCDefinition.method2293(var0, (short)14400);
      } else {
         var0.anInt2365 = var0.standAnimationID * 1667007719;
         if(var0.anInt2390 * 2120122927 == 0) {
            var0.anInt2338 = 0;
         } else {
            label427: {
               if(-1 != var0.anInt2368 * 1647325343 && 0 == var0.anInt2371 * 843883743) {
                  AnimationDefinition var13 = AnimationDefinition.getAnimDefForID(var0.anInt2368 * 1647325343, 1651080421);
                  if(var0.anInt2395 * 2007914849 > 0 && var13.resetWhenWalk * 1194451065 == 0) {
                     var0.anInt2338 += 617941433;
                     break label427;
                  }

                  if(var0.anInt2395 * 2007914849 <= 0 && var13.priority * -741149777 == 0) {
                     var0.anInt2338 += 617941433;
                     break label427;
                  }
               }

               var5 = var0.anInt2394 * 171470795;
               var3 = var0.anInt2339 * 826764905;
               var4 = var0.anIntArray2391[var0.anInt2390 * 2120122927 - 1] * 128 + var0.anInt2349 * -316782016;
               var8 = var0.anIntArray2392[var0.anInt2390 * 2120122927 - 1] * 128 + var0.anInt2349 * -316782016;
               if(var4 - var5 <= 256 && var4 - var5 >= -256 && var8 - var3 <= 256 && var8 - var3 >= -256) {
                  if(var5 < var4) {
                     if(var3 < var8) {
                        var0.anInt2354 = -321286400;
                     } else if(var3 > var8) {
                        var0.anInt2354 = -449800960;
                     } else {
                        var0.anInt2354 = -385543680;
                     }
                  } else if(var5 > var4) {
                     if(var3 < var8) {
                        var0.anInt2354 = -192771840;
                     } else if(var3 > var8) {
                        var0.anInt2354 = -64257280;
                     } else {
                        var0.anInt2354 = -128514560;
                     }
                  } else if(var3 < var8) {
                     var0.anInt2354 = -257029120;
                  } else if(var3 > var8) {
                     var0.anInt2354 = 0;
                  }

                  int var7 = var0.anInt2354 * -2014004437 - var0.anInt2345 * -376471767 & 2047;
                  if(var7 > 1024) {
                     var7 -= 2048;
                  }

                  int var9 = var0.turn180AnimationID * 953582413;
                  if(var7 >= -256 && var7 <= 256) {
                     var9 = var0.anInt2357 * 1461718367;
                  } else if(var7 >= 256 && var7 < 768) {
                     var9 = var0.turn90LeftAnimationID * 568563325;
                  } else if(var7 >= -768 && var7 <= -256) {
                     var9 = var0.turn90RightAnimationID * -2059161139;
                  }

                  if(var9 == -1) {
                     var9 = var0.anInt2357 * 1461718367;
                  }

                  var0.anInt2365 = var9 * -278541697;
                  int var6 = 4;
                  boolean var10 = true;
                  if(var0 instanceof NPC) {
                     var10 = ((NPC)var0).definition.aBool2170;
                  }

                  if(var10) {
                     if(var0.anInt2345 * -376471767 != var0.anInt2354 * -2014004437 && -1 == var0.anInt2362 * -2108972837 && 0 != var0.anInt2389 * -742374489) {
                        var6 = 2;
                     }

                     if(var0.anInt2390 * 2120122927 > 2) {
                        var6 = 6;
                     }

                     if(var0.anInt2390 * 2120122927 > 3) {
                        var6 = 8;
                     }

                     if(var0.anInt2338 * 1340222601 > 0 && var0.anInt2390 * 2120122927 > 1) {
                        var6 = 8;
                        var0.anInt2338 -= 617941433;
                     }
                  } else {
                     if(var0.anInt2390 * 2120122927 > 1) {
                        var6 = 6;
                     }

                     if(var0.anInt2390 * 2120122927 > 2) {
                        var6 = 8;
                     }

                     if(var0.anInt2338 * 1340222601 > 0 && var0.anInt2390 * 2120122927 > 1) {
                        var6 = 8;
                        var0.anInt2338 -= 617941433;
                     }
                  }

                  if(var0.aBoolArray2393[var0.anInt2390 * 2120122927 - 1]) {
                     var6 <<= 1;
                  }

                  if(var6 >= 8 && var0.anInt2357 * 1461718367 == var0.anInt2365 * 1103885695 && -1 != var0.runAnimationID * -790681545) {
                     var0.anInt2365 = var0.runAnimationID * -350004919;
                  }

                  if(var5 < var4) {
                     var0.anInt2394 += var6 * 1254407651;
                     if(var0.anInt2394 * 171470795 > var4) {
                        var0.anInt2394 = var4 * 1254407651;
                     }
                  } else if(var5 > var4) {
                     var0.anInt2394 -= var6 * 1254407651;
                     if(var0.anInt2394 * 171470795 < var4) {
                        var0.anInt2394 = var4 * 1254407651;
                     }
                  }

                  if(var3 < var8) {
                     var0.anInt2339 += var6 * 71107033;
                     if(var0.anInt2339 * 826764905 > var8) {
                        var0.anInt2339 = var8 * 71107033;
                     }
                  } else if(var3 > var8) {
                     var0.anInt2339 -= var6 * 71107033;
                     if(var0.anInt2339 * 826764905 < var8) {
                        var0.anInt2339 = var8 * 71107033;
                     }
                  }

                  if(var4 == var0.anInt2394 * 171470795 && var8 == var0.anInt2339 * 826764905) {
                     var0.anInt2390 += 97254193;
                     if(var0.anInt2395 * 2007914849 > 0) {
                        var0.anInt2395 += 312735071;
                     }
                  }
               } else {
                  var0.anInt2394 = var4 * 1254407651;
                  var0.anInt2339 = var8 * 71107033;
               }
            }
         }
      }

      if(var0.anInt2394 * 171470795 < 128 || var0.anInt2339 * 826764905 < 128 || var0.anInt2394 * 171470795 >= 13184 || var0.anInt2339 * 826764905 >= 13184) {
         var0.anInt2368 = 821761185;
         var0.anInt2373 = -1279943663;
         var0.anInt2382 = 0;
         var0.anInt2383 = 0;
         var0.anInt2394 = var0.anInt2349 * -139651392 + var0.anIntArray2391[0] * 1650389376;
         var0.anInt2339 = var0.anInt2349 * -835243968 + var0.anIntArray2392[0] * 511765632;
         var0.method2723(409009331);
      }

      if(Player.myPlayer == var0 && (var0.anInt2394 * 171470795 < 1536 || var0.anInt2339 * 826764905 < 1536 || var0.anInt2394 * 171470795 >= 11776 || var0.anInt2339 * 826764905 >= 11776)) {
         var0.anInt2368 = 821761185;
         var0.anInt2373 = -1279943663;
         var0.anInt2382 = 0;
         var0.anInt2383 = 0;
         var0.anInt2394 = var0.anInt2349 * -139651392 + var0.anIntArray2391[0] * 1650389376;
         var0.anInt2339 = var0.anIntArray2392[0] * 511765632 + var0.anInt2349 * -835243968;
         var0.method2723(409009331);
      }

      if(var0.anInt2389 * -742374489 != 0) {
         if(-1 != var0.anInt2362 * -2108972837 && var0.anInt2362 * -2108972837 < '\u8000') {
            NPC var14 = Client.localNPCs[var0.anInt2362 * -2108972837];
            if(null != var14) {
               var3 = var0.anInt2394 * 171470795 - var14.anInt2394 * 171470795;
               var4 = var0.anInt2339 * 826764905 - var14.anInt2339 * 826764905;
               if(var3 != 0 || 0 != var4) {
                  var0.anInt2354 = ((int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047) * 1023159171;
               }
            }
         }

         if(var0.anInt2362 * -2108972837 >= '\u8000') {
            var5 = var0.anInt2362 * -2108972837 - '\u8000';
            if(Client.anInt2823 * 1800645115 == var5) {
               var5 = 2047;
            }

            Player var11 = Client.localPlayers[var5];
            if(null != var11) {
               var4 = var0.anInt2394 * 171470795 - var11.anInt2394 * 171470795;
               var8 = var0.anInt2339 * 826764905 - var11.anInt2339 * 826764905;
               if(0 != var4 || 0 != var8) {
                  var0.anInt2354 = ((int)(Math.atan2((double)var4, (double)var8) * 325.949D) & 2047) * 1023159171;
               }
            }
         }

         if((var0.anInt2363 * -1894435593 != 0 || 0 != var0.anInt2387 * -1337634707) && (var0.anInt2390 * 2120122927 == 0 || var0.anInt2338 * 1340222601 > 0)) {
            var5 = var0.anInt2394 * 171470795 - (var0.anInt2363 * -984793664 - Class100.anInt1388 * -344581056 - Class100.anInt1388 * -344581056);
            var3 = var0.anInt2339 * 826764905 - (var0.anInt2387 * 290724672 - SoundEffectWorker.anInt201 * 108018752 - SoundEffectWorker.anInt201 * 108018752);
            if(var5 != 0 || 0 != var3) {
               var0.anInt2354 = ((int)(Math.atan2((double)var5, (double)var3) * 325.949D) & 2047) * 1023159171;
            }

            var0.anInt2363 = 0;
            var0.anInt2387 = 0;
         }

         var5 = var0.anInt2354 * -2014004437 - var0.anInt2345 * -376471767 & 2047;
         if(0 != var5) {
            var0.anInt2397 -= 1672398003;
            boolean var12;
            if(var5 > 1024) {
               var0.anInt2345 -= var0.anInt2389 * 1225168463;
               var12 = true;
               if(var5 < var0.anInt2389 * -742374489 || var5 > 2048 - var0.anInt2389 * -742374489) {
                  var0.anInt2345 = var0.anInt2354 * -1989806541;
                  var12 = false;
               }

               if(var0.anInt2365 * 1103885695 == var0.standAnimationID * -532414055 && (var0.anInt2397 * -2089126523 > 25 || var12)) {
                  if(-1 != var0.nextAnimationID * 1113049431) {
                     var0.anInt2365 = var0.nextAnimationID * -692156375;
                  } else {
                     var0.anInt2365 = var0.anInt2357 * 2062456865;
                  }
               }
            } else {
               var0.anInt2345 += var0.anInt2389 * 1225168463;
               var12 = true;
               if(var5 < var0.anInt2389 * -742374489 || var5 > 2048 - var0.anInt2389 * -742374489) {
                  var0.anInt2345 = var0.anInt2354 * -1989806541;
                  var12 = false;
               }

               if(var0.anInt2365 * 1103885695 == var0.standAnimationID * -532414055 && (var0.anInt2397 * -2089126523 > 25 || var12)) {
                  if(var0.walkAnimationID * -1972207769 != -1) {
                     var0.anInt2365 = var0.walkAnimationID * 1945598489;
                  } else {
                     var0.anInt2365 = var0.anInt2357 * 2062456865;
                  }
               }
            }

            var0.anInt2345 = (var0.anInt2345 * -376471767 & 2047) * -1111782119;
         } else {
            var0.anInt2397 = 0;
         }
      }

      Class4.method90(var0, (short)-19173);
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if(null != keyFocusListener) {
         anInt887 = -88447803;
      }
   }

   public final void focusGained(FocusEvent var1) {}

   public final synchronized void keyPressed(KeyEvent var1) {
      if(keyFocusListener != null) {
         anInt875 = 0;
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < anIntArray876.length) {
            var2 = anIntArray876[var2];
            if(0 != (var2 & 128)) {
               var2 = -1;
            }
         } else {
            var2 = -1;
         }

         if(anInt887 * -614955533 >= 0 && var2 >= 0) {
            anIntArray885[anInt887 * -614955533] = var2;
            anInt887 = (anInt887 * -614955533 + 1 & 127) * 88447803;
            if(anInt887 * -614955533 == anInt877 * -622858425) {
               anInt887 = -88447803;
            }
         }

         int var3;
         if(var2 >= 0) {
            var3 = 1 + anInt871 * 757436417 & 127;
            if(var3 != anInt892 * -1955530573) {
               anIntArray889[anInt871 * 757436417] = var2;
               aCharArray888[anInt871 * 757436417] = 0;
               anInt871 = var3 * -1009094655;
            }
         }

         var3 = var1.getModifiers();
         if(0 != (var3 & 10) || 85 == var2 || 10 == var2) {
            var1.consume();
         }
      }
   }

   public static Class108_Sub20_Sub3 method919(int var0, int var1) {
      Class108_Sub20_Sub3 var2 = (Class108_Sub20_Sub3)Class108_Sub20_Sub3.aClass106_1963.get((long)var0);
      if(null != var2) {
         return var2;
      } else {
         byte[] var3 = Class108_Sub20_Sub3.configIndexReference.getFile(5, var0, (byte) 7);
         var2 = new Class108_Sub20_Sub3();
         if(var3 != null) {
            var2.method2060(new RSByteBuffer(var3), (short)-19062);
         }

         Class108_Sub20_Sub3.aClass106_1963.put(var2, (long)var0);
         return var2;
      }
   }

   public final void keyTyped(KeyEvent var1) {
      if(keyFocusListener != null) {
         char var3 = var1.getKeyChar();
         if(var3 != 0 && '\uffff' != var3) {
            boolean var4;
            if((var3 <= 0 || var3 >= 128) && (var3 < 160 || var3 > 255)) {
               label66: {
                  if(var3 != 0) {
                     char[] var2 = StringUtilities.aCharArray1496;

                     for(int var5 = 0; var5 < var2.length; ++var5) {
                        char var6 = var2[var5];
                        if(var3 == var6) {
                           var4 = true;
                           break label66;
                        }
                     }
                  }

                  var4 = false;
               }
            } else {
               var4 = true;
            }

            if(var4) {
               int var7 = anInt871 * 757436417 + 1 & 127;
               if(var7 != anInt892 * -1955530573) {
                  anIntArray889[anInt871 * 757436417] = -1;
                  aCharArray888[anInt871 * 757436417] = var3;
                  anInt871 = var7 * -1009094655;
               }
            }
         }
      }

      var1.consume();
   }

}
