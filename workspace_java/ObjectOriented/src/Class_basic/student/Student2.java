package Class_basic.student;

public class Student2 {
    private String name;
    private int age;
    private int score;

    public Student2(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getScore() {
        return score;
    }
    public void printStd(){
        System.out.println("이름: " + getName());
        System.out.println("나이: " + getAge());
        System.out.println("점수: " + getScore());
    }
}
