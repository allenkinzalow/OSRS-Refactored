import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Class37 {

   static int anInt527 = 328827591;
   boolean aBool528;
   boolean aBool529;
   LinkedHashMap aLinkedHashMap530 = new LinkedHashMap();


   Class37(RSByteBuffer var1) {
      if(null != var1 && var1.buf != null) {
         int var3 = var1.readUByte();
         if(var3 >= 0 && var3 <= anInt527 * -1352803099) {
            if(var1.readUByte() == 1) {
               this.aBool528 = true;
            }

            if(var3 > 1) {
               this.aBool529 = var1.readUByte() == 1;
            }

            if(var3 > 2) {
               int var2 = var1.readUByte();

               for(int var4 = 0; var4 < var2; ++var4) {
                  int var5 = var1.readInt();
                  int var6 = var1.readInt();
                  this.aLinkedHashMap530.put(Integer.valueOf(var5), Integer.valueOf(var6));
               }

            }
         } else {
            this.method628(true, 837541280);
         }
      } else {
         this.method628(true, 352446489);
      }
   }

   void method628(boolean var1, int var2) {}

   Class37() {
      this.method628(true, 1084484809);
   }

   RSByteBuffer method631(int var1) {
      RSByteBuffer var2 = new RSByteBuffer(100);
      var2.writeByte(anInt527 * -1352803099);
      var2.writeByte(this.aBool528 ? 1 : 0);
      var2.writeByte(this.aBool529 ? 1 : 0);
      var2.writeByte(this.aLinkedHashMap530.size());
      Iterator var3 = this.aLinkedHashMap530.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var2.writeInt(((Integer) var4.getKey()).intValue());
         var2.writeInt(((Integer) var4.getValue()).intValue());
      }

      return var2;
   }

   static int method636(int var0) {
      return 8;
   }

}
