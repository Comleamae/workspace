package 상속.man;

public class ManTest {
    public static void main(String[] args) {
        BusinessMan bm1 = new BusinessMan();
        System.out.println(bm1.company);
        bm1.tellCompany();

        System.out.println(bm1.name);
        bm1.tellName();
    }
}
