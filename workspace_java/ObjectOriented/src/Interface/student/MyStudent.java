package Interface.student;

public class MyStudent implements StudentUtil{
    public static void main(String[] args) {
        Student s1 = new Student("lee", 20,40,60);
        Student s2 = new Student("park", 70,60,50);
        Student s3 = new Student("kim", 50, 40,30);
        String[] regStd = new String[3];
        String name = "park";

    }

    @Override
    public String getGradeByStudentName(Student[] regStd , String name) {
        String grade = "";
        for(int i = 0; i < regStd.length; i++){
            if(name.equals(regStd[i])){
                double avgScore = (regStd[i].getKorScore() + regStd[i].getEngScore() + regStd[i].getMathScore()) / 3;
                if(avgScore >= 90 && avgScore <= 100){
                    grade = "A";
                } else if (avgScore >= 80 && avgScore <= 89) {
                    grade = "B";
                } else if (avgScore >= 70 && avgScore <= 79) {
                    grade = "C";
                } else if (avgScore < 70){
                    grade = "D";
                } else {
                    grade = "등급 없음";
                }
            }
        }
        return grade;
    }

//    @Override
//    public int[] getTotalScoresToArray() {
//        int totalScore =
//        return new int[0];
//    }
//
//    @Override
//    public Student getHighScoreStudent(Student std1, Student std2) {
//        Student higherS;
//
//        return higherS;
//    }
}
