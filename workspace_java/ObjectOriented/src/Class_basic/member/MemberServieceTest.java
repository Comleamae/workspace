package Class_basic.member;

public class MemberServieceTest {
    public static void main(String[] args) {
        MemberServiece memSe = new MemberServiece();
        boolean result  = memSe.login("hong", "12345");
        if(result){
            System.out.println("로그인 되었습니다");
            memSe.logout("hong");
        }else{
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
