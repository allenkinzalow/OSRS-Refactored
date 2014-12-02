import javax.swing.*;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class Loader implements AppletStub {

	public static final String IP = "127.0.0.1" ; // "25.170.158.230"; VPS = 178.62.209.75
	public static final boolean local = true;
	public static Loader ctx;
	public static Properties parameters = new Properties();

	public JFrame clientFrame = null;

	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// JFrame.setDefaultLookAndFeelDecorated(true);
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					ctx = new Loader();
					ctx.doFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	private void doFrame() {
		readParameters();
		startClient();
		clientFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	private void startClient() {
		try {
			Client c = new Client();
			c.setStub(this);
			c.init();
			c.start();

			clientFrame = new JFrame("OldRS Loader 60 (local: " + local + ")");

			clientFrame.add(c);
			clientFrame.setVisible(true);

			JFrame jf = new JFrame();
			jf.pack();
			Insets i = jf.getInsets();

			clientFrame.setSize(765 + i.left + i.right, 503 + i.top + i.bottom);
			clientFrame.setLocationRelativeTo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readParameters() {
		try {
			System.out.println(Loader.class.getResourceAsStream("params.txt"));
			BufferedReader reader = new BufferedReader(new InputStreamReader(Loader.class.getResourceAsStream("params.txt")));

			String line;
			while ((line = reader.readLine()) != null) {
				if (line.contains("document.write('<param name=")) {
					String[] regex = line.split(" value=");

					String parameterName = regex[0];
					String[] parameterRegex = parameterName.split("name=");
					String finalParameter = parameterRegex[1].replaceAll("\"", "");

					String parameterValue = regex[1];
					String finalValue = parameterValue.replaceAll("\"", "").replace(">');", "");
					parameters.put(finalParameter, finalValue);
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void appletResize(int dimensionX, int dimensionY) {
	}

	public String getParameter(String paramName) {
		return (String) parameters.get(paramName);
	}

	public URL getDocumentBase() {
		try {
			return new URL(local ? "http://" + IP : "http://oldschool53.runescape.com");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public URL getCodeBase() {
		try {
			return new URL(local ? "http://" + IP : "http://oldschool53.runescape.com");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public AppletContext getAppletContext() {
		return null;
	}

	public boolean isActive() {
		return true;
	}

}