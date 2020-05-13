package leetcode;

/**
 * @Classname T4寻找两个正序数组的中位数
 * @Description TODO
 * @Date 2020/5/11 17:25
 * @Author ALexNi
 */
public class T4寻找两个正序数组的中位数 {
    public static void main(String[] args) {
        int[] num1 = new int[]{1,3};
        int[] num2 = new int[]{2};
        //System.out.println(num1[0]);
        System.out.println(findMedianSortedArrays(num1, num2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = 0, b = 0;
        int length = nums1.length + nums2.length;
        int[] num3 = new int[length];
        int k = 0;
        while (k < length){
            if (nums1[a] < nums2[b]){
                num3[k] = nums1[a];
                a++;
            }else {
                num3[k] = nums2[b];
                b++;
            }
            k++;
        }
        // 当时奇数时
        if ((num3.length&1) == 1){
            return (double) num3[(length+1)/2];
        }else {
            return (double)(num3[length/2]+num3[length/2+1])/2;
        }
    }
}
