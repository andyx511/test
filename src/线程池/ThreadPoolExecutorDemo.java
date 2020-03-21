package 线程池;

import java.util.concurrent.*;

/**
 * projectName：test
 * name：ThreadPoolExecutorDemo
 * description：todo 阿里巴巴推荐写法
 * date：2020/3/20 2:42 下午
 * auther：nidingbo
 */
public class ThreadPoolExecutorDemo {

    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;

    public static void main(String [] args){
        // 使用ThreadPoolExecutor构造函数自定义参数创建
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );

        ExecutorService pool = Executors.newCachedThreadPool();


        for (int i = 0; i < 10; i++){
            // 创建工作线程对象
            Runnable worker = new MyRunnable(" "+ i);
            pool.execute(worker);
        }
        // 终止线程
        pool.shutdown();
        while(!pool.isTerminated()){

        }
        System.out.println("关闭所有线程");

    }
}
