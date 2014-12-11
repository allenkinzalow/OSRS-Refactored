
public class CollisionMap {

   int anInt1457 = 0;
   int anInt1458;
   int anInt1462;
   int anInt1463 = 0;
   public int[][] clipData;


   void method1401(int var1, int var2, int var3, byte var4) {
      this.clipData[var1][var2] &= ~var3;
   }

   public void method1402(int var1) {
      for(int var2 = 0; var2 < this.anInt1462 * -1198052419; ++var2) {
         for(int var3 = 0; var3 < this.anInt1458 * 1335458161; ++var3) {
            if(var2 != 0 && 0 != var3 && var2 < this.anInt1462 * -1198052419 - 5 && var3 < this.anInt1458 * 1335458161 - 5) {
               this.clipData[var2][var3] = 16777216;
            } else {
               this.clipData[var2][var3] = 16777215;
            }
         }
      }

   }

   public void method1403(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      var1 -= this.anInt1457 * -1892377927;
      var2 -= this.anInt1463 * -1275312239;
      if(var3 == 0) {
         if(0 == var4) {
            this.method1407(var1, var2, 128, -1958923520);
            this.method1407(var1 - 1, var2, 8, -2053083878);
         }

         if(1 == var4) {
            this.method1407(var1, var2, 2, -1931376874);
            this.method1407(var1, var2 + 1, 32, -1948416520);
         }

         if(2 == var4) {
            this.method1407(var1, var2, 8, -2070053319);
            this.method1407(1 + var1, var2, 128, -1956748326);
         }

         if(3 == var4) {
            this.method1407(var1, var2, 32, -1923770300);
            this.method1407(var1, var2 - 1, 2, -1979588967);
         }
      }

      if(var3 == 1 || 3 == var3) {
         if(var4 == 0) {
            this.method1407(var1, var2, 1, -1926667245);
            this.method1407(var1 - 1, 1 + var2, 16, -2077607363);
         }

         if(var4 == 1) {
            this.method1407(var1, var2, 4, -1931231009);
            this.method1407(1 + var1, 1 + var2, 64, -1990022677);
         }

         if(var4 == 2) {
            this.method1407(var1, var2, 16, -2051010487);
            this.method1407(1 + var1, var2 - 1, 1, -2000428177);
         }

         if(3 == var4) {
            this.method1407(var1, var2, 64, -1942970916);
            this.method1407(var1 - 1, var2 - 1, 4, -2086652256);
         }
      }

      if(var3 == 2) {
         if(0 == var4) {
            this.method1407(var1, var2, 130, -2056584099);
            this.method1407(var1 - 1, var2, 8, -1974048715);
            this.method1407(var1, 1 + var2, 32, -2103868218);
         }

         if(1 == var4) {
            this.method1407(var1, var2, 10, -2020341372);
            this.method1407(var1, var2 + 1, 32, -2114826289);
            this.method1407(1 + var1, var2, 128, -1999015577);
         }

         if(var4 == 2) {
            this.method1407(var1, var2, 40, -1948602733);
            this.method1407(var1 + 1, var2, 128, -1980163490);
            this.method1407(var1, var2 - 1, 2, -1925954738);
         }

         if(var4 == 3) {
            this.method1407(var1, var2, 160, -1971656802);
            this.method1407(var1, var2 - 1, 2, -1924305574);
            this.method1407(var1 - 1, var2, 8, -2085530959);
         }
      }

      if(var5) {
         if(var3 == 0) {
            if(0 == var4) {
               this.method1407(var1, var2, 65536, -2015340970);
               this.method1407(var1 - 1, var2, 4096, -1935228237);
            }

            if(1 == var4) {
               this.method1407(var1, var2, 1024, -2000596506);
               this.method1407(var1, var2 + 1, 16384, -2094399264);
            }

            if(2 == var4) {
               this.method1407(var1, var2, 4096, -2033273352);
               this.method1407(1 + var1, var2, 65536, -2047952139);
            }

            if(3 == var4) {
               this.method1407(var1, var2, 16384, -2027437851);
               this.method1407(var1, var2 - 1, 1024, -2015461820);
            }
         }

         if(var3 == 1 || 3 == var3) {
            if(0 == var4) {
               this.method1407(var1, var2, 512, -2066412263);
               this.method1407(var1 - 1, 1 + var2, 8192, -2141003302);
            }

            if(var4 == 1) {
               this.method1407(var1, var2, 2048, -2071451867);
               this.method1407(1 + var1, 1 + var2, '\u8000', -2146583596);
            }

            if(var4 == 2) {
               this.method1407(var1, var2, 8192, -2118349140);
               this.method1407(1 + var1, var2 - 1, 512, -2092673245);
            }

            if(var4 == 3) {
               this.method1407(var1, var2, '\u8000', -2031211786);
               this.method1407(var1 - 1, var2 - 1, 2048, -1949327385);
            }
         }

         if(var3 == 2) {
            if(0 == var4) {
               this.method1407(var1, var2, 66560, -2075044067);
               this.method1407(var1 - 1, var2, 4096, -2068448777);
               this.method1407(var1, var2 + 1, 16384, -1934073992);
            }

            if(1 == var4) {
               this.method1407(var1, var2, 5120, -2034225998);
               this.method1407(var1, 1 + var2, 16384, -1920883775);
               this.method1407(var1 + 1, var2, 65536, -1976068526);
            }

            if(var4 == 2) {
               this.method1407(var1, var2, 20480, -2138819920);
               this.method1407(1 + var1, var2, 65536, -2047170365);
               this.method1407(var1, var2 - 1, 1024, -1954635415);
            }

            if(var4 == 3) {
               this.method1407(var1, var2, 81920, -2028788973);
               this.method1407(var1, var2 - 1, 1024, -1984232303);
               this.method1407(var1 - 1, var2, 4096, -2145295007);
            }
         }
      }
   }

