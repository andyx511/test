package 排序;

import java.util.Arrays;

/**
 * projectName：test
 * name：冒泡
 * description：todo
 * date：2020/3/25 5:44 下午
 * auther：nidingbo
 */
public class 冒泡 {
    public static void main(String[] args){
        int temp ;
        int [] a = {1,9,3,45,4,45};
        for (int i = 0; i < a.length-1; i++){
            for (int j = 0; j < a.length-i-1; j++ ){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }
        }
        Arrays.stream(a).forEach(System.out::println);
    }
}
