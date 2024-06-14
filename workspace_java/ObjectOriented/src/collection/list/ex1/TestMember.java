package collection.list.ex1;

import java.util.ArrayList;
import java.util.List;

public class TestMember {
    public static void main(String[] args) {
        List<Memeber> mem = new ArrayList<>();
        Memeber memeber1 = new Memeber();
        Memeber memeber2 = new Memeber();
        Memeber memeber3 = new Memeber();

        memeber1.setId("aa");
        memeber1.setPassword("aa");
        memeber1.setName("java");
        memeber1.setAge(10);

        memeber2.setId("ba");
        memeber2.setPassword("aa");
        memeber2.setName("jva");
        memeber2.setAge(20);

        memeber3.setId("java");
        memeber3.setPassword("aa");
        memeber3.setName("java");
        memeber3.setAge(30);

        mem.add(memeber1);
        mem.add(memeber2);
        mem.add(memeber3);
        //6번
        for(Memeber member : mem){
            System.out.println(member);
        }

        System.out.println();

        for(int i = 0; i < mem.size(); i++){
            System.out.println(mem.get(i));
        }

        System.out.println();

        //7번
        int totalAge = 0;
        for(int i = 0; i < mem.size(); i++){
            totalAge = totalAge + mem.get(i).getAge();

        }
        System.out.println(totalAge);

        System.out.println();

        //8번
        int index = 0;
        for(int i = 0; i < mem.size(); i++){
            if(mem.get(i).getId().equals("java")){
                index = i;
            }
        }
        mem.remove(index);
        System.out.println(mem);
    }
}
