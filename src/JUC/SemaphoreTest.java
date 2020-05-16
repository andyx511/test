package JUC;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * projectName：test
 * name：SemaphoreTest
 * description：todo
 * date：2020/5/12 10:48 下午
 * auther：AlexNi
 */
public class SemaphoreTest {
    public void latch() throws InterruptedException, IOException {
        int count = 5;
        Semaphore semaphore = new Semaphore(1);
        ExecutorService executorService = Executors.newFixedThreadPool(count);
        for (int x=0;x<count;x++){
            executorService.execute(new Worker(x,semaphore));
        }
        System.in.read();
    }

    class Worker extends Thread {
        Integer start;
        Semaphore semaphore;

        public Worker(Integer start, Semaphore semaphore) {
            this.start = start;
            this.semaphore = semaphore;
        }

        @Override
        public void run() throws IllegalArgumentException {
            try {
                System.out.println(start + " 准备执行");
                TimeUnit.SECONDS.sleep(1);
                semaphore.acquire();
                System.out.println(start + " 已经执行");
                semaphore.release();
                System.out.println(start + " 已经释放");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        SemaphoreTest test = new SemaphoreTest();
        test.latch();
    }
}
