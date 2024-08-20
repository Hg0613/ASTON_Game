package ASTON_DZ1.Enemy;

import ASTON_DZ1.Hero.Hero;
import ASTON_DZ1.Global.Status.Mortal;

abstract public class Enemy implements Mortal {
    private int health = 0;
    protected int mana;
    protected int damage;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    abstract public void attackHero(Hero hero);

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
