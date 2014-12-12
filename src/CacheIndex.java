import java.util.zip.CRC32;

/**
 * todo: rename
 * @author allen_000
 *
 */
public class CacheIndex extends AbstractIndex {

   int indexID;
   volatile boolean[] aBoolArray1713;
   boolean aBool1714 = false;
   volatile boolean aBool1715 = false;
   IndexTable aClass59_1716;
   int anInt1717;
   static CRC32 aCRC32_1718 = new CRC32();
   IndexTable aClass59_1719;
   int anInt1720;
   int anInt1721 = -1749760423;
   public static final int anInt1722 = 207;


   void method1003(int archiveID, int var2) {
      Class23.method342(this.indexID * 663669877, archiveID, (byte)2);
   }
 
   void submitArchiveRequest(int archiveID, int var2) {
      if(this.aClass59_1719 != null && null != this.aBoolArray1713 && this.aBoolArray1713[archiveID]) {
         RegionReference.method587(archiveID, this.aClass59_1719, this, 1473251475);
      } else { 
         GroundItem.submitJs5Request(this, this.indexID * 663669877, archiveID, this.anIntArray933[archiveID], (byte) 2, true, (byte) 58);
      }
   }

   void method1893(int var1, int var2, int var3) {
      this.anInt1717 = var1 * -1492563333;
      this.anInt1720 = var2 * 1660478651;
      if(this.aClass59_1716 != null) {
         RegionReference.method587(this.indexID * 663669877, this.aClass59_1716, this, 2119283429);
      } else {
         GroundItem.submitJs5Request(this, 255, this.indexID * 663669877, this.anInt1717 * 366281907, (byte) 0, true, (byte) 41);
      }
   }

   void method1895(int var1) {
      this.aBoolArray1713 = new boolean[this.archiveArray.length];

      int var2;
      for(var2 = 0; var2 < this.aBoolArray1713.length; ++var2) {
         this.aBoolArray1713[var2] = false;
      }

      if(null == this.aClass59_1719) {
         this.aBool1715 = true;
      } else {
         this.anInt1721 = -1749760423;

         for(var2 = 0; var2 < this.aBoolArray1713.length; ++var2) {
            if(this.fileCounts[var2] > 0) {
               IndexTable indexTable = this.aClass59_1719;
               CacheIndexRequest cacheIndexRequest = new CacheIndexRequest();
               cacheIndexRequest.anInt1759 = -1275722503;
               cacheIndexRequest.key = (long)var2;
               cacheIndexRequest.cacheIndexTable = indexTable;
               cacheIndexRequest.cacheIndex = this;
               Deque var6 = Class86.cacheIndexRequests;
               synchronized(var6) {
                  Class86.cacheIndexRequests.insertBack(cacheIndexRequest);
               }

               Class68.method930(2121484272);
               this.anInt1721 = var2 * 1749760423;
            }
         }

         if(-1 == this.anInt1721 * -1163272681) {
            this.aBool1715 = true;
         }
      }
   }

   int method1897(int var1, int var2) {
      return this.archiveArray[var1] == null?(!this.aBoolArray1713[var1]?NPC.method3169(this.indexID * 663669877, var1, -1749788887):100):100;
   }

   public int getTotalCompletion(int var1) {
      int var2 = 0;
      int var3 = 0;

      int var4;
      for(var4 = 0; var4 < this.archiveArray.length; ++var4) {
         if(this.fileCounts[var4] > 0) {
            var2 += 100;
            var3 += this.method1897(var4, -1548587273);
         }
      }

      if(0 == var2) {
         return 100;
      } else {
         var4 = var3 * 100 / var2;
         return var4;
      }
   }

   public int method1899(byte var1) {
      if(this.aBool1715) {
         return 100;
      } else if(this.archiveArray != null) {
         return 99;
      } else {
         int var2 = NPC.method3169(255, this.indexID * 663669877, -1337521135);
         if(var2 >= 100) {
            var2 = 99;
         }

         return var2;
      }
   }

