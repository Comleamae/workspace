package Class_basic.car;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        //c1의 변수를 출력
        System.out.println(c1.brand);
        System.out.println(c1.modelName);
        System.out.println(c1.carNumber);
        System.out.println(c1.price);
        System.out.println(c1.owner);
        //c1 변수의 값 변경
        c1.setBrand("횬다이");
        c1.setModelName("소나타");
        c1.setCarNumber("8463");
        c1.setPrice(500);
        c1.setOwner("fila");
        c1.printCarInfo();

        System.out.println();

        c2.brand = "기아";
        c2.modelName = "k3";
        c2.carNumber = "4631";
        c2.price = 846;
        c2.owner = "ally";
        c2.printCarInfo();


    }
}
