package 상속.printer;

public class Printer{
    int usedPaper;
    String name;
    String brand;
    String inter;
    int num;
    int paperNum;

    public Printer(String name, String brand, String inter, int num, int paperNum){
        usedPaper = 0;
        this.name = name;
        this.brand = brand;
        this.inter = inter;
        this.num = num;
        this.paperNum = paperNum;

    }

}


