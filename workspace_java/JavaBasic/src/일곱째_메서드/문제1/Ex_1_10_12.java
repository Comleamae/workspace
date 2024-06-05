package 일곱째_메서드.문제1;

import java.util.Scanner;

public class Ex_1_10_12 {
    public static void main(String[] args) {
        test1("김형진", 33, "울산");
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하시오: ");
        int num = sc.nextInt();
        test2(num);
        String name1 = sc.next();
        int age1 = sc.nextInt();
        String addr1 = sc.next();
        test3(name1, age1, addr1);
    }
    //10번
    public static void test1(String name, int age, String addr){
        System.out.println("이름은 " + name +"입니다.");
        System.out.println("나이는 " + age +"입니다.");
        System.out.println("주소는 " + addr +"입니다.");
    }
    //11번
    public static void test2(int a){
        System.out.println(a);
    }
    //12번
    public static void test3(String name, int age, String addr){
        System.out.println("이름은 " + name +"입니다.");
        System.out.println("나이는 " + age +"입니다.");
        System.out.println("주소는 " + addr +"입니다.");
    }
}
