package 네번째_조건문.IF_문제_2;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        int min;
        System.out.print("첫번째 수: ");
        int a = sc.nextInt();
        System.out.print("두번째 수: ");
        int b = sc.nextInt();
        if (a > b) {
            max = a;
            min = b;

        }
        else {
            max = b;
            min = a;
        }
        System.out.println(max + " > " + min);
    }
}
