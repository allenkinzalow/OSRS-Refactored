
public class Class83 {

   Class83() throws Throwable {
      throw new Error();
   }

   static void method1117() {
      if(Client.aBool2881) {
         RSInterface var1 = LoginHandler.method878(Class43.anInt607 * 550337065, Client.anInt2936 * 1150893973, 1596774930);
         if(null != var1 && var1.anObjectArray1773 != null) {
            ClientScript var2 = new ClientScript();
            var2.parentInterface = var1;
            var2.parameters = var1.anObjectArray1773;
            GameObject.executeScript(var2, -1545456412);
         }

         Client.aBool2881 = false;
         MouseInputHandler.method775(var1, -16054773);
      }
   }

}
