package 다섯째_반복문.For.문제;

public class For_문제6 {
    public static void main(String[] args) {
        int crt = 0;
        for (int i = 1; i < 101 ; i++){
            if (i % 3 == 0) {
                crt++;
            }
        }
        System.out.println(crt);
    }
}
