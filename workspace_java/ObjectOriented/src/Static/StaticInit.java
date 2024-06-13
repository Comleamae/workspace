package Static;

//static 키워드가 붙은 멤버변수의 초기화 방법
//static 키워드가 붙은 멤버변수는 생성자에서 초기화 x
//초기화 구문이 따로 존재
public class StaticInit {
    int a;
    static int num;
    int[] arr = new int[3];
    //static 변수 초기화
    static {
        num = 5;
    }

    @Override
    public String toString() {
        return "StaticInit{" +
                "a=" + a +
                '}';
    }

    public StaticInit(){
        a = 10;
        //num = 5; 생성자에서 static 초기화시 반복적으로 해당값으로 초기화됨
        num++;
        for(int i = 0; i < arr.length; i++){
            arr[i] = num;
            System.out.println(arr[i]);
        }
        System.out.println(toString());
        System.out.println(num);

    }
}
