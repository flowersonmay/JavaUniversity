package ПАК_ПС;

import ПАК_ПС.Задание1.Factory.ArmyFactory;
import ПАК_ПС.Задание1.Factory.HumanArmyFactory;
import ПАК_ПС.Задание1.Factory.OrcArmyFactory;
import ПАК_ПС.Задание1.Interface.IUnit;
import ПАК_ПС.Задание1.Soldier.Infrantry.Footman;
import ПАК_ПС.Задание1.Soldier.Infrantry.Grunt;
import ПАК_ПС.Задание1.Soldier.Infrantry.Infantry;
import ПАК_ПС.Задание1.Soldier.Rider.Knight;
import ПАК_ПС.Задание1.Soldier.Rider.WoolfRaider;
import ПАК_ПС.Задание1.Soldier.Worker.Peasant;
import ПАК_ПС.Задание1.Soldier.Worker.Peon;

import java.util.ArrayList;
import java.util.List;


public class Main {
//    public

    public static void main(String[] args) throws InterruptedException {

        ArmyFactory humanArmy = new HumanArmyFactory();
        ArmyFactory orcArmy = new OrcArmyFactory();


        List<IUnit> humanUnits = new ArrayList<>();
        humanUnits.add((Footman)humanArmy.createInfantry());
        humanUnits.add((Footman)humanArmy.createInfantry());
        humanUnits.add((Footman)humanArmy.createInfantry());
        humanUnits.add((Knight)humanArmy.createRider());
        humanUnits.add((Knight)humanArmy.createRider());
        humanUnits.add((Peon)humanArmy.createWorker());

        List<IUnit> orcUnits = new ArrayList<>();
        orcUnits.add((Grunt)orcArmy.createInfantry());
        orcUnits.add((Grunt)orcArmy.createInfantry());
        orcUnits.add((Grunt)orcArmy.createInfantry());
        orcUnits.add((WoolfRaider)orcArmy.createRider());
        orcUnits.add((WoolfRaider)orcArmy.createRider());
        orcUnits.add((Peasant)orcArmy.createWorker());

        for (IUnit unit : humanUnits){
            System.out.println(unit.getClass().getSimpleName() + " | " + unit.sayAttack());
        }
        System.out.println(" ");

        for (IUnit unit : orcUnits){
            System.out.println(unit.getClass().getSimpleName() + " | " + unit.sayAttack());
        }
        humanUnits.get(0).SayWhat();
    }
}
