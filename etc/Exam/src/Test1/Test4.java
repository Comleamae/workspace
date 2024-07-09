package Test1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~999사이의 숫자를 입력하시오");
        int num = sc.nextInt();

        int hNum = num/100;
        int tNum = num/10;
        int oNum = num%10;

        int cnt = 0;

        if(num<10){
            if(tNum%3 == 0)
                cnt++;
        }
        else if (num<100) {
            if(tNum%3 == 0) {
                cnt++;
            }
            if(oNum%3 == 0){
                cnt++;
            }
        }
        else{
            if(hNum%3 == 0){
                cnt++;
            }
            if(tNum%3 == 0){
                cnt++;
            }
            if(oNum%3 == 0){
                cnt++;
            }

        }

        System.out.println("박수"+ cnt+"번");

    }

}
