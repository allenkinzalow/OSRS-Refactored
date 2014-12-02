
public class Class108_Sub11 extends Node {

   byte aByte1661;
   String aString1662;
   int anInt1663;
   public static final int anInt1664 = 82;
   static final int anInt1665 = 25;
   static final int anInt1666 = 32;
   static final int anInt1667 = 256;
   public static short[] aShortArray1668;
   public static boolean aBool1669;
   String aString1670;


   static final void method1684(int var0, int var1, int var2, int var3, int var4, byte var5) {
      if(Friend.anInt620 * 687278457 == var0 && var1 == BuildType.anInt1238 * -365008633) {
         if(Client.anInt2890 * -158871381 == var2) {
            return;
         }

         if(!Client.lowMemory) {
            return;
         }
      }

      Friend.anInt620 = var0 * -964554551;
      BuildType.anInt1238 = var1 * -1482246985;
      Client.anInt2890 = var2 * -1987728893;
      if(!Client.lowMemory) {
         Client.anInt2890 = 0;
      }

      IsaacRandomGen.method725(25, 1943042855);
      GameDefinition.method1107(StringConstants.LOADING_PLEASE_WAIT, true, 488043270);
      int var10 = Class100.anInt1388 * 263051377;
      int var9 = Class15.anInt201 * -1743142671;
      Class100.anInt1388 = (var0 - 6) * -870890360;
      Class15.anInt201 = (var1 - 6) * 527007880;
      int var11 = Class100.anInt1388 * 263051377 - var10;
      int var7 = Class15.anInt201 * -1743142671 - var9;
      var10 = Class100.anInt1388 * 263051377;
      var9 = Class15.anInt201 * -1743142671;

      int var8;
      int var13;
      for(var8 = 0; var8 < '\u8000'; ++var8) {
         NPC var12 = Client.localNPCs[var8];
         if(null != var12) {
            for(var13 = 0; var13 < 10; ++var13) {
               var12.anIntArray2391[var13] -= var11;
               var12.anIntArray2392[var13] -= var7;
            }

            var12.anInt2394 -= var11 * 1650389376;
            var12.anInt2339 -= var7 * 511765632;
         }
      }

      for(var8 = 0; var8 < 2048; ++var8) {
         Player var23 = Client.localPlayers[var8];
         if(null != var23) {
            for(var13 = 0; var13 < 10; ++var13) {
               var23.anIntArray2391[var13] -= var11;
               var23.anIntArray2392[var13] -= var7;
            }

            var23.anInt2394 -= var11 * 1650389376;
            var23.anInt2339 -= var7 * 511765632;
         }
      }

      Class108_Sub20_Sub2.plane = var2 * 1039304467;
      Class108_Sub10.myPlayer.method2720(var3, var4, false, 1160284584);
      byte var22 = 0;
      byte var24 = 104;
      byte var25 = 1;
      if(var11 < 0) {
         var22 = 103;
         var24 = -1;
         var25 = -1;
      }

      byte var18 = 0;
      byte var19 = 104;
      byte var20 = 1;
      if(var7 < 0) {
         var18 = 103;
         var19 = -1;
         var20 = -1;
      }

      for(int var6 = var22; var24 != var6; var6 += var25) {
         for(int var14 = var18; var14 != var19; var14 += var20) {
            int var17 = var11 + var6;
            int var15 = var7 + var14;

            for(int var16 = 0; var16 < 4; ++var16) {
               if(var17 >= 0 && var15 >= 0 && var17 < 104 && var15 < 104) {
                  Client.groundItemArray[var16][var6][var14] = Client.groundItemArray[var16][var17][var15];
               } else {
                  Client.groundItemArray[var16][var6][var14] = null;
               }
            }
         }
      }

      for(Class108_Sub13 var21 = (Class108_Sub13) Client.aClass105_2939.getFront(); var21 != null; var21 = (Class108_Sub13) Client.aClass105_2939.getNext()) {
         var21.anInt1692 -= var11 * 341929743;
         var21.anInt1681 -= var7 * 1934863019;
         if(var21.anInt1692 * -1711169553 < 0 || var21.anInt1681 * -233897981 < 0 || var21.anInt1692 * -1711169553 >= 104 || var21.anInt1681 * -233897981 >= 104) {
            var21.unlink();
         }
      }

      if(0 != Client.anInt2933 * -1708054643) {
         Client.anInt2933 -= var11 * -18058427;
         Client.anInt2894 -= var7 * 1849977017;
      }

      Client.anInt2895 = 0;
      Client.aBool2886 = false;
      Client.lastKnownPlane = 1405183137;
      Client.aClass105_2928.method1333();
      Client.projectileDeque.method1333();
   }

   static final void method1685(Class108_Sub13 var0, byte var1) {
      int var2 = 0;
      int var4 = -1;
      int var3 = 0;
      int var6 = 0;
      if(0 == var0.anInt1679 * -1012881333) {
         var2 = Class56.gameScene.method427(var0.anInt1694 * -1237003511, var0.anInt1692 * -1711169553, var0.anInt1681 * -233897981);
      }

      if(var0.anInt1679 * -1012881333 == 1) {
         var2 = Class56.gameScene.method425(var0.anInt1694 * -1237003511, var0.anInt1692 * -1711169553, var0.anInt1681 * -233897981);
      }

      if(2 == var0.anInt1679 * -1012881333) {
         var2 = Class56.gameScene.method429(var0.anInt1694 * -1237003511, var0.anInt1692 * -1711169553, var0.anInt1681 * -233897981);
      }

      if(var0.anInt1679 * -1012881333 == 3) {
         var2 = Class56.gameScene.fetchGroundTileDecorationHash(var0.anInt1694 * -1237003511, var0.anInt1692 * -1711169553, var0.anInt1681 * -233897981);
      }

      if(0 != var2) {
         int var5 = Class56.gameScene.method431(var0.anInt1694 * -1237003511, var0.anInt1692 * -1711169553, var0.anInt1681 * -233897981, var2);
         var4 = var2 >> 14 & 32767;
         var3 = var5 & 31;
         var6 = var5 >> 6 & 3;
      }

      var0.anInt1683 = var4 * -1278197465;
      var0.anInt1685 = var3 * -1306998411;
      var0.anInt1684 = var6 * 634911733;
   }

   static boolean method1686(AbstractIndex index, int archiveId, int fileId, int var3) {
      byte[] fileData = index.getFile(archiveId, fileId, (byte) 7);
      if(null != fileData) { 
         WallDecoration.method338(fileData, 878628031);
         return true;
      } else {
         return false;
      }
   }

}
