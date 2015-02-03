import java.applet.Applet;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

   static int anInt2685 = -1908992707;
   static int anInt2686 = 0;
   static long aLong2687 = 0L;
   protected static volatile boolean aBool2688 = true;
   boolean aBool2689 = false;
   static int anInt2690 = -732545540;
   static int anInt2691 = 1358855988;
   static boolean aBool2692 = false;
   protected static volatile boolean aBool2693 = false;
   static long[] aLongArray2694 = new long[32];
   protected static int clientFPS = 0;
   static long[] aLongArray2696 = new long[32];
   static volatile long aLong2697 = 0L;
   static Applet_Sub1 currentApplet = null;
   static volatile boolean focusGained = true;
   public static final int anInt2700 = 154;
   static String selectedWorldIP;

   public static void setApplet(Applet var0, String var1, int var2) {
      Class56.anApplet756 = var0;
      Class56.operatingSystem = var1;
   }


   protected final void method3184(int width, int height, int var3, int var4) {
      try {
         if(null != currentApplet) {
            anInt2686 += 962032645;
            if(anInt2686 * 401291469 >= 3) {
               this.sendError("alreadyloaded", -1271013870);
            } else {
               this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            }
         } else {
            currentApplet = this;
            ProducingGraphicsBuffer.clientWidth = width * -722659069;
            ProducingGraphicsBuffer.clientHeight = height * -1515364509;
            RuntimeException_Sub1.anInt2627 = var3 * -1328331175;
            RuntimeException_Sub1.anApplet2631 = this;
            if(null == ClientScriptMap.sessionRequestWorker) {
               ClientScriptMap.sessionRequestWorker = new SessionRequestWorker();
            }

            ClientScriptMap.sessionRequestWorker.submitRunnableSession(this, 1, -1962227119);
         }
      } catch (Exception var6) {
         World.method647((String)null, var6, 926745782);
         this.sendError("crash", -1271013870);
      }
   }

   protected final synchronized void method3185(byte var1) {
      Object var2;
      if(UnderlayDefinition.aFrame2150 != null) {
         var2 = UnderlayDefinition.aFrame2150;
      } else {
         var2 = this;
      }

      if(ContextMenuRow.aCanvas3 != null) {
         ContextMenuRow.aCanvas3.removeFocusListener(this);
         ((Container)var2).remove(ContextMenuRow.aCanvas3);
      }

      ContextMenuRow.aCanvas3 = new Canvas_Sub1(this);
      ((Container)var2).add(ContextMenuRow.aCanvas3);
      ContextMenuRow.aCanvas3.setSize(ProducingGraphicsBuffer.clientWidth * 1080367531, ProducingGraphicsBuffer.clientHeight * -2030626229);
      ContextMenuRow.aCanvas3.setVisible(true);
      if(UnderlayDefinition.aFrame2150 != null) {
         Insets var3 = UnderlayDefinition.aFrame2150.getInsets();
         ContextMenuRow.aCanvas3.setLocation(var3.left, var3.top);
      } else {
         ContextMenuRow.aCanvas3.setLocation(0, 0);
      }

      ContextMenuRow.aCanvas3.addFocusListener(this);
      ContextMenuRow.aCanvas3.requestFocus();
      aBool2688 = true;
      aBool2693 = false;
      aLong2697 = Timer.getCurrentTimeMillis(849846164) * 516356414042863577L;
   }

   final synchronized void method3188(byte var1) {
      if(!aBool2692) {
         aBool2692 = true;

         try {
            ContextMenuRow.aCanvas3.removeFocusListener(this);
         } catch (Exception var6) {
            ;
         }

         try {
            this.method3228(612744672);
         } catch (Exception var5) {
            ;
         }

         if(null != UnderlayDefinition.aFrame2150) {
            try {
               System.exit(0);
            } catch (Throwable var4) {
               ;
            }
         }

         if(ClientScriptMap.sessionRequestWorker != null) {
            try {
               ClientScriptMap.sessionRequestWorker.method839(-818149209);
            } catch (Exception var3) {
               ;
            }
         }

         this.method3201(851563284);
      }
   }

   void process(short var1) {
      long currentTime = Timer.getCurrentTimeMillis(849846164);
      long lastTime = aLongArray2696[Class108_Sub20_Sub14_Sub6.anInt2607 * 962733033];
      aLongArray2696[Class108_Sub20_Sub14_Sub6.anInt2607 * 962733033] = currentTime;
      Class108_Sub20_Sub14_Sub6.anInt2607 = (Class108_Sub20_Sub14_Sub6.anInt2607 * 962733033 + 1 & 31) * 737600601;
      if(0L != lastTime && currentTime > lastTime) {
         int timeElapsed = (int)(currentTime - lastTime);
         clientFPS = ((timeElapsed >> 1) + 32000) / timeElapsed * 1664500787;
      }

      if((anInt2691 += 1265438097) * 310858609 - 1 > 50) {
         anInt2691 += 1152604590;
         aBool2688 = true;
         ContextMenuRow.aCanvas3.setSize(ProducingGraphicsBuffer.clientWidth * 1080367531, ProducingGraphicsBuffer.clientHeight * -2030626229);
         ContextMenuRow.aCanvas3.setVisible(true);
         if(null != UnderlayDefinition.aFrame2150) {
            Insets var7 = UnderlayDefinition.aFrame2150.getInsets();
            ContextMenuRow.aCanvas3.setLocation(var7.left, var7.top);
         } else {
            ContextMenuRow.aCanvas3.setLocation(0, 0);
         }
      }

      this.method3198((byte)-56);
   }

   public void start() {
      if(this == currentApplet) {
         if(!aBool2692) {
            aLong2687 = 0L;
         }
      }
   }

   public final void windowClosed(WindowEvent var1) {}

   public void destroy() {
      if(this == currentApplet) {
         if(!aBool2692) {
            aLong2687 = Timer.getCurrentTimeMillis(849846164) * 258775077807745085L;
            Class108_Sub22.sleep(5000L);
            this.method3188((byte)95);
         }
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final synchronized void paint(Graphics var1) {
      if(this == currentApplet) {
         if(!aBool2692) {
            aBool2688 = true;
            if(null != MachineInformation.javaVersion) {
               if(MachineInformation.javaVersion.startsWith("1.5")) {
                  if(Timer.getCurrentTimeMillis(849846164) - -3473457553222264727L * aLong2697 > 1000L) {
                     Rectangle var2 = var1.getClipBounds();
                     if(var2 != null) {
                        if(var2.width < ProducingGraphicsBuffer.clientWidth * 1080367531) {
                           return;
                        }

                        if(var2.height < ProducingGraphicsBuffer.clientHeight * -2030626229) {
                           return;
                        }
                     }

                     aBool2693 = true;
                  }
               }
            }
         }
      }
   }

   public final void windowActivated(WindowEvent var1) {}

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeiconified(WindowEvent var1) {}

   public final void windowIconified(WindowEvent var1) {}

   public final void windowOpened(WindowEvent var1) {}

   protected abstract void method3196(byte var1);

   protected abstract void method3198(byte var1);

   protected abstract void method3201(int var1);

   protected abstract void method3210(int var1);

   public final void windowDeactivated(WindowEvent var1) {}

   public void run() {
      try {
         if(null != SessionRequestWorker.javaVendor) {
            String var1 = SessionRequestWorker.javaVendor.toLowerCase();
            if(var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = MachineInformation.javaVersion;
               if(var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.sendError("wrongjava", -1271013870);
                  return;
               }

               if(var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && UnderlayDefinition.isNumber(var2.charAt(var3), 1285636105); ++var3) {
                     ;
                  }

                  String var4 = var2.substring(6, var3);
                  boolean var5 = false;
                  boolean var6 = false;
                  int var7 = 0;
                  int var8 = var4.length();
                  int var9 = 0;

                  boolean var11;
                  while(true) {
                     if(var9 >= var8) {
                        var11 = var6;
                        break;
                     }

                     label165: {
                        char var10 = var4.charAt(var9);
                        if(0 == var9) {
                           if(var10 == 45) {
                              var5 = true;
                              break label165;
                           }

                           if(43 == var10) {
                              break label165;
                           }
                        }

                        int var18;
                        if(var10 >= 48 && var10 <= 57) {
                           var18 = var10 - 48;
                        } else if(var10 >= 65 && var10 <= 90) {
                           var18 = var10 - 55;
                        } else {
                           if(var10 < 97 || var10 > 122) {
                              var11 = false;
                              break;
                           }

                           var18 = var10 - 87;
                        }

                        if(var18 >= 10) {
                           var11 = false;
                           break;
                        }

                        if(var5) {
                           var18 = -var18;
                        }

                        int var12 = var18 + var7 * 10;
                        if(var7 != var12 / 10) {
                           var11 = false;
                           break;
                        }

                        var7 = var12;
                        var6 = true;
                     }

                     ++var9;
                  }

                  if(var11 && VertexNormal.method692(var4, 1850671615) < 10) {
                     this.sendError("wrongjava", -1271013870);
                     return;
                  }
               }

               anInt2685 = -955028943;
            }
         }

         this.setFocusCycleRoot(true);
         this.method3185((byte)95);
         Class63.aClass13_830 = ItemDefinition.method2127(ProducingGraphicsBuffer.clientWidth * 1080367531, ProducingGraphicsBuffer.clientHeight * -2030626229, ContextMenuRow.aCanvas3, 95766287);
         this.method3196((byte)2);

         Object var16;
         try {
            var16 = new NanoTimer();
         } catch (Throwable var14) {
            var16 = new Class53_Sub1();
         }

         Timer.clientTimer = (Timer)var16;

         while(0L == 3640810457273822997L * aLong2687 || Timer.getCurrentTimeMillis(849846164) < 3640810457273822997L * aLong2687) {
            Class100.anInt1384 = Timer.clientTimer.method714(anInt2690 * -2113736069, anInt2685 * -328177131, -665517638) * -244555733;

            for(int var17 = 0; var17 < Class100.anInt1384 * -969843069; ++var17) {
               this.method3224(760507799);
            }

            this.process((short)23545);
            Renderable.method2491(ClientScriptMap.sessionRequestWorker, ContextMenuRow.aCanvas3, (short)-23977);
         }
      } catch (Exception var15) {
         World.method647((String)null, var15, 926745782);
         this.sendError("crash", -1271013870);
      }

      this.method3188((byte)20);
   }

   void method3224(int var1) {
      long var2 = Timer.getCurrentTimeMillis(849846164);
      long var4 = aLongArray2694[Timer.anInt723 * -1099924813];
      aLongArray2694[Timer.anInt723 * -1099924813] = var2;
      Timer.anInt723 = (1 + Timer.anInt723 * -1099924813 & 31) * 669828219;
      if(0L != var4 && var2 > var4) {
         ;
      }

      synchronized(this) {
         LoginHandler.focusGained = focusGained;
      }

      this.method3210(353301511);
   }

   protected abstract void method3228(int var1);

   public void stop() {
      if(currentApplet == this) {
         if(!aBool2692) {
            aLong2687 = (Timer.getCurrentTimeMillis(849846164) + 4000L) * 258775077807745085L;
         }
      }
   }

   protected void sendError(String var1, int var2) {
      if(!this.aBool2689) {
         this.aBool2689 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var4) {
            ;
         }
      }
   }

   public final void focusLost(FocusEvent var1) {
      focusGained = false;
   }

   public final void focusGained(FocusEvent var1) {
      focusGained = true;
      aBool2688 = true;
   }

   protected final boolean hasCorrectHost(int var1) {
      String host = this.getDocumentBase().getHost().toLowerCase();
      if(!host.equals("jagex.com") && !host.endsWith(".jagex.com")) {
         if(!host.equals("runescape.com") && !host.endsWith(".runescape.com")) {
            if(!host.equals("mechscape.com") && !host.endsWith(".mechscape.com")) {
               if(host.endsWith("127.0.0.1")) {
                  return true;
               } else {
                  while(host.length() > 0 && host.charAt(host.length() - 1) >= 48 && host.charAt(host.length() - 1) <= 57) {
                     host = host.substring(0, host.length() - 1);
                  }

                  if(host.endsWith("192.168.1.")) {
                     return true;
                  } else {
                     return true;
                  }
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public abstract void init();

   static final int method3283(int var0, int var1, short var2) {
      int var3 = Projectile.method2988(var0 - 1, var1 - 1, (byte)45) + Projectile.method2988(var0 + 1, var1 - 1, (byte)89) + Projectile.method2988(var0 - 1, 1 + var1, (byte)53) + Projectile.method2988(1 + var0, 1 + var1, (byte)127);
      int var5 = Projectile.method2988(var0 - 1, var1, (byte)82) + Projectile.method2988(1 + var0, var1, (byte)74) + Projectile.method2988(var0, var1 - 1, (byte)122) + Projectile.method2988(var0, var1 + 1, (byte)48);
      int var4 = Projectile.method2988(var0, var1, (byte)38);
      return var5 / 8 + var3 / 16 + var4 / 4;
   }
}
