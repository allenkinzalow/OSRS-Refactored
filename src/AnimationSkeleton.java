/**
 * Credits to Velocity for some of the naming.
 */
public class AnimationSkeleton {

   int[] translator_x;
   static int[] alter_x = new int[500];
   static int[] alter_y = new int[500];
   AnimationSkin skin = null;
   static int[] instructions = new int[500];
   int stepCount = -1;
   int[] opCodeTable;
   int[] translator_y;
   static int[] alter_z = new int[500];
   int[] translator_z;
   boolean aBool606 = false;


   AnimationSkeleton(byte[] data, AnimationSkin skin) {
      this.skin = skin;
      RSByteBuffer var8 = new RSByteBuffer(data);
      RSByteBuffer buffer = new RSByteBuffer(data);
      var8.position = 1075929622;
      int animationCount = var8.readUByte();
      int var10 = -1;
      int stepCount = 0;
      buffer.position = (var8.position * 798331555 + animationCount) * 537964811;

      int var3;
      for(var3 = 0; var3 < animationCount; ++var3) {
         int setting = var8.readUByte();
         if(setting > 0) {
            if(this.skin.transformationTypes[var3] != 0) {
               for(int var4 = var3 - 1; var4 > var10; --var4) {
                  if(this.skin.transformationTypes[var4] == 0) {
                     instructions[stepCount] = var4;
                     alter_x[stepCount] = 0;
                     alter_y[stepCount] = 0;
                     alter_z[stepCount] = 0;
                     ++stepCount;
                     break;
                  }
               }
            }

            instructions[stepCount] = var3;
            short var11 = 0;
            if(this.skin.transformationTypes[var3] == 3) {
               var11 = 128;
            }

            if((setting & 1) != 0) {
               alter_x[stepCount] = buffer.method1746(1113333989);
            } else {
               alter_x[stepCount] = var11;
            }

            if((setting & 2) != 0) {
               alter_y[stepCount] = buffer.method1746(1113333989);
            } else {
               alter_y[stepCount] = var11;
            }

            if((setting & 4) != 0) {
               alter_z[stepCount] = buffer.method1746(1113333989);
            } else {
               alter_z[stepCount] = var11;
            }

            var10 = var3;
            ++stepCount;
            if(this.skin.transformationTypes[var3] == 5) {
               this.aBool606 = true;
            }
         }
      }

      if(buffer.position * 798331555 != data.length) {
         throw new RuntimeException();
      } else {
         this.stepCount = stepCount;
         this.opCodeTable = new int[stepCount];
         this.translator_x = new int[stepCount];
         this.translator_y = new int[stepCount];
         this.translator_z = new int[stepCount];

         for(var3 = 0; var3 < stepCount; ++var3) {
            this.opCodeTable[var3] = instructions[var3];
            this.translator_x[var3] = alter_x[var3];
            this.translator_y[var3] = alter_y[var3];
            this.translator_z[var3] = alter_z[var3];
         }

      }
   }
}
