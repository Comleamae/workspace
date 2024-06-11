package Class_basic.stdmange;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        StdMange sm1 = new StdMange();

        System.out.println("학생관리 프로그램을 실행합니다");

        while (isRunning){
            System.out.print("1)학생등록 2)학생정보변경(연락처) 3)학생정보출력 4)모든학생정보출력 5)프로그램 종료 : ");
            int menu = sc.nextInt();
            switch (menu){
                case 1 :
                    sm1.stdReg();
                    break;
                case 2 :
                    sm1.stdChg();;
                    break;
                case 3 :
                    sm1.stdIntro();
                    break;
                case 4 :
                    sm1.allStdIntro();
                    break;
                case 5 :
                    System.out.println("프로그램을 종료합니다");
                    isRunning = false;
            }
        }

}
}
