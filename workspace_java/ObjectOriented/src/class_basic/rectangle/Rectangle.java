package class_basic.rectangle;

public class Rectangle {
    int x1;
    int y1;
    int x2;
    int y2;
    int calResult;
    boolean result;

    //생성자
    public Rectangle() {}
    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public void set(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int square() {
            return (x2 - x1) * (y2 - y1);
    }
    //좌표 정보, 넓이 출력
    public void show() {
        System.out.println("첫번째 좌표는 " + "(" + x1 + ", " + y1 + ")");
        System.out.println("두번째 좌표는 " + "(" + x2 + ", " + y2 + ")");
        System.out.println("넓이는 " + square());
    }

    //인자로 전달된 객체 r과 현 객체가 같은 넓이라면 return true
    public boolean equals(Rectangle r) {
        if (r.square() == square()) {
            return true;
        }
        else {
            return false;
        }
    }
}

