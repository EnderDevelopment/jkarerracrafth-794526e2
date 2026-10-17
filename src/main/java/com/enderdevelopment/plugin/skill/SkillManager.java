package com.enderdevelopment.plugin.skill;

import org.bukkit.entity.Player;
import java.util.HashMap;
import java.util.Map;

public class SkillManager {
    private final Map<String, Skill> skills = new HashMap<>();
    private final Map<Player, Long> cooldowns = new HashMap<>();

    public void registerSkill(Skill skill) {
        skills.put(skill.getName(), skill);
    }

    public boolean activateSkill(Player player, String skillName) {
        if (!skills.containsKey(skillName)) {
            return false;
        }

        Skill skill = skills.get(skillName);
        if (isOnCooldown(player, skillName)) {
            return false;
        }

        skill.activate(player);
        setCooldown(player, skillName, skill.getCooldown());
        return true;
    }

    public boolean isOnCooldown(Player player, String skillName) {
        if (!cooldowns.containsKey(player)) {
            return false;
        }

        long cooldownEnd = cooldowns.get(player);
        return System.currentTimeMillis() < cooldownEnd;
    }

    private void setCooldown(Player player, String skillName, int cooldownSeconds) {
        long cooldownEnd = System.currentTimeMillis() + (cooldownSeconds * 1000L);
        cooldowns.put(player, cooldownEnd);
    }
}