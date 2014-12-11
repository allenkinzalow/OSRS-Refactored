import java.awt.*;

public class Class1 {

	int anInt2;
	public static Canvas aCanvas3;
	int anInt4;
	String aString5;
	int anInt6;
	int anInt7;
	public static final int anInt8 = 10;
	static final int anInt9 = 8;
	public static final int anInt10 = 92;
	public static final int anInt11 = 132;


	static void method35(int interID, int var1) {
		if (interID != -1) {
			if (AbstractIndex.method1073(interID, 1610753614)) {
				RSInterface[] components = RSInterface.interface_cache[interID];

				for (int compIndex = 0; compIndex < components.length; ++compIndex) {
					RSInterface component = components[compIndex];
					if (component.anObjectArray1861 != null) {
						ClientScript script = new ClientScript();
						script.parentInterface = component;
						script.parameters = component.anObjectArray1861;
						ClientScriptMap.executeScript(script, 2000000, (short) -30137);
					}
				}

			}
		}
	}

	public static int method36(int var0, int var1, int var2) {
		int var3;
		for (var3 = 1; var1 > 1; var1 >>= 1) {
			if (0 != (var1 & 1)) {
				var3 *= var0;
			}

			var0 *= var0;
		}

		if (1 == var1) {
			return var3 * var0;
		} else {
			return var3;
		}
	}

	public static boolean method37(int var0, int var1) {
		return (var0 & 1) != 0;
	}

