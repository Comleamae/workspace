package 일곱째_메서드;

//overloading
//메서드명은 원래 중복 불가 하지만 매개변수의 정보가 다르면 중복 허용 <=오버로딩
//매개변수 정보 : 매개변수의 자료형, 매개변수의 갯수
public class 메서드오버로딩 {
    public static void main(String[] args) {
        System.out.println(); //=>메서드 오버로딩 방식으로 만들어짐
    }

    public static void println(){

    }
    public static void println(int a){

    }
    public static void println(String a){

    }
    public static void println(int a, int b){

    }
}
