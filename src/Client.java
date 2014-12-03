import java.awt.*;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;

public final class Client extends Applet_Sub1 {

	static int anInt2702 = 0;
	static Client aclient2703;
	static int[] anIntArray2704 = new int[50];
	static int worldID = 985794143;
	static int worldType = 0;
	static BuildType aClass79_2707;
	static int anInt2708 = 0;
	static GameDefinition gameDefinition;
	static boolean aBool2710 = false;
	static boolean lowMemory = false;
	static int anInt2712 = 0;
	static int loginLoadingStage = 0;
	static int anInt2714 = -1445469673;
	static int cycle = 0;
	static long aLong2716 = 5205271143587660129L;
	static int anInt2717 = -1762238273;
	static int anInt2718 = -91399121;
	static boolean aBool2719 = false;
	static boolean aBool2720 = true;
	static boolean aBool2721 = false;
	static int anInt2722 = 0;
	static int anInt2723 = 0;
	static int anInt2724 = 0;
	static int[] anIntArray2725 = new int[5];
	static int anInt2726 = 0;
	static int anInt2727 = 0;
	static int anInt2728 = 0;
	static int anInt2729 = 0;
	static int anInt2730 = 0;
	static int anInt2731 = 1649299627;
	static PingRequest aClass85_2732;
	static Class50 aClass50_2733 = Class50.aClass50_698;
	static int currentLoadingStep = 0;
	static int anInt2735 = -735852373;
	static int anInt2736 = 0;
	static Deque aClass105_2737 = new Deque();
	static int anInt2738 = 0;
	static int anInt2739 = 0;
	static int anInt2797 = 1896914830;
	static int anInt2740 = 0;
	static RSSoundEffect[] aClass6Array2741 = new RSSoundEffect[50];
	static int anInt2742;
	static NPC[] localNPCs = new NPC['\u8000'];
	static boolean aBool2744 = false;
	static int[] npcIndices = new int['\u8000'];
	static RSPacketBuffer secureBuffer = new RSPacketBuffer(5000);
	static RSPacketBuffer loginBuffer = new RSPacketBuffer(5000);
	static RSPacketBuffer packetBuffer = new RSPacketBuffer(5000);
	static int anInt2749 = 0;
	static int packetID = 0;
	static int anInt2751 = 0;
	static int gametick = 0;
	static int skillChangeIndex = 0;
	static int anInt2753 = 0;
	static int anInt2754 = 0;
	static int anInt2755 = 0;
	static int anInt2756 = 0;
	static int[] anIntArray2757 = new int[50];
	static int anInt2758 = 0;
	static int anInt2759 = 0;
	static final int anInt2760 = 1001;
	static int anInt2761 = 0;
	static int anInt2762 = -1236326003;
	static int[] anIntArray2763 = new int[anInt2797 * -797118177];
	static CollisionMap[] clippingPlanes = new CollisionMap[4];
	static int anInt2765 = 0;
	static int[][][] anIntArrayArrayArray2766 = new int[4][13][13];
	static int[] anIntArray2767 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
	static int anInt2768 = 0;
	static int anInt2769 = -1414579590;
	static int anInt2770 = 0;
	static int anInt2771 = 0;
	static int anInt2772 = 0;
	static int anInt2773 = -1306013067;
	static int anInt2774 = 0;
	static int anInt2775 = 0;
	static int[] anIntArray2776 = new int[anInt2797 * -797118177];
	static int anInt2777 = -758271709;
	static int anInt2778 = 114742959;
	static int anInt2779 = 0;
	static int anInt2780 = 0;
	static int anInt2781 = 1215023359;
	static int anInt2782 = 1836934075;
	static int anInt2783 = 572690217;
	static int anInt2784 = 965395164;
	static boolean aBool2785 = false;
	static int anInt2786 = 1947294979;
	static int[] skillChangedTrigger = new int[32];
	static int anInt2788 = 1858078706;
	static int anInt2789 = 801480023;
	static int anInt2790 = 0;
	static int anInt2791 = 0;
	static int anInt2792 = 0;
	static int numLocalPlayers = 0;
	static boolean aBool2794 = false;
	static int anInt2795 = 0;
	static int loginStage = 0;

	static int[] anIntArray2798 = new int[anInt2797 * -797118177];
	static int[] anIntArray2799 = new int[anInt2797 * -797118177];
	static int[] anIntArray2800 = new int[anInt2797 * -797118177];
	static int[] indicesPendingRemoval = new int[1000];
	static boolean aBool2802 = true;
	static int anInt2803 = 0;
	static int anInt2804 = 0;
	static String[] aStringArray2805 = new String[anInt2797 * -797118177];
	static int[][] anIntArrayArray2806 = new int[104][104];
	static int anInt2807 = 0;
	static int anInt2808 = -1626005023;
	static int anInt2809 = -1121153661;
	static int anInt2810 = 0;
	static int anInt2811 = 0;
	static int anInt2812 = 1472404201;
	static int anInt2813 = 0;
	static int anInt2814 = 0;
	static int anInt2815 = 0;
	static int anInt2816 = 944426368;
	static int[] anIntArray2817 = new int[anInt2797 * -797118177];
	static RSInterface aClass108_Sub17_2818 = null;
	static String aString2819 = null;
	static int anInt2820 = 1949788625;
	static Deque projectileDeque = new Deque();
	static int anInt2822 = 0;
	static int anInt2823 = -1510013235;
	static RSByteBuffer aClass108_Sub14_2824 = new RSByteBuffer(new byte[5000]);
	static int[] playerIndices = new int[2048];
	static Deque aClass105_2826 = new Deque();
	static int[] playersNeedingUpdating = new int[2048];
	static RSByteBuffer[] cachedAppearances = new RSByteBuffer[2048];
	static int anInt2829 = 0;
	static int anInt2830 = -1023731525;
	static boolean[] aBoolArray2831 = new boolean[100];
	static int anInt2832 = 0;
	static int[] anIntArray2833 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
	static String[] aStringArray2834 = new String[8];
	static boolean[] aBoolArray2835 = new boolean[8];
	static int[] anIntArray2836 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
	static int anInt2837 = 739185759;
	static int anInt2838 = 0;
	static int anInt2839 = 0;
	static Deque[][][] groundItemArray = new Deque[4][104][104];
	static int anInt2841 = 0;
	static int[] skillLevels = new int[25];
	static int[] anIntArray2843 = new int[25];
	static int anInt2844 = 2066221402;
	static boolean isAtDynamicMap = false;
	static int anInt2846 = 0;
	static int menuActionRow = 0;
	static int[] menuActionXInteractions = new int[500];
	static int[] menuActionYInteractions = new int[500];
	static int[] menuActionIdentifiers = new int[500];
	static int[] menuActionParameters = new int[500];
	static String[] menuActionNamePrefix = new String[500];
	static int[] anIntArray2853 = new int[5];
	static int anInt2854 = -2015274234;
	static int lastKnownPlane = 1405183137;
	static int anInt2856 = 0;
	static int anInt2857 = -1062138202;
	static int anInt2858 = 0;
	static String aString2859 = null;
	static boolean aBool2860 = false;
	static int removedCounter = 0;
	static int anInt2862 = 0;
	static int anInt2863 = 0;
	static int[] anIntArray2864 = new int[2000];
	static int openInterfaceID = -1256289801;
	static HashTable aClass101_2866 = new HashTable(8);
	static int anInt2867 = 0;
	static String[] menuActionNames = new String[500];
	static RSInterface aClass108_Sub17_2869 = null;
	static int anInt2870 = 0;
	static int anInt2871 = 0;
	static int rights = 0;
	static int anInt2873 = -223305679;
	static boolean aBool2874 = true;
	static boolean aBool2875 = false;
	static int anInt2876 = 0;
	static RSInterface aClass108_Sub17_2877 = null;
	static RSInterface aClass108_Sub17_2878 = null;
	static int anInt2879 = 0;
	static int anInt2880 = 0;
	static boolean aBool2881 = false;
	static boolean aBool2882 = false;
	static int anInt2883 = 1717185195;
	static int anInt2884 = 548669269;
	static boolean aBool2885 = false;
	static boolean aBool2886 = false;
	static final String aString2887 = "oldschool";
	static boolean aBool2888 = false;
	static Player[] localPlayers = new Player[2048];
	static int anInt2890 = 0;
	static int configTriggerPointer = 0;
	static int[] widgetItemUpdateTrigger = new int[32];
	static int itemUpdateTriggerIndex = 0;
	static int anInt2894 = 0;
	static int anInt2895 = 0;
	static int anInt2896 = 0;
	static int anInt2897 = 0;
	static int anInt2898 = 0;
	static int anInt2899 = 0;
	static int anInt2900 = 0;
	static String[] aStringArray2901 = new String[1000];
	static int anInt2902 = 0;
	static int anInt2903 = 0;
	static Deque aClass105_2904 = new Deque();
	static int[] anIntArray2905 = new int[100];
	static HashTable aClass101_2906 = new HashTable(512);
	static int anInt2907 = 0;
	static int[] anIntArray2908 = new int[]{16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215};
	static boolean[] aBoolArray2909 = new boolean[100];
	static boolean[] aBoolArray2910 = new boolean[100];
	static int anInt2911 = 0;
	static int[] anIntArray2912 = new int[100];
	static int[] anIntArray2913 = new int[100];
	static int[] anIntArray2914 = new int[100];
	static int anInt2915 = 365218459;
	static int anInt2916 = 0;
	static int[] configChangeTrigger = new int[32];
	static int anInt2918 = 0;
	static int anInt2919 = 0;
	static long[] friendListHash = new long[100];
	static int anInt2921 = 0;
	static int[] skillXPs = new int[25];
	static int[] anIntArray2923 = new int[128];
	static int[] anIntArray2924 = new int[128];
	static long aLong2925 = -1524832735365646447L;
	static EquipmentKit aClass93_2926 = new EquipmentKit();
	static int anInt2927 = 0;
	static Deque aClass105_2928 = new Deque();
	static int ignoreListCount = 0;
	static int[] mapIconTileX = new int[1000];
	static int[] mapIconTileY = new int[1000];
	static RGBSprite[] visibleMapIcons = new RGBSprite[1000];
	static int anInt2933 = 0;
	static String aString2934 = null;
	static int anInt2935 = 0;
	static int anInt2936 = -362025917;
	static int anInt2937 = 834881831;
	static boolean aBool2938 = false;
	static Deque aClass105_2939 = new Deque();
	static int anInt2940 = -1491759421;
	static String aString2941 = null;
	static int[] anIntArray2942 = new int[50];
	static int anInt2943 = 0;
	static int[] anIntArray2944 = new int[50];
	static int updateReqCount = 0;
	static int anInt2946 = 0;
	static int[] anIntArray2947 = new int[anInt2797 * -797118177];
	static boolean[] aBoolArray2948 = new boolean[5];
	static boolean aBool2949 = false;
	static int[] anIntArray2950 = new int[5];
	static boolean actionMenuOpen = false;
	static int[] anIntArray2952 = new int[5];
	static int friendListCount = 0;
	static int anInt2954 = 0;
	static Friend[] friendList = new Friend[400];
	static LinkedList aClass102_2956 = new LinkedList();
	static int anInt2957 = 0;
	static Ignore[] ignoreList = new Ignore[400];
	static int mapIconAmt = 0;
	static int anInt2960 = 336140083;
	static int anInt2961 = 723084555;
	static final int anInt2962 = 1007;
	static RSInterface[] aClass108_Sub17Array2963;
	static RGBSprite[] hitmarkSprites;
	public static final int anInt2965 = 91;
	static int[] anIntArray2966;
	static String aString2967 = null;


	protected final void method3201(int var1) {
	}

