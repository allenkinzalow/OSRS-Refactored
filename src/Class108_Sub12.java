
public class Class108_Sub12 extends Node {

   int[] anIntArray1671 = new int[]{-1};
   static long aLong1672;
   static HashTable aClass101_1673 = new HashTable(32);
   int[] anIntArray1675 = new int[]{0};


   public static Object method1688(byte[] var0, boolean var1, int var2) {
      if(null == var0) {
         return null;
      } else {
         if(var0.length > 136 && !Class66.aBool864) {
            try {
               Class66_Sub1 var3 = new Class66_Sub1();
               var3.method892(var0, (short)-29250);
               return var3;
            } catch (Throwable var6) {
               Class66.aBool864 = true;
            }
         }

         if(var1) {
            int var4 = var0.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var0, 0, var5, 0, var4);
            return var5;
         } else {
            return var0;
         }
      }
   }

   static final void method1690(int var0) {
      Client.secureBuffer.writePacket(132);

      for(Class108_Sub10 var1 = (Class108_Sub10) Client.aClass101_2866.method1304(); var1 != null; var1 = (Class108_Sub10) Client.aClass101_2866.method1303()) {
         if(var1.anInt1652 * 1197757387 == 0 || var1.anInt1652 * 1197757387 == 3) {
            Class108_Sub10.method1682(var1, true, (short)272);
         }
      }

      if(Client.aClass108_Sub17_2869 != null) {
         MouseInputHandler.method775(Client.aClass108_Sub17_2869, -16054773);
         Client.aClass108_Sub17_2869 = null;
      }
   }

   public static NPCDefinition getNPCDefForID(int npcID, int var1) {
      NPCDefinition npcDef = (NPCDefinition)NPCDefinition.npcDefinitionCache.get((long)npcID);
      if(npcDef != null) {
         return npcDef;
      } else {
         byte[] npcDefData = NPCDefinition.configIndexReference.getFile(9, npcID, (byte) 7);
         npcDef = new NPCDefinition();
         npcDef.npcID = npcID * -582391805;
         if(npcDefData != null) {
            npcDef.decode(new RSByteBuffer(npcDefData), 1749628579);
         }

         npcDef.method2285((byte)11);
         NPCDefinition.npcDefinitionCache.put(npcDef, (long)npcID);
         return npcDef;
      }
   }
}
