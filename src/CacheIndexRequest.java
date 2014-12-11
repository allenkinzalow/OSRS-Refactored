
public class CacheIndexRequest extends Node {

   public byte[] indexData;
   public static final int anInt1755 = 145;
   public CacheIndex cacheIndex;
   public IndexTable cacheIndexTable;
   public static final int anInt1758 = 17;
   int anInt1759;
   static final int anInt1760 = 512;
   public static final int anInt1761 = 16777216;


   static String getIconTag(int iconID, int var1) {
      return "<img=" + iconID + ">";
   }

   public static int method1925(CharSequence var0, int var1) {
      int var2 = var0.length();
      int var5 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var4 = var0.charAt(var3);
         if(var4 <= 127) {
            ++var5;
         } else if(var4 <= 2047) {
            var5 += 2;
         } else {
            var5 += 3;
         }
      }

      return var5;
   }

   public static RSInterface getInterfaceComponentForHash(int hash, int var1) {
      int interfaceID = hash >> 16;
      int componentID = hash & '\uffff';
      if(null == RSInterface.interface_cache[interfaceID] || null == RSInterface.interface_cache[interfaceID][componentID]) {
         boolean var4 = AbstractIndex.method1073(interfaceID, 780045770);
         if(!var4) {
            return null;
         }
      }

      return RSInterface.interface_cache[interfaceID][componentID];
   }

   static final int method1927(int var0, int var1, int var2) {
      if(-2 == var0) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = var1 * (var0 & 127) / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   static final void method1928(boolean var0, int var1) {
      for(int var2 = 0; var2 < Client.anInt2749 * -1829405175; ++var2) {
         NPC var4 = Client.localNPCs[Client.npcIndices[var2]];
         int var3 = 536870912 + (Client.npcIndices[var2] << 14);
         if(null != var4 && var4.method2731(50136375) && var4.definition.hasRenderPriority == var0 && var4.definition.method2284((byte)98)) {
            int var5 = var4.anInt2394 * 171470795 >> 7;
            int var6 = var4.anInt2339 * 826764905 >> 7;
            if(var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
               if(1 == var4.anInt2349 * -1280018135 && 64 == (var4.anInt2394 * 171470795 & 127) && (var4.anInt2339 * 826764905 & 127) == 64) {
                  if(Client.anIntArrayArray2806[var5][var6] == Client.anInt2807 * 1693763895) {
                     continue;
                  }

                  Client.anIntArrayArray2806[var5][var6] = Client.anInt2807 * 1693763895;
               }

               if(!var4.definition.isClickable) {
                  var3 += Integer.MIN_VALUE;
               }

               Class56.gameScene.method412(VarpBit.plane * -570926309, var4.anInt2394 * 171470795, var4.anInt2339 * 826764905, ClientScript.getFloorDrawHeight(var4.anInt2394 * 171470795 + (var4.anInt2349 * -316782016 - 64), var4.anInt2339 * 826764905 + (var4.anInt2349 * -316782016 - 64), VarpBit.plane * -570926309, 1608876331), var4.anInt2349 * -316782016 - 64 + 60, var4, var4.anInt2345 * -376471767, var3, var4.aBool2348);
            }
         }
      }

   }

   public static Class resolveType(String var0, byte var1) throws ClassNotFoundException {
      return var0.equals("B") ?  Byte.TYPE :
			(var0.equals("I") ? Integer.TYPE :
			(var0.equals("S") ? Short.TYPE : 
			(var0.equals("J") ? Long.TYPE : 
			(var0.equals("Z") ? Boolean.TYPE : 
			(var0.equals("F") ? Float.TYPE : 
			(var0.equals("D") ? Double.TYPE : 
			(var0.equals("C") ? Character.TYPE : 
			(var0.equals("void") ? Void.TYPE : 
				Class.forName(var0)))))))));
   }
}
