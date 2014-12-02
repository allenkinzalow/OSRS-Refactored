
public class RSModel extends Renderable {

   short[] texTriangleX;
   int[] vertexX;
   byte[] faceRenderPriorities;
   int[] vertexY;
   int triangleFaceCount = 0;
   int[] trianglePointsX;
   int[] anIntArray2560;
   int[] trianglePointsZ;
   int anInt2562;
   int[] trianglePointsY;
   byte[] faceAlphas;
   public short aShort2565;
   byte[] faceRenderType;
   short[] aShortArray2567;
   byte aByte2568 = 0;
   int anInt2569;
   byte[] aByteArray2570;
   short[] texTriangleY;
   static int[] anIntArray2572 = Rasterizer3D.SINE;
   short[] texTriangleZ;
   short[] aShortArray2574;
   short[] aShortArray2575;
   static int anInt2576 = 0;
   short[] aShortArray2577;
   short[] aShortArray2578;
   boolean aBool2579 = false;
   byte[] aByteArray2580;
   byte[] aByteArray2581;
   int[] anIntArray2582;
   int[][] anIntArrayArray2583;
   int[][] anIntArrayArray2584;
   Class16[] aClass16Array2585;
   short[] aShortArray2586;
   VertexNormal[] aClass49Array2587;
   VertexNormal[] vertexNormalArray;
   public short aShort2589;
   short[] aShortArray2590;
   int shadowIntensity;
   int anInt2592;
   int anInt2593;
   int[] vertexZ;
   int anInt2595;
   static int[] anIntArray2596 = new int[10000];
   static int[] anIntArray2597 = new int[10000];
   int vertexCount = 0;
   short[] aShortArray2599;
   static int[] anIntArray2600 = Rasterizer3D.COSINE;


