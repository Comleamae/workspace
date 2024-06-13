package object;

public class Person {
    String name;
    int age;

    //부모클래스의 메서드를 오버라이딩
    //오버라이딩이 되려면 메서드명 일치, 매개변수 정보, 리턴 타입 일치
    @Override
    public boolean equals(Object obj) {//Object obj = p2;

        if(name.equals(((Person)obj).name) && age == ((Person)obj).age){
            return true;
        }
        else {
            return false;
        }
    }
    //toString() 오버라이딩
    //객체를 문자열로 표현 -> 모든 멤버변수의 값

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
