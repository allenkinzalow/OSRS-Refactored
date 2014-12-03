
public class RSInterface extends Node {

   public int[] spritesY;
   public static boolean[] interfacesLoadedArray;
   public static AbstractIndex interfaceIndexReference;
   public static AbstractIndex aClass74_1765;
   public static CacheableNodeMap spriteMap = new CacheableNodeMap(200);
   public int widgetItemPaddingX = 0;
   public static CacheableNodeMap fontMap = new CacheableNodeMap(20);
   public static boolean mediaUnavailable = false;
   public int mediaRotationX = 0;
   public int[] conditionTypes;
   public int anInt1772 = 941549721;
   public Object[] anObjectArray1773;
   public int anInt1774;
   public int anInt1775;
   public int anInt1776 = 0;
   public int[] conditionValues;
   public int anInt1778 = 0;
   public int anInt1779 = 0;
   public int anInt1780;
   public Object[] anObjectArray1781;
   public int hoverPopup = -2102936727;
   public boolean aBool1783 = false;
   public int anInt1784 = 0;
   public int anInt1785 = 0;
   public int anInt1786 = 0;
   public int anInt1787 = 0;
   public int componentColor = 0;
   public Object[] anObjectArray1789;
   public int width = 0;
   public int actionType = 0;
   public boolean filled = false;
   public int alpha = 0;
   public Object[] anObjectArray1794;
   public Object[] anObjectArray1795;
   public int anInt1796 = 409060445;
   public int anInt1797 = 0;
   public boolean aBool1798 = false;
   public int anInt1799 = 0;
   public int anInt1800 = 0;
   public boolean flipImageHorizontal;
   public Object[] anObjectArray1802;
   public int mediaType = -1011789675;
   public int mediaID = -1321013799;
   public int anInt1805;
   int activeMediaID = -2076994841;
   public int mediaAnimID = -596245015;
   public int componentType;
   public int anInt1809 = 0;
   public int anInt1810 = 0;
   public int anInt1811 = -2000475851;
   public int mediaRotationY = 0;
   public int anInt1813 = 0;
   public Object[] anObjectArray1814;
   public int activeMediaAnimID = -1869860855;
   public boolean aBool1816 = false;
   public int fontID = -343759393;
   public String componentString = "";
   public int anInt1819;
   public int anInt1820 = 0;
   public String aString1821 = "";
   public Object[] anObjectArray1822;
   public boolean textCentered = false;
   public int anInt1824 = 0;
   public int widgetItemPaddingY = 0;
   public boolean aBool1826;
   public int[] spritesX;
   public int mouseOverActiveColor = 0;
   public String[] interfaceActions;
   public int anInt1830 = 0;
   public boolean flipImageVertical;
   public String[] aStringArray1832;
   public RSInterface aClass108_Sub17_1833 = null;
   public int anInt1834 = 0;
   public int anInt1835 = 0;
   public boolean aBool1836 = false;
   public static CacheableNodeMap interfaceMediaMap = new CacheableNodeMap(50);
   public boolean hasScript = false;
   public int interfaceHash = 585455939;
   public int mouseOverColor = 0;
   public Object[] anObjectArray1841;
   public Object[] anObjectArray1842;
   public Object[] anObjectArray1843;
   public String activeComponentString = "";
   public Object[] anObjectArray1845;
   public int anInt1846 = -785411763;
   public Object[] anObjectArray1847;
   public Object[] anObjectArray1848;
   public Object[] anObjectArray1849;
   public int height = 0;
   public Object[] onConfigTrigger;
   public int[] configChangeTriggers;
   public Object[] onItemUpdateTrigger;
   public int[] itemUpdateTriggers;
   public boolean aBool1855 = false;
   public int[] anIntArray1856;
   public Object[] anObjectArray1857;
   public static RSInterface[][] interface_cache;
   public Object[] anObjectArray1859;
   public int anInt1860 = 0;
   public Object[] anObjectArray1861;
   public int anInt1862 = 0;
   public int anInt1863 = 0;
   public Object[] anObjectArray1864;
   public Object[] anObjectArray1865;
   public int componentActiveColor = 0;
   public int[][] opcodes;
   public Object[] onSkillUpdateTrigger;
   public int[] sprites;
   public int anInt1870 = 149205505;
   public String spellName = "";
   public String tooltip;
   public int[] widgetItems;
   public int[] widgetItemAmounts;
   public int itemID;
   public Object[] anObjectArray1876;
   public int anInt1877;
   public int mediaZoom = 1060870108;
   public RSInterface[] aClass108_Sub17Array1879;
   public boolean aBool1880;
   public boolean aBool1881;
   public Object[] anObjectArray1882;
   public int anInt1883;
   public String selectedActionName = "";
   public int anInt1885;
   public int anInt1886 = 0;
   public int cycle;
   int activeMediaType = -1227663423;
   public static AbstractIndex aClass74_1889;
   public static final int anInt1890 = 58;


