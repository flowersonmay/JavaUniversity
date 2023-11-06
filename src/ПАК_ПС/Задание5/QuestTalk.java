package ПАК_ПС.Задание5;

import РПJava.Задание2.Пункт1.Array;

import java.util.ArrayList;
import java.util.Random;

public class QuestTalk implements TalkStrategy {
    ArrayList<String> first = new ArrayList<>();
    {
        first.add("Ты должен");
        first.add("Ты обязан");
        first.add("Тебе необходимо");
    }
    ArrayList<String> second = new ArrayList<>();
    {
        second.add("пройти через");
        second.add("преодолеть мыс");
        second.add("добраться до");
    }
    ArrayList<String> third = new ArrayList<>();
    {
        third.add("Лес смерти");
        third.add("Белый хлад");
        third.add("Гора тысячи голов");

    }
    @Override
    public void toTalk(Unit speaker, Unit target) {
        Random random = new Random();
        String s = first.get(random.nextInt(0,first.size())) + " " +
                second.get(random.nextInt(0,first.size())) + " " +
                third.get(random.nextInt(0,first.size()));
        System.out.println(
                speaker.getName() + " says to " + target.getName() + " ' " + s + " '"
        );
    }
}
