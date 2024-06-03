package 다섯_반복문.While;

public class While_문제7 {
    public static void main(String[] args) {
        int a = 1;
        int b = a % 5;
        int c = 0;
        while (a <= 100){
            if (b == 0) {
                System.out.println(b);
                c++;
            }
            a++;
        }
    }
}
