package Class_basic.member;

import java.util.Scanner;

//이름, 아이디, 비밀번호, 나이
public class MemberTest {
    public static void main(String[] args) {
        Member mem1 = new Member();
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String id = sc.next();
        String password = sc.next();
        int age = sc.nextInt();

        mem1.setMember(name, id, password, age);
        mem1.introMember();

        mem1.setName("dress");
        mem1.introName();
    }


}
