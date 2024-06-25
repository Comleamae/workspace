package Interface;

//Wrapper클래스 - 기본 자료형을 클래스로 표현한 것
//래퍼클래스는 기본자료형처럼 사용하면 된다
//int->Integer
//double->Double
//boolean->Boolean
//float->Float
//char->Char
//byte->Byte
public class BoxTest {
    public static void main(String[] args) {
        //정수 10을 클래스화
        Integer a = Integer.valueOf(10);
        Integer b = 10;
        int d = 10;

        Box c = new Box();
        c.setBox(10); //10 -> Integer
    }
}
