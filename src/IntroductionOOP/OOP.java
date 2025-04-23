package IntroductionOOP;


class Person{
    private String name;

    public void changeName(String name2){
        this.name = name2;
    }

    public String displayName(){
        return this.name;

    }
}
public class OOP {

    public static void main(String[] args){
        Person p = new Person();
        p.changeName("Juan ");
        System.out.println(p.displayName());

    }
}
