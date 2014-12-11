import java.io.EOFException;
import java.io.IOException;

public class CacheFile {

   CacheFileAccessor cacheFileAccessor;
   long aLong1499 = -4316677163942414309L;
   long aLong1500 = 6583202258336159595L;
   static final int anInt1501 = 20;
   byte[] aByteArray1502;
   byte[] aByteArray1503;
   int anInt1504 = 0;
   long aLong1505;
   long aLong1506;
   long aLong1507;
   long aLong1508;
   static final int anInt1509 = 1005;
   int anInt1510;


   public CacheFile(CacheFileAccessor var1, int var2, int var3) throws IOException {
      this.cacheFileAccessor = var1;
      this.aLong1507 = (this.aLong1506 = var1.method1485(1566313123) * -5815471396468035689L) * 3614884796060269301L;
      this.aByteArray1503 = new byte[var2];
      this.aByteArray1502 = new byte[var3];
      this.aLong1505 = 0L;
   }

   public long length(int var1) {
      return -358140922391603925L * this.aLong1507;
   }

   public void read(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if(var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if(this.aLong1500 * 1799848982431441597L != -1L && this.aLong1505 * 7400071599797034781L >= 1799848982431441597L * this.aLong1500 && 7400071599797034781L * this.aLong1505 + (long)var3 <= (long)(this.anInt1504 * 659965443) + this.aLong1500 * 1799848982431441597L) {
            System.arraycopy(this.aByteArray1502, (int)(7400071599797034781L * this.aLong1505 - 1799848982431441597L * this.aLong1500), var1, var2, var3);
            this.aLong1505 += -6074887311760172235L * (long)var3;
            return;
         }

         long var5 = this.aLong1505 * 7400071599797034781L;
         int var8 = var3;
         int var9;
         if(7400071599797034781L * this.aLong1505 >= -984477409303274003L * this.aLong1499 && this.aLong1505 * 7400071599797034781L < (long)(this.anInt1510 * 990224099) + this.aLong1499 * -984477409303274003L) {
            var9 = (int)((long)(this.anInt1510 * 990224099) - (this.aLong1505 * 7400071599797034781L - -984477409303274003L * this.aLong1499));
            if(var9 > var3) {
               var9 = var3;
            }

            System.arraycopy(this.aByteArray1503, (int)(7400071599797034781L * this.aLong1505 - -984477409303274003L * this.aLong1499), var1, var2, var9);
            this.aLong1505 += -6074887311760172235L * (long)var9;
            var2 += var9;
            var3 -= var9;
         }

         if(var3 > this.aByteArray1503.length) {
            this.cacheFileAccessor.method1482(this.aLong1505 * 7400071599797034781L);

            for(this.aLong1508 = this.aLong1505 * -7890134494393983685L; var3 > 0; var3 -= var9) {
               var9 = this.cacheFileAccessor.method1488(var1, var2, var3, -174141677);
               if(var9 == -1) {
                  break;
               }

               this.aLong1508 += (long)var9 * -8947236717274495433L;
               this.aLong1505 += (long)var9 * -6074887311760172235L;
               var2 += var9;
            }
         } else if(var3 > 0) {
            this.method1525(620604296);
            var9 = var3;
            if(var3 > this.anInt1510 * 990224099) {
               var9 = this.anInt1510 * 990224099;
            }

            System.arraycopy(this.aByteArray1503, 0, var1, var2, var9);
            var2 += var9;
            var3 -= var9;
            this.aLong1505 += -6074887311760172235L * (long)var9;
         }

         if(-1L != 1799848982431441597L * this.aLong1500) {
            if(1799848982431441597L * this.aLong1500 > 7400071599797034781L * this.aLong1505 && var3 > 0) {
               var9 = (int)(this.aLong1500 * 1799848982431441597L - this.aLong1505 * 7400071599797034781L) + var2;
               if(var9 > var2 + var3) {
                  var9 = var3 + var2;
               }

               while(var2 < var9) {
                  var1[var2++] = 0;
                  --var3;
                  this.aLong1505 += -6074887311760172235L;
               }
            }

            long var10 = -1L;
            long var12 = -1L;
            if(1799848982431441597L * this.aLong1500 >= var5 && this.aLong1500 * 1799848982431441597L < (long)var8 + var5) {
               var10 = this.aLong1500 * 1799848982431441597L;
            } else if(var5 >= 1799848982431441597L * this.aLong1500 && var5 < 1799848982431441597L * this.aLong1500 + (long)(this.anInt1504 * 659965443)) {
               var10 = var5;
            }

            if(1799848982431441597L * this.aLong1500 + (long)(this.anInt1504 * 659965443) > var5 && 1799848982431441597L * this.aLong1500 + (long)(this.anInt1504 * 659965443) <= var5 + (long)var8) {
               var12 = (long)(this.anInt1504 * 659965443) + this.aLong1500 * 1799848982431441597L;
            } else if((long)var8 + var5 > 1799848982431441597L * this.aLong1500 && var5 + (long)var8 <= (long)(this.anInt1504 * 659965443) + 1799848982431441597L * this.aLong1500) {
               var12 = (long)var8 + var5;
            }

            if(var10 > -1L && var12 > var10) {
               int var14 = (int)(var12 - var10);
               System.arraycopy(this.aByteArray1502, (int)(var10 - 1799848982431441597L * this.aLong1500), var1, var2 + (int)(var10 - var5), var14);
               if(var12 > this.aLong1505 * 7400071599797034781L) {
                  var3 = (int)((long)var3 - (var12 - 7400071599797034781L * this.aLong1505));
                  this.aLong1505 = -6074887311760172235L * var12;
               }
            }
         }
      } catch (IOException var16) {
         this.aLong1508 = 8947236717274495433L;
         throw var16;
      }

      if(var3 > 0) {
         throw new EOFException();
      }
   }

