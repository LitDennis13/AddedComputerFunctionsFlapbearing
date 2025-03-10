package net.antwibuadum.addedcomputerfunctionsflapbearing;

import dan200.computercraft.api.ForgeComputerCraftAPI;
import net.antwibuadum.addedcomputerfunctionsflapbearing.FlapBearingPeripheralPack.FlapBearingPeripheralProvider;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AddedComputerFunctionsFlapBearing.MOD_ID)
public class AddedComputerFunctionsFlapBearing
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "addedcomputerfunctionsflapbearing";


    public AddedComputerFunctionsFlapBearing()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ForgeComputerCraftAPI.registerPeripheralProvider(new FlapBearingPeripheralProvider());

    }
}
