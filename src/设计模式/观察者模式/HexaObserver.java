package 设计模式.观察者模式;

/**
 * projectName：test
 * name：HexaObserver
 * description：todo
 * date：2020/5/8 8:46 下午
 * auther：nidingbo
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
