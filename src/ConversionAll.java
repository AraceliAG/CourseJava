import java.util.Scanner;

public class ConversionAll {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n==== Data Type Conversion Menu ====");
            System.out.println("1. Convert String to Integer");
            System.out.println("2. Convert String to Float");
            System.out.println("3. Convert String to Double");
            System.out.println("4. Convert Integer to String");
            System.out.println("5. Convert Float to String");
            System.out.println("6. Convert Double to String");
            System.out.println("7. Exit");
            System.out.print("Choose an option (1-7): ");

            int option = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter a String (e.g., '123'): ");
                    String strInt = sc.nextLine();
                    try {
                        int intValue = Integer.parseInt(strInt);
                        System.out.println("Converted to Integer: " + intValue);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid format.");
                    }
                    break;

                case 2:
                    System.out.print("Enter a String (e.g., '3.14'): ");
                    String strFloat = sc.nextLine();
                    try {
                        float floatValue = Float.parseFloat(strFloat);
                        System.out.println("Converted to Float: " + floatValue);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid format.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a String (e.g., '3.1415'): ");
                    String strDouble = sc.nextLine();
                    try {
                        double doubleValue = Double.parseDouble(strDouble);
                        System.out.println("Converted to Double: " + doubleValue);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid format.");
                    }
                    break;

                case 4:
                    System.out.print("Enter an Integer: ");
                    int number = sc.nextInt();
                    String intToStr = Integer.toString(number);
                    System.out.println("Converted to String: \"" + intToStr + "\"");
                    break;

                case 5:
                    System.out.print("Enter a Float: ");
                    float f = sc.nextFloat();
                    String floatToStr = Float.toString(f);
                    System.out.println("Converted to String: \"" + floatToStr + "\"");
                    break;

                case 6:
                    System.out.print("Enter a Double: ");
                    double d = sc.nextDouble();
                    String doubleToStr = Double.toString(d);
                    System.out.println("Converted to String: \"" + doubleToStr + "\"");
                    break;

                case 7:
                    keepRunning = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please select from 1 to 7.");
            }
        }
        sc.close();
    }
}
