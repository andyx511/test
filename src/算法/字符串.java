package 算法;

/**
 * projectName：test
 * name：zifuc
 * description：todo
 * date：2020/3/17 11:42 上午
 * auther：nidingbo
 */
public class 字符串 {
    public static void main(String [] args){
        String s1 = "aaabbaaac";
        float max=0;
        char temp=' ';
        for (int i = 0; i<s1.length();i++){
            if (temp!=s1.charAt(i)){
                temp = s1.charAt(i);
                max++;
            }
        }
        System.out.printf("%.2f",s1.length()/max);
    }
}
