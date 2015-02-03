
public final class InteractableObject {

   int anInt570;
   int anInt571;
   int anInt572;
   int anInt573;
   public Renderable renderableObject;
   int anInt575;
   int xPos;
   int yPos;
   int anInt579;
   int anInt580;
   int anInt581;
   int anInt582;
   int anInt583 = 0;
   static int[] anIntArray584;
   public int hash = 0;


   static final void method648(int var0) {
      if(null != Varp.loginConnection) {
         Varp.loginConnection.disconnect();
         Varp.loginConnection = null;
      }

      Class68.method929(-1417557093);
      Scene.gameScene.method466();

      for(int var1 = 0; var1 < 4; ++var1) {
         Client.clippingPlanes[var1].reset(1566511345);
      }

      System.gc();
      SoundEffectWorker.method288(2, 2134470595);
      Client.anInt2937 = 834881831;
      Client.aBool2938 = false;
      ChatMessage.method2010((short)-6014);
      IsaacRandomGen.method725(10, 1843447412);
   }
}
