import java.io.File;
import java.io.RandomAccessFile;

public abstract class Timer {

   static int anInt723;
   public static Class15 aClass15_724;


   static void method713(int var0) {
      CacheFileAccessor var1 = null;

      try {
         var1 = Entity.method2730("", Client.gameDefinition.gameName, true, (byte)70);
         RSByteBuffer var2 = Ignore.aClass37_386.method631(2045058579);
         var1.method1491(var2.buf, 0, var2.position * 798331555, 473414132);
      } catch (Exception var4) {
         ;
      }

      try {
         if(null != var1) {
            var1.method1484(-2087209188);
         }
      } catch (Exception var3) {
         ;
      }
   }

   abstract int method714(int var1, int var2, int var3);

   public static File method715(String var0, byte var1) {
      if(!Class52.aBool717) {
         throw new RuntimeException("");
      } else {
         File var2 = (File)Class52.aHashtable719.get(var0);
         if(var2 != null) {
            return var2;
         } else {
            File var3 = new File(Class52.aFile718, var0);
            RandomAccessFile var4 = null;

            try {
               File var5 = new File(var3.getParent());
               if(!var5.exists()) {
                  throw new RuntimeException("");
               } else {
                  var4 = new RandomAccessFile(var3, "rw");
                  int var6 = var4.read();
                  var4.seek(0L);
                  var4.write(var6);
                  var4.seek(0L);
                  var4.close();
                  Class52.aHashtable719.put(var0, var3);
                  return var3;
               }
            } catch (Exception var8) {
               try {
                  if(var4 != null) {
                     var4.close();
                     var4 = null;
                  }
               } catch (Exception var7) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   abstract void method720(int var1);

   static void method722(int var0, int var1, int var2) {
      if(0 != Client.anInt2873 * 99489839) {
         if(-1 != var0) {
            AnimationSkin.method1677(ClientParameter.musicIndex_2, var0, 0, Client.anInt2873 * 99489839, false, -733285856);
            Client.aBool2938 = true;
         }
      }
   }

}
