package Matrix;

public class OverviewMatrix {
    public static void main (String [] args){
        int [][] matrix = new int [3] [4];
        matrix[0][0] = 5;
        matrix[0][1] = 10;
        matrix[0][2] = 15;
        matrix[0][3] = 20;
        matrix[1][0] = 25;
        matrix[1][1] = 30;
        matrix[1][2] = 35;
        matrix[1][3] = 40;
        matrix[2][0] = 45;
        matrix[2][1] = 50;
        matrix[2][2] = 55;
        matrix[2][3] = 60;

        System.out.println("Total rows: " + matrix.length);
        System.out.println("Total columns " + matrix[0].length);
        System.out.println("Firs element: " + matrix[0][0]);
        System.out.println("Last element: " + matrix[matrix.length-1][matrix[matrix.length-1].length-1]);

    }
}
