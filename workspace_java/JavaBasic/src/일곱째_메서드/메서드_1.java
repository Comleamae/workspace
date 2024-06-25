package 일곱째_메서드;
//메서드명은 자유롭게 선언
import java.util.Scanner;

//메소드(Method) == 함수(Function)
//반복해서 실행하는 코드를 밀 하나의 기능으로 정의
//사용은 크게 정의 부분과 호출 부분으로 나뉨
//사용하려면 정의 후 호출해야함

//메서드 정의는 클래스 안 + 다른 메서드 밖에서 선언
//메서드는 필욯나 만큼 무한정 정의할 수 있다
//메서드명은 중복 불가(대소문자 구분)
//메서드명은 항상 소문자로 작명

//메서드의 호출은 메서드의 정의 안에서 호출
//메서드를 호출할 때는 정의한 매서드명을 반드시 일치시켜야함
//메서드를 호출할 때는 정의한 매서드의 매개변수 정보도 일치시켜야함
//매개변수 정보: 매개변수의 자료형, 매개변수의 갯수 일치시켜야함



//메서드의 정의 문법
/*
    접근제한자 리턴타입 메서드명(매개변수 정보){

    }

    public static void 메서드명(){

    }
*/
public class 메서드_1 {
    //메서드 정의
    public static void hello() {
        System.out.println("hello~");
    }

    public static void main(String[] fool) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for(int i = 0; i < h; i++){
            //메서드 호출
            hello();
        }

    }
}
