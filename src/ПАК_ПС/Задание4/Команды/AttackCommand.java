package ПАК_ПС.Задание4.Команды;

import ПАК_ПС.Задание4.IUnit;
import ПАК_ПС.Задание4.Unit;

public class AttackCommand extends Command {
    private Unit target;
    public AttackCommand(Unit target) {
        this.target = target;}

    public void getAttack(Unit target){
        this.target.setHp(target.getHp() - 12);
    }

    @Override
    public void Execute() {
        getAttack(target);
    }
}
