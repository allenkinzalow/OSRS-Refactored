
public class SoundTrackEnvelope {

   int[] anIntArray26 = new int[2];
   int anInt27;
   int end;
   int anInt29 = 2;
   int[] anIntArray30 = new int[2];
   int anInt31;
   int anInt32;
   int anInt33;
   int smart;
   int anInt35;
   int anInt36;


   final void method44(RSByteBuffer var1) {
      this.anInt29 = var1.readUByte();
      this.anIntArray30 = new int[this.anInt29];
      this.anIntArray26 = new int[this.anInt29];

      for(int var2 = 0; var2 < this.anInt29; ++var2) {
         this.anIntArray30[var2] = var1.readUShort(1381059486);
         this.anIntArray26[var2] = var1.readUShort(-382758861);
      }

   }

   final void decode(RSByteBuffer var1) {
      this.anInt31 = var1.readUByte();
      this.smart = var1.readInt();
      this.end = var1.readInt();
      this.method44(var1);
   }

   final void method47() {
      this.anInt32 = 0;
      this.anInt33 = 0;
      this.anInt27 = 0;
      this.anInt35 = 0;
      this.anInt36 = 0;
   }

   final int method51(int var1) {
      if(this.anInt36 >= this.anInt32) {
         this.anInt35 = this.anIntArray26[this.anInt33++] << 15;
         if(this.anInt33 >= this.anInt29) {
            this.anInt33 = this.anInt29 - 1;
         }

         this.anInt32 = (int)((double)this.anIntArray30[this.anInt33] / 65536.0D * (double)var1);
         if(this.anInt32 > this.anInt36) {
            this.anInt27 = ((this.anIntArray26[this.anInt33] << 15) - this.anInt35) / (this.anInt32 - this.anInt36);
         }
      }

      this.anInt35 += this.anInt27;
      ++this.anInt36;
      return this.anInt35 - this.anInt27 >> 15;
   }

   SoundTrackEnvelope() {
      this.anIntArray30[0] = 0;
      this.anIntArray30[1] = '\uffff';
      this.anIntArray26[0] = 0;
      this.anIntArray26[1] = '\uffff';
   }
}
