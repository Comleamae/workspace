package 다섯째_반복문._심화문제;

import java.util.Scanner;

public class While_심화5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째수 입력 : ");
        int stNum = sc.nextInt();
        System.out.print("두번째수 입력 : ");
        int ndNum = sc.nextInt();
        //큰 수, 작은 수 결정
        int max, min;
        if(stNum > ndNum){
            max = stNum;
            min = ndNum;
        }
        else {
            max = ndNum;
            min = stNum;
        }
        int sum = 0;
        for(int i = min +1; i < max; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
