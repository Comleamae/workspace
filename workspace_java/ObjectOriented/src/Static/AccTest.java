package Static;

public class AccTest {
    public static void main(String[] args) {

        //1만명
        Account ac1 = new Account("1111", 10000);
        Account ac2 = new Account("1112", 100000);
        Account ac3 = new Account("1113", 50000);
        Account ac4 = new Account("1114", 60000);
        Account ac5 = new Account("1115", 80000);

        System.out.println(ac1);
        Account.iyul = 10.0;
        System.out.println(ac1);

    }
}
