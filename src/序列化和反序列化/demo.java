package 序列化和反序列化;

import javax.management.ObjectName;
import java.io.*;

/**
 * projectName：test
 * name：demo
 * description：todo
 * date：2020/5/7 7:20 上午
 * auther：nidingbo
 */
public class demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化
        FileOutputStream fos = new FileOutputStream("object.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student student1 = new Student("lihao", "wjwlh", "21");
        oos.writeObject(student1);
        oos.flush();
        oos.close();
        FileInputStream fis = new FileInputStream("object.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student2 = (Student) ois.readObject();
        System.out.println(student2.getUserName()+ " " +
                student2.getPassword() + " " + student2.getYear());
        System.out.println("asdasd");
    }
}
