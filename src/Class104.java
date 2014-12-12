
public class Class104 {

   static Class108_Sub15 aClass108_Sub15_1422;
   public static int[] anIntArray1427 = new int[]{0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -2, 0, 10, 2, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 6, 10, 0, 0, 0, 12, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 14, -2, 0, 0, 0, 6, 5, 0, 4, 0, 2, 0, 0, 0, 15, 0, 6, 0, 0, 0, 0, 2, 0, 6, -2, 6, 0, 0, 0, 0, 0, 0, 0, 2, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 4, 6, 0, 0, 2, 0, 4, 0, 0, -2, 0, 2, 8, 0, 1, 0, 5, 0, -1, 6, 0, 6, 0, -2, 0, 4, 0, 0, 0, 0, 6, 0, 0, -2, -1, 3, 0, 0, -1, 0, 0, 0, 28, 0, 0, 6, 0, 4, 0, 0, 0, 1, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 1, -1, 0, 0, 0, 0, 0, -2, 0, 0, 7, 0, 0, -2, 0, 0, 0, -2, 0, 0, 2, 8, 0, 0, 0, -1, 5, 0, 0, -2, 0, 0, -2, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 6, 0, 0, 0, 0, 0};


   Class104() throws Throwable {
      throw new Error();
   }

   static final void spawnGroundItem(int x, int y, byte var2) {
      Deque itemDeque = Client.groundItemArray[VarpBit.plane * -570926309][x][y];
      if(null == itemDeque) {
         Class56.gameScene.removeGroundItemTile(VarpBit.plane * -570926309, x, y);
      } else {
         long maxValue = -99999999L;
         Item topGroundItem = null;

         Item item;
         for(item = (Item)itemDeque.getFront(); item != null; item = (Item)itemDeque.getNext()) {
            ItemDefinition definition = ItemDefinition.getItemDefinition(item.itemID * -1672318173, -215276823);
            long value = (long)(definition.cost * -1794880833);
            if(1 == definition.stackable * 1548462817) {
               value *= (long)(item.anInt2614 * -767037133 + 1);
            }

            if(value > maxValue) {
               maxValue = value;
               topGroundItem = item;
            }
         }

         if(null == topGroundItem) {
            Class56.gameScene.removeGroundItemTile(VarpBit.plane * -570926309, x, y);
         } else {
            itemDeque.insertFront(topGroundItem);
            Item firstItem = null;
            Item secondItem = null;

            for(item = (Item)itemDeque.getFront(); null != item; item = (Item)itemDeque.getNext()) {
               if(topGroundItem.itemID * -1672318173 != item.itemID * -1672318173) {
                  if(firstItem == null) {
                     firstItem = item;
                  }

                  if(item.itemID * -1672318173 != firstItem.itemID * -1672318173 && secondItem == null) {
                     secondItem = item;
                  }
               }
            }

            int hash = 1610612736 + x + (y << 7);
            Class56.gameScene.addGroundItemTile(VarpBit.plane * -570926309, x, y, ClientScript.getFloorDrawHeight(x * 128 + 64, 64 + y * 128, VarpBit.plane * -570926309, 1084393702), topGroundItem, hash, firstItem, secondItem);
         }
      }
   }

}
