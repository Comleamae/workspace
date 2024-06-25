package 상속.dog;
/*
    원래 자바는 자료형이 다르면 데이터 저장을 하지 못함
    상속 관계를 맺어주면 부모클래스에 자식 클래스에 객체를 저장
    그렇게 저장된 객체는 부모클래스의 메서드, 변수만 사용가능
    ->다형성
    이 상황에서 자식 클래스의 메서드를 강제로 실행하는 방법
    자식 클래스에서 실행하고자 하는 메서드를 오버라이딩 시켜주면
    자식 클래스의 메서드를 강제로 실행시킬수 있다.
    ->오버라이딩
*/
//우리 병원에는 강아지, 고양이, 송아지 3종류의 동물을 관리
//병원에는 총 10개의 케이지가 존재 -> 배열 공간 10개 만들기
//단, 세 종류의 동물 수는 항상 변함
class Animal{

    public void bark(){
        System.out.println("동물들이 웁니다");
    }
}
//@ : 어노테이션(Anotation)
//개발자의 실수 방지를 위해 사용 -> 실질적 해석X
public class Dog extends Animal{
    @Override //반드시 오버라이드 문법이지켜져야함 아니면 에러표시
    public void bark(){
        System.out.println("멍멍");
    }
}
class Cat extends  Animal{
    @Override
    public void bark(){
        System.out.println("냐옹");
    }

}
class Cow extends  Animal{
    @Override
    public void bark(){
        System.out.println("음머");
    }
}
