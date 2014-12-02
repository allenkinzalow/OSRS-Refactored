
public class RSSong extends Node {

   HashTable aClass101_1928;
   byte[] aByteArray1929;


   public static RSSong getSong(AbstractIndex musicIndex, int archiveID, int fileID) {
      byte[] songData = musicIndex.getFile(archiveID, fileID, (byte) 7);
      return songData == null ? null : new RSSong(new RSByteBuffer(songData));
   }

   void method2001() {
      if(this.aClass101_1928 == null) {
         this.aClass101_1928 = new HashTable(16);
         int[] var1 = new int[16];
         int[] var5 = new int[16];
         var5[9] = 128;
         var1[9] = 128;
         Class96 var3 = new Class96(this.aByteArray1929);
         int var7 = var3.method1237();

         int var4;
         for(var4 = 0; var4 < var7; ++var4) {
            var3.method1253(var4);
            var3.method1218(var4);
            var3.method1245(var4);
         }

         while(true) {
            var4 = var3.method1226();
            int var11 = var3.anIntArray1370[var4];

            while(var3.anIntArray1370[var4] == var11) {
               var3.method1253(var4);
               int var6 = var3.method1221(var4);
               if(var6 == 1) {
                  var3.method1220();
                  var3.method1245(var4);
                  if(var3.method1227()) {
                     return;
                  }
                  break;
               }

               int var12 = var6 & 240;
               int var8;
               int var9;
               int var10;
               if(var12 == 176) {
                  var9 = var6 & 15;
                  var8 = var6 >> 8 & 127;
                  var10 = var6 >> 16 & 127;
                  if(var8 == 0) {
                     var1[var9] = (var1[var9] & -2080769) + (var10 << 14);
                  }

                  if(var8 == 32) {
                     var1[var9] = (var1[var9] & -16257) + (var10 << 7);
                  }
               }

               if(var12 == 192) {
                  var9 = var6 & 15;
                  var8 = var6 >> 8 & 127;
                  var5[var9] = var1[var9] + var8;
               }

               if(var12 == 144) {
                  var9 = var6 & 15;
                  var8 = var6 >> 8 & 127;
                  var10 = var6 >> 16 & 127;
                  if(var10 > 0) {
                     int var14 = var5[var9];
                     Class108_Sub18 var13 = (Class108_Sub18)this.aClass101_1928.get((long) var14);
                     if(var13 == null) {
                        var13 = new Class108_Sub18(new byte[128]);
                        this.aClass101_1928.put(var13, (long)var14);
                     }

                     var13.aByteArray1891[var8] = 1;
                  }
               }

               var3.method1218(var4);
               var3.method1245(var4);
            }
         }
      }
   }

   void method2003() {
      this.aClass101_1928 = null;
   }

