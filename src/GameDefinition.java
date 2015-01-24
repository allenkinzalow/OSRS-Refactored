import java.awt.Graphics;

public class GameDefinition implements IdentifiableDefinition {

   static GameDefinition aClass82_1270 = new GameDefinition("game4", "Game 4", 3);
   static GameDefinition aClass82_1271 = new GameDefinition("stellardawn", "Stellar Dawn", 1);
   static GameDefinition aClass82_1272 = new GameDefinition("runescape", "RuneScape", 0);
   static GameDefinition aClass82_1273 = new GameDefinition("game3", "Game 3", 2);
   static GameDefinition aClass82_1274 = new GameDefinition("game5", "Game 5", 4);
   public static GameDefinition aClass82_1275 = new GameDefinition("oldscape", "RuneScape 2007", 5);
   public String gameName;
   int gameID;

   public static GameDefinition[] getGameDefinitions() {
      return new GameDefinition[]{aClass82_1274, aClass82_1271, aClass82_1270, aClass82_1275, aClass82_1272, aClass82_1273};
   }


   public int getID(int var1) {
      return this.gameID * -1083017933;
   }

   GameDefinition(String var1, String var2, int var3) {
      this.gameName = var1;
      this.gameID = var3 * -354513413;
   }

   static final boolean method1103(RSInterface component, byte var1) {
      if(component.conditionTypes == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < component.conditionTypes.length; ++var2) {
            int var3 = Class108_Sub4_Sub4.method2713(component, var2, (short)235);
            int var4 = component.conditionValues[var2];
            if(2 == component.conditionTypes[var2]) {
               if(var3 >= var4) {
                  return false;
               }
            } else if(3 == component.conditionTypes[var2]) {
               if(var3 <= var4) {
                  return false;
               }
            } else if(component.conditionTypes[var2] == 4) {
               if(var3 == var4) {
                  return false;
               }
            } else if(var4 != var3) {
               return false;
            }
         }

         return true;
      }
   }

   static final void method1107(String message, boolean var1, int var2) {
      byte offset = 4;
      int xPos = offset + 6;
      int yPos = 6 + offset;
      int xWidth = ObjectDefinition.p12_full_font.method3091(message, 250);
      int yWidth = ObjectDefinition.p12_full_font.method3092(message, 250) * 13;
      Rasterizer2D.drawFilledRectangle(xPos - offset, yPos - offset, offset + xWidth + offset, offset + yWidth + offset, 0);
      Rasterizer2D.drawUnfilledRectangle(xPos - offset, yPos - offset, xWidth + offset + offset, offset + yWidth + offset, 16777215);
      ObjectDefinition.p12_full_font.method3097(message, xPos, yPos, xWidth, yWidth, 16777215, -1, 1, 1, 0);
      ClientScriptMap.method2172(xPos - offset, yPos - offset, offset + xWidth + offset, offset + offset + yWidth, (byte)116);
      if(var1) {
         try {
            Graphics var14 = ContextMenuRow.aCanvas3.getGraphics();
            Class63.aClass13_830.method261(var14, 0, 0, 486401268);
         } catch (Exception var13) {
            ContextMenuRow.aCanvas3.repaint();
         }
      } else {
         int var8 = xPos;
         int var9 = yPos;
         int var10 = xWidth;
         int var11 = yWidth;

         for(int var12 = 0; var12 < Client.anInt2907 * -792079877; ++var12) {
            if(Client.anIntArray2912[var12] + Client.anIntArray2914[var12] > var8 && Client.anIntArray2912[var12] < var8 + var10 && Client.anIntArray2905[var12] + Client.anIntArray2913[var12] > var9 && Client.anIntArray2913[var12] < var9 + var11) {
               Client.aBoolArray2910[var12] = true;
            }
         }

      }
   }
}
