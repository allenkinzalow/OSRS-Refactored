
public class MachineInformation extends Node {

   static MachineInformation aMachineInformation_1422;
   static String javaVersion;
   String aString1724;
   boolean aBool1725;
   int anInt1726;
   int anInt1731;
   int anInt1732;
   int anInt1733;
   int anInt1734;
   int anInt1735;
   String aString1736;
   int anInt1737;
   int anInt1738;
   int anInt1740;
   int anInt1741;
   String aString1742;
   int[] anIntArray1743 = new int[3];
   boolean aBool1744;
   String aString1745;
   String aString1747;
   int anInt1748;
   int anInt1749;
   int anInt1750;
   String aString1751;
   int anInt1752;
   int anInt1753;


   void method1913(byte var1) {
      if(this.aString1742.length() > 40) {
         this.aString1742 = this.aString1742.substring(0, 40);
      }

      if(this.aString1747.length() > 40) {
         if(var1 == 1) {
            return;
         }

         this.aString1747 = this.aString1747.substring(0, 40);
      }

      if(this.aString1724.length() > 10) {
         if(var1 == 1) {
            return;
         }

         this.aString1724 = this.aString1724.substring(0, 10);
      }

      if(this.aString1745.length() > 10) {
         if(var1 != 1) {
            this.aString1745 = this.aString1745.substring(0, 10);
         }
      }
   }

