import java.util.Scanner;
public class YearBis {

    public static void main(String[] args){
        int month;
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number month of year: ");
        month = sc.nextInt();
        System.out.println("Enter  year: ");
        year = sc.nextInt();

        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            System.out.println(month=31);
        }else if(month==4 || month==6 || month==9 || month==11){
            System.out.println(month=30);
        }else if (month==2){

            if(year%400==0 || ((year%4==0) && !(year%100==0) )){
                System.out.println(month=29);
            }else{
                System.out.println(month=28);
            }
        }


    }
}
