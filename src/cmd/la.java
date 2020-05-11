package cmd;

import java.io.IOException;

/**
 * @Classname la
 * @Description TODO
 * @Date 2020/4/24 15:32
 * @Author ALexNi
 */
public class la {
    public static void main(String[] args) throws IOException {
        String cmd = "java -jar adder-db-export-1.0.jar";
        Process process = Runtime.getRuntime().exec(cmd);
    }
}
