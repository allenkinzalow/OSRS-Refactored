
public class CollisionMap {

   int setX = 0;
   int clipHeight;
   int clipWidth;
   int setY = 0;
   public int[][] clipData;


   void removeClipLocation(int var1, int var2, int var3, byte var4) {
      this.clipData[var1][var2] &= ~var3;
   }

   public void reset(int var1) {
      for(int var2 = 0; var2 < this.clipWidth * -1198052419; ++var2) {
         for(int var3 = 0; var3 < this.clipHeight * 1335458161; ++var3) {
            if(var2 != 0 && 0 != var3 && var2 < this.clipWidth * -1198052419 - 5 && var3 < this.clipHeight * 1335458161 - 5) {
               this.clipData[var2][var3] = 16777216;
            } else {
               this.clipData[var2][var3] = 16777215;
            }
         }
      }

   }

   public void markWall(int x, int y, int var3, int type, boolean var5, int var6) {
      x -= this.setX * -1892377927;
      y -= this.setY * -1275312239;
      if(var3 == 0) {
         if(0 == type) {
            this.addClipLocation(x, y, 128);
            this.addClipLocation(x - 1, y, 8);
         }

         if(1 == type) {
            this.addClipLocation(x, y, 2);
            this.addClipLocation(x, y + 1, 32);
         }

         if(2 == type) {
            this.addClipLocation(x, y, 8);
            this.addClipLocation(1 + x, y, 128);
         }

         if(3 == type) {
            this.addClipLocation(x, y, 32);
            this.addClipLocation(x, y - 1, 2);
         }
      }

      if(var3 == 1 || 3 == var3) {
         if(type == 0) {
            this.addClipLocation(x, y, 1);
            this.addClipLocation(x - 1, 1 + y, 16);
         }

         if(type == 1) {
            this.addClipLocation(x, y, 4);
            this.addClipLocation(1 + x, 1 + y, 64);
         }

         if(type == 2) {
            this.addClipLocation(x, y, 16);
            this.addClipLocation(1 + x, y - 1, 1);
         }

         if(3 == type) {
            this.addClipLocation(x, y, 64);
            this.addClipLocation(x - 1, y - 1, 4);
         }
      }

      if(var3 == 2) {
         if(0 == type) {
            this.addClipLocation(x, y, 130);
            this.addClipLocation(x - 1, y, 8);
            this.addClipLocation(x, 1 + y, 32);
         }

         if(1 == type) {
            this.addClipLocation(x, y, 10);
            this.addClipLocation(x, y + 1, 32);
            this.addClipLocation(1 + x, y, 128);
         }

         if(type == 2) {
            this.addClipLocation(x, y, 40);
            this.addClipLocation(x + 1, y, 128);
            this.addClipLocation(x, y - 1, 2);
         }

         if(type == 3) {
            this.addClipLocation(x, y, 160);
            this.addClipLocation(x, y - 1, 2);
            this.addClipLocation(x - 1, y, 8);
         }
      }

      if(var5) {
         if(var3 == 0) {
            if(0 == type) {
               this.addClipLocation(x, y, 65536);
               this.addClipLocation(x - 1, y, 4096);
            }

            if(1 == type) {
               this.addClipLocation(x, y, 1024);
               this.addClipLocation(x, y + 1, 16384);
            }

            if(2 == type) {
               this.addClipLocation(x, y, 4096);
               this.addClipLocation(1 + x, y, 65536);
            }

            if(3 == type) {
               this.addClipLocation(x, y, 16384);
               this.addClipLocation(x, y - 1, 1024);
            }
         }

         if(var3 == 1 || 3 == var3) {
            if(0 == type) {
               this.addClipLocation(x, y, 512);
               this.addClipLocation(x - 1, 1 + y, 8192);
            }

            if(type == 1) {
               this.addClipLocation(x, y, 2048);
               this.addClipLocation(1 + x, 1 + y, '\u8000');
            }

            if(type == 2) {
               this.addClipLocation(x, y, 8192);
               this.addClipLocation(1 + x, y - 1, 512);
            }

            if(type == 3) {
               this.addClipLocation(x, y, '\u8000');
               this.addClipLocation(x - 1, y - 1, 2048);
            }
         }

         if(var3 == 2) {
            if(0 == type) {
               this.addClipLocation(x, y, 66560);
               this.addClipLocation(x - 1, y, 4096);
               this.addClipLocation(x, y + 1, 16384);
            }

            if(1 == type) {
               this.addClipLocation(x, y, 5120);
               this.addClipLocation(x, 1 + y, 16384);
               this.addClipLocation(x + 1, y, 65536);
            }

            if(type == 2) {
               this.addClipLocation(x, y, 20480);
               this.addClipLocation(1 + x, y, 65536);
               this.addClipLocation(x, y - 1, 1024);
            }

            if(type == 3) {
               this.addClipLocation(x, y, 81920);
               this.addClipLocation(x, y - 1, 1024);
               this.addClipLocation(x - 1, y, 4096);
            }
         }
      }
   }

