package 线程池;

import java.util.Date;

/**
 * projectName：test
 * name：MyRunnable
 * description：todo
 * date：2020/3/20 2:37 下午
 * auther：nidingbo
 */
public class MyRunnable implements Runnable{

    private String command;

    public MyRunnable(String string){
        this.command = string;
    }

    private void processCommand() throws InterruptedException {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "----->startTime=" + new Date());
        try {
            this.processCommand();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "----->endTime=" + new Date());
    }
}
