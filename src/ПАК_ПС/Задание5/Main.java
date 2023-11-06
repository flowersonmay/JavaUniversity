package ПАК_ПС.Задание5;

public class Main {
    public static void main(String[] args) {
        Unit unit = new Unit("Hero");
        QuestTalk questTalk = new QuestTalk();
        NPCunit npCunit =new NPCunit("NPC", questTalk);
        npCunit.Talk(unit);

        System.out.println("==============");
        SmallTalk smallTalk = new SmallTalk();
        npCunit.setTalkStrategy(smallTalk);
        npCunit.Talk(unit);

    }
}
