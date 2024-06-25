package collection.list.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx {
    public static void main(String[] args) {
        //1
        List<String> ex1 = new ArrayList<>();
        ex1.add("dress");
        ex1.add("dress2");
        ex1.add("dress3");

        for(int i = 0; i < ex1.size(); i++){
            System.out.println(ex1.get(i));
        }
        //2
        List<Integer> ex2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //리스트에 데이터 저장
        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            ex2.add(num);
        }

        //리스트에 저장된 데이터의 합
        int sum = 0;
        for(int e : ex2){
            sum = sum +e;
        }
        System.out.println(sum);


        //ex3
        List<String> ex3 = new ArrayList<>();
        ex3.add("홍길동");
        ex3.add("홍동");
        ex3.add("홍길");
        String name = "";
        name = "홍길동";

        for(int i = 0; i < ex3.size(); i++){
            if(ex3.get(i).equals(name)){
                System.out.println("해당 이름이 존재합니다.");
            }
        }

        //ex4
        List<Integer> ex4 = new ArrayList<>();

        //1~100 사이 랜덤 정수 10개 리스트에 저장
        for(int i = 0; i < 10; i++){
             int rand = (int)(Math.random() * 100 + 1);
             ex4.add(rand);
        }
        //리스트에 저장된 짝수의 개수 및 모든 짝수 출력
//        for(int e : ex4){
//            if(e % 2 == 0){
//
//            }
//        }
        int num = 0;
        for(int i = 0; i < ex4.size(); i++){
            if(ex4.get(i) % 2 ==0){
                System.out.println(ex4.get(i));
                num++;
            }
        }
        System.out.println("짝수의 갯수는: " + num);

    }
}
