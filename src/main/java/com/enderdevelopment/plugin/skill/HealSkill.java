package com.enderdevelopment.plugin.skill;

import org.bukkit.entity.Player;

public class HealSkill implements Skill {
    @Override
    public String getName() {
        return "Heal";
    }

    @Override
    public void activate(Player player) {
        double currentHealth = player.getHealth();
        double maxHealth = player.getMaxHealth();
        double healAmount = maxHealth * 0.2; // Heal 20% of max health
        player.setHealth(Math.min(currentHealth + healAmount, maxHealth));
    }

    @Override
    public int getCooldown() {
        return 10;
    }

    @Override
    public int getLevelRequirement() {
        return 5;
    }
}