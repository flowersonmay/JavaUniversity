package ПАК_ПС.Задание1.Soldier.Infrantry;

import ПАК_ПС.Задание1.Interface.IUnit;

public class Infantry {

    int hp;
    int armour;
    int attack;

    public Infantry() {
    }

    public Infantry(int hp, int armour, int attack) {
        this.hp = hp;
        this.armour = armour;
        this.attack = attack;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
