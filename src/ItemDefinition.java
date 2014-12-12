import java.awt.*;

public class ItemDefinition extends CacheableNode {

	int resizeY;
	public static AbstractIndex modelIndexReference;
	public static boolean aBool1974;
	static CacheableNodeMap itemDefinitionMap = new CacheableNodeMap(64);
	public int xan2d = 0;
	public static CacheableNodeMap itemSpriteMap = new CacheableNodeMap(100); // item cache
	public static RSFont itemAmountFont;
	public int cost = -941873857;
	int inventoryModel;
	int resizeZ;
	short[] colorFind;
	short[] colorReplace;
	short[] textureFind;
	public String name = "null";
	static CacheableNodeMap itemModelMap = new CacheableNodeMap(50);
	public int zoom2d = 851177744;
	public int yan2d = 0;
	public int zan2d = 0;
	int maleOffset;
	public int yOffset2d = 0;
	public int stackable = 0;
	int[] countCo;
	public boolean members = false;
	public String[] options;
	public String[] interfaceOptions;
	int maleModel0;
	int maleModel1;
	public static AbstractIndex configIndexReference;
	short[] textureReplace;
	int femaleModel1;
	int femaleOffset;
	int maleModel2;
	public int xOffset2d = 0;
	int maleHeadModel;
	int maleHeadModel2;
	int femaleHeadModel;
	int femaleHeadModel2;
	int[] countObj;
	int femaleModel2;
	public int notedID;
	int femaleModel0;
	int resizeX;
	public int notedTemplate;
	public int itemID;
	public int ambient;
	public int contrast;
	public int team;


	public static RSFont loadFont(AbstractIndex spriteIndex, AbstractIndex fontIndex, int archiveID, int fileID, int var4) {
		if (!FriendsChatMember.method1686(spriteIndex, archiveID, fileID, -930113977)) {
			return null;
		} else {
			byte[] fontData = fontIndex.getFile(archiveID, fileID, (byte) 7);
			RSFont font;
			if (null == fontData) {
				font = null;
			} else {
				RSFont loadedFont = new RSFont(fontData, Class88.anIntArray1316, Class9.anIntArray123, Class36.anIntArray514, Class9.anIntArray126, Class9.anIntArray130, AnimationSkeletonSet.loadedCharacterPixels);
				ClientScript.method1679((byte) 96);
				font = loadedFont;
			}

			return font;
		}
	}

	public static ItemDefinition getItemDefinition(int itemID, int var1) {
       ItemDefinition definition = (ItemDefinition) itemDefinitionMap.get((long) itemID);
       if(definition != null) {
          return definition;
       } else {
          byte[] byteArray = configIndexReference.getFile(10, itemID, (byte) 7);
          definition = new ItemDefinition();
          definition.itemID = itemID * 803537925;
          if(null != byteArray) {
             definition.decode(new RSByteBuffer(byteArray), (byte) 104);
          }

          definition.method2089((byte)-97);
          if(definition.notedTemplate * -910205763 != -1) {
             definition.method2123(getItemDefinition(definition.notedTemplate * -910205763, -702304258), getItemDefinition(definition.notedID * -616959653, -471384956), 2075734647);
          }

          if(!aBool1974 && definition.members) {
             definition.name = StringUtilities.MEMBERS_OBJECT;
             definition.options = null;
             definition.interfaceOptions = null;
             definition.team = 0;
          }

          itemDefinitionMap.put(definition, (long) itemID);
          return definition;
       }
    }

	public final RSModel getInventoryModel(int var1, int var2) {
		int index;
		if (this.countObj != null && var1 > 1) {
			int transformID = -1;

			for (index = 0; index < 10; ++index) {
				if (var1 >= this.countCo[index] && this.countCo[index] != 0) {
					transformID = this.countObj[index];
				}
			}

			if (transformID != -1) {
				return getItemDefinition(transformID, 81085730).getInventoryModel(1, 2062198482);
			}
		}

		RSModel model = RSModel.decodeModel(modelIndexReference, this.inventoryModel * 283547247, 0);
		if (model == null) {
			return null;
		} else {
			if (this.resizeX * 832832853 != 128 || 128 != this.resizeY * 793970043 || 128 != this.resizeZ * -371385669) {
				model.resizeModel(this.resizeX * 832832853, this.resizeY * 793970043, this.resizeZ * -371385669);
			}

			if (this.colorFind != null) {
				for (index = 0; index < this.colorFind.length; ++index) {
					model.findReplaceColor(this.colorFind[index], this.colorReplace[index]);
				}
			}

			if (null != this.textureFind) {
				for (index = 0; index < this.textureFind.length; ++index) {
					model.findReplaceTexture(this.textureFind[index], this.textureReplace[index]);
				}
			}

			return model;
		}
	}

