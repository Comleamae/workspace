package 네번째_조건문.IF_문제_2;

import java.util.Scanner;

public class EX6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력: ");
        int a = sc.nextInt();
        System.out.println("정수 입력: ");
        int b = sc.nextInt();
        System.out.println("정수 입력: ");
        int c = sc.nextInt();

        if(a > b){
            if( b > c) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else if ( b < c) {
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }
        } else if ( b > c) {
             if(a > c){
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
             } else if (a < c) {
                 System.out.println(b);
                 System.out.println(c);
                 System.out.println(a);
             }
        } else if (c > a) {
            if (a > b ) {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            } else if (b > a) {
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);

            }

        }

    }
}
