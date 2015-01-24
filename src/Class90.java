import java.util.Iterator;

public class Class90 implements Iterator {

   Node aClass108_1321 = null;
   Node aClass108_1322;
   int anInt1323;
   Class95 aClass95_1324;


   Class90(Class95 var1) {
      this.aClass95_1324 = var1;
      this.method1132();
   }

   public Object next() {
      Node var1;
      if(this.aClass108_1322 != this.aClass95_1324.cache[this.anInt1323 - 1]) {
         var1 = this.aClass108_1322;
         this.aClass108_1322 = var1.nextNode;
         this.aClass108_1321 = var1;
         return var1;
      } else {
         do {
            if(this.anInt1323 >= this.aClass95_1324.size) {
               return null;
            }

            var1 = this.aClass95_1324.cache[this.anInt1323++].nextNode;
         } while(var1 == this.aClass95_1324.cache[this.anInt1323 - 1]);

         this.aClass108_1322 = var1.nextNode;
         this.aClass108_1321 = var1;
         return var1;
      }
   }

   void method1132() {
      this.aClass108_1322 = this.aClass95_1324.cache[0].nextNode;
      this.anInt1323 = 1;
      this.aClass108_1321 = null;
   }

   public void remove() {
      if(this.aClass108_1321 == null) {
         throw new IllegalStateException();
      } else {
         this.aClass108_1321.unlink();
         this.aClass108_1321 = null;
      }
   }

   public boolean hasNext() {
      if(this.aClass108_1322 != this.aClass95_1324.cache[this.anInt1323 - 1]) {
         return true;
      } else {
         while(this.anInt1323 < this.aClass95_1324.size) {
            if(this.aClass95_1324.cache[this.anInt1323++].nextNode != this.aClass95_1324.cache[this.anInt1323 - 1]) {
               this.aClass108_1322 = this.aClass95_1324.cache[this.anInt1323 - 1].nextNode;
               return true;
            }

            this.aClass108_1322 = this.aClass95_1324.cache[this.anInt1323 - 1];
         }

         return false;
      }
   }
}
