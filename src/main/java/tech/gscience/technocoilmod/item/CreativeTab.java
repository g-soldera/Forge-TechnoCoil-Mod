package tech.gscience.technocoilmod.item;

import tech.gscience.technocoilmod.TechnoCoilMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import tech.gscience.technocoilmod.block.ModBlocks;
import tech.gscience.technocoilmod.block.Ores;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TechnoCoilMod.MODID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TAB.register("technocoilmod",
            () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(RawOres.RAW_COILIUM.get()))
            .title(Component.translatable("creativetab.technocoil"))
            .displayItems(((pParameters, pOutput) -> {
                pOutput.accept(Ingredients.COILIUM_INGOT.get());
                pOutput.accept(RawOres.RAW_COILIUM.get());
                pOutput.accept(Ores.COILIUM_ORE_ITEM.get());
                pOutput.accept(ModBlocks.COILIUM_BLOCK_ITEM.get());
                pOutput.accept(ModBlocks.RAW_COILIUM_BLOCK_ITEM.get());
            }))
            .build());
}
