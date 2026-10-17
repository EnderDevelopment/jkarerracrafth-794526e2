package com.enderdevelopment.plugin.skill;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SkillBar {
    private static final int SKILL_SLOTS = 6;

    public static void giveSkillBar(Player player) {
        org.bukkit.inventory.PlayerInventory inventory = player.getInventory();

        for (int i = 0; i < SKILL_SLOTS; i++) {
            ItemStack skillItem = createSkillItem(i + 1);
            inventory.setItem(9 + i, skillItem);
        }
    }

    private static ItemStack createSkillItem(int slot) {
        ItemStack item = new ItemStack(Material.BOOK);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Skill " + slot);
        item.setItemMeta(meta);
        return item;
    }
}