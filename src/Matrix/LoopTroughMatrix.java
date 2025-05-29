package Matrix;

public class LoopTroughMatrix {

    public static void main(String[] args){
        //String [] [] names = new String[2][3];
        String [][] names= {
                {"Pepito", "Pancho", "Juan"},
                {"Pepita", "Pancha", "Juana"}
        };

        System.out.println("Using for: ");
        for(int i = 0; i<names.length; i++){
            for(int j=0; j<names[i].length;j++){
                System.out.print(names[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println("Using for each: ");

        for(String [] n:names){
            for(String n2:n){
                System.out.print(n2 + "\t");
            }
            System.out.println(" ");
        }
    }
}
