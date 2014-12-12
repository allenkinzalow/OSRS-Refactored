public class Class50 implements Interface3 {

	static RSByteBuffer aClass108_Sub14_693;
	static Class50 aClass50_694 = new Class50(2);
	int anInt695;
	static int anInt696;
	static Class7 aClass7_697;
	static Class50 aClass50_698 = new Class50(0);
	static int anInt699;
	static Class50 aClass50_701 = new Class50(1);
	static PaletteSprite aClass108_Sub20_Sub15_Sub2_702;
	static FriendsChatMember[] friendsChatList;


	public int method32(int var1) {
		return this.anInt695 * -1481777567;
	}

	static int method697(byte var0) {
		return (Class26.anInt356 += 421632683) * -1731096573 - 1;
	}

	public static boolean method698(int var0, int var1) {
		return 0 != (var0 >> 21 & 1);
	}

	static final void method699(int xPos, int yPos, int var2, short var3) {
		Friend.method660(-2023108021);
		Rasterizer2D.setRasterizationRect(xPos, yPos, xPos + Class63.mapBackSprite.anInt2413, Class63.mapBackSprite.anInt2414 + yPos);
		if (2 != Client.anInt2935 * -1279723019 && Client.anInt2935 * -1279723019 != 5) {
			int rotation = Client.anInt2775 * 1889215063 + Client.anInt2771 * -44898889 & 2047;
			int var9 = Player.myPlayer.anInt2394 * 171470795 / 32 + 48;
			int var10 = 464 - Player.myPlayer.anInt2339 * 826764905 / 32;

			Class80.miniMapSprite.method2755(25 + xPos, 5 + yPos, 146, 151, var9, var10, rotation, 256 + Client.anInt2957 * 331969371, OverlayFloorDefinition.anIntArray2221, Varp.anIntArray2043);

			int var5;
			int var6;
			int var7;
			/* Render map info icons */
			for (var5 = 0; var5 < Client.mapIconAmt * 396638539; ++var5) {
				var6 = Client.mapIconTileX[var5] * 4 + 2 - Player.myPlayer.anInt2394 * 171470795 / 32;
				var7 = Client.mapIconTileY[var5] * 4 + 2 - Player.myPlayer.anInt2339 * 826764905 / 32;
				ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var6, var7, Client.visibleMapIcons[var5]);
			}

			int var11;
			int var12;
			for (int x = 0; x < 104; ++x) {
				for (int y = 0; y < 104; ++y) {
					Deque groundItem = Client.groundItemArray[VarpBit.plane * -570926309][x][y];
					if (groundItem != null) {
						var11 = x * 4 + 2 - Player.myPlayer.anInt2394 * 171470795 / 32;
						var12 = y * 4 + 2 - Player.myPlayer.anInt2339 * 826764905 / 32;
						ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var11, var12, Renderable.mapDotSprites[0]);
					}
				}
			} 

			for (int npcIndex = 0; npcIndex < Client.anInt2749 * -1829405175; ++npcIndex) {
				NPC var14 = Client.localNPCs[Client.npcIndices[npcIndex]];
				if (null != var14 && var14.method2731(644893995)) {
					NPCDefinition npcDef = var14.definition;
					if (npcDef != null && npcDef.anIntArray2185 != null) {
						npcDef = npcDef.method2290(1244745727);
					}

					if (npcDef != null && npcDef.renderOnMinimap && npcDef.isClickable) {
						var11 = var14.anInt2394 * 171470795 / 32 - Player.myPlayer.anInt2394 * 171470795 / 32;
						var12 = var14.anInt2339 * 826764905 / 32 - Player.myPlayer.anInt2339 * 826764905 / 32;
						ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var11, var12, Renderable.mapDotSprites[1]);
					}
				}
			}

			/* Draw players */
			for (int playerIndex = 0; playerIndex < Client.numLocalPlayers * -43742683; ++playerIndex) {
				Player player = Client.localPlayers[Client.playerIndices[playerIndex]];
				if (player != null && player.method2731(-1011231754) && !player.aBool2682) {
					var7 = player.anInt2394 * 171470795 / 32 - Player.myPlayer.anInt2394 * 171470795 / 32;
					var11 = player.anInt2339 * 826764905 / 32 - Player.myPlayer.anInt2339 * 826764905 / 32;
					boolean isFriend = false;
					if (Friend.isFriend(player.playerName, true, (byte) 1)) {
						isFriend = true;
					}

					boolean isFriendsChat = false;

					for (int friendsChatIndex = 0; friendsChatIndex < Class27.friendsChatListCount * 1727166727; ++friendsChatIndex) {
						if (player.playerName.equals(friendsChatList[friendsChatIndex].username)) {
							isFriendsChat = true;
							break;
						}
					}

					boolean onTeam = false;
					if (Player.myPlayer.playerTeamID * -1623092945 != 0 && 0 != player.playerTeamID * -1623092945 && Player.myPlayer.playerTeamID * -1623092945 == player.playerTeamID * -1623092945) {
						onTeam = true;
					}

					if (isFriend) {
						ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var7, var11, Renderable.mapDotSprites[3]);
					} else if (onTeam) {
						ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var7, var11, Renderable.mapDotSprites[4]);
					} else if (isFriendsChat) {
						ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var7, var11, Renderable.mapDotSprites[5]);
					} else {
						ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var7, var11, Renderable.mapDotSprites[2]);
					}
				}
			}

			if (Client.anInt2723 * -927004421 != 0 && Client.cycle * -637317861 % 20 < 10) {
				if (1 == Client.anInt2723 * -927004421 && Client.anInt2724 * -923839899 >= 0 && Client.anInt2724 * -923839899 < Client.localNPCs.length) {
					NPC npcDef = Client.localNPCs[Client.anInt2724 * -923839899];
					if (npcDef != null) {
						var6 = npcDef.anInt2394 * 171470795 / 32 - Player.myPlayer.anInt2394 * 171470795 / 32;
						var7 = npcDef.anInt2339 * 826764905 / 32 - Player.myPlayer.anInt2339 * 826764905 / 32;
						Varp.method2152(xPos, yPos, var6, var7, Class56.mapMarkerSprites[1], (byte) 127);
					}
				}

				if (2 == Client.anInt2723 * -927004421) {
					var5 = 2 + (Client.anInt2726 * -1027873740 - Class100.anInt1388 * 1052205508) - Player.myPlayer.anInt2394 * 171470795 / 32;
					var6 = Client.anInt2727 * 444255620 - Class15.anInt201 * 1617363908 + 2 - Player.myPlayer.anInt2339 * 826764905 / 32;
					Varp.method2152(xPos, yPos, var5, var6, Class56.mapMarkerSprites[1], (byte) 127);
				}

				if (Client.anInt2723 * -927004421 == 10 && Client.anInt2795 * 1790148709 >= 0 && Client.anInt2795 * 1790148709 < Client.localPlayers.length) {
					Player player = Client.localPlayers[Client.anInt2795 * 1790148709];
					if (player != null) {
						var6 = player.anInt2394 * 171470795 / 32 - Player.myPlayer.anInt2394 * 171470795 / 32;
						var7 = player.anInt2339 * 826764905 / 32 - Player.myPlayer.anInt2339 * 826764905 / 32;
						Varp.method2152(xPos, yPos, var6, var7, Class56.mapMarkerSprites[1], (byte) 84);
					}
				}
			}

			if (0 != Client.anInt2933 * -1708054643) {
				var5 = 2 + Client.anInt2933 * 1757716020 - Player.myPlayer.anInt2394 * 171470795 / 32;
				var6 = Client.anInt2894 * -520325596 + 2 - Player.myPlayer.anInt2339 * 826764905 / 32;
				ProducingGraphicsBuffer.renderMapDotSprite(xPos, yPos, var5, var6, Class56.mapMarkerSprites[0]);
			}

			if (!Player.myPlayer.aBool2682) {
				Rasterizer2D.drawFilledRectangle(xPos + 93 + 4, 82 + yPos - 4, 3, 3, 16777215);
			}
		} else {
			Rasterizer2D.method2511(25 + xPos, 5 + yPos, 0, OverlayFloorDefinition.anIntArray2221, Varp.anIntArray2043);
		}

		if (Client.anInt2935 * -1279723019 < 3) {
			Class63.compassSprite.method2755(xPos, yPos, 33, 33, 25, 25, Client.anInt2771 * -44898889, 256, Ignore.anIntArray397, ChatMessagesContainer.anIntArray332);
		} else {
			Rasterizer2D.method2511(xPos, yPos, 0, Ignore.anIntArray397, ChatMessagesContainer.anIntArray332);
		}

		if (Client.aBoolArray2831[var2]) {
			Class63.mapBackSprite.drawSprite(xPos, yPos);
		}

		Client.aBoolArray2910[var2] = true;
	}

	static final void renderInterface(int interfaceID, int x, int y, int width, int height, int var5, int var6, int var7, int var8) {
		if (AbstractIndex.method1073(interfaceID, 2021367900)) {
			Client.aClass108_Sub17Array2963 = null;
			ClientScriptDefinition.renderInterfaceComponents(RSInterface.interface_cache[interfaceID], -1, x, y, width, height, var5, var6, var7, 2123082435);
			if (null != Client.aClass108_Sub17Array2963) {
				ClientScriptDefinition.renderInterfaceComponents(Client.aClass108_Sub17Array2963, -1412584499, x, y, width, height, Class43.anInt619 * 1576174687, EquipmentKit.anInt1344 * 1005459417, var7, 1843051657);
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
