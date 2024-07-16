package test;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.showClInfo("1111-1112", "홍길동");
        System.out.println(bank.showClInfo("1111-1112", "홍길동"));
        bank.overClient(20000);
        System.out.println(bank.overClient(20000));
    }
}
