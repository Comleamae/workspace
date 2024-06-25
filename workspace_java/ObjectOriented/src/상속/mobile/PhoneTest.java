package 상속.mobile;

public class PhoneTest {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        SmartPhone sp1 = new SmartPhone();

        //부모클래스로는 자식클래스의 객체를 받을 수 있음
        //다형성으로 생성된 객체는 부모클래스의 변수, 메서드만 사용 가능
        MobilePhone m2 = new SmartPhone();
        //m2.playApp(); 오류 다형성 객체로 자식 메서드를 호출함
        m2.sendMsg();
        //SmartPhone sp2 = new MobilePhone(); -> 오류 자식 개체는 부모 객체를 넣을 수 없다



    }
}
