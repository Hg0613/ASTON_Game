package ASTON_DZ1.Hero.Classes;

import ASTON_DZ1.Enemy.Enemy;
import ASTON_DZ1.Hero.Hero;

public class Archer extends Hero {

    {
        damage = 20;
        mana = 80;
    }

    public Archer(String name, int health) {
        super(name, health);
        System.out.println("!!!Создан герой!!!\nКласс: Лучник\nИмя: " + name + "\nЗдоровье: " + health + "\nМана: " + mana + "\nУрон: " + damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (enemy.isAlive()) {
            System.out.println("Лучник \'" + getName() + "\' атакует " + enemy.getClass().getSimpleName());
            enemy.takeDamage(damage);
        }
        else
            System.out.println(enemy.getClass().getSimpleName() + " уже мертв");
    }

}
