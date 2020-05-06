package 算法;

import java.util.Arrays;

/**
 * projectName：test
 * name：有序数组去重(字节)
 * description：todo 要求只能在原数组进行修改
 * date：2020/4/21 9:08 下午
 * auther：nidingbo
 */
public class 有序数组去重字节跳动 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,3,3,4,5,6,6,7};
        int index = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] != arr[index]) {
                continue;
            }else {
                index++;
                arr[index] = arr[i];
            }
        }
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
