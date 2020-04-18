package leetcode;

/**
 * projectName：test
 * name：鸡蛋掉落
 * description：todo 887
 * date：2020/4/11 7:00 下午
 * auther：nidingbo
 */
public class 鸡蛋掉落 {
    public static void main(String[] args) {
        System.out.println(superEggDrop(3,14));
    }
    public static int superEggDrop(int K, int N){
        int i = 1;
        int frequency = 0;

        while(i<N){
            i *= 2;
            frequency++;
        }
        return frequency;
    }
}
