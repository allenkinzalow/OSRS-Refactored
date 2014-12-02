
public class Class96 {

   int anInt1360;
   static final int anInt1361 = 0;
   int[] anIntArray1362;
   int[] anIntArray1363;
   RSByteBuffer aClass108_Sub14_1364 = new RSByteBuffer((byte[])null);
   int[] anIntArray1365;
   static final int anInt1366 = 2;
   int anInt1367;
   long aLong1368;
   static byte[] aByteArray1369 = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
   int[] anIntArray1370;
   static final int anInt1371 = 1;
   static final int anInt1372 = 3;
   static final int anInt1373 = 500000;


   Class96(byte[] var1) {
      this.method1257(var1);
   }

   void method1215() {
      this.aClass108_Sub14_1364.buf = null;
      this.anIntArray1362 = null;
      this.anIntArray1363 = null;
      this.anIntArray1370 = null;
      this.anIntArray1365 = null;
   }

   void method1218(int var1) {
      int var2 = this.aClass108_Sub14_1364.method1733(1346076417);
      this.anIntArray1370[var1] += var2;
   }

   void method1220() {
      this.aClass108_Sub14_1364.position = -537964811;
   }

   int method1221(int var1) {
      int var2 = this.method1223(var1);
      return var2;
   }

   int method1223(int var1) {
      byte var2 = this.aClass108_Sub14_1364.buf[this.aClass108_Sub14_1364.position * 798331555];
      int var5;
      if(var2 < 0) {
         var5 = var2 & 255;
         this.anIntArray1365[var1] = var5;
         this.aClass108_Sub14_1364.position += 537964811;
      } else {
         var5 = this.anIntArray1365[var1];
      }

      if(var5 != 240 && var5 != 247) {
         return this.method1224(var1, var5);
      } else {
         int var3 = this.aClass108_Sub14_1364.method1733(-1376078073);
         if(var5 == 247 && var3 > 0) {
            int var4 = this.aClass108_Sub14_1364.buf[this.aClass108_Sub14_1364.position * 798331555] & 255;
            if(var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               this.aClass108_Sub14_1364.position += 537964811;
               this.anIntArray1365[var1] = var4;
               return this.method1224(var1, var4);
            }
         }

         this.aClass108_Sub14_1364.position += var3 * 537964811;
         return 0;
      }
   }

   int method1224(int var1, int var2) {
      int var5;
      if(var2 == 255) {
         int var7 = this.aClass108_Sub14_1364.readUByte();
         var5 = this.aClass108_Sub14_1364.method1733(494702269);
         if(var7 == 47) {
            this.aClass108_Sub14_1364.position += var5 * 537964811;
            return 1;
         } else if(var7 == 81) {
            int var6 = this.aClass108_Sub14_1364.method1809(1365453461);
            var5 -= 3;
            int var4 = this.anIntArray1370[var1];
            this.aLong1368 += (long)var4 * (long)(this.anInt1367 - var6);
            this.anInt1367 = var6;
            this.aClass108_Sub14_1364.position += var5 * 537964811;
            return 2;
         } else {
            this.aClass108_Sub14_1364.position += var5 * 537964811;
            return 3;
         }
      } else {
         byte var3 = aByteArray1369[var2 - 128];
         var5 = var2;
         if(var3 >= 1) {
            var5 = var2 | this.aClass108_Sub14_1364.readUByte() << 8;
         }

         if(var3 >= 2) {
            var5 |= this.aClass108_Sub14_1364.readUByte() << 16;
         }

         return var5;
      }
   }

   int method1226() {
      int var1 = this.anIntArray1363.length;
      int var3 = -1;
      int var4 = Integer.MAX_VALUE;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.anIntArray1363[var2] >= 0 && this.anIntArray1370[var2] < var4) {
            var3 = var2;
            var4 = this.anIntArray1370[var2];
         }
      }

      return var3;
   }

   boolean method1227() {
      int var1 = this.anIntArray1363.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.anIntArray1363[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   void method1228(long var1) {
      this.aLong1368 = var1;
      int var4 = this.anIntArray1363.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         this.anIntArray1370[var3] = 0;
         this.anIntArray1365[var3] = 0;
         this.aClass108_Sub14_1364.position = this.anIntArray1362[var3] * 537964811;
         this.method1218(var3);
         this.anIntArray1363[var3] = this.aClass108_Sub14_1364.position * 798331555;
      }

   }

   int method1237() {
      return this.anIntArray1363.length;
   }

   Class96() {}

   void method1245(int var1) {
      this.anIntArray1363[var1] = this.aClass108_Sub14_1364.position * 798331555;
   }

   long method1250(int var1) {
      return this.aLong1368 + (long)var1 * (long)this.anInt1367;
   }

   void method1253(int var1) {
      this.aClass108_Sub14_1364.position = this.anIntArray1363[var1] * 537964811;
   }

   void method1257(byte[] var1) {
      this.aClass108_Sub14_1364.buf = var1;
      this.aClass108_Sub14_1364.position = 1084680814;
      int var3 = this.aClass108_Sub14_1364.readUShort(1248686451);
      this.anInt1360 = this.aClass108_Sub14_1364.readUShort(606539005);
      this.anInt1367 = 500000;
      this.anIntArray1362 = new int[var3];

      int var2;
      int var5;
      for(var2 = 0; var2 < var3; this.aClass108_Sub14_1364.position += var5 * 537964811) {
         int var4 = this.aClass108_Sub14_1364.readInt();
         var5 = this.aClass108_Sub14_1364.readInt();
         if(var4 == 1297379947) {
            this.anIntArray1362[var2] = this.aClass108_Sub14_1364.position * 798331555;
            ++var2;
         }
      }

      this.aLong1368 = 0L;
      this.anIntArray1363 = new int[var3];

      for(var2 = 0; var2 < var3; ++var2) {
         this.anIntArray1363[var2] = this.anIntArray1362[var2];
      }

      this.anIntArray1370 = new int[var3];
      this.anIntArray1365 = new int[var3];
   }

   boolean method1260() {
      return this.aClass108_Sub14_1364.buf != null;
   }
}
