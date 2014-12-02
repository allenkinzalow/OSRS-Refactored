import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class WriteableRasterGraphicsBuffer extends GraphicsBuffer {

   Component aComponent1542;


   final void method259(int var1, int var2, Component var3, int var4) {
      this.anInt187 = var1 * 1736201291;
      this.anInt181 = var2 * -1826582071;
      this.anIntArray180 = new int[var1 * var2 + 1];
      DataBufferInt var5 = new DataBufferInt(this.anIntArray180, this.anIntArray180.length);
      DirectColorModel var6 = new DirectColorModel(32, 16711680, '\uff00', 255);
      WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.anInt187 * 582735203, this.anInt181 * 915298425), var5, (Point)null);
      this.image = new BufferedImage(var6, var7, false, new Hashtable());
      this.aComponent1542 = var3;
      this.method260(-1750978585);
   }

   public final void method270(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      Shape var7 = var1.getClip();
      var1.clipRect(var2, var3, var4, var5);
      var1.drawImage(this.image, 0, 0, this.aComponent1542);
      var1.setClip(var7);
   }

   public final void method261(Graphics var1, int var2, int var3, int var4) {
      var1.drawImage(this.image, var2, var3, this.aComponent1542);
   }

}
