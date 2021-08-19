package com.sunekaer.mods.aquafied;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod("aquafied")
public class Aquafied
{
    public static ForgeConfigSpec.ConfigValue<Integer> SEA_LEVEL;

    public Aquafied() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        SEA_LEVEL = builder.comment("Sea Level")
                .define("sea_level", 64);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, builder.build());
//      MinecraftForge.EVENT_BUS.addListener(this::PlayerLoggedIn);
    }

    private void PlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        //Debug thing
        System.out.println(event.getPlayer().level.getSeaLevel());
    }
}
