package 排序;

import java.util.Arrays;

/**
 * projectName：test
 * name：选择
 * description：todo
 * date：2020/3/25 5:55 下午
 * auther：nidingbo
 */
public class 选择 {
    public static void sort(int[]arr){
        for (int i = 0 ; i<arr.length; i++){
            for (int j = i+1; j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
    public static void swap(int a,int b){
        int t = a;
        a = b;
        b = t;

    }
    public static void main(String[] args){
        int []arr = {9,45,7,6,65,4,3,2,1};
        sort(arr);
        int a = 1,b = 2;
        swap(a,b);
        System.out.println("a=" + a + ",b=" + b);
        System.out.println(Arrays.toString(arr));
    }
}
