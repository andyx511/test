package 算法;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * projectName：test
 * name：二叉堆
 * description：todo
 * date：2020/4/30 9:59 下午
 * auther：nidingbo
 */
public class 二叉堆 {
    // 上浮调整
    public static void upAdjust(int[] array){
        int childIndex = array.length-1;
        int parentIndex = (childIndex - 1) / 2;
        // temp 保存插入的叶子节点，用于最后赋值
        int temp = array[childIndex];
        while (childIndex > 0 && temp < array[parentIndex]){
            // 无需交换，单向赋值即可
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (parentIndex - 1) / 2;
        }
        array[childIndex] = temp;
    }
    // 下沉调整
    public static void downAdjust(int[] array, int parentIndex, int length){
        // 保存父节点值，用于最后赋值
        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length){
            // 如果有右孩子，且右孩子小于左孩子的值，定位到右孩子
            if (childIndex + 1 < length && array[childIndex + 1] < array[childIndex]){
                childIndex++;
            }
            // 如果父节点小于最小的子节点，直接跳出
            if (temp <= array[childIndex]){
                break;
            }
            // 不需要交换，单向赋值就行
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * parentIndex + 1;
        }
        array[parentIndex] = temp;
    }
    public static void buildHeap(int[] array){
        // 从最后一个非叶子节点开始，依次下沉调整
        for (int i = (array.length - 2) / 2; i >= 0; i--){
            downAdjust(array,i,array.length);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,5,7,4,9,8,0};
        upAdjust(array);
        System.out.println(Arrays.toString(array));
        array = new int[]{7,1,3,10,5,2,8,9,6};
        buildHeap(array);
        System.out.println(Arrays.toString(array));
    }

}
