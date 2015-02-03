import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class AnimatedGraphic extends CacheableNode {

   int resizeX = 1063384192;
   public static CacheableNodeMap spotAnimCache = new CacheableNodeMap(64);
   public static CacheableNodeMap spotAnimRasterizerMap = new CacheableNodeMap(30);
   short[] retextureToFind;
   short[] recolorToReplace;
   public int animationID = -2018612393;
   short[] recolorToFind;
   static AbstractIndex aClass74_2029;
   int ambient = 0;
   short[] retextureToReplace;
   int gfxID;
   int resizeY = 1782475648;
   int rotation = 0;
   int modelID;
   int contrast = 0;
   static SocketSession aConnection_Session_2037;

   public static AnimatedGraphic getSpotAnimForID(int spotAnimID, byte var1) {
      AnimatedGraphic gfx = (AnimatedGraphic) spotAnimCache.get((long) spotAnimID);
      if(null == gfx) {
         byte[] gfxData = aClass74_2029.getFile(13, spotAnimID, (byte) 7);
         gfx = new AnimatedGraphic();
         gfx.gfxID = spotAnimID * 409213277;
         if(null != gfxData) {
            gfx.decode(new RSByteBuffer(gfxData), (short)2000);
         }

         spotAnimCache.put(gfx, (long) spotAnimID);
         return gfx;
      } else {
         return gfx;
      }
   }


   void decodeReadValues(RSByteBuffer buffer, int opcode, short var3) {
      if(1 == opcode) {
         this.modelID = buffer.readUShort(677228819) * -749621645;
      } else if(opcode == 2) {
         this.animationID = buffer.readUShort(186397237) * 2018612393;
      } else if(opcode == 4) {
         this.resizeX = buffer.readUShort(2105751761) * -1098988567;
      } else if(opcode == 5) {
         this.resizeY = buffer.readUShort(1201255550) * 1960082647;
      } else if(opcode == 6) {
         this.rotation = buffer.readUShort(1372627912) * 1158714527;
      } else if(7 == opcode) {
         this.ambient = buffer.readUByte() * 16173221;
      } else if(8 == opcode) {
         this.contrast = buffer.readUByte() * 1578004691;
      } else {
         int length;
         int index;
         if(opcode == 40) {
            length = buffer.readUByte();
            this.recolorToFind = new short[length];
            this.recolorToReplace = new short[length];

            for(index = 0; index < length; ++index) {
               this.recolorToFind[index] = (short)buffer.readUShort(752649136);
               this.recolorToReplace[index] = (short)buffer.readUShort(-420508325);
            }

         } else if(opcode == 41) {
            length = buffer.readUByte();
            this.retextureToFind = new short[length];
            this.retextureToReplace = new short[length];

            for(index = 0; index < length; ++index) {
               this.retextureToFind[index] = (short)buffer.readUShort(-1120583205);
               this.retextureToReplace[index] = (short)buffer.readUShort(-1801121443);
            }

         }
      }
   }

   public final ModelRasterizer getModelRasterizer(int var1, int var2) {
      ModelRasterizer rasterizer = (ModelRasterizer)spotAnimRasterizerMap.get((long)(this.gfxID * 1660224245));
      if(rasterizer == null) {
         RSModel model = RSModel.decodeModel(Class54.aClass74_734, this.modelID * 1982703291, 0);
         if(model == null) {
            return null;
         }

         int changeIndex;
         if(this.recolorToFind != null) {
            for(changeIndex = 0; changeIndex < this.recolorToFind.length; ++changeIndex) {
               model.findReplaceColor(this.recolorToFind[changeIndex], this.recolorToReplace[changeIndex]);
            }
         }

         if(this.retextureToFind != null) {
            for(changeIndex = 0; changeIndex < this.retextureToFind.length; ++changeIndex) {
               model.findReplaceTexture(this.retextureToFind[changeIndex], this.retextureToReplace[changeIndex]);
            }
         }

         rasterizer = model.createModelRasterizer(this.ambient * -305406163 + 64, 850 + this.contrast * 1963157339, -30, -50, -30);
         spotAnimRasterizerMap.put(rasterizer, (long)(this.gfxID * 1660224245));
      }

      ModelRasterizer modifiedRasterizer;
      if(-1 != this.animationID * 338579353 && -1 != var1) {
         modifiedRasterizer = AnimationDefinition.getAnimDefForID(this.animationID * 338579353, 1824710055).getTransformedRasterizer(rasterizer, var1, 728619396);
      } else {
         modifiedRasterizer = rasterizer.method2907(true);
      }

      if(this.resizeX * -1874574247 != 128 || 128 != this.resizeY * 834811623) {
         modifiedRasterizer.resizeModel(this.resizeX * -1874574247, this.resizeY * 834811623, this.resizeX * -1874574247);
      }

      if(0 != this.rotation * 1541900127) {
         if(this.rotation * 1541900127 == 90) {
            modifiedRasterizer.rotate90();
         }

         if(180 == this.rotation * 1541900127) {
            modifiedRasterizer.rotate90();
            modifiedRasterizer.rotate90();
         }

         if(this.rotation * 1541900127 == 270) {
            modifiedRasterizer.rotate90();
            modifiedRasterizer.rotate90();
            modifiedRasterizer.rotate90();
         }
      }

      return modifiedRasterizer;
   }

   void decode(RSByteBuffer buffer, short var2) {
      while(true) {
         int opcode = buffer.readUByte();
         if(opcode == 0) {
            return;
         }

         this.decodeReadValues(buffer, opcode, (short)-7985);
      }
   }

   public static void method2137(String var0, boolean var1, boolean var2, byte var3) {
      if(!var1) {
         Class108_Sub13.openDocument(var0, 3, "openjs", 1913475607);
      } else {
         if(!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
               ;
            }
         }

         if(Class56.operatingSystem.startsWith("win") && !var2) {
            Class108_Sub13.openDocument(var0, 0, "openjs", -76807875);
         } else if(Class56.operatingSystem.startsWith("mac")) {
            Class108_Sub13.openDocument(var0, 1, "openjs", 397857714);
         } else {
            Class108_Sub13.openDocument(var0, 2, "openjs", 1248309380);
         }
      }
   }

}
