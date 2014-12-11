import java.io.IOException;
import java.util.Date;

public class ClientScriptMap extends CacheableNode {

   public int csMapIntIdentifier;
   static CacheableNodeMap csMapCache = new CacheableNodeMap(64);
   public char aChar2053;
   public static AbstractIndex configIndexReference;
   public char aChar2055;
   public static PingRequester pringRequester;
   public String csMapStringIdentifier = "null";
   public int[] anIntArray2058;
   public int csMapValueCount = 0;
   public String[] csMapStringValues;
   public static final int anInt2061 = 79;
   public static final int anInt2062 = 206;
   static int anInt2063;
   public int[] csMapIntValues;


   static boolean isComponentHidden(RSInterface component, byte var1) {
      if(Client.aBool2875) {
         if(Class32.method576(component, 321089465) != 0) {
            return false;
         }

         if(component.componentType * 942877543 == 0) {
            return false;
         }
      }

      return component.hidden;
   }

   public static ClientScriptMap getCSMapForID(int csMapID, int var1) {
      ClientScriptMap csMap = (ClientScriptMap) csMapCache.get((long) csMapID);
      if(csMap != null) {
         return csMap;
      } else {
         byte[] csMapData = configIndexReference.getFile(8, csMapID, (byte) 7);
         csMap = new ClientScriptMap();
         if(null != csMapData) {
            csMap.decode(new RSByteBuffer(csMapData), (short)-599);
         }

         csMapCache.put(csMap, (long) csMapID);
         return csMap;
      }
   }

   void decode(RSByteBuffer buffer, short var2) {
      while(true) {
         int opcode = buffer.readUByte();
         if(0 == opcode) {
            return;
         }

         this.decode(buffer, opcode, -1944612610);
      }
   }

   void decode(RSByteBuffer buffer, int opcode, int var3) {
      if(1 == opcode) {
         this.aChar2053 = (char)buffer.readUByte();
      } else if(2 == opcode) {
         this.aChar2055 = (char)buffer.readUByte();
      } else if(3 == opcode) {
         this.csMapStringIdentifier = buffer.getString_2((byte)8);
      } else if(4 == opcode) {
         this.csMapIntIdentifier = buffer.readInt() * -1217209501;
      } else {
         int var4;
         if(opcode == 5) {
            this.csMapValueCount = buffer.readUShort(2048882183) * 801211273;
            this.anIntArray2058 = new int[this.csMapValueCount * -1484660039];
            this.csMapStringValues = new String[this.csMapValueCount * -1484660039];

            for(var4 = 0; var4 < this.csMapValueCount * -1484660039; ++var4) {
               this.anIntArray2058[var4] = buffer.readInt();
               this.csMapStringValues[var4] = buffer.getString_2((byte)8);
            }

         } else if(opcode == 6) {
            this.csMapValueCount = buffer.readUShort(48811728) * 801211273;
            this.anIntArray2058 = new int[this.csMapValueCount * -1484660039];
            this.csMapIntValues = new int[this.csMapValueCount * -1484660039];

            for(var4 = 0; var4 < this.csMapValueCount * -1484660039; ++var4) {
               this.anIntArray2058[var4] = buffer.readInt();
               this.csMapIntValues[var4] = buffer.readInt();
            }

         }
      }
   }

   public static RuntimeException_Sub1 method2166(Throwable var0, String var1) {
      RuntimeException_Sub1 var2;
      if(!(var0 instanceof RuntimeException_Sub1)) {
         var2 = new RuntimeException_Sub1(var0, var1);
      } else {
         var2 = (RuntimeException_Sub1)var0;
         var2.aString2632 = var2.aString2632 + ' ' + var1;
      }

      return var2;
   }

