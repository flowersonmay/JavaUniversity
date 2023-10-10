package ПАК_ПС.Задание3;

public abstract class Unit {

    private int hitDamage;

    public Unit(int hitDamage) {
        this.hitDamage = hitDamage;
    }

    public int getHitDamage() {
        return hitDamage;
    }

    public void setHitDamage(int hitDamage) {
        this.hitDamage = hitDamage;
    }

    public void sayAttack(){
        System.out.println("За императора!");
    }

}
