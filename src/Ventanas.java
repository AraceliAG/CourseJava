import javax.swing.*;

public class Ventanas {

    public static void main(String[] args){

        String mensaje = "Hola mundo :)";
        String numeroStr = JOptionPane.showInputDialog(null, "enter a number");


        int numeroDecimal = Integer.parseInt(numeroStr);
        int suma =10+numeroDecimal;

        JOptionPane.showMessageDialog(null,mensaje+=numeroDecimal);
        JOptionPane.showMessageDialog(null,"LA SUMA ES DE: " + suma);

    }
}
