package 일곱째_메서드;

public class 메서드_5 {
    public static void main(String[] args) {
        int result = getSum(4, 5);
        System.out.println(result);
        //아래는 위를 축약한 형태
        System.out.println(getSum(43, 56));

        double result2 = getSum2(30,20);
        System.out.println(result2);
        //아래는 위를 축약한 형태
        System.out.println(getSum2(5, 3));
    }
    //매개변수로 전달된 두 정수의 합을 리턴하는 메서드
    public static int getSum(int a, int b){
        return a + b;
    }
    //매개변수로 전달된 두 정수의 합을 실수형태로 리턴하는 메서드
    public static double getSum2(int a, int b){
        return a + (double)b;
    }
}
