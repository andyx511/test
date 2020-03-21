package AOP;

/**
 * projectName：test
 * name：Agent
 * description：todo
 * date：2020/3/21 11:13 上午
 * auther：nidingbo
 */
public class Agent implements Person {

    private Actor actor;

    public String before;

    public String after;

    public Agent (Actor actor, String before, String after){
        this.actor = actor;
        this.before = before;
        this.after = after;
    }

    @Override
    public void speak() {

        System.out.println("在actor说之前，代理说" + before);

        this.actor.speak();

        System.out.println("在actor说之后，代理说" + after);

    }
}
