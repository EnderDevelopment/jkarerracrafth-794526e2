package com.enderdevelopment.plugin.skill;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class BuffSkill implements Skill {
    @Override
    public String getName() {
        return "Buff";
    }

    @Override
    public void activate(Player player) {
        player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 1));
        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 1));
    }

    @Override
    public int getCooldown() {
        return 15;
    }

    @Override
    public int getLevelRequirement() {
        return 15;
    }
}