import java.util.Scanner;
public class LoginArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] usernames = {"juan", "pepe", "carlitos"};
        String[] passwords = {"123","1234","12345"};
        String username, pass;
        System.out.println("Enter your username: ");
        username = sc.nextLine();
        System.out.println("Enter your password: ");
        pass = sc.nextLine();

        boolean verify = false;

        for(int i = 0; i<= usernames.length -1; i++){
            if(usernames[i].equals(username) && passwords[i].equals(pass)){

                verify = true;

            }
        }

        if (verify){
            System.out.println("Welcome " + username + "!");
        }else{
            System.out.println("Your username or password is incorrect ");
        }

    }
}
