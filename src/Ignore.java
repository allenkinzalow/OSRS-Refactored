import java.awt.FontMetrics;

public class Ignore {

   static Class37 aClass37_386;
   String displayName;
   static PingRequest aClass85_388;
   static Class65 aClass65_389;
   String username;
   static int[] anIntArray397;
   static FontMetrics aFontMetrics398;


   static final void buildRightClickMenu(RSInterface[] components, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for(int componentID = 0; componentID < components.length; ++componentID) {
         RSInterface component = components[componentID];
         if(null != component && (!component.aBool1855 || 0 == component.componentType * 942877543 || component.hasScript || Class32.method576(component, -1267315198) != 0 || Client.aClass108_Sub17_2878 == component) && var1 == component.hoverPopup * -867206361 && (!component.aBool1855 || !RSInterface.isComponentHidden(component, (byte) 8))) {
            int var18 = var6 + component.anInt1776 * 985647797;
            int var14 = var7 + component.anInt1824 * 1730176157;
            int var10;
            int var11;
            int var13;
            int var19;
            int var20;
            int var21;
            int var22;
            int var24;
            if(component.componentType * 942877543 == 2) {
               var13 = var2;
               var19 = var3;
               var11 = var4;
               var20 = var5;
            } else if(9 == component.componentType * 942877543) {
               var10 = var18;
               var22 = var14;
               var21 = var18 + component.height * -1281443035;
               var24 = component.width * 334099177 + var14;
               if(var21 < var18) {
                  var10 = var21;
                  var21 = var18;
               }

               if(var24 < var14) {
                  var22 = var24;
                  var24 = var14;
               }

               ++var21;
               ++var24;
               var13 = var10 > var2?var10:var2;
               var19 = var22 > var3?var22:var3;
               var11 = var21 < var4?var21:var4;
               var20 = var24 < var5?var24:var5;
            } else {
               var10 = var18 + component.height * -1281443035;
               var22 = component.width * 334099177 + var14;
               var13 = var18 > var2?var18:var2;
               var19 = var14 > var3?var14:var3;
               var11 = var10 < var4?var10:var4;
               var20 = var22 < var5?var22:var5;
            }

            if(Client.aClass108_Sub17_2877 == component) {
               Client.aBool2885 = true;
               Client.anInt2915 = var18 * -365218459;
               Client.anInt2786 = var14 * -1947294979;
            }

            if(!component.aBool1855 || var13 < var11 && var19 < var20) {
               var10 = MouseInputHandler.mouseX * -367052265;
               var22 = MouseInputHandler.mouseY * 1533395117;
               if(0 != MouseInputHandler.clickType * 1629072957) {
                  var10 = MouseInputHandler.mousePressX * 472132205;
                  var22 = MouseInputHandler.mousePressY * 1498262827;
               }

               int yPos;
               int interactionMenuType;
               int xPos;
               if(component.anInt1886 * -917776085 == 1337) {
                  MouseInputHandler.method775(component, -16054773);
                  if(!Client.aBool2874 && !Client.actionMenuOpen && var10 >= var13 && var22 >= var19 && var10 < var11 && var22 < var20) {
                     if(Client.anInt2858 * -968945719 == 0 && !Client.aBool2881) {
                        Class4.method91(StringUtilities.WALK_HERE_OPTION, "", 23, 0, var10 - var13, var22 - var19, 2130786187);
                     }

                     var21 = -1;

                     for(var24 = 0; var24 < ModelRasterizer.anInt2490; ++var24) {
                        int menuHash = ModelRasterizer.anIntArray2495[var24];
                        xPos = menuHash & 127;
                        yPos = menuHash >> 7 & 127;
                        interactionMenuType = menuHash >> 29 & 3;
                        int interactableID = menuHash >> 14 & 32767;
                        if(var21 != menuHash) {
                           var21 = menuHash;
                           if(2 == interactionMenuType && Class56.gameScene.method431(VarpBit.plane * -570926309, xPos, yPos, menuHash) >= 0) {
                              ObjectDefinition objectDef = ObjectDefinition.getObjectDefForID(interactableID, (byte) 0);
                              if(null != objectDef.configChangeDest) {
                                 objectDef = objectDef.getDefinitionForStatus((byte)-49);
                              }

                              if(objectDef == null) {
                                 continue;
                              }

                              if(1 == Client.anInt2858 * -968945719) {
                                 Class4.method91(StringUtilities.USE_OPTION, Client.aString2859 + " " + Class47.aString668 + " " + HuffmanEncoding.method690('\uffff', -801617009) + objectDef.name, 1, menuHash, xPos, yPos, 1819037691);
                              } else if(Client.aBool2881) {
                                 if((Class68.anInt902 * 401025055 & 4) == 4) {
                                    Class4.method91(Client.aString2941, Client.aString2819 + " " + Class47.aString668 + " " + HuffmanEncoding.method690('\uffff', -1359989676) + objectDef.name, 2, menuHash, xPos, yPos, 2083916982);
                                 }
                              } else {
                                 String[] objectActions = objectDef.actions;
                                 if(Client.aBool2744) {
                                    objectActions = Class23.method341(objectActions, 1967870701);
                                 }

                                 if(null != objectActions) {
                                    for(int actionIndex = 4; actionIndex >= 0; --actionIndex) {
                                       if(objectActions[actionIndex] != null) {
                                          short var27 = 0;
                                          if(0 == actionIndex) {
                                             var27 = 3;
                                          }

                                          if(actionIndex == 1) {
                                             var27 = 4;
                                          }

                                          if(2 == actionIndex) {
                                             var27 = 5;
                                          }

                                          if(3 == actionIndex) {
                                             var27 = 6;
                                          }

                                          if(actionIndex == 4) {
                                             var27 = 1001;
                                          }

                                          Class4.method91(objectActions[actionIndex], HuffmanEncoding.method690('\uffff', -578789583) + objectDef.name, var27, menuHash, xPos, yPos, 1961006795);
                                       }
                                    }
                                 }

                                 Class4.method91(StringUtilities.EXAMINE_OPTION, HuffmanEncoding.method690('\uffff', -1833201687) + objectDef.name, 1002, objectDef.objectID * 1809503247 << 14, xPos, yPos, 1898491160);
                              }
                           }

                           int entityIndex;
                           NPC var43;
                           Player var44;
                           if(interactionMenuType == 1) {
                              NPC npc = Client.localNPCs[interactableID];
                              if(null == npc) {
                                 continue;
                              }

                              if(1 == npc.definition.tileSpacesOccupied * -87058581 && (npc.anInt2394 * 171470795 & 127) == 64 && 64 == (npc.anInt2339 * 826764905 & 127)) {
                                 for(entityIndex = 0; entityIndex < Client.anInt2749 * -1829405175; ++entityIndex) {
                                    var43 = Client.localNPCs[Client.npcIndices[entityIndex]];
                                    if(var43 != null && var43 != npc && var43.definition.tileSpacesOccupied * -87058581 == 1 && var43.anInt2394 * 171470795 == npc.anInt2394 * 171470795 && npc.anInt2339 * 826764905 == var43.anInt2339 * 826764905) {
                                       AnimatedGraphic.method2148(var43.definition, Client.npcIndices[entityIndex], xPos, yPos, -1405217342);
                                    }
                                 }

                                 for(entityIndex = 0; entityIndex < Client.numLocalPlayers * -43742683; ++entityIndex) {
                                    var44 = Client.localPlayers[Client.playerIndices[entityIndex]];
                                    if(var44 != null && npc.anInt2394 * 171470795 == var44.anInt2394 * 171470795 && var44.anInt2339 * 826764905 == npc.anInt2339 * 826764905) {
                                       Friend.method659(var44, Client.playerIndices[entityIndex], xPos, yPos, (short)15725);
                                    }
                                 }
                              }

                              AnimatedGraphic.method2148(npc.definition, interactableID, xPos, yPos, 430491862);
                           }

                           if(interactionMenuType == 0) {
                              Player player = Client.localPlayers[interactableID];
                              if(player == null) {
                                 continue;
                              }

                              if((player.anInt2394 * 171470795 & 127) == 64 && 64 == (player.anInt2339 * 826764905 & 127)) {
                                 for(entityIndex = 0; entityIndex < Client.anInt2749 * -1829405175; ++entityIndex) {
                                    var43 = Client.localNPCs[Client.npcIndices[entityIndex]];
                                    if(null != var43 && 1 == var43.definition.tileSpacesOccupied * -87058581 && player.anInt2394 * 171470795 == var43.anInt2394 * 171470795 && var43.anInt2339 * 826764905 == player.anInt2339 * 826764905) {
                                       AnimatedGraphic.method2148(var43.definition, Client.npcIndices[entityIndex], xPos, yPos, 88805031);
                                    }
                                 }

                                 for(entityIndex = 0; entityIndex < Client.numLocalPlayers * -43742683; ++entityIndex) {
                                    var44 = Client.localPlayers[Client.playerIndices[entityIndex]];
                                    if(var44 != null && var44 != player && player.anInt2394 * 171470795 == var44.anInt2394 * 171470795 && player.anInt2339 * 826764905 == var44.anInt2339 * 826764905) {
                                       Friend.method659(var44, Client.playerIndices[entityIndex], xPos, yPos, (short)5524);
                                    }
                                 }
                              }

                              Friend.method659(player, interactableID, xPos, yPos, (short)-13374);
                           }

                           if(3 == interactionMenuType) {
                              Deque groundItems = Client.groundItemArray[VarpBit.plane * -570926309][xPos][yPos];
                              if(null != groundItems) {
                                 for(Item item = (Item)groundItems.method1332(); null != item; item = (Item)groundItems.method1342()) {
                                    ItemDefinition itemDef = ItemDefinition.getItemDefinition(item.itemID * -1672318173, -873033053);
                                    if(1 == Client.anInt2858 * -968945719) {
                                       Class4.method91(StringUtilities.USE_OPTION, Client.aString2859 + " " + Class47.aString668 + " " + HuffmanEncoding.method690(16748608, -1615976121) + itemDef.name, 16, item.itemID * -1672318173, xPos, yPos, 1998508462);
                                    } else if(Client.aBool2881) {
                                       if((Class68.anInt902 * 401025055 & 1) == 1) {
                                          Class4.method91(Client.aString2941, Client.aString2819 + " " + Class47.aString668 + " " + HuffmanEncoding.method690(16748608, -1065088866) + itemDef.name, 17, item.itemID * -1672318173, xPos, yPos, 1897480675);
                                       }
                                    } else {
                                       String[] itemActions = itemDef.options; // this is ground item options -- different than interface options
                                       if(Client.aBool2744) {
                                          itemActions = Class23.method341(itemActions, -1102727925);
                                       }

                                       for(int actionIndex = 4; actionIndex >= 0; --actionIndex) {
                                          if(null != itemActions && null != itemActions[actionIndex]) {
                                             byte actionIdentifier = 0;
                                             if(0 == actionIndex) {
                                                actionIdentifier = 18;
                                             }

                                             if(actionIndex == 1) {
                                                actionIdentifier = 19;
                                             }

                                             if(2 == actionIndex) {
                                                actionIdentifier = 20;
                                             }

                                             if(3 == actionIndex) {
                                                actionIdentifier = 21;
                                             }

                                             if(actionIndex == 4) {
                                                actionIdentifier = 22;
                                             }

                                             Class4.method91(itemActions[actionIndex], HuffmanEncoding.method690(16748608, -1028803737) + itemDef.name, actionIdentifier, item.itemID * -1672318173, xPos, yPos, 2060114851);
                                          } else if(actionIndex == 2) {
                                             Class4.method91(StringUtilities.TAKE_OPTION, HuffmanEncoding.method690(16748608, -569315472) + itemDef.name, 20, item.itemID * -1672318173, xPos, yPos, 2093640735);
                                          }
                                       }

                                       Class4.method91(StringUtilities.EXAMINE_OPTION, HuffmanEncoding.method690(16748608, -435158535) + itemDef.name, 1004, item.itemID * -1672318173, xPos, yPos, 1816176229);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               } else if(1338 == component.anInt1886 * -917776085) {
                  GameObject.method2847(var18, var14, (byte)-120);
               } else {
                  if(!Client.actionMenuOpen && var10 >= var13 && var22 >= var19 && var10 < var11 && var22 < var20) {
                     GroundItem.method586(component, var10 - var18, var22 - var14, 1300959972);
                  }

                  if(0 == component.componentType * 942877543) {
                     if(!component.aBool1855 && RSInterface.isComponentHidden(component, (byte) 37) && Client.aClass108_Sub17_924 != component) {
                        continue;
                     }

                     buildRightClickMenu(components, component.interfaceHash * -1081473899, var13, var19, var11, var20, var18 - component.anInt1784 * -133270367, var14 - component.scrollPosition * -643576081, 66663869);
                     if(component.aClass108_Sub17Array1879 != null) {
                        buildRightClickMenu(component.aClass108_Sub17Array1879, component.interfaceHash * -1081473899, var13, var19, var11, var20, var18 - component.anInt1784 * -133270367, var14 - component.scrollPosition * -643576081, 121975215);
                     }

                     Class108_Sub10 var37 = (Class108_Sub10) Client.aClass101_2866.get((long) (component.interfaceHash * -1081473899));
                     if(var37 != null) {
                        if(var37.anInt1652 * 1197757387 == 0 && MouseInputHandler.mouseX * -367052265 >= var13 && MouseInputHandler.mouseY * 1533395117 >= var19 && MouseInputHandler.mouseX * -367052265 < var11 && MouseInputHandler.mouseY * 1533395117 < var20 && !Client.actionMenuOpen && !Client.aBool2875) {
                           Client.menuActionNamePrefix[0] = StringUtilities.CANCEL_OPTION;
                           Client.menuActionNames[0] = "";
                           Client.menuActionIdentifiers[0] = 1006;
                           Client.menuActionRow = -1954561849;
                        }

                        var24 = var37.anInt1653 * 1557246219;
                        if(RSInterface.loadInterface(var24, 1046680614)) {
                           buildRightClickMenu(RSInterface.interface_cache[var24], -1, var13, var19, var11, var20, var18, var14, -1200460421);
                        }
                     }
                  }

                  if(component.aBool1855) {
                     if(component.aBool1826 && MouseInputHandler.mouseX * -367052265 >= var13 && MouseInputHandler.mouseY * 1533395117 >= var19 && MouseInputHandler.mouseX * -367052265 < var11 && MouseInputHandler.mouseY * 1533395117 < var20) {
                        for(ClientScript var38 = (ClientScript) Client.aClass105_2737.getFront(); null != var38; var38 = (ClientScript) Client.aClass105_2737.getNext()) {
                           if(var38.aBool1636) {
                              var38.unlink();
                              var38.parentInterface.aBool1880 = false;
                           }
                        }

                        if(0 == Class9.anInt127 * 63141611) {
                           Client.aClass108_Sub17_2877 = null;
                           Client.aClass108_Sub17_2878 = null;
                        }

                        if(!Client.actionMenuOpen) {
                           Client.menuActionNamePrefix[0] = StringUtilities.CANCEL_OPTION;
                           Client.menuActionNames[0] = "";
                           Client.menuActionIdentifiers[0] = 1006;
                           Client.menuActionRow = -1954561849;
                        }
                     }

                     boolean var39;
                     if(MouseInputHandler.mouseX * -367052265 >= var13 && MouseInputHandler.mouseY * 1533395117 >= var19 && MouseInputHandler.mouseX * -367052265 < var11 && MouseInputHandler.mouseY * 1533395117 < var20) {
                        var39 = true;
                     } else {
                        var39 = false;
                     }

                     boolean var41 = false;
                     if((MouseInputHandler.anInt769 * 1251070677 == 1 || !Class100.aBool1391 && MouseInputHandler.anInt769 * 1251070677 == 4) && var39) {
                        var41 = true;
                     }

                     boolean var23 = false;
                     if((MouseInputHandler.clickType * 1629072957 == 1 || !Class100.aBool1391 && 4 == MouseInputHandler.clickType * 1629072957) && MouseInputHandler.mousePressX * 472132205 >= var13 && MouseInputHandler.mousePressY * 1498262827 >= var19 && MouseInputHandler.mousePressX * 472132205 < var11 && MouseInputHandler.mousePressY * 1498262827 < var20) {
                        var23 = true;
                     }

                     if(var23) {
                        RSPacketBuffer.method2598(component, MouseInputHandler.mousePressX * 472132205 - var18, MouseInputHandler.mousePressY * 1498262827 - var14, (byte)-25);
                     }

                     if(Client.aClass108_Sub17_2877 != null && component != Client.aClass108_Sub17_2877 && var39) {
                        yPos = Class32.method576(component, -1273096773);
                        boolean var16 = (yPos >> 20 & 1) != 0;
                        if(var16) {
                           Client.aClass108_Sub17_2818 = component;
                        }
                     }

                     if(component == Client.aClass108_Sub17_2878) {
                        Client.aBool2882 = true;
                        Client.anInt2883 = var18 * -1717185195;
                        Client.anInt2884 = var14 * -548669269;
                     }

                     if(component.hasScript) {
                        ClientScript script;
                        if(var39 && 0 != Client.mouseWheelRotation * 1785327937 && null != component.anObjectArray1859) {
                           script = new ClientScript();
                           script.aBool1636 = true;
                           script.parentInterface = component;
                           script.mouseY = Client.mouseWheelRotation * 1433290219;
                           script.parameters = component.anObjectArray1859;
                           Client.aClass105_2737.insertBack(script);
                        }

                        if(null != Client.aClass108_Sub17_2877 || null != IsaacRandomGen.aClass108_Sub17_745 || Client.actionMenuOpen) {
                           var23 = false;
                           var41 = false;
                           var39 = false;
                        }

                        if(!component.aBool1881 && var23) {
                           component.aBool1881 = true;
                           if(component.anObjectArray1794 != null) {
                              script = new ClientScript();
                              script.aBool1636 = true;
                              script.parentInterface = component;
                              script.mouseX = (MouseInputHandler.mousePressX * 472132205 - var18) * 710802815;
                              script.mouseY = (MouseInputHandler.mousePressY * 1498262827 - var14) * 1647493163;
                              script.parameters = component.anObjectArray1794;
                              Client.aClass105_2737.insertBack(script);
                           }
                        }

                        if(component.aBool1881 && var41 && null != component.anObjectArray1841) {
                           script = new ClientScript();
                           script.aBool1636 = true;
                           script.parentInterface = component;
                           script.mouseX = (MouseInputHandler.mouseX * -367052265 - var18) * 710802815;
                           script.mouseY = (MouseInputHandler.mouseY * 1533395117 - var14) * 1647493163;
                           script.parameters = component.anObjectArray1841;
                           Client.aClass105_2737.insertBack(script);
                        }

                        if(component.aBool1881 && !var41) {
                           component.aBool1881 = false;
                           if(null != component.anObjectArray1842) {
                              script = new ClientScript();
                              script.aBool1636 = true;
                              script.parentInterface = component;
                              script.mouseX = (MouseInputHandler.mouseX * -367052265 - var18) * 710802815;
                              script.mouseY = (MouseInputHandler.mouseY * 1533395117 - var14) * 1647493163;
                              script.parameters = component.anObjectArray1842;
                              Client.aClass105_2826.insertBack(script);
                           }
                        }

                        if(var41 && null != component.anObjectArray1843) {
                           script = new ClientScript();
                           script.aBool1636 = true;
                           script.parentInterface = component;
                           script.mouseX = (MouseInputHandler.mouseX * -367052265 - var18) * 710802815;
                           script.mouseY = (MouseInputHandler.mouseY * 1533395117 - var14) * 1647493163;
                           script.parameters = component.anObjectArray1843;
                           Client.aClass105_2737.insertBack(script);
                        }

                        if(!component.aBool1880 && var39) {
                           component.aBool1880 = true;
                           if(null != component.anObjectArray1802) {
                              script = new ClientScript();
                              script.aBool1636 = true;
                              script.parentInterface = component;
                              script.mouseX = (MouseInputHandler.mouseX * -367052265 - var18) * 710802815;
                              script.mouseY = (MouseInputHandler.mouseY * 1533395117 - var14) * 1647493163;
                              script.parameters = component.anObjectArray1802;
                              Client.aClass105_2737.insertBack(script);
                           }
                        }

                        if(component.aBool1880 && var39 && component.anObjectArray1845 != null) {
                           script = new ClientScript();
                           script.aBool1636 = true;
                           script.parentInterface = component;
                           script.mouseX = (MouseInputHandler.mouseX * -367052265 - var18) * 710802815;
                           script.mouseY = (MouseInputHandler.mouseY * 1533395117 - var14) * 1647493163;
                           script.parameters = component.anObjectArray1845;
                           Client.aClass105_2737.insertBack(script);
                        }

                        if(component.aBool1880 && !var39) {
                           component.aBool1880 = false;
                           if(component.anObjectArray1876 != null) {
                              script = new ClientScript();
                              script.aBool1636 = true;
                              script.parentInterface = component;
                              script.mouseX = (MouseInputHandler.mouseX * -367052265 - var18) * 710802815;
                              script.mouseY = (MouseInputHandler.mouseY * 1533395117 - var14) * 1647493163;
                              script.parameters = component.anObjectArray1876;
                              Client.aClass105_2826.insertBack(script);
                           }
                        }

                        if(null != component.anObjectArray1857) {
                           script = new ClientScript();
                           script.parentInterface = component;
                           script.parameters = component.anObjectArray1857;
                           Client.aClass105_2904.insertBack(script);
                        }

                        ClientScript triggeredScript;
                        if(null != component.onConfigTrigger && Client.configTriggerPointer * -1993002369 > component.anInt1883 * 1497253753) {
                           if(component.configChangeTriggers != null && Client.configTriggerPointer * -1993002369 - component.anInt1883 * 1497253753 <= 32) {
                              label960:
                              for(xPos = component.anInt1883 * 1497253753; xPos < Client.configTriggerPointer * -1993002369; ++xPos) {
                                 yPos = Client.configChangeTrigger[xPos & 31];

                                 for(interactionMenuType = 0; interactionMenuType < component.configChangeTriggers.length; ++interactionMenuType) {
                                    if(yPos == component.configChangeTriggers[interactionMenuType]) {
                                       triggeredScript = new ClientScript();
                                       triggeredScript.parentInterface = component;
                                       triggeredScript.parameters = component.onConfigTrigger;
                                       Client.aClass105_2737.insertBack(triggeredScript);
                                       break label960;
                                    }
                                 }
                              }
                           } else {
                              script = new ClientScript();
                              script.parentInterface = component;
                              script.parameters = component.onConfigTrigger;
                              Client.aClass105_2737.insertBack(script);
                           }

                           component.anInt1883 = Client.configTriggerPointer * 1296774071;
                        }

                        if(null != component.onItemUpdateTrigger && Client.itemUpdateTriggerIndex * -600491817 > component.anInt1819 * -536287581) {
                           if(component.itemUpdateTriggers != null && Client.itemUpdateTriggerIndex * -600491817 - component.anInt1819 * -536287581 <= 32) {
                              label941:
                              for(xPos = component.anInt1819 * -536287581; xPos < Client.itemUpdateTriggerIndex * -600491817; ++xPos) {
                                 yPos = Client.widgetItemUpdateTrigger[xPos & 31];

                                 for(int triggerIndex = 0; triggerIndex < component.itemUpdateTriggers.length; ++triggerIndex) {
                                    if(component.itemUpdateTriggers[triggerIndex] == yPos) {
                                       triggeredScript = new ClientScript();
                                       triggeredScript.parentInterface = component;
                                       triggeredScript.parameters = component.onItemUpdateTrigger;
                                       Client.aClass105_2737.insertBack(triggeredScript);
                                       break label941;
                                    }
                                 }
                              }
                           } else {
                              script = new ClientScript();
                              script.parentInterface = component;
                              script.parameters = component.onItemUpdateTrigger;
                              Client.aClass105_2737.insertBack(script);
                           }

                           component.anInt1819 = Client.itemUpdateTriggerIndex * -1809257411;
                        }

                        if(component.onSkillUpdateTrigger != null && Client.skillChangeIndex * 642606709 > component.anInt1885 * 652770205) {
                           if(component.anIntArray1856 != null && Client.skillChangeIndex * 642606709 - component.anInt1885 * 652770205 <= 32) {
                              label922:
                              for(xPos = component.anInt1885 * 652770205; xPos < Client.skillChangeIndex * 642606709; ++xPos) {
                                 yPos = Client.skillChangedTrigger[xPos & 31];

                                 for(interactionMenuType = 0; interactionMenuType < component.anIntArray1856.length; ++interactionMenuType) {
                                    if(yPos == component.anIntArray1856[interactionMenuType]) {
                                       triggeredScript = new ClientScript();
                                       triggeredScript.parentInterface = component;
                                       triggeredScript.parameters = component.onSkillUpdateTrigger;
                                       Client.aClass105_2737.insertBack(triggeredScript);
                                       break label922;
                                    }
                                 }
                              }
                           } else {
                              script = new ClientScript();
                              script.parentInterface = component;
                              script.parameters = component.onSkillUpdateTrigger;
                              Client.aClass105_2737.insertBack(script);
                           }

                           component.anInt1885 = Client.skillChangeIndex * 95206073;
                        }

                        if(Client.anInt2896 * 22211103 > component.anInt1774 * -340558461 && component.anObjectArray1781 != null) {
                           script = new ClientScript();
                           script.parentInterface = component;
                           script.parameters = component.anObjectArray1781;
                           Client.aClass105_2737.insertBack(script);
                        }

                        if(Client.anInt2897 * -802715899 > component.anInt1774 * -340558461 && component.anObjectArray1822 != null) {
                           script = new ClientScript();
                           script.parentInterface = component;
                           script.parameters = component.anObjectArray1822;
                           Client.aClass105_2737.insertBack(script);
                        }

                        if(Client.anInt2898 * 1663446661 > component.anInt1774 * -340558461 && component.anObjectArray1814 != null) {
                           script = new ClientScript();
                           script.parentInterface = component;
                           script.parameters = component.anObjectArray1814;
                           Client.aClass105_2737.insertBack(script);
                        }

                        if(Client.anInt2899 * -96190949 > component.anInt1774 * -340558461 && component.anObjectArray1864 != null) {
                           script = new ClientScript();
                           script.parentInterface = component;
                           script.parameters = component.anObjectArray1864;
                           Client.aClass105_2737.insertBack(script);
                        }

                        component.anInt1774 = Client.anInt2731 * 910326145;
                        if(component.anObjectArray1789 != null) {
                           for(xPos = 0; xPos < Client.anInt2862 * 284994951; ++xPos) {
                              ClientScript var34 = new ClientScript();
                              var34.parentInterface = component;
                              var34.keyCode = Client.anIntArray2924[xPos] * 1438971565;
                              var34.keyChar = Client.anIntArray2923[xPos] * -404562885;
                              var34.parameters = component.anObjectArray1789;
                              Client.aClass105_2737.insertBack(var34);
                           }
                        }
                     }
                  }

                  if(!component.aBool1855 && null == Client.aClass108_Sub17_2877 && IsaacRandomGen.aClass108_Sub17_745 == null && !Client.actionMenuOpen) {
                     if((component.anInt1846 * 1461842043 >= 0 || component.mouseOverColor * 256440005 != 0) && MouseInputHandler.mouseX * -367052265 >= var13 && MouseInputHandler.mouseY * 1533395117 >= var19 && MouseInputHandler.mouseX * -367052265 < var11 && MouseInputHandler.mouseY * 1533395117 < var20) {
                        if(component.anInt1846 * 1461842043 >= 0) {
                           Client.aClass108_Sub17_924 = components[component.anInt1846 * 1461842043];
                        } else {
                           Client.aClass108_Sub17_924 = component;
                        }
                     }

                     if(8 == component.componentType * 942877543 && MouseInputHandler.mouseX * -367052265 >= var13 && MouseInputHandler.mouseY * 1533395117 >= var19 && MouseInputHandler.mouseX * -367052265 < var11 && MouseInputHandler.mouseY * 1533395117 < var20) {
                        NPCDefinition.aClass108_Sub17_2193 = component;
                     }

                     if(component.anInt1787 * -1108406155 > component.width * 334099177) {
                        Class43.method654(component, component.height * -1281443035 + var18, var14, component.width * 334099177, component.anInt1787 * -1108406155, MouseInputHandler.mouseX * -367052265, MouseInputHandler.mouseY * 1533395117, (short)-22019);
                     }
                  }
               }
            }
         }
      }

   }

   static void method398(World[] var0, int var1, int var2, int[] var3, int[] var4, int var5) {
      if(var1 < var2) {
         int var6 = var1 - 1;
         int var12 = var2 + 1;
         int var7 = (var1 + var2) / 2;
         World var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while(var6 < var12) {
            boolean var13 = true;

            int var9;
            int var10;
            int var11;
            do {
               --var12;

               for(var9 = 0; var9 < 4; ++var9) {
                  if(2 == var3[var9]) {
                     var10 = var0[var12].worldID * 126310169;
                     var11 = var8.worldID * 126310169;
                  } else if(var3[var9] == 1) {
                     var10 = var0[var12].playerCount * 649230499;
                     var11 = var8.playerCount * 649230499;
                     if(var10 == -1 && 1 == var4[var9]) {
                        var10 = 2001;
                     }

                     if(-1 == var11 && var4[var9] == 1) {
                        var11 = 2001;
                     }
                  } else if(3 == var3[var9]) {
                     var10 = var0[var12].method639(-878955736)?1:0;
                     var11 = var8.method639(-298323642)?1:0;
                  } else {
                     var10 = var0[var12].anInt569 * -1443760287;
                     var11 = var8.anInt569 * -1443760287;
                  }

                  if(var10 != var11) {
                     if((1 != var4[var9] || var10 <= var11) && (0 != var4[var9] || var10 >= var11)) {
                        var13 = false;
                     }
                     break;
                  }

                  if(3 == var9) {
                     var13 = false;
                  }
               }
            } while(var13);

            var13 = true;

            do {
               ++var6;

               for(var9 = 0; var9 < 4; ++var9) {
                  if(var3[var9] == 2) {
                     var10 = var0[var6].worldID * 126310169;
                     var11 = var8.worldID * 126310169;
                  } else if(var3[var9] == 1) {
                     var10 = var0[var6].playerCount * 649230499;
                     var11 = var8.playerCount * 649230499;
                     if(var10 == -1 && 1 == var4[var9]) {
                        var10 = 2001;
                     }

                     if(var11 == -1 && var4[var9] == 1) {
                        var11 = 2001;
                     }
                  } else if(var3[var9] == 3) {
                     var10 = var0[var6].method639(-566535666)?1:0;
                     var11 = var8.method639(-998955082)?1:0;
                  } else {
                     var10 = var0[var6].anInt569 * -1443760287;
                     var11 = var8.anInt569 * -1443760287;
                  }

                  if(var11 != var10) {
                     if((var4[var9] != 1 || var10 >= var11) && (var4[var9] != 0 || var10 <= var11)) {
                        var13 = false;
                     }
                     break;
                  }

                  if(3 == var9) {
                     var13 = false;
                  }
               }
            } while(var13);

            if(var6 < var12) {
               World var14 = var0[var6];
               var0[var6] = var0[var12];
               var0[var12] = var14;
            }
         }

         method398(var0, var1, var12, var3, var4, 2073525606);
         method398(var0, 1 + var12, var2, var3, var4, 2097256084);
      }
   }

   public static void method399(AbstractIndex var0, byte var1) {
      VarpBit.aClass74_1951 = var0;
   }

   static boolean isOnIgnore(String rawUsername, int var1) {
      if(null == rawUsername) {
         return false;
      } else {
         String decodedUsername = Class108_Sub10.method1683(rawUsername, UnderlayDefinition.aClass116_2142, -1906056421);

         for(int var4 = 0; var4 < Client.ignoreListCount * -1283681697; ++var4) {
            Ignore ignore = Client.ignoreList[var4];
            if(decodedUsername.equalsIgnoreCase(Class108_Sub10.method1683(ignore.username, UnderlayDefinition.aClass116_2142, -1974944439))) {
               return true;
            }

            if(decodedUsername.equalsIgnoreCase(Class108_Sub10.method1683(ignore.displayName, UnderlayDefinition.aClass116_2142, -1976347131))) {
               return true;
            }
         }

         return false;
      }
   }

   static final void addToIgnoreList(String toAdd, boolean var1, int var2) {
      if(null != toAdd) {
         if((Client.ignoreListCount * -1283681697 < 100 || Client.anInt2758 * -1950682749 == 1) && Client.ignoreListCount * -1283681697 < 400) {
            String var4 = Class108_Sub10.method1683(toAdd, UnderlayDefinition.aClass116_2142, -2116168234);
            if(var4 != null) {
               String var3;
               int var5;
               String var6;
               for(var5 = 0; var5 < Client.ignoreListCount * -1283681697; ++var5) {
                  Ignore ignore = Client.ignoreList[var5];
                  var6 = Class108_Sub10.method1683(ignore.username, UnderlayDefinition.aClass116_2142, -2090939739);
                  if(var6 != null && var6.equals(var4)) {
                     ChatMessagesContainer.pushMessage(31, "", toAdd + StringUtilities.ALREADY_ON_IGNORE, -448196024);
                     return;
                  }

                  if(ignore.displayName != null) {
                     var3 = Class108_Sub10.method1683(ignore.displayName, UnderlayDefinition.aClass116_2142, -1955095237);
                     if(null != var3 && var3.equals(var4)) {
                        ChatMessagesContainer.pushMessage(31, "", toAdd + StringUtilities.ALREADY_ON_IGNORE, 7202132);
                        return;
                     }
                  }
               }

               for(var5 = 0; var5 < Client.friendListCount * -163737695; ++var5) {
                  Friend friend = Client.friendList[var5];
                  var6 = Class108_Sub10.method1683(friend.username, UnderlayDefinition.aClass116_2142, -2065261776);
                  if(null != var6 && var6.equals(var4)) {
                     ChatMessagesContainer.pushMessage(31, "", StringUtilities.PLEASE_REMOVE_2 + toAdd + StringUtilities.aString1124, 123811380);
                     return;
                  }

                  if(null != friend.displayName) {
                     var3 = Class108_Sub10.method1683(friend.displayName, UnderlayDefinition.aClass116_2142, -1855974988);
                     if(null != var3 && var3.equals(var4)) {
                        ChatMessagesContainer.pushMessage(31, "", StringUtilities.PLEASE_REMOVE_2 + toAdd + StringUtilities.aString1124, -855994111);
                        return;
                     }
                  }
               }

               if(Class108_Sub10.method1683(Player.myPlayer.playerName, UnderlayDefinition.aClass116_2142, -1968874516).equals(var4)) {
                  ChatMessagesContainer.pushMessage(31, "", StringUtilities.aString1105, -1446835517);
               } else {
                  Client.secureBuffer.writePacket(222);
                  Client.secureBuffer.writeByte(StringUtilities.getStringLengthPlusOne(toAdd));
                  Client.secureBuffer.writeString(toAdd);
               }
            }
         } else {
            ChatMessagesContainer.pushMessage(31, "", StringUtilities.aString1063, 300930071);
         }
      }
   }
}
