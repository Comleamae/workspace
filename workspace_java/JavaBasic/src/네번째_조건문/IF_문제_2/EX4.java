package 네번째_조건문.IF_문제_2;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수 입력: ");
        int krSc = sc.nextInt();
        System.out.println("점수 입력: ");
        int enSc = sc.nextInt();
        System.out.println("점수 입력: ");
        int maSc = sc.nextInt();
        int ttSc = krSc + enSc + maSc;
        double raSc = ttSc / 3.0;
        System.out.println("국어점수: " + krSc);
        System.out.println("영어점수: " + enSc);
        System.out.println("수학점수: " + maSc);
        System.out.println("총점수: " + ttSc);
        System.out.println("평균점수: " + raSc);

    }
}
