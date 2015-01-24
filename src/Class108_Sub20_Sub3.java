
public class Class108_Sub20_Sub3 extends CacheableNode {

   static CacheableNodeMap aClass106_1963 = new CacheableNodeMap(64);
   public int anInt1964 = 0;
   static Class14 aClass14_1965;
   public static AbstractIndex configIndexReference;


   void method2060(RSByteBuffer var1, short var2) {
      while(true) {
         int var3 = var1.readUByte();
         if(0 == var3) {
            return;
         }

         this.method2062(var1, var3, -683409398);
      }
   }

   void method2062(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 2) {
         this.anInt1964 = var1.readUShort(1851091175) * 1615379733;
      }
   }

}
