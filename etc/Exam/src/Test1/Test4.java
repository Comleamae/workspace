package Test1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~999사이의 숫자를 입력하시오");
        int num = sc.nextInt();
        //백의 자리 숫자
        int hNum = num/100;
        //십의 자리 숫자
        int tNum = (num%100)/10;
        //일의 자리 숫자
        int oNum = num%10;

        int cnt = 0;

        if(hNum == 3 || hNum == 6 || hNum ==9){
            cnt++;
        }
        if(tNum == 3 || tNum == 6 || tNum ==9){
            cnt++;
        }
        if(oNum == 3 || oNum == 6 || oNum ==9){
            cnt++;
        }
        System.out.println("박수"+ cnt+"번");

    }

}
