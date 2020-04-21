package 算法;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * projectName：test
 * name：找出不同
 * description：todo
 * date：2020/4/17 11:56 下午
 * auther：nidingbo
 */
public class 找出不同 {
    public static void main(String[] args) {
        Map<String, Integer> map0 = new HashMap<>(1);
        map0.put("perCode",0);
        Map<String, Integer> map1 = new HashMap<>(1);
        map1.put("perCode",1);
        Map<String, Integer> map2 = new HashMap<>(1);
        map2.put("perCode",2);
        Map<String, Integer> map3 = new HashMap<>(1);
        map3.put("perCode",3);
        Map<String, Integer> map4 = new HashMap<>(1);
        map4.put("perCode",4);
        Map<String, Integer> map5 = new HashMap<>(1);
        map5.put("perCode",5);
        Map<String, Integer> map6 = new HashMap<>(1);
        map6.put("perCode",6);
        Map<String, Integer> map7 = new HashMap<>(1);
        map7.put("perCode",7);
        Map<String, Integer> map8 = new HashMap<>(1);
        map8.put("perCode",8);

        List<Map> oldList = new ArrayList<>();
        oldList.add(map3);
        oldList.add(map6);
        oldList.add(map8);
        List<Map> newList = new ArrayList<>();
        newList.add(map0);
        newList.add(map6);

        int newIndex = 0, oldIndex = 0;

        List<String> addList = new ArrayList<>();
        List<String> subList = new ArrayList<>();
        /*while (newIndex < newList.size() || oldIndex < oldList.size()){

            if (oldList.get(oldIndex).get("perCode") == newList.get(newIndex).get("perCode")){
                newIndex++;
                oldIndex++;
            }
            if ((int)oldList.get(oldIndex).get("perCode") < (int)newList.get(newIndex).get("perCode")){
                subList.add(newList.get(newIndex));
                newIndex++;
            }
            if ((int)oldList.get(oldIndex).get("perCode") > (int)newList.get(newIndex).get("perCode")){
                addList.add(newList.get(newIndex));
                oldIndex++;
            }
        }*/
        Map<String, Boolean> map = new HashMap<>(oldList.size());
        for (Map mapOld : oldList){
            map.put(mapOld.get("perCode").toString(),false);
        }

        for (Map mapNew : newList){
            if (!map.containsKey(mapNew.get("perCode").toString())){
                addList.add(mapNew.get("perCode").toString());
            }else {
                map.put(mapNew.get("perCode").toString(),true);
            }
        }
        for (Map.Entry<String, Boolean> entry : map.entrySet()){
            if (entry.getValue().equals(false)){
                subList.add((entry.getKey()));
            }
        }
        System.out.println("增加的信息");
        addList.stream().forEach(System.out::println);
        System.out.println("减少的信息");
        subList.stream().forEach(System.out::println);
    }
}
