import java.awt.Component;

public class Class15 {

   AbstractIndex soundEffectIndex_R1;
   AbstractIndex soundEffectIndex_R2;
   HashTable aClass101_200 = new HashTable(256);
   static int anInt201;
   HashTable aClass101_202 = new HashTable(256);


   public static final Class7 method284(PingRequester var0, Component var1, int var2, int var3, int var4) {
      if(Class7.anInt94 * -322018941 == 0) {
         throw new IllegalStateException();
      } else if(var2 >= 0 && var2 < 2) {
         if(var3 < 256) {
            var3 = 256;
         }

         try {
            Class7_Sub2 var8 = new Class7_Sub2();
            var8.anIntArray109 = new int[(Class7.aBool99?2:1) * 256];
            var8.anInt101 = var3 * -1751713829;
            var8.method125(var1);
            var8.anInt100 = (1024 + (var3 & -1024)) * -844805727;
            if(var8.anInt100 * 741136993 > 16384) {
               var8.anInt100 = 1382563840;
            }

            var8.method126(var8.anInt100 * 741136993);
            if(Class71.anInt918 * 523094787 > 0 && null == Class108_Sub20_Sub3.aClass14_1965) {
               Class108_Sub20_Sub3.aClass14_1965 = new Class14();
               Class108_Sub20_Sub3.aClass14_1965.aClass61_192 = var0;
               var0.method820(Class108_Sub20_Sub3.aClass14_1965, Class71.anInt918 * 523094787, -1606001026);
            }

            if(null != Class108_Sub20_Sub3.aClass14_1965) {
               if(null != Class108_Sub20_Sub3.aClass14_1965.aClass7Array189[var2]) {
                  throw new IllegalArgumentException();
               }

               Class108_Sub20_Sub3.aClass14_1965.aClass7Array189[var2] = var8;
            }

            return var8;
         } catch (Throwable var7) {
            try {
               Class7_Sub1 var5 = new Class7_Sub1(var0, var2);
               var5.anIntArray109 = new int[(Class7.aBool99?2:1) * 256];
               var5.anInt101 = var3 * -1751713829;
               var5.method125(var1);
               var5.anInt100 = 1382563840;
               var5.method126(var5.anInt100 * 741136993);
               if(Class71.anInt918 * 523094787 > 0 && null == Class108_Sub20_Sub3.aClass14_1965) {
                  Class108_Sub20_Sub3.aClass14_1965 = new Class14();
                  Class108_Sub20_Sub3.aClass14_1965.aClass61_192 = var0;
                  var0.method820(Class108_Sub20_Sub3.aClass14_1965, Class71.anInt918 * 523094787, -1673424199);
               }

               if(null != Class108_Sub20_Sub3.aClass14_1965) {
                  if(null != Class108_Sub20_Sub3.aClass14_1965.aClass7Array189[var2]) {
                     throw new IllegalArgumentException();
                  }

                  Class108_Sub20_Sub3.aClass14_1965.aClass7Array189[var2] = var5;
               }

               return var5;
            } catch (Throwable var6) {
               return new Class7();
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   Class108_Sub1_Sub1 method286(int var1, int var2, int[] var3, int var4) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long soundHash = (long)var5;
      Class108_Sub1_Sub1 var8 = (Class108_Sub1_Sub1)this.aClass101_202.get(soundHash);
      if(var8 != null) {
         return var8;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         RSSoundEffect soundEffect = RSSoundEffect.getSoundEffect(this.soundEffectIndex_R1, var1, var2);
         if(soundEffect == null) {
            return null;
         } else {
            var8 = soundEffect.method104();
            this.aClass101_202.put(var8, soundHash);
            if(null != var3) {
               var3[0] -= var8.aByteArray2254.length;
            }

            return var8;
         }
      }
   }

   public Class108_Sub1_Sub1 method287(int var1, int[] var2, int var3) {
      if(this.soundEffectIndex_R1.getArchiveCount() == 1) {
         return this.method286(0, var1, var2, 858320185);
      } else if(this.soundEffectIndex_R1.getFileCount(var1) == 1) {
         return this.method286(var1, 0, var2, 969022476);
      } else {
         throw new RuntimeException();
      }
   }

   public static void method288(int var0, int var1) {
      Class91.anInt1325 = -771978757;
      RSInterface.aClass74_1889 = null;
      Class91.anInt1329 = 2020957493;
      OnlineFriend.anInt1511 = 1300146319;
      Class27.anInt362 = 0;
      FriendsChatMember.aBool1669 = false;
      ClientScriptDefinition.anInt2281 = var0 * 1352655839;
   }

   public Class15(AbstractIndex var1, AbstractIndex var2) {
      this.soundEffectIndex_R1 = var1;
      this.soundEffectIndex_R2 = var2;
   }

   protected static final void method296(byte var0) {
      Class36.clientTimer.method720(51940008);

      int var1;
      for(var1 = 0; var1 < 32; ++var1) {
         Applet_Sub1.aLongArray2696[var1] = 0L;
      }

      for(var1 = 0; var1 < 32; ++var1) {
         Applet_Sub1.aLongArray2694[var1] = 0L;
      }

      Class100.anInt1384 = 0;
   }

   Class108_Sub1_Sub1 method297(int archiveID, int fileID, int[] var3, int var4) {
      int var5 = fileID ^ (archiveID << 4 & '\uffff' | archiveID >>> 12);
      var5 |= archiveID << 16;
      long var7 = (long)var5 ^ 4294967296L;
      Class108_Sub1_Sub1 var6 = (Class108_Sub1_Sub1)this.aClass101_202.get(var7);
      if(var6 != null) {
         return var6;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         RSSoundEffect_2 var9 = (RSSoundEffect_2)this.aClass101_200.get(var7);
         if(var9 == null) {
            var9 = RSSoundEffect_2.method1626(this.soundEffectIndex_R2, archiveID, fileID);
            if(null == var9) {
               return null;
            }

            this.aClass101_200.put(var9, var7);
         }

         var6 = var9.method1627(var3);
         if(null == var6) {
            return null;
         } else {
            var9.unlink();
            this.aClass101_202.put(var6, var7);
            return var6;
         }
      }
   }

   static final void method298(Class1 var0, int var1, int var2, short var3) {
      MouseCapturer.processClickAction(var0.anInt7 * 313474189, var0.anInt2 * 209465825, var0.anInt4 * -647975407, var0.anInt6 * -2100227435, var0.aString5, var0.aString5, var1, var2, -457306493);
   }

   public Class108_Sub1_Sub1 method299(int var1, int[] var2, int var3) {
      if(this.soundEffectIndex_R2.getArchiveCount() == 1) {
         return this.method297(0, var1, var2, -91606107);
      } else if(this.soundEffectIndex_R2.getFileCount(var1) == 1) {
         return this.method297(var1, 0, var2, 430158387);
      } else {
         throw new RuntimeException();
      }
   }
}
