public class ClientScriptDefinition extends CacheableNode {

	int anInt2269;
	int[] instructions;
	int[] intOperands;
	String[] aStringArray2272;
	static byte[][] objectData;
	int localStringCount;
	int anInt2276;
	static CacheableNodeMap clientScriptMap = new CacheableNodeMap(128);
	public static int anInt2281;
	int localIntCount;


	static final void method2566(RSByteBuffer buffer, int plane, int localX, int localY, int var4, int var5, int rotation, byte var7) {
		int opcode;
		if (localX >= 0 && localX < 104 && localY >= 0 && localY < 104) {
			RegionReference.mapTileSettings[plane][localX][localY] = 0;

			while (true) {
				opcode = buffer.readUByte();
				if (0 == opcode) {
					if (0 == plane) { 
						int[] tileHeights = RegionReference.tileHeights[0][localX];
						int var10 = var4 + localX + 932731;
						int var13 = localY + 556238 + var5;
						int tileHeight = ClientScriptReference.method702('\ub135' + var10, 91923 + var13, 4, 1366946286) - 128 + (ClientScriptReference.method702(var10 + 10294, var13 + '\u93bd', 2, -435852071) - 128 >> 1) + (ClientScriptReference.method702(var10, var13, 1, 1719228151) - 128 >> 2);
						tileHeight = (int) ((double) tileHeight * 0.3D) + 35;
						if (tileHeight < 10) {
							tileHeight = 10; 
						} else if (tileHeight > 60) {
							tileHeight = 60;
						}

						tileHeights[localY] = -tileHeight * 8;
						return;
					}

					RegionReference.tileHeights[plane][localX][localY] = RegionReference.tileHeights[plane - 1][localX][localY] - 240;
					return;
				}

				if (1 == opcode) {
					int tileHeight = buffer.readUByte();
					if (tileHeight == 1) {
						tileHeight = 0;
					}

					if (plane == 0) {
						RegionReference.tileHeights[0][localX][localY] = -tileHeight * 8;
						return;
					}

					RegionReference.tileHeights[plane][localX][localY] = RegionReference.tileHeights[plane - 1][localX][localY] - tileHeight * 8;
					return;
				}

				if (opcode <= 49) {
					RegionReference.overlayFloorIds[plane][localX][localY] = buffer.readByte();
					RegionReference.overlayClippingPaths[plane][localX][localY] = (byte) ((opcode - 2) / 4);
					RegionReference.overlayRotations[plane][localX][localY] = (byte) (opcode - 2 + rotation & 3);
				} else if (opcode <= 81) {
					RegionReference.mapTileSettings[plane][localX][localY] = (byte) (opcode - 49);
				} else {
					GZIPDecompressor.underlayFloorIds[plane][localX][localY] = (byte) (opcode - 81);
				}
			}
		} else {
			while (true) {
				opcode = buffer.readUByte();
				if (0 == opcode) {
					return;
				}

				if (1 == opcode) {
					buffer.readUByte();
					return;
				}

				if (opcode <= 49) {
					buffer.readUByte();
				}
			}
		}
	}

