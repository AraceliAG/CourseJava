import javax.swing.JOptionPane;
public class GetNameLarge {

    public static void main(String[] args){

        String n1, n2, n3;
        String max;

         n1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
         n2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
         n3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String[] p1 = n1.split(" ");
        String[] p2 = n2.split(" ");
        String[] p3 = n3.split(" ");

        max = n1.split(" ")[0];
        System.out.println(max);
        String p11 = p1[0];
        String p22 = p2[0];
        String p33 = p3[0];
        String winner;

        if (p11.length()>p22.length()){
            System.out.println("winner: " + p11);
        }else if(p22.length()> p33.length()){
            System.out.println("winner: " + p22);
        }else{
            System.out.println("winner: " + p33);
        }






    }
}
