import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.awt.*;

public class Class7_Sub2 extends Class7 {

   int anInt1547;
   SourceDataLine aSourceDataLine1548;
   AudioFormat anAudioFormat1549;
   byte[] aByteArray1550;


   void method135() {
      int var1 = 256;
      if(aBool99) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.anIntArray109[var2];
         if((8388608 + var3 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.aByteArray1550[var2 * 2] = (byte)(var3 >> 8);
         this.aByteArray1550[1 + var2 * 2] = (byte)(var3 >> 16);
      }

      this.aSourceDataLine1548.write(this.aByteArray1550, 0, var1 << 1);
   }

   void method125(Component var1) {
      this.anAudioFormat1549 = new AudioFormat((float)(anInt94 * -322018941), 16, aBool99?2:1, true, false);
      this.aByteArray1550 = new byte[256 << (aBool99?2:1)];
   }

   void method129() {
      if(this.aSourceDataLine1548 != null) {
         this.aSourceDataLine1548.close();
         this.aSourceDataLine1548 = null;
      }
   }

   void method130() {
      this.aSourceDataLine1548.flush();
   }

   int method127() {
      return this.anInt1547 * -1242740085 - (this.aSourceDataLine1548.available() >> (aBool99?2:1));
   }

   void method126(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(javax.sound.sampled.SourceDataLine.class, this.anAudioFormat1549, var1 << (aBool99?2:1));
         this.aSourceDataLine1548 = (SourceDataLine)AudioSystem.getLine(var2);
         this.aSourceDataLine1548.open();
         this.aSourceDataLine1548.start();
         this.anInt1547 = var1 * -288797405;
      } catch (LineUnavailableException var5) {
         if(Class16.method300(var1, -1843777457) != 1) {
            int var3 = var1 - 1;
            var3 |= var3 >>> 1;
            var3 |= var3 >>> 2;
            var3 |= var3 >>> 4;
            var3 |= var3 >>> 8;
            var3 |= var3 >>> 16;
            int var4 = 1 + var3;
            this.method126(var4);
         } else {
            this.aSourceDataLine1548 = null;
            throw var5;
         }
      }
   }
}
