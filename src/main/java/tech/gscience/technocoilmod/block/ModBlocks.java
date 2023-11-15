package tech.gscience.technocoilmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tech.gscience.technocoilmod.TechnoCoilMod;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TechnoCoilMod.MODID);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TechnoCoilMod.MODID);

    public static final RegistryObject<Block> RAW_COILIUM_BLOCK = BLOCKS.register("raw_coilium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final RegistryObject<BlockItem> RAW_COILIUM_BLOCK_ITEM = ITEMS.register("raw_coilium_block",
            () -> new BlockItem(RAW_COILIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<Block> COILIUM_BLOCK = BLOCKS.register("coilium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
    public static final RegistryObject<BlockItem> COILIUM_BLOCK_ITEM = ITEMS.register("coilium_block",
            () -> new BlockItem(COILIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.EPIC)));

}
