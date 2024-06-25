package 여섯째_배열.연습1;

import java.util.Scanner;

public class 배열_문제_12 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        double rev = 0;
        int total = 0;
        Scanner sc = new Scanner(System.in);

        for(int s: arr1){
            System.out.print("점수 입력 : ");
            s = sc.nextInt();
            System.out.println("점수는 " + s);
            total = total + s;
        }

        rev = total / (double) arr1.length;
        System.out.print("총점은 " + total + " ");
        System.out.print("평균은 " + rev + " ");

    }

}
