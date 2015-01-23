import java.awt.Component;

public abstract class AbstractMouseWheel {


   static AbstractMouseWheel aAbstractMouseWheel_1585;

   public abstract int resetAndGetMouseRotation(int var1);

   static final void method980(Class108_Sub4 var0, byte var1) {
      var0.aBool1546 = false;
      if(null != var0.aClass108_Sub1_1545) {
         var0.aClass108_Sub1_1545.anInt1520 = 0;
      }

      for(Class108_Sub4 var2 = var0.method1608(); null != var2; var2 = var0.method1599()) {
         method980(var2, (byte)80);
      }

   }

   public abstract void removeListener(Component var1, int var2);

   public abstract void addListener(Component var1, short var2);
}
