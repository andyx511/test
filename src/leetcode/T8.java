package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Classname T8
 * @Description TODO leetCode第8题 字符串转换整数
 * @Date 2020/4/3 13:16
 * @Author ALexNi
 */
public class T8 {
    public static void main(String[] args) {
        String s = "   123";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String string){
        string = string.trim();
        String pattern = "[-+]??[0-9]++";
        Pattern r = Pattern.compile(pattern);
        Matcher matcher = r.matcher(string);
        if (matcher.lookingAt()) {
            String strNum = string.substring(0, matcher.end());
            // 如果直接转32位int出现NFE那么就只要判断是Integer的最大值还是最小值就好了
            try {
                return Integer.parseInt(strNum);
            } catch (NumberFormatException nfe) {
                return strNum.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return 0;
    }
}
