package 상속.family;

public class Parents {
    public String nation;

    public Parents(){
        this("대한민국");
        System.out.println("Parents() call");
    }
    public Parents(String nation){
        this.nation = nation;
        System.out.println("Parents(String nation) call");
    }
}
