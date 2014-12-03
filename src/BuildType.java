
public class BuildType {

   static RSInterface aClass108_Sub17_1231;
   static BuildType aClass79_1232 = new BuildType("BUILDLIVE", 3);
   static BuildType aClass79_1233 = new BuildType("RC", 1);
   static BuildType aClass79_1234 = new BuildType("WIP", 2);
   public int anInt1235;
   static final int anInt1236 = 36;
   static BuildType aClass79_1237 = new BuildType("LIVE", 0);
   static int anInt1238;
   static String enteredPin;
   public String aString1240;
   public static final int anInt1241 = 221;


   BuildType(String var1, int var2) {
      this.aString1240 = var1;
      this.anInt1235 = var2 * 208829069;
   }

   public static int method1093(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if((var5 & 1) == 1) {
         int var7 = var3;
         var3 = var4;
         var4 = var7;
      }
 
      var2 &= 3;
      return var2 == 0?var1:(1 != var2?(2 == var2?7 - var1 - (var4 - 1):var0):7 - var0 - (var3 - 1));
   }

   public static int method1094(int var0, int var1) {
      Class108_Sub20_Sub2 var2 = ChatMessagesContainer.method358(var0, 2117507523);
      int var6 = var2.anInt1957 * 863090207;
      int var3 = var2.anInt1950 * 194527281;
      int var4 = var2.anInt1949 * -944103735;
      int var5 = Class88.anIntArray1314[var4 - var3];
      return Class88.anIntArray1315[var6] >> var3 & var5;
   }
}
