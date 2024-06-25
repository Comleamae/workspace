package 다섯째_반복문.While.문제;

public class While_문제7 {
    public static void main(String[] args) {
        int a = 1;
        int cnt = 0;
        while (a < 101){
            if (a % 5 == 0) {
                cnt++;
                System.out.print(a + "");
            }
            a++;
        }
        System.out.println();
        System.out.print("5의 배수의 개수 : " + cnt);
    }
}
