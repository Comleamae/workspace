package test;

public class MemTest {
    public static void main(String[] args) {
        Member member = new Member();

        //1)
        member.setInfo("자바", "java", "abcd1234", 20);
        //2)
        member.showInfo();
        //3)
        member.isLogin("java", "abcd1234");
        //4)
        member.isLogin("java", "abcd");

    }
}
