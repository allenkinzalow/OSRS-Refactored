
public class Class108_Sub1_Sub1 extends Class108_Sub1 {

   public byte[] aByteArray2254;
   public boolean aBool2255;
   public int anInt2256;
   int anInt2257;
   public int anInt2258;


   Class108_Sub1_Sub1(int var1, byte[] var2, int var3, int var4) {
      this.anInt2256 = var1;
      this.aByteArray2254 = var2;
      this.anInt2258 = var3;
      this.anInt2257 = var4;
   }

   Class108_Sub1_Sub1(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.anInt2256 = var1;
      this.aByteArray2254 = var2;
      this.anInt2258 = var3;
      this.anInt2257 = var4;
      this.aBool2255 = var5;
   }

   public Class108_Sub1_Sub1 method2555(Class19 var1) {
      this.aByteArray2254 = var1.method325(this.aByteArray2254, 1232427328);
      this.anInt2256 = var1.method332(this.anInt2256, (byte)98);
      if(this.anInt2258 == this.anInt2257) {
         this.anInt2258 = this.anInt2257 = var1.method330(this.anInt2258, (byte)-105);
      } else {
         this.anInt2258 = var1.method330(this.anInt2258, (byte)-53);
         this.anInt2257 = var1.method330(this.anInt2257, (byte)-61);
         if(this.anInt2258 == this.anInt2257) {
            --this.anInt2258;
         }
      }

      return this;
   }
}
