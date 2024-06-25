package class_basic.man;

public class ManTest {
    public static void main(String[] args) {
        Man man1 = new Man("linda", 51, "우르산");
        man1.introMan();
        man1.setName("이매");//setter 용례
        man1.setAge(32);
        man1.setAddr("산부");
        man1.introMan();
        System.out.println(man1.getName());//getter 용례
    }
}