   void decodeInterface(RSByteBuffer buffer, int var2) {
      this.aBool1855 = false;
      this.componentType = buffer.readUByte() * -820395945;
      this.actionType = buffer.readUByte() * -1923306243;
      this.anInt1886 = buffer.readUShort(62060155) * 2093096323;
      this.anInt1778 = (this.anInt1776 = buffer.method1721(-1677425383) * 604525469) * -1179451723;
      this.anInt1779 = (this.anInt1824 = buffer.method1721(1090663751) * -1129233995) * -1011651193;
      this.height = buffer.readUShort(488704945) * 1526393005;
      this.width = buffer.readUShort(-377150642) * -955513511;
      this.alpha = buffer.readUByte() * -1040068631;
      this.hoverPopup = buffer.readUShort(144491818) * 2102936727;
      if('\uffff' == this.hoverPopup * -867206361) {
         this.hoverPopup = -2102936727;
      } else {
         this.hoverPopup = ((this.interfaceHash * -1081473899 & -65536) + this.hoverPopup * -867206361) * 2102936727;
      }

      this.anInt1846 = buffer.readUShort(-730615323) * 785411763;
      if(this.anInt1846 * 1461842043 == '\uffff') {
         this.anInt1846 = -785411763;
      }

      int conditionCount = buffer.readUByte();
      int condition;
      if(conditionCount > 0) {
         this.conditionTypes = new int[conditionCount];
         this.conditionValues = new int[conditionCount];

         for(condition = 0; condition < conditionCount; ++condition) {
            this.conditionTypes[condition] = buffer.readUByte();
            this.conditionValues[condition] = buffer.readUShort(-684651754);
         }
      }

      int opcodeCount = buffer.readUByte();
      int opcode;
      int subOpCode;
      int subOpCodeCount;
      if(opcodeCount > 0) {
         this.opcodes = new int[opcodeCount][];

         for(opcode = 0; opcode < opcodeCount; ++opcode) {
            subOpCodeCount = buffer.readUShort(-679594176);
            this.opcodes[opcode] = new int[subOpCodeCount];

            for(subOpCode = 0; subOpCode < subOpCodeCount; ++subOpCode) {
               this.opcodes[opcode][subOpCode] = buffer.readUShort(718411709);
               if(this.opcodes[opcode][subOpCode] == '\uffff') {
                  this.opcodes[opcode][subOpCode] = -1;
               }
            }
         }
      }

      if(0 == this.componentType * 942877543) {
         this.anInt1787 = buffer.readUShort(-384474177) * 1930051549;
         this.aBool1783 = buffer.readUByte() == 1;
      }

      if(1 == this.componentType * 942877543) {
         buffer.readUShort(13238408);
         buffer.readUByte();
      }

      if(this.componentType * 942877543 == 2) {
         this.widgetItems = new int[this.width * 334099177 * this.height * -1281443035];
         this.widgetItemAmounts = new int[this.width * 334099177 * this.height * -1281443035];
         int var6 = buffer.readUByte();
         if(var6 == 1) {
            this.anInt1830 = (this.anInt1830 * 956161607 | 268435456) * -1506120841;
         }

         int tempVal = buffer.readUByte();
         if(1 == tempVal) {
            this.anInt1830 = (this.anInt1830 * 956161607 | 1073741824) * -1506120841;
         }

         int var7 = buffer.readUByte();
         if(1 == var7) {
            this.anInt1830 = (this.anInt1830 * 956161607 | Integer.MIN_VALUE) * -1506120841;
         }

         int var3 = buffer.readUByte();
         if(var3 == 1) {
            this.anInt1830 = (this.anInt1830 * 956161607 | 536870912) * -1506120841;
         }

         this.widgetItemPaddingX = buffer.readUByte() * -728744665;
         this.widgetItemPaddingY = buffer.readUByte() * 956931859;
         this.spritesX = new int[20];
         this.spritesY = new int[20];
         this.sprites = new int[20];

         int index;
         for(index = 0; index < 20; ++index) {
            int hasSprite = buffer.readUByte();
            if(1 == hasSprite) {
               this.spritesX[index] = buffer.method1721(-1552824647);
               this.spritesY[index] = buffer.method1721(-849130157);
               this.sprites[index] = buffer.readInt();
            } else {
               this.sprites[index] = -1;
            }
         }

         this.interfaceActions = new String[5];

         for(index = 0; index < 5; ++index) {
            String action = buffer.getString_2((byte)8);
            if(action.length() > 0) {
               this.interfaceActions[index] = action;
               this.anInt1830 = (this.anInt1830 * 956161607 | 1 << 23 + index) * -1506120841;
            }
         }
      }

      if(this.componentType * 942877543 == 3) {
         this.filled = buffer.readUByte() == 1;
      }

      if(4 == this.componentType * 942877543 || 1 == this.componentType * 942877543) {
         this.anInt1863 = buffer.readUByte() * -1507823521;
         this.anInt1862 = buffer.readUByte() * 1183993449;
         this.anInt1820 = buffer.readUByte() * -775893061;
         this.fontID = buffer.readUShort(38812656) * 343759393;
         if(this.fontID * 1523886561 == '\uffff') {
            this.fontID = -343759393;
         }

         this.textCentered = buffer.readUByte() == 1;
      }

      if(4 == this.componentType * 942877543) {
         this.componentString = buffer.getString_2((byte)8);
         this.activeComponentString = buffer.getString_2((byte)8);
      }

      if(1 == this.componentType * 942877543 || this.componentType * 942877543 == 3 || 4 == this.componentType * 942877543) {
         this.componentColor = buffer.readInt() * 1601296361;
      }

      if(this.componentType * 942877543 == 3 || this.componentType * 942877543 == 4) {
         this.componentActiveColor = buffer.readInt() * -1833358683;
         this.mouseOverColor = buffer.readInt() * -736815091;
         this.mouseOverActiveColor = buffer.readInt() * 15777939;
      }

      if(this.componentType * 942877543 == 5) {
         this.anInt1870 = buffer.readInt() * -149205505;
         this.anInt1796 = buffer.readInt() * -409060445;
      }

      if(6 == this.componentType * 942877543) {
         this.mediaType = -1011789675;
         this.mediaID = buffer.readUShort(549790557) * 1321013799;
         if(this.mediaID * 2030124439 == '\uffff') {
            this.mediaID = -1321013799;
         }

         this.activeMediaType = -1227663423;
         this.activeMediaID = buffer.readUShort(1699352156) * 2076994841;
         if(this.activeMediaID * -394223831 == '\uffff') {
            this.activeMediaID = -2076994841;
         }

         this.mediaAnimID = buffer.readUShort(318118112) * 596245015;
         if(this.mediaAnimID * 866704807 == '\uffff') {
            this.mediaAnimID = -596245015;
         }

         this.activeMediaAnimID = buffer.readUShort(391640666) * 1869860855;
         if(this.activeMediaAnimID * -1534484025 == '\uffff') {
            this.activeMediaAnimID = -1869860855;
         }

         this.mediaZoom = buffer.readUShort(-1524335669) * -977233777;
         this.mediaRotationX = buffer.readUShort(98679774) * 1598312059;
         this.mediaRotationY = buffer.readUShort(-1369516736) * 40361315;
      }

      if(7 == this.componentType * 942877543) {
         this.widgetItems = new int[this.width * 334099177 * this.height * -1281443035];
         this.widgetItemAmounts = new int[this.width * 334099177 * this.height * -1281443035];
         this.anInt1863 = buffer.readUByte() * -1507823521;
         this.fontID = buffer.readUShort(462872649) * 343759393;
         if(this.fontID * 1523886561 == '\uffff') {
            this.fontID = -343759393;
         }

         this.textCentered = buffer.readUByte() == 1;
         this.componentColor = buffer.readInt() * 1601296361;
         this.widgetItemPaddingX = buffer.method1721(-404570924) * -728744665;
         this.widgetItemPaddingY = buffer.method1721(-2051597068) * 956931859;
         opcode = buffer.readUByte();
         if(1 == opcode) {
            this.anInt1830 = (this.anInt1830 * 956161607 | 1073741824) * -1506120841;
         }

         this.interfaceActions = new String[5];

         for(int actionIndex = 0; actionIndex < 5; ++actionIndex) {
            String action = buffer.getString_2((byte)8);
            if(action.length() > 0) {
               this.interfaceActions[actionIndex] = action;
               this.anInt1830 = (this.anInt1830 * 956161607 | 1 << 23 + actionIndex) * -1506120841;
            }
         }
      }

      if(this.componentType * 942877543 == 8) {
         this.componentString = buffer.getString_2((byte)8);
      }

      if(2 == this.actionType * -2005807019 || 2 == this.componentType * 942877543) {
         this.selectedActionName = buffer.getString_2((byte)8);
         this.spellName = buffer.getString_2((byte)8);
         opcode = buffer.readUShort(-499319275) & 63;
         this.anInt1830 = (this.anInt1830 * 956161607 | opcode << 11) * -1506120841;
      }

      if(this.actionType * -2005807019 == 1 || 4 == this.actionType * -2005807019 || 5 == this.actionType * -2005807019 || 6 == this.actionType * -2005807019) {
         this.tooltip = buffer.getString_2((byte)8);
         if(this.tooltip.length() == 0) {
            if(this.actionType * -2005807019 == 1) {
               this.tooltip = StringConstants.aString1021;
            }

            if(4 == this.actionType * -2005807019) {
               this.tooltip = StringConstants.SELECT_MENU;
            }

            if(this.actionType * -2005807019 == 5) {
               this.tooltip = StringConstants.SELECT_MENU;
            }

            if(this.actionType * -2005807019 == 6) {
               this.tooltip = StringConstants.CONTINUE_MENU;
            }
         }
      }

      if(this.actionType * -2005807019 == 1 || 4 == this.actionType * -2005807019 || 5 == this.actionType * -2005807019) {
         this.anInt1830 = (this.anInt1830 * 956161607 | 4194304) * -1506120841;
      }

      if(this.actionType * -2005807019 == 6) {
         this.anInt1830 = (this.anInt1830 * 956161607 | 1) * -1506120841;
      }
   }

