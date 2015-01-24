
public final class RSPacketBuffer extends RSByteBuffer {

   public static int[] packetSizes = new int[]{0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -2, 0, 10, 2, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 6, 10, 0, 0, 0, 12, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 14, -2, 0, 0, 0, 6, 5, 0, 4, 0, 2, 0, 0, 0, 15, 0, 6, 0, 0, 0, 0, 2, 0, 6, -2, 6, 0, 0, 0, 0, 0, 0, 0, 2, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 4, 6, 0, 0, 2, 0, 4, 0, 0, -2, 0, 2, 8, 0, 1, 0, 5, 0, -1, 6, 0, 6, 0, -2, 0, 4, 0, 0, 0, 0, 6, 0, 0, -2, -1, 3, 0, 0, -1, 0, 0, 0, 28, 0, 0, 6, 0, 4, 0, 0, 0, 1, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 1, -1, 0, 0, 0, 0, 0, -2, 0, 0, 7, 0, 0, -2, 0, 0, 0, -2, 0, 0, 2, 8, 0, 0, 0, -1, 5, 0, 0, -2, 0, 0, -2, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 6, 0, 0, 0, 0, 0};
   static int[] anIntArray2290 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   int anInt2291;
   IsaacRandomGen aIsaacRandomGen_2295;


   public RSPacketBuffer(int var1) {
      super(var1);
   }

   public int readableBits(int var1) {
      return var1 * 8 - this.anInt2291 * 1014016585;
   }

   public void startBitMode() {
      this.anInt2291 = this.position * -1891521448;
   }

   public int readBits(int var1) {
      int var3 = this.anInt2291 * 1014016585 >> 3;
      int var5 = 8 - (this.anInt2291 * 1014016585 & 7);
      int var4 = 0;

      for(this.anInt2291 += var1 * -1431345159; var1 > var5; var5 = 8) {
         var4 += (this.buf[var3++] & anIntArray2290[var5]) << var1 - var5;
         var1 -= var5;
      }

      if(var5 == var1) {
         var4 += this.buf[var3] & anIntArray2290[var5];
      } else {
         var4 += this.buf[var3] >> var5 - var1 & anIntArray2290[var1];
      }

      return var4;
   }

   public void writePacket(int var1) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 + this.aIsaacRandomGen_2295.method736((byte)19));
   }

   public void endBitAccess() {
      this.position = (7 + this.anInt2291 * 1014016585) / 8 * 537964811;
   }

   public void setCipherSet(int[] var1, int var2) {
      this.aIsaacRandomGen_2295 = new IsaacRandomGen(var1);
   }

   public int readPacket(int var1) {
      return (this.buf[(this.position += 537964811) * 798331555 - 1] - this.aIsaacRandomGen_2295.method736((byte) -16)) & 255;
   }

   static final void method2598(RSInterface var0, int var1, int var2, byte var3) {
      if(null == Client.aClass108_Sub17_2877) {
         if(!ContextMenu.contextMenuOpen) {
            if(var0 != null) {
               RSInterface var8 = var0;
               int var5 = Js5Request.method2602(Class32.method576(var0, -366630917), (byte) -87);
               int var4;
               RSInterface var6;
               if(var5 == 0) {
                  var6 = null;
               } else {
                  var4 = 0;

                  while(true) {
                     if(var4 >= var5) {
                        var6 = var8;
                        break;
                     }

                     var8 = RSInterface.getInterfaceComponentForHash(var8.hoverPopup * -867206361, 204830061);
                     if(null == var8) {
                        var6 = null;
                        break;
                     }

                     ++var4;
                  }
               }

               RSInterface var9 = var6;
               if(var6 == null) {
                  var9 = var0.aClass108_Sub17_1833;
               }

               if(var9 != null) {
                  Client.aClass108_Sub17_2877 = var0;
                  var8 = var0;
                  var5 = Js5Request.method2602(Class32.method576(var0, 1999321484), (byte) -53);
                  if(0 == var5) {
                     var6 = null;
                  } else {
                     var4 = 0;

                     while(true) {
                        if(var4 >= var5) {
                           var6 = var8;
                           break;
                        }

                        var8 = RSInterface.getInterfaceComponentForHash(var8.hoverPopup * -867206361, -1130139015);
                        if(var8 == null) {
                           var6 = null;
                           break;
                        }

                        ++var4;
                     }
                  }

                  var9 = var6;
                  if(null == var6) {
                     var9 = var0.aClass108_Sub17_1833;
                  }

                  Client.aClass108_Sub17_2878 = var9;
                  Client.anInt2879 = var1 * 1583426431;
                  Client.anInt2880 = var2 * 2043768653;
                  Class9.anInt127 = 0;
                  Client.aBool2888 = false;
                  if(ContextMenu.contextMenuRow * 391839991 > 0) {
                     ContextMenu.setLastContextMenuRow(ContextMenu.contextMenuRow * 391839991 - 1, 1460233291);
                  }
               }
            }
         }
      }
   }
}
