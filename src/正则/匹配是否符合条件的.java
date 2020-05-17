package 正则;

/**
 * projectName：test
 * name：匹配是否符合条件的
 * description：todo
 * date：2020/5/16 2:38 下午
 * auther：AlexNi
 */
public class 匹配是否符合条件的 {
    public static void main(String[] args) {
        String str = "asdf";
        String regex = "[a-zA-Z]{7,8}";
        System.out.println(str.matches(regex));
        String mail = "";
        String mailRegex = "[a-zA-Z0-9]@*";
        System.out.println(
                mail.matches(mailRegex)
        );
    }
}
