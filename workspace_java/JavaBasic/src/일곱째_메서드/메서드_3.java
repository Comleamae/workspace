package 일곱째_메서드;

//매개변수(parameter) : 메서드 정의 부분 소관호 안에서 정의된 변수

import java.util.Scanner;

public class 메서드_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tellYourName("자바");
        System.out.print("이름 입력: ");
        String Num = sc.next();
        tellYourName(Num);

        //tellYourName(5); 매개변수 자료형 불일치
    }

    public static void tellYourName(String name){//String name ="자바"
        System.out.println("제 이름은 " + name);
    }
}
