
public abstract class Class66 {

   static boolean aBool864 = false;


   abstract byte[] method891(byte var1);

   abstract void method892(byte[] var1, short var2);

   public static String method896(String var0, byte var1) {
      int var2 = var0.length();
      char[] var6 = new char[var2];
      byte var3 = 2;

      for(int var5 = 0; var5 < var2; ++var5) {
         char var4 = var0.charAt(var5);
         if(0 == var3) {
            var4 = Character.toLowerCase(var4);
         } else if(2 == var3 || Character.isUpperCase(var4)) {
            var4 = PlainTile.method626(var4, (byte)-92);
         }

         if(Character.isLetter(var4)) {
            var3 = 0;
         } else if(46 != var4 && var4 != 63 && 33 != var4) {
            if(Character.isSpaceChar(var4)) {
               if(2 != var3) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var6[var5] = var4;
      }

      return new String(var6);
   }

}
