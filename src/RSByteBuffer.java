import java.awt.Component;
import java.math.BigInteger;

public class RSByteBuffer extends Node {

   static int[] anIntArray1696 = new int[256];
   public int position;
   public byte[] buf;
   static final int anInt1699 = -306674912;


	public RSByteBuffer(byte[] var1) {
      this.buf = var1;
      this.position = 0;
   }

   public void writeByte(int var1) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)var1;
   }

   static {
      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = var1;

         for(int var0 = 0; var0 < 8; ++var0) {
            if(1 != (var2 & 1)) {
               var2 >>>= 1;
            } else {
               var2 = var2 >>> 1 ^ -306674912;
            }
         }

         anIntArray1696[var1] = var2;
      }

   }

   public int method1706(int var1) {
      this.position += 1075929622;
      return ((this.buf[this.position * 798331555 - 1] & 255) << 8) + (this.buf[this.position * 798331555 - 2] & 255);
   }

   public void method1708(int var1, int var2) {
      if(var1 >= 0 && var1 < 128) {
         this.writeByte(var1);
      } else if(var1 >= 0 && var1 < '\u8000') {
         this.writeShort(var1 + '\u8000');
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void writeLong(long var1) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)((int)(var1 >> 56));
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)((int)(var1 >> 48));
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)((int)(var1 >> 40));
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)((int)(var1 >> 32));
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)((int)(var1 >> 24));
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)((int)(var1 >> 16));
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)((int)(var1 >> 8));
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)((int)var1);
   }

   public int method1712(int var1) {
      this.position -= 2143108052;
      return ((this.buf[this.position * 798331555 - 1] & 255) << 16) + ((this.buf[this.position * 798331555 - 2] & 255) << 24) + ((this.buf[this.position * 798331555 - 4] & 255) << 8) + (this.buf[this.position * 798331555 - 3] & 255);
   }

   public void endShort(int var1, int var2) {
      this.buf[this.position * 798331555 - var1 - 2] = (byte)(var1 >> 8);
      this.buf[this.position * 798331555 - var1 - 1] = (byte)var1;
   }

   public void endByte(int var1, short var2) {
      this.buf[this.position * 798331555 - var1 - 1] = (byte)var1;
   }

   public void method1717(int var1, int var2) {
      if((var1 & -128) != 0) {
         if(0 != (var1 & -16384)) {
            if((var1 & -2097152) != 0) {
               if((var1 & -268435456) != 0) {
                  this.writeByte(var1 >>> 28 | 128);
               }

               this.writeByte(var1 >>> 21 | 128);
            }

            this.writeByte(var1 >>> 14 | 128);
         }

         this.writeByte(var1 >>> 7 | 128);
      }

      this.writeByte(var1 & 127);
   }

   public int readUByte() {
      return this.buf[(this.position += 537964811) * 798331555 - 1] & 255;
   }

   public byte readByte() {
      return this.buf[(this.position += 537964811) * 798331555 - 1];
   }

   public int readUShort(int var1) {
      this.position += 1075929622;
      return (this.buf[this.position * 798331555 - 1] & 255) + ((this.buf[this.position * 798331555 - 2] & 255) << 8);
   }

   public int method1721(int var1) {
      this.position += 1075929622;
      int var2 = ((this.buf[this.position * 798331555 - 2] & 255) << 8) + (this.buf[this.position * 798331555 - 1] & 255);
      if(var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int readInt() {
      this.position -= 2143108052;
      return (this.buf[this.position * 798331555 - 1] & 255) + ((this.buf[this.position * 798331555 - 3] & 255) << 16) + ((this.buf[this.position * 798331555 - 4] & 255) << 24) + ((this.buf[this.position * 798331555 - 2] & 255) << 8);
   }

   public long method1724(int var1) {
      long var2 = (long)this.readInt() & 4294967295L;
      long var4 = (long)this.readInt() & 4294967295L;
      return (var2 << 32) + var4;
   }

   public String method1725(int var1) {
      if(this.buf[this.position * 798331555] != 0) {
         return this.getString_2((byte)8);
      } else {
         this.position += 537964811;
         return null;
      }
   }

   public String getString_2(byte var1) {
      int var2 = this.position * 798331555;

      while(this.buf[(this.position += 537964811) * 798331555 - 1] != 0) {
         ;
      }

      int var3 = this.position * 798331555 - var2 - 1;
      return var3 == 0?"":ClientScriptDefinition.method2569(this.buf, var2, var3, (short)8324);
   }

   public String getString_1(byte var1) {
      byte var2 = this.buf[(this.position += 537964811) * 798331555 - 1];
      if(0 != var2) {
         throw new IllegalStateException("");
      } else {
         int var4 = this.position * 798331555;

         while(this.buf[(this.position += 537964811) * 798331555 - 1] != 0) {
            ;
         }

         int var3 = this.position * 798331555 - var4 - 1;
         return var3 == 0? "" : ClientScriptDefinition.method2569(this.buf, var4, var3, (short)-15566);
      }
   }

   public void readBytes(byte[] data, int offset, int length, int var4) {
      for(int position = offset; position < offset + length; ++position) {
         data[position] = this.buf[(this.position += 537964811) * 798331555 - 1];
      }

   }

   public void writeShort(int var1) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 8);
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)var1;
   }

   public int readSmart(short var1) {
      int val = this.buf[this.position * 798331555] & 0xff;
      return val < 128 ? this.readUByte() : this.readUShort(-933246967) - 0x8000;
   }

   public int method1733(int var1) {
      byte var2 = this.buf[(this.position += 537964811) * 798331555 - 1];

      int var3;
      for(var3 = 0; var2 < 0; var2 = this.buf[(this.position += 537964811) * 798331555 - 1]) {
         var3 = (var3 | var2 & 127) << 7;
      }

      return var3 | var2;
   }

   public void doXTEA(int[] var1, int var2, int var3, byte var4) {
      int var5 = this.position * 798331555;
      this.position = var2 * 537964811;
      int var8 = (var3 - var2) / 8;

      for(int var11 = 0; var11 < var8; ++var11) {
         int var9 = this.readInt();
         int var10 = this.readInt();
         int var6 = 0;
         int var7 = -1640531527;

         for(int var12 = 32; var12-- > 0; var10 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var6 + var1[var6 >>> 11 & 3]) {
            var9 += var10 + (var10 << 4 ^ var10 >>> 5) ^ var6 + var1[var6 & 3];
            var6 += var7;
         }

         this.position -= 8751192;
         this.writeInt(var9);
         this.writeInt(var10);
      }

      this.position = var5 * 537964811;
   }

   public void method1735(int[] var1, int var2, int var3, byte var4) {
      int var5 = this.position * 798331555;
      this.position = var2 * 537964811;
      int var9 = (var3 - var2) / 8;

      for(int var10 = 0; var10 < var9; ++var10) {
         if(var4 == 4) {
            return;
         }

         int var7 = this.readInt();
         int var11 = this.readInt();
         int var8 = -957401312;
         int var6 = -1640531527;

         for(int var12 = 32; var12-- > 0; var7 -= (var11 << 4 ^ var11 >>> 5) + var11 ^ var1[var8 & 3] + var8) {
            var11 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var8 >>> 11 & 3] + var8;
            var8 -= var6;
         }

         this.position -= 8751192;
         this.writeInt(var7);
         this.writeInt(var11);
      }

      this.position = var5 * 537964811;
   }

   /**
    *
    * @param exponent
    * @param modulus
    * @param var3
    */
   public void doRSA(BigInteger exponent, BigInteger modulus, byte var3) {
      int var4 = this.position * 798331555;
      this.position = 0;
      byte[] var7 = new byte[var4];
      this.readBytes(var7, 0, var4, -625529450);
      BigInteger var8 = new BigInteger(var7);
      BigInteger var5 = var8/*.modPow(exponent, modulus)*/;
      byte[] var6 = var5.toByteArray();
      this.position = 0;
      this.writeShort(var6.length);
      this.writeBytes(var6, 0, var6.length, (byte) -62);
   }

   public int method1737(int var1, int var2) {
      byte[] var3 = this.buf;
      int var7 = this.position * 798331555;
      int var5 = -1;

      for(int var6 = var1; var6 < var7; ++var6) {
         var5 = var5 >>> 8 ^ anIntArray1696[(var5 ^ var3[var6]) & 255];
      }

      var5 = ~var5;
      this.writeInt(var5);
      return var5;
   }

   public boolean method1738(byte var1) {
      this.position += 2143108052;
      byte[] var5 = this.buf;
      int var4 = this.position * 798331555;
      int var2 = -1;

      int var3;
      for(var3 = 0; var3 < var4; ++var3) {
         var2 = var2 >>> 8 ^ anIntArray1696[(var2 ^ var5[var3]) & 255];
      }

      var2 = ~var2;
      var3 = this.readInt();
      return var3 == var2;
   }

   public void method1739(int var1, byte var2) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(128 + var1);
   }

   public void writeByteN(int var1, byte var2) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(0 - var1);
   }

   public void method1741(int var1, int var2) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(128 - var1);
   }

   public int method1742(int var1) {
      return this.buf[(this.position += 537964811) * 798331555 - 1] - 128 & 255;
   }

   public byte method1745(int var1) {
      return (byte)(this.buf[(this.position += 537964811) * 798331555 - 1] - 128);
   }

   public int method1746(int var1) {
      int var2 = this.buf[this.position * 798331555] & 255;
      return var2 < 128 ? this.readUByte() - 64 : this.readUShort(658628703) - '\uc000';
   }

   public void method1748(int var1, int var2) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)var1;
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 8);
   }

   public void method1749(int var1, int var2) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 8);
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(128 + var1);
   }

   public int method1751(byte var1) {
      return 128 - this.buf[(this.position += 537964811) * 798331555 - 1] & 255;
   }

   public int readUShortA() {
      this.position += 1075929622;
      return ((this.buf[this.position * 798331555 - 2] & 255) << 8) + (this.buf[this.position * 798331555 - 1] - 128 & 255);
   }

   public void method1753(int var1, int var2) {
      this.buf[this.position * 798331555 - var1 - 4] = (byte)(var1 >> 24);
      this.buf[this.position * 798331555 - var1 - 3] = (byte)(var1 >> 16);
      this.buf[this.position * 798331555 - var1 - 2] = (byte)(var1 >> 8);
      this.buf[this.position * 798331555 - var1 - 1] = (byte)var1;
   }

   public int method1754(int var1) {
      this.position += 1075929622;
      int var2 = ((this.buf[this.position * 798331555 - 1] & 255) << 8) + (this.buf[this.position * 798331555 - 2] & 255);
      if(var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public void method1755(int var1, int var2) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)var1;
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 8);
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 16);
   }

   public void method1756(int var1, int var2) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)var1;
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 8);
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 16);
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 24);
   }

   public int readIntLE(int var1) {
      this.position -= 2143108052;
      return (this.buf[this.position * 798331555 - 4] & 255) + ((this.buf[this.position * 798331555 - 1] & 255) << 24) + ((this.buf[this.position * 798331555 - 2] & 255) << 16) + ((this.buf[this.position * 798331555 - 3] & 255) << 8);
   }

   public byte method1759(int var1) {
      return (byte)(0 - this.buf[(this.position += 537964811) * 798331555 - 1]);
   }

   public int method1761(int var1) {
      this.position -= 2143108052;
      return ((this.buf[this.position * 798331555 - 1] & 255) << 8) + ((this.buf[this.position * 798331555 - 3] & 255) << 24) + ((this.buf[this.position * 798331555 - 4] & 255) << 16) + (this.buf[this.position * 798331555 - 2] & 255);
   }

   public int method1776(int var1) {
      return this.buf[this.position * 798331555] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUShort(-138525507);
   }

   public void method1781(byte[] var1, int var2, int var3, int var4) {
      for(int var5 = var2; var5 < var2 + var3; ++var5) {
         var1[var5] = (byte)(this.buf[(this.position += 537964811) * 798331555 - 1] - 128);
      }

   }

   public byte method1786(int var1) {
      return (byte)(128 - this.buf[(this.position += 537964811) * 798331555 - 1]);
   }

   public void writeAShortLE(int var1, byte var2) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 + 128);
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 8);
   }

   public void writeTriByte(int var1) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 16);
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 8);
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)var1;
   }

   public int method1809(int var1) {
      this.position += 1613894433;
      return (this.buf[this.position * 798331555 - 1] & 255) + ((this.buf[this.position * 798331555 - 2] & 255) << 8) + ((this.buf[this.position * 798331555 - 3] & 255) << 16);
   }

   public int readUNegByte(byte var1) {
      return 0 - this.buf[(this.position += 537964811) * 798331555 - 1] & 255;
   }

   public void writeInt(int var1) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 24);
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 16);
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 8);
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)var1;
   }

   public void writeString(String var1) {
      int var3 = var1.indexOf(0);
      if(var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.position += VertexNormal.method696(var1, 0, var1.length(), this.buf, this.position * 798331555, -103601413) * 537964811;
         this.buf[(this.position += 537964811) * 798331555 - 1] = 0;
      }
   }

   public String method1837(short var1) {
      byte var2 = this.buf[(this.position += 537964811) * 798331555 - 1];
      if(0 != var2) {
         throw new IllegalStateException("");
      } else {
         int var5 = this.method1733(-2044878662);
         if(var5 + this.position * 798331555 > this.buf.length) {
            throw new IllegalStateException("");
         } else {
            byte[] var6 = this.buf;
            int var3 = this.position * 798331555;
            char[] var9 = new char[var5];
            int var11 = 0;
            int var7 = var3;

            int var8;
            for(int var10 = var5 + var3; var7 < var10; var9[var11++] = (char)var8) {
               int var4 = var6[var7++] & 255;
               if(var4 < 128) {
                  if(0 == var4) {
                     var8 = '\ufffd';
                  } else {
                     var8 = var4;
                  }
               } else if(var4 < 192) {
                  var8 = '\ufffd';
               } else if(var4 < 224) {
                  if(var7 < var10 && (var6[var7] & 192) == 128) {
                     var8 = (var4 & 31) << 6 | var6[var7++] & 63;
                     if(var8 < 128) {
                        var8 = '\ufffd';
                     }
                  } else {
                     var8 = '\ufffd';
                  }
               } else if(var4 < 240) {
                  if(1 + var7 < var10 && (var6[var7] & 192) == 128 && 128 == (var6[var7 + 1] & 192)) {
                     var8 = (var4 & 15) << 12 | (var6[var7++] & 63) << 6 | var6[var7++] & 63;
                     if(var8 < 2048) {
                        var8 = '\ufffd';
                     }
                  } else {
                     var8 = '\ufffd';
                  }
               } else if(var4 < 248) {
                  if(2 + var7 < var10 && (var6[var7] & 192) == 128 && 128 == (var6[1 + var7] & 192) && 128 == (var6[var7 + 2] & 192)) {
                     var8 = (var4 & 7) << 18 | (var6[var7++] & 63) << 12 | (var6[var7++] & 63) << 6 | var6[var7++] & 63;
                     if(var8 >= 65536 && var8 <= 1114111) {
                        var8 = '\ufffd';
                     } else {
                        var8 = '\ufffd';
                     }
                  } else {
                     var8 = '\ufffd';
                  }
               } else {
                  var8 = '\ufffd';
               }
            }

            String var12 = new String(var9, 0, var11);
            this.position += var5 * 537964811;
            return var12;
         }
      }
   }

   public void method1840(CharSequence var1, byte var2) {
      int var3 = CacheIndexRequest.method1925(var1, -210357089);
      this.buf[(this.position += 537964811) * 798331555 - 1] = 0;
      this.method1717(var3, 114148232);
      this.position += Friend.method663(this.buf, this.position * 798331555, var1, -800896698) * 537964811;
   }

   public void method1846(int var1, int var2) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 16);
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 24);
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)var1;
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 8);
   }

   public void method1853(String var1, int var2) {
      int var3 = var1.indexOf(0);
      if(var3 < 0) {
         this.buf[(this.position += 537964811) * 798331555 - 1] = 0;
         this.position += VertexNormal.method696(var1, 0, var1.length(), this.buf, this.position * 798331555, -103601413) * 537964811;
         this.buf[(this.position += 537964811) * 798331555 - 1] = 0;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   public void method1856(int var1, short var2) {
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 8);
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)var1;
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 24);
      this.buf[(this.position += 537964811) * 798331555 - 1] = (byte)(var1 >> 16);
   }

   public int readUShortLEA() {
      this.position += 1075929622;
      return ((this.buf[this.position * 798331555 - 1] & 0xff) << 8) + (this.buf[this.position * 798331555 - 2] - 128 & 0xff);
   }

   public RSByteBuffer(int size) {
      this.buf = LoginHandler.method879(size, (byte)-128);
      this.position = 0;
   }

   public void writeBytes(byte[] var1, int var2, int var3, byte var4) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         this.buf[(this.position += 537964811) * 798331555 - 1] = var1[var5];
      }

   }

}
