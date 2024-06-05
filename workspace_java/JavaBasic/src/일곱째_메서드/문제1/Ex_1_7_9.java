package 일곱째_메서드.문제1;

public class Ex_1_7_9 {
    public static void main(String[] args) {
        test1(11,5);
        test2("아","에");
        test3("이매", 32, "부산");
    }
    //7번
    public static void test1(int a, int b){
        System.out.println("몫: " + a / b);
        System.out.println("나머지: " + a % b);
    }
    //8번
    public static void test2(String a, String b){
        System.out.println(a + b);
    }
    //9번
    public static void test3_1(String name){
        System.out.println("이름은 " + name +"입니다.");
    }
    public static void test3_2(int age){
        System.out.println("나이는 " + age +"입니다.");
    }
    public static void test3_3(String addr){
        System.out.println("주소는 " + addr +"입니다.");
    }
    public static void test3(String name, int age, String addr){
        test3_1(name);
        test3_2(age);
        test3_3(addr);
    }
}
