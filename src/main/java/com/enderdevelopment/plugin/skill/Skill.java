package com.enderdevelopment.plugin.skill;

import org.bukkit.entity.Player;

public interface Skill {
    String getName();
    void activate(Player player);
    int getCooldown();
    int getLevelRequirement();
}