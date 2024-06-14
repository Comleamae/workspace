package collection.list.ex1;

public class Memeber {
    String Id;
    String Password;
    String Name;
    int age;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Memeber{" +
                "Id='" + Id + '\'' +
                ", Password='" + Password + '\'' +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
