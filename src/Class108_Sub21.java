
public class Class108_Sub21 extends Node {

   static Class1 aClass1_1895;
   int anInt1896;
   int anInt1897;
   Class100 aClass100_1898;
   int anInt1899;
   int anInt1900;
   int anInt1901;
   int anInt1902;
   Class108_Sub22 aClass108_Sub22_1903;
   int anInt1904;
   int anInt1905;
   int anInt1906;
   Class108_Sub1_Sub1 aClass108_Sub1_Sub1_1907;
   int anInt1908;
   int anInt1909;
   int anInt1910;
   int anInt1911;
   int anInt1912;
   Class108_Sub4_Sub2 aClass108_Sub4_Sub2_1913;
   int anInt1914;
   int anInt1915;
   static final int anInt1916 = 23;
   int anInt1917;


   void method1985(int var1) {
      this.aClass108_Sub22_1903 = null;
      this.aClass108_Sub1_Sub1_1907 = null;
      this.aClass100_1898 = null;
      this.aClass108_Sub4_Sub2_1913 = null;
   }

   static final void method1989(Class2 var0, int var1) {
      if(Class108_Sub10.myPlayer.anInt2394 * 171470795 >> 7 == Client.anInt2933 * -1708054643 && Class108_Sub10.myPlayer.anInt2339 * 826764905 >> 7 == Client.anInt2894 * 943660425) {
         Client.anInt2933 = 0;
      }

      int var3 = Client.numLocalPlayers * -43742683;
      if(Class2.aClass2_25 == var0 || var0 == Class2.aClass2_24) {
         var3 = 1;
      }

      for(int var4 = 0; var4 < var3; ++var4) {
         Player player;
         int var5;
         if(var0 == Class2.aClass2_25) {
            player = Class108_Sub10.myPlayer;
            var5 = 33538048;
         } else if(var0 == Class2.aClass2_24) {
            player = Client.localPlayers[Client.anInt2837 * 310098017];
            var5 = Client.anInt2837 * 310098017 << 14;
         } else {
            player = Client.localPlayers[Client.playerIndices[var4]];
            var5 = Client.playerIndices[var4] << 14;
            if(var0 == Class2.aClass2_15 && Client.anInt2837 * 310098017 == Client.playerIndices[var4]) {
               continue;
            }
         }

         if(player != null && player.method2731(-1997007054) && !player.aBool2682) {
            player.aBool2680 = false;
            if((Client.lowMemory && Client.numLocalPlayers * -43742683 > 50 || Client.numLocalPlayers * -43742683 > 200) && var0 != Class2.aClass2_25 && player.anInt2365 * 1103885695 == player.anInt2343 * -532414055) {
               player.aBool2680 = true;
            }

            int var6 = player.anInt2394 * 171470795 >> 7;
            int var7 = player.anInt2339 * 826764905 >> 7;
            if(var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
               if(null != player.aClass108_Sub20_Sub14_Sub3_2675 && Client.cycle * -637317861 >= player.anInt2665 * 1616333119 && Client.cycle * -637317861 < player.anInt2670 * -1285705355) {
                  player.aBool2680 = false;
                  player.anInt2669 = ClientScript.getFloorDrawHeight(player.anInt2394 * 171470795, player.anInt2339 * 826764905, Class108_Sub20_Sub2.plane * -570926309, 2140695436) * -380686299;
                  Class56.gameScene.method413(Class108_Sub20_Sub2.plane * -570926309, player.anInt2394 * 171470795, player.anInt2339 * 826764905, player.anInt2669 * -1445368915, 60, player, player.anInt2345 * -376471767, var5, player.anInt2678 * 1474774453, player.anInt2677 * 1849026875, player.anInt2664 * 551930971, player.anInt2679 * -1849535703);
               } else {
                  if((player.anInt2394 * 171470795 & 127) == 64 && (player.anInt2339 * 826764905 & 127) == 64) {
                     if(Client.anIntArrayArray2806[var6][var7] == Client.anInt2807 * 1693763895) {
                        continue;
                     }

                     Client.anIntArrayArray2806[var6][var7] = Client.anInt2807 * 1693763895;
                  }

                  player.anInt2669 = ClientScript.getFloorDrawHeight(player.anInt2394 * 171470795, player.anInt2339 * 826764905, Class108_Sub20_Sub2.plane * -570926309, 2067968875) * -380686299;
                  Class56.gameScene.method412(Class108_Sub20_Sub2.plane * -570926309, player.anInt2394 * 171470795, player.anInt2339 * 826764905, player.anInt2669 * -1445368915, 60, player, player.anInt2345 * -376471767, var5, player.aBool2348);
               }
            }
         }
      }

   }
}
