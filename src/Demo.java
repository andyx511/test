import 线程池.MyCallable;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Demo {

    public static void main(String[] args) throws Exception {
        Integer a = 1, b = 2;
        swap(a, b);
        int c = 134, d = 2;
        swap(c,d);
        int e = c;
        c= d;
        d=e;
        System.out.println("after a=" + a + ", b=" + b);
        System.out.println("after c=" + c + ", d=" + d);
    }

    public static void swap(Integer a, Integer b) throws Exception {
        Integer temp;
        temp = a;
        a = b;
        b = temp;
    }
    public static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

}
