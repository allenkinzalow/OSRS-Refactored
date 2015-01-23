
public abstract class AbstractIndex {

   int[] fileCounts;
   int[] archiveIDs;
   public static final int anInt931 = 237;
   IndexVerifyTable indexVerifyTable;
   int[] anIntArray933;
   int[] anIntArray934;
   public int anInt935;
   static GZIPDecompressor aClass45_936 = new GZIPDecompressor();
   static final int anInt937 = 0;
   IndexVerifyTable[] aClass99Array938;
   Object[] archiveArray;
   int[][] fileSizes;
   int[] anIntArray941;
   int[][] anIntArrayArray942;
   boolean aBool943;
   boolean aBool944;
   static int anInt945 = 0;
   int archiveCount;
   Object[][] fileArray;
   static CacheIndex configIndex;


   public boolean containsArchive(int archiveID, byte var2) {
      if(this.archiveArray[archiveID] != null) {
         return true;
      } else {
         this.submitArchiveRequest(archiveID, 1582464033);
         return this.archiveArray[archiveID] != null;
      }
   }

   void method1002(byte[] var1, int var2) {
      this.anInt935 = ItemDefinition.method2124(var1, var1.length, 334099177) * 713775149;
      RSByteBuffer buffer = new RSByteBuffer(RegionReference.method618(var1));
      int type = buffer.readUByte();
      if(type >= 5 && type <= 7) {
         if(type >= 6) {
            buffer.readInt();
         }

         int var8 = buffer.readUByte();
         if(type >= 7) {
            this.archiveCount = buffer.method1776(278227056) * -1937958079;
         } else {
            this.archiveCount = buffer.readUShort(1381211110) * -1937958079;
         }

         int archivePosition = 0;
         int maxArchiveID = -1;
         this.archiveIDs = new int[this.archiveCount * -384469823];
         int archiveIDIndex;
         if(type >= 7) {
            for(int archiveIndex = 0; archiveIndex < this.archiveCount * -384469823; ++archiveIndex) {
               this.archiveIDs[archiveIndex] = archivePosition += buffer.method1776(126510212);
               if(this.archiveIDs[archiveIndex] > maxArchiveID) {
                  maxArchiveID = this.archiveIDs[archiveIndex];
               }
            }
         } else {
            for(int archiveIndex = 0; archiveIndex < this.archiveCount * -384469823; ++archiveIndex) {
               this.archiveIDs[archiveIndex] = archivePosition += buffer.readUShort(1921229882);
               if(this.archiveIDs[archiveIndex] > maxArchiveID) {
                  maxArchiveID = this.archiveIDs[archiveIndex];
               }
            }
         }

         this.anIntArray933 = new int[1 + maxArchiveID];
         this.anIntArray934 = new int[maxArchiveID + 1];
         this.fileCounts = new int[1 + maxArchiveID];
         this.fileSizes = new int[1 + maxArchiveID][];
         this.archiveArray = new Object[maxArchiveID + 1];
         this.fileArray = new Object[1 + maxArchiveID][];
         if(var8 != 0) {
            this.anIntArray941 = new int[maxArchiveID + 1];

            for(archiveIDIndex = 0; archiveIDIndex < this.archiveCount * -384469823; ++archiveIDIndex) {
               this.anIntArray941[this.archiveIDs[archiveIDIndex]] = buffer.readInt();
            }

            this.indexVerifyTable = new IndexVerifyTable(this.anIntArray941);
         }

         for(archiveIDIndex = 0; archiveIDIndex < this.archiveCount * -384469823; ++archiveIDIndex) {
            this.anIntArray933[this.archiveIDs[archiveIDIndex]] = buffer.readInt();
         }

         for(archiveIDIndex = 0; archiveIDIndex < this.archiveCount * -384469823; ++archiveIDIndex) {
            this.anIntArray934[this.archiveIDs[archiveIDIndex]] = buffer.readInt();
         }

         for(archiveIDIndex = 0; archiveIDIndex < this.archiveCount * -384469823; ++archiveIDIndex) {
            this.fileCounts[this.archiveIDs[archiveIDIndex]] = buffer.readUShort(-1459374212);
         }

         int fileID;
         int var10;
         int var11;
         int archiveID;
         int fileArraySize;
         if(type >= 7) {
            for(archiveIDIndex = 0; archiveIDIndex < this.archiveCount * -384469823; ++archiveIDIndex) {
               archiveID = this.archiveIDs[archiveIDIndex];
               int fileCount = this.fileCounts[archiveID];
               archivePosition = 0;
               int maxFileArraySize = -1;
               this.fileSizes[archiveID] = new int[fileCount];

               for(fileID = 0; fileID < fileCount; ++fileID) {
                  fileArraySize = this.fileSizes[archiveID][fileID] = archivePosition += buffer.method1776(2143095027);
                  if(fileArraySize > maxFileArraySize) {
                     maxFileArraySize = fileArraySize;
                  }
               }

               this.fileArray[archiveID] = new Object[1 + maxFileArraySize];
            }
         } else {
            for(archiveIDIndex = 0; archiveIDIndex < this.archiveCount * -384469823; ++archiveIDIndex) {
               archiveID = this.archiveIDs[archiveIDIndex];
               int fileCount = this.fileCounts[archiveID];
               archivePosition = 0;
               int maxFileArraySize = -1;
               this.fileSizes[archiveID] = new int[fileCount];

               for(fileID = 0; fileID < fileCount; ++fileID) {
                  fileArraySize = this.fileSizes[archiveID][fileID] = archivePosition += buffer.readUShort(99864165);
                  if(fileArraySize > maxFileArraySize) {
                     maxFileArraySize = fileArraySize;
                  }
               }

               this.fileArray[archiveID] = new Object[maxFileArraySize + 1];
            }
         }

         if(0 != var8) {
            this.anIntArrayArray942 = new int[1 + maxArchiveID][];
            this.aClass99Array938 = new IndexVerifyTable[maxArchiveID + 1];

            for(archiveIDIndex = 0; archiveIDIndex < this.archiveCount * -384469823; ++archiveIDIndex) {
               archiveID = this.archiveIDs[archiveIDIndex];
               var10 = this.fileCounts[archiveID];
               this.anIntArrayArray942[archiveID] = new int[this.fileArray[archiveID].length];

               for(var11 = 0; var11 < var10; ++var11) {
                  this.anIntArrayArray942[archiveID][this.fileSizes[archiveID][var11]] = buffer.readInt();
               }

               this.aClass99Array938[archiveID] = new IndexVerifyTable(this.anIntArrayArray942[archiveID]);
            }

         }
      } else {
         throw new RuntimeException("");
      }
   }

