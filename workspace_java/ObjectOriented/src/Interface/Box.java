package Interface;

import java.sql.Wrapper;

//무엇이든 넣고 뺄 수 있는 만능 박스(Object는 모든 클래스의 부모->클래스는 다 넣을 수 있다)
public class Box {
    //String str;
    Object str;

    public void setBox(Object str){
        this.str = str;
    }
    public Object getBox(){
        return str;
    }



}
