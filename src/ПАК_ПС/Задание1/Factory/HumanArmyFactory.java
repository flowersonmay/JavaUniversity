package ПАК_ПС.Задание1.Factory;

import ПАК_ПС.Задание1.Soldier.Infrantry.Footman;
import ПАК_ПС.Задание1.Soldier.Infrantry.Infantry;
import ПАК_ПС.Задание1.Soldier.Rider.Knight;
import ПАК_ПС.Задание1.Soldier.Rider.Rider;
import ПАК_ПС.Задание1.Soldier.Worker.Peon;
import ПАК_ПС.Задание1.Soldier.Worker.Worker;

public class HumanArmyFactory extends ArmyFactory{
    @Override
    public Infantry createInfantry() {
        return new Footman();
    }

    @Override
    public Rider createRider() {
        return new Knight();
    }

    @Override
    public Worker createWorker() {
        return new Peon();
    }
}
