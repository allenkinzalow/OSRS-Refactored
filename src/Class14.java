
public class Class14 implements Runnable {

   volatile Class7[] aClass7Array189 = new Class7[2];
   volatile boolean aBool190 = false;
   volatile boolean aBool191 = false;
   PingRequester aClass61_192;


   public static int method281(int var0, byte var1) {
      int var2 = 0;
      if(var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var2 += 16;
      }

      if(var0 >= 256) {
         var0 >>>= 8;
         var2 += 8;
      }

      if(var0 >= 16) {
         var0 >>>= 4;
         var2 += 4;
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var2 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var2;
      }

      return var2 + var0;
   }

   public void run() {
      this.aBool191 = true;

      try {
         try {
            while(!this.aBool190) {
               for(int var1 = 0; var1 < 2; ++var1) {
                  Class7 var2 = this.aClass7Array189[var1];
                  if(var2 != null) {
                     var2.method118(-1758693404);
                  }
               }

               Class108_Sub22.sleep(10L);
               Renderable.method2491(this.aClass61_192, (Object)null, (short)-7899);
            }
         } catch (Exception var6) {
            World.method647((String)null, var6, 926745782);
            this.aBool191 = false;
            return;
         }

         this.aBool191 = false;
      } finally {
         this.aBool191 = false;
      }
   }
}
