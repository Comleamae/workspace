package collection.list.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpServ {
    private List<Worker> workerList;
    private Scanner sc;

    public EmpServ(){
        sc = new Scanner(System.in);

        workerList = new ArrayList<>();//노동자를 저장할 리스트(통)

        Worker w1 = new Worker(1001, "kim", "개발부", "1111-1111", 200);
        Worker w2 = new Worker(1002, "min", "개발부", "1111-1112", 100);
        Worker w3 = new Worker(1003, "han", "영업부", "1111-1113", 400);
        Worker w4 = new Worker(1004, "sin", "영업부", "1111-1114", 500);
        Worker w5 = new Worker(1005, "lee", "개발부", "1111-1115", 230);

        workerList.add(w1);
        workerList.add(w2);
        workerList.add(w3);
        workerList.add(w4);
        workerList.add(w5);
    }

    //1번 문제
    public void loginService(){

        //무한루프
        boolean isRunning = true; //while문 반복 변수
        boolean isFind = false;

        while (isRunning){
            System.out.print("사번 : ");
            int worNum = sc.nextInt();
            System.out.print("비밀번호(연락처 마지막 4자리) : ");
            String pw = sc.next();

            //입력한 사번과 비밀번호 일치 여부를 확인
             for(Worker w : workerList){
                 if(w.getNumber() == worNum && w.getLastPhNum().equals(pw)){
                     //break;//가장 가까운 반복문 벗어남(while이 아닌 for)
                     isRunning = false;//while문 벗어남
                     System.out.println("로그인 하였습니다");
                     System.out.println(w.getName() + "님 반갑습니다");
                     isFind = true;
                 }
             }
             if(!isFind){//'!' : 부정연산자
                 System.out.println("사번 혹은 비밀번호가 일치하지 않습니다");
             }
        }

    }
    //2번 문제
    public void printDeptMoney(){
        System.out.print("부서명 : ");
        String worDep = sc.next();
        int totalPay = 0;
        double avgPay = 0.0;
        int wNum = 0;
        System.out.println("== "+ worDep +" 월급 현황==");
        for(int i = 0; i < workerList.size(); i++){
            if(workerList.get(i).getDept().equals(worDep)){
                System.out.println(workerList.get(i));
                totalPay = totalPay + workerList.get(i).getPay();
                wNum++;
            }
        }
        avgPay = totalPay / (double)wNum;

        System.out.println("개발부서의 월급 총액은" + totalPay + "원이며," + " 평균 급여는" + avgPay + "원 입니다");

    }

    //3번 문제
    public void increaseMoney(){
        System.out.print("부서명 : ");
        String worDep = sc.next();
        System.out.print("인상급여 : ");
        int incPay = sc.nextInt();
        System.out.println(worDep + "각 사원의 급여가 각각 " + incPay + "원씩 인상됩니다");
        System.out.println("==월급 인상 후 " + worDep + "월급 현황==");
        //급여 인상 코드
        for (Worker w : workerList){
            if(w.getDept().equals(worDep)){
                w.setPay(incPay + w.getPay());
                System.out.println(w.toString());
            }
        }

        for(Worker e : workerList){
            if (e.getDept().equals(worDep)){
                System.out.println(e);
            }
        }
    }
}
