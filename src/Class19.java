
public class Class19 {

   static RSInterface aClass108_Sub17_230;
   static int[][] tileLightingIntensity;
   int anInt232;
   static final int anInt233 = 7;
   int[][] anIntArrayArray234;
   public static String cacheDirectory;
   static int[][][] tileCullingBitset;
   public static final int anInt237 = 1;
   public static final int anInt238 = 37;
   public static final int anInt239 = 19136896;
   int anInt240;


   byte[] method325(byte[] var1, int var2) {
      if(this.anIntArrayArray234 != null) {
         int var8 = 14 + (int)((long)(this.anInt232 * 591077159) * (long)var1.length / (long)(this.anInt240 * 26242879));
         int[] var3 = new int[var8];
         int var5 = 0;
         int var9 = 0;

         int var10;
         for(var10 = 0; var10 < var1.length; ++var10) {
            byte var6 = var1[var10];
            int[] var7 = this.anIntArrayArray234[var9];

            int var4;
            for(var4 = 0; var4 < 14; ++var4) {
               var3[var4 + var5] += var6 * var7[var4];
            }

            var9 += this.anInt232 * 591077159;
            var4 = var9 / (this.anInt240 * 26242879);
            var5 += var4;
            var9 -= this.anInt240 * 26242879 * var4;
         }

         var1 = new byte[var8];

         for(var10 = 0; var10 < var8; ++var10) {
            int var11 = var3[var10] + '\u8000' >> 16;
            if(var11 < -128) {
               var1[var10] = -128;
            } else if(var11 > 127) {
               var1[var10] = 127;
            } else {
               var1[var10] = (byte)var11;
            }
         }
      }

      return var1;
   }

   static final void method327(String var0, int var1, byte var2) {
      Client.secureBuffer.writePacket(114);
      Client.secureBuffer.writeByte(Class108_Sub20_Sub3.method2069(var0, (byte) 64) + 1);
      Client.secureBuffer.writeString(var0);
      Client.secureBuffer.method1741(var1, -1571002127);
   }

