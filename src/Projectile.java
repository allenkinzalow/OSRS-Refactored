import java.io.File;

public final class Projectile extends Renderable {

   double speedX;
   int anInt2524;
   static CacheIndex skeletonIndex;
   int startY;
   int anInt2527;
   int anInt2528;
   int startX;
   int tick = 0;
   int slopeHeight;
   int radius;
   int anInt2533;
   boolean isMoving = false;
   double xPosition;
   double yPosition;
   double zPosition;
   AnimationDefinition animation;
   double speedY;
   int renderHeight;
   double zSpeed;
   int anInt2542;
   int rotationY;
   int rotationX;
   static PaletteSprite[] crownSprites;
   int currentFrame = 0;
   double totalSpeed;
   int gfxId;
   double timeLeftZ;


   final void method2979(int finalX, int finalY, int var3, int var4, byte var5) {
      double distanceX;
      if(!this.isMoving) {
         distanceX = (double)(finalX - this.startX * 739406833);
         double distanceY = (double)(finalY - this.startY * -1109571193);
         double totalDistance = Math.sqrt(distanceX * distanceX + distanceY * distanceY);
         this.xPosition = (double)(this.startX * 739406833) + (double)(this.radius * -224246739) * distanceX / totalDistance;
         this.yPosition = distanceY * (double)(this.radius * -224246739) / totalDistance + (double)(this.startY * -1109571193);
         this.zPosition = (double)(this.renderHeight * -1142763131);
      }

      distanceX = (double)(1 + this.anInt2527 * -976369325 - var4);
      this.speedX = ((double)finalX - this.xPosition) / distanceX;
      this.speedY = ((double)finalY - this.yPosition) / distanceX;
      this.totalSpeed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
      if(!this.isMoving) {
         this.zSpeed = -this.totalSpeed * Math.tan(0.02454369D * (double)(this.slopeHeight * 697089159));
      }

      this.timeLeftZ = 2.0D * ((double)var3 - this.zPosition - distanceX * this.zSpeed) / (distanceX * distanceX);
   }

   Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.gfxId = var1 * -2041189905;
      this.anInt2524 = var2 * 1818573821;
      this.startX = var3 * 1239686417;
      this.startY = var4 * -1189204937;
      this.renderHeight = var5 * 1751023437;
      this.anInt2528 = var6 * 937194557;
      this.anInt2527 = var7 * -2093915429;
      this.slopeHeight = var8 * 272058679;
      this.radius = var9 * -312431707;
      this.anInt2533 = var10 * -626069;
      this.anInt2542 = var11 * -949372975;
      this.isMoving = false;
      int var12 = AnimatedGraphic.getSpotAnimForID(this.gfxId * 1528063247, (byte) 0).animationID * 338579353;
      if(var12 != -1) {
         this.animation = AnimationDefinition.getAnimDefForID(var12, 2017863609);
      } else {
         this.animation = null;
      }
   }

   final void process(int cycle, int var2) {
      this.isMoving = true;
      this.xPosition += (double)cycle * this.speedX;
      this.yPosition += this.speedY * (double)cycle;
      this.zPosition += (double)cycle * this.timeLeftZ * 0.5D * (double)cycle + (double)cycle * this.zSpeed;
      this.zSpeed += this.timeLeftZ * (double)cycle;
      this.rotationY = ((int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047) * -928151929;
      this.rotationX = ((int)(Math.atan2(this.zSpeed, this.totalSpeed) * 325.949D) & 2047) * -1193281983;
      if(this.animation != null) {
         this.tick += cycle * -828790005;

         while(this.tick * -465090397 > this.animation.frameLengths[this.currentFrame * -1472651671]) {
            this.tick -= this.animation.frameLengths[this.currentFrame * -1472651671] * -828790005;
            this.currentFrame -= 628731431;
            if(this.currentFrame * -1472651671 >= this.animation.frameIDs.length) {
               this.currentFrame -= this.animation.frameStep * 2010527153;
               if(this.currentFrame * -1472651671 < 0 || this.currentFrame * -1472651671 >= this.animation.frameIDs.length) {
                  this.currentFrame = 0;
               }
            }
         }

      }
   }

   protected final ModelRasterizer getModelRasterizer(byte var1) {
      AnimatedGraphic animatedGraphic = AnimatedGraphic.getSpotAnimForID(this.gfxId * 1528063247, (byte) 0);
      ModelRasterizer rasterizer = animatedGraphic.getModelRasterizer(this.currentFrame * -1472651671, -380943559);
      if(null == rasterizer) {
         return null;
      } else {
         rasterizer.rotateX(this.rotationX * 2002459073);
         return rasterizer;
      }
   }

   static void method2985(int var0, int var1) {
      Class108_Sub12 var2 = (Class108_Sub12)Class108_Sub12.aClass101_1673.get((long) var0);
      if(var2 != null) {
         var2.unlink();
      }
   }

   public static final void method2986(int var0, boolean var1, int var2, int var3) {
      if(var0 >= 8000 && var0 <= '\ubb80') {
         Class7.anInt94 = var0 * -557009621;
         Class7.aBool99 = var1;
         SessionRequestWorker.anInt918 = var2 * -983992405;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static void method2987(AbstractIndex var0, int var1) {
      OverlayFloorDefinition.configArchive_ref_floor = var0;
   }

   static final int method2988(int var0, int var1, byte var2) {
      int var3 = var0 + var1 * 57;
      var3 ^= var3 << 13;
      int var4 = 1376312589 + (var3 * var3 * 15731 + 789221) * var3 & Integer.MAX_VALUE;
      return var4 >> 19 & 255;
   }

   public static void method2989(File var0, int var1) {
      Class52.aFile718 = var0;
      if(Class52.aFile718.exists()) {
         Class52.aBool717 = true;
      } else {
         throw new RuntimeException("");
      }
   }
}
