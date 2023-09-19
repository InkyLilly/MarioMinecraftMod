
package net.mcreator.supermario.client.renderer;

public class FireballRenderer extends MobRenderer<FireballEntity, ModelFireball<FireballEntity>> {

	public FireballRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFireball(context.bakeLayer(ModelFireball.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(FireballEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/fireballtexture.png");
	}

}
