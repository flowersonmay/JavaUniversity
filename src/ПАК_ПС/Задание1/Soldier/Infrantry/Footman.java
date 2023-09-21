package ПАК_ПС.Задание1.Soldier.Infrantry;

import ПАК_ПС.Задание1.Interface.IUnit;

import java.util.Random;

public class Footman extends Infantry implements IUnit {

    Random random = new Random();
    public Footman(){
        super.setArmour(random.nextInt(20,25));
        super.setHp(random.nextInt(100,150));
        super.setAttack(random.nextInt(10,20));
    }

    @Override
    public String sayAttack() {
        return "I KILL U COS UORC";
    }

    @Override
    public String SayWhat() {
        return "wait what, i'm human i'm better than u?";
    }
}