   public void markSolidOccupant(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      int var7 = 256;
      if(var5) {
         var7 += 131072;
      }

      var1 -= this.setX * -1892377927;
      var2 -= this.setY * -1275312239;

      for(int var9 = var1; var9 < var3 + var1; ++var9) {
         if(var9 >= 0 && var9 < this.clipWidth * -1198052419) {
            for(int var8 = var2; var8 < var4 + var2; ++var8) {
               if(var8 >= 0 && var8 < this.clipHeight * 1335458161) {
                  this.addClipLocation(var9, var8, var7);
               }
            }
         }
      }

   }

   public void markBlocked(int x, int y) {
      x -= this.setX * -1892377927;
      y -= this.setY * -1275312239;
      this.clipData[x][y] |= 2097152;
   }

   void addClipLocation(int x, int y, int flag) {
      this.clipData[x][y] |= flag;
   }

   public void unmarkWall(int x, int y, int var3, int var4, boolean var5, short var6) {
      x -= this.setX * -1892377927;
      y -= this.setY * -1275312239;
      if(0 == var3) {
         if(0 == var4) {
            this.removeClipLocation(x, y, 128, (byte) 102);
            this.removeClipLocation(x - 1, y, 8, (byte) 83);
         }

         if(var4 == 1) {
            this.removeClipLocation(x, y, 2, (byte) 83);
            this.removeClipLocation(x, 1 + y, 32, (byte) 114);
         }

         if(var4 == 2) {
            this.removeClipLocation(x, y, 8, (byte) 60);
            this.removeClipLocation(1 + x, y, 128, (byte) 70);
         }

         if(3 == var4) {
            this.removeClipLocation(x, y, 32, (byte) 76);
            this.removeClipLocation(x, y - 1, 2, (byte) 94);
         }
      }

      if(var3 == 1 || 3 == var3) {
         if(0 == var4) {
            this.removeClipLocation(x, y, 1, (byte) 79);
            this.removeClipLocation(x - 1, 1 + y, 16, (byte) 112);
         }

         if(1 == var4) {
            this.removeClipLocation(x, y, 4, (byte) 108);
            this.removeClipLocation(1 + x, 1 + y, 64, (byte) 45);
         }

         if(2 == var4) {
            this.removeClipLocation(x, y, 16, (byte) 80);
            this.removeClipLocation(x + 1, y - 1, 1, (byte) 82);
         }

         if(3 == var4) {
            this.removeClipLocation(x, y, 64, (byte) 114);
            this.removeClipLocation(x - 1, y - 1, 4, (byte) 53);
         }
      }

      if(var3 == 2) {
         if(0 == var4) {
            this.removeClipLocation(x, y, 130, (byte) 127);
            this.removeClipLocation(x - 1, y, 8, (byte) 42);
            this.removeClipLocation(x, y + 1, 32, (byte) 46);
         }

         if(var4 == 1) {
            this.removeClipLocation(x, y, 10, (byte) 43);
            this.removeClipLocation(x, 1 + y, 32, (byte) 59);
            this.removeClipLocation(1 + x, y, 128, (byte) 95);
         }

         if(var4 == 2) {
            this.removeClipLocation(x, y, 40, (byte) 56);
            this.removeClipLocation(x + 1, y, 128, (byte) 124);
            this.removeClipLocation(x, y - 1, 2, (byte) 72);
         }

         if(3 == var4) {
            this.removeClipLocation(x, y, 160, (byte) 90);
            this.removeClipLocation(x, y - 1, 2, (byte) 46);
            this.removeClipLocation(x - 1, y, 8, (byte) 127);
         }
      }

      if(var5) {
         if(0 == var3) {
            if(0 == var4) {
               this.removeClipLocation(x, y, 65536, (byte) 105);
               this.removeClipLocation(x - 1, y, 4096, (byte) 51);
            }

            if(var4 == 1) {
               this.removeClipLocation(x, y, 1024, (byte) 63);
               this.removeClipLocation(x, y + 1, 16384, (byte) 62);
            }

            if(var4 == 2) {
               this.removeClipLocation(x, y, 4096, (byte) 58);
               this.removeClipLocation(x + 1, y, 65536, (byte) 118);
            }

            if(3 == var4) {
               this.removeClipLocation(x, y, 16384, (byte) 80);
               this.removeClipLocation(x, y - 1, 1024, (byte) 60);
            }
         }

         if(var3 == 1 || var3 == 3) {
            if(var4 == 0) {
               this.removeClipLocation(x, y, 512, (byte) 93);
               this.removeClipLocation(x - 1, 1 + y, 8192, (byte) 59);
            }

            if(1 == var4) {
               this.removeClipLocation(x, y, 2048, (byte) 121);
               this.removeClipLocation(1 + x, y + 1, '\u8000', (byte) 52);
            }

            if(2 == var4) {
               this.removeClipLocation(x, y, 8192, (byte) 64);
               this.removeClipLocation(x + 1, y - 1, 512, (byte) 94);
            }

            if(var4 == 3) {
               this.removeClipLocation(x, y, '\u8000', (byte) 86);
               this.removeClipLocation(x - 1, y - 1, 2048, (byte) 105);
            }
         }

         if(2 == var3) {
            if(0 == var4) {
               this.removeClipLocation(x, y, 66560, (byte) 101);
               this.removeClipLocation(x - 1, y, 4096, (byte) 120);
               this.removeClipLocation(x, 1 + y, 16384, (byte) 121);
            }

            if(var4 == 1) {
               this.removeClipLocation(x, y, 5120, (byte) 70);
               this.removeClipLocation(x, 1 + y, 16384, (byte) 90);
               this.removeClipLocation(x + 1, y, 65536, (byte) 57);
            }

            if(var4 == 2) {
               this.removeClipLocation(x, y, 20480, (byte) 117);
               this.removeClipLocation(1 + x, y, 65536, (byte) 120);
               this.removeClipLocation(x, y - 1, 1024, (byte) 127);
            }

            if(var4 == 3) {
               this.removeClipLocation(x, y, 81920, (byte) 74);
               this.removeClipLocation(x, y - 1, 1024, (byte) 56);
               this.removeClipLocation(x - 1, y, 4096, (byte) 69);
            }
         }
      }
   }

