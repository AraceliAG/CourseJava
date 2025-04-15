public class YearBisSw {

    public static void main(String[] args){
        int year=2056, month=2;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("month with " +31+ " days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("month with " +30+ " days");
                break;
            case 2:
                if(year%400==0 || ((year%4==0) && !(year%100==0))){
                    System.out.println("month with " +29+ " days");
                }else {
                    System.out.println("month with " +28+ " days");
                }



        }
    }
}
