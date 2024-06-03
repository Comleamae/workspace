package 네번째_조건문;

import java.util.Scanner;

public class Switch_예제_1_0603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하라: ");
        int num = sc.nextInt();
        int mod = num % 2;

        switch (mod){
            case 0:
                System.out.println(1);
                break;
            case 1:
                System.out.println(2);
                break;
            default:
                System.out.println(0);
        }
    }
}
