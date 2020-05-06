package IO;

import java.io.*;

/**
 * projectName：test
 * name：字节流读写文件
 * description：todo
 * date：2020/5/6 8:33 下午
 * auther：nidingbo
 */
public class 字节流读写文件 {
    public static void main(String[] args) throws IOException {
        InputStream is =null;
        OutputStream os = null;
        try {
            // 在try()中打开文件会在结尾自动关闭
            is = new FileInputStream("/Users/nidingbo/Downloads/ideaworkspace/test/src/IO/la.txt");
            os = new FileOutputStream("/Users/nidingbo/Downloads/ideaworkspace/test/src/IO/la.txt");
            byte[] buf = new byte[4];
            int hasRead = 0;
            while ((hasRead = is.read(buf)) > 0) {
                os.write(buf, 0, hasRead);
            }
            System.out.println("write success");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            os.close();
            is.close();
        }
    }
}
