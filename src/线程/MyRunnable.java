package 线程;

import java.util.ArrayList;
import java.util.List;

/**
 * projectName：test
 * name：MyRunnable
 * description：todo
 * date：2020/4/21 7:31 下午
 * auther：nidingbo
 */
public class MyRunnable implements Runnable {
    private List<Integer> list ;

    public MyRunnable(List<Integer> list){
        this.list = list;
    }

    @Override
    public void run() {
        for (int k = 0; k < list.size(); k = k + 500 ){
            List list1 = new ArrayList();
            if (k+500 > list.size()){
                list1 = list.subList(k,list.size());
            }else {
                list1 = list.subList(k,k+500);
            }
            System.out.println(list1.size());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
