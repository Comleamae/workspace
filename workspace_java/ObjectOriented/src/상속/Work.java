package 상속;


public class Work {
    public static void main(String[] args) {
        B bp = new B();
        B bp1 = new B(10);
        B bp2 = new B(10, 20);
        B bp3 = new B(10, 20, 30);
        B bp4 = new B(10, 20, 30, 40);
        bp.disp();
        bp1.disp();
        bp2.disp();
        System.out.println();
        bp3.disp();
        bp4.disp();
    }

}
class A{
    private int x;
    private int y;

    public A(){
        x = 1;
        y = 1;
    }
    public A(int x){
        this.x = x;
        y = 1;
    }
    public A(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getAx(){
        return x;
    }
    public int getAy(){
        return y;
    }
    public void disp(){
        System.out.print("x = "+ getAx()+", y = " + getAy());
    }
}
class B extends A{
    private int x;
    private int y;

    public B(){
        x = 1;
        y = 1;
    }
    public B(int x){
        super(x);
        this.x = 1;
        y = 1;
    }
    public B(int x, int y){
        super(x, y);
        this.x = 1;
        this.y = 1;
    }
    public B(int x, int y, int c){
        super(x, y);
        this.x = c;
        this.y = 1;
    }
    public B(int x, int y, int c, int d){
        super(x, y);
        this.x = c;
        this.y = d;
    }
    public int getBx(){
        return x;
    }
    public int getBy(){
        return y;
    }
    public void disp(){
        super.disp();//부모클래스에서 선언한
        //this.disp(); 자신이 선언한
        System.out.println(", x = " + getBx() + ", y = " + getBy());
    }
}
