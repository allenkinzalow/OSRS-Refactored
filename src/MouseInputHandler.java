import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputHandler implements MouseListener, MouseMotionListener, FocusListener {

   public static int mouseY = 0;
   static volatile int anInt765 = 0;
   static volatile int anInt766 = 0;
   static volatile int anInt767 = 1660809425;
   static volatile long aLong768 = 0L;
   public static int anInt769 = 0;
   public static int mouseX = 0;
   static int actionMenuY;
   static volatile int anInt772 = 0;
   static volatile int anInt773 = 0;
   public static int anInt774 = 0;
   static MouseInputHandler aClass58_775 = new MouseInputHandler();
   static volatile int anInt776 = 0;
   static volatile int anInt777 = 1505665339;
   public static int anInt778 = 0;
   public static long aLong779 = 0L;
   public static int anInt780 = 0;


   public final synchronized void mousePressed(MouseEvent var1) {
      if(null != aClass58_775) {
         anInt765 = 0;
         anInt773 = var1.getX() * 1143934983;
         anInt776 = var1.getY() * -71262799;
         aLong768 = Player.method3175(849846164) * 8929978800836815775L;
         if(var1.isAltDown()) {
            anInt772 = -2026519500;
            anInt766 = 714924716;
         } else if(var1.isMetaDown()) {
            anInt772 = 1134223898;
            anInt766 = 357462358;
         } else {
            anInt772 = -1580371699;
            anInt766 = 178731179;
         }
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if(aClass58_775 != null) {
         anInt765 = 0;
         anInt766 = 0;
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   public final void mouseClicked(MouseEvent var1) {
      if(var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      if(null != aClass58_775) {
         anInt765 = 0;
         anInt767 = var1.getX() * -1660809425;
         anInt777 = var1.getY() * -1505665339;
      }
   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if(aClass58_775 != null) {
         anInt765 = 0;
         anInt767 = 1660809425;
         anInt777 = 1505665339;
      }
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if(null != aClass58_775) {
         anInt765 = 0;
         anInt767 = var1.getX() * -1660809425;
         anInt777 = var1.getY() * -1505665339;
      }
   }

   public final void focusGained(FocusEvent var1) {}

   public final synchronized void focusLost(FocusEvent var1) {
      if(null != aClass58_775) {
         anInt766 = 0;
      }
   }

   public static int method769(CharSequence sequence, int var1) {
      int length = sequence.length();
      int position = 0;

      for(int charPosition = 0; charPosition < length; ++charPosition) {
         position = (position << 5) - position + CullingCluster.method671(sequence.charAt(charPosition), -1279426300);
      }

      return position;
   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      if(aClass58_775 != null) {
         anInt765 = 0;
         anInt767 = var1.getX() * -1660809425;
         anInt777 = var1.getY() * -1505665339;
      }
   }

   static void method775(RSInterface var0, int var1) {
      if(Client.anInt2854 * -1738393899 == var0.cycle * -278285271) {
         Client.aBoolArray2909[var0.anInt1780 * -1372432753] = true;
      }
   }

}
