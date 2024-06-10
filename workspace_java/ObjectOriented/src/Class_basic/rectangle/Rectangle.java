package Class_basic.rectangle;

public class Rectangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int calResult;
    private boolean result;

    public Rectangle(){
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
    }
    public Rectangle(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public void set(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public int square(){
        if(x2 > x1 && y2 > y1){
            calResult = (x2 - x1) * (y2 - y1);
            return calResult;
        } else if (x2 > x1 && y1 > y2) {
            calResult = (x2 - x1) * (y1 - y2);
            return calResult;
        } else if (x1 > x2 && y2 > y1) {
            calResult = (x1 - x2) * (y2 - y1);
            return calResult;
        } else {
            calResult = (x1 - x2) * (y1 -y2);
            return calResult;
        }
    }
    public void show(){
        System.out.println("첫번째 좌표는 " + x1 + "," + y1);
        System.out.println("더번째 좌표는 " + x2 + "," + y2);
        System.out.println("넓이는 " + calResult);
    }
//    boolean equals(Rectangle r){
//        if(calResult == ){
//            return true;
//        }


    }

