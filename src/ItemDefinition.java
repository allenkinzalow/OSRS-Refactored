import java.awt.*;

/**
 * Credit to Velocity for some of the fields.
 */
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
		if (!FriendsChatMember.loadPaletteSprite(spriteIndex, archiveID, fileID, -930113977)) {
			return null;
		} else {
			byte[] fontData = fontIndex.getFile(archiveID, fileID, (byte) 7);
			RSFont font;
			if (null == fontData) {
				font = null;
			} else {
				RSFont loadedFont = new RSFont(fontData, Class88.anIntArray1316, Class9.anIntArray123, PaletteSprite.lastLoadedPaletteSpriteWidth, Class9.anIntArray126, Class9.anIntArray130, AnimationSkeletonSet.loadedCharacterPixels);
				PaletteSprite.resetLastPaletteValues((byte) 96);
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
             definition.copyDefinitions(getItemDefinition(definition.notedTemplate * -910205763, -702304258), getItemDefinition(definition.notedID * -616959653, -471384956), 2075734647);
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

	public static final RGBSprite createItemSpriteForDump(int itemID) {
		boolean exist = false;
		int var2 = 2;
		int var3 = 0;
		RGBSprite cachedSprite;

		ItemDefinition itemDef = getItemDefinition(itemID, -221675425);

		if(itemDef == null) {
			System.out.println(itemID + " is null...");
			return null;
		}

		ModelRasterizer modelRasterizer = itemDef.renderItem(1, (byte)24);
		if(null == modelRasterizer) {
			return null;
		} else {
			RGBSprite sprite = null;
			if(-1 != itemDef.notedTemplate * -910205763) {
				sprite = getItemSprite(itemDef.notedID * -616959653, 10, 1, 0, true, -944989678);
				if(null == sprite) {
					return null;
				}
			}

			int[] pixels = Rasterizer2D.renderPixels;
			int width = Rasterizer2D.renderWidth;
			int height = Rasterizer2D.renderHeight;
			int[] var18 = new int[4];
			Rasterizer2D.populateArea(var18);
			cachedSprite = new RGBSprite(36, 32);
			Rasterizer2D.copySprite(cachedSprite.pixels, 36, 32);
			Rasterizer2D.resetPixels();
			Rasterizer3D.method2970();
			Rasterizer3D.method2926(16, 16);
			Rasterizer3D.aBool2518 = false;
			int zoom = itemDef.zoom2d * 609600173;
			if(exist) {
				zoom = (int)(1.5D * (double)zoom);
			} else if(var2 == 2) {
				zoom = (int)((double)zoom * 1.04D);
			}

			int var12 = Rasterizer3D.SINE[itemDef.xan2d * 36515425] * zoom >> 16;
			int var19 = zoom * Rasterizer3D.COSINE[itemDef.xan2d * 36515425] >> 16;
			modelRasterizer.method2855();
			modelRasterizer.method2916(0, itemDef.yan2d * 1922730437, itemDef.zan2d * 1605145061, itemDef.xan2d * 36515425, itemDef.xOffset2d * 1578900673, var12 + modelRasterizer.modelHeight * 782517621 / 2 + itemDef.yOffset2d * 1336895047, itemDef.yOffset2d * 1336895047 + var19);
			if(var2 >= 1) {
				cachedSprite.setPixels(1);
			}

			if(var2 >= 2) {
				cachedSprite.setPixels(16777215);
			}

			if(var3 != 0) {
				cachedSprite.method2814(var3);
			}

			Rasterizer2D.copySprite(cachedSprite.pixels, 36, 32);
			if(-1 != itemDef.notedTemplate * -910205763) {
				sprite.method2746(0, 0);
			}

			Rasterizer2D.copySprite(pixels, width, height);
			Rasterizer2D.method2551(var18);
			Rasterizer3D.method2970();
			Rasterizer3D.aBool2518 = true;
			return cachedSprite;
		}
	}

	public static final RGBSprite getItemSprite(int itemID, int amount, int var2, int var3, boolean exist, int var5) {
       long itemHash = ((long)var3 << 40) + ((long)var2 << 38) + (long)itemID + ((long)amount << 16);
       RGBSprite cachedSprite;
       if(!exist) {
          cachedSprite = (RGBSprite) itemSpriteMap.get(itemHash);
          if(cachedSprite != null) {
             return cachedSprite;
          }
       }

       ItemDefinition itemDef = getItemDefinition(itemID, -221675425);
       if(amount > 1 && null != itemDef.countObj) {
          int countChangeID = -1;

          for(int amountIndex = 0; amountIndex < 10; ++amountIndex) {
             if(amount >= itemDef.countCo[amountIndex] && 0 != itemDef.countCo[amountIndex]) {
                countChangeID = itemDef.countObj[amountIndex];
             }
          }

          if(countChangeID != -1) {
             itemDef = getItemDefinition(countChangeID, -1934683345);
          }
       }

       ModelRasterizer modelRasterizer = itemDef.renderItem(1, (byte)24);
       if(null == modelRasterizer) {
          return null;
       } else {
          RGBSprite sprite = null;
          if(-1 != itemDef.notedTemplate * -910205763) {
             sprite = getItemSprite(itemDef.notedID * -616959653, 10, 1, 0, true, -944989678);
             if(null == sprite) {
                return null;
             }
          }

          int[] pixels = Rasterizer2D.renderPixels;
          int width = Rasterizer2D.renderWidth;
          int height = Rasterizer2D.renderHeight;
          int[] var18 = new int[4];
          Rasterizer2D.populateArea(var18);
          cachedSprite = new RGBSprite(36, 32);
          Rasterizer2D.copySprite(cachedSprite.pixels, 36, 32);
          Rasterizer2D.resetPixels();
          Rasterizer3D.method2970();
          Rasterizer3D.method2926(16, 16);
          Rasterizer3D.aBool2518 = false;
          int zoom = itemDef.zoom2d * 609600173;
          if(exist) {
             zoom = (int)(1.5D * (double)zoom);
          } else if(var2 == 2) {
             zoom = (int)((double)zoom * 1.04D);
          }

          int var12 = Rasterizer3D.SINE[itemDef.xan2d * 36515425] * zoom >> 16;
          int var19 = zoom * Rasterizer3D.COSINE[itemDef.xan2d * 36515425] >> 16;
          modelRasterizer.method2855();
          modelRasterizer.method2916(0, itemDef.yan2d * 1922730437, itemDef.zan2d * 1605145061, itemDef.xan2d * 36515425, itemDef.xOffset2d * 1578900673, var12 + modelRasterizer.modelHeight * 782517621 / 2 + itemDef.yOffset2d * 1336895047, itemDef.yOffset2d * 1336895047 + var19);
          if(var2 >= 1) {
             cachedSprite.setPixels(1);
          }

          if(var2 >= 2) {
             cachedSprite.setPixels(16777215);
          }

          if(var3 != 0) {
             cachedSprite.method2814(var3);
          }

          Rasterizer2D.copySprite(cachedSprite.pixels, 36, 32);
          if(-1 != itemDef.notedTemplate * -910205763) {
             sprite.method2746(0, 0);
          }

          if(!exist && (itemDef.stackable * 1548462817 == 1 || amount != 1) && -1 != amount) {
             RSFont itemFont = itemAmountFont;
             String amountString;
             if(amount < 100000) {
                amountString = "<col=ffff00>" + amount + "</col>";
             } else if(amount < 10000000) {
                amountString = "<col=ffffff>" + amount / 1000 + StringUtilities.ITEM_AMOUNT_K + "</col>";
             } else {
                amountString = "<col=00ff80>" + amount / 1000000 + StringUtilities.ITEM_AMOUNT_M + "</col>";
             }

             itemFont.drawString(amountString, 0, 9, 16776960, 1);
          }

          if(!exist) {
             itemSpriteMap.put(cachedSprite, itemHash);
          }

          Rasterizer2D.copySprite(pixels, width, height);
          Rasterizer2D.method2551(var18);
          Rasterizer3D.method2970();
          Rasterizer3D.aBool2518 = true;
          return cachedSprite;
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

	void copyDefinitions(ItemDefinition var1, ItemDefinition var2, int var3) {
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
