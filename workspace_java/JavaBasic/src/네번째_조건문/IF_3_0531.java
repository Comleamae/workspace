package 네번째_조건문;

import java.util.Scanner;

public class IF_3_0531 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(1);
        }
        //그렇지 않고 만약에
        else if (num == 0) {
            System.out.println(0);
        }
        else if (num < 0 ) {
            System.out.println(2);
        }
    }
}
