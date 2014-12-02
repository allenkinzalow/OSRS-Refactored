import java.util.Iterator;

public class Class107 implements Iterator {

   Class97 aClass97_1441;
   CacheableNode aClass108_Sub20_1442;
   CacheableNode aClass108_Sub20_1443 = null;


   public boolean hasNext() {
      return this.aClass108_Sub20_1442 != this.aClass97_1441.aClass108_Sub20_1374;
   }

   public Object next() {
      CacheableNode var1 = this.aClass108_Sub20_1442;
      if(var1 == this.aClass97_1441.aClass108_Sub20_1374) {
         var1 = null;
         this.aClass108_Sub20_1442 = null;
      } else {
         this.aClass108_Sub20_1442 = var1.nextNode;
      }

      this.aClass108_Sub20_1443 = var1;
      return var1;
   }

   public void remove() {
      if(this.aClass108_Sub20_1443 != null) {
         this.aClass108_Sub20_1443.method1982();
         this.aClass108_Sub20_1443 = null;
      } else {
         throw new IllegalStateException();
      }
   }

   Class107(Class97 var1) {
      this.aClass97_1441 = var1;
      this.aClass108_Sub20_1442 = this.aClass97_1441.aClass108_Sub20_1374.nextNode;
      this.aClass108_Sub20_1443 = null;
   }
}