   static void executeScript(ClientScript script, int instrAmount, short var2) {
      Object[] parameters = script.parameters;
      int scriptID = ((Integer)parameters[0]).intValue();
      ClientScriptDefinition definition = ChatMessagesContainer.getClientScriptDefinition(scriptID, 826764905);
      if(null != definition) {
         int iStackPtr = 0;
         int stringStackPtr = 0;
         int var8 = -1; 
         int[] instructions = definition.instructions;
         int[] intOperands = definition.intOperands;
         byte var11 = -1; 
         Class5.anInt81 = 0;

         int paramIndex;
         try {
            Class119.intLocals = new int[definition.localIntCount * 1956269049];
            int var12 = 0;
            Class54.stringLocals = new String[definition.localStringCount * -741147275];
            int var34 = 0;

            int parameter;
            String strInstr;
            for(paramIndex = 1; paramIndex < parameters.length; ++paramIndex) {
               if(parameters[paramIndex] instanceof Integer) {
                  parameter = ((Integer)parameters[paramIndex]).intValue();
                  if(parameter == -2147483647) {
                     parameter = script.mouseX * 725336703;
                  }

                  if(parameter == -2147483646) {
                     parameter = script.mouseY * 613940867;
                  }

                  if(parameter == -2147483645) {
                     parameter = null != script.parentInterface?script.parentInterface.interfaceHash * -1081473899:-1;
                  }

                  if(-2147483644 == parameter) {
                     parameter = script.anInt1640 * 1899534189;
                  }

                  if(-2147483643 == parameter) {
                     parameter = null != script.parentInterface ?script.parentInterface.anInt1772 * -490007465:-1;
                  }

                  if(parameter == -2147483642) {
                     parameter = null != script.aClass108_Sub17_1641?script.aClass108_Sub17_1641.interfaceHash * -1081473899:-1;
                  }

                  if(-2147483641 == parameter) {
                     parameter = script.aClass108_Sub17_1641 != null?script.aClass108_Sub17_1641.anInt1772 * -490007465:-1;
                  }

                  if(-2147483640 == parameter) {
                     parameter = script.keyCode * -1417028315;
                  }

                  if(-2147483639 == parameter) {
                     parameter = script.keyChar * 1510972659;
                  }

                  Class119.intLocals[var12++] = parameter;
               } else if(parameters[paramIndex] instanceof String) {
                  strInstr = (String)parameters[paramIndex];
                  if(strInstr.equals("event_opbase")) {
                     strInstr = script.aString1642;
                  }

                  Class54.stringLocals[var34++] = strInstr;
               }
            }

            paramIndex = 0;

            label2481:
            while(true) {
               ++paramIndex;
               if(paramIndex > instrAmount) {
                  throw new RuntimeException();
               }

               ++var8;
               int instruction = instructions[var8];
               int var16;
               int var17;
               int var21;
               int var38;
               int var41;
               int var50;
               String var56;
               String var58;
               String[] var71;
               String var76;
               String var83;
               int[] var84;
               if(instruction < 100) {
                  if(instruction == 0) {
                     Class5.intStack[iStackPtr++] = intOperands[var8];
                     continue;
                  }

                  if(1 == instruction) {
                     parameter = intOperands[var8];
                     Class5.intStack[iStackPtr++] = Class88.configSettings[parameter];
                     continue;
                  }

                  if(instruction == 2) {
                     parameter = intOperands[var8];
                     --iStackPtr;
                     Class88.configSettings[parameter] = Class5.intStack[iStackPtr];
                     CacheConstants.method1097(parameter, (byte)-115);
                     continue;
                  }

                  if(instruction == 3) {
                     Class5.stringStack[stringStackPtr++] = definition.aStringArray2272[var8];
                     continue;
                  }

                  if(instruction == 6) {
                     var8 += intOperands[var8];
                     continue;
                  }

                  if(7 == instruction) {
                     iStackPtr -= 2;
                     if(Class5.intStack[iStackPtr + 1] != Class5.intStack[iStackPtr]) {
                        var8 += intOperands[var8];
                     }
                     continue;
                  }

                  if(instruction == 8) {
                     iStackPtr -= 2;
                     if(Class5.intStack[iStackPtr] == Class5.intStack[iStackPtr + 1]) {
                        var8 += intOperands[var8];
                     }
                     continue;
                  }

                  if(instruction == 9) {
                     iStackPtr -= 2;
                     if(Class5.intStack[iStackPtr] < Class5.intStack[iStackPtr + 1]) {
                        var8 += intOperands[var8];
                     }
                     continue;
                  }

                  if(instruction == 10) {
                     iStackPtr -= 2;
                     if(Class5.intStack[iStackPtr] > Class5.intStack[1 + iStackPtr]) {
                        var8 += intOperands[var8];
                     }
                     continue;
                  }

                  if(21 == instruction) {
                     if(Class5.anInt81 * 2146486549 == 0) {
                        return;
                     }

                     Class51 var70 = Class5.aClass51Array82[(Class5.anInt81 += 2005320131) * 2146486549];
                     definition = var70.aClass108_Sub20_Sub17_711;
                     instructions = definition.instructions;
                     intOperands = definition.intOperands;
                     var8 = var70.anInt708 * 52913063;
                     Class119.intLocals = var70.anIntArray709;
                     Class54.stringLocals = var70.aStringArray715;
                     continue;
                  }

                  if(25 == instruction) {
                     parameter = intOperands[var8];
                     Class5.intStack[iStackPtr++] = BuildType.method1094(parameter, -511913587);
                     continue;
                  }

                  if(instruction == 27) {
                     parameter = intOperands[var8];
                     --iStackPtr;
                     var16 = Class5.intStack[iStackPtr];
                     VarpBit var92 = ChatMessagesContainer.method358(parameter, 2117507523);
                     var38 = var92.configId * 863090207;
                     var41 = var92.leastSigBit * 194527281;
                     var50 = var92.mostSigBit * -944103735;
                     var21 = Class88.anIntArray1314[var50 - var41];
                     if(var16 < 0 || var16 > var21) {
                        var16 = 0;
                     }

                     var21 <<= var41;
                     Class88.configSettings[var38] = Class88.configSettings[var38] & ~var21 | var16 << var41 & var21;
                     continue;
                  }

                  if(31 == instruction) {
                     iStackPtr -= 2;
                     if(Class5.intStack[iStackPtr] <= Class5.intStack[1 + iStackPtr]) {
                        var8 += intOperands[var8];
                     }
                     continue;
                  }

                  if(32 == instruction) {
                     iStackPtr -= 2;
                     if(Class5.intStack[iStackPtr] >= Class5.intStack[iStackPtr + 1]) {
                        var8 += intOperands[var8];
                     }
                     continue;
                  }

                  if(instruction == 33) {
                     Class5.intStack[iStackPtr++] = Class119.intLocals[intOperands[var8]];
                     continue;
                  }

                  int var10001;
                  if(34 == instruction) {
                     var10001 = intOperands[var8];
                     --iStackPtr;
                     Class119.intLocals[var10001] = Class5.intStack[iStackPtr];
                     continue;
                  }

                  if(instruction == 35) {
                     Class5.stringStack[stringStackPtr++] = Class54.stringLocals[intOperands[var8]];
                     continue;
                  }

                  if(36 == instruction) {
                     var10001 = intOperands[var8];
                     --stringStackPtr;
                     Class54.stringLocals[var10001] = Class5.stringStack[stringStackPtr];
                     continue;
                  }

                  if(instruction == 37) {
                     parameter = intOperands[var8];
                     stringStackPtr -= parameter;
                     String[] stringStack = Class5.stringStack;
                     if(0 == parameter) {
                        var83 = "";
                     } else if(1 == parameter) {
                        var76 = stringStack[stringStackPtr];
                        if(null == var76) {
                           var83 = "null";
                        } else {
                           var83 = var76.toString();
                        }
                     } else {
                        var38 = parameter + stringStackPtr;
                        var41 = 0;

                        for(var50 = stringStackPtr; var50 < var38; ++var50) {
                           var58 = stringStack[var50];
                           if(var58 == null) {
                              var41 += 4;
                           } else {
                              var41 += var58.length();
                           }
                        }

                        StringBuilder var87 = new StringBuilder(var41);

                        for(var21 = stringStackPtr; var21 < var38; ++var21) {
                           var56 = stringStack[var21];
                           if(var56 == null) {
                              var87.append("null");
                           } else {
                              var87.append(var56);
                           }
                        }

                        var83 = var87.toString();
                     }

                     Class5.stringStack[stringStackPtr++] = var83;
                     continue;
                  }

                  if(instruction == 38) {
                     --iStackPtr;
                     continue;
                  }

                  if(39 == instruction) {
                     --stringStackPtr;
                     continue;
                  }

                  if(instruction == 40) {
                     parameter = intOperands[var8];
                     ClientScriptDefinition var95 = ChatMessagesContainer.getClientScriptDefinition(parameter, 826764905);
                     var84 = new int[var95.localIntCount * 1956269049];
                     var71 = new String[var95.localStringCount * -741147275];

                     for(var41 = 0; var41 < var95.anInt2269 * -268834427; ++var41) {
                        var84[var41] = Class5.intStack[iStackPtr - var95.anInt2269 * -268834427 + var41];
                     }

                     for(var41 = 0; var41 < var95.anInt2276 * -1101265763; ++var41) {
                        var71[var41] = Class5.stringStack[stringStackPtr - var95.anInt2276 * -1101265763 + var41];
                     }

                     iStackPtr -= var95.anInt2269 * -268834427;
                     stringStackPtr -= var95.anInt2276 * -1101265763;
                     Class51 var93 = new Class51();
                     var93.aClass108_Sub20_Sub17_711 = definition;
                     var93.anInt708 = var8 * 948638743;
                     var93.anIntArray709 = Class119.intLocals;
                     var93.aStringArray715 = Class54.stringLocals;
                     Class5.aClass51Array82[(Class5.anInt81 -= 2005320131) * 2146486549 - 1] = var93;
                     definition = var95;
                     instructions = var95.instructions;
                     intOperands = var95.intOperands;
                     var8 = -1;
                     Class119.intLocals = var84;
                     Class54.stringLocals = var71;
                     continue;
                  }

                  if(42 == instruction) {
                     Class5.intStack[iStackPtr++] = Client.anIntArray2864[intOperands[var8]];
                     continue;
                  }

                  if(instruction == 43) {
                     var10001 = intOperands[var8];
                     --iStackPtr;
                     Client.anIntArray2864[var10001] = Class5.intStack[iStackPtr];
                     continue;
                  }

                  if(instruction == 44) {
                     parameter = intOperands[var8] >> 16;
                     var16 = intOperands[var8] & '\uffff';
                     --iStackPtr;
                     var17 = Class5.intStack[iStackPtr];
                     if(var17 >= 0 && var17 <= 5000) {
                        Class5.anIntArray77[parameter] = var17;
                        byte var85 = -1;
                        if(var16 == 105) {
                           var85 = 0;
                        }

                        var41 = 0;

                        while(true) {
                           if(var41 >= var17) {
                              continue label2481;
                           }

                           Class5.anIntArrayArray78[parameter][var41] = var85;
                           ++var41;
                        }
                     }

                     throw new RuntimeException();
                  }

                  if(instruction == 45) {
                     parameter = intOperands[var8];
                     --iStackPtr;
                     var16 = Class5.intStack[iStackPtr];
                     if(var16 >= 0 && var16 < Class5.anIntArray77[parameter]) {
                        Class5.intStack[iStackPtr++] = Class5.anIntArrayArray78[parameter][var16];
                        continue;
                     }

                     throw new RuntimeException();
                  }

                  if(46 == instruction) {
                     parameter = intOperands[var8];
                     iStackPtr -= 2;
                     var16 = Class5.intStack[iStackPtr];
                     if(var16 >= 0 && var16 < Class5.anIntArray77[parameter]) {
                        Class5.anIntArrayArray78[parameter][var16] = Class5.intStack[1 + iStackPtr];
                        continue;
                     }

                     throw new RuntimeException();
                  }

                  if(47 == instruction) {
                     strInstr = Client.aStringArray2901[intOperands[var8]];
                     if(null == strInstr) {
                        strInstr = "null";
                     }

                     Class5.stringStack[stringStackPtr++] = strInstr;
                     continue;
                  }

                  if(instruction == 48) {
                     var10001 = intOperands[var8];
                     --stringStackPtr;
                     Client.aStringArray2901[var10001] = Class5.stringStack[stringStackPtr];
                     continue;
                  }
               }

               boolean var52;
               if(1 == intOperands[var8]) {
                  var52 = true;
               } else {
                  var52 = false;
               }

               RSInterface var18;
               RSInterface var19;
               RSInterface var35;
               if(instruction < 1000) {
                  if(100 == instruction) {
                     iStackPtr -= 3;
                     var16 = Class5.intStack[iStackPtr];
                     var17 = Class5.intStack[1 + iStackPtr];
                     var38 = Class5.intStack[2 + iStackPtr];
                     if(var17 == 0) {
                        throw new RuntimeException();
                     }

                     var19 = CacheIndexRequest.getInterfaceComponentForHash(var16, 1581710715);
                     if(null == var19.aClass108_Sub17Array1879) {
                        var19.aClass108_Sub17Array1879 = new RSInterface[var38 + 1];
                     }

                     if(var19.aClass108_Sub17Array1879.length <= var38) {
                        RSInterface[] var20 = new RSInterface[1 + var38];

                        for(var21 = 0; var21 < var19.aClass108_Sub17Array1879.length; ++var21) {
                           var20[var21] = var19.aClass108_Sub17Array1879[var21];
                        }

                        var19.aClass108_Sub17Array1879 = var20;
                     }

                     if(var38 > 0 && null == var19.aClass108_Sub17Array1879[var38 - 1]) {
                        throw new RuntimeException("" + (var38 - 1));
                     }

                     RSInterface var42 = new RSInterface();
                     var42.componentType = var17 * -820395945;
                     var42.hoverPopup = (var42.interfaceHash = var19.interfaceHash * 1) * -136820765;
                     var42.anInt1772 = var38 * -941549721;
                     var42.aBool1855 = true;
                     var19.aClass108_Sub17Array1879[var38] = var42;
                     if(var52) {
                        Class19.aClass108_Sub17_230 = var42;
                     } else {
                        BuildType.aClass108_Sub17_1231 = var42;
                     }

                     MouseInputHandler.method775(var19, -16054773);
                     continue;
                  }

                  if(instruction == 101) {
                     var35 = var52?Class19.aClass108_Sub17_230:BuildType.aClass108_Sub17_1231;
                     RSInterface var36 = CacheIndexRequest.getInterfaceComponentForHash(var35.interfaceHash * -1081473899, 32288499);
                     var36.aClass108_Sub17Array1879[var35.anInt1772 * -490007465] = null;
                     MouseInputHandler.method775(var36, -16054773);
                     continue;
                  }

                  if(102 == instruction) {
                     --iStackPtr;
                     var35 = CacheIndexRequest.getInterfaceComponentForHash(Class5.intStack[iStackPtr], 1687596111);
                     var35.aClass108_Sub17Array1879 = null;
                     MouseInputHandler.method775(var35, -16054773);
                     continue;
                  }

                  if(200 == instruction) {
                     iStackPtr -= 2;
                     var16 = Class5.intStack[iStackPtr];
                     var17 = Class5.intStack[iStackPtr + 1];
                     var18 = LoginHandler.method878(var16, var17, 2110196290);
                     if(var18 != null && var17 != -1) {
                        Class5.intStack[iStackPtr++] = 1;
                        if(var52) {
                           Class19.aClass108_Sub17_230 = var18;
                        } else {
                           BuildType.aClass108_Sub17_1231 = var18;
                        }
                        continue;
                     }

                     Class5.intStack[iStackPtr++] = 0;
                     continue;
                  }
               } else {
                  boolean var37;
                  if((instruction < 1000 || instruction >= 1100) && (instruction < 2000 || instruction >= 2100)) {
                     String var39;
                     if((instruction < 1100 || instruction >= 1200) && (instruction < 2100 || instruction >= 2200)) {
                        if((instruction < 1200 || instruction >= 1300) && (instruction < 2200 || instruction >= 2300)) {
                           if((instruction < 1300 || instruction >= 1400) && (instruction < 2300 || instruction >= 2400)) {
                              int[] var51;
                              if(instruction >= 1400 && instruction < 1500 || instruction >= 2400 && instruction < 2500) {
                                 if(instruction >= 2000) {
                                    instruction -= 1000;
                                    --iStackPtr;
                                    var35 = CacheIndexRequest.getInterfaceComponentForHash(Class5.intStack[iStackPtr], 708182564);
                                 } else {
                                    var35 = var52?Class19.aClass108_Sub17_230:BuildType.aClass108_Sub17_1231;
                                 }

                                 --stringStackPtr;
                                 var39 = Class5.stringStack[stringStackPtr];
                                 var51 = null;
                                 if(var39.length() > 0 && var39.charAt(var39.length() - 1) == 89) {
                                    --iStackPtr;
                                    var41 = Class5.intStack[iStackPtr];
                                    if(var41 > 0) {
                                       for(var51 = new int[var41]; var41-- > 0; var51[var41] = Class5.intStack[iStackPtr]) {
                                          --iStackPtr;
                                       }
                                    }

                                    var39 = var39.substring(0, var39.length() - 1);
                                 }

                                 Object[] var90 = new Object[var39.length() + 1];

                                 for(var50 = var90.length - 1; var50 >= 1; --var50) {
                                    if(var39.charAt(var50 - 1) == 115) {
                                       --stringStackPtr;
                                       var90[var50] = Class5.stringStack[stringStackPtr];
                                    } else {
                                       Integer var10002;
                                       --iStackPtr;
                                       var10002 = new Integer(Class5.intStack[iStackPtr]);
                                       var90[var50] = var10002;
                                    }
                                 }

                                 --iStackPtr;
                                 var50 = Class5.intStack[iStackPtr];
                                 if(-1 != var50) {
                                    var90[0] = new Integer(var50);
                                 } else {
                                    var90 = null;
                                 }

                                 if(instruction == 1400) {
                                    var35.anObjectArray1794 = var90;
                                 }

                                 if(1401 == instruction) {
                                    var35.anObjectArray1843 = var90;
                                 }

                                 if(instruction == 1402) {
                                    var35.anObjectArray1842 = var90;
                                 }

                                 if(instruction == 1403) {
                                    var35.anObjectArray1802 = var90;
                                 }

                                 if(instruction == 1404) {
                                    var35.anObjectArray1876 = var90;
                                 }

                                 if(1405 == instruction) {
                                    var35.anObjectArray1847 = var90;
                                 }

                                 if(instruction == 1406) {
                                    var35.anObjectArray1773 = var90;
                                 }

                                 if(instruction == 1407) {
                                    var35.onConfigTrigger = var90;
                                    var35.configChangeTriggers = var51;
                                 }

                                 if(1408 == instruction) {
                                    var35.anObjectArray1857 = var90;
                                 }

                                 if(1409 == instruction) {
                                    var35.anObjectArray1795 = var90;
                                 }

                                 if(1410 == instruction) {
                                    var35.anObjectArray1848 = var90;
                                 }

                                 if(instruction == 1411) {
                                    var35.anObjectArray1841 = var90;
                                 }

                                 if(1412 == instruction) {
                                    var35.anObjectArray1845 = var90;
                                 }

                                 if(1414 == instruction) {
                                    var35.onItemUpdateTrigger = var90;
                                    var35.itemUpdateTriggers = var51;
                                 }

                                 if(1415 == instruction) {
                                    var35.onSkillUpdateTrigger = var90;
                                    var35.anIntArray1856 = var51;
                                 }

                                 if(1416 == instruction) {
                                    var35.anObjectArray1849 = var90;
                                 }

                                 if(1417 == instruction) {
                                    var35.anObjectArray1859 = var90;
                                 }

                                 if(instruction == 1418) {
                                    var35.anObjectArray1781 = var90;
                                 }

                                 if(instruction == 1419) {
                                    var35.anObjectArray1789 = var90;
                                 }

                                 if(instruction == 1420) {
                                    var35.anObjectArray1822 = var90;
                                 }

                                 if(1421 == instruction) {
                                    var35.anObjectArray1814 = var90;
                                 }

                                 if(1422 == instruction) {
                                    var35.anObjectArray1864 = var90;
                                 }

                                 if(1423 == instruction) {
                                    var35.anObjectArray1865 = var90;
                                 }

                                 if(instruction == 1424) {
                                    var35.anObjectArray1882 = var90;
                                 }

                                 var35.hasScript = true;
                                 continue;
                              }

                              if(instruction < 1600) {
                                 var35 = var52?Class19.aClass108_Sub17_230:BuildType.aClass108_Sub17_1231;
                                 if(instruction == 1500) {
                                    Class5.intStack[iStackPtr++] = var35.anInt1776 * 985647797;
                                    continue;
                                 }

                                 if(instruction == 1501) {
                                    Class5.intStack[iStackPtr++] = var35.anInt1824 * 1730176157;
                                    continue;
                                 }

                                 if(instruction == 1502) {
                                    Class5.intStack[iStackPtr++] = var35.height * -1281443035;
                                    continue;
                                 }

                                 if(instruction == 1503) {
                                    Class5.intStack[iStackPtr++] = var35.width * 334099177;
                                    continue;
                                 }

                                 if(1504 == instruction) {
                                    Class5.intStack[iStackPtr++] = var35.hidden?1:0;
                                    continue;
                                 }

                                 if(instruction == 1505) {
                                    Class5.intStack[iStackPtr++] = var35.hoverPopup * -867206361;
                                    continue;
                                 }
                              } else if(instruction < 1700) {
                                 var35 = var52?Class19.aClass108_Sub17_230:BuildType.aClass108_Sub17_1231;
                                 if(instruction == 1600) {
                                    Class5.intStack[iStackPtr++] = var35.anInt1784 * -133270367;
                                    continue;
                                 }

                                 if(instruction == 1601) {
                                    Class5.intStack[iStackPtr++] = var35.scrollPosition * -643576081;
                                    continue;
                                 }

                                 if(1602 == instruction) {
                                    Class5.stringStack[stringStackPtr++] = var35.componentString;
                                    continue;
                                 }

                                 if(1603 == instruction) {
                                    Class5.intStack[iStackPtr++] = var35.anInt1786 * -561671337;
                                    continue;
                                 }

                                 if(instruction == 1604) {
                                    Class5.intStack[iStackPtr++] = var35.anInt1787 * -1108406155;
                                    continue;
                                 }

                                 if(instruction == 1605) {
                                    Class5.intStack[iStackPtr++] = var35.mediaZoom * -1750235537;
                                    continue;
                                 }

                                 if(1606 == instruction) {
                                    Class5.intStack[iStackPtr++] = var35.mediaRotationX * -272801613;
                                    continue;
                                 }

                                 if(1607 == instruction) {
                                    Class5.intStack[iStackPtr++] = var35.anInt1813 * -1361484521;
                                    continue;
                                 }

                                 if(1608 == instruction) {
                                    Class5.intStack[iStackPtr++] = var35.mediaRotationY * 260082763;
                                    continue;
                                 }
                              } else if(instruction < 1800) {
                                 var35 = var52?Class19.aClass108_Sub17_230:BuildType.aClass108_Sub17_1231;
                                 if(instruction == 1700) {
                                    Class5.intStack[iStackPtr++] = var35.itemID * 703308511;
                                    continue;
                                 }

                                 if(instruction == 1701) {
                                    if(var35.itemID * 703308511 != -1) {
                                       Class5.intStack[iStackPtr++] = var35.anInt1775 * 1939717269;
                                    } else {
                                       Class5.intStack[iStackPtr++] = 0;
                                    }
                                    continue;
                                 }

                                 if(1702 == instruction) {
                                    Class5.intStack[iStackPtr++] = var35.anInt1772 * -490007465;
                                    continue;
                                 }
                              } else if(instruction < 1900) {
                                 var35 = var52?Class19.aClass108_Sub17_230:BuildType.aClass108_Sub17_1231;
                                 if(1800 == instruction) {
                                    Class5.intStack[iStackPtr++] = Class2.method41(Class32.method576(var35, -916757826), -1336285233);
                                    continue;
                                 }

                                 if(1801 == instruction) {
                                    --iStackPtr;
                                    var17 = Class5.intStack[iStackPtr];
                                    --var17;
                                    if(null != var35.aStringArray1832 && var17 < var35.aStringArray1832.length && var35.aStringArray1832[var17] != null) {
                                       Class5.stringStack[stringStackPtr++] = var35.aStringArray1832[var17];
                                       continue;
                                    }

                                    Class5.stringStack[stringStackPtr++] = "";
                                    continue;
                                 }

                                 if(1802 == instruction) {
                                    if(null == var35.aString1821) {
                                       Class5.stringStack[stringStackPtr++] = "";
                                    } else {
                                       Class5.stringStack[stringStackPtr++] = var35.aString1821;
                                    }
                                    continue;
                                 }
                              } else if(instruction < 2600) {
                                 --iStackPtr;
                                 var35 = CacheIndexRequest.getInterfaceComponentForHash(Class5.intStack[iStackPtr], -752744204);
                                 if(2500 == instruction) {
                                    Class5.intStack[iStackPtr++] = var35.anInt1776 * 985647797;
                                    continue;
                                 }

                                 if(instruction == 2501) {
                                    Class5.intStack[iStackPtr++] = var35.anInt1824 * 1730176157;
                                    continue;
                                 }

                                 if(instruction == 2502) {
                                    Class5.intStack[iStackPtr++] = var35.height * -1281443035;
                                    continue;
                                 }

                                 if(2503 == instruction) {
                                    Class5.intStack[iStackPtr++] = var35.width * 334099177;
                                    continue;
                                 }

                                 if(2504 == instruction) {
                                    Class5.intStack[iStackPtr++] = var35.hidden?1:0;
                                    continue;
                                 }

                                 if(instruction == 2505) {
                                    Class5.intStack[iStackPtr++] = var35.hoverPopup * -867206361;
                                    continue;
                                 }
                              } else if(instruction < 2700) {
                                 --iStackPtr;
                                 var35 = CacheIndexRequest.getInterfaceComponentForHash(Class5.intStack[iStackPtr], -524821673);
                                 if(instruction == 2600) {
                                    Class5.intStack[iStackPtr++] = var35.anInt1784 * -133270367;
                                    continue;
                                 }

                                 if(instruction == 2601) {
                                    Class5.intStack[iStackPtr++] = var35.scrollPosition * -643576081;
                                    continue;
                                 }

                                 if(instruction == 2602) {
                                    Class5.stringStack[stringStackPtr++] = var35.componentString;
                                    continue;
                                 }

                                 if(instruction == 2603) {
                                    Class5.intStack[iStackPtr++] = var35.anInt1786 * -561671337;
                                    continue;
                                 }

                                 if(instruction == 2604) {
                                    Class5.intStack[iStackPtr++] = var35.anInt1787 * -1108406155;
                                    continue;
                                 }

                                 if(instruction == 2605) {
                                    Class5.intStack[iStackPtr++] = var35.mediaZoom * -1750235537;
                                    continue;
                                 }

                                 if(instruction == 2606) {
                                    Class5.intStack[iStackPtr++] = var35.mediaRotationX * -272801613;
                                    continue;
                                 }

                                 if(2607 == instruction) {
                                    Class5.intStack[iStackPtr++] = var35.anInt1813 * -1361484521;
                                    continue;
                                 }

                                 if(2608 == instruction) {
                                    Class5.intStack[iStackPtr++] = var35.mediaRotationY * 260082763;
                                    continue;
                                 }
                              } else if(instruction < 2800) {
                                 if(2700 == instruction) {
                                    --iStackPtr;
                                    var35 = CacheIndexRequest.getInterfaceComponentForHash(Class5.intStack[iStackPtr], 1340521286);
                                    Class5.intStack[iStackPtr++] = var35.itemID * 703308511;
                                    continue;
                                 }

                                 if(2701 == instruction) {
                                    --iStackPtr;
                                    var35 = CacheIndexRequest.getInterfaceComponentForHash(Class5.intStack[iStackPtr], 1279379118);
                                    if(var35.itemID * 703308511 != -1) {
                                       Class5.intStack[iStackPtr++] = var35.anInt1775 * 1939717269;
                                    } else {
                                       Class5.intStack[iStackPtr++] = 0;
                                    }
                                    continue;
                                 }

                                 if(2702 == instruction) {
                                    --iStackPtr;
                                    var16 = Class5.intStack[iStackPtr];
                                    Class108_Sub10 var46 = (Class108_Sub10) Client.aClass101_2866.get((long) var16);
                                    if(null != var46) {
                                       Class5.intStack[iStackPtr++] = 1;
                                    } else {
                                       Class5.intStack[iStackPtr++] = 0;
                                    }
                                    continue;
                                 }
                              } else if(instruction < 2900) {
                                 --iStackPtr;
                                 var35 = CacheIndexRequest.getInterfaceComponentForHash(Class5.intStack[iStackPtr], 1776721817);
                                 if(instruction == 2800) {
                                    Class5.intStack[iStackPtr++] = Class2.method41(Class32.method576(var35, 1757488985), -1909973330);
                                    continue;
                                 }

                                 if(2801 == instruction) {
                                    --iStackPtr;
                                    var17 = Class5.intStack[iStackPtr];
                                    --var17;
                                    if(null != var35.aStringArray1832 && var17 < var35.aStringArray1832.length && var35.aStringArray1832[var17] != null) {
                                       Class5.stringStack[stringStackPtr++] = var35.aStringArray1832[var17];
                                       continue;
                                    }

                                    Class5.stringStack[stringStackPtr++] = "";
                                    continue;
                                 }

                                 if(2802 == instruction) {
                                    if(null == var35.aString1821) {
                                       Class5.stringStack[stringStackPtr++] = "";
                                    } else {
                                       Class5.stringStack[stringStackPtr++] = var35.aString1821;
                                    }
                                    continue;
                                 }
                              } else {
                                 int var23;
                                 int var24;
                                 boolean var43;
                                 boolean var44;
                                 int var62;
                                 if(instruction < 3200) {
                                    if(3100 == instruction) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       AnimationSkeletonSet.pushMessage(0, "", var83, -819691502);
                                       continue;
                                    }

                                    if(instruction == 3101) {
                                       iStackPtr -= 2;
                                       Class51.method703(Player.myPlayer, Class5.intStack[iStackPtr], Class5.intStack[1 + iStackPtr], (short)-24527);
                                       continue;
                                    }

                                    if(instruction == 3103) {
                                       Class108_Sub12.method1690(262144);
                                       continue;
                                    }

                                    if(instruction == 3104) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       var17 = 0;
                                       boolean var47 = false;
                                       boolean var49 = false;
                                       int var22 = 0;
                                       var23 = var83.length();
                                       var24 = 0;

                                       while(true) {
                                          if(var24 >= var23) {
                                             var44 = var49;
                                             break;
                                          }

                                          label2679: {
                                             char var25 = var83.charAt(var24);
                                             if(var24 == 0) {
                                                if(45 == var25) {
                                                   var47 = true;
                                                   break label2679;
                                                }

                                                if(43 == var25) {
                                                   break label2679;
                                                }
                                             }

                                             if(var25 >= 48 && var25 <= 57) {
                                                var62 = var25 - 48;
                                             } else if(var25 >= 65 && var25 <= 90) {
                                                var62 = var25 - 55;
                                             } else {
                                                if(var25 < 97 || var25 > 122) {
                                                   var44 = false;
                                                   break;
                                                }

                                                var62 = var25 - 87;
                                             }

                                             if(var62 >= 10) {
                                                var44 = false;
                                                break;
                                             }

                                             if(var47) {
                                                var62 = -var62;
                                             }

                                             int var26 = var22 * 10 + var62;
                                             if(var22 != var26 / 10) {
                                                var44 = false;
                                                break;
                                             }

                                             var22 = var26;
                                             var49 = true;
                                          }

                                          ++var24;
                                       }

                                       if(var44) {
                                          var17 = VertexNormal.method692(var83, 2033327936);
                                       }

                                       Client.secureBuffer.writePacket(44);
                                       Client.secureBuffer.writeInt(var17);
                                       continue;
                                    }

                                    if(3105 == instruction) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       Client.secureBuffer.writePacket(58);
                                       Client.secureBuffer.writeByte(var83.length() + 1);
                                       Client.secureBuffer.writeString(var83);
                                       continue;
                                    }

                                    if(3106 == instruction) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       Client.secureBuffer.writePacket(65);
                                       Client.secureBuffer.writeByte(var83.length() + 1);
                                       Client.secureBuffer.writeString(var83);
                                       continue;
                                    }

                                    if(3107 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       --stringStackPtr;
                                       var39 = Class5.stringStack[stringStackPtr];
                                       var43 = false;

                                       for(var41 = 0; var41 < Client.numLocalPlayers * -43742683; ++var41) {
                                          Player var45 = Client.localPlayers[Client.playerIndices[var41]];
                                          if(null != var45 && null != var45.playerName && var45.playerName.equalsIgnoreCase(var39)) {
                                             if(1 == var16) {
                                                Client.secureBuffer.writePacket(135);
                                                Client.secureBuffer.method1748(Client.playerIndices[var41], 1292700611);
                                                Client.secureBuffer.writeByte(0);
                                             } else if(var16 == 4) {
                                                Client.secureBuffer.writePacket(141);
                                                Client.secureBuffer.writeAShortLE(Client.playerIndices[var41], (byte) -26);
                                                Client.secureBuffer.writeByte(0);
                                             } else if(var16 == 6) {
                                                Client.secureBuffer.writePacket(62);
                                                Client.secureBuffer.method1748(Client.playerIndices[var41], 1672521432);
                                                Client.secureBuffer.method1741(0, 1734701681);
                                             } else if(7 == var16) {
                                                Client.secureBuffer.writePacket(82);
                                                Client.secureBuffer.method1749(Client.playerIndices[var41], -1419624965);
                                                Client.secureBuffer.writeByte(0);
                                             }

                                             var43 = true;
                                             break;
                                          }
                                       }

                                       if(!var43) {
                                          AnimationSkeletonSet.pushMessage(4, "", StringConstants.UNABLE_TO_FIND + var39, -594294711);
                                       }
                                       continue;
                                    }

                                    if(3108 == instruction) {
                                       iStackPtr -= 3;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[1 + iStackPtr];
                                       var38 = Class5.intStack[iStackPtr + 2];
                                       var19 = CacheIndexRequest.getInterfaceComponentForHash(var38, 1214080440);
                                       RSPacketBuffer.method2598(var19, var16, var17, (byte)-68);
                                       continue;
                                    }

                                    if(instruction == 3109) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[1 + iStackPtr];
                                       var18 = var52?Class19.aClass108_Sub17_230:BuildType.aClass108_Sub17_1231;
                                       RSPacketBuffer.method2598(var18, var16, var17, (byte)-39);
                                       continue;
                                    }

                                    if(3110 == instruction) {
                                       --iStackPtr;
                                       Class100.aBool1391 = Class5.intStack[iStackPtr] == 1;
                                       continue;
                                    }

                                    if(3111 == instruction) {
                                       Class5.intStack[iStackPtr++] = Ignore.aClass37_386.aBool528?1:0;
                                       continue;
                                    }

                                    if(3112 == instruction) {
                                       --iStackPtr;
                                       Ignore.aClass37_386.aBool528 = Class5.intStack[iStackPtr] == 1;
                                       Timer.method713(-1212311019);
                                       continue;
                                    }

                                    if(3113 == instruction) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       --iStackPtr;
                                       var37 = Class5.intStack[iStackPtr] == 1;
                                       SpotAnim.method2137(var83, var37, false, (byte)31);
                                       continue;
                                    }
                                 } else if(instruction < 3300) {
                                    if(instruction == 3200) {
                                       iStackPtr -= 3;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[iStackPtr + 1];
                                       var38 = Class5.intStack[iStackPtr + 2];
                                       if(Client.anInt2812 * -24031449 != 0 && var17 != 0 && Client.anInt2895 * 348809069 < 50) {
                                          Client.anIntArray2942[Client.anInt2895 * 348809069] = var16;
                                          Client.anIntArray2757[Client.anInt2895 * 348809069] = var17;
                                          Client.anIntArray2944[Client.anInt2895 * 348809069] = var38;
                                          Client.aClass6Array2741[Client.anInt2895 * 348809069] = null;
                                          Client.anIntArray2704[Client.anInt2895 * 348809069] = 0;
                                          Client.anInt2895 -= 1862223259;
                                       }
                                       continue;
                                    }

                                    if(3201 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       if(var16 == -1 && !Client.aBool2938) {
                                          Class32.aClass108_Sub4_Sub3_464.method2610(10632848);
                                          Class91.anInt1325 = -771978757;
                                          RSInterface.aClass74_1889 = null;
                                       } else if(var16 != -1 && Client.anInt2937 * 111831401 != var16 && Client.anInt2873 * 99489839 != 0 && !Client.aBool2938) {
                                          CacheIndex var57 = Friend.musicIndex_1;
                                          var38 = Client.anInt2873 * 99489839;
                                          Class91.anInt1325 = -771978757;
                                          RSInterface.aClass74_1889 = var57;
                                          Class91.anInt1329 = var16 * -2020957493;
                                          OnlineFriend.anInt1511 = 0;
                                          Class27.anInt362 = var38 * 495527089;
                                          FriendsChatMember.aBool1669 = false;
                                          ClientScriptDefinition.anInt2281 = -1589655618;
                                       }

                                       Client.anInt2937 = var16 * -834881831;
                                       continue;
                                    }

                                    if(3202 == instruction) {
                                       iStackPtr -= 2;
                                       Timer.method722(Class5.intStack[iStackPtr], Class5.intStack[iStackPtr + 1], 292227973);
                                       continue;
                                    }
                                 } else if(instruction < 3400) {
                                    if(instruction == 3300) {
                                       Class5.intStack[iStackPtr++] = Client.cycle * -637317861;
                                       continue;
                                    }

                                    Class108_Sub12 var53;
                                    if(3301 == instruction) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[1 + iStackPtr];
                                       var51 = Class5.intStack;
                                       var41 = iStackPtr++;
                                       var53 = (Class108_Sub12)Class108_Sub12.aClass101_1673.get((long) var16);
                                       if(var53 == null) {
                                          var50 = -1;
                                       } else if(var17 >= 0 && var17 < var53.anIntArray1671.length) {
                                          var50 = var53.anIntArray1671[var17];
                                       } else {
                                          var50 = -1;
                                       }

                                       var51[var41] = var50;
                                       continue;
                                    }

                                    if(instruction == 3302) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[iStackPtr + 1];
                                       var51 = Class5.intStack;
                                       var41 = iStackPtr++;
                                       var53 = (Class108_Sub12)Class108_Sub12.aClass101_1673.get((long) var16);
                                       if(var53 == null) {
                                          var50 = 0;
                                       } else if(var17 >= 0 && var17 < var53.anIntArray1675.length) {
                                          var50 = var53.anIntArray1675[var17];
                                       } else {
                                          var50 = 0;
                                       }

                                       var51[var41] = var50;
                                       continue;
                                    }

                                    if(3303 == instruction) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[iStackPtr + 1];
                                       Class5.intStack[iStackPtr++] = Class51.method704(var16, var17, 442371119);
                                       continue;
                                    }

                                    if(3304 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = KeyFocusListener.method919(var16, -239277023).anInt1964 * -244340163;
                                       continue;
                                    }

                                    if(instruction == 3305) { 
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = Client.skillLevels[var16];
                                       continue;
                                    }

                                    if(3306 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = Client.anIntArray2843[var16];
                                       continue;
                                    }

                                    if(3307 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = Client.skillXPs[var16];
                                       continue;
                                    }

                                    if(instruction == 3308) {
                                       var16 = VarpBit.plane * -570926309;
                                       var17 = Class100.anInt1388 * 263051377 + (Player.myPlayer.anInt2394 * 171470795 >> 7);
                                       var38 = (Player.myPlayer.anInt2339 * 826764905 >> 7) + Class15.anInt201 * -1743142671;
                                       Class5.intStack[iStackPtr++] = var38 + (var16 << 28) + (var17 << 14);
                                       continue;
                                    }

                                    if(instruction == 3309) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = var16 >> 14 & 16383;
                                       continue;
                                    }

                                    if(instruction == 3310) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = var16 >> 28;
                                       continue;
                                    }

                                    if(instruction == 3311) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = var16 & 16383;
                                       continue;
                                    }

                                    if(instruction == 3312) {
                                       Class5.intStack[iStackPtr++] = Client.aBool2710?1:0;
                                       continue;
                                    }

                                    if(instruction == 3313) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr] + '\u8000';
                                       var17 = Class5.intStack[iStackPtr + 1];
                                       var51 = Class5.intStack;
                                       var41 = iStackPtr++;
                                       var53 = (Class108_Sub12)Class108_Sub12.aClass101_1673.get((long) var16);
                                       if(var53 == null) {
                                          var50 = -1;
                                       } else if(var17 >= 0 && var17 < var53.anIntArray1671.length) {
                                          var50 = var53.anIntArray1671[var17];
                                       } else {
                                          var50 = -1;
                                       }

                                       var51[var41] = var50;
                                       continue;
                                    }

                                    if(instruction == 3314) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr] + '\u8000';
                                       var17 = Class5.intStack[iStackPtr + 1];
                                       var51 = Class5.intStack;
                                       var41 = iStackPtr++;
                                       var53 = (Class108_Sub12)Class108_Sub12.aClass101_1673.get((long) var16);
                                       if(null == var53) {
                                          var50 = 0;
                                       } else if(var17 >= 0 && var17 < var53.anIntArray1675.length) {
                                          var50 = var53.anIntArray1675[var17];
                                       } else {
                                          var50 = 0;
                                       }

                                       var51[var41] = var50;
                                       continue;
                                    }

                                    if(instruction == 3315) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr] + '\u8000';
                                       var17 = Class5.intStack[iStackPtr + 1];
                                       Class5.intStack[iStackPtr++] = Class51.method704(var16, var17, 442371119);
                                       continue;
                                    }

                                    if(3316 == instruction) {
                                       if(Client.rights * 171939335 >= 2) {
                                          Class5.intStack[iStackPtr++] = Client.rights * 171939335;
                                       } else {
                                          Class5.intStack[iStackPtr++] = 0;
                                       }
                                       continue;
                                    }

                                    if(instruction == 3317) {
                                       Class5.intStack[iStackPtr++] = Client.anInt2722 * -770885443;
                                       continue;
                                    }

                                    if(3318 == instruction) {
                                       Class5.intStack[iStackPtr++] = Client.worldID * 292541855;
                                       continue;
                                    }

                                    if(3321 == instruction) {
                                       Class5.intStack[iStackPtr++] = Client.anInt2870 * -459978045;
                                       continue;
                                    }

                                    if(instruction == 3322) {
                                       Class5.intStack[iStackPtr++] = Client.anInt2871 * -409161997;
                                       continue;
                                    }

                                    if(instruction == 3323) {
                                       if(Client.aBool2949) {
                                          Class5.intStack[iStackPtr++] = 1;
                                       } else {
                                          Class5.intStack[iStackPtr++] = 0;
                                       }
                                       continue;
                                    }

                                    if(3324 == instruction) {
                                       Class5.intStack[iStackPtr++] = Client.worldType * 164398169;
                                       continue;
                                    }
                                 } else if(instruction < 3500) { // cs map string values
                                    if(3400 == instruction) {
                                       iStackPtr -= 2;
                                       int csMapID = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[1 + iStackPtr];
                                       ClientScriptMap csMap = getCSMapForID(csMapID, 1493960293);
                                       if(115 != csMap.aChar2055) {
                                          ;
                                       }

                                       for(var41 = 0; var41 < csMap.csMapValueCount * -1484660039; ++var41) {
                                          if(var17 == csMap.anIntArray2058[var41]) {
                                             Class5.stringStack[stringStackPtr++] = csMap.csMapStringValues[var41];
                                             csMap = null;
                                             break;
                                          }
                                       }

                                       if(csMap != null) {
                                          Class5.stringStack[stringStackPtr++] = csMap.csMapStringIdentifier;
                                       }
                                       continue;
                                    }

                                    if(instruction == 3408) { // cs map int values
                                       iStackPtr -= 4;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[1 + iStackPtr];
                                       int csMapID = Class5.intStack[2 + iStackPtr];
                                       var41 = Class5.intStack[iStackPtr + 3];
                                       ClientScriptMap csMap = getCSMapForID(csMapID, 519898347);
                                       if(var16 == csMap.aChar2053 && var17 == csMap.aChar2055) {
                                          for(int csMapValue = 0; csMapValue < csMap.csMapValueCount * -1484660039; ++csMapValue) {
                                             if(csMap.anIntArray2058[csMapValue] == var41) {
                                                if(var17 == 115) {
                                                   Class5.stringStack[stringStackPtr++] = csMap.csMapStringValues[csMapValue];
                                                } else {
                                                   Class5.intStack[iStackPtr++] = csMap.csMapIntValues[csMapValue];
                                                }

                                                csMap = null;
                                                break;
                                             }
                                          }

                                          if(null != csMap) {
                                             if(var17 == 115) {
                                                Class5.stringStack[stringStackPtr++] = csMap.csMapStringIdentifier;
                                             } else {
                                                Class5.intStack[iStackPtr++] = csMap.csMapIntIdentifier * 282426955;
                                             }
                                          }
                                          continue;
                                       }

                                       if(115 == var17) {
                                          Class5.stringStack[stringStackPtr++] = "null";
                                       } else {
                                          Class5.intStack[iStackPtr++] = 0;
                                       }
                                       continue;
                                    }
                                 } else if(instruction < 3700) {
                                    if(3600 == instruction) {
                                       if(Client.anInt2954 * 1676461513 == 0) {
                                          Class5.intStack[iStackPtr++] = -2;
                                       } else if(Client.anInt2954 * 1676461513 == 1) {
                                          Class5.intStack[iStackPtr++] = -1;
                                       } else {
                                          Class5.intStack[iStackPtr++] = Client.friendListCount * -163737695;
                                       }
                                       continue;
                                    }

                                    if(instruction == 3601) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       if(2 == Client.anInt2954 * 1676461513 && var16 < Client.friendListCount * -163737695) {
                                          Class5.stringStack[stringStackPtr++] = Client.friendList[var16].username;
                                          Class5.stringStack[stringStackPtr++] = Client.friendList[var16].aString621;
                                          continue;
                                       }

                                       Class5.stringStack[stringStackPtr++] = "";
                                       Class5.stringStack[stringStackPtr++] = "";
                                       continue;
                                    }

                                    if(instruction == 3602) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       if(Client.anInt2954 * 1676461513 == 2 && var16 < Client.friendListCount * -163737695) {
                                          Class5.intStack[iStackPtr++] = Client.friendList[var16].friendHash * -62644779;
                                          continue;
                                       }

                                       Class5.intStack[iStackPtr++] = 0;
                                       continue;
                                    }

                                    if(3603 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       if(2 == Client.anInt2954 * 1676461513 && var16 < Client.friendListCount * -163737695) {
                                          Class5.intStack[iStackPtr++] = Client.friendList[var16].anInt623 * -75894341;
                                          continue;
                                       }

                                       Class5.intStack[iStackPtr++] = 0;
                                       continue;
                                    }

                                    if(instruction == 3604) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       --iStackPtr;
                                       var17 = Class5.intStack[iStackPtr];
                                       Class19.method327(var83, var17, (byte)18);
                                       continue;
                                    }

                                    Ignore ignore;
                                    String actualUsername;
                                    if(instruction == 3605) {
                                       --stringStackPtr;
                                       String username = Class5.stringStack[stringStackPtr];
                                       if(username == null) {
                                          continue;
                                       }

                                       if((Client.friendListCount * -163737695 < 200 || 1 == Client.anInt2758 * -1950682749) && Client.friendListCount * -163737695 < 400) {
                                          String enteredUser = Class108_Sub10.method1683(username, UnderlayDefinition.aClass116_2142, -2024307012);
                                          if(null == enteredUser) {
                                             continue;
                                          }

                                          for(int friendIndex = 0; friendIndex < Client.friendListCount * -163737695; ++friendIndex) {
                                             Friend friend = Client.friendList[friendIndex];
                                             actualUsername = Class108_Sub10.method1683(friend.username, UnderlayDefinition.aClass116_2142, -1988298806);
                                             if(actualUsername != null && actualUsername.equals(enteredUser)) {
                                                AnimationSkeletonSet.pushMessage(30, "", username + StringConstants.ALREADY_ON_FL, -788791347);
                                                continue label2481;
                                             }

                                             if(friend.aString621 != null) {
                                                String actualFriendUser = Class108_Sub10.method1683(friend.aString621, UnderlayDefinition.aClass116_2142, -1958821332);
                                                if(null != actualFriendUser && actualFriendUser.equals(enteredUser)) {
                                                   AnimationSkeletonSet.pushMessage(30, "", username + StringConstants.ALREADY_ON_FL, -350611114);
                                                   continue label2481;
                                                }
                                             }
                                          }

                                          for(int ignoreIndex = 0; ignoreIndex < Client.ignoreListCount * -1283681697; ++ignoreIndex) {
                                             ignore = Client.ignoreList[ignoreIndex];
                                             actualUsername = Class108_Sub10.method1683(ignore.username, UnderlayDefinition.aClass116_2142, -1991729949);
                                             if(null != actualUsername && actualUsername.equals(enteredUser)) {
                                                AnimationSkeletonSet.pushMessage(30, "", StringConstants.PLEASE_REMOVE + username + StringConstants.aString1122, -1000356271);
                                                continue label2481;
                                             }

                                             if(null != ignore.aString387) {
                                                var58 = Class108_Sub10.method1683(ignore.aString387, UnderlayDefinition.aClass116_2142, -2046995173);
                                                if(var58 != null && var58.equals(enteredUser)) {
                                                   AnimationSkeletonSet.pushMessage(30, "", StringConstants.PLEASE_REMOVE + username + StringConstants.aString1122, 75027476);
                                                   continue label2481;
                                                }
                                             }
                                          }

                                          if(Class108_Sub10.method1683(Player.myPlayer.playerName, UnderlayDefinition.aClass116_2142, -1935156967).equals(enteredUser)) {
                                             AnimationSkeletonSet.pushMessage(30, "", StringConstants.aString1025, 306905076);
                                          } else {
                                             Client.secureBuffer.writePacket(229);
                                             Client.secureBuffer.writeByte(Class108_Sub20_Sub3.method2069(username, (byte) 64));
                                             Client.secureBuffer.writeString(username);
                                          }
                                          continue;
                                       }

                                       AnimationSkeletonSet.pushMessage(30, "", StringConstants.FRIEND_LIST_FULL, -675163460);
                                       continue;
                                    }

                                    if(instruction == 3606) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       Player.removeFriend(var83, 1604645946);
                                       continue;
                                    }

                                    if(3607 == instruction) {
                                       --stringStackPtr;
                                       String name = Class5.stringStack[stringStackPtr];
                                       ProducingGraphicsBuffer.addToIgnoreList(name, false, -1320321926);
                                       continue;
                                    }

                                    if(3608 == instruction) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       if(var83 == null) {
                                          continue;
                                       }

                                       var39 = Class108_Sub10.method1683(var83, UnderlayDefinition.aClass116_2142, -2114283587);
                                       if(var39 == null) {
                                          continue;
                                       }

                                       var38 = 0;

                                       while(true) {
                                          if(var38 >= Client.ignoreListCount * -1283681697) {
                                             continue label2481;
                                          }

                                          ignore = Client.ignoreList[var38];
                                          actualUsername = ignore.username;
                                          var58 = Class108_Sub10.method1683(actualUsername, UnderlayDefinition.aClass116_2142, -2033427952);
                                          boolean var54;
                                          if(null != var83 && actualUsername != null) {
                                             if(!var83.startsWith("#") && !actualUsername.startsWith("#")) {
                                                var54 = var39.equals(var58);
                                             } else {
                                                var54 = var83.equals(actualUsername);
                                             }
                                          } else {
                                             var54 = false;
                                          }

                                          if(var54) {
                                             Client.ignoreListCount += 224638561;

                                             for(var23 = var38; var23 < Client.ignoreListCount * -1283681697; ++var23) {
                                                Client.ignoreList[var23] = Client.ignoreList[var23 + 1];
                                             }

                                             Client.anInt2897 = Client.anInt2731 * 1946037095;
                                             Client.secureBuffer.writePacket(157);
                                             Client.secureBuffer.writeByte(Class108_Sub20_Sub3.method2069(var83, (byte) 64));
                                             Client.secureBuffer.writeString(var83);
                                             continue label2481;
                                          }

                                          ++var38;
                                       }
                                    }

                                    if(instruction == 3609) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       if(var83.startsWith(CacheIndexRequest.getIconTag(0, 480603646)) || var83.startsWith(CacheIndexRequest.getIconTag(1, 480603646))) {
                                          var83 = var83.substring(7);
                                       }

                                       Class5.intStack[iStackPtr++] = GroundItem.isFriend(var83, false, (byte)-34)?1:0;
                                       continue;
                                    }

                                    if(3611 == instruction) {
                                       if(null != Client.aString2967) {
                                          Class5.stringStack[stringStackPtr++] = EquipmentKit.method1180(Client.aString2967, (byte)0);
                                       } else {
                                          Class5.stringStack[stringStackPtr++] = "";
                                       }
                                       continue;
                                    }

                                    if(instruction == 3612) {
                                       if(Client.aString2967 != null) {
                                          Class5.intStack[iStackPtr++] = Class27.anInt363 * 1727166727;
                                       } else {
                                          Class5.intStack[iStackPtr++] = 0;
                                       }
                                       continue;
                                    }

                                    if(instruction == 3613) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       if(Client.aString2967 != null && var16 < Class27.anInt363 * 1727166727) {
                                          Class5.stringStack[stringStackPtr++] = Class50.friendsChatList[var16].username;
                                          continue;
                                       }

                                       Class5.stringStack[stringStackPtr++] = "";
                                       continue;
                                    }

                                    if(instruction == 3614) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       if(null != Client.aString2967 && var16 < Class27.anInt363 * 1727166727) {
                                          Class5.intStack[iStackPtr++] = Class50.friendsChatList[var16].anInt1663 * -23557543;
                                          continue;
                                       }

                                       Class5.intStack[iStackPtr++] = 0;
                                       continue;
                                    }

                                    if(instruction == 3615) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       if(Client.aString2967 != null && var16 < Class27.anInt363 * 1727166727) {
                                          Class5.intStack[iStackPtr++] = Class50.friendsChatList[var16].rank;
                                          continue;
                                       }

                                       Class5.intStack[iStackPtr++] = 0;
                                       continue;
                                    }

                                    if(3616 == instruction) {
                                       Class5.intStack[iStackPtr++] = Class16.aByte207;
                                       continue;
                                    }

                                    if(instruction == 3617) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       if(null != Class50.friendsChatList) {
                                          Client.secureBuffer.writePacket(22);
                                          Client.secureBuffer.writeByte(Class108_Sub20_Sub3.method2069(var83, (byte) 64));
                                          Client.secureBuffer.writeString(var83);
                                       }
                                       continue;
                                    }

                                    if(3618 == instruction) {
                                       Class5.intStack[iStackPtr++] = NPCDefinition.aByte2194;
                                       continue;
                                    }

                                    if(instruction == 3619) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       Class5.method102(var83, -1545607057);
                                       continue;
                                    }

                                    if(3620 == instruction) {
                                       Class89.method1130();
                                       continue;
                                    }

                                    if(instruction == 3621) {
                                       if(Client.anInt2954 * 1676461513 == 0) {
                                          Class5.intStack[iStackPtr++] = -1;
                                       } else {
                                          Class5.intStack[iStackPtr++] = Client.ignoreListCount * -1283681697;
                                       }
                                       continue;
                                    }

                                    if(3622 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       if(0 != Client.anInt2954 * 1676461513 && var16 < Client.ignoreListCount * -1283681697) {
                                          Class5.stringStack[stringStackPtr++] = Client.ignoreList[var16].username;
                                          Class5.stringStack[stringStackPtr++] = Client.ignoreList[var16].aString387;
                                          continue;
                                       }

                                       Class5.stringStack[stringStackPtr++] = "";
                                       Class5.stringStack[stringStackPtr++] = "";
                                       continue;
                                    }

                                    if(3623 == instruction) {
                                       --stringStackPtr;
                                       String name = Class5.stringStack[stringStackPtr];
                                       if(name.startsWith(CacheIndexRequest.getIconTag(0, 480603646)) || name.startsWith(CacheIndexRequest.getIconTag(1, 480603646))) {
                                          name = name.substring(7);
                                       }

                                       Class5.intStack[iStackPtr++] = WallDecoration.isOnIgnore(name, 697716039)?1:0;
                                       continue;
                                    }

                                    if(3624 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       if(null != Class50.friendsChatList && var16 < Class27.anInt363 * 1727166727 && Class50.friendsChatList[var16].username.equalsIgnoreCase(Player.myPlayer.playerName)) {
                                          Class5.intStack[iStackPtr++] = 1;
                                          continue;
                                       }

                                       Class5.intStack[iStackPtr++] = 0;
                                       continue;
                                    }

                                    if(instruction == 3625) {
                                       if(Client.aString2934 != null) {
                                          Class5.stringStack[stringStackPtr++] = EquipmentKit.method1180(Client.aString2934, (byte)0);
                                       } else {
                                          Class5.stringStack[stringStackPtr++] = "";
                                       }
                                       continue;
                                    }
                                 } else if(instruction < 4100) {
                                    if(4000 == instruction) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[iStackPtr + 1];
                                       Class5.intStack[iStackPtr++] = var16 + var17;
                                       continue;
                                    }

                                    if(4001 == instruction) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[1 + iStackPtr];
                                       Class5.intStack[iStackPtr++] = var16 - var17;
                                       continue;
                                    }

                                    if(instruction == 4002) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[1 + iStackPtr];
                                       Class5.intStack[iStackPtr++] = var16 * var17;
                                       continue;
                                    }

                                    if(instruction == 4003) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[iStackPtr + 1];
                                       Class5.intStack[iStackPtr++] = var16 / var17;
                                       continue;
                                    }

                                    if(4004 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = (int)(Math.random() * (double)var16);
                                       continue;
                                    }

                                    if(instruction == 4005) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = (int)(Math.random() * (double)(var16 + 1));
                                       continue;
                                    }

                                    if(instruction == 4006) {
                                       iStackPtr -= 5;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[1 + iStackPtr];
                                       var38 = Class5.intStack[iStackPtr + 2];
                                       var41 = Class5.intStack[3 + iStackPtr];
                                       var50 = Class5.intStack[4 + iStackPtr];
                                       Class5.intStack[iStackPtr++] = var16 + (var50 - var38) * (var17 - var16) / (var41 - var38);
                                       continue;
                                    }

                                    if(instruction == 4007) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[1 + iStackPtr];
                                       Class5.intStack[iStackPtr++] = var17 * var16 / 100 + var16;
                                       continue;
                                    }

                                    if(instruction == 4008) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[iStackPtr + 1];
                                       Class5.intStack[iStackPtr++] = var16 | 1 << var17;
                                       continue;
                                    }

                                    if(4009 == instruction) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[1 + iStackPtr];
                                       Class5.intStack[iStackPtr++] = var16 & -1 - (1 << var17);
                                       continue;
                                    }

                                    if(instruction == 4010) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[iStackPtr + 1];
                                       Class5.intStack[iStackPtr++] = (var16 & 1 << var17) != 0?1:0;
                                       continue;
                                    }

                                    if(instruction == 4011) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[1 + iStackPtr];
                                       Class5.intStack[iStackPtr++] = var16 % var17;
                                       continue;
                                    }

                                    if(instruction == 4012) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[iStackPtr + 1];
                                       if(0 == var16) {
                                          Class5.intStack[iStackPtr++] = 0;
                                       } else {
                                          Class5.intStack[iStackPtr++] = (int)Math.pow((double)var16, (double)var17);
                                       }
                                       continue;
                                    }

                                    if(4013 == instruction) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[iStackPtr + 1];
                                       if(0 == var16) {
                                          Class5.intStack[iStackPtr++] = 0;
                                       } else if(var17 == 0) {
                                          Class5.intStack[iStackPtr++] = Integer.MAX_VALUE;
                                       } else {
                                          Class5.intStack[iStackPtr++] = (int)Math.pow((double)var16, 1.0D / (double)var17);
                                       }
                                       continue;
                                    }

                                    if(instruction == 4014) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[1 + iStackPtr];
                                       Class5.intStack[iStackPtr++] = var16 & var17;
                                       continue;
                                    }

                                    if(instruction == 4015) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[1 + iStackPtr];
                                       Class5.intStack[iStackPtr++] = var16 | var17;
                                       continue;
                                    }
                                 } else if(instruction < 4200) {
                                    if(4100 == instruction) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       --iStackPtr;
                                       var17 = Class5.intStack[iStackPtr];
                                       Class5.stringStack[stringStackPtr++] = var83 + var17;
                                       continue;
                                    }

                                    if(instruction == 4101) {
                                       stringStackPtr -= 2;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       var39 = Class5.stringStack[1 + stringStackPtr];
                                       Class5.stringStack[stringStackPtr++] = var83 + var39;
                                       continue;
                                    }

                                    if(instruction == 4102) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       --iStackPtr;
                                       var17 = Class5.intStack[iStackPtr];
                                       var71 = Class5.stringStack;
                                       var41 = stringStackPtr++;
                                       if(var17 < 0) {
                                          var58 = Integer.toString(var17);
                                       } else {
                                          var23 = var17;
                                          if(var17 < 0) {
                                             var56 = Integer.toString(var17, 10);
                                          } else {
                                             var24 = 2;

                                             for(var62 = var17 / 10; var62 != 0; ++var24) {
                                                var62 /= 10;
                                             }

                                             char[] var64 = new char[var24];
                                             var64[0] = 43;

                                             for(int var27 = var24 - 1; var27 > 0; --var27) {
                                                int var28 = var23;
                                                var23 /= 10;
                                                int var29 = var28 - var23 * 10;
                                                if(var29 >= 10) {
                                                   var64[var27] = (char)(var29 + 87);
                                                } else {
                                                   var64[var27] = (char)(var29 + 48);
                                                }
                                             }

                                             var56 = new String(var64);
                                          }

                                          var58 = var56;
                                       }

                                       var71[var41] = var83 + var58;
                                       continue;
                                    }

                                    if(instruction == 4103) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       Class5.stringStack[stringStackPtr++] = var83.toLowerCase();
                                       continue;
                                    }

                                    if(4104 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       long var30 = (11745L + (long)var16) * 86400000L;
                                       Class5.aCalendar76.setTime(new Date(var30));
                                       var41 = Class5.aCalendar76.get(5);
                                       var50 = Class5.aCalendar76.get(2);
                                       var21 = Class5.aCalendar76.get(1);
                                       Class5.stringStack[stringStackPtr++] = var41 + "-" + Class5.dateString[var50] + "-" + var21;
                                       continue;
                                    }

                                    if(4105 == instruction) {
                                       stringStackPtr -= 2;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       var39 = Class5.stringStack[stringStackPtr + 1];
                                       if(null != Player.myPlayer.bodyEquipmentKit && Player.myPlayer.bodyEquipmentKit.isFemale) {
                                          Class5.stringStack[stringStackPtr++] = var39;
                                          continue;
                                       }

                                       Class5.stringStack[stringStackPtr++] = var83;
                                       continue;
                                    }

                                    if(4106 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.stringStack[stringStackPtr++] = Integer.toString(var16);
                                       continue;
                                    }

                                    if(instruction == 4107) {
                                       stringStackPtr -= 2;
                                       Class5.intStack[iStackPtr++] = ChatMessage.method2021(PingRequester.method835(Class5.stringStack[stringStackPtr], Class5.stringStack[1 + stringStackPtr], Client.anInt2712 * 148074329, -493022987), (byte)16);
                                       continue;
                                    }

                                    byte[] var68;
                                    RSFont var72;
                                    if(4108 == instruction) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       iStackPtr -= 2;
                                       var17 = Class5.intStack[iStackPtr];
                                       var38 = Class5.intStack[1 + iStackPtr];
                                       var68 = Class54.fontIndex.getFile(var38, 0, (byte) 7);
                                       var72 = new RSFont(var68);
                                       Class5.intStack[iStackPtr++] = var72.method3092(var83, var17);
                                       continue;
                                    }

                                    if(4109 == instruction) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       iStackPtr -= 2;
                                       var17 = Class5.intStack[iStackPtr];
                                       var38 = Class5.intStack[1 + iStackPtr];
                                       var68 = Class54.fontIndex.getFile(var38, 0, (byte) 7);
                                       var72 = new RSFont(var68);
                                       Class5.intStack[iStackPtr++] = var72.method3091(var83, var17);
                                       continue;
                                    }

                                    if(4110 == instruction) {
                                       stringStackPtr -= 2;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       var39 = Class5.stringStack[1 + stringStackPtr];
                                       --iStackPtr;
                                       if(Class5.intStack[iStackPtr] == 1) {
                                          Class5.stringStack[stringStackPtr++] = var83;
                                       } else {
                                          Class5.stringStack[stringStackPtr++] = var39;
                                       }
                                       continue;
                                    }

                                    if(instruction == 4111) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       Class5.stringStack[stringStackPtr++] = RSTypeFace.method3093(var83);
                                       continue;
                                    }

                                    if(instruction == 4112) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       --iStackPtr;
                                       var17 = Class5.intStack[iStackPtr];
                                       Class5.stringStack[stringStackPtr++] = var83 + (char)var17;
                                       continue;
                                    }

                                    char var69;
                                    if(4113 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       var84 = Class5.intStack;
                                       var38 = iStackPtr++;
                                       var69 = (char)var16;
                                       if(var69 >= 32 && var69 <= 126) {
                                          var44 = true;
                                       } else if(var69 >= 160 && var69 <= 255) {
                                          var44 = true;
                                       } else if(8364 != var69 && var69 != 338 && 8212 != var69 && var69 != 339 && var69 != 376) {
                                          var44 = false;
                                       } else {
                                          var44 = true;
                                       }

                                       var84[var38] = var44?1:0;
                                       continue;
                                    }

                                    if(instruction == 4114) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       var84 = Class5.intStack;
                                       var38 = iStackPtr++;
                                       var69 = (char)var16;
                                       var44 = var69 >= 48 && var69 <= 57 || var69 >= 65 && var69 <= 90 || var69 >= 97 && var69 <= 122;
                                       var84[var38] = var44?1:0;
                                       continue;
                                    }

                                    if(4115 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       var84 = Class5.intStack;
                                       var38 = iStackPtr++;
                                       var69 = (char)var16;
                                       var44 = var69 >= 65 && var69 <= 90 || var69 >= 97 && var69 <= 122;
                                       var84[var38] = var44?1:0;
                                       continue;
                                    }

                                    if(4116 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = UnderlayDefinition.method2282((char) var16, 993015549)?1:0;
                                       continue;
                                    }

                                    if(4117 == instruction) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       if(var83 != null) {
                                          Class5.intStack[iStackPtr++] = var83.length();
                                       } else {
                                          Class5.intStack[iStackPtr++] = 0;
                                       }
                                       continue;
                                    }

                                    if(4118 == instruction) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       iStackPtr -= 2;
                                       var17 = Class5.intStack[iStackPtr];
                                       var38 = Class5.intStack[1 + iStackPtr];
                                       Class5.stringStack[stringStackPtr++] = var83.substring(var17, var38);
                                       continue;
                                    }

                                    if(4119 == instruction) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       StringBuilder var82 = new StringBuilder(var83.length());
                                       var43 = false;

                                       for(var41 = 0; var41 < var83.length(); ++var41) {
                                          var69 = var83.charAt(var41);
                                          if(var69 == 60) {
                                             var43 = true;
                                          } else if(62 == var69) {
                                             var43 = false;
                                          } else if(!var43) {
                                             var82.append(var69);
                                          }
                                       }

                                       Class5.stringStack[stringStackPtr++] = var82.toString();
                                       continue;
                                    }

                                    if(instruction == 4120) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       --iStackPtr;
                                       var17 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = var83.indexOf(var17);
                                       continue;
                                    }

                                    if(4121 == instruction) {
                                       stringStackPtr -= 2;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       var39 = Class5.stringStack[1 + stringStackPtr];
                                       --iStackPtr;
                                       var38 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = var83.indexOf(var39, var38);
                                       continue;
                                    }
                                 } else if(instruction < 4300) {
                                    if(instruction == 4200) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.stringStack[stringStackPtr++] = AnimationDefinition.getItemDefinition(var16, -13500590).name;
                                       continue;
                                    }

                                    ItemDefinition var73;
                                    if(4201 == instruction) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[iStackPtr + 1];
                                       var73 = AnimationDefinition.getItemDefinition(var16, -1642198338);
                                       if(var17 >= 1 && var17 <= 5 && null != var73.options[var17 - 1]) {
                                          Class5.stringStack[stringStackPtr++] = var73.options[var17 - 1];
                                          continue;
                                       }

                                       Class5.stringStack[stringStackPtr++] = "";
                                       continue;
                                    }

                                    if(instruction == 4202) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[1 + iStackPtr];
                                       var73 = AnimationDefinition.getItemDefinition(var16, -1925560779);
                                       if(var17 >= 1 && var17 <= 5 && null != var73.interfaceOptions[var17 - 1]) {
                                          Class5.stringStack[stringStackPtr++] = var73.interfaceOptions[var17 - 1];
                                          continue;
                                       }

                                       Class5.stringStack[stringStackPtr++] = "";
                                       continue;
                                    }

                                    if(4203 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = AnimationDefinition.getItemDefinition(var16, -1105612786).cost * -1794880833;
                                       continue;
                                    }

                                    if(instruction == 4204) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = AnimationDefinition.getItemDefinition(var16, -161037532).stackable * 1548462817 == 1?1:0;
                                       continue;
                                    }

                                    ItemDefinition var88;
                                    if(instruction == 4205) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       var88 = AnimationDefinition.getItemDefinition(var16, -931291652);
                                       if(-1 == var88.notedTemplate * -910205763 && var88.notedID * -616959653 >= 0) {
                                          Class5.intStack[iStackPtr++] = var88.notedID * -616959653;
                                          continue;
                                       }

                                       Class5.intStack[iStackPtr++] = var16;
                                       continue;
                                    }

                                    if(instruction == 4206) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       var88 = AnimationDefinition.getItemDefinition(var16, -1637769624);
                                       if(var88.notedTemplate * -910205763 >= 0 && var88.notedID * -616959653 >= 0) {
                                          Class5.intStack[iStackPtr++] = var88.notedID * -616959653;
                                          continue;
                                       }

                                       Class5.intStack[iStackPtr++] = var16;
                                       continue;
                                    }

                                    if(instruction == 4207) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = AnimationDefinition.getItemDefinition(var16, -1286914239).members?1:0;
                                       continue;
                                    }
                                 } else if(instruction < 5100) {
                                    if(5000 == instruction) {
                                       Class5.intStack[iStackPtr++] = Client.anInt2779 * 220652897;
                                       continue;
                                    }

                                    if(instruction == 5001) {
                                       iStackPtr -= 3;
                                       Client.anInt2779 = Class5.intStack[iStackPtr] * -735805791;
                                       var17 = Class5.intStack[1 + iStackPtr];
                                       Class65[] var81 = Class100.method1299((short)18704);
                                       var41 = 0;

                                       Class65 var94;
                                       while(true) {
                                          if(var41 >= var81.length) {
                                             var94 = null;
                                             break;
                                          }

                                          Class65 var86 = var81[var41];
                                          if(var17 == var86.anInt852 * 1024616147) {
                                             var94 = var86;
                                             break;
                                          }

                                          ++var41;
                                       }

                                       Ignore.aClass65_389 = var94;
                                       if(Ignore.aClass65_389 == null) {
                                          Ignore.aClass65_389 = Class65.aClass65_849;
                                       }

                                       Client.anInt2919 = Class5.intStack[iStackPtr + 2] * -61848581;
                                       Client.secureBuffer.writePacket(143);
                                       Client.secureBuffer.writeByte(Client.anInt2779 * 220652897);
                                       Client.secureBuffer.writeByte(Ignore.aClass65_389.anInt852 * 1024616147);
                                       Client.secureBuffer.writeByte(Client.anInt2919 * -1365749965);
                                       continue;
                                    }

                                    if(5002 == instruction) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       iStackPtr -= 2;
                                       var17 = Class5.intStack[iStackPtr];
                                       var38 = Class5.intStack[iStackPtr + 1];
                                       Client.secureBuffer.writePacket(96);
                                       Client.secureBuffer.writeByte(Class108_Sub20_Sub3.method2069(var83, (byte) 64) + 2);
                                       Client.secureBuffer.writeString(var83);
                                       Client.secureBuffer.writeByte(var17 - 1);
                                       Client.secureBuffer.writeByte(var38);
                                       continue;
                                    }

                                    if(5003 == instruction) {
                                       iStackPtr -= 2;
                                       var16 = Class5.intStack[iStackPtr];
                                       var17 = Class5.intStack[iStackPtr + 1];
                                       ChatMessage var80 = Ignore.method396(var16, var17, (byte)-55);
                                       if(var80 != null) {
                                          Class5.intStack[iStackPtr++] = var80.anInt1944 * -1818271001;
                                          Class5.intStack[iStackPtr++] = var80.messagePushTime * -1204791759;
                                          Class5.stringStack[stringStackPtr++] = var80.messagePrefix != null?var80.messagePrefix:"";
                                          Class5.stringStack[stringStackPtr++] = null != var80.messageString?var80.messageString:"";
                                          Class5.stringStack[stringStackPtr++] = var80.messageSuffix != null?var80.messageSuffix:"";
                                       } else {
                                          Class5.intStack[iStackPtr++] = -1;
                                          Class5.intStack[iStackPtr++] = 0;
                                          Class5.stringStack[stringStackPtr++] = "";
                                          Class5.stringStack[stringStackPtr++] = "";
                                          Class5.stringStack[stringStackPtr++] = "";
                                       }
                                       continue;
                                    }

                                    if(instruction == 5004) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       ChatMessage var89 = (ChatMessage)Class26.aClass95_348.method1202((long)var16);
                                       if(var89 != null) {
                                          Class5.intStack[iStackPtr++] = var89.messageType * 1488157137;
                                          Class5.intStack[iStackPtr++] = var89.messagePushTime * -1204791759;
                                          Class5.stringStack[stringStackPtr++] = null != var89.messagePrefix?var89.messagePrefix:"";
                                          Class5.stringStack[stringStackPtr++] = var89.messageString != null?var89.messageString:"";
                                          Class5.stringStack[stringStackPtr++] = null != var89.messageSuffix?var89.messageSuffix:"";
                                       } else {
                                          Class5.intStack[iStackPtr++] = -1;
                                          Class5.intStack[iStackPtr++] = 0;
                                          Class5.stringStack[stringStackPtr++] = "";
                                          Class5.stringStack[stringStackPtr++] = "";
                                          Class5.stringStack[stringStackPtr++] = "";
                                       }
                                       continue;
                                    }

                                    if(5005 == instruction) {
                                       if(Ignore.aClass65_389 == null) {
                                          Class5.intStack[iStackPtr++] = -1;
                                       } else {
                                          Class5.intStack[iStackPtr++] = Ignore.aClass65_389.anInt852 * 1024616147;
                                       }
                                       continue;
                                    }

                                    if(5008 == instruction) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       --iStackPtr;
                                       var17 = Class5.intStack[iStackPtr];
                                       var76 = var83.toLowerCase();
                                       byte var79 = 0;
                                       if(var76.startsWith(StringConstants.aString1125)) {
                                          var79 = 0;
                                          var83 = var83.substring(StringConstants.aString1125.length());
                                       } else if(var76.startsWith(StringConstants.red_effect)) {
                                          var79 = 1;
                                          var83 = var83.substring(StringConstants.red_effect.length());
                                       } else if(var76.startsWith(StringConstants.green_effect)) {
                                          var79 = 2;
                                          var83 = var83.substring(StringConstants.green_effect.length());
                                       } else if(var76.startsWith(StringConstants.aString1131)) {
                                          var79 = 3;
                                          var83 = var83.substring(StringConstants.aString1131.length());
                                       } else if(var76.startsWith(StringConstants.aString1135)) {
                                          var79 = 4;
                                          var83 = var83.substring(StringConstants.aString1135.length());
                                       } else if(var76.startsWith(StringConstants.white_effect)) {
                                          var79 = 5;
                                          var83 = var83.substring(StringConstants.white_effect.length());
                                       } else if(var76.startsWith(StringConstants.aString1180)) {
                                          var79 = 6;
                                          var83 = var83.substring(StringConstants.aString1180.length());
                                       } else if(var76.startsWith(StringConstants.aString1139)) {
                                          var79 = 7;
                                          var83 = var83.substring(StringConstants.aString1139.length());
                                       } else if(var76.startsWith(StringConstants.FLASH_3_EFFECT)) {
                                          var79 = 8;
                                          var83 = var83.substring(StringConstants.FLASH_3_EFFECT.length());
                                       } else if(var76.startsWith(StringConstants.GLOW_1_EFFECT)) {
                                          var79 = 9;
                                          var83 = var83.substring(StringConstants.GLOW_1_EFFECT.length());
                                       } else if(var76.startsWith(StringConstants.glow2_effect)) {
                                          var79 = 10;
                                          var83 = var83.substring(StringConstants.glow2_effect.length());
                                       } else if(var76.startsWith(StringConstants.aString1144)) {
                                          var79 = 11;
                                          var83 = var83.substring(StringConstants.aString1144.length());
                                       } else if(0 != Client.anInt2712 * 148074329) {
                                          if(var76.startsWith(StringConstants.aString1126)) {
                                             var79 = 0;
                                             var83 = var83.substring(StringConstants.aString1126.length());
                                          } else if(var76.startsWith(StringConstants.aString1128)) {
                                             var79 = 1;
                                             var83 = var83.substring(StringConstants.aString1128.length());
                                          } else if(var76.startsWith(StringConstants.aString1130)) {
                                             var79 = 2;
                                             var83 = var83.substring(StringConstants.aString1130.length());
                                          } else if(var76.startsWith(StringConstants.aString1107)) {
                                             var79 = 3;
                                             var83 = var83.substring(StringConstants.aString1107.length());
                                          } else if(var76.startsWith(StringConstants.aString1134)) {
                                             var79 = 4;
                                             var83 = var83.substring(StringConstants.aString1134.length());
                                          } else if(var76.startsWith(StringConstants.aString1136)) {
                                             var79 = 5;
                                             var83 = var83.substring(StringConstants.aString1136.length());
                                          } else if(var76.startsWith(StringConstants.aString1138)) {
                                             var79 = 6;
                                             var83 = var83.substring(StringConstants.aString1138.length());
                                          } else if(var76.startsWith(StringConstants.aString1036)) {
                                             var79 = 7;
                                             var83 = var83.substring(StringConstants.aString1036.length());
                                          } else if(var76.startsWith(StringConstants.aString1142)) {
                                             var79 = 8;
                                             var83 = var83.substring(StringConstants.aString1142.length());
                                          } else if(var76.startsWith(StringConstants.aString1132)) {
                                             var79 = 9;
                                             var83 = var83.substring(StringConstants.aString1132.length());
                                          } else if(var76.startsWith(StringConstants.aString1060)) {
                                             var79 = 10;
                                             var83 = var83.substring(StringConstants.aString1060.length());
                                          } else if(var76.startsWith(StringConstants.aString1148)) {
                                             var79 = 11;
                                             var83 = var83.substring(StringConstants.aString1148.length());
                                          }
                                       }

                                       var76 = var83.toLowerCase();
                                       byte var78 = 0;
                                       if(var76.startsWith(StringConstants.aString1149)) {
                                          var78 = 1;
                                          var83 = var83.substring(StringConstants.aString1149.length());
                                       } else if(var76.startsWith(StringConstants.aString1003)) {
                                          var78 = 2;
                                          var83 = var83.substring(StringConstants.aString1003.length());
                                       } else if(var76.startsWith(StringConstants.aString1045)) {
                                          var78 = 3;
                                          var83 = var83.substring(StringConstants.aString1045.length());
                                       } else if(var76.startsWith(StringConstants.aString1084)) {
                                          var78 = 4;
                                          var83 = var83.substring(StringConstants.aString1084.length());
                                       } else if(var76.startsWith(StringConstants.aString1157)) {
                                          var78 = 5;
                                          var83 = var83.substring(StringConstants.aString1157.length());
                                       } else if(Client.anInt2712 * 148074329 != 0) {
                                          if(var76.startsWith(StringConstants.aString1172)) {
                                             var78 = 1;
                                             var83 = var83.substring(StringConstants.aString1172.length());
                                          } else if(var76.startsWith(StringConstants.aString1104)) {
                                             var78 = 2;
                                             var83 = var83.substring(StringConstants.aString1104.length());
                                          } else if(var76.startsWith(StringConstants.SHAKE_EFFECT)) {
                                             var78 = 3;
                                             var83 = var83.substring(StringConstants.SHAKE_EFFECT.length());
                                          } else if(var76.startsWith(StringConstants.aString1156)) {
                                             var78 = 4;
                                             var83 = var83.substring(StringConstants.aString1156.length());
                                          } else if(var76.startsWith(StringConstants.aString1158)) {
                                             var78 = 5;
                                             var83 = var83.substring(StringConstants.aString1158.length());
                                          }
                                       }

                                       Client.secureBuffer.writePacket(178);
                                       Client.secureBuffer.writeByte(0);
                                       var21 = Client.secureBuffer.position * 798331555;
                                       Client.secureBuffer.writeByte(var17);
                                       Client.secureBuffer.writeByte(var79);
                                       Client.secureBuffer.writeByte(var78);
                                       RSPacketBuffer var61 = Client.secureBuffer;
                                       var23 = var61.position * 798331555;
                                       byte[] var63 = Class108_Sub6.method1675(var83, (byte)1);
                                       var61.method1708(var63.length, 1636133046);
                                       var61.position += Class110.huffmanEncoding.encrypt(var63, 0, var63.length, var61.buf, var61.position * 798331555, 965537425) * 537964811;
                                       Client.secureBuffer.endByte(Client.secureBuffer.position * 798331555 - var21, (short) -12708);
                                       continue;
                                    }

                                    if(instruction == 5009) {
                                       stringStackPtr -= 2;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       var39 = Class5.stringStack[stringStackPtr + 1];
                                       Client.secureBuffer.writePacket(12);
                                       Client.secureBuffer.writeShort(0);
                                       var38 = Client.secureBuffer.position * 798331555;
                                       Client.secureBuffer.writeString(var83);
                                       RSPacketBuffer var77 = Client.secureBuffer;
                                       var50 = var77.position * 798331555;
                                       byte[] var65 = Class108_Sub6.method1675(var39, (byte)1);
                                       var77.method1708(var65.length, 1331900876);
                                       var77.position += Class110.huffmanEncoding.encrypt(var65, 0, var65.length, var77.buf, var77.position * 798331555, -1015637038) * 537964811;
                                       Client.secureBuffer.endShort(Client.secureBuffer.position * 798331555 - var38, 949409914);
                                       continue;
                                    }

                                    if(instruction == 5015) {
                                       if(null != Player.myPlayer && Player.myPlayer.playerName != null) {
                                          var83 = Player.myPlayer.playerName;
                                       } else {
                                          var83 = "";
                                       }

                                       Class5.stringStack[stringStackPtr++] = var83;
                                       continue;
                                    }

                                    if(instruction == 5016) {
                                       Class5.intStack[iStackPtr++] = Client.anInt2919 * -1365749965;
                                       continue;
                                    }

                                    if(instruction == 5017) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       var84 = Class5.intStack;
                                       var38 = iStackPtr++;
                                       ChatMessagesContainer var75 = (ChatMessagesContainer)Class26.chatMessageMap.get(Integer.valueOf(var16));
                                       if(null == var75) {
                                          var41 = 0;
                                       } else {
                                          var41 = var75.method351(-1295187518);
                                       }

                                       var84[var38] = var41;
                                       continue;
                                    }

                                    if(5018 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       var84 = Class5.intStack;
                                       var38 = iStackPtr++;
                                       ChatMessage var74 = (ChatMessage)Class26.aClass95_348.method1202((long)var16);
                                       if(null == var74) {
                                          var41 = -1;
                                       } else if(var74.nextNode == Class26.aClass97_349.aClass108_Sub20_1374) {
                                          var41 = -1;
                                       } else {
                                          var41 = ((ChatMessage)var74.nextNode).anInt1944 * -1818271001;
                                       }

                                       var84[var38] = var41;
                                       continue;
                                    }

                                    if(5019 == instruction) {
                                       --iStackPtr;
                                       var16 = Class5.intStack[iStackPtr];
                                       Class5.intStack[iStackPtr++] = Player.method3181(var16, (byte) 126);
                                       continue;
                                    }

                                    if(5020 == instruction) {
                                       --stringStackPtr;
                                       var83 = Class5.stringStack[stringStackPtr];
                                       Class71.sendText(var83, -2117328929);
                                       continue;
                                    }
                                 }
                              }
                           } else {
                              if(instruction >= 2000) {
                                 instruction -= 1000;
                                 --iStackPtr;
                                 var35 = CacheIndexRequest.getInterfaceComponentForHash(Class5.intStack[iStackPtr], -463278670);
                              } else {
                                 var35 = var52?Class19.aClass108_Sub17_230:BuildType.aClass108_Sub17_1231;
                              }

                              if(instruction == 1300) {
                                 --iStackPtr;
                                 var17 = Class5.intStack[iStackPtr] - 1;
                                 if(var17 >= 0 && var17 <= 9) {
                                    --stringStackPtr;
                                    var35.method1940(var17, Class5.stringStack[stringStackPtr], 929747449);
                                    continue;
                                 }

                                 --stringStackPtr;
                                 continue;
                              }

                              if(1301 == instruction) {
                                 iStackPtr -= 2;
                                 var17 = Class5.intStack[iStackPtr];
                                 var38 = Class5.intStack[iStackPtr + 1];
                                 var35.aClass108_Sub17_1833 = LoginHandler.method878(var17, var38, 2133087913);
                                 continue;
                              }

                              if(instruction == 1302) {
                                 --iStackPtr;
                                 var35.aBool1836 = Class5.intStack[iStackPtr] == 1;
                                 continue;
                              }

                              if(1303 == instruction) {
                                 --iStackPtr;
                                 var35.anInt1834 = Class5.intStack[iStackPtr] * 689001801;
                                 continue;
                              }

                              if(1304 == instruction) {
                                 --iStackPtr;
                                 var35.anInt1835 = Class5.intStack[iStackPtr] * 435583279;
                                 continue;
                              }

                              if(instruction == 1305) {
                                 --stringStackPtr;
                                 var35.aString1821 = Class5.stringStack[stringStackPtr];
                                 continue;
                              }

                              if(1306 == instruction) {
                                 --stringStackPtr;
                                 var35.selectedActionName = Class5.stringStack[stringStackPtr];
                                 continue;
                              }

                              if(instruction == 1307) {
                                 var35.aStringArray1832 = null;
                                 continue;
                              }
                           }
                        } else {
                           if(instruction >= 2000) {
                              instruction -= 1000;
                              --iStackPtr;
                              var35 = CacheIndexRequest.getInterfaceComponentForHash(Class5.intStack[iStackPtr], 1557099649);
                           } else {
                              var35 = var52?Class19.aClass108_Sub17_230:BuildType.aClass108_Sub17_1231;
                           }

                           MouseInputHandler.method775(var35, -16054773);
                           if(1200 == instruction) {
                              iStackPtr -= 2;
                              var17 = Class5.intStack[iStackPtr];
                              var38 = Class5.intStack[iStackPtr + 1];
                              var35.itemID = var17 * 199268639;
                              var35.anInt1775 = var38 * -154849603;
                              ItemDefinition var40 = AnimationDefinition.getItemDefinition(var17, -1326366724);
                              var35.mediaRotationX = var40.xan2d * 547018395;
                              var35.mediaRotationY = var40.yan2d * -1292543953;
                              var35.anInt1813 = var40.zan2d * 2079954531;
                              var35.anInt1809 = var40.xOffset2d * 212469115;
                              var35.anInt1810 = var40.yOffset2d * 1627709775;
                              var35.mediaZoom = var40.zoom2d * 1514043043;
                              if(var35.height * -1281443035 > 0) {
                                 var35.mediaZoom = var35.mediaZoom * -172962336 / (var35.height * -1281443035) * -977233777;
                              }
                              continue;
                           }

                           if(instruction == 1201) {
                              var35.mediaType = -2023579350;
                              --iStackPtr;
                              var35.mediaID = Class5.intStack[iStackPtr] * 1321013799;
                              continue;
                           }

                           if(1202 == instruction) {
                              var35.mediaType = 1259598271;
                              var35.mediaID = Player.myPlayer.bodyEquipmentKit.method1168(-167707527) * 1321013799;
                              continue;
                           }
                        }
                     } else {
                        if(instruction >= 2000) {
                           instruction -= 1000;
                           --iStackPtr;
                           var35 = CacheIndexRequest.getInterfaceComponentForHash(Class5.intStack[iStackPtr], 317874019);
                        } else {
                           var35 = var52?Class19.aClass108_Sub17_230:BuildType.aClass108_Sub17_1231;
                        }

                        if(1100 == instruction) {
                           iStackPtr -= 2;
                           var35.anInt1784 = Class5.intStack[iStackPtr] * -982225055;
                           if(var35.anInt1784 * -133270367 > var35.anInt1786 * -561671337 - var35.height * -1281443035) {
                              var35.anInt1784 = var35.anInt1786 * -236221193 - var35.height * 672003077;
                           }

                           if(var35.anInt1784 * -133270367 < 0) {
                              var35.anInt1784 = 0;
                           }

                           var35.scrollPosition = Class5.intStack[iStackPtr + 1] * -1291378673;
                           if(var35.scrollPosition * -643576081 > var35.anInt1787 * -1108406155 - var35.width * 334099177) {
                              var35.scrollPosition = var35.anInt1787 * 1162057435 - var35.width * -126788697;
                           }

                           if(var35.scrollPosition * -643576081 < 0) {
                              var35.scrollPosition = 0;
                           }

                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(instruction == 1101) {
                           --iStackPtr;
                           var35.componentColor = Class5.intStack[iStackPtr] * 1601296361;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(1102 == instruction) {
                           --iStackPtr;
                           var35.filled = Class5.intStack[iStackPtr] == 1;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(instruction == 1103) {
                           --iStackPtr;
                           var35.alpha = Class5.intStack[iStackPtr] * -1040068631;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(1104 == instruction) {
                           --iStackPtr;
                           var35.anInt1811 = Class5.intStack[iStackPtr] * -2000475851;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(1105 == instruction) {
                           --iStackPtr;
                           var35.anInt1870 = Class5.intStack[iStackPtr] * -149205505;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(1106 == instruction) {
                           --iStackPtr;
                           var35.anInt1797 = Class5.intStack[iStackPtr] * 1184057095;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(instruction == 1107) {
                           --iStackPtr;
                           var35.aBool1798 = Class5.intStack[iStackPtr] == 1;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(instruction == 1108) {
                           var35.mediaType = -1011789675;
                           --iStackPtr;
                           var35.mediaID = Class5.intStack[iStackPtr] * 1321013799;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(instruction == 1109) {
                           iStackPtr -= 6;
                           var35.anInt1809 = Class5.intStack[iStackPtr] * -1402493637;
                           var35.anInt1810 = Class5.intStack[iStackPtr + 1] * -1786754887;
                           var35.mediaRotationX = Class5.intStack[2 + iStackPtr] * 1598312059;
                           var35.mediaRotationY = Class5.intStack[3 + iStackPtr] * 40361315;
                           var35.anInt1813 = Class5.intStack[4 + iStackPtr] * -1299307865;
                           var35.mediaZoom = Class5.intStack[5 + iStackPtr] * -977233777;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(instruction == 1110) {
                           --iStackPtr;
                           var17 = Class5.intStack[iStackPtr];
                           if(var17 != var35.mediaAnimID * 866704807) {
                              var35.mediaAnimID = var17 * 596245015;
                              var35.anInt1877 = 0;
                              var35.anInt1805 = 0;
                              MouseInputHandler.method775(var35, -16054773);
                           }
                           continue;
                        }

                        if(1111 == instruction) {
                           --iStackPtr;
                           var35.aBool1816 = Class5.intStack[iStackPtr] == 1;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(1112 == instruction) {
                           --stringStackPtr;
                           var39 = Class5.stringStack[stringStackPtr];
                           if(!var39.equals(var35.componentString)) {
                              var35.componentString = var39;
                              MouseInputHandler.method775(var35, -16054773);
                           }
                           continue;
                        }

                        if(1113 == instruction) {
                           --iStackPtr;
                           var35.fontID = Class5.intStack[iStackPtr] * 343759393;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(instruction == 1114) {
                           iStackPtr -= 3;
                           var35.anInt1863 = Class5.intStack[iStackPtr] * -1507823521;
                           var35.anInt1862 = Class5.intStack[1 + iStackPtr] * 1183993449;
                           var35.anInt1820 = Class5.intStack[iStackPtr + 2] * -775893061;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(1115 == instruction) {
                           --iStackPtr;
                           var35.textCentered = Class5.intStack[iStackPtr] == 1;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(instruction == 1116) {
                           --iStackPtr;
                           var35.anInt1799 = Class5.intStack[iStackPtr] * 682476773;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(1117 == instruction) {
                           --iStackPtr;
                           var35.anInt1800 = Class5.intStack[iStackPtr] * -1871143695;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(1118 == instruction) {
                           --iStackPtr;
                           var35.flipImageHorizontal = Class5.intStack[iStackPtr] == 1;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(instruction == 1119) {
                           --iStackPtr;
                           var35.flipImageVertical = Class5.intStack[iStackPtr] == 1;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(1120 == instruction) {
                           iStackPtr -= 2;
                           var35.anInt1786 = Class5.intStack[iStackPtr] * -1473181593;
                           var35.anInt1787 = Class5.intStack[1 + iStackPtr] * 1930051549;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }

                        if(instruction == 1121) {
                           var17 = var35.interfaceHash * -1081473899;
                           var38 = var35.anInt1772 * -490007465;
                           Client.secureBuffer.writePacket(250);
                           Client.secureBuffer.writeInt(var17);
                           Client.secureBuffer.writeAShortLE(var38, (byte) 42);
                           Client.aClass108_Sub17_2869 = var35;
                           MouseInputHandler.method775(var35, -16054773);
                           continue;
                        }
                     }
                  } else {
                     if(instruction >= 2000) {
                        instruction -= 1000;
                        --iStackPtr;
                        var35 = CacheIndexRequest.getInterfaceComponentForHash(Class5.intStack[iStackPtr], 111384445);
                     } else {
                        var35 = var52?Class19.aClass108_Sub17_230:BuildType.aClass108_Sub17_1231;
                     }

                     if(instruction == 1000) {
                        iStackPtr -= 2;
                        var35.anInt1776 = Class5.intStack[iStackPtr] * 604525469;
                        var35.anInt1824 = Class5.intStack[iStackPtr + 1] * -1129233995;
                        MouseInputHandler.method775(var35, -16054773);
                        continue;
                     }

                     if(instruction == 1001) {
                        iStackPtr -= 2;
                        var35.height = Class5.intStack[iStackPtr] * 1526393005;
                        var35.width = Class5.intStack[iStackPtr + 1] * -955513511;
                        MouseInputHandler.method775(var35, -16054773);
                        continue;
                     }

                     if(1003 == instruction) {
                        --iStackPtr;
                        var37 = Class5.intStack[iStackPtr] == 1;
                        if(var35.hidden != var37) {
                           var35.hidden = var37;
                           MouseInputHandler.method775(var35, -16054773);
                        }
                        continue;
                     }
                  }
               }

               if(instruction >= 5600 || instruction != 5504) {
                  throw new IllegalStateException();
               }

               iStackPtr -= 2;
               var16 = Class5.intStack[iStackPtr];
               var17 = Class5.intStack[1 + iStackPtr];
               if(!Client.aBool2886) {
                  Client.anInt2816 = var16 * -1569679973;
                  Client.anInt2771 = var17 * -790493177;
               }
            }
         } catch (Exception var32) {
            StringBuilder var13 = new StringBuilder(30);
            var13.append("").append(definition.key).append(" ");

            for(paramIndex = Class5.anInt81 * 2146486549 - 1; paramIndex >= 0; --paramIndex) {
               var13.append("").append(Class5.aClass51Array82[paramIndex].aClass108_Sub20_Sub17_711.key).append(" ");
            }

            var13.append("").append(var11);
            World.method647(var13.toString(), var32, 926745782);
         }
      }
   }

   public static void method2171(boolean var0, int var1) {
      if(null != Class78.connection) {
         try {
            RSByteBuffer var2 = new RSByteBuffer(4);
            var2.writeByte(var0 ? 2 : 3);
            var2.writeTriByte(0);
            Class78.connection.writeBytes(var2.buf, 0, 4);
         } catch (IOException var5) {
            try {
               Class78.connection.disconnect();
            } catch (Exception var4) {
               ;
            }

            Class78.anInt1230 += 1249054009;
            Class78.connection = null;
         }
      }
   }

   static final void method2172(int var0, int var1, int var2, int var3, byte var4) {
      for(int var5 = 0; var5 < Client.anInt2907 * -792079877; ++var5) {
         if(Client.anIntArray2914[var5] + Client.anIntArray2912[var5] > var0 && Client.anIntArray2912[var5] < var0 + var2 && Client.anIntArray2913[var5] + Client.anIntArray2905[var5] > var1 && Client.anIntArray2913[var5] < var3 + var1) {
            Client.aBoolArray2909[var5] = true;
         }
      }

   }
}
