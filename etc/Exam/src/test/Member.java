package test;
public class Member {
    private String name;
    private String id;
    private String pw;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", age=" + age +
                '}';
    }
    //1)회원 가입?
    void setInfo(String name, String id, String pw, int age){

        this.name= name;
        this.id = id;
        this.pw = pw;
        this.age =age;

    }

    //2)정보 보기
    void showInfo(){
        System.out.println("Member{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", age=" + age +
                '}');
    }

    //3)로그인 확인
    boolean isLogin(String id, String pw){
        if(id.equals(getId()) && pw.equals(getPw())){
            System.out.println("로그인 가능");
            return true;
        }
        else {
            System.out.println("로그인 불가능");
            return false;
        }
    }
}


