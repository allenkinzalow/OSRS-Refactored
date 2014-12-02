import java.awt.Component;

public abstract class Class71 {

   static final int anInt915 = 2048;
   static String aString916;
   public static final int anInt917 = 231;
   static int anInt918;
   public static final int anInt919 = 250;


   static final void sendText(String text, int var1) {
      if(text.equalsIgnoreCase("toggleroof")) {
         Ignore.aClass37_386.aBool528 = !Ignore.aClass37_386.aBool528;
         Timer.method713(-563726063);
         if(Ignore.aClass37_386.aBool528) {
            AnimationSkeletonSet.pushMessage(99, "", "Roofs are now all hidden", -1992448970);
         } else {
            AnimationSkeletonSet.pushMessage(99, "", "Roofs will only be removed selectively", -594140255);
         }
      }

      if(Client.rights * 171939335 >= 2) {
         if(text.equalsIgnoreCase("fpson")) {
            Client.aBool2721 = true;
         }

         if(text.equalsIgnoreCase("fpsoff")) {
            Client.aBool2721 = false;
         }

         if(text.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if(text.equalsIgnoreCase("clientdrop")) {
            Class7.method180(-535663951);
         }

         if(text.equalsIgnoreCase("errortest") && 2 == Client.anInt2708 * -759629273) {
            throw new RuntimeException();
         }
      }

      Client.secureBuffer.writePacket(164);
      Client.secureBuffer.writeByte(text.length() + 1);
      Client.secureBuffer.writeString(text);
   }

   public abstract int method974(int var1);

   static final void method980(Class108_Sub4 var0, byte var1) {
      var0.aBool1546 = false;
      if(null != var0.aClass108_Sub1_1545) {
         var0.aClass108_Sub1_1545.anInt1520 = 0;
      }

      for(Class108_Sub4 var2 = var0.method1608(); null != var2; var2 = var0.method1599()) {
         method980(var2, (byte)80);
      }

   }

   public abstract void method983(Component var1, int var2);

   public abstract void method986(Component var1, short var2);
}
