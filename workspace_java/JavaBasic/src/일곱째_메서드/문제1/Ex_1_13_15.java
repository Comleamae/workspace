package 일곱째_메서드.문제1;

import java.util.Scanner;

public class Ex_1_13_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력");
        int num1 = sc.nextInt();
        System.out.print("숫자 입력");
        int num2 = sc.nextInt();
        test1(num1,num2);
        System.out.print("숫자 입력");
        int num3 = sc.nextInt();
        test2(num3);
        System.out.println("숫자 입력");
        int num4 = sc.nextInt();
        System.out.println("숫자 입력");
        int num5 = sc.nextInt();
        test3(num4, num5);

    }
    //13
    public static void test1(int a, int b){
        System.out.println(a + b);
    }
    //14

    public static void test2(int a){
        //삼항연산자
        //ex) int num = 10 > 5 ? 1 : 2;
        //? 앞에는 참 거짓을 판별 할 수 있는 조건
        //? 뒤에는 앞의 조건이 참이면 실행할 내용
        //: 뒤에는 앞으 조건이 거짓이면 실행할 내용
        //ex) System.out.println(a % 2 == 0? "짝수" : "홀수"); =>if else의 2항 문장을 요약
        if(a % 2 == 0){
            System.out.println("짝수입니다");
        }
        else if(a == 0){
            System.out.println("0입니다");
        }
        else {
            System.out.println("홀수입니다");
        }
    }
    //15
    public static void test3(int a, int b){
        if (a % 2 == 0 && b % 2 ==0){
            System.out.println("두 수는 짝수입니다");
        }
        else if (a % 2 == 0 || b % 2 == 0) {
            System.out.println("한 수만 짝수입니다");
        }
        else {
            System.out.println("두 수는 홀수입니다");
        }
    }
}
