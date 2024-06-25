package class_basic.car;

public class Car {
    String brand;
    String modelName;
    String carNumber;
    int price;
    String owner;

    public String setBrand(String b) {
        brand = b;
        return brand;
    }
    public String setModelName(String b){
        modelName = b;
        return modelName;
    }
    public String setCarNumber(String b){
        carNumber = b;
        return carNumber;
    }
    public int setPrice(int b){
        price = b;
        return price;
    }
    public String setOwner(String b){
        owner = b;
        return owner;
    }
    public void printCarInfo(){
        System.out.println("브랜드 : " + brand);
        System.out.println("차량이름 : " + modelName);
        System.out.println("차량번호 : " + carNumber);
        System.out.println("가격 : " + price);
        System.out.println("소유주 : " + owner);
    }
}