	static final void createRegionScene(Scene scene, CollisionMap[] collisionMaps, int var2) {
		int plane;
		int x;
		int y;
		int originalPlane;
		for (plane = 0; plane < 4; ++plane) {
			for (x = 0; x < 104; ++x) {
				for (y = 0; y < 104; ++y) {
					if ((RegionReference.mapTileSettings[plane][x][y] & 1) == 1) {
						originalPlane = plane;
						if ((RegionReference.mapTileSettings[1][x][y] & 2) == 2) {
							originalPlane = plane - 1;
						}

						if (originalPlane >= 0) {
							collisionMaps[originalPlane].markBlocked(x, y, 322466363);
						}
					}
				}
			}
		}

		RegionReference.hueRandomizer += ((int) (Math.random() * 5.0D) - 2) * -1535870085;
		if (RegionReference.hueRandomizer * -2073023565 < -8) {
			RegionReference.hueRandomizer = -597941208;
		}

		if (RegionReference.hueRandomizer * -2073023565 > 8) {
			RegionReference.hueRandomizer = 597941208;
		}

		RegionReference.lightnessRandomizer += ((int) (Math.random() * 5.0D) - 2) * 1990361651;
		if (RegionReference.lightnessRandomizer * -1983624965 < -16) {
			RegionReference.lightnessRandomizer = -1781015344;
		}

		if (RegionReference.lightnessRandomizer * -1983624965 > 16) {
			RegionReference.lightnessRandomizer = 1781015344;
		}

		int var6;
		int var8;
		int yPos;
		int xPos;
		int floorIDFetch;
		int var25;
		int xHeightDifference;
		int var27;
		int yHeightDifference;
		int hueDivisor;
		for (plane = 0; plane < 4; ++plane) {
			byte[][] var46 = RegionReference.aByteArrayArrayArray488[plane];
			var27 = (int) Math.sqrt(5100.0D);
			var25 = var27 * 768 >> 8;

			int directionalLightIntensity;
			int var13;
			for (yPos = 1; yPos < 103; ++yPos) {
				for (xPos = 1; xPos < 103; ++xPos) {
					xHeightDifference = RegionReference.tileHeights[plane][1 + xPos][yPos] - RegionReference.tileHeights[plane][xPos - 1][yPos];
					yHeightDifference = RegionReference.tileHeights[plane][xPos][yPos + 1] - RegionReference.tileHeights[plane][xPos][yPos - 1];
					hueDivisor = (int) Math.sqrt((double) (yHeightDifference * yHeightDifference + xHeightDifference * xHeightDifference + 65536));
					floorIDFetch = (xHeightDifference << 8) / hueDivisor;
					var8 = 65536 / hueDivisor;
					var6 = (yHeightDifference << 8) / hueDivisor;
					directionalLightIntensity = 96 + (var6 * -50 + floorIDFetch * -50 + var8 * -10) / var25;
					var13 = (var46[xPos][yPos - 1] >> 2) + (var46[xPos - 1][yPos] >> 2) + (var46[1 + xPos][yPos] >> 3) + (var46[xPos][yPos + 1] >> 3) + (var46[xPos][yPos] >> 1);
					Class19.tileLightingIntensity[xPos][yPos] = directionalLightIntensity - var13;
				}
			}

			for (yPos = 0; yPos < 104; ++yPos) {
				RegionReference.blendedHue[yPos] = 0;
				RegionReference.blendedSaturation[yPos] = 0;
				IndexTable.blendedLightness[yPos] = 0;
				LoginHandler.blendedHueDivisor[yPos] = 0;
				Wall.blendedDirectionTracker[yPos] = 0;
			}

			for (yPos = -5; yPos < 109; ++yPos) {
				for (xPos = 0; xPos < 104; ++xPos) {
					xHeightDifference = 5 + yPos;
					if (xHeightDifference >= 0 && xHeightDifference < 104) {
						int floorId = GZIPDecompressor.underlayFloorIds[plane][xHeightDifference][xPos] & 255;
						if (floorId > 0) {
							floorIDFetch = floorId - 1;
							UnderlayDefinition underlayDef = (UnderlayDefinition) UnderlayDefinition.aClass106_2143.get((long) floorIDFetch);
							UnderlayDefinition floor;
							if (null != underlayDef) {
								floor = underlayDef;
							} else {
								byte[] floorData = UnderlayDefinition.aClass74_2147.getFile(1, floorIDFetch, (byte) 7);
								underlayDef = new UnderlayDefinition();
								if (floorData != null) {
									underlayDef.method2271(new RSByteBuffer(floorData), floorIDFetch, -1852305296);
								}

								underlayDef.method2278(749738555);
								UnderlayDefinition.aClass106_2143.put(underlayDef, (long) floorIDFetch);
								floor = underlayDef;
							}

							RegionReference.blendedHue[xPos] += floor.hue * -1957387667;
							RegionReference.blendedSaturation[xPos] += floor.saturation * -1288752181;
							IndexTable.blendedLightness[xPos] += floor.luminosity * -1539409761;
							LoginHandler.blendedHueDivisor[xPos] += floor.hueDivisor * -1997240389;
							++Wall.blendedDirectionTracker[xPos];
						}
					}

					yHeightDifference = yPos - 5;
					if (yHeightDifference >= 0 && yHeightDifference < 104) {
						hueDivisor = GZIPDecompressor.underlayFloorIds[plane][yHeightDifference][xPos] & 255;
						if (hueDivisor > 0) {
							var8 = hueDivisor - 1;
							UnderlayDefinition underlayDef = (UnderlayDefinition) UnderlayDefinition.aClass106_2143.get((long) var8);
							UnderlayDefinition floor;
							if (null != underlayDef) {
								floor = underlayDef;
							} else {
								byte[] var49 = UnderlayDefinition.aClass74_2147.getFile(1, var8, (byte) 7);
								underlayDef = new UnderlayDefinition();
								if (var49 != null) {
									underlayDef.method2271(new RSByteBuffer(var49), var8, -1852305296);
								}

								underlayDef.method2278(288310807);
								UnderlayDefinition.aClass106_2143.put(underlayDef, (long) var8);
								floor = underlayDef;
							}

							RegionReference.blendedHue[xPos] -= floor.hue * -1957387667;
							RegionReference.blendedSaturation[xPos] -= floor.saturation * -1288752181;
							IndexTable.blendedLightness[xPos] -= floor.luminosity * -1539409761;
							LoginHandler.blendedHueDivisor[xPos] -= floor.hueDivisor * -1997240389;
							--Wall.blendedDirectionTracker[xPos];
						}
					}
				}

				if (yPos >= 1 && yPos < 103) {
					xPos = 0;
					xHeightDifference = 0;
					yHeightDifference = 0;
					hueDivisor = 0;
					int blendedDirection = 0;

					for (var8 = -5; var8 < 109; ++var8) {
						var6 = var8 + 5;
						if (var6 >= 0 && var6 < 104) {
							xPos += RegionReference.blendedHue[var6];
							xHeightDifference += RegionReference.blendedSaturation[var6];
							yHeightDifference += IndexTable.blendedLightness[var6];
							hueDivisor += LoginHandler.blendedHueDivisor[var6];
							blendedDirection += Wall.blendedDirectionTracker[var6];
						}

						directionalLightIntensity = var8 - 5;
						if (directionalLightIntensity >= 0 && directionalLightIntensity < 104) {
							xPos -= RegionReference.blendedHue[directionalLightIntensity];
							xHeightDifference -= RegionReference.blendedSaturation[directionalLightIntensity];
							yHeightDifference -= IndexTable.blendedLightness[directionalLightIntensity];
							hueDivisor -= LoginHandler.blendedHueDivisor[directionalLightIntensity];
							blendedDirection -= Wall.blendedDirectionTracker[directionalLightIntensity];
						}

						if (var8 >= 1 && var8 < 103) {
							if (Client.lowMemory && 0 == (RegionReference.mapTileSettings[0][yPos][var8] & 2)) {
								if (0 != (RegionReference.mapTileSettings[plane][yPos][var8] & 16)) {
									continue;
								}

								if ((RegionReference.mapTileSettings[plane][yPos][var8] & 8) != 0) {
									var13 = 0;
								} else if (plane > 0 && (RegionReference.mapTileSettings[1][yPos][var8] & 2) != 0) {
									var13 = plane - 1;
								} else {
									var13 = plane;
								}

								if (Client.anInt2890 * -158871381 != var13) {
									continue;
								}
							}

							if (plane < RegionReference.anInt485 * -1362129233) {
								RegionReference.anInt485 = plane * -1850046385;
							}

							int underlayFloorID = GZIPDecompressor.underlayFloorIds[plane][yPos][var8] & 255;
							int overlayFloorID = RegionReference.overlayFloorIds[plane][yPos][var8] & 255;
							if (underlayFloorID > 0 || overlayFloorID > 0) {
								int vertexSouthWest = RegionReference.tileHeights[plane][yPos][var8];
								int vertexSouthEast = RegionReference.tileHeights[plane][1 + yPos][var8];
								int vertexNorthEast = RegionReference.tileHeights[plane][yPos + 1][var8 + 1];
								int vertexNorthWest = RegionReference.tileHeights[plane][yPos][1 + var8];
								int var19 = Class19.tileLightingIntensity[yPos][var8];
								int var20 = Class19.tileLightingIntensity[1 + yPos][var8];
								int var21 = Class19.tileLightingIntensity[1 + yPos][1 + var8];
								int var22 = Class19.tileLightingIntensity[yPos][var8 + 1];
								int var18 = -1;
								int hslBitset = -1;
								int hue;
								int luminosity;
								int saturation;
								if (underlayFloorID > 0) {
									hue = xPos * 256 / hueDivisor;
									saturation = xHeightDifference / blendedDirection;
									luminosity = yHeightDifference / blendedDirection;
									var18 = Varp.packHSL(hue, saturation, luminosity, 1298455127);
									hue = hue + RegionReference.hueRandomizer * -2073023565 & 255;
									luminosity += RegionReference.lightnessRandomizer * -1983624965;
									if (luminosity < 0) {
										luminosity = 0;
									} else if (luminosity > 255) {
										luminosity = 255;
									}

									hslBitset = Varp.packHSL(hue, saturation, luminosity, 1802545195);
								}

								FloorDefinition floorDef;
								if (plane > 0) {
									boolean hideUnderlay = true;
									if (underlayFloorID == 0 && RegionReference.overlayClippingPaths[plane][yPos][var8] != 0) {
										hideUnderlay = false;
									}

									if (overlayFloorID > 0) {
										int overlayID = overlayFloorID - 1;
										floorDef = (FloorDefinition) FloorDefinition.floorMap.get((long) overlayID);
										FloorDefinition floor;
										if (null != floorDef) {
											floor = floorDef;
										} else {
											byte[] floorData = FloorDefinition.configArchive_ref_floor.getFile(4, overlayID, (byte) 7);
											floorDef = new FloorDefinition();
											if (floorData != null) {
												floorDef.decode(new RSByteBuffer(floorData), overlayID, 198180841);
											}

											floorDef.method2344((byte) -47);
											FloorDefinition.floorMap.put(floorDef, (long) overlayID);
											floor = floorDef;
										}

										if (!floor.hideUnderlay) {
											hideUnderlay = false;
										}
									}

									if (hideUnderlay && vertexSouthEast == vertexSouthWest && vertexSouthWest == vertexNorthEast && vertexNorthWest == vertexSouthWest) {
										Class19.tileCullingBitset[plane][yPos][var8] |= 2340;
									}
								}

								hue = 0;
								if (-1 != hslBitset) {
									hue = Rasterizer3D.rgbTable[PlainTile.method622(hslBitset, 96, -1685737298)];
								}

								if (0 == overlayFloorID) {
									scene.method406(plane, yPos, var8, 0, 0, -1, vertexSouthWest, vertexSouthEast, vertexNorthEast, vertexNorthWest, PlainTile.method622(var18, var19, -1685737298), PlainTile.method622(var18, var20, -1685737298), PlainTile.method622(var18, var21, -1685737298), PlainTile.method622(var18, var22, -1685737298), 0, 0, 0, 0, hue, 0);
								} else {
									saturation = 1 + RegionReference.overlayClippingPaths[plane][yPos][var8];
									byte rotation = AnimationSkeletonSet.overlayRotations[plane][yPos][var8];
									int floorID = overlayFloorID - 1;
									FloorDefinition overlayFloorDef = (FloorDefinition) FloorDefinition.floorMap.get((long) floorID);
									if (overlayFloorDef != null) {
										floorDef = overlayFloorDef;
									} else {
										byte[] floorData = FloorDefinition.configArchive_ref_floor.getFile(4, floorID, (byte) 7);
										overlayFloorDef = new FloorDefinition();
										if (null != floorData) {
											overlayFloorDef.decode(new RSByteBuffer(floorData), floorID, -656471882);
										}

										overlayFloorDef.method2344((byte) -37);
										FloorDefinition.floorMap.put(overlayFloorDef, (long) floorID);
										floorDef = overlayFloorDef;
									}

									int textureID = floorDef.textureID * 1133570979;
									int var38;
									int var41;
									int var43;
									int var44;
									if (textureID >= 0) {
										var41 = Rasterizer3D.anInterface2_2501.method21(textureID, 72614764);
										var44 = -1;
									} else if (floorDef.rgbColor * 308395211 == 16711935) {
										var44 = -2;
										textureID = -1;
										var41 = -2;
									} else {
										var44 = Varp.packHSL(floorDef.hue * 1297919561, floorDef.saturation * -24553127, floorDef.luminosity * -715881191, 1552822455);
										var43 = floorDef.hue * 1297919561 + RegionReference.hueRandomizer * -2073023565 & 255;
										var38 = floorDef.luminosity * -715881191 + RegionReference.lightnessRandomizer * -1983624965;
										if (var38 < 0) {
											var38 = 0;
										} else if (var38 > 255) {
											var38 = 255;
										}

										var41 = Varp.packHSL(var43, floorDef.saturation * -24553127, var38, 1506801862);
									}

									var43 = 0;
									if (-2 != var41) {
										var43 = Rasterizer3D.rgbTable[CacheIndexRequest.method1927(var41, 96, 1263009375)];
									}

									if (floorDef.anInt2211 * 839525211 != -1) {
										var38 = RegionReference.hueRandomizer * -2073023565 + floorDef.anInt2220 * -1618940341 & 255;
										int var40 = floorDef.anInt2222 * -1393574217 + RegionReference.lightnessRandomizer * -1983624965;
										if (var40 < 0) {
											var40 = 0;
										} else if (var40 > 255) {
											var40 = 255;
										}

										var41 = Varp.packHSL(var38, floorDef.anInt2224 * -1327914801, var40, 1654676153);
										var43 = Rasterizer3D.rgbTable[CacheIndexRequest.method1927(var41, 96, 1171927012)];
									}

									scene.method406(plane, yPos, var8, saturation, rotation, textureID, vertexSouthWest, vertexSouthEast, vertexNorthEast, vertexNorthWest, PlainTile.method622(var18, var19, -1685737298), PlainTile.method622(var18, var20, -1685737298), PlainTile.method622(var18, var21, -1685737298), PlainTile.method622(var18, var22, -1685737298), CacheIndexRequest.method1927(var44, var19, 499533796), CacheIndexRequest.method1927(var44, var20, 953040577), CacheIndexRequest.method1927(var44, var21, 523883285), CacheIndexRequest.method1927(var44, var22, 659891708), hue, var43);
								}
							}
						}
					}
				}
			}

			for (yPos = 1; yPos < 103; ++yPos) {
				for (xPos = 1; xPos < 103; ++xPos) {
					if (0 != (RegionReference.mapTileSettings[plane][xPos][yPos] & 8)) {
						var8 = 0;
					} else if (plane > 0 && 0 != (RegionReference.mapTileSettings[1][xPos][yPos] & 2)) {
						var8 = plane - 1;
					} else {
						var8 = plane;
					}

					scene.method462(plane, xPos, yPos, var8);
				}
			}

			GZIPDecompressor.underlayFloorIds[plane] = null;
			RegionReference.overlayFloorIds[plane] = null;
			RegionReference.overlayClippingPaths[plane] = null;
			AnimationSkeletonSet.overlayRotations[plane] = null;
			RegionReference.aByteArrayArrayArray488[plane] = null;
		}

		scene.method486(-50, -10, -50);

		for (plane = 0; plane < 104; ++plane) {
			for (x = 0; x < 104; ++x) {
				if ((RegionReference.mapTileSettings[1][plane][x] & 2) == 2) {
					scene.method403(plane, x);
				}
			}
		}

		plane = 1;
		x = 2;
		y = 4;

		for (originalPlane = 0; originalPlane < 4; ++originalPlane) {
			if (originalPlane > 0) {
				plane <<= 3;
				x <<= 3;
				y <<= 3;
			}

			for (int var23 = 0; var23 <= originalPlane; ++var23) {
				for (int var35 = 0; var35 <= 104; ++var35) {
					for (int var36 = 0; var36 <= 104; ++var36) {
						short var53;
						if (0 != (Class19.tileCullingBitset[var23][var36][var35] & plane)) {
							var27 = var35;
							var25 = var35;
							yPos = var23;

							for (xPos = var23; var27 > 0 && 0 != (Class19.tileCullingBitset[var23][var36][var27 - 1] & plane); --var27) {
								;
							}

							while (var25 < 104 && 0 != (Class19.tileCullingBitset[var23][var36][1 + var25] & plane)) {
								++var25;
							}

							label517:
							while (yPos > 0) {
								for (xHeightDifference = var27; xHeightDifference <= var25; ++xHeightDifference) {
									if (0 == (Class19.tileCullingBitset[yPos - 1][var36][xHeightDifference] & plane)) {
										break label517;
									}
								}

								--yPos;
							}

							label528:
							while (xPos < originalPlane) {
								for (xHeightDifference = var27; xHeightDifference <= var25; ++xHeightDifference) {
									if (0 == (Class19.tileCullingBitset[xPos + 1][var36][xHeightDifference] & plane)) {
										break label528;
									}
								}

								++xPos;
							}

							xHeightDifference = (1 + (var25 - var27)) * (1 + xPos - yPos);
							if (xHeightDifference >= 8) {
								var53 = 240;
								hueDivisor = RegionReference.tileHeights[xPos][var36][var27] - var53;
								floorIDFetch = RegionReference.tileHeights[yPos][var36][var27];
								Scene.method404(originalPlane, 1, var36 * 128, var36 * 128, var27 * 128, var25 * 128 + 128, hueDivisor, floorIDFetch);

								for (var8 = yPos; var8 <= xPos; ++var8) {
									for (var6 = var27; var6 <= var25; ++var6) {
										Class19.tileCullingBitset[var8][var36][var6] &= ~plane;
									}
								}
							}
						}

						if ((Class19.tileCullingBitset[var23][var36][var35] & x) != 0) {
							var27 = var36;
							var25 = var36;
							yPos = var23;

							for (xPos = var23; var27 > 0 && (Class19.tileCullingBitset[var23][var27 - 1][var35] & x) != 0; --var27) {
								;
							}

							while (var25 < 104 && (Class19.tileCullingBitset[var23][1 + var25][var35] & x) != 0) {
								++var25;
							}

							label566:
							while (yPos > 0) {
								for (xHeightDifference = var27; xHeightDifference <= var25; ++xHeightDifference) {
									if ((Class19.tileCullingBitset[yPos - 1][xHeightDifference][var35] & x) == 0) {
										break label566;
									}
								}

								--yPos;
							}

							label577:
							while (xPos < originalPlane) {
								for (xHeightDifference = var27; xHeightDifference <= var25; ++xHeightDifference) {
									if (0 == (Class19.tileCullingBitset[xPos + 1][xHeightDifference][var35] & x)) {
										break label577;
									}
								}

								++xPos;
							}

							xHeightDifference = (xPos + 1 - yPos) * (1 + (var25 - var27));
							if (xHeightDifference >= 8) {
								var53 = 240;
								hueDivisor = RegionReference.tileHeights[xPos][var27][var35] - var53;
								floorIDFetch = RegionReference.tileHeights[yPos][var27][var35];
								Scene.method404(originalPlane, 2, var27 * 128, var25 * 128 + 128, var35 * 128, var35 * 128, hueDivisor, floorIDFetch);

								for (var8 = yPos; var8 <= xPos; ++var8) {
									for (var6 = var27; var6 <= var25; ++var6) {
										Class19.tileCullingBitset[var8][var6][var35] &= ~x;
									}
								}
							}
						}

						if ((Class19.tileCullingBitset[var23][var36][var35] & y) != 0) {
							var27 = var36;
							var25 = var36;
							yPos = var35;

							for (xPos = var35; yPos > 0 && 0 != (Class19.tileCullingBitset[var23][var36][yPos - 1] & y); --yPos) {
								;
							}

							while (xPos < 104 && 0 != (Class19.tileCullingBitset[var23][var36][xPos + 1] & y)) {
								++xPos;
							}

							label616:
							while (var27 > 0) {
								for (xHeightDifference = yPos; xHeightDifference <= xPos; ++xHeightDifference) {
									if ((Class19.tileCullingBitset[var23][var27 - 1][xHeightDifference] & y) == 0) {
										break label616;
									}
								}

								--var27;
							}

							label627:
							while (var25 < 104) {
								for (xHeightDifference = yPos; xHeightDifference <= xPos; ++xHeightDifference) {
									if (0 == (Class19.tileCullingBitset[var23][var25 + 1][xHeightDifference] & y)) {
										break label627;
									}
								}

								++var25;
							}

							if ((var25 - var27 + 1) * (1 + (xPos - yPos)) >= 4) {
								xHeightDifference = RegionReference.tileHeights[var23][var27][yPos];
								Scene.method404(originalPlane, 4, var27 * 128, var25 * 128 + 128, yPos * 128, 128 + xPos * 128, xHeightDifference, xHeightDifference);

								for (yHeightDifference = var27; yHeightDifference <= var25; ++yHeightDifference) {
									for (hueDivisor = yPos; hueDivisor <= xPos; ++hueDivisor) {
										Class19.tileCullingBitset[var23][yHeightDifference][hueDivisor] &= ~y;
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
