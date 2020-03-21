package 银行家;

/**
 * projectName：test
 * name：Addmoney
 * description：todo
 * date：2020/3/7 12:08 下午
 * auther：nidingbo
 */

public class AddMoneyThread implements Runnable {
    private Account account; // 存入账户
    private double money; // 存入金额
    public AddMoneyThread(Account account, double money) {
        this.account = account;
        this.money = money;
    }
    @Override
    public void run() {
        account.deposit(money);
    }
}
