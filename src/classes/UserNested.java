package classes;

public class UserNested {

    String name;
    String email;
    int age;
    boolean isDeveloper;
    UserAddress address;

    public UserNested(String name,String email,int age,boolean isDeveloper,UserAddress address){
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
        this.address = address;
    }

}
