
public final class HashTable {

   Node[] cache;
   int size;
   Node currentEntry;
   Node aClass108_1395;
   int anInt1396 = 0;


   void method1300() {
      int var1 = 0;

      while(var1 < this.size) {
         Node var3 = this.cache[var1];

         while(true) {
            Node var2 = var3.nextNode;
            if(var2 == var3) {
               ++var1;
               break;
            }

            var2.unlink();
         }
      }

      this.currentEntry = null;
      this.aClass108_1395 = null;
   }

   public Node get(long key) {
      Node toFind = this.cache[(int)(key & (long)(this.size - 1))];

      for(this.currentEntry = toFind.nextNode; this.currentEntry != toFind; this.currentEntry = this.currentEntry.nextNode) {
         if(this.currentEntry.key == key) {
            Node toReturn = this.currentEntry;
            this.currentEntry = this.currentEntry.nextNode;
            return toReturn;
         }
      }

      this.currentEntry = null;
      return null;
   }

   public void put(Node entry, long key) {
      if(entry.previous != null) {
         entry.unlink();
      }

      Node nextNode = this.cache[(int)(key & (long)(this.size - 1))];
      entry.previous = nextNode.previous;
      entry.nextNode = nextNode;
      entry.previous.nextNode = entry;
      entry.nextNode.previous = entry;
      entry.key = key;
   }

   public Node method1303() {
      Node var1;
      if(this.anInt1396 > 0 && this.aClass108_1395 != this.cache[this.anInt1396 - 1]) {
         var1 = this.aClass108_1395;
         this.aClass108_1395 = var1.nextNode;
         return var1;
      } else {
         do {
            if(this.anInt1396 >= this.size) {
               return null;
            }

            var1 = this.cache[this.anInt1396++].nextNode;
         } while(var1 == this.cache[this.anInt1396 - 1]);

         this.aClass108_1395 = var1.nextNode;
         return var1;
      }
   }

   public Node method1304() {
      this.anInt1396 = 0;
      return this.method1303();
   }

   public HashTable(int var1) {
      this.size = var1;
      this.cache = new Node[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         Node var3 = this.cache[var2] = new Node();
         var3.nextNode = var3;
         var3.previous = var3;
      }

   }
}
