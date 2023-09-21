package ПАК_ПС.Задание1.Soldier.Rider;

public class Rider {
    int hp;
    int armour;
    int attack;
    String ypeOfRidingt;

    public Rider() {
    }

    public Rider(int hp, int armour, int attack) {
        this.hp = hp;
        this.armour = armour;
        this.attack = attack;
    }

    public String getYpeOfRidingt() {
        return ypeOfRidingt;
    }

    public void setYpeOfRidingt(String ypeOfRidingt) {
        this.ypeOfRidingt = ypeOfRidingt;
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
