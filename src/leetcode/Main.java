package leetcode;

/**
 * projectName：test
 * name：Main
 * description：todo
 * date：2020/4/19 1:32 下午
 * auther：nidingbo
 */
public class Main {
    public static void main(String[] args)
    {
        print("Holis", "公众号:Hollis", "博客：www.hollischuang.com", "QQ：907607222");
    }

    public static void print(String... strs)
    {
        for (int i = 0; i < strs.length; i++)
        {
            System.out.println(strs[i]);
        }
    }
}