   RSSong(RSByteBuffer buffer) {
      buffer.position = (buffer.buf.length - 3) * 537964811;
      int var6 = buffer.readUByte();
      int var5 = buffer.readUShort(548040148);
      int var7 = 14 + var6 * 10;
      buffer.position = 0;
      int var20 = 0;
      int var3 = 0;
      int var10 = 0;
      int var22 = 0;
      int var25 = 0;
      int var13 = 0;
      int var30 = 0;
      int var4 = 0;
      int var16 = 0;

      int var11;
      int var17;
      while(var16 < var6) {
         var11 = -1;

         while(true) {
            var17 = buffer.readUByte();
            if(var17 != var11) {
               ++var7;
            }

            var11 = var17 & 15;
            if(var17 == 7) {
               ++var16;
               break;
            }

            if(var17 == 23) {
               ++var20;
            } else if(var11 == 0) {
               ++var10;
            } else if(var11 == 1) {
               ++var22;
            } else if(var11 == 2) {
               ++var3;
            } else if(var11 == 3) {
               ++var25;
            } else if(var11 == 4) {
               ++var13;
            } else if(var11 == 5) {
               ++var30;
            } else {
               if(var11 != 6) {
                  throw new RuntimeException();
               }

               ++var4;
            }
         }
      }

      var7 += var20 * 5;
      var7 += (var10 + var22 + var3 + var25 + var30) * 2;
      var7 += var13 + var4;
      var16 = buffer.position * 798331555;
      var11 = var6 + var20 + var3 + var10 + var22 + var25 + var13 + var30 + var4;

      for(var17 = 0; var17 < var11; ++var17) {
         buffer.method1733(1365069437);
      }

      var7 += buffer.position * 798331555 - var16;
      var17 = buffer.position * 798331555;
      int var40 = 0;
      int var31 = 0;
      int var42 = 0;
      int var32 = 0;
      int var18 = 0;
      int var24 = 0;
      int var33 = 0;
      int var34 = 0;
      int var43 = 0;
      int var44 = 0;
      int var27 = 0;
      int var37 = 0;
      int var8 = 0;

      int var2;
      for(var2 = 0; var2 < var3; ++var2) {
         var8 = var8 + buffer.readUByte() & 127;
         if(var8 != 0 && var8 != 32) {
            if(var8 == 1) {
               ++var40;
            } else if(var8 == 33) {
               ++var31;
            } else if(var8 == 7) {
               ++var42;
            } else if(var8 == 39) {
               ++var32;
            } else if(var8 == 10) {
               ++var18;
            } else if(var8 == 42) {
               ++var24;
            } else if(var8 == 99) {
               ++var33;
            } else if(var8 == 98) {
               ++var34;
            } else if(var8 == 101) {
               ++var43;
            } else if(var8 == 100) {
               ++var44;
            } else if(var8 != 64 && var8 != 65 && var8 != 120 && var8 != 121 && var8 != 123) {
               ++var37;
            } else {
               ++var27;
            }
         } else {
            ++var4;
         }
      }

      var2 = 0;
      int var45 = buffer.position * 798331555;
      buffer.position += var27 * 537964811;
      int var48 = buffer.position * 798331555;
      buffer.position += var30 * 537964811;
      int var47 = buffer.position * 798331555;
      buffer.position += var13 * 537964811;
      int var49 = buffer.position * 798331555;
      buffer.position += var25 * 537964811;
      int var51 = buffer.position * 798331555;
      buffer.position += var40 * 537964811;
      int var52 = buffer.position * 798331555;
      buffer.position += var42 * 537964811;
      int var53 = buffer.position * 798331555;
      buffer.position += var18 * 537964811;
      int var54 = buffer.position * 798331555;
      buffer.position += (var10 + var22 + var30) * 537964811;
      int var60 = buffer.position * 798331555;
      buffer.position += var10 * 537964811;
      int var55 = buffer.position * 798331555;
      buffer.position += var37 * 537964811;
      int var26 = buffer.position * 798331555;
      buffer.position += var22 * 537964811;
      int var15 = buffer.position * 798331555;
      buffer.position += var31 * 537964811;
      int var56 = buffer.position * 798331555;
      buffer.position += var32 * 537964811;
      int var57 = buffer.position * 798331555;
      buffer.position += var24 * 537964811;
      int var46 = buffer.position * 798331555;
      buffer.position += var4 * 537964811;
      int var66 = buffer.position * 798331555;
      buffer.position += var25 * 537964811;
      int var28 = buffer.position * 798331555;
      buffer.position += var33 * 537964811;
      int var36 = buffer.position * 798331555;
      buffer.position += var34 * 537964811;
      int var58 = buffer.position * 798331555;
      buffer.position += var43 * 537964811;
      int var59 = buffer.position * 798331555;
      buffer.position += var44 * 537964811;
      int var41 = buffer.position * 798331555;
      buffer.position += var20 * 1613894433;
      this.aByteArray1929 = new byte[var7];
      RSByteBuffer var9 = new RSByteBuffer(this.aByteArray1929);
      var9.writeInt(1297377380);
      var9.writeInt(6);
      var9.writeShort(var6 > 1 ? 1 : 0);
      var9.writeShort(var6);
      var9.writeShort(var5);
      buffer.position = var16 * 537964811;
      int var38 = 0;
      int var21 = 0;
      int var61 = 0;
      int var35 = 0;
      int var29 = 0;
      int var62 = 0;
      int var12 = 0;
      int[] var19 = new int[128];
      var8 = 0;
      int var63 = 0;

      while(var63 < var6) {
         var9.writeInt(1297379947);
         var9.position -= 2143108052;
         int var64 = var9.position * 798331555;
         int var14 = -1;

         while(true) {
            int var65 = buffer.method1733(1387911994);
            var9.method1717(var65, 114148232);
            int var39 = buffer.buf[var2++] & 255;
            boolean var50 = var39 != var14;
            var14 = var39 & 15;
            if(var39 == 7) {
               if(var50) {
                  var9.writeByte(255);
               }

               var9.writeByte(47);
               var9.writeByte(0);
               var9.method1753(var9.position * 798331555 - var64, -1404345846);
               ++var63;
               break;
            }

            if(var39 == 23) {
               if(var50) {
                  var9.writeByte(255);
               }

               var9.writeByte(81);
               var9.writeByte(3);
               var9.writeByte(buffer.buf[var41++]);
               var9.writeByte(buffer.buf[var41++]);
               var9.writeByte(buffer.buf[var41++]);
            } else {
               var38 ^= var39 >> 4;
               if(var14 == 0) {
                  if(var50) {
                     var9.writeByte(144 + var38);
                  }

                  var21 += buffer.buf[var54++];
                  var61 += buffer.buf[var60++];
                  var9.writeByte(var21 & 127);
                  var9.writeByte(var61 & 127);
               } else if(var14 == 1) {
                  if(var50) {
                     var9.writeByte(128 + var38);
                  }

                  var21 += buffer.buf[var54++];
                  var35 += buffer.buf[var26++];
                  var9.writeByte(var21 & 127);
                  var9.writeByte(var35 & 127);
               } else if(var14 == 2) {
                  if(var50) {
                     var9.writeByte(176 + var38);
                  }

                  var8 = var8 + buffer.buf[var17++] & 127;
                  var9.writeByte(var8);
                  byte var23;
                  if(var8 != 0 && var8 != 32) {
                     if(var8 == 1) {
                        var23 = buffer.buf[var51++];
                     } else if(var8 == 33) {
                        var23 = buffer.buf[var15++];
                     } else if(var8 == 7) {
                        var23 = buffer.buf[var52++];
                     } else if(var8 == 39) {
                        var23 = buffer.buf[var56++];
                     } else if(var8 == 10) {
                        var23 = buffer.buf[var53++];
                     } else if(var8 == 42) {
                        var23 = buffer.buf[var57++];
                     } else if(var8 == 99) {
                        var23 = buffer.buf[var28++];
                     } else if(var8 == 98) {
                        var23 = buffer.buf[var36++];
                     } else if(var8 == 101) {
                        var23 = buffer.buf[var58++];
                     } else if(var8 == 100) {
                        var23 = buffer.buf[var59++];
                     } else if(var8 != 64 && var8 != 65 && var8 != 120 && var8 != 121 && var8 != 123) {
                        var23 = buffer.buf[var55++];
                     } else {
                        var23 = buffer.buf[var45++];
                     }
                  } else {
                     var23 = buffer.buf[var46++];
                  }

                  int var67 = var23 + var19[var8];
                  var19[var8] = var67;
                  var9.writeByte(var67 & 127);
               } else if(var14 == 3) {
                  if(var50) {
                     var9.writeByte(224 + var38);
                  }

                  var29 += buffer.buf[var66++];
                  var29 += buffer.buf[var49++] << 7;
                  var9.writeByte(var29 & 127);
                  var9.writeByte(var29 >> 7 & 127);
               } else if(var14 == 4) {
                  if(var50) {
                     var9.writeByte(208 + var38);
                  }

                  var62 += buffer.buf[var47++];
                  var9.writeByte(var62 & 127);
               } else if(var14 == 5) {
                  if(var50) {
                     var9.writeByte(160 + var38);
                  }

                  var21 += buffer.buf[var54++];
                  var12 += buffer.buf[var48++];
                  var9.writeByte(var21 & 127);
                  var9.writeByte(var12 & 127);
               } else {
                  if(var14 != 6) {
                     throw new RuntimeException();
                  }

                  if(var50) {
                     var9.writeByte(192 + var38);
                  }

                  var9.writeByte(buffer.buf[var46++]);
               }
            }
         }
      }

   }
}
