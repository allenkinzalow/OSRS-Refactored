
public class CacheRequestDispatcher implements Runnable {

   public static Object anObject1297 = new Object();
   public static Deque aClass105_1298 = new Deque();
   public static int anInt1299 = 0;
   public static Deque cacheIndexRequests = new Deque();


   public void run() {
      try {
         while(true) {
            Deque var1 = cacheIndexRequests;
            CacheIndexRequest cacheIndexRequest;
            synchronized(var1) {
               cacheIndexRequest = (CacheIndexRequest) cacheIndexRequests.getFront();
            }

            Object var14;
            if(null != cacheIndexRequest) {
               if(cacheIndexRequest.anInt1759 * -612139703 == 0) {
                  cacheIndexRequest.cacheIndexTable.putDataAttempt((int) cacheIndexRequest.key, cacheIndexRequest.indexData, cacheIndexRequest.indexData.length, -309250583);
                  var1 = cacheIndexRequests;
                  synchronized(var1) {
                     cacheIndexRequest.unlink();
                  }
               } else if(cacheIndexRequest.anInt1759 * -612139703 == 1) {
                  cacheIndexRequest.indexData = cacheIndexRequest.cacheIndexTable.get((int)cacheIndexRequest.key, (byte)20);
                  var1 = cacheIndexRequests;
                  synchronized(var1) {
                     aClass105_1298.insertBack(cacheIndexRequest);
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
