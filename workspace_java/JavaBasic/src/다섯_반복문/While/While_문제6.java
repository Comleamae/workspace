package 다섯_반복문.While;

public class While_문제6 {
    public static void main(String[] args) {
        int a = 1;
        int b = a % 3;
        int c = 0;
        while (a <= 100) {

            if(b == 0){
                c++;
            }
            a++;
        }

        System.out.println(c);
    }
}
