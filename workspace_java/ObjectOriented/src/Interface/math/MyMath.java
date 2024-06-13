package Interface.math;

public class MyMath implements MathUtil {

    public static void main(String[] args) {
        MyMath mc1 = new MyMath();
        mc1.getMultiple(5,3);
        System.out.println(mc1.getMultiple(5,3));
    }
    @Override
    public int getMin(int a, int b) {
        int max = 0;
        int min = 0;

        if(a > b){
            min = b;
        } else if (b > a) {
            min = a;
        }
        return min;
        //return a < b ? a : b; - 삼항연산자
    }

    @Override
    public double getCircleArea(int radius) {
        double result;
        if(radius < 0){
            return 0;
        }
        else {
            result = (double) radius * 2 * Math.PI;
            return result;
        }
        // return radius < 0 ? 0 : 2*Math.PI*radius;
    }

    @Override
    public int getMultiple(int num1, int n) {
        int result = 1;

        System.out.println("첫번째 매개변수 :" + num1);
        System.out.println("두번째 매개변수 :" + n);
        for(int i = 1; i < n + 1; i++){
            result = result * num1;
            System.out.println("결과 : "+ result);
        }
        return result;
    }
}
