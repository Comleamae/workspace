package Class_basic.book;
//기본자료형
//int num = 5;
//int num2 = num;
//double num3 = num2; //5.0 자동형변환(정수에서 실수만)으로 출력가능

//double num4 = 5.5;
//int num5 = num4; ->실수를 정수에 넣으려하여 자동형 변환x 자료형이 다름

//int num6 = 7;
//String a = num6; ->정수를 문자열에 넣으려하여 자료형이 다름

//int[] arr1 = {1, 3, 5};
//String[] arr2 = arr1; -> 자료형이 다름

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("java", "kim", 1000);
        Book book2 = new Book("python", "lee", 2000);

        //자료형 변수명
        //int a;
        Book book3 = book1;
        System.out.println(book1.title);//java
        System.out.println(book3.title);//java
        book1.title = "c++";
        System.out.println(book1.title);//c++
        System.out.println(book3.title);//c++




    }
}
