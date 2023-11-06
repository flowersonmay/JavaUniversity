package ПАК_ПС.Задание5;

import java.util.ArrayList;
import java.util.Random;

public class SmallTalk  implements TalkStrategy{
    ArrayList<String> first = new ArrayList<>();
    {
        first.add("Привет, странник");
        first.add("Погода сегодня странная...");
    }
    ArrayList<String> second = new ArrayList<>();
    {
        second.add("Как поживаешь?");
        second.add("Хочешь анекдот?");
    }
    @Override
    public void toTalk(Unit speaker, Unit target) {
        Random random = new Random();
        String s = first.get(random.nextInt(0,first.size())) + " " +
                second.get(random.nextInt(0,first.size())) + " ";
        System.out.println(
                speaker.getName() + " says to " + target.getName() + " ' " + s + " '"
        );
    }
}
