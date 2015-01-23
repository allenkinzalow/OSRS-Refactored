import java.io.File;
import java.io.IOException;

public abstract class Entity extends Renderable {

   static RGBSprite[] headPrayerSprites;
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
