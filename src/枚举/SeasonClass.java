package 枚举;

/**
 * @Classname Season
 * @Description TODO
 * @Date 2020/5/12 10:43
 * @Author ALexNi
 */
public class SeasonClass {

    private SeasonClass(){}

    public final static SeasonClass SPRING = new SeasonClass();
    public final static SeasonClass SUMMER = new SeasonClass();
    public final static SeasonClass AUTUMN = new SeasonClass();
    public final static SeasonClass WINTER = new SeasonClass();

    public static SeasonClass getNextSeason(SeasonClass nowSeasonClass){
        if(nowSeasonClass == SPRING){
            return SUMMER;
        }else if(nowSeasonClass == SUMMER){
            return AUTUMN;
        }else if(nowSeasonClass == AUTUMN){
            return WINTER;
        }else{
            return SPRING;
        }
    }

    public static void printNowSeason(SeasonClass nowSeasonClass){
        if(nowSeasonClass == SPRING){
            System.out.println("春季");
        }else if(nowSeasonClass == SUMMER){
            System.out.println("夏季");
        }else if(nowSeasonClass == AUTUMN){
            System.out.println("秋季");
        }else{
            System.out.println("冬季");
        }
    }

    public static void main(String[] args){
        SeasonClass nowSeasonClass = SeasonClass.SUMMER;
        SeasonClass.printNowSeason(nowSeasonClass);
        SeasonClass nextSeasonClass = SeasonClass.getNextSeason(nowSeasonClass);
        SeasonClass.printNowSeason(nextSeasonClass);
    }
}