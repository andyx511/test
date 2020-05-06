package 算法;

/**
 * projectName：test
 * name：贪心算法
 * description：todo
 * date：2020/5/4 1:05 下午
 * auther：nidingbo
 */
public class 贪心算法之剪绳子 {
    public static void main(String[] args) {
        System.out.println(greedy_cut_rope_1(8));
        System.out.println(greedy_cut_rope(8));
    }
    // 迭代法
    public static int greedy_cut_rope_1(int n)
    {
        if(n<2) {
            return 0;
        }
        if(n==2) {
            return 1;
        }
        if(n==3) {
            return 2;
        }
        //尽可能多地去减长度为3的绳子段
        int timesOf3 = n/3;
        //当绳子最后剩下的长度为4的时候，不能再去剪去长度为3的绳子段
        if(n-timesOf3*3==1) {
            timesOf3-=1;
        }
        int timesOf2 =(n-timesOf3*3)/2;
        return (int) (Math.pow(3,timesOf3)*Math.pow(2,timesOf2));
    }
    // 递归法
    public static int greedy_cut_rope(int n)
    {
        if(n==2) {
            return 2;
        }
        if(n==3) {
            return 3;
        }
        if(n<2) {
            return 1;
        }
        //int timesOf3 = n/3;
        if(n==4) {
            return 4;
        }
        return 3*greedy_cut_rope(n-3);
    }
}