	public final ModelRasterizer renderItem(int amount, byte var2) {
		if (null != this.countObj && amount > 1) {
			int transformID = -1;

			for (int var4 = 0; var4 < 10; ++var4) {
				if (amount >= this.countCo[var4] && 0 != this.countCo[var4]) {
					transformID = this.countObj[var4];
				}
			}

			if (transformID != -1) {
				return getItemDefinition(transformID, -756290420).renderItem(1, (byte) 24);
			}
		}

		ModelRasterizer modelRasterizer = (ModelRasterizer) itemModelMap.get((long) (this.itemID * 754919629));
		if (null != modelRasterizer) {
			return modelRasterizer;
		} else {
			RSModel model = RSModel.decodeModel(modelIndexReference, this.inventoryModel * 283547247, 0);
			if (null == model) {
				return null;
			} else {
				if (this.resizeX * 832832853 != 128 || 128 != this.resizeY * 793970043 || this.resizeZ * -371385669 != 128) {
					model.resizeModel(this.resizeX * 832832853, this.resizeY * 793970043, this.resizeZ * -371385669);
				}

				int changeIndex;
				if (this.colorFind != null) {
					for (changeIndex = 0; changeIndex < this.colorFind.length; ++changeIndex) {
						model.findReplaceColor(this.colorFind[changeIndex], this.colorReplace[changeIndex]);
					}
				}

				if (this.textureFind != null) {
					for (changeIndex = 0; changeIndex < this.textureFind.length; ++changeIndex) {
						model.findReplaceTexture(this.textureFind[changeIndex], this.textureReplace[changeIndex]);
					}
				}

				modelRasterizer = model.createModelRasterizer(64 + this.ambient * -1194292751, this.contrast * 1777919357 + 768, -50, -10, -50); // lighting effects..
				modelRasterizer.aBool2457 = true;
				itemModelMap.put(modelRasterizer, (long) (this.itemID * 754919629));
				return modelRasterizer;
			}
		}
	}

	public final RSModel getModel(boolean isFemale, byte var2) {
		int baseModel = this.maleModel0 * 681209975;
		int toAddOne = this.maleModel1 * 1737631229;
		int toAddTwo = this.maleModel2 * 791627253;
		if (isFemale) {
			baseModel = this.femaleModel0 * 1115751707;
			toAddOne = this.femaleModel1 * 34165123;
			toAddTwo = this.femaleModel2 * 495163541;
		}

		if (-1 == baseModel) { // no model exists
			return null;
		} else {
			RSModel model = RSModel.decodeModel(modelIndexReference, baseModel, 0);
			if (toAddOne != -1) {
				RSModel var7 = RSModel.decodeModel(modelIndexReference, toAddOne, 0);
				if (toAddTwo != -1) { // if all models exists, we merge all into one
					RSModel var8 = RSModel.decodeModel(modelIndexReference, toAddTwo, 0);
					RSModel[] var9 = new RSModel[]{model, var7, var8};
					model = new RSModel(var9, 3);
				} else { // if two exists, merge two
					RSModel[] var11 = new RSModel[]{model, var7};
					model = new RSModel(var11, 2);
				}
			}

			if (!isFemale && this.maleOffset * -229975779 != 0) {
				model.translate(0, this.maleOffset * -229975779, 0);
			}

			if (isFemale && 0 != this.femaleOffset * -1096289183) {
				model.translate(0, this.femaleOffset * -1096289183, 0);
			}

			int changeIndex;
			if (this.colorFind != null) {
				for (changeIndex = 0; changeIndex < this.colorFind.length; ++changeIndex) {
					model.findReplaceColor(this.colorFind[changeIndex], this.colorReplace[changeIndex]);
				} 
			}

			if (this.textureFind != null) {
				for (changeIndex = 0; changeIndex < this.textureFind.length; ++changeIndex) {
					model.findReplaceTexture(this.textureFind[changeIndex], this.textureReplace[changeIndex]);
				}
			}

			return model;
		}
	}