   void decodeActiveInterface(RSByteBuffer buffer, int var2) {
      buffer.readUByte();
      this.aBool1855 = true;
      this.componentType = buffer.readUByte() * -820395945;
      this.anInt1886 = buffer.readUShort(1014343736) * 2093096323;
      this.anInt1778 = (this.anInt1776 = buffer.method1721(-1635210062) * 604525469) * -1179451723;
      this.anInt1779 = (this.anInt1824 = buffer.method1721(-1592402753) * -1129233995) * -1011651193;
      this.height = buffer.readUShort(1680164131) * 1526393005;
      if(9 == this.componentType * 942877543) {
         this.width = buffer.method1721(-765028792) * -955513511;
      } else {
         this.width = buffer.readUShort(-22613418) * -955513511;
      }

      this.hoverPopup = buffer.readUShort(-35935591) * 2102936727;
      if(this.hoverPopup * -867206361 == '\uffff') {
         this.hoverPopup = -2102936727;
      } else {
         this.hoverPopup = (this.hoverPopup * -867206361 + (this.interfaceHash * -1081473899 & -65536)) * 2102936727;
      }

      this.aBool1783 = buffer.readUByte() == 1;
      if(0 == this.componentType * 942877543) {
         this.anInt1786 = buffer.readUShort(562998060) * -1473181593;
         this.anInt1787 = buffer.readUShort(1204256843) * 1930051549;
      }

      if(this.componentType * 942877543 == 5) {
         this.anInt1870 = buffer.readInt() * -149205505;
         this.anInt1797 = buffer.readUShort(681422318) * 1184057095;
         this.aBool1798 = buffer.readUByte() == 1;
         this.alpha = buffer.readUByte() * -1040068631;
         this.anInt1799 = buffer.readUByte() * 682476773;
         this.anInt1800 = buffer.readInt() * -1871143695;
         this.flipImageHorizontal = buffer.readUByte() == 1;
         this.flipImageVertical = buffer.readUByte() == 1;
      }

      if(6 == this.componentType * 942877543) {
         this.mediaType = -1011789675;
         this.mediaID = buffer.readUShort(-372195579) * 1321013799;
         if(this.mediaID * 2030124439 == '\uffff') {
            this.mediaID = -1321013799;
         }

         this.anInt1809 = buffer.method1721(-540534725) * -1402493637;
         this.anInt1810 = buffer.method1721(376377865) * -1786754887;
         this.mediaRotationX = buffer.readUShort(-647044531) * 1598312059;
         this.mediaRotationY = buffer.readUShort(-428121902) * 40361315;
         this.anInt1813 = buffer.readUShort(965109577) * -1299307865;
         this.mediaZoom = buffer.readUShort(1945899096) * -977233777;
         this.mediaAnimID = buffer.readUShort(1688640253) * 596245015;
         if(this.mediaAnimID * 866704807 == '\uffff') {
            this.mediaAnimID = -596245015;
         }

         this.aBool1816 = buffer.readUByte() == 1;
      }

      if(4 == this.componentType * 942877543) {
         this.fontID = buffer.readUShort(1701215517) * 343759393;
         if('\uffff' == this.fontID * 1523886561) {
            this.fontID = -343759393;
         }

         this.componentString = buffer.getString_2((byte)8);
         this.anInt1820 = buffer.readUByte() * -775893061;
         this.anInt1863 = buffer.readUByte() * -1507823521;
         this.anInt1862 = buffer.readUByte() * 1183993449;
         this.textCentered = buffer.readUByte() == 1;
         this.componentColor = buffer.readInt() * 1601296361;
      }

      if(this.componentType * 942877543 == 3) {
         this.componentColor = buffer.readInt() * 1601296361;
         this.filled = buffer.readUByte() == 1;
         this.alpha = buffer.readUByte() * -1040068631;
      }

      if(this.componentType * 942877543 == 9) {
         this.anInt1811 = buffer.readUByte() * -2000475851;
         this.componentColor = buffer.readInt() * 1601296361;
      }

      this.anInt1830 = buffer.method1809(-215406318) * -1506120841;
      this.aString1821 = buffer.getString_2((byte)8);
      int var4 = buffer.readUByte();
      if(var4 > 0) {
         this.aStringArray1832 = new String[var4];

         for(int var3 = 0; var3 < var4; ++var3) {
            this.aStringArray1832[var3] = buffer.getString_2((byte)8);
         }
      }

      this.anInt1834 = buffer.readUByte() * 689001801;
      this.anInt1835 = buffer.readUByte() * 435583279;
      this.aBool1836 = buffer.readUByte() == 1;
      this.selectedActionName = buffer.getString_2((byte)8);
      
      this.anObjectArray1861 = this.readScriptParameters(buffer, (byte)4);
      this.anObjectArray1802 = this.readScriptParameters(buffer, (byte)59);
      this.anObjectArray1876 = this.readScriptParameters(buffer, (byte)111);
      this.anObjectArray1773 = this.readScriptParameters(buffer, (byte)83);
      this.anObjectArray1849 = this.readScriptParameters(buffer, (byte)39);
      this.onConfigTrigger = this.readScriptParameters(buffer, (byte)53);
      this.onItemUpdateTrigger = this.readScriptParameters(buffer, (byte)48);
      this.onSkillUpdateTrigger = this.readScriptParameters(buffer, (byte)116);
      this.anObjectArray1857 = this.readScriptParameters(buffer, (byte)75);
      this.anObjectArray1795 = this.readScriptParameters(buffer, (byte)122);
      this.anObjectArray1845 = this.readScriptParameters(buffer, (byte)88);
      this.anObjectArray1794 = this.readScriptParameters(buffer, (byte)48);
      this.anObjectArray1841 = this.readScriptParameters(buffer, (byte)124);
      this.anObjectArray1842 = this.readScriptParameters(buffer, (byte)78);
      this.anObjectArray1843 = this.readScriptParameters(buffer, (byte)41);
      this.anObjectArray1847 = this.readScriptParameters(buffer, (byte)105);
      this.anObjectArray1848 = this.readScriptParameters(buffer, (byte)59);
      this.anObjectArray1859 = this.readScriptParameters(buffer, (byte)3);
      this.configChangeTriggers = this.readTriggers(buffer, 2025977477);
      this.itemUpdateTriggers = this.readTriggers(buffer, 2102476719);
      this.anIntArray1856 = this.readTriggers(buffer, 2079814240);
   }

