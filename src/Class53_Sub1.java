
public class Class53_Sub1 extends Timer {

   long[] aLongArray1702 = new long[10];
   int anInt1703 = 1398825216;
   long aLong1705 = getCurrentTimeMillis(849846164) * 7952023716220594927L;
   int anInt1706 = 0;
   int anInt1707;
   int anInt1709 = -1218258545;


   int method714(int var1, int var2, int var3) {
      int var4 = this.anInt1703 * -776518751;
      int var6 = this.anInt1709 * -1255266961;
      this.anInt1703 = -441126484;
      this.anInt1709 = -1218258545;
      this.aLong1705 = getCurrentTimeMillis(849846164) * 7952023716220594927L;
      if(0L == this.aLongArray1702[this.anInt1707 * 2084947525]) {
         this.anInt1703 = var4 * 55795809;
         this.anInt1709 = var6 * -1218258545;
      } else if(this.aLong1705 * 777363802254672911L > this.aLongArray1702[this.anInt1707 * 2084947525]) {
         this.anInt1703 = (int)((long)(var1 * 2560) / (this.aLong1705 * 777363802254672911L - this.aLongArray1702[this.anInt1707 * 2084947525])) * 55795809;
      }

      if(this.anInt1703 * -776518751 < 25) {
         this.anInt1703 = 1394895225;
      }

      if(this.anInt1703 * -776518751 > 256) {
         this.anInt1703 = 1398825216;
         this.anInt1709 = (int)((long)var1 - (this.aLong1705 * 777363802254672911L - this.aLongArray1702[this.anInt1707 * 2084947525]) / 10L) * -1218258545;
      }

      if(this.anInt1709 * -1255266961 > var1) {
         this.anInt1709 = var1 * -1218258545;
      }

      this.aLongArray1702[this.anInt1707 * 2084947525] = 777363802254672911L * this.aLong1705;
      this.anInt1707 = (1 + this.anInt1707 * 2084947525) % 10 * 2057133197;
      int var5;
      if(this.anInt1709 * -1255266961 > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if(0L != this.aLongArray1702[var5]) {
               this.aLongArray1702[var5] += (long)(this.anInt1709 * -1255266961);
            }
         }
      }

      if(this.anInt1709 * -1255266961 < var2) {
         this.anInt1709 = var2 * -1218258545;
      }

      Class108_Sub22.sleep((long) (this.anInt1709 * -1255266961));

      for(var5 = 0; this.anInt1706 * 583602573 < 256; this.anInt1706 += this.anInt1703 * 1422226277) {
         ++var5;
      }

