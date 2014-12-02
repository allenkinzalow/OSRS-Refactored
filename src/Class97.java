import java.util.Iterator;

public class Class97 implements Iterable {

   public CacheableNode aClass108_Sub20_1374 = new CacheableNode();


   public Class97() {
      this.aClass108_Sub20_1374.nextNode = this.aClass108_Sub20_1374;
      this.aClass108_Sub20_1374.previousNode = this.aClass108_Sub20_1374;
   }

   public void method1272() {
      while(this.aClass108_Sub20_1374.nextNode != this.aClass108_Sub20_1374) {
         this.aClass108_Sub20_1374.nextNode.method1982();
      }

   }

   public void method1273(CacheableNode var1) {
      if(var1.previousNode != null) {
         var1.method1982();
      }

      var1.previousNode = this.aClass108_Sub20_1374.previousNode;
      var1.nextNode = this.aClass108_Sub20_1374;
      var1.previousNode.nextNode = var1;
      var1.nextNode.previousNode = var1;
   }

   public Iterator iterator() {
      return new Class107(this);
   }
}
