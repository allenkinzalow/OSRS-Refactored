
public abstract class Class108_Sub4 extends Node {

   int anInt1543;
   Class108_Sub4 aClass108_Sub4_1544;
   Class108_Sub1 aClass108_Sub1_1545;
   volatile boolean aBool1546 = true;


   int method1596() {
      return 255;
   }

   protected abstract int method1598();

   protected abstract Class108_Sub4 method1599();

   protected abstract void method1601(int[] var1, int var2, int var3);

   protected abstract void method1602(int var1);

   final void method1607(int[] var1, int var2, int var3) {
      if(!this.aBool1546) {
         this.method1602(var3);
      } else {
         this.method1601(var1, var2, var3);
      }
   }

   protected abstract Class108_Sub4 method1608();
}
