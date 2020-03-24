package 线程;

/**
 * projectName：test
 * name：T4
 * description：todo
 * date：2020/3/24 9:26 上午
 * auther：nidingbo
 */
public class T4 {
    public static void main(String[] args){

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){

                }
                System.out.println(Thread.currentThread().getName() + " :working");
            }
        },"线程1");

        try{
            thread.join();
        }catch (InterruptedException e){

        }

        thread.start();

        /*try{
            thread.join();
        }catch (InterruptedException e){

        }*/

        System.out.println("main end");
    }
}
