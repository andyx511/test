package Optional;

import java.util.Optional;

/**
 * @Classname OptionalTest
 * @Description TODO
 * @Date 2020/5/18 10:22
 * @Author ALexNi
 */
public class OptionalTest {
    public static void main(String[] args) {
        Country country = new Country(null);
        Address address = new Address();
        address.setCountry(country);
        User user = new User();
        user.setAddress(address);

       /* if (check(user)){
            String isocode = user.getAddress().getCountry().getIscode().toUpperCase();
            System.out.println(isocode);
        }*/
        Optional<User> opt = Optional.ofNullable(user);
    }
    public static boolean check(User user){
        boolean flag = false;

        if (user != null) {
            Address address = user.getAddress();
            if (address != null) {
                Country country = address.getCountry();
                if (country != null) {
                    String isocode = country.getIscode();
                    if (isocode != null) {
                        flag = true;
                    }
                }
            }
        }

        return flag;
    }
}
