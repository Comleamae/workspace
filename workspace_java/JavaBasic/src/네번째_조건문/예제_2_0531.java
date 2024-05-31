package 네번째_조건문;

import java.util.Scanner;

public class 예제_2_0531 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 입력");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(1);
        }
        else {
            System.out.println(2);
        }
        System.out.println("프로그램 종료");
    }
}