   Object[] readScriptParameters(RSByteBuffer buffer, byte var2) {
      int length = buffer.readUByte();
      if(length == 0) {
         return null;
      } else {
         Object[] params = new Object[length];

         for(int paramIndex = 0; paramIndex < length; ++paramIndex) {
            int var4 = buffer.readUByte();
            if(0 == var4) {
               params[paramIndex] = new Integer(buffer.readInt());
            } else if(var4 == 1) {
               params[paramIndex] = buffer.getString_2((byte)8);
            }
         }

         this.hasScript = true;
         return params;
      }
   }

   int[] readTriggers(RSByteBuffer var1, int var2) {
      int triggerCount = var1.readUByte();
      if(0 == triggerCount) {
         return null;
      } else {
         int[] triggers = new int[triggerCount];

         for(int triggerIndex = 0; triggerIndex < triggerCount; ++triggerIndex) {
            triggers[triggerIndex] = var1.readInt();
         }

         return triggers;
      }
   }

   public void switchItemSlots(int moveFrom, int moveTo, int var3) {
      int toSwitch = this.widgetItems[moveTo];
      this.widgetItems[moveTo] = this.widgetItems[moveFrom];
      this.widgetItems[moveFrom] = toSwitch;
      toSwitch = this.widgetItemAmounts[moveTo];
      this.widgetItemAmounts[moveTo] = this.widgetItemAmounts[moveFrom];
      this.widgetItemAmounts[moveFrom] = toSwitch;
   }

