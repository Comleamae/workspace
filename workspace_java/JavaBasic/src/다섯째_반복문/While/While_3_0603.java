package 다섯째_반복문.While;

public class While_3_0603 {
    public static void main(String[] args) {
        //10부터 0까지 출력
//        int i = 10;
//        while (i>=0){
//            System.out.println(i);
//            i--;
//        }
//        1부터 20까지의 수 중에서 홀수만 출력
        int a = 1;
        while (a <= 20) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
            a++;
        }
//        int i = 1;
//        while (i <= 20) {
//            System.out.println(i);
//            i = i + 2;
//        }
//        1부터 20까지의 수 중에서 짝수만 출력
        int i = 1;
        while (i <= 20) {
            //짝수만 출력
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}
