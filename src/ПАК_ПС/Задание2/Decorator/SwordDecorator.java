package ПАК_ПС.Задание2.Decorator;

import ПАК_ПС.Задание2.IUnit;

public class SwordDecorator implements IUnit {

    IUnit iUnit;

    public SwordDecorator(IUnit iUnit) {
        this.iUnit = iUnit;
    }

    @Override
    public int attack() {
        return iUnit.attack() + 15;
    }

    public int armour(){
        return iUnit.armour()+2;
    }
}
