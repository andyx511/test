package Optional;

import java.util.Optional;

/**
 * @Classname test1
 * @Description TODO
 * @Date 2020/5/18 10:33
 * @Author ALexNi
 */
public class test1 {
    public static void main(String[] args) {
        String name = "null";
        Optional<String> opt = Optional.ofNullable(name);
        System.out.println(opt.get());
    }
}
