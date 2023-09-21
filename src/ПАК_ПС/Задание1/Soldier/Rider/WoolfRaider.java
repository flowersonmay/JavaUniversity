package ПАК_ПС.Задание1.Soldier.Rider;

import ПАК_ПС.Задание1.Interface.IUnit;

import java.util.Random;

public class WoolfRaider extends Rider implements IUnit {
    Random random = new Random();
    public WoolfRaider(){
        super.setArmour(random.nextInt(5,10));
        super.setHp(random.nextInt(150,200));
        super.setAttack(random.nextInt(35,50));
        setYpeOfRidingt("Dark wolf");
    }

    @Override
    public String sayAttack() {
        return "Arghhht fas u";
    }

    @Override
    public String SayWhat() {
        return "brasat wolf can'st sapthf u ";
    }
}
