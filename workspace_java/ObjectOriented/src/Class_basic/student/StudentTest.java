package Class_basic.student;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student std1 = new Student();
        Scanner sc = new Scanner(System.in);
        //정보 저장
        int stdage = sc.nextInt();
        std1.name = "이매";
        std1.score = 50;
        std1.introduce();
        //메소드로 호출
        std1.changeName("아니러나");
        std1.changeAge(20);
        std1.changeScore(80);
        std1.introduce();
        std1.introduce();
    }
}
