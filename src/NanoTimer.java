
public class NanoTimer extends Timer {

   long aLong1710 = System.nanoTime() * 8688356420135605651L;


   int method714(int var1, int var2, int var3) {
      long var4 = (long)var2 * 1000000L;
      long var9 = 6459790971291472027L * this.aLong1710 - System.nanoTime();
      if(var9 < var4) {
         var9 = var4;
      }

      Class108_Sub22.sleep(var9 / 1000000L);
      long var6 = System.nanoTime();

      int var8;
      for(var8 = 0; var8 < 10 && (var8 < 1 || this.aLong1710 * 6459790971291472027L < var6); this.aLong1710 += -4698349372031481152L * (long)var1) {
         ++var8;
      }

      if(this.aLong1710 * 6459790971291472027L < var6) {
         this.aLong1710 = 8688356420135605651L * var6;
      }

      return var8;
   }

   void method720(int var1) {
      this.aLong1710 = System.nanoTime() * 8688356420135605651L;
   }

}
