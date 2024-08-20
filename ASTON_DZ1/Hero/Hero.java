package ASTON_DZ1.Hero;

import ASTON_DZ1.Enemy.Enemy;
import ASTON_DZ1.Global.Status.Mortal;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    protected int damage;
    protected int mana;

    public Hero(String name, int health) {
        this.name = name;
        if (health > 100)
            this.health = 100;
        else
            this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > 100)
            this.health = 100;
        else
            this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public int getMana() {
        return mana;
    }

    abstract public void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0)
            this.health = 0;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
