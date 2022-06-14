package com.cgessinger.creaturesandbeasts.client.entity.model;

import com.cgessinger.creaturesandbeasts.CreaturesAndBeasts;
import com.cgessinger.creaturesandbeasts.entities.YetiEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib3.model.AnimatedGeoModel;

@OnlyIn(Dist.CLIENT)
public class YetiModel extends AnimatedGeoModel<YetiEntity> {
    private static final ResourceLocation YETI_MODEL = new ResourceLocation(CreaturesAndBeasts.MOD_ID, "geo/entity/yeti/yeti.geo.json");
    private static final ResourceLocation BABY_YETI_MODEL = new ResourceLocation(CreaturesAndBeasts.MOD_ID, "geo/entity/yeti/baby_yeti.geo.json");

    private static final ResourceLocation YETI_TEXTURE = new ResourceLocation(CreaturesAndBeasts.MOD_ID, "textures/entity/yeti/yeti.png");
    private static final ResourceLocation BABY_YETI_TEXTURE = new ResourceLocation(CreaturesAndBeasts.MOD_ID, "textures/entity/yeti/baby_yeti.png");

    private static final ResourceLocation YETI_ANIMATIONS = new ResourceLocation(CreaturesAndBeasts.MOD_ID, "animations/yeti.json");

    @Override
    public ResourceLocation getModelResource(YetiEntity entity) {
        return entity.isBaby() ? BABY_YETI_MODEL : YETI_MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(YetiEntity entity) {
        return entity.isBaby() ? BABY_YETI_TEXTURE : YETI_TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(YetiEntity entity) {
        return YETI_ANIMATIONS;
    }
}
