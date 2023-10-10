package ПАК_ПС.Задание3;

import java.util.ArrayList;
import java.util.List;

public class CompositeUnit extends Unit implements Compose  {
    private List<Unit> unitArrayList = new ArrayList<>();


    public CompositeUnit() {
        super(0);
    }
    @Override
    public void add(Unit unit) {
        unitArrayList.add(unit);
        setHitDamage(getHitDamage()+unit.getHitDamage());
    }

    @Override
    public int getElement(Unit unit) {
        for (int i = 0; i< unitArrayList.size(); i++){
            if (unitArrayList.get(i) == unit) return i;
        }
        return -1;
    }

    @Override
    public void remove(Unit unit) {
        unitArrayList.remove(unit);
    }


}
