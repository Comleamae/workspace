package 상속.dataBase;

import java.util.Scanner;

public class ProductInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("상품 추가<1>");
        System.out.print("모든 상품 조회<2>");
        System.out.print("끝내기<3>");
        int stNum = sc.nextInt();
        if(stNum == 1){
            System.out.print("상품 종류");
            System.out.print("책<1>");
            System.out.print("음악CD<2>");
            System.out.print("회화책<3>");
            int ndNum = sc.nextInt();
            if(ndNum == 1){

            } else if (ndNum == 2) {

            } else if (ndNum == 3) {

            } else {
                System.out.println("추가하려는 상품이 잘못되었습니다.");
            }

        } else if (stNum == 2) {

        } else if (stNum == 3) {

        }else {
            System.out.println("명령입력이 잘못되었습니다");
        }

    }
}
