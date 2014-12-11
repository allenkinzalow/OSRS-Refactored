
public class AnimationSkin extends Node {

   static final int anInt1628 = 8;
   static CacheIndex skinIndex;
   int count;
   int anInt1630;
   int[][] skinList;
   static final int anInt1632 = 29;
   static final int anInt1633 = 512;
   int[] transformationTypes;


   AnimationSkin(int var1, byte[] data) {
      this.anInt1630 = var1 * -1827915669;
      RSByteBuffer buffer = new RSByteBuffer(data);
      this.count = buffer.readUByte() * 521415453;
      this.transformationTypes = new int[this.count * 1198518069];
      this.skinList = new int[this.count * 1198518069][];

      for(int opcode = 0; opcode < this.count * 1198518069; ++opcode) {
         this.transformationTypes[opcode] = buffer.readUByte();
      }

      for(int skin = 0; skin < this.count * 1198518069; ++skin) {
         this.skinList[skin] = new int[buffer.readUByte()];
      }

      for(int skin = 0; skin < this.count * 1198518069; ++skin) {
         for(int subSkin = 0; subSkin < this.skinList[skin].length; ++subSkin) {
            this.skinList[skin][subSkin] = buffer.readUByte();
         }
      }

   }

   public static void method1677(AbstractIndex musicIndex, int var1, int var2, int var3, boolean var4, int var5) {
      Class91.anInt1325 = -771978757;
      RSInterface.aClass74_1889 = musicIndex;
      Class91.anInt1329 = var1 * -2020957493;
      OnlineFriend.anInt1511 = var2 * -1300146319;
      Class27.anInt362 = var3 * 495527089;
      FriendsChatMember.aBool1669 = var4;
      ClientScriptDefinition.anInt2281 = 1706374896;
   }
}
