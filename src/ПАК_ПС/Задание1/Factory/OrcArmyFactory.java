package ПАК_ПС.Задание1.Factory;

import ПАК_ПС.Задание1.Soldier.Infrantry.Grunt;
import ПАК_ПС.Задание1.Soldier.Infrantry.Infantry;
import ПАК_ПС.Задание1.Soldier.Rider.Rider;
import ПАК_ПС.Задание1.Soldier.Rider.WoolfRaider;
import ПАК_ПС.Задание1.Soldier.Worker.Peasant;
import ПАК_ПС.Задание1.Soldier.Worker.Worker;

public class OrcArmyFactory extends ArmyFactory{
    @Override
    public Infantry createInfantry() {
        return new Grunt();
    }

    @Override
    public Rider createRider() {
        return new WoolfRaider();
    }

    @Override
    public Worker createWorker() {
        return new Peasant();
    }
}
