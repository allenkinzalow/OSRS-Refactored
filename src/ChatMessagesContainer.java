public class ChatMessagesContainer {

	int lastMessageIndex; // this is the oldest message's index in the array
	ChatMessage[] chatMessages = new ChatMessage[100];
	static PaletteSprite[] mapSceneIcons;
	static int[] anIntArray332;


	static void sleep(long timeout) {
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException ignored) {

		}
	}

	/**
	 * Submits a chat message and returns the created ChatMessage
	 * -Allen
	 * @param messageType
	 * @param messagePrefix
	 * @param messageSuffix
	 * @param messageString
	 * @param var5
	 * @return
	 */
	ChatMessage submitNewMessage(int messageType, String messagePrefix, String messageSuffix, String messageString, int var5) {
		ChatMessage chatMessage = this.chatMessages[99];

		for (int messageIndex = this.lastMessageIndex * 993019301; messageIndex > 0; --messageIndex) {
			if (100 != messageIndex) {
				this.chatMessages[messageIndex] = this.chatMessages[messageIndex - 1];
			}
		}

		if (chatMessage == null) {
			chatMessage = new ChatMessage(messageType, messagePrefix, messageString, messageSuffix);
		} else {
			chatMessage.unlink();
			chatMessage.method1982();
			chatMessage.method2019(messageType, messagePrefix, messageString, messageSuffix, -48223422);
		}

		this.chatMessages[0] = chatMessage;
		if (this.lastMessageIndex * 993019301 < 100) {
			this.lastMessageIndex -= 1428350419;
		}

		return chatMessage;
	}

	static void method346(int var0) {
		for (Class108_Sub6 var1 = (Class108_Sub6) Class108_Sub6.aClass105_1587.getFront(); null != var1; var1 = (Class108_Sub6) Class108_Sub6.aClass105_1587.getNext()) {
			if (null != var1.aClass108_Sub20_Sub8_1599) {
				var1.method1666(1465955458);
			}
		}

	}

	public static ObjectDefinition getObjectDefForID(int objectID, byte var1) {
		ObjectDefinition objectDef = (ObjectDefinition) ObjectDefinition.objectDefMap.get((long) objectID);
		if (objectDef != null) {
			return objectDef;
		} else {
			byte[] objectData = ObjectDefinition.aClass74_2066.getFile(6, objectID, (byte) 7);
			objectDef = new ObjectDefinition();
			objectDef.objectID = objectID * -743597329;
			if (null != objectData) {
				objectDef.decode(new RSByteBuffer(objectData), (byte) 79);
			}

			objectDef.method2174(1656964186);
			if (objectDef.isSolid) {
				objectDef.anInt2094 = 0;
				objectDef.aBool2114 = false;
			}

			ObjectDefinition.objectDefMap.put(objectDef, (long) objectID);
			return objectDef;
		}
	}

	int method351(int var1) {
		return this.lastMessageIndex * 993019301;
	}

	static ClientScriptDefinition getClientScriptDefinition(int scriptID, int var1) {
		ClientScriptDefinition definition = (ClientScriptDefinition) ClientScriptDefinition.clientScriptMap.get((long) scriptID);
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

				ClientScriptDefinition.clientScriptMap.put(definition, (long) scriptID);
				return definition;
			}
		}
	}

	static void method354(int var0) {
		RegionReference.anInt485 = 1529001613;
		GZIPDecompressor.underlayFloorIds = new byte[4][104][104];
		RegionReference.overlayFloorIds = new byte[4][104][104];
		RegionReference.overlayClippingPaths = new byte[4][104][104];
		AnimationSkeletonSet.overlayRotations = new byte[4][104][104];
		Class19.tileCullingBitset = new int[4][105][105];
		RegionReference.aByteArrayArrayArray488 = new byte[4][105][105];
		Class19.tileLightingIntensity = new int[105][105];
		RegionReference.blendedHue = new int[104];
		RegionReference.blendedSaturation = new int[104];
		IndexTable.blendedLightness = new int[104];
		LoginHandler.blendedHueDivisor = new int[104];
		Wall.blendedDirectionTracker = new int[104];
	}

	ChatMessage method356(int var1, int var2) {
		return var1 >= 0 && var1 < this.lastMessageIndex * 993019301 ? this.chatMessages[var1] : null;
	}

	public static VarpBit method358(int fileID, int var1) {
		VarpBit var2 = (VarpBit) VarpBit.aClass106_1955.get((long) fileID);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = VarpBit.aClass74_1951.getFile(14, fileID, (byte) 7);
			var2 = new VarpBit();
			if (var3 != null) {
				var2.decode(new RSByteBuffer(var3), (short) 5866);
			}

			VarpBit.aClass106_1955.put(var2, (long) fileID);
			return var2;
		}
	}

	static char method359(char var0, int var1, int var2) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (221 == var0) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || 255 == var0) {
				return 'y';
			}
		}

		return var0 == 338 ? 'O' : (var0 == 339 ? 'o' : (376 == var0 ? 'Y' : var0));
	}
}
