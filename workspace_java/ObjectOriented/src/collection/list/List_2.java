package collection.list;

import java.util.ArrayList;
import java.util.List;

public class List_2 {
    public static void main(String[] args) {
        //정수를 다수 저장할 수 있는 list 생성
        List<Integer> list = new ArrayList<>();

        list.add(55);
        list.add(43);
        list.add(8);

        int a = list.get(2);

        list.remove(2);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
