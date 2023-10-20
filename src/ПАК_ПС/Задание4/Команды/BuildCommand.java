package ПАК_ПС.Задание4.Команды;

import ПАК_ПС.Задание4.IUnit;
import ПАК_ПС.Задание4.Unit;

public class BuildCommand extends Command{
    private String nameBuilding;

    public BuildCommand(String nameBuilding) {
        this.nameBuilding = nameBuilding;
    }


    @Override
    public void Execute() {
        System.out.println("Я строю главное здание" + this.nameBuilding);
    }
}
