import java.io.File;
import java.io.IOException;

public class VertexNormal {

   int z;
   int y;
   int magnitude;
   int x;
   static final int anInt689 = 36;
   public static String lowerOperatingSystem;
   public static final int anInt691 = 31;


   public static int method692(CharSequence var0, int var1) {
      return Class32.method579(var0, 10, true, -1333286410);
   }

   VertexNormal(VertexNormal var1) {
      this.x = var1.x * 1;
      this.y = var1.y * 1;
      this.z = var1.z * 1;
      this.magnitude = var1.magnitude * 1;
   }

   public static void method693(File var0, File var1, byte var2) {
      try {
         CacheFileAccessor accessor = new CacheFileAccessor(CacheConstants.aFile1255, "rw", 10000L);
         RSByteBuffer buffer = new RSByteBuffer(500);
         buffer.writeByte(3);
         buffer.writeByte(null != var1 ? 1 : 0);
         buffer.method1840(var0.getPath(), (byte)41);
         if(var1 != null) {
            buffer.method1840(var1.getPath(), (byte)29);
         }

         accessor.method1491(buffer.buf, 0, buffer.position * 798331555, 473414132);
         accessor.method1484(-1739433558);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   VertexNormal() {}

   public static void method694(boolean var0, int var1) {
      if(var0 != ItemDefinition.aBool1974) {
         GroundItem.method585((byte)-17);
         ItemDefinition.aBool1974 = var0;
      }
   }

   static final int method695(int var0, int var1, int var2, int var3, int var4) {
      int var5 = 65536 - Rasterizer3D.COSINE[var2 * 1024 / var3] >> 1;
      return (var1 * var5 >> 16) + ((65536 - var5) * var0 >> 16);
   }

   public static int method696(CharSequence var0, int var1, int var2, byte[] var3, int var4, int var5) {
      int var6 = var2 - var1;

      for(int var7 = 0; var7 < var6; ++var7) {
         char var8 = var0.charAt(var1 + var7);
         if((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
            if(var8 == 8364) {
               var3[var4 + var7] = -128;
            } else if(8218 == var8) {
               var3[var4 + var7] = -126;
            } else if(var8 == 402) {
               var3[var7 + var4] = -125;
            } else if(var8 == 8222) {
               var3[var4 + var7] = -124;
            } else if(var8 == 8230) {
               var3[var7 + var4] = -123;
            } else if(8224 == var8) {
               var3[var4 + var7] = -122;
            } else if(var8 == 8225) {
               var3[var4 + var7] = -121;
            } else if(710 == var8) {
               var3[var4 + var7] = -120;
            } else if(8240 == var8) {
               var3[var4 + var7] = -119;
            } else if(var8 == 352) {
               var3[var4 + var7] = -118;
            } else if(8249 == var8) {
               var3[var7 + var4] = -117;
            } else if(var8 == 338) {
               var3[var7 + var4] = -116;
            } else if(var8 == 381) {
               var3[var4 + var7] = -114;
            } else if(8216 == var8) {
               var3[var7 + var4] = -111;
            } else if(8217 == var8) {
               var3[var7 + var4] = -110;
            } else if(8220 == var8) {
               var3[var4 + var7] = -109;
            } else if(var8 == 8221) {
               var3[var4 + var7] = -108;
            } else if(8226 == var8) {
               var3[var7 + var4] = -107;
            } else if(8211 == var8) {
               var3[var4 + var7] = -106;
            } else if(8212 == var8) {
               var3[var4 + var7] = -105;
            } else if(732 == var8) {
               var3[var4 + var7] = -104;
            } else if(var8 == 8482) {
               var3[var4 + var7] = -103;
            } else if(353 == var8) {
               var3[var7 + var4] = -102;
            } else if(8250 == var8) {
               var3[var4 + var7] = -101;
            } else if(339 == var8) {
               var3[var4 + var7] = -100;
            } else if(382 == var8) {
               var3[var7 + var4] = -98;
            } else if(var8 == 376) {
               var3[var7 + var4] = -97;
            } else {
               var3[var4 + var7] = 63;
            }
         } else {
            var3[var7 + var4] = (byte)var8;
         }
      }

      return var6;
   }
}
