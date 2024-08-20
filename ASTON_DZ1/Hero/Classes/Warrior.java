package ASTON_DZ1.Hero.Classes;

import ASTON_DZ1.Enemy.Enemy;
import ASTON_DZ1.Hero.Hero;

public class Warrior extends Hero {
    private int tempDamage;

    {
        damage = 30;
        tempDamage = damage;
        mana = 100;
    }

    public Warrior(String name, int health) {
        super(name, health);
        System.out.println("!!!Создан герой!!!\nКласс: Воин\nИмя: " + name + "\nЗдоровье: " + health + "\nМана: " + mana + "\nУрон: " + damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (enemy.isAlive()) {
            if (mana < 100)
                mana += 25;
            else if (mana > 100)
                mana = 100;
            System.out.println("Воин \'" + getName() + "\' атакует " + enemy.getClass().getSimpleName());
            enemy.takeDamage(damage);
            if (damage > tempDamage)
                damage = tempDamage;
        }
        else
            System.out.println(enemy.getClass().getSimpleName() + " уже мертв");
    }

    public void specialAbility() {
        if (mana >= 50) {
            System.out.println("!!!Применена специальная способность!!!\n+50 ед. к урону\n-50 ед. маны");
            damage += 50;
            mana -= 50;
        }
        else
            System.out.println("!!!Отмена использования способности!!!\nНедостаточно маны");
        if (mana < 0)
            mana = 0;
    }

}
