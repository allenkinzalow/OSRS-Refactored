
public final class ShapedTile {

   static int[] anIntArray536 = new int[6];
   int shape;
   int[] triangle_HSL_B;
   int[] triangleHSL_A;
   static int[] anIntArray540 = new int[6];
   int[] triangleHSL_C;
   int[] vertexZ;
   int[] triangleB;
   int[] triangleC;
   int[] vertexX;
   boolean aBool546 = true;
   int[] vertexY;
   int rotation;
   int colorRGB;
   static int[] anIntArray550 = new int[6];
   static int[] anIntArray551 = new int[6];
   int colorRGBA;
   int[] anIntArray553;
   static int[] anIntArray554 = new int[6];
   int[] triangleA;
   static int[][] pointData = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}};
   static int[][] elementData = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, {1, 1, 2, 3, 1, 0, 1, 3}, {0, 1, 2, 3, 1, 0, 1, 3}, {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};


   ShapedTile(int shape, int rotation, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int colorRGB, int colorRGBA) {
      if(var6 != var7 || var6 != var8 || var6 != var9) {
         this.aBool546 = false;
      }

      this.shape = shape;
      this.rotation = rotation;
      this.colorRGB = colorRGB;
      this.colorRGBA = colorRGBA;
      short var20 = 128;
      int var36 = var20 / 2;
      int var21 = var20 / 4;
      int var26 = var20 * 3 / 4;
      int[] vertices = pointData[shape];
      int vertexCount = vertices.length;
      this.vertexX = new int[vertexCount];
      this.vertexY = new int[vertexCount];
      this.vertexZ = new int[vertexCount];
      int[] var37 = new int[vertexCount];
      int[] var28 = new int[vertexCount];
      int var23 = var4 * var20;
      int var25 = var5 * var20;

      int var24;
      int triangle;
      int var30;
      int var31;
      int triangleCount;
      int var34;
      for(int vertexIndex = 0; vertexIndex < vertexCount; ++vertexIndex) {
         triangleCount = vertices[vertexIndex];
         if((triangleCount & 1) == 0 && triangleCount <= 8) {
            triangleCount = (triangleCount - rotation - rotation - 1 & 7) + 1;
         }

         if(triangleCount > 8 && triangleCount <= 12) {
            triangleCount = (triangleCount - 9 - rotation & 3) + 9;
         }

         if(triangleCount > 12 && triangleCount <= 16) {
            triangleCount = (triangleCount - 13 - rotation & 3) + 13;
         }

         if(triangleCount == 1) {
            var24 = var23;
            triangle = var25;
            var31 = var6;
            var34 = var10;
            var30 = var14;
         } else if(triangleCount == 2) {
            var24 = var23 + var36;
            triangle = var25;
            var31 = var6 + var7 >> 1;
            var34 = var10 + var11 >> 1;
            var30 = var14 + var15 >> 1;
         } else if(triangleCount == 3) {
            var24 = var23 + var20;
            triangle = var25;
            var31 = var7;
            var34 = var11;
            var30 = var15;
         } else if(triangleCount == 4) {
            var24 = var23 + var20;
            triangle = var25 + var36;
            var31 = var7 + var8 >> 1;
            var34 = var11 + var12 >> 1;
            var30 = var15 + var16 >> 1;
         } else if(triangleCount == 5) {
            var24 = var23 + var20;
            triangle = var25 + var20;
            var31 = var8;
            var34 = var12;
            var30 = var16;
         } else if(triangleCount == 6) {
            var24 = var23 + var36;
            triangle = var25 + var20;
            var31 = var8 + var9 >> 1;
            var34 = var12 + var13 >> 1;
            var30 = var16 + var17 >> 1;
         } else if(triangleCount == 7) {
            var24 = var23;
            triangle = var25 + var20;
            var31 = var9;
            var34 = var13;
            var30 = var17;
         } else if(triangleCount == 8) {
            var24 = var23;
            triangle = var25 + var36;
            var31 = var9 + var6 >> 1;
            var34 = var13 + var10 >> 1;
            var30 = var17 + var14 >> 1;
         } else if(triangleCount == 9) {
            var24 = var23 + var36;
            triangle = var25 + var21;
            var31 = var6 + var7 >> 1;
            var34 = var10 + var11 >> 1;
            var30 = var14 + var15 >> 1;
         } else if(triangleCount == 10) {
            var24 = var23 + var26;
            triangle = var25 + var36;
            var31 = var7 + var8 >> 1;
            var34 = var11 + var12 >> 1;
            var30 = var15 + var16 >> 1;
         } else if(triangleCount == 11) {
            var24 = var23 + var36;
            triangle = var25 + var26;
            var31 = var8 + var9 >> 1;
            var34 = var12 + var13 >> 1;
            var30 = var16 + var17 >> 1;
         } else if(triangleCount == 12) {
            var24 = var23 + var21;
            triangle = var25 + var36;
            var31 = var9 + var6 >> 1;
            var34 = var13 + var10 >> 1;
            var30 = var17 + var14 >> 1;
         } else if(triangleCount == 13) {
            var24 = var23 + var21;
            triangle = var25 + var21;
            var31 = var6;
            var34 = var10;
            var30 = var14;
         } else if(triangleCount == 14) {
            var24 = var23 + var26;
            triangle = var25 + var21;
            var31 = var7;
            var34 = var11;
            var30 = var15;
         } else if(triangleCount == 15) {
            var24 = var23 + var26;
            triangle = var25 + var26;
            var31 = var8;
            var34 = var12;
            var30 = var16;
         } else {
            var24 = var23 + var21;
            triangle = var25 + var26;
            var31 = var9;
            var34 = var13;
            var30 = var17;
         }

         this.vertexX[vertexIndex] = var24;
         this.vertexY[vertexIndex] = var31;
         this.vertexZ[vertexIndex] = triangle;
         var37[vertexIndex] = var34;
         var28[vertexIndex] = var30;
      }

      int[] var38 = elementData[shape];
      triangleCount = var38.length / 4;
      this.triangleA = new int[triangleCount];
      this.triangleB = new int[triangleCount];
      this.triangleC = new int[triangleCount];
      this.triangleHSL_A = new int[triangleCount];
      this.triangle_HSL_B = new int[triangleCount];
      this.triangleHSL_C = new int[triangleCount];
      if(var3 != -1) {
         this.anIntArray553 = new int[triangleCount];
      }

      var24 = 0;

      for(triangle = 0; triangle < triangleCount; ++triangle) {
         var31 = var38[var24];
         var34 = var38[var24 + 1];
         var30 = var38[var24 + 2];
         int var35 = var38[var24 + 3];
         var24 += 4;
         if(var34 < 4) {
            var34 = var34 - rotation & 3;
         }

         if(var30 < 4) {
            var30 = var30 - rotation & 3;
         }

         if(var35 < 4) {
            var35 = var35 - rotation & 3;
         }

         this.triangleA[triangle] = var34;
         this.triangleB[triangle] = var30;
         this.triangleC[triangle] = var35;
         if(var31 == 0) {
            this.triangleHSL_A[triangle] = var37[var34];
            this.triangle_HSL_B[triangle] = var37[var30];
            this.triangleHSL_C[triangle] = var37[var35];
            if(this.anIntArray553 != null) {
               this.anIntArray553[triangle] = -1;
            }
         } else {
            this.triangleHSL_A[triangle] = var28[var34];
            this.triangle_HSL_B[triangle] = var28[var30];
            this.triangleHSL_C[triangle] = var28[var35];
            if(this.anIntArray553 != null) {
               this.anIntArray553[triangle] = var3;
            }
         }
      }

      triangle = var6;
      var31 = var7;
      if(var7 < var6) {
         triangle = var7;
      }

      if(var7 > var7) {
         var31 = var7;
      }

      if(var8 < triangle) {
         triangle = var8;
      }

      if(var8 > var31) {
         var31 = var8;
      }

      if(var9 < triangle) {
         triangle = var9;
      }

      if(var9 > var31) {
         var31 = var9;
      }

      triangle /= 14;
      var31 /= 14;
   }
}
