
public class LoginType implements IdentifiableDefinition {

   public int type;
   public static LoginType aClass76_1198 = new LoginType(2, 1); // trust computer
   public static LoginType aClass76_1199 = new LoginType(0, 2);
   public static LoginType aClass76_1200 = new LoginType(1, 0);
   public static LoginType aClass76_1201 = new LoginType(3, 3); // write auth pin
   int typeID;


   public int getID(int var1) {
      return this.typeID * 447551109;
   }

   LoginType(int var1, int var2) {
      this.type = var1 * 747642069;
      this.typeID = var2 * -384470451;
   }
}