   public Class19(int var1, int var2) {
      if(var2 != var1) {
         int var3 = ClientScriptDefinition.method2570(var1, var2, (byte)101);
         var1 /= var3;
         var2 /= var3;
         this.anInt240 = var1 * 411238591;
         this.anInt232 = var2 * 389963927;
         this.anIntArrayArray234 = new int[var1][14];

         for(int var4 = 0; var4 < var1; ++var4) {
            int[] var14 = this.anIntArrayArray234[var4];
            double var10 = 6.0D + (double)var4 / (double)var1;
            int var7 = (int)Math.floor(1.0D + (var10 - 7.0D));
            if(var7 < 0) {
               var7 = 0;
            }

            int var15 = (int)Math.ceil(7.0D + var10);
            if(var15 > 14) {
               var15 = 14;
            }

            for(double var8 = (double)var2 / (double)var1; var7 < var15; ++var7) {
               double var5 = ((double)var7 - var10) * 3.141592653589793D;
               double var12 = var8;
               if(var5 < -1.0E-4D || var5 > 1.0E-4D) {
                  var12 = var8 * (Math.sin(var5) / var5);
               }

               var12 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var7 - var10));
               var14[var7] = (int)Math.floor(0.5D + 65536.0D * var12);
            }
         }

      }
   }

   int method330(int var1, byte var2) {
      if(null != this.anIntArrayArray234) {
         var1 = 6 + (int)((long)(this.anInt232 * 591077159) * (long)var1 / (long)(this.anInt240 * 26242879));
      }

      return var1;
   }

   int method332(int var1, byte var2) {
      if(this.anIntArrayArray234 != null) {
         var1 = (int)((long)(this.anInt232 * 591077159) * (long)var1 / (long)(this.anInt240 * 26242879));
      }

      return var1;
   }

   static final void method334(int var0) {
      Client.removedCounter = 0;
      Client.updateReqCount = 0;
      IdentityKit.method2339((byte)80);
      NPC.method3168(1048603711);

      int var2;
      int var4;
      for(var2 = 0; var2 < Client.updateReqCount * -184592375; ++var2) {
         var4 = Client.playersNeedingUpdating[var2];
         NPC var1 = Client.localNPCs[var4];
         int var5 = Client.packetBuffer.readUByte();
         int var3;
         if((var5 & 16) != 0) {
            var1.anInt2373 = Client.packetBuffer.readUShortA() * 1279943663;
            var3 = Client.packetBuffer.readIntLE(-457367663);
            var1.anInt2388 = (var3 >> 16) * -663135519;
            var1.anInt2381 = ((var3 & '\uffff') + Client.cycle * -637317861) * 1163909499;
            var1.anInt2374 = 0;
            var1.anInt2375 = 0;
            if(var1.anInt2381 * 2072518067 > Client.cycle * -637317861) {
               var1.anInt2374 = 530928865;
            }

            if('\uffff' == var1.anInt2373 * 1305815823) {
               var1.anInt2373 = -1279943663;
            }
         }

         int var6;
         if(0 != (var5 & 32)) {
            var3 = Client.packetBuffer.method1742(-1494849731);
            var6 = Client.packetBuffer.readUNegByte((byte) -27);
            var1.method2724(var3, var6, Client.cycle * -637317861, (byte)-21);
            var1.anInt2342 = Client.cycle * 1254497419 - 1701381396;
            var1.anInt2360 = Client.packetBuffer.method1706(179884786) * -1879576471;
            var1.anInt2361 = Client.packetBuffer.readUShortLEA() * 1056964537;
         }

         if(0 != (var5 & 8)) {
            var1.anInt2362 = Client.packetBuffer.readUShort(1043595703) * -990422189;
            if('\uffff' == var1.anInt2362 * -2108972837) {
               var1.anInt2362 = 990422189;
            }
         }

         if((var5 & 64) != 0) {
            var3 = Client.packetBuffer.method1742(-1494849731);
            var6 = Client.packetBuffer.readUNegByte((byte) -88);
            var1.method2724(var3, var6, Client.cycle * -637317861, (byte)-16);
            var1.anInt2342 = Client.cycle * 1254497419 - 1701381396;
            var1.anInt2360 = Client.packetBuffer.readUShortLEA() * -1879576471;
            var1.anInt2361 = Client.packetBuffer.readUShortLEA() * 1056964537;
         }

         if((var5 & 1) != 0) {
            var1.definition = Class108_Sub12.getNPCDefForID(Client.packetBuffer.readUShortLEA(), 1295047954);
            var1.anInt2349 = var1.definition.tileSpacesOccupied * 869735027;
            var1.anInt2389 = var1.definition.anInt2156 * 1300761443;
            var1.anInt2357 = var1.definition.walkAnimation * 1834238161;
            var1.anInt2347 = var1.definition.rotate180Animation * -1799278961;
            var1.anInt2376 = var1.definition.rotate90RightAnimation * 1104470195;
            var1.anInt2378 = var1.definition.rotate90LeftAnimation * -1117812389;
            var1.anInt2343 = var1.definition.stanceAnimation * -517518475;
            var1.anInt2344 = var1.definition.anInt2165 * -1414070185;
            var1.anInt2370 = var1.definition.anInt2189 * -2025131807;
         }

         if(0 != (var5 & 4)) {
            var3 = Client.packetBuffer.method1706(179884786);
            if('\uffff' == var3) {
               var3 = -1;
            }

            var6 = Client.packetBuffer.method1751((byte)54);
            if(var1.anInt2368 * 1647325343 == var3 && var3 != -1) {
               int var7 = CullingCluster.method672(var3, 2127154089).delayType * -95027165;
               if(var7 == 1) {
                  var1.anInt2341 = 0;
                  var1.anInt2396 = 0;
                  var1.anInt2371 = var6 * -1894246625;
                  var1.anInt2372 = 0;
               }

               if(2 == var7) {
                  var1.anInt2372 = 0;
               }
            } else if(var3 == -1 || var1.anInt2368 * 1647325343 == -1 || CullingCluster.method672(var3, 1639282697).forcedPriority * -1435646185 >= CullingCluster.method672(var1.anInt2368 * 1647325343, 2071546293).forcedPriority * -1435646185) {
               var1.anInt2368 = var3 * -821761185;
               var1.anInt2341 = 0;
               var1.anInt2396 = 0;
               var1.anInt2371 = var6 * -1894246625;
               var1.anInt2372 = 0;
               var1.anInt2395 = var1.anInt2390 * 1986639247;
            }
         }

         if(0 != (var5 & 2)) {
            var1.textSpoken = Client.packetBuffer.getString_2((byte)8);
            var1.anInt2353 = 1424062716;
         }

         if(0 != (var5 & 128)) {
            var1.anInt2363 = Client.packetBuffer.method1706(179884786) * 1365888199;
            var1.anInt2387 = Client.packetBuffer.readUShortA() * -883213979;
         }
      }

      for(var2 = 0; var2 < Client.removedCounter * 104842469; ++var2) {
         var4 = Client.indicesPendingRemoval[var2];
         if(Client.localNPCs[var4].lastUpdated * 1910816589 != Client.cycle * -637317861) {
            Client.localNPCs[var4].definition = null;
            Client.localNPCs[var4] = null;
         }
      }

      if(Client.packetBuffer.position * 798331555 != Client.anInt2927 * -574496637) {
         throw new RuntimeException(Client.packetBuffer.position * 798331555 + Class47.COMMA_LITERAL + Client.anInt2927 * -574496637);
      } else {
         for(var2 = 0; var2 < Client.anInt2749 * -1829405175; ++var2) {
            if(null == Client.localNPCs[Client.npcIndices[var2]]) {
               throw new RuntimeException(var2 + Class47.COMMA_LITERAL + Client.anInt2749 * -1829405175);
            }
         }

      }
   }

   static void method336(int var0, int var1) {
      Class108_Sub12 var2 = (Class108_Sub12)Class108_Sub12.aClass101_1673.get((long) var0);
      if(var2 != null) {
         for(int var3 = 0; var3 < var2.anIntArray1671.length; ++var3) {
            var2.anIntArray1671[var3] = -1;
            var2.anIntArray1675[var3] = 0;
         }

      }
   }

   static final void method337(int var0, int var1, int var2, int var3, int var4) {
      for(int var5 = var1; var5 <= var1 + var3; ++var5) {
         for(int var6 = var0; var6 <= var0 + var2; ++var6) {
            if(var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
               RegionReference.aByteArrayArrayArray488[0][var6][var5] = 127;
               if(var6 == var0 && var6 > 0) {
                  RegionReference.tileHeights[0][var6][var5] = RegionReference.tileHeights[0][var6 - 1][var5];
               }

               if(var0 + var2 == var6 && var6 < 103) {
                  RegionReference.tileHeights[0][var6][var5] = RegionReference.tileHeights[0][var6 + 1][var5];
               }

               if(var5 == var1 && var5 > 0) {
                  RegionReference.tileHeights[0][var6][var5] = RegionReference.tileHeights[0][var6][var5 - 1];
               }

               if(var5 == var3 + var1 && var5 < 103) {
                  RegionReference.tileHeights[0][var6][var5] = RegionReference.tileHeights[0][var6][var5 + 1];
               }
            }
         }
      }

   }
}
