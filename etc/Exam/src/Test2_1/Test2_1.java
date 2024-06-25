package Test2_1;

public class Test2_1 {
    public static void main(String[] args) {
        Calculate calculate = new Calculate(50, 100);

        calculate.setNumber(80, 50);

        System.out.printf("두 수의 합은" + calculate.getSum());
        System.out.printf("두 수 중 큰 수는"+  calculate.getMax());
        System.out.printf("두 수의 평균은"+ calculate.getAvg());
    }
}
