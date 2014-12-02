import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class PingRequester implements Runnable {

	Interface1 anInterface1_814;
	PingRequest aClass85_815 = null;
	PingRequest aClass85_816 = null;
	Thread thread;
	boolean aBool818 = false;
	static CacheIndex landscapeIndex;
	EventQueue eventQueue;
	static String aString823;


	public final PingRequest method816(String var1, int var2, int var3) {
		return this.method818(1, var2, 0, var1, 1791848445);
	}

	public final void run() {
		while (true) {
			PingRequest var2;
			synchronized (this) {
				while (true) {
					if (this.aBool818) {
						return;
					}

					if (null != this.aClass85_815) {
						var2 = this.aClass85_815;
						this.aClass85_815 = this.aClass85_815.aClass85_1288;
						if (null == this.aClass85_815) {
							this.aClass85_816 = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var6) {
						;
					}
				}
			}

			try {
				int var1 = var2.anInt1293 * 664810861;
				if (var1 == 1) {
					var2.anObject1294 = new Socket(InetAddress.getByName((String) var2.anObject1295), var2.anInt1296);
				} else if (var1 == 2) {
					Thread var3 = new Thread((Runnable) var2.anObject1295);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var2.anInt1296);
					var2.anObject1294 = var3;
				} else if (4 == var1) {
					var2.anObject1294 = new DataInputStream(((URL) var2.anObject1295).openStream());
				} else if (var1 == 3) {
					String var8 = (var2.anInt1296 >> 24 & 255) + "." + (var2.anInt1296 >> 16 & 255) + "." + (var2.anInt1296 >> 8 & 255) + "." + (var2.anInt1296 & 255);
					var2.anObject1294 = InetAddress.getByName(var8).getHostName();
				}

				var2.anInt1292 = 1;
			} catch (Throwable var5) {
				var2.anInt1292 = 2;
			}
		}
	}

	final PingRequest method818(int var1, int var2, int var3, Object var4, int var5) {
		PingRequest var6 = new PingRequest();
		var6.anInt1293 = var1 * -958456731;
		var6.anInt1296 = var2;
		var6.anObject1295 = var4;
		synchronized (this) {
			if (null != this.aClass85_816) {
				this.aClass85_816.aClass85_1288 = var6;
				this.aClass85_816 = var6;
			} else {
				this.aClass85_816 = this.aClass85_815 = var6;
			}

			this.notify();
			return var6;
		}
	}

	public final PingRequest method820(Runnable var1, int var2, int var3) {
		return this.method818(2, var2, 0, var1, 1461448449);
	}

	public final PingRequest method821(int var1, int var2) {
		return this.method818(3, var1, 0, (Object) null, -1051579055);
	}

	public final PingRequest method822(URL var1, short var2) {
		return this.method818(4, 0, 0, var1, 262653276);
	}

	public final Interface1 method832(byte var1) {
		return this.anInterface1_814;
	}

	public static int method835(CharSequence var0, CharSequence var1, int var2, int var3) {
		int var4 = var0.length();
		int var13 = var1.length();
		int var6 = 0;
		int var12 = 0;
		char var7 = 0;
		char var8 = 0;

		while (var6 - var7 < var4 || var12 - var8 < var13) {
			if (var6 - var7 >= var4) {
				return -1;
			}

			if (var12 - var8 >= var13) {
				return 1;
			}

			char var5;
			if (var7 != 0) {
				var5 = var7;
				boolean var16 = false;
			} else {
				var5 = var0.charAt(var6++);
			}

			char var9;
			if (var8 != 0) {
				var9 = var8;
				boolean var17 = false;
			} else {
				var9 = var1.charAt(var12++);
			}

			var7 = RSInterface.method1980(var5, (short) -3284);
			var8 = RSInterface.method1980(var9, (short) -10265);
			var5 = ChatMessagesContainer.method359(var5, var2, 824030696);
			var9 = ChatMessagesContainer.method359(var9, var2, 1975637827);
			if (var9 != var5 && Character.toUpperCase(var5) != Character.toUpperCase(var9)) {
				var5 = Character.toLowerCase(var5);
				var9 = Character.toLowerCase(var9);
				if (var9 != var5) {
					return Class2.method43(var5, var2, 1902916239) - Class2.method43(var9, var2, 1877116872);
				}
			}
		}

		int var15 = Math.min(var4, var13);

		char var10;
		int var18;
		for (var18 = 0; var18 < var15; ++var18) {
			char var14 = var0.charAt(var18);
			var10 = var1.charAt(var18);
			if (var10 != var14 && Character.toUpperCase(var14) != Character.toUpperCase(var10)) {
				var14 = Character.toLowerCase(var14);
				var10 = Character.toLowerCase(var10);
				if (var14 != var10) {
					return Class2.method43(var14, var2, 1905667837) - Class2.method43(var10, var2, 2142779647);
				}
			}
		}

		var18 = var4 - var13;
		if (0 != var18) {
			return var18;
		} else {
			for (int var19 = 0; var19 < var15; ++var19) {
				var10 = var0.charAt(var19);
				char var11 = var1.charAt(var19);
				if (var10 != var11) {
					return Class2.method43(var10, var2, 1956672242) - Class2.method43(var11, var2, 1811041099);
				}
			}

			return 0;
		}
	}

	final void method839(int var1) {
		synchronized (this) {
			this.aBool818 = true;
			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var4) {
			;
		}
	}

	PingRequester() {
		aString823 = "Unknown";
		Class71.aString916 = "1.1";

		try {
			aString823 = System.getProperty("java.vendor");
			Class71.aString916 = System.getProperty("java.version");
		} catch (Exception var3) {
			;
		}

		try {
			this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var2) {
			;
		}

		this.aBool818 = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}
}
