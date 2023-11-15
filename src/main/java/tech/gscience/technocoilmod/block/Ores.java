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

public class Ores {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TechnoCoilMod.MODID);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TechnoCoilMod.MODID);

    public static final RegistryObject<Block> COILIUM_ORE = BLOCKS.register("coilium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<BlockItem> COILIUM_ORE_ITEM = ITEMS.register("coilium_ore",
            () -> new BlockItem(COILIUM_ORE.get(), new Item.Properties().rarity(Rarity.RARE)));



}
