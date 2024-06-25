package 상속.dog;

public class Animal_2 {
    public static void main(String[] args) {

        Animal[] animalHouse= new Animal[10];
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Cow o1 = new Cow();

        animalHouse[0] = d1;
        animalHouse[1] = c1;
        animalHouse[2] = o1;

        //Animal클래스의 변수, 메서드 사용가능
        //Dog 클래스의 변수, 메서드 사용불가
        animalHouse[0].bark();


        for(int i = 0; i < 3; i++){
            animalHouse[i].bark();
        }
    }
}
