
public class Class104 {

   public static final int anInt1412 = 8;
   public static final int anInt1413 = 32;
   public static final int anInt1414 = 153;
   public static final int anInt1415 = 2;
   public static final int anInt1416 = 143;
   public static final int anInt1417 = 64;
   public static final int anInt1418 = 77;
   public static final int anInt1419 = 1024;
   public static final int anInt1420 = 256;
   public static final int anInt1421 = 16;
   static Class108_Sub15 aClass108_Sub15_1422;
   public static final int anInt1423 = 216;
   public static final int anInt1424 = 16;
   public static final int anInt1425 = 68;
   public static final int anInt1426 = 131;
   public static int[] anIntArray1427 = new int[]{0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -2, 0, 10, 2, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 6, 10, 0, 0, 0, 12, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 14, -2, 0, 0, 0, 6, 5, 0, 4, 0, 2, 0, 0, 0, 15, 0, 6, 0, 0, 0, 0, 2, 0, 6, -2, 6, 0, 0, 0, 0, 0, 0, 0, 2, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 4, 6, 0, 0, 2, 0, 4, 0, 0, -2, 0, 2, 8, 0, 1, 0, 5, 0, -1, 6, 0, 6, 0, -2, 0, 4, 0, 0, 0, 0, 6, 0, 0, -2, -1, 3, 0, 0, -1, 0, 0, 0, 28, 0, 0, 6, 0, 4, 0, 0, 0, 1, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 1, -1, 0, 0, 0, 0, 0, -2, 0, 0, 7, 0, 0, -2, 0, 0, 0, -2, 0, 0, 2, 8, 0, 0, 0, -1, 5, 0, 0, -2, 0, 0, -2, 0, -2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 6, 0, 0, 0, 0, 0};
   public static final int anInt1428 = 1;
   public static final int anInt1429 = 7;
   public static final int anInt1430 = 19;
   public static final int anInt1431 = 102;
   public static final int anInt1432 = 128;
   public static final int anInt1433 = 72;


   Class104() throws Throwable {
      throw new Error();
   }

   static final void spawnGroundItem(int x, int y, byte var2) {
      Deque itemDeque = Client.groundItemArray[Class108_Sub20_Sub2.plane * -570926309][x][y];
      if(null == itemDeque) {
         Class56.gameScene.removeGroundItemTile(Class108_Sub20_Sub2.plane * -570926309, x, y);
      } else {
         long maxValue = -99999999L;
         Item topGroundItem = null;

         Item item;
         for(item = (Item)itemDeque.getFront(); item != null; item = (Item)itemDeque.getNext()) {
            ItemDefinition definition = AnimationDefinition.getItemDefinition(item.itemID * -1672318173, -215276823);
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
            Class56.gameScene.removeGroundItemTile(Class108_Sub20_Sub2.plane * -570926309, x, y);
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
            Class56.gameScene.addGroundItemTile(Class108_Sub20_Sub2.plane * -570926309, x, y, ClientScript.getFloorDrawHeight(x * 128 + 64, 64 + y * 128, Class108_Sub20_Sub2.plane * -570926309, 1084393702), topGroundItem, hash, firstItem, secondItem);
         }
      }
   }

   public static ClientScriptMap getCSMapForID(int csMapID, int var1) {
      ClientScriptMap csMap = (ClientScriptMap)ClientScriptMap.csMapCache.get((long)csMapID);
      if(csMap != null) {
         return csMap;
      } else {
         byte[] csMapData = ClientScriptMap.configIndexReference.getFile(8, csMapID, (byte) 7);
         csMap = new ClientScriptMap();
         if(null != csMapData) {
            csMap.decode(new RSByteBuffer(csMapData), (short)-599);
         }

         ClientScriptMap.csMapCache.put(csMap, (long)csMapID);
         return csMap;
      }
   }

}
