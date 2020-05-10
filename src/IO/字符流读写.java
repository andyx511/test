package IO;

import java.io.*;

/**
 * projectName：test
 * name：字符流读写
 * description：todo FFileReader和FileWriter
 * date：2020/5/7 6:29 上午
 * auther：nidingbo
 */
public class 字符流读写 {
    public static void main(String[] args) throws IOException {
        Reader reader = null;
//        Writer writer = null;
        try{
            File readFile = new File("/Users/nidingbo/Downloads/ideaworkspace/test/src/IO/la.txt");
            reader = new FileReader(readFile);
//            File writeFile = new File("/Users/nidingbo/Downloads/ideaworkspace/test/src/IO/la.txt");
//            writer = new FileWriter(writeFile);
            char[] byteArray = new char[(int) readFile.length()];
            int size = reader.read(byteArray);
            System.out.printf("大小：" + size + "个字符，内容：" + new String(byteArray));
//            writer.write(byteArray);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            reader.close();
//            writer.close();
        }
    }
}
