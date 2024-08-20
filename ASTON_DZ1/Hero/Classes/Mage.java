package ASTON_DZ1.Hero.Classes;

import ASTON_DZ1.Enemy.Enemy;
import ASTON_DZ1.Hero.Hero;

public class Mage extends Hero {
    private int tempMana;

    {
        damage = 40;
        mana = 150;
        tempMana = mana;
    }

    public Mage(String name, int health) {
        super(name, health);
        System.out.println("!!!Создан герой!!!\nКласс: Маг\nИмя: " + name + "\nЗдоровье: " + health + "\nМана: " + mana + "\nУрон: " + damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (enemy.isAlive()) {
            if (mana < tempMana)
                mana += 25;
            else if (mana > tempMana)
                mana = tempMana;
            System.out.println("Маг \'" + getName() + "\' атакует " + enemy.getClass().getSimpleName());
            enemy.takeDamage(damage);
        }
        else
            System.out.println(enemy.getClass().getSimpleName() + " уже мертв");
    }

    public void specialAbility(Hero hero) {
        if (hero.isAlive()) {
            if (mana >= 50) {
                System.out.println("!!!Применена специальная способность!!!\n+25 ед. к здоровью " + hero.getName() + "\n-50 ед. маны");
                hero.setHealth(hero.getHealth() + 25);
                mana -= 50;
            }
            else
                System.out.println("!!!Отмена использования способности!!!\nНедостаточно маны");
            if (mana < 0)
                mana = 0;
        }
        else
            System.out.println("!!!Отмена использования способности!!!\n" + hero.getName() + " уже мертв");
    }
}
