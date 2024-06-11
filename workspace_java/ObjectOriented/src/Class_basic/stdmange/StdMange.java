package Class_basic.stdmange;

import java.util.Scanner;

public class StdMange {
    private Scanner sc;//키보드 입력을 위해 선언
    private Student[] std;//학성 다 수를 저장할 배열
    private int idx;//학생 배열의 요소
    //생성자
    public StdMange(){
        sc = new Scanner(System.in);
        std = new Student[3];
        idx = 0;
    }

    //학생 등록 메서드
    public void stdReg(){
        if(idx >= 3){
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
        }
        else {
            System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요");
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("연락처 : ");
            String phNum = sc.next();
            System.out.print("학점 : ");
            String grade = sc.next();
            //입력받은 정보로 학생 객체 생성
            Student stu = new Student(name, age, phNum, grade);
            //생성한 학생 객체를 배열에 저장
            std[idx] = stu;
            idx++;
        }
    }
    //학생 정보 변경 메서드
    public void stdChg(){
        System.out.println("학생의 연락처를 변경합니다");
        System.out.print("변경 학생 :");
        String name = sc.next();
        for(int i = 0; i < idx; i++){
            if(std[i].getName().equals(name)){
                System.out.print("연락처 : ");
                String phNum = sc.next();
                std[i].setPhNum(phNum);
            }else {
                System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요.");
            }
        }





    }
    //학생 정보 출력 메서드
    public void stdIntro(){
        System.out.print("정보를 열람할 학생 : ");
        String name = sc.next();
        for(int i = 0; i < idx; i++){
            if(std[i].getName().equals(name)){
                System.out.println(std[i].getName());
                System.out.println(std[i].getAge());
                System.out.println(std[i].getPhNum());
                System.out.println(std[i].getGrade());
            }
            else {
                System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요.");
            }
        }




    }
    //모든 학생 정보 출력 메서드
    public void allStdIntro(){
        System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 " + idx + "명 입니다.");
        for(int i = 0; i < idx; i++){
            std[i].showInfo();
            System.out.println();
        }
    }
}