   static final int method2990(int var0) {
      if(var0 < 2) {
         var0 = 2;
      } else if(var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   public static RSModel decodeModel(AbstractIndex var0, int var1, int var2) {
      byte[] var3 = var0.getFile(var1, var2, (byte) 7);
      return var3 != null?new RSModel(var3):null;
   }

   RSModel(byte[] var1) {
      if(var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method2992(var1);
      } else {
         this.method2993(var1);
      }
   }

   void method2992(byte[] var1) {
      RSByteBuffer var2 = new RSByteBuffer(var1);
      RSByteBuffer var24 = new RSByteBuffer(var1);
      RSByteBuffer var3 = new RSByteBuffer(var1);
      RSByteBuffer var28 = new RSByteBuffer(var1);
      RSByteBuffer var6 = new RSByteBuffer(var1);
      RSByteBuffer var55 = new RSByteBuffer(var1);
      RSByteBuffer var51 = new RSByteBuffer(var1);
      var2.position = (var1.length - 23) * 537964811;
      int verticeCount = var2.readUShort(1109906502);
      int triangleCount = var2.readUShort(2143709516);
      int textureTriangleCount = var2.readUByte();
      int var13 = var2.readUByte();
      int var32 = var2.readUByte();
      int var50 = var2.readUByte();
      int var17 = var2.readUByte();
      int var18 = var2.readUByte();
      int var19 = var2.readUByte();
      int var20 = var2.readUShort(-362432543);
      int var21 = var2.readUShort(606911415);
      int var42 = var2.readUShort(-604351495);
      int var22 = var2.readUShort(-2085977155);
      int var38 = var2.readUShort(967973759);
      int var23 = 0;
      int var7 = 0;
      int var29 = 0;
      int var4;
      if(textureTriangleCount > 0) {
         this.aByteArray2570 = new byte[textureTriangleCount];
         var2.position = 0;

         for(var4 = 0; var4 < textureTriangleCount; ++var4) {
            byte var26 = this.aByteArray2570[var4] = var2.readByte();
            if(var26 == 0) {
               ++var23;
            }

            if(var26 >= 1 && var26 <= 3) {
               ++var7;
            }

            if(var26 == 2) {
               ++var29;
            }
         }
      }

      var4 = textureTriangleCount + verticeCount;
      int var31 = var4;
      if(var13 == 1) {
         var4 += triangleCount;
      }

      int var49 = var4;
      var4 += triangleCount;
      int var33 = var4;
      if(var32 == 255) {
         var4 += triangleCount;
      }

      int var27 = var4;
      if(var17 == 1) {
         var4 += triangleCount;
      }

      int var35 = var4;
      if(var19 == 1) {
         var4 += verticeCount;
      }

      int var36 = var4;
      if(var50 == 1) {
         var4 += triangleCount;
      }

      int var11 = var4;
      var4 += var22;
      int var44 = var4;
      if(var18 == 1) {
         var4 += triangleCount * 2;
      }

      int var52 = var4;
      var4 += var38;
      int var39 = var4;
      var4 += triangleCount * 2;
      int var40 = var4;
      var4 += var20;
      int var41 = var4;
      var4 += var21;
      int var8 = var4;
      var4 += var42;
      int var43 = var4;
      var4 += var23 * 6;
      int var37 = var4;
      var4 += var7 * 6;
      int var48 = var4;
      var4 += var7 * 6;
      int var56 = var4;
      var4 += var7 * 2;
      int var45 = var4;
      var4 += var7;
      int var46 = var4;
      var4 += var7 * 2 + var29 * 2;
      this.vertexCount = verticeCount;
      this.triangleFaceCount = triangleCount;
      this.anInt2569 = textureTriangleCount;
      this.vertexX = new int[verticeCount];
      this.vertexY = new int[verticeCount];
      this.vertexZ = new int[verticeCount];
      this.trianglePointsX = new int[triangleCount];
      this.trianglePointsY = new int[triangleCount];
      this.trianglePointsZ = new int[triangleCount];
      if(var19 == 1) {
         this.anIntArray2560 = new int[verticeCount];
      }

      if(var13 == 1) {
         this.faceRenderType = new byte[triangleCount];
      }

      if(var32 == 255) {
         this.faceRenderPriorities = new byte[triangleCount];
      } else {
         this.aByte2568 = (byte)var32;
      }

      if(var50 == 1) {
         this.faceAlphas = new byte[triangleCount];
      }

      if(var17 == 1) {
         this.anIntArray2582 = new int[triangleCount];
      }

      if(var18 == 1) {
         this.aShortArray2567 = new short[triangleCount];
      }

      if(var18 == 1 && textureTriangleCount > 0) {
         this.aByteArray2581 = new byte[triangleCount];
      }

      this.aShortArray2590 = new short[triangleCount];
      if(textureTriangleCount > 0) {
         this.texTriangleX = new short[textureTriangleCount];
         this.texTriangleY = new short[textureTriangleCount];
         this.texTriangleZ = new short[textureTriangleCount];
         if(var7 > 0) {
            this.aShortArray2574 = new short[var7];
            this.aShortArray2575 = new short[var7];
            this.aShortArray2586 = new short[var7];
            this.aShortArray2577 = new short[var7];
            this.aByteArray2580 = new byte[var7];
            this.aShortArray2578 = new short[var7];
         }

         if(var29 > 0) {
            this.aShortArray2599 = new short[var29];
         }
      }

      var2.position = textureTriangleCount * 537964811;
      var24.position = var40 * 537964811;
      var3.position = var41 * 537964811;
      var28.position = var8 * 537964811;
      var6.position = var35 * 537964811;
      int var53 = 0;
      int var54 = 0;
      int var34 = 0;

      int var9;
      int var10;
      int var14;
      int var15;
      int var25;
      for(var25 = 0; var25 < verticeCount; ++var25) {
         var10 = var2.readUByte();
         var15 = 0;
         if((var10 & 1) != 0) {
            var15 = var24.method1746(1113333989);
         }

         var14 = 0;
         if((var10 & 2) != 0) {
            var14 = var3.method1746(1113333989);
         }

         var9 = 0;
         if((var10 & 4) != 0) {
            var9 = var28.method1746(1113333989);
         }

         this.vertexX[var25] = var53 + var15;
         this.vertexY[var25] = var54 + var14;
         this.vertexZ[var25] = var34 + var9;
         var53 = this.vertexX[var25];
         var54 = this.vertexY[var25];
         var34 = this.vertexZ[var25];
         if(var19 == 1) {
            this.anIntArray2560[var25] = var6.readUByte();
         }
      }

      var2.position = var39 * 537964811;
      var24.position = var31 * 537964811;
      var3.position = var33 * 537964811;
      var28.position = var36 * 537964811;
      var6.position = var27 * 537964811;
      var55.position = var44 * 537964811;
      var51.position = var52 * 537964811;

      for(var25 = 0; var25 < triangleCount; ++var25) {
         this.aShortArray2590[var25] = (short)var2.readUShort(-1731836965);
         if(var13 == 1) {
            this.faceRenderType[var25] = var24.readByte();
         }

         if(var32 == 255) {
            this.faceRenderPriorities[var25] = var3.readByte();
         }

         if(var50 == 1) {
            this.faceAlphas[var25] = var28.readByte();
         }

         if(var17 == 1) {
            this.anIntArray2582[var25] = var6.readUByte();
         }

         if(var18 == 1) {
            this.aShortArray2567[var25] = (short)(var55.readUShort(1555000976) - 1);
         }

         if(this.aByteArray2581 != null && this.aShortArray2567[var25] != -1) {
            this.aByteArray2581[var25] = (byte)(var51.readUByte() - 1);
         }
      }

      var2.position = var11 * 537964811;
      var24.position = var49 * 537964811;
      var25 = 0;
      var10 = 0;
      var15 = 0;
      var14 = 0;

      int var16;
      for(var9 = 0; var9 < triangleCount; ++var9) {
         var16 = var24.readUByte();
         if(var16 == 1) {
            var25 = var2.method1746(1113333989) + var14;
            var10 = var2.method1746(1113333989) + var25;
            var15 = var2.method1746(1113333989) + var10;
            var14 = var15;
            this.trianglePointsX[var9] = var25;
            this.trianglePointsY[var9] = var10;
            this.trianglePointsZ[var9] = var15;
         }

         if(var16 == 2) {
            var10 = var15;
            var15 = var2.method1746(1113333989) + var14;
            var14 = var15;
            this.trianglePointsX[var9] = var25;
            this.trianglePointsY[var9] = var10;
            this.trianglePointsZ[var9] = var15;
         }

         if(var16 == 3) {
            var25 = var15;
            var15 = var2.method1746(1113333989) + var14;
            var14 = var15;
            this.trianglePointsX[var9] = var25;
            this.trianglePointsY[var9] = var10;
            this.trianglePointsZ[var9] = var15;
         }

         if(var16 == 4) {
            int var57 = var25;
            var25 = var10;
            var10 = var57;
            var15 = var2.method1746(1113333989) + var14;
            var14 = var15;
            this.trianglePointsX[var9] = var25;
            this.trianglePointsY[var9] = var57;
            this.trianglePointsZ[var9] = var15;
         }
      }

      var2.position = var43 * 537964811;
      var24.position = var37 * 537964811;
      var3.position = var48 * 537964811;
      var28.position = var56 * 537964811;
      var6.position = var45 * 537964811;
      var55.position = var46 * 537964811;

      for(var9 = 0; var9 < textureTriangleCount; ++var9) {
         var16 = this.aByteArray2570[var9] & 255;
         if(var16 == 0) {
            this.texTriangleX[var9] = (short)var2.readUShort(-1754757119);
            this.texTriangleY[var9] = (short)var2.readUShort(-880205756);
            this.texTriangleZ[var9] = (short)var2.readUShort(-409278489);
         }

         if(var16 == 1) {
            this.texTriangleX[var9] = (short)var24.readUShort(-1497790075);
            this.texTriangleY[var9] = (short)var24.readUShort(1137892950);
            this.texTriangleZ[var9] = (short)var24.readUShort(-4589358);
            this.aShortArray2574[var9] = (short)var3.readUShort(-1282357887);
            this.aShortArray2575[var9] = (short)var3.readUShort(-1206694111);
            this.aShortArray2586[var9] = (short)var3.readUShort(-1118812085);
            this.aShortArray2577[var9] = (short)var28.readUShort(527014301);
            this.aByteArray2580[var9] = var6.readByte();
            this.aShortArray2578[var9] = (short)var55.readUShort(-1689479008);
         }

         if(var16 == 2) {
            this.texTriangleX[var9] = (short)var24.readUShort(-535463807);
            this.texTriangleY[var9] = (short)var24.readUShort(309312190);
            this.texTriangleZ[var9] = (short)var24.readUShort(-29678875);
            this.aShortArray2574[var9] = (short)var3.readUShort(-1494665846);
            this.aShortArray2575[var9] = (short)var3.readUShort(-1434724466);
            this.aShortArray2586[var9] = (short)var3.readUShort(-2091026467);
            this.aShortArray2577[var9] = (short)var28.readUShort(744196798);
            this.aByteArray2580[var9] = var6.readByte();
            this.aShortArray2578[var9] = (short)var55.readUShort(56902358);
            this.aShortArray2599[var9] = (short)var55.readUShort(-1102995196);
         }

         if(var16 == 3) {
            this.texTriangleX[var9] = (short)var24.readUShort(1159817512);
            this.texTriangleY[var9] = (short)var24.readUShort(983074570);
            this.texTriangleZ[var9] = (short)var24.readUShort(-1792527509);
            this.aShortArray2574[var9] = (short)var3.readUShort(469562987);
            this.aShortArray2575[var9] = (short)var3.readUShort(1754184044);
            this.aShortArray2586[var9] = (short)var3.readUShort(-1901414532);
            this.aShortArray2577[var9] = (short)var28.readUShort(-1340374914);
            this.aByteArray2580[var9] = var6.readByte();
            this.aShortArray2578[var9] = (short)var55.readUShort(-194924513);
         }
      }

      var2.position = var4 * 537964811;
      var9 = var2.readUByte();
      if(var9 != 0) {
         new Class41();
         var2.readUShort(-1311985976);
         var2.readUShort(-488960106);
         var2.readUShort(-1466096745);
         var2.readInt();
      }
   }

   void method2993(byte[] var1) {
      boolean var2 = false;
      boolean var43 = false;
      RSByteBuffer var5 = new RSByteBuffer(var1);
      RSByteBuffer var39 = new RSByteBuffer(var1);
      RSByteBuffer var26 = new RSByteBuffer(var1);
      RSByteBuffer var9 = new RSByteBuffer(var1);
      RSByteBuffer var3 = new RSByteBuffer(var1);
      var5.position = (var1.length - 18) * 537964811;
      int var10 = var5.readUShort(-1131190452);
      int var11 = var5.readUShort(-496974677);
      int var12 = var5.readUByte();
      int var13 = var5.readUByte();
      int var14 = var5.readUByte();
      int var30 = var5.readUByte();
      int var15 = var5.readUByte();
      int var28 = var5.readUByte();
      int var27 = var5.readUShort(-919895893);
      int var20 = var5.readUShort(-170504053);
      int var36 = var5.readUShort(854507498);
      int var23 = var5.readUShort(1285686739);
      byte var16 = 0;
      int var46 = var16 + var10;
      int var24 = var46;
      var46 += var11;
      int var25 = var46;
      if(var14 == 255) {
         var46 += var11;
      }

      int var4 = var46;
      if(var15 == 1) {
         var46 += var11;
      }

      int var42 = var46;
      if(var13 == 1) {
         var46 += var11;
      }

      int var37 = var46;
      if(var28 == 1) {
         var46 += var10;
      }

      int var29 = var46;
      if(var30 == 1) {
         var46 += var11;
      }

      int var44 = var46;
      var46 += var23;
      int var17 = var46;
      var46 += var11 * 2;
      int var32 = var46;
      var46 += var12 * 6;
      int var34 = var46;
      var46 += var27;
      int var35 = var46;
      var46 += var20;
      int var10000 = var46 + var36;
      this.vertexCount = var10;
      this.triangleFaceCount = var11;
      this.anInt2569 = var12;
      this.vertexX = new int[var10];
      this.vertexY = new int[var10];
      this.vertexZ = new int[var10];
      this.trianglePointsX = new int[var11];
      this.trianglePointsY = new int[var11];
      this.trianglePointsZ = new int[var11];
      if(var12 > 0) {
         this.aByteArray2570 = new byte[var12];
         this.texTriangleX = new short[var12];
         this.texTriangleY = new short[var12];
         this.texTriangleZ = new short[var12];
      }

      if(var28 == 1) {
         this.anIntArray2560 = new int[var10];
      }

      if(var13 == 1) {
         this.faceRenderType = new byte[var11];
         this.aByteArray2581 = new byte[var11];
         this.aShortArray2567 = new short[var11];
      }

      if(var14 == 255) {
         this.faceRenderPriorities = new byte[var11];
      } else {
         this.aByte2568 = (byte)var14;
      }

      if(var30 == 1) {
         this.faceAlphas = new byte[var11];
      }

      if(var15 == 1) {
         this.anIntArray2582 = new int[var11];
      }

      this.aShortArray2590 = new short[var11];
      var5.position = var16 * 537964811;
      var39.position = var34 * 537964811;
      var26.position = var35 * 537964811;
      var9.position = var46 * 537964811;
      var3.position = var37 * 537964811;
      int var41 = 0;
      int var33 = 0;
      int var19 = 0;

      int var6;
      int var7;
      int var8;
      int var18;
      int var31;
      for(var18 = 0; var18 < var10; ++var18) {
         var8 = var5.readUByte();
         var31 = 0;
         if((var8 & 1) != 0) {
            var31 = var39.method1746(1113333989);
         }

         var6 = 0;
         if((var8 & 2) != 0) {
            var6 = var26.method1746(1113333989);
         }

         var7 = 0;
         if((var8 & 4) != 0) {
            var7 = var9.method1746(1113333989);
         }

         this.vertexX[var18] = var41 + var31;
         this.vertexY[var18] = var33 + var6;
         this.vertexZ[var18] = var19 + var7;
         var41 = this.vertexX[var18];
         var33 = this.vertexY[var18];
         var19 = this.vertexZ[var18];
         if(var28 == 1) {
            this.anIntArray2560[var18] = var3.readUByte();
         }
      }

      var5.position = var17 * 537964811;
      var39.position = var42 * 537964811;
      var26.position = var25 * 537964811;
      var9.position = var29 * 537964811;
      var3.position = var4 * 537964811;

      for(var18 = 0; var18 < var11; ++var18) {
         this.aShortArray2590[var18] = (short)var5.readUShort(1730864093);
         if(var13 == 1) {
            var8 = var39.readUByte();
            if((var8 & 1) == 1) {
               this.faceRenderType[var18] = 1;
               var2 = true;
            } else {
               this.faceRenderType[var18] = 0;
            }

            if((var8 & 2) == 2) {
               this.aByteArray2581[var18] = (byte)(var8 >> 2);
               this.aShortArray2567[var18] = this.aShortArray2590[var18];
               this.aShortArray2590[var18] = 127;
               if(this.aShortArray2567[var18] != -1) {
                  var43 = true;
               }
            } else {
               this.aByteArray2581[var18] = -1;
               this.aShortArray2567[var18] = -1;
            }
         }

         if(var14 == 255) {
            this.faceRenderPriorities[var18] = var26.readByte();
         }

         if(var30 == 1) {
            this.faceAlphas[var18] = var9.readByte();
         }

         if(var15 == 1) {
            this.anIntArray2582[var18] = var3.readUByte();
         }
      }

      var5.position = var44 * 537964811;
      var39.position = var24 * 537964811;
      var18 = 0;
      var8 = 0;
      var31 = 0;
      var6 = 0;

      int var21;
      int var22;
      for(var7 = 0; var7 < var11; ++var7) {
         var22 = var39.readUByte();
         if(var22 == 1) {
            var18 = var5.method1746(1113333989) + var6;
            var8 = var5.method1746(1113333989) + var18;
            var31 = var5.method1746(1113333989) + var8;
            var6 = var31;
            this.trianglePointsX[var7] = var18;
            this.trianglePointsY[var7] = var8;
            this.trianglePointsZ[var7] = var31;
         }

         if(var22 == 2) {
            var8 = var31;
            var31 = var5.method1746(1113333989) + var6;
            var6 = var31;
            this.trianglePointsX[var7] = var18;
            this.trianglePointsY[var7] = var8;
            this.trianglePointsZ[var7] = var31;
         }

         if(var22 == 3) {
            var18 = var31;
            var31 = var5.method1746(1113333989) + var6;
            var6 = var31;
            this.trianglePointsX[var7] = var18;
            this.trianglePointsY[var7] = var8;
            this.trianglePointsZ[var7] = var31;
         }

         if(var22 == 4) {
            var21 = var18;
            var18 = var8;
            var8 = var21;
            var31 = var5.method1746(1113333989) + var6;
            var6 = var31;
            this.trianglePointsX[var7] = var18;
            this.trianglePointsY[var7] = var21;
            this.trianglePointsZ[var7] = var31;
         }
      }

      var5.position = var32 * 537964811;

      for(var7 = 0; var7 < var12; ++var7) {
         this.aByteArray2570[var7] = 0;
         this.texTriangleX[var7] = (short)var5.readUShort(1120497538);
         this.texTriangleY[var7] = (short)var5.readUShort(-1275989308);
         this.texTriangleZ[var7] = (short)var5.readUShort(2088609358);
      }

      if(this.aByteArray2581 != null) {
         boolean var45 = false;

         for(var22 = 0; var22 < var11; ++var22) {
            var21 = this.aByteArray2581[var22] & 255;
            if(var21 != 255) {
               if((this.texTriangleX[var21] & '\uffff') == this.trianglePointsX[var22] && (this.texTriangleY[var21] & '\uffff') == this.trianglePointsY[var22] && (this.texTriangleZ[var21] & '\uffff') == this.trianglePointsZ[var22]) {
                  this.aByteArray2581[var22] = -1;
               } else {
                  var45 = true;
               }
            }
         }

         if(!var45) {
            this.aByteArray2581 = null;
         }
      }

      if(!var43) {
         this.aShortArray2567 = null;
      }

      if(!var2) {
         this.faceRenderType = null;
      }
   }

   final int method2995(RSModel var1, int var2) {
      int var3 = -1;
      int var7 = var1.vertexX[var2];
      int var5 = var1.vertexY[var2];
      int var6 = var1.vertexZ[var2];

      for(int var4 = 0; var4 < this.vertexCount; ++var4) {
         if(var7 == this.vertexX[var4] && var5 == this.vertexY[var4] && var6 == this.vertexZ[var4]) {
            var3 = var4;
            break;
         }
      }

      if(var3 == -1) {
         this.vertexX[this.vertexCount] = var7;
         this.vertexY[this.vertexCount] = var5;
         this.vertexZ[this.vertexCount] = var6;
         if(var1.anIntArray2560 != null) {
            this.anIntArray2560[this.vertexCount] = var1.anIntArray2560[var2];
         }

         var3 = this.vertexCount++;
      }

      return var3;
   }

   public RSModel(RSModel var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.vertexCount = var1.vertexCount;
      this.triangleFaceCount = var1.triangleFaceCount;
      this.anInt2569 = var1.anInt2569;
      int var6;
      if(var2) {
         this.vertexX = var1.vertexX;
         this.vertexY = var1.vertexY;
         this.vertexZ = var1.vertexZ;
      } else {
         this.vertexX = new int[this.vertexCount];
         this.vertexY = new int[this.vertexCount];
         this.vertexZ = new int[this.vertexCount];

         for(var6 = 0; var6 < this.vertexCount; ++var6) {
            this.vertexX[var6] = var1.vertexX[var6];
            this.vertexY[var6] = var1.vertexY[var6];
            this.vertexZ[var6] = var1.vertexZ[var6];
         }
      }

      if(var3) {
         this.aShortArray2590 = var1.aShortArray2590;
      } else {
         this.aShortArray2590 = new short[this.triangleFaceCount];

         for(var6 = 0; var6 < this.triangleFaceCount; ++var6) {
            this.aShortArray2590[var6] = var1.aShortArray2590[var6];
         }
      }

      if(!var4 && var1.aShortArray2567 != null) {
         this.aShortArray2567 = new short[this.triangleFaceCount];

         for(var6 = 0; var6 < this.triangleFaceCount; ++var6) {
            this.aShortArray2567[var6] = var1.aShortArray2567[var6];
         }
      } else {
         this.aShortArray2567 = var1.aShortArray2567;
      }

      if(var5) {
         this.faceAlphas = var1.faceAlphas;
      } else {
         this.faceAlphas = new byte[this.triangleFaceCount];
         if(var1.faceAlphas == null) {
            for(var6 = 0; var6 < this.triangleFaceCount; ++var6) {
               this.faceAlphas[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.triangleFaceCount; ++var6) {
               this.faceAlphas[var6] = var1.faceAlphas[var6];
            }
         }
      }

      this.trianglePointsX = var1.trianglePointsX;
      this.trianglePointsY = var1.trianglePointsY;
      this.trianglePointsZ = var1.trianglePointsZ;
      this.faceRenderType = var1.faceRenderType;
      this.faceRenderPriorities = var1.faceRenderPriorities;
      this.aByteArray2581 = var1.aByteArray2581;
      this.aByte2568 = var1.aByte2568;
      this.aByteArray2570 = var1.aByteArray2570;
      this.texTriangleX = var1.texTriangleX;
      this.texTriangleY = var1.texTriangleY;
      this.texTriangleZ = var1.texTriangleZ;
      this.aShortArray2574 = var1.aShortArray2574;
      this.aShortArray2575 = var1.aShortArray2575;
      this.aShortArray2586 = var1.aShortArray2586;
      this.aShortArray2577 = var1.aShortArray2577;
      this.aByteArray2580 = var1.aByteArray2580;
      this.aShortArray2578 = var1.aShortArray2578;
      this.aShortArray2599 = var1.aShortArray2599;
      this.anIntArray2560 = var1.anIntArray2560;
      this.anIntArray2582 = var1.anIntArray2582;
      this.anIntArrayArray2583 = var1.anIntArrayArray2583;
      this.anIntArrayArray2584 = var1.anIntArrayArray2584;
      this.vertexNormalArray = var1.vertexNormalArray;
      this.aClass16Array2585 = var1.aClass16Array2585;
      this.aClass49Array2587 = var1.aClass49Array2587;
      this.aShort2565 = var1.aShort2565;
      this.aShort2589 = var1.aShort2589;
   }

   public RSModel method2996() {
      RSModel var1 = new RSModel();
      if(this.faceRenderType != null) {
         var1.faceRenderType = new byte[this.triangleFaceCount];

         for(int var2 = 0; var2 < this.triangleFaceCount; ++var2) {
            var1.faceRenderType[var2] = this.faceRenderType[var2];
         }
      }

      var1.vertexCount = this.vertexCount;
      var1.triangleFaceCount = this.triangleFaceCount;
      var1.anInt2569 = this.anInt2569;
      var1.vertexX = this.vertexX;
      var1.vertexY = this.vertexY;
      var1.vertexZ = this.vertexZ;
      var1.trianglePointsX = this.trianglePointsX;
      var1.trianglePointsY = this.trianglePointsY;
      var1.trianglePointsZ = this.trianglePointsZ;
      var1.faceRenderPriorities = this.faceRenderPriorities;
      var1.faceAlphas = this.faceAlphas;
      var1.aByteArray2581 = this.aByteArray2581;
      var1.aShortArray2590 = this.aShortArray2590;
      var1.aShortArray2567 = this.aShortArray2567;
      var1.aByte2568 = this.aByte2568;
      var1.aByteArray2570 = this.aByteArray2570;
      var1.texTriangleX = this.texTriangleX;
      var1.texTriangleY = this.texTriangleY;
      var1.texTriangleZ = this.texTriangleZ;
      var1.aShortArray2574 = this.aShortArray2574;
      var1.aShortArray2575 = this.aShortArray2575;
      var1.aShortArray2586 = this.aShortArray2586;
      var1.aShortArray2577 = this.aShortArray2577;
      var1.aByteArray2580 = this.aByteArray2580;
      var1.aShortArray2578 = this.aShortArray2578;
      var1.aShortArray2599 = this.aShortArray2599;
      var1.anIntArray2560 = this.anIntArray2560;
      var1.anIntArray2582 = this.anIntArray2582;
      var1.anIntArrayArray2583 = this.anIntArrayArray2583;
      var1.anIntArrayArray2584 = this.anIntArrayArray2584;
      var1.vertexNormalArray = this.vertexNormalArray;
      var1.aClass16Array2585 = this.aClass16Array2585;
      var1.aShort2565 = this.aShort2565;
      var1.aShort2589 = this.aShort2589;
      return var1;
   }

   public void method2999(int var1) {
      int var2 = anIntArray2572[var1];
      int var4 = anIntArray2600[var1];

      for(int var3 = 0; var3 < this.vertexCount; ++var3) {
         int var5 = this.vertexZ[var3] * var2 + this.vertexX[var3] * var4 >> 16;
         this.vertexZ[var3] = this.vertexZ[var3] * var4 - this.vertexX[var3] * var2 >> 16;
         this.vertexX[var3] = var5;
      }

      this.method3057();
   }

   public void method3001() {
      for(int var1 = 0; var1 < this.vertexCount; ++var1) {
         int var2 = this.vertexZ[var1];
         this.vertexZ[var1] = this.vertexX[var1];
         this.vertexX[var1] = -var2;
      }

      this.method3057();
   }

   public void translate(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.vertexCount; ++var4) {
         this.vertexX[var4] += var1;
         this.vertexY[var4] += var2;
         this.vertexZ[var4] += var3;
      }

      this.method3057();
   }

   public void findReplaceColor(short var1, short var2) {
      for(int var3 = 0; var3 < this.triangleFaceCount; ++var3) {
         if(this.aShortArray2590[var3] == var1) {
            this.aShortArray2590[var3] = var2;
         }
      }

   }

   public void findReplaceTexture(short var1, short var2) {
      if(this.aShortArray2567 != null) {
         for(int var3 = 0; var3 < this.triangleFaceCount; ++var3) {
            if(this.aShortArray2567[var3] == var1) {
               this.aShortArray2567[var3] = var2;
            }
         }

      }
   }

   void createBones() {
      int var1;
      int var2;
      int[] var3;
      int var4;
      if(this.anIntArray2560 != null) {
         var3 = new int[256];
         var2 = 0;

         for(var1 = 0; var1 < this.vertexCount; ++var1) {
            var4 = this.anIntArray2560[var1];
            ++var3[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.anIntArrayArray2583 = new int[var2 + 1][];

         for(var1 = 0; var1 <= var2; ++var1) {
            this.anIntArrayArray2583[var1] = new int[var3[var1]];
            var3[var1] = 0;
         }

         for(var1 = 0; var1 < this.vertexCount; this.anIntArrayArray2583[var4][var3[var4]++] = var1++) {
            var4 = this.anIntArray2560[var1];
         }

         this.anIntArray2560 = null;
      }

      if(this.anIntArray2582 != null) {
         var3 = new int[256];
         var2 = 0;

         for(var1 = 0; var1 < this.triangleFaceCount; ++var1) {
            var4 = this.anIntArray2582[var1];
            ++var3[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.anIntArrayArray2584 = new int[var2 + 1][];

         for(var1 = 0; var1 <= var2; ++var1) {
            this.anIntArrayArray2584[var1] = new int[var3[var1]];
            var3[var1] = 0;
         }

         for(var1 = 0; var1 < this.triangleFaceCount; this.anIntArrayArray2584[var4][var3[var4]++] = var1++) {
            var4 = this.anIntArray2582[var1];
         }

         this.anIntArray2582 = null;
      }
   }

   public void resizeModel(int resizeX, int resizeY, int resizeZ) {
      for(int vertex = 0; vertex < this.vertexCount; ++vertex) {
         this.vertexX[vertex] = this.vertexX[vertex] * resizeX / 128;
         this.vertexY[vertex] = this.vertexY[vertex] * resizeY / 128;
         this.vertexZ[vertex] = this.vertexZ[vertex] * resizeZ / 128;
      }

      this.method3057();
   }

   public void method3008() {
      if(this.vertexNormalArray == null) {
         this.vertexNormalArray = new VertexNormal[this.vertexCount];

         int var2;
         for(var2 = 0; var2 < this.vertexCount; ++var2) {
            this.vertexNormalArray[var2] = new VertexNormal();
         }

         for(var2 = 0; var2 < this.triangleFaceCount; ++var2) {
            int var4 = this.trianglePointsX[var2];
            int var5 = this.trianglePointsY[var2];
            int var9 = this.trianglePointsZ[var2];
            int var14 = this.vertexX[var5] - this.vertexX[var4];
            int var7 = this.vertexY[var5] - this.vertexY[var4];
            int var6 = this.vertexZ[var5] - this.vertexZ[var4];
            int var10 = this.vertexX[var9] - this.vertexX[var4];
            int var11 = this.vertexY[var9] - this.vertexY[var4];
            int var12 = this.vertexZ[var9] - this.vertexZ[var4];
            int var13 = var7 * var12 - var11 * var6;
            int var3 = var6 * var10 - var12 * var14;

            int var15;
            for(var15 = var14 * var11 - var10 * var7; var13 > 8192 || var3 > 8192 || var15 > 8192 || var13 < -8192 || var3 < -8192 || var15 < -8192; var15 >>= 1) {
               var13 >>= 1;
               var3 >>= 1;
            }

            int var8 = (int)Math.sqrt((double)(var13 * var13 + var3 * var3 + var15 * var15));
            if(var8 <= 0) {
               var8 = 1;
            }

            var13 = var13 * 256 / var8;
            var3 = var3 * 256 / var8;
            var15 = var15 * 256 / var8;
            byte var16;
            if(this.faceRenderType == null) {
               var16 = 0;
            } else {
               var16 = this.faceRenderType[var2];
            }

            if(var16 == 0) {
               VertexNormal vertexNormal = this.vertexNormalArray[var4];
               vertexNormal.x += var13 * 1082150963;
               vertexNormal.y += var3 * 149252831;
               vertexNormal.z += var15 * -2126155753;
               vertexNormal.magnitude -= 1799824487;
               vertexNormal = this.vertexNormalArray[var5];
               vertexNormal.x += var13 * 1082150963;
               vertexNormal.y += var3 * 149252831;
               vertexNormal.z += var15 * -2126155753;
               vertexNormal.magnitude -= 1799824487;
               vertexNormal = this.vertexNormalArray[var9];
               vertexNormal.x += var13 * 1082150963;
               vertexNormal.y += var3 * 149252831;
               vertexNormal.z += var15 * -2126155753;
               vertexNormal.magnitude -= 1799824487;
            } else if(var16 == 1) {
               if(this.aClass16Array2585 == null) {
                  this.aClass16Array2585 = new Class16[this.triangleFaceCount];
               }

               Class16 var17 = this.aClass16Array2585[var2] = new Class16();
               var17.anInt209 = var13 * -1175852759;
               var17.anInt213 = var3 * 1297756197;
               var17.anInt206 = var15 * 12373873;
            }
         }

      }
   }

   void method3010() {
      if(!this.aBool2579) {
         this.modelHeight = 0;
         this.shadowIntensity = 0;
         this.anInt2592 = 999999;
         this.anInt2593 = -999999;
         this.anInt2562 = -99999;
         this.anInt2595 = 99999;

         for(int var3 = 0; var3 < this.vertexCount; ++var3) {
            int var2 = this.vertexX[var3];
            int var4 = this.vertexY[var3];
            int var1 = this.vertexZ[var3];
            if(var2 < this.anInt2592) {
               this.anInt2592 = var2;
            }

            if(var2 > this.anInt2593) {
               this.anInt2593 = var2;
            }

            if(var1 < this.anInt2595) {
               this.anInt2595 = var1;
            }

            if(var1 > this.anInt2562) {
               this.anInt2562 = var1;
            }

            if(-var4 > this.modelHeight * 782517621) {
               this.modelHeight = -var4 * -741563683;
            }

            if(var4 > this.shadowIntensity) {
               this.shadowIntensity = var4;
            }
         }

         this.aBool2579 = true;
      }
   }

   static final int method3013(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 >= 2) {
         if(var1 > 126) {
            var1 = 126;
         }
      } else {
         var1 = 2;
      }

      return (var0 & '\uff80') + var1;
   }

   public RSModel(RSModel[] var1, int var2) {
      boolean var10 = false;
      boolean var4 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var11 = false;
      this.vertexCount = 0;
      this.triangleFaceCount = 0;
      this.anInt2569 = 0;
      this.aByte2568 = -1;

      RSModel var3;
      int var9;
      for(var9 = 0; var9 < var2; ++var9) {
         var3 = var1[var9];
         if(var3 != null) {
            this.vertexCount += var3.vertexCount;
            this.triangleFaceCount += var3.triangleFaceCount;
            this.anInt2569 += var3.anInt2569;
            if(var3.faceRenderPriorities != null) {
               var4 = true;
            } else {
               if(this.aByte2568 == -1) {
                  this.aByte2568 = var3.aByte2568;
               }

               if(this.aByte2568 != var3.aByte2568) {
                  var4 = true;
               }
            }

            var10 |= var3.faceRenderType != null;
            var6 |= var3.faceAlphas != null;
            var7 |= var3.anIntArray2582 != null;
            var8 |= var3.aShortArray2567 != null;
            var11 |= var3.aByteArray2581 != null;
         }
      }

      this.vertexX = new int[this.vertexCount];
      this.vertexY = new int[this.vertexCount];
      this.vertexZ = new int[this.vertexCount];
      this.anIntArray2560 = new int[this.vertexCount];
      this.trianglePointsX = new int[this.triangleFaceCount];
      this.trianglePointsY = new int[this.triangleFaceCount];
      this.trianglePointsZ = new int[this.triangleFaceCount];
      if(var10) {
         this.faceRenderType = new byte[this.triangleFaceCount];
      }

      if(var4) {
         this.faceRenderPriorities = new byte[this.triangleFaceCount];
      }

      if(var6) {
         this.faceAlphas = new byte[this.triangleFaceCount];
      }

      if(var7) {
         this.anIntArray2582 = new int[this.triangleFaceCount];
      }

      if(var8) {
         this.aShortArray2567 = new short[this.triangleFaceCount];
      }

      if(var11) {
         this.aByteArray2581 = new byte[this.triangleFaceCount];
      }

      this.aShortArray2590 = new short[this.triangleFaceCount];
      if(this.anInt2569 > 0) {
         this.aByteArray2570 = new byte[this.anInt2569];
         this.texTriangleX = new short[this.anInt2569];
         this.texTriangleY = new short[this.anInt2569];
         this.texTriangleZ = new short[this.anInt2569];
         this.aShortArray2574 = new short[this.anInt2569];
         this.aShortArray2575 = new short[this.anInt2569];
         this.aShortArray2586 = new short[this.anInt2569];
         this.aShortArray2577 = new short[this.anInt2569];
         this.aByteArray2580 = new byte[this.anInt2569];
         this.aShortArray2578 = new short[this.anInt2569];
         this.aShortArray2599 = new short[this.anInt2569];
      }

      this.vertexCount = 0;
      this.triangleFaceCount = 0;
      this.anInt2569 = 0;

      for(var9 = 0; var9 < var2; ++var9) {
         var3 = var1[var9];
         if(var3 != null) {
            int var5;
            for(var5 = 0; var5 < var3.triangleFaceCount; ++var5) {
               if(var10 && var3.faceRenderType != null) {
                  this.faceRenderType[this.triangleFaceCount] = var3.faceRenderType[var5];
               }

               if(var4) {
                  if(var3.faceRenderPriorities != null) {
                     this.faceRenderPriorities[this.triangleFaceCount] = var3.faceRenderPriorities[var5];
                  } else {
                     this.faceRenderPriorities[this.triangleFaceCount] = var3.aByte2568;
                  }
               }

               if(var6 && var3.faceAlphas != null) {
                  this.faceAlphas[this.triangleFaceCount] = var3.faceAlphas[var5];
               }

               if(var7 && var3.anIntArray2582 != null) {
                  this.anIntArray2582[this.triangleFaceCount] = var3.anIntArray2582[var5];
               }

               if(var8) {
                  if(var3.aShortArray2567 != null) {
                     this.aShortArray2567[this.triangleFaceCount] = var3.aShortArray2567[var5];
                  } else {
                     this.aShortArray2567[this.triangleFaceCount] = -1;
                  }
               }

               if(var11) {
                  if(var3.aByteArray2581 != null && var3.aByteArray2581[var5] != -1) {
                     this.aByteArray2581[this.triangleFaceCount] = (byte)(var3.aByteArray2581[var5] + this.anInt2569);
                  } else {
                     this.aByteArray2581[this.triangleFaceCount] = -1;
                  }
               }

               this.aShortArray2590[this.triangleFaceCount] = var3.aShortArray2590[var5];
               this.trianglePointsX[this.triangleFaceCount] = this.method2995(var3, var3.trianglePointsX[var5]);
               this.trianglePointsY[this.triangleFaceCount] = this.method2995(var3, var3.trianglePointsY[var5]);
               this.trianglePointsZ[this.triangleFaceCount] = this.method2995(var3, var3.trianglePointsZ[var5]);
               ++this.triangleFaceCount;
            }

            for(var5 = 0; var5 < var3.anInt2569; ++var5) {
               byte var12 = this.aByteArray2570[this.anInt2569] = var3.aByteArray2570[var5];
               if(var12 == 0) {
                  this.texTriangleX[this.anInt2569] = (short)this.method2995(var3, var3.texTriangleX[var5]);
                  this.texTriangleY[this.anInt2569] = (short)this.method2995(var3, var3.texTriangleY[var5]);
                  this.texTriangleZ[this.anInt2569] = (short)this.method2995(var3, var3.texTriangleZ[var5]);
               }

               if(var12 >= 1 && var12 <= 3) {
                  this.texTriangleX[this.anInt2569] = var3.texTriangleX[var5];
                  this.texTriangleY[this.anInt2569] = var3.texTriangleY[var5];
                  this.texTriangleZ[this.anInt2569] = var3.texTriangleZ[var5];
                  this.aShortArray2574[this.anInt2569] = var3.aShortArray2574[var5];
                  this.aShortArray2575[this.anInt2569] = var3.aShortArray2575[var5];
                  this.aShortArray2586[this.anInt2569] = var3.aShortArray2586[var5];
                  this.aShortArray2577[this.anInt2569] = var3.aShortArray2577[var5];
                  this.aByteArray2580[this.anInt2569] = var3.aByteArray2580[var5];
                  this.aShortArray2578[this.anInt2569] = var3.aShortArray2578[var5];
               }

               if(var12 == 2) {
                  this.aShortArray2599[this.anInt2569] = var3.aShortArray2599[var5];
               }

               ++this.anInt2569;
            }
         }
      }

   }

   public void method3028() {
      for(int var1 = 0; var1 < this.vertexCount; ++var1) {
         this.vertexX[var1] = -this.vertexX[var1];
         this.vertexZ[var1] = -this.vertexZ[var1];
      }

      this.method3057();
   }

   public void method3038() {
      for(int var1 = 0; var1 < this.vertexCount; ++var1) {
         int var2 = this.vertexX[var1];
         this.vertexX[var1] = this.vertexZ[var1];
         this.vertexZ[var1] = -var2;
      }

      this.method3057();
   }

   RSModel() {}

   public RSModel method3043(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method3010();
      int var14 = var2 + this.anInt2592;
      int var10 = var2 + this.anInt2593;
      int var11 = var4 + this.anInt2595;
      int var12 = var4 + this.anInt2562;
      if(var14 >= 0 && var10 + 128 >> 7 < var1.length && var11 >= 0 && var12 + 128 >> 7 < var1[0].length) {
         var14 >>= 7;
         var10 = var10 + 127 >> 7;
         var11 >>= 7;
         var12 = var12 + 127 >> 7;
         if(var1[var14][var11] == var3 && var1[var10][var11] == var3 && var1[var14][var12] == var3 && var1[var10][var12] == var3) {
            return this;
         } else {
            RSModel var7;
            if(var5) {
               var7 = new RSModel();
               var7.vertexCount = this.vertexCount;
               var7.triangleFaceCount = this.triangleFaceCount;
               var7.anInt2569 = this.anInt2569;
               var7.vertexX = this.vertexX;
               var7.vertexZ = this.vertexZ;
               var7.trianglePointsX = this.trianglePointsX;
               var7.trianglePointsY = this.trianglePointsY;
               var7.trianglePointsZ = this.trianglePointsZ;
               var7.faceRenderType = this.faceRenderType;
               var7.faceRenderPriorities = this.faceRenderPriorities;
               var7.faceAlphas = this.faceAlphas;
               var7.aByteArray2581 = this.aByteArray2581;
               var7.aShortArray2590 = this.aShortArray2590;
               var7.aShortArray2567 = this.aShortArray2567;
               var7.aByte2568 = this.aByte2568;
               var7.aByteArray2570 = this.aByteArray2570;
               var7.texTriangleX = this.texTriangleX;
               var7.texTriangleY = this.texTriangleY;
               var7.texTriangleZ = this.texTriangleZ;
               var7.aShortArray2574 = this.aShortArray2574;
               var7.aShortArray2575 = this.aShortArray2575;
               var7.aShortArray2586 = this.aShortArray2586;
               var7.aShortArray2577 = this.aShortArray2577;
               var7.aByteArray2580 = this.aByteArray2580;
               var7.aShortArray2578 = this.aShortArray2578;
               var7.aShortArray2599 = this.aShortArray2599;
               var7.anIntArray2560 = this.anIntArray2560;
               var7.anIntArray2582 = this.anIntArray2582;
               var7.anIntArrayArray2583 = this.anIntArrayArray2583;
               var7.anIntArrayArray2584 = this.anIntArrayArray2584;
               var7.aShort2565 = this.aShort2565;
               var7.aShort2589 = this.aShort2589;
               var7.vertexY = new int[var7.vertexCount];
            } else {
               var7 = this;
            }

            int var8;
            int var9;
            int var13;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            if(var6 == 0) {
               for(var8 = 0; var8 < var7.vertexCount; ++var8) {
                  var13 = this.vertexX[var8] + var2;
                  var16 = this.vertexZ[var8] + var4;
                  var18 = var13 & 127;
                  var22 = var16 & 127;
                  var19 = var13 >> 7;
                  var17 = var16 >> 7;
                  var21 = var1[var19][var17] * (128 - var18) + var1[var19 + 1][var17] * var18 >> 7;
                  var20 = var1[var19][var17 + 1] * (128 - var18) + var1[var19 + 1][var17 + 1] * var18 >> 7;
                  var9 = var21 * (128 - var22) + var20 * var22 >> 7;
                  var7.vertexY[var8] = this.vertexY[var8] + var9 - var3;
               }
            } else {
               for(var8 = 0; var8 < var7.vertexCount; ++var8) {
                  var13 = (-this.vertexY[var8] << 16) / (this.modelHeight * 782517621);
                  if(var13 < var6) {
                     var16 = this.vertexX[var8] + var2;
                     var18 = this.vertexZ[var8] + var4;
                     var22 = var16 & 127;
                     var19 = var18 & 127;
                     var17 = var16 >> 7;
                     var21 = var18 >> 7;
                     var20 = var1[var17][var21] * (128 - var22) + var1[var17 + 1][var21] * var22 >> 7;
                     var9 = var1[var17][var21 + 1] * (128 - var22) + var1[var17 + 1][var21 + 1] * var22 >> 7;
                     int var15 = var20 * (128 - var19) + var9 * var19 >> 7;
                     var7.vertexY[var8] = this.vertexY[var8] + (var15 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var7.method3057();
            return var7;
         }
      } else {
         return this;
      }
   }

   public void mirrorModel() {
      int var1;
      for(var1 = 0; var1 < this.vertexCount; ++var1) {
         this.vertexZ[var1] = -this.vertexZ[var1];
      }

      for(var1 = 0; var1 < this.triangleFaceCount; ++var1) {
         int var2 = this.trianglePointsX[var1];
         this.trianglePointsX[var1] = this.trianglePointsZ[var1];
         this.trianglePointsZ[var1] = var2;
      }

      this.method3057();
   }

   /**
    * 
    * @param ambient	darkness
    * @param contrast	lightness	
    * @param var3	direction1
    * @param var4	direction2
    * @param var5	direction3
    * @return
    */
   public final ModelRasterizer createModelRasterizer(int ambient, int contrast, int var3, int var4, int var5) {
      this.method3008();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = contrast * var6 >> 8;
      ModelRasterizer rasterizer = new ModelRasterizer();
      rasterizer.anIntArray2445 = new int[this.triangleFaceCount];
      rasterizer.anIntArray2444 = new int[this.triangleFaceCount];
      rasterizer.anIntArray2489 = new int[this.triangleFaceCount];
      if(this.anInt2569 > 0 && this.aByteArray2581 != null) {
         int[] var9 = new int[this.anInt2569];

         int var10;
         for(var10 = 0; var10 < this.triangleFaceCount; ++var10) {
            if(this.aByteArray2581[var10] != -1) {
               ++var9[this.aByteArray2581[var10] & 255];
            }
         }

         rasterizer.anInt2434 = 0;

         for(var10 = 0; var10 < this.anInt2569; ++var10) {
            if(var9[var10] > 0 && this.aByteArray2570[var10] == 0) {
               ++rasterizer.anInt2434;
            }
         }

         rasterizer.anIntArray2462 = new int[rasterizer.anInt2434];
         rasterizer.anIntArray2453 = new int[rasterizer.anInt2434];
         rasterizer.anIntArray2454 = new int[rasterizer.anInt2434];
         var10 = 0;

         int var13;
         for(var13 = 0; var13 < this.anInt2569; ++var13) {
            if(var9[var13] > 0 && this.aByteArray2570[var13] == 0) {
               rasterizer.anIntArray2462[var10] = this.texTriangleX[var13] & '\uffff';
               rasterizer.anIntArray2453[var10] = this.texTriangleY[var13] & '\uffff';
               rasterizer.anIntArray2454[var10] = this.texTriangleZ[var13] & '\uffff';
               var9[var13] = var10++;
            } else {
               var9[var13] = -1;
            }
         }

         rasterizer.aByteArray2451 = new byte[this.triangleFaceCount];

         for(var13 = 0; var13 < this.triangleFaceCount; ++var13) {
            if(this.aByteArray2581[var13] != -1) {
               rasterizer.aByteArray2451[var13] = (byte)var9[this.aByteArray2581[var13] & 255];
            } else {
               rasterizer.aByteArray2451[var13] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.triangleFaceCount; ++var16) {
         byte var17;
         if(this.faceRenderType == null) {
            var17 = 0;
         } else {
            var17 = this.faceRenderType[var16];
         }

         byte var19;
         if(this.faceAlphas != null) {
            var19 = this.faceAlphas[var16];
         } else {
            var19 = 0;
         }

         short var14;
         if(this.aShortArray2567 == null) {
            var14 = -1;
         } else {
            var14 = this.aShortArray2567[var16];
         }

         if(var19 == -2) {
            var17 = 3;
         }

         if(var19 == -1) {
            var17 = 2;
         }

         VertexNormal var11;
         int var12;
         Class16 var18;
         if(var14 == -1) {
            if(var17 == 0) {
               int var15 = this.aShortArray2590[var16] & '\uffff';
               if(this.aClass49Array2587 != null && this.aClass49Array2587[this.trianglePointsX[var16]] != null) {
                  var11 = this.aClass49Array2587[this.trianglePointsX[var16]];
               } else {
                  var11 = this.vertexNormalArray[this.trianglePointsX[var16]];
               }

               var12 = ambient + (var3 * var11.x * -103601413 + var4 * var11.y * -687288033 + var5 * var11.z * 1413400487) / (var7 * var11.magnitude * -1235990359);
               rasterizer.anIntArray2445[var16] = method3013(var15, var12);
               if(this.aClass49Array2587 != null && this.aClass49Array2587[this.trianglePointsY[var16]] != null) {
                  var11 = this.aClass49Array2587[this.trianglePointsY[var16]];
               } else {
                  var11 = this.vertexNormalArray[this.trianglePointsY[var16]];
               }

               var12 = ambient + (var3 * var11.x * -103601413 + var4 * var11.y * -687288033 + var5 * var11.z * 1413400487) / (var7 * var11.magnitude * -1235990359);
               rasterizer.anIntArray2444[var16] = method3013(var15, var12);
               if(this.aClass49Array2587 != null && this.aClass49Array2587[this.trianglePointsZ[var16]] != null) {
                  var11 = this.aClass49Array2587[this.trianglePointsZ[var16]];
               } else {
                  var11 = this.vertexNormalArray[this.trianglePointsZ[var16]];
               }

               var12 = ambient + (var3 * var11.x * -103601413 + var4 * var11.y * -687288033 + var5 * var11.z * 1413400487) / (var7 * var11.magnitude * -1235990359);
               rasterizer.anIntArray2489[var16] = method3013(var15, var12);
            } else if(var17 == 1) {
               var18 = this.aClass16Array2585[var16];
               var12 = ambient + (var3 * var18.anInt209 * -354499815 + var4 * var18.anInt213 * -707368019 + var5 * var18.anInt206 * 734531985) / (var7 + var7 / 2);
               rasterizer.anIntArray2445[var16] = method3013(this.aShortArray2590[var16] & '\uffff', var12);
               rasterizer.anIntArray2489[var16] = -1;
            } else if(var17 == 3) {
               rasterizer.anIntArray2445[var16] = 128;
               rasterizer.anIntArray2489[var16] = -1;
            } else {
               rasterizer.anIntArray2489[var16] = -2;
            }
         } else if(var17 == 0) {
            if(this.aClass49Array2587 != null && this.aClass49Array2587[this.trianglePointsX[var16]] != null) {
               var11 = this.aClass49Array2587[this.trianglePointsX[var16]];
            } else {
               var11 = this.vertexNormalArray[this.trianglePointsX[var16]];
            }

            var12 = ambient + (var3 * var11.x * -103601413 + var4 * var11.y * -687288033 + var5 * var11.z * 1413400487) / (var7 * var11.magnitude * -1235990359);
            rasterizer.anIntArray2445[var16] = method2990(var12);
            if(this.aClass49Array2587 != null && this.aClass49Array2587[this.trianglePointsY[var16]] != null) {
               var11 = this.aClass49Array2587[this.trianglePointsY[var16]];
            } else {
               var11 = this.vertexNormalArray[this.trianglePointsY[var16]];
            }

            var12 = ambient + (var3 * var11.x * -103601413 + var4 * var11.y * -687288033 + var5 * var11.z * 1413400487) / (var7 * var11.magnitude * -1235990359);
            rasterizer.anIntArray2444[var16] = method2990(var12);
            if(this.aClass49Array2587 != null && this.aClass49Array2587[this.trianglePointsZ[var16]] != null) {
               var11 = this.aClass49Array2587[this.trianglePointsZ[var16]];
            } else {
               var11 = this.vertexNormalArray[this.trianglePointsZ[var16]];
            }

            var12 = ambient + (var3 * var11.x * -103601413 + var4 * var11.y * -687288033 + var5 * var11.z * 1413400487) / (var7 * var11.magnitude * -1235990359);
            rasterizer.anIntArray2489[var16] = method2990(var12);
         } else if(var17 == 1) {
            var18 = this.aClass16Array2585[var16];
            var12 = ambient + (var3 * var18.anInt209 * -354499815 + var4 * var18.anInt213 * -707368019 + var5 * var18.anInt206 * 734531985) / (var7 + var7 / 2);
            rasterizer.anIntArray2445[var16] = method2990(var12);
            rasterizer.anIntArray2489[var16] = -1;
         } else {
            rasterizer.anIntArray2489[var16] = -2;
         }
      }

      this.createBones();
      rasterizer.vertexCoordinateCount = this.vertexCount;
      rasterizer.vertexXCoordinate = this.vertexX;
      rasterizer.vertexYCoordinate = this.vertexY;
      rasterizer.vertexZCoordinate = this.vertexZ;
      rasterizer.anInt2458 = this.triangleFaceCount;
      rasterizer.anIntArray2440 = this.trianglePointsX;
      rasterizer.anIntArray2441 = this.trianglePointsY;
      rasterizer.anIntArray2442 = this.trianglePointsZ;
      rasterizer.aByteArray2446 = this.faceRenderPriorities;
      rasterizer.triangleAlphaValues = this.faceAlphas;
      rasterizer.aByte2450 = this.aByte2568;
      rasterizer.anIntArrayArray2439 = this.anIntArrayArray2583;
      rasterizer.anIntArrayArray2456 = this.anIntArrayArray2584;
      rasterizer.aShortArray2481 = this.aShortArray2567;
      return rasterizer;
   }

   void method3057() {
      this.vertexNormalArray = null;
      this.aClass49Array2587 = null;
      this.aClass16Array2585 = null;
      this.aBool2579 = false;
   }

   static void method3069(RSModel var0, RSModel var1, int var2, int var3, int var4, boolean var5) {
      var0.method3010();
      var0.method3008();
      var1.method3010();
      var1.method3008();
      ++anInt2576;
      int var7 = 0;
      int[] var15 = var1.vertexX;
      int var10 = var1.vertexCount;

      int var8;
      for(var8 = 0; var8 < var0.vertexCount; ++var8) {
         VertexNormal var12 = var0.vertexNormalArray[var8];
         if(var12.magnitude * -1235990359 != 0) {
            int var14 = var0.vertexY[var8] - var3;
            if(var14 <= var1.shadowIntensity) {
               int var13 = var0.vertexX[var8] - var2;
               if(var13 >= var1.anInt2592 && var13 <= var1.anInt2593) {
                  int var11 = var0.vertexZ[var8] - var4;
                  if(var11 >= var1.anInt2595 && var11 <= var1.anInt2562) {
                     for(int var9 = 0; var9 < var10; ++var9) {
                        VertexNormal var6 = var1.vertexNormalArray[var9];
                        if(var13 == var15[var9] && var11 == var1.vertexZ[var9] && var14 == var1.vertexY[var9] && var6.magnitude * -1235990359 != 0) {
                           if(var0.aClass49Array2587 == null) {
                              var0.aClass49Array2587 = new VertexNormal[var0.vertexCount];
                           }

                           if(var1.aClass49Array2587 == null) {
                              var1.aClass49Array2587 = new VertexNormal[var10];
                           }

                           VertexNormal var16 = var0.aClass49Array2587[var8];
                           if(var16 == null) {
                              var16 = var0.aClass49Array2587[var8] = new VertexNormal(var12);
                           }

                           VertexNormal var17 = var1.aClass49Array2587[var9];
                           if(var17 == null) {
                              var17 = var1.aClass49Array2587[var9] = new VertexNormal(var6);
                           }

                           var16.x += var6.x * 1;
                           var16.y += var6.y * 1;
                           var16.z += var6.z * 1;
                           var16.magnitude += var6.magnitude * 1;
                           var17.x += var12.x * 1;
                           var17.y += var12.y * 1;
                           var17.z += var12.z * 1;
                           var17.magnitude += var12.magnitude * 1;
                           ++var7;
                           anIntArray2596[var8] = anInt2576;
                           anIntArray2597[var9] = anInt2576;
                        }
                     }
                  }
               }
            }
         }
      }

      if(var7 >= 3) {
         if(var5) {
            for(var8 = 0; var8 < var0.triangleFaceCount; ++var8) {
               if(anIntArray2596[var0.trianglePointsX[var8]] == anInt2576 && anIntArray2596[var0.trianglePointsY[var8]] == anInt2576 && anIntArray2596[var0.trianglePointsZ[var8]] == anInt2576) {
                  if(var0.faceRenderType == null) {
                     var0.faceRenderType = new byte[var0.triangleFaceCount];
                  }

                  var0.faceRenderType[var8] = 2;
               }
            }

            for(var8 = 0; var8 < var1.triangleFaceCount; ++var8) {
               if(anIntArray2597[var1.trianglePointsX[var8]] == anInt2576 && anIntArray2597[var1.trianglePointsY[var8]] == anInt2576 && anIntArray2597[var1.trianglePointsZ[var8]] == anInt2576) {
                  if(var1.faceRenderType == null) {
                     var1.faceRenderType = new byte[var1.triangleFaceCount];
                  }

                  var1.faceRenderType[var8] = 2;
               }
            }

         }
      }
   }
}
