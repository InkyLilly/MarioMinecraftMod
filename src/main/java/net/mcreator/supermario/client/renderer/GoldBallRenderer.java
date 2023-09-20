
package net.mcreator.supermario.client.renderer;

public class GoldBallRenderer extends MobRenderer<GoldBallEntity, ModelFireball<GoldBallEntity>> {

	public GoldBallRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFireball(context.bakeLayer(ModelFireball.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(GoldBallEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/goldfireballtexture.png");
	}

}
