import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Js5Request extends CacheableNode {

   byte aByte2299;
   CacheIndex aClass74_Sub1_2300;
   int assumedCRC;


   public static void writeClassVerifierResults(RSPacketBuffer buffer, int var1/*unused*/) {
      ClientVerifier verifier = (ClientVerifier) Class92.aClass92_1447.method1155();
      if(verifier != null) {
         int position = buffer.position * 798331555;
         buffer.writeInt(verifier.anInt1932 * 461892307);

         for(int verifyIndex = 0; verifyIndex < verifier.verifyCount * 953651105; ++verifyIndex) {
            if(0 != verifier.errorIdentifiers[verifyIndex]) { // if an error occured, write it.
               buffer.writeByte(verifier.errorIdentifiers[verifyIndex]);
            } else {
               try {
                  int verifyType = verifier.type[verifyIndex];
                  Field classField;
                  int fieldValue;
                  if(0 == verifyType) {
                     classField = verifier.clientFields[verifyIndex];
                     fieldValue = classField.getInt((Object)null);
                     buffer.writeByte(0);
                     buffer.writeInt(fieldValue);
                  } else if(verifyType == 1) {
                     classField = verifier.clientFields[verifyIndex];
                     classField.setInt((Object)null, verifier.fieldValues[verifyIndex]);
                     buffer.writeByte(0);
                  } else if(2 == verifyType) {
                     classField = verifier.clientFields[verifyIndex];
                     fieldValue = classField.getModifiers();
                     buffer.writeByte(0);
                     buffer.writeInt(fieldValue);
                  }

                  Method classMethod;
                  if(3 == verifyType) {
                     classMethod = verifier.clientMethods[verifyIndex];
                     byte[][] methodData = verifier.methodByteArray[verifyIndex];
                     Object[] method = new Object[methodData.length];

                     for(int index = 0; index < methodData.length; ++index) {
                        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(methodData[index]));
                        method[index] = ois.readObject();
                     }

                     Object invokedMethod = classMethod.invoke((Object)null, method);
                     if(null == invokedMethod) {
                        buffer.writeByte(0);
                     } else if(invokedMethod instanceof Number) {
                        buffer.writeByte(1);
                        buffer.writeLong(((Number)invokedMethod).longValue());
                     } else if(invokedMethod instanceof String) {
                        buffer.writeByte(2);
                        buffer.writeString((String) invokedMethod);
                     } else {
                        buffer.writeByte(4);
                     }
                  } else if(verifyType == 4) {
                     classMethod = verifier.clientMethods[verifyIndex];
                     fieldValue = classMethod.getModifiers();
                     buffer.writeByte(0);
                     buffer.writeInt(fieldValue);
                  }
               } catch (ClassNotFoundException var11) {
                  buffer.writeByte(-10);
               } catch (InvalidClassException var12) {
                  buffer.writeByte(-11);
               } catch (StreamCorruptedException var13) {
                  buffer.writeByte(-12);
               } catch (OptionalDataException var14) {
                  buffer.writeByte(-13);
               } catch (IllegalAccessException var15) {
                  buffer.writeByte(-14);
               } catch (IllegalArgumentException var16) {
                  buffer.writeByte(-15);
               } catch (InvocationTargetException var17) {
                  buffer.writeByte(-16);
               } catch (SecurityException var18) {
                  buffer.writeByte(-17);
               } catch (IOException var19) {
                  buffer.writeByte(-18);
               } catch (NullPointerException var20) {
                  buffer.writeByte(-19);
               } catch (Exception var21) {
                  buffer.writeByte(-20);
               } catch (Throwable var22) {
                  buffer.writeByte(-21);
               }
            }
         }

         buffer.method1737(position, -2122851325);
         verifier.unlink();
      }
   }

   static final void method2600(int xOffset, int yOffset, int var2, int var3, int var4) {
      if(Client.anInt2813 * -1596091641 == 1) {
         WallDecoration.crossSprites[Client.anInt2829 * -759709545 / 100].method2746(Client.anInt2810 * 719674059 - 8, Client.anInt2811 * -1671710575 - 8);
      }

      if(Client.anInt2813 * -1596091641 == 2) {
         WallDecoration.crossSprites[4 + Client.anInt2829 * -759709545 / 100].method2746(Client.anInt2810 * 719674059 - 8, Client.anInt2811 * -1671710575 - 8);
      }

      Client.anInt2822 = 0;
      int xPos = Class100.anInt1388 * 263051377 + (Player.myPlayer.anInt2394 * 171470795 >> 7);
      int yPos = SoundEffectWorker.anInt201 * -1743142671 + (Player.myPlayer.anInt2339 * 826764905 >> 7);
      if(xPos >= 3053 && xPos <= 3156 && yPos >= 3056 && yPos <= 3136) {
         Client.anInt2822 = 949480073;
      }

      if(xPos >= 3072 && xPos <= 3118 && yPos >= 9492 && yPos <= 9535) {
         Client.anInt2822 = 949480073;
      }

      if(Client.anInt2822 * -526472263 == 1 && xPos >= 3139 && xPos <= 3199 && yPos >= 3008 && yPos <= 3062) {
         Client.anInt2822 = 0;
      }

      if(Client.aBool2721) {
         xPos = xOffset + 512 - 5;
         yPos = 20 + yOffset;
         ObjectDefinition.p12_full_font.method3095("Fps:" + Client.clientFPS * 1402361595, xPos, yPos, 16776960, -1);
         yPos += 15;
         Runtime runtime = Runtime.getRuntime();
         int memory = (int)((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
         int color = 16776960;
         if(memory > '\u8000' && Client.lowMemory) {
            color = 16711680;
         }

         if(memory > 65536 && !Client.lowMemory) {
            color = 16711680;
         }

         ObjectDefinition.p12_full_font.method3095("Mem:" + memory + "k", xPos, yPos, color, -1);
         yPos += 15;
      }
   }

   static final boolean method2601(RSInterface var0, int var1) {
      int var2 = var0.anInt1886 * -917776085;
      if(205 == var2) {
         Client.anInt2753 = -693093638;
         return true;
      } else {
         int var3;
         int var4;
         if(var2 >= 300 && var2 <= 313) {
            var3 = (var2 - 300) / 2;
            var4 = var2 & 1;
            Client.aClass93_2926.method1169(var3, 1 == var4, -304440969);
         }

         if(var2 >= 314 && var2 <= 323) {
            var3 = (var2 - 314) / 2;
            var4 = var2 & 1;
            Client.aClass93_2926.method1195(var3, 1 == var4, (byte)43);
         }

         if(var2 == 324) {
            Client.aClass93_2926.method1170(false, (byte)7);
         }

         if(325 == var2) {
            Client.aClass93_2926.method1170(true, (byte)63);
         }

         if(326 == var2) {
            Client.secureBuffer.writePacket(246);
            Client.aClass93_2926.method1171(Client.secureBuffer, -1722446242);
            return true;
         } else {
            return false;
         }
      }
   }

   public static int method2602(int var0, byte var1) {
      return var0 >> 17 & 7;
   }

   static void submitJs5Request(CacheIndex var0, int index, int archive, int var3, byte var4, boolean var5, byte var6) {
       long key = (long) (archive + (index << 16));
       Js5Request req = (Js5Request) Class78.aClass101_1228.get(key);

       if (null == req) {
           req = (Js5Request) Class78.urgentJs5Requests.get(key);
           if (null == req) {
               req = (Js5Request) Class78.aClass101_1220.get(key);
               if (req != null) {
                   if (var5) {
                       req.method1982();
                       Class78.aClass101_1228.put(req, key);
                       Class78.anInt1221 -= 831035281;
                       Class78.anInt1216 -= 1906091653;
                   }
               } else  {
                   if (!var5) {
                       req = (Js5Request) Class78.regularJs5Requests.get(key);

                       if (null != req) {
                           return;
                       }
                   }

                   req = new Js5Request();
                   req.aClass74_Sub1_2300 = var0;
                   req.assumedCRC = var3 * 1016544135;
                   req.aByte2299 = var4;

                   if (var5) {
                       Class78.aClass101_1228.put(req, key);
                       Class78.anInt1216 -= 1906091653;
                   } else {
                       Class78.aClass98_1219.method1282(req);
                       Class78.aClass101_1220.put(req, key);
                       Class78.anInt1221 += 831035281;
                   }
               }
           }
       }
   }
}
