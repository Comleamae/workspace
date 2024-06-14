package collection.list.ex2;

public class Worker {
    int number;
    String name;
    String nameC;
    String phNum;
    int pay;

    public Worker(int number, String name, String nameC, String phNum, int pay) {
        this.number = number;
        this.name = name;
        this.nameC = nameC;
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

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC;
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
}