	public final boolean hasHeadModel(boolean isFemale, byte var2/*useless*/) {
		int baseHeadModel = this.maleHeadModel * -1360559497;
		int var5 = this.maleHeadModel2 * -1334892139;
		if (isFemale) {
			baseHeadModel = this.femaleHeadModel * 490332519;
			var5 = this.femaleHeadModel2 * -189333379;
		}

		if (baseHeadModel == -1) {
			return true;
		} else {
			boolean hasHeadModel = true;
			if (!modelIndexReference.containsFile(baseHeadModel, 0, 1151584293)) {
				hasHeadModel = false;
			}

			if (-1 != var5 && !modelIndexReference.containsFile(var5, 0, 1151584293)) {
				hasHeadModel = false;
			}

			return hasHeadModel;
		}
	}

	void decode(RSByteBuffer buffer, byte var2) {
		while (true) {
			int opcode = buffer.readUByte();
			if (0 == opcode) {
				return;
			}

			this.decodeReadValues(buffer, opcode);
		}
	}

	public final RSModel getHeadModel(boolean var1, int var2) {
		int baseHeadModel = this.maleHeadModel * -1360559497;
		int toAdd = this.maleHeadModel2 * -1334892139;
		if (var1) {
			baseHeadModel = this.femaleHeadModel * 490332519;
			toAdd = this.femaleHeadModel2 * -189333379;
		}

		if (baseHeadModel == -1) {
			return null;
		} else {
			RSModel model = RSModel.decodeModel(modelIndexReference, baseHeadModel, 0);
			if (-1 != toAdd) {
				RSModel var4 = RSModel.decodeModel(modelIndexReference, toAdd, 0);
				RSModel[] var6 = new RSModel[]{model, var4};
				model = new RSModel(var6, 2);
			}

			int changeIndex;
			if (this.colorFind != null) {
				for (changeIndex = 0; changeIndex < this.colorFind.length; ++changeIndex) {
					model.findReplaceColor(this.colorFind[changeIndex], this.colorReplace[changeIndex]);
				}
			}

			if (this.textureFind != null) {
				for (changeIndex = 0; changeIndex < this.textureFind.length; ++changeIndex) {
					model.findReplaceTexture(this.textureFind[changeIndex], this.textureReplace[changeIndex]);
				}
			}

			return model;
		}
	}

	void method2089(byte var1) {
	}

