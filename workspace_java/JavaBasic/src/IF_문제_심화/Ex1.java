package IF_문제_심화;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lineNu;
        System.out.println("정수 입력:");
        int a = sc.nextInt();
        System.out.println("정수 입력:");
        int b = sc.nextInt();
        System.out.println("정수 입력:");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println(true);
        }

    }
}
