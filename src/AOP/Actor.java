package AOP;

/**
 * projectName：test
 * name：Actor
 * description：todo 实现类
 * date：2020/3/21 11:11 上午
 * auther：nidingbo
 */
public class Actor implements Person {

    private String content;

    public Actor(String s){
        this.content = s;
    }

    @Override
    public void speak() {
        System.out.println(this.content);
    }
}