   public void method1404(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      int var7 = 256;
      if(var5) {
         var7 += 131072;
      }

      var1 -= this.anInt1457 * -1892377927;
      var2 -= this.anInt1463 * -1275312239;

      for(int var9 = var1; var9 < var3 + var1; ++var9) {
         if(var9 >= 0 && var9 < this.anInt1462 * -1198052419) {
            for(int var8 = var2; var8 < var4 + var2; ++var8) {
               if(var8 >= 0 && var8 < this.anInt1458 * 1335458161) {
                  this.method1407(var9, var8, var7, -2037945811);
               }
            }
         }
      }

   }

   public void markBlocked(int var1, int var2, int var3) {
      var1 -= this.anInt1457 * -1892377927;
      var2 -= this.anInt1463 * -1275312239;
      this.clipData[var1][var2] |= 2097152;
   }

   void method1407(int var1, int var2, int var3, int var4) {
      this.clipData[var1][var2] |= var3;
   }

   public void method1408(int var1, int var2, int var3, int var4, boolean var5, short var6) {
      var1 -= this.anInt1457 * -1892377927;
      var2 -= this.anInt1463 * -1275312239;
      if(0 == var3) {
         if(0 == var4) {
            this.method1401(var1, var2, 128, (byte)102);
            this.method1401(var1 - 1, var2, 8, (byte)83);
         }

         if(var4 == 1) {
            this.method1401(var1, var2, 2, (byte)83);
            this.method1401(var1, 1 + var2, 32, (byte)114);
         }

         if(var4 == 2) {
            this.method1401(var1, var2, 8, (byte)60);
            this.method1401(1 + var1, var2, 128, (byte)70);
         }

         if(3 == var4) {
            this.method1401(var1, var2, 32, (byte)76);
            this.method1401(var1, var2 - 1, 2, (byte)94);
         }
      }

      if(var3 == 1 || 3 == var3) {
         if(0 == var4) {
            this.method1401(var1, var2, 1, (byte)79);
            this.method1401(var1 - 1, 1 + var2, 16, (byte)112);
         }

         if(1 == var4) {
            this.method1401(var1, var2, 4, (byte)108);
            this.method1401(1 + var1, 1 + var2, 64, (byte)45);
         }

         if(2 == var4) {
            this.method1401(var1, var2, 16, (byte)80);
            this.method1401(var1 + 1, var2 - 1, 1, (byte)82);
         }

         if(3 == var4) {
            this.method1401(var1, var2, 64, (byte)114);
            this.method1401(var1 - 1, var2 - 1, 4, (byte)53);
         }
      }

      if(var3 == 2) {
         if(0 == var4) {
            this.method1401(var1, var2, 130, (byte)127);
            this.method1401(var1 - 1, var2, 8, (byte)42);
            this.method1401(var1, var2 + 1, 32, (byte)46);
         }

         if(var4 == 1) {
            this.method1401(var1, var2, 10, (byte)43);
            this.method1401(var1, 1 + var2, 32, (byte)59);
            this.method1401(1 + var1, var2, 128, (byte)95);
         }

         if(var4 == 2) {
            this.method1401(var1, var2, 40, (byte)56);
            this.method1401(var1 + 1, var2, 128, (byte)124);
            this.method1401(var1, var2 - 1, 2, (byte)72);
         }

         if(3 == var4) {
            this.method1401(var1, var2, 160, (byte)90);
            this.method1401(var1, var2 - 1, 2, (byte)46);
            this.method1401(var1 - 1, var2, 8, (byte)127);
         }
      }

      if(var5) {
         if(0 == var3) {
            if(0 == var4) {
               this.method1401(var1, var2, 65536, (byte)105);
               this.method1401(var1 - 1, var2, 4096, (byte)51);
            }

            if(var4 == 1) {
               this.method1401(var1, var2, 1024, (byte)63);
               this.method1401(var1, var2 + 1, 16384, (byte)62);
            }

            if(var4 == 2) {
               this.method1401(var1, var2, 4096, (byte)58);
               this.method1401(var1 + 1, var2, 65536, (byte)118);
            }

            if(3 == var4) {
               this.method1401(var1, var2, 16384, (byte)80);
               this.method1401(var1, var2 - 1, 1024, (byte)60);
            }
         }

         if(var3 == 1 || var3 == 3) {
            if(var4 == 0) {
               this.method1401(var1, var2, 512, (byte)93);
               this.method1401(var1 - 1, 1 + var2, 8192, (byte)59);
            }

            if(1 == var4) {
               this.method1401(var1, var2, 2048, (byte)121);
               this.method1401(1 + var1, var2 + 1, '\u8000', (byte)52);
            }

            if(2 == var4) {
               this.method1401(var1, var2, 8192, (byte)64);
               this.method1401(var1 + 1, var2 - 1, 512, (byte)94);
            }

            if(var4 == 3) {
               this.method1401(var1, var2, '\u8000', (byte)86);
               this.method1401(var1 - 1, var2 - 1, 2048, (byte)105);
            }
         }

         if(2 == var3) {
            if(0 == var4) {
               this.method1401(var1, var2, 66560, (byte)101);
               this.method1401(var1 - 1, var2, 4096, (byte)120);
               this.method1401(var1, 1 + var2, 16384, (byte)121);
            }

            if(var4 == 1) {
               this.method1401(var1, var2, 5120, (byte)70);
               this.method1401(var1, 1 + var2, 16384, (byte)90);
               this.method1401(var1 + 1, var2, 65536, (byte)57);
            }

            if(var4 == 2) {
               this.method1401(var1, var2, 20480, (byte)117);
               this.method1401(1 + var1, var2, 65536, (byte)120);
               this.method1401(var1, var2 - 1, 1024, (byte)127);
            }

            if(var4 == 3) {
               this.method1401(var1, var2, 81920, (byte)74);
               this.method1401(var1, var2 - 1, 1024, (byte)56);
               this.method1401(var1 - 1, var2, 4096, (byte)69);
            }
         }
      }
   }

