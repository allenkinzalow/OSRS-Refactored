
public final class Tile extends Node {

   GroundItem groundItem;
   int anInt1603;
   int anInt1604;
   int anInt1605;
   Wall wall;
   ShapedTile shapedTile;
   int anInt1608 = 0;
   FloorDecoration floorDecoration;
   InteractableObject[] interactableObjects = new InteractableObject[5];
   int anInt1612;
   int[] objectFlags = new int[5];
   WallDecoration wallDecoration;
   int anInt1616;
   boolean aBool1617;
   boolean aBool1618;
   int anInt1619;
   int anInt1620;
   int anInt1621;
   boolean aBool1622;
   int anInt1623;
   Tile aClass108_Sub7_1624;
   int anInt1625;
   PlainTile plainTile;


   Tile(int var1, int var2, int var3) {
      this.anInt1605 = (this.anInt1621 = var1 * 477941017) * 88412687;
      this.anInt1603 = var2 * 1405047163;
      this.anInt1604 = var3 * 115534173;
   }

   static void method1676(int var0, int var1) {
      Class108_Sub21.aClass1_1895 = new Class1();
      Class108_Sub21.aClass1_1895.anInt7 = Client.menuActionXInteractions[var0] * -1420368315;
      Class108_Sub21.aClass1_1895.anInt2 = Client.menuActionYInteractions[var0] * 2071188001;
      Class108_Sub21.aClass1_1895.anInt4 = Client.menuActionIdentifiers[var0] * -794819855;
      Class108_Sub21.aClass1_1895.anInt6 = Client.menuActionParameters[var0] * -62510915;
      Class108_Sub21.aClass1_1895.aString5 = Client.menuActionNamePrefix[var0];
   }
}
