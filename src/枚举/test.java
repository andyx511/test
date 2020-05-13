package 枚举;

/**
 * @Classname test
 * @Description TODO
 * @Date 2020/5/12 11:06
 * @Author ALexNi
 */
public class test {
    public static void main(String[] args){
        System.out.println("nowSeason->"+Season.SPRING+", value->"+Season.SPRING.ordinal());
        System.out.println("nextSeason->"+Season.getNextSeason(Season.SPRING));
        System.out.println(0/200);
    }
}
