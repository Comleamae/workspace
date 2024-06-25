package 네번째_조건문.IF_문제_1;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수입력: ");

        int a = sc.nextInt();
        if(a % 5 != 0){
            System.out.println("5의 배수를 입력하세요");
        }
    }
}
