package ПАК_ПС.Задание4.Команды;

public class MoveCommand extends Command{

    private int x;
    private int y;


    public MoveCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(){
        System.out.println("Двигаемся по X на " + this.x);
        System.out.println("Двигаемся по Y на " + this.y);

    }
    @Override
    public void Execute() {
        move();
    }
}
