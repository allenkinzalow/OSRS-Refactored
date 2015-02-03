/**
 * The Animation Skin contains the type of animation for a frame
 *    and the
 */
public class AnimationSkin extends Node {

   static CacheIndex skinIndex;
   int count;
   int skinId;
   int[][] skinList;

   /**
    * 0 set reference point
    * 1 translation
    * 2 rotation
    * 3 scale
    * 5 transparency
    */
   int[] transformationTypes;


   AnimationSkin(int id, byte[] data) {
      this.skinId = id * -1827915669;
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

}
