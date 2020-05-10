package 设计模式.单例;

/**
 * projectName：test
 * name：ErrorCode
 * description：todo
 * date：2020/3/22 11:48 上午
 * auther：nidingbo
 */
public enum ErrorCode {
    OK(0,"success"),
    ERROR_A(1,"sda");

    private int i;

    private String msg;

    ErrorCode(int i, String msg) {
        this.i = i;
        this.msg = msg;
    }
    public int getI(){
        return i;
    }

    public String getMsg() {
        return msg;
    }
    public static void main(String[] args){
        for (ErrorCode s:ErrorCode.values()){
            System.out.println("code:" + s.getI() + "==> msg:" + s.getMsg());
        }
    }
}
