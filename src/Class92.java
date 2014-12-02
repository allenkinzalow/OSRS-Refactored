import java.util.Iterator;

public class Class92 implements Iterable {

   Node current = new Node();


   public void method1153(Node var1) {
      if(var1.previous != null) {
         var1.unlink();
      }

      var1.previous = this.current.previous;
      var1.nextNode = this.current;
      var1.previous.nextNode = var1;
      var1.nextNode.previous = var1;
   }

   public Node method1155() {
      return this.method1156((Node)null);
   }

   Node method1156(Node var1) {
      Node var2;
      if(var1 != null) {
         var2 = var1;
      } else {
         var2 = this.current.nextNode;
      }

      return var2 == this.current ? null : var2;
   }

   public Iterator iterator() {
      return new NodeIterator(this);
   }

   public Class92() {
      this.current.nextNode = this.current;
      this.current.previous = this.current;
   }
}
