package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * projectName：test
 * name：1111.有效括号的嵌套深度
 * description：todo
 * date：2020/4/1 8:27 下午
 * auther：nidingbo
 */
public class na1 {
    public static void main(String[] args) {
        String seq = "(()())";
        int[]a = maxDepthAfterSplit(seq);
        System.out.println(Arrays.toString(a));
    }
    public static int[] maxDepthAfterSplit(String seq) {
        List<Integer> list = new ArrayList<>(seq.length());
        Stack<String> stack = new Stack<>();
        int i = 0;
        for (String s:seq.split("")) {
            if (s.equals("(")){
                stack.push("(");
                list.add(i%2);
                i++;
            }else {
                stack.pop();
                i--;
                list.add(i%2);
            }
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}
