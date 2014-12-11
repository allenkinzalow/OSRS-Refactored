import java.io.EOFException;
import java.io.IOException;

public final class IndexTable {

   CacheFile dataFile = null;
   CacheFile indexFile = null;
   int index;
   static PaletteSprite clientLogo;
   static int[] blendedLightness;
   static int anInt790;
   int descsriptorIndex = -1391642344;
   static byte[] buffer = new byte[520];
   static PaletteSprite[] scrollBarSprites;


   public static String getIPAddress(int var0, int var1) {
      return (var0 >> 24 & 255) + "." + (var0 >> 16 & 255) + "." + (var0 >> 8 & 255) + "." + (var0 & 255);
   }

   public byte[] get(int index, byte var2) {
      CacheFile var3 = this.dataFile;
      synchronized(var3) {
         byte[] var10000;
         try {
            if(this.indexFile.length(1679736862) < (long)(index * 6 + 6)) {
               return null;
            }

            this.indexFile.seekTo((long)(index * 6));
            this.indexFile.read(buffer, 0, 6, 1679003336);
            int var4 = (buffer[2] & 255) + ((buffer[0] & 255) << 16) + ((buffer[1] & 255) << 8);
            int var5 = (buffer[5] & 255) + ((buffer[4] & 255) << 8) + ((buffer[3] & 255) << 16);
            if(var4 < 0 || var4 > this.descsriptorIndex * -1073808481) {
               return null;
            }

            if(var5 <= 0 || (long)var5 > this.dataFile.length(1679736862) / 520L) {
               return null;
            }

            byte[] var6 = new byte[var4];
            int var7 = 0;

            for(int var8 = 0; var7 < var4; ++var8) {
               if(0 == var5) {
                  return null;
               }

               this.dataFile.seekTo((long)(var5 * 520));
               int needed = var4 - var7;
               if(needed > 512) {
                  needed = 512;
               }

               this.dataFile.read(buffer, 0, 8 + needed, 1953221265);
               int nextId = ((buffer[0] & 255) << 8) + (buffer[1] & 255);
               int nextSequenceBlock = (buffer[3] & 255) + ((buffer[2] & 255) << 8);
               int nextBlockPosition = (buffer[6] & 255) + ((buffer[4] & 255) << 16) + ((buffer[5] & 255) << 8);
               int nextIndex = buffer[7] & 255;
               if(index != nextId || nextSequenceBlock != var8 || this.index * 4631867 != nextIndex) {
                  return null;
               }

               if(nextBlockPosition < 0 || (long)nextBlockPosition > this.dataFile.length(1679736862) / 520L) {
                  return null;
               }

               for(int var14 = 0; var14 < needed; ++var14) {
                  var6[var7++] = buffer[8 + var14];
               }

               var5 = nextBlockPosition;
            }

            var10000 = var6;
         } catch (IOException var16) {
            return null;
         }

         return var10000;
      }
   }

   /**
    * This attempts to put data into the index - tries to do it twice.
    * @param indexID
    * @param var2
    * @param var3
    * @param var4
    * @return
    */
   public boolean putDataAttempt(int indexID, byte[] var2, int var3, int var4) {
      CacheFile dataFile = this.dataFile;
      synchronized(dataFile) {
         if(var3 >= 0 && var3 <= this.descsriptorIndex * -1073808481) {
            boolean success = this.put(indexID, var2, var3, true, (byte)16);
            if(!success) {
               success = this.put(indexID, var2, var3, false, (byte)16);
            }

            return success;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   public IndexTable(int index, CacheFile var2, CacheFile var3, int var4) {
      this.index = index * 500723;
      this.dataFile = var2;
      this.indexFile = var3;
      this.descsriptorIndex = var4 * 2145083487;
   }

   boolean put(int index, byte[] data, int length, boolean exists, byte var5) {
      CacheFile dataFile_s = this.dataFile;
      synchronized(dataFile_s) {
         boolean var10000;
         try {
            int sector;
            if(exists) {
               if(this.indexFile.length(1679736862) < (long)(index * 6 + 6)) {
                  return false;
               }

               this.indexFile.seekTo((long)(index * 6));
               this.indexFile.read(buffer, 0, 6, 786202691);
               sector = ((buffer[3] & 255) << 16) + ((buffer[4] & 255) << 8) + (buffer[5] & 255);
               if(sector <= 0 || (long)sector > this.dataFile.length(1679736862) / 520L) {
                  return false;
               }
            } else {
               sector = (int)((this.dataFile.length(1679736862) + 519L) / 520L);
               if(0 == sector) {
                  sector = 1;
               }
            }

            buffer[0] = (byte)(length >> 16);
            buffer[1] = (byte)(length >> 8);
            buffer[2] = (byte)length;
            buffer[3] = (byte)(sector >> 16);
            buffer[4] = (byte)(sector >> 8);
            buffer[5] = (byte)sector;
            this.indexFile.seekTo((long)(index * 6));
            this.indexFile.write(buffer, 0, 6, 12345678);
            int written = 0;

            for(int var9 = 0; written < length; ++var9) {
               int nextSector = 0;
               int remaining;
               if(exists) {
                  this.dataFile.seekTo((long)(sector * 520));

                  try {
                     this.dataFile.read(buffer, 0, 8, 1393576114);
                  } catch (EOFException var15) {
                     break;
                  }

                  remaining = ((buffer[0] & 255) << 8) + (buffer[1] & 255);
                  int var12 = ((buffer[2] & 255) << 8) + (buffer[3] & 255);
                  nextSector = (buffer[6] & 255) + ((buffer[4] & 255) << 16) + ((buffer[5] & 255) << 8);
                  int var13 = buffer[7] & 255;
                  if(remaining != index || var12 != var9 || this.index * 4631867 != var13) {
                     return false;
                  }

                  if(nextSector < 0 || (long)nextSector > this.dataFile.length(1679736862) / 520L) {
                     return false;
                  }
               }

               if(0 == nextSector) {
                  exists = false;
                  nextSector = (int)((this.dataFile.length(1679736862) + 519L) / 520L);
                  if(0 == nextSector) {
                     ++nextSector;
                  }

                  if(nextSector == sector) {
                     ++nextSector;
                  }
               }

               if(length - written <= 512) {
                  nextSector = 0;
               }

               buffer[0] = (byte)(index >> 8);
               buffer[1] = (byte)index;
               buffer[2] = (byte)(var9 >> 8);
               buffer[3] = (byte)var9;
               buffer[4] = (byte)(nextSector >> 16);
               buffer[5] = (byte)(nextSector >> 8);
               buffer[6] = (byte)nextSector;
               buffer[7] = (byte)(this.index * 4631867);
               this.dataFile.seekTo((long)(sector * 520));
               this.dataFile.write(buffer, 0, 8, 12345678);
               remaining = length - written;
               if(remaining > 512) {
                  remaining = 512;
               }

               this.dataFile.write(data, written, remaining, 12345678);
               written += remaining;
               sector = nextSector;
            }

            var10000 = true;
         } catch (IOException var16) {
            return false;
         }

         return var10000;
      }
   }
}
