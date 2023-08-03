package com.workintech.rpgGame.model;

public class Troll extends Monster implements Bleedable,Poisonable{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public void attack() {
        double totalDamage =getDamage() + bleed()+ poison();
        System.out.println(getName()+ " is attacking "+totalDamage);
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double poison() {
        return getDamage()*0.3;
    }
}
