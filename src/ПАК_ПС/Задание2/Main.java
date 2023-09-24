package ПАК_ПС.Задание2;

import ПАК_ПС.Задание2.Decorator.ShieldDecorator;
import ПАК_ПС.Задание2.Decorator.SwordDecorator;

import javax.imageio.event.IIOWriteWarningListener;

public class Main {
    public static void main(String[] args) {

        IUnit warrior = new Warrior(10,100,15);

        System.out.println(warrior.attack() + "  | " + warrior.armour());
        IUnit knife = new SwordDecorator(warrior);
        System.out.println(knife.attack() + " | " + knife.armour());
        IUnit shield = new ShieldDecorator(knife);
        System.out.println(shield.attack() + " | " + shield.armour());

        Warrior warrior1 = new Warrior(shield,1000);
        System.out.println(warrior1.getBaseAttack());

    }
}
