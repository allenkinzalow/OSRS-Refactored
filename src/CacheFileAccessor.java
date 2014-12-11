import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 *
 */
public final class CacheFileAccessor {

   RandomAccessFile aRandomAccessFile1489;
   static int anInt1490;
   long aLong1491;
   long aLong1492;


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
