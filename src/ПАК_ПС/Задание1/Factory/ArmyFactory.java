package ПАК_ПС.Задание1.Factory;

import ПАК_ПС.Задание1.Soldier.Infrantry.Infantry;
import ПАК_ПС.Задание1.Soldier.Rider.Rider;
import ПАК_ПС.Задание1.Soldier.Worker.Worker;

public abstract class ArmyFactory {
     public abstract Infantry createInfantry();
     public abstract Rider createRider();
     public  abstract Worker createWorker();

}
