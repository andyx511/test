package 设计模式.观察者模式;

/**
 * projectName：test
 * name：ObserverPatternDemo
 * description：todo
 * date：2020/5/8 8:46 下午
 * auther：nidingbo
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
