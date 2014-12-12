public final class NPC extends Entity {

	public static String[] aStringArray2657;
	NPCDefinition definition;


	static final void method3165(int var0, int var1, int var2, int var3, int var4) {
		Rasterizer2D.setRasterizationRect(var0, var1, var2 + var0, var3 + var1);
		Rasterizer3D.method2970();
		Client.anInt2807 -= 691585913;
		Class108_Sub21.method1989(Class2.aClass2_25, -288777778);
		boolean var5 = false;
		int var7;
		if (Client.anInt2837 * 310098017 >= 0) {
			for (var7 = 0; var7 < Client.numLocalPlayers * -43742683; ++var7) {
				if (Client.anInt2837 * 310098017 == Client.playerIndices[var7]) {
					var5 = true;
					break;
				}
			}
		}

		if (var5) {
			Class108_Sub21.method1989(Class2.aClass2_24, 2002112236);
		}

		CacheIndexRequest.method1928(true, -2006823826);
		Class108_Sub21.method1989(var5 ? Class2.aClass2_15 : Class2.aClass2_14, -1381521255);
		CacheIndexRequest.method1928(false, -2006823826);

		int var14;
		for (Projectile projectile = (Projectile) Client.projectileDeque.getFront(); null != projectile; projectile = (Projectile) Client.projectileDeque.getNext()) {
			if (projectile.anInt2524 * -464324267 == VarpBit.plane * -570926309 && Client.cycle * -637317861 <= projectile.anInt2527 * -976369325) {
				if (Client.cycle * -637317861 >= projectile.anInt2528 * 2111882005) {
					if (projectile.anInt2533 * 47163971 > 0) {
						NPC var9 = Client.localNPCs[projectile.anInt2533 * 47163971 - 1];
						if (var9 != null && var9.anInt2394 * 171470795 >= 0 && var9.anInt2394 * 171470795 < 13312 && var9.anInt2339 * 826764905 >= 0 && var9.anInt2339 * 826764905 < 13312) {
							projectile.method2979(var9.anInt2394 * 171470795, var9.anInt2339 * 826764905, ClientScript.getFloorDrawHeight(var9.anInt2394 * 171470795, var9.anInt2339 * 826764905, projectile.anInt2524 * -464324267, 1354043634) - projectile.anInt2542 * -1991507663, Client.cycle * -637317861, (byte) 0);
						}
					}

					if (projectile.anInt2533 * 47163971 < 0) {
						var14 = -(projectile.anInt2533 * 47163971) - 1;
						Player player;
						if (var14 == Client.anInt2823 * 1800645115) {
							player = Player.myPlayer;
						} else {
							player = Client.localPlayers[var14];
						}

						if (player != null && player.anInt2394 * 171470795 >= 0 && player.anInt2394 * 171470795 < 13312 && player.anInt2339 * 826764905 >= 0 && player.anInt2339 * 826764905 < 13312) {
							projectile.method2979(player.anInt2394 * 171470795, player.anInt2339 * 826764905, ClientScript.getFloorDrawHeight(player.anInt2394 * 171470795, player.anInt2339 * 826764905, projectile.anInt2524 * -464324267, 2038876234) - projectile.anInt2542 * -1991507663, Client.cycle * -637317861, (byte) 0);
						}
					}

					projectile.process(Client.anInt2780 * 468305965, -1743142671);
					Class56.gameScene.method412(VarpBit.plane * -570926309, (int) projectile.xPosition, (int) projectile.yPosition, (int) projectile.zPosition, 60, projectile, projectile.rotationY * -1160487113, -1, false);
				}
			} else {
				projectile.unlink();
			}
		}

		ChatMessage.method2018((byte) -65);
		int var28;
		if (!Client.aBool2886) {
			var7 = Client.anInt2816 * 1501284499;
			if (Client.anInt2754 * 1184886937 / 256 > var7) {
				var7 = Client.anInt2754 * 1184886937 / 256;
			}

			if (Client.aBoolArray2948[4] && Client.anIntArray2950[4] + 128 > var7) {
				var7 = 128 + Client.anIntArray2950[4];
			}

			var28 = Client.anInt2771 * -44898889 + Client.anInt2772 * -1122254441 & 2047;
			GroundItem.method583(Item.anInt2616 * -1461479521, ClientScript.getFloorDrawHeight(Player.myPlayer.anInt2394 * 171470795, Player.myPlayer.anInt2339 * 826764905, VarpBit.plane * -570926309, 1152296478) - 50, GroundItem.anInt480 * -1594540275, var7, var28, var7 * 3 + 600, (byte) -124);
		}

		int var6;
		int var8;
		int var11;
		int var12;
		int var15;
		int var19;
		int var21;
		if (!Client.aBool2886) {
			if (Ignore.aClass37_386.aBool528) {
				var28 = VarpBit.plane * -570926309;
			} else {
				var14 = 3;
				if (RuntimeException_Sub1.anInt2625 * -611182019 < 310) {
					var11 = BZip2Context.anInt279 * 1217916071 >> 7;
					var19 = CacheFileAccessor.anInt1490 * 1498802843 >> 7;
					var12 = Player.myPlayer.anInt2394 * 171470795 >> 7;
					var21 = Player.myPlayer.anInt2339 * 826764905 >> 7;
					if (0 != (RegionReference.mapTileSettings[VarpBit.plane * -570926309][var11][var19] & 4)) {
						var14 = VarpBit.plane * -570926309;
					}

					if (var12 > var11) {
						var8 = var12 - var11;
					} else {
						var8 = var11 - var12;
					}

					int var13;
					if (var21 > var19) {
						var13 = var21 - var19;
					} else {
						var13 = var19 - var21;
					}

					if (var8 > var13) {
						var15 = var13 * 65536 / var8;
						var6 = '\u8000';

						while (var11 != var12) {
							if (var11 < var12) {
								++var11;
							} else if (var11 > var12) {
								--var11;
							}

							if ((RegionReference.mapTileSettings[VarpBit.plane * -570926309][var11][var19] & 4) != 0) {
								var14 = VarpBit.plane * -570926309;
							}

							var6 += var15;
							if (var6 >= 65536) {
								var6 -= 65536;
								if (var19 < var21) {
									++var19;
								} else if (var19 > var21) {
									--var19;
								}

								if (0 != (RegionReference.mapTileSettings[VarpBit.plane * -570926309][var11][var19] & 4)) {
									var14 = VarpBit.plane * -570926309;
								}
							}
						}
					} else {
						var15 = var8 * 65536 / var13;
						var6 = '\u8000';

						while (var21 != var19) {
							if (var19 < var21) {
								++var19;
							} else if (var19 > var21) {
								--var19;
							}

							if ((RegionReference.mapTileSettings[VarpBit.plane * -570926309][var11][var19] & 4) != 0) {
								var14 = VarpBit.plane * -570926309;
							}

							var6 += var15;
							if (var6 >= 65536) {
								var6 -= 65536;
								if (var11 < var12) {
									++var11;
								} else if (var11 > var12) {
									--var11;
								}

								if (0 != (RegionReference.mapTileSettings[VarpBit.plane * -570926309][var11][var19] & 4)) {
									var14 = VarpBit.plane * -570926309;
								}
							}
						}
					}
				}

				if (0 != (RegionReference.mapTileSettings[VarpBit.plane * -570926309][Player.myPlayer.anInt2394 * 171470795 >> 7][Player.myPlayer.anInt2339 * 826764905 >> 7] & 4)) {
					var14 = VarpBit.plane * -570926309;
				}

				var28 = var14;
			}

			var7 = var28;
		} else {
			var7 = Class56.method745(865552416);
		}

		var28 = BZip2Context.anInt279 * 1217916071;
		var14 = ClientScript.anInt1645 * 699100371;
		var11 = CacheFileAccessor.anInt1490 * 1498802843;
		var19 = RuntimeException_Sub1.anInt2625 * -611182019;
		var12 = GameConnection.anInt811 * -1717637923;

		for (var21 = 0; var21 < 5; ++var21) {
			if (Client.aBoolArray2948[var21]) {
				var8 = (int) (Math.random() * (double) (Client.anIntArray2725[var21] * 2 + 1) - (double) Client.anIntArray2725[var21] + Math.sin((double) Client.anIntArray2952[var21] * ((double) Client.anIntArray2853[var21] / 100.0D)) * (double) Client.anIntArray2950[var21]);
				if (0 == var21) {
					BZip2Context.anInt279 += var8 * 1616837399;
				}

				if (1 == var21) {
					ClientScript.anInt1645 += var8 * 1023920987;
				}

				if (var21 == 2) {
					CacheFileAccessor.anInt1490 += var8 * 365620115;
				}

				if (var21 == 3) {
					GameConnection.anInt811 = (GameConnection.anInt811 * -1717637923 + var8 & 2047) * -422753419;
				}

				if (4 == var21) {
					RuntimeException_Sub1.anInt2625 += var8 * -1558852331;
					if (RuntimeException_Sub1.anInt2625 * -611182019 < 128) {
						RuntimeException_Sub1.anInt2625 = -1964602752;
					}

					if (RuntimeException_Sub1.anInt2625 * -611182019 > 383) {
						RuntimeException_Sub1.anInt2625 = -39988629;
					}
				}
			}
		}

		var21 = MouseInputHandler.mouseX * -367052265;
		var8 = MouseInputHandler.mouseY * 1533395117;
		if (0 != MouseInputHandler.clickType * 1629072957) {
			var21 = MouseInputHandler.mousePressX * 472132205;
			var8 = MouseInputHandler.mousePressY * 1498262827;
		}

		if (var21 >= var0 && var21 < var2 + var0 && var8 >= var1 && var8 < var1 + var3) {
			ModelRasterizer.aBool2486 = true;
			ModelRasterizer.anInt2490 = 0;
			ModelRasterizer.anInt2487 = var21 - var0;
			ModelRasterizer.anInt2488 = var8 - var1;
		} else {
			ModelRasterizer.aBool2486 = false;
			ModelRasterizer.anInt2490 = 0;
		}

		Friend.method660(-626475724);
		Rasterizer2D.drawFilledRectangle(var0, var1, var2, var3, 0);
		Friend.method660(1883242703);
		Class56.gameScene.method439(BZip2Context.anInt279 * 1217916071, ClientScript.anInt1645 * 699100371, CacheFileAccessor.anInt1490 * 1498802843, RuntimeException_Sub1.anInt2625 * -611182019, GameConnection.anInt811 * -1717637923, var7);
		Friend.method660(1387450619);
		Class56.gameScene.method415();
		Client.anInt2804 = 0;
		boolean var29 = false;
		var15 = -1;

		for (var6 = -1; var6 < Client.anInt2749 * -1829405175 + Client.numLocalPlayers * -43742683; ++var6) {
			Object var22;
			if (-1 == var6) {
				var22 = Player.myPlayer;
			} else if (var6 < Client.numLocalPlayers * -43742683) {
				var22 = Client.localPlayers[Client.playerIndices[var6]];
				if (Client.anInt2837 * 310098017 == Client.playerIndices[var6]) {
					var29 = true;
					var15 = var6;
					continue;
				}
			} else {
				var22 = Client.localNPCs[Client.npcIndices[var6 - Client.numLocalPlayers * -43742683]];
			}

			Class32.method578((Entity) var22, var6, var0, var1, var2, var3, 1325241763);
		}

		if (var29) {
			Class32.method578(Client.localPlayers[Client.anInt2837 * 310098017], var15, var0, var1, var2, var3, 1325241763);
		}

		for (var6 = 0; var6 < Client.anInt2804 * 1837064243; ++var6) {
			int var32 = Client.anIntArray2798[var6];
			int var23 = Client.anIntArray2799[var6];
			int var25 = Client.anIntArray2817[var6];
			int var24 = Client.anIntArray2800[var6];
			boolean var10 = true;

			while (var10) {
				var10 = false;

				for (int var16 = 0; var16 < var6; ++var16) {
					if (2 + var23 > Client.anIntArray2799[var16] - Client.anIntArray2800[var16] && var23 - var24 < 2 + Client.anIntArray2799[var16] && var32 - var25 < Client.anIntArray2798[var16] + Client.anIntArray2817[var16] && var32 + var25 > Client.anIntArray2798[var16] - Client.anIntArray2817[var16] && Client.anIntArray2799[var16] - Client.anIntArray2800[var16] < var23) {
						var23 = Client.anIntArray2799[var16] - Client.anIntArray2800[var16];
						var10 = true;
					}
				}
			}

			Client.anInt2808 = Client.anIntArray2798[var6] * 1626005023;
			Client.anInt2809 = (Client.anIntArray2799[var6] = var23) * 1121153661;
			String var31 = Client.aStringArray2805[var6];
			if (0 == Client.anInt2867 * -94535165) {
				int var18 = 16776960;
				if (Client.anIntArray2776[var6] < 6) {
					var18 = Client.anIntArray2908[Client.anIntArray2776[var6]];
				}

				if (6 == Client.anIntArray2776[var6]) {
					var18 = Client.anInt2807 * 1693763895 % 20 < 10 ? 16711680 : 16776960;
				}

				if (7 == Client.anIntArray2776[var6]) {
					var18 = Client.anInt2807 * 1693763895 % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.anIntArray2776[var6] == 8) {
					var18 = Client.anInt2807 * 1693763895 % 20 < 10 ? '\ub000' : 8454016;
				}

				int var20;
				if (Client.anIntArray2776[var6] == 9) {
					var20 = 150 - Client.anIntArray2947[var6];
					if (var20 < 50) {
						var18 = 16711680 + var20 * 1280;
					} else if (var20 < 100) {
						var18 = 16776960 - (var20 - 50) * 327680;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 5 + '\uff00';
					}
				}

				if (Client.anIntArray2776[var6] == 10) {
					var20 = 150 - Client.anIntArray2947[var6];
					if (var20 < 50) {
						var18 = var20 * 5 + 16711680;
					} else if (var20 < 100) {
						var18 = 16711935 - (var20 - 50) * 327680;
					} else if (var20 < 150) {
						var18 = 255 + (var20 - 100) * 327680 - (var20 - 100) * 5;
					}
				}

				if (11 == Client.anIntArray2776[var6]) {
					var20 = 150 - Client.anIntArray2947[var6];
					if (var20 < 50) {
						var18 = 16777215 - var20 * 327685;
					} else if (var20 < 100) {
						var18 = '\uff00' + (var20 - 50) * 327685;
					} else if (var20 < 150) {
						var18 = 16777215 - (var20 - 100) * 327680;
					}
				}

				if (Client.anIntArray2763[var6] == 0) {
					RSTypeFace.b12_full_font.drawStringCenter(var31, Client.anInt2808 * 1642143199 + var0, var1 + Client.anInt2809 * -2062084395, var18, 0);
				}

				if (Client.anIntArray2763[var6] == 1) {
					RSTypeFace.b12_full_font.method3107(var31, var0 + Client.anInt2808 * 1642143199, var1 + Client.anInt2809 * -2062084395, var18, 0, Client.anInt2807 * 1693763895);
				}

				if (2 == Client.anIntArray2763[var6]) {
					RSTypeFace.b12_full_font.method3131(var31, Client.anInt2808 * 1642143199 + var0, Client.anInt2809 * -2062084395 + var1, var18, 0, Client.anInt2807 * 1693763895);
				}

				if (Client.anIntArray2763[var6] == 3) {
					RSTypeFace.b12_full_font.method3100(var31, var0 + Client.anInt2808 * 1642143199, var1 + Client.anInt2809 * -2062084395, var18, 0, Client.anInt2807 * 1693763895, 150 - Client.anIntArray2947[var6]);
				}

				if (Client.anIntArray2763[var6] == 4) {
					var20 = (150 - Client.anIntArray2947[var6]) * (RSTypeFace.b12_full_font.getTextWidth(var31) + 100) / 150;
					Rasterizer2D.method2497(var0 + Client.anInt2808 * 1642143199 - 50, var1, 50 + var0 + Client.anInt2808 * 1642143199, var1 + var3);
					RSTypeFace.b12_full_font.drawString(var31, 50 + var0 + Client.anInt2808 * 1642143199 - var20, Client.anInt2809 * -2062084395 + var1, var18, 0);
					Rasterizer2D.setRasterizationRect(var0, var1, var0 + var2, var3 + var1);
				}

				if (5 == Client.anIntArray2763[var6]) {
					var20 = 150 - Client.anIntArray2947[var6];
					int var17 = 0;
					if (var20 < 25) {
						var17 = var20 - 25;
					} else if (var20 > 125) {
						var17 = var20 - 125;
					}

					Rasterizer2D.method2497(var0, Client.anInt2809 * -2062084395 + var1 - RSTypeFace.b12_full_font.anInt2643 - 1, var2 + var0, 5 + Client.anInt2809 * -2062084395 + var1);
					RSTypeFace.b12_full_font.drawStringCenter(var31, var0 + Client.anInt2808 * 1642143199, var17 + var1 + Client.anInt2809 * -2062084395, var18, 0);
					Rasterizer2D.setRasterizationRect(var0, var1, var2 + var0, var3 + var1);
				}
			} else {
				RSTypeFace.b12_full_font.drawStringCenter(var31, var0 + Client.anInt2808 * 1642143199, Client.anInt2809 * -2062084395 + var1, 16776960, 0);
			}
		}

		if (2 == Client.anInt2723 * -927004421) {
			ChatMessage.method2017(Client.anInt2729 * -2009233023 + (Client.anInt2726 * -1330710259 - Class100.anInt1388 * 263051377 << 7), (Client.anInt2727 * -962677919 - Class15.anInt201 * -1743142671 << 7) + Client.anInt2832 * -786242817, Client.anInt2728 * -208332298, (short) 2048);
			if (Client.anInt2808 * 1642143199 > -1 && Client.cycle * -637317861 % 20 < 10) {
				Class9.hintIconSprites[0].method2746(Client.anInt2808 * 1642143199 + var0 - 12, var1 + Client.anInt2809 * -2062084395 - 28);
			}
		}

		((TextureLoader) Rasterizer3D.anInterface2_2501).method378(Client.anInt2780 * 468305965, 1052896482);
		Js5Request.method2600(var0, var1, var2, var3, -1134649173);
		BZip2Context.anInt279 = var28 * 1616837399;
		ClientScript.anInt1645 = var14 * 1023920987;
		CacheFileAccessor.anInt1490 = var11 * 365620115;
		RuntimeException_Sub1.anInt2625 = var19 * -1558852331;
		GameConnection.anInt811 = var12 * -422753419;
		if (Client.aBool2874) {
			byte var30 = 0;
			var15 = var30 + Class78.anInt1216 * 1668849075 + Class78.anInt1218 * 1577549363;
			if (0 == var15) {
				Client.aBool2874 = false;
			}
		}

		if (Client.aBool2874) {
			Rasterizer2D.drawFilledRectangle(var0, var1, var2, var3, 0);
			GameDefinition.method1107(StringUtilities.LOADING_PLEASE_WAIT, false, -448477091);
		}
	}

	protected final ModelRasterizer getModelRasterizer(byte var1) {
		if (this.definition == null) {
			return null;
		} else {
			AnimationDefinition var5 = -1 != this.anInt2368 * 1647325343 && 0 == this.anInt2371 * 843883743 ? AnimationDefinition.getAnimDefForID(this.anInt2368 * 1647325343, 2106941754) : null;
			AnimationDefinition var6 = -1 != this.anInt2365 * 1103885695 && (this.anInt2365 * 1103885695 != this.standAnimationID * -532414055 || null == var5) ? AnimationDefinition.getAnimDefForID(this.anInt2365 * 1103885695, 2104925215) : null;
			ModelRasterizer rasterizer = this.definition.method2288(var5, this.anInt2341 * -2111206063, var6, this.anInt2366 * -65543943, (byte) 1);
			if (null != rasterizer) {
				rasterizer.method2855();
				this.anInt2386 = rasterizer.modelHeight * 1878279385;
				if (this.anInt2373 * 1305815823 != -1 && -1 != this.anInt2374 * -766701345) {
					ModelRasterizer var3 = SpotAnim.getSpotAnimForID(this.anInt2373 * 1305815823, (byte) 0).getModelRasterizer(this.anInt2374 * -766701345, -380943559);
					if (var3 != null) {
						var3.method2865(0, -(this.anInt2388 * 833972513), 0);
						ModelRasterizer[] var4 = new ModelRasterizer[]{rasterizer, var3};
						rasterizer = new ModelRasterizer(var4, 2);
					}
				}

				if (this.definition.tileSpacesOccupied * -87058581 == 1) {
					rasterizer.aBool2457 = true;
				}

				return rasterizer;
			} else {
				return null;
			}
		}
	}

	final boolean method2731(int var1) {
		return this.definition != null;
	}

	static final void renderMinimap(int plane, byte var1) {
		int[] mapPixels = Class80.miniMapSprite.pixels;
		int mapLength = mapPixels.length;

		for (int pixel = 0; pixel < mapLength; ++pixel) {
			mapPixels[pixel] = 0;
		}

		int var7;
		int xTile;
		for (int y = 1; y < 103; ++y) {
			var7 = (103 - y) * 2048 + 24628;

			for (int x = 1; x < 103; ++x) {
				if (0 == (RegionReference.mapTileSettings[plane][x][y] & 24)) {
					Class56.gameScene.drawMinimapTile(mapPixels, var7, 512, plane, x, y);
				}

				if (plane < 3 && (RegionReference.mapTileSettings[plane + 1][x][y] & 8) != 0) {
					Class56.gameScene.drawMinimapTile(mapPixels, var7, 512, plane + 1, x, y);
				}

				var7 += 4;
			}
		}

		int primaryColor = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
		int secondaryColor = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
		Class80.miniMapSprite.method2744();

		int yTile;
		for (int y = 1; y < 103; ++y) {
			for (int x = 1; x < 103; ++x) {
				if ((RegionReference.mapTileSettings[plane][x][y] & 24) == 0) {
					Class77.drawMapScenes(plane, x, y, primaryColor, secondaryColor, -1813376301);
				}

				if (plane < 3 && (RegionReference.mapTileSettings[plane + 1][x][y] & 8) != 0) {
					Class77.drawMapScenes(plane + 1, x, y, primaryColor, secondaryColor, -1813376301);
				}
			}
		}

		Client.mapIconAmt = 0;

		for (xTile = 0; xTile < 104; ++xTile) {
			for (yTile = 0; yTile < 104; ++yTile) {
				int var6 = Class56.gameScene.fetchGroundTileDecorationHash(VarpBit.plane * -570926309, xTile, yTile);
				if (var6 != 0) {
					var6 = var6 >> 14 & 32767;
					int mapIconID = ChatMessagesContainer.getObjectDefForID(var6, (byte) 0).mapIconID * 334594829;
					if (mapIconID >= 0) {
						int xClip = xTile;
						int yClip = yTile;
						if (mapIconID != 22 && mapIconID != 29 && mapIconID != 34 && mapIconID != 36 && 46 != mapIconID && mapIconID != 47 && mapIconID != 48) {
							int[][] clipData = Client.clippingPlanes[VarpBit.plane * -570926309].clipData;

							for (int clipIndex = 0; clipIndex < 10; ++clipIndex) {
								int var9 = (int) (Math.random() * 4.0D);
								if (var9 == 0 && xClip > 0 && xClip > xTile - 3 && 0 == (clipData[xClip - 1][yClip] & 19136776)) {
									--xClip;
								}

								if (1 == var9 && xClip < 103 && xClip < 3 + xTile && 0 == (clipData[1 + xClip][yClip] & 19136896)) {
									++xClip;
								}

								if (2 == var9 && yClip > 0 && yClip > yTile - 3 && (clipData[xClip][yClip - 1] & 19136770) == 0) {
									--yClip;
								}

								if (3 == var9 && yClip < 103 && yClip < yTile + 3 && (clipData[xClip][yClip + 1] & 19136800) == 0) {
									++yClip;
								}
							}
						}

						Client.visibleMapIcons[Client.mapIconAmt * 396638539] = VarpBit.mapFunctionIcons[mapIconID];
						Client.mapIconTileX[Client.mapIconAmt * 396638539] = xClip;
						Client.mapIconTileY[Client.mapIconAmt * 396638539] = yClip;
						Client.mapIconAmt += 745179235;
					}
				}
			}
		}

		Class63.aClass13_830.method260(-1763862346);
	}

	static final void method3168(int var0) {
		while (true) {
			if (Client.packetBuffer.readableBits(Client.anInt2927 * -574496637) >= 27) {
				int var1 = Client.packetBuffer.readBits(15);
				if (var1 != 32767) {
					boolean var3 = false;
					if (null == Client.localNPCs[var1]) {
						Client.localNPCs[var1] = new NPC();
						var3 = true;
					}

					NPC var4 = Client.localNPCs[var1];
					Client.npcIndices[(Client.anInt2749 += 995848249) * -1829405175 - 1] = var1;
					var4.lastUpdated = Client.cycle * 1761958407;
					int var5 = Client.packetBuffer.readBits(5);
					if (var5 > 15) {
						var5 -= 32;
					}

					var4.definition = Class108_Sub12.getNPCDefForID(Client.packetBuffer.readBits(14), 761765723);
					int var2 = Client.packetBuffer.readBits(5);
					if (var2 > 15) {
						var2 -= 32;
					}

					int var6 = Client.packetBuffer.readBits(1);
					int var8 = Client.anIntArray2836[Client.packetBuffer.readBits(3)];
					if (var3) {
						var4.anInt2354 = (var4.anInt2345 = var8 * -1111782119) * 1730540795;
					}

					int var7 = Client.packetBuffer.readBits(1);
					if (var7 == 1) {
						Client.playersNeedingUpdating[(Client.updateReqCount -= 472402375) * -184592375 - 1] = var1;
					}

					var4.anInt2349 = var4.definition.tileSpacesOccupied * 869735027;
					var4.anInt2389 = var4.definition.anInt2156 * 1300761443;
					if (0 == var4.anInt2389 * -742374489) {
						var4.anInt2345 = 0;
					}

					var4.anInt2357 = var4.definition.walkAnimation * 1834238161;
					var4.turn180AnimationID = var4.definition.rotate180Animation * -1799278961;
					var4.turn90RightAnimationID = var4.definition.rotate90RightAnimation * 1104470195;
					var4.turn90LeftAnimationID = var4.definition.rotate90LeftAnimation * -1117812389;
					var4.standAnimationID = var4.definition.stanceAnimation * -517518475;
					var4.nextAnimationID = var4.definition.anInt2165 * -1414070185;
					var4.walkAnimationID = var4.definition.anInt2189 * -2025131807;
					var4.method2720(Player.myPlayer.anIntArray2391[0] + var2, var5 + Player.myPlayer.anIntArray2392[0], var6 == 1, 1073159);
					continue;
				}
			}

			Client.packetBuffer.endBitAccess();
			return;
		}
	}

	static int method3169(int var0, int var1, int var2) {
		long var3 = (long) ((var0 << 16) + var1);
		return IsaacRandomGen.activeJs5Job != null && IsaacRandomGen.activeJs5Job.key == var3 ? 1 + IsaacRandomGen.js5WorkBuffer.position * 1725412617 / (IsaacRandomGen.js5WorkBuffer.buf.length - IsaacRandomGen.activeJs5Job.aByte2299) : 0;
	}
}
