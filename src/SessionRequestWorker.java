import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
/**
 * This is actually something beyond just a ping requester - will be refactored later.
 */
public class SessionRequestWorker implements Runnable {

	static int anInt918;
	Interface1 anInterface1_814;
	SessionRequest currentSessionRequest = null;
	SessionRequest previousSessionRequest = null;
	Thread thread;
	boolean shutdown = false;
	EventQueue eventQueue;
	static String javaVendor;


	public final SessionRequest submitSocketSession(String ipAddress, int port, int var3) {
		return this.submitSessionRequest(1, port, 0, ipAddress, 1791848445);
	}

	public final void run() {
		while (true) {
			SessionRequest request;
			synchronized (this) {
				while (true) {
					if (this.shutdown) {
						return;
					}

					if (null != this.currentSessionRequest) {
						request = this.currentSessionRequest;
						this.currentSessionRequest = this.currentSessionRequest.nextSessionRequest;
						if (null == this.currentSessionRequest) {
							this.previousSessionRequest = null;
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
				int type = request.connectionType * 664810861;
				if (type == 1) {
					System.out.println("IP: " + ((String) request.connectionAddress) + " Port: " + request.connectParameter);
					request.connectionObject = new Socket(InetAddress.getByName((String) request.connectionAddress), request.connectParameter);
				} else if (type == 2) {
					Thread var3 = new Thread((Runnable) request.connectionAddress);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(request.connectParameter);
					request.connectionObject = var3;
				} else if (4 == type) {
					request.connectionObject = new DataInputStream(((URL) request.connectionAddress).openStream());
				} else if (type == 3) {
					String ipAddress = (request.connectParameter >> 24 & 255) + "." + (request.connectParameter >> 16 & 255) + "." + (request.connectParameter >> 8 & 255) + "." + (request.connectParameter & 255);
					request.connectionObject = InetAddress.getByName(ipAddress).getHostName();
				}

				request.anInt1292 = 1;
			} catch (Throwable var5) {
				request.anInt1292 = 2;
			}
		}
	}

	final SessionRequest submitSessionRequest(int connectionType, int connectionParameter, int var3, Object connectionAddress, int var5) {
		SessionRequest request = new SessionRequest();
		request.connectionType = connectionType * -958456731;
		request.connectParameter = connectionParameter;
		request.connectionAddress = connectionAddress;
		synchronized (this) {
			if (null != this.previousSessionRequest) {
				this.previousSessionRequest.nextSessionRequest = request;
				this.previousSessionRequest = request;
			} else {
				this.previousSessionRequest = this.currentSessionRequest = request;
			}

			this.notify();
			return request;
		}
	}

	public final SessionRequest submitRunnableSession(Runnable var1, int var2, int var3) {
		return this.submitSessionRequest(2, var2, 0, var1, 1461448449);
	}

	public final SessionRequest submitIPHostSession(int var1, int var2) {
		return this.submitSessionRequest(3, var1, 0, (Object) null, -1051579055);
	}

	public final SessionRequest submitURLConnectionSession(URL var1, short var2) {
		return this.submitSessionRequest(4, 0, 0, var1, 262653276);
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
			this.shutdown = true;
			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var4) {
			;
		}
	}

	SessionRequestWorker() {
		javaVendor = "Unknown";
		MachineInformation.javaVersion = "1.1";

		try {
			javaVendor = System.getProperty("java.vendor");
			MachineInformation.javaVersion = System.getProperty("java.version");
		} catch (Exception var3) {
			;
		}

		try {
			this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var2) {
			;
		}

		this.shutdown = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}
}
