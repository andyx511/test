package 设计模式.单例;

import java.util.HashMap;
import java.util.Map;

/**
 * projectName：test
 * name：test
 * description：todo
 * date：2020/3/22 11:31 上午
 * auther：nidingbo
 */
public class test {
    public static void main(String[] args){
        Singleton.INSTANCE.getPerson();
        Map a = new HashMap();
        System.out.println(Singleton.INSTANCE.getPerson()==Singleton.INSTANCE.getPerson());
    }
}
