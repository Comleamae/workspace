package class_basic.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal1 = new Calculator();
        System.out.print("첫번째 수 : ");
        int stNum = sc.nextInt();
        System.out.print("두번재 수 : ");
        int ndNum = sc.nextInt();
        System.out.print("연산자 : ");
        String psHow = sc.next();

        //cal 객체의 num1과 num2를 키보르로 입력받은 값으로 변경
        cal1.setNum(stNum, ndNum);

        if(psHow.equals("+")){
            System.out.println(stNum + "+" + ndNum + " = " + cal1.getSum());
        }

//        if(psHow.equals("+")){
//            cal1.sum(stNum, ndNum, psHow);
//        }
//        else if (psHow.equals("-")) {
//            cal1.min(stNum, ndNum, psHow);
//        }
//        else if (psHow.equals("*")) {
//            cal1.xin(stNum, ndNum, psHow);
//        }
//        else if (psHow.equals("/")) {
//            cal1.qin(stNum, ndNum, psHow);
//        }
//        else{
//              System.out.println("연산자를 잘못입력했어요");
//        }

        if(psHow.equals("+")){
            cal1.sum1(stNum, ndNum);
            System.out.println(stNum + " " + psHow + " "+ ndNum + " " + "=" + " " + (stNum + ndNum));
        }
        else if(psHow.equals("-")){
            cal1.min1(stNum, ndNum);
            System.out.println(stNum + " " + psHow + " "+ ndNum + " " + "=" + " " + (stNum - ndNum));
        }
        else if(psHow.equals("*")){
            cal1.xin1(stNum, ndNum);
            System.out.println(stNum + " " + psHow + " "+ ndNum + " " + "=" + " " + (stNum * ndNum));
        }
        else if(psHow.equals("/")){
            cal1.qin1(stNum, ndNum);
            System.out.println(stNum + " " + psHow + " "+ ndNum + " " + "=" + " " + (stNum / ndNum));
        }
    }
}
