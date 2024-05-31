package 세번째_연산자;

public class 연산자_3_0530 {
    public static void main(String[] args) {
        //증감연산자
        int a = 5;
        ++a;//a의 값을 1증가
        System.out.println(a);//6
        a++;//a의 값을 1증가
        System.out.println(a);//7
        --a;//a의 값을 1감소
        System.out.println(a);//6
        a--;//a의 값을 1감소
        System.out.println(a);//5

        System.out.println();

        //증감연산자를 단독으로 사용하는지
        //다른 코드와 함께 사용하는지에 따라서 결과가 다름
        //다른 코드와 함께 사용시
        //++a : 먼저 1 증가 후 다른 코드 실행
        //a++ : 다른 코드 전부 실행 후 마지막에 1 증가
        int b = 5;
        System.out.println(++b);//6
        int c = 5;
        System.out.println(c++);//5
        System.out.println(c);//6

        int num1 = 10;
        int result = 10 + num1++;
        System.out.println(result); //20
        System.out.println(num1); //11

        /*
            int a = 10;
            int b = 20;
            int c = ++a + b--;
            a = 11 b = 19 c = 31
        */


    }
}
