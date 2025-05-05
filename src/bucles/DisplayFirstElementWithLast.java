package bucles;

public class DisplayFirstElementWithLast {

        public static  void main(String [] args){

            int[] a = new int[10];
            int[] b = new int[10];
            int[] c = new int[10];

            for(int i=0; i<a.length; i++){
                a[i] = i+1;
            }

            int piv = 0;
            for (int i = 0; i<a.length-i; i++){
                c[piv++] = a[i];
                c[piv++] = a[a.length-1-i];
            }

            for(int i = 0; i<c.length; i++){
                System.out.print (c[i] + " " );
            }
        }


}
