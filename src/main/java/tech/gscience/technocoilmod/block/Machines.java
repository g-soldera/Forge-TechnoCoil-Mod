package tech.gscience.technocoilmod.block;

import net.minecraft.world.level.block.Block;
import tech.gscience.technocoilmod.TechnoCoilMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Machines {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TechnoCoilMod.MODID);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TechnoCoilMod.MODID);

    //public static final RegistryObject<Item> RAW_COILIUM = ITEMS.register("raw_coilium", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<BlockItem> COILIUM_ORE_ITEM = ITEMS.register("coilium_ore", () -> new BlockItem(COILIUM_ORE.get(), new Item.Properties().rarity(Rarity.RARE)));

}
