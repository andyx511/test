package 正则;

import java.util.regex.Pattern;

/**
 * projectName：test
 * name：test
 * description：todo
 * date：2020/5/16 11:17 上午
 * auther：AlexNi
 */
public class test {
    public static void main(String[] args) {
        String content = "I am noob " +
                "from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);

        String a = "C.C2020";
        String b = "My name is CyC2020";

        boolean c = Pattern.matches(a, b);
        System.out.println(c);

    }

}
