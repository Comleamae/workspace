package 여섯째_배열.연습2;

import java.util.Scanner;

public class 문제_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int rev = 0;
        int[] arr= new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = i + 1;
            System.out.println(arr[i]);
            rev = rev + arr[i];
        }
        System.out.println(rev / (double)arr.length);

    }
}
