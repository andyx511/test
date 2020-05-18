package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * projectName：test
 * name：1111.有效括号的嵌套深度
 * description：todo
 * date：2020/4/1 8:27 下午
 * auther：nidingbo
 */
public class na1 {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        //list.add(0,1);
        lists.add(0,list);
        lists.get(0).add(1);

        System.out.println(lists.toString());
    }

}
