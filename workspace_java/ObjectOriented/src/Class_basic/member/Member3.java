package Class_basic.member;

public class Member3 {
    String name;
    String id;
    String password;
    int age;

    public Member3(String name, String id){
        this.name = name;
        this.id = id;
        password = "패스워드";
        age = 00;
    }
    public void inforMember(){
        System.out.println("이름은 : "  + this.name);
        System.out.println("아이디는 : " +this.id);
    }
}
