
public class Class16 {

   static int[] anIntArray204;
   public static final int anInt205 = 11;
   int anInt206;
   static byte aByte207;
   static final int anInt208 = 18;
   int anInt209;
   static final int anInt210 = 23;
   static GameConnection aGameConnection_211;
   public static final int anInt212 = 5000;
   int anInt213;


   public static int method300(int var0, int var1) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = (var0 >>> 4) + var0 & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }
}
