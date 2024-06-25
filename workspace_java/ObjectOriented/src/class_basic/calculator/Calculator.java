package class_basic.calculator;

public class Calculator {
    int num1;
    int num2;
    String how;
    int result;


    public void setNum(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSum(){
        return num1 + num2;
    }
    public int getMin(){
        return num1 - num2;
    }
    public int getxin(){
        return num1 * num2;
    }
    public int getqin(){
        return num1 / num2;
    }
    public void sum(int a, int b, String c){
        num1 = a;
        num2 = b;
        how = c;
        result = num1 + num2;
    }
    public void min(int a, int b, String c){
        num1 = a;
        num2 = b;
        how = c;
        result = num1 - num2;
    } public void xin(int a, int b, String c){
        num1 = a;
        num2 = b;
        how = c;
        result = num1 * num2;
    } public void qin(int a, int b, String c){
        num1 = a;
        num2 = b;
        how = c;
        result = num1 / num2;
    }
    public int sum1(int a, int b){
        return num1 + num2;
    }
    public int min1(int a, int b){
        return num1 - num2;
    }
    public int xin1(int a, int b){
        return num1 * num2;
    }
    public int qin1(int a, int b){
        return num1 / num2;
    }


    public void result(){
        System.out.println(num1 + " " + how + " "+ num2 + " " + "=" + " " + result);
    }
}
