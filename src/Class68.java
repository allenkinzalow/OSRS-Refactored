
public class Class68 {

   static int anInt902;
   public static RSSong aClass108_Sub23_903;


   Class68() throws Throwable {
      throw new Error();
   }

   static final void method929(int var0) {
      ObjectDefinition.method2199();
      UnderlayDefinition.aClass106_2143.clearCacheMap();
      Class65.method889((byte)-123);
      Class108_Sub10.method1681(-1081694593);
      NPCDefinition.npcDefinitionCache.clearCacheMap();
      NPCDefinition.npcRasterizerMap.clearCacheMap();
      GroundItem.method585((byte)-123);
      AnimationDefinition.clearAnimationDefMaps((byte) 1);
      AnimatedGraphic.spotAnimCache.clearCacheMap();
      AnimatedGraphic.spotAnimRasterizerMap.clearCacheMap();
      Class5.method98(1194839351);
      Varp.varpCacheMap.clearCacheMap();
      EquipmentKit.equipmentMap.clearCacheMap();
      RSInterface.spriteMap.clearCacheMap();
      RSInterface.interfaceMediaMap.clearCacheMap();
      RSInterface.fontMap.clearCacheMap();
      ((TextureLoader)Rasterizer3D.anTextureImage_2501).method379(304324233);
      ClientScriptDefinition.clientScriptMap.clearCacheMap();
      Projectile.skeletonIndex.resetCachedIndex();
      AnimationSkin.skinIndex.resetCachedIndex();
      OverlayFloorDefinition.interfaceIndex.resetCachedIndex();
      RSSoundEffect.soundEffectsIndex_1.resetCachedIndex();
      RegionReference.landscapeIndex.resetCachedIndex();
      Friend.musicIndex_1.resetCachedIndex();
      Class47.modelIndex.resetCachedIndex();
      Class23.spriteIndex.resetCachedIndex();
      PlayerLoginDetails.textureIndex.resetCachedIndex();
      HuffmanEncoding.huffmanIndex.resetCachedIndex();
      ClientParameter.musicIndex_2.resetCachedIndex();
      Class108_Sub13.clientScriptIndex.resetCachedIndex();
   }

   static void method930(int var0) {
      Object var1 = CacheRequestDispatcher.anObject1297;
      synchronized(var1) {
         if(0 == CacheRequestDispatcher.anInt1299 * 1495359531) {
            ClientScriptMap.sessionRequestWorker.submitRunnableSession(new CacheRequestDispatcher(), 5, -2013972179);
         }

         CacheRequestDispatcher.anInt1299 = -373456120;
      }
   }
}
