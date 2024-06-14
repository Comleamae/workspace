package collection.list.ex1;

public class Student {
    String name;
    int krScore;
    int enScore;
    int total;
    public Student() {
        this.total = krScore + enScore;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKrScore() {
        return krScore;
    }

    public void setKrScore(int krScore) {
        this.krScore = krScore;
    }

    public int getEnScore() {
        return enScore;
    }

    public void setEnScore(int enScore) {
        this.enScore = enScore;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", krScore=" + krScore +
                ", enScore=" + enScore +
                ", total=" + total +
                '}';
    }
}
