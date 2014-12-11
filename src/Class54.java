
public final class Class54 {

   static String[] stringLocals;
   public static String operatingSystem;
   static int actionMenuWidth;
   static AbstractIndex aClass74_734;
   static CacheIndex fontIndex;


   static final void method723(byte var0) {
      MouseInputHandler.method775(Client.aClass108_Sub17_2877, -16054773);
      Class9.anInt127 += 2106622403;
      if(Client.aBool2885 && Client.aBool2882) {
         int var2 = MouseInputHandler.mouseX * -367052265;
         int var3 = MouseInputHandler.mouseY * 1533395117;
         var2 -= Client.anInt2879 * 1247450239;
         var3 -= Client.anInt2880 * 781803909;
         if(var2 < Client.anInt2883 * -651460611) {
            var2 = Client.anInt2883 * -651460611;
         }

         if(var2 + Client.aClass108_Sub17_2877.height * -1281443035 > Client.aClass108_Sub17_2878.height * -1281443035 + Client.anInt2883 * -651460611) {
            var2 = Client.aClass108_Sub17_2878.height * -1281443035 + Client.anInt2883 * -651460611 - Client.aClass108_Sub17_2877.height * -1281443035;
         }

         if(var3 < Client.anInt2884 * 1677738499) {
            var3 = Client.anInt2884 * 1677738499;
         }

         if(var3 + Client.aClass108_Sub17_2877.width * 334099177 > Client.anInt2884 * 1677738499 + Client.aClass108_Sub17_2878.width * 334099177) {
            var3 = Client.anInt2884 * 1677738499 + Client.aClass108_Sub17_2878.width * 334099177 - Client.aClass108_Sub17_2877.width * 334099177;
         }

         int var6 = var2 - Client.anInt2915 * 1257174125;
         int var7 = var3 - Client.anInt2786 * 1625164373;
         int var8 = Client.aClass108_Sub17_2877.anInt1834 * 1830792441;
         if(Class9.anInt127 * 63141611 > Client.aClass108_Sub17_2877.anInt1835 * -2066387505 && (var6 > var8 || var6 < -var8 || var7 > var8 || var7 < -var8)) {
            Client.aBool2888 = true;
         }

         int var10 = var2 - Client.anInt2883 * -651460611 + Client.aClass108_Sub17_2878.anInt1784 * -133270367;
         int var9 = var3 - Client.anInt2884 * 1677738499 + Client.aClass108_Sub17_2878.scrollPosition * -643576081;
         ClientScript script;
         if(null != Client.aClass108_Sub17_2877.anObjectArray1847 && Client.aBool2888) {
            script = new ClientScript();
            script.parentInterface = Client.aClass108_Sub17_2877;
            script.mouseX = var10 * 710802815;
            script.mouseY = var9 * 1647493163;
            script.parameters = Client.aClass108_Sub17_2877.anObjectArray1847;
            GameObject.executeScript(script, -1652091811);
         }

         if(MouseInputHandler.anInt769 * 1251070677 == 0) {
            if(Client.aBool2888) {
               if(null != Client.aClass108_Sub17_2877.anObjectArray1848) {
                  script = new ClientScript();
                  script.parentInterface = Client.aClass108_Sub17_2877;
                  script.mouseX = var10 * 710802815;
                  script.mouseY = var9 * 1647493163;
                  script.aClass108_Sub17_1641 = Client.aClass108_Sub17_2818;
                  script.parameters = Client.aClass108_Sub17_2877.anObjectArray1848;
                  GameObject.executeScript(script, -1878622480);
               }

               if(null != Client.aClass108_Sub17_2818) {
                  RSInterface var1 = Client.aClass108_Sub17_2877;
                  int var11 = Js5Request.method2602(Class32.method576(var1, -236298846), (byte) -77);
                  RSInterface var12;
                  if(0 == var11) {
                     var12 = null;
                  } else {
                     int var5 = 0;

                     while(true) {
                        if(var5 >= var11) {
                           var12 = var1;
                           break;
                        }

                        var1 = CacheIndexRequest.getInterfaceComponentForHash(var1.hoverPopup * -867206361, -1084920447);
                        if(null == var1) {
                           var12 = null;
                           break;
                        }

                        ++var5;
                     }
                  }

                  if(null != var12) {
                     Client.secureBuffer.writePacket(63);
                     Client.secureBuffer.method1749(Client.aClass108_Sub17_2877.itemID * 703308511, 98046537);
                     Client.secureBuffer.method1749(Client.aClass108_Sub17_2818.anInt1772 * -490007465, -1158372129);
                     Client.secureBuffer.method1749(Client.aClass108_Sub17_2818.itemID * 703308511, -1540402190);
                     Client.secureBuffer.method1856(Client.aClass108_Sub17_2877.interfaceHash * -1081473899, (short)19449);
                     Client.secureBuffer.method1846(Client.aClass108_Sub17_2818.interfaceHash * -1081473899, 655264497);
                     Client.secureBuffer.method1749(Client.aClass108_Sub17_2877.anInt1772 * -490007465, 862407246);
                  }
               }
            } else if((1 == Client.anInt2765 * -1978050497 || Class32.method577(Client.menuActionRow * 391839991 - 1, 1315292886)) && Client.menuActionRow * 391839991 > 2) {
               Applet_Sub1.setMenuPosAndDimmension(Client.anInt2879 * 1247450239 + Client.anInt2915 * 1257174125, Client.anInt2880 * 781803909 + Client.anInt2786 * 1625164373, (byte)125);
            } else if(Client.menuActionRow * 391839991 > 0) {
               Client.method3552(Client.anInt2915 * 1257174125 + Client.anInt2879 * 1247450239, Client.anInt2786 * 1625164373 + Client.anInt2880 * 781803909, -1806912840);
            }

            Client.aClass108_Sub17_2877 = null;
         }
      } else if(Class9.anInt127 * 63141611 > 1) {
         Client.aClass108_Sub17_2877 = null;
      }
   }

   Class54() throws Throwable {
      throw new Error();
   }
}
