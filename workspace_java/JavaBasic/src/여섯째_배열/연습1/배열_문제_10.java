package 여섯째_배열.연습1;

import java.util.Scanner;

public class 배열_문제_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        //배열의 크기만큼 반복해서 입력값을 배열의 각 요소에 저장
        for(int i = 0; i < arr.length; i++){
            System.out.print(i + 1 + "번째 요소 입력 : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("-배열에 저장된 요소-");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for(int e : arr){
            System.out.print(e + " ");
        }
    }
}
