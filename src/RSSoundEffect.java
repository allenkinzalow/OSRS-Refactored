
public class RSSoundEffect {

   int anInt89;
   int anInt91;
   SoundTrackInstrument[] soundTrackInstruments = new SoundTrackInstrument[10];


   public Class108_Sub1_Sub1 method104() {
      byte[] var1 = this.method107();
      return new Class108_Sub1_Sub1(22050, var1, this.anInt91 * 22050 / 1000, this.anInt89 * 22050 / 1000);
   }

   RSSoundEffect(RSByteBuffer buffer) {
      for(int trackIndex = 0; trackIndex < 10; ++trackIndex) {
         int var3 = buffer.readUByte();
         if(var3 != 0) {
            buffer.position -= 537964811;
            this.soundTrackInstruments[trackIndex] = new SoundTrackInstrument();
            this.soundTrackInstruments[trackIndex].decodeTrack(buffer);
         }
      }

      this.anInt91 = buffer.readUShort(-346723179);
      this.anInt89 = buffer.readUShort(-494936918);
   }

   public static RSSoundEffect getSoundEffect(AbstractIndex soundEffectIndex_1, int var1, int var2) {
      byte[] soundEffectData = soundEffectIndex_1.getFile(var1, var2, (byte) 7);
      return soundEffectData == null ? null : new RSSoundEffect(new RSByteBuffer(soundEffectData));
   }

   public final int method106() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.soundTrackInstruments[var2] != null && this.soundTrackInstruments[var2].begin / 20 < var1) {
            var1 = this.soundTrackInstruments[var2].begin / 20;
         }
      }

      if(this.anInt91 < this.anInt89 && this.anInt91 / 20 < var1) {
         var1 = this.anInt91 / 20;
      }

      if(var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if(this.soundTrackInstruments[var2] != null) {
               this.soundTrackInstruments[var2].begin -= var1 * 20;
            }
         }

         if(this.anInt91 < this.anInt89) {
            this.anInt91 -= var1 * 20;
            this.anInt89 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] method107() {
      int var1 = 0;

      int var3;
      for(var3 = 0; var3 < 10; ++var3) {
         if(this.soundTrackInstruments[var3] != null && this.soundTrackInstruments[var3].duration + this.soundTrackInstruments[var3].begin > var1) {
            var1 = this.soundTrackInstruments[var3].duration + this.soundTrackInstruments[var3].begin;
         }
      }

      if(var1 == 0) {
         return new byte[0];
      } else {
         var3 = var1 * 22050 / 1000;
         byte[] var4 = new byte[var3];

         for(int var2 = 0; var2 < 10; ++var2) {
            if(this.soundTrackInstruments[var2] != null) {
               int var9 = this.soundTrackInstruments[var2].duration * 22050 / 1000;
               int var6 = this.soundTrackInstruments[var2].begin * 22050 / 1000;
               int[] var7 = this.soundTrackInstruments[var2].synthesize(var9, this.soundTrackInstruments[var2].duration);

               for(int var5 = 0; var5 < var9; ++var5) {
                  int var8 = var4[var5 + var6] + (var7[var5] >> 8);
                  if((var8 + 128 & -256) != 0) {
                     var8 = var8 >> 31 ^ 127;
                  }

                  var4[var5 + var6] = (byte)var8;
               }
            }
         }

         return var4;
      }
   }
}
