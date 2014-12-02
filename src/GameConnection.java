import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class GameConnection implements Runnable {

	OutputStream output;
	Socket socket;
	int anInt802 = 0;
	PingRequester aClass61_803;
	PingRequest aClass85_804;
	byte[] buffer;
	boolean aBool806 = false;
	int anInt807 = 0;
	boolean closed = false;
	static int anInt811;
	InputStream input;


	public int available() throws IOException {
		return this.closed ? 0 : this.input.available();
	}

	public void read(byte[] dest, int start, int len) throws IOException {
		if (!this.closed) {
			while (len > 0) {
				int read = this.input.read(dest, start, len);
				if (read <= 0) {
					throw new EOFException();
				}

				start += read;
				len -= read;
			}

		}
	}

	public void writeBytes(byte[] var1, int var2, int var3) throws IOException {
		if (!this.closed) {
			if (this.aBool806) {
				this.aBool806 = false;
				throw new IOException();
			} else {
				if (null == this.buffer) {
					this.buffer = new byte[5000];
				}

				synchronized (this) {
					for (int var6 = 0; var6 < var3; ++var6) {
						this.buffer[this.anInt802 * 407894929] = var1[var6 + var2];
						this.anInt802 = (this.anInt802 * 407894929 + 1) % 5000 * 2029397361;
						if (this.anInt802 * 407894929 == (4900 + this.anInt807 * -1890364287) % 5000) {
							throw new IOException();
						}
					}

					if (this.aClass85_804 == null) {
						this.aClass85_804 = this.aClass61_803.method820(this, 3, -1672356969);
					}

					this.notifyAll();
				}
			}
		}
	}

	public GameConnection(Socket sock, PingRequester var2) throws IOException {
		this.aClass61_803 = var2;
		this.socket = sock;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.input = this.socket.getInputStream();
		this.output = this.socket.getOutputStream();
	}

	public void run() {
		try {
			while (true) {
				label78:
				{
					int var3;
					int var4;
					synchronized (this) {
						if (this.anInt807 * -1890364287 == this.anInt802 * 407894929) {
							if (this.closed) {
								break label78;
							}

							try {
								this.wait();
							} catch (InterruptedException var9) {
								;
							}
						}

						var3 = this.anInt807 * -1890364287;
						if (this.anInt802 * 407894929 >= this.anInt807 * -1890364287) {
							var4 = this.anInt802 * 407894929 - this.anInt807 * -1890364287;
						} else {
							var4 = 5000 - this.anInt807 * -1890364287;
						}
					}

					if (var4 <= 0) {
						continue;
					}

					try {
						this.output.write(this.buffer, var3, var4);
					} catch (IOException var8) {
						this.aBool806 = true;
					}

					this.anInt807 = (this.anInt807 * -1890364287 + var4) % 5000 * 1349577601;

					try {
						if (this.anInt807 * -1890364287 == this.anInt802 * 407894929) {
							this.output.flush();
						}
					} catch (IOException var7) {
						this.aBool806 = true;
					}
					continue;
				}

				try {
					if (null != this.input) {
						this.input.close();
					}

					if (null != this.output) {
						this.output.close();
					}

					if (null != this.socket) {
						this.socket.close();
					}
				} catch (IOException var6) {
					;
				}

				this.buffer = null;
				return;
			}
		} catch (Exception var11) {
			World.method647(null, var11, 926745782);
		}
	}

	protected void finalize() {
		this.disconnect();
	}

	public void disconnect() {
		if (!this.closed) {
			synchronized (this) {
				this.closed = true;
				this.notifyAll();
			}

			if (this.aClass85_804 != null) {
				while (this.aClass85_804.anInt1292 == 0) {
					Class108_Sub22.sleep(1L);
				}

				if (this.aClass85_804.anInt1292 == 1) {
					try {
						((Thread) this.aClass85_804.anObject1294).join();
					} catch (InterruptedException var4) {
						;
					}
				}
			}

			this.aClass85_804 = null;
		}
	}

	public int read() throws IOException {
		return this.closed ? 0 : this.input.read();
	}

	static void method815(AnimationDefinition var0, int var1, int var2, int var3, short var4) {
		if (Client.anInt2895 * 348809069 < 50) {
			if (Client.anInt2940 * 769647509 != 0) {
				if (null != var0.anIntArray2126) {
					if (var1 < var0.anIntArray2126.length) {
						int var5 = var0.anIntArray2126[var1];
						if (0 != var5) {
							int var6 = var5 >> 8;
							int var8 = var5 >> 4 & 7;
							int var9 = var5 & 15;
							Client.anIntArray2942[Client.anInt2895 * 348809069] = var6;
							Client.anIntArray2757[Client.anInt2895 * 348809069] = var8;
							Client.anIntArray2944[Client.anInt2895 * 348809069] = 0;
							Client.aClass6Array2741[Client.anInt2895 * 348809069] = null;
							int var7 = (var2 - 64) / 128;
							int var10 = (var3 - 64) / 128;
							Client.anIntArray2704[Client.anInt2895 * 348809069] = (var7 << 16) + (var10 << 8) + var9;
							Client.anInt2895 -= 1862223259;
						}
					}
				}
			}
		}
	}
}
