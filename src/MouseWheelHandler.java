import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseWheelHandler extends AbstractMouseWheel implements MouseWheelListener {

   int mouseWheelRotation = 0;


   public void addListener(Component component, short var2) {
      component.addMouseWheelListener(this);
   }

   public void removeListener(Component component, int var2) {
      component.removeMouseWheelListener(this);
   }

   public synchronized int resetAndGetMouseRotation(int var1) {
      int var2 = this.mouseWheelRotation * -72280913;
      this.mouseWheelRotation = 0;
      return var2;
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.mouseWheelRotation += var1.getWheelRotation() * -1884110257;
   }
}
