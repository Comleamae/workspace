package class_basic.man;
//이름, 나이, 주소
//getter : 멤버변수 각각의 값을 리턴받는 메서드
//get + 변수명으로 반드시 지정
//setter : 멤버변수 각각의 값을 변경하는 메서드
//set + 변수명으로 반드시 지정
public class Man {
   private String name;
   private int age;
   private String addr;

    public Man(String name, int age, String addr){
        this.name = name;
        this.age = age;
        this.addr = addr;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddr() {
        return addr;
    }
    public void introMan(){
        System.out.println("이름은 " + name);
        System.out.println("나이는 " + age);
        System.out.println("주소는 " + addr);
    }


}

