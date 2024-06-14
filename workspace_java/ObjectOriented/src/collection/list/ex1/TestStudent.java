package collection.list.ex1;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();

        std1.setName("abc");
        std1.setKrScore(77);
        std1.setEnScore(52);

        std2.setName("cba");
        std2.setKrScore(81);
        std2.setEnScore(22);

        std3.setName("aaba");
        std3.setKrScore(91);
        std3.setEnScore(92);

        List<Student> listStd = new ArrayList<>();
        listStd.add(std1);
        listStd.add(std2);
        listStd.add(std3);

        for(Student e: listStd){
            System.out.println(e.toString());
        }

        System.out.println();

        for(Student e : listStd){
           int totalScore = e.getEnScore() + e.getKrScore();
            if(totalScore >= 150){
                System.out.println(e.toString());
            }
        }

        System.out.println();
        double totalAvg = 0;
        for(Student e : listStd){
            double avg = (e.getEnScore() + e.getKrScore()) / 2.0;
            System.out.println("학생별 평균은 : " + avg);
            totalAvg = totalAvg + avg;
        }
        System.out.println("세학생의 평균은: " + totalAvg / listStd.size());

        System.out.println();


        int max = 0;
        int num = 0;
        for(int e = 0; e < listStd.size(); e++){
            if((listStd.get(e).getEnScore() + listStd.get(e).getKrScore()) > max){
                max = max + (listStd.get(e).getEnScore() + listStd.get(e).getKrScore());
                num++;
            }
        }
        System.out.println(listStd.get(num).toString());



    }
}
