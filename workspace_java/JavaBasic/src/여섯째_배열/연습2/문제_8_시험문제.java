package 여섯째_배열.연습2;

import java.util.Arrays;

public class 문제_8_시험문제 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        for(int i = 0; i < arr.length; i++){
            int rNum = (int)(Math.random() * 45 + 1);
            arr[i] = rNum;
            System.out.print(arr[i] + " ");
        }

        System.out.println("");

        System.out.println(Arrays.toString(arr));

    }
}
