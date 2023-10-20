package ПАК_ПС.Задание4;

import ПАК_ПС.Задание4.Команды.Command;

public interface IUnit {
    public void Say();
    public void SetCommand(Command command);
    public void ExecuteCommand();
}
