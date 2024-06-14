package Interface.student;
//1.아래 요구에 맞는 추상메서드 정의
//2.완성한 인터페이스를 구현한 클래스 생성(MyStudent
//3.MyStudent 클래스에서 인터페이스의 메서드 구현
public interface StudentUtil {
    String getGradeByStudentName(Student[] regStd, String name);
    int[] getTotalScoresToArray(Student[] students);
    Student getHighScoreStudent(Student stu1, Student stu2);
    //Student getHighScoreStudent(Student[] st1);




    //1번 메서드
    /* 메서드명 : getGradeByStudentName
        첫번째 매개변수로 받은 다수의 학생 중
        두번째 매개변수로 받은 이름을 가진 학생의 점수 등급을 리턴
        단, 전달받은 이름을 가지는 학생이 없다면 점수등급은 "등급 없음"이 된다
        점수등급
        90 <= 평균 점수 <=100:A등급
        80 <= 평균 점수 <=89:B등급
        70 <= 평균 점수 <=79:C등급
        70 > 평균 점수:D등급
    */
    //2번 메서드
    /* 메서드명 : getTotalScoresToArray
        매개변수로 받은 다수의학생들의 총점을 배열로 리턴
    */

    //3번 메서드
    /* 메서드명 : getHighScoreStudent
        매개변수로 두명의 학생이 전달된다
        전달된 두 학생 중 총점이 높은 학생 객체를 리턴
        단, 전달된 두 학생의 총점이 같은 경우는 없다고 가정
    */
}
