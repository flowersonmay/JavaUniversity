package ПАК_ПС.Задание4.Команды;
import ПАК_ПС.Задание4.Unit;

public class AttackCommand extends Command {
    private Unit target;
    private Unit player;
    public AttackCommand(Unit target, Unit player) {
        this.target = target;
        this.player = player;

    }

    public void getAttack(Unit target){
        this.target.setHp(target.getHp() - player.getBaseAttack());
    }

    @Override
    public void Execute() {
        getAttack(target);
    }
}
