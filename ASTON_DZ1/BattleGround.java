package ASTON_DZ1;

import ASTON_DZ1.Enemy.Classes.Zombie;
import ASTON_DZ1.Hero.Classes.Archer;
import ASTON_DZ1.Hero.Classes.Mage;
import ASTON_DZ1.Hero.Classes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Zombie enemy = new Zombie(100);

        Warrior warrior = new Warrior("Конан", 60);
        System.out.println();

        warrior.attackEnemy(enemy);
        System.out.println("Здоровье " + enemy.getClass().getSimpleName() + ": " + enemy.getHealth());
        if (!enemy.isAlive())
            System.out.println(enemy.getClass().getSimpleName() + " мертв");
        System.out.println();

        warrior.specialAbility();
        System.out.println("Урон: " + warrior.getDamage() + "\tМана: " + warrior.getMana());
        warrior.attackEnemy(enemy);
        System.out.println("Здоровье " + enemy.getClass().getSimpleName() + ": " + enemy.getHealth());
        if (!enemy.isAlive())
            System.out.println(enemy.getClass().getSimpleName() + " мертв");
        System.out.println("Урон: " + warrior.getDamage() + "\tМана: " + warrior.getMana());
        System.out.println();

        Mage mage = new Mage("Эшли", 30);
        System.out.println();

        mage.specialAbility(warrior);
        System.out.println("Здоровье " + warrior.getName() + ": " + warrior.getHealth());
        System.out.println();

        mage.specialAbility(mage);
        System.out.println("Здоровье " + mage.getName() + ": " + mage.getHealth());
        System.out.println();



        Archer archer =  new Archer("Леголас", 10);
        archer.attackEnemy(enemy);
        System.out.println();

        mage.specialAbility(archer);
        mage.specialAbility(archer);
        System.out.println();

        enemy.specialAbility();
        System.out.println();
        System.out.println("Здоровье " + enemy.getClass().getSimpleName() + ": " + enemy.getHealth());
        for (int i = 0; i < 4; i++) {
            archer.attackEnemy(enemy);
        }
        System.out.println("Здоровье " + enemy.getClass().getSimpleName() + ": " + enemy.getHealth());
        enemy.specialAbility();

    }

}
