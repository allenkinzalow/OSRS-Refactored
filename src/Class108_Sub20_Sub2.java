
public class Class108_Sub20_Sub2 extends CacheableNode {

   static final int anInt1947 = 38;
   static RGBSprite[] mapFunctionIcons;
   public int anInt1949;
   public int anInt1950;
   static AbstractIndex aClass74_1951;
   public static final int anInt1952 = 80;
   static int plane;
   public static AbstractIndex aClass74_1954;
   static CacheableNodeMap aClass106_1955 = new CacheableNodeMap(64);
   public static final int anInt1956 = 39;
   public int anInt1957;


   void decodeReadValues(RSByteBuffer buffer, int opcode, int var3) {
      if(1 == opcode) {
         this.anInt1957 = buffer.readUShort(-102576997) * 1654932959;
         this.anInt1950 = buffer.readUByte() * -656467759;
         this.anInt1949 = buffer.readUByte() * -865707143;
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
