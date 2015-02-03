public final class Player extends Entity {

	static Player myPlayer;
	int pkicon = 1024554621;
	int anInt2664;
	int anInt2665 = 0;
	int prayicon = 2079409549;
	int playerTeamID = 0;
	int skillLevel = 0;
	int anInt2669;
	int anInt2670 = 0;
	EquipmentKit bodyEquipmentKit;
	int anInt2672;
	int anInt2673;
	int anInt2674;
	ModelRasterizer aClass108_Sub20_Sub14_Sub3_2675;
	String playerName;
	int anInt2677;
	int anInt2678;
	int anInt2679;
	boolean aBool2680 = false;
	int combatLevel = 0;
	boolean aBool2682 = false;

	static final void decodeOtherMovement() {
		int numLocalPlayers = Client.packetBuffer.readBits(8);
		System.out.println("Local players: " + numLocalPlayers);
		int ptr;
		if (numLocalPlayers < Client.numLocalPlayers * -43742683) {
			for (ptr = numLocalPlayers; ptr < Client.numLocalPlayers * -43742683; ++ptr) {
				Client.indicesPendingRemoval[(Client.removedCounter += 1906858221) * 104842469 - 1] = Client.playerIndices[ptr];
			}
		}

		if (numLocalPlayers > Client.numLocalPlayers * -43742683) {
			throw new RuntimeException("");
		} else {
			Client.numLocalPlayers = 0;

			for (ptr = 0; ptr < numLocalPlayers; ++ptr) {
				int index = Client.playerIndices[ptr];
				Player var5 = Client.localPlayers[index];
				int moved = Client.packetBuffer.readBits(1);
				if (moved == 0) {
					Client.playerIndices[(Client.numLocalPlayers -= 1542815315) * -43742683 - 1] = index;
					var5.lastUpdated = Client.cycle * 1761958407;
				} else {
					int movetype = Client.packetBuffer.readBits(2);
					if (0 == movetype) {
						Client.playerIndices[(Client.numLocalPlayers -= 1542815315) * -43742683 - 1] = index;
						var5.lastUpdated = Client.cycle * 1761958407;
						Client.playersNeedingUpdating[(Client.updateReqCount -= 472402375) * -184592375 - 1] = index;
					} else {
						int var7;
						int var8;
						if (movetype == 1) {
							Client.playerIndices[(Client.numLocalPlayers -= 1542815315) * -43742683 - 1] = index;
							var5.lastUpdated = Client.cycle * 1761958407;
							var8 = Client.packetBuffer.readBits(3);
							var5.moveInDirection(var8, false, -548715931);
							var7 = Client.packetBuffer.readBits(1);
							if (1 == var7) {
								Client.playersNeedingUpdating[(Client.updateReqCount -= 472402375) * -184592375 - 1] = index;
							}
						} else if (2 == movetype) {
							Client.playerIndices[(Client.numLocalPlayers -= 1542815315) * -43742683 - 1] = index;
							var5.lastUpdated = Client.cycle * 1761958407;
							var8 = Client.packetBuffer.readBits(3);
							var5.moveInDirection(var8, true, -548715931);
							var7 = Client.packetBuffer.readBits(3);
							var5.moveInDirection(var7, true, -548715931);
							int maskUpdate = Client.packetBuffer.readBits(1);
							if (1 == maskUpdate) {
								Client.playersNeedingUpdating[(Client.updateReqCount -= 472402375) * -184592375 - 1] = index;
							}
						} else if (movetype == 3) {
							Client.indicesPendingRemoval[(Client.removedCounter += 1906858221) * 104842469 - 1] = index;
							System.out.println("Removed " + index);
						}
					}
				}
			}

		}
	}

	static void method703(Player myPlayer, int animationID, int var2, short var3) {
       if(animationID == myPlayer.anInt2368 * 1647325343 && -1 != animationID) {
          int var4 = AnimationDefinition.getAnimDefForID(animationID, 1866864408).delayType * -95027165;
          if(1 == var4) {
             myPlayer.anInt2341 = 0;
             myPlayer.anInt2396 = 0;
             myPlayer.anInt2371 = var2 * -1894246625;
             myPlayer.anInt2372 = 0;
          }

          if(2 == var4) {
             myPlayer.anInt2372 = 0;
          }
       } else if(-1 == animationID || myPlayer.anInt2368 * 1647325343 == -1 || AnimationDefinition.getAnimDefForID(animationID, 1805243537).forcedPriority * -1435646185 >= AnimationDefinition.getAnimDefForID(myPlayer.anInt2368 * 1647325343, 1489363310).forcedPriority * -1435646185) {
          myPlayer.anInt2368 = animationID * -821761185;
          myPlayer.anInt2341 = 0;
          myPlayer.anInt2396 = 0;
          myPlayer.anInt2371 = var2 * -1894246625;
          myPlayer.anInt2372 = 0;
          myPlayer.anInt2395 = myPlayer.anInt2390 * 1986639247;
       }
    }

	static final void decodeAppearanceUpdate() {
		for (int var1 = 0; var1 < Client.updateReqCount * -184592375; ++var1) {
			int var2 = Client.playersNeedingUpdating[var1];
			Player player = Client.localPlayers[var2];

			int var4 = Client.packetBuffer.readUByte();
			if (0 != (var4 & 4)) {
				var4 += Client.packetBuffer.readUByte() << 8;
			}
			System.out.println("Got masks for " + player.playerName + " " + var4);

			if (0 != (var4 & 1)) {
				player.anInt2363 = Client.packetBuffer.method1706(179884786) * 1365888199;
				player.anInt2387 = Client.packetBuffer.readUShortA() * -883213979;
			}

			if ((var4 & 2) != 0) {
				player.textSpoken = Client.packetBuffer.getString_2((byte) 8);
				if (player.textSpoken.charAt(0) == 126) {
					player.textSpoken = player.textSpoken.substring(1);
					ChatMessagesContainer.pushMessage(2, player.playerName, player.textSpoken, -501145397);
				} else if (myPlayer == player) {
					ChatMessagesContainer.pushMessage(2, player.playerName, player.textSpoken, 779446530);
				}

				player.aBool2352 = false;
				player.anInt2377 = 0;
				player.anInt2355 = 0;
				player.textSpokenTime = -11389574;
			}

			int var5;
			int var6;
			if ((var4 & 256) != 0) {
				var5 = Client.packetBuffer.readUShortLEA();
				var6 = Client.packetBuffer.readUByte();
				player.method2724(var5, var6, Client.cycle * -637317861, (byte) -65);
				player.anInt2342 = Client.cycle * 1254497419 - 1701381396;
				player.anInt2360 = Client.packetBuffer.method1751((byte) -7) * -1879576471;
				player.anInt2361 = Client.packetBuffer.method1742(-1494849731) * 1056964537;
			}

			if ((var4 & 16) != 0) {
				player.anInt2362 = Client.packetBuffer.method1706(179884786) * -990422189;
				if ('\uffff' == player.anInt2362 * -2108972837) {
					player.anInt2362 = 990422189;
				}
			}

			if ((var4 & 0x80) != 0) {
				var5 = Client.packetBuffer.readUByte();
				byte[] var18 = new byte[var5];
				RSByteBuffer var7 = new RSByteBuffer(var18);
				Client.packetBuffer.method1781(var18, 0, var5, -497459829);
				Client.cachedAppearances[var2] = var7;
				player.decodeAppearance(var7);
			}

			if (0 != (var4 & 0x400)) { //gfx
				player.anInt2373 = Client.packetBuffer.readUShort(-389943525) * 1279943663;
				var5 = Client.packetBuffer.readInt();
				player.anInt2388 = (var5 >> 16) * -663135519;//
				player.anInt2381 = (Client.cycle * -637317861 + (var5 & 0xffff)) * 1163909499;//delay
				player.anInt2374 = 0;
				player.anInt2375 = 0;
				if (player.anInt2381 * 2072518067 > Client.cycle * -637317861) {
					player.anInt2374 = 530928865;
				}

				if ('\uffff' == player.anInt2373 * 1305815823) {
					player.anInt2373 = -1279943663;
				}
			}

			if ((var4 & 0x20) != 0) {
				var5 = Client.packetBuffer.readUShortA();
				if (var5 == '\uffff') {
					var5 = -1;
				}

				var6 = Client.packetBuffer.readUNegByte((byte) 24);
				System.out.println("Nigger orel " + var5 + ", " + var6);
				method703(player, var5, var6, (short) -7028);
			}

			if ((var4 & 512) != 0) {
				player.anInt2346 = Client.packetBuffer.method1751((byte) 47) * -1232457135;
				player.anInt2380 = Client.packetBuffer.readUNegByte((byte) 108) * -2005510735;
				player.anInt2379 = Client.packetBuffer.readUByte() * -968968421;
				player.anInt2351 = Client.packetBuffer.readUByte() * 215276463;
				player.anInt2382 = (Client.packetBuffer.readUShortA() + Client.cycle * -637317861) * -1135657951;
				player.anInt2383 = (Client.packetBuffer.readUShort(1011764471) + Client.cycle * -637317861) * 1089374683;
				player.anInt2384 = Client.packetBuffer.method1742(-1494849731) * 1682709515;
				player.anInt2390 = -97254193;
				player.anInt2395 = 0;
			}

			if ((var4 & 8) != 0) {
				var5 = Client.packetBuffer.readUShortLEA();
				var6 = Client.packetBuffer.readUByte();
				player.method2724(var5, var6, Client.cycle * -637317861, (byte) -106);
				player.anInt2342 = Client.cycle * 1254497419 - 1701381396;
				player.anInt2360 = Client.packetBuffer.readUByte() * -1879576471;
				player.anInt2361 = Client.packetBuffer.readUByte() * 1056964537;
			}

			if (0 != (var4 & 64)) {
				var5 = Client.packetBuffer.method1706(179884786);
				var6 = Client.packetBuffer.method1751((byte) 29);
				boolean var19 = Client.packetBuffer.readUNegByte((byte) 47) == 1;
				int var8 = Client.packetBuffer.readUByte();
				int var9 = Client.packetBuffer.position * 798331555;
				if (null != player.playerName && null != player.bodyEquipmentKit) {
					boolean var10 = false;
					if (var6 <= 1 && Ignore.isOnIgnore(player.playerName, 1393039656)) {
						var10 = true;
					}

					if (!var10 && Client.anInt2822 * -526472263 == 0 && !player.aBool2682) {
						Client.aClass108_Sub14_2824.position = 0;
						Client.packetBuffer.readBytes(Client.aClass108_Sub14_2824.buf, 0, var8, 1307264336);
						Client.aClass108_Sub14_2824.position = 0;
						RSByteBuffer textBuffer = Client.aClass108_Sub14_2824;

						String textSpoken;
						try {
							int var12 = textBuffer.readSmart((short) -14211);
							if (var12 > 32767) {
								var12 = 32767;
							}

							byte[] var13 = new byte[var12];
							textBuffer.position += HuffmanEncoding.huffmanEncoding.decrypt(textBuffer.buf, textBuffer.position * 798331555, var13, 0, var12, -797949548) * 537964811;
							String var14 = ClientScriptDefinition.method2569(var13, 0, var12, (short) 23990);
							textSpoken = var14;
						} catch (Exception var17) {
							textSpoken = "Cabbage";
						}

						textSpoken = RSTypeFace.appendLTGTTags(Class66.method896(textSpoken, (byte) 0));
						player.textSpoken = textSpoken.trim();
						player.anInt2377 = (var5 >> 8) * 1753400645;
						player.anInt2355 = (var5 & 255) * 562856027;
						player.textSpokenTime = -11389574;
						player.aBool2352 = var19;
						if (2 != var6 && 3 != var6) {
							if (1 == var6) {
								ChatMessagesContainer.pushMessage(var19 ? 91 : 1, RSTypeFace.getIconTag(0, 480603646) + player.playerName, textSpoken, 645579581);
							} else {
								ChatMessagesContainer.pushMessage(var19 ? 90 : 2, player.playerName, textSpoken, 243104464);
							}
						} else {
							ChatMessagesContainer.pushMessage(var19 ? 91 : 1, RSTypeFace.getIconTag(1, 480603646) + player.playerName, textSpoken, -738572075);
						}
					}
				}

				Client.packetBuffer.position = (var9 + var8) * 537964811;
			}
		}

	}


	final void decodeAppearance(RSByteBuffer buffer) {
		buffer.position = 0;
		int gender = buffer.readUByte();
		this.pkicon = buffer.readByte() * -1024554621;
		this.prayicon = buffer.readByte() * -2079409549;
		int npcChangeID = -1;
		this.playerTeamID = 0;
		int[] equips = new int[12];

		int index;
		int value;
		for (int slot = 0; slot < 12; ++slot) {
			index = buffer.readUByte();
			if (0 == index) {
				equips[slot] = 0;
			} else {
				value = buffer.readUByte();
				equips[slot] = (index << 8) + value;
				if (0 == slot && equips[0] == '\uffff') {
					npcChangeID = buffer.readUShort(1591682478);
					break;
				}

				if (equips[slot] >= 512) {
					int team = ItemDefinition.getItemDefinition(equips[slot] - 512, -437621212).team * 989158985;
					if (team != 0) {
						this.playerTeamID = team * 2145998287;
					}
				}
			}
		}

		int[] colors = new int[5];

		for (index = 0; index < 5; ++index) {
			value = buffer.readUByte();
			if (value < 0 || value >= EquipmentKit.colorsToReplace[index].length) {
				value = 0;
			}

			colors[index] = value;
		}

		int a;
		this.standAnimationID = (a=buffer.readUShort(551750758)) * 1915601577;
		if (this.standAnimationID * -532414055 == '\uffff') {
			this.standAnimationID = -1915601577;
		}
		System.out.println("Anim1: " + a);

		this.nextAnimationID = (a=buffer.readUShort(-914742090)) * 1771909735;
		if ('\uffff' == this.nextAnimationID * 1113049431) {
			this.nextAnimationID = -1771909735;
		}
		System.out.println("Anim2: " + (a));

		this.walkAnimationID = this.nextAnimationID * 858874001;
		this.anInt2357 = (a=buffer.readUShort(1492975448)) * 645107359;
		if (this.anInt2357 * 1461718367 == '\uffff') {
			this.anInt2357 = -645107359;
		}
		System.out.println("Anim3: " + a);

		this.turn180AnimationID = (a=buffer.readUShort(-442040505)) * -1371640443;
		if ('\uffff' == this.turn180AnimationID * 953582413) {
			this.turn180AnimationID = 1371640443;
		}
		System.out.println("Anim4: " + a);

		this.turn90RightAnimationID = (a=buffer.readUShort(1572878172)) * -514284795;
		if ('\uffff' == this.turn90RightAnimationID * -2059161139) {
			this.turn90RightAnimationID = 514284795;
		}
		System.out.println("Anim5: " + a);

		this.turn90LeftAnimationID = (a=buffer.readUShort(-1792950317)) * -1417997611;
		if ('\uffff' == this.turn90LeftAnimationID * 568563325) {
			this.turn90LeftAnimationID = 1417997611;
		}
		System.out.println("Anim6: " + a);

		this.runAnimationID = (a=buffer.readUShort(-1023182423)) * -479130233;
		if (this.runAnimationID * -790681545 == '\uffff') {
			this.runAnimationID = 479130233;
		}
		System.out.println("Anim7: " + a);

		this.playerName = buffer.getString_2((byte) 8);
		if (myPlayer == this) {
			RuntimeException_Sub1.aString2626 = this.playerName;
		}

		this.combatLevel = buffer.readUByte() * -588957807;
		this.skillLevel = buffer.readUShort(-1212976341) * -1134855835;
		this.aBool2682 = buffer.readUByte() == 1;

		/*
		Anim1: 809
		Anim2: 809
		Anim3: 809
		Anim4: 809
		Anim5: 809
		Anim6: 809
		Last: false, 70, 0
		 */
		System.out.println("Last: " + aBool2682 + ", " + (combatLevel * -1769445007) + ", " + (-1817505683 * skillLevel));

		if (0 == Client.portType * -759629273 && Client.rights * 171939335 >= 2) {
			this.aBool2682 = false;
		}

		if (null == this.bodyEquipmentKit) {
			this.bodyEquipmentKit = new EquipmentKit();
		}

		this.bodyEquipmentKit.initialize(equips, colors, 1 == gender, npcChangeID, -1809930983);
	}

	final boolean method2731(int var1) {
		return this.bodyEquipmentKit != null;
	}

	protected final ModelRasterizer getModelRasterizer(byte var1) {
		if (null == this.bodyEquipmentKit) {
			return null;
		} else {
			AnimationDefinition var2 = this.anInt2368 * 1647325343 != -1 && 0 == this.anInt2371 * 843883743 ? AnimationDefinition.getAnimDefForID(this.anInt2368 * 1647325343, 1639954209) : null;
			AnimationDefinition var4 = this.anInt2365 * 1103885695 != -1 && !this.aBool2680 && (this.anInt2365 * 1103885695 != this.standAnimationID * -532414055 || null == var2) ? AnimationDefinition.getAnimDefForID(this.anInt2365 * 1103885695, 1617260319) : null;
			ModelRasterizer rasterizer = this.bodyEquipmentKit.getModelRasterizer(var2, this.anInt2341 * -2111206063, var4, this.anInt2366 * -65543943, 677402337);
			if (null == rasterizer) {
				return null;
			} else {
				rasterizer.method2855();
				this.anInt2386 = rasterizer.modelHeight * 1878279385;
				ModelRasterizer completeRasterizer;
				ModelRasterizer[] rasterizerPieces;
				if (!this.aBool2680 && -1 != this.anInt2373 * 1305815823 && -1 != this.anInt2374 * -766701345) {
					completeRasterizer = AnimatedGraphic.getSpotAnimForID(this.anInt2373 * 1305815823, (byte) 0).getModelRasterizer(this.anInt2374 * -766701345, -380943559);
					if (null != completeRasterizer) {
						completeRasterizer.offsetModelVertices(0, -(this.anInt2388 * 833972513), 0);
						rasterizerPieces = new ModelRasterizer[]{rasterizer, completeRasterizer};
						rasterizer = new ModelRasterizer(rasterizerPieces, 2);
					}
				}

				if (!this.aBool2680 && this.aClass108_Sub20_Sub14_Sub3_2675 != null) {
					if (Client.cycle * -637317861 >= this.anInt2670 * -1285705355) {
						this.aClass108_Sub20_Sub14_Sub3_2675 = null;
					}

					if (Client.cycle * -637317861 >= this.anInt2665 * 1616333119 && Client.cycle * -637317861 < this.anInt2670 * -1285705355) {
						completeRasterizer = this.aClass108_Sub20_Sub14_Sub3_2675;
						completeRasterizer.offsetModelVertices(this.anInt2672 * 1644839921 - this.anInt2394 * 171470795, this.anInt2673 * 231705267 - this.anInt2669 * -1445368915, this.anInt2674 * 1435365123 - this.anInt2339 * 826764905);
						if (this.anInt2354 * -2014004437 == 512) {
							completeRasterizer.rotate90();
							completeRasterizer.rotate90();
							completeRasterizer.rotate90();
						} else if (1024 == this.anInt2354 * -2014004437) {
							completeRasterizer.rotate90();
							completeRasterizer.rotate90();
						} else if (this.anInt2354 * -2014004437 == 1536) {
							completeRasterizer.rotate90();
						}

						rasterizerPieces = new ModelRasterizer[]{rasterizer, completeRasterizer};
						rasterizer = new ModelRasterizer(rasterizerPieces, 2);
						if (512 == this.anInt2354 * -2014004437) {
							completeRasterizer.rotate90();
						} else if (this.anInt2354 * -2014004437 == 1024) {
							completeRasterizer.rotate90();
							completeRasterizer.rotate90();
						} else if (1536 == this.anInt2354 * -2014004437) {
							completeRasterizer.rotate90();
							completeRasterizer.rotate90();
							completeRasterizer.rotate90();
						}

						completeRasterizer.offsetModelVertices(this.anInt2394 * 171470795 - this.anInt2672 * 1644839921, this.anInt2669 * -1445368915 - this.anInt2673 * 231705267, this.anInt2339 * 826764905 - this.anInt2674 * 1435365123);
					}
				}

				rasterizer.aBool2457 = true;
				return rasterizer;
			}
		}
	}

	static final String method3177(int var0, byte var1) {
		String amountAsString = Integer.toString(var0);

		for (int var3 = amountAsString.length() - 3; var3 > 0; var3 -= 3) {
			amountAsString = amountAsString.substring(0, var3) + Class47.COMMA_LITERAL + amountAsString.substring(var3);
		}

		return amountAsString.length() > 9 ? " " + HuffmanEncoding.method690('\uff80', -2142918227) + amountAsString.substring(0, amountAsString.length() - 8) + StringUtilities.aString1097 + " " + Class47.OPEN_PAREN + amountAsString + Class47.CLOSE_PAREN + Class47.COL_END : (amountAsString.length() > 6 ? " " + HuffmanEncoding.method690(16777215, -818471386) + amountAsString.substring(0, amountAsString.length() - 4) + StringUtilities.K + " " + Class47.OPEN_PAREN + amountAsString + Class47.CLOSE_PAREN + Class47.COL_END : " " + HuffmanEncoding.method690(16776960, -1154832985) + amountAsString + Class47.COL_END);
	}

	public static void method3179(AbstractIndex var0, AbstractIndex var1, boolean var2, int var3) {
		ObjectDefinition.aClass74_2066 = var0;
		ObjectDefinition.aClass74_2067 = var1;
		ObjectDefinition.aBool2086 = var2;
	}

	public static boolean method3182(int var0) {
		return SongReference.anInt1325 * 485824819 != 0 ? true : Class32.aClass108_Sub4_Sub3_464.method2611(-141174129);
	}

}
