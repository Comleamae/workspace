package Class_basic.accont;

public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.printAccount();
        Account acc = new Account(500);
        acc.printAccount();
        acc1.setAccNumber("35763", "나다", 10000);
        acc1.printAccount();
    }
}
