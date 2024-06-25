package 네번째_조건문.IF_문제_심화;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오");
        int num = sc.nextInt();
        int stNum = num / 10;
        int ndNum = num % 10;
        int clapCnt = 0;
        //십의 자리가 3, 6, 9면 clapCnt를 1증가
        //if(stNum % 3 == 0 && stNum !=0)
        if (stNum == 3 || stNum==6 | stNum == 9) {
            clapCnt++;
//            ++clapCnt;
//            clapCnt = clapCnt + 1;
//            clapCnt += 1;
        }
        if (ndNum == 3 || ndNum==6 | ndNum == 9) {
            clapCnt++;
//            ++clapCnt;
//            clapCnt = clapCnt + 1;
//            clapCnt += 1;
        }

        //clapCnt의 값에 따라 출력
        switch (clapCnt){
            case 1:
                System.out.println("박수 짝");
                break;
            case 2:
                System.out.println("박수 짝짝");
        }

    }
}
