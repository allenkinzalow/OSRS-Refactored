
public class CacheableNode extends Node {

   public CacheableNode nextNode;
   public CacheableNode previousNode;


   public void method1982() {
      if(this.previousNode != null) {
         this.previousNode.nextNode = this.nextNode;
         this.nextNode.previousNode = this.previousNode;
         this.nextNode = null;
         this.previousNode = null;
      }
   }

}
