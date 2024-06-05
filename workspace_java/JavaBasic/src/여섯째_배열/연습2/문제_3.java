package 여섯째_배열.연습2;

public class 문제_3 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int num = 0;
        for (int i = 1; i < 100; i++) {
            arr[i] = i + 1;
            if (arr[i] % 2 != 0 && arr[i] % 3 != 0 && arr[i] % 5 != 0 && arr[i] % 7 != 0) {
                num++;
            }
            if (arr[i] == 2) {
                num++;
            }
            if (arr[i] == 3) {
                num++;
            }
            if (arr[i] == 5) {
                num++;
            }
            if (arr[i] == 7) {
                num++;
            }

        }
        System.out.println("소수의 갯수는: " + num);
    }
}
