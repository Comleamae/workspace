package 다섯째_반복문._심화문제;

public class While_심화4 {
    public static void main(String[] args) {

        for(int num = 1; num < 100; num++){
            if (num % 7 == 0 && num % 9 == 0) {
                System.out.println(num);
            }
        }
    }
}
