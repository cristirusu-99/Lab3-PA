package com.compulsory;

public class Weapon implements Item {

    private weaponType type;
    private  double weight;
    private  double value;

    public Weapon(weaponType type, double weight, double value) {
        this.type = type;
        this.weight = weight;
        this.value = value;
    }

    public weaponType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return type.name();
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Weapon: " +
                getName() +
                ", weight = " + getWeight() +
                ", value = " + getValue() +
                " (profit factor = " + profitFactor() +
                ")\n";
    }

    public enum weaponType{
        Sword, Dagger, Mace, Gun, Axe, Bow, Scythe
    }
}
