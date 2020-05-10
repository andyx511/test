package 序列化和反序列化;

import java.io.Serializable;

/**
 * projectName：test
 * name：Student
 * description：todo
 * date：2020/5/7 7:30 上午
 * auther：nidingbo
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 2656275593906894106L;
    private String userName;
    private String password;
    private String year;

    public Student(String userName, String password, String year) {
        this.userName = userName;
        this.password = password;
        this.year = year;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
