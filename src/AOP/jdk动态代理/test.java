package AOP.jdk动态代理;

import java.lang.reflect.InvocationTargetException;

/**
 * projectName：test
 * name：test
 * description：todo
 * 可以看到对于不同的实现类来说，
 * 可以用同一个动态代理类来进行代理，实现了“一次编写到处代理”的效果。
 * 但是这种方法有个缺点，就是被代理的类一定要是实现了某个接口的，
 * 这很大程度限制了本方法的使用场景。下面还有另外一个使用了CGlib增强库的方法
 * date：2020/3/21 11:47 上午
 * auther：nidingbo
 */
public class test {
    public static void main(String[] args) throws InvocationTargetException {
        Fruit fruit = (Fruit)DynamicAgent.MyHandler.agent(Fruit.class,new Apple());
        fruit.show();
    }
}
