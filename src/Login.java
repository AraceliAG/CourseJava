import java.util.Scanner;

public class Login {

    public  static  void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        String username = "juan";
        String psw = "j123";
        String user, pass;

        System.out.println("Enter your username: ");
        user = sc.nextLine();
        System.out.println("Enter your password: ");
        pass = sc.nextLine();

        boolean authentication = false;
        if(psw.equals(pass) && username.equals(user)){
            authentication = true;
        }

        if(authentication){
            System.out.println("Welcome " + user);

        }else{
            System.out.println("Error with your data! ");
        }

    }
}
