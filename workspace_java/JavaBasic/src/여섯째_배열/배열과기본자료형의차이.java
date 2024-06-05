package 여섯째_배열;

public class 배열과기본자료형의차이 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = a;
//        a = 20;
//        System.out.println("a = " + a);// 20
//        System.out.println("b = " + b);// 10
        int[] a = {1, 3, 5};
        int[] b = a; //{1, 3, 5}
        a[0] = 10;
        b[2] = 50;
        System.out.println(a);
        //배열의 주소 출력 -> 변수는 하나의 값이라는 대전제 위반x
        System.out.println(b);

        for(int e : a){
            System.out.print(e + " "); //{10, 3, 50}
        }

        System.out.println();

        for (int e : b){
            System.out.print(e + " "); //{10, 3, 50}
        }

        System.out.println();
        //배열의 복사
        int[] c = {1, 2, 3};
        int[] d = c.clone();
        }



    }

