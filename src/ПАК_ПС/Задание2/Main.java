package ПАК_ПС.Задание2;

import ПАК_ПС.Задание2.Decorator.ShieldDecorator;
import ПАК_ПС.Задание2.Decorator.SwordDecorator;


public class Main {
    public static void main(String[] args) {

        IUnit warrior = new Warrior(10,100,15);

        System.out.println("Базовый персонаж " + warrior.attack() + "  | " + warrior.armour());
        IUnit knife = new SwordDecorator(warrior);
        System.out.println("Добавлен меч " + knife.attack() + " | " + knife.armour());
        IUnit shield = new ShieldDecorator(knife);
        System.out.println("Добавлен щит " + shield.attack() + " | " + shield.armour());

        Warrior warrior1 = new Warrior(shield,1000);
        System.out.println(warrior1.getBaseAttack() + " | " + warrior1.getArmour());

    }
}
