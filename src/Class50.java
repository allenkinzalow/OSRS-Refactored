public class Class50 implements Interface3 {

	static final int anInt692 = 54;
	static RSByteBuffer aClass108_Sub14_693;
	static Class50 aClass50_694 = new Class50(2);
	int anInt695;
	static int anInt696;
	static Class7 aClass7_697;
	static Class50 aClass50_698 = new Class50(0);
	static int anInt699;
	static final int anInt700 = 4;
	static Class50 aClass50_701 = new Class50(1);
	static PaletteSprite aClass108_Sub20_Sub15_Sub2_702;
	public static final int anInt703 = 240;
	public static final int anInt704 = 19136776;
	public static final int anInt705 = 192;
	static Class108_Sub11[] aClass108_Sub11Array706;


	public int method32(int var1) {
		return this.anInt695 * -1481777567;
	}

	static int method697(byte var0) {
		return (Class26.anInt356 += 421632683) * -1731096573 - 1;
	}

	public static boolean method698(int var0, int var1) {
		return 0 != (var0 >> 21 & 1);
	}

	static final void method699(int var0, int var1, int var2, short var3) {
		Friend.method660(-2023108021);
		Rasterizer2D.setRasterizationRect(var0, var1, var0 + Class63.mapBackSprite.anInt2413, Class63.mapBackSprite.anInt2414 + var1);
		if (2 != Client.anInt2935 * -1279723019 && Client.anInt2935 * -1279723019 != 5) {
			int rotation = Client.anInt2775 * 1889215063 + Client.anInt2771 * -44898889 & 2047;
			int var9 = Class108_Sub10.myPlayer.anInt2394 * 171470795 / 32 + 48;
			int var10 = 464 - Class108_Sub10.myPlayer.anInt2339 * 826764905 / 32;

			Class80.miniMapSprite.method2755(25 + var0, 5 + var1, 146, 151, var9, var10, rotation, 256 + Client.anInt2957 * 331969371, FloorDefinition.anIntArray2221, Class108_Sub20_Sub6.anIntArray2043);

			int var5;
			int var6;
			int var7;
			/* Render map info icons */
			for (var5 = 0; var5 < Client.mapIconAmt * 396638539; ++var5) {
				var6 = Client.mapIconTileX[var5] * 4 + 2 - Class108_Sub10.myPlayer.anInt2394 * 171470795 / 32;
				var7 = Client.mapIconTileY[var5] * 4 + 2 - Class108_Sub10.myPlayer.anInt2339 * 826764905 / 32;
				ProducingGraphicsBuffer.method1594(var0, var1, var6, var7, Client.visibleMapIcons[var5]);
			}

			int var11;
			int var12;
			for (var5 = 0; var5 < 104; ++var5) {
				for (var6 = 0; var6 < 104; ++var6) {
					Deque var15 = Client.groundItemArray[Class108_Sub20_Sub2.plane * -570926309][var5][var6];
					if (var15 != null) {
						var11 = var5 * 4 + 2 - Class108_Sub10.myPlayer.anInt2394 * 171470795 / 32;
						var12 = var6 * 4 + 2 - Class108_Sub10.myPlayer.anInt2339 * 826764905 / 32;
						ProducingGraphicsBuffer.method1594(var0, var1, var11, var12, Renderable.mapDotSprites[0]);
					}
				}
			}

			for (var5 = 0; var5 < Client.anInt2749 * -1829405175; ++var5) {
				NPC var14 = Client.localNPCs[Client.npcIndices[var5]];
				if (null != var14 && var14.method2731(644893995)) {
					NPCDefinition var17 = var14.definition;
					if (var17 != null && var17.anIntArray2185 != null) {
						var17 = var17.method2290(1244745727);
					}

					if (var17 != null && var17.renderOnMinimap && var17.isClickable) {
						var11 = var14.anInt2394 * 171470795 / 32 - Class108_Sub10.myPlayer.anInt2394 * 171470795 / 32;
						var12 = var14.anInt2339 * 826764905 / 32 - Class108_Sub10.myPlayer.anInt2339 * 826764905 / 32;
						ProducingGraphicsBuffer.method1594(var0, var1, var11, var12, Renderable.mapDotSprites[1]);
					}
				}
			}

			/* Draw players */
			for (var5 = 0; var5 < Client.numLocalPlayers * -43742683; ++var5) {
				Player var16 = Client.localPlayers[Client.playerIndices[var5]];
				if (var16 != null && var16.method2731(-1011231754) && !var16.aBool2682) {
					var7 = var16.anInt2394 * 171470795 / 32 - Class108_Sub10.myPlayer.anInt2394 * 171470795 / 32;
					var11 = var16.anInt2339 * 826764905 / 32 - Class108_Sub10.myPlayer.anInt2339 * 826764905 / 32;
					boolean var20 = false;
					if (GroundItem.method581(var16.playerName, true, (byte) 1)) {
						var20 = true;
					}

					boolean var4 = false;

					for (int var13 = 0; var13 < Class27.anInt363 * 1727166727; ++var13) {
						if (var16.playerName.equals(aClass108_Sub11Array706[var13].aString1662)) {
							var4 = true;
							break;
						}
					}

					boolean var21 = false;
					if (Class108_Sub10.myPlayer.playerTeamID * -1623092945 != 0 && 0 != var16.playerTeamID * -1623092945 && Class108_Sub10.myPlayer.playerTeamID * -1623092945 == var16.playerTeamID * -1623092945) {
						var21 = true;
					}

					if (var20) {
						ProducingGraphicsBuffer.method1594(var0, var1, var7, var11, Renderable.mapDotSprites[3]);
					} else if (var21) {
						ProducingGraphicsBuffer.method1594(var0, var1, var7, var11, Renderable.mapDotSprites[4]);
					} else if (var4) {
						ProducingGraphicsBuffer.method1594(var0, var1, var7, var11, Renderable.mapDotSprites[5]);
					} else {
						ProducingGraphicsBuffer.method1594(var0, var1, var7, var11, Renderable.mapDotSprites[2]);
					}
				}
			}

			if (Client.anInt2723 * -927004421 != 0 && Client.cycle * -637317861 % 20 < 10) {
				if (1 == Client.anInt2723 * -927004421 && Client.anInt2724 * -923839899 >= 0 && Client.anInt2724 * -923839899 < Client.localNPCs.length) {
					NPC var18 = Client.localNPCs[Client.anInt2724 * -923839899];
					if (var18 != null) {
						var6 = var18.anInt2394 * 171470795 / 32 - Class108_Sub10.myPlayer.anInt2394 * 171470795 / 32;
						var7 = var18.anInt2339 * 826764905 / 32 - Class108_Sub10.myPlayer.anInt2339 * 826764905 / 32;
						Class108_Sub20_Sub6.method2152(var0, var1, var6, var7, Class56.mapMarkerSprites[1], (byte) 127);
					}
				}

				if (2 == Client.anInt2723 * -927004421) {
					var5 = 2 + (Client.anInt2726 * -1027873740 - Class100.anInt1388 * 1052205508) - Class108_Sub10.myPlayer.anInt2394 * 171470795 / 32;
					var6 = Client.anInt2727 * 444255620 - Class15.anInt201 * 1617363908 + 2 - Class108_Sub10.myPlayer.anInt2339 * 826764905 / 32;
					Class108_Sub20_Sub6.method2152(var0, var1, var5, var6, Class56.mapMarkerSprites[1], (byte) 127);
				}

				if (Client.anInt2723 * -927004421 == 10 && Client.anInt2795 * 1790148709 >= 0 && Client.anInt2795 * 1790148709 < Client.localPlayers.length) {
					Player var19 = Client.localPlayers[Client.anInt2795 * 1790148709];
					if (var19 != null) {
						var6 = var19.anInt2394 * 171470795 / 32 - Class108_Sub10.myPlayer.anInt2394 * 171470795 / 32;
						var7 = var19.anInt2339 * 826764905 / 32 - Class108_Sub10.myPlayer.anInt2339 * 826764905 / 32;
						Class108_Sub20_Sub6.method2152(var0, var1, var6, var7, Class56.mapMarkerSprites[1], (byte) 84);
					}
				}
			}

			if (0 != Client.anInt2933 * -1708054643) {
				var5 = 2 + Client.anInt2933 * 1757716020 - Class108_Sub10.myPlayer.anInt2394 * 171470795 / 32;
				var6 = Client.anInt2894 * -520325596 + 2 - Class108_Sub10.myPlayer.anInt2339 * 826764905 / 32;
				ProducingGraphicsBuffer.method1594(var0, var1, var5, var6, Class56.mapMarkerSprites[0]);
			}

			if (!Class108_Sub10.myPlayer.aBool2682) {
				Rasterizer2D.drawFilledRectangle(var0 + 93 + 4, 82 + var1 - 4, 3, 3, 16777215);
			}
		} else {
			Rasterizer2D.method2511(25 + var0, 5 + var1, 0, FloorDefinition.anIntArray2221, Class108_Sub20_Sub6.anIntArray2043);
		}

		if (Client.anInt2935 * -1279723019 < 3) {
			Class63.compassSprite.method2755(var0, var1, 33, 33, 25, 25, Client.anInt2771 * -44898889, 256, Ignore.anIntArray397, ChatMessagesContainer.anIntArray332);
		} else {
			Rasterizer2D.method2511(var0, var1, 0, Ignore.anIntArray397, ChatMessagesContainer.anIntArray332);
		}

		if (Client.aBoolArray2831[var2]) {
			Class63.mapBackSprite.drawSprite(var0, var1);
		}

		Client.aBoolArray2910[var2] = true;
	}

	static final void renderInterface(int interfaceID, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (AbstractIndex.method1073(interfaceID, 2021367900)) {
			Client.aClass108_Sub17Array2963 = null;
			ClientScriptDefinition.renderInterfaceComponents(RSInterface.interface_cache[interfaceID], -1, var1, var2, var3, var4, var5, var6, var7, 2123082435);
			if (null != Client.aClass108_Sub17Array2963) {
				ClientScriptDefinition.renderInterfaceComponents(Client.aClass108_Sub17Array2963, -1412584499, var1, var2, var3, var4, Class43.anInt619 * 1576174687, EquipmentKit.anInt1344 * 1005459417, var7, 1843051657);
				Client.aClass108_Sub17Array2963 = null;
			}
		} else if (var7 != -1) {
			Client.aBoolArray2909[var7] = true;
		} else {
			for (int var9 = 0; var9 < 100; ++var9) {
				Client.aBoolArray2909[var9] = true;
			}

		}
	}

	static final void method701(int var0, int var1, int var2, int var3) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				RegionReference.tileHeights[var0][var1 + var4][var2 + var5] = 0;
			}
		}

		if (var1 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				RegionReference.tileHeights[var0][var1][var2 + var4] = RegionReference.tileHeights[var0][var1 - 1][var2 + var4];
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				RegionReference.tileHeights[var0][var1 + var4][var2] = RegionReference.tileHeights[var0][var4 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && 0 != RegionReference.tileHeights[var0][var1 - 1][var2]) {
			RegionReference.tileHeights[var0][var1][var2] = RegionReference.tileHeights[var0][var1 - 1][var2];
		} else if (var2 > 0 && 0 != RegionReference.tileHeights[var0][var1][var2 - 1]) {
			RegionReference.tileHeights[var0][var1][var2] = RegionReference.tileHeights[var0][var1][var2 - 1];
		} else if (var1 > 0) {
			if (var2 > 0) {
				if (0 != RegionReference.tileHeights[var0][var1 - 1][var2 - 1]) {
					RegionReference.tileHeights[var0][var1][var2] = RegionReference.tileHeights[var0][var1 - 1][var2 - 1];
				}
			}
		}
	}

	Class50(int var1) {
		this.anInt695 = var1 * 873940385;
	}
}
