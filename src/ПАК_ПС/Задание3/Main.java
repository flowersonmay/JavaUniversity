package ПАК_ПС.Задание3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Unit> army = new ArrayList<>();
        army.add(new Rider());
        army.add(new Worker());



        CompositeUnit squad = new CompositeUnit();
        army.add(squad);
        for (Unit unit:army){
            if (unit instanceof Compose c){
                c.add(new Infantry());
                c.add(new Infantry());
                c.add(new Infantry());
            }
        }
        int maxPower = 0;
        for (Unit unit:army){
            maxPower += unit.getHitDamage();
        }
        System.out.println(maxPower);


    }


}
