package 排序;

import java.util.Arrays;
import java.util.ConcurrentModificationException;

/**
 * projectName：test
 * name：堆测试
 * description：todo
 * date：2020/3/25 6:06 下午
 * auther：nidingbo
 */
public class 堆测试 {


    public static void adjustHeap(int[] arr, int i, int length ){
        int t = arr[i];
        for (int k = 2*i+1; k<length; k = 2*k+1){
            if (k+1<length && arr[k]<arr[k+1]){
                k++;
            }
            if (arr[k]>t){
                arr[i] = arr[k];
                i = k;
            }
        }
        arr[i] = t;
    }

    public static void swap(int[] arr, int a, int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static void sort(int[] arr, int length){
        for (int i = length/2-1; i>=0; i--){
            adjustHeap(arr,i,length);
        }
        for (int i = length-1; i>0; i--){
            swap(arr,0,i);
            adjustHeap(arr,0,i);
        }
    }



    public static void main(String []args){
        int []arr = {9,45,7,6,65,4,3,2,1};
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