   void pushCacheIndexRequest(int archiveID, byte[] data, boolean var3, boolean var4, int var5) {
      if(var3) {
         if(this.aBool1715) {
            throw new RuntimeException();
         } else {
            if(null != this.aClass59_1716) {
               int var14 = this.indexID * 663669877;
               IndexTable var15 = this.aClass59_1716;
               CacheIndexRequest cacheIndexRequest = new CacheIndexRequest();
               cacheIndexRequest.anInt1759 = 0;
               cacheIndexRequest.key = (long)var14;
               cacheIndexRequest.indexData = data;
               cacheIndexRequest.cacheIndexTable = var15;
               Deque var9 = Class86.cacheIndexRequests;
               synchronized(var9) {
                  Class86.cacheIndexRequests.insertBack(cacheIndexRequest);
               }

               Class68.method930(1610251632);
            }

            this.method1002(data, -1851065155);
            this.method1895(1252554325);
         }
      } else {
         data[data.length - 2] = (byte)(this.anIntArray934[archiveID] >> 8);
         data[data.length - 1] = (byte)this.anIntArray934[archiveID];
         if(this.aClass59_1719 != null) {
            IndexTable var6 = this.aClass59_1719;
            CacheIndexRequest cacheIndexRequest = new CacheIndexRequest();
            cacheIndexRequest.anInt1759 = 0;
            cacheIndexRequest.key = (long)archiveID;
            cacheIndexRequest.indexData = data;
            cacheIndexRequest.cacheIndexTable = var6;
            Deque var8 = Class86.cacheIndexRequests;
            synchronized(var8) {
               Class86.cacheIndexRequests.insertBack(cacheIndexRequest);
            }

            Class68.method930(779777068);
            this.aBoolArray1713[archiveID] = true;
         }

         if(var4) {
            this.archiveArray[archiveID] = Class108_Sub12.method1688(data, false, -2005327714);
         }
      }
   }

   public void method1906(IndexTable indexTable, int indexID, byte[] data, boolean var4, int var5) {
      int var6;
      if(this.aClass59_1716 == indexTable) {
         if(this.aBool1715) {
            throw new RuntimeException();
         } else if(data == null) {
            GroundItem.submitJs5Request(this, 255, this.indexID * 663669877, this.anInt1717 * 366281907, (byte) 0, true, (byte) 122);
         } else {
            aCRC32_1718.reset();
            aCRC32_1718.update(data, 0, data.length);
            var6 = (int)aCRC32_1718.getValue();
            RSByteBuffer var10 = new RSByteBuffer(RegionReference.method618(data));
            int var8 = var10.readUByte();
            if(5 != var8 && 6 != var8) {
               throw new RuntimeException("");
            } else {
               int var9 = 0;
               if(var8 >= 6) {
                  var9 = var10.readInt();
               }

               if(var6 == this.anInt1717 * 366281907 && var9 == this.anInt1720 * -1004552077) {
                  this.method1002(data, -1942605956);
                  this.method1895(-983603587);
               } else {
                  GroundItem.submitJs5Request(this, 255, this.indexID * 663669877, this.anInt1717 * 366281907, (byte) 0, true, (byte) 80);
               }
            }
         }
      } else {
         if(!var4 && indexID == this.anInt1721 * -1163272681) {
            this.aBool1715 = true;
         }

         if(data != null && data.length > 2) {
            aCRC32_1718.reset();
            aCRC32_1718.update(data, 0, data.length - 2);
            var6 = (int)aCRC32_1718.getValue();
            int var7 = ((data[data.length - 2] & 255) << 8) + (data[data.length - 1] & 255);
            if(var6 == this.anIntArray933[indexID] && var7 == this.anIntArray934[indexID]) {
               this.aBoolArray1713[indexID] = true;
               if(var4) {
                  this.archiveArray[indexID] = Class108_Sub12.method1688(data, false, -2005327714);
               }
            } else {
               this.aBoolArray1713[indexID] = false;
               if(this.aBool1714 || var4) {
                  GroundItem.submitJs5Request(this, this.indexID * 663669877, indexID, this.anIntArray933[indexID], (byte) 2, var4, (byte) 30);
               }
            }
         } else {
            this.aBoolArray1713[indexID] = false;
            if(this.aBool1714 || var4) {
               GroundItem.submitJs5Request(this, this.indexID * 663669877, indexID, this.anIntArray933[indexID], (byte) 2, var4, (byte) 20);
            }
         }
      }
   }

   public CacheIndex(IndexTable var1, IndexTable var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.aClass59_1719 = var1;
      this.aClass59_1716 = var2;
      this.indexID = var3 * -1845517347;
      this.aBool1714 = var6;
      Class84.method1119(this, this.indexID * 663669877, -252987119);
   }
}
