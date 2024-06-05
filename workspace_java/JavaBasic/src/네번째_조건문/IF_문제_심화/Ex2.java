package 네번째_조건문.IF_문제_심화;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점 (x,y)의 좌표를 입력하시오>>");

        int xPos = sc.nextInt();
        int yPos = sc.nextInt();

        if(xPos >= 50 && xPos <= 100 && yPos >= 50 && yPos <= 100){
                System.out.println("사각형 안에 점이 있습니다");
        }
        else {
            System.out.println("없다");
        }

    }
}