   public MachineInformation(boolean var1) {
      if(var1) {
         if(VertexNormal.lowerOperatingSystem.startsWith("win")) {
            this.anInt1726 = 1941850467;
         } else if(VertexNormal.lowerOperatingSystem.startsWith("mac")) {
            this.anInt1726 = -411266362;
         } else if(VertexNormal.lowerOperatingSystem.startsWith("linux")) {
            this.anInt1726 = 1530584105;
         } else {
            this.anInt1726 = -822532724;
         }

         String var2;
         try {
            var2 = System.getProperty("os.arch").toLowerCase();
         } catch (Exception var11) {
            var2 = "";
         }

         String var4;
         try {
            var4 = System.getProperty("os.version").toLowerCase();
         } catch (Exception var10) {
            var4 = "";
         }

         String var3 = "Unknown";
         String var5 = "1.1";

         try {
            var3 = System.getProperty("java.vendor");
            var5 = System.getProperty("java.version");
         } catch (Exception var9) {
            ;
         }

         if(!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
            this.aBool1725 = false;
         } else {
            this.aBool1725 = true;
         }

         if(this.anInt1726 * -1880784821 == 1) {
            if(var4.indexOf("4.0") != -1) {
               this.anInt1731 = -2085013285;
            } else if(var4.indexOf("4.1") != -1) {
               this.anInt1731 = 124940726;
            } else if(var4.indexOf("4.9") != -1) {
               this.anInt1731 = -1960072559;
            } else if(var4.indexOf("5.0") != -1) {
               this.anInt1731 = 249881452;
            } else if(var4.indexOf("5.1") != -1) {
               this.anInt1731 = -1835131833;
            } else if(var4.indexOf("5.2") != -1) {
               this.anInt1731 = 499762904;
            } else if(var4.indexOf("6.0") != -1) {
               this.anInt1731 = 374822178;
            } else if(var4.indexOf("6.1") != -1) {
               this.anInt1731 = -1710191107;
            } else if(var4.indexOf("6.2") != -1) {
               this.anInt1731 = -1585250381;
            }
         } else if(this.anInt1726 * -1880784821 == 2) {
            if(var4.indexOf("10.4") != -1) {
               this.anInt1731 = 1249407260;
            } else if(var4.indexOf("10.5") != -1) {
               this.anInt1731 = -835606025;
            } else if(var4.indexOf("10.6") != -1) {
               this.anInt1731 = 1374347986;
            } else if(var4.indexOf("10.7") != -1) {
               this.anInt1731 = -710665299;
            }
         }

         if(var3.toLowerCase().indexOf("sun") != -1) {
            this.anInt1732 = -132917715;
         } else if(var3.toLowerCase().indexOf("microsoft") != -1) {
            this.anInt1732 = -265835430;
         } else if(var3.toLowerCase().indexOf("apple") != -1) {
            this.anInt1732 = -398753145;
         } else {
            this.anInt1732 = -531670860;
         }

         int var6 = 2;
         int var7 = 0;

         char var8;
         try {
            while(var6 < var5.length()) {
               var8 = var5.charAt(var6);
               if(var8 < 48 || var8 > 57) {
                  break;
               }

               var7 = var7 * 10 + (var8 - 48);
               ++var6;
            }
         } catch (Exception var14) {
            ;
         }

         this.anInt1733 = var7 * -1311697367;
         var6 = var5.indexOf(46, 2) + 1;
         var7 = 0;

         try {
            while(var6 < var5.length()) {
               var8 = var5.charAt(var6);
               if(var8 < 48 || var8 > 57) {
                  break;
               }

               var7 = var8 - 48 + var7 * 10;
               ++var6;
            }
         } catch (Exception var13) {
            ;
         }

         this.anInt1734 = var7 * -957618181;
         var6 = var5.indexOf(95, 4) + 1;
         var7 = 0;

         try {
            while(var6 < var5.length()) {
               var8 = var5.charAt(var6);
               if(var8 < 48 || var8 > 57) {
                  break;
               }

               var7 = var8 - 48 + var7 * 10;
               ++var6;
            }
         } catch (Exception var12) {
            ;
         }

         this.anInt1735 = var7 * -2004222263;
         this.aBool1744 = false;
         this.anInt1737 = ((int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -13836367;
         if(this.anInt1733 * 550299161 > 3) {
            this.anInt1752 = Runtime.getRuntime().availableProcessors() * 1295523561;
         } else {
            this.anInt1752 = 0;
         }

         this.anInt1740 = 0;
      }

      if(this.aString1742 == null) {
         this.aString1742 = "";
      }

      if(null == this.aString1747) {
         this.aString1747 = "";
      }

      if(null == this.aString1724) {
         this.aString1724 = "";
      }

      if(null == this.aString1745) {
         this.aString1745 = "";
      }

      if(this.aString1736 == null) {
         this.aString1736 = "";
      }

      if(this.aString1751 == null) {
         this.aString1751 = "";
      }

      this.method1913((byte)27);
   }

   public void writeMachineInfo(RSByteBuffer var1, byte var2) {
      var1.writeByte(6);
      var1.writeByte(this.anInt1726 * -1880784821);
      var1.writeByte(this.aBool1725 ? 1 : 0);
      var1.writeByte(this.anInt1731 * -61340845);
      var1.writeByte(this.anInt1732 * 392751525);
      var1.writeByte(this.anInt1733 * 550299161);
      var1.writeByte(this.anInt1734 * 1489701683);
      var1.writeByte(this.anInt1735 * -1065583751);
      var1.writeByte(this.aBool1744 ? 1 : 0);
      var1.writeShort(this.anInt1737 * -907015855);
      var1.writeByte(this.anInt1752 * -94070439);
      var1.writeTriByte(this.anInt1740 * 714261225);
      var1.writeShort(this.anInt1741 * 1166616665);
      var1.method1853(this.aString1742, -1089773276);
      var1.method1853(this.aString1747, -1735544711);
      var1.method1853(this.aString1724, -711722021);
      var1.method1853(this.aString1745, -845618466);
      var1.writeByte(this.anInt1750 * 800421685);
      var1.writeShort(this.anInt1748 * 684313955);
      var1.method1853(this.aString1736, -1568223128);
      var1.method1853(this.aString1751, -708432431);
      var1.writeByte(this.anInt1738 * 804646967);
      var1.writeByte(this.anInt1749 * 685662767);

      for(int var3 = 0; var3 < this.anIntArray1743.length; ++var3) {
         var1.writeInt(this.anIntArray1743[var3]);
      }

      var1.writeInt(this.anInt1753 * 511702871);
   }

   public int calculateMachineInfoSize(byte var1) {
      byte var2 = 38;
      String var3 = this.aString1742;
      int var4 = var3.length() + 2;
      int var21 = var2 + var4;
      String var7 = this.aString1747;
      int var9 = var7.length() + 2;
      var21 += var9;
      String var5 = this.aString1724;
      int var13 = var5.length() + 2;
      var21 += var13;
      String var15 = this.aString1745;
      int var12 = var15.length() + 2;
      var21 += var12;
      String var18 = this.aString1736;
      int var19 = var18.length() + 2;
      var21 += var19;
      String var16 = this.aString1751;
      int var17 = var16.length() + 2;
      var21 += var17;
      return var21;
   }

   public static int method1922(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if((var5 & 1) == 1) {
         int var7 = var3;
         var3 = var4;
         var4 = var7;
      }

      var2 &= 3;
      return var2 != 0?(1 != var2?(2 == var2?7 - var0 - (var3 - 1):7 - var1 - (var4 - 1)):var1):var0;
   }

   static void method1923(int var0, int var1, byte var2) {
      int[] var3 = new int[4];
      int[] var6 = new int[4];
      var3[0] = var0;
      var6[0] = var1;
      int var4 = 1;

      for(int var5 = 0; var5 < 4; ++var5) {
         if(PlayerLoginDetails.anIntArray56[var5] != var0) {
            var3[var4] = PlayerLoginDetails.anIntArray56[var5];
            var6[var4] = PlayerLoginDetails.anIntArray63[var5];
            ++var4;
         }
      }

      PlayerLoginDetails.anIntArray56 = var3;
      PlayerLoginDetails.anIntArray63 = var6;
      World.sortWorlds(World.worldList, 0, World.worldList.length - 1, PlayerLoginDetails.anIntArray56, PlayerLoginDetails.anIntArray63, 1945775527);
   }
}
