package 线程;

/**
 * projectName：test
 * name：T1
 * description：todo
 * date：2020/3/24 9:05 上午
 * auther：nidingbo
 */
public class T1 {
    public static void main(String[] args){
        Thread thread = new Thread(() -> {
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){

            }
        });
        thread.start();

        while(true){
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){

            }
            System.out.println("线程状态： " + thread.getState());
            if (Thread.State.TERMINATED.equals(thread.getState())){
                System.out.println("线程状态：" + thread.getState());
                break;
            }
        }

    }
}