	static final void renderInterfaceComponents(RSInterface[] components, int var1, int xRender, int yRender, int renderWidth, int renderHeight, int xOffset, int yOffset, int var8, int var9) {
		Rasterizer2D.setRasterizationRect(xRender, yRender, renderWidth, renderHeight);
		Rasterizer3D.method2970();

		for (int componentIndex = 0; componentIndex < components.length; ++componentIndex) {
			RSInterface component = components[componentIndex];
			if (null != component && (var1 == component.hoverPopup * -867206361 || var1 == -1412584499 && component == Client.aClass108_Sub17_2877)) {
				int var19;
				if (-1 == var8) {
					Client.anIntArray2912[Client.anInt2907 * -792079877] = component.xPosition * 985647797 + xOffset;
					Client.anIntArray2913[Client.anInt2907 * -792079877] = yOffset + component.yPosition * 1730176157;
					Client.anIntArray2914[Client.anInt2907 * -792079877] = component.height * -1281443035;
					Client.anIntArray2905[Client.anInt2907 * -792079877] = component.width * 334099177;
					var19 = (Client.anInt2907 += 1557434675) * -792079877 - 1;
				} else {
					var19 = var8;
				}

				component.anInt1780 = var19 * 1057491055;
				component.cycle = Client.cycle * 1800650659;
				if (!component.aBool1855 || !RSInterface.isComponentHidden(component, (byte) 82)) {
					int var21;
					if (component.anInt1886 * -917776085 > 0) {
						int mediaRenderType = component.anInt1886 * -917776085; // this is how the media is displayed
						if (324 == mediaRenderType) {
							if (-1 == Client.anInt2960 * 598950917) {
								Client.anInt2960 = component.anInt1870 * -1668832973;
								Client.anInt2961 = component.anInt1796 * 227063943;
							}

							if (Client.aClass93_2926.isFemale) {
								component.anInt1870 = Client.anInt2960 * 2056077819;
							} else {
								component.anInt1870 = Client.anInt2961 * -1353870173;
							}
						} else if (325 == mediaRenderType) {
							if (-1 == Client.anInt2960 * 598950917) {
								Client.anInt2960 = component.anInt1870 * -1668832973;
								Client.anInt2961 = component.anInt1796 * 227063943;
							}

							if (Client.aClass93_2926.isFemale) {
								component.anInt1870 = Client.anInt2961 * -1353870173;
							} else {
								component.anInt1870 = Client.anInt2960 * 2056077819;
							}
						} else if (mediaRenderType == 327) {
							component.mediaRotationX = -771359726;
							component.mediaRotationY = ((int) (Math.sin((double) (Client.cycle * -637317861) / 40.0D) * 256.0D) & 2047) * 40361315;
							component.mediaType = -763981079;
							component.mediaID = 0;
						} else if (mediaRenderType == 328) {
							component.mediaRotationX = -771359726;
							component.mediaRotationY = ((int) (Math.sin((double) (Client.cycle * -637317861) / 40.0D) * 256.0D) & 2047) * 40361315;
							component.mediaType = -763981079;
							component.mediaID = 1321013799;
						}
					}

					var21 = xOffset + component.xPosition * 985647797;
					int var12 = yOffset + component.yPosition * 1730176157;
					int transparency = component.alpha * 1076754521;
					int var24;
					int var29;
					if (component == Client.aClass108_Sub17_2877) {
						if (var1 != -1412584499 && !component.aBool1836) {
							Client.aClass108_Sub17Array2963 = components;
							URLSession.anInt619 = xOffset * 1934415775;
							EquipmentKit.anInt1344 = yOffset * -1922107287;
							continue;
						}

						if (Client.aBool2888 && Client.aBool2882) {
							var24 = MouseInputHandler.mouseX * -367052265;
							var29 = MouseInputHandler.mouseY * 1533395117;
							var24 -= Client.anInt2879 * 1247450239;
							var29 -= Client.anInt2880 * 781803909;
							if (var24 < Client.anInt2883 * -651460611) {
								var24 = Client.anInt2883 * -651460611;
							}

							if (var24 + component.height * -1281443035 > Client.anInt2883 * -651460611 + Client.aClass108_Sub17_2878.height * -1281443035) {
								var24 = Client.aClass108_Sub17_2878.height * -1281443035 + Client.anInt2883 * -651460611 - component.height * -1281443035;
							}

							if (var29 < Client.anInt2884 * 1677738499) {
								var29 = Client.anInt2884 * 1677738499;
							}

							if (var29 + component.width * 334099177 > Client.anInt2884 * 1677738499 + Client.aClass108_Sub17_2878.width * 334099177) {
								var29 = Client.anInt2884 * 1677738499 + Client.aClass108_Sub17_2878.width * 334099177 - component.width * 334099177;
							}

							var21 = var24;
							var12 = var29;
						}

						if (!component.aBool1836) {
							transparency = 128;
						}
					}

					int var15;
					int var20;
					int var22;
					int var25;
					int var28;
					int var30;
					if (component.componentType * 942877543 == 2) {
						var24 = xRender;
						var29 = yRender;
						var28 = renderWidth;
						var25 = renderHeight;
					} else if (component.componentType * 942877543 == 9) {
						var22 = var21;
						var30 = var12;
						var15 = var21 + component.height * -1281443035;
						var20 = component.width * 334099177 + var12;
						if (var15 < var21) {
							var22 = var15;
							var15 = var21;
						}

						if (var20 < var12) {
							var30 = var20;
							var20 = var12;
						}

						++var15;
						++var20;
						var24 = var22 > xRender ? var22 : xRender;
						var29 = var30 > yRender ? var30 : yRender;
						var28 = var15 < renderWidth ? var15 : renderWidth;
						var25 = var20 < renderHeight ? var20 : renderHeight;
					} else {
						var22 = var21 + component.height * -1281443035;
						var30 = var12 + component.width * 334099177;
						var24 = var21 > xRender ? var21 : xRender;
						var29 = var12 > yRender ? var12 : yRender;
						var28 = var22 < renderWidth ? var22 : renderWidth;
						var25 = var30 < renderHeight ? var30 : renderHeight;
					}

					if (!component.aBool1855 || var24 < var28 && var29 < var25) {
						if (0 != component.anInt1886 * -917776085) {
							if (component.anInt1886 * -917776085 == 1337) {
								Client.anInt2735 = var21 * 735852373;
								Client.anInt2820 = var12 * -1949788625;
								NPC.method3165(var21, var12, component.height * -1281443035, component.width * 334099177, 2061404552);
								Rasterizer2D.setRasterizationRect(xRender, yRender, renderWidth, renderHeight);
								continue;
							}

							if (component.anInt1886 * -917776085 == 1338) {
								MiniMap.renderMiniMap(var21, var12, var19, (short) -4901);
								Rasterizer2D.setRasterizationRect(xRender, yRender, renderWidth, renderHeight);
								continue;
							}
						}

						if (0 == component.componentType * 942877543) { // container or scrolling container?
							if (!component.aBool1855 && RSInterface.isComponentHidden(component, (byte) 83) && component != Client.mouseHoveredComponent) {
								continue;
							}

							if (!component.aBool1855) {
								if (component.scrollPosition * -643576081 > component.anInt1787 * -1108406155 - component.width * 334099177) {
									component.scrollPosition = component.anInt1787 * 1162057435 - component.width * -126788697;
								}

								if (component.scrollPosition * -643576081 < 0) {
									component.scrollPosition = 0;
								}
							}

							renderInterfaceComponents(components, component.interfaceHash * -1081473899, var24, var29, var28, var25, var21 - component.anInt1784 * -133270367, var12 - component.scrollPosition * -643576081, var19, 199691778);
							if (component.aClass108_Sub17Array1879 != null) {
								renderInterfaceComponents(component.aClass108_Sub17Array1879, component.interfaceHash * -1081473899, var24, var29, var28, var25, var21 - component.anInt1784 * -133270367, var12 - component.scrollPosition * -643576081, var19, -1149084430);
							}

							Class108_Sub10 var45 = (Class108_Sub10) Client.aClass101_2866.get((long) (component.interfaceHash * -1081473899));
							if (null != var45) {
								RSInterface.renderInterface(var45.anInt1653 * 1557246219, var24, var29, var28, var25, var21, var12, var19, 1300032424);
							}

							Rasterizer2D.setRasterizationRect(xRender, yRender, renderWidth, renderHeight);
							Rasterizer3D.method2970();
						}

						if (Client.aBoolArray2831[var19] || Client.anInt2916 * 1531358553 > 1) {
							if (component.componentType * 942877543 == 0 && !component.aBool1855 && component.anInt1787 * -1108406155 > component.width * 334099177) {
								Class84.method1120(var21 + component.height * -1281443035, var12, component.scrollPosition * -643576081, component.width * 334099177, component.anInt1787 * -1108406155, -785175456);
							}

							if (1 != component.componentType * 942877543) {
								int var10;
								int var16;
								int var18;
								int var41;
								int var47;
								if (component.componentType * 942877543 == 2) {
									int itemIndex = 0;

									for (var30 = 0; var30 < component.width * 334099177; ++var30) {
										for (var15 = 0; var15 < component.height * -1281443035; ++var15) {
											int xPos = (component.widgetItemPaddingX * 876962455 + 32) * var15 + var21;
											int yPos = var30 * (32 + component.widgetItemPaddingY * -448462053) + var12;
											if (itemIndex < 20) {
												xPos += component.spritesX[itemIndex];
												yPos += component.spritesY[itemIndex];
											}

											if (component.widgetItems[itemIndex] > 0) {
												boolean var52 = false;
												boolean var40 = false;
												int itemID = component.widgetItems[itemIndex] - 1;
												if (xPos + 32 > xRender && xPos < renderWidth && yPos + 32 > yRender && yPos < renderHeight || IsaacRandomGen.aClass108_Sub17_745 == component && itemIndex == Client.anInt2863 * -664226831) {
													RGBSprite itemSprite;
													if (1 == Client.anInt2858 * -968945719 && ClientScriptReference.anInt716 * 347376265 == itemIndex && component.interfaceHash * -1081473899 == Class50.anInt699 * -932350913) {
														itemSprite = ItemDefinition.getItemSprite(itemID, component.widgetItemAmounts[itemIndex], 2, 0, false, 1256224427);
													} else {
														itemSprite = ItemDefinition.getItemSprite(itemID, component.widgetItemAmounts[itemIndex], 1, 3153952, false, -1431232517);
													}

													if (itemSprite != null) {
														if (component == IsaacRandomGen.aClass108_Sub17_745 && Client.anInt2863 * -664226831 == itemIndex) {
															var47 = MouseInputHandler.mouseX * -367052265 - Client.anInt2900 * 785242869;
															var16 = MouseInputHandler.mouseY * 1533395117 - Client.anInt2903 * 685630743;
															if (var47 < 5 && var47 > -5) {
																var47 = 0;
															}

															if (var16 < 5 && var16 > -5) {
																var16 = 0;
															}

															// change "< 5)" to < 10 for faster switching.
															if (Client.anInt2841 * 1113333989 < 5) {
																var47 = 0;
																var16 = 0;
															}

															itemSprite.method2818(var47 + xPos, var16 + yPos, 128);
															if (var1 != -1) {
																RSInterface var50 = components[var1 & '\uffff'];
																if (yPos + var16 < Rasterizer2D.topY && var50.scrollPosition * -643576081 > 0) {
																	var18 = Client.anInt2780 * 468305965 * (Rasterizer2D.topY - yPos - var16) / 3;
																	if (var18 > Client.anInt2780 * 388092354) {
																		var18 = Client.anInt2780 * 388092354;
																	}

																	if (var18 > var50.scrollPosition * -643576081) {
																		var18 = var50.scrollPosition * -643576081;
																	}

																	var50.scrollPosition -= var18 * -1291378673;
																	Client.anInt2903 += var18 * 273785511;
																	MouseInputHandler.method775(var50, -16054773);
																}

																if (var16 + yPos + 32 > Rasterizer2D.bottomY && var50.scrollPosition * -643576081 < var50.anInt1787 * -1108406155 - var50.width * 334099177) {
																	var18 = (var16 + yPos + 32 - Rasterizer2D.bottomY) * Client.anInt2780 * 468305965 / 3;
																	if (var18 > Client.anInt2780 * 388092354) {
																		var18 = Client.anInt2780 * 388092354;
																	}

																	if (var18 > var50.anInt1787 * -1108406155 - var50.width * 334099177 - var50.scrollPosition * -643576081) {
																		var18 = var50.anInt1787 * -1108406155 - var50.width * 334099177 - var50.scrollPosition * -643576081;
																	}

																	var50.scrollPosition += var18 * -1291378673;
																	Client.anInt2903 -= var18 * 273785511;
																	MouseInputHandler.method775(var50, -16054773);
																}
															}
														} else if (PlayerLoginDetails.aClass108_Sub17_75 == component && itemIndex == Client.anInt2815 * -1269538377) {
															itemSprite.method2818(xPos, yPos, 128);
														} else {
															itemSprite.method2746(xPos, yPos);
														}
													} else {
														MouseInputHandler.method775(component, -16054773);
													}
												}
											} else if (null != component.sprites && itemIndex < 20) {
												RGBSprite var53 = component.method1959(itemIndex, 682458473);
												if (var53 != null) {
													var53.method2746(xPos, yPos);
												} else if (RSInterface.mediaUnavailable) {
													MouseInputHandler.method775(component, -16054773);
												}
											}

											++itemIndex;
										}
									}
								} else if (3 == component.componentType * 942877543) { // draw colored filled/unfilled rectangle
									if (GameDefinition.method1103(component, (byte) -28)) {
										var22 = component.componentActiveColor * -310727379;
										if (component == Client.mouseHoveredComponent && component.mouseOverActiveColor * -1067295333 != 0) {
											var22 = component.mouseOverActiveColor * -1067295333;
										}
									} else {
										var22 = component.componentColor * -1484361639;
										if (component == Client.mouseHoveredComponent && 0 != component.mouseOverColor * 256440005) {
											var22 = component.mouseOverColor * 256440005;
										}
									}

									if (transparency == 0) {
										if (component.filled) {
											Rasterizer2D.drawFilledRectangle(var21, var12, component.height * -1281443035, component.width * 334099177, var22);
										} else {
											Rasterizer2D.drawUnfilledRectangle(var21, var12, component.height * -1281443035, component.width * 334099177, var22);
										}
									} else if (component.filled) {
										Rasterizer2D.drawFilledRectangleAlpha(var21, var12, component.height * -1281443035, component.width * 334099177, var22, 256 - (transparency & 255));
									} else {
										Rasterizer2D.drawUnfilledRectangleAlpha(var21, var12, component.height * -1281443035, component.width * 334099177, var22, 256 - (transparency & 255));
									}
								} else {
									RSFont interfaceFont;
									if (component.componentType * 942877543 == 4) {
										interfaceFont = component.getWidgetFont(192256567);
										if (interfaceFont == null) {
											if (RSInterface.mediaUnavailable) {
												MouseInputHandler.method775(component, -16054773);
											}
										} else {
											String componentString = component.componentString;
											if (GameDefinition.method1103(component, (byte) -58)) {
												var30 = component.componentActiveColor * -310727379;
												if (Client.mouseHoveredComponent == component && component.mouseOverActiveColor * -1067295333 != 0) {
													var30 = component.mouseOverActiveColor * -1067295333;
												}

												if (component.activeComponentString.length() > 0) {
													componentString = component.activeComponentString;
												}
											} else {
												var30 = component.componentColor * -1484361639;
												if (Client.mouseHoveredComponent == component && component.mouseOverColor * 256440005 != 0) {
													var30 = component.mouseOverColor * 256440005;
												}
											}

											if (component.aBool1855 && -1 != component.itemID * 703308511) {
												ItemDefinition itemDef = ItemDefinition.getItemDefinition(component.itemID * 703308511, -2007508026);
												componentString = itemDef.name;
												if (null == componentString) {
													componentString = "null";
												}

												if ((1 == itemDef.stackable * 1548462817 || component.anInt1775 * 1939717269 != 1) && -1 != component.anInt1775 * 1939717269) {
													componentString = HuffmanEncoding.method690(16748608, -1895881530) + componentString + Class47.COL_END + " " + 'x' + Player.method3177(component.anInt1775 * 1939717269, (byte) 36);
												}
											}

											if (Client.aClass108_Sub17_2869 == component) {
												StringUtilities var10000 = (StringUtilities) null;
												componentString = StringUtilities.aString1041;
												var30 = component.componentColor * -1484361639;
											}

											if (!component.aBool1855) {
												componentString = Class2.method40(componentString, component, 586397057);
											}

											interfaceFont.method3097(componentString, var21, var12, component.height * -1281443035, component.width * 334099177, var30, component.textCentered ? 0 : -1, component.anInt1863 * -164762721, component.anInt1862 * 1189093849, component.anInt1820 * -861430413);
										}
									} else if (component.componentType * 942877543 == 5) {
										RGBSprite var49;
										if (!component.aBool1855) {
											var49 = component.method1938(GameDefinition.method1103(component, (byte) 98), 301049466);
											if (null != var49) {
												var49.method2746(var21, var12);
											} else if (RSInterface.mediaUnavailable) {
												MouseInputHandler.method775(component, -16054773);
											}
										} else {
											if (component.itemID * 703308511 != -1) {
												var49 = ItemDefinition.getItemSprite(component.itemID * 703308511, component.anInt1775 * 1939717269, component.anInt1799 * 411719917, component.anInt1800 * -563686383, false, -364961531);
											} else {
												var49 = component.method1938(false, 301049466);
											}

											if (null == var49) {
												if (RSInterface.mediaUnavailable) {
													MouseInputHandler.method775(component, -16054773);
												}
											} else {
												var30 = var49.maxWidth;
												var15 = var49.maxHeight;
												if (!component.aBool1798) {
													var20 = component.height * -340635648 / var30;
													if (0 != component.anInt1797 * 879589047) {
														var49.method2766(component.height * -1281443035 / 2 + var21, component.width * 334099177 / 2 + var12, component.anInt1797 * 879589047, var20);
													} else if (0 != transparency) {
														var49.method2762(var21, var12, component.height * -1281443035, component.width * 334099177, 256 - (transparency & 255));
													} else if (var30 == component.height * -1281443035 && component.width * 334099177 == var15) {
														var49.method2746(var21, var12);
													} else {
														var49.method2756(var21, var12, component.height * -1281443035, component.width * 334099177);
													}
												} else {
													Rasterizer2D.setRasterizerArea(var21, var12, component.height * -1281443035 + var21, component.width * 334099177 + var12);
													var20 = (var30 - 1 + component.height * -1281443035) / var30;
													var41 = (component.width * 334099177 + (var15 - 1)) / var15;

													for (var47 = 0; var47 < var20; ++var47) {
														for (var16 = 0; var16 < var41; ++var16) {
															if (component.anInt1797 * 879589047 != 0) {
																var49.method2766(var30 / 2 + var21 + var30 * var47, var15 / 2 + var12 + var16 * var15, component.anInt1797 * 879589047, 4096);
															} else if (0 != transparency) {
																var49.method2818(var47 * var30 + var21, var12 + var15 * var16, 256 - (transparency & 255));
															} else {
																var49.method2746(var30 * var47 + var21, var12 + var15 * var16);
															}
														}
													}

													Rasterizer2D.setRasterizationRect(xRender, yRender, renderWidth, renderHeight);
												}
											}
										}
									} else {
										ItemDefinition itemDef;
										if (component.componentType * 942877543 == 6) { // media
											boolean var48 = GameDefinition.method1103(component, (byte) -14);
											if (var48) {
												var30 = component.activeMediaAnimID * -1534484025;
											} else {
												var30 = component.mediaAnimID * 866704807; 
											}

											ModelRasterizer rasterizer = null;
											var20 = 0;
											if (component.itemID * 703308511 != -1) {
												itemDef = ItemDefinition.getItemDefinition(component.itemID * 703308511, -2022329629);
												if (itemDef != null) {
													itemDef = itemDef.transformItemByAmount(component.anInt1775 * 1939717269, 108017835);
													rasterizer = itemDef.renderItem(1, (byte) -116);
													if (null != rasterizer) {
														rasterizer.method2855();
														var20 = rasterizer.modelHeight * 782517621 / 2;
													} else {
														MouseInputHandler.method775(component, -16054773);
													}
												}
											} else if (component.mediaType * -1873872195 == 5) { // player
												if (component.mediaID * 2030124439 == 0) {
													rasterizer = Client.aClass93_2926.getModelRasterizer((AnimationDefinition) null, -1, (AnimationDefinition) null, -1, -1132359552);
												} else {
													rasterizer = Player.myPlayer.getModelRasterizer((byte) 62);
												}
											} else if (var30 == -1) {
												rasterizer = component.getInterfaceMediaRasterizer((AnimationDefinition) null, -1, var48, Player.myPlayer.bodyEquipmentKit, -1286694344);
												if (null == rasterizer && RSInterface.mediaUnavailable) {
													MouseInputHandler.method775(component, -16054773);
												}
											} else {
												AnimationDefinition var43 = AnimationDefinition.getAnimDefForID(var30, 1658041042);
												rasterizer = component.getInterfaceMediaRasterizer(var43, component.anInt1877 * -1365409805, var48, Player.myPlayer.bodyEquipmentKit, -1695743692);
												if (rasterizer == null && RSInterface.mediaUnavailable) {
													MouseInputHandler.method775(component, -16054773);
												}
											}

											Rasterizer3D.method2926(var21 + component.height * -1281443035 / 2, var12 + component.width * 334099177 / 2);
											var41 = component.mediaZoom * -1750235537 * Rasterizer3D.SINE[component.mediaRotationX * -272801613] >> 16;
											var47 = component.mediaZoom * -1750235537 * Rasterizer3D.COSINE[component.mediaRotationX * -272801613] >> 16;
											if (null != rasterizer) {
												if (!component.aBool1855) {
													rasterizer.method2916(0, component.mediaRotationY * 260082763, 0, component.mediaRotationX * -272801613, 0, var41, var47);
												} else {
													rasterizer.method2855();
													if (component.aBool1816) {
														rasterizer.renderSingle(0, component.mediaRotationY * 260082763, component.anInt1813 * -1361484521, component.mediaRotationX * -272801613, component.anInt1809 * 2076437491, var41 + var20 + component.anInt1810 * -2001912439, var47 + component.anInt1810 * -2001912439, component.mediaZoom * -1750235537);
													} else {
														rasterizer.method2916(0, component.mediaRotationY * 260082763, component.anInt1813 * -1361484521, component.mediaRotationX * -272801613, component.anInt1809 * 2076437491, component.anInt1810 * -2001912439 + var41 + var20, var47 + component.anInt1810 * -2001912439);
													}
												}
											}

											Rasterizer3D.method2925();
										} else {
											if (7 == component.componentType * 942877543) {
												interfaceFont = component.getWidgetFont(192256567);
												if (null == interfaceFont) {
													if (RSInterface.mediaUnavailable) {
														MouseInputHandler.method775(component, -16054773);
													}
													continue;
												}

												var30 = 0;

												for (var15 = 0; var15 < component.width * 334099177; ++var15) {
													for (var20 = 0; var20 < component.height * -1281443035; ++var20) {
														if (component.widgetItems[var30] > 0) {
															itemDef = ItemDefinition.getItemDefinition(component.widgetItems[var30] - 1, -1172020220);
															String var23;
															if (1 != itemDef.stackable * 1548462817 && component.widgetItemAmounts[var30] == 1) {
																var23 = HuffmanEncoding.method690(16748608, -995591797) + itemDef.name + Class47.COL_END;
															} else {
																var23 = HuffmanEncoding.method690(16748608, -2080841110) + itemDef.name + Class47.COL_END + " " + 'x' + Player.method3177(component.widgetItemAmounts[var30], (byte) 81);
															}

															var16 = (component.widgetItemPaddingX * 876962455 + 115) * var20 + var21;
															var10 = var12 + var15 * (component.widgetItemPaddingY * -448462053 + 12);
															if (component.anInt1863 * -164762721 == 0) {
																interfaceFont.drawString(var23, var16, var10, component.componentColor * -1484361639, component.textCentered ? 0 : -1);
															} else if (component.anInt1863 * -164762721 == 1) {
																interfaceFont.drawStringCenter(var23, var16 + component.height * -1281443035 / 2, var10, component.componentColor * -1484361639, component.textCentered ? 0 : -1);
															} else {
																interfaceFont.drawStringRight(var23, var16 + component.height * -1281443035 - 1, var10, component.componentColor * -1484361639, component.textCentered ? 0 : -1);
															}
														}

														++var30;
													}
												}
											}

											int var32;
											if (8 == component.componentType * 942877543 && component == NPCDefinition.aClass108_Sub17_2193 && Client.anInt2856 * 1284119235 == Client.anInt2857 * -1887483549) {
												var22 = 0;
												var30 = 0;
												RSFont p12_full = ObjectDefinition.p12_full_font;
												String var44 = component.componentString;

												String var38;
												for (var44 = Class2.method40(var44, component, -1385023527); var44.length() > 0; var30 += 1 + p12_full.anInt2643) {
													var47 = var44.indexOf(Class47.LINE_BREAK);
													if (var47 != -1) {
														var38 = var44.substring(0, var47);
														var44 = var44.substring(var47 + 4);
													} else {
														var38 = var44;
														var44 = "";
													}

													var16 = p12_full.getTextWidth(var38);
													if (var16 > var22) {
														var22 = var16;
													}
												}

												var22 += 6;
												var30 += 7;
												var47 = var21 + component.height * -1281443035 - 5 - var22;
												var16 = var12 + component.width * 334099177 + 5;
												if (var47 < 5 + var21) {
													var47 = 5 + var21;
												}

												if (var22 + var47 > renderWidth) {
													var47 = renderWidth - var22;
												}

												if (var16 + var30 > renderHeight) {
													var16 = renderHeight - var30;
												}

												Rasterizer2D.drawFilledRectangle(var47, var16, var22, var30, 16777120);
												Rasterizer2D.drawUnfilledRectangle(var47, var16, var22, var30, 0);
												var44 = component.componentString;
												var10 = var16 + p12_full.anInt2643 + 2;

												for (var44 = Class2.method40(var44, component, 1044987450); var44.length() > 0; var10 += 1 + p12_full.anInt2643) {
													var32 = var44.indexOf(Class47.LINE_BREAK);
													if (var32 != -1) {
														var38 = var44.substring(0, var32);
														var44 = var44.substring(var32 + 4);
													} else {
														var38 = var44;
														var44 = "";
													}

													p12_full.drawString(var38, 3 + var47, var10, 0, -1);
												}
											}

											if (component.componentType * 942877543 == 9) {
												if (1 == component.anInt1811 * -1974296291) {
													Rasterizer2D.method2510(var21, var12, var21 + component.height * -1281443035, var12 + component.width * 334099177, component.componentColor * -1484361639);
												} else {
													var22 = component.height * -1281443035 >= 0 ? component.height * -1281443035 : -(component.height * -1281443035);
													var30 = component.width * 334099177 >= 0 ? component.width * 334099177 : -(component.width * 334099177);
													var15 = var22;
													if (var22 < var30) {
														var15 = var30;
													}

													if (var15 != 0) {
														var20 = (component.height * -1281443035 << 16) / var15;
														var41 = (component.width * 334099177 << 16) / var15;
														if (var41 <= var20) {
															var20 = -var20;
														} else {
															var41 = -var41;
														}

														var47 = var41 * component.anInt1811 * -1974296291 >> 17;
														var16 = var41 * component.anInt1811 * -1974296291 + 1 >> 17;
														var10 = var20 * component.anInt1811 * -1974296291 >> 17;
														var32 = component.anInt1811 * -1974296291 * var20 + 1 >> 17;
														int var27 = var21 + var47;
														var18 = var21 - var16;
														int var33 = var21 + component.height * -1281443035 - var16;
														int var26 = var21 + component.height * -1281443035 + var47;
														int var34 = var12 + var10;
														int var36 = var12 - var32;
														int var35 = var12 + component.width * 334099177 - var32;
														int var13 = var10 + component.width * 334099177 + var12;
														Rasterizer3D.method2931(var27, var18, var33);
														Rasterizer3D.drawFlatTriangle(var34, var36, var35, var27, var18, var33, component.componentColor * -1484361639);
														Rasterizer3D.method2931(var27, var33, var26);
														Rasterizer3D.drawFlatTriangle(var34, var35, var13, var27, var33, var26, component.componentColor * -1484361639);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

	public static String method2569(byte[] var0, int var1, int var2, short var3) {
		char[] var4 = new char[var2];
		int var5 = 0;

		for (int var8 = 0; var8 < var2; ++var8) {
			int var6 = var0[var1 + var8] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = StringUtilities.aCharArray1496[var6 - 128];
					if (0 == var7) {
						var7 = 63;
					}

					var6 = var7;
				}

				var4[var5++] = (char) var6;
			}
		}

		return new String(var4, 0, var5);
	}

	public static int method2570(int var0, int var1, byte var2) {
		int var3;
		if (var1 > var0) {
			var3 = var0;
			var0 = var1;
			var1 = var3;
		}

		while (var1 != 0) {
			var3 = var0 % var1;
			var0 = var1;
			var1 = var3;
		}

		return var0;
	}

	static ClientScriptDefinition getClientScriptDefinition(int scriptID, int var1) {
		ClientScriptDefinition definition = (ClientScriptDefinition) clientScriptMap.get((long) scriptID);
		if (null != definition) {
			return definition;
		} else {
			byte[] scriptData = Class108_Sub13.clientScriptIndex.getFile(scriptID, 0, (byte) 7);
			if (null == scriptData) {
				return null;
			} else {
				definition = new ClientScriptDefinition();
				RSByteBuffer buffer = new RSByteBuffer(scriptData);
				buffer.position = (buffer.buf.length - 12) * 537964811;
				int paramCount = buffer.readInt();
				definition.localIntCount = buffer.readUShort(36419144) * 1427932745;
				definition.localStringCount = buffer.readUShort(1177800875) * -1989268771;
				definition.anInt2269 = buffer.readUShort(1384272638) * -1053579443;
				definition.anInt2276 = buffer.readUShort(84710466) * -485318219;
				buffer.position = 0;
				buffer.method1725(-2124865514);
				definition.instructions = new int[paramCount];
				definition.intOperands = new int[paramCount];
				definition.aStringArray2272 = new String[paramCount];

				int var3;
				for (int var6 = 0; buffer.position * 798331555 < buffer.buf.length - 12; definition.instructions[var6++] = var3) {
					var3 = buffer.readUShort(2026634670);
					if (var3 == 3) {
						definition.aStringArray2272[var6] = buffer.getString_2((byte) 8);
					} else if (var3 < 100 && 21 != var3 && 38 != var3 && 39 != var3) {
						definition.intOperands[var6] = buffer.readInt();
					} else {
						definition.intOperands[var6] = buffer.readUByte();
					}
				}

				clientScriptMap.put(definition, (long) scriptID);
				return definition;
			}
		}
	}
}
