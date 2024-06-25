package collection.list.ex1;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        Student std1 = new Student("abc",77,52);
        Student std2 = new Student("cba",99,92);
        Student std3 = new Student("aaba",91,92);


        List<Student> listStd = new ArrayList<>();
        listStd.add(std1);
        listStd.add(std2);
        listStd.add(std3);
        //1.리스트에 저장된 모든 정보 출력
        for(Student e: listStd){
            System.out.println(e.toString());
        }

        System.out.println();
        //2.총점이 150점 이상인 학생의 모든 정보를 출력하세요
        for(Student e : listStd){
           int totalScore = e.getEnScore() + e.getKrScore();
            if(totalScore >= 150){
                System.out.println(e.toString());
            }
        }
        for(int i = 0; i<listStd.size(); i++){
            if(listStd.get(i).getTotal() >= 150){
                System.out.println(listStd.get(i));}
            }



        System.out.println();


        //3. 모든 학생에 대한 평균 점수를 출력하세요.
        double totalAvg = 0;
        int sum = 0;
        for(Student e : listStd){
            double avg = (e.getTotal()) / 2.0;
            System.out.println("학생별 평균은 : " + avg);
            totalAvg = totalAvg + avg;
            sum = sum + e.getTotal();
        }
        System.out.println("세학생의 평균은: " + totalAvg / listStd.size());


        System.out.println();

        //총점이 1등인 학생의 모든 정보를 출력해보세요.
        int max = 0;//가장 높은 총점
        int num = 0;//총점이 1등인 학생의 인덱스
        for(int e = 0; e < listStd.size(); e++){
            if((listStd.get(e).getEnScore() + listStd.get(e).getKrScore()) > max){
                max = max + (listStd.get(e).getEnScore() + listStd.get(e).getKrScore());
                num = e;
            }
        }
        System.out.println(listStd.get(num).toString());
        for(int i = 0; i <listStd.size(); i++){
            if(listStd.get(i).getTotal() > max){
                max = max + listStd.get(i).getTotal();
                num = i;
            }
        }
        System.out.println(listStd.get(num));
    }
}
