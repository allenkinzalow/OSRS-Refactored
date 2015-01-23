
public class VarpBit extends CacheableNode {

   static RGBSprite[] mapFunctionIcons;
   public int mostSigBit;
   public int leastSigBit;
   static AbstractIndex aClass74_1951;
   static int plane;
   public static AbstractIndex aClass74_1954;
   static CacheableNodeMap varpBitCache = new CacheableNodeMap(64);
   public int configId;

   public static VarpBit getVarpBitForID(int fileID, int var1) {
       VarpBit var2 = (VarpBit) varpBitCache.get((long) fileID);
       if (null != var2) {
           return var2;
       } else {
           byte[] var3 = aClass74_1951.getFile(14, fileID, (byte) 7);
           var2 = new VarpBit();
           if (var3 != null) {
               var2.decode(new RSByteBuffer(var3), (short) 5866);
           }

           varpBitCache.put(var2, (long) fileID);
           return var2;
       }
   }


   void decodeReadValues(RSByteBuffer buffer, int opcode, int var3) {
      if(1 == opcode) {
         this.configId = buffer.readUShort(-102576997) * 1654932959;
         this.leastSigBit = buffer.readUByte() * -656467759;
         this.mostSigBit = buffer.readUByte() * -865707143;
      }
   }

   void decode(RSByteBuffer buffer, short var2) {
      while(true) {
         int opcode = buffer.readUByte();
         if(0 == opcode) {
            return;
         }

         this.decodeReadValues(buffer, opcode, -1680889053);
      }
   }
}
