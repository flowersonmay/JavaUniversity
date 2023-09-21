package ПАК_ПС.Задание1.Soldier.Worker;

import ПАК_ПС.Задание1.Interface.IUnit;

import java.util.Random;

public class Peasant extends Worker implements IUnit {
    Random random = new Random();
    public Peasant(){
        super.setHp(random.nextInt(50,100));
        super.setAttack(random.nextInt(25,30));
    }

    @Override
    public String sayAttack() {
        return "Jaj chieftain? Arghhht";
    }

    @Override
    public String SayWhat() {
        return "chieftain comretnaWarde";
    }
}
