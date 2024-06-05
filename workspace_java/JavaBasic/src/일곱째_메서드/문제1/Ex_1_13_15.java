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
        test3(5,6);

    }
    //13
    public static void test1(int a, int b){
        System.out.println(a + b);
    }
    //14
    public static void test2(int a){
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
