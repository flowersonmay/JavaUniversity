package ПАК_ПС.Задание1.Soldier.Worker;

import ПАК_ПС.Задание1.Interface.IUnit;

import java.util.Random;

public class Peon extends Worker implements IUnit {

    Random random = new Random();
    public Peon(){
        super.setHp(random.nextInt(50,100));
        super.setAttack(random.nextInt(25,30));
    }
    @Override
    public String sayAttack() {
        return "GOD SAVE THE KING FOR HUMANITY. THIS IS MY COUNTRY, MY FIELD";
    }

    @Override
    public String SayWhat() {
        return "u win. But u never win humanity. god save the ki..agh..ng...";
    }
}
