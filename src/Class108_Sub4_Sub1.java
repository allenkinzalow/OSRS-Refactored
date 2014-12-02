
public class Class108_Sub4_Sub1 extends Class108_Sub4 {

   int anInt1958 = -1;
   Deque aClass105_1959 = new Deque();
   int anInt1960 = 0;
   Deque aClass105_1961 = new Deque();


   public final synchronized void method2037(Class108_Sub4 var1) {
      var1.unlink();
   }

   void method2039() {
      if(this.anInt1960 > 0) {
         for(Class108_Sub3 var1 = (Class108_Sub3)this.aClass105_1961.getFront(); var1 != null; var1 = (Class108_Sub3)this.aClass105_1961.getNext()) {
            var1.anInt1536 -= this.anInt1960;
         }

         this.anInt1958 -= this.anInt1960;
         this.anInt1960 = 0;
      }
   }

   void method2040(Node var1, Class108_Sub3 var2) {
      while(var1 != this.aClass105_1961.aClass108_1435 && ((Class108_Sub3)var1).anInt1536 <= var2.anInt1536) {
         var1 = var1.nextNode;
      }

      Deque.method1336(var2, var1);
      this.anInt1958 = ((Class108_Sub3)this.aClass105_1961.aClass108_1435.nextNode).anInt1536;
   }

   void method2041(Class108_Sub3 var1) {
      var1.unlink();
      var1.method1567();
      Node var2 = this.aClass105_1961.aClass108_1435.nextNode;
      if(var2 == this.aClass105_1961.aClass108_1435) {
         this.anInt1958 = -1;
      } else {
         this.anInt1958 = ((Class108_Sub3)var2).anInt1536;
      }
   }

   protected int method1598() {
      return 0;
   }

   public final synchronized void method1601(int[] var1, int var2, int var3) {
      do {
         if(this.anInt1958 < 0) {
            this.method2045(var1, var2, var3);
            return;
         }

         if(this.anInt1960 + var3 < this.anInt1958) {
            this.anInt1960 += var3;
            this.method2045(var1, var2, var3);
            return;
         }

         int var4 = this.anInt1958 - this.anInt1960;
         this.method2045(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.anInt1960 += var4;
         this.method2039();
         Class108_Sub3 var5 = (Class108_Sub3)this.aClass105_1961.getFront();
         synchronized(var5) {
            int var7 = var5.method1562(this);
            if(var7 < 0) {
               var5.anInt1536 = 0;
               this.method2041(var5);
            } else {
               var5.anInt1536 = var7;
               this.method2040(var5.nextNode, var5);
            }
         }
      } while(var3 != 0);

   }

   void method2043(int var1) {
      for(Class108_Sub4 var2 = (Class108_Sub4)this.aClass105_1959.getFront(); var2 != null; var2 = (Class108_Sub4)this.aClass105_1959.getNext()) {
         var2.method1602(var1);
      }

   }

   void method2045(int[] var1, int var2, int var3) {
      for(Class108_Sub4 var4 = (Class108_Sub4)this.aClass105_1959.getFront(); var4 != null; var4 = (Class108_Sub4)this.aClass105_1959.getNext()) {
         var4.method1607(var1, var2, var3);
      }

   }

   public final synchronized void method2050(Class108_Sub4 var1) {
      this.aClass105_1959.insertFront(var1);
   }

   public final synchronized void method1602(int var1) {
      do {
         if(this.anInt1958 < 0) {
            this.method2043(var1);
            return;
         }

         if(this.anInt1960 + var1 < this.anInt1958) {
            this.anInt1960 += var1;
            this.method2043(var1);
            return;
         }

         int var2 = this.anInt1958 - this.anInt1960;
         this.method2043(var2);
         var1 -= var2;
         this.anInt1960 += var2;
         this.method2039();
         Class108_Sub3 var3 = (Class108_Sub3)this.aClass105_1961.getFront();
         synchronized(var3) {
            int var5 = var3.method1562(this);
            if(var5 < 0) {
               var3.anInt1536 = 0;
               this.method2041(var3);
            } else {
               var3.anInt1536 = var5;
               this.method2040(var3.nextNode, var3);
            }
         }
      } while(var1 != 0);

   }

   protected Class108_Sub4 method1599() {
      return (Class108_Sub4)this.aClass105_1959.getNext();
   }

   protected Class108_Sub4 method1608() {
      return (Class108_Sub4)this.aClass105_1959.getFront();
   }
}
