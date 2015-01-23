
public class Class2 {

   static Class2 aClass2_14 = new Class2();
   static Class2 aClass2_15 = new Class2();
   static byte[][] terrainData;
   static Class7 aClass7_17;
   static Class2 aClass2_24 = new Class2();
   static Class2 aClass2_25 = new Class2();


   public static void method39(AbstractIndex var0, int var1) {
      Client.configIndex_ref = var0;
      Varp.anInt2045 = Client.configIndex_ref.getFileCount(16) * -564083269;
   }

   static String method40(String var0, RSInterface var1, int var2) {
      if(var0.indexOf("%") != -1) {
         int var4;
         for(var4 = 1; var4 <= 5; ++var4) {
            while(true) {
               int var3 = var0.indexOf("%" + var4);
               if(-1 == var3) {
                  break;
               }

               String var7 = var0.substring(0, var3);
               int var5 = Class108_Sub4_Sub4.method2713(var1, var4 - 1, (short)235);
               String var6;
               if(var5 < 999999999) {
                  var6 = Integer.toString(var5);
               } else {
                  var6 = "*";
               }

               var0 = var7 + var6 + var0.substring(var3 + 2);
            }
         }

         while(true) {
            var4 = var0.indexOf("%dns");
            if(var4 == -1) {
               break;
            }

            String ipAddress = "";
            if(null != Client.aClass85_2732) {
               ipAddress = IndexTable.getIPAddress(Client.aClass85_2732.anInt1296, -1219476815);
               if(Client.aClass85_2732.anObject1294 != null) {
                  ipAddress = (String) Client.aClass85_2732.anObject1294;
               }
            }

            var0 = var0.substring(0, var4) + ipAddress + var0.substring(var4 + 4);
         }
      }

      return var0;
   }

   public static int method41(int var0, int var1) {
      return var0 >> 11 & 63;
   }

   static int method43(char var0, int var1, int var2) {
      int var3 = var0 << 4;
      if(Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var3 = 1 + (var0 << 4);
      }

      return var3;
   }
}
