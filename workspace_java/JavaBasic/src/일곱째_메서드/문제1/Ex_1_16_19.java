package 일곱째_메서드.문제1;

import java.util.Scanner;

public class Ex_1_16_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하라");
        int num1 = sc.nextInt();
        test1(num1);
        System.out.print("숫자를 입력하라");
        int num2 = sc.nextInt();
        System.out.print("숫자를 입력하라");
        int num3 = sc.nextInt();
        test2(num2, num3);
        tes2_1(num2, num3);
        System.out.print("숫자를 입력하라");
        int num4 = sc.nextInt();
        System.out.print("숫자를 입력하라");
        int num5 = sc.nextInt();
        test3(num4, num5);
        test3_2(num4, num5);
        System.out.println("문자를 입력하라");
        String lev = sc.next();
        System.out.println("숫자를 입력하라");
        int num6 = sc.nextInt();
        test4(lev, num6);
    }
    //16
    public static void test1(int a){
        for (int i = 0; i < a + 1; i++){
            System.out.println(i);
        }

    }
    //17
    public static void test2(int a, int b){
       if(a > b){
           for (int i = b; i < a; i++){
               System.out.println(i);
           }
       }
       else if (b > a) {
           for (int i = a; i < b; i++){
               System.out.println(i);
           }
       }

    }
    public static void tes2_1(int a, int b){
        int max = a > b ? a : b;
        int min = b < a ? a : b;

        for(int i = min +1; i < max; i++){
            System.out.println(i);
        }
//        int max, min;
//        if(a > b){
//            max = a;
//            min = b;
//        }
//        else {
//            max = b;
//            min = a;
//        }
//            for(int i = min +1; i < max; i++){
//            System.out.println(i);
//            }
    }
    //18
    public static void test3(int a, int b){
        int num = 0;
        if(a > b){
            for (int i = b; i < a; i++){
                if(i % 5 == 0){
                    num++;
                }
            }
        }
        else if (b > a) {
            for (int i = a; i < b; i++){
                if(i % 5 == 0){
                    num++;
                }
                }
            }
        System.out.println(num);
    }
    public static void test3_2(int a, int b){
        int max = a > b ? a : b;
        int min = b < a ? a : b;

        int cnt = 0;
        for(int i = min + 1; i < max; i++){
            if(i % 5 == 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    //19
    public static void test4(String a, int b){
        String result = "";
        for (int i = 1; i < b + 1; i++){
//          System.out.println(a);
            result = result + " " +a;
        }
        System.out.println(result);
    }
}
