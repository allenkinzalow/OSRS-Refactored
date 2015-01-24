import java.util.Calendar;

public class Class5 {

   static Calendar aCalendar76 = Calendar.getInstance();
   static int[] anIntArray77 = new int[5];
   static int[][] anIntArrayArray78 = new int[5][5000];
   static String[] stringStack = new String[1000];
   static int anInt81 = 0;
   static ClientScriptReference[] aClientScriptReferenceArray82 = new ClientScriptReference[50];
   static PaletteSprite[] fireRuneSprites;
   static String[] dateString = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};


   Class5() throws Throwable {
      throw new Error();
   }

   public static void method98(int var0) {
      VarpBit.varpBitCache.clearCacheMap();
   }

   static final void method102(String var0, int var1) {
      if(!var0.equals("")) {
         Client.secureBuffer.writePacket(107);
         Client.secureBuffer.writeByte(StringUtilities.getStringLengthPlusOne(var0));
         Client.secureBuffer.writeString(var0);
      }
   }

}
