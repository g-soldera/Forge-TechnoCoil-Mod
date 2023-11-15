package tech.gscience.technocoilmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tech.gscience.technocoilmod.TechnoCoilMod;

public class RawOres {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TechnoCoilMod.MODID);

    public static final RegistryObject<Item> RAW_COILIUM = ITEMS.register("raw_coilium", () -> new Item(new Item.Properties()));

}
