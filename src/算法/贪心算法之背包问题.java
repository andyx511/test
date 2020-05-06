package 算法;

/**
 * projectName：test
 * name：贪心算法之背包问题
 * description：todo
 * 给定N个物品和一个容量为C的背包,物品i的重量为Wi，
 * 其价值为Vi，背包问题是如何选择装入背包的物品，
 * 使得装入背包中物品的总价值最大。
 * 注意在背包问题中，可以将某种物品的一部分装入背包中，但是不可以重复装入。
 * date：2020/5/4 1:23 下午
 * auther：nidingbo
 */
public class 贪心算法之背包问题 {
    public static void main(String[] args) {

    }
    public static int knapsackProblem(int[] w, int[] v ,int n, int c){
        //  假设物品已按单位重量降序排列
        double[] x = new double[10];
        int maxValue =0;
        int i;
        for(i=0;w[i]<c;i++)
        {
            //将物品 i 装入背包
            x[i]=1;
            maxValue+=v[i];
            // 背包剩余数量
            c=c-w[i];
        }
        //物品i装入一部分
        x[i]=(double)c/w[i];
        //返回背包获得的价值
        maxValue+=x[i]*v[i];
        return maxValue;
    }
}
