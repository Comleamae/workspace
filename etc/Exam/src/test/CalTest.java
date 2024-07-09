package test;

public class CalTest {
    public static void main(String[] args) {
        //1)
        Calculate calculate = new Calculate(50, 100);
        //2)
        calculate.setNumber(80, 50);
        //3)
        System.out.println("두 수의 합은" + calculate.getSum());
        //4)
        System.out.println("두 수 중 큰 수는"+  calculate.getMax());
        //5)
        System.out.println("두 수의 평균은"+ calculate.getAvg());
    }
}
