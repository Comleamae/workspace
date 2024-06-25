package 여섯째_배열.연습1;

import java.util.Scanner;

public class 배열_문제_12_true {
    public static void main(String[] args) {
        //변수 선언
        Scanner sc = new Scanner(System.in);
        //0:국어, 1: 영어, 2: 수학, scores.length - 1: 총점
        int[] scores = new int[6];
        //과목명
        String[] subjects = {"국어", "영어", "수학", "사회", "과학"};
        //평균
        double avg;

        //점수입력(0~100점 입력까지 무한루프)
        for(int i = 0; i < scores.length - 1; i++) {
            while(true){
                System.out.println(subjects[i] + " " + "점수: ");
                scores[i] = sc.nextInt();

                if(scores[i] >= 0 && scores[i] <= 100){
                    break;
                }
            }
        }
        //총점 및 평균 계산
        for(int i = 0; i < scores.length - 1; i++){
            scores[scores.length - 1] = scores[scores.length - 1] + scores[i];
        }
        avg = scores[scores.length - 1] / (double)(scores.length - 1) ;

        //점수 및 총점 평균 출력
        System.out.println();
        System.out.println("----입력한 정보입니다---");
        for (int i = 0; i < subjects.length; i++){
            System.out.println(subjects[i] + "점수: "+scores[i]);
        }
        System.out.println("총점: " + scores[scores.length - 1]);
        System.out.println(avg);

    }

}
