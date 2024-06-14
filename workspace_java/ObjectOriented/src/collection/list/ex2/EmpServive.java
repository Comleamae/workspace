package collection.list.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpServive {
    private List<Worker> list;

    public EmpServive(){
        list = new ArrayList<>();
        Worker w1 = new Worker(1000, "lee", "개발부", "4344", 1000);
        Worker w2 = new Worker(1000, "park", "개발부", "4344", 1000);
        Worker w3 = new Worker(1000, "kim", "개발부", "4444", 1000);

        list.add(w1);
        list.add(w2);
        list.add(w3);
    }




    public void login(){
        Scanner sc = new Scanner(System.in);

        System.out.print("사번 : ");
        int psNum = sc.nextInt();
        System.out.print("비밀번호(연락처의 마지막 4자리) : ");
        String psNum2 = sc.next();
        int num = 0;
        for(int i = 0; i < list.size(); i++ ){
            if(psNum == list.get(i).getNumber() && psNum2.equals(list.get(i).getPhNum()) ){
                System.out.println("로그인 하였습니다");
                System.out.println(list.get(i).getName() + "님 반갑습니다");
            }
            else {
                System.out.println("사번 혹은 비밀번호가 일치하지 않습니다");
            }
        }




    }

    public void pay (String nameC){
        Scanner sc = new Scanner(System.in);
        System.out.print("부서명 : ");
        String psName = sc.next();
        System.out.println("==개발부 월급 현황==");
        for(int i = 0; i < 5; i++){
            System.out.println();
        }
    }
}
