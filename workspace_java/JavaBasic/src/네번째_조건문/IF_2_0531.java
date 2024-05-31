package 네번째_조건문;

import java.util.Scanner;

public class IF_2_0531 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        System.out.println("숫자를 입력해줘");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        //x의 값이 7이면 '1' 출력
        //그렇지 않으면 '2' 출력
        //만약에
        if (x == 7) {
            System.out.println(1);
        }
        //그렇지 않으면
        else {
            System.out.println(2);
        }
        System.out.println("프로그램 종료");
    }
}
