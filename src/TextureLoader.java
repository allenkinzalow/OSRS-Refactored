
public class TextureLoader implements TextureImage {

   Texture[] loadedTextures;
   Deque aClass105_366 = new Deque();
   AbstractIndex spriteIndexReference;
   double brightness = 1.0D;
   int anInt370 = -100758912;
   int anInt371;
   int anInt373 = 0;


   public TextureLoader(AbstractIndex textureIndex, AbstractIndex spriteIndex, int var3, double var4, int var6) {
      this.spriteIndexReference = spriteIndex;
      this.anInt371 = var3 * 645158065;
      this.anInt373 = this.anInt371 * -1593709107;
      this.brightness = var4;
      this.anInt370 = var6 * -1712063211;
      int[] files = textureIndex.getFileIDs(0);
      int fileCount = files.length;
      this.loadedTextures = new Texture[textureIndex.getFileCount(0)];

      for(int file = 0; file < fileCount; ++file) {
         RSByteBuffer buffer = new RSByteBuffer(textureIndex.getFile(0, files[file], (byte) 7));
         this.loadedTextures[files[file]] = new Texture(buffer);
      }

   }

   public int[] getTexturePixels(int textureID, int var2) {
      Texture texture = this.loadedTextures[textureID];
      if(null != texture) {
         if(texture.pixels != null) {
            this.aClass105_366.insertFront(texture);
            texture.aBool1525 = true;
            return texture.pixels;
         }

         boolean loaded = texture.initTexturePixels(this.brightness, this.anInt370 * 441084477, this.spriteIndexReference);
         if(loaded) {
            if(this.anInt373 * -581026667 == 0) {
               Texture tex = (Texture)this.aClass105_366.method1338();
               tex.resetPixels();
            } else {
               this.anInt373 -= 591441597;
            }

            this.aClass105_366.insertFront(texture);
            texture.aBool1525 = true;
            return texture.pixels;
         }
      }

      return null;
   }

   public void method378(int var1, int var2) {
      for(int textureIndex = 0; textureIndex < this.loadedTextures.length; ++textureIndex) {
         Texture texture = this.loadedTextures[textureIndex];
         if(null != texture && texture.anInt1531 != 0 && texture.aBool1525) {
            texture.method1549(var1);
            texture.aBool1525 = false;
         }
      }

   }

   public boolean method23(int var1, int var2) {
      return this.loadedTextures[var1].aBool1526;
   }

   public boolean method24(int var1, int var2) {
      return this.anInt370 * 441084477 == 64;
   }

   public void method379(int var1) {
      for(int var2 = 0; var2 < this.loadedTextures.length; ++var2) {
         if(this.loadedTextures[var2] != null) {
            this.loadedTextures[var2].resetPixels();
         }
      }

      this.aClass105_366 = new Deque();
      this.anInt373 = this.anInt371 * -1593709107;
   }

   public int method21(int var1, int var2) {
      return null == this.loadedTextures[var1]?0:this.loadedTextures[var1].anInt1524;
   }

   public void method384(double var1) {
      this.brightness = var1;
      this.method379(41953108);
   }

   public static void method389(int var0) {
      if(SessionRequestWorker.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
         KeyFocusListener.anIntArray876[186] = 57;
         KeyFocusListener.anIntArray876[187] = 27;
         KeyFocusListener.anIntArray876[188] = 71;
         KeyFocusListener.anIntArray876[189] = 26;
         KeyFocusListener.anIntArray876[190] = 72;
         KeyFocusListener.anIntArray876[191] = 73;
         KeyFocusListener.anIntArray876[192] = 58;
         KeyFocusListener.anIntArray876[219] = 42;
         KeyFocusListener.anIntArray876[220] = 74;
         KeyFocusListener.anIntArray876[221] = 43;
         KeyFocusListener.anIntArray876[222] = 59;
         KeyFocusListener.anIntArray876[223] = 28;
      } else {
         KeyFocusListener.anIntArray876[44] = 71;
         KeyFocusListener.anIntArray876[45] = 26;
         KeyFocusListener.anIntArray876[46] = 72;
         KeyFocusListener.anIntArray876[47] = 73;
         KeyFocusListener.anIntArray876[59] = 57;
         KeyFocusListener.anIntArray876[61] = 27;
         KeyFocusListener.anIntArray876[91] = 42;
         KeyFocusListener.anIntArray876[92] = 74;
         KeyFocusListener.anIntArray876[93] = 43;
         KeyFocusListener.anIntArray876[192] = 28;
         KeyFocusListener.anIntArray876[222] = 58;
         KeyFocusListener.anIntArray876[520] = 59;
      }
   }

   public static void method390(int var0) {
      if(null != Class78.connection) {
         Class78.connection.disconnect();
      }
   }
}
