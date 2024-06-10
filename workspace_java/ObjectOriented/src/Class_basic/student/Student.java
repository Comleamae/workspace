package Class_basic.student;

public class Student {
    String name;
    int age;
    int score;

    //매개변수로 전달된 문자열을 name값을 변경
    public String changeName(String a){
        name = a;
        return name;
    }
    public int changeAge(int a){
        while (true){
            if(a > 100 && a < 0){
                age = a;
                return age;
            }

        }
    }
    public int changeScore(int a){
        score = a;
        return score;
    }
    public void changeNum(String c, int a, int b){
        name = c;
        age = a;
        score = b;
    }

    public void introduce(){
        System.out.println("이름은 " + name);
        System.out.println("나이 " + age);
        System.out.println("점수 " + score);
    }
}
