
public class Node {

   public long key;
   public Node nextNode;
   Node previous;


   public boolean hasPrevious() {
      return this.previous != null;
   }

   public void unlink() {
      if(this.previous != null) {
         this.previous.nextNode = this.nextNode;
         this.nextNode.previous = this.previous;
         this.nextNode = null;
         this.previous = null;
      }
   }
}
