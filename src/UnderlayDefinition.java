import java.awt.Frame;

public class UnderlayDefinition extends CacheableNode {

	static Class116 aClass116_2142;
	public static CacheableNodeMap aClass106_2143 = new CacheableNodeMap(64);
	public int luminosity;
	public int hue;
	public int saturation;
	public static AbstractIndex aClass74_2147;
	public static final int anInt2148 = 16;
	public int hueDivisor;
	protected static Frame aFrame2150;
	int color = 0;
	public static final int anInt2152 = 128;
	public static final int anInt2153 = 124;
	public static final int anInt2154 = 145;


	void decode(RSByteBuffer var1, int var2, int var3, int var4) {
		if (var2 == 1) {
			this.color = var1.method1809(-346167258) * -455645179;
		}
	}

	void method2269(int var1, byte var2) {
		double var3 = (double) (var1 >> 16 & 255) / 256.0D;
		double var7 = (double) (var1 >> 8 & 255) / 256.0D;
		double var11 = (double) (var1 & 255) / 256.0D;
		double var13 = var3;
		if (var7 < var3) {
			var13 = var7;
		}

		if (var11 < var13) {
			var13 = var11;
		}

		double var9 = var3;
		if (var7 > var3) {
			var9 = var7;
		}

		if (var11 > var9) {
			var9 = var11;
		}

		double var15 = 0.0D;
		double var5 = 0.0D;
		double var17 = (var13 + var9) / 2.0D;
		if (var9 != var13) {
			if (var17 < 0.5D) {
				var5 = (var9 - var13) / (var13 + var9);
			}

			if (var17 >= 0.5D) {
				var5 = (var9 - var13) / (2.0D - var9 - var13);
			}

			if (var9 == var3) {
				var15 = (var7 - var11) / (var9 - var13);
			} else if (var7 == var9) {
				var15 = 2.0D + (var11 - var3) / (var9 - var13);
			} else if (var9 == var11) {
				var15 = 4.0D + (var3 - var7) / (var9 - var13);
			}
		}

		var15 /= 6.0D;
		this.saturation = (int) (var5 * 256.0D) * -755312157;
		this.luminosity = (int) (256.0D * var17) * -2021874849;
		if (this.saturation * -1288752181 < 0) {
			this.saturation = 0;
		} else if (this.saturation * -1288752181 > 255) {
			this.saturation = 668928285;
		}

		if (this.luminosity * -1539409761 < 0) {
			this.luminosity = 0;
		} else if (this.luminosity * -1539409761 > 255) {
			this.luminosity = -182010975;
		}

		if (var17 > 0.5D) {
			this.hueDivisor = (int) (512.0D * (1.0D - var17) * var5) * 1351296371;
		} else {
			this.hueDivisor = (int) (var5 * var17 * 512.0D) * 1351296371;
		}

		if (this.hueDivisor * -1997240389 < 1) {
			this.hueDivisor = 1351296371;
		}

		this.hue = (int) (var15 * (double) (this.hueDivisor * -1997240389)) * -176113819;
	}

	public void method2271(RSByteBuffer var1, int var2, int var3) {
		while (true) {
			int var4 = var1.readUByte();
			if (0 == var4) {
				return;
			}

			this.decode(var1, var4, var2, -1412071557);
		}
	}

	public void method2278(int var1) {
		this.method2269(this.color * 1009591501, (byte) 7);
	}

	static final void method2279(int var0) {
		if (Client.lowMemory && Client.anInt2890 * -158871381 != VarpBit.plane * -570926309) {
			FriendsChatMember.method1684(Friend.anInt620 * 687278457, BuildType.anInt1238 * -365008633, VarpBit.plane * -570926309, Class108_Sub10.myPlayer.anIntArray2391[0], Class108_Sub10.myPlayer.anIntArray2392[0], (byte) 23);
		} else if (VarpBit.plane * -570926309 != Client.lastKnownPlane * -313360225) {
			Client.lastKnownPlane = VarpBit.plane * -220387323;
			NPC.renderMinimap(VarpBit.plane * -570926309, (byte) 82);
		}
	}

	public static boolean method2282(char var0, int var1) {
		return var0 >= 48 && var0 <= 57;
	}
}
