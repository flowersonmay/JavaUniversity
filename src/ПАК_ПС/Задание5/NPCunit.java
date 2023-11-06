package ПАК_ПС.Задание5;

public class NPCunit extends Unit{
    private TalkStrategy talkStrategy;

    public NPCunit(String name) {
        super(name);
    }
    public NPCunit(String name, TalkStrategy talkStrategy){
        super(name);
        this.talkStrategy = talkStrategy;
    }


    public TalkStrategy getTalkStrategy() {
        return talkStrategy;
    }

    public void setTalkStrategy(TalkStrategy talkStrategy) {
        this.talkStrategy = talkStrategy;
    }

    public void Talk(Unit target){
        talkStrategy.toTalk(this, target);
    }
}