      this.anInt1706 = (this.anInt1706 * 583602573 & 255) * -1026188987;
      return var5;
   }

   void method720(int var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         this.aLongArray1702[var2] = 0L;
      }

   }

   Class53_Sub1() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.aLongArray1702[var1] = this.aLong1705 * 777363802254672911L;
      }

   }

   static final void method1891(int plane, int localX, int localY, int objectID, int var4, int var5, Scene scene, CollisionMap collisionMap, short var8) {
      if(Client.lowMemory && (RegionReference.mapTileSettings[0][localX][localY] & 2) == 0) {
         if(0 != (RegionReference.mapTileSettings[plane][localX][localY] & 16)) {
            return;
         }

         int var10;
         if(0 != (RegionReference.mapTileSettings[plane][localX][localY] & 8)) {
            var10 = 0;
         } else if(plane > 0 && 0 != (RegionReference.mapTileSettings[1][localX][localY] & 2)) {
            var10 = plane - 1;
         } else {
            var10 = plane;
         }

         if(var10 != Client.anInt2890 * -158871381) {
            return;
         }
      }

      if(plane < RegionReference.anInt485 * -1362129233) {
         RegionReference.anInt485 = plane * -1850046385;
      }

      ObjectDefinition objectDef = ObjectDefinition.getObjectDefForID(objectID, (byte) 0);
      int var17;
      int var19;
      if(1 != var4 && 3 != var4) {
         var17 = objectDef.sizeX * 721302265;
         var19 = objectDef.sizeY * -1917144319;
      } else {
         var17 = objectDef.sizeY * -1917144319;
         var19 = objectDef.sizeX * 721302265;
      }

      int var20;
      int var21;
      if(localX + var17 <= 104) {
         var21 = localX + (var17 >> 1);
         var20 = (var17 + 1 >> 1) + localX;
      } else {
         var21 = localX;
         var20 = localX + 1;
      }

      int var22;
      int var23;
      if(var19 + localY <= 104) {
         var22 = (var19 >> 1) + localY;
         var23 = localY + (1 + var19 >> 1);
      } else {
         var22 = localY;
         var23 = localY + 1;
      }

      int[][] var12 = RegionReference.tileHeights[plane];
      int var14 = var12[var20][var22] + var12[var21][var22] + var12[var21][var23] + var12[var20][var23] >> 2;
      int var13 = (var17 << 6) + (localX << 7);
      int var15 = (var19 << 6) + (localY << 7);
      int var16 = 1073741824 + (localY << 7) + localX + (objectID << 14);
      if(objectDef.anInt2088 * 619772583 == 0) {
         var16 += Integer.MIN_VALUE;
      }

      int var24 = var5 + (var4 << 6);
      if(objectDef.anInt2106 * -1988445921 == 1) {
         var24 += 256;
      }

      if(objectDef.method2206()) {
         Class32.method575(plane, localX, localY, objectDef, var4, 1297756197);
      }

      Object var9;
      if(22 == var5) {
         if(!Client.lowMemory || objectDef.anInt2088 * 619772583 != 0 || 1 == objectDef.anInt2094 * 795821915 || objectDef.aBool2104) {
            if(objectDef.animationID * -2061255559 == -1 && objectDef.configChangeDest == null) {
               var9 = objectDef.method2179(22, var4, var12, var13, var14, var15, (byte)-42);
            } else {
               var9 = new GameObject(objectID, 22, var4, plane, localX, localY, objectDef.animationID * -2061255559, true, (Renderable)null);
            }

            scene.method407(plane, localX, localY, var14, (Renderable)var9, var16, var24);
            if(1 == objectDef.anInt2094 * 795821915) {
               if(null != collisionMap) {
                  collisionMap.method1409(localX, localY, 183213884);
               }
            }
         }
      } else {
         int var25;
         if(var5 != 10 && 11 != var5) {
            if(var5 >= 12) {
               if(-1 == objectDef.animationID * -2061255559 && null == objectDef.configChangeDest) {
                  var9 = objectDef.method2179(var5, var4, var12, var13, var14, var15, (byte)-9);
               } else {
                  var9 = new GameObject(objectID, var5, var4, plane, localX, localY, objectDef.animationID * -2061255559, true, (Renderable)null);
               }

               scene.method411(plane, localX, localY, var14, 1, 1, (Renderable)var9, 0, var16, var24);
               if(var5 >= 12 && var5 <= 17 && var5 != 13 && plane > 0) {
                  Class19.tileCullingBitset[plane][localX][localY] |= 2340;
               }

               if(objectDef.anInt2094 * 795821915 != 0) {
                  if(collisionMap != null) {
                     collisionMap.method1404(localX, localY, var17, var19, objectDef.aBool2114, 527456735);
                  }
               }
            } else if(0 == var5) {
               if(-1 == objectDef.animationID * -2061255559 && null == objectDef.configChangeDest) {
                  var9 = objectDef.method2179(0, var4, var12, var13, var14, var15, (byte)-19);
               } else {
                  var9 = new GameObject(objectID, 0, var4, plane, localX, localY, objectDef.animationID * -2061255559, true, (Renderable)null);
               }

               scene.method409(plane, localX, localY, var14, (Renderable)var9, (Renderable)null, RegionReference.anIntArray491[var4], 0, var16, var24);
               if(0 == var4) {
                  if(objectDef.aBool2097) {
                     RegionReference.aByteArrayArrayArray488[plane][localX][localY] = 50;
                     RegionReference.aByteArrayArrayArray488[plane][localX][localY + 1] = 50;
                  }

                  if(objectDef.aBool2111) {
                     Class19.tileCullingBitset[plane][localX][localY] |= 585;
                  }
               } else if(1 == var4) {
                  if(objectDef.aBool2097) {
                     RegionReference.aByteArrayArrayArray488[plane][localX][1 + localY] = 50;
                     RegionReference.aByteArrayArrayArray488[plane][1 + localX][localY + 1] = 50;
                  }

                  if(objectDef.aBool2111) {
                     Class19.tileCullingBitset[plane][localX][1 + localY] |= 1170;
                  }
               } else if(2 == var4) {
                  if(objectDef.aBool2097) {
                     RegionReference.aByteArrayArrayArray488[plane][localX + 1][localY] = 50;
                     RegionReference.aByteArrayArrayArray488[plane][1 + localX][localY + 1] = 50;
                  }

                  if(objectDef.aBool2111) {
                     Class19.tileCullingBitset[plane][localX + 1][localY] |= 585;
                  }
               } else if(3 == var4) {
                  if(objectDef.aBool2097) {
                     RegionReference.aByteArrayArrayArray488[plane][localX][localY] = 50;
                     RegionReference.aByteArrayArrayArray488[plane][localX + 1][localY] = 50;
                  }

                  if(objectDef.aBool2111) {
                     Class19.tileCullingBitset[plane][localX][localY] |= 1170;
                  }
               }

               if(0 != objectDef.anInt2094 * 795821915 && null != collisionMap) {
                  collisionMap.method1403(localX, localY, var5, var4, objectDef.aBool2114, -2050926990);
               }

               if(16 != objectDef.anInt2069 * -225839219) {
                  scene.method491(plane, localX, localY, objectDef.anInt2069 * -225839219);
               }
            } else if(1 == var5) {
               if(objectDef.animationID * -2061255559 == -1 && null == objectDef.configChangeDest) {
                  var9 = objectDef.method2179(1, var4, var12, var13, var14, var15, (byte)-53);
               } else {
                  var9 = new GameObject(objectID, 1, var4, plane, localX, localY, objectDef.animationID * -2061255559, true, (Renderable)null);
               }

               scene.method409(plane, localX, localY, var14, (Renderable)var9, (Renderable)null, RegionReference.anIntArray483[var4], 0, var16, var24);
               if(objectDef.aBool2097) {
                  if(var4 == 0) {
                     RegionReference.aByteArrayArrayArray488[plane][localX][1 + localY] = 50;
                  } else if(var4 == 1) {
                     RegionReference.aByteArrayArrayArray488[plane][1 + localX][localY + 1] = 50;
                  } else if(var4 == 2) {
                     RegionReference.aByteArrayArrayArray488[plane][1 + localX][localY] = 50;
                  } else if(3 == var4) {
                     RegionReference.aByteArrayArrayArray488[plane][localX][localY] = 50;
                  }
               }

               if(0 != objectDef.anInt2094 * 795821915) {
                  if(collisionMap != null) {
                     collisionMap.method1403(localX, localY, var5, var4, objectDef.aBool2114, -2050926990);
                  }
               }
            } else {
               int var27;
               Object var29;
               if(var5 == 2) {
                  var27 = var4 + 1 & 3;
                  Object var31;
                  if(-1 == objectDef.animationID * -2061255559 && null == objectDef.configChangeDest) {
                     var31 = objectDef.method2179(2, 4 + var4, var12, var13, var14, var15, (byte)19);
                     var29 = objectDef.method2179(2, var27, var12, var13, var14, var15, (byte)29);
                  } else {
                     var31 = new GameObject(objectID, 2, var4 + 4, plane, localX, localY, objectDef.animationID * -2061255559, true, (Renderable)null);
                     var29 = new GameObject(objectID, 2, var27, plane, localX, localY, objectDef.animationID * -2061255559, true, (Renderable)null);
                  }

                  scene.method409(plane, localX, localY, var14, (Renderable)var31, (Renderable)var29, RegionReference.anIntArray491[var4], RegionReference.anIntArray491[var27], var16, var24);
                  if(objectDef.aBool2111) {
                     if(0 == var4) {
                        Class19.tileCullingBitset[plane][localX][localY] |= 585;
                        Class19.tileCullingBitset[plane][localX][1 + localY] |= 1170;
                     } else if(var4 == 1) {
                        Class19.tileCullingBitset[plane][localX][localY + 1] |= 1170;
                        Class19.tileCullingBitset[plane][localX + 1][localY] |= 585;
                     } else if(2 == var4) {
                        Class19.tileCullingBitset[plane][localX + 1][localY] |= 585;
                        Class19.tileCullingBitset[plane][localX][localY] |= 1170;
                     } else if(var4 == 3) {
                        Class19.tileCullingBitset[plane][localX][localY] |= 1170;
                        Class19.tileCullingBitset[plane][localX][localY] |= 585;
                     }
                  }

                  if(objectDef.anInt2094 * 795821915 != 0 && collisionMap != null) {
                     collisionMap.method1403(localX, localY, var5, var4, objectDef.aBool2114, -2050926990);
                  }

                  if(16 != objectDef.anInt2069 * -225839219) {
                     scene.method491(plane, localX, localY, objectDef.anInt2069 * -225839219);
                  }
               } else if(3 == var5) {
                  if(objectDef.animationID * -2061255559 == -1 && objectDef.configChangeDest == null) {
                     var9 = objectDef.method2179(3, var4, var12, var13, var14, var15, (byte)-44);
                  } else {
                     var9 = new GameObject(objectID, 3, var4, plane, localX, localY, objectDef.animationID * -2061255559, true, (Renderable)null);
                  }

                  scene.method409(plane, localX, localY, var14, (Renderable)var9, (Renderable)null, RegionReference.anIntArray483[var4], 0, var16, var24);
                  if(objectDef.aBool2097) {
                     if(0 == var4) {
                        RegionReference.aByteArrayArrayArray488[plane][localX][1 + localY] = 50;
                     } else if(var4 == 1) {
                        RegionReference.aByteArrayArrayArray488[plane][1 + localX][1 + localY] = 50;
                     } else if(var4 == 2) {
                        RegionReference.aByteArrayArrayArray488[plane][1 + localX][localY] = 50;
                     } else if(3 == var4) {
                        RegionReference.aByteArrayArrayArray488[plane][localX][localY] = 50;
                     }
                  }

                  if(objectDef.anInt2094 * 795821915 != 0) {
                     if(collisionMap != null) {
                        collisionMap.method1403(localX, localY, var5, var4, objectDef.aBool2114, -2050926990);
                     }
                  }
               } else if(var5 == 9) {
                  if(objectDef.animationID * -2061255559 == -1 && null == objectDef.configChangeDest) {
                     var9 = objectDef.method2179(var5, var4, var12, var13, var14, var15, (byte)-17);
                  } else {
                     var9 = new GameObject(objectID, var5, var4, plane, localX, localY, objectDef.animationID * -2061255559, true, (Renderable)null);
                  }

                  scene.method411(plane, localX, localY, var14, 1, 1, (Renderable)var9, 0, var16, var24);
                  if(0 != objectDef.anInt2094 * 795821915 && collisionMap != null) {
                     collisionMap.method1404(localX, localY, var17, var19, objectDef.aBool2114, 1266257088);
                  }

                  if(16 != objectDef.anInt2069 * -225839219) {
                     scene.method491(plane, localX, localY, objectDef.anInt2069 * -225839219);
                  }
               } else if(4 == var5) {
                  if(objectDef.animationID * -2061255559 == -1 && objectDef.configChangeDest == null) {
                     var9 = objectDef.method2179(4, var4, var12, var13, var14, var15, (byte)14);
                  } else {
                     var9 = new GameObject(objectID, 4, var4, plane, localX, localY, objectDef.animationID * -2061255559, true, (Renderable)null);
                  }

                  scene.method410(plane, localX, localY, var14, (Renderable)var9, (Renderable)null, RegionReference.anIntArray491[var4], 0, 0, 0, var16, var24);
               } else if(var5 == 5) {
                  var27 = 16;
                  var25 = scene.fetchWallObjectHash(plane, localX, localY);
                  if(var25 != 0) {
                     var27 = ObjectDefinition.getObjectDefForID(var25 >> 14 & 32767, (byte) 0).anInt2069 * -225839219;
                  }

                  if(-1 == objectDef.animationID * -2061255559 && null == objectDef.configChangeDest) {
                     var29 = objectDef.method2179(4, var4, var12, var13, var14, var15, (byte)98);
                  } else {
                     var29 = new GameObject(objectID, 4, var4, plane, localX, localY, objectDef.animationID * -2061255559, true, (Renderable)null);
                  }

                  scene.method410(plane, localX, localY, var14, (Renderable)var29, (Renderable)null, RegionReference.anIntArray491[var4], 0, RegionReference.anIntArray493[var4] * var27, RegionReference.anIntArray494[var4] * var27, var16, var24);
               } else if(var5 == 6) {
                  var27 = 8;
                  var25 = scene.fetchWallObjectHash(plane, localX, localY);
                  if(var25 != 0) {
                     var27 = ObjectDefinition.getObjectDefForID(var25 >> 14 & 32767, (byte) 0).anInt2069 * -225839219 / 2;
                  }

                  if(objectDef.animationID * -2061255559 == -1 && null == objectDef.configChangeDest) {
                     var29 = objectDef.method2179(4, 4 + var4, var12, var13, var14, var15, (byte)92);
                  } else {
                     var29 = new GameObject(objectID, 4, 4 + var4, plane, localX, localY, objectDef.animationID * -2061255559, true, (Renderable)null);
                  }

                  scene.method410(plane, localX, localY, var14, (Renderable)var29, (Renderable)null, 256, var4, var27 * RegionReference.anIntArray492[var4], RegionReference.anIntArray496[var4] * var27, var16, var24);
               } else if(7 == var5) {
                  var25 = var4 + 2 & 3;
                  if(objectDef.animationID * -2061255559 == -1 && null == objectDef.configChangeDest) {
                     var9 = objectDef.method2179(4, 4 + var25, var12, var13, var14, var15, (byte)17);
                  } else {
                     var9 = new GameObject(objectID, 4, 4 + var25, plane, localX, localY, objectDef.animationID * -2061255559, true, (Renderable)null);
                  }

                  scene.method410(plane, localX, localY, var14, (Renderable)var9, (Renderable)null, 256, var25, 0, 0, var16, var24);
               } else if(8 == var5) {
                  var27 = 8;
                  var25 = scene.fetchWallObjectHash(plane, localX, localY);
                  if(var25 != 0) {
                     var27 = ObjectDefinition.getObjectDefForID(var25 >> 14 & 32767, (byte) 0).anInt2069 * -225839219 / 2;
                  }

                  int var26 = var4 + 2 & 3;
                  Object var30;
                  if(objectDef.animationID * -2061255559 == -1 && objectDef.configChangeDest == null) {
                     var29 = objectDef.method2179(4, 4 + var4, var12, var13, var14, var15, (byte)4);
                     var30 = objectDef.method2179(4, var26 + 4, var12, var13, var14, var15, (byte)-65);
                  } else {
                     var29 = new GameObject(objectID, 4, 4 + var4, plane, localX, localY, objectDef.animationID * -2061255559, true, (Renderable)null);
                     var30 = new GameObject(objectID, 4, var26 + 4, plane, localX, localY, objectDef.animationID * -2061255559, true, (Renderable)null);
                  }

                  scene.method410(plane, localX, localY, var14, (Renderable)var29, (Renderable)var30, 256, var4, RegionReference.anIntArray492[var4] * var27, RegionReference.anIntArray496[var4] * var27, var16, var24);
               }
            }
         } else {
            if(objectDef.animationID * -2061255559 == -1 && objectDef.configChangeDest == null) {
               var9 = objectDef.method2179(10, var4, var12, var13, var14, var15, (byte)-78);
            } else {
               var9 = new GameObject(objectID, 10, var4, plane, localX, localY, objectDef.animationID * -2061255559, true, (Renderable)null);
            }

            if(null != var9 && scene.method411(plane, localX, localY, var14, var17, var19, (Renderable)var9, var5 == 11?256:0, var16, var24) && objectDef.aBool2097) {
               var25 = 15;
               if(var9 instanceof ModelRasterizer) {
                  var25 = ((ModelRasterizer)var9).method2857() / 4;
                  if(var25 > 30) {
                     var25 = 30;
                  }
               }

               for(int var11 = 0; var11 <= var17; ++var11) {
                  for(int var18 = 0; var18 <= var19; ++var18) {
                     if(var25 > RegionReference.aByteArrayArrayArray488[plane][localX + var11][var18 + localY]) {
                        RegionReference.aByteArrayArrayArray488[plane][var11 + localX][localY + var18] = (byte)var25;
                     }
                  }
               }
            }

            if(0 != objectDef.anInt2094 * 795821915) {
               if(collisionMap != null) {
                  collisionMap.method1404(localX, localY, var17, var19, objectDef.aBool2114, 782148817);
               }
            }
         }
      }
   }
}
