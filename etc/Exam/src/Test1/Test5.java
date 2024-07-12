package Test1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //문제 1~9까지 랜덤 정수 중복 없이 저장
        int arr[] = new int[3];

        //대답
        int arr2[] = new int[3];

        int index = 0;

        for(int i = 0; i < arr.length; i++){
            int rNum = (int)(Math.random() * 9 + 1);
            arr[i] = rNum;

            //중복 검사
            for(int j = 0; j<i; j++){
                if(arr[j] == arr[i]){//중복 데이터가 있다면
                    i--;
                    break;//가장 가까운 반복문 벗어남
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("숫자를 정했습니다. 게임을 시작합니다.");

        while(true){
            int sCnt = 0;
            int bCnt = 0;

            index++;
            System.out.print(index + " >>");

            arr2[0] = sc.nextInt();
            arr2[1] = sc.nextInt();
            arr2[2] = sc.nextInt();



            for(int i=0; i< arr2.length; i++){
                for(int j = 0; j < i; j++){
                    if(arr2[i] == arr2[j]){
                        i--;
                        break;
                    }
                }
            }

            //정답 대조
            for(int i = 0; i < arr2.length; i++){
                for(int j =0; j < arr.length; j++){
                    if(arr2[i] == arr[j]){
                        if(i == j){
                            sCnt++;
                        }
                        else {
                            bCnt++;
                        }
                    }
                }
            }

            System.out.println(sCnt+"스트라이크 "+ bCnt +"볼");

            if(sCnt != 3){
                continue;
            } else {
                System.out.println(index + "회만에 정답을 맞췄습니다");
                break;
            }

        }



    }
}