   public RGBSprite method1938(boolean active, int var2) {
      mediaUnavailable = false;
      int spriteID;
      if(active) {
         spriteID = this.anInt1796 * -2127179765;
      } else {
         spriteID = this.anInt1870 * -987713025;
      }

      if(-1 == spriteID) {
         return null;
      } else {
         long spriteHash = ((long)(this.anInt1800 * -563686383) << 40) + (long)spriteID + ((long)(this.anInt1799 * 411719917) << 36) + ((this.flipImageHorizontal?1L:0L) << 38) + ((this.flipImageVertical?1L:0L) << 39);
         RGBSprite sprite = (RGBSprite)spriteMap.get(spriteHash);
         if(sprite != null) {
            return sprite;
         } else {
            sprite = ChatMessage.method2016(aClass74_1765, spriteID, 0, (byte)17);
            if(sprite == null) {
               mediaUnavailable = true;
               return null;
            } else {
               if(this.flipImageHorizontal) {
                  sprite.flipHorizontal();
               }

               if(this.flipImageVertical) {
                  sprite.flipVertical();
               }

               if(this.anInt1799 * 411719917 > 0) {
                  sprite.method2782(this.anInt1799 * 411719917);
               }

               if(this.anInt1799 * 411719917 >= 1) {
                  sprite.setPixels(1);
               }

               if(this.anInt1799 * 411719917 >= 2) {
                  sprite.setPixels(16777215);
               }

               if(this.anInt1800 * -563686383 != 0) {
                  sprite.method2814(this.anInt1800 * -563686383);
               }

               spriteMap.put(sprite, spriteHash);
               return sprite;
            }
         }
      }
   }