	void decodeReadValues(RSByteBuffer buffer, int opcode) {
		if (opcode == 1) {
			this.inventoryModel = buffer.readUShort(1057765362) * 1084852367;
		} else if (opcode == 2) {
			this.name = buffer.getString_2((byte) 8);
		} else if (opcode == 4) {
			this.zoom2d = buffer.readUShort(1788926198) * 1903096101;
		} else if (opcode == 5) {
			this.xan2d = buffer.readUShort(167644176) * -753666655;
		} else if (opcode == 6) {
			this.yan2d = buffer.readUShort(837285778) * 1527254285;
		} else if (7 == opcode) {
			this.xOffset2d = buffer.readUShort(-1675736295) * -1401785535;
			if (this.xOffset2d * 1578900673 > 32767) {
				this.xOffset2d -= 1933639680;
			}
		} else if (8 == opcode) {
			this.yOffset2d = buffer.readUShort(1268186238) * -892968073;
			if (this.yOffset2d * 1336895047 > 32767) {
				this.yOffset2d -= 1668743168;
			}
		} else if (11 == opcode) {
			this.stackable = 2137987361;
		} else if (opcode == 12) {
			this.cost = buffer.readInt() * -941873857;
		} else if (16 == opcode) {
			this.members = true;
		} else if (opcode == 23) {
			this.maleModel0 = buffer.readUShort(1453785549) * 533096775;
			this.maleOffset = buffer.readUByte() * -961236683;
		} else if (opcode == 24) {
			this.maleModel1 = buffer.readUShort(-2094358395) * 260759381;
		} else if (25 == opcode) {
			this.femaleModel0 = buffer.readUShort(-2083129576) * 291687699;
			this.femaleOffset = buffer.readUByte() * -638472287;
		} else if (26 == opcode) {
			this.femaleModel1 = buffer.readUShort(-791889173) * 1576879403;
		} else if (opcode >= 30 && opcode < 35) {
			this.options[opcode - 30] = buffer.getString_2((byte) 8);
			if (this.options[opcode - 30].equalsIgnoreCase(StringUtilities.hidden)) {
				this.options[opcode - 30] = null;
			}
		} else if (opcode >= 35 && opcode < 40) {
			this.interfaceOptions[opcode - 35] = buffer.getString_2((byte) 8);
		} else {
			int var4;
			int var5;
			if (opcode == 40) {
				var5 = buffer.readUByte();
				this.colorFind = new short[var5];
				this.colorReplace = new short[var5];

				for (var4 = 0; var4 < var5; ++var4) {
					this.colorFind[var4] = (short) buffer.readUShort(872088036);
					this.colorReplace[var4] = (short) buffer.readUShort(26186676);
				}

			} else if (41 != opcode) {
				if (opcode == 78) {
					this.maleModel2 = buffer.readUShort(1739698554) * -1246658979;
				} else if (opcode == 79) {
					this.femaleModel2 = buffer.readUShort(550298950) * -2066844995;
				} else if (90 == opcode) {
					this.maleHeadModel = buffer.readUShort(1250946647) * 1491531591;
				} else if (91 == opcode) {
					this.femaleHeadModel = buffer.readUShort(-1411478332) * 728410711;
				} else if (92 == opcode) {
					this.maleHeadModel2 = buffer.readUShort(-914077826) * -1892427331;
				} else if (opcode == 93) {
					this.femaleHeadModel2 = buffer.readUShort(-1259366479) * 1395292373;
				} else if (opcode == 95) {
					this.zan2d = buffer.readUShort(374907387) * -1107934227;
				} else if (97 == opcode) {
					this.notedID = buffer.readUShort(152003485) * -617294125;
				} else if (98 == opcode) {
					this.notedTemplate = buffer.readUShort(-1073744203) * 1015185045;
				} else if (opcode >= 100 && opcode < 110) {
					if (this.countObj == null) {
						this.countObj = new int[10];
						this.countCo = new int[10];
					}

					this.countObj[opcode - 100] = buffer.readUShort(483202491);
					this.countCo[opcode - 100] = buffer.readUShort(-394095807);
				} else if (110 == opcode) {
					this.resizeX = buffer.readUShort(-223981515) * -1103376387;
				} else if (opcode == 111) {
					this.resizeY = buffer.readUShort(1501271984) * -35515981;
				} else if (opcode == 112) {
					this.resizeZ = buffer.readUShort(-680924038) * 511842931;
				} else if (opcode == 113) {
					this.ambient = buffer.readByte() * -1523235055;
				} else if (114 == opcode) {
					this.contrast = buffer.readByte() * 1100507945;
				} else if (115 == opcode) {
					this.team = buffer.readUByte() * -1474759687;
				}
			} else {
				var5 = buffer.readUByte();
				this.textureFind = new short[var5];
				this.textureReplace = new short[var5];

				for (var4 = 0; var4 < var5; ++var4) {
					this.textureFind[var4] = (short) buffer.readUShort(-1392251926);
					this.textureReplace[var4] = (short) buffer.readUShort(1017776894);
				}

			}
		}
	}

	public static void method2100(int var0, int var1) {
		MouseInputHandler.anInt765 = var0 * 1238703313;
	}

