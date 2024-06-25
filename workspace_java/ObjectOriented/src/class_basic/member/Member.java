package class_basic.member;

public class Member {
    String memberName;
    String memberId;
    String memberPassword;
    int memberAge;

    public void setMember(String a, String b, String c, int d){
        memberName = a;
        memberId = b;
        memberPassword = c;
        memberAge = d;
    }

    public void introMember(){
        System.out.println("이름은 : " + memberName);
        System.out.println("아이디는 : " + memberId);
        System.out.println("암호는 : " + memberPassword);
        System.out.println("나이는 : " + memberAge);
    }

    public String setName(String a){
        memberName = a;
        return memberName;
    }

    public void introName(){
        System.out.println("이름은 : " + memberName);
    }
}
