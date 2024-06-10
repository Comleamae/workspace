package Class_basic.calculator;

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
        if(how.equals("+")){
            Add num = new Add();
            num.setValue(stNum, ndNum);
            num.calculate();
            System.out.println(stNum + how + ndNum + "=" + num.calculate());
        }
    }
}
