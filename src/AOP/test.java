package AOP;

/**
 * projectName：test
 * name：test
 * description：todo
 * 静态代理
 * date：2020/3/21 11:21 上午
 * auther：nidingbo
 */
public class test {
    public static void main(String[] args){
        Actor actor = new Actor("I am a famous actor");
        Agent agent = new Agent(actor, "Hello, I am an agent", "That is all");
        agent.speak();
    }
}
