package net.epoxide.metallurgyhorsearmor;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.epoxide.metallurgyhorsearmor.common.ProxyCommon;
import net.epoxide.metallurgyhorsearmor.item.MetallurgyItems;
import net.epoxide.metallurgyhorsearmor.util.Constants;

@Mod(modid = Constants.MOD_ID, name = Constants.MOD_NAME, version = Constants.VERSION_NUMBER, dependencies = "required-after:bookshelf;required-after:MoreHorseArmor;required-after:Metallurgy")
public class MetallurgyHorseArmor {
    
    @SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.SERVER_PROXY_CLASS)
    public static ProxyCommon proxy;
    
    @Mod.Instance(Constants.MOD_ID)
    public static MetallurgyHorseArmor instance;
    
    @EventHandler
    public void preInit (FMLPreInitializationEvent event) {
        
        new MetallurgyItems();
    }
}