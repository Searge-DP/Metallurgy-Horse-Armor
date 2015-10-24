package net.epoxide.metallurgyhorsearmor.item;

import java.util.HashMap;

import net.epoxide.mha.item.HorseArmorTier;
import net.epoxide.mha.item.ItemHorseArmorBase;
import net.epoxide.mha.item.ItemManager;

public class MetallurgyItems {
    
    /**
     * Map of all metallurgy horse armor tiers.
     */
    public static HashMap<String, HorseArmorTier> sets = new HashMap<String, HorseArmorTier>();
    
    public MetallurgyItems() {
        
        // Base
        addArmorTier("copper", 2, "Metallurgy:copper.ingot#0");
        addArmorTier("bronze", 3, "Metallurgy:bronze.ingot#0");
        addArmorTier("hepatizon", 3, "Metallurgy:hepatizon.ingot#0");
        addArmorTier("damascussteel", 5, "Metallurgy:damascus.steel.ingot#0");
        addArmorTier("angmallen", 5, "Metallurgy:angmallen.ingot#0");
        addArmorTier("steel", 5, "Metallurgy:steel.ingot#0");
        
        // Ender
        addArmorTier("eximite", 5, "Metallurgy:eximite.ingot#0");
        addArmorTier("desichalkos", 5, "Metallurgy:desichalkos.ingot#0");
        
        // Fantasy
        addArmorTier("prometheum", 2, "Metallurgy:prometheum.ingot#0");
        addArmorTier("deepiron", 5, "Metallurgy:deep.iron.ingot#0");
        addArmorTier("blacksteel", 5, "Metallurgy:black.steel.ingot#0");
        addArmorTier("oureclase", 5, "Metallurgy:oureclase.ingot#0");
        addArmorTier("astralsilver", 5, "Metallurgy:astral.silver.ingot#0");
        addArmorTier("carmot", 5, "Metallurgy:carmot.ingot#0");
        addArmorTier("mithril", 5, "Metallurgy:mithril.ingot#0");
        addArmorTier("quicksilver", 5, "Metallurgy:quicksilver.ingot#0");
        addArmorTier("haderoth", 5, "Metallurgy:haderoth.ingot#0");
        addArmorTier("orichalcum", 6, "Metallurgy:orichalcum.ingot#0");
        addArmorTier("celenegil", 6, "Metallurgy:celenegil.ingot#0");
        addArmorTier("adamantine", 6, "Metallurgy:adamantine.ingot#0");
        addArmorTier("atlarus", 6, "Metallurgy:atlarus.ingot#0");
        addArmorTier("tartarite", 6, "Metallurgy:tartarite.ingot#0");
        
        // Nether
        addArmorTier("ignatius", 5, "Metallurgy:ignatius.ingot#0");
        addArmorTier("shadowiron", 5, "Metallurgy:shadow.iron.ingot#0");
        addArmorTier("midasium", 3, "Metallurgy:midasium.ingot#0");
        addArmorTier("vyroxeres", 5, "Metallurgy:vyroxeres.ingot#0");
        addArmorTier("ceruclase", 5, "Metallurgy:ceruclase.ingot#0");
        addArmorTier("kalendrite", 5, "Metallurgy:kalendrite.ingot#0");
        addArmorTier("vulcanite", 6, "Metallurgy:vulcanite.ingot#0");
        addArmorTier("sanguinite", 6, "Metallurgy:sanguinite.ingot#0");
        addArmorTier("shadowsteel", 5, "Metallurgy:shadow.steel.ingot#0");
        addArmorTier("inolashite", 5, "Metallurgy:inolashite.ingot#0");
        addArmorTier("amordrine", 5, "Metallurgy:amordrine.ingot#0");
        
        // Precious
        addArmorTier("silver", 3, "Metallurgy:silver.ingot#0");
        addArmorTier("platinum", 5, "Metallurgy:platinum.ingot#0");
        addArmorTier("brass", 2, "Metallurgy:brass.ingot#0");
        addArmorTier("electrum", 5, "Metallurgy:electrum.ingot#0");
        
        for (HorseArmorTier tier : MetallurgyItems.sets.values()) {
            
            tier.setItem(new ItemHorseArmorBase(tier));
            ItemManager.addTierRecipe(tier);
        }
    }
    
    /**
     * Adds a new armor tier to the map of sets added by this addon.
     * 
     * @param name: The name for this set, should be all lower cased with no spaces or
     *            underscores.
     * @param protection: The amount of protection this tier should have by default.
     * @param recipeItem: The ID for the item/block used for crafting this armor.
     */
    public void addArmorTier (String name, int protection, String recipeItem) {
        
        String prefix = "metallurgy.";
        sets.put(prefix + name, new HorseArmorTier(prefix + name, protection, recipeItem));
    }
}
