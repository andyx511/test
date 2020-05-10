package 设计模式.观察者模式;

/**
 * projectName：test
 * name：Observer
 * description：todo
 * date：2020/5/8 8:43 下午
 * auther：nidingbo
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}