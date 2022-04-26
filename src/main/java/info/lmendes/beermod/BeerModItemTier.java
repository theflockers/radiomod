package info.lmendes.beermod;

import java.util.function.Supplier;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadedValue;


public enum BeerModItemTier implements Tier {
    RADIO(3, 3000, 10.0F, 5.0F, 5, () -> {
        return Ingredient.of(BeerModItems.RADIO_SHARD.get());
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    BeerModItemTier(int level, int durability, float miningSpeed, float damage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = durability;
        this.speed = miningSpeed;
        this.damage = damage;
        this.enchantmentValue = enchantability;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
