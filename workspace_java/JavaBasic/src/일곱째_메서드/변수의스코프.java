package 일곱째_메서드;

//스코프(scope) : 영역
//변수의 스코프 : 선언한 변수를 사용할 수 있는 범위
//사용 범위 : 해당변수를 선언한 중괄호 안에서만 사용 가능
public class 변수의스코프 {
    public static void main(String[] args) {
        int a;
    }

    public static void m1(){
       int a;
    }

    public static void m2(){
        int a;

        if (true){
            int b = 10;
        }

//        System.out.println(b);->b는 if문 안에 선언되어 알 수 없음

    }



}
