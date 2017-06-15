package northerneclipse.worldgenplus;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = "wgp", name = "WorldGenPlus", version = "1.0")
public class worldgenplus {
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Item/Block init, Config Handling
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, TileEntity, entity, GUI, Packet Register
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
