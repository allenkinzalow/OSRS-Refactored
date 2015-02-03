import java.io.IOException;

public class Class23 {

   static int anInt312;
   static CacheIndex spriteIndex;


   Class23() throws Throwable {
      throw new Error();
   }

   static final String[] method341(String[] var0, int var1) {
      String[] var2 = new String[5];

      for(int var3 = 0; var3 < 5; ++var3) {
         var2[var3] = var3 + ": ";
         if(null != var0 && null != var0[var3]) {
            var2[var3] = var2[var3] + var0[var3];
         }
      }

      return var2;
   }

   static void method342(int var0, int var1, byte var2) {
      long var3 = (long)((var0 << 16) + var1);
      Js5Request var5 = (Js5Request)Class78.aClass101_1220.get(var3);
      if(var5 == null) {
         if(var2 >= 75) {
            ;
         }
      } else {
         Class78.aClass98_1219.method1283(var5);
      }
   }

   static final void method343(boolean var0, byte var1) {
      Friend.method660(-1771101536);
      Client.anInt2946 -= 2042742857;
      if(Client.anInt2946 * 219371015 >= 50 || var0) {
         Client.anInt2946 = 0;
         if(!Client.aBool2719) {
            if(Varp.loginConnection != null) {
               Client.secureBuffer.writePacket(32);

               try {
                  Varp.loginConnection.writeBytes(Client.secureBuffer.buf, 0, Client.secureBuffer.position * 798331555);
                  Client.secureBuffer.position = 0;
               } catch (IOException var3) {
                  Client.aBool2719 = true;
               }
            }
         }
      }
   }
}
