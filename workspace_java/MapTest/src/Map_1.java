import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_1 {
    public static void main(String[] args) {
        //데이터에 순번이 존재, 데이터 중복 가능
        //데이터 담기가 자유로움
        List<String> list = new ArrayList<>();

        //데이터가 key 와 value 의 한쌍으로 저장 =>순서가 없음 일반 for 문 불가/foreach 가능
        Map<Integer, String> map = new HashMap<>();

        //map 에 데이터 저장
        map.put(1, "java");
        map.put(2, "python");
        map.put(3, "c++");

        //map 에 저장된 데이터 읽기(key 값으로 읽음)
        System.out.println(map.get(2));


    }
}
