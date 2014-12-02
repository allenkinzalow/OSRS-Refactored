import java.util.Random;

public class SoundTrackInstrument {

   int delayTime = 0;
   int begin = 0;
   int[] oscillPitchDelta = new int[]{0, 0, 0, 0, 0};
   static int[] anIntArray149 = new int['\u8000'];
   SoundTrackEnvelope volumeModeEnvelope;
   SoundTrackEnvelope volumeModAmpEnvelope;
   SoundTrackEnvelope gatingReleaseEnvelope;
   SoundTrackEnvelope gatingAttackEnvelope;
   SoundTrackEnvelope volumeEnvelope;
   SoundTrackEnvelope pitchEnvelope;
   int[] oscillDelay = new int[]{0, 0, 0, 0, 0};
   int[] oscillVolume = new int[]{0, 0, 0, 0, 0};
   int delayFeedback = 100;
   SoundFilter filter;
   SoundTrackEnvelope pitchModAmpEnvelope;
   int duration = 500;
   SoundTrackEnvelope filterEnvelope;
   static int[] buffer;
   static int[] phases;
   static int[] anIntArray165;
   static final double aDouble166 = 1.0057929410678534D;
   SoundTrackEnvelope pitchModEnvelope;
   static int[] delays;
   static int[] volumeStep;
   static int[] pitchStep;
   static int[] pitchBaseStep;


