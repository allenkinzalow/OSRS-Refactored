
public class IndexVerifyTable {

   int[] identTable;


   public IndexVerifyTable(int[] var1) {
      int var2;
      for(var2 = 1; var2 <= var1.length + (var1.length >> 1); var2 <<= 1) {
         ;
      }

      this.identTable = new int[var2 + var2];

      int var4;
      for(var4 = 0; var4 < var2 + var2; ++var4) {
         this.identTable[var4] = -1;
      }

      int var3;
      for(var4 = 0; var4 < var1.length; this.identTable[var3 + var3 + 1] = var4++) {
         for(var3 = var1[var4] & var2 - 1; this.identTable[var3 + var3 + 1] != -1; var3 = var3 + 1 & var2 - 1) {
            ;
         }

         this.identTable[var3 + var3] = var1[var4];
      }

   }

   public int method1297(int var1) {
      int var2 = (this.identTable.length >> 1) - 1;
      int var4 = var1 & var2;

      while(true) {
         int var3 = this.identTable[var4 + var4 + 1];
         if(var3 == -1) {
            return -1;
         }

         if(this.identTable[var4 + var4] == var1) {
            return var3;
         }

         var4 = var4 + 1 & var2;
      }
   }
}
