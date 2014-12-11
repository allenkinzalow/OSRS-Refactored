
public final class Class108_Sub6 extends Node {

   static Class71 aClass71_1585;
   int anInt1586;
   static Deque aClass105_1587 = new Deque();
   int anInt1588;
   int anInt1589;
   int anInt1590;
   int anInt1591;
   int anInt1592;
   Class108_Sub4_Sub2 aClass108_Sub4_Sub2_1593;
   int anInt1594;
   int anInt1595;
   int[] anIntArray1596;
   int anInt1597;
   Class108_Sub4_Sub2 aClass108_Sub4_Sub2_1598;
   ObjectDefinition aClass108_Sub20_Sub8_1599;
   int anInt1601;


   void method1666(int var1) {
      int var2 = this.anInt1601 * -2120283541;
      ObjectDefinition var3 = this.aClass108_Sub20_Sub8_1599.getDefinitionForStatus((byte)46);
      if(null != var3) {
         this.anInt1601 = var3.anInt2110 * -551779905;
         this.anInt1591 = var3.anInt2083 * -973903232;
         this.anInt1594 = var3.anInt2112 * 1346898945;
         this.anInt1595 = var3.anInt2113 * -450728755;
         this.anIntArray1596 = var3.anIntArray2084;
      } else {
         this.anInt1601 = -480137795;
         this.anInt1591 = 0;
         this.anInt1594 = 0;
         this.anInt1595 = 0;
         this.anIntArray1596 = null;
      }

      if(var2 != this.anInt1601 * -2120283541) {
         if(null != this.aClass108_Sub4_Sub2_1593) {
            Class26.aClass108_Sub4_Sub1_352.method2037(this.aClass108_Sub4_Sub2_1593);
            this.aClass108_Sub4_Sub2_1593 = null;
         }
      }
   }

   public static byte[] method1675(CharSequence var0, byte var1) {
      int var2 = var0.length();
      byte[] var4 = new byte[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         char var5 = var0.charAt(var3);
         if((var5 <= 0 || var5 >= 128) && (var5 < 160 || var5 > 255)) {
            if(var5 == 8364) {
               var4[var3] = -128;
            } else if(8218 == var5) {
               var4[var3] = -126;
            } else if(var5 == 402) {
               var4[var3] = -125;
            } else if(var5 == 8222) {
               var4[var3] = -124;
            } else if(var5 == 8230) {
               var4[var3] = -123;
            } else if(var5 == 8224) {
               var4[var3] = -122;
            } else if(8225 == var5) {
               var4[var3] = -121;
            } else if(710 == var5) {
               var4[var3] = -120;
            } else if(8240 == var5) {
               var4[var3] = -119;
            } else if(var5 == 352) {
               var4[var3] = -118;
            } else if(8249 == var5) {
               var4[var3] = -117;
            } else if(338 == var5) {
               var4[var3] = -116;
            } else if(var5 == 381) {
               var4[var3] = -114;
            } else if(var5 == 8216) {
               var4[var3] = -111;
            } else if(8217 == var5) {
               var4[var3] = -110;
            } else if(var5 == 8220) {
               var4[var3] = -109;
            } else if(8221 == var5) {
               var4[var3] = -108;
            } else if(var5 == 8226) {
               var4[var3] = -107;
            } else if(8211 == var5) {
               var4[var3] = -106;
            } else if(8212 == var5) {
               var4[var3] = -105;
            } else if(var5 == 732) {
               var4[var3] = -104;
            } else if(var5 == 8482) {
               var4[var3] = -103;
            } else if(353 == var5) {
               var4[var3] = -102;
            } else if(8250 == var5) {
               var4[var3] = -101;
            } else if(339 == var5) {
               var4[var3] = -100;
            } else if(382 == var5) {
               var4[var3] = -98;
            } else if(var5 == 376) {
               var4[var3] = -97;
            } else {
               var4[var3] = 63;
            }
         } else {
            var4[var3] = (byte)var5;
         }
      }

      return var4;
   }
}
