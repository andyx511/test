package 原子类;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * projectName：test
 * name：NotThreadSafeConcurrency
 * description：todo
 * date：2020/5/12 9:33 下午
 * auther：nidingbo
 */
public class NotThreadSafeConcurrency {
    private static int CLIENT_COUNT = 5000;
    private static int THREAD_COUNT = 200;
     private static int count = 0;
    // private static AtomicInteger count = new AtomicInteger(0);
    private static int[] values = new int[11];

    private static ExecutorService executorService = Executors.newCachedThreadPool();
    private final static Semaphore semaphore = new Semaphore(THREAD_COUNT);
    private final static CountDownLatch countDownLatch = new CountDownLatch(CLIENT_COUNT);

    public static void main(String[] args) throws Exception {
        testAtomicInt();
    }

    private static void testAtomicInt() throws Exception {
        for (int i = 0; i < CLIENT_COUNT; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    add();
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // count每加 1，进行减 1 计数
                countDownLatch.countDown();
            });
        }
        // 等待线程池所有任务执行结束
        countDownLatch.await();
        executorService.shutdown();
        System.out.println("ConcurrencyDemo:" + count);
    }

    private static void add() {
        count++;
        // count.incrementAndGet();
    }
}
