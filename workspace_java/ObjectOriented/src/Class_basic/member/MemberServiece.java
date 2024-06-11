package Class_basic.member;

public class MemberServiece {
    private String id;
    private String password;
    private boolean result;

    public boolean login(String id, String password){
        this.id = id;
        this.password = password;
        if(id.equals("hong") && password.equals("12345")){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
    public void logout(String id){
        this.id = id;
        if(id.equals("hong")){
            System.out.println("로그아웃 되었습니다");
        }
    }
}