   public void method1940(int var1, String var2, int var3) {
      if(this.aStringArray1832 == null || this.aStringArray1832.length <= var1) {
         String[] var4 = new String[var1 + 1];
         if(this.aStringArray1832 != null) {
            for(int var5 = 0; var5 < this.aStringArray1832.length; ++var5) {
               var4[var5] = this.aStringArray1832[var5];
            }
         }

         this.aStringArray1832 = var4;
      }

      this.aStringArray1832[var1] = var2;
   }

   public RSFont getWidgetFont(int var1) {
      mediaUnavailable = false;
      if(this.fontID * 1523886561 == -1) {
         return null;
      } else {
         RSFont font = (RSFont)fontMap.get((long)(this.fontID * 1523886561));
         if(font == null) {
            font = ItemDefinition.loadFont(aClass74_1765, VarpBit.aClass74_1954, this.fontID * 1523886561, 0, 1909425233);
            if(null != font) {
               fontMap.put(font, (long)(this.fontID * 1523886561));
            } else {
               mediaUnavailable = true;
            }

            return font;
         } else {
            return font;
         }
      }
   }

   public RGBSprite method1959(int spriteIndex, int var2) {
      mediaUnavailable = false;
      if(spriteIndex >= 0 && spriteIndex < this.sprites.length) {
         int spriteIdentifier = this.sprites[spriteIndex];
         if(-1 == spriteIdentifier) {
            return null;
         } else {
            RGBSprite sprite = (RGBSprite)spriteMap.get((long)spriteIdentifier);
            if(null != sprite) {
               return sprite;
            } else {
               sprite = ChatMessage.method2016(aClass74_1765, spriteIdentifier, 0, (byte)43);
               if(null != sprite) {
                  spriteMap.put(sprite, (long)spriteIdentifier);
               } else {
                  mediaUnavailable = true;
               }

               return sprite;
            }
         }
      } else {
         return null;
      }
   }

