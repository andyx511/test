package leetcode;

/**
 * @Classname T560
 * @Description TODO
 * @Date 2020/5/15 9:19
 * @Author ALexNi
 */
public class T560 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1,1,1};
        System.out.println(subarraySum(nums, 3));
    }

    public static int subarraySum(int[] nums, int k) {

        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                int a = getSum(i, j, nums);
                if (a == k) {
                    t++;
                }
            }
        }
        return t;
    }

    public static int getSum(int start, int end, int[] nums) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += nums[i];
        }
        return sum;
    }
    // 官方题解
    /*public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; ++start) {
            int sum = 0;
            for (int end = start; end >= 0; --end) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    作者：LeetCode-Solution
    链接：https://leetcode-cn.com/problems/subarray-sum-equals-k/solution/he-wei-kde-zi-shu-zu-by-leetcode-solution/
    来源：力扣（LeetCode）
    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
}
