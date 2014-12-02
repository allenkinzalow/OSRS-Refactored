
public class Deque {

   Node aClass108_1434;
   public Node aClass108_1435 = new Node();


   public Node method1332() {
      Node var1 = this.aClass108_1435.previous;
      if(var1 == this.aClass108_1435) {
         this.aClass108_1434 = null;
         return null;
      } else {
         this.aClass108_1434 = var1.previous;
         return var1;
      }
   }

   public void method1333() {
      while(true) {
         Node var1 = this.aClass108_1435.nextNode;
         if(var1 == this.aClass108_1435) {
            this.aClass108_1434 = null;
            return;
         }

         var1.unlink();
      }
   }

   public void insertBack(Node var1) {
      if(var1.previous != null) {
         var1.unlink();
      }

      var1.previous = this.aClass108_1435.previous;
      var1.nextNode = this.aClass108_1435;
      var1.previous.nextNode = var1;
      var1.nextNode.previous = var1;
   }

   public static void method1336(Node var0, Node var1) {
      if(var0.previous != null) {
         var0.unlink();
      }

      var0.previous = var1.previous;
      var0.nextNode = var1;
      var0.previous.nextNode = var0;
      var0.nextNode.previous = var0;
   }

   public Node method1337() {
      Node var1 = this.aClass108_1435.nextNode;
      if(var1 == this.aClass108_1435) {
         return null;
      } else {
         var1.unlink();
         return var1;
      }
   }

   public Node method1338() {
      Node var1 = this.aClass108_1435.previous;
      if(var1 == this.aClass108_1435) {
         return null;
      } else {
         var1.unlink();
         return var1;
      }
   }

   public Node getFront() {
      Node var1 = this.aClass108_1435.nextNode;
      if(var1 == this.aClass108_1435) {
         this.aClass108_1434 = null;
         return null;
      } else {
         this.aClass108_1434 = var1.nextNode;
         return var1;
      }
   }

   public void insertFront(Node var1) {
      if(var1.previous != null) {
         var1.unlink();
      }

      var1.previous = this.aClass108_1435;
      var1.nextNode = this.aClass108_1435.nextNode;
      var1.previous.nextNode = var1;
      var1.nextNode.previous = var1;
   }

   public Node getNext() {
      Node var1 = this.aClass108_1434;
      if(var1 == this.aClass108_1435) {
         this.aClass108_1434 = null;
         return null;
      } else {
         this.aClass108_1434 = var1.nextNode;
         return var1;
      }
   }

   public Node method1342() {
      Node var1 = this.aClass108_1434;
      if(var1 == this.aClass108_1435) {
         this.aClass108_1434 = null;
         return null;
      } else {
         this.aClass108_1434 = var1.previous;
         return var1;
      }
   }

   public Deque() {
      this.aClass108_1435.nextNode = this.aClass108_1435;
      this.aClass108_1435.previous = this.aClass108_1435;
   }
}
