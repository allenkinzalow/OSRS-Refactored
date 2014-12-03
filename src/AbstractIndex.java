
public abstract class AbstractIndex {

   int[] fileCount;
   int[] archiveIDs;
   public static final int anInt931 = 237;
   LookupTable aClass99_932;
   int[] anIntArray933;
   int[] anIntArray934;
   public int anInt935;
   static GZIPDecompressor aClass45_936 = new GZIPDecompressor();
   static final int anInt937 = 0;
   LookupTable[] aClass99Array938;
   Object[] archiveArray;
   int[][] anIntArrayArray940;
   int[] anIntArray941;
   int[][] anIntArrayArray942;
   boolean aBool943;
   boolean aBool944;
   static int anInt945 = 0;
   int anInt946;
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
      RSByteBuffer buffer = new RSByteBuffer(RegionReference.method618(var1, (byte)-125));
      int var6 = buffer.readUByte();
      if(var6 >= 5 && var6 <= 7) {
         if(var6 >= 6) {
            buffer.readInt();
         }

         int var8 = buffer.readUByte();
         if(var6 >= 7) {
            this.anInt946 = buffer.method1776(278227056) * -1937958079;
         } else {
            this.anInt946 = buffer.readUShort(1381211110) * -1937958079;
         }

         int var4 = 0;
         int var7 = -1;
         this.archiveIDs = new int[this.anInt946 * -384469823];
         int var3;
         if(var6 >= 7) {
            for(var3 = 0; var3 < this.anInt946 * -384469823; ++var3) {
               this.archiveIDs[var3] = var4 += buffer.method1776(126510212);
               if(this.archiveIDs[var3] > var7) {
                  var7 = this.archiveIDs[var3];
               }
            }
         } else {
            for(var3 = 0; var3 < this.anInt946 * -384469823; ++var3) {
               this.archiveIDs[var3] = var4 += buffer.readUShort(1921229882);
               if(this.archiveIDs[var3] > var7) {
                  var7 = this.archiveIDs[var3];
               }
            }
         }

         this.anIntArray933 = new int[1 + var7];
         this.anIntArray934 = new int[var7 + 1];
         this.fileCount = new int[1 + var7];
         this.anIntArrayArray940 = new int[1 + var7][];
         this.archiveArray = new Object[var7 + 1];
         this.fileArray = new Object[1 + var7][];
         if(var8 != 0) {
            this.anIntArray941 = new int[var7 + 1];

            for(var3 = 0; var3 < this.anInt946 * -384469823; ++var3) {
               this.anIntArray941[this.archiveIDs[var3]] = buffer.readInt();
            }

            this.aClass99_932 = new LookupTable(this.anIntArray941);
         }

         for(var3 = 0; var3 < this.anInt946 * -384469823; ++var3) {
            this.anIntArray933[this.archiveIDs[var3]] = buffer.readInt();
         }

         for(var3 = 0; var3 < this.anInt946 * -384469823; ++var3) {
            this.anIntArray934[this.archiveIDs[var3]] = buffer.readInt();
         }

         for(var3 = 0; var3 < this.anInt946 * -384469823; ++var3) {
            this.fileCount[this.archiveIDs[var3]] = buffer.readUShort(-1459374212);
         }

         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         if(var6 >= 7) {
            for(var3 = 0; var3 < this.anInt946 * -384469823; ++var3) {
               var12 = this.archiveIDs[var3];
               var10 = this.fileCount[var12];
               var4 = 0;
               var11 = -1;
               this.anIntArrayArray940[var12] = new int[var10];

               for(var9 = 0; var9 < var10; ++var9) {
                  var13 = this.anIntArrayArray940[var12][var9] = var4 += buffer.method1776(2143095027);
                  if(var13 > var11) {
                     var11 = var13;
                  }
               }

               this.fileArray[var12] = new Object[1 + var11];
            }
         } else {
            for(var3 = 0; var3 < this.anInt946 * -384469823; ++var3) {
               var12 = this.archiveIDs[var3];
               var10 = this.fileCount[var12];
               var4 = 0;
               var11 = -1;
               this.anIntArrayArray940[var12] = new int[var10];

               for(var9 = 0; var9 < var10; ++var9) {
                  var13 = this.anIntArrayArray940[var12][var9] = var4 += buffer.readUShort(99864165);
                  if(var13 > var11) {
                     var11 = var13;
                  }
               }

               this.fileArray[var12] = new Object[var11 + 1];
            }
         }

         if(0 != var8) {
            this.anIntArrayArray942 = new int[1 + var7][];
            this.aClass99Array938 = new LookupTable[var7 + 1];

            for(var3 = 0; var3 < this.anInt946 * -384469823; ++var3) {
               var12 = this.archiveIDs[var3];
               var10 = this.fileCount[var12];
               this.anIntArrayArray942[var12] = new int[this.fileArray[var12].length];

               for(var11 = 0; var11 < var10; ++var11) {
                  this.anIntArrayArray942[var12][this.anIntArrayArray940[var12][var11]] = buffer.readInt();
               }

               this.aClass99Array938[var12] = new LookupTable(this.anIntArrayArray942[var12]);
            }

         }
      } else {
         throw new RuntimeException("");
      }
   }

   void method1003(int var1, int var2) {}

   public byte[] getFile(int var1, int var2, byte var3) {
      return this.getFileData(var1, var2, (int[])null, 116632074);
   }

   public int method1005(String var1, int var2) {
      var1 = var1.toLowerCase();
      return this.aClass99_932.method1297(MouseInputHandler.method769(var1, 1236215295));
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
            boolean var4 = this.method1018(archiveID, (int[])null, 3443778);
            if(!var4) {
               this.submitArchiveRequest(archiveID, 1582464033);
               var4 = this.method1018(archiveID, (int[])null, -11145031);
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

   public int[] method1013(int var1, int var2) {
      return this.anIntArrayArray940[var1];
   }

   public int getFileCount(int archiveID, byte var2) {
      return this.fileArray[archiveID].length;
   }

   public int getArchiveCount(int var1) {
      return this.fileArray.length;
   }

   public void resetCachedIndex(int var1) {
      for(int archiveID = 0; archiveID < this.fileArray.length; ++archiveID) {
         if(null != this.fileArray[archiveID]) {
            for(int fileID = 0; fileID < this.fileArray[archiveID].length; ++fileID) {
               this.fileArray[archiveID][fileID] = null;
            }
         }
      }

   }

   boolean method1018(int archiveID, int[] var2, int var3) {
      if(null == this.archiveArray[archiveID]) {
         return false;
      } else {
         int fileCount = this.fileCount[archiveID];
         int[] var5 = this.anIntArrayArray940[archiveID];
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

            byte[] var20 = RegionReference.method618(fileData, (byte)-28);
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

   public int getFileForName(int archiveID, String fileName, byte var3) {
      fileName = fileName.toLowerCase();
      return this.aClass99Array938[archiveID].method1297(MouseInputHandler.method769(fileName, 1781542716));
   }

   public byte[] getFileForArchiveFileName(String archiveName, String fileName, int var3) {
      archiveName = archiveName.toLowerCase(); 
      fileName = fileName.toLowerCase();
      int archiveID = this.aClass99_932.method1297(MouseInputHandler.method769(archiveName, 1686405236));
      int fileID = this.aClass99Array938[archiveID].method1297(MouseInputHandler.method769(fileName, 1980045206));
      return this.getFile(archiveID, fileID, (byte) 7);
   }

   public boolean containsFileForAFName(String archiveName, String fileName, int var3) {
      archiveName = archiveName.toLowerCase();
      fileName = fileName.toLowerCase();
      int archiveID = this.aClass99_932.method1297(MouseInputHandler.method769(archiveName, 666119525));
      int fileID = this.aClass99Array938[archiveID].method1297(MouseInputHandler.method769(fileName, 1596686626));
      return this.containsFile(archiveID, fileID, 1151584293);
   }

   public boolean containsFileForEmptyArchiveName(String fileName, int var2) {
      int var3 = this.method1005("", 1723285154);
      return -1 != var3 ? this.containsFileForAFName("", fileName, 1762783011) : this.containsFileForAFName(fileName, "", 1762783011);
   }

   public void method1024(String archiveName, int var2) {
      archiveName = archiveName.toLowerCase();
      int archiveID = this.aClass99_932.method1297(MouseInputHandler.method769(archiveName, 1938534825));
      if(archiveID >= 0) {
         this.method1003(archiveID, -2065170626);
      }
   }

   public void method1026(int archiveID, byte var2) {
      for(int var3 = 0; var3 < this.fileArray[archiveID].length; ++var3) {
         if(var2 <= -1) {
            return;
         }

         this.fileArray[archiveID][var3] = null;
      }

   }

   public byte[] getFileData(int archiveID, int fileID, int[] var3, int var4) {
      if(archiveID >= 0 && archiveID < this.fileArray.length && null != this.fileArray[archiveID] && fileID >= 0 && fileID < this.fileArray[archiveID].length) {
         if(this.fileArray[archiveID][fileID] == null) {
            boolean found = this.method1018(archiveID, var3, 44065684);
            if(!found) {
               this.submitArchiveRequest(archiveID, 1582464033);
               found = this.method1018(archiveID, var3, 1814808561);
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

   public static boolean method1073(int interfaceID, int var1) {
      if(RSInterface.interfacesLoadedArray[interfaceID]) {
         return true;
      } else if(!RSInterface.interfaceIndexReference.containsArchive(interfaceID, (byte)-25)) {
         return false;
      } else {
         int componentCount = RSInterface.interfaceIndexReference.getFileCount(interfaceID, (byte)-48);
         if(componentCount == 0) {
            RSInterface.interfacesLoadedArray[interfaceID] = true;
            return true;
         } else {
            if(null == RSInterface.interface_cache[interfaceID]) {
               RSInterface.interface_cache[interfaceID] = new RSInterface[componentCount];
            }

            for(int component = 0; component < componentCount; ++component) {
               if(null == RSInterface.interface_cache[interfaceID][component]) {
                  byte[] componentData = RSInterface.interfaceIndexReference.getFile(interfaceID, component, (byte) 7);
                  if(null != componentData) {
                     RSInterface.interface_cache[interfaceID][component] = new RSInterface();
                     RSInterface.interface_cache[interfaceID][component].interfaceHash = (component + (interfaceID << 16)) * -585455939;
                     if(componentData[0] == -1) {
                        RSInterface.interface_cache[interfaceID][component].decodeActiveInterface(new RSByteBuffer(componentData), 1019707415);
                     } else {
                        RSInterface.interface_cache[interfaceID][component].decodeInterface(new RSByteBuffer(componentData), 1016246501);
                     }
                  }
               }
            }

            RSInterface.interfacesLoadedArray[interfaceID] = true;
            return true;
         }
      }
   }
}
