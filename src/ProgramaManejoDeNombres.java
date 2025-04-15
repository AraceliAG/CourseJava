import java.util.Scanner;
public class ProgramaManejoDeNombres {
    public static  void main (String[] args){




                Scanner scanner = new Scanner(System.in);

                System.out.println("Ingrese un nombre de un familiar:");
                String nombreA = scanner.nextLine();
                String nombreA2 = nombreA.toUpperCase().charAt(1) + "."
                        + nombreA.substring(nombreA.length()-2);

                System.out.println("Ingrese otro nombre de un familiar:");
                String nombreB = scanner.nextLine();
                String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

                System.out.println("Ingrese otro nombre de un familiar:");
                String nombreC = scanner.nextLine();
                String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

                String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

                System.out.println(resultado);

//------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        String n1, n2,n3;
        char b1,b2,b3;
        System.out.println("INGRESE EL NOMBRE ");
        n1 = sc.nextLine();
        System.out.println("INGRESE EL NOMBRE ");
        n2 = sc.nextLine();
        System.out.println("INGRESE EL NOMBRE ");
        n3 = sc.nextLine();
        n1 = n1.toUpperCase();
        n2 = n2.toUpperCase();
        n3 = n3.toUpperCase();
        char[] arreglo =n1.toCharArray();
        char[] arreglo2 =n2.toCharArray();
        char[] arreglo3 =n3.toCharArray();
        b1 = arreglo[1];
        b2 = arreglo2[1];
        b3 = arreglo3[1];
        System.out.println(b1+ "." + (n1.substring(n1.length()-2).toLowerCase()) + "_" + b2+ "." + (n2.substring(n2.length()-2).toLowerCase()) + "_" + b3+ "." + (n3.substring(n3.length()-2).toLowerCase()) );
    }
}
