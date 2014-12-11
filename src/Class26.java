import java.util.HashMap;
import java.util.Map;

public class Class26 {

   static Class95 aClass95_348 = new Class95(1024);
   static Class97 aClass97_349 = new Class97();
   static int anInt351;
   static Class108_Sub4_Sub1 aClass108_Sub4_Sub1_352;
   static int anInt356 = 0;
   static Map chatMessageMap = new HashMap();


   public static void method367(int var0) {
      if(null != MouseInputHandler.mouseInputHandler) {
         MouseInputHandler var1 = MouseInputHandler.mouseInputHandler;
         synchronized(var1) {
            MouseInputHandler.mouseInputHandler = null;
         }
      }
   }

   Class26() throws Throwable {
      throw new Error();
   }
}
