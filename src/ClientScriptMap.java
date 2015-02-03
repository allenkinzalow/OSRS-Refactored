import java.io.IOException;

public class ClientScriptMap extends CacheableNode {

   public int csMapIntIdentifier;
   static CacheableNodeMap csMapCache = new CacheableNodeMap(64);
   public char aChar2053;
   public static AbstractIndex configIndexReference;
   public char aChar2055;
   public static SessionRequestWorker sessionRequestWorker;
   public String csMapStringIdentifier = "null";
   public int[] anIntArray2058;
   public int csMapValueCount = 0;
   public String[] csMapStringValues;
   static int anInt2063;
   public int[] csMapIntValues;


   public static ClientScriptMap getCSMapForID(int csMapID, int var1) {
      ClientScriptMap csMap = (ClientScriptMap) csMapCache.get((long) csMapID);
      if(csMap != null) {
         return csMap;
      } else {
         byte[] csMapData = configIndexReference.getFile(8, csMapID, (byte) 7);
         csMap = new ClientScriptMap();
         if(null != csMapData) {
            csMap.decode(new RSByteBuffer(csMapData), (short)-599);
         }

         csMapCache.put(csMap, (long) csMapID);
         return csMap;
      }
   }

   void decode(RSByteBuffer buffer, short var2) {
      while(true) {
         int opcode = buffer.readUByte();
         if(0 == opcode) {
            return;
         }

         this.decode(buffer, opcode, -1944612610);
      }
   }

   void decode(RSByteBuffer buffer, int opcode, int var3) {
      if(1 == opcode) {
         this.aChar2053 = (char)buffer.readUByte();
      } else if(2 == opcode) {
         this.aChar2055 = (char)buffer.readUByte();
      } else if(3 == opcode) {
         this.csMapStringIdentifier = buffer.getString_2((byte)8);
      } else if(4 == opcode) {
         this.csMapIntIdentifier = buffer.readInt() * -1217209501;
      } else {
         int var4;
         if(opcode == 5) {
            this.csMapValueCount = buffer.readUShort(2048882183) * 801211273;
            this.anIntArray2058 = new int[this.csMapValueCount * -1484660039];
            this.csMapStringValues = new String[this.csMapValueCount * -1484660039];

            for(var4 = 0; var4 < this.csMapValueCount * -1484660039; ++var4) {
               this.anIntArray2058[var4] = buffer.readInt();
               this.csMapStringValues[var4] = buffer.getString_2((byte)8);
            }

         } else if(opcode == 6) {
            this.csMapValueCount = buffer.readUShort(48811728) * 801211273;
            this.anIntArray2058 = new int[this.csMapValueCount * -1484660039];
            this.csMapIntValues = new int[this.csMapValueCount * -1484660039];

            for(var4 = 0; var4 < this.csMapValueCount * -1484660039; ++var4) {
               this.anIntArray2058[var4] = buffer.readInt();
               this.csMapIntValues[var4] = buffer.readInt();
            }

         }
      }
   }

   public static void method2171(boolean var0, int var1) {
      if(null != Class78.connection) {
         try {
            RSByteBuffer var2 = new RSByteBuffer(4);
            var2.writeByte(var0 ? 2 : 3);
            var2.writeTriByte(0);
            Class78.connection.writeBytes(var2.buf, 0, 4);
         } catch (IOException var5) {
            try {
               Class78.connection.disconnect();
            } catch (Exception var4) {
               ;
            }

            Class78.anInt1230 += 1249054009;
            Class78.connection = null;
         }
      }
   }

   static final void method2172(int var0, int var1, int var2, int var3, byte var4) {
      for(int var5 = 0; var5 < Client.anInt2907 * -792079877; ++var5) {
         if(Client.anIntArray2914[var5] + Client.anIntArray2912[var5] > var0 && Client.anIntArray2912[var5] < var0 + var2 && Client.anIntArray2913[var5] + Client.anIntArray2905[var5] > var1 && Client.anIntArray2913[var5] < var3 + var1) {
            Client.aBoolArray2909[var5] = true;
         }
      }

   }
}
