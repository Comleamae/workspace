package 상속.man;

//상속: 부모 클래스의 멤버변수와 메서드를 물려 받는 것
//        Man : 부모클래스, 슈퍼클래스, 상위클래스
//BusinessMan : 자식클래스, 서브클래스, 하위클래스
//상속 사용 이용 : 코드의 재활용(초보자들이 상속을 이해하는 개념)
//               연관성이 없는 다수의 클래스들에 연관성을 부여하여
//               데이터의 관리를 효율적으로 할 수 있게 만들어 주는 기능
// class 클래스명 extends 상속받고싶은클래스명{}

public class Man {
    String name;
    //생성자
    public Man(String name){
        this.name = name;
    }
    public void tellName(){
        System.out.println("이름은 홍길동입니다");
    }
}


//상송받은 클래스의 생성자 가장 첫번째줄에는 super()라는 메서드가 숨겨져있다
//super() : 부모클래스의 기본(default)생성자 호출
class BusinessMan extends Man{
    String company;
    //생성자
    public BusinessMan(){
        super("dfre");
        System.out.println("생성자 호출");
    }
    public void tellCompany(){
        System.out.println("저는 삼성에 다닙니다");
    }

}