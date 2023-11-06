package ПАК_ПС.Задание4;

import ПАК_ПС.Задание4.Команды.AttackCommand;
import ПАК_ПС.Задание4.Команды.BuildCommand;
import ПАК_ПС.Задание4.Команды.MoveCommand;

public class Main {
    public static void main(String[] args) {
        Unit player = new Unit("Dima", 12, 100);
        BuildCommand buildCommand = new BuildCommand("Главное здание");
        player.SetCommand(buildCommand);
        player.ExecuteCommand();

        Unit target = new Unit("Target",12,50);
        AttackCommand attackCommand = new AttackCommand(target, player);
        player.SetCommand(attackCommand);
        player.ExecuteCommand();
        System.out.println(target.getHp());

        MoveCommand moveCommand = new MoveCommand(10,12);
        player.SetCommand(moveCommand);
        player.ExecuteCommand();
    }
}
