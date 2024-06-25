package class_basic.member;

public class Member3 {
    private String name;
    private String id;
    private String password;
    private int age;

    public Member3(String name, String id){
        this.name = name;
        this.id = id;
    }
    public void inforMember(){
        System.out.println("이름은 : "  + this.name);
        System.out.println("아이디는 : " + this.id);
    }
}
