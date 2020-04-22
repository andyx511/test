package 线程;

import java.util.ArrayList;
import java.util.List;

/**
 * projectName：test
 * name：T5
 * description：todo
 * date：2020/4/21 7:13 下午
 * auther：nidingbo
 */
public class T5 {
    /*class MyRunable implements Runnable{

        private List<Integer> list ;

        public MyRunable(List<Integer> list){
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
    }*/

    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new ArrayList<>(10003);
        for (int i = 0; i < 10003;i++){
            list.add(i);
        }

        MyRunnable thread = new MyRunnable(list);
        Thread t = new Thread(thread);
        t.start();
    }
}
