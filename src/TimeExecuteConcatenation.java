public class TimeExecuteConcatenation {


    public static  void main(String[] args) {

        double endE;
        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder(c);

        long start = System.currentTimeMillis();

        for(int i=0;i<100000;i++){
            //c=+ a+b
            //c = c.concat(a).concat(b) + "\n";
            sb.append(a);
            sb.append(b);
            sb.append("\n");

        } //In the first iteration c is aab, this second iteration is aab + ab

        long end = System.currentTimeMillis();
        endE = end - start;
        System.out.println("time execute: " + endE);
        System.out.println(sb);

    }

}
