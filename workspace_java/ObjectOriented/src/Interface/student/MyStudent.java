package Interface.student;

public class MyStudent implements StudentUtil{

    @Override
    public String getGradeByStudentName(Student[] regStd, String name) {
        String grade = "등급없음";
        for(Student stu : regStd){
            if(stu.getName().equals(name)){
                double avg = (stu.getKorScore() + stu.getMathScore() + stu.getEngScore()) / 3.0;
                grade = getGradeByAvg(avg);
            }
        }
        return grade;
    }

    //정수에 따라 등급을 결정
    private String getGradeByAvg(double avg){
        String grade = "등급없음";

        if(avg >= 90 && avg <= 100){
            grade = "A";
        } else if (avg >= 80 && avg<= 89) {
            grade = "B";
        } else if (avg >= 70 && avg <= 79) {
            grade = "C";
        } else {
            grade = "D";
        }
        return grade;
    }

    @Override
    public int[] getTotalScoresToArray(Student[] students) {
        //학생들의 총점이 저장될 배열 생성
        int[] totalScores = new int[students.length];
        for(int i = 0; i < students.length; i++){
            totalScores[i] = students[i].getKorScore() + students[i].getMathScore() + students[i].getEngScore();
        }
        return totalScores;
    }



    @Override
    public Student getHighScoreStudent(Student stu1, Student stu2) {
        int sum1 = stu1.getMathScore() + stu1.getKorScore() + stu1.getEngScore();
        int sum2 = stu2.getMathScore() + stu2.getKorScore() + stu2.getEngScore();
        return sum1 > sum2 ? stu1 : stu2;
    }

}
