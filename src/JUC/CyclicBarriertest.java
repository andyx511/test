package JUC;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * projectName：test
 * name：CyclicBarrier
 * description：todo
 * date：2020/5/12 10:26 下午
 * auther：nidingbo
 */
public class CyclicBarriertest {

    public void latch() throws InterruptedException {
        int count = 5;
        CyclicBarrier cb = new CyclicBarrier(count, new Runnable() {
            @Override
            public void run() {
                System.out.println("全部执行完毕");
            }
        });
        ExecutorService executorService = Executors.newFixedThreadPool(count);
        while (true){
            for (int x=0;x<count;x++){
                executorService.execute(new Worker(x,cb));
            }
        }
    }

    class Worker extends Thread {
        Integer start;
        CyclicBarrier cyclicBarrier;

        public Worker(Integer start, CyclicBarrier cyclicBarrier) {
            this.start = start;
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            System.out.println(start + " 已执行");
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CyclicBarriertest test = new CyclicBarriertest();
        test.latch();
    }
}
