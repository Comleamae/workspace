package class_basic.calculator.cal2;

import java.util.Scanner;

public class Main_quter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수 : ");
        int stNum = sc.nextInt();
        System.out.print("두번째 수  : ");
        int ndNum = sc.nextInt();
        System.out.print("연산자 : ");
        String how = sc.next();
//        switch (how){
//            case "+" :
//                Add add = new Add();
//                add.setValue(stNum, ndNum);
//                add.calculate();
//                System.out.println(stNum + how + ndNum + "=" + add.calculate());
//                break;
//            case "-" :
//                Sub sub = new Sub();
//                sub.setValue(stNum, ndNum);
//                sub.calculate();
//                System.out.println(stNum + how + ndNum + "=" + sub.calculate());
//                break;
//            case "*" :
//                Mul mul = new Mul();
//                mul.setValue(stNum, ndNum);
//                mul.calculate();
//                System.out.println(stNum + how + ndNum + "=" + mul.calculate());
//                break;
//            case "/" :
//                Div div = new Div();
//                div.setValue(stNum, ndNum);
//                div.calculate();
//                System.out.println(stNum + how + ndNum + "=" + div.calculate());
//                break;
//            default://if문의 else
//                System.out.println("연사자를 잘못 입력했습니다");
//        }

        if(how.equals("+")){
            Add num = new Add();
            num.setValue(stNum, ndNum);
            num.calculate();
            System.out.println(stNum + how + ndNum + "=" + num.calculate());
        } else if (how.equals("-")) {
            Sub num = new Sub();
            num.setValue(stNum, ndNum);
            num.calculate();
            System.out.println(stNum + how + ndNum + "=" + num.calculate());
        }else if (how.equals("*")) {
            Mul num = new Mul();
            num.setValue(stNum, ndNum);
            num.calculate();
            System.out.println(stNum + how + ndNum + "=" + num.calculate());
        }else if (how.equals("/")) {
            Div num = new Div();
            num.setValue(stNum, ndNum);
            num.calculate();
            System.out.println(stNum + how + ndNum + "=" + num.calculate());
        }else {
            System.out.println("연산자 입력이 잘못되었습니다.");
        }
    }
}
