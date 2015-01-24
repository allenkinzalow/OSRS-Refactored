public class Class50 implements IdentifiableDefinition {

	static RSByteBuffer aClass108_Sub14_693;
	static Class50 aClass50_694 = new Class50(2);
	int anInt695;
	static int anInt696;
	static Class7 aClass7_697;
	static Class50 aClass50_698 = new Class50(0);
	static int anInt699;
	static Class50 aClass50_701 = new Class50(1);


	public int getID(int var1) {
		return this.anInt695 * -1481777567;
	}

	static int method697(byte var0) {
		return (Class26.anInt356 += 421632683) * -1731096573 - 1;
	}

	public static boolean method698(int var0, int var1) {
		return 0 != (var0 >> 21 & 1);
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
