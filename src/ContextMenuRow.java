import java.awt.*;

public class ContextMenuRow {

	int menuYInteraction;
	public static Canvas aCanvas3;
	int menuIdentifier;
	String menuActionPrefixes;
	int menuParameters;
	int menuXInteraction;


	static void method35(int interID, int var1) {
		if (interID != -1) {
			if (RSInterface.loadInterface(interID, 1610753614)) {
				RSInterface[] components = RSInterface.interface_cache[interID];

				for (int compIndex = 0; compIndex < components.length; ++compIndex) {
					RSInterface component = components[compIndex];
					if (component.anObjectArray1861 != null) {
						ClientScript script = new ClientScript();
						script.parentInterface = component;
						script.parameters = component.anObjectArray1861;
						ClientScript.executeScript(script, 2000000, (short) -30137);
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

}
