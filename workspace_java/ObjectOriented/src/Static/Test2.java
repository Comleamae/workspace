package Static;

//클래스를 배우기 전에는 왜 메서드에 static을 붙였는가?
//코드 해석시 static이 선언된 요소를 먼저 해석하기에
public class Test2 {
    public static void main(String[] args) {
        aaa();
    }

    public static void aaa(){
        System.out.println("111");
    }
}
