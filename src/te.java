import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

public class te {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>(5);
        char i_ch='0';
        for (int i = 0; i < 5; i++){
            i_ch += i;
            map.put(i_ch,i);
        }
        for (Map.Entry entry:map.entrySet()){
            if ((Integer)entry.getValue()>1){
                System.out.println(entry.getKey().toString());
            }
        }
    }
}