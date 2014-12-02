
public final class Queue {

   CacheableNode aClass108_Sub20_1375 = new CacheableNode();


   public void method1282(CacheableNode var1) {
      if(var1.previousNode != null) {
         var1.method1982();
      }

      var1.previousNode = this.aClass108_Sub20_1375.previousNode;
      var1.nextNode = this.aClass108_Sub20_1375;
      var1.previousNode.nextNode = var1;
      var1.nextNode.previousNode = var1;
   }

   public void method1283(CacheableNode var1) {
      if(var1.previousNode != null) {
         var1.method1982();
      }

      var1.previousNode = this.aClass108_Sub20_1375;
      var1.nextNode = this.aClass108_Sub20_1375.nextNode;
      var1.previousNode.nextNode = var1;
      var1.nextNode.previousNode = var1;
   }

   CacheableNode method1284() {
      CacheableNode var1 = this.aClass108_Sub20_1375.nextNode;
      if(var1 == this.aClass108_Sub20_1375) {
         return null;
      } else {
         var1.method1982();
         return var1;
      }
   }

   void method1286() {
      while(true) {
         CacheableNode var1 = this.aClass108_Sub20_1375.nextNode;
         if(var1 == this.aClass108_Sub20_1375) {
            return;
         }

         var1.method1982();
      }
   }

   public Queue() {
      this.aClass108_Sub20_1375.nextNode = this.aClass108_Sub20_1375;
      this.aClass108_Sub20_1375.previousNode = this.aClass108_Sub20_1375;
   }

   public CacheableNode method1295() {
      CacheableNode var1 = this.aClass108_Sub20_1375.nextNode;
      return var1 == this.aClass108_Sub20_1375?null:var1;
   }
}
