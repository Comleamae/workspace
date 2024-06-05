package 네번째_조건문.IF_문제_2;

import java.util.Scanner;

public class EX6_1_시험문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력: ");
        int a = sc.nextInt();
        System.out.println("정수 입력: ");
        int b = sc.nextInt();
        System.out.println("정수 입력: ");
        int c = sc.nextInt();

        if(a > b && b > c){
            System.out.print(a + " > ");
            System.out.print(b + " > ");
            System.out.print(c);
        }
        else if (a < b && b < c) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        else if (a < c && c < b) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }
        else if (a > c && c > b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
        else if (c > a && a > b ) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
        else if (b > a && a > c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);

        }
    }
}
