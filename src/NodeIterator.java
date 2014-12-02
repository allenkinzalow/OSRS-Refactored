import java.util.Iterator;

public class NodeIterator implements Iterator {

   Class92 aClass92_1469;
   Node aClass108_1470;
   Node aClass108_1471 = null;


   public boolean hasNext() {
      return this.aClass108_1470 != this.aClass92_1469.current;
   }

   public Object next() {
      Node var1 = this.aClass108_1470;
      if(var1 == this.aClass92_1469.current) {
         var1 = null;
         this.aClass108_1470 = null;
      } else {
         this.aClass108_1470 = var1.nextNode;
      }

      this.aClass108_1471 = var1;
      return var1;
   }

   public void remove() {
      if(this.aClass108_1471 == null) {
         throw new IllegalStateException();
      } else {
         this.aClass108_1471.unlink();
         this.aClass108_1471 = null;
      }
   }

   NodeIterator(Class92 var1) {
      this.aClass92_1469 = var1;
      this.aClass108_1470 = this.aClass92_1469.current.nextNode;
      this.aClass108_1471 = null;
   }
}
