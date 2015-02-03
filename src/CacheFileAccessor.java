import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 *
 */
public final class CacheFileAccessor {

   public static String[] possibleCacheDirectories;
   public static String cacheDirectory;
   RandomAccessFile aRandomAccessFile1489;
   static int anInt1490;
   long aLong1491;
   long aLong1492;

   public static CacheFileAccessor getPreferencesFileAccessor(String var0, String var1, boolean var2, byte var3) {
      File preferencesFile = new File(CacheConstants.aFile1252, "preferences" + var0 + ".dat");
      if(preferencesFile.exists()) {
         try {
            CacheFileAccessor preferencesFileAccessor = new CacheFileAccessor(preferencesFile, "rw", 10000L);
            return preferencesFileAccessor;
         } catch (IOException var10) {
            ;
         }
      }

      String var5 = "";
      if(33 == Class108_Sub13.anInt1686 * 1590926487) {
         var5 = "_rc";
      } else if(34 == Class108_Sub13.anInt1686 * 1590926487) {
         var5 = "_wip";
      }

      File var6 = new File(cacheDirectory, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
      CacheFileAccessor var7;
      if(!var2 && var6.exists()) {
         try {
            var7 = new CacheFileAccessor(var6, "rw", 10000L);
            return var7;
         } catch (IOException var9) {
            ;
         }
      }

      try {
         var7 = new CacheFileAccessor(preferencesFile, "rw", 10000L);
         return var7;
      } catch (IOException var8) {
         throw new RuntimeException();
      }
   }


   final void method1482(long var1) throws IOException {
      this.aRandomAccessFile1489.seek(var1);
      this.aLong1491 = var1 * 7556923549568775953L;
   }

   public final void method1484(int var1) throws IOException {
      if(null != this.aRandomAccessFile1489) {
         this.aRandomAccessFile1489.close();
         this.aRandomAccessFile1489 = null;
      }
   }

   public final long method1485(int var1) throws IOException {
      return this.aRandomAccessFile1489.length();
   }

   public CacheFileAccessor(File file, String var2, long var3) throws IOException {
      if(var3 == -1L) {
         var3 = Long.MAX_VALUE;
      }

      if(file.length() >= var3) {
         file.delete();
      }

      this.aRandomAccessFile1489 = new RandomAccessFile(file, var2);
      this.aLong1492 = var3 * -3106111808613875751L;
      this.aLong1491 = 0L;
      int var5 = this.aRandomAccessFile1489.read();
      if(var5 != -1 && !var2.equals("r")) {
         this.aRandomAccessFile1489.seek(0L);
         this.aRandomAccessFile1489.write(var5);
      }

      this.aRandomAccessFile1489.seek(0L);
   }

   protected void finalize() throws Throwable {
      if(this.aRandomAccessFile1489 != null) {
         System.out.println("");
         this.method1484(-1944361261);
      }
   }

   public final int method1488(byte[] var1, int var2, int var3, int var4) throws IOException {
      int var5 = this.aRandomAccessFile1489.read(var1, var2, var3);
      if(var5 > 0) {
         this.aLong1491 += 7556923549568775953L * (long)var5;
      }

      return var5;
   }

   public final void method1491(byte[] var1, int var2, int var3, int var4) throws IOException {
      if((long)var3 + this.aLong1491 * -2734599992371111439L > 4517793912748904553L * this.aLong1492) {
         this.aRandomAccessFile1489.seek(this.aLong1492 * 4517793912748904553L + 1L);
         this.aRandomAccessFile1489.write(1);
         throw new EOFException();
      } else {
         this.aRandomAccessFile1489.write(var1, var2, var3);
         this.aLong1491 += (long)var3 * 7556923549568775953L;
      }
   }
}