   public RSInterface() {
      this.tooltip = StringConstants.aString1021;
      this.itemID = -199268639;
      this.anInt1775 = 0;
      this.anInt1877 = 0;
      this.anInt1805 = 0;
      this.aBool1880 = false;
      this.aBool1881 = false;
      this.anInt1774 = -1806530859;
      this.anInt1883 = 0;
      this.anInt1819 = 0;
      this.anInt1885 = 0;
      this.anInt1780 = -1057491055;
      this.cycle = 1355864039;
      this.aBool1826 = false;
   }

   public ModelRasterizer getInterfaceMediaRasterizer(AnimationDefinition animDef, int var2, boolean var3, EquipmentKit equipmentKit, int var5) {
      mediaUnavailable = false;
      int mediaType;
      int modelID;
      if(var3) {
         mediaType = this.activeMediaType * -565921727;
         modelID = this.activeMediaID * -394223831;
      } else {
         mediaType = this.mediaType * -1873872195;
         modelID = this.mediaID * 2030124439;
      }

      if(0 == mediaType) {
         return null;
      } else if(1 == mediaType && -1 == modelID) {
         return null; 
      } else {
         ModelRasterizer rasterizer = (ModelRasterizer)interfaceMediaMap.get((long)(modelID + (mediaType << 16)));
         if(rasterizer == null) {
            RSModel model;
            if(mediaType == 1) { // regular model
               model = RSModel.decodeModel(Class121.aClass74_1495, modelID, 0);
               if(model == null) {
                  mediaUnavailable = true;
                  return null;
               }

               rasterizer = model.createModelRasterizer(64, 768, -50, -10, -50);
            }

            if(2 == mediaType) { // npc
               model = Class108_Sub12.getNPCDefForID(modelID, -137084291).method2286((byte)117);
               if(null == model) {
                  mediaUnavailable = true;
                  return null;
               }

               rasterizer = model.createModelRasterizer(64, 768, -50, -10, -50);
            }

            if(3 == mediaType) { // equipment kit (this could be a generated player both IDK & Equipment)
               if(null == equipmentKit) {
                  return null;
               }

               model = equipmentKit.getModel((byte)-54);
               if(null == model) {
                  mediaUnavailable = true;
                  return null;
               }

               rasterizer = model.createModelRasterizer(64, 768, -50, -10, -50);
            }

            if(mediaType == 4) { // item definition
               ItemDefinition definition = AnimationDefinition.getItemDefinition(modelID, -376950111);
               model = definition.getInventoryModel(10, 1826612898);
               if(null == model) {
                  mediaUnavailable = true;
                  return null;
               }

               rasterizer = model.createModelRasterizer(64 + definition.ambient * -1194292751, definition.contrast * 1777919357 + 768, -50, -10, -50);
            }

            interfaceMediaMap.put(rasterizer, (long)(modelID + (mediaType << 16)));
         }

         if(null != animDef) {
            rasterizer = animDef.method2233(rasterizer, var2, (byte)75);
         }

         return rasterizer;
      }
   }

   static char method1980(char var0, short var1) {
      return (char)(198 == var0?'E':(var0 == 230?'e':(223 == var0?'s':(var0 != 338?(var0 == 339?'e':'\u0000'):'E'))));
   }
}
