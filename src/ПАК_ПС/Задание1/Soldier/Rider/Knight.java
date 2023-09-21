package ПАК_ПС.Задание1.Soldier.Rider;

import ПАК_ПС.Задание1.Interface.IUnit;

import java.util.Random;

public class Knight extends Rider implements IUnit {

    Random random = new Random();
    public Knight(){
        super.setArmour(random.nextInt(5,10));
        super.setHp(random.nextInt(150,200));
        super.setAttack(random.nextInt(35,50));
        setYpeOfRidingt("Brave Hours");
    }

    @Override
    public String sayAttack() {
        return "I'M BRAVE KNIGHT AND U MUST BE KILLED ";
    }

    @Override
    public String SayWhat() {
        return "no...no....u kill my brave hours...";
    }
}
