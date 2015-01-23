public final class GroundItem {

	int anInt472;
	int xPos;
	int yPos;
	Renderable aClass108_Sub20_Sub14_475;
	Renderable aClass108_Sub20_Sub14_476;
	int anInt477;
	int anInt478;
	Renderable firstGroundItem;
	static int anInt480;
	static PaletteSprite radioButtonOptions_2;


	public static int method580(int var0) {
		return (MouseInputHandler.anInt765 += 1238703313) * -1622361039 - 1;
	}

	static final void method582(int var0, short var1) {
		short var2 = 256;
		Class4.anInt48 += var0 * -1982538112;
		int var3;
		if (Class4.anInt48 * 397531541 > Class56.anIntArray755.length) {
			Class4.anInt48 -= Class56.anIntArray755.length * 1729341885;
			var3 = (int) (Math.random() * 12.0D);
			ChatMessage.method2013(Class5.aClass108_Sub20_Sub15_Sub2Array83[var3], -606108613);
		}

		var3 = 0;
		int var4 = var0 * 128;
		int var5 = (var2 - var0) * 128;

		int var7;
		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			var7 = Class65.anIntArray860[var4 + var3] - Class56.anIntArray755[var3 + Class4.anInt48 * 397531541 & Class56.anIntArray755.length - 1] * var0 / 6;
			if (var7 < 0) {
				var7 = 0;
			}

			Class65.anIntArray860[var3++] = var7;
		}

		int var6;
		int var10;
		for (var8 = var2 - var0; var8 < var2; ++var8) {
			var7 = var8 * 128;

			for (var6 = 0; var6 < 128; ++var6) {
				var10 = (int) (Math.random() * 100.0D);
				if (var10 < 50 && var6 > 10 && var6 < 118) {
					Class65.anIntArray860[var6 + var7] = 255;
				} else {
					Class65.anIntArray860[var6 + var7] = 0;
				}
			}
		}

		if (Class4.anInt57 * 250523231 > 0) {
			Class4.anInt57 -= var0 * -1424705924;
		}

		if (Class4.anInt67 * -713414969 > 0) {
			Class4.anInt67 -= var0 * -1524438052;
		}

		if (Class4.anInt57 * 250523231 == 0 && 0 == Class4.anInt67 * -713414969) {
			var8 = (int) (Math.random() * (double) (2000 / var0));
			if (var8 == 0) {
				Class4.anInt57 = 347503616;
			}

			if (var8 == 1) {
				Class4.anInt67 = 585882624;
			}
		}

		for (var8 = 0; var8 < var2 - var0; ++var8) {
			Class4.anIntArray45[var8] = Class4.anIntArray45[var0 + var8];
		}

		for (var8 = var2 - var0; var8 < var2; ++var8) {
			Class4.anIntArray45[var8] = (int) (Math.sin((double) (Class4.anInt37 * 432661575) / 14.0D) * 16.0D + Math.sin((double) (Class4.anInt37 * 432661575) / 15.0D) * 14.0D + Math.sin((double) (Class4.anInt37 * 432661575) / 16.0D) * 12.0D);
			Class4.anInt37 += 1895990647;
		}

		Class4.anInt49 += var0 * -1061549843;
		var8 = (var0 + (Client.cycle * -637317861 & 1)) / 2;
		if (var8 > 0) {
			for (var7 = 0; var7 < Class4.anInt49 * 379464052; ++var7) {
				var6 = (int) (Math.random() * 124.0D) + 2;
				var10 = (int) (Math.random() * 128.0D) + 128;
				Class65.anIntArray860[(var10 << 7) + var6] = 192;
			}

			Class4.anInt49 = 0;

			int var9;
			for (var7 = 0; var7 < var2; ++var7) {
				var6 = 0;
				var10 = var7 * 128;

				for (var9 = -var8; var9 < 128; ++var9) {
					if (var8 + var9 < 128) {
						var6 += Class65.anIntArray860[var8 + var9 + var10];
					}

					if (var9 - (var8 + 1) >= 0) {
						var6 -= Class65.anIntArray860[var10 + var9 - (var8 + 1)];
					}

					if (var9 >= 0) {
						World.anIntArray565[var9 + var10] = var6 / (var8 * 2 + 1);
					}
				}
			}

			for (var7 = 0; var7 < 128; ++var7) {
				var6 = 0;

				for (var10 = -var8; var10 < var2; ++var10) {
					var9 = var10 * 128;
					if (var8 + var10 < var2) {
						var6 += World.anIntArray565[var7 + var9 + var8 * 128];
					}

					if (var10 - (var8 + 1) >= 0) {
						var6 -= World.anIntArray565[var7 + var9 - (1 + var8) * 128];
					}

					if (var10 >= 0) {
						Class65.anIntArray860[var9 + var7] = var6 / (var8 * 2 + 1);
					}
				}
			}

		}
	}

	static final void method583(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
		int var7 = 2048 - var3 & 2047;
		int var13 = 2048 - var4 & 2047;
		int var9 = 0;
		int var8 = 0;
		int var10 = var5;
		int var11;
		int var12;
		int var14;
		if (0 != var7) {
			var11 = Rasterizer3D.SINE[var7];
			var12 = Rasterizer3D.COSINE[var7];
			var14 = var8 * var12 - var11 * var5 >> 16;
			var10 = var5 * var12 + var11 * var8 >> 16;
			var8 = var14;
		}

		if (0 != var13) {
			var11 = Rasterizer3D.SINE[var13];
			var12 = Rasterizer3D.COSINE[var13];
			var14 = var10 * var11 + var12 * var9 >> 16;
			var10 = var10 * var12 - var9 * var11 >> 16;
			var9 = var14;
		}

		BZip2Context.xCameraPos = (var0 - var9) * 1616837399;
		ClientScript.anInt1645 = (var1 - var8) * 1023920987;
		CacheFileAccessor.anInt1490 = (var2 - var10) * 365620115;
		RuntimeException_Sub1.anInt2625 = var3 * -1558852331;
		GameConnection.anInt811 = var4 * -422753419;
	}

	public static void method585(byte var0) {
		ItemDefinition.itemDefinitionMap.clearCacheMap();
		ItemDefinition.itemModelMap.clearCacheMap();
		ItemDefinition.itemSpriteMap.clearCacheMap();
	}

	static final void method586(RSInterface var0, int var1, int var2, int var3) {
		if (var0.actionType * -2005807019 == 1) {
			Class4.method91(var0.tooltip, "", 24, 0, 0, var0.interfaceHash * -1081473899, 2067353987);
		}

		String var5;
		if (var0.actionType * -2005807019 == 2 && !Client.aBool2881) {
			var5 = AnimationDefinition.method2234(var0, (byte) -21);
			if (var5 != null) {
				Class4.method91(var5, HuffmanEncoding.method690('\uff00', -2134841165) + var0.spellName, 25, 0, -1, var0.interfaceHash * -1081473899, 1882643240);
			}
		}

		if (3 == var0.actionType * -2005807019) {
			Class4.method91(StringUtilities.aString1108, "", 26, 0, 0, var0.interfaceHash * -1081473899, 1930894399);
		}

		if (4 == var0.actionType * -2005807019) {
			Class4.method91(var0.tooltip, "", 28, 0, 0, var0.interfaceHash * -1081473899, 1894350308);
		}

		if (var0.actionType * -2005807019 == 5) {
			Class4.method91(var0.tooltip, "", 29, 0, 0, var0.interfaceHash * -1081473899, 2004086787);
		}

		if (6 == var0.actionType * -2005807019 && null == Client.aClass108_Sub17_2869) {
			Class4.method91(var0.tooltip, "", 30, 0, -1, var0.interfaceHash * -1081473899, 1969748701);
		}

		int var8;
		int var15;
		if (var0.componentType * 942877543 == 2) {
			var15 = 0;

			for (var8 = 0; var8 < var0.width * 334099177; ++var8) {
				for (int var9 = 0; var9 < var0.height * -1281443035; ++var9) {
					int var6 = (32 + var0.widgetItemPaddingX * 876962455) * var9;
					int var10 = var8 * (var0.widgetItemPaddingY * -448462053 + 32);
					if (var15 < 20) {
						var6 += var0.spritesX[var15];
						var10 += var0.spritesY[var15];
					}

					if (var1 >= var6 && var2 >= var10 && var1 < var6 + 32 && var2 < var10 + 32) {
						Client.anInt2911 = var15 * -1844234207;
						Class108_Sub10.aClass108_Sub17_1656 = var0;
						if (var0.widgetItems[var15] > 0) {
							ItemDefinition itemDef = ItemDefinition.getItemDefinition(var0.widgetItems[var15] - 1, -1008729094);
							if (Client.anInt2858 * -968945719 == 1 && Class108_Sub20_Sub14_Sub6.method3075(Class32.method576(var0, 618724156), 1422902481)) {
								if (Class50.anInt699 * -932350913 != var0.interfaceHash * -1081473899 || var15 != ClientScriptReference.anInt716 * 347376265) {
									Class4.method91(StringUtilities.USE_OPTION, Client.aString2859 + " " + Class47.aString668 + " " + HuffmanEncoding.method690(16748608, -950562409) + itemDef.name, 31, itemDef.itemID * 754919629, var15, var0.interfaceHash * -1081473899, 2028186126);
								}
							} else if (Client.aBool2881 && Class108_Sub20_Sub14_Sub6.method3075(Class32.method576(var0, -1016511227), 77070691)) {
								if (16 == (Class68.anInt902 * 401025055 & 16)) {
									Class4.method91(Client.aString2941, Client.aString2819 + " " + Class47.aString668 + " " + HuffmanEncoding.method690(16748608, -1123684096) + itemDef.name, 32, itemDef.itemID * 754919629, var15, var0.interfaceHash * -1081473899, 1878199344);
								}
							} else {
								String[] var12 = itemDef.interfaceOptions;
								if (Client.aBool2744) {
									var12 = Class23.method341(var12, 1800376382);
								}

								if (Class108_Sub20_Sub14_Sub6.method3075(Class32.method576(var0, -1638295712), -731553301)) {
									for (int var13 = 4; var13 >= 3; --var13) {
										if (var12 != null && null != var12[var13]) {
											byte var14;
											if (3 == var13) {
												var14 = 36;
											} else {
												var14 = 37;
											}

											Class4.method91(var12[var13], HuffmanEncoding.method690(16748608, -618418833) + itemDef.name, var14, itemDef.itemID * 754919629, var15, var0.interfaceHash * -1081473899, 2124552684);
										} else if (4 == var13) {
											Class4.method91(StringUtilities.DROP_OPTION, HuffmanEncoding.method690(16748608, -1522975852) + itemDef.name, 37, itemDef.itemID * 754919629, var15, var0.interfaceHash * -1081473899, 2096358408);
										}
									}
								}

								int var19 = Class32.method576(var0, -1004510541);
								boolean var18 = (var19 >> 31 & 1) != 0;
								if (var18) {
									Class4.method91(StringUtilities.USE_OPTION, HuffmanEncoding.method690(16748608, -1608586132) + itemDef.name, 38, itemDef.itemID * 754919629, var15, var0.interfaceHash * -1081473899, 2079440851);
								}

								int var4;
								byte var7;
								if (Class108_Sub20_Sub14_Sub6.method3075(Class32.method576(var0, 1655510312), -302394358) && null != var12) {
									for (var4 = 2; var4 >= 0; --var4) {
										if (var12[var4] != null) {
											var7 = 0;
											if (var4 == 0) {
												var7 = 33;
											}

											if (1 == var4) {
												var7 = 34;
											}

											if (var4 == 2) {
												var7 = 35;
											}

											Class4.method91(var12[var4], HuffmanEncoding.method690(16748608, -1956098771) + itemDef.name, var7, itemDef.itemID * 754919629, var15, var0.interfaceHash * -1081473899, 2108310878);
										}
									}
								}

								var12 = var0.interfaceActions;
								if (Client.aBool2744) {
									var12 = Class23.method341(var12, 2031052379);
								}

								if (null != var12) {
									for (var4 = 4; var4 >= 0; --var4) {
										if (null != var12[var4]) {
											var7 = 0;
											if (0 == var4) {
												var7 = 39;
											}

											if (1 == var4) {
												var7 = 40;
											}

											if (var4 == 2) {
												var7 = 41;
											}

											if (3 == var4) {
												var7 = 42;
											}

											if (var4 == 4) {
												var7 = 43;
											}

											Class4.method91(var12[var4], HuffmanEncoding.method690(16748608, -597811846) + itemDef.name, var7, itemDef.itemID * 754919629, var15, var0.interfaceHash * -1081473899, 2062771398);
										}
									}
								}

								Class4.method91(StringUtilities.EXAMINE_OPTION, HuffmanEncoding.method690(16748608, -1806251069) + itemDef.name, 1005, itemDef.itemID * 754919629, var15, var0.interfaceHash * -1081473899, 2048146797);
							}
						}
					}

					++var15;
				}
			}
		}

		if (var0.aBool1855) {
			if (Client.aBool2881) {
				if (Class50.method698(Class32.method576(var0, -64885960), -1762520146)) {
					if (32 == (Class68.anInt902 * 401025055 & 32)) {
						Class4.method91(Client.aString2941, Client.aString2819 + " " + Class47.aString668 + " " + var0.aString1821, 58, 0, var0.anInt1772 * -490007465, var0.interfaceHash * -1081473899, 2044989656);
					}
				}
			} else {
				for (var15 = 9; var15 >= 5; --var15) {
					String var16;
					if (!Class9.method231(Class32.method576(var0, 1867900684), var15, 328789076) && null == var0.anObjectArray1795) {
						var16 = null;
					} else if (var0.aStringArray1832 != null && var0.aStringArray1832.length > var15 && null != var0.aStringArray1832[var15] && var0.aStringArray1832[var15].trim().length() != 0) {
						var16 = var0.aStringArray1832[var15];
					} else {
						var16 = null;
					}

					if (null != var16) {
						Class4.method91(var16, var0.aString1821, 1007, var15 + 1, var0.anInt1772 * -490007465, var0.interfaceHash * -1081473899, 2131773219);
					}
				}

				var5 = AnimationDefinition.method2234(var0, (byte) 49);
				if (var5 != null) {
					Class4.method91(var5, var0.aString1821, 25, 0, var0.anInt1772 * -490007465, var0.interfaceHash * -1081473899, 1822347335);
				}

				for (var8 = 4; var8 >= 0; --var8) {
					String var17;
					if (!Class9.method231(Class32.method576(var0, 2070308596), var8, 567269649) && var0.anObjectArray1795 == null) {
						var17 = null;
					} else if (null != var0.aStringArray1832 && var0.aStringArray1832.length > var8 && var0.aStringArray1832[var8] != null && var0.aStringArray1832[var8].trim().length() != 0) {
						var17 = var0.aStringArray1832[var8];
					} else {
						var17 = null;
					}

					if (null != var17) {
						Class4.method91(var17, var0.aString1821, 57, 1 + var8, var0.anInt1772 * -490007465, var0.interfaceHash * -1081473899, 1895864650);
					}
				}

				if (Class1.method37(Class32.method576(var0, -251089339), -437064376)) {
					Class4.method91(StringUtilities.CONTINUE_MENU, "", 30, 0, var0.anInt1772 * -490007465, var0.interfaceHash * -1081473899, 1939368166);
				}
			}
		}
	}
}
