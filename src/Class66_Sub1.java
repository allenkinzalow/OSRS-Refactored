import java.nio.ByteBuffer;

public class Class66_Sub1 extends Class66 {

   ByteBuffer aByteBuffer1701;


   void method892(byte[] var1, short var2) {
      this.aByteBuffer1701 = ByteBuffer.allocateDirect(var1.length);
      this.aByteBuffer1701.position(0);
      this.aByteBuffer1701.put(var1);
   }

   byte[] method891(byte var1) {
      byte[] var2 = new byte[this.aByteBuffer1701.capacity()];
      this.aByteBuffer1701.position(0);
      this.aByteBuffer1701.get(var2);
      return var2;
   }

}