   void method1525(int var1) throws IOException {
      this.anInt1510 = 0;
      if(8691187415774072711L * this.aLong1508 != 7400071599797034781L * this.aLong1505) {
         this.cacheFileAccessor.method1482(7400071599797034781L * this.aLong1505);
         this.aLong1508 = -7890134494393983685L * this.aLong1505;
      }

      int var2;
      for(this.aLong1499 = this.aLong1505 * -2359950226173960207L; this.anInt1510 * 990224099 < this.aByteArray1503.length; this.anInt1510 += var2 * 1399232203) {
         var2 = this.cacheFileAccessor.method1488(this.aByteArray1503, this.anInt1510 * 990224099, this.aByteArray1503.length - this.anInt1510 * 990224099, -1384003402);
         if(var2 == -1) {
            return;
         }

         this.aLong1508 += (long)var2 * -8947236717274495433L;
      }

   }

   public void write(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if((long)var3 + this.aLong1505 * 7400071599797034781L > -358140922391603925L * this.aLong1507) {
            this.aLong1507 = 6795138697441624451L * (7400071599797034781L * this.aLong1505 + (long)var3);
         }

         if(1799848982431441597L * this.aLong1500 != -1L && (this.aLong1505 * 7400071599797034781L < this.aLong1500 * 1799848982431441597L || 7400071599797034781L * this.aLong1505 > 1799848982431441597L * this.aLong1500 + (long)(this.anInt1504 * 659965443))) {
            this.method1540(482681752);
         }

         if(-1L != this.aLong1500 * 1799848982431441597L && 7400071599797034781L * this.aLong1505 + (long)var3 > this.aLong1500 * 1799848982431441597L + (long)this.aByteArray1502.length) {
            int var5 = (int)((long)this.aByteArray1502.length - (7400071599797034781L * this.aLong1505 - this.aLong1500 * 1799848982431441597L));
            System.arraycopy(var1, var2, this.aByteArray1502, (int)(this.aLong1505 * 7400071599797034781L - this.aLong1500 * 1799848982431441597L), var5);
            this.aLong1505 += (long)var5 * -6074887311760172235L;
            var2 += var5;
            var3 -= var5;
            this.anInt1504 = this.aByteArray1502.length * 1330451627;
            this.method1540(2134680566);
         }

         if(var3 <= this.aByteArray1502.length) {
            if(var3 > 0) {
               if(-1L == this.aLong1500 * 1799848982431441597L) {
                  this.aLong1500 = this.aLong1505 * -893085038735449119L;
               }

               System.arraycopy(var1, var2, this.aByteArray1502, (int)(this.aLong1505 * 7400071599797034781L - 1799848982431441597L * this.aLong1500), var3);
               this.aLong1505 += -6074887311760172235L * (long)var3;
               if(this.aLong1505 * 7400071599797034781L - this.aLong1500 * 1799848982431441597L > (long)(this.anInt1504 * 659965443)) {
                  this.anInt1504 = (int)(7400071599797034781L * this.aLong1505 - this.aLong1500 * 1799848982431441597L) * 1330451627;
               }
            }
         } else {
            if(this.aLong1505 * 7400071599797034781L != 8691187415774072711L * this.aLong1508) {
               this.cacheFileAccessor.method1482(this.aLong1505 * 7400071599797034781L);
               this.aLong1508 = this.aLong1505 * -7890134494393983685L;
            }

            this.cacheFileAccessor.method1491(var1, var2, var3, 473414132);
            this.aLong1508 += -8947236717274495433L * (long)var3;
            if(8691187415774072711L * this.aLong1508 > this.aLong1506 * 7307487033181437991L) {
               this.aLong1506 = this.aLong1508 * 3279243787635143073L;
            }

            long var6 = -1L;
            long var8 = -1L;
            if(7400071599797034781L * this.aLong1505 >= this.aLong1499 * -984477409303274003L && this.aLong1505 * 7400071599797034781L < (long)(this.anInt1510 * 990224099) + -984477409303274003L * this.aLong1499) {
               var6 = 7400071599797034781L * this.aLong1505;
            } else if(-984477409303274003L * this.aLong1499 >= 7400071599797034781L * this.aLong1505 && this.aLong1499 * -984477409303274003L < (long)var3 + 7400071599797034781L * this.aLong1505) {
               var6 = this.aLong1499 * -984477409303274003L;
            }

            if(this.aLong1505 * 7400071599797034781L + (long)var3 > -984477409303274003L * this.aLong1499 && this.aLong1505 * 7400071599797034781L + (long)var3 <= (long)(this.anInt1510 * 990224099) + -984477409303274003L * this.aLong1499) {
               var8 = 7400071599797034781L * this.aLong1505 + (long)var3;
            } else if(-984477409303274003L * this.aLong1499 + (long)(this.anInt1510 * 990224099) > 7400071599797034781L * this.aLong1505 && (long)(this.anInt1510 * 990224099) + this.aLong1499 * -984477409303274003L <= this.aLong1505 * 7400071599797034781L + (long)var3) {
               var8 = -984477409303274003L * this.aLong1499 + (long)(this.anInt1510 * 990224099);
            }

            if(var6 > -1L && var8 > var6) {
               int var10 = (int)(var8 - var6);
               System.arraycopy(var1, (int)((long)var2 + var6 - 7400071599797034781L * this.aLong1505), this.aByteArray1503, (int)(var6 - this.aLong1499 * -984477409303274003L), var10);
            }

            this.aLong1505 += -6074887311760172235L * (long)var3;
         }
      } catch (IOException var11) {
         this.aLong1508 = 8947236717274495433L;
         throw var11;
      }
   }

   public void seekTo(long var1) throws IOException {
      if(var1 < 0L) {
         throw new IOException("");
      } else {
         this.aLong1505 = -6074887311760172235L * var1;
      }
   }

   public void method1531(byte[] var1, int var2) throws IOException {
      this.read(var1, 0, var1.length, 1429415233);
   }

   void method1540(int var1) throws IOException {
      if(this.aLong1500 * 1799848982431441597L != -1L) {
         if(this.aLong1500 * 1799848982431441597L != this.aLong1508 * 8691187415774072711L) {
            this.cacheFileAccessor.method1482(1799848982431441597L * this.aLong1500);
            this.aLong1508 = -2713947974098557797L * this.aLong1500;
         }

         this.cacheFileAccessor.method1491(this.aByteArray1502, 0, this.anInt1504 * 659965443, 473414132);
         this.aLong1508 += (long)this.anInt1504 * 2708852145318108325L;
         if(8691187415774072711L * this.aLong1508 > 7307487033181437991L * this.aLong1506) {
            this.aLong1506 = this.aLong1508 * 3279243787635143073L;
         }

         long var4 = -1L;
         long var2 = -1L;
         if(1799848982431441597L * this.aLong1500 >= -984477409303274003L * this.aLong1499 && 1799848982431441597L * this.aLong1500 < this.aLong1499 * -984477409303274003L + (long)(this.anInt1510 * 990224099)) {
            var4 = 1799848982431441597L * this.aLong1500;
         } else if(-984477409303274003L * this.aLong1499 >= 1799848982431441597L * this.aLong1500 && this.aLong1499 * -984477409303274003L < (long)(this.anInt1504 * 659965443) + this.aLong1500 * 1799848982431441597L) {
            var4 = this.aLong1499 * -984477409303274003L;
         }

         if(this.aLong1500 * 1799848982431441597L + (long)(this.anInt1504 * 659965443) > -984477409303274003L * this.aLong1499 && this.aLong1500 * 1799848982431441597L + (long)(this.anInt1504 * 659965443) <= (long)(this.anInt1510 * 990224099) + -984477409303274003L * this.aLong1499) {
            var2 = (long)(this.anInt1504 * 659965443) + this.aLong1500 * 1799848982431441597L;
         } else if(-984477409303274003L * this.aLong1499 + (long)(this.anInt1510 * 990224099) > this.aLong1500 * 1799848982431441597L && (long)(this.anInt1510 * 990224099) + this.aLong1499 * -984477409303274003L <= (long)(this.anInt1504 * 659965443) + 1799848982431441597L * this.aLong1500) {
            var2 = -984477409303274003L * this.aLong1499 + (long)(this.anInt1510 * 990224099);
         }

         if(var4 > -1L && var2 > var4) {
            int var6 = (int)(var2 - var4);
            System.arraycopy(this.aByteArray1502, (int)(var4 - 1799848982431441597L * this.aLong1500), this.aByteArray1503, (int)(var4 - this.aLong1499 * -984477409303274003L), var6);
         }

         this.aLong1500 = 6583202258336159595L;
         this.anInt1504 = 0;
      }
   }

   public void method1547(byte var1) throws IOException {
      this.method1540(-682893432);
      this.cacheFileAccessor.method1484(-1554189696);
   }
}
