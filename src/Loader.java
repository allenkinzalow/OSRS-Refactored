import javax.swing.*;

//import shadowy.GUI;

import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class Loader implements AppletStub {

	public static final long serialVersionUID = 1670498001014004354L;

	public static String IP = "46.105.102.145";
	//46.105.102.145
	//82.1.202.145
	public static final boolean local = true;
	public static Loader ctx;
	public static Properties parameters = new Properties();

	public JFrame clientFrame = null;

	public static void main(String[] args) throws IOException {
		if(args.length>0){
			if(args[0].equals("d")){
				IP = "46.105.102.145";
			}
			if(args[0].equals("j")){
				IP = "82.1.202.145";
			}
			if(args[0].equals("l")){
				IP = "localhost";
			}
			if(args[0].equals("127")){
				IP = "127.0.0.1";
			}
		}
		//GUI.init();
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
		//readParameters();
		parameters.put("7", "1");
		parameters.put("4", "true");
		parameters.put("1", "true");
		parameters.put("6", "http://www.runescape.com/slr.ws?order=LPWM");
		parameters.put("9", "318");
		parameters.put("8", "0");
		parameters.put("2", "true");
		parameters.put("10", "0");
		parameters.put("3", "5");
		parameters.put("5", "0");
		parameters.put("image", "http://www.runescape.com/img/rsp777/oldschool_ani.gif");
		parameters.put("separate_jvm", "true");
		parameters.put("boxbgcolor", "black");
		parameters.put("centerimage", "true");
		parameters.put("java_arguments", "-Xmx256m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
		parameters.put("boxborder", "false");
		parameters.put("haveie6", "true");
		startClient();
		clientFrame.setDefaultCloseOperation(3);
	}

	private void startClient() {
		try {

			Client c = new Client();
			c.setStub(this);
			c.init();
			c.start();

			clientFrame = new JFrame("OldRS Loader 60 (local: " + local + ") ");

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
			System.out.println("Dir is " + new File("").getAbsolutePath());
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("params.txt")));
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