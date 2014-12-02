
public class Class108_Sub20_Sub3 extends CacheableNode {

   static final int anInt1962 = 4;
   static CacheableNodeMap aClass106_1963 = new CacheableNodeMap(64);
   public int anInt1964 = 0;
   static Class14 aClass14_1965;
   static final int anInt1966 = 51;
   public static AbstractIndex configIndexReference;
   static final int anInt1968 = 24624;
   static final int anInt1969 = 400;
   public static final int anInt1970 = 32;
   public static final int anInt1971 = 45;


   void method2060(RSByteBuffer var1, short var2) {
      while(true) {
         int var3 = var1.readUByte();
         if(0 == var3) {
            return;
         }

         this.method2062(var1, var3, -683409398);
      }
   }

   void method2062(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 2) {
         this.anInt1964 = var1.readUShort(1851091175) * 1615379733;
      }
   }

   static void method2067(Applet_Sub1 var0, int var1) {
      if(Class4.worldListOpen) {
         GameObject.method2846(var0, (byte)-11);
      } else {
         if((MouseInputHandler.anInt780 * 1629072957 == 1 || !Class100.aBool1391 && MouseInputHandler.anInt780 * 1629072957 == 4) && MouseInputHandler.anInt774 * 472132205 >= 715 && MouseInputHandler.anInt778 * 1498262827 >= 453) {
            Ignore.aClass37_386.aBool529 = !Ignore.aClass37_386.aBool529;
            Timer.method713(-1567766695);
            if(!Ignore.aClass37_386.aBool529) {
               IsaacRandomGen.method735(Friend.musicIndex_1, "scape main", "", 255, false, (byte) 1);
            } else {
               Class32.aClass108_Sub4_Sub3_464.method2610(410806899);
               Class91.anInt1325 = -771978757;
               RSInterface.aClass74_1889 = null;
            }
         }

         if(5 != Client.loginLoadingStage * 1315883169) {
            Class4.anInt50 -= 1909601071;
            if(Client.loginLoadingStage * 1315883169 == 10 || Client.loginLoadingStage * 1315883169 == 11) {
               if(0 == Client.anInt2712 * 148074329) {
                  if(1 == MouseInputHandler.anInt780 * 1629072957 || !Class100.aBool1391 && 4 == MouseInputHandler.anInt780 * 1629072957) {
                     byte var2 = 5;
                     short var4 = 463;
                     byte var6 = 100;
                     byte var5 = 35;
                     if(MouseInputHandler.anInt774 * 472132205 >= var2 && MouseInputHandler.anInt774 * 472132205 <= var2 + var6 && MouseInputHandler.anInt778 * 1498262827 >= var4 && MouseInputHandler.anInt778 * 1498262827 <= var5 + var4) {
                        Player.method3180(-525999435);
                        return;
                     }
                  }

                  if(null != Class77.aClass43_1203) {
                     Player.method3180(1624557494);
                  }
               }

               int var10 = MouseInputHandler.anInt780 * 1629072957;
               int var12 = MouseInputHandler.anInt774 * 472132205;
               int var14 = MouseInputHandler.anInt778 * 1498262827;
               if(!Class100.aBool1391 && 4 == var10) {
                  var10 = 1;
               }

               short var7;
               short var13;
               if(0 == Class4.anInt54 * 2105711249) {
                  var13 = 302;
                  var7 = 291;
                  if(var10 == 1 && var12 >= var13 - 75 && var12 <= var13 + 75 && var14 >= var7 - 20 && var14 <= 20 + var7) {
                     SpotAnim.method2137(Class4.method81("secure", true, (byte)4) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, (byte)26);
                  }

                  var13 = 462;
                  if(1 == var10) {
                     if(var12 >= var13 - 75) {
                        if(var12 <= var13 + 75) {
                           if(var14 >= var7 - 20) {
                              if(var14 <= var7 + 20) {
                                 if((Client.worldType * 164398169 & 4) != 0) {
                                    if(0 != (Client.worldType * 164398169 & 1024)) {
                                       Class4.aString74 = StringConstants.HIGH_RISK_PVP_WORLD;
                                       Class4.aString64 = StringConstants.aString1171;
                                       Class4.aString55 = StringConstants.aString1185;
                                    } else {
                                       Class4.aString74 = StringConstants.HIGH_RISK_PVP_WORLD;
                                       Class4.aString64 = StringConstants.aString1165;
                                       Class4.aString55 = StringConstants.aString1166;
                                    }

                                    Class4.anInt54 = -1920702863;
                                    Class4.anInt62 = 0;
                                 } else if((Client.worldType * 164398169 & 1024) != 0) {
                                    Class4.aString74 = StringConstants.aString1167;
                                    Class4.aString64 = StringConstants.aString1168;
                                    Class4.aString55 = StringConstants.aString1169;
                                    Class4.anInt54 = -1920702863;
                                    Class4.anInt62 = 0;
                                 } else {
                                    Class4.aString74 = StringConstants.aString1160;
                                    Class4.aString64 = StringConstants.aString1101;
                                    Class4.aString55 = StringConstants.aString1162;
                                    Class4.anInt54 = 453561570;
                                    Class4.anInt62 = 0;
                                 }
                              }
                           }
                        }
                     }
                  }
               } else if(Class4.anInt54 * 2105711249 == 1) {
                  while(GraphicsBuffer.method278(1941552803)) {
                     if(Class9.anInt124 * 1025603675 == 84) {
                        Class4.aString74 = StringConstants.aString1160;
                        Class4.aString64 = StringConstants.aString1101;
                        Class4.aString55 = StringConstants.aString1162;
                        Class4.anInt54 = 453561570;
                        Class4.anInt62 = 0;
                     } else if(Class9.anInt124 * 1025603675 == 13) {
                        Class4.anInt54 = 0;
                     }
                  }

                  var13 = 302;
                  var7 = 321;
                  if(1 == var10 && var12 >= var13 - 75 && var12 <= 75 + var13 && var14 >= var7 - 20 && var14 <= var7 + 20) {
                     Class4.aString74 = StringConstants.aString1160;
                     Class4.aString64 = StringConstants.aString1101;
                     Class4.aString55 = StringConstants.aString1162;
                     Class4.anInt54 = 453561570;
                     Class4.anInt62 = 0;
                  }

                  var13 = 462;
                  if(1 == var10) {
                     if(var12 >= var13 - 75) {
                        if(var12 <= var13 + 75) {
                           if(var14 >= var7 - 20) {
                              if(var14 <= 20 + var7) {
                                 Class4.anInt54 = 0;
                              }
                           }
                        }
                     }
                  }
               } else if(Class4.anInt54 * 2105711249 == 2) {
                  var13 = 231;
                  int var15 = var13 + 30;
                  if(var10 == 1 && var14 >= var15 - 15 && var14 < var15) {
                     Class4.anInt62 = 0;
                  }

                  var15 += 15;
                  if(var10 == 1 && var14 >= var15 - 15 && var14 < var15) {
                     Class4.anInt62 = -547575295;
                  }

                  var15 += 15;
                  var7 = 302;
                  short var11 = 321;
                  if(var10 == 1 && var12 >= var7 - 75 && var12 <= var7 + 75 && var14 >= var11 - 20 && var14 <= var11 + 20) {
                     Class4.typedUsername = Class4.typedUsername.trim();
                     if(Class4.typedUsername.length() == 0) {
                        World.method646(StringConstants.aString1066, StringConstants.PLEASE_ENTER_USER_EMAIL, StringConstants.aString982, 2129771750);
                     } else if(Class4.typedPassword.length() == 0) {
                        World.method646(StringConstants.aString1096, StringConstants.PLEASE_ENTER_PASS, StringConstants.aString1071, 1994617895);
                     } else {
                        World.method646(StringConstants.aString1175, StringConstants.aString1176, StringConstants.aString1094, 1896835022);
                        Class4.aClass76_65 = Ignore.aClass37_386.aLinkedHashMap530.containsKey(Integer.valueOf(ProducingGraphicsBuffer.method1595(Class4.typedUsername, 698639797)))?Class76.aClass76_1200:Class76.aClass76_1199;
                        IsaacRandomGen.method725(20, 1805521706);
                     }
                  } else {
                     var7 = 462;
                     if(1 == var10 && var12 >= var7 - 75 && var12 <= 75 + var7 && var14 >= var11 - 20 && var14 <= var11 + 20) {
                        Class4.anInt54 = 0;
                        Class4.typedUsername = "";
                        Class4.typedPassword = "";
                        AnimationSkeletonSet.anInt2260 = 0;
                        BuildType.enteredPin = "";
                        Class4.trustComputer = true;
                     }

                     while(GraphicsBuffer.method278(-429939348)) {
                        boolean var16 = false;
                        int var9 = 0;

                        while(true) {
                           if(var9 < Class4.aString60.length()) {
                              if(LoginHandler.aChar841 != Class4.aString60.charAt(var9)) {
                                 ++var9;
                                 continue;
                              }

                              var16 = true;
                           }

                           if(Class9.anInt124 * 1025603675 == 13) {
                              Class4.anInt54 = 0;
                              Class4.typedUsername = "";
                              Class4.typedPassword = "";
                              AnimationSkeletonSet.anInt2260 = 0;
                              BuildType.enteredPin = "";
                              Class4.trustComputer = true;
                              break;
                           }

                           if(Class4.anInt62 * 1502041601 == 0) {
                              if(85 == Class9.anInt124 * 1025603675 && Class4.typedUsername.length() > 0) {
                                 Class4.typedUsername = Class4.typedUsername.substring(0, Class4.typedUsername.length() - 1);
                              }

                              if(84 == Class9.anInt124 * 1025603675 || 80 == Class9.anInt124 * 1025603675) {
                                 Class4.anInt62 = -547575295;
                              }

                              if(var16 && Class4.typedUsername.length() < 320) {
                                 Class4.typedUsername = Class4.typedUsername + LoginHandler.aChar841;
                              }
                              break;
                           }

                           if(1 != Class4.anInt62 * 1502041601) {
                              break;
                           }

                           if(Class9.anInt124 * 1025603675 == 85 && Class4.typedPassword.length() > 0) {
                              Class4.typedPassword = Class4.typedPassword.substring(0, Class4.typedPassword.length() - 1);
                           }

                           if(84 == Class9.anInt124 * 1025603675 || 80 == Class9.anInt124 * 1025603675) {
                              Class4.anInt62 = 0;
                           }

                           if(84 == Class9.anInt124 * 1025603675) {
                              Class4.typedUsername = Class4.typedUsername.trim();
                              if(Class4.typedUsername.length() == 0) {
                                 World.method646(StringConstants.aString1066, StringConstants.PLEASE_ENTER_USER_EMAIL, StringConstants.aString982, 1994248243);
                                 return;
                              }

                              if(Class4.typedPassword.length() == 0) {
                                 World.method646(StringConstants.aString1096, StringConstants.PLEASE_ENTER_PASS, StringConstants.aString1071, 1951485667);
                                 return;
                              }

                              World.method646(StringConstants.aString1175, StringConstants.aString1176, StringConstants.aString1094, 1956224355);
                              Class4.aClass76_65 = Ignore.aClass37_386.aLinkedHashMap530.containsKey(Integer.valueOf(ProducingGraphicsBuffer.method1595(Class4.typedUsername, 698639797)))?Class76.aClass76_1200:Class76.aClass76_1199;
                              IsaacRandomGen.method725(20, 1408783702);
                              return;
                           }

                           if(var16 && Class4.typedPassword.length() < 20) {
                              Class4.typedPassword = Class4.typedPassword + LoginHandler.aChar841;
                           }
                           break;
                        }
                     }

                  }
               } else if(4 == Class4.anInt54 * 2105711249) {
                  var13 = 302;
                  var7 = 321;
                  if(1 == var10 && var12 >= var13 - 75 && var12 <= 75 + var13 && var14 >= var7 - 20 && var14 <= 20 + var7) {
                     BuildType.enteredPin.trim();
                     if(BuildType.enteredPin.length() != 6) {
                        World.method646(StringConstants.aString1153, StringConstants.AUTH_PIN_ENTER, StringConstants.aString984, 2140301062);
                     } else {
                        AnimationSkeletonSet.anInt2260 = Integer.parseInt(BuildType.enteredPin) * -1042182137;
                        BuildType.enteredPin = "";
                        Class4.aClass76_65 = Class4.trustComputer?Class76.aClass76_1198:Class76.aClass76_1201;
                        World.method646(StringConstants.aString1175, StringConstants.aString1176, StringConstants.aString1094, 1981202273);
                        IsaacRandomGen.method725(20, 1910610971);
                     }
                  } else {
                     if(1 == var10 && var12 >= 373 && var12 <= 512 && var14 >= 263 && var14 <= 296) {
                        Class4.trustComputer = !Class4.trustComputer;
                     }

                     if(var10 == 1 && var12 >= 348 && var12 <= 416 && var14 >= 351 && var14 <= 363) {
                        SpotAnim.method2137(Class4.method81("secure", true, (byte)4) + "m=totp-authenticator/disableTOTPRequest", true, false, (byte)-11);
                     }

                     var13 = 462;
                     if(var10 == 1 && var12 >= var13 - 75 && var12 <= var13 + 75 && var14 >= var7 - 20 && var14 <= 20 + var7) {
                        Class4.anInt54 = 0;
                        Class4.typedUsername = "";
                        Class4.typedPassword = "";
                        AnimationSkeletonSet.anInt2260 = 0;
                        BuildType.enteredPin = "";
                     }

                     while(GraphicsBuffer.method278(-1121639400)) {
                        boolean var3 = false;
                        int var8 = 0;

                        while(true) {
                           if(var8 < Class4.aString46.length()) {
                              if(LoginHandler.aChar841 != Class4.aString46.charAt(var8)) {
                                 ++var8;
                                 continue;
                              }

                              var3 = true;
                           }

                           if(13 == Class9.anInt124 * 1025603675) {
                              Class4.anInt54 = 0;
                              Class4.typedUsername = "";
                              Class4.typedPassword = "";
                              AnimationSkeletonSet.anInt2260 = 0;
                              BuildType.enteredPin = "";
                           } else {
                              if(85 == Class9.anInt124 * 1025603675 && BuildType.enteredPin.length() > 0) {
                                 BuildType.enteredPin = BuildType.enteredPin.substring(0, BuildType.enteredPin.length() - 1);
                              }

                              if(84 == Class9.anInt124 * 1025603675) {
                                 BuildType.enteredPin.trim();
                                 if(BuildType.enteredPin.length() != 6) {
                                    World.method646(StringConstants.aString1153, StringConstants.AUTH_PIN_ENTER, StringConstants.aString984, 2014560043);
                                    return;
                                 }

                                 AnimationSkeletonSet.anInt2260 = Integer.parseInt(BuildType.enteredPin) * -1042182137;
                                 BuildType.enteredPin = "";
                                 Class4.aClass76_65 = Class4.trustComputer?Class76.aClass76_1198:Class76.aClass76_1201;
                                 World.method646(StringConstants.aString1175, StringConstants.aString1176, StringConstants.aString1094, 2071091536);
                                 IsaacRandomGen.method725(20, 1944863421);
                                 return;
                              }

                              if(var3 && BuildType.enteredPin.length() < 6) {
                                 BuildType.enteredPin = BuildType.enteredPin + LoginHandler.aChar841;
                              }
                           }
                           break;
                        }
                     }

                  }
               }
            }
         }
      }
   }

   public static int method2069(String var0, byte var1) {
      return var0.length() + 1;
   }

}
