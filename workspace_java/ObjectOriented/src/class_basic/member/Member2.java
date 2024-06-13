package class_basic.member;

public class Member2 {
    private String name;
    private String id;
    private String password;

    public Member2(String name, String id, String password){
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void displayInfo(){
        System.out.println("이름은 : " + name);
        System.out.println("아이디는 : "+ id);
        System.out.println("비밀번호는 : " + password);
    }
    public void printMember(String name, String id, String password){
        this.name = name;
        this.id = id;
        this.password = password;

    }
}
