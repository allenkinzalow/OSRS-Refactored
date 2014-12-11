public class Scene {

	static int xCamPosTile;
	static int anInt402;
	int xMapSize;
	int yMapSize;
	static int anInt405;
	Tile[][][] tileArray;
	int anInt407 = 0;
	int interactableObjectCount = 0;
	static int yCameraPos;
	int[][][] anIntArrayArrayArray410;
	public static boolean aBool411 = true;
	static Deque aClass105_412 = new Deque();
	static int anInt416 = 0;
	static int plane = 0;
	static int cycle;
	static int anInt419;
	static int anInt420;
	int[][][] heightMap;
	static int[] anIntArray422 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
	static int anInt423;
	public static int anInt424 = -1;
	static int yCamPosTile;
	static int zCameraPos;
	static int[] anIntArray427 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
	static int anInt428;
	static int anInt430;
	static int anInt431;
	static InteractableObject[] aClass40Array432 = new InteractableObject[100];
	static boolean aBool433 = false;
	static int anInt434;
	static int anInt435 = 0;
	static int anInt436 = 0;
	public static int anInt437 = -1;
	static boolean[][] visibleTiles;
	static boolean[][][][] visibilityTilesMap = new boolean[8][32][51][51];
	static int[] anIntArray441 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
	static int cullingClusterCount = 4;
	static int[] cullingClusterPointer = new int[cullingClusterCount];
	static CullingCluster[][] cullingClusters = new CullingCluster[cullingClusterCount][500];
	static int anInt444 = 0;
	static CullingCluster[] aClass46Array445 = new CullingCluster[500];
	InteractableObject[] interfactableObjectCache = new InteractableObject[5000];
	static int anInt449 = 0;
	static int[] anIntArray450 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
	static int[] anIntArray451 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
	int depth;
	static int[] anIntArray453 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
	int[][] tileShapes = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
	int[][] tileRotations = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
	static int anInt456;
	static int anInt458;
	static int xCameraPos;
	static int[] anIntArray460 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
	static int anInt461;
	static int anInt462;
	static int anInt463;


	void method401(RSModel model, int var2, int xPos, int yPos) {
		Tile tile; 
		RSModel floorDecModel;
		if (xPos < this.xMapSize) {
			tile = this.tileArray[var2][xPos + 1][yPos];
			if (tile != null && tile.floorDecoration != null && tile.floorDecoration.renderable instanceof RSModel) {
				floorDecModel = (RSModel) tile.floorDecoration.renderable;
				RSModel.method3069(model, floorDecModel, 128, 0, 0, true);
			}
		}

		if (yPos < this.xMapSize) {
			tile = this.tileArray[var2][xPos][yPos + 1];
			if (tile != null && tile.floorDecoration != null && tile.floorDecoration.renderable instanceof RSModel) {
				floorDecModel = (RSModel) tile.floorDecoration.renderable;
				RSModel.method3069(model, floorDecModel, 0, 0, 128, true);
			}
		}

		if (xPos < this.xMapSize && yPos < this.yMapSize) {
			tile = this.tileArray[var2][xPos + 1][yPos + 1];
			if (tile != null && tile.floorDecoration != null && tile.floorDecoration.renderable instanceof RSModel) {
				floorDecModel = (RSModel) tile.floorDecoration.renderable;
				RSModel.method3069(model, floorDecModel, 128, 0, 128, true);
			}
		}

		if (xPos < this.xMapSize) {
			if (yPos > 0) {
				tile = this.tileArray[var2][xPos + 1][yPos - 1];
				if (tile != null) {
					if (tile.floorDecoration != null) {
						if (tile.floorDecoration.renderable instanceof RSModel) {
							floorDecModel = (RSModel) tile.floorDecoration.renderable;
							RSModel.method3069(model, floorDecModel, 128, 0, -128, true);
						}
					}
				}
			}
		}
	}

	public void method403(int x, int y) {
		Tile var3 = this.tileArray[0][x][y];

		for (int var5 = 0; var5 < 3; ++var5) {
			Tile var4 = this.tileArray[var5][x][y] = this.tileArray[var5 + 1][x][y];
			if (var4 != null) {
				var4.anInt1621 -= 477941017;

				for (int var7 = 0; var7 < var4.anInt1612 * -1912292193; ++var7) {
					InteractableObject io = var4.interactableObjects[var7];
					if ((io.anInt586 * 380600017 >> 29 & 3) == 2 && io.xPos * 1316787257 == x && io.yPos * 922395151 == y) {
						io.anInt575 -= 85696413;
					}
				}
			}
		}

		if (this.tileArray[0][x][y] == null) {
			this.tileArray[0][x][y] = new Tile(0, x, y);
		}

		this.tileArray[0][x][y].aClass108_Sub7_1624 = var3;
		this.tileArray[3][x][y] = null;
	}

	public static void method404(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		CullingCluster cullingCluster = new CullingCluster();
		cullingCluster.anInt649 = var2 / 128 * 239408893;
		cullingCluster.anInt641 = var3 / 128 * -1329582725;
		cullingCluster.anInt642 = var4 / 128 * 753324809;
		cullingCluster.anInt661 = var5 / 128 * 2102927027;
		cullingCluster.anInt644 = var1 * -1912383863;
		cullingCluster.anInt645 = var2 * 878628031;
		cullingCluster.anInt652 = var3 * -989357617;
		cullingCluster.anInt647 = var4 * 744926381;
		cullingCluster.anInt643 = var5 * 1262606337;
		cullingCluster.anInt658 = var6 * -2024080395;
		cullingCluster.anInt650 = var7 * 1247166013;
		cullingClusters[var0][cullingClusterPointer[var0]++] = cullingCluster;
	}

	public void method406(int startPlane, int x, int y, int shape, int rotation, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int color) {
		int plane;
		PlainTile plainTile;
		if (shape == 0) {
			plainTile = new PlainTile(var11, var12, var13, var14, -1, var19, false);

			for (plane = startPlane; plane >= 0; --plane) {
				if (this.tileArray[plane][x][y] == null) {
					this.tileArray[plane][x][y] = new Tile(plane, x, y);
				}
			}

			this.tileArray[startPlane][x][y].plainTile = plainTile;
		} else if (shape != 1) {
			ShapedTile shapedTile = new ShapedTile(shape, rotation, var6, x, y, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, color);

			for (plane = startPlane; plane >= 0; --plane) {
				if (this.tileArray[plane][x][y] == null) {
					this.tileArray[plane][x][y] = new Tile(plane, x, y);
				}
			}

			this.tileArray[startPlane][x][y].shapedTile = shapedTile;
		} else {
			plainTile = new PlainTile(var15, var16, var17, var18, var6, color, var7 == var8 && var7 == var9 && var7 == var10);

			for (plane = startPlane; plane >= 0; --plane) {
				if (this.tileArray[plane][x][y] == null) {
					this.tileArray[plane][x][y] = new Tile(plane, x, y);
				}
			}

			this.tileArray[startPlane][x][y].plainTile = plainTile;
		}
	}

	public void method407(int plane, int x, int y, int var4, Renderable renderable, int hash, int var7) {
		if (renderable != null) {
			FloorDecoration decoration = new FloorDecoration();
			decoration.renderable = renderable;
			decoration.xPos = x * 1331793792 + 665896896;
			decoration.yPos = y * -478985344 - 239492672;
			decoration.plane = var4 * 1558338899;
			decoration.hash = hash * 1846832023;
			decoration.anInt285 = var7 * -524297561;
			if (this.tileArray[plane][x][y] == null) {
				this.tileArray[plane][x][y] = new Tile(plane, x, y);
			}

			this.tileArray[plane][x][y].floorDecoration = decoration;
		}
	}

	public void addGroundItemTile(int plane, int x, int y, int var4, Renderable var5, int var6, Renderable var7, Renderable var8) {
		GroundItem groundItem = new GroundItem();
		groundItem.firstGroundItem = var5;
		groundItem.xPos = x * -1088697728 - 544348864;
		groundItem.yPos = y * 172330880 + 86165440;
		groundItem.anInt472 = var4 * 1211246617;
		groundItem.anInt477 = var6 * -1956090305;
		groundItem.aClass108_Sub20_Sub14_476 = var7;
		groundItem.aClass108_Sub20_Sub14_475 = var8;
		int var11 = 0;
		Tile var12 = this.tileArray[plane][x][y];
		if (var12 != null) {
			for (int var13 = 0; var13 < var12.anInt1612 * -1912292193; ++var13) {
				if ((var12.interactableObjects[var13].anInt583 * -1925665473 & 256) == 256 && var12.interactableObjects[var13].renderableObject instanceof ModelRasterizer) {
					ModelRasterizer var10 = (ModelRasterizer) var12.interactableObjects[var13].renderableObject;
					var10.method2855();
					if (var10.modelHeight * 782517621 > var11) {
						var11 = var10.modelHeight * 782517621;
					}
				}
			}
		}

		groundItem.anInt478 = var11 * 1524279305;
		if (this.tileArray[plane][x][y] == null) {
			this.tileArray[plane][x][y] = new Tile(plane, x, y);
		}

		this.tileArray[plane][x][y].groundItem = groundItem;
	}

	public void method409(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10) {
		if (var5 != null || var6 != null) {
			Wall var12 = new Wall();
			var12.anInt337 = var9 * 1520883995;
			var12.anInt341 = var10 * -2134476677;
			var12.anInt334 = var2 * -991882880 - 495941440;
			var12.anInt339 = var3 * 1040597120 + 520298560;
			var12.anInt335 = var4 * -956925921;
			var12.aClass108_Sub20_Sub14_338 = var5;
			var12.aClass108_Sub20_Sub14_343 = var6;
			var12.anInt336 = var7 * -1324167003;
			var12.anInt333 = var8 * -1025112433;

			for (int var11 = var1; var11 >= 0; --var11) {
				if (this.tileArray[var11][var2][var3] == null) {
					this.tileArray[var11][var2][var3] = new Tile(var11, var2, var3);
				}
			}

			this.tileArray[var1][var2][var3].wall = var12;
		}
	}

	public void method410(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		if (var5 != null) {
			WallDecoration var13 = new WallDecoration();
			var13.anInt302 = var11 * 1304286109;
			var13.anInt303 = var12 * 2107716451;
			var13.anInt294 = var2 * 639770240 + 319885120;
			var13.anInt293 = var3 * -328335744 - 164167872;
			var13.anInt304 = var4 * -2061955117;
			var13.renderable = var5;
			var13.aClass108_Sub20_Sub14_301 = var6;
			var13.anInt296 = var7 * 235065965;
			var13.face = var8 * 637513727;
			var13.anInt298 = var9 * 969161197;
			var13.anInt299 = var10 * 1276806949;

			for (int var14 = var1; var14 >= 0; --var14) {
				if (this.tileArray[var14][var2][var3] == null) {
					this.tileArray[var14][var2][var3] = new Tile(var14, var2, var3);
				}
			}

			this.tileArray[var1][var2][var3].wallDecoration = var13;
		}
	}

	public boolean method411(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, int var9, int var10) {
		if (var7 == null) {
			return true;
		} else {
			int var12 = var2 * 128 + var5 * 64;
			int var11 = var3 * 128 + var6 * 64;
			return this.method414(var1, var2, var3, var5, var6, var12, var11, var4, var7, var8, false, var9, var10);
		}
	}

	public boolean method412(int plane, int x, int y, int var4, int offset, Renderable var6, int var7, int var8, boolean var9) {
		if (var6 == null) {
			return true;
		} else {
			int var10 = x - offset;
			int var11 = y - offset;
			int var12 = x + offset;
			int var13 = y + offset;
			if (var9) {
				if (var7 > 640 && var7 < 1408) {
					var13 += 128;
				}

				if (var7 > 1152 && var7 < 1920) {
					var12 += 128;
				}

				if (var7 > 1664 || var7 < 384) {
					var11 -= 128;
				}

				if (var7 > 128 && var7 < 896) {
					var10 -= 128;
				}
			}

			var10 /= 128;
			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			return this.method414(plane, var10, var11, var12 - var10 + 1, var13 - var11 + 1, x, y, var4, var6, var7, true, var8, 0);
		}
	}

	public boolean method413(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		return var6 != null ? this.method414(var1, var9, var10, var11 - var9 + 1, var12 - var10 + 1, var2, var3, var4, var6, var7, true, var8, 0) : true;
	}

	boolean method414(int plane, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, int var12, int var13) {
		int y;
		for (int x = var2; x < var2 + var4; ++x) {
			for (y = var3; y < var3 + var5; ++y) {
				if (x < 0 || y < 0 || x >= this.xMapSize || y >= this.yMapSize) {
					return false;
				}

				Tile tile = this.tileArray[plane][x][y];
				if (tile != null && tile.anInt1612 * -1912292193 >= 5) {
					return false;
				}
			}
		}

		InteractableObject var20 = new InteractableObject();
		var20.anInt586 = var12 * -504391119;
		var20.anInt583 = var13 * 2085864127;
		var20.anInt575 = plane * 85696413;
		var20.anInt572 = var6 * 1256595785;
		var20.anInt573 = var7 * 321089563;
		var20.anInt571 = var8 * 223924519;
		var20.renderableObject = var9;
		var20.anInt580 = var10 * 1912539231;
		var20.xPos = var2 * 85531145;
		var20.yPos = var3 * -1359606545;
		var20.anInt582 = (var2 + var4 - 1) * -619299407;
		var20.anInt579 = (var3 + var5 - 1) * 1866908065;

		for (y = var2; y < var2 + var4; ++y) {
			for (int var21 = var3; var21 < var3 + var5; ++var21) {
				int var17 = 0;
				if (y > var2) {
					++var17;
				}

				if (y < var2 + var4 - 1) {
					var17 += 4;
				}

				if (var21 > var3) {
					var17 += 8;
				}

				if (var21 < var3 + var5 - 1) {
					var17 += 2;
				}

				for (int var18 = plane; var18 >= 0; --var18) {
					if (this.tileArray[var18][y][var21] == null) {
						this.tileArray[var18][y][var21] = new Tile(var18, y, var21);
					}
				}

				Tile var22 = this.tileArray[plane][y][var21];
				var22.interactableObjects[var22.anInt1612 * -1912292193] = var20;
				var22.objectFlags[var22.anInt1612 * -1912292193] = var17;
				var22.anInt1608 = (var22.anInt1608 * 1322616499 | var17) * 1373280379;
				var22.anInt1612 -= 1369350305;
			}
		}

		if (var11) {
			this.interfactableObjectCache[this.interactableObjectCount++] = var20;
		}

		return true;
	}

	public void method415() {
		for (int var1 = 0; var1 < this.interactableObjectCount; ++var1) {
			InteractableObject var2 = this.interfactableObjectCache[var1];
			this.method560(var2);
			this.interfactableObjectCache[var1] = null;
		}

		this.interactableObjectCount = 0;
	}

	public void method418(int var1, int var2, int var3) {
		Tile var4 = this.tileArray[var1][var2][var3];
		if (var4 != null) {
			var4.wall = null;
		}
	}

	public void method420(int var1, int var2, int var3) {
		Tile var4 = this.tileArray[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.anInt1612 * -1912292193; ++var5) {
				InteractableObject var6 = var4.interactableObjects[var5];
				if ((var6.anInt586 * 380600017 >> 29 & 3) == 2 && var6.xPos * 1316787257 == var2 && var6.yPos * 922395151 == var3) {
					this.method560(var6);
					return;
				}
			}

		}
	}

	public void method421(int var1, int var2, int var3) {
		Tile var4 = this.tileArray[var1][var2][var3];
		if (var4 != null) {
			var4.floorDecoration = null;
		}
	}

	static final int method423(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & '\uff80') + var1;
	}

	public WallDecoration method424(int var1, int var2, int var3) {
		Tile var4 = this.tileArray[var1][var2][var3];
		return var4 == null ? null : var4.wallDecoration;
	}

	public int method425(int var1, int var2, int var3) {
		Tile var4 = this.tileArray[var1][var2][var3];
		return var4 != null && var4.wallDecoration != null ? var4.wallDecoration.anInt302 * 414599861 : 0;
	}

	public FloorDecoration method426(int var1, int var2, int var3) {
		Tile var4 = this.tileArray[var1][var2][var3];
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null;
	}

	public int method427(int var1, int var2, int var3) {
		Tile var4 = this.tileArray[var1][var2][var3];
		return var4 != null && var4.wall != null ? var4.wall.anInt337 * 639818003 : 0;
	}

	public int method429(int var1, int var2, int var3) {
		Tile var4 = this.tileArray[var1][var2][var3];
		if (var4 == null) {
			return 0;
		} else {
			for (int var6 = 0; var6 < var4.anInt1612 * -1912292193; ++var6) {
				InteractableObject var5 = var4.interactableObjects[var6];
				if ((var5.anInt586 * 380600017 >> 29 & 3) == 2 && var5.xPos * 1316787257 == var2 && var5.yPos * 922395151 == var3) {
					return var5.anInt586 * 380600017;
				}
			}

			return 0;
		}
	}

	public int fetchGroundTileDecorationHash(int var1, int var2, int var3) {
		Tile var4 = this.tileArray[var1][var2][var3];
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration.hash * 1276953639 : 0;
	}

	public int method431(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tileArray[var1][var2][var3];
		if (var5 != null) {
			if (var5.wall != null && var5.wall.anInt337 * 639818003 == var4) {
				return var5.wall.anInt341 * -953243981 & 255;
			} else if (var5.wallDecoration != null && var5.wallDecoration.anInt302 * 414599861 == var4) {
				return var5.wallDecoration.anInt303 * -1368791477 & 255;
			} else if (var5.floorDecoration != null && var5.floorDecoration.hash * 1276953639 == var4) {
				return var5.floorDecoration.anInt285 * -1366545129 & 255;
			} else {
				for (int var6 = 0; var6 < var5.anInt1612 * -1912292193; ++var6) {
					if (var5.interactableObjects[var6].anInt586 * 380600017 == var4) {
						return var5.interactableObjects[var6].anInt583 * -1925665473 & 255;
					}
				}

				return -1;
			}
		} else {
			return -1;
		}
	}

	void method434(RSModel var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var14 = var3;
		int var13 = var3 + var5;
		int var12 = var4 - 1;
		int var20 = var4 + var6;

		for (int var8 = var2; var8 <= var2 + 1; ++var8) {
			if (var8 != this.depth) {
				for (int var9 = var14; var9 <= var13; ++var9) {
					if (var9 >= 0 && var9 < this.xMapSize) {
						for (int var10 = var12; var10 <= var20; ++var10) {
							if (var10 >= 0 && var10 < this.yMapSize && (!var7 || var9 >= var13 || var10 >= var20 || var10 < var4 && var9 != var3)) {
								Tile var15 = this.tileArray[var8][var9][var10];
								if (var15 != null) {
									int var11 = (this.heightMap[var8][var9][var10] + this.heightMap[var8][var9 + 1][var10] + this.heightMap[var8][var9][var10 + 1] + this.heightMap[var8][var9 + 1][var10 + 1]) / 4 - (this.heightMap[var2][var3][var4] + this.heightMap[var2][var3 + 1][var4] + this.heightMap[var2][var3][var4 + 1] + this.heightMap[var2][var3 + 1][var4 + 1]) / 4;
									Wall var18 = var15.wall;
									if (var18 != null) {
										RSModel var16;
										if (var18.aClass108_Sub20_Sub14_338 instanceof RSModel) {
											var16 = (RSModel) var18.aClass108_Sub20_Sub14_338;
											RSModel.method3069(var1, var16, (var9 - var3) * 128 + (1 - var5) * 64, var11, (var10 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var18.aClass108_Sub20_Sub14_343 instanceof RSModel) {
											var16 = (RSModel) var18.aClass108_Sub20_Sub14_343;
											RSModel.method3069(var1, var16, (var9 - var3) * 128 + (1 - var5) * 64, var11, (var10 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0; var23 < var15.anInt1612 * -1912292193; ++var23) {
										InteractableObject var17 = var15.interactableObjects[var23];
										if (var17 != null && var17.renderableObject instanceof RSModel) {
											RSModel var19 = (RSModel) var17.renderableObject;
											int var21 = var17.anInt582 * 1424354129 - var17.xPos * 1316787257 + 1;
											int var22 = var17.anInt579 * 1215390305 - var17.yPos * 922395151 + 1;
											RSModel.method3069(var1, var19, (var17.xPos * 1316787257 - var3) * 128 + (var21 - var5) * 64, var11, (var17.yPos * 922395151 - var4) * 128 + (var22 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				--var14;
				var7 = false;
			}
		}

	}

	/**
	 * Draw minimap tile
	 * @param map
	 * @param var2
	 * @param var3
	 * @param var4
	 * @param var5
	 * @param var6
	 */
	public void drawMinimapTile(int[] map, int var2, int var3, int var4, int var5, int var6) {
		Tile tile = this.tileArray[var4][var5][var6];

		if (tile != null) {
			PlainTile plainTile = tile.plainTile;
			int var15;
			if (plainTile == null) {
				ShapedTile shapedTile = tile.shapedTile;
				if (shapedTile != null) {
					int shape = shapedTile.shape;
					int rotation = shapedTile.rotation;
					int tileRGB = shapedTile.colorRGB;
					int tileRGBA = shapedTile.colorRGBA;
					int[] tileShapes = this.tileShapes[shape];
					int[] tileRotations = this.tileRotations[rotation];
					int var10 = 0;
					int var17;
					if (tileRGB != 0) {
						for (var17 = 0; var17 < 4; ++var17) {
							map[var2] = tileShapes[tileRotations[var10++]] == 0 ? tileRGB : tileRGBA;
							map[var2 + 1] = tileShapes[tileRotations[var10++]] == 0 ? tileRGB : tileRGBA;
							map[var2 + 2] = tileShapes[tileRotations[var10++]] == 0 ? tileRGB : tileRGBA;
							map[var2 + 3] = tileShapes[tileRotations[var10++]] == 0 ? tileRGB : tileRGBA;
							var2 += var3;
						}

					} else {
						for (var17 = 0; var17 < 4; ++var17) {
							if (tileShapes[tileRotations[var10++]] != 0) {
								map[var2] = tileRGBA;
							}

							if (tileShapes[tileRotations[var10++]] != 0) {
								map[var2 + 1] = tileRGBA;
							}

							if (tileShapes[tileRotations[var10++]] != 0) {
								map[var2 + 2] = tileRGBA;
							}

							if (tileShapes[tileRotations[var10++]] != 0) {
								map[var2 + 3] = tileRGBA;
							}

							var2 += var3;
						}

					}
				}
			} else {
				int color = plainTile.colorRGB * -525140139;
				if (color != 0) {
					for (var15 = 0; var15 < 4; ++var15) {
						map[var2] = color;
						map[var2 + 1] = color;
						map[var2 + 2] = color;
						map[var2 + 3] = color;
						var2 += var3;
					}

				}
			}
		}
	}

	public void method438(int var1, int var2, int var3) {
		aBool433 = true;
		anInt449 = var1;
		anInt435 = var2;
		anInt436 = var3;
		anInt437 = -1;
		anInt424 = -1;
	}

	/**
	 * Render scene
	 * @param xCam
	 * @param zCam
	 * @param yCam
	 * @param yCurve
	 * @param xCurve
	 * @param plane_
	 */
	public void method439(int xCam, int zCam, int yCam, int yCurve, int xCurve, int plane_) {
		if (xCam < 0) {
			xCam = 0;
		} else if (xCam >= this.xMapSize * 128) {
			xCam = this.xMapSize * 128 - 1;
		}

		if (yCam < 0) {
			yCam = 0;
		} else if (yCam >= this.yMapSize * 128) {
			yCam = this.yMapSize * 128 - 1;
		}

		++cycle;
		anInt428 = Rasterizer3D.SINE[yCurve];
		anInt434 = Rasterizer3D.COSINE[yCurve];
		anInt430 = Rasterizer3D.SINE[xCurve];
		anInt431 = Rasterizer3D.COSINE[xCurve];
		visibleTiles = visibilityTilesMap[(yCurve - 128) / 32][xCurve / 64];
		xCameraPos = xCam;
		zCameraPos = zCam;
		yCameraPos = yCam;
		xCamPosTile = xCam / 128;
		yCamPosTile = yCam / 128;
		plane = plane_;
		anInt419 = xCamPosTile - 25;
		if (anInt419 < 0) {
			anInt419 = 0;
		}

		anInt456 = yCamPosTile - 25;
		if (anInt456 < 0) {
			anInt456 = 0;
		}

		anInt420 = xCamPosTile + 25;
		if (anInt420 > this.xMapSize) {
			anInt420 = this.xMapSize;
		}

		anInt423 = yCamPosTile + 25;
		if (anInt423 > this.yMapSize) {
			anInt423 = this.yMapSize;
		}

		this.method445();
		anInt416 = 0;

		int var8;
		int var9;
		int var12;
		Tile[][] var13;
		for (var8 = this.anInt407; var8 < this.depth; ++var8) {
			var13 = this.tileArray[var8];

			for (var12 = anInt419; var12 < anInt420; ++var12) {
				for (var9 = anInt456; var9 < anInt423; ++var9) {
					Tile var7 = var13[var12][var9];
					if (var7 != null) {
						if (var7.anInt1616 * 911656145 <= plane_ && (visibleTiles[var12 - xCamPosTile + 25][var9 - yCamPosTile + 25] || this.heightMap[var8][var12][var9] - zCam >= 2000)) {
							var7.aBool1617 = true;
							var7.aBool1618 = true;
							if (var7.anInt1612 * -1912292193 > 0) {
								var7.aBool1622 = true;
							} else {
								var7.aBool1622 = false;
							}

							++anInt416;
						} else {
							var7.aBool1617 = false;
							var7.aBool1618 = false;
							var7.anInt1620 = 0;
						}
					}
				}
			}
		}

		int var10;
		int var11;
		Tile var14;
		int var15;
		int var16;
		for (var8 = this.anInt407; var8 < this.depth; ++var8) {
			var13 = this.tileArray[var8];

			for (var12 = -25; var12 <= 0; ++var12) {
				var9 = xCamPosTile + var12;
				var16 = xCamPosTile - var12;
				if (var9 >= anInt419 || var16 < anInt420) {
					for (var10 = -25; var10 <= 0; ++var10) {
						var15 = yCamPosTile + var10;
						var11 = yCamPosTile - var10;
						if (var9 >= anInt419) {
							if (var15 >= anInt456) {
								var14 = var13[var9][var15];
								if (var14 != null && var14.aBool1617) {
									this.renderTile(var14, true);
								}
							}

							if (var11 < anInt423) {
								var14 = var13[var9][var11];
								if (var14 != null && var14.aBool1617) {
									this.renderTile(var14, true);
								}
							}
						}

						if (var16 < anInt420) {
							if (var15 >= anInt456) {
								var14 = var13[var16][var15];
								if (var14 != null && var14.aBool1617) {
									this.renderTile(var14, true);
								}
							}

							if (var11 < anInt423) {
								var14 = var13[var16][var11];
								if (var14 != null && var14.aBool1617) {
									this.renderTile(var14, true);
								}
							}
						}

						if (anInt416 == 0) {
							aBool433 = false;
							return;
						}
					}
				}
			}
		}

		for (var8 = this.anInt407; var8 < this.depth; ++var8) {
			var13 = this.tileArray[var8];

			for (var12 = -25; var12 <= 0; ++var12) {
				var9 = xCamPosTile + var12;
				var16 = xCamPosTile - var12;
				if (var9 >= anInt419 || var16 < anInt420) {
					for (var10 = -25; var10 <= 0; ++var10) {
						var15 = yCamPosTile + var10;
						var11 = yCamPosTile - var10;
						if (var9 >= anInt419) {
							if (var15 >= anInt456) {
								var14 = var13[var9][var15];
								if (var14 != null && var14.aBool1617) {
									this.renderTile(var14, false);
								}
							}

							if (var11 < anInt423) {
								var14 = var13[var9][var11];
								if (var14 != null && var14.aBool1617) {
									this.renderTile(var14, false);
								}
							}
						}

						if (var16 < anInt420) {
							if (var15 >= anInt456) {
								var14 = var13[var16][var15];
								if (var14 != null && var14.aBool1617) {
									this.renderTile(var14, false);
								}
							}

							if (var11 < anInt423) {
								var14 = var13[var16][var11];
								if (var14 != null && var14.aBool1617) {
									this.renderTile(var14, false);
								}
							}
						}

						if (anInt416 == 0) {
							aBool433 = false;
							return;
						}
					}
				}
			}
		}

		aBool433 = false;
	}

	void renderTile(Tile var1, boolean var2) {
		aClass105_412.insertBack(var1);

		while (true) {
			Tile tile = (Tile) aClass105_412.method1337();
			if (tile == null) {
				return;
			}

			if (tile.aBool1618) {
				int var4 = tile.anInt1603 * -422189645;
				int var5 = tile.anInt1604 * 2141500149;
				int var6 = tile.anInt1621 * -1390788823;
				int var7 = tile.anInt1605 * 1112732487;
				Tile[][] var8 = this.tileArray[var6];
				Tile var9;
				Wall var10;
				int var11;
				InteractableObject interactableObject;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var21;
				boolean var22;
				Tile var33;
				if (tile.aBool1617) {
					if (var2) {
						if (var6 > 0) {
							var9 = this.tileArray[var6 - 1][var4][var5];
							if (var9 != null && var9.aBool1618) {
								continue;
							}
						}

						if (var4 <= xCamPosTile && var4 > anInt419) {
							var9 = var8[var4 - 1][var5];
							if (var9 != null && var9.aBool1618 && (var9.aBool1617 || (tile.anInt1608 * 1322616499 & 1) == 0)) {
								continue;
							}
						}

						if (var4 >= xCamPosTile && var4 < anInt420 - 1) {
							var9 = var8[var4 + 1][var5];
							if (var9 != null && var9.aBool1618 && (var9.aBool1617 || (tile.anInt1608 * 1322616499 & 4) == 0)) {
								continue;
							}
						}

						if (var5 <= yCamPosTile && var5 > anInt456) {
							var9 = var8[var4][var5 - 1];
							if (var9 != null && var9.aBool1618 && (var9.aBool1617 || (tile.anInt1608 * 1322616499 & 8) == 0)) {
								continue;
							}
						}

						if (var5 >= yCamPosTile && var5 < anInt423 - 1) {
							var9 = var8[var4][var5 + 1];
							if (var9 != null && var9.aBool1618 && (var9.aBool1617 || (tile.anInt1608 * 1322616499 & 2) == 0)) {
								continue;
							}
						}
					} else {
						var2 = true;
					}

					tile.aBool1617 = false;
					if (tile.aClass108_Sub7_1624 != null) {
						var9 = tile.aClass108_Sub7_1624;
						if (var9.plainTile != null) {
							if (!this.isTileCulled(0, var4, var5)) {
								this.method490(var9.plainTile, 0, anInt428, anInt434, anInt430, anInt431, var4, var5);
							}
						} else if (var9.shapedTile != null && !this.isTileCulled(0, var4, var5)) {
							this.method442(var9.shapedTile, anInt428, anInt434, anInt430, anInt431, var4, var5);
						}

						var10 = var9.wall;
						if (var10 != null) {
							var10.aClass108_Sub20_Sub14_338.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, var10.anInt334 * 1597898123 - xCameraPos, var10.anInt335 * 1266353119 - zCameraPos, var10.anInt339 * 251671425 - yCameraPos, var10.anInt337 * 639818003);
						}

						for (var11 = 0; var11 < var9.anInt1612 * -1912292193; ++var11) {
							interactableObject = var9.interactableObjects[var11];
							if (interactableObject != null) {
								interactableObject.renderableObject.renderAtPoint(interactableObject.anInt580 * -469937249, anInt428, anInt434, anInt430, anInt431, interactableObject.anInt572 * -1568890631 - xCameraPos, interactableObject.anInt571 * -62943593 - zCameraPos, interactableObject.anInt573 * -904730093 - yCameraPos, interactableObject.anInt586 * 380600017);
							}
						}
					}

					var22 = false;
					if (tile.plainTile != null) {
						if (!this.isTileCulled(var7, var4, var5)) {
							var22 = true;
							if (tile.plainTile.anInt505 * 22178081 != 12345678 || aBool433 && var6 <= anInt449) {
								this.method490(tile.plainTile, var7, anInt428, anInt434, anInt430, anInt431, var4, var5);
							}
						}
					} else if (tile.shapedTile != null && !this.isTileCulled(var7, var4, var5)) {
						var22 = true;
						this.method442(tile.shapedTile, anInt428, anInt434, anInt430, anInt431, var4, var5);
					}

					var21 = 0;
					var11 = 0;
					Wall wall = tile.wall;
					WallDecoration wallDecoration = tile.wallDecoration;
					if (wall != null || wallDecoration != null) {
						if (xCamPosTile == var4) {
							++var21;
						} else if (xCamPosTile < var4) {
							var21 += 2;
						}

						if (yCamPosTile == var5) {
							var21 += 3;
						} else if (yCamPosTile > var5) {
							var21 += 6;
						}

						var11 = anIntArray460[var21];
						tile.anInt1623 = anIntArray422[var21] * 1653063983;
					}

					if (wall != null) {
						if ((wall.anInt336 * 1243649837 & anIntArray427[var21]) != 0) {
							if (wall.anInt336 * 1243649837 == 16) {
								tile.anInt1620 = -888833453;
								tile.anInt1625 = anIntArray450[var21] * 2110887951;
								tile.anInt1619 = -2115316319 - tile.anInt1625 * -250882107;
							} else if (wall.anInt336 * 1243649837 == 32) {
								tile.anInt1620 = -1777666906;
								tile.anInt1625 = anIntArray451[var21] * 2110887951;
								tile.anInt1619 = 64334658 - tile.anInt1625 * -250882107;
							} else if (wall.anInt336 * 1243649837 == 64) {
								tile.anInt1620 = 739633484;
								tile.anInt1625 = anIntArray441[var21] * 2110887951;
								tile.anInt1619 = 128669316 - tile.anInt1625 * -250882107;
							} else {
								tile.anInt1620 = 1628466937;
								tile.anInt1625 = anIntArray453[var21] * 2110887951;
								tile.anInt1619 = -2050981661 - tile.anInt1625 * -250882107;
							}
						} else {
							tile.anInt1620 = 0;
						}

						if ((wall.anInt336 * 1243649837 & var11) != 0 && !this.isWallCulled(var7, var4, var5, wall.anInt336 * 1243649837)) {
							wall.aClass108_Sub20_Sub14_338.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, wall.anInt334 * 1597898123 - xCameraPos, wall.anInt335 * 1266353119 - zCameraPos, wall.anInt339 * 251671425 - yCameraPos, wall.anInt337 * 639818003);
						}

						if ((wall.anInt333 * -2065803153 & var11) != 0 && !this.isWallCulled(var7, var4, var5, wall.anInt333 * -2065803153)) {
							wall.aClass108_Sub20_Sub14_343.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, wall.anInt334 * 1597898123 - xCameraPos, wall.anInt335 * 1266353119 - zCameraPos, wall.anInt339 * 251671425 - yCameraPos, wall.anInt337 * 639818003);
						}
					}

					if (wallDecoration != null && !this.isCulled(var7, var4, var5, wallDecoration.renderable.modelHeight * 782517621)) {
						if ((wallDecoration.anInt296 * -731248795 & var11) != 0) {
							wallDecoration.renderable.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, wallDecoration.anInt294 * 501445397 - xCameraPos + wallDecoration.anInt298 * -1652093979, wallDecoration.anInt304 * 609165403 - zCameraPos, wallDecoration.anInt293 * 534010197 - yCameraPos + wallDecoration.anInt299 * -17941331, wallDecoration.anInt302 * 414599861);
						} else if (wallDecoration.anInt296 * -731248795 == 256) {
							var14 = wallDecoration.anInt294 * 501445397 - xCameraPos;
							var15 = wallDecoration.anInt304 * 609165403 - zCameraPos;
							var16 = wallDecoration.anInt293 * 534010197 - yCameraPos;
							var17 = wallDecoration.face * -1056944129;
							if (var17 != 1 && var17 != 2) {
								var18 = var14;
							} else {
								var18 = -var14;
							}

							int var19;
							if (var17 != 2 && var17 != 3) {
								var19 = var16;
							} else {
								var19 = -var16;
							}

							if (var19 < var18) {
								wallDecoration.renderable.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, var14 + wallDecoration.anInt298 * -1652093979, var15, var16 + wallDecoration.anInt299 * -17941331, wallDecoration.anInt302 * 414599861);
							} else if (wallDecoration.aClass108_Sub20_Sub14_301 != null) {
								wallDecoration.aClass108_Sub20_Sub14_301.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, var14, var15, var16, wallDecoration.anInt302 * 414599861);
							}
						}
					}

					if (var22) {
						FloorDecoration floorDecoration = tile.floorDecoration;
						if (floorDecoration != null) {
							floorDecoration.renderable.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, floorDecoration.xPos * 731052255 - xCameraPos, floorDecoration.plane * -1876037925 - zCameraPos, floorDecoration.yPos * 792526647 - yCameraPos, floorDecoration.hash * 1276953639);
						}

						GroundItem groundItem = tile.groundItem;
						if (groundItem != null && groundItem.anInt478 * 414541369 == 0) {
							if (groundItem.aClass108_Sub20_Sub14_476 != null) {
								groundItem.aClass108_Sub20_Sub14_476.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, groundItem.xPos * -703374403 - xCameraPos, groundItem.anInt472 * 985052201 - zCameraPos, groundItem.yPos * -195350305 - yCameraPos, groundItem.anInt477 * 1350074815);
							}

							if (groundItem.aClass108_Sub20_Sub14_475 != null) {
								groundItem.aClass108_Sub20_Sub14_475.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, groundItem.xPos * -703374403 - xCameraPos, groundItem.anInt472 * 985052201 - zCameraPos, groundItem.yPos * -195350305 - yCameraPos, groundItem.anInt477 * 1350074815);
							}

							if (groundItem.firstGroundItem != null) {
								groundItem.firstGroundItem.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, groundItem.xPos * -703374403 - xCameraPos, groundItem.anInt472 * 985052201 - zCameraPos, groundItem.yPos * -195350305 - yCameraPos, groundItem.anInt477 * 1350074815);
							}
						}
					}

					var14 = tile.anInt1608 * 1322616499;
					if (var14 != 0) {
						if (var4 < xCamPosTile && (var14 & 4) != 0) {
							var33 = var8[var4 + 1][var5];
							if (var33 != null && var33.aBool1618) {
								aClass105_412.insertBack(var33);
							}
						}

						if (var5 < yCamPosTile && (var14 & 2) != 0) {
							var33 = var8[var4][var5 + 1];
							if (var33 != null && var33.aBool1618) {
								aClass105_412.insertBack(var33);
							}
						}

						if (var4 > xCamPosTile && (var14 & 1) != 0) {
							var33 = var8[var4 - 1][var5];
							if (var33 != null && var33.aBool1618) {
								aClass105_412.insertBack(var33);
							}
						}

						if (var5 > yCamPosTile && (var14 & 8) != 0) {
							var33 = var8[var4][var5 - 1];
							if (var33 != null && var33.aBool1618) {
								aClass105_412.insertBack(var33);
							}
						}
					}
				}

				if (tile.anInt1620 * 2007141777 != 0) {
					var22 = true;

					for (var21 = 0; var21 < tile.anInt1612 * -1912292193; ++var21) {
						if (tile.interactableObjects[var21].anInt581 * -1883721237 != cycle && (tile.objectFlags[var21] & tile.anInt1620 * 2007141777) == tile.anInt1625 * -303933713) {
							var22 = false;
							break;
						}
					}

					if (var22) {
						var10 = tile.wall;
						if (!this.isWallCulled(var7, var4, var5, var10.anInt336 * 1243649837)) {
							var10.aClass108_Sub20_Sub14_338.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, var10.anInt334 * 1597898123 - xCameraPos, var10.anInt335 * 1266353119 - zCameraPos, var10.anInt339 * 251671425 - yCameraPos, var10.anInt337 * 639818003);
						}

						tile.anInt1620 = 0;
					}
				}

				int var24;
				int var26;
				if (tile.aBool1622) {
					try {
						int var25 = tile.anInt1612 * -1912292193;
						tile.aBool1622 = false;
						var21 = 0;

						label542:
						for (var11 = 0; var11 < var25; ++var11) {
							interactableObject = tile.interactableObjects[var11];
							if (interactableObject.anInt581 * -1883721237 != cycle) {
								for (var26 = interactableObject.xPos * 1316787257; var26 <= interactableObject.anInt582 * 1424354129; ++var26) {
									for (var14 = interactableObject.yPos * 922395151; var14 <= interactableObject.anInt579 * 1215390305; ++var14) {
										var33 = var8[var26][var14];
										if (var33.aBool1617) {
											tile.aBool1622 = true;
											continue label542;
										}

										if (var33.anInt1620 * 2007141777 != 0) {
											var16 = 0;
											if (var26 > interactableObject.xPos * 1316787257) {
												++var16;
											}

											if (var26 < interactableObject.anInt582 * 1424354129) {
												var16 += 4;
											}

											if (var14 > interactableObject.yPos * 922395151) {
												var16 += 8;
											}

											if (var14 < interactableObject.anInt579 * 1215390305) {
												var16 += 2;
											}

											if ((var16 & var33.anInt1620 * 2007141777) == tile.anInt1619 * 1116400419) {
												tile.aBool1622 = true;
												continue label542;
											}
										}
									}
								}

								aClass40Array432[var21++] = interactableObject;
								var26 = xCamPosTile - interactableObject.xPos * 1316787257;
								var14 = interactableObject.anInt582 * 1424354129 - xCamPosTile;
								if (var14 > var26) {
									var26 = var14;
								}

								var15 = yCamPosTile - interactableObject.yPos * 922395151;
								var16 = interactableObject.anInt579 * 1215390305 - yCamPosTile;
								if (var16 > var15) {
									interactableObject.anInt570 = (var26 + var16) * -643383637;
								} else {
									interactableObject.anInt570 = (var26 + var15) * -643383637;
								}
							}
						}

						while (var21 > 0) {
							var11 = -50;
							var24 = -1;

							for (var26 = 0; var26 < var21; ++var26) {
								InteractableObject var34 = aClass40Array432[var26];
								if (var34.anInt581 * -1883721237 != cycle) {
									if (var34.anInt570 * 1666403331 > var11) {
										var11 = var34.anInt570 * 1666403331;
										var24 = var26;
									} else if (var34.anInt570 * 1666403331 == var11) {
										var15 = var34.anInt572 * -1568890631 - xCameraPos;
										var16 = var34.anInt573 * -904730093 - yCameraPos;
										var17 = aClass40Array432[var24].anInt572 * -1568890631 - xCameraPos;
										var18 = aClass40Array432[var24].anInt573 * -904730093 - yCameraPos;
										if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
											var24 = var26;
										}
									}
								}
							}

							if (var24 == -1) {
								break;
							}

							InteractableObject var35 = aClass40Array432[var24];
							var35.anInt581 = cycle * -793186621;
							if (!this.isCulled(var7, var35.xPos * 1316787257, var35.anInt582 * 1424354129, var35.yPos * 922395151, var35.anInt579 * 1215390305, var35.renderableObject.modelHeight * 782517621)) {
								var35.renderableObject.renderAtPoint(var35.anInt580 * -469937249, anInt428, anInt434, anInt430, anInt431, var35.anInt572 * -1568890631 - xCameraPos, var35.anInt571 * -62943593 - zCameraPos, var35.anInt573 * -904730093 - yCameraPos, var35.anInt586 * 380600017);
							}

							for (var14 = var35.xPos * 1316787257; var14 <= var35.anInt582 * 1424354129; ++var14) {
								for (var15 = var35.yPos * 922395151; var15 <= var35.anInt579 * 1215390305; ++var15) {
									Tile var36 = var8[var14][var15];
									if (var36.anInt1620 * 2007141777 != 0) {
										aClass105_412.insertBack(var36);
									} else if ((var14 != var4 || var15 != var5) && var36.aBool1618) {
										aClass105_412.insertBack(var36);
									}
								}
							}
						}

						if (tile.aBool1622) {
							continue;
						}
					} catch (Exception var20) {
						tile.aBool1622 = false;
					}
				}

				if (tile.aBool1618 && tile.anInt1620 * 2007141777 == 0) {
					if (var4 <= xCamPosTile && var4 > anInt419) {
						var9 = var8[var4 - 1][var5];
						if (var9 != null && var9.aBool1618) {
							continue;
						}
					}

					if (var4 >= xCamPosTile && var4 < anInt420 - 1) {
						var9 = var8[var4 + 1][var5];
						if (var9 != null && var9.aBool1618) {
							continue;
						}
					}

					if (var5 <= yCamPosTile && var5 > anInt456) {
						var9 = var8[var4][var5 - 1];
						if (var9 != null && var9.aBool1618) {
							continue;
						}
					}

					if (var5 >= yCamPosTile && var5 < anInt423 - 1) {
						var9 = var8[var4][var5 + 1];
						if (var9 != null && var9.aBool1618) {
							continue;
						}
					}

					tile.aBool1618 = false;
					--anInt416;
					GroundItem groundItem = tile.groundItem;
					if (groundItem != null && groundItem.anInt478 * 414541369 != 0) {
						if (groundItem.aClass108_Sub20_Sub14_476 != null) {
							groundItem.aClass108_Sub20_Sub14_476.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, groundItem.xPos * -703374403 - xCameraPos, groundItem.anInt472 * 985052201 - zCameraPos - groundItem.anInt478 * 414541369, groundItem.yPos * -195350305 - yCameraPos, groundItem.anInt477 * 1350074815);
						}

						if (groundItem.aClass108_Sub20_Sub14_475 != null) {
							groundItem.aClass108_Sub20_Sub14_475.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, groundItem.xPos * -703374403 - xCameraPos, groundItem.anInt472 * 985052201 - zCameraPos - groundItem.anInt478 * 414541369, groundItem.yPos * -195350305 - yCameraPos, groundItem.anInt477 * 1350074815);
						}

						if (groundItem.firstGroundItem != null) {
							groundItem.firstGroundItem.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, groundItem.xPos * -703374403 - xCameraPos, groundItem.anInt472 * 985052201 - zCameraPos - groundItem.anInt478 * 414541369, groundItem.yPos * -195350305 - yCameraPos, groundItem.anInt477 * 1350074815);
						}
					}

					if (tile.anInt1623 * 98641359 != 0) {
						WallDecoration wallDecoration = tile.wallDecoration;
						if (wallDecoration != null && !this.isCulled(var7, var4, var5, wallDecoration.renderable.modelHeight * 782517621)) {
							if ((wallDecoration.anInt296 * -731248795 & tile.anInt1623 * 98641359) != 0) {
								wallDecoration.renderable.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, wallDecoration.anInt294 * 501445397 - xCameraPos + wallDecoration.anInt298 * -1652093979, wallDecoration.anInt304 * 609165403 - zCameraPos, wallDecoration.anInt293 * 534010197 - yCameraPos + wallDecoration.anInt299 * -17941331, wallDecoration.anInt302 * 414599861);
							} else if (wallDecoration.anInt296 * -731248795 == 256) {
								var11 = wallDecoration.anInt294 * 501445397 - xCameraPos;
								var24 = wallDecoration.anInt304 * 609165403 - zCameraPos;
								var26 = wallDecoration.anInt293 * 534010197 - yCameraPos;
								var14 = wallDecoration.face * -1056944129;
								if (var14 != 1 && var14 != 2) {
									var15 = var11;
								} else {
									var15 = -var11;
								}

								if (var14 != 2 && var14 != 3) {
									var16 = var26;
								} else {
									var16 = -var26;
								}

								if (var16 >= var15) {
									wallDecoration.renderable.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, var11 + wallDecoration.anInt298 * -1652093979, var24, var26 + wallDecoration.anInt299 * -17941331, wallDecoration.anInt302 * 414599861);
								} else if (wallDecoration.aClass108_Sub20_Sub14_301 != null) {
									wallDecoration.aClass108_Sub20_Sub14_301.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, var11, var24, var26, wallDecoration.anInt302 * 414599861);
								}
							}
						}

						Wall wall = tile.wall;
						if (wall != null) {
							if ((wall.anInt333 * -2065803153 & tile.anInt1623 * 98641359) != 0 && !this.isWallCulled(var7, var4, var5, wall.anInt333 * -2065803153)) {
								wall.aClass108_Sub20_Sub14_343.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, wall.anInt334 * 1597898123 - xCameraPos, wall.anInt335 * 1266353119 - zCameraPos, wall.anInt339 * 251671425 - yCameraPos, wall.anInt337 * 639818003);
							}

							if ((wall.anInt336 * 1243649837 & tile.anInt1623 * 98641359) != 0 && !this.isWallCulled(var7, var4, var5, wall.anInt336 * 1243649837)) {
								wall.aClass108_Sub20_Sub14_338.renderAtPoint(0, anInt428, anInt434, anInt430, anInt431, wall.anInt334 * 1597898123 - xCameraPos, wall.anInt335 * 1266353119 - zCameraPos, wall.anInt339 * 251671425 - yCameraPos, wall.anInt337 * 639818003);
							}
						}
					}

					Tile var32;
					if (var6 < this.depth - 1) {
						var32 = this.tileArray[var6 + 1][var4][var5];
						if (var32 != null && var32.aBool1618) {
							aClass105_412.insertBack(var32);
						}
					}

					if (var4 < xCamPosTile) {
						var32 = var8[var4 + 1][var5];
						if (var32 != null && var32.aBool1618) {
							aClass105_412.insertBack(var32);
						}
					}

					if (var5 < yCamPosTile) {
						var32 = var8[var4][var5 + 1];
						if (var32 != null && var32.aBool1618) {
							aClass105_412.insertBack(var32);
						}
					}

					if (var4 > xCamPosTile) {
						var32 = var8[var4 - 1][var5];
						if (var32 != null && var32.aBool1618) {
							aClass105_412.insertBack(var32);
						}
					}

					if (var5 > yCamPosTile) {
						var32 = var8[var4][var5 - 1];
						if (var32 != null && var32.aBool1618) {
							aClass105_412.insertBack(var32);
						}
					}
				}
			}
		}
	}

	boolean isTileCulled(int var1, int var2, int var3) {
		int var4 = this.anIntArrayArrayArray410[var1][var2][var3];
		if (var4 == -cycle) {
			return false;
		} else if (var4 == cycle) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.isCulled(var5 + 1, this.heightMap[var1][var2][var3], var6 + 1) && this.isCulled(var5 + 128 - 1, this.heightMap[var1][var2 + 1][var3], var6 + 1) && this.isCulled(var5 + 128 - 1, this.heightMap[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.isCulled(var5 + 1, this.heightMap[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.anIntArrayArrayArray410[var1][var2][var3] = cycle;
				return true;
			} else {
				this.anIntArrayArrayArray410[var1][var2][var3] = -cycle;
				return false;
			}
		}
	}

	void method442(ShapedTile var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.vertexX.length;

		int var9;
		int var10;
		int var11;
		int var13;
		int var15;
		for (var13 = 0; var13 < var8; ++var13) {
			var15 = var1.vertexX[var13] - xCameraPos;
			var9 = var1.vertexY[var13] - zCameraPos;
			var10 = var1.vertexZ[var13] - yCameraPos;
			var11 = var10 * var4 + var15 * var5 >> 16;
			var10 = var10 * var5 - var15 * var4 >> 16;
			var15 = var11;
			var11 = var9 * var3 - var10 * var2 >> 16;
			var10 = var9 * var2 + var10 * var3 >> 16;
			if (var10 < 50) {
				return;
			}

			if (var1.anIntArray553 != null) {
				ShapedTile.anIntArray540[var13] = var15;
				ShapedTile.anIntArray554[var13] = var11;
				ShapedTile.anIntArray536[var13] = var10;
			}

			ShapedTile.anIntArray551[var13] = Rasterizer3D.centerX + (var15 << 9) / var10;
			ShapedTile.anIntArray550[var13] = Rasterizer3D.centerY + (var11 << 9) / var10;
		}

		Rasterizer3D.alpha = 0;
		var8 = var1.triangleA.length;

		for (var13 = 0; var13 < var8; ++var13) {
			var15 = var1.triangleA[var13];
			var9 = var1.triangleB[var13];
			var10 = var1.triangleC[var13];
			var11 = ShapedTile.anIntArray551[var15];
			int var12 = ShapedTile.anIntArray551[var9];
			int var16 = ShapedTile.anIntArray551[var10];
			int var17 = ShapedTile.anIntArray550[var15];
			int var18 = ShapedTile.anIntArray550[var9];
			int var19 = ShapedTile.anIntArray550[var10];
			if ((var11 - var12) * (var19 - var18) - (var17 - var18) * (var16 - var12) > 0) {
				Rasterizer3D.restrictEdges = false;
				if (var11 < 0 || var12 < 0 || var16 < 0 || var11 > Rasterizer3D.anInt2502 || var12 > Rasterizer3D.anInt2502 || var16 > Rasterizer3D.anInt2502) {
					Rasterizer3D.restrictEdges = true;
				}

				if (aBool433 && this.method526(anInt435, anInt436, var17, var18, var19, var11, var12, var16)) {
					anInt437 = var6;
					anInt424 = var7;
				}

				if (var1.anIntArray553 != null && var1.anIntArray553[var13] != -1) {
					if (!aBool411) {
						if (var1.aBool546) {
							Rasterizer3D.method2937(var17, var18, var19, var11, var12, var16, var1.triangleHSL_A[var13], var1.triangle_HSL_B[var13], var1.triangleHSL_C[var13], ShapedTile.anIntArray540[0], ShapedTile.anIntArray540[1], ShapedTile.anIntArray540[3], ShapedTile.anIntArray554[0], ShapedTile.anIntArray554[1], ShapedTile.anIntArray554[3], ShapedTile.anIntArray536[0], ShapedTile.anIntArray536[1], ShapedTile.anIntArray536[3], var1.anIntArray553[var13]);
						} else {
							Rasterizer3D.method2937(var17, var18, var19, var11, var12, var16, var1.triangleHSL_A[var13], var1.triangle_HSL_B[var13], var1.triangleHSL_C[var13], ShapedTile.anIntArray540[var15], ShapedTile.anIntArray540[var9], ShapedTile.anIntArray540[var10], ShapedTile.anIntArray554[var15], ShapedTile.anIntArray554[var9], ShapedTile.anIntArray554[var10], ShapedTile.anIntArray536[var15], ShapedTile.anIntArray536[var9], ShapedTile.anIntArray536[var10], var1.anIntArray553[var13]);
						}
					} else {
						int var14 = Rasterizer3D.anInterface2_2501.method21(var1.anIntArray553[var13], -591535061);
						Rasterizer3D.method2932(var17, var18, var19, var11, var12, var16, method423(var14, var1.triangleHSL_A[var13]), method423(var14, var1.triangle_HSL_B[var13]), method423(var14, var1.triangleHSL_C[var13]));
					}
				} else if (var1.triangleHSL_A[var13] != 12345678) {
					Rasterizer3D.method2932(var17, var18, var19, var11, var12, var16, var1.triangleHSL_A[var13], var1.triangle_HSL_B[var13], var1.triangleHSL_C[var13]);
				}
			}
		}

	}

	void method445() {
		int var1 = cullingClusterPointer[plane];
		CullingCluster[] var5 = cullingClusters[plane];
		anInt444 = 0;

		for (int var4 = 0; var4 < var1; ++var4) {
			CullingCluster var2 = var5[var4];
			int var3;
			int var6;
			int var7;
			int var8;
			boolean var9;
			if (var2.anInt644 * -1874526279 == 1) {
				var8 = var2.anInt649 * -437373355 - xCamPosTile + 25;
				if (var8 >= 0 && var8 <= 50) {
					var6 = var2.anInt642 * 964995897 - yCamPosTile + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var2.anInt661 * -1554923397 - yCamPosTile + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var9 = false;

					while (var6 <= var7) {
						if (visibleTiles[var8][var6++]) {
							var9 = true;
							break;
						}
					}

					if (var9) {
						var3 = xCameraPos - var2.anInt645 * -47013057;
						if (var3 > 32) {
							var2.anInt651 = -927793623;
						} else {
							if (var3 >= -32) {
								continue;
							}

							var2.anInt651 = -1855587246;
							var3 = -var3;
						}

						var2.anInt654 = (var2.anInt647 * 1567332133 - yCameraPos << 8) / var3 * -235416623;
						var2.anInt655 = (var2.anInt643 * 452864001 - yCameraPos << 8) / var3 * 1619077315;
						var2.anInt656 = (var2.anInt658 * -833251235 - zCameraPos << 8) / var3 * -1061839087;
						var2.anInt657 = (var2.anInt650 * -1204041451 - zCameraPos << 8) / var3 * -1989063057;
						aClass46Array445[anInt444++] = var2;
					}
				}
			} else if (var2.anInt644 * -1874526279 == 2) {
				var8 = var2.anInt642 * 964995897 - yCamPosTile + 25;
				if (var8 >= 0 && var8 <= 50) {
					var6 = var2.anInt649 * -437373355 - xCamPosTile + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var2.anInt641 * 1185851827 - xCamPosTile + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var9 = false;

					while (var6 <= var7) {
						if (visibleTiles[var6++][var8]) {
							var9 = true;
							break;
						}
					}

					if (var9) {
						var3 = yCameraPos - var2.anInt647 * 1567332133;
						if (var3 > 32) {
							var2.anInt651 = 1511586427;
						} else {
							if (var3 >= -32) {
								continue;
							}

							var2.anInt651 = 583792804;
							var3 = -var3;
						}

						var2.anInt640 = (var2.anInt645 * -47013057 - xCameraPos << 8) / var3 * 825026817;
						var2.anInt653 = (var2.anInt652 * 2005978415 - xCameraPos << 8) / var3 * -1938500855;
						var2.anInt656 = (var2.anInt658 * -833251235 - zCameraPos << 8) / var3 * -1061839087;
						var2.anInt657 = (var2.anInt650 * -1204041451 - zCameraPos << 8) / var3 * -1989063057;
						aClass46Array445[anInt444++] = var2;
					}
				}
			} else if (var2.anInt644 * -1874526279 == 4) {
				var8 = var2.anInt658 * -833251235 - zCameraPos;
				if (var8 > 128) {
					var6 = var2.anInt642 * 964995897 - yCamPosTile + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var2.anInt661 * -1554923397 - yCamPosTile + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					if (var6 <= var7) {
						int var13 = var2.anInt649 * -437373355 - xCamPosTile + 25;
						if (var13 < 0) {
							var13 = 0;
						}

						var3 = var2.anInt641 * 1185851827 - xCamPosTile + 25;
						if (var3 > 50) {
							var3 = 50;
						}

						boolean var11 = false;

						label144:
						for (int var10 = var13; var10 <= var3; ++var10) {
							for (int var12 = var6; var12 <= var7; ++var12) {
								if (visibleTiles[var10][var12]) {
									var11 = true;
									break label144;
								}
							}
						}

						if (var11) {
							var2.anInt651 = -344000819;
							var2.anInt640 = (var2.anInt645 * -47013057 - xCameraPos << 8) / var8 * 825026817;
							var2.anInt653 = (var2.anInt652 * 2005978415 - xCameraPos << 8) / var8 * -1938500855;
							var2.anInt654 = (var2.anInt647 * 1567332133 - yCameraPos << 8) / var8 * -235416623;
							var2.anInt655 = (var2.anInt643 * 452864001 - yCameraPos << 8) / var8 * 1619077315;
							aClass46Array445[anInt444++] = var2;
						}
					}
				}
			}
		}

	}

	boolean isWallCulled(int z, int x, int y, int var4) {
		if (!this.isTileCulled(z, x, y)) {
			return false;
		} else {
			int var5 = x << 7;
			int var7 = y << 7;
			int var6 = this.heightMap[z][x][y] - 1;
			int var10 = var6 - 120;
			int var8 = var6 - 230;
			int var9 = var6 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > xCameraPos) {
						if (!this.isCulled(var5, var6, var7)) {
							return false;
						}

						if (!this.isCulled(var5, var6, var7 + 128)) {
							return false;
						}
					}

					if (z > 0) {
						if (!this.isCulled(var5, var10, var7)) {
							return false;
						}

						if (!this.isCulled(var5, var10, var7 + 128)) {
							return false;
						}
					}

					if (!this.isCulled(var5, var8, var7)) {
						return false;
					}

					if (!this.isCulled(var5, var8, var7 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var7 < yCameraPos) {
						if (!this.isCulled(var5, var6, var7 + 128)) {
							return false;
						}

						if (!this.isCulled(var5 + 128, var6, var7 + 128)) {
							return false;
						}
					}

					if (z > 0) {
						if (!this.isCulled(var5, var10, var7 + 128)) {
							return false;
						}

						if (!this.isCulled(var5 + 128, var10, var7 + 128)) {
							return false;
						}
					}

					if (!this.isCulled(var5, var8, var7 + 128)) {
						return false;
					}

					if (!this.isCulled(var5 + 128, var8, var7 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < xCameraPos) {
						if (!this.isCulled(var5 + 128, var6, var7)) {
							return false;
						}

						if (!this.isCulled(var5 + 128, var6, var7 + 128)) {
							return false;
						}
					}

					if (z > 0) {
						if (!this.isCulled(var5 + 128, var10, var7)) {
							return false;
						}

						if (!this.isCulled(var5 + 128, var10, var7 + 128)) {
							return false;
						}
					}

					if (!this.isCulled(var5 + 128, var8, var7)) {
						return false;
					}

					if (!this.isCulled(var5 + 128, var8, var7 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var7 > yCameraPos) {
						if (!this.isCulled(var5, var6, var7)) {
							return false;
						}

						if (!this.isCulled(var5 + 128, var6, var7)) {
							return false;
						}
					}

					if (z > 0) {
						if (!this.isCulled(var5, var10, var7)) {
							return false;
						}

						if (!this.isCulled(var5 + 128, var10, var7)) {
							return false;
						}
					}

					if (!this.isCulled(var5, var8, var7)) {
						return false;
					}

					if (!this.isCulled(var5 + 128, var8, var7)) {
						return false;
					}

					return true;
				}
			}

			return !this.isCulled(var5 + 64, var9, var7 + 64) ? false : (var4 == 16 ? this.isCulled(var5, var8, var7 + 128) : (var4 == 32 ? this.isCulled(var5 + 128, var8, var7 + 128) : (var4 == 64 ? this.isCulled(var5 + 128, var8, var7) : (var4 == 128 ? this.isCulled(var5, var8, var7) : true))));
		}
	}

	boolean isCulled(int var1, int var2, int var3, int var4) {
		if (!this.isTileCulled(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.isCulled(var5 + 1, this.heightMap[var1][var2][var3] - var4, var6 + 1) && this.isCulled(var5 + 128 - 1, this.heightMap[var1][var2 + 1][var3] - var4, var6 + 1) && this.isCulled(var5 + 128 - 1, this.heightMap[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.isCulled(var5 + 1, this.heightMap[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	boolean isCulled(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8;
		int var9;
		if (var2 == var3 && var4 == var5) {
			if (!this.isTileCulled(var1, var2, var4)) {
				return false;
			} else {
				var8 = var2 << 7;
				var9 = var4 << 7;
				return this.isCulled(var8 + 1, this.heightMap[var1][var2][var4] - var6, var9 + 1) && this.isCulled(var8 + 128 - 1, this.heightMap[var1][var2 + 1][var4] - var6, var9 + 1) && this.isCulled(var8 + 128 - 1, this.heightMap[var1][var2 + 1][var4 + 1] - var6, var9 + 128 - 1) && this.isCulled(var8 + 1, this.heightMap[var1][var2][var4 + 1] - var6, var9 + 128 - 1);
			}
		} else {
			for (var8 = var2; var8 <= var3; ++var8) {
				for (var9 = var4; var9 <= var5; ++var9) {
					if (this.anIntArrayArrayArray410[var1][var8][var9] == -cycle) {
						return false;
					}
				}
			}

			var8 = (var2 << 7) + 1;
			var9 = (var4 << 7) + 2;
			int var10 = this.heightMap[var1][var2][var4] - var6;
			if (!this.isCulled(var8, var10, var9)) {
				return false;
			} else {
				int var7 = (var3 << 7) - 1;
				if (!this.isCulled(var7, var10, var9)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					if (!this.isCulled(var8, var10, var11)) {
						return false;
					} else if (!this.isCulled(var7, var10, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	boolean isCulled(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt444; ++var4) {
			CullingCluster cluster = aClass46Array445[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (cluster.anInt651 * 900038169 == 1) {
				var6 = cluster.anInt645 * -47013057 - var1;
				if (var6 > 0) {
					var8 = cluster.anInt647 * 1567332133 + (cluster.anInt654 * 869229873 * var6 >> 8);
					var7 = cluster.anInt643 * 452864001 + (cluster.anInt655 * -968833045 * var6 >> 8);
					var10 = cluster.anInt658 * -833251235 + (cluster.anInt656 * 1851994609 * var6 >> 8);
					var9 = cluster.anInt650 * -1204041451 + (cluster.anInt657 * 1664471183 * var6 >> 8);
					if (var3 >= var8 && var3 <= var7 && var2 >= var10 && var2 <= var9) {
						return true;
					}
				}
			} else if (cluster.anInt651 * 900038169 == 2) {
				var6 = var1 - cluster.anInt645 * -47013057;
				if (var6 > 0) {
					var8 = cluster.anInt647 * 1567332133 + (cluster.anInt654 * 869229873 * var6 >> 8);
					var7 = cluster.anInt643 * 452864001 + (cluster.anInt655 * -968833045 * var6 >> 8);
					var10 = cluster.anInt658 * -833251235 + (cluster.anInt656 * 1851994609 * var6 >> 8);
					var9 = cluster.anInt650 * -1204041451 + (cluster.anInt657 * 1664471183 * var6 >> 8);
					if (var3 >= var8 && var3 <= var7 && var2 >= var10 && var2 <= var9) {
						return true;
					}
				}
			} else if (cluster.anInt651 * 900038169 == 3) {
				var6 = cluster.anInt647 * 1567332133 - var3;
				if (var6 > 0) {
					var8 = cluster.anInt645 * -47013057 + (cluster.anInt640 * 1105467137 * var6 >> 8);
					var7 = cluster.anInt652 * 2005978415 + (cluster.anInt653 * 1817619257 * var6 >> 8);
					var10 = cluster.anInt658 * -833251235 + (cluster.anInt656 * 1851994609 * var6 >> 8);
					var9 = cluster.anInt650 * -1204041451 + (cluster.anInt657 * 1664471183 * var6 >> 8);
					if (var1 >= var8 && var1 <= var7 && var2 >= var10 && var2 <= var9) {
						return true;
					}
				}
			} else if (cluster.anInt651 * 900038169 == 4) {
				var6 = var3 - cluster.anInt647 * 1567332133;
				if (var6 > 0) {
					var8 = cluster.anInt645 * -47013057 + (cluster.anInt640 * 1105467137 * var6 >> 8);
					var7 = cluster.anInt652 * 2005978415 + (cluster.anInt653 * 1817619257 * var6 >> 8);
					var10 = cluster.anInt658 * -833251235 + (cluster.anInt656 * 1851994609 * var6 >> 8);
					var9 = cluster.anInt650 * -1204041451 + (cluster.anInt657 * 1664471183 * var6 >> 8);
					if (var1 >= var8 && var1 <= var7 && var2 >= var10 && var2 <= var9) {
						return true;
					}
				}
			} else if (cluster.anInt651 * 900038169 == 5) {
				var6 = var2 - cluster.anInt658 * -833251235;
				if (var6 > 0) {
					var8 = cluster.anInt645 * -47013057 + (cluster.anInt640 * 1105467137 * var6 >> 8);
					var7 = cluster.anInt652 * 2005978415 + (cluster.anInt653 * 1817619257 * var6 >> 8);
					var10 = cluster.anInt647 * 1567332133 + (cluster.anInt654 * 869229873 * var6 >> 8);
					var9 = cluster.anInt643 * 452864001 + (cluster.anInt655 * -968833045 * var6 >> 8);
					if (var1 >= var8 && var1 <= var7 && var3 >= var10 && var3 <= var9) {
						return true;
					}
				}
			}
		}

		return false;
	}

	public void method462(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tileArray[var1][var2][var3];
		if (var5 != null) {
			this.tileArray[var1][var2][var3].anInt1616 = var4 * -2101078991;
		}
	}

	public void method466() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.depth; ++var1) {
			for (var2 = 0; var2 < this.xMapSize; ++var2) {
				for (int var3 = 0; var3 < this.yMapSize; ++var3) {
					this.tileArray[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < cullingClusterCount; ++var1) {
			for (var2 = 0; var2 < cullingClusterPointer[var1]; ++var2) {
				cullingClusters[var1][var2] = null;
			}

			cullingClusterPointer[var1] = 0;
		}

		for (var1 = 0; var1 < this.interactableObjectCount; ++var1) {
			this.interfactableObjectCache[var1] = null;
		}

		this.interactableObjectCount = 0;

		for (var1 = 0; var1 < aClass40Array432.length; ++var1) {
			aClass40Array432[var1] = null;
		}

	}

	public static void method476(int[] var0, int var1, int var2, int var3, int var4) {
		anInt462 = 0;
		anInt461 = 0;
		anInt402 = var3;
		anInt463 = var4;
		anInt458 = var3 / 2;
		anInt405 = var4 / 2;
		boolean[][][][] var7 = new boolean[9][32][53][53];

		int var6;
		int var8;
		int var9;
		int var10;
		int var11;
		int var15;
		for (var8 = 128; var8 <= 384; var8 += 32) {
			for (var9 = 0; var9 < 2048; var9 += 64) {
				anInt428 = Rasterizer3D.SINE[var8];
				anInt434 = Rasterizer3D.COSINE[var8];
				anInt430 = Rasterizer3D.SINE[var9];
				anInt431 = Rasterizer3D.COSINE[var9];
				var10 = (var8 - 128) / 32;
				var11 = var9 / 64;

				for (int var5 = -26; var5 <= 26; ++var5) {
					var6 = -26;

					while (var6 <= 26) {
						var15 = var5 * 128;
						int var13 = var6 * 128;
						boolean var12 = false;
						int var14 = -var1;

						while (true) {
							if (var14 <= var2) {
								if (!method509(var15, var0[var10] + var14, var13)) {
									var14 += 128;
									continue;
								}

								var12 = true;
							}

							var7[var10][var11][var5 + 25 + 1][var6 + 25 + 1] = var12;
							++var6;
							break;
						}
					}
				}
			}
		}

		for (var8 = 0; var8 < 8; ++var8) {
			for (var9 = 0; var9 < 32; ++var9) {
				for (var10 = -25; var10 < 25; ++var10) {
					var11 = -25;

					while (var11 < 25) {
						boolean var16 = false;
						var6 = -1;

						label91:
						while (true) {
							if (var6 <= 1) {
								var15 = -1;

								while (true) {
									if (var15 > 1) {
										++var6;
										continue label91;
									}

									if (var7[var8][var9][var10 + var6 + 25 + 1][var11 + var15 + 25 + 1]) {
										var16 = true;
										break;
									}

									if (var7[var8][(var9 + 1) % 31][var10 + var6 + 25 + 1][var11 + var15 + 25 + 1]) {
										var16 = true;
										break;
									}

									if (var7[var8 + 1][var9][var10 + var6 + 25 + 1][var11 + var15 + 25 + 1]) {
										var16 = true;
										break;
									}

									if (var7[var8 + 1][(var9 + 1) % 31][var10 + var6 + 25 + 1][var11 + var15 + 25 + 1]) {
										var16 = true;
										break;
									}

									++var15;
								}
							}

							visibilityTilesMap[var8][var9][var10 + 25][var11 + 25] = var16;
							++var11;
							break;
						}
					}
				}
			}
		}

	}

	public void removeGroundItemTile(int var1, int var2, int var3) {
		Tile var4 = this.tileArray[var1][var2][var3];
		if (var4 != null) {
			var4.groundItem = null;
		}
	}

	public void method486(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.depth; ++var4) {
			for (int var9 = 0; var9 < this.xMapSize; ++var9) {
				for (int var8 = 0; var8 < this.yMapSize; ++var8) {
					Tile var10 = this.tileArray[var4][var9][var8];
					if (var10 != null) {
						Wall var5 = var10.wall;
						RSModel var7;
						if (var5 != null && var5.aClass108_Sub20_Sub14_338 instanceof RSModel) {
							RSModel var6 = (RSModel) var5.aClass108_Sub20_Sub14_338;
							this.method434(var6, var4, var9, var8, 1, 1);
							if (var5.aClass108_Sub20_Sub14_343 instanceof RSModel) {
								var7 = (RSModel) var5.aClass108_Sub20_Sub14_343;
								this.method434(var7, var4, var9, var8, 1, 1);
								RSModel.method3069(var6, var7, 0, 0, 0, false);
								var5.aClass108_Sub20_Sub14_343 = var7.createModelRasterizer(var7.aShort2565, var7.aShort2589, var1, var2, var3);
							}

							var5.aClass108_Sub20_Sub14_338 = var6.createModelRasterizer(var6.aShort2565, var6.aShort2589, var1, var2, var3);
						}

						for (int var12 = 0; var12 < var10.anInt1612 * -1912292193; ++var12) {
							InteractableObject var14 = var10.interactableObjects[var12];
							if (var14 != null && var14.renderableObject instanceof RSModel) {
								RSModel var11 = (RSModel) var14.renderableObject;
								this.method434(var11, var4, var9, var8, var14.anInt582 * 1424354129 - var14.xPos * 1316787257 + 1, var14.anInt579 * 1215390305 - var14.yPos * 922395151 + 1);
								var14.renderableObject = var11.createModelRasterizer(var11.aShort2565, var11.aShort2589, var1, var2, var3);
							}
						}

						FloorDecoration var13 = var10.floorDecoration;
						if (var13 != null && var13.renderable instanceof RSModel) {
							var7 = (RSModel) var13.renderable;
							this.method401(var7, var4, var9, var8);
							var13.renderable = var7.createModelRasterizer(var7.aShort2565, var7.aShort2589, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	void method490(PlainTile var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - xCameraPos;
		int var21;
		int var14 = var21 = (var8 << 7) - yCameraPos;
		int var17;
		int var19 = var17 = var10 + 128;
		int var15;
		int var11 = var15 = var14 + 128;
		int var20 = this.heightMap[var2][var7][var8] - zCameraPos;
		int var16 = this.heightMap[var2][var7 + 1][var8] - zCameraPos;
		int var13 = this.heightMap[var2][var7 + 1][var8 + 1] - zCameraPos;
		int var18 = this.heightMap[var2][var7][var8 + 1] - zCameraPos;
		int var12 = var14 * var5 + var10 * var6 >> 16;
		var14 = var14 * var6 - var10 * var5 >> 16;
		var10 = var12;
		var12 = var20 * var4 - var14 * var3 >> 16;
		var14 = var20 * var3 + var14 * var4 >> 16;
		var20 = var12;
		if (var14 >= 50) {
			var12 = var21 * var5 + var19 * var6 >> 16;
			var21 = var21 * var6 - var19 * var5 >> 16;
			var19 = var12;
			var12 = var16 * var4 - var21 * var3 >> 16;
			var21 = var16 * var3 + var21 * var4 >> 16;
			var16 = var12;
			if (var21 >= 50) {
				var12 = var11 * var5 + var17 * var6 >> 16;
				var11 = var11 * var6 - var17 * var5 >> 16;
				var17 = var12;
				var12 = var13 * var4 - var11 * var3 >> 16;
				var11 = var13 * var3 + var11 * var4 >> 16;
				var13 = var12;
				if (var11 >= 50) {
					var12 = var15 * var5 + var9 * var6 >> 16;
					var15 = var15 * var6 - var9 * var5 >> 16;
					var9 = var12;
					var12 = var18 * var4 - var15 * var3 >> 16;
					var15 = var18 * var3 + var15 * var4 >> 16;
					if (var15 >= 50) {
						int var29 = Rasterizer3D.centerX + (var10 << 9) / var14;
						int var30 = Rasterizer3D.centerY + (var20 << 9) / var14;
						int var28 = Rasterizer3D.centerX + (var19 << 9) / var21;
						int var26 = Rasterizer3D.centerY + (var16 << 9) / var21;
						int var27 = Rasterizer3D.centerX + (var17 << 9) / var11;
						int var24 = Rasterizer3D.centerY + (var13 << 9) / var11;
						int var22 = Rasterizer3D.centerX + (var9 << 9) / var15;
						int var25 = Rasterizer3D.centerY + (var12 << 9) / var15;
						Rasterizer3D.alpha = 0;
						int var23;
						if ((var27 - var22) * (var26 - var25) - (var24 - var25) * (var28 - var22) > 0) {
							Rasterizer3D.restrictEdges = false;
							if (var27 < 0 || var22 < 0 || var28 < 0 || var27 > Rasterizer3D.anInt2502 || var22 > Rasterizer3D.anInt2502 || var28 > Rasterizer3D.anInt2502) {
								Rasterizer3D.restrictEdges = true;
							}

							if (aBool433 && this.method526(anInt435, anInt436, var24, var25, var26, var27, var22, var28)) {
								anInt437 = var7;
								anInt424 = var8;
							}

							if (var1.anInt509 * -482843313 == -1) {
								if (var1.anInt505 * 22178081 != 12345678) {
									Rasterizer3D.method2932(var24, var25, var26, var27, var22, var28, var1.anInt505 * 22178081, var1.anInt507 * 308003115, var1.anInt504 * 1652666251);
								}
							} else if (!aBool411) {
								if (var1.aBool508) {
									Rasterizer3D.method2937(var24, var25, var26, var27, var22, var28, var1.anInt505 * 22178081, var1.anInt507 * 308003115, var1.anInt504 * 1652666251, var10, var19, var9, var20, var16, var12, var14, var21, var15, var1.anInt509 * -482843313);
								} else {
									Rasterizer3D.method2937(var24, var25, var26, var27, var22, var28, var1.anInt505 * 22178081, var1.anInt507 * 308003115, var1.anInt504 * 1652666251, var17, var9, var19, var13, var12, var16, var11, var15, var21, var1.anInt509 * -482843313);
								}
							} else {
								var23 = Rasterizer3D.anInterface2_2501.method21(var1.anInt509 * -482843313, -54823951);
								Rasterizer3D.method2932(var24, var25, var26, var27, var22, var28, method423(var23, var1.anInt505 * 22178081), method423(var23, var1.anInt507 * 308003115), method423(var23, var1.anInt504 * 1652666251));
							}
						}

						if ((var29 - var28) * (var25 - var26) - (var30 - var26) * (var22 - var28) > 0) {
							Rasterizer3D.restrictEdges = false;
							if (var29 < 0 || var28 < 0 || var22 < 0 || var29 > Rasterizer3D.anInt2502 || var28 > Rasterizer3D.anInt2502 || var22 > Rasterizer3D.anInt2502) {
								Rasterizer3D.restrictEdges = true;
							}

							if (aBool433 && this.method526(anInt435, anInt436, var30, var26, var25, var29, var28, var22)) {
								anInt437 = var7;
								anInt424 = var8;
							}

							if (var1.anInt509 * -482843313 == -1) {
								if (var1.anInt503 * -1317598385 != 12345678) {
									Rasterizer3D.method2932(var30, var26, var25, var29, var28, var22, var1.anInt503 * -1317598385, var1.anInt504 * 1652666251, var1.anInt507 * 308003115);
								}
							} else if (!aBool411) {
								Rasterizer3D.method2937(var30, var26, var25, var29, var28, var22, var1.anInt503 * -1317598385, var1.anInt504 * 1652666251, var1.anInt507 * 308003115, var10, var19, var9, var20, var16, var12, var14, var21, var15, var1.anInt509 * -482843313);
							} else {
								var23 = Rasterizer3D.anInterface2_2501.method21(var1.anInt509 * -482843313, -1111881249);
								Rasterizer3D.method2932(var30, var26, var25, var29, var28, var22, method423(var23, var1.anInt503 * -1317598385), method423(var23, var1.anInt504 * 1652666251), method423(var23, var1.anInt507 * 308003115));
							}
						}
					}
				}
			}
		}
	}

	public void method491(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tileArray[var1][var2][var3];
		if (var5 != null) {
			WallDecoration var6 = var5.wallDecoration;
			if (var6 != null) {
				var6.anInt298 = var6.anInt298 * -1652093979 * var4 / 16 * 969161197;
				var6.anInt299 = var6.anInt299 * -17941331 * var4 / 16 * 1276806949;
			}
		}
	}

	public Wall getWall(int plane, int x, int y) {
		Tile tile = this.tileArray[plane][x][y];
		return tile != null ? tile.wall : null;
	}

	public void resetWallDecoration(int plane, int x, int y) {
		Tile tile = this.tileArray[plane][x][y];
		if (tile != null) {
			tile.wallDecoration = null;
		}
	}

	public InteractableObject method502(int plane, int x, int y) {
		Tile tile = this.tileArray[plane][x][y];
		if (tile == null) {
			return null;
		} else {
			for (int var6 = 0; var6 < tile.anInt1612 * -1912292193; ++var6) {
				InteractableObject io = tile.interactableObjects[var6];
				if ((io.anInt586 * 380600017 >> 29 & 3) == 2 && io.xPos * 1316787257 == x && io.yPos * 922395151 == y) {
					return io;
				}
			}

			return null; 
		}
	}

	static boolean method509(int var0, int var1, int var2) {
		int var3 = var2 * anInt430 + var0 * anInt431 >> 16;
		int var5 = var2 * anInt431 - var0 * anInt430 >> 16;
		int var7 = var1 * anInt428 + var5 * anInt434 >> 16;
		int var6 = var1 * anInt434 - var5 * anInt428 >> 16;
		if (var7 >= 50 && var7 <= 3500) {
			int var8 = anInt458 + (var3 << 9) / var7;
			int var4 = anInt405 + (var6 << 9) / var7;
			return var8 >= anInt462 && var8 <= anInt402 && var4 >= anInt461 && var4 <= anInt463;
		} else {
			return false;
		}
	}

	boolean method526(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var2 < var3 && var2 < var4 && var2 < var5) {
			return false;
		} else if (var2 > var3 && var2 > var4 && var2 > var5) {
			return false;
		} else if (var1 < var6 && var1 < var7 && var1 < var8) {
			return false;
		} else if (var1 > var6 && var1 > var7 && var1 > var8) {
			return false;
		} else {
			int var9 = (var2 - var3) * (var7 - var6) - (var1 - var6) * (var4 - var3);
			int var10 = (var2 - var5) * (var6 - var8) - (var1 - var8) * (var3 - var5);
			int var11 = (var2 - var4) * (var8 - var7) - (var1 - var7) * (var5 - var4);
			return var9 * var11 > 0 && var11 * var10 > 0;
		}
	}

	void method560(InteractableObject io) {
		for (int var2 = io.xPos * 1316787257; var2 <= io.anInt582 * 1424354129; ++var2) {
			for (int var3 = io.yPos * 922395151; var3 <= io.anInt579 * 1215390305; ++var3) {
				Tile tile = this.tileArray[io.anInt575 * -1461264715][var2][var3];
				if (tile != null) {
					int ioIndex;
					for (ioIndex = 0; ioIndex < tile.anInt1612 * -1912292193; ++ioIndex) {
						if (tile.interactableObjects[ioIndex] == io) {
							tile.anInt1612 += 1369350305;

							for (int var6 = ioIndex; var6 < tile.anInt1612 * -1912292193; ++var6) {
								tile.interactableObjects[var6] = tile.interactableObjects[var6 + 1];
								tile.objectFlags[var6] = tile.objectFlags[var6 + 1];
							}

							tile.interactableObjects[tile.anInt1612 * -1912292193] = null;
							break;
						}
					}

					tile.anInt1608 = 0;

					for (ioIndex = 0; ioIndex < tile.anInt1612 * -1912292193; ++ioIndex) {
						tile.anInt1608 = (tile.anInt1608 * 1322616499 | tile.objectFlags[ioIndex]) * 1373280379;
					}
				}
			}
		}

	}

	public void method566(int var1) {
		this.anInt407 = var1;

		for (int var2 = 0; var2 < this.xMapSize; ++var2) {
			for (int var3 = 0; var3 < this.yMapSize; ++var3) {
				if (this.tileArray[var1][var2][var3] == null) {
					this.tileArray[var1][var2][var3] = new Tile(var1, var2, var3);
				}
			}
		}

	}

	public Scene(int var1, int var2, int var3, int[][][] var4) {
		this.depth = var1;
		this.xMapSize = var2;
		this.yMapSize = var3;
		this.tileArray = new Tile[var1][var2][var3];
		this.anIntArrayArrayArray410 = new int[var1][var2 + 1][var3 + 1];
		this.heightMap = var4;
		this.method466();
	}
}
