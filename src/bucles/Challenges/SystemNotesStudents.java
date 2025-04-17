package bucles.Challenges;
import java.util.Scanner;

public class SystemNotesStudents {

    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        double average = 0;
        double [] notes  = new double[20];
        double grade;
        for(int i =0; i < notes.length; i++){

            System.out.println("Enter your grade: ");
            grade = sc.nextDouble();
            if (grade ==0){
                System.out.println(" Error, again enter another number  ");
                break;
            }else{
                notes[i] = grade;

            }

        }

        for(int i=0; i<notes.length; i++){
            average += notes[i];
        }
        int counter =0;
        double counter2 = 0;
        double counter3 = 0;
        int counter21 = 0;
        int counter31 = 0;
        for(int i=0; i<notes.length; i++){
            if(notes[i]==1){
                counter+=1;

            }else if (notes[i]>5){
                counter21+=1;
                counter2 += notes[i];
            }else if (notes[i]<4){
                counter31+=1;
                counter3+=notes[i];
            }
        }
        average = average/notes.length;
        System.out.println("average: " + average);
        System.out.println("average note>5: " + counter2/ (double)counter21);
        System.out.println("average: " +counter3/(double)counter31);
        System.out.println("Times the number 1 appeared: " + counter);
    }
}
