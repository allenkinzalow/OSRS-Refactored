import java.util.Iterator;

public final class Class95 implements Iterable {

   Node[] cache;
   Node aClass108_1358;
   int size;


   public Node method1202(long var1) {
      Node var3 = this.cache[(int)(var1 & (long)(this.size - 1))];

      for(this.aClass108_1358 = var3.nextNode; this.aClass108_1358 != var3; this.aClass108_1358 = this.aClass108_1358.nextNode) {
         if(this.aClass108_1358.key == var1) {
            Node var4 = this.aClass108_1358;
            this.aClass108_1358 = this.aClass108_1358.nextNode;
            return var4;
         }
      }

      this.aClass108_1358 = null;
      return null;
   }

   public void method1203(Node var1, long key) {
      if(var1.previous != null) {
         var1.unlink();
      }

      Node var4 = this.cache[(int)(key & (long)(this.size - 1))];
      var1.previous = var4.previous;
      var1.nextNode = var4;
      var1.previous.nextNode = var1;
      var1.nextNode.previous = var1;
      var1.key = key;
   }

   public void method1204() {
      int var1 = 0;

      while(var1 < this.size) {
         Node var2 = this.cache[var1];

         while(true) {
            Node var3 = var2.nextNode;
            if(var3 == var2) {
               ++var1;
               break;
            }

            var3.unlink();
         }
      }

      this.aClass108_1358 = null;
   }

   public Iterator iterator() {
      return new Class90(this);
   }

   public Class95(int var1) {
      this.size = var1;
      this.cache = new Node[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         Node var2 = this.cache[var3] = new Node();
         var2.nextNode = var2;
         var2.previous = var2;
      }

   }
}
