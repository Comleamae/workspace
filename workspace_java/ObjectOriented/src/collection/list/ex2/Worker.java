package collection.list.ex2;

public class Worker {
    private int number;
    private String name;
    private String dept;
    private String phNum;
    private int pay;

    public Worker(int number, String name, String dept, String phNum, int pay) {
        this.number = number;
        this.name = name;
        this.dept = dept;
        this.phNum = phNum;
        this.pay = pay;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    //사원의 연락처 마지막 4자리값 리턴
    public String getLastPhNum(){
//        String num = "010-1111-2222";
//        num.substring(0,4);//"10-"//0번째 자리에서 4번째 글자까지 출력
//        num.substring(5);//"111-2222"//5번째 위치부터 출력
        return phNum.substring(5);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", pay=" + pay +
                '}';
    }
}
