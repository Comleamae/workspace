package 일곱째_메서드.문제1;

public class Ex1_1_3 {
    public static void main(String[] args) {
        test1();
        test2();
        test3(5);
    }
    //1번 메서드
    public static void test1(){
        System.out.println("안녕하세요");
    }

    //2번 메서드
    public static void test2(){
        System.out.print("반갑습니다");
        intest2();
    }
    public static void intest2(){
        System.out.println("어서오세요");
    }
    //3번 메서드
    public static void test3(int num){
        System.out.println(num);
    }
}
