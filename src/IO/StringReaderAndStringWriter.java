package IO;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * projectName：test
 * name：StringReaderAndStringWriter
 * description：todo
 * date：2020/5/7 6:45 上午
 * auther：nidingbo
 */
public class StringReaderAndStringWriter  {
    public static void main(String[] args) throws IOException {
        StringReader sr = null;
        StringWriter sw = null;
        try {
            String str = "学习不努力，不如卖红薯";
            char[] buf = new char[32];
            int hasRead = 0;
            while ((hasRead = sr.read(buf)) > 0){
                System.out.println(new String(buf, 0, hasRead));
            }
            sw = new StringWriter();
            sw.write("忽如一夜春风来，千树万树梨花开");
            sw.write("礼拜");
//            System.out.println(sw.toString());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            sr.close();
        }
    }
}
