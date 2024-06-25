package 일곱째_메서드;

import java.util.Scanner;

public class 메서드_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름 입력: ");
        String a1 = sc.next();
        System.out.println("나이 입력: ");
        int b1 = sc.nextInt();
        System.out.println("주소 입력: ");
        String c1 = sc.next();

        introduce(a1, b1, c1);
        introduce("이매", 30, "울산");

        String a = "홍길동";
        int b = 40;
        String c = "서울";
    }
    public static void introduce(String name, int age, String addr){
        System.out.print("이름 : " + name + " ");
        System.out.print("나이 : " + age + " ");
        System.out.print("주소 : " + addr + " ");
    }

}