   public void method1409(int var1, int var2, int var3) {
      var1 -= this.anInt1457 * -1892377927;
      var2 -= this.anInt1463 * -1275312239;
      this.clipData[var1][var2] |= 262144;
   }

   public CollisionMap(int var1, int var2) {
      this.anInt1462 = var1 * 1484580757;
      this.anInt1458 = var2 * -1733154927;
      this.clipData = new int[this.anInt1462 * -1198052419][this.anInt1458 * 1335458161];
      this.method1402(1566511345);
   }

   public void method1410(int var1, int var2, byte var3) {
      var1 -= this.anInt1457 * -1892377927;
      var2 -= this.anInt1463 * -1275312239;
      this.clipData[var1][var2] &= -262145;
   }

   public void method1412(int var1, int var2, int var3, int var4, int var5, boolean var6, byte var7) {
      int var8 = 256;
      if(var6) {
         var8 += 131072;
      }

      var1 -= this.anInt1457 * -1892377927;
      var2 -= this.anInt1463 * -1275312239;
      int var10;
      if(1 == var5 || 3 == var5) {
         var10 = var3;
         var3 = var4;
         var4 = var10;
      }

      for(var10 = var1; var10 < var3 + var1; ++var10) {
         if(var10 >= 0 && var10 < this.anInt1462 * -1198052419) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if(var9 >= 0 && var9 < this.anInt1458 * 1335458161) {
                  this.method1401(var10, var9, var8, (byte)48);
               }
            }
         }
      }

   }
}
