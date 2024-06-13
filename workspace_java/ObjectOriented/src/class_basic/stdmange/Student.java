package class_basic.stdmange;

public class Student {
    private String name;
    private int age;
    private String grade;
    private String phNum;

    public Student(String name, int age, String phNum, String grade) {
        this.name = name;
        this.age = age;
        this.phNum = phNum;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public String getPhNum() {
        return phNum;
    }

    //학생의 모든 정보 출력
    public void showInfo(){
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("연락처: " + phNum);
        System.out.println("성적: " + grade);
    }
}
