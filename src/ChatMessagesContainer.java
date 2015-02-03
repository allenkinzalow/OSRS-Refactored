public class ChatMessagesContainer {

	int lastMessageIndex; // this is the oldest message's index in the array
	ChatMessage[] chatMessages = new ChatMessage[100];
	static int[] anIntArray332;


	static void sleep(long timeout) {
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException ignored) {

		}
	}

	static void pushMessage(int type, String var1, String var2, int var3) {
		pushDirectMessage(type, var1, var2, (String) null, 403249369);
	}

	static void pushDirectMessage(int messageType, String messagePrefix, String messageString, String messageSuffix, int var4) {
       ChatMessagesContainer messageContainer = (ChatMessagesContainer)Class26.chatMessageMap.get(Integer.valueOf(messageType));
       if(messageContainer == null) {
          messageContainer = new ChatMessagesContainer();
          Class26.chatMessageMap.put(Integer.valueOf(messageType), messageContainer);
       }

       ChatMessage chatMessage = messageContainer.submitNewMessage(messageType, messagePrefix, messageString, messageSuffix, -1626872444);
       Class26.aClass95_348.method1203(chatMessage, (long)(chatMessage.anInt1944 * -1818271001));
       Class26.aClass97_349.method1273(chatMessage);
       Client.anInt2896 = Client.anInt2731 * 2056637341;
    }

	static ChatMessage getChatMessageFromContainer(int chatMessageContainerID, int chatMessageIndex, byte var2) {
       ChatMessagesContainer chatContainer = (ChatMessagesContainer)Class26.chatMessageMap.get(Integer.valueOf(chatMessageContainerID));
       return chatContainer.getChatMessageForIndex(chatMessageIndex, 143975474);
    }

	static final void sendText(String text, int var1) {
       if(text.equalsIgnoreCase("toggleroof")) {
          Ignore.clientSettings.hideRoofs = !Ignore.clientSettings.hideRoofs;
          Timer.method713(-563726063);
          if(Ignore.clientSettings.hideRoofs) {
             pushMessage(99, "", "Roofs are now all hidden", -1992448970);
          } else {
             pushMessage(99, "", "Roofs will only be removed selectively", -594140255);
          }
       }

       if(Client.rights * 171939335 >= 2) {
          if(text.equalsIgnoreCase("fpson")) {
             Client.showFPS = true;
          }

          if(text.equalsIgnoreCase("fpsoff")) {
             Client.showFPS = false;
          }

          if(text.equalsIgnoreCase("gc")) {
             System.gc();
          }

          if(text.equalsIgnoreCase("clientdrop")) {
             Class7.method180(-535663951);
          }

          if(text.equalsIgnoreCase("errortest") && 2 == Client.portType * -759629273) {
             throw new RuntimeException();
          }
       }

       Client.secureBuffer.writePacket(164);
       Client.secureBuffer.writeByte(text.length() + 1);
       Client.secureBuffer.writeString(text);
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

	int method351(int var1) {
		return this.lastMessageIndex * 993019301;
	}

	static void method354(int var0) {
		RegionReference.anInt485 = 1529001613;
		GZIPDecompressor.underlayFloorIds = new byte[4][104][104];
		RegionReference.overlayFloorIds = new byte[4][104][104];
		RegionReference.overlayClippingPaths = new byte[4][104][104];
		RegionReference.overlayRotations = new byte[4][104][104];
		Class19.tileCullingBitset = new int[4][105][105];
		RegionReference.aByteArrayArrayArray488 = new byte[4][105][105];
		RegionReference.tileLightingIntensity = new int[105][105];
		RegionReference.blendedHue = new int[104];
		RegionReference.blendedSaturation = new int[104];
		IndexTable.blendedLightness = new int[104];
		LoginHandler.blendedHueDivisor = new int[104];
		Wall.blendedDirectionTracker = new int[104];
	}

	ChatMessage getChatMessageForIndex(int chatMessageIndex, int var2) {
		return chatMessageIndex >= 0 && chatMessageIndex < this.lastMessageIndex * 993019301 ? this.chatMessages[chatMessageIndex] : null;
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
