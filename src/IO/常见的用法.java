package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.SQLOutput;

/**
 * projectName：test
 * name：常见的用法
 * description：todo
 * date：2020/5/6 8:25 下午
 * auther：nidingbo
 */
public class 常见的用法 {
    public static void main(String[] args) throws IOException {
        PrintWriter out = null;
        BufferedReader br = null;
        try {
            System.out.println("please input:");
            out = new PrintWriter(System.out,true);
            br = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while ((line = br.readLine()) != null){
                if (line.equals("exit")){
                    System.exit(1);
                }
                out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            out.close();
            br.close();
        }
    }
}
