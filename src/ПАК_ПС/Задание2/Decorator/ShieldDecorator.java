package ПАК_ПС.Задание2.Decorator;

import ПАК_ПС.Задание2.IUnit;

public class ShieldDecorator implements IUnit {

    IUnit iUnit;

    public ShieldDecorator(IUnit iUnit) {
        this.iUnit = iUnit;
    }

    @Override
    public int attack() {
        return iUnit.attack() + 1;
    }

    @Override
    public int armour() {
        return iUnit.armour() + 20;
    }
}
