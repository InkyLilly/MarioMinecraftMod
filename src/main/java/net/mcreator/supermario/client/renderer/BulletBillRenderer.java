
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.BulletBillEntity;
import net.mcreator.supermario.client.model.Modelbulletbill;

public class BulletBillRenderer extends MobRenderer<BulletBillEntity, Modelbulletbill<BulletBillEntity>> {
	public BulletBillRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbulletbill(context.bakeLayer(Modelbulletbill.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BulletBillEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/bulletbilltexture.png");
	}
}
