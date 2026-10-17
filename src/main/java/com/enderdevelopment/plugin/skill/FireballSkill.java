package com.enderdevelopment.plugin.skill;

import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;

public class FireballSkill implements Skill {
    @Override
    public String getName() {
        return "Fireball";
    }

    @Override
    public void activate(Player player) {
        Fireball fireball = player.launchProjectile(Fireball.class);
        fireball.setYield(0); // No explosion
    }

    @Override
    public int getCooldown() {
        return 5;
    }

    @Override
    public int getLevelRequirement() {
        return 10;
    }
}