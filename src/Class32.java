import java.math.BigInteger;

public class Class32 {

   public static Class108_Sub4_Sub3 aClass108_Sub4_Sub3_464;


   static void method575(int var0, int var1, int var2, ObjectDefinition var3, int var4, int var5) {
      Class108_Sub6 var6 = new Class108_Sub6();
      var6.anInt1586 = var0 * 1684420457;
      var6.anInt1597 = var1 * -165275264;
      var6.anInt1588 = var2 * -1759027840;
      int var7 = var3.sizeX * 721302265;
      int var8 = var3.sizeY * -1917144319;
      if(var4 == 1 || var4 == 3) {
         var7 = var3.sizeY * -1917144319;
         var8 = var3.sizeX * 721302265;
      }

      var6.anInt1592 = (var1 + var7) * 1313562240;
      var6.anInt1590 = (var8 + var2) * 1941574784;
      var6.anInt1601 = var3.anInt2110 * -551779905;
      var6.anInt1591 = var3.anInt2083 * -973903232;
      var6.anInt1594 = var3.anInt2112 * 1346898945;
      var6.anInt1595 = var3.anInt2113 * -450728755;
      var6.anIntArray1596 = var3.anIntArray2084;
      if(var3.configChangeDest != null) {
         var6.aClass108_Sub20_Sub8_1599 = var3;
         var6.method1666(1640464938);
      }

      Class108_Sub6.aClass105_1587.insertBack(var6);
      if(var6.anIntArray1596 != null) {
         var6.anInt1589 = (var6.anInt1594 * 983197705 + (int)(Math.random() * (double)(var6.anInt1595 * -2112126659 - var6.anInt1594 * 983197705))) * 690388241;
      }
   }

   static int method576(RSInterface var0, int var1) {
      Class108_Sub19 var2 = (Class108_Sub19) Client.aClass101_2906.get(((long) (var0.interfaceHash * -1081473899) << 32) + (long) (var0.anInt1772 * -490007465));
      return var2 != null?var2.anInt1892:var0.anInt1830 * 956161607;
   }

   static final boolean method577(int var0, int var1) {
      if(var0 < 0) {
         return false;
      } else {
         int var2 = ContextMenu.contextMenuIdentifiers[var0];
         if(var2 >= 2000) {
            var2 -= 2000;
         }

         return var2 == 1007;
      }
   }

   Class32() throws Throwable {
      throw new Error();
   }

   static int method579(CharSequence var0, int var1, boolean var2, int var3) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var6 = false;
         int var9 = 0;
         int var7 = var0.length();

         for(int var5 = 0; var5 < var7; ++var5) {
            char var8 = var0.charAt(var5);
            if(0 == var5) {
               if(var8 == 45) {
                  var4 = true;
                  continue;
               }

               if(43 == var8 && var2) {
                  continue;
               }
            }

            int var11;
            if(var8 >= 48 && var8 <= 57) {
               var11 = var8 - 48;
            } else if(var8 >= 65 && var8 <= 90) {
               var11 = var8 - 55;
            } else {
               if(var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var11 = var8 - 87;
            }

            if(var11 >= var1) {
               throw new NumberFormatException();
            }

            if(var4) {
               var11 = -var11;
            }

            int var10 = var11 + var9 * var1;
            if(var10 / var1 != var9) {
               throw new NumberFormatException();
            }

            var9 = var10;
            var6 = true;
         }

         if(!var6) {
            throw new NumberFormatException();
         } else {
            return var9;
         }
      } else {
         throw new IllegalArgumentException("");
      }
   }
}
