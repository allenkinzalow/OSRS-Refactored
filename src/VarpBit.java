
public class VarpBit extends CacheableNode {

   static RGBSprite[] mapFunctionIcons;
   public int mostSigBit;
   public int leastSigBit;
   static AbstractIndex aClass74_1951;
   static int plane;
   public static AbstractIndex aClass74_1954;
   static CacheableNodeMap aClass106_1955 = new CacheableNodeMap(64);
   public int configId;


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