	public final boolean hasModel(boolean var1, int var2) {
		int baseModel = this.maleModel0 * 681209975;
		int var5 = this.maleModel1 * 1737631229;
		int var4 = this.maleModel2 * 791627253;
		if (var1) {
			baseModel = this.femaleModel0 * 1115751707;
			var5 = this.femaleModel1 * 34165123;
			var4 = this.femaleModel2 * 495163541;
		}

		if (baseModel == -1) {
			return true;
		} else {
			boolean var6 = true;
			if (!modelIndexReference.containsFile(baseModel, 0, 1151584293)) {
				var6 = false;
			}

			if (-1 != var5 && !modelIndexReference.containsFile(var5, 0, 1151584293)) {
				var6 = false;
			}

			if (-1 != var4 && !modelIndexReference.containsFile(var4, 0, 1151584293)) {
				var6 = false;
			}

			return var6;
		}
	}

	ItemDefinition() {
		this.options = new String[]{null, null, StringUtilities.TAKE_OPTION, null, null};
		this.interfaceOptions = new String[]{null, null, null, null, StringUtilities.DROP_OPTION};
		this.maleModel0 = -533096775;
		this.maleModel1 = -260759381;
		this.maleOffset = 0;
		this.femaleModel0 = -291687699;
		this.femaleModel1 = -1576879403;
		this.femaleOffset = 0;
		this.maleModel2 = 1246658979;
		this.femaleModel2 = 2066844995;
		this.maleHeadModel = -1491531591;
		this.maleHeadModel2 = 1892427331;
		this.femaleHeadModel = -728410711;
		this.femaleHeadModel2 = -1395292373;
		this.notedID = 617294125;
		this.notedTemplate = -1015185045;
		this.resizeX = 501743232;
		this.resizeY = -251078272;
		this.resizeZ = 1091385728;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
	}

	void method2123(ItemDefinition var1, ItemDefinition var2, int var3) {
		this.inventoryModel = var1.inventoryModel * 1;
		this.zoom2d = var1.zoom2d * 1;
		this.xan2d = var1.xan2d * 1;
		this.yan2d = var1.yan2d * 1;
		this.zan2d = var1.zan2d * 1;
		this.xOffset2d = var1.xOffset2d * 1;
		this.yOffset2d = var1.yOffset2d * 1;
		this.colorFind = var1.colorFind;
		this.colorReplace = var1.colorReplace;
		this.textureFind = var1.textureFind;
		this.textureReplace = var1.textureReplace;
		this.name = var2.name;
		this.members = var2.members;
		this.cost = var2.cost * 1;
		this.stackable = 2137987361;
	}

	public static int method2124(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = 0; var4 < var1; ++var4) {
			var3 = var3 >>> 8 ^ RSByteBuffer.anIntArray1696[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}

	static final void method2125() {
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
				} else if (Player.myPlayer == player) {
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
				Player.method703(player, var5, var6, (short) -7028);
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
								ChatMessagesContainer.pushMessage(var19 ? 91 : 1, CacheIndexRequest.getIconTag(0, 480603646) + player.playerName, textSpoken, 645579581);
							} else {
								ChatMessagesContainer.pushMessage(var19 ? 90 : 2, player.playerName, textSpoken, 243104464);
							}
						} else {
							ChatMessagesContainer.pushMessage(var19 ? 91 : 1, CacheIndexRequest.getIconTag(1, 480603646) + player.playerName, textSpoken, -738572075);
						}
					}
				}

				Client.packetBuffer.position = (var9 + var8) * 537964811;
			}
		}

	}

	/**
	 * Gets a different item definition for a given amount change AKA items like coins
	 * @param amount
	 * @param var2
	 * @return
	 */
	public ItemDefinition transformItemByAmount(int amount, int var2) {
		if (null != this.countObj && amount > 1) {
			int transformID = -1;

			for (int index = 0; index < 10; ++index) {
				if (amount >= this.countCo[index] && 0 != this.countCo[index]) {
					transformID = this.countObj[index];
				}
			}

			if (-1 != transformID) {
				return getItemDefinition(transformID, -555570209);
			}
		}

		return this;
	}

	public static GraphicsBuffer method2127(int var0, int var1, Component var2, int var3) {
		try {
			WriteableRasterGraphicsBuffer var4 = new WriteableRasterGraphicsBuffer();
			var4.method259(var0, var1, var2, -1576246306);
			return var4;
		} catch (Throwable var6) {
			ProducingGraphicsBuffer var5 = new ProducingGraphicsBuffer();
			var5.method259(var0, var1, var2, -1265003740);
			return var5;
		}
	}
}
