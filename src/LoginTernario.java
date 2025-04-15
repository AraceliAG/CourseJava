import java.util.Scanner;
public class LoginTernario {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String u, p;
        String[] usernames = {"juan", "pepe", "mario"};
        String[] passwords= {"123","1234","12345"};
        boolean verify = false;
        System.out.println("Enter your username: ");
        u = sc.nextLine();
        System.out.println("Enter your password");
        p = sc.nextLine();
        for (int i=0; i<= usernames.length-1; i++){

            verify = usernames[i].equals(u) && passwords[i].equals(p) ? true:verify;
        }

        String end;
        end = verify ? "Welcome ".concat(u) : "Your data is incorrect";
        System.out.println(end);

        int max=0;
        int a,b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        max = (a>b) ? a:b;
        max = (max>c) ? max:c;

        System.out.println("Number winner is " + max);

    }
}