   void method1003(int var1, int var2) {}

   public byte[] getFile(int var1, int var2, byte var3) {
      return this.getFileData(var1, var2, (int[])null);
   }

   public int getArchiveIDForName(String var1, int var2) {
      var1 = var1.toLowerCase();
      return this.indexVerifyTable.method1297(MouseInputHandler.method769(var1, 1236215295));
   }

   public boolean containsFile(int archiveID, int fileID, int var3) {
      if(archiveID >= 0 && archiveID < this.fileArray.length && this.fileArray[archiveID] != null && fileID >= 0 && fileID < this.fileArray[archiveID].length) {
         if(this.fileArray[archiveID][fileID] == null) {
            if(null != this.archiveArray[archiveID]) {
               return true;
            } else {
               this.submitArchiveRequest(archiveID, 1582464033);
               return this.archiveArray[archiveID] != null;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public byte[] getFirstData(int id, int var2) {
      if(1 == this.fileArray.length) {
         return this.getFile(0, id, (byte) 7);
      } else if(1 == this.fileArray[id].length) {
         return this.getFile(id, 0, (byte) 7);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] getFileData(int archiveID, int fileID, int var3) {
      if(archiveID >= 0 && archiveID < this.fileArray.length && this.fileArray[archiveID] != null && fileID >= 0 && fileID < this.fileArray[archiveID].length) {
         if(null == this.fileArray[archiveID][fileID]) {
            boolean var4 = this.method1018(archiveID, (int[])null);
            if(!var4) {
               this.submitArchiveRequest(archiveID, 1582464033);
               var4 = this.method1018(archiveID, (int[])null);
               if(!var4) {
                  return null;
               }
            }
         }

         byte[] fileData = PlainTile.fileToByteArray(this.fileArray[archiveID][fileID], false, -1516256446);
         return fileData;
      } else {
         return null;
      }
   }

   public byte[] getFirstData_2(int archiveID, int var2) {
      if(this.fileArray.length == 1) {
         return this.getFileData(0, archiveID, -43111857);
      } else if(1 == this.fileArray[archiveID].length) {
         return this.getFileData(archiveID, 0, -682200737);
      } else {
         throw new RuntimeException();
      }
   }

   public int[] method1013(int var1) {
      return this.fileSizes[var1];
   }

   public int getFileCount(int archiveID) {
      return this.fileArray[archiveID].length;
   }

   public int getArchiveCount() {
      return this.fileArray.length;
   }

   public void resetCachedIndex() {
      for(int archiveID = 0; archiveID < this.fileArray.length; ++archiveID) {
         if(null != this.fileArray[archiveID]) {
            for(int fileID = 0; fileID < this.fileArray[archiveID].length; ++fileID) {
               this.fileArray[archiveID][fileID] = null;
            }
         }
      }

   }

   boolean method1018(int archiveID, int[] var2) {
      if(null == this.archiveArray[archiveID]) {
         return false;
      } else {
         int fileCount = this.fileCounts[archiveID];
         int[] var5 = this.fileSizes[archiveID];
         Object[] files = this.fileArray[archiveID];
         boolean loaded = true;

         for(int file = 0; file < fileCount; ++file) {
            if(files[var5[file]] == null) {
               loaded = false;
               break;
            }
         }

         if(loaded) {
            return true; 
         } else {
            byte[] fileData;
            if(var2 != null && (0 != var2[0] || var2[1] != 0 || var2[2] != 0 || 0 != var2[3])) {
               fileData = PlainTile.fileToByteArray(this.archiveArray[archiveID], true, -1516256446);
               RSByteBuffer buffer = new RSByteBuffer(fileData);
               buffer.method1735(var2, 5, buffer.buf.length, (byte)43);
            } else {
               fileData = PlainTile.fileToByteArray(this.archiveArray[archiveID], false, -1516256446);
            }

            byte[] var20 = RegionReference.method618(fileData);
            if(this.aBool943) {
               this.archiveArray[archiveID] = null;
            }

            if(fileCount > 1) {
               int var10 = var20.length;
               --var10;
               int var11 = var20[var10] & 255;
               var10 -= var11 * fileCount * 4;
               RSByteBuffer var12 = new RSByteBuffer(var20);
               int[] var13 = new int[fileCount];
               var12.position = var10 * 537964811;

               int var15;
               int var16;
               for(int var14 = 0; var14 < var11; ++var14) {
                  var15 = 0;

                  for(var16 = 0; var16 < fileCount; ++var16) {
                     var15 += var12.readInt();
                     var13[var16] += var15;
                  }
               }

               byte[][] var21 = new byte[fileCount][];

               for(var15 = 0; var15 < fileCount; ++var15) {
                  var21[var15] = new byte[var13[var15]];
                  var13[var15] = 0;
               }

               var12.position = var10 * 537964811;
               var15 = 0;

               for(var16 = 0; var16 < var11; ++var16) {
                  int var17 = 0;

                  for(int var18 = 0; var18 < fileCount; ++var18) {
                     var17 += var12.readInt();
                     System.arraycopy(var20, var15, var21[var18], var13[var18], var17);
                     var13[var18] += var17;
                     var15 += var17;
                  }
               }

               for(var16 = 0; var16 < fileCount; ++var16) {
                  if(!this.aBool944) {
                     files[var5[var16]] = Class108_Sub12.method1688(var21[var16], false, -2005327714);
                  } else {
                     files[var5[var16]] = var21[var16];
                  }
               }
            } else if(!this.aBool944) {
               files[var5[0]] = Class108_Sub12.method1688(var20, false, -2005327714);
            } else {
               files[var5[0]] = var20;
            }

            return true;
         }
      }
   }

   public boolean loadArchive(byte var1) {
      boolean loaded = true;

      for(int archiveIndex = 0; archiveIndex < this.archiveIDs.length; ++archiveIndex) {
         int archiveID = this.archiveIDs[archiveIndex];
         if(this.archiveArray[archiveID] == null) {
            this.submitArchiveRequest(archiveID, 1582464033);
            if(this.archiveArray[archiveID] == null) {
               loaded = false;
            }
         }
      }

      return loaded;
   }

   public int getFileIDForName(int archiveID, String fileName) {
      fileName = fileName.toLowerCase();
      return this.aClass99Array938[archiveID].method1297(MouseInputHandler.method769(fileName, 1781542716));
   }

   public byte[] getFileForArchiveFileName(String archiveName, String fileName) {
      archiveName = archiveName.toLowerCase(); 
      fileName = fileName.toLowerCase();
      int archiveID = this.indexVerifyTable.method1297(MouseInputHandler.method769(archiveName, 1686405236));
      int fileID = this.aClass99Array938[archiveID].method1297(MouseInputHandler.method769(fileName, 1980045206));
      return this.getFile(archiveID, fileID, (byte) 7);
   }

   public boolean containsFileForAFName(String archiveName, String fileName) {
      archiveName = archiveName.toLowerCase();
      fileName = fileName.toLowerCase();
      int archiveID = this.indexVerifyTable.method1297(MouseInputHandler.method769(archiveName, 666119525));
      int fileID = this.aClass99Array938[archiveID].method1297(MouseInputHandler.method769(fileName, 1596686626));
      return this.containsFile(archiveID, fileID, 1151584293);
   }

   public boolean containsFileForEmptyArchiveName(String fileName) {
      int var3 = this.getArchiveIDForName("", 1723285154);
      return -1 != var3 ? this.containsFileForAFName("", fileName) : this.containsFileForAFName(fileName, "");
   }

   public void loadArchiveForName(String archiveName) {
      archiveName = archiveName.toLowerCase();
      int archiveID = this.indexVerifyTable.method1297(MouseInputHandler.method769(archiveName, 1938534825));
      if(archiveID >= 0) {
         this.method1003(archiveID, -2065170626);
      }
   }

   public void method1026(int archiveID, byte var2) {
      for(int fileID = 0; fileID < this.fileArray[archiveID].length; ++fileID) {
         if(var2 <= -1) {
            return;
         }

         this.fileArray[archiveID][fileID] = null;
      }

   }

   public byte[] getFileData(int archiveID, int fileID, int[] var3) {
      if(archiveID >= 0 && archiveID < this.fileArray.length && null != this.fileArray[archiveID] && fileID >= 0 && fileID < this.fileArray[archiveID].length) {
         if(this.fileArray[archiveID][fileID] == null) {
            boolean found = this.method1018(archiveID, var3);
            if(!found) {
               this.submitArchiveRequest(archiveID, 1582464033);
               found = this.method1018(archiveID, var3);
               if(!found) {
                  return null;
               }
            }
         }

         byte[] fileData = PlainTile.fileToByteArray(this.fileArray[archiveID][fileID], false, -1516256446);
         if(this.aBool944) {
            this.fileArray[archiveID][fileID] = null;
         }

         return fileData;
      } else {
         return null;
      }
   }

   AbstractIndex(boolean var1, boolean var2) {
      this.aBool943 = var1;
      this.aBool944 = var2;
   }

   void submitArchiveRequest(int var1, int var2) {}

}
