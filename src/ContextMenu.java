/**
 * Created by Allen Kinzalow on 1/23/2015.
 */
public class ContextMenu {


    static int contextMenuX;
    static int contextMenuWidth;
    static int contextMenuHeight;
    static int contextMenuY;
    static int contextMenuRow = 0;
    static boolean contextMenuOpen = false;
    static int[] contextMenuXInteractions = new int[500];
    static int[] contextMenuYInteractions = new int[500];
    static String[] contextMenuActionNames = new String[500];
    static String[] contextMenuActionPrefixes = new String[500];
    static int[] contextMenuParameters = new int[500];
    static int[] contextMenuIdentifiers = new int[500];

    static final void buildContextMenu(RSInterface[] components, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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
                   if(!Client.aBool2874 && !contextMenuOpen && var10 >= var13 && var22 >= var19 && var10 < var11 && var22 < var20) {
                      if(Client.anInt2858 * -968945719 == 0 && !Client.aBool2881) {
                         setContextMenuRow(StringUtilities.WALK_HERE_OPTION, "", 23, 0, var10 - var13, var22 - var19, 2130786187);
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
                            if(2 == interactionMenuType && Scene.gameScene.method431(VarpBit.plane * -570926309, xPos, yPos, menuHash) >= 0) {
                               ObjectDefinition objectDef = ObjectDefinition.getObjectDefForID(interactableID, (byte) 0);
                               if(null != objectDef.configChangeDest) {
                                  objectDef = objectDef.getDefinitionForStatus((byte)-49);
                               }

                               if(objectDef == null) {
                                  continue;
                               }

                               if(1 == Client.anInt2858 * -968945719) {
                                  setContextMenuRow(StringUtilities.USE_OPTION, Client.aString2859 + " " + Class47.aString668 + " " + HuffmanEncoding.method690('\uffff', -801617009) + objectDef.name, 1, menuHash, xPos, yPos, 1819037691);
                               } else if(Client.aBool2881) {
                                  if((Class68.anInt902 * 401025055 & 4) == 4) {
                                     setContextMenuRow(Client.aString2941, Client.aString2819 + " " + Class47.aString668 + " " + HuffmanEncoding.method690('\uffff', -1359989676) + objectDef.name, 2, menuHash, xPos, yPos, 2083916982);
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

                                           setContextMenuRow(objectActions[actionIndex], HuffmanEncoding.method690('\uffff', -578789583) + objectDef.name, var27, menuHash, xPos, yPos, 1961006795);
                                        }
                                     }
                                  }

                                  setContextMenuRow(StringUtilities.EXAMINE_OPTION, HuffmanEncoding.method690('\uffff', -1833201687) + objectDef.name, 1002, objectDef.objectID * 1809503247 << 14, xPos, yPos, 1898491160);
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
                                        setContextMenuRow(StringUtilities.USE_OPTION, Client.aString2859 + " " + Class47.aString668 + " " + HuffmanEncoding.method690(16748608, -1615976121) + itemDef.name, 16, item.itemID * -1672318173, xPos, yPos, 1998508462);
                                     } else if(Client.aBool2881) {
                                        if((Class68.anInt902 * 401025055 & 1) == 1) {
                                           setContextMenuRow(Client.aString2941, Client.aString2819 + " " + Class47.aString668 + " " + HuffmanEncoding.method690(16748608, -1065088866) + itemDef.name, 17, item.itemID * -1672318173, xPos, yPos, 1897480675);
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

                                              setContextMenuRow(itemActions[actionIndex], HuffmanEncoding.method690(16748608, -1028803737) + itemDef.name, actionIdentifier, item.itemID * -1672318173, xPos, yPos, 2060114851);
                                           } else if(actionIndex == 2) {
                                              setContextMenuRow(StringUtilities.TAKE_OPTION, HuffmanEncoding.method690(16748608, -569315472) + itemDef.name, 20, item.itemID * -1672318173, xPos, yPos, 2093640735);
                                           }
                                        }

                                        setContextMenuRow(StringUtilities.EXAMINE_OPTION, HuffmanEncoding.method690(16748608, -435158535) + itemDef.name, 1004, item.itemID * -1672318173, xPos, yPos, 1816176229);
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
                   if(!contextMenuOpen && var10 >= var13 && var22 >= var19 && var10 < var11 && var22 < var20) {
                      GroundItem.method586(component, var10 - var18, var22 - var14, 1300959972);
                   }

                   if(0 == component.componentType * 942877543) {
                      if(!component.aBool1855 && RSInterface.isComponentHidden(component, (byte) 37) && Client.aClass108_Sub17_924 != component) {
                         continue;
                      }

                      buildContextMenu(components, component.interfaceHash * -1081473899, var13, var19, var11, var20, var18 - component.anInt1784 * -133270367, var14 - component.scrollPosition * -643576081, 66663869);
                      if(component.aClass108_Sub17Array1879 != null) {
                         buildContextMenu(component.aClass108_Sub17Array1879, component.interfaceHash * -1081473899, var13, var19, var11, var20, var18 - component.anInt1784 * -133270367, var14 - component.scrollPosition * -643576081, 121975215);
                      }

                      Class108_Sub10 var37 = (Class108_Sub10) Client.aClass101_2866.get((long) (component.interfaceHash * -1081473899));
                      if(var37 != null) {
                         if(var37.anInt1652 * 1197757387 == 0 && MouseInputHandler.mouseX * -367052265 >= var13 && MouseInputHandler.mouseY * 1533395117 >= var19 && MouseInputHandler.mouseX * -367052265 < var11 && MouseInputHandler.mouseY * 1533395117 < var20 && !contextMenuOpen && !Client.aBool2875) {
                            contextMenuActionPrefixes[0] = StringUtilities.CANCEL_OPTION;
                            contextMenuActionNames[0] = "";
                            contextMenuIdentifiers[0] = 1006;
                            contextMenuRow = -1954561849;
                         }

                         var24 = var37.anInt1653 * 1557246219;
                         if(RSInterface.loadInterface(var24, 1046680614)) {
                            buildContextMenu(RSInterface.interface_cache[var24], -1, var13, var19, var11, var20, var18, var14, -1200460421);
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

                         if(!contextMenuOpen) {
                            contextMenuActionPrefixes[0] = StringUtilities.CANCEL_OPTION;
                            contextMenuActionNames[0] = "";
                            contextMenuIdentifiers[0] = 1006;
                            contextMenuRow = -1954561849;
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

                         if(null != Client.aClass108_Sub17_2877 || null != IsaacRandomGen.aClass108_Sub17_745 || contextMenuOpen) {
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

                   if(!component.aBool1855 && null == Client.aClass108_Sub17_2877 && IsaacRandomGen.aClass108_Sub17_745 == null && !contextMenuOpen) {
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

    static final void shiftContextMenuActions() {
       boolean finished = false;

       while(!finished) {
          finished = true;

          for(int menuActionID = 0; menuActionID < contextMenuRow * 391839991 - 1; ++menuActionID) {
             if(contextMenuIdentifiers[menuActionID] < 1000 && contextMenuIdentifiers[menuActionID + 1] > 1000) {
                String menuName = contextMenuActionNames[menuActionID];
                contextMenuActionNames[menuActionID] = contextMenuActionNames[1 + menuActionID];
                contextMenuActionNames[menuActionID + 1] = menuName;
                String menuNamePrefix = contextMenuActionPrefixes[menuActionID];
                contextMenuActionPrefixes[menuActionID] = contextMenuActionPrefixes[menuActionID + 1];
                contextMenuActionPrefixes[1 + menuActionID] = menuNamePrefix;
                int var3 = contextMenuIdentifiers[menuActionID];
                contextMenuIdentifiers[menuActionID] = contextMenuIdentifiers[1 + menuActionID];
                contextMenuIdentifiers[menuActionID + 1] = var3;
                int menuXInteraction = contextMenuXInteractions[menuActionID];
                contextMenuXInteractions[menuActionID] = contextMenuXInteractions[menuActionID + 1];
                contextMenuXInteractions[menuActionID + 1] = menuXInteraction;
                int menuYInteraction = contextMenuYInteractions[menuActionID];
                contextMenuYInteractions[menuActionID] = contextMenuYInteractions[1 + menuActionID];
                contextMenuYInteractions[menuActionID + 1] = menuYInteraction;
                int menuParam = contextMenuParameters[menuActionID];
                contextMenuParameters[menuActionID] = contextMenuParameters[1 + menuActionID];
                contextMenuParameters[1 + menuActionID] = menuParam;
                finished = false;
             }
          }
       }

    }

    static final void renderContextMenu(byte var0) {
       int xPos = contextMenuX * -745630459;
       int yPos = contextMenuY * -740301953;
       int width = contextMenuWidth * 1703965243;
       int height = contextMenuHeight * 720768655;
       int chooseColor = 6116423;
       Rasterizer2D.drawFilledRectangle(xPos, yPos, width, height, chooseColor);
       Rasterizer2D.drawFilledRectangle(1 + xPos, 1 + yPos, width - 2, 16, 0);
       Rasterizer2D.drawUnfilledRectangle(xPos + 1, yPos + 18, width - 2, height - 19, 0);
       RSTypeFace.b12_full_font.drawString(StringUtilities.CHOOSE_OPTION, 3 + xPos, yPos + 14, chooseColor, -1);
       int mouseX = MouseInputHandler.mouseX * -367052265;
       int mouseY = MouseInputHandler.mouseY * 1533395117;

       int color;
       int var10;
       int yOffset;
       for(var10 = 0; var10 < contextMenuRow * 391839991; ++var10) {
          yOffset = yPos + 31 + (contextMenuRow * 391839991 - 1 - var10) * 15;
          color = 16777215;
          if(mouseX > xPos && mouseX < xPos + width && mouseY > yOffset - 13 && mouseY < yOffset + 3) {
             color = 16776960;
          }

          RSFont b12_full = RSTypeFace.b12_full_font;
          String menuActionName;
          if(contextMenuActionNames[var10].length() > 0) {
             menuActionName = contextMenuActionPrefixes[var10] + StringUtilities.aString1109 + contextMenuActionNames[var10];
          } else {
             menuActionName = contextMenuActionPrefixes[var10];
          }

          b12_full.drawString(menuActionName, xPos + 3, yOffset, color, 0);
       }

       var10 = contextMenuX * -745630459;
       yOffset = contextMenuY * -740301953;
       color = contextMenuWidth * 1703965243;
       int var14 = contextMenuHeight * 720768655;

       for(int var13 = 0; var13 < Client.anInt2907 * -792079877; ++var13) {
          if(Client.anIntArray2912[var13] + Client.anIntArray2914[var13] > var10 && Client.anIntArray2912[var13] < color + var10 && Client.anIntArray2913[var13] + Client.anIntArray2905[var13] > yOffset && Client.anIntArray2913[var13] < var14 + yOffset) {
             Client.aBoolArray2910[var13] = true;
          }
       }

    }

    static void method3282(byte var0) {
       for(int var1 = 0; var1 < contextMenuRow * 391839991; ++var1) {
          int identifier = contextMenuIdentifiers[var1];
          boolean var4 = identifier == 57 || identifier == 58 || 1007 == identifier || identifier == 25 || 30 == identifier;
          if(var4) {
             if(var1 < contextMenuRow * 391839991 - 1) {
                for(int var2 = var1; var2 < contextMenuRow * 391839991 - 1; ++var2) {
                   contextMenuActionPrefixes[var2] = contextMenuActionPrefixes[var2 + 1];
                   contextMenuActionNames[var2] = contextMenuActionNames[var2 + 1];
                   contextMenuIdentifiers[var2] = contextMenuIdentifiers[var2 + 1];
                   contextMenuParameters[var2] = contextMenuParameters[1 + var2];
                   contextMenuXInteractions[var2] = contextMenuXInteractions[1 + var2];
                   contextMenuYInteractions[var2] = contextMenuYInteractions[1 + var2];
                }
             }

             contextMenuRow += 1954561849;
          }
       }

    }

    static final void setMenuPosAndDimmension(int x, int y, byte var2) {
       int maxWidth = RSTypeFace.b12_full_font.getTextWidth(StringUtilities.CHOOSE_OPTION);

       int menuActionIndex;
       for(menuActionIndex = 0; menuActionIndex < contextMenuRow * 391839991; ++menuActionIndex) {
          RSFont b12_full = RSTypeFace.b12_full_font;
          String menuAction;
          if(contextMenuActionNames[menuActionIndex].length() > 0) {
             menuAction = contextMenuActionPrefixes[menuActionIndex] + StringUtilities.aString1109 + contextMenuActionNames[menuActionIndex];
          } else {
             menuAction = contextMenuActionPrefixes[menuActionIndex];
          }

          int menuActionWidth = b12_full.getTextWidth(menuAction);
          if(menuActionWidth > maxWidth) {
             maxWidth = menuActionWidth;
          }
       }

       maxWidth += 8;
       int height = contextMenuRow * 1582632569 + 21;
       int xPos = x - maxWidth / 2;
       if(xPos + maxWidth > 765) {
          xPos = 765 - maxWidth;
       }

       if(xPos < 0) {
          xPos = 0;
       }

       int yPos = y;
       if(height + y > 503) {
          yPos = 503 - height;
       }

       if(yPos < 0) {
          yPos = 0;
       }

       contextMenuOpen = true;
       contextMenuX = xPos * -1856507955;
       contextMenuY = yPos * 1712577663;
       contextMenuWidth = maxWidth * 311400179;
       contextMenuHeight = contextMenuRow * 1309415031 - 1473975926;
    }

    static void processContextMenuClick(int var0, byte var1) {
       if(var0 >= 0) {
          int var7 = contextMenuXInteractions[var0];
          int var3 = contextMenuYInteractions[var0];
          int var4 = contextMenuIdentifiers[var0];
          int var5 = contextMenuParameters[var0];
          String var6 = contextMenuActionPrefixes[var0];
          String var2 = contextMenuActionNames[var0];
          MouseCapturer.processClickAction(var7, var3, var4, var5, var6, var2, MouseInputHandler.mousePressX * 472132205, MouseInputHandler.mousePressY * 1498262827, 1721706574);
       }
    }

    static final void setContextMenuRow(String prefix, String var1, int menuActionIdentifier, int actionParameter, int x, int y, int var6) {
       if(!contextMenuOpen) {
          if(contextMenuRow * 391839991 < 500) {
             contextMenuActionPrefixes[contextMenuRow * 391839991] = prefix;
             contextMenuActionNames[contextMenuRow * 391839991] = var1;
             contextMenuIdentifiers[contextMenuRow * 391839991] = menuActionIdentifier;
             contextMenuParameters[contextMenuRow * 391839991] = actionParameter;
             contextMenuXInteractions[contextMenuRow * 391839991] = x;
             contextMenuYInteractions[contextMenuRow * 391839991] = y;
             contextMenuRow -= 1954561849;
          }
       }
    }

    static void setLastContextMenuRow(int var0, int var1) {
       Class108_Sub21.aContextMenuRow_1895 = new ContextMenuRow();
       Class108_Sub21.aContextMenuRow_1895.menuXInteraction = contextMenuXInteractions[var0] * -1420368315;
       Class108_Sub21.aContextMenuRow_1895.menuYInteraction = contextMenuYInteractions[var0] * 2071188001;
       Class108_Sub21.aContextMenuRow_1895.menuIdentifier = contextMenuIdentifiers[var0] * -794819855;
       Class108_Sub21.aContextMenuRow_1895.menuParameters = contextMenuParameters[var0] * -62510915;
       Class108_Sub21.aContextMenuRow_1895.menuActionPrefixes = contextMenuActionPrefixes[var0];
    }
}