   final int[] synthesize(int var1, int var2) {
      ArrayUtil.method861(buffer, 0, var1);
      if(var2 < 10) {
         return buffer;
      } else {
         double var7 = (double)var1 / ((double)var2 + 0.0D);
         this.pitchEnvelope.method47();
         this.volumeEnvelope.method47();
         int pitchModStep = 0;
         int pitchBsaeStep = 0;
         int pitchPhase = 0;
         if(this.pitchModEnvelope != null) {
            this.pitchModEnvelope.method47();
            this.pitchModAmpEnvelope.method47();
            pitchModStep = (int)((double)(this.pitchModEnvelope.end - this.pitchModEnvelope.smart) * 32.768D / var7);
            pitchBsaeStep = (int)((double)this.pitchModEnvelope.smart * 32.768D / var7);
         }

         int volumeModeStep = 0;
         int volumeModeBaseStep = 0;
         int volumeModePhase = 0;
         if(this.volumeModeEnvelope != null) {
            this.volumeModeEnvelope.method47();
            this.volumeModAmpEnvelope.method47();
            volumeModeStep = (int)((double)(this.volumeModeEnvelope.end - this.volumeModeEnvelope.smart) * 32.768D / var7);
            volumeModeBaseStep = (int)((double)this.volumeModeEnvelope.smart * 32.768D / var7);
         }

         int var16;
         for(var16 = 0; var16 < 5; ++var16) {
            if(this.oscillVolume[var16] != 0) {
               phases[var16] = 0;
               delays[var16] = (int)((double)this.oscillDelay[var16] * var7);
               volumeStep[var16] = (this.oscillVolume[var16] << 14) / 100;
               pitchStep[var16] = (int)((double)(this.pitchEnvelope.end - this.pitchEnvelope.smart) * 32.768D * Math.pow(1.0057929410678534D, (double)this.oscillPitchDelta[var16]) / var7);
               pitchBaseStep[var16] = (int)((double)this.pitchEnvelope.smart * 32.768D / var7);
            }
         }

         int var4;
         int var11;
         int var12;
         int var17;
         for(var16 = 0; var16 < var1; ++var16) {
            var11 = this.pitchEnvelope.method51(var1);
            var12 = this.volumeEnvelope.method51(var1);
            if(this.pitchModEnvelope != null) {
               var4 = this.pitchModEnvelope.method51(var1);
               var17 = this.pitchModAmpEnvelope.method51(var1);
               var11 += this.method247(pitchPhase, var17, this.pitchModEnvelope.anInt31) >> 1;
               pitchPhase += (var4 * pitchModStep >> 16) + pitchBsaeStep;
            }

            if(this.volumeModeEnvelope != null) {
               var4 = this.volumeModeEnvelope.method51(var1);
               var17 = this.volumeModAmpEnvelope.method51(var1);
               var12 = var12 * ((this.method247(volumeModePhase, var17, this.volumeModeEnvelope.anInt31) >> 1) + '\u8000') >> 15;
               volumeModePhase += (var4 * volumeModeStep >> 16) + volumeModeBaseStep;
            }

            for(var4 = 0; var4 < 5; ++var4) {
               if(this.oscillVolume[var4] != 0) {
                  var17 = var16 + delays[var4];
                  if(var17 < var1) {
                     buffer[var17] += this.method247(phases[var4], var12 * volumeStep[var4] >> 15, this.pitchEnvelope.anInt31);
                     phases[var4] += (var11 * pitchStep[var4] >> 16) + pitchBaseStep[var4];
                  }
               }
            }
         }

         int var18;
         if(this.gatingReleaseEnvelope != null) {
            this.gatingReleaseEnvelope.method47();
            this.gatingAttackEnvelope.method47();
            var16 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var4 = 0; var4 < var1; ++var4) {
               var17 = this.gatingReleaseEnvelope.method51(var1);
               var18 = this.gatingAttackEnvelope.method51(var1);
               if(var20) {
                  var11 = this.gatingReleaseEnvelope.smart + ((this.gatingReleaseEnvelope.end - this.gatingReleaseEnvelope.smart) * var17 >> 8);
               } else {
                  var11 = this.gatingReleaseEnvelope.smart + ((this.gatingReleaseEnvelope.end - this.gatingReleaseEnvelope.smart) * var18 >> 8);
               }

               var16 += 256;
               if(var16 >= var11) {
                  var16 = 0;
                  var20 = !var20;
               }

               if(var20) {
                  buffer[var4] = 0;
               }
            }
         }

         if(this.delayTime > 0 && this.delayFeedback > 0) {
            var16 = (int)((double)this.delayTime * var7);

            for(var11 = var16; var11 < var1; ++var11) {
               buffer[var11] += buffer[var11 - var16] * this.delayFeedback / 100;
            }
         }

         if(this.filter.anIntArray138[0] > 0 || this.filter.anIntArray138[1] > 0) {
            this.filterEnvelope.method47();
            var16 = this.filterEnvelope.method51(var1 + 1);
            var11 = this.filter.method235(0, (float)var16 / 65536.0F);
            var12 = this.filter.method235(1, (float)var16 / 65536.0F);
            if(var1 >= var11 + var12) {
               var4 = 0;
               var17 = var12;
               if(var12 > var1 - var11) {
                  var17 = var1 - var11;
               }

               int var9;
               while(var4 < var17) {
                  var18 = (int)((long)buffer[var4 + var11] * (long)SoundFilter.anInt136 >> 16);

                  for(var9 = 0; var9 < var11; ++var9) {
                     var18 += (int)((long)buffer[var4 + var11 - 1 - var9] * (long)SoundFilter.anIntArrayArray140[0][var9] >> 16);
                  }

                  for(var9 = 0; var9 < var4; ++var9) {
                     var18 -= (int)((long)buffer[var4 - 1 - var9] * (long)SoundFilter.anIntArrayArray140[1][var9] >> 16);
                  }

                  buffer[var4] = var18;
                  var16 = this.filterEnvelope.method51(var1 + 1);
                  ++var4;
               }

               var17 = 128;

               while(true) {
                  if(var17 > var1 - var11) {
                     var17 = var1 - var11;
                  }

                  int var10;
                  while(var4 < var17) {
                     var9 = (int)((long)buffer[var4 + var11] * (long)SoundFilter.anInt136 >> 16);

                     for(var10 = 0; var10 < var11; ++var10) {
                        var9 += (int)((long)buffer[var4 + var11 - 1 - var10] * (long)SoundFilter.anIntArrayArray140[0][var10] >> 16);
                     }

                     for(var10 = 0; var10 < var12; ++var10) {
                        var9 -= (int)((long)buffer[var4 - 1 - var10] * (long)SoundFilter.anIntArrayArray140[1][var10] >> 16);
                     }

                     buffer[var4] = var9;
                     var16 = this.filterEnvelope.method51(var1 + 1);
                     ++var4;
                  }

                  if(var4 >= var1 - var11) {
                     while(var4 < var1) {
                        var9 = 0;

                        for(var10 = var4 + var11 - var1; var10 < var11; ++var10) {
                           var9 += (int)((long)buffer[var4 + var11 - 1 - var10] * (long)SoundFilter.anIntArrayArray140[0][var10] >> 16);
                        }

                        for(var10 = 0; var10 < var12; ++var10) {
                           var9 -= (int)((long)buffer[var4 - 1 - var10] * (long)SoundFilter.anIntArrayArray140[1][var10] >> 16);
                        }

                        buffer[var4] = var9;
                        this.filterEnvelope.method51(var1 + 1);
                        ++var4;
                     }
                     break;
                  }

                  var11 = this.filter.method235(0, (float)var16 / 65536.0F);
                  var12 = this.filter.method235(1, (float)var16 / 65536.0F);
                  var17 += 128;
               }
            }
         }

         for(var16 = 0; var16 < var1; ++var16) {
            if(buffer[var16] < -32768) {
               buffer[var16] = -32768;
            }

            if(buffer[var16] > 32767) {
               buffer[var16] = 32767;
            }
         }

         return buffer;
      }
   }

   final int method247(int var1, int var2, int var3) {
      return var3 == 1?((var1 & 32767) < 16384?var2:-var2):(var3 == 2?anIntArray165[var1 & 32767] * var2 >> 14:(var3 == 3?((var1 & 32767) * var2 >> 14) - var2:(var3 == 4?anIntArray149[var1 / 2607 & 32767] * var2:0)));
   }

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < '\u8000'; ++var1) {
         anIntArray149[var1] = (var0.nextInt() & 2) - 1;
      }

      anIntArray165 = new int['\u8000'];

      for(var1 = 0; var1 < '\u8000'; ++var1) {
         anIntArray165[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      buffer = new int[220500];
      phases = new int[5];
      delays = new int[5];
      volumeStep = new int[5];
      pitchStep = new int[5];
      pitchBaseStep = new int[5];
   }

   final void decodeTrack(RSByteBuffer buffer) {
      this.pitchEnvelope = new SoundTrackEnvelope();
      this.pitchEnvelope.decode(buffer);
      this.volumeEnvelope = new SoundTrackEnvelope();
      this.volumeEnvelope.decode(buffer);
      int option = buffer.readUByte();
      if(option != 0) {
         buffer.position -= 537964811;
         this.pitchModEnvelope = new SoundTrackEnvelope();
         this.pitchModEnvelope.decode(buffer);
         this.pitchModAmpEnvelope = new SoundTrackEnvelope();
         this.pitchModAmpEnvelope.decode(buffer);
      }

      option = buffer.readUByte();
      if(option != 0) {
         buffer.position -= 537964811;
         this.volumeModeEnvelope = new SoundTrackEnvelope();
         this.volumeModeEnvelope.decode(buffer);
         this.volumeModAmpEnvelope = new SoundTrackEnvelope();
         this.volumeModAmpEnvelope.decode(buffer);
      }

      option = buffer.readUByte();
      if(option != 0) {
         buffer.position -= 537964811;
         this.gatingReleaseEnvelope = new SoundTrackEnvelope();
         this.gatingReleaseEnvelope.decode(buffer);
         this.gatingAttackEnvelope = new SoundTrackEnvelope();
         this.gatingAttackEnvelope.decode(buffer);
      }

      for(int var4 = 0; var4 < 10; ++var4) {
         int var2 = buffer.readSmart((short) 7224);
         if(var2 == 0) {
            break;
         }

         this.oscillVolume[var4] = var2;
         this.oscillPitchDelta[var4] = buffer.method1746(1113333989);
         this.oscillDelay[var4] = buffer.readSmart((short) 1964);
      }

      this.delayTime = buffer.readSmart((short) -1679);
      this.delayFeedback = buffer.readSmart((short) 4038);
      this.duration = buffer.readUShort(497751376);
      this.begin = buffer.readUShort(-1181653019);
      this.filter = new SoundFilter();
      this.filterEnvelope = new SoundTrackEnvelope();
      this.filter.method232(buffer, this.filterEnvelope);
   }
}
