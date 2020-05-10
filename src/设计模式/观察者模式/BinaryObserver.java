package 设计模式.观察者模式;

/**
 * projectName：test
 * name：BinaryObserver
 * description：todo
 * date：2020/5/8 8:45 下午
 * auther：nidingbo
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}