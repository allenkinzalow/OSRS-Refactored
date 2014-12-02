
public class LinkedList {

   LinkedNode current;
   LinkedNode head = new LinkedNode();


   public LinkedList() {
      this.head.previousNode = this.head;
      this.head.nextNode = this.head;
   }

   public LinkedNode getBack() {
      LinkedNode var1 = this.head.previousNode;
      if(var1 == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previousNode;
         return var1;
      }
   }

   public LinkedNode getPrevious() {
      LinkedNode var1 = this.current;
      if(var1 == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previousNode;
         return var1;
      }
   }

   public void insertBack(LinkedNode var1) {
      if(var1.nextNode != null) {
         var1.remove();
      }

      var1.nextNode = this.head.nextNode;
      var1.previousNode = this.head;
      var1.nextNode.previousNode = var1;
      var1.previousNode.nextNode = var1;
   }
}
