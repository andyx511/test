package JUC;

import java.io.IOException;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * projectName：test
 * name：Exchanger
 * description：todo
 * date：2020/5/12 11:05 下午
 * auther：AlexNi
 */
public class ExchangerTest {
    public void latch() throws InterruptedException, IOException {
        int count = 5;
        Exchanger<String> exchanger = new Exchanger<>();
        ExecutorService executorService = Executors.newFixedThreadPool(count);
        for (int x=0;x<count;x++){
            executorService.execute(new Worker(x,exchanger));
        }
        System.in.read();
    }

    class Worker extends Thread {
        Integer start;
        Exchanger<String>  exchanger;

        public Worker(Integer start, Exchanger<String> exchanger) {
            this.start = start;
            this.exchanger = exchanger;
        }

        @Override
        public void run() throws IllegalArgumentException {
            try {
                System.out.println(Thread.currentThread().getName() + " 准备执行");
                TimeUnit.SECONDS.sleep(start);
                System.out.println(Thread.currentThread().getName() + " 等待交换");
                String value = exchanger.exchange(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName() + " 交换得到数据为："+value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        ExchangerTest test = new ExchangerTest();
        test.latch();
    }
}
