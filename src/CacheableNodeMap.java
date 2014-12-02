
public final class CacheableNodeMap {

   int anInt1436;
   int anInt1437;
   Queue aClass98_1438 = new Queue();
   HashTable aClass101_1439;
   CacheableNode aClass108_Sub20_1440 = new CacheableNode();


   public CacheableNode get(long var1) {
      CacheableNode var3 = (CacheableNode)this.aClass101_1439.get(var1);
      if(var3 != null) {
         this.aClass98_1438.method1282(var3);
      }

      return var3;
   }

   public void put(CacheableNode var1, long var2) {
      if(this.anInt1436 != 0) {
         --this.anInt1436;
      } else {
         CacheableNode var4 = this.aClass98_1438.method1284();
         var4.unlink();
         var4.method1982();
         if(var4 == this.aClass108_Sub20_1440) {
            var4 = this.aClass98_1438.method1284();
            var4.unlink();
            var4.method1982();
         }
      }

      this.aClass101_1439.put(var1, var2);
      this.aClass98_1438.method1282(var1);
   }

   public void method1363(long var1) {
      CacheableNode var3 = (CacheableNode)this.aClass101_1439.get(var1);
      if(var3 != null) {
         var3.unlink();
         var3.method1982();
         ++this.anInt1436;
      }
   }

   public CacheableNodeMap(int var1) {
      this.anInt1437 = var1;
      this.anInt1436 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
         ;
      }

      this.aClass101_1439 = new HashTable(var2);
   }

   public void method1371() {
      this.aClass98_1438.method1286();
      this.aClass101_1439.method1300();
      this.aClass108_Sub20_1440 = new CacheableNode();
      this.anInt1436 = this.anInt1437;
   }
}
