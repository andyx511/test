package 设计模式.观察者模式;

/**
 * projectName：test
 * name：OctalObserver
 * description：todo
 * date：2020/5/8 8:45 下午
 * auther：nidingbo
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}