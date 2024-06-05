package 일곱째_메서드.문제1;

public class Ex_1_7_9 {
    public static void main(String[] args) {
        test1(11,5);
        test2("아","에");
        test3("김형진", 33, "울산");
    }
    //7번
    public static void test1(int a, int b){
        System.out.println(a / b);
        System.out.println(a % b);
    }
    //8번
    public static void test2(String a, String b){
        System.out.println(a + b);
    }
    //9번
    public static void test3(String name, int age, String addr){
        System.out.println("이름은 " + name +"입니다.");
        System.out.println("나이는 " + age +"입니다.");
        System.out.println("주소는 " + addr +"입니다.");
    }
}
