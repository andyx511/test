import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

public class te {
    public static void insertOrder() {

        // 默认是插入顺序
        LinkedHashMap<Integer,String> insertOrder = new LinkedHashMap();

        String value = "关注公众号Java3y";
        int i = 0;

        insertOrder.put(i++, value);
        insertOrder.put(i++, value);
        insertOrder.put(i++, value);
        insertOrder.put(i++, value);
        insertOrder.put(i++, value);

        //遍历
        Set<Integer> set = insertOrder.keySet();
        for (Integer s : set) {
            String mapValue = insertOrder.get(s);
            System.out.println(s + "---" + mapValue);
        }
    }
    public static void accessOrder() {
        // 设置为访问顺序的方式
        LinkedHashMap<Integer,String> accessOrder = new LinkedHashMap(16, 0.75f, true);

        String value = "关注公众号Java3y";
        int i = 0;
        accessOrder.put(i++, value);
        accessOrder.put(i++, value);
        accessOrder.put(i++, value);
        accessOrder.put(i++, value);
        accessOrder.put(i++, value);


        // 遍历
        Set<Integer> sets = accessOrder.keySet();
        for (Integer key : sets) {
            String mapValue = accessOrder.get(key);
            System.out.println(key + "---" + mapValue);
        }

    }
    public static void main(String[] args){
        /*Solution solution = new Solution();
        int[]a = new int[]{10,9,2,5,3,7,101,18};
        System.out.println( solution.find("qywyer23tdd",11)
        );*/
        accessOrder();

    }
}
class Solution {
    public char find(String A,int n){
        Set<Character> set = new HashSet();
        for (int i =0; i < n; i++){
            if (set.contains(A.charAt(i))){
                return A.charAt(i);
            }
            set.add(A.charAt(i));
        }
        return '0';
    }
}