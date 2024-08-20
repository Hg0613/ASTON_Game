package ASTON_DZ1.Enemy.Classes;

import ASTON_DZ1.Enemy.Enemy;
import ASTON_DZ1.Hero.Hero;

public class Zombie extends Enemy {

    {
        damage = 40;
        mana = 100;
    }

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        if (hero.isAlive()) {
            System.out.println("Зомби атакует " + hero.getName());
            hero.takeDamage(damage);
        }
        else
            System.out.println(hero.getName() + " уже мертв");
    }

    public void specialAbility() {
        if (mana > 0) {
            System.out.println("!!!Применена специальная способность!!!\nВозрождение\n+100 ед. здоровья\n-100 ед. маны");
            setHealth(100);
            mana -= 100;
        }
        else {
            System.out.println("!!!Отмена использования способности!!!\nВозрождение уже было использовано");
            mana = 0;
        }
    }
}