	public final void init() {
		if (this.method3268(-1976950418)) {
			ClientParameter[] paramters = RSByteBuffer.getClientParameterArray(452864001);

			int var33;
			int var37;
			for (int paramIndex = 0; paramIndex < paramters.length; ++paramIndex) {
				ClientParameter parameter = paramters[paramIndex];
				String paramValue = this.getParameter(parameter.paramIdentifier);
				if (paramValue != null) {
					switch (Integer.parseInt(parameter.paramIdentifier)) {
						case 1:
							if (paramValue.equalsIgnoreCase(Class47.aString664)) {
								aBool2710 = true;
							} else {
								aBool2710 = false;
							}
							break;
						case 2:
							if (paramValue.equalsIgnoreCase(Class47.aString664)) {
								;
							}
							break;
						case 3:
							GameDefinition[] gameDefinitions = Class83.getGameDefinitions((byte) 54);
							var33 = Integer.parseInt(paramValue);
							GameDefinition[] var35 = gameDefinitions;
							var37 = 0;

							GameDefinition var40;
							while (true) {
								if (var37 >= var35.length) {
									var40 = null;
									break;
								}

								GameDefinition var10 = var35[var37];
								if (var33 == var10.method32(-1397647336)) {
									var40 = var10;
									break;
								}

								++var37;
							}

							gameDefinition = (GameDefinition) var40;
							if (gameDefinition == GameDefinition.aClass82_1275) {
								UnderlayDefinition.aClass116_2142 = Class116.aClass116_1479;
							} else {
								UnderlayDefinition.aClass116_2142 = Class116.aClass116_1481;
							}
						case 4:
						default:
							break;
						case 5:
							int var5 = Integer.parseInt(paramValue);
							BuildType[] var6 = AnimationSkeletonSet.method2557((byte) 13);
							int var7 = 0;

							BuildType var9;
							while (true) {
								if (var7 >= var6.length) {
									var9 = null;
									break;
								}

								BuildType var8 = var6[var7];
								if (var8.anInt1235 * 70703173 == var5) {
									var9 = var8;
									break;
								}

								++var7;
							}

							aClass79_2707 = var9;
							break;
						case 6:
							IsaacRandomGen.aString740 = paramValue;
							break;
						case 7:
							worldType = Integer.parseInt(paramValue) * -1175288855;
							break;
						case 8:
							anInt2708 = Integer.parseInt(paramValue) * 812570007;
							break;
						case 9:
							worldID = Integer.parseInt(paramValue) * 985794143;
							break;
						case 10:
							anInt2712 = Integer.parseInt(paramValue) * -637540119;
					}
				}
			}

			GraphicsBuffer.method277(6602165);
			Applet_Sub1.aString2701 = this.getCodeBase().getHost();
			String var24 = aClass79_2707.aString1240;
			byte var25 = 0;

			try {
				Class112.anInt1454 = -1695933232;
				Class108_Sub13.anInt1686 = var25 * 1716101927;

				try {
					Class54.operatingSystem = System.getProperty("os.name");
				} catch (Exception var19) {
					Class54.operatingSystem = "Unknown";
				}

				VertexNormal.lowerOperatingSystem = Class54.operatingSystem.toLowerCase();

				try {
					Class19.cacheDirectory = System.getProperty("user.home");
					if (Class19.cacheDirectory != null) {
						Class19.cacheDirectory = Class19.cacheDirectory + "/";
					}
				} catch (Exception var18) {
					;
				}

				try {
					if (VertexNormal.lowerOperatingSystem.startsWith("win")) {
						if (Class19.cacheDirectory == null) {
							Class19.cacheDirectory = System.getenv("USERPROFILE");
						}
					} else if (null == Class19.cacheDirectory) {
						Class19.cacheDirectory = System.getenv("HOME");
					}

					if (null != Class19.cacheDirectory) {
						Class19.cacheDirectory = Class19.cacheDirectory + "/";
					}
				} catch (Exception var17) {
					;
				}

				if (Class19.cacheDirectory == null) {
					Class19.cacheDirectory = "~/";
				}

				Class63.possibleCacheDirectories = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class19.cacheDirectory, "/tmp/", ""};
				NPC.aStringArray2657 = new String[]{".jagex_cache_" + Class108_Sub13.anInt1686 * 1590926487, ".file_store_" + Class108_Sub13.anInt1686 * 1590926487};
				int indices = 0;

				label275:
				while (indices < 4) {
					String var46 = indices == 0 ? "" : "" + indices;
					CacheConstants.aFile1255 = new File(Class19.cacheDirectory, "jagex_cl_oldschool_" + var24 + var46 + ".dat");
					String var32 = null;
					String var34 = null;
					boolean var36 = false;
					File var44;
					if (CacheConstants.aFile1255.exists()) {
						try {
							CacheFileAccessor var38 = new CacheFileAccessor(CacheConstants.aFile1255, "rw", 10000L);

							int var11;
							RSByteBuffer buffer;
							for (buffer = new RSByteBuffer((int) var38.method1485(1244846249)); buffer.position * 798331555 < buffer.buf.length; buffer.position += var11 * 537964811) {
								var11 = var38.method1488(buffer.buf, buffer.position * 798331555, buffer.buf.length - buffer.position * 798331555, -755217871);
								if (var11 == -1) {
									throw new IOException();
								}
							}

							buffer.position = 0;
							var11 = buffer.readUByte();
							if (var11 < 1 || var11 > 3) {
								throw new IOException("" + var11);
							}

							int var12 = 0;
							if (var11 > 1) {
								var12 = buffer.readUByte();
							}

							if (var11 <= 2) {
								var32 = buffer.getString_1((byte) -105);
								if (var12 == 1) {
									var34 = buffer.getString_1((byte) -90);
								}
							} else {
								var32 = buffer.method1837((short) -11538);
								if (1 == var12) {
									var34 = buffer.method1837((short) -972);
								}
							}

							var38.method1484(-1714244419);
						} catch (IOException var22) {
							var22.printStackTrace();
						}

						if (var32 != null) {
							var44 = new File(var32);
							if (!var44.exists()) {
								var32 = null;
							}
						}

						if (var32 != null) {
							var44 = new File(var32, "test.dat");
							if (!GZIPDecompressor.method670(var44, true, -811107748)) {
								var32 = null;
							}
						}
					}

					if (var32 == null && indices == 0) {
						label240:
						for (var37 = 0; var37 < NPC.aStringArray2657.length; ++var37) {
							for (int var47 = 0; var47 < Class63.possibleCacheDirectories.length; ++var47) {
								File var50 = new File(Class63.possibleCacheDirectories[var47] + NPC.aStringArray2657[var37] + File.separatorChar + "oldschool" + File.separatorChar);
								if (var50.exists() && GZIPDecompressor.method670(new File(var50, "test.dat"), true, -2007474251)) {
									var32 = var50.toString();
									var36 = true;
									break label240;
								}
							}
						}
					}

					if (var32 == null) {
						var32 = Class19.cacheDirectory + File.separatorChar + "jagexcache" + var46 + File.separatorChar + "oldschool" + File.separatorChar + var24 + File.separatorChar;
						var36 = true;
					}

					if (null != var34) {
						File var41 = new File(var34);
						var44 = new File(var32);

						try {
							File[] var51 = var41.listFiles();
							File[] var52 = var51;

							for (int var13 = 0; var13 < var52.length; ++var13) {
								File var14 = var52[var13];
								File var15 = new File(var44, var14.getName());
								boolean var16 = var14.renameTo(var15);
								if (!var16) {
									throw new IOException();
								}
							}
						} catch (Exception var21) {
							var21.printStackTrace();
						}

						var36 = true;
					}

					if (var36) {
						VertexNormal.method693(new File(var32), (File) null, (byte) -33);
					}

					File var28 = new File(var32);
					CacheConstants.aFile1252 = var28;
					System.out.println("paki paki " + CacheConstants.aFile1252 );
					if (!CacheConstants.aFile1252.exists()) {
						CacheConstants.aFile1252.mkdirs();
					}

					File[] var48 = CacheConstants.aFile1252.listFiles();
					if (var48 == null) {
						break;
					}

					File[] var43 = var48;
					var33 = 0;

					while (true) {
						if (var33 >= var43.length) {
							break label275;
						}

						File var39 = var43[var33];
						if (!GZIPDecompressor.method670(var39, false, -1222711523)) {
							++indices;
							break;
						}

						++var33;
					}
				}

				Projectile.method2989(CacheConstants.aFile1252, -1061604907);

				try {
					File var27 = new File(Class19.cacheDirectory, "random.dat");
					int var49;
					if (var27.exists()) {
						CacheConstants.aClass123_1259 = new CacheFile(new CacheFileAccessor(var27, "rw", 25L), 24, 0);
					} else {
						label205:
						for (int var29 = 0; var29 < NPC.aStringArray2657.length; ++var29) {
							for (var49 = 0; var49 < Class63.possibleCacheDirectories.length; ++var49) {
								File var45 = new File(Class63.possibleCacheDirectories[var49] + NPC.aStringArray2657[var29] + File.separatorChar + "random.dat");
								if (var45.exists()) {
									CacheConstants.aClass123_1259 = new CacheFile(new CacheFileAccessor(var45, "rw", 25L), 24, 0);
									break label205;
								}
							}
						}
					}

					if (CacheConstants.aClass123_1259 == null) {
						RandomAccessFile var31 = new RandomAccessFile(var27, "rw");
						var49 = var31.read();
						var31.seek(0L);
						var31.write(var49);
						var31.seek(0L);
						var31.close();
						CacheConstants.aClass123_1259 = new CacheFile(new CacheFileAccessor(var27, "rw", 25L), 24, 0);
						System.out.println("Okay so the dir becomes: "+var27);
					}
				} catch (IOException var20) {
					;
				}

				CacheConstants.cacheDataFile = new CacheFile(new CacheFileAccessor(Timer.method715("main_file_cache.dat2", (byte) 52), "rw", 1048576000L), 5200, 0);
				CacheConstants.cache255File = new CacheFile(new CacheFileAccessor(Timer.method715("main_file_cache.idx255", (byte) 54), "rw", 1048576L), 6000, 0);
				CacheConstants.indexFileArray = new CacheFile[Class112.anInt1454 * -607702267];

				for (indices = 0; indices < Class112.anInt1454 * -607702267; ++indices) {
					CacheConstants.indexFileArray[indices] = new CacheFile(new CacheFileAccessor(Timer.method715("main_file_cache.idx" + indices, (byte) 86), "rw", 1048576L), 6000, 0);
				}
			} catch (Exception var23) {
				World.method647((String) null, var23, 926745782);
			}

			aclient2703 = this;
			this.method3184(765, 503, 60, 912785496);

		}
	}

	protected final void method3196(byte var1) {
		anInt2742 = -186785803 * (anInt2708 * -759629273 == 0 ? '\uaa4a' : '\u9c40' + worldID * 292541855);
		Class26.anInt351 = (anInt2708 * -759629273 == 0 ? 443 : '\uc350' + worldID * 292541855) * 1733308657;
		IndexTable.anInt790 = anInt2742 * 130259471;
		Class88.aShortArray1318 = Class77.aShortArray1208;
		EquipmentKit.aShortArrayArray1338 = Class77.aShortArrayArray1204;
		FriendsChatMember.aShortArray1668 = Class77.aShortArray1205;
		EquipmentKit.aShortArrayArray1337 = Class77.aShortArrayArray1206;
		TextureLoader.method389(-2061255559);
		Canvas canvas = Class1.aCanvas3;
		canvas.setFocusTraversalKeysEnabled(false);
		canvas.addKeyListener(KeyFocusListener.keyFocusListener);
		canvas.addFocusListener(KeyFocusListener.keyFocusListener);
		AnimationDefinition.method2237(Class1.aCanvas3, (byte) 69);
		Class108_Sub6.aClass71_1585 = Class65.method885(851370914);
		if (null != Class108_Sub6.aClass71_1585) {
			Class108_Sub6.aClass71_1585.method986(Class1.aCanvas3, (short) 12587);
		}

		Class36.cache255Index = new IndexTable(255, CacheConstants.cacheDataFile, CacheConstants.cache255File, 500000);
		CacheFileAccessor var3 = null;
		Class37 var4 = new Class37();

		try {
			var3 = Entity.method2730("", gameDefinition.gameName, false, (byte) 73);
			byte[] var5 = new byte[(int) var3.method1485(1833944889)];

			int var7;
			for (int var6 = 0; var6 < var5.length; var6 += var7) {
				var7 = var3.method1488(var5, var6, var5.length - var6, 424013356);
				if (var7 == -1) {
					throw new IOException();
				}
			}

			var4 = new Class37(new RSByteBuffer(var5));
		} catch (Exception var10) {
			;
		}

		try {
			if (var3 != null) {
				var3.method1484(-1662294526);
			}
		} catch (Exception var9) {
			;
		}

		Ignore.aClass37_386 = var4;
		Friend.aClipboard625 = this.getToolkit().getSystemClipboard();
		Class27.method377(this, Class36.aString525, 224845935);
		if (anInt2708 * -759629273 != 0) {
			aBool2721 = true;
		}
	}

	protected final void method3210(int var1) {
		cycle -= 964999917;
		this.method3369(-1971077163);

		while (true) {
			Deque var2 = Class86.aClass105_1300;
			Class108_Sub16 var3;
			synchronized (var2) {
				var3 = (Class108_Sub16) Class86.aClass105_1298.method1337();
			}

			if (null == var3) {
				int var61;
				try {
					if (1 == Class91.anInt1325 * 485824819) {
						var61 = Class32.aClass108_Sub4_Sub3_464.method2691(-564446464);
						if (var61 > 0 && Class32.aClass108_Sub4_Sub3_464.method2611(298463308)) {
							var61 -= ClientScriptDefinition.anInt2281 * 92903455;
							if (var61 < 0) {
								var61 = 0;
							}

							Class32.aClass108_Sub4_Sub3_464.method2637(var61, -1543625330);
						} else {
							Class32.aClass108_Sub4_Sub3_464.method2610(633213551);
							Class32.aClass108_Sub4_Sub3_464.method2608(-2133188087);
							if (RSInterface.aClass74_1889 != null) {
								Class91.anInt1325 = -1543957514;
							} else {
								Class91.anInt1325 = 0;
							}

							Class68.aClass108_Sub23_903 = null;
							Timer.aClass15_724 = null;
						}
					}
				} catch (Exception var59) {
					var59.printStackTrace();
					Class32.aClass108_Sub4_Sub3_464.method2610(873041117);
					Class91.anInt1325 = 0;
					Class68.aClass108_Sub23_903 = null;
					Timer.aClass15_724 = null;
					RSInterface.aClass74_1889 = null;
				}

				Friend.method660(13771755);
				KeyFocusListener var63 = KeyFocusListener.keyFocusListener;
				int var60;
				synchronized (var63) {
					KeyFocusListener.anInt875 -= 1642167017;
					KeyFocusListener.anInt892 = KeyFocusListener.anInt894 * -1600246955;
					KeyFocusListener.anInt897 = 0;
					if (KeyFocusListener.anInt887 * -614955533 < 0) {
						for (var60 = 0; var60 < 112; ++var60) {
							KeyFocusListener.aBoolArray895[var60] = false;
						}

						KeyFocusListener.anInt887 = KeyFocusListener.anInt877 * -392224163;
					} else {
						while (KeyFocusListener.anInt887 * -614955533 != KeyFocusListener.anInt877 * -622858425) {
							var60 = KeyFocusListener.anIntArray885[KeyFocusListener.anInt877 * -622858425];
							KeyFocusListener.anInt877 = (KeyFocusListener.anInt877 * -622858425 + 1 & 127) * 1182337655;
							if (var60 < 0) {
								KeyFocusListener.aBoolArray895[~var60] = false;
							} else {
								if (!KeyFocusListener.aBoolArray895[var60] && KeyFocusListener.anInt897 * 1132688297 < KeyFocusListener.anIntArray890.length - 1) {
									KeyFocusListener.anIntArray890[(KeyFocusListener.anInt897 -= 589504359) * 1132688297 - 1] = var60;
								}

								KeyFocusListener.aBoolArray895[var60] = true;
							}
						}
					}

					KeyFocusListener.anInt894 = KeyFocusListener.anInt871 * 291941007;
				}

				Entity.method2738(1637071795);
				if (null != Class108_Sub6.aClass71_1585) {
					var61 = Class108_Sub6.aClass71_1585.method974(2062591642);
					anInt2902 = var61 * 964402881;
				}

				if (loginLoadingStage * 1315883169 == 0) {
					Class43.method656(-1596001198);
					Class15.method296((byte) 15);
				} else if (loginLoadingStage * 1315883169 == 5) {
					Class108_Sub20_Sub3.method2067(this, -1618587604);
					Class43.method656(-1762580645);
					Class15.method296((byte) -128);
				} else if (10 != loginLoadingStage * 1315883169 && loginLoadingStage * 1315883169 != 11) {
					if (loginLoadingStage * 1315883169 == 20) {
						Class108_Sub20_Sub3.method2067(this, -1254698849);
						LoginHandler.method884(-1857786071);
					} else if (loginLoadingStage * 1315883169 == 25) {
						Class15.loadAndRenderRegion((byte) 3);
					}
				} else {
					Class108_Sub20_Sub3.method2067(this, -966283044);
				}

				if (30 != loginLoadingStage * 1315883169) {
					if (40 != loginLoadingStage * 1315883169 && 45 != loginLoadingStage * 1315883169) {
						return;
					}

					LoginHandler.method884(-456787454);
					return;
				}

				if (anInt2722 * -770885443 > 1) {
					anInt2722 -= 1482064533;
				}

				if (anInt2753 * 1884872449 > 0) {
					anInt2753 -= 48767233;
				}

				if (aBool2719) {
					aBool2719 = false;
					Class7.method180(1862520621);
					return;
				}

				if (!actionMenuOpen) {
					menuActionNamePrefix[0] = StringConstants.CANCEL_OPTION;
					menuActionNames[0] = "";
					menuActionIdentifiers[0] = 1006;
					menuActionRow = -1954561849;
				}

				int mouseXPos;
				String stringValue;
				int value2;
				int var7;
				int verifyIndex;
				int type;
				int var10;
				int variousValue;
				int var17;
				long var27;
				boolean var62;
				int value;
				RSInterface var70;
				RSInterface var74;
				RSInterface var77;
				int var83;
				int nameIndex;
				int var110;
				for (var61 = 0; var61 < 100; ++var61) {
					if (Varp.loginConnection == null) {
						var62 = false;
					} else {
						label2607:
						{
							try {
								mouseXPos = Varp.loginConnection.available();
								if (0 == mouseXPos) {
									var62 = false;
									break label2607;
								}

								if (packetID * -1441472435 == -1) {
									Varp.loginConnection.read(packetBuffer.buf, 0, 1);
									packetBuffer.position = 0;
									packetID = packetBuffer.readPacket(-1684324366) * -859744123;
									anInt2927 = Class104.anIntArray1427[packetID * -1441472435] * 1182625323;
									--mouseXPos;
								}

								if (-1 == anInt2927 * -574496637) {
									if (mouseXPos <= 0) {
										var62 = false;
										break label2607;
									}

									Varp.loginConnection.read(packetBuffer.buf, 0, 1);
									anInt2927 = (packetBuffer.buf[0] & 255) * 1182625323;
									--mouseXPos;
								}

								if (anInt2927 * -574496637 == -2) {
									if (mouseXPos <= 1) {
										var62 = false;
										break label2607;
									}

									Varp.loginConnection.read(packetBuffer.buf, 0, 2);
									packetBuffer.position = 0;
									anInt2927 = packetBuffer.readUShort(1350542105) * 1182625323;
									mouseXPos -= 2;
								}

								if (mouseXPos < anInt2927 * -574496637) {
									var62 = false;
									break label2607;
								}

								packetBuffer.position = 0;
								Varp.loginConnection.read(packetBuffer.buf, 0, anInt2927 * -574496637);
								anInt2918 = 0;
								anInt2756 = anInt2755 * 1878397615;
								anInt2755 = anInt2803 * 423266177;
								anInt2803 = packetID * 1704277785;

								int op = packetID * -1441472435;
								if (op != 246 && op != 129 && op != 105)
									System.out.println("Packet: " + op +", size: " + (anInt2927 * -574496637));

								if (packetID * -1441472435 == 37) {
									InteractableObject.method648('\uff00');
									packetID = 859744123;
									var62 = false;
									break label2607;
								}

								RSInterface var87;
								if (packetID * -1441472435 == 227) {
									value = packetBuffer.readUShort(-904014932);
									value2 = packetBuffer.readUShort(806463055);
									var7 = packetBuffer.readIntLE(-889271225);
									var87 = Class108_Sub16.method1926(var7, -374826599);
									var87.anInt1860 = (value + (value2 << 16)) * -2145726407;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								boolean var98;
								if (207 == packetID * -1441472435) {
									stringValue = packetBuffer.getString_2((byte) 8);
									value2 = packetBuffer.readUShort(-1189537989);
									byte var131 = packetBuffer.readByte();
									var98 = false;
									if (-128 == var131) {
										var98 = true;
									}

									if (var98) {
										if (Class27.anInt363 * 1727166727 == 0) {
											packetID = 859744123;
											var62 = true;
											break label2607;
										}

										boolean var115 = false;

										for (type = 0; type < Class27.anInt363 * 1727166727 && (!Class50.friendsChatList[type].username.equals(stringValue) || value2 != Class50.friendsChatList[type].anInt1663 * -23557543); ++type) {
											;
										}

										if (type < Class27.anInt363 * 1727166727) {
											while (type < Class27.anInt363 * 1727166727 - 1) {
												Class50.friendsChatList[type] = Class50.friendsChatList[type + 1];
												++type;
											}

											Class27.anInt363 -= 436577463;
											Class50.friendsChatList[Class27.anInt363 * 1727166727] = null;
										}
									} else {
										packetBuffer.getString_2((byte) 8);
										FriendsChatMember var121 = new FriendsChatMember();
										var121.username = stringValue;
										var121.aString1670 = Class108_Sub10.method1683(var121.username, UnderlayDefinition.aClass116_2142, -1973363261);
										var121.anInt1663 = value2 * -810672663;
										var121.rank = var131;

										for (var10 = Class27.anInt363 * 1727166727 - 1; var10 >= 0; --var10) {
											var83 = Class50.friendsChatList[var10].aString1670.compareTo(var121.username);
											if (var83 == 0) {
												Class50.friendsChatList[var10].anInt1663 = value2 * -810672663;
												Class50.friendsChatList[var10].rank = var131;
												if (stringValue.equals(Class108_Sub10.myPlayer.playerName)) {
													NPCDefinition.aByte2194 = var131;
												}

												anInt2898 = anInt2731 * -1277595417;
												packetID = 859744123;
												var62 = true;
												break label2607;
											}

											if (var83 < 0) {
												break;
											}
										}

										if (Class27.anInt363 * 1727166727 >= Class50.friendsChatList.length) {
											packetID = 859744123;
											var62 = true;
											break label2607;
										}

										for (var83 = Class27.anInt363 * 1727166727 - 1; var83 > var10; --var83) {
											Class50.friendsChatList[var83 + 1] = Class50.friendsChatList[var83];
										}

										if (Class27.anInt363 * 1727166727 == 0) {
											Class50.friendsChatList = new FriendsChatMember[100];
										}

										Class50.friendsChatList[var10 + 1] = var121;
										Class27.anInt363 += 436577463;
										if (stringValue.equals(Class108_Sub10.myPlayer.playerName)) {
											NPCDefinition.aByte2194 = var131;
										}
									}

									anInt2898 = anInt2731 * -1277595417;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (94 == packetID * -1441472435) {
									aBool2886 = true;
									Varp.anInt2042 = packetBuffer.readUByte() * -1020593141;
									Class23.anInt312 = packetBuffer.readUByte() * 151661741;
									FloorDecoration.anInt288 = packetBuffer.readUShort(-1200394381) * -1132629983;
									Friend.anInt627 = packetBuffer.readUByte() * -555568623;
									FloorDefinition.anInt2223 = packetBuffer.readUByte() * 34594141;
									if (FloorDefinition.anInt2223 * -1608687883 >= 100) {
										BZip2Context.anInt279 = Varp.anInt2042 * 1179406976 + 398378432;
										CacheFileAccessor.anInt1490 = Class23.anInt312 * 2099289984 + 1924850880;
										ClientScript.anInt1645 = (ClientScript.getFloorDrawHeight(BZip2Context.anInt279 * 1217916071, CacheFileAccessor.anInt1490 * 1498802843, VarpBit.plane * -570926309, 931351323) - FloorDecoration.anInt288 * -793898015) * 1023920987;
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								Class108_Sub10 var75;
								if (105 == packetID * -1441472435) {
									value = packetBuffer.readUByte(); // walk
									int interfaceID = packetBuffer.readUShortLEA(); // id
									var7 = packetBuffer.readIntLE(1116046071); //targ
									System.out.printf("Interface: walkable=%d, id=%d, target={%d, %d}%n", value, interfaceID, var7>>16, var7&0xFFFF);
									var75 = (Class108_Sub10) aClass101_2866.get((long) var7);
									if (var75 != null) {
										Class108_Sub10.method1682(var75, interfaceID != var75.anInt1653 * 1557246219, (short) 272);
									}

									Class108_Sub10 var113 = new Class108_Sub10();
									var113.anInt1653 = interfaceID * -385051997;
									var113.anInt1652 = value * 2096413155;
									aClass101_2866.put(var113, (long) var7);
									Class51.method706(interfaceID, -1045871857);
									Class1.method35(interfaceID, 318096228);
									RSInterface var119 = Class108_Sub16.method1926(var7, 1425266031);
									if (null != var119) {
										MouseInputHandler.method775(var119, -16054773);
									}

									if (null != aClass108_Sub17_2869) {
										MouseInputHandler.method775(aClass108_Sub17_2869, -16054773);
										aClass108_Sub17_2869 = null;
									}

									Applet_Sub1.method3282((byte) -50);
									if (openInterfaceID * 1523906617 != -1) {
										var83 = openInterfaceID * 1523906617;
										if (AbstractIndex.method1073(var83, 505201648)) {
											PlainTile.method625(RSInterface.interface_cache[var83], 1, -1128005989);
										}
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								RSPacketBuffer buffer;
								if (packetID * -1441472435 == 162) {
									packetBuffer.position -= 2116854476;
									if (packetBuffer.method1738((byte) 111)) {
										buffer = packetBuffer;
										value2 = packetBuffer.position * 798331555 - 28;
										if (CacheConstants.aClass123_1259 != null) {
											try {
												CacheConstants.aClass123_1259.seekTo(0L);
												CacheConstants.aClass123_1259.write(buffer.buf, value2, 24, 12345678);
											} catch (Exception var48) {
												;
											}
										}
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 223) {
									stringValue = packetBuffer.getString_2((byte) 8);
									Object[] paramArray = new Object[stringValue.length() + 1];

									for (var7 = stringValue.length() - 1; var7 >= 0; --var7) {
										if (stringValue.charAt(var7) == 115) {
											paramArray[1 + var7] = packetBuffer.getString_2((byte) 8);
										} else {
											paramArray[1 + var7] = new Integer(packetBuffer.readInt());
										}
									}

									paramArray[0] = new Integer(packetBuffer.readInt());
									ClientScript var130 = new ClientScript();
									var130.parameters = paramArray;
									GameObject.executeScript(var130, -1758103353);
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 174) {
									value = packetBuffer.readUByte();
									value2 = packetBuffer.readUByte();
									var7 = packetBuffer.readUByte();
									verifyIndex = packetBuffer.readUByte();
									aBoolArray2948[value] = true;
									anIntArray2725[value] = value2;
									anIntArray2950[value] = var7;
									anIntArray2853[value] = verifyIndex;
									anIntArray2952[value] = 0;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (213 == packetID * -1441472435) {
									value = packetBuffer.readInt();
									value2 = packetBuffer.readUShort(-537484861);
									if (value < -70000) {
										value2 += '\u8000';
									}

									if (value >= 0) {
										var70 = Class108_Sub16.method1926(value, 1759189873);
									} else {
										var70 = null;
									}

									for (; packetBuffer.position * 798331555 < anInt2927 * -574496637; Class47.method678(value2, verifyIndex, type - 1, var10, 452718824)) {
										verifyIndex = packetBuffer.readSmart((short) -5874);
										type = packetBuffer.readUShort(-165414905);
										var10 = 0;
										if (0 != type) {
											var10 = packetBuffer.readUByte();
											if (255 == var10) {
												var10 = packetBuffer.readInt();
											}
										}

										if (var70 != null && verifyIndex >= 0 && verifyIndex < var70.widgetItems.length) {
											var70.widgetItems[verifyIndex] = type;
											var70.widgetItemAmounts[verifyIndex] = var10;
										}
									}

									if (var70 != null) {
										MouseInputHandler.method775(var70, -16054773);
									}

									method3554(-1192704029);
									widgetItemUpdateTrigger[(itemUpdateTriggerIndex -= 879805721) * -600491817 - 1 & 31] = value2 & 32767;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								boolean var69;
								if (246 == packetID * -1441472435) { /* Playerupdating */
									gametick++;
									removedCounter = 0;
									updateReqCount = 0;

									packetBuffer.startBitMode();
									int moved = packetBuffer.readBits(1);
									if (0 != moved) {
										int moveType = packetBuffer.readBits(2);
										if (moveType == 0) {
											playersNeedingUpdating[(updateReqCount -= 472402375) * -184592375 - 1] = 2047;
										} else if (moveType == 1) {
											Class108_Sub10.myPlayer.moveInDirection(packetBuffer.readBits(3), false, -548715931);
											if (packetBuffer.readBits(1) == 1) {
												playersNeedingUpdating[(updateReqCount -= 472402375) * -184592375 - 1] = 2047;
											}
										} else if (2 == moveType) {
											Class108_Sub10.myPlayer.moveInDirection(packetBuffer.readBits(3), true, -548715931);
											Class108_Sub10.myPlayer.moveInDirection(packetBuffer.readBits(3), true, -548715931);
											if (1 == packetBuffer.readBits(1)) {
												playersNeedingUpdating[(updateReqCount -= 472402375) * -184592375 - 1] = 2047;
											}
										} else if (moveType == 3) {
											var7 = packetBuffer.readBits(1);
											verifyIndex = packetBuffer.readBits(7);
											VarpBit.plane = packetBuffer.readBits(2) * 1039304467;
											type = packetBuffer.readBits(7);
											var10 = packetBuffer.readBits(1);
											if (var10 == 1) {
												playersNeedingUpdating[(updateReqCount -= 472402375) * -184592375 - 1] = 2047;
											}

											Class108_Sub10.myPlayer.method2720(verifyIndex, type, 1 == var7, 2283744);
										}
									}

									AnimationSkeletonSet.decodeOtherMovement();

									for (Player player; packetBuffer.readableBits(anInt2927 * -574496637) >= 11; player.method2720(Class108_Sub10.myPlayer.anIntArray2391[0] + var10, variousValue + Class108_Sub10.myPlayer.anIntArray2392[0], type == 1, 2018962908)) {
										int index = packetBuffer.readBits(11);
										if (index == 2047) {
											System.out.println("No more add");
											break;
										}
										System.out.println("Adding: " + index);

										var69 = false;
										if (localPlayers[index] == null) {
											localPlayers[index] = new Player();
											if (cachedAppearances[index] != null) {
												localPlayers[index].decodeAppearance(cachedAppearances[index]);
											}

											var69 = true;
										}

										playerIndices[(numLocalPlayers -= 1542815315) * -43742683 - 1] = index;
										player = localPlayers[index];
										player.lastUpdated = cycle * 1761958407;
										verifyIndex = anIntArray2836[packetBuffer.readBits(3)];
										if (var69) {
											player.anInt2354 = (player.anInt2345 = verifyIndex * -1111782119) * 1730540795;
										}

										type = packetBuffer.readBits(1);
										var10 = packetBuffer.readBits(5); //x
										if (var10 > 15) {
											var10 -= 32;
										}

										int needsUpdate = packetBuffer.readBits(1);
										if (needsUpdate == 1) {
											playersNeedingUpdating[(updateReqCount -= 472402375) * -184592375 - 1] = index;
										}

										variousValue = packetBuffer.readBits(5); //y
										if (variousValue > 15) {
											variousValue -= 32;
										}

										System.out.println("Addin player at " + var10 +", " + variousValue + ", update? " + needsUpdate + ", " + verifyIndex);
									}

									packetBuffer.endBitAccess();
									ItemDefinition.method2125();

									for (int idx = 0; idx < removedCounter * 104842469; ++idx) {
										value2 = indicesPendingRemoval[idx];
										if (localPlayers[value2].lastUpdated * 1910816589 != cycle * -637317861) {
											localPlayers[value2] = null;
											System.out.println("removed " + value2);
										}
									}

									if (anInt2927 * -574496637 != packetBuffer.position * 798331555) {
										throw new RuntimeException(packetBuffer.position * 798331555 + Class47.COMMA_LITERAL + anInt2927 * -574496637);
									}

									for (int idx = 0; idx < numLocalPlayers * -43742683; ++idx) {
										if (localPlayers[playerIndices[idx]] == null) {
											throw new RuntimeException(idx + Class47.COMMA_LITERAL + numLocalPlayers * -43742683);
										}
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								String fieldName;
								String var91;
								if (240 == packetID * -1441472435) {
									stringValue = packetBuffer.getString_2((byte) 8);
									RSPacketBuffer var127 = packetBuffer;

									try {
										type = var127.readSmart((short) -18286);
										if (type > 32767) {
											type = 32767;
										}

										byte[] var103 = new byte[type];
										var127.position += Class110.huffmanEncoding.decrypt(var127.buf, var127.position * 798331555, var103, 0, type, -1788362320) * 537964811;
										fieldName = ClientScriptDefinition.method2569(var103, 0, type, (short) -31289);
										var91 = fieldName;
									} catch (Exception var47) {
										var91 = "Cabbage";
									}

									var91 = RSTypeFace.method3093(Class66.method896(var91, (byte) 0));
									AnimationSkeletonSet.pushMessage(6, stringValue, var91, 210566856);
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (221 == packetID * -1441472435) {
									for (value = 0; value < Varp.anInt2045 * -1989920909; ++value) {
										Varp var128 = SpotAnim.method2149(value, (byte) 4);
										if (null != var128) {
											Class88.anIntArray1317[value] = 0;
											Class88.configSettings[value] = 0;
										}
									}

									method3554(-1192704029);
									configTriggerPointer += 110211040;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (141 == packetID * -1441472435) {
									value = packetBuffer.readUShortA();
									value2 = packetBuffer.readInt();
									var70 = Class108_Sub16.method1926(value2, 220496326);
									if (var70.mediaType * -1873872195 != 2 || var70.mediaID * 2030124439 != value) {
										var70.mediaType = -2023579350;
										var70.mediaID = value * 1321013799;
										MouseInputHandler.method775(var70, -16054773);
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 18) {
									anInt2722 = packetBuffer.readUShort(1217919711) * 1512263030;
									anInt2899 = anInt2731 * 1323917881;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 95) {
									stringValue = packetBuffer.getString_2((byte) 8);
									value2 = packetBuffer.readInt();
									var70 = Class108_Sub16.method1926(value2, -669375804);
									if (!stringValue.equals(var70.componentString)) {
										var70.componentString = stringValue;
										MouseInputHandler.method775(var70, -16054773);
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (232 == packetID * -1441472435 || 216 == packetID * -1441472435 || 71 == packetID * -1441472435 || packetID * -1441472435 == 250 || 85 == packetID * -1441472435 || packetID * -1441472435 == 155 || packetID * -1441472435 == 67 || packetID * -1441472435 == 126 || packetID * -1441472435 == 92 || 29 == packetID * -1441472435) {
									Class41.method649((byte) 27);
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (79 == packetID * -1441472435) {
									value = packetBuffer.method1761(-1374722345);
									var74 = Class108_Sub16.method1926(value, -1245020448);

									for (var7 = 0; var7 < var74.widgetItems.length; ++var7) {
										var74.widgetItems[var7] = -1;
										var74.widgetItems[var7] = 0;
									}

									MouseInputHandler.method775(var74, -16054773);
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (202 == packetID * -1441472435) {
									Class47.anInt676 = packetBuffer.readUNegByte((byte) -69) * -302325607;
									GraphicsBuffer.anInt185 = packetBuffer.readUByte() * 2109260397;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (19 == packetID * -1441472435) {
									value = packetBuffer.method1706(179884786);
									Projectile.method2985(value, 283720367);
									widgetItemUpdateTrigger[(itemUpdateTriggerIndex -= 879805721) * -600491817 - 1 & 31] = value & 32767;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								String var71;
								if (154 == packetID * -1441472435) {
									int messageType = packetBuffer.readSmart((short) -6027); //0
									var69 = packetBuffer.readUByte() == 1; //false (filter?)
									var71 = "";
									var98 = false;
									if (var69) {
										var71 = packetBuffer.getString_2((byte) 8); //""
										if (WallDecoration.isOnIgnore(var71, -1031726770)) {
											var98 = true;
										}
									}

									String message = packetBuffer.getString_2((byte) 8); //Msg
									System.out.printf("Korea %d, %b, %s, %s%n", messageType, var69, var71, message);
									if (!var98) {
										AnimationSkeletonSet.pushMessage(messageType, var71, message, -1081283548);
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (167 == packetID * -1441472435) {
									value = packetBuffer.readInt();
									Class108_Sub10 var124 = (Class108_Sub10) aClass101_2866.get((long) value);
									if (var124 != null) {
										Class108_Sub10.method1682(var124, true, (short) 272);
									}

									if (null != aClass108_Sub17_2869) {
										MouseInputHandler.method775(aClass108_Sub17_2869, -16054773);
										aClass108_Sub17_2869 = null;
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (237 == packetID * -1441472435) {
									for (value = 0; value < localPlayers.length; ++value) {
										if (localPlayers[value] != null) {
											localPlayers[value].anInt2368 = 821761185;
										}
									}

									for (value = 0; value < localNPCs.length; ++value) {
										if (null != localNPCs[value]) {
											localNPCs[value].anInt2368 = 821761185;
										}
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 104) {
									anInt2933 = packetBuffer.readUByte() * -18058427;
									if (anInt2933 * -1708054643 == 255) {
										anInt2933 = 0;
									}

									anInt2894 = packetBuffer.readUByte() * 1849977017;
									if (anInt2894 * 943660425 == 255) {
										anInt2894 = 0;
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 44) {
									PlainTile.method624(true, (byte) 19);
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 131) {
									anInt2779 = packetBuffer.readUByte() * -735805791;
									anInt2919 = packetBuffer.readUByte() * -61848581;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								long var13;
								if (55 == packetID * -1441472435) {
									value = packetBuffer.method1761(-1374722345);
									value2 = packetBuffer.method1712(-950052937);
									var7 = packetBuffer.method1706(179884786);
									if (var7 == '\uffff') {
										var7 = -1;
									}

									verifyIndex = packetBuffer.readUShortLEA();
									if ('\uffff' == verifyIndex) {
										verifyIndex = -1;
									}

									for (type = verifyIndex; type <= var7; ++type) {
										var13 = ((long) value2 << 32) + (long) type;
										Node var104 = aClass101_2906.get(var13);
										if (null != var104) {
											var104.unlink();
										}

										aClass101_2906.put(new Class108_Sub19(value), var13);
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								boolean var96;
								boolean isFriend;
								if (packetID * -1441472435 == 11) {
									boolean var122;
									while (packetBuffer.position * 798331555 < anInt2927 * -574496637) {
										var122 = packetBuffer.readUByte() == 1;
										String var117 = packetBuffer.getString_2((byte) 8);
										var71 = packetBuffer.getString_2((byte) 8);
										verifyIndex = packetBuffer.readUShort(1806555917);
										type = packetBuffer.readUByte();
										var10 = packetBuffer.readUByte();
										boolean var94 = (var10 & 2) != 0;
										var96 = (var10 & 1) != 0;
										if (verifyIndex > 0) {
											packetBuffer.getString_2((byte) 8);
											packetBuffer.readUByte();
											packetBuffer.readInt();
										}

										packetBuffer.getString_2((byte) 8);

										for (int friendIndex = 0; friendIndex < friendListCount * -163737695; ++friendIndex) {
											Friend friend = friendList[friendIndex];
											if (!var122) {
												if (var117.equals(friend.username)) {
													if (verifyIndex != friend.friendHash * -62644779) {
														isFriend = true;

														for (OnlineFriend onlineFriends = (OnlineFriend) aClass102_2956.getBack(); null != onlineFriends; onlineFriends = (OnlineFriend) aClass102_2956.getPrevious()) {
															if (onlineFriends.username.equals(var117)) {
																if (verifyIndex != 0 && 0 == onlineFriends.status) {
																	onlineFriends.remove();
																	isFriend = false;
																} else if (0 == verifyIndex && onlineFriends.status != 0) {
																	onlineFriends.remove();
																	isFriend = false;
																}
															}
														}

														if (isFriend) {
															aClass102_2956.insertBack(new OnlineFriend(var117, verifyIndex));
														}

														friend.friendHash = verifyIndex * 1201419133;
													}

													friend.aString621 = var71;
													friend.anInt623 = type * -1258673293;
													friend.aBool624 = var94;
													friend.aBool622 = var96;
													var117 = null;
													break;
												}
											} else if (var71.equals(friend.username)) {
												friend.username = var117;
												friend.aString621 = var71;
												var117 = null;
												break;
											}
										}

										if (null != var117 && friendListCount * -163737695 < 400) {
											Friend friend = new Friend();
											friendList[friendListCount * -163737695] = friend;
											friend.username = var117;
											friend.aString621 = var71;
											friend.friendHash = verifyIndex * 1201419133;
											friend.anInt623 = type * -1258673293;
											friend.aBool624 = var94;
											friend.aBool622 = var96;
											friendListCount += 1056183393;
										}
									}

									anInt2954 = -2039953166;
									anInt2897 = anInt2731 * 1946037095;
									var122 = false;
									value2 = friendListCount * -163737695;

									while (value2 > 0) {
										var122 = true;
										--value2;

										for (var7 = 0; var7 < value2; ++var7) {
											var98 = false;
											Friend var90 = friendList[var7];
											Friend var101 = friendList[1 + var7];
											if (worldID * 292541855 != var90.friendHash * -62644779 && worldID * 292541855 == var101.friendHash * -62644779) {
												var98 = true;
											}

											if (!var98 && 0 == var90.friendHash * -62644779 && 0 != var101.friendHash * -62644779) {
												var98 = true;
											}

											if (!var98 && !var90.aBool624 && var101.aBool624) {
												var98 = true;
											}

											if (!var98 && !var90.aBool622 && var101.aBool622) {
												var98 = true;
											}

											if (var98) {
												Friend var99 = friendList[var7];
												friendList[var7] = friendList[var7 + 1];
												friendList[1 + var7] = var99;
												var122 = false;
											}
										}

										if (var122) {
											break;
										}
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (205 == packetID * -1441472435) {
									method3554(-1192704029);
									int a;
									anInt2871 = (a= packetBuffer.method1721(1261795816)) * -467330501;
									System.out.println("Pane: " + a);
									anInt2899 = anInt2731 * 1323917881;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 15) {
									Class47.anInt676 = packetBuffer.readUByte() * -302325607;
									GraphicsBuffer.anInt185 = packetBuffer.method1742(-1494849731) * 2109260397;

									while (packetBuffer.position * 798331555 < anInt2927 * -574496637) {
										packetID = packetBuffer.readUByte() * -859744123;
										Class41.method649((byte) 115);
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 116) {
									while (packetBuffer.position * 798331555 < anInt2927 * -574496637) {
										value = packetBuffer.readUByte();
										var69 = 1 == (value & 1);
										var71 = packetBuffer.getString_2((byte) 8);
										var91 = packetBuffer.getString_2((byte) 8);
										packetBuffer.getString_2((byte) 8);

										for (type = 0; type < ignoreListCount * -1283681697; ++type) {
											Ignore var95 = ignoreList[type];
											if (var69) {
												if (var91.equals(var95.username)) {
													var95.username = var71;
													var95.aString387 = var91;
													var71 = null;
													break;
												}
											} else if (var71.equals(var95.username)) {
												var95.username = var71;
												var95.aString387 = var91;
												var71 = null;
												break;
											}
										}

										if (null != var71 && ignoreListCount * -1283681697 < 400) {
											Ignore var88 = new Ignore();
											ignoreList[ignoreListCount * -1283681697] = var88;
											var88.username = var71;
											var88.aString387 = var91;
											ignoreListCount -= 224638561;
										}
									}

									anInt2897 = anInt2731 * 1946037095;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (134 == packetID * -1441472435) {
									anInt2935 = packetBuffer.readUByte() * 62859869;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								long var21;
								long var23;
								if (219 == packetID * -1441472435) {
									anInt2898 = anInt2731 * -1277595417;
									if (anInt2927 * -574496637 == 0) {
										aString2967 = null;
										aString2934 = null;
										Class27.anInt363 = 0;
										Class50.friendsChatList = null;
										packetID = 859744123;
										var62 = true;
									} else {
										aString2934 = packetBuffer.getString_2((byte) 8);
										long var19 = packetBuffer.method1724(-1704626137);
										var21 = var19;
										if (var19 > 0L && var19 < 6582952005840035281L) {
											if (0L == var19 % 37L) {
												var71 = null;
											} else {
												var10 = 0;

												for (var23 = var19; 0L != var23; var23 /= 37L) {
													++var10;
												}

												StringBuilder var107 = new StringBuilder(var10);

												while (0L != var21) {
													long var25 = var21;
													var21 /= 37L;
													var107.append(Class112.aCharArray1455[(int) (var25 - 37L * var21)]);
												}

												var71 = var107.reverse().toString();
											}
										} else {
											var71 = null;
										}

										aString2967 = var71;
										Class16.aByte207 = packetBuffer.readByte();
										var10 = packetBuffer.readUByte();
										if (var10 == 255) {
											packetID = 859744123;
											var62 = true;
										} else {
											Class27.anInt363 = var10 * 436577463;
											FriendsChatMember[] var92 = new FriendsChatMember[100];

											for (variousValue = 0; variousValue < Class27.anInt363 * 1727166727; ++variousValue) {
												var92[variousValue] = new FriendsChatMember();
												var92[variousValue].username = packetBuffer.getString_2((byte) 8);
												var92[variousValue].aString1670 = Class108_Sub10.method1683(var92[variousValue].username, UnderlayDefinition.aClass116_2142, -1909536491);
												var92[variousValue].anInt1663 = packetBuffer.readUShort(1322436717) * -810672663;
												var92[variousValue].rank = packetBuffer.readByte();
												packetBuffer.getString_2((byte) 8);
												if (var92[variousValue].username.equals(Class108_Sub10.myPlayer.playerName)) {
													NPCDefinition.aByte2194 = var92[variousValue].rank;
												}
											}

											var96 = false;
											nameIndex = Class27.anInt363 * 1727166727;

											while (nameIndex > 0) {
												var96 = true;
												--nameIndex;

												for (var17 = 0; var17 < nameIndex; ++var17) {
													if (var92[var17].aString1670.compareTo(var92[var17 + 1].aString1670) > 0) {
														FriendsChatMember var108 = var92[var17];
														var92[var17] = var92[1 + var17];
														var92[1 + var17] = var108;
														var96 = false;
													}
												}

												if (var96) {
													break;
												}
											}

											Class50.friendsChatList = var92;
											packetID = 859744123;
											var62 = true;
										}
									}
									break label2607;
								}

								if (packetID * -1441472435 == 129) {
									Class19.method334(1645145714);
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								long var29;
								int methodDataIndex;
								if (138 == packetID * -1441472435) {
									stringValue = packetBuffer.getString_2((byte) 8);
									var27 = packetBuffer.method1724(-1902581369);
									var21 = (long) packetBuffer.readUShort(-1614098475);
									var13 = (long) packetBuffer.method1809(-237252370);
									variousValue = packetBuffer.readUByte();
									long friendHash = var13 + (var21 << 32);
									isFriend = false;

									for (methodDataIndex = 0; methodDataIndex < 100; ++methodDataIndex) {
										if (friendListHash[methodDataIndex] == friendHash) {
											isFriend = true;
											break;
										}
									}

									if (variousValue <= 1 && WallDecoration.isOnIgnore(stringValue, -1722969014)) {
										isFriend = true;
									}

									if (!isFriend && 0 == anInt2822 * -526472263) {
										friendListHash[anInt2921 * -1435346889] = friendHash;
										anInt2921 = (1 + anInt2921 * -1435346889) % 100 * 1993661831;
										RSPacketBuffer var144 = packetBuffer;

										String var149;
										try {
											int var142 = var144.readSmart((short) 3639);
											if (var142 > 32767) {
												var142 = 32767;
											}

											byte[] var146 = new byte[var142];
											var144.position += Class110.huffmanEncoding.decrypt(var144.buf, var144.position * 798331555, var146, 0, var142, -1610411650) * 537964811;
											String var147 = ClientScriptDefinition.method2569(var146, 0, var142, (short) 3766);
											var149 = var147;
										} catch (Exception var46) {
											var149 = "Cabbage";
										}

										var149 = RSTypeFace.method3093(Class66.method896(var149, (byte) 0));
										if (2 != variousValue && 3 != variousValue) {
											if (variousValue == 1) {
												FloorDefinition.pushDirectMessage(9, Class108_Sub16.getIconTag(0, 480603646) + stringValue, var149, ClientScript.method1680(var27), 403249369);
											} else {
												FloorDefinition.pushDirectMessage(9, stringValue, var149, ClientScript.method1680(var27), 403249369);
											}
										} else {
											FloorDefinition.pushDirectMessage(9, Class108_Sub16.getIconTag(1, 480603646) + stringValue, var149, ClientScript.method1680(var27), 403249369);
										}
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 87) {
									value = packetBuffer.method1761(-1374722345);
									value2 = packetBuffer.method1721(-819637888);
									var70 = Class108_Sub16.method1926(value, -1251772095);
									if (value2 != var70.mediaAnimID * 866704807 || value2 == -1) {
										var70.mediaAnimID = value2 * 596245015;
										var70.anInt1877 = 0;
										var70.anInt1805 = 0;
										MouseInputHandler.method775(var70, -16054773);
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 139) {
									value = packetBuffer.method1761(-1374722345);
									value2 = packetBuffer.method1706(179884786);
									var70 = Class108_Sub16.method1926(value, 253641314);
									if (null != var70 && 0 == var70.componentType * 942877543) {
										if (value2 > var70.anInt1787 * -1108406155 - var70.width * 334099177) {
											value2 = var70.anInt1787 * -1108406155 - var70.width * 334099177;
										}

										if (value2 < 0) {
											value2 = 0;
										}

										if (var70.anInt1785 * -643576081 != value2) {
											var70.anInt1785 = value2 * -1291378673;
											MouseInputHandler.method775(var70, -16054773);
										}
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 121) {
									method3554(-1192704029);
									int skillID = packetBuffer.readUByte(); //id
									int level = packetBuffer.readUByte(); //lv
									var7 = packetBuffer.readIntLE(483019546);
									skillXPs[skillID] = var7;
									skillLevels[skillID] = level;
									anIntArray2843[skillID] = 1;

									for (verifyIndex = 0; verifyIndex < 98; ++verifyIndex) {
										if (var7 >= Class84.anIntArray1284[verifyIndex]) {
											anIntArray2843[skillID] = verifyIndex + 2;
										}
									}

									skillChangedTrigger[(skillChangeIndex += 588560861) * 642606709 - 1 & 31] = skillID;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (206 == packetID * -1441472435) {
									method3554(-1192704029);
									anInt2870 = packetBuffer.readUByte() * 1207842283;
									anInt2899 = anInt2731 * 1323917881;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 81) {
									value = packetBuffer.readUShortA();
									if (value == '\uffff') {
										value = -1;
									}

									if (value == -1 && !aBool2938) {
										Class32.aClass108_Sub4_Sub3_464.method2610(890308267);
										Class91.anInt1325 = -771978757;
										RSInterface.aClass74_1889 = null;
									} else if (-1 != value && anInt2937 * 111831401 != value && anInt2873 * 99489839 != 0 && !aBool2938) {
										CacheIndex var102 = Friend.musicIndex_1;
										var7 = anInt2873 * 99489839;
										Class91.anInt1325 = -771978757;
										RSInterface.aClass74_1889 = var102;
										Class91.anInt1329 = value * -2020957493;
										OnlineFriend.anInt1511 = 0;
										Class27.anInt362 = var7 * 495527089;
										FriendsChatMember.aBool1669 = false;
										ClientScriptDefinition.anInt2281 = -1589655618;
									}

									anInt2937 = value * -834881831;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (77 == packetID * -1441472435) {
									value = packetBuffer.method1809(-485743865);
									value2 = packetBuffer.readUShort(-1647686176);
									if (value2 == '\uffff') {
										value2 = -1;
									}

									Timer.method722(value2, value, 189189435);
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (51 == packetID * -1441472435) {
									value = packetBuffer.readUShortA();
									if (value == '\uffff') {
										value = -1;
									}

									value2 = packetBuffer.method1712(-950052937);
									var7 = packetBuffer.readIntLE(-1461272674);
									var87 = Class108_Sub16.method1926(value2, 1113764515);
									ItemDefinition itemDef;
									if (!var87.aBool1855) {
										if (value == -1) {
											var87.mediaType = 0;
											packetID = 859744123;
											var62 = true;
											break label2607;
										}

										itemDef = AnimationDefinition.getItemDefinition(value, -66621041);
										var87.mediaType = 247808596;
										var87.mediaID = value * 1321013799;
										var87.mediaRotationX = itemDef.xan2d * 547018395;
										var87.mediaRotationY = itemDef.yan2d * -1292543953;
										var87.mediaZoom = itemDef.zoom2d * 830475156 / var7 * -977233777;
										MouseInputHandler.method775(var87, -16054773);
									} else {
										var87.itemID = value * 199268639;
										var87.anInt1775 = var7 * -154849603;
										itemDef = AnimationDefinition.getItemDefinition(value, -649138297);
										var87.mediaRotationX = itemDef.xan2d * 547018395;
										var87.mediaRotationY = itemDef.yan2d * -1292543953;
										var87.anInt1813 = itemDef.zan2d * 2079954531;
										var87.anInt1809 = itemDef.xOffset2d * 212469115;
										var87.anInt1810 = itemDef.yOffset2d * 1627709775;
										var87.mediaZoom = itemDef.zoom2d * 1514043043;
										if (var87.height * -1281443035 > 0) {
											var87.mediaZoom = var87.mediaZoom * -172962336 / (var87.height * -1281443035) * -977233777;
										}

										MouseInputHandler.method775(var87, -16054773);
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (132 == packetID * -1441472435) {
									value = packetBuffer.method1721(-2045262082);
									value2 = packetBuffer.method1761(-1374722345);
									var7 = packetBuffer.method1754(1706353922);
									var87 = Class108_Sub16.method1926(value2, -849506061);
									type = var7 + var87.anInt1778 * -972219391;
									var10 = var87.anInt1779 * -1482275397 + value;
									if (var87.anInt1776 * 985647797 != type || var87.anInt1824 * 1730176157 != var10) {
										var87.anInt1776 = type * 604525469;
										var87.anInt1824 = var10 * -1129233995;
										MouseInputHandler.method775(var87, -16054773);
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 76) { // config packet
									value = packetBuffer.readIntLE(2100646518);
									value2 = packetBuffer.readUShortLEA();
									Class88.anIntArray1317[value2] = value;
									if (value != Class88.configSettings[value2]) {
										Class88.configSettings[value2] = value;
										CacheConstants.method1097(value2, (byte) -59);
									} 

									configChangeTrigger[(configTriggerPointer -= 1607168641) * -1993002369 - 1 & 31] = value2; // last config?
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								int methodNameIndex;
							if (153 == packetID * -1441472435) {
								buffer = packetBuffer;
								value2 = anInt2927 * -574496637; 
								ClientVerifier verifier = new ClientVerifier();
								verifier.verifyCount = buffer.readUByte() * 1356469345;
								verifier.anInt1932 = buffer.readInt() * 298843483;
								verifier.type = new int[verifier.verifyCount * 953651105];
								verifier.errorIdentifiers = new int[verifier.verifyCount * 953651105];
								verifier.clientFields = new Field[verifier.verifyCount * 953651105];
								verifier.fieldValues = new int[verifier.verifyCount * 953651105];
								verifier.clientMethods = new Method[verifier.verifyCount * 953651105];
								verifier.methodByteArray = new byte[verifier.verifyCount * 953651105][][];

								for (verifyIndex = 0; verifyIndex < verifier.verifyCount * 953651105; ++verifyIndex) {
									try {
										type = buffer.readUByte(); // opcode
										String className;
										if (0 != type && 1 != type && type != 2) {
											if (type == 3 || type == 4) {
												className = buffer.getString_2((byte) 8);
												fieldName = buffer.getString_2((byte) 8);
												variousValue = buffer.readUByte();
												String[] methodNames = new String[variousValue];

												for (nameIndex = 0; nameIndex < variousValue; ++nameIndex) {
													methodNames[nameIndex] = buffer.getString_2((byte) 8);
												}


												String returnType = buffer.getString_2((byte) 8);
												byte[][] methodData = new byte[variousValue][];
												if (3 == type) {
													for (methodDataIndex = 0; methodDataIndex < variousValue; ++methodDataIndex) {
														methodNameIndex = buffer.readInt();
														methodData[methodDataIndex] = new byte[methodNameIndex];
														buffer.readBytes(methodData[methodDataIndex], 0, methodNameIndex, 1391369441);
													}
												}

												verifier.type[verifyIndex] = type;
												Class[] methodParameters = new Class[variousValue];

												for (methodNameIndex = 0; methodNameIndex < variousValue; ++methodNameIndex) {
													methodParameters[methodNameIndex] = Class108_Sub16.resolveType(methodNames[methodNameIndex], (byte) 1);
												}

												Class methodReturnType = Class108_Sub16.resolveType(returnType, (byte) 1);
												if (Class108_Sub16.resolveType(className, (byte) 1).getClassLoader() == null) {
													throw new SecurityException();
												}

												Method[] classMethods_0 = Class108_Sub16.resolveType(className, (byte) 1).getDeclaredMethods();
												Method[] classMethods = classMethods_0;

												for (int methodIndex = 0; methodIndex < classMethods.length; ++methodIndex) {
													Method method = classMethods[methodIndex];
													if (method.getName().equals(fieldName)) {
														Class[] parameters = method.getParameterTypes();
														if (parameters.length == methodParameters.length) {
															boolean hasCorrectParemeters = true;

															for (int paramIndex = 0; paramIndex < methodParameters.length; ++paramIndex) {
																if (methodParameters[paramIndex] != parameters[paramIndex]) {
																	hasCorrectParemeters = false;
																	break;
																}
															}

															if (hasCorrectParemeters && methodReturnType == method.getReturnType()) {
																verifier.clientMethods[verifyIndex] = method;
															}
														}
													}
												}

												verifier.methodByteArray[verifyIndex] = methodData;
											}
										} else {
											className = buffer.getString_2((byte) 8);
											fieldName = buffer.getString_2((byte) 8);
											variousValue = 0;
											if (1 == type) {
												variousValue = buffer.readInt();
											}

											verifier.type[verifyIndex] = type;
											verifier.fieldValues[verifyIndex] = variousValue;
											if (Class108_Sub16.resolveType(className, (byte) 1).getClassLoader() == null) {
												throw new SecurityException();
											}

											verifier.clientFields[verifyIndex] = Class108_Sub16.resolveType(className, (byte) 1).getDeclaredField(fieldName);
										}
									} catch (ClassNotFoundException var51) { // for this index, we specify which type of exception was caught
										verifier.errorIdentifiers[verifyIndex] = -1;
									} catch (SecurityException var52) {
										verifier.errorIdentifiers[verifyIndex] = -2;
									} catch (NullPointerException var53) {
										verifier.errorIdentifiers[verifyIndex] = -3;
									} catch (Exception var54) {
										verifier.errorIdentifiers[verifyIndex] = -4;
									} catch (Throwable var55) {
										verifier.errorIdentifiers[verifyIndex] = -5;
									}
								}

								Class109.aClass92_1447.method1153(verifier);
								packetID = 859744123;
								var62 = true;
								break label2607;
							}

								if (163 == packetID * -1441472435) {
									anInt2954 = -1019976583;
									anInt2897 = anInt2731 * 1946037095;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (226 == packetID * -1441472435) {
									value = packetBuffer.readUShortLEA();
									System.out.println("Pane? " + value);
									openInterfaceID = value * 1256289801;
									Class51.method706(value, -1045871857);
									Class1.method35(openInterfaceID * 1523906617, 461752816);

									for (value2 = 0; value2 < 100; ++value2) {
										aBoolArray2909[value2] = true;
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (165 == packetID * -1441472435) {
									aBool2886 = true;
									Entity.anInt2398 = packetBuffer.readUByte() * 512741787;
									Class9.anInt128 = packetBuffer.readUByte() * -914974711;
									Class50.anInt696 = packetBuffer.readUShort(-2079194678) * -2145885881;
									ClientScriptMap.anInt2063 = packetBuffer.readUByte() * 1761392501;
									GraphicsBuffer.anInt183 = packetBuffer.readUByte() * -1561355069;
									if (GraphicsBuffer.anInt183 * 1726673899 >= 100) {
										value = Entity.anInt2398 * 907430272 + 64;
										value2 = Class9.anInt128 * -1304748928 + 64;
										var7 = ClientScript.getFloorDrawHeight(value, value2, VarpBit.plane * -570926309, 1357498499) - Class50.anInt696 * 1025702007;
										verifyIndex = value - BZip2Context.anInt279 * 1217916071;
										type = var7 - ClientScript.anInt1645 * 699100371;
										var10 = value2 - CacheFileAccessor.anInt1490 * 1498802843;
										var83 = (int) Math.sqrt((double) (var10 * var10 + verifyIndex * verifyIndex));
										RuntimeException_Sub1.anInt2625 = ((int) (Math.atan2((double) type, (double) var83) * 325.949D) & 2047) * -1558852331;
										GameConnection.anInt811 = ((int) (Math.atan2((double) verifyIndex, (double) var10) * -325.949D) & 2047) * -422753419;
										if (RuntimeException_Sub1.anInt2625 * -611182019 < 128) {
											RuntimeException_Sub1.anInt2625 = -1964602752;
										}

										if (RuntimeException_Sub1.anInt2625 * -611182019 > 383) {
											RuntimeException_Sub1.anInt2625 = -39988629;
										}
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 17) {
									value = packetBuffer.readUShortLEA();
									value2 = packetBuffer.method1712(-950052937);
									var7 = packetBuffer.readUShort(1256165519);
									verifyIndex = packetBuffer.readUShortA();
									var77 = Class108_Sub16.method1926(value2, -1098232928);
									if (var7 != var77.mediaRotationX * -272801613 || verifyIndex != var77.mediaRotationY * 260082763 || var77.mediaZoom * -1750235537 != value) {
										var77.mediaRotationX = var7 * 1598312059;
										var77.mediaRotationY = verifyIndex * 40361315;
										var77.mediaZoom = value * -977233777;
										MouseInputHandler.method775(var77, -16054773);
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (143 == packetID * -1441472435) {
									stringValue = packetBuffer.getString_2((byte) 8);
									var27 = (long) packetBuffer.readUShort(-1058925241);
									var21 = (long) packetBuffer.method1809(-547072561);
									var10 = packetBuffer.readUByte();
									var23 = var21 + (var27 << 32);
									boolean var100 = false;

									for (nameIndex = 0; nameIndex < 100; ++nameIndex) {
										if (friendListHash[nameIndex] == var23) {
											var100 = true;
											break;
										}
									}

									if (WallDecoration.isOnIgnore(stringValue, -722235874)) {
										var100 = true;
									}

									if (!var100 && anInt2822 * -526472263 == 0) {
										friendListHash[anInt2921 * -1435346889] = var23;
										anInt2921 = (1 + anInt2921 * -1435346889) % 100 * 1993661831;
										RSPacketBuffer var109 = packetBuffer;

										String var18;
										try {
											methodNameIndex = var109.readSmart((short) -22376);
											if (methodNameIndex > 32767) {
												methodNameIndex = 32767;
											}

											byte[] var35 = new byte[methodNameIndex];
											var109.position += Class110.huffmanEncoding.decrypt(var109.buf, var109.position * 798331555, var35, 0, methodNameIndex, -1458649550) * 537964811;
											String var32 = ClientScriptDefinition.method2569(var35, 0, methodNameIndex, (short) 22002);
											var18 = var32;
										} catch (Exception var45) {
											var18 = "Cabbage";
										}

										var18 = RSTypeFace.method3093(Class66.method896(var18, (byte) 0));
										if (var10 != 2 && var10 != 3) {
											if (var10 == 1) {
												AnimationSkeletonSet.pushMessage(7, Class108_Sub16.getIconTag(0, 480603646) + stringValue, var18, -568108351);
											} else {
												AnimationSkeletonSet.pushMessage(3, stringValue, var18, -508835604);
											}
										} else {
											AnimationSkeletonSet.pushMessage(7, Class108_Sub16.getIconTag(1, 480603646) + stringValue, var18, 465625599);
										}
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (158 == packetID * -1441472435) {
									World var85 = new World();
									var85.aString561 = packetBuffer.getString_2((byte) 8);
									var85.anInt569 = packetBuffer.readUShort(719155465) * -762909535;
									value2 = packetBuffer.readInt();
									var85.anInt558 = value2 * 694562061;
									IsaacRandomGen.method725(45, 1392851632);
									Varp.loginConnection.disconnect();
									Varp.loginConnection = null;
									Class5.method103(var85, -354343931);
									packetID = 859744123;
									var62 = false;
									break label2607;
								}

								if (60 == packetID * -1441472435) {
									value = packetBuffer.readUShortA();
									byte var78 = packetBuffer.method1759(-701341629);
									Class88.anIntArray1317[value] = var78;
									if (var78 != Class88.configSettings[value]) {
										Class88.configSettings[value] = var78;
										CacheConstants.method1097(value, (byte) -113);
									}

									configChangeTrigger[(configTriggerPointer -= 1607168641) * -1993002369 - 1 & 31] = value;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (171 == packetID * -1441472435) {
									value2 = packetBuffer.readUByte();
									Class65[] var79 = Class100.method1299((short) 7339);
									verifyIndex = 0;

									Class65 var80;
									while (true) {
										if (verifyIndex >= var79.length) {
											var80 = null;
											break;
										}

										Class65 var76 = var79[verifyIndex];
										if (value2 == var76.anInt852 * 1024616147) {
											var80 = var76;
											break;
										}

										++verifyIndex;
									}

									Ignore.aClass65_389 = var80;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 120) {
									value = packetBuffer.readInt();
									aClass85_2732 = ClientScriptMap.pringRequester.method821(value, 124248993);
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 68) {
									aBool2886 = false;

									for (value = 0; value < 5; ++value) {
										aBoolArray2948[value] = false;
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (30 == packetID * -1441472435) {
									value = packetBuffer.method1742(-1494849731);
									value2 = packetBuffer.method1751((byte) 113);
									var7 = packetBuffer.method1742(-1494849731);
									VarpBit.plane = (var7 >> 1) * 1039304467;
									Class108_Sub10.myPlayer.method2720(value2, value, 1 == (var7 & 1), 1440687296);
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (235 == packetID * -1441472435) {
									value = packetBuffer.readInt();
									value2 = packetBuffer.readUShort(460630366);
									if (value < -70000) {
										value2 += '\u8000';
									}

									if (value >= 0) {
										var70 = Class108_Sub16.method1926(value, -1072583640);
									} else {
										var70 = null;
									}

									if (null != var70) {
										for (verifyIndex = 0; verifyIndex < var70.widgetItems.length; ++verifyIndex) {
											var70.widgetItems[verifyIndex] = 0;
											var70.widgetItemAmounts[verifyIndex] = 0;
										}
									}

									Class19.method336(value2, -777096829);
									verifyIndex = packetBuffer.readUShort(1628113248);

									for (type = 0; type < verifyIndex; ++type) {
										var10 = packetBuffer.readUByte();
										if (255 == var10) {
											var10 = packetBuffer.readInt();
										}

										var83 = packetBuffer.readUShortLEA();
										if (var70 != null && type < var70.widgetItems.length) {
											var70.widgetItems[type] = var83;
											var70.widgetItemAmounts[type] = var10;
										}

										Class47.method678(value2, type, var83 - 1, var10, -1552560232);
									}

									if (var70 != null) {
										MouseInputHandler.method775(var70, -16054773);
									}

									method3554(-1192704029);
									widgetItemUpdateTrigger[(itemUpdateTriggerIndex -= 879805721) * -600491817 - 1 & 31] = value2 & 32767;
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 50) {
									anInt2723 = packetBuffer.readUByte() * -1275477453;
									if (1 == anInt2723 * -927004421) {
										anInt2724 = packetBuffer.readUShort(2048272053) * 869142381;
									}

									if (anInt2723 * -927004421 >= 2 && anInt2723 * -927004421 <= 6) {
										if (anInt2723 * -927004421 == 2) {
											anInt2729 = -819093440;
											anInt2832 = -1526251584;
										}

										if (anInt2723 * -927004421 == 3) {
											anInt2729 = 0;
											anInt2832 = -1526251584;
										}

										if (anInt2723 * -927004421 == 4) {
											anInt2729 = -1638186880;
											anInt2832 = -1526251584;
										}

										if (5 == anInt2723 * -927004421) {
											anInt2729 = -819093440;
											anInt2832 = 0;
										}

										if (6 == anInt2723 * -927004421) {
											anInt2729 = -819093440;
											anInt2832 = 1242464128;
										}

										anInt2723 = 1744012390;
										anInt2726 = packetBuffer.readUShort(371433594) * -1829012027;
										anInt2727 = packetBuffer.readUShort(492415817) * -34656095;
										anInt2728 = packetBuffer.readUByte() * 360291891;
									}

									if (10 == anInt2723 * -927004421) {
										anInt2795 = packetBuffer.readUShort(-1546091931) * -862768787;
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 142) {
									for (value = 0; value < Class88.configSettings.length; ++value) {
										if (Class88.configSettings[value] != Class88.anIntArray1317[value]) {
											Class88.configSettings[value] = Class88.anIntArray1317[value];
											CacheConstants.method1097(value, (byte) -92);
											configChangeTrigger[(configTriggerPointer -= 1607168641) * -1993002369 - 1 & 31] = value;
										}
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 136) {
									value = packetBuffer.readUShort(-389160118);
									value2 = packetBuffer.readUByte();
									var7 = packetBuffer.readUShort(91622819);
									if (0 != anInt2812 * -24031449 && value2 != 0 && anInt2895 * 348809069 < 50) {
										anIntArray2942[anInt2895 * 348809069] = value;
										anIntArray2757[anInt2895 * 348809069] = value2;
										anIntArray2944[anInt2895 * 348809069] = var7;
										aClass6Array2741[anInt2895 * 348809069] = null;
										anIntArray2704[anInt2895 * 348809069] = 0;
										anInt2895 -= 1862223259;
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (238 == packetID * -1441472435) {
									PlainTile.method624(false, (byte) 101);
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (222 == packetID * -1441472435) {
									if (-1 != openInterfaceID * 1523906617) {
										LoginHandler.method882(openInterfaceID * 1523906617, 0, (byte) -15);
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 145) {
									value = packetBuffer.method1761(-1374722345);
									var74 = Class108_Sub16.method1926(value, 1494197927);
									var74.mediaType = 1259598271;
									var74.mediaID = Class108_Sub10.myPlayer.bodyEquipmentKit.method1168(-167707527) * 1321013799;
									MouseInputHandler.method775(var74, -16054773);
									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 231) {
									value = packetBuffer.readUByte();
									value2 = packetBuffer.method1742(-1494849731);
									var71 = packetBuffer.getString_2((byte) 8);
									if (value2 >= 1 && value2 <= 8) {
										if (var71.equalsIgnoreCase("null")) {
											var71 = null;
										}

										aStringArray2834[value2 - 1] = var71;
										aBoolArray2835[value2 - 1] = 0 == value;
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (packetID * -1441472435 == 20) {
									value = packetBuffer.method1706(179884786);
									value2 = packetBuffer.method1761(-1374722345);
									var7 = value >> 10 & 31;
									verifyIndex = value >> 5 & 31;
									type = value & 31;
									var10 = (verifyIndex << 11) + (var7 << 19) + (type << 3);
									RSInterface var86 = Class108_Sub16.method1926(value2, -1089476933);
									if (var10 != var86.componentColor * -1484361639) {
										var86.componentColor = var10 * 1601296361;
										MouseInputHandler.method775(var86, -16054773);
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (96 == packetID * -1441472435) {
									value = packetBuffer.method1761(-1374722345);
									value2 = packetBuffer.readUShortLEA();
									var70 = Class108_Sub16.method1926(value, -1017922766);
									if (var70.mediaType * -1873872195 != 1 || value2 != var70.mediaID * 2030124439) {
										var70.mediaType = -1011789675;
										var70.mediaID = value2 * 1321013799;
										MouseInputHandler.method775(var70, -16054773);
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (2 == packetID * -1441472435) {
									value = packetBuffer.readInt();
									var69 = packetBuffer.method1742(-1494849731) == 1;
									var70 = Class108_Sub16.method1926(value, -379874688);
									if (var70.aBool1783 != var69) {
										var70.aBool1783 = var69;
										MouseInputHandler.method775(var70, -16054773);
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (72 == packetID * -1441472435) {
									value = anInt2927 * -574496637 + packetBuffer.position * 798331555;
									value2 = packetBuffer.readUShort(1194630880);
									var7 = packetBuffer.readUShort(210388344);
									if (openInterfaceID * 1523906617 != value2) {
										openInterfaceID = value2 * 1256289801;
										Class51.method706(openInterfaceID * 1523906617, -1045871857);
										Class1.method35(openInterfaceID * 1523906617, 1732128252);

										for (verifyIndex = 0; verifyIndex < 100; ++verifyIndex) {
											aBoolArray2909[verifyIndex] = true;
										}
									}

									Class108_Sub10 var11;
									for (; var7-- > 0; var11.aBool1657 = true) {
										verifyIndex = packetBuffer.readInt();
										type = packetBuffer.readUShort(1653339393);
										var10 = packetBuffer.readUByte();
										var11 = (Class108_Sub10) aClass101_2866.get((long) verifyIndex);
										if (var11 != null && var11.anInt1653 * 1557246219 != type) {
											Class108_Sub10.method1682(var11, true, (short) 272);
											var11 = null;
										}

										if (var11 == null) {
											Class108_Sub10 var15 = new Class108_Sub10();
											var15.anInt1653 = type * -385051997;
											var15.anInt1652 = var10 * 2096413155;
											aClass101_2866.put(var15, (long) verifyIndex);
											Class51.method706(type, -1045871857);
											Class1.method35(type, -983856003);
											RSInterface var16 = Class108_Sub16.method1926(verifyIndex, -308525920);
											if (var16 != null) {
												MouseInputHandler.method775(var16, -16054773);
											}

											if (aClass108_Sub17_2869 != null) {
												MouseInputHandler.method775(aClass108_Sub17_2869, -16054773);
												aClass108_Sub17_2869 = null;
											}

											Applet_Sub1.method3282((byte) -46);
											if (-1 != openInterfaceID * 1523906617) {
												var17 = openInterfaceID * 1523906617;
												if (AbstractIndex.method1073(var17, -280584818)) {
													PlainTile.method625(RSInterface.interface_cache[var17], 1, -1128005989);
												}
											}

											var11 = var15;
										}
									}

									for (var75 = (Class108_Sub10) aClass101_2866.method1304(); null != var75; var75 = (Class108_Sub10) aClass101_2866.method1303()) {
										if (var75.aBool1657) {
											var75.aBool1657 = false;
										} else {
											Class108_Sub10.method1682(var75, true, (short) 272);
										}
									}

									aClass101_2906 = new HashTable(512);

									while (packetBuffer.position * 798331555 < value) {
										verifyIndex = packetBuffer.readInt();
										type = packetBuffer.readUShort(100677952);
										var10 = packetBuffer.readUShort(-329989309);
										var83 = packetBuffer.readInt();

										for (variousValue = type; variousValue <= var10; ++variousValue) {
											var29 = (long) variousValue + ((long) verifyIndex << 32);
											aClass101_2906.put(new Class108_Sub19(var83), var29);
										}
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								if (124 == packetID * -1441472435) {
									GraphicsBuffer.anInt185 = packetBuffer.method1751((byte) 67) * 2109260397;
									Class47.anInt676 = packetBuffer.readUNegByte((byte) -45) * -302325607;

									for (value = Class47.anInt676 * 2072343465; value < Class47.anInt676 * 2072343465 + 8; ++value) {
										for (value2 = GraphicsBuffer.anInt185 * -1392404635; value2 < GraphicsBuffer.anInt185 * -1392404635 + 8; ++value2) {
											if (null != groundItemArray[VarpBit.plane * -570926309][value][value2]) {
												groundItemArray[VarpBit.plane * -570926309][value][value2] = null;
												Class104.spawnGroundItem(value, value2, (byte) -77);
											}
										}
									}

									for (Class108_Sub13 var66 = (Class108_Sub13) aClass105_2939.getFront(); null != var66; var66 = (Class108_Sub13) aClass105_2939.getNext()) {
										if (var66.anInt1692 * -1711169553 >= Class47.anInt676 * 2072343465 && var66.anInt1692 * -1711169553 < Class47.anInt676 * 2072343465 + 8 && var66.anInt1681 * -233897981 >= GraphicsBuffer.anInt185 * -1392404635 && var66.anInt1681 * -233897981 < 8 + GraphicsBuffer.anInt185 * -1392404635 && var66.anInt1694 * -1237003511 == VarpBit.plane * -570926309) {
											var66.anInt1690 = 0;
										}
									}

									packetID = 859744123;
									var62 = true;
									break label2607;
								}

								World.method647("" + packetID * -1441472435 + Class47.COMMA_LITERAL + anInt2755 * -33120299 + Class47.COMMA_LITERAL + anInt2756 * 1573856955 + Class47.COMMA_LITERAL + anInt2927 * -574496637, (Throwable) null, 926745782);
								InteractableObject.method648('\uff00');
							} catch (IOException var56) {
								Class7.method180(413655728);
							} catch (Exception var57) {
								stringValue = "" + packetID * -1441472435 + Class47.COMMA_LITERAL + anInt2755 * -33120299 + Class47.COMMA_LITERAL + anInt2756 * 1573856955 + Class47.COMMA_LITERAL + anInt2927 * -574496637 + Class47.COMMA_LITERAL + (Class108_Sub10.myPlayer.anIntArray2391[0] + Class100.anInt1388 * 263051377) + Class47.COMMA_LITERAL + (Class15.anInt201 * -1743142671 + Class108_Sub10.myPlayer.anIntArray2392[0]) + Class47.COMMA_LITERAL;

								for (value2 = 0; value2 < anInt2927 * -574496637 && value2 < 50; ++value2) {
									stringValue = stringValue + packetBuffer.buf[value2] + Class47.COMMA_LITERAL;
								}

								World.method647(stringValue, var57, 926745782);
								InteractableObject.method648('\uff00');
							}

							var62 = true;
						}
					}

					if (!var62) {
						break;
					}
				}

				if (loginLoadingStage * 1315883169 != 30) {
					return;
				}

				while (true) {
					ClientVerifier clientVerifier = (ClientVerifier) Class109.aClass92_1447.method1155();
					boolean var65;
					if (null == clientVerifier) {
						var65 = false;
					} else {
						var65 = true;
					}

					if (!var65) {
						Object var67 = ClientScript.mouseCapturer.objectLock;
						synchronized (var67) {
							if (aBool2802) {
								if (0 != MouseInputHandler.anInt780 * 1629072957 || ClientScript.mouseCapturer.coord * 649608097 >= 40) {
									secureBuffer.writePacket(59);
									secureBuffer.writeByte(0);
									var60 = secureBuffer.position * 798331555;
									mouseXPos = 0;

									for (value = 0; value < ClientScript.mouseCapturer.coord * 649608097 && secureBuffer.position * 798331555 - var60 < 240; ++value) {
										++mouseXPos;
										value2 = ClientScript.mouseCapturer.coordsY[value];
										if (value2 < 0) {
											value2 = 0;
										} else if (value2 > 502) {
											value2 = 502;
										}

										var7 = ClientScript.mouseCapturer.coordsX[value];
										if (var7 < 0) {
											var7 = 0;
										} else if (var7 > 764) {
											var7 = 764;
										}

										verifyIndex = var7 + value2 * 765;
										if (ClientScript.mouseCapturer.coordsY[value] == -1 && -1 == ClientScript.mouseCapturer.coordsX[value]) {
											var7 = -1;
											value2 = -1;
											verifyIndex = 524287;
										}

										if (anInt2717 * 2146627777 == var7 && value2 == anInt2718 * 1540789553) {
											if (anInt2714 * -776041895 < 2047) {
												anInt2714 += 1445469673;
											}
										} else {
											type = var7 - anInt2717 * 2146627777;
											anInt2717 = var7 * 1762238273;
											var10 = value2 - anInt2718 * 1540789553;
											anInt2718 = value2 * 91399121;
											if (anInt2714 * -776041895 < 8 && type >= -32 && type <= 31 && var10 >= -32 && var10 <= 31) {
												type += 32;
												var10 += 32;
												secureBuffer.writeShort(var10 + (type << 6) + (anInt2714 * -776041895 << 12));
												anInt2714 = 0;
											} else if (anInt2714 * -776041895 < 8) {
												secureBuffer.writeTriByte((anInt2714 * -776041895 << 19) + 8388608 + verifyIndex);
												anInt2714 = 0;
											} else {
												secureBuffer.writeInt((anInt2714 * -776041895 << 19) - 1073741824 + verifyIndex);
												anInt2714 = 0;
											}
										}
									}

									secureBuffer.endByte(secureBuffer.position * 798331555 - var60, (short) -28281);
									if (mouseXPos >= ClientScript.mouseCapturer.coord * 649608097) {
										ClientScript.mouseCapturer.coord = 0;
									} else {
										ClientScript.mouseCapturer.coord -= mouseXPos * -1191679903;

										for (value = 0; value < ClientScript.mouseCapturer.coord * 649608097; ++value) {
											ClientScript.mouseCapturer.coordsX[value] = ClientScript.mouseCapturer.coordsX[value + mouseXPos];
											ClientScript.mouseCapturer.coordsY[value] = ClientScript.mouseCapturer.coordsY[mouseXPos + value];
										}
									}
								}
							} else {
								ClientScript.mouseCapturer.coord = 0;
							}
						}

						if (MouseInputHandler.anInt780 * 1629072957 == 1 || !Class100.aBool1391 && MouseInputHandler.anInt780 * 1629072957 == 4 || MouseInputHandler.anInt780 * 1629072957 == 2) {
							long var40 = (MouseInputHandler.aLong779 * -4237770012721490031L - aLong2716 * 3485140636980075871L) / 50L;
							if (var40 > 4095L) {
								var40 = 4095L;
							}

							aLong2716 = MouseInputHandler.aLong779 * 6979520447360696591L;
							mouseXPos = MouseInputHandler.anInt778 * 1498262827;
							if (mouseXPos < 0) {
								mouseXPos = 0;
							} else if (mouseXPos > 502) {
								mouseXPos = 502;
							}

							int mouseYPos = MouseInputHandler.anInt774 * 472132205;
							if (mouseYPos < 0) {
								mouseYPos = 0;
							} else if (mouseYPos > 764) {
								mouseYPos = 764;
							}

							value2 = mouseYPos + mouseXPos * 765;
							byte var133 = 0;
							if (2 == MouseInputHandler.anInt780 * 1629072957) {
								var133 = 1;
							}

							verifyIndex = (int) var40;
							secureBuffer.writePacket(163);
							secureBuffer.writeInt((var133 << 19) + (verifyIndex << 20) + value2);
						}

						if (KeyFocusListener.anInt897 * 1132688297 > 0) {
							secureBuffer.writePacket(42);
							secureBuffer.writeShort(0);
							var61 = secureBuffer.position * 798331555;
							long var42 = Player.method3175(849846164);

							for (value = 0; value < KeyFocusListener.anInt897 * 1132688297; ++value) {
								var27 = var42 - -8541562598439053681L * aLong2925;
								if (var27 > 16777215L) {
									var27 = 16777215L;
								}

								aLong2925 = 1524832735365646447L * var42;
								secureBuffer.method1755((int) var27, 1163165080);
								secureBuffer.method1739(KeyFocusListener.anIntArray890[value], (byte) 64);
							}

							secureBuffer.endShort(secureBuffer.position * 798331555 - var61, -2807659);
						}

						if (anInt2738 * 307156137 > 0) {
							anInt2738 += 1809510503;
						}

						if (KeyFocusListener.aBoolArray895[96] || KeyFocusListener.aBoolArray895[97] || KeyFocusListener.aBoolArray895[98] || KeyFocusListener.aBoolArray895[99]) {
							aBool2794 = true;
						}

						if (aBool2794 && anInt2738 * 307156137 <= 0) {
							anInt2738 = -1830471692;
							aBool2794 = false;
							secureBuffer.writePacket(100);
							secureBuffer.method1748(anInt2816 * 1501284499, 2037687171);
							secureBuffer.method1749(anInt2771 * -44898889, -772878231);
						}

						if (LoginHandler.aBool844 && !aBool2720) {
							aBool2720 = true;
							secureBuffer.writePacket(201);
							secureBuffer.writeByte(1);
						}

						if (!LoginHandler.aBool844 && aBool2720) {
							aBool2720 = false;
							secureBuffer.writePacket(201);
							secureBuffer.writeByte(0);
						}

						UnderlayDefinition.method2279(-1277213199);
						if (loginLoadingStage * 1315883169 != 30) {
							return;
						}

						for (Class108_Sub13 var68 = (Class108_Sub13) aClass105_2939.getFront(); var68 != null; var68 = (Class108_Sub13) aClass105_2939.getNext()) {
							if (var68.anInt1690 * 1336924445 > 0) {
								var68.anInt1690 += 881348299;
							}

							ObjectDefinition var137;
							if (var68.anInt1690 * 1336924445 == 0) {
								if (var68.anInt1683 * 1503731351 >= 0) {
									int objectID = var68.anInt1683 * 1503731351;
									value = var68.anInt1685 * 920190685;
									var137 = ChatMessagesContainer.getObjectDefForID(objectID, (byte) 0);
									if (value == 11) {
										value = 10;
									}

									if (value >= 5 && value <= 8) {
										value = 4;
									}

									var62 = var137.method2183(value, 2133773096);
									if (!var62) {
										continue;
									}
								}

								World.method643(var68.anInt1694 * -1237003511, var68.anInt1679 * -1012881333, var68.anInt1692 * -1711169553, var68.anInt1681 * -233897981, var68.anInt1683 * 1503731351, var68.anInt1684 * -1859086243, var68.anInt1685 * 920190685, -953692284);
								var68.unlink();
							} else {
								if (var68.anInt1689 * 1313217029 > 0) {
									var68.anInt1689 -= 246325965;
								}

								if (0 == var68.anInt1689 * 1313217029 && var68.anInt1692 * -1711169553 >= 1 && var68.anInt1681 * -233897981 >= 1 && var68.anInt1692 * -1711169553 <= 102 && var68.anInt1681 * -233897981 <= 102) {
									if (var68.anInt1682 * -1193219799 >= 0) {
										mouseXPos = var68.anInt1682 * -1193219799;
										value = var68.anInt1688 * 1399604537;
										var137 = ChatMessagesContainer.getObjectDefForID(mouseXPos, (byte) 0);
										if (11 == value) {
											value = 10;
										}

										if (value >= 5 && value <= 8) {
											value = 4;
										}

										var62 = var137.method2183(value, 1524792656);
										if (!var62) {
											continue;
										}
									}

									World.method643(var68.anInt1694 * -1237003511, var68.anInt1679 * -1012881333, var68.anInt1692 * -1711169553, var68.anInt1681 * -233897981, var68.anInt1682 * -1193219799, var68.anInt1687 * 147020431, var68.anInt1688 * 1399604537, 533251259);
									var68.anInt1689 = -246325965;
									if (var68.anInt1682 * -1193219799 == var68.anInt1683 * 1503731351 && var68.anInt1683 * 1503731351 == -1) {
										var68.unlink();
									} else if (var68.anInt1682 * -1193219799 == var68.anInt1683 * 1503731351 && var68.anInt1687 * 147020431 == var68.anInt1684 * -1859086243 && var68.anInt1685 * 920190685 == var68.anInt1688 * 1399604537) {
										var68.unlink();
									}
								}
							}
						}

						Class108_Sub22.method1991(1158586381);
						anInt2918 -= 1438564163;
						if (anInt2918 * 11319957 > 750) {
							Class7.method180(-1694321333);
							return;
						}

						ObjectDefinition.method2224((byte) 70);

						for (var61 = 0; var61 < anInt2749 * -1829405175; ++var61) {
							var60 = npcIndices[var61];
							NPC var72 = localNPCs[var60];
							if (var72 != null) {
								KeyFocusListener.method904(var72, var72.definition.tileSpacesOccupied * -87058581, -95967059);
							}
						}

						GraphicsBuffer.method262(2073836407);
						anInt2780 += 2046019493;
						if (0 != anInt2813 * -1596091641) {
							anInt2829 += 1054535436;
							if (anInt2829 * -759709545 >= 400) {
								anInt2813 = 0;
							}
						}

						if (Class4.aClass108_Sub17_75 != null) {
							anInt2814 += 149366129;
							if (anInt2814 * 1648294801 >= 15) {
								MouseInputHandler.method775(Class4.aClass108_Sub17_75, -16054773);
								Class4.aClass108_Sub17_75 = null;
							}
						}

						RSInterface var73 = Class72.aClass108_Sub17_924;
						RSInterface var139 = NPCDefinition.aClass108_Sub17_2193;
						Class72.aClass108_Sub17_924 = null;
						NPCDefinition.aClass108_Sub17_2193 = null;
						aClass108_Sub17_2818 = null;
						aBool2885 = false;
						aBool2882 = false;
						anInt2862 = 0;

						while (GraphicsBuffer.method278(446656042) && anInt2862 * 284994951 < 128) {
							if (rights * 171939335 >= 2 && KeyFocusListener.aBoolArray895[82] && 66 == Class9.anInt124 * 1025603675) {
								stringValue = "";
 
								ChatMessage var135;
								for (Iterator var138 = Class26.aClass95_348.iterator(); var138.hasNext(); stringValue = stringValue + var135.messagePrefix + ':' + var135.messageSuffix + '\n') {
									var135 = (ChatMessage) var138.next();
								}

								Friend.aClipboard625.setContents(new StringSelection(stringValue), (ClipboardOwner) null);
							} else {
								anIntArray2924[anInt2862 * 284994951] = Class9.anInt124 * 1025603675;
								anIntArray2923[anInt2862 * 284994951] = LoginHandler.aChar841;
								anInt2862 += 268535863;
							}
						}

						mouseXPos = openInterfaceID * 1523906617;
						if (AbstractIndex.method1073(mouseXPos, 698314354)) {
							Ignore.buildRightClickMenu(RSInterface.interface_cache[mouseXPos], -1, 0, 0, 765, 503, 0, 0, -1861351226);
						}

						anInt2731 += 1649299627;

						while (true) {
							ClientScript script = (ClientScript) aClass105_2904.method1337();
							if (null == script) {
								while (true) {
									script = (ClientScript) aClass105_2826.method1337();
									if (null == script) {
										while (true) {
											script = (ClientScript) aClass105_2737.method1337();
											if (script == null) {
												RegionReference.method608((byte) -123);
												if (IsaacRandomGen.aClass108_Sub17_745 == null && null == aClass108_Sub17_2877) {
													value = MouseInputHandler.anInt780 * 1629072957;
													if (actionMenuOpen) {
														if (1 != value && (Class100.aBool1391 || value != 4)) {
															value2 = MouseInputHandler.mouseX * -367052265;
															var7 = MouseInputHandler.mouseY * 1533395117;
															if (value2 < Class51.actionMenuX * -745630459 - 10 || value2 > Class51.actionMenuX * -745630459 + Class54.actionMenuWidth * 1703965243 + 10 || var7 < MouseInputHandler.actionMenuY * -740301953 - 10 || var7 > 10 + Item.actionMenuHeight * 720768655 + MouseInputHandler.actionMenuY * -740301953) {
																actionMenuOpen = false;
																ClientScriptMap.method2172(Class51.actionMenuX * -745630459, MouseInputHandler.actionMenuY * -740301953, Class54.actionMenuWidth * 1703965243, Item.actionMenuHeight * 720768655, (byte) 25);
															}
														}

														if (value == 1 || !Class100.aBool1391 && 4 == value) {
															value2 = Class51.actionMenuX * -745630459;
															var7 = MouseInputHandler.actionMenuY * -740301953;
															verifyIndex = Class54.actionMenuWidth * 1703965243;
															type = MouseInputHandler.anInt774 * 472132205;
															var10 = MouseInputHandler.anInt778 * 1498262827;
															var83 = -1;

															for (variousValue = 0; variousValue < menuActionRow * 391839991; ++variousValue) {
																var110 = (menuActionRow * 391839991 - 1 - variousValue) * 15 + 31 + var7;
																if (type > value2 && type < verifyIndex + value2 && var10 > var110 - 13 && var10 < var110 + 3) {
																	var83 = variousValue;
																}
															}

															if (var83 != -1) {
																Class108_Sub22.method1996(var83, (byte) 123);
															}

															actionMenuOpen = false;
															ClientScriptMap.method2172(Class51.actionMenuX * -745630459, MouseInputHandler.actionMenuY * -740301953, Class54.actionMenuWidth * 1703965243, Item.actionMenuHeight * 720768655, (byte) 30);
														}
													} else {
														label2833:
														{
															if ((value == 1 || !Class100.aBool1391 && value == 4) && menuActionRow * 391839991 > 0) {
																value2 = menuActionIdentifiers[menuActionRow * 391839991 - 1];
																if (39 == value2 || 40 == value2 || value2 == 41 || value2 == 42 || value2 == 43 || 33 == value2 || 34 == value2 || 35 == value2 || 36 == value2 || value2 == 37 || value2 == 38 || 1005 == value2) {
																	label2815:
																	{
																		var7 = menuActionXInteractions[menuActionRow * 391839991 - 1];
																		verifyIndex = menuActionYInteractions[menuActionRow * 391839991 - 1];
																		var77 = Class108_Sub16.method1926(verifyIndex, 279223576);
																		if (!Class52.method712(Class32.method576(var77, -669137700), -629807847)) {
																			var83 = Class32.method576(var77, -1479049997);
																			boolean var126 = 0 != (var83 >> 29 & 1);
																			if (!var126) {
																				break label2815;
																			}
																		}

																		if (null != IsaacRandomGen.aClass108_Sub17_745 && !aBool2860 && 1 != anInt2765 * -1978050497 && !Class32.method577(menuActionRow * 391839991 - 1, 1315292886) && menuActionRow * 391839991 > 0) {
																			method3552(anInt2900 * 785242869, anInt2903 * 685630743, -1806912840);
																		}

																		aBool2860 = false;
																		anInt2841 = 0;
																		if (IsaacRandomGen.aClass108_Sub17_745 != null) {
																			MouseInputHandler.method775(IsaacRandomGen.aClass108_Sub17_745, -16054773);
																		}

																		IsaacRandomGen.aClass108_Sub17_745 = Class108_Sub16.method1926(verifyIndex, -1169230931);
																		anInt2863 = var7 * 1510333713;
																		anInt2900 = MouseInputHandler.anInt774 * -258582887;
																		anInt2903 = MouseInputHandler.anInt778 * -472109811;
																		if (menuActionRow * 391839991 > 0) {
																			Tile.method1676(menuActionRow * 391839991 - 1, 734161922);
																		}

																		MouseInputHandler.method775(IsaacRandomGen.aClass108_Sub17_745, -16054773);
																		break label2833;
																	}
																}
															}

															if ((value == 1 || !Class100.aBool1391 && 4 == value) && (anInt2765 * -1978050497 == 1 && menuActionRow * 391839991 > 2 || Class32.method577(menuActionRow * 391839991 - 1, 1315292886))) {
																value = 2;
															}

															if ((value == 1 || !Class100.aBool1391 && value == 4) && menuActionRow * 391839991 > 0) {
																Class108_Sub22.method1996(menuActionRow * 391839991 - 1, (byte) 118);
															}

															if (2 == value && menuActionRow * 391839991 > 0) {
																Applet_Sub1.method3281(MouseInputHandler.anInt774 * 472132205, MouseInputHandler.anInt778 * 1498262827, (byte) 76);
															}
														}
													}
												}

												if (null != aClass108_Sub17_2877) {
													Class54.method723((byte) -73);
												}

												if (null != IsaacRandomGen.aClass108_Sub17_745) {
													MouseInputHandler.method775(IsaacRandomGen.aClass108_Sub17_745, -16054773);
													anInt2841 += 828546285;
													if (0 == MouseInputHandler.anInt769 * 1251070677) {
														if (aBool2860) {
															if (Class108_Sub10.aClass108_Sub17_1656 == IsaacRandomGen.aClass108_Sub17_745 && anInt2863 * -664226831 != anInt2911 * -26588191) {
																RSInterface var151 = IsaacRandomGen.aClass108_Sub17_745;
																byte var145 = 0;
																if (anInt2730 * 1745518121 == 1 && 206 == var151.anInt1886 * -917776085) {
																	var145 = 1;
																}

																if (var151.widgetItems[anInt2911 * -26588191] <= 0) {
																	var145 = 0;
																}

																verifyIndex = Class32.method576(var151, 303856672);
																boolean var140 = 0 != (verifyIndex >> 29 & 1);
																if (var140) {
																	type = anInt2863 * -664226831;
																	var10 = anInt2911 * -26588191;
																	var151.widgetItems[var10] = var151.widgetItems[type];
																	var151.widgetItemAmounts[var10] = var151.widgetItemAmounts[type];
																	var151.widgetItems[type] = -1;
																	var151.widgetItemAmounts[type] = 0;
																} else if (var145 == 1) {
																	type = anInt2863 * -664226831;
																	var10 = anInt2911 * -26588191;

																	while (var10 != type) {
																		if (type > var10) {
																			var151.switchItemSlots(type - 1, type, -1673438746);
																			--type;
																		} else if (type < var10) {
																			var151.switchItemSlots(type + 1, type, 1876097408);
																			++type;
																		}
																	}
																} else {
																	var151.switchItemSlots(anInt2911 * -26588191, anInt2863 * -664226831, 473866213);
																}

																secureBuffer.writePacket(204);
																secureBuffer.method1739(var145, (byte) 64);
																secureBuffer.method1749(anInt2911 * -26588191, 1370290771);
																secureBuffer.method1748(anInt2863 * -664226831, 393924825);
																secureBuffer.method1756(IsaacRandomGen.aClass108_Sub17_745.interfaceHash * -1081473899, -1853537390);
															}
														} else if ((1 == anInt2765 * -1978050497 || Class32.method577(menuActionRow * 391839991 - 1, 1315292886)) && menuActionRow * 391839991 > 2) {
															Applet_Sub1.method3281(anInt2900 * 785242869, anInt2903 * 685630743, (byte) 54);
														} else if (menuActionRow * 391839991 > 0) {
															value = anInt2900 * 785242869;
															value2 = anInt2903 * 685630743;
															Class15.method298(Class108_Sub21.aClass1_1895, value, value2, (short) 16256);
															Class108_Sub21.aClass1_1895 = null;
														}

														anInt2814 = 1493661290;
														MouseInputHandler.anInt780 = 0;
														IsaacRandomGen.aClass108_Sub17_745 = null;
													} else if (anInt2841 * 1113333989 >= 5 && (MouseInputHandler.mouseX * -367052265 > anInt2900 * 785242869 + 5 || MouseInputHandler.mouseX * -367052265 < anInt2900 * 785242869 - 5 || MouseInputHandler.mouseY * 1533395117 > anInt2903 * 685630743 + 5 || MouseInputHandler.mouseY * 1533395117 < anInt2903 * 685630743 - 5)) {
														aBool2860 = true;
													}
												}

												if (Scene.anInt437 != -1) {
													value = Scene.anInt437;
													value2 = Scene.anInt424;
													secureBuffer.writePacket(236);
													secureBuffer.writeByte(5);
													secureBuffer.writeByteN(KeyFocusListener.aBoolArray895[82] ? (KeyFocusListener.aBoolArray895[81] ? 2 : 1) : 0, (byte) 1);
													secureBuffer.writeAShortLE(Class15.anInt201 * -1743142671 + value2, (byte) 23);
													secureBuffer.writeAShortLE(value + Class100.anInt1388 * 263051377, (byte) 33);
													Scene.anInt437 = -1;
													anInt2810 = MouseInputHandler.anInt774 * 1998835879;
													anInt2811 = MouseInputHandler.anInt778 * 2079836155;
													anInt2813 = 565013175;
													anInt2829 = 0;
													anInt2933 = value * -18058427;
													anInt2894 = value2 * 1849977017;
												}

												if (Class72.aClass108_Sub17_924 != var73) {
													if (null != var73) {
														MouseInputHandler.method775(var73, -16054773);
													}

													if (Class72.aClass108_Sub17_924 != null) {
														MouseInputHandler.method775(Class72.aClass108_Sub17_924, -16054773);
													}
												}

												if (var139 != NPCDefinition.aClass108_Sub17_2193 && anInt2857 * -1887483549 == anInt2856 * 1284119235) {
													if (var139 != null) {
														MouseInputHandler.method775(var139, -16054773);
													}

													if (null != NPCDefinition.aClass108_Sub17_2193) {
														MouseInputHandler.method775(NPCDefinition.aClass108_Sub17_2193, -16054773);
													}
												}

												if (NPCDefinition.aClass108_Sub17_2193 != null) {
													if (anInt2856 * 1284119235 < anInt2857 * -1887483549) {
														anInt2856 += 1627645419;
														if (anInt2857 * -1887483549 == anInt2856 * 1284119235) {
															MouseInputHandler.method775(NPCDefinition.aClass108_Sub17_2193, -16054773);
														}
													}
												} else if (anInt2856 * 1284119235 > 0) {
													anInt2856 -= 1627645419;
												}

												ObjectDefinition.method2223((byte) -20);
												if (aBool2886) {
													value = Varp.anInt2042 * -514338432 + 64;
													value2 = Class23.anInt312 * 168530560 + 64;
													var7 = ClientScript.getFloorDrawHeight(value, value2, VarpBit.plane * -570926309, 1362004752) - FloorDecoration.anInt288 * -793898015;
													if (BZip2Context.anInt279 * 1217916071 < value) {
														BZip2Context.anInt279 += ((value - BZip2Context.anInt279 * 1217916071) * FloorDefinition.anInt2223 * -1608687883 / 1000 + Friend.anInt627 * 399671025) * 1616837399;
														if (BZip2Context.anInt279 * 1217916071 > value) {
															BZip2Context.anInt279 = value * 1616837399;
														}
													}

													if (BZip2Context.anInt279 * 1217916071 > value) {
														BZip2Context.anInt279 -= (Friend.anInt627 * 399671025 + FloorDefinition.anInt2223 * -1608687883 * (BZip2Context.anInt279 * 1217916071 - value) / 1000) * 1616837399;
														if (BZip2Context.anInt279 * 1217916071 < value) {
															BZip2Context.anInt279 = value * 1616837399;
														}
													}

													if (ClientScript.anInt1645 * 699100371 < var7) {
														ClientScript.anInt1645 += (Friend.anInt627 * 399671025 + FloorDefinition.anInt2223 * -1608687883 * (var7 - ClientScript.anInt1645 * 699100371) / 1000) * 1023920987;
														if (ClientScript.anInt1645 * 699100371 > var7) {
															ClientScript.anInt1645 = var7 * 1023920987;
														}
													}

													if (ClientScript.anInt1645 * 699100371 > var7) {
														ClientScript.anInt1645 -= ((ClientScript.anInt1645 * 699100371 - var7) * FloorDefinition.anInt2223 * -1608687883 / 1000 + Friend.anInt627 * 399671025) * 1023920987;
														if (ClientScript.anInt1645 * 699100371 < var7) {
															ClientScript.anInt1645 = var7 * 1023920987;
														}
													}

													if (CacheFileAccessor.anInt1490 * 1498802843 < value2) {
														CacheFileAccessor.anInt1490 += ((value2 - CacheFileAccessor.anInt1490 * 1498802843) * FloorDefinition.anInt2223 * -1608687883 / 1000 + Friend.anInt627 * 399671025) * 365620115;
														if (CacheFileAccessor.anInt1490 * 1498802843 > value2) {
															CacheFileAccessor.anInt1490 = value2 * 365620115;
														}
													}

													if (CacheFileAccessor.anInt1490 * 1498802843 > value2) {
														CacheFileAccessor.anInt1490 -= (Friend.anInt627 * 399671025 + FloorDefinition.anInt2223 * -1608687883 * (CacheFileAccessor.anInt1490 * 1498802843 - value2) / 1000) * 365620115;
														if (CacheFileAccessor.anInt1490 * 1498802843 < value2) {
															CacheFileAccessor.anInt1490 = value2 * 365620115;
														}
													}

													value = Entity.anInt2398 * 907430272 + 64;
													value2 = Class9.anInt128 * -1304748928 + 64;
													var7 = ClientScript.getFloorDrawHeight(value, value2, VarpBit.plane * -570926309, 289351238) - Class50.anInt696 * 1025702007;
													verifyIndex = value - BZip2Context.anInt279 * 1217916071;
													type = var7 - ClientScript.anInt1645 * 699100371;
													var10 = value2 - CacheFileAccessor.anInt1490 * 1498802843;
													var83 = (int) Math.sqrt((double) (verifyIndex * verifyIndex + var10 * var10));
													variousValue = (int) (Math.atan2((double) type, (double) var83) * 325.949D) & 2047;
													var110 = (int) (Math.atan2((double) verifyIndex, (double) var10) * -325.949D) & 2047;
													if (variousValue < 128) {
														variousValue = 128;
													}

													if (variousValue > 383) {
														variousValue = 383;
													}

													if (RuntimeException_Sub1.anInt2625 * -611182019 < variousValue) {
														RuntimeException_Sub1.anInt2625 += (GraphicsBuffer.anInt183 * 1726673899 * (variousValue - RuntimeException_Sub1.anInt2625 * -611182019) / 1000 + ClientScriptMap.anInt2063 * -1788141347) * -1558852331;
														if (RuntimeException_Sub1.anInt2625 * -611182019 > variousValue) {
															RuntimeException_Sub1.anInt2625 = variousValue * -1558852331;
														}
													}

													if (RuntimeException_Sub1.anInt2625 * -611182019 > variousValue) {
														RuntimeException_Sub1.anInt2625 -= ((RuntimeException_Sub1.anInt2625 * -611182019 - variousValue) * GraphicsBuffer.anInt183 * 1726673899 / 1000 + ClientScriptMap.anInt2063 * -1788141347) * -1558852331;
														if (RuntimeException_Sub1.anInt2625 * -611182019 < variousValue) {
															RuntimeException_Sub1.anInt2625 = variousValue * -1558852331;
														}
													}

													nameIndex = var110 - GameConnection.anInt811 * -1717637923;
													if (nameIndex > 1024) {
														nameIndex -= 2048;
													}

													if (nameIndex < -1024) {
														nameIndex += 2048;
													}

													if (nameIndex > 0) {
														GameConnection.anInt811 += (GraphicsBuffer.anInt183 * 1726673899 * nameIndex / 1000 + ClientScriptMap.anInt2063 * -1788141347) * -422753419;
														GameConnection.anInt811 = (GameConnection.anInt811 * -1717637923 & 2047) * -422753419;
													}

													if (nameIndex < 0) {
														GameConnection.anInt811 -= (GraphicsBuffer.anInt183 * 1726673899 * -nameIndex / 1000 + ClientScriptMap.anInt2063 * -1788141347) * -422753419;
														GameConnection.anInt811 = (GameConnection.anInt811 * -1717637923 & 2047) * -422753419;
													}

													var17 = var110 - GameConnection.anInt811 * -1717637923;
													if (var17 > 1024) {
														var17 -= 2048;
													}

													if (var17 < -1024) {
														var17 += 2048;
													}

													if (var17 < 0 && nameIndex > 0 || var17 > 0 && nameIndex < 0) {
														GameConnection.anInt811 = var110 * -422753419;
													}
												}

												for (value = 0; value < 5; ++value) {
													++anIntArray2952[value];
												}

												value = GroundItem.method580(1964230953);
												value2 = KeyFocusListener.anInt875 * -1921318233;
												if (value > 15000 && value2 > 15000) {
													anInt2753 = -693093638;
													ItemDefinition.method2100(14500, -2033227909);
													secureBuffer.writePacket(55);
												}

												anInt2774 += 793618711;
												if (anInt2774 * -1855316313 > 500) {
													anInt2774 = 0;
													verifyIndex = (int) (Math.random() * 8.0D);
													if ((verifyIndex & 1) == 1) {
														anInt2768 += anInt2769 * 587762071;
													}

													if (2 == (verifyIndex & 2)) {
														anInt2770 += anInt2844 * -1571311957;
													}

													if (4 == (verifyIndex & 4)) {
														anInt2772 += anInt2773 * 1383666347;
													}
												}

												if (anInt2768 * -2022691021 < -50) {
													anInt2769 = -1414579590;
												}

												if (anInt2768 * -2022691021 > 50) {
													anInt2769 = 1414579590;
												}

												if (anInt2770 * 2011548015 < -55) {
													anInt2844 = 2066221402;
												}

												if (anInt2770 * 2011548015 > 55) {
													anInt2844 = -2066221402;
												}

												if (anInt2772 * -1122254441 < -40) {
													anInt2773 = -1306013067;
												}

												if (anInt2772 * -1122254441 > 40) {
													anInt2773 = 1306013067;
												}

												anInt2838 += 636983853;
												if (anInt2838 * 687457701 > 500) {
													anInt2838 = 0;
													verifyIndex = (int) (Math.random() * 8.0D);
													if (1 == (verifyIndex & 1)) {
														anInt2775 += anInt2788 * -360517537;
													}

													if (2 == (verifyIndex & 2)) {
														anInt2957 += anInt2778 * -902513379;
													}
												}

												if (anInt2775 * 1889215063 < -60) {
													anInt2788 = 1858078706;
												}

												if (anInt2775 * 1889215063 > 60) {
													anInt2788 = -1858078706;
												}

												if (anInt2957 * 331969371 < -20) {
													anInt2778 = 114742959;
												}

												if (anInt2957 * 331969371 > 10) {
													anInt2778 = -114742959;
												}

												for (OnlineFriend onlineFriend = (OnlineFriend) aClass102_2956.getBack(); onlineFriend != null; onlineFriend = (OnlineFriend) aClass102_2956.getPrevious()) {
													if ((long) (onlineFriend.anInt1517 * -398102129) < Player.method3175(849846164) / 1000L - 5L) {
														if (onlineFriend.status > 0) {
															AnimationSkeletonSet.pushMessage(5, "", onlineFriend.username + StringConstants.BLANK_HAS_LOGGED_IN, -429113441);
														}

														if (onlineFriend.status == 0) {
															AnimationSkeletonSet.pushMessage(5, "", onlineFriend.username + StringConstants.HAS_LOGGED_OUT, -1228500567);
														}

														onlineFriend.remove();
													}
												}

												anInt2946 -= 2042742857;
												if (anInt2946 * 219371015 > 50) {
													secureBuffer.writePacket(32);
												}

												try {
													if (null == Varp.loginConnection) {
														return;
													}

													if (secureBuffer.position * 798331555 <= 0) {
														return;
													}

													Varp.loginConnection.writeBytes(secureBuffer.buf, 0, secureBuffer.position * 798331555);
													secureBuffer.position = 0;
													anInt2946 = 0;
													return;
												} catch (IOException var44) {
													Class7.method180(1602720093);
													return;
												}
											}

											var74 = script.parentInterface;
											if (var74.anInt1772 * -490007465 >= 0) {
												var70 = Class108_Sub16.method1926(var74.hoverPopup * -867206361, 898043503);
												if (null == var70 || null == var70.aClass108_Sub17Array1879 || var74.anInt1772 * -490007465 >= var70.aClass108_Sub17Array1879.length || var74 != var70.aClass108_Sub17Array1879[var74.anInt1772 * -490007465]) {
													continue;
												}
											}

											GameObject.executeScript(script, -2141005462);
										}
									}

									var74 = script.parentInterface;
									if (var74.anInt1772 * -490007465 >= 0) {
										var70 = Class108_Sub16.method1926(var74.hoverPopup * -867206361, 1856223202);
										if (null == var70 || var70.aClass108_Sub17Array1879 == null || var74.anInt1772 * -490007465 >= var70.aClass108_Sub17Array1879.length || var74 != var70.aClass108_Sub17Array1879[var74.anInt1772 * -490007465]) {
											continue;
										}
									}

									GameObject.executeScript(script, -1818309482);
								}
							}

							var74 = script.parentInterface;
							if (var74.anInt1772 * -490007465 >= 0) {
								var70 = Class108_Sub16.method1926(var74.hoverPopup * -867206361, -262743197);
								if (var70 == null || null == var70.aClass108_Sub17Array1879 || var74.anInt1772 * -490007465 >= var70.aClass108_Sub17Array1879.length || var70.aClass108_Sub17Array1879[var74.anInt1772 * -490007465] != var74) {
									continue;
								}
							}

							GameObject.executeScript(script, -1834260314);
						}
					}

					secureBuffer.writePacket(169);
					secureBuffer.writeByte(0);
					var60 = secureBuffer.position * 798331555;
					Js5Request.writeClassVerifierResults(secureBuffer, 2079997796);
					secureBuffer.endByte(secureBuffer.position * 798331555 - var60, (short) -9726);
				}
			}

			var3.aClass74_Sub1_1756.method1906(var3.aClass59_1757, (int) var3.key, var3.aByteArray1754, false, -1326858150);
		}
	}

	protected final void method3198(byte var1) {
		boolean var2;
		label206:
		{
			try {
				if (Class91.anInt1325 * 485824819 == 2) {
					if (null == Class68.aClass108_Sub23_903) {
						Class68.aClass108_Sub23_903 = RSSong.getSong(RSInterface.aClass74_1889, Class91.anInt1329 * -1642974493, OnlineFriend.anInt1511 * 1997703569);
						if (Class68.aClass108_Sub23_903 == null) {
							var2 = false;
							break label206;
						}
					}

					if (Timer.aClass15_724 == null) {
						Timer.aClass15_724 = new Class15(Class109.soundEffectIndex_R1, Class91.soundEffectIndex_R2);
					}

					if (Class32.aClass108_Sub4_Sub3_464.method2668(Class68.aClass108_Sub23_903, Class91.soundEffectIndex_R3, Timer.aClass15_724, 22050, -1625330588)) {
						Class32.aClass108_Sub4_Sub3_464.method2607((byte) 98);
						Class32.aClass108_Sub4_Sub3_464.method2637(Class27.anInt362 * 1010476113, -714772405);
						Class32.aClass108_Sub4_Sub3_464.method2609(Class68.aClass108_Sub23_903, FriendsChatMember.aBool1669, -978424795);
						Class91.anInt1325 = 0;
						Class68.aClass108_Sub23_903 = null;
						Timer.aClass15_724 = null;
						RSInterface.aClass74_1889 = null;
						var2 = true;
						break label206;
					}
				}
			} catch (Exception var11) {
				var11.printStackTrace();
				Class32.aClass108_Sub4_Sub3_464.method2610(-1642446429);
				Class91.anInt1325 = 0;
				Class68.aClass108_Sub23_903 = null;
				Timer.aClass15_724 = null;
				RSInterface.aClass74_1889 = null;
			}

			var2 = false;
		}

		if (var2 && aBool2938 && Class2.aClass7_17 != null) {
			Class2.aClass7_17.method120(1230527873);
		}

		if (aBool2693) {
			Canvas var4 = Class1.aCanvas3;
			var4.removeKeyListener(KeyFocusListener.keyFocusListener);
			var4.removeFocusListener(KeyFocusListener.keyFocusListener);
			KeyFocusListener.anInt887 = -88447803;
			GameObject.method2845(Class1.aCanvas3, -1756702108);
			if (null != Class108_Sub6.aClass71_1585) {
				Class108_Sub6.aClass71_1585.method983(Class1.aCanvas3, 530167426);
			}

			this.method3185((byte) -92);
			Canvas var5 = Class1.aCanvas3;
			var5.setFocusTraversalKeysEnabled(false);
			var5.addKeyListener(KeyFocusListener.keyFocusListener);
			var5.addFocusListener(KeyFocusListener.keyFocusListener);
			AnimationDefinition.method2237(Class1.aCanvas3, (byte) 25);
			if (null != Class108_Sub6.aClass71_1585) {
				Class108_Sub6.aClass71_1585.method986(Class1.aCanvas3, (short) 15645);
			}
		}

		int yPos;
		if (loginLoadingStage * 1315883169 == 0) {
			MouseCapturer.method392(Class4.anInt52 * 2070155241, Class4.currentLoadingStatus, (Color) null, -230014244);
		} else if (loginLoadingStage * 1315883169 == 5) {
			ObjectDefinition.renderLoginAndWorldList(Class94.b12_full_font, Class2.p11_full_font, -91833970);
		} else if (loginLoadingStage * 1315883169 != 10 && loginLoadingStage * 1315883169 != 11) {
			if (loginLoadingStage * 1315883169 == 20) {
				ObjectDefinition.renderLoginAndWorldList(Class94.b12_full_font, Class2.p11_full_font, -768421256);
			} else {
				int xPos;
				if (loginLoadingStage * 1315883169 == 25) {
					if (anInt2943 * 1299172531 == 1) {
						if (anInt2759 * -808973075 > anInt2830 * 1115647091) {
							anInt2830 = anInt2759 * -826889953;
						}

						xPos = (anInt2830 * -52220298 - anInt2759 * -1793948086) / (anInt2830 * 1115647091);
						GameDefinition.method1107(StringConstants.LOADING_PLEASE_WAIT + Class47.LINE_BREAK + Class47.OPEN_PAREN + xPos + "%" + Class47.CLOSE_PAREN, false, 794128364);
					} else if (2 == anInt2943 * 1299172531) {
						if (anInt2761 * -1818752631 > anInt2762 * -204390075) {
							anInt2762 = anInt2761 * -74763915;
						}

						xPos = 50 + (anInt2762 * -1629569158 - anInt2761 * -743318334) / (anInt2762 * -204390075);
						GameDefinition.method1107(StringConstants.LOADING_PLEASE_WAIT + Class47.LINE_BREAK + Class47.OPEN_PAREN + xPos + "%" + Class47.CLOSE_PAREN, false, 1059283875);
					} else {
						GameDefinition.method1107(StringConstants.LOADING_PLEASE_WAIT, false, 29897996);
					}
				} else if (30 == loginLoadingStage * 1315883169) {
					if (-1 != openInterfaceID * 1523906617) {
						xPos = openInterfaceID * 1523906617;
						if (AbstractIndex.method1073(xPos, -593848815)) {
							Class47.method673(RSInterface.interface_cache[xPos], -1, -353425235);
						}
					}

					for (xPos = 0; xPos < anInt2907 * -792079877; ++xPos) {
						if (aBoolArray2909[xPos]) {
							aBoolArray2910[xPos] = true;
						}

						aBoolArray2831[xPos] = aBoolArray2909[xPos];
						aBoolArray2909[xPos] = false;
					}

					anInt2854 = cycle * 1524911151;
					anInt2735 = -735852373;
					anInt2820 = 1949788625;
					Class108_Sub10.aClass108_Sub17_1656 = null;
					if (-1 != openInterfaceID * 1523906617) {
						anInt2907 = 0;
						Class50.renderInterface(openInterfaceID * 1523906617, 0, 0, 765, 503, 0, 0, -1, -1671525335);
					}

					Rasterizer2D.method2495();
					if (!actionMenuOpen) {
						if (-1 != anInt2735 * 1515589117) {
							xPos = anInt2735 * 1515589117;
							yPos = anInt2820 * -301567793;
							if (menuActionRow * 391839991 >= 2 || 0 != anInt2858 * -968945719 || aBool2881) {
								String tooltip;
								if (anInt2858 * -968945719 == 1 && menuActionRow * 391839991 < 2) {
									tooltip = StringConstants.USE_OPTION + StringConstants.aString1109 + aString2859 + " " + Class47.aString668; //use SOMETHING with...
								} else if (aBool2881 && menuActionRow * 391839991 < 2) {
									tooltip = aString2941 + StringConstants.aString1109 + aString2819 + " " + Class47.aString668; // ...
								} else {
									int highestMenuActionRow = menuActionRow * 391839991 - 1;
									String secondMenuName;
									if (menuActionNames[highestMenuActionRow].length() > 0) {
										secondMenuName = menuActionNamePrefix[highestMenuActionRow] + StringConstants.aString1109 + menuActionNames[highestMenuActionRow];
									} else {
										secondMenuName = menuActionNamePrefix[highestMenuActionRow];
									}

									tooltip = secondMenuName;
								}

								if (menuActionRow * 391839991 > 2) {
									tooltip = tooltip + HuffmanEncoding.method690(16777215, -598146062) + " " + '/' + " " + (menuActionRow * 391839991 - 2) + StringConstants.aString1044;
								}

								Class94.b12_full_font.drawShadedSeededAlphaString(tooltip, xPos + 4, 15 + yPos, 16777215, 0, cycle * -637317861 / 1000);

							}
						}
					} else {
						AnimationDefinition.renderActionMenu((byte) -70);
					}
					Class94.b12_full_font.drawShadedSeededAlphaString("Game tick: " + gametick, xPos + 4, 35, 16777215, 0, cycle * -637317861 / 1000);

					if (3 == anInt2916 * 1531358553) {
						for (xPos = 0; xPos < anInt2907 * -792079877; ++xPos) {
							if (aBoolArray2831[xPos]) {
								Rasterizer2D.method2529(anIntArray2912[xPos], anIntArray2913[xPos], anIntArray2914[xPos], anIntArray2905[xPos], 16711935, 128);
							} else if (aBoolArray2910[xPos]) {
								Rasterizer2D.method2529(anIntArray2912[xPos], anIntArray2913[xPos], anIntArray2914[xPos], anIntArray2905[xPos], 16711680, 128);
							}
						}
					}

					Class43.method655(VarpBit.plane * -570926309, Class108_Sub10.myPlayer.anInt2394 * 171470795, Class108_Sub10.myPlayer.anInt2339 * 826764905, anInt2780 * 468305965, -518827825);
					anInt2780 = 0;
				} else if (40 == loginLoadingStage * 1315883169) {
					GameDefinition.method1107(StringConstants.CONNECTION_LOST + Class47.LINE_BREAK + StringConstants.PLEASE_WAIT_ESTABLISHING, false, -507251184);
				} else if (loginLoadingStage * 1315883169 == 45) {
					GameDefinition.method1107(StringConstants.aString1041, false, 2056448493);
				}
			}
		} else {
			ObjectDefinition.renderLoginAndWorldList(Class94.b12_full_font, Class2.p11_full_font, 1086962024);
		}

		Graphics var14;
		if (30 == loginLoadingStage * 1315883169 && 0 == anInt2916 * 1531358553 && !aBool2688) {
			try {
				var14 = Class1.aCanvas3.getGraphics();

				for (yPos = 0; yPos < anInt2907 * -792079877; ++yPos) {
					if (aBoolArray2910[yPos]) {
						Class63.aClass13_830.method270(var14, anIntArray2912[yPos], anIntArray2913[yPos], anIntArray2914[yPos], anIntArray2905[yPos], 974796737);
						aBoolArray2910[yPos] = false;
					}
				}

			} catch (Exception var9) {
				Class1.aCanvas3.repaint();
			}
		} else if (loginLoadingStage * 1315883169 > 0) {
			try {
				var14 = Class1.aCanvas3.getGraphics();
				Class63.aClass13_830.method261(var14, 0, 0, -909326761);
				aBool2688 = false;

				for (yPos = 0; yPos < anInt2907 * -792079877; ++yPos) {
					aBoolArray2910[yPos] = false;
				}

			} catch (Exception var10) {
				Class1.aCanvas3.repaint();
			}
		}
	}

	protected final void method3228(int var1) {
		if (ClientScript.mouseCapturer != null) {
			ClientScript.mouseCapturer.aBool381 = false;
		}

		ClientScript.mouseCapturer = null;
		if (Varp.loginConnection != null) {
			Varp.loginConnection.disconnect();
			Varp.loginConnection = null;
		}

		if (KeyFocusListener.keyFocusListener != null) {
			KeyFocusListener var2 = KeyFocusListener.keyFocusListener;
			synchronized (var2) {
				KeyFocusListener.keyFocusListener = null;
			}
		}

		Class26.method367(1081990922);
		Class108_Sub6.aClass71_1585 = null;
		if (null != Class2.aClass7_17) {
			Class2.aClass7_17.method121((byte) 58);
		}

		if (Class50.aClass7_697 != null) {
			Class50.aClass7_697.method121((byte) 44);
		}

		TextureLoader.method390(43089962);
		Object var8 = Class86.anObject1297;
		synchronized (var8) {
			if (0 != Class86.anInt1299 * 1495359531) {
				Class86.anInt1299 = -36413821;

				try {
					Class86.anObject1297.wait();
				} catch (InterruptedException var5) {
					;
				}
			}
		}

		Friend.method662((byte) -111);
	}

	void method3287(int var1) {
		if (Class78.anInt1229 * -1053722643 >= 4) {
			this.method3246("js5crc", -1271013870);
			loginLoadingStage = 1924330216;
		} else {
			if (Class78.anInt1230 * -1905143543 >= 4) {
				if (loginLoadingStage * 1315883169 <= 5) {
					this.method3246("js5io", -1271013870);
					loginLoadingStage = 1924330216;
					return;
				}

				anInt2736 = -2065650632;
				Class78.anInt1230 = -547805269;
			}

			if ((anInt2736 -= 882643057) * -2086817647 + 1 <= 0) {
				try {
					if (0 == anInt2702 * -90801939) {
						AnimationSkeletonSet.aClass85_2259 = ClientScriptMap.pringRequester.method816(Applet_Sub1.aString2701, IndexTable.anInt790 * -2083273005, -1135204174);
						anInt2702 += 1642505445;
					}

					if (anInt2702 * -90801939 == 1) {
						if (2 == AnimationSkeletonSet.aClass85_2259.anInt1292) {
							this.method3415(-1, (byte) 8);
							return;
						}

						if (AnimationSkeletonSet.aClass85_2259.anInt1292 == 1) {
							anInt2702 += 1642505445;
						}
					}

					if (2 == anInt2702 * -90801939) {
						SpotAnim.aGameConnection_2037 = new GameConnection((Socket) AnimationSkeletonSet.aClass85_2259.anObject1294, ClientScriptMap.pringRequester);
						RSByteBuffer var2 = new RSByteBuffer(5);
						var2.writeByte(15);
						var2.writeInt(60);
						SpotAnim.aGameConnection_2037.writeBytes(var2.buf, 0, 5);
						anInt2702 += 1642505445;
						Class108_Sub12.aLong1672 = Player.method3175(849846164) * -6175035716183725541L;
					}

					if (3 == anInt2702 * -90801939) {
						if (loginLoadingStage * 1315883169 > 5 && SpotAnim.aGameConnection_2037.available() <= 0) {
							if (Player.method3175(849846164) - Class108_Sub12.aLong1672 * -6521459471039733741L > 30000L) {
								this.method3415(-2, (byte) 87);
								return;
							}
						} else {
							int var4 = SpotAnim.aGameConnection_2037.read();
							if (0 != var4) {
								this.method3415(var4, (byte) 71);
								return;
							}

							anInt2702 += 1642505445;
						}
					}

					if (4 == anInt2702 * -90801939) {
						Class47.method680(SpotAnim.aGameConnection_2037, loginLoadingStage * 1315883169 > 20, 2016067664);
						AnimationSkeletonSet.aClass85_2259 = null;
						SpotAnim.aGameConnection_2037 = null;
						anInt2702 = 0;
						anInt2839 = 0;
					}
				} catch (IOException var3) {
					this.method3415(-3, (byte) 30);
				}
			}
		}
	}

	void method3369(int var1) {
		if (loginLoadingStage * 1315883169 != 1000) {
			boolean var2 = IsaacRandomGen.method734(1221347364);
			if (!var2) {
				this.method3287(-1262789193);
			}
		}
	}

	void method3415(int var1, byte var2) {
		AnimationSkeletonSet.aClass85_2259 = null;
		SpotAnim.aGameConnection_2037 = null;
		anInt2702 = 0;
		if (anInt2742 * 1455199325 == IndexTable.anInt790 * -2083273005) {
			IndexTable.anInt790 = Class26.anInt351 * 2139936523;
		} else {
			IndexTable.anInt790 = anInt2742 * 130259471;
		}

		anInt2839 += 1440494247;
		if (anInt2839 * -617982697 >= 2 && (var1 == 7 || var1 == 9)) {
			if (loginLoadingStage * 1315883169 <= 5) {
				this.method3246("js5connect_full", -1271013870);
				loginLoadingStage = 1924330216;
			} else {
				anInt2736 = -2065650632;
			}
		} else if (anInt2839 * -617982697 >= 2 && 6 == var1) {
			this.method3246("js5connect_outofdate", -1271013870);
			loginLoadingStage = 1924330216;
		} else if (anInt2839 * -617982697 >= 4) {
			if (loginLoadingStage * 1315883169 <= 5) {
				this.method3246("js5connect", -1271013870);
				loginLoadingStage = 1924330216;
			} else {
				anInt2736 = -2065650632;
			}
		}
	}

	static void method3552(int var0, int var1, int var2) {
		Class15.method298(Class108_Sub21.aClass1_1895, var0, var1, (short) 16256);
		Class108_Sub21.aClass1_1895 = null;
	}

	public static PaletteSprite[] method3553(AbstractIndex var0, String var1, String var2, byte var3) {
		int var4 = var0.method1005(var1, 1723285154);
		int var6 = var0.getFileForName(var4, var2, (byte) 0);
		PaletteSprite[] var5;
		if (!FriendsChatMember.method1686(var0, var4, var6, -1818735158)) {
			var5 = null;
		} else {
			PaletteSprite[] var8 = new PaletteSprite[Class9.anInt125 * 2039617935];

			for (int var9 = 0; var9 < Class9.anInt125 * 2039617935; ++var9) {
				PaletteSprite var7 = var8[var9] = new PaletteSprite();
				var7.anInt2418 = Class9.anInt122 * 93011449;
				var7.anInt2412 = Class9.anInt121 * -1272520477;
				var7.anInt2415 = Class88.anIntArray1316[var9];
				var7.anInt2411 = Class9.anIntArray123[var9];
				var7.anInt2413 = Class36.anIntArray514[var9];
				var7.anInt2414 = Class9.anIntArray126[var9];
				var7.palette = Class9.anIntArray130;
				var7.pixels = AnimationSkeletonSet.loadedCharacterPixels[var9];
			}

			ClientScript.method1679((byte) 82);
			var5 = var8;
		}

		return var5;
	}

	static void method3554(int var0) {
		for (Class108_Sub10 var1 = (Class108_Sub10) aClass101_2866.method1304(); var1 != null; var1 = (Class108_Sub10) aClass101_2866.method1303()) {
			int var3 = var1.anInt1653 * 1557246219;
			if (AbstractIndex.method1073(var3, 1190452518)) {
				boolean var4 = true;
				RSInterface[] var5 = RSInterface.interface_cache[var3];

				int var2;
				for (var2 = 0; var2 < var5.length; ++var2) {
					if (null != var5[var2]) {
						var4 = var5[var2].aBool1855;
						break;
					}
				}

				if (!var4) {
					var2 = (int) var1.key;
					RSInterface var6 = Class108_Sub16.method1926(var2, 654638590);
					if (var6 != null) {
						MouseInputHandler.method775(var6, -16054773);
					}
				}
			}
		}

	}
}
