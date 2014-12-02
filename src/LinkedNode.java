
public class LinkedNode {

   LinkedNode previousNode;
   LinkedNode nextNode;


   public void remove() {
      if(this.nextNode != null) {
         this.nextNode.previousNode = this.previousNode;
         this.previousNode.nextNode = this.nextNode;
         this.previousNode = null;
         this.nextNode = null;
      }
   }

}
