
public final class Item extends Renderable {

   int anInt2614;
   static int anInt2616;
   static int actionMenuHeight;
   int itemID;

	protected final ModelRasterizer getModelRasterizer(byte var1) {
      return AnimationDefinition.getItemDefinition(this.itemID * -1672318173, -1703295309).renderItem(this.anInt2614 * -767037133, (byte)26);
   }

}
