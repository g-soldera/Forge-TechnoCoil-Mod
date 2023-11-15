package tech.gscience.technocoilmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tech.gscience.technocoilmod.TechnoCoilMod;

public class Ingredients {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TechnoCoilMod.MODID);

    public static final RegistryObject<Item> COILIUM_INGOT = ITEMS.register("coilium_ingot", () -> new Item(new Item.Properties()));

}
