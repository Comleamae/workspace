package collection.list.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //자바반에 소속될 학생 3명
        Student s1 = new Student("kim", 20, 60);
        Student s2 = new Student("lee", 30, 50);
        Student s3 = new Student("han", 10, 40);
        //자바반에 저장할 학생 리스트
        List<Student> stdlist1 = new ArrayList<>();
        stdlist1.add(s1);
        stdlist1.add(s2);
        stdlist1.add(s3);
        //자바반
        StudyClass javaClass = new StudyClass(stdlist1, "java", "choi");

        //파이썬반에 저장될 학생 3명 생성
        Student s4 = new Student("sim", 40, 70);
        Student s5 = new Student("wun", 15, 30);
        Student s6 = new Student("wang", 22, 90);
        //파이썬반 학생들이 저장될 리스트생성 및 해당 리스트에 파이썬반 학생 저장
        List<Student> stdlist2 = new ArrayList<>();
        stdlist2.add(s4);
        stdlist2.add(s5);
        stdlist2.add(s6);
        //파이썬반 객체 생성 + 파이썬반 학생 목록 저장
        StudyClass pythonClass = new StudyClass(stdlist2, "python", "hwang");

        //캐드반에 저장될 학생 3명 생성
        Student s7 = new Student("park", 26, 52);
        Student s8 = new Student("goo", 31, 62);
        Student s9 = new Student("kang", 55, 77);
        //캐드반 학생들이 저장될 리스트 생성 및 해당 리스트에 캐드반 학생 저장
        List<Student> stdlist3 = new ArrayList<>();
        stdlist3.add(s7);
        stdlist3.add(s8);
        stdlist3.add(s9);
        //캐드반 객체 생성 + 파이썬반 학생 목록 저장
        StudyClass cadClass = new StudyClass(stdlist3, "cad", "shin");

        //교실을 여러개 저장할 수 있는 list 생성
        List<StudyClass> classList = new ArrayList<>();
        classList.add(javaClass);
        classList.add(pythonClass);
        classList.add(cadClass);

        //
        School school = new School(classList);

        //학교 안의 모든 학생의 정보 출력
       for(int i = 0; i < school.getClassList().size(); i++){
           for(int j = 0; j < school.getClassList().get(i).getStdList().size(); j++){
                System.out.println(school.getClassList().get(i).getStdList().get(j).toString());
            }
        }
        System.out.println();
        //입력받은 반의 모든 학생 정보 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("찾아볼 반을 입력하세요");
        String classnName = sc.next();
        for(int i = 0; i < school.getClassList().size(); i++){
            if(school.getClassList().get(i).getClassName().equals(classnName)){
                school.getClassList().get(i).printStdAll();
            }
        }


        //해당 반의 평균 성적을 리턴하는 기능
//        int totalScore = 0;
//        int index = 0;
//        int dex = 0;
//        double avgScore;
//        for(int i =0; i < school.getClassList().size(); i++){
//            if(school.getClassList().get(i).getClassName().equals("java")){
//                for (int j = 0; j < school.getClassList().get(i).getStdList().size(); j++){
//                    totalScore = totalScore + school.getClassList().get(i).getStdList().get(j).getScore();
//                    index = i;
//                    dex = j;
//                    System.out.println(school.getClassList().get(i).getStdList().get(j).toString());
//                }
//            }
//        }
//        avgScore = totalScore / school.getClassList().get(index).getStdList().size();
//        System.out.println(avgScore);
        //입력 받은 반은 평균을 출력하는 기능
        System.out.print("찾아볼 반을 입력하세요");
        String classnName2 = sc.next();
        int index = 0;
        for(int i = 0; i < school.getClassList().size(); i++){
            if (school.getClassList().get(i).getClassName().equals(classnName)){
                school.getClassList().get(i).avgScore();
                index = i;
            }
        }
        System.out.println("해당 반의 평균 점수는"+ school.getClassList().get(index).avgScore());


        System.out.println();
        //해당 반에서 최고 성적을 지닌 학생을 리턴하는 기능
        int max = 0;
        int count = 0;
        int count2 = 0;
        for(int i = 0; i < school.getClassList().size(); i++){
            if(school.getClassList().get(i).getClassName().equals("python")){
                for(int j = 0; j < school.getClassList().get(i).getStdList().size(); j++) {
                    if (max < school.getClassList().get(i).getStdList().get(j).getScore()) {
                        max = max + school.getClassList().get(i).getStdList().get(j).getScore();
                        count = i;
                        count2 = j;
                    }
                }
            }
        }
        System.out.println(school.getClassList().get(count).getStdList().get(count2).toString());



    }
}
