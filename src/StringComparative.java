public class StringComparative {

   public static  void main (String[] args){

       String course1 = "Course Java";
       String course2 = new String("Course Java");
       String course3 = "Course Java";

       boolean equal = course1 == course2;
       boolean equal2 = course1.equals(course2);

       System.out.println("EQUAL: " + equal2);
   }
}
