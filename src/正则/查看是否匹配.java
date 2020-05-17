package 正则;

import java.util.regex.Pattern;

/**
 * projectName：test
 * name：查看是否匹配
 * description：todo
 * date：2020/5/16 2:34 下午
 * auther：AlexNi
 */
public class 查看是否匹配 {
    public static void main(String[] args) {
        // num
        String target = "8";
        String regex = "[0-9]";
        System.out.println(Pattern.matches(regex,target));
    }
}
