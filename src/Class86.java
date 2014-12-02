
public class Class86 implements Runnable {

   public static Object anObject1297 = new Object();
   public static Deque aClass105_1298 = new Deque();
   public static int anInt1299 = 0;
   public static Deque aClass105_1300 = new Deque();
   public static final int anInt1301 = 174;
   static final int anInt1302 = 286331153;


   public void run() {
      try {
         while(true) {
            Deque var1 = aClass105_1300;
            Class108_Sub16 var2;
            synchronized(var1) {
               var2 = (Class108_Sub16)aClass105_1300.getFront();
            }

            Object var14;
            if(null != var2) {
               if(var2.anInt1759 * -612139703 == 0) {
                  var2.aClass59_1757.method785((int)var2.key, var2.aByteArray1754, var2.aByteArray1754.length, -309250583);
                  var1 = aClass105_1300;
                  synchronized(var1) {
                     var2.unlink();
                  }
               } else if(var2.anInt1759 * -612139703 == 1) {
                  var2.aByteArray1754 = var2.aClass59_1757.get((int)var2.key, (byte)20);
                  var1 = aClass105_1300;
                  synchronized(var1) {
                     aClass105_1298.insertBack(var2);
                  }
               }

               var14 = anObject1297;
               synchronized(var14) {
                  if(anInt1299 * 1495359531 <= 1) {
                     anInt1299 = 0;
                     anObject1297.notifyAll();
                     return;
                  }

                  anInt1299 = -373456120;
               }
            } else {
               Class108_Sub22.sleep(100L);
               var14 = anObject1297;
               synchronized(var14) {
                  if(anInt1299 * 1495359531 <= 1) {
                     anInt1299 = 0;
                     anObject1297.notifyAll();
                     return;
                  }

                  anInt1299 += 36413821;
               }
            }
         }
      } catch (Exception var13) {
         World.method647((String)null, var13, 926745782);
      }
   }

}
