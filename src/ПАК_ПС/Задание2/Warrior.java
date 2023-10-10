package ПАК_ПС.Задание2;

public class Warrior implements IUnit{

    private int baseAttack;
    private int hp;
    private int armour;

    public Warrior(int baseAttack, int hp, int armour) {
        this.baseAttack = baseAttack;
        this.hp = hp;
        this.armour = armour;
    }

    public Warrior(IUnit iUnit, int hp){
        this.baseAttack = iUnit.attack();
        this.armour = iUnit.armour();
        this.hp = hp;
    }
public Warrior(IUnit iUnit){
        this.baseAttack = iUnit.attack();
        this.baseAttack = iUnit.armour();
        this.hp = (baseAttack + armour) * 2;
}
    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
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

    @Override
    public int attack() {
        return getBaseAttack();
    }

    @Override
    public int armour() {
        return getArmour();
    }
}
