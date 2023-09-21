package ПАК_ПС.Задание1.Soldier.Infrantry;

import ПАК_ПС.Задание1.Interface.IUnit;

import java.util.Random;

public class Grunt extends Infantry implements IUnit {

    Random random = new Random();
    public Grunt(){
        super.setArmour(random.nextInt(5,15));
        super.setHp(random.nextInt(130,180));
        super.setAttack(random.nextInt(15,25));
    }
    @Override
    public String sayAttack() {
        return "Ragh imleath 'sepa";
    }

    @Override
    public String SayWhat() {
        return "Raaaght?";
    }
}
