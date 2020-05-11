package leetcode;

/**
 * @Classname T33搜索旋转排序数组
 * @Description TODO
 * @Date 2020/4/27 11:06
 * @Author ALexNi
 */
public class T33搜索旋转排序数组 {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr,4));

    }
    public static int search(int[] nums, int target) {

        if(nums == null || nums.length == 0){
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end -start)/2;
            if (nums[mid] == target){
                return mid;
            }

            //后半部分有序
            if(nums[mid] < nums[end]){
                if(nums[mid] < target && target <= nums[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            } else {
                if(nums[mid] > target && target >= nums[start]){
                    end = mid - 1;

                } else {
                    start = mid + 1;

                }
            }
        }
        return -1;

    }

}
