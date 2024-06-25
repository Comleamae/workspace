package class_basic.member;

public class Member2Test {
    public static void main(String[] args) {
        Member2 mem1 = new Member2("이름","아이디","비밀번호");
        mem1.displayInfo();
        mem1.printMember("자바", "java", "123");
        mem1.displayInfo();
    }
}
