import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class Canvas_Sub1 extends Canvas {

   Component aComponent2287;


   public final void update(Graphics var1) {
      this.aComponent2287.update(var1);
   }

   Canvas_Sub1(Component var1) {
      this.aComponent2287 = var1;
   }

   public final void paint(Graphics var1) {
      this.aComponent2287.paint(var1);
   }
}
