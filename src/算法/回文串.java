package 算法;

import java.util.Stack;

/**
 * projectName：test
 * name：SynchoronizedDemo
 * description：todo
 * date：2020/3/14 4:17 下午
 * auther：nidingbo
 */
public class 回文串 {
    public static void main(String []args){
        String str = "()(()";
        System.out.println(kuo(str));
    }

    // 是不是回文串
    public static boolean isT(String string){
        int left = string.length()/2;
        int right = string.length()%2==0?string.length()/2:string.length()/2+1;
        while (left>0&&right<string.length()){
            if (string.charAt(left)==string.charAt(right)){
                left--;
                right++;
            }else {
                return false;
            }
        }
        return true;
    }
    // 有多少个回文串
    public static int howmany(String str){
        int num = 0;
        for (int i = 0;i<str.length()*2;i++){
            int left = i/2;
            int right = i/2+i%2;
            while(left>=0&&right<str.length()&&str.charAt(left)==str.charAt(right)){
                left--;
                right++;
                num++;
            }
        }
        return num;
    }
    // 回文串的最大长度
    public static int howmuch(String str){
        int max = 0;
        for (int i = 0;i<str.length()*2;i++){
            int left = i/2;
            int right = i/2+i%2;
            while(left>=0&&right<str.length()&&str.charAt(left)==str.charAt(right)){
                max = max>right-left+1?max:right-left+1;
                left--;
                right++;
            }
        }
        return max;
    }
    //栈
    public static int kuo(String str){
        Stack<Character> stack = new Stack<>();
        int max = 0 ;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i)=='('){
                stack.push('(');
            }
            if (!stack.empty()&& stack.peek()=='(' && str.charAt(i)==')'){
                    stack.pop();
                    max += 2;

            }
        }
        return max;
    }

}
