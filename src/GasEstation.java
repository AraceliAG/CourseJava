

import java.util.Scanner;
public class GasEstation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int consulta;
        System.out.println("AGREGA UN NUMERO: ");
        consulta = sc.nextInt();

        if (consulta==70){
            System.out.println("Estanque lleno ");
        }else if (consulta>=60 && consulta<70){
            System.out.println("Estanque casi lleno ");
        }else if (consulta>=40 && consulta<60){
            System.out.println("Estanque 3/4");
        }else if (consulta>=35 && consulta<40){
            System.out.println("Medio estanque ");
        }else if (consulta>=20 && consulta<35){
            System.out.println("Suficiente");
        }else if (consulta>=1 && consulta<20){
            System.out.println("Insuficiente ");
        }else{
            System.out.println("Intenta ingresar otro numero a consultar  ");
        }

    }
}
