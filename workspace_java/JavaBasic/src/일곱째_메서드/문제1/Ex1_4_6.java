package 일곱째_메서드.문제1;

public class Ex1_4_6 {
    public static void main(String[] args) {
        num("이야다");
        num2(5, 3);
        num3(6,5,3);
    }
    //4번
    public static void num(String a){
        System.out.println(a);
    }
    //5번
    public static void num2(int b, int c){
        System.out.print(b + c);
    }
    //6번
    public static void num3(int a, int b, int c){
        System.out.println(a * b * c);
    }
}
