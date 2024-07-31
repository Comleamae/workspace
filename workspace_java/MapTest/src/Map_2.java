import java.util.HashMap;
import java.util.Map;

public class Map_2 {
    public static void main(String[] args) {
        //학생 객체 3명 생성 후
        Student student1 = new Student(1, "lee");
        Student student2 = new Student(2, "kim");
        Student student3 = new Student(3, "park");

        Map<Integer, Student> map = new HashMap<>();

        //3명의 학생을 map 에 저장 하시오 키는 학생의 학번으로 지정
        map.put(student1.getStuNum(), student1);
        map.put(student2.getStuNum(), student2);
        map.put(student3.getStuNum(), student3);

        //키가 2번인 학생의 학생 이름 출력
        System.out.println(map.get(2).getStuName());

    }
}
