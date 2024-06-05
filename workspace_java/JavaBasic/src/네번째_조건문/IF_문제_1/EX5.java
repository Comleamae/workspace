package 네번째_조건문.IF_문제_1;

public class EX5 {
    public static void main(String[] args) {
        int a = 85;
        String grade;

        if (a > 90 && a <= 100) {
            grade = "A";
        }
        else if (a > 80) {
            grade ="B";
        }
        else {
            grade = "C";
        }
        System.out.println("학점은 " + grade);
    }
}
