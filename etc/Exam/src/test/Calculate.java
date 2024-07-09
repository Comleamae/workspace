package test;

public class Calculate {
    private int num1;
    private int num2;

    public Calculate(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //1)
    void setNumber(int num1, int num2){
        setNum1(num1);
        setNum2(num2);
    }
    //2)
    int getSum(){
        return getNum1() + getNum2();
    }
    //3)
    int getMax(){
        int max = 0;
        max = getNum1() > getNum2()?getNum1():getNum2();
        return max;
    }
    //4)
    double getAvg(){
        double avg = (getNum1() + getNum2()) / 2.0;
        return avg;

    }
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
