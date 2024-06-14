package Interface.student;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyStudent s = new MyStudent();

        Student[] regStd = new Student[5];
        Student s1 = new Student("park", 50, 60, 50);
        Student s2 = new Student("lee", 90, 50, 70);
        Student s3 = new Student("kim", 40, 70, 80);
        Student s4 = new Student("gang", 30, 40, 10);
        Student s5 = new Student("lo", 20, 80, 20);
        regStd[0] = s1;
        regStd[1] = s2;
        regStd[2] = s3;
        regStd[3] = s4;
        regStd[4] = s5;

        String result1 = s.getGradeByStudentName(regStd, "km");
        System.out.println(result1);

        System.out.println();

        int [] result2 = s.getTotalScoresToArray(regStd);
        System.out.println(Arrays.toString(result2));

        System.out.println();

        Student result3 = s.getHighScoreStudent(s1, s2);
        System.out.println(result3.getName());
    }
}
