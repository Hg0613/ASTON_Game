package ASTON_DZ1;

import ASTON_DZ1.Enemy.Classes.Zombie;
import ASTON_DZ1.Hero.Classes.Archer;
import ASTON_DZ1.Hero.Classes.Mage;
import ASTON_DZ1.Hero.Classes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Стон", 100);
        warrior.attackEnemy(new Zombie(20));

        Mage mage = new Mage("Рах", 100);
        mage.attackEnemy(new Zombie(20));

        Archer archer = new Archer("Фист", 100);
        archer.attackEnemy(new Zombie(20));

    }

}
