package 单例;

/**
 * projectName：test
 * name：Singleton
 * description：todo
 * date：2020/3/22 11:30 上午
 * auther：nidingbo
 */
public enum Singleton {
    INSTANCE;
    private Person person;

    private Singleton(){
        person = new Person();
    }

    public Person getPerson(){
        return person;
    }

    public void la(String s){
        System.out.println("你好啊"+ s );
    }

}
