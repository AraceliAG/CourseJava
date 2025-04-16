package bucles;

public class workingAllWeek {
    public static void main (String[] args){

        loop: for(int i = 1; i<=7; i++){
            for(int j=1; j<=8; j++){

                if(i==6 || i==7){
                    System.out.println("FREE DAY :D ");
                    continue loop;
                }
                System.out.println("I'm working on day : " + i + " At " + j );
            }
        }
    }
}
