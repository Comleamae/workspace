package Test1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];
        int arr2[] = new int[3];



        int index = 1;

        for(int i = 0; i < arr.length; i++){
            int rNum = (int)(Math.random() * 9 + 1);
            arr[i] = rNum;
            for(int j = 0; j<i; j++){
                if(arr[j] == arr[i]){
                    i--;
                    break;
                }
            }

        }

        System.out.println(Arrays.toString(arr));
        System.out.println("숫자를 정했습니다. 게임을 시작합니다.");

        while(true){
            int sCnt = 0;
            int bCnt = 0;

            System.out.print(index + " >>");
            index++;
            for(int i=0; i< arr2.length; i++){
                arr2[i] = sc.nextInt();
                for(int j = 0; j < i; j++){
                    if(arr2[i] == arr2[j]){
                        i--;
                        break;
                    }
                }
            }

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
