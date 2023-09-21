package ПАК_ПС.Задание1.Soldier.Worker;

public class Worker {
    int hp;
    int attack;

    public Worker() {
    }

    public Worker(int hp, int attack) {
        this.hp = hp;
        this.attack = attack;
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
