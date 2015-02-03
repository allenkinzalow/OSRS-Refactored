
public class Class16 {

   static int[] anIntArray204;
   int anInt206;
   static byte aByte207;
   int anInt209;
   static SocketSession aConnection_Session_211;
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
