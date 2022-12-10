
package net.mcreator.supermario.client.renderer;

public class FireballRenderer extends MobRenderer<FireballEntity, Modelcustom_model<FireballEntity>> {

	public FireballRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(FireballEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/fireballtexture.png");
	}

}
