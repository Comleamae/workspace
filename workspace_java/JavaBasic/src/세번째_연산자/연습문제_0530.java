package 세번째_연산자;

import java.util.Scanner;

/*
    키보드로 이름, 국어점수, 영어점수, 수학점수를 입력받는다.
    단, 점수들은 정수만 입력한다고 가정한다.
    모든 정보를 입력 받은 후
    입력받은 이름, 국어 점수, 영어 점수, 수학점수와 총점 및 평균을 출력
*/
public class 연습문제_0530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력해주세요");
        String name = sc.next();
        System.out.print("당신의 국어점수를 입력해주세요");
        int lanNum = sc.nextInt();
        System.out.print("당신의 영어점수를 입력해주세요");
        int enNum = sc.nextInt();
        System.out.print("당신의 수학점수를 입력해주세요");
        int maNum = sc.nextInt();

        int totNum = lanNum + enNum + maNum;
        double rNum = totNum / 3.0 ;

        System.out.println();
        System.out.println("입력결과");
        System.out.println("이름 =" + name);
        System.out.println("국어 점수 = " + lanNum);
        System.out.println("영어 점수 = " + enNum);
        System.out.println("수학 점수 = " + maNum);
        System.out.println("총점 = " + totNum);
        System.out.println("평균 = " + rNum);

        System.out.println();
    }
}
