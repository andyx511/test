package JUC;

/**
 * projectName：test
 * name：test
 * description：todo
 * date：2020/5/12 10:10 下午
 * auther：nidingbo
 */
public class CountDownLatch {
    public void latch() throws InterruptedException {
        int count= 5;
        java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(count);
        for (int x=0;x<count;x++){
            new Worker(x*20,latch).start();
        }
        latch.await();
        System.out.println("全部执行完毕");
    }
    class Worker extends Thread{
        Integer start;
        java.util.concurrent.CountDownLatch latch;
        public Worker(Integer start, java.util.concurrent.CountDownLatch latch){
            this.start=start;
            this.latch=latch;
        }

        @Override
        public void run() {
            System.out.println(start+" 已执行");
            latch.countDown();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch();
        countDownLatch.latch();
    }

}
