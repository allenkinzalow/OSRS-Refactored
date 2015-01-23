public class SoundEffectClass_1 {

	int anInt174 = RSSoundEffect_2.method1643(16);
	int anInt173 = RSSoundEffect_2.method1643(24);
	int anInt176 = RSSoundEffect_2.method1643(24);
	int anInt172 = RSSoundEffect_2.method1643(24) + 1;
	int anInt175 = RSSoundEffect_2.method1643(6) + 1;
	int anInt177 = RSSoundEffect_2.method1643(8);
	int[] anIntArray178;


	SoundEffectClass_1() {
		int[] var1 = new int[this.anInt175];

		int var2;
		for (var2 = 0; var2 < this.anInt175; ++var2) {
			int var3 = 0;
			int var5 = RSSoundEffect_2.method1643(3);
			boolean var4 = RSSoundEffect_2.method1618() != 0;
			if (var4) {
				var3 = RSSoundEffect_2.method1643(5);
			}

			var1[var2] = var3 << 3 | var5;
		}

		this.anIntArray178 = new int[this.anInt175 * 8];

		for (var2 = 0; var2 < this.anInt175 * 8; ++var2) {
			this.anIntArray178[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0 ? RSSoundEffect_2.method1643(8) : -1;
		}

	}

	void method255(float[] var1, int var2, boolean var3) {
		int var4;
		for (var4 = 0; var4 < var2; ++var4) {
			var1[var4] = 0.0F;
		}

		if (!var3) {
			var4 = RSSoundEffect_2.aClass8Array1554[this.anInt177].anInt115;
			int var5 = this.anInt176 - this.anInt173;
			int var6 = var5 / this.anInt172;
			int[] var18 = new int[var6];

			for (int var7 = 0; var7 < 8; ++var7) {
				int var15 = 0;

				while (var15 < var6) {
					int var16;
					int var17;
					if (var7 == 0) {
						var17 = RSSoundEffect_2.aClass8Array1554[this.anInt177].method183();

						for (var16 = var4 - 1; var16 >= 0; --var16) {
							if (var15 + var16 < var6) {
								var18[var15 + var16] = var17 % this.anInt175;
							}

							var17 /= this.anInt175;
						}
					}

					for (var17 = 0; var17 < var4; ++var17) {
						var16 = var18[var15];
						int var10 = this.anIntArray178[var16 * 8 + var7];
						if (var10 >= 0) {
							int var11 = this.anInt173 + var15 * this.anInt172;
							Class8 var9 = RSSoundEffect_2.aClass8Array1554[var10];
							int var14;
							if (this.anInt174 == 0) {
								var14 = this.anInt172 / var9.anInt115;

								for (int var20 = 0; var20 < var14; ++var20) {
									float[] var19 = var9.method184();

									for (int var13 = 0; var13 < var9.anInt115; ++var13) {
										var1[var11 + var20 + var13 * var14] += var19[var13];
									}
								}
							} else {
								var14 = 0;

								while (var14 < this.anInt172) {
									float[] var12 = var9.method184();

									for (int var8 = 0; var8 < var9.anInt115; ++var8) {
										var1[var11 + var14] += var12[var8];
										++var14;
									}
								}
							}
						}

						++var15;
						if (var15 >= var6) {
							break;
						}
					}
				}
			}

		}
	}
}
