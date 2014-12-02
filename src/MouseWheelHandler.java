import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseWheelHandler extends Class71 implements MouseWheelListener {

   int mouseWheelRotation = 0;


   public void method986(Component var1, short var2) {
      var1.addMouseWheelListener(this);
   }

   public void method983(Component var1, int var2) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized int method974(int var1) {
      int var2 = this.mouseWheelRotation * -72280913;
      this.mouseWheelRotation = 0;
      return var2;
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.mouseWheelRotation += var1.getWheelRotation() * -1884110257;
   }
}