   public void method1409(int var1, int var2, int var3) {
      var1 -= this.setX * -1892377927;
      var2 -= this.setY * -1275312239;
      this.clipData[var1][var2] |= 262144;
   }

   public CollisionMap(int var1, int var2) {
      this.clipWidth = var1 * 1484580757;
      this.clipHeight = var2 * -1733154927;
      this.clipData = new int[this.clipWidth * -1198052419][this.clipHeight * 1335458161];
      this.reset(1566511345);
   }

   public void method1410(int var1, int var2, byte var3) {
      var1 -= this.setX * -1892377927;
      var2 -= this.setY * -1275312239;
      this.clipData[var1][var2] &= -262145;
   }

   public void method1412(int var1, int var2, int var3, int var4, int var5, boolean var6, byte var7) {
      int var8 = 256;
      if(var6) {
         var8 += 131072;
      }

      var1 -= this.setX * -1892377927;
      var2 -= this.setY * -1275312239;
      int var10;
      if(1 == var5 || 3 == var5) {
         var10 = var3;
         var3 = var4;
         var4 = var10;
      }

      for(var10 = var1; var10 < var3 + var1; ++var10) {
         if(var10 >= 0 && var10 < this.clipWidth * -1198052419) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if(var9 >= 0 && var9 < this.clipHeight * 1335458161) {
                  this.removeClipLocation(var10, var9, var8, (byte) 48);
               }
            }
         }
      }

   }
}
