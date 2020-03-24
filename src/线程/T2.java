package 线程;

import javax.swing.plaf.TableHeaderUI;

/**
 * projectName：test
 * name：T2
 * description：todo
 * 借助于sleep方法，可以模拟线程的顺序执行
 * date：2020/3/24 9:10 上午
 * auther：nidingbo
 */
public class T2 {
    public static void main(String[] args){
        //模拟执行任务的第一个阶段的执行
        Thread stepOne = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+" : 第一阶段任务开始执行");
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" : 第一阶段任务执行结束");
            } catch (InterruptedException e) {
            }
        }, "firstStage");
        stepOne.start();
//模拟任务第二个阶段的执行
        Thread stepTwo = new Thread(() -> {
            while (!Thread.State.TERMINATED.equals(stepOne.getState())) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+" : 我在等待第一阶段任务执行结束");
                } catch (InterruptedException e) {
                }
            }
            System.out.println(Thread.currentThread().getName()+" : 第二阶段任务执行结束");
        }, "secondStage");
        stepTwo.start();
    }
}
