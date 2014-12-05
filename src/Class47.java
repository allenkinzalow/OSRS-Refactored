import java.io.IOException;

public class Class47 {

   static String LINE_BREAK = "<br>";
   static String FLASHING_CURSOR = "|";
   static String aString664 = "true";
   static String OPEN_PAREN = " (";
   static String CLOSE_PAREN = ")";
   static String COMMA_LITERAL = ",";
   static String aString668 = "->";
   static String COL_END = "</col>";
   static CacheIndex modelIndex;
   static final int anInt671 = 48;
   static final int anInt672 = 40;
   static int[][] anIntArrayArray673;
   static final int anInt674 = 20;
   static final int anInt675 = 25;
   static int anInt676;


   static final void method673(RSInterface[] var0, int var1, int var2) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         RSInterface var4 = var0[var3];
         if(null != var4 && var4.hoverPopup * -867206361 == var1 && (!var4.aBool1855 || !ClientScriptMap.method2161(var4, (byte)38))) {
            int var6;
            if(0 == var4.componentType * 942877543) {
               if(!var4.aBool1855 && ClientScriptMap.method2161(var4, (byte)13) && Class72.aClass108_Sub17_924 != var4) {
                  continue;
               }

               method673(var0, var4.interfaceHash * -1081473899, -891662399);
               if(null != var4.aClass108_Sub17Array1879) {
                  method673(var4.aClass108_Sub17Array1879, var4.interfaceHash * -1081473899, -1510095395);
               }

               Class108_Sub10 var5 = (Class108_Sub10) Client.aClass101_2866.get((long) (var4.interfaceHash * -1081473899));
               if(null != var5) {
                  var6 = var5.anInt1653 * 1557246219;
                  if(AbstractIndex.method1073(var6, -1000670592)) {
                     method673(RSInterface.interface_cache[var6], -1, -1348982981);
                  }
               }
            }

            if(var4.componentType * 942877543 == 6) {
               if(var4.mediaAnimID * 866704807 != -1 || var4.activeMediaAnimID * -1534484025 != -1) {
                  boolean var8 = GameDefinition.method1103(var4, (byte)-13);
                  if(var8) {
                     var6 = var4.activeMediaAnimID * -1534484025;
                  } else {
                     var6 = var4.mediaAnimID * 866704807;
                  }

                  if(var6 != -1) {
                     AnimationDefinition var7 = CullingCluster.method672(var6, 1404113681);

                     for(var4.anInt1805 += Client.anInt2780 * 1677688223; var4.anInt1805 * 443666099 > var7.frameLengths[var4.anInt1877 * -1365409805]; MouseInputHandler.method775(var4, -16054773)) {
                        var4.anInt1805 -= var7.frameLengths[var4.anInt1877 * -1365409805] * 1933545595;
                        var4.anInt1877 += 1450324283;
                        if(var4.anInt1877 * -1365409805 >= var7.frameDelays.length) {
                           var4.anInt1877 -= var7.frameStep * -1800118973;
                           if(var4.anInt1877 * -1365409805 < 0 || var4.anInt1877 * -1365409805 >= var7.frameDelays.length) {
                              var4.anInt1877 = 0;
                           }
                        }
                     }
                  }
               }

               if(var4.anInt1860 * -538436087 != 0 && !var4.aBool1855) {
                  int var9 = var4.anInt1860 * -538436087 >> 16;
                  var6 = var4.anInt1860 * -538436087 << 16 >> 16;
                  var9 *= Client.anInt2780 * 468305965;
                  var6 *= Client.anInt2780 * 468305965;
                  var4.mediaRotationX = (var9 + var4.mediaRotationX * -272801613 & 2047) * 1598312059;
                  var4.mediaRotationY = (var6 + var4.mediaRotationY * 260082763 & 2047) * 40361315;
                  MouseInputHandler.method775(var4, -16054773);
               }
            }
         }
      }

   }

   Class47() throws Throwable {
      throw new Error();
   }

   static void method678(int var0, int var1, int var2, int var3, int var4) {
      Class108_Sub12 var5 = (Class108_Sub12)Class108_Sub12.aClass101_1673.get((long) var0);
      if(var5 == null) {
         var5 = new Class108_Sub12();
         Class108_Sub12.aClass101_1673.put(var5, (long)var0);
      }

      if(var5.anIntArray1671.length <= var1) {
         int[] var6 = new int[1 + var1];
         int[] var8 = new int[1 + var1];

         int var7;
         for(var7 = 0; var7 < var5.anIntArray1671.length; ++var7) {
            var6[var7] = var5.anIntArray1671[var7];
            var8[var7] = var5.anIntArray1675[var7];
         }

         for(var7 = var5.anIntArray1671.length; var7 < var1; ++var7) {
            var6[var7] = -1;
            var8[var7] = 0;
         }

         var5.anIntArray1671 = var6;
         var5.anIntArray1675 = var8;
      }

      var5.anIntArray1671[var1] = var2;
      var5.anIntArray1675[var1] = var3;
   }

   public static void method680(GameConnection var0, boolean var1, int var2) {
      if(Class78.connection != null) {
         try {
            Class78.connection.disconnect();
         } catch (Exception var7) {
            ;
         }

         Class78.connection = null;
      }

      Class78.connection = var0;
      ClientScriptMap.method2171(var1, -1063552333);
      IsaacRandomGen.aClass108_Sub14_1213.position = 0;
      IsaacRandomGen.activeJs5Job = null;
      IsaacRandomGen.js5WorkBuffer = null;
      Class78.anInt1223 = 0;

      while(true) {
         Js5Request var3 = (Js5Request)Class78.urgentJs5Requests.method1304();
         if(var3 == null) {
            while(true) {
               var3 = (Js5Request)Class78.regularJs5Requests.method1304();
               if(null == var3) {
                  if(0 != IsaacRandomGen.js5EncryptionKey) {
                     try {
                        RSByteBuffer var8 = new RSByteBuffer(4);
                        var8.writeByte(4);
                        var8.writeByte(IsaacRandomGen.js5EncryptionKey);
                        var8.writeShort(0);
                        Class78.connection.writeBytes(var8.buf, 0, 4);
                     } catch (IOException var6) {
                        try {
                           Class78.connection.disconnect();
                        } catch (Exception var5) {
                           ;
                        }

                        Class78.anInt1230 += 1249054009;
                        Class78.connection = null;
                     }
                  }

                  Class78.anInt1212 = 0;
                  Class78.aLong1225 = Player.getCurrentTimeMillis(849846164) * 347508540560254295L;
                  return;
               }

               Class78.aClass98_1219.method1283(var3);
               Class78.aClass101_1220.put(var3, var3.key);
               Class78.anInt1221 += 831035281;
               Class78.anInt1224 -= 1752320189;
            }
         }

         Class78.aClass101_1228.put(var3, var3.key);
         Class78.anInt1216 -= 1906091653;
         Class78.anInt1218 -= 2075110651;
      }
   }
}
