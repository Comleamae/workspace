package 일곱째_메서드.문제2;

import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하라: ");
        int stNum = sc.nextInt();
        System.out.print("정수를 입력하라: ");
        int ndNum = sc.nextInt();
        System.out.println(test2(stNum, ndNum));
        System.out.println(test3(5, 6));
        System.out.println(test4("이야", "야이"));
        System.out.println(test5(80));
        System.out.println("정수를 입력하라: ");
        int rdNum = sc.nextInt();
        System.out.println(test6(rdNum));
        System.out.println(test7(25.3));
        System.out.println(test8(3, 5, 3));
        System.out.println(test9(13));
    }
    public static int test2(int a, int b){
        return a * b;
    }
    public static int test3(int a, int b){
        return  a > b ? a : b;

//        if(a > b){
//            return a;
//        }
//        else {
//            return b;
//        }
    }
    public static String test4(String a, String b){
        return a + b;
    }
    public static String test5(int a){
        String b = "";
        if(a >= 90){
           b = "A";
        }
        else if (a >= 70) {
           b = "B";
        }
        else {
            b = "C";
        }
        return  b;
    }
    public static String test6(int a){
        //정수 -> 문자열
        String bb= String.valueOf(10); //"10"
        //문자열 -> 정수
        int aa = Integer.parseInt("10"); //10
        String b;
        b = a + "";
        return a + "";
    }
    public static double test7(double a){
        return a * a;
    }
    public static double test8(int a, int b, int c){
        return (a + b + c)/(double)3;
    }
    public static int test9(int a){
        int sum = 0;
        for (int i = 1; i < a + 1; i++){
            if(i % 2 == 1){
                sum = sum + i;
            }
        }
        return sum;
    }
}
