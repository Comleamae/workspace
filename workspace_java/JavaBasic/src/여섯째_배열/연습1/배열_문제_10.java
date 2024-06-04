package 여섯째_배열.연습1;

import java.util.Scanner;

public class 배열_문제_10 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("값을 입력하시오 : ");
        int num = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            arr[i] = num;
            System.out.println(arr[i]);
        }
    }
}
