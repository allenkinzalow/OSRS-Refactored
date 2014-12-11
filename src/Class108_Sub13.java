import java.net.URL;

public final class Class108_Sub13 extends Node {

   int anInt1679;
   int anInt1681;
   int anInt1682;
   int anInt1683;
   int anInt1684;
   int anInt1685;
   public static int anInt1686;
   int anInt1687;
   int anInt1688;
   int anInt1689 = 0;
   int anInt1690 = 881348299;
   int anInt1692;
   static CacheIndex clientScriptIndex;
   int anInt1694;


   static final String method1702(int var0, int var1, int var2) {
      int var3 = var1 - var0;
      return var3 < -9?HuffmanEncoding.method690(16711680, -341769226):(var3 < -6?HuffmanEncoding.method690(16723968, -965487515):(var3 < -3?HuffmanEncoding.method690(16740352, -1392851665):(var3 < 0?HuffmanEncoding.method690(16756736, -1564431442):(var3 > 9?HuffmanEncoding.method690('\uff00', -1159570621):(var3 > 6?HuffmanEncoding.method690(4259584, -1790166633):(var3 > 3?HuffmanEncoding.method690(8453888, -2015640426):(var3 > 0?HuffmanEncoding.method690(12648192, -1593931122):HuffmanEncoding.method690(16776960, -624386945))))))));
   }

   static boolean openDocument(String pageToOpen, int type, String var2, int var3) {
      if(type == 0) {
         try {
            if(!Class56.operatingSystem.startsWith("win")) {
               throw new Exception();
            } else if(!pageToOpen.startsWith("http://") && !pageToOpen.startsWith("https://")) {
               throw new Exception();
            } else {
               String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var5 = 0; var5 < pageToOpen.length(); ++var5) {
                  if(var11.indexOf(pageToOpen.charAt(var5)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + pageToOpen + "\"");
               return true;
            }
         } catch (Throwable var6) {
            return false;
         }
      } else if(type == 1) {
         try {
            Object var4 = Class69.method933(Class56.anApplet756, var2, new Object[]{(new URL(Class56.anApplet756.getCodeBase(), pageToOpen)).toString()}, (byte)13);
            return null != var4;
         } catch (Throwable var7) {
            return false;
         }
      } else if(2 == type) {
         try {
            Class56.anApplet756.getAppletContext().showDocument(new URL(Class56.anApplet756.getCodeBase(), pageToOpen), "_blank");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else if(3 == type) {
         try {
            Class69.method941(Class56.anApplet756, "loggedout", -1264925457);
         } catch (Throwable var10) {
            ;
         }

         try {
            Class56.anApplet756.getAppletContext().showDocument(new URL(Class56.anApplet756.getCodeBase(), pageToOpen), "_top");
            return true;
         } catch (Exception var9) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
