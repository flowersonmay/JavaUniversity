package ПАК_ПС.Задание4;

import ПАК_ПС.Задание4.Команды.Command;

public class Unit implements IUnit{
    private String name;
    private int baseAttack;
    private int hp;

    private int x = 0;
    private int y = 0;

    private Command command;
    public Unit(String name, int baseAttack, int hp) {
        this.name = name;
        this.baseAttack = baseAttack;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void Say() {
        System.out.println("Hello, im " +  this.name +  " my attack  " + this.baseAttack);
    }

    @Override
    public void SetCommand(Command command) {
        this.command = command;

    }


    @Override
    public void ExecuteCommand() {
        this.command.Execute();
    }
}
