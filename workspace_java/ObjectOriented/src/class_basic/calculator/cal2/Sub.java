package class_basic.calculator.cal2;

public class Sub {
    private int a;
    private int b;
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return a - b;
    }
}
