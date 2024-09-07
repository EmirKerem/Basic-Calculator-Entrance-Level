
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Welcome to the Basic Calculator");
        
        System.out.println("Select Operation (Addition, Subtraction, Division, Multiplication and Square Root or Trigonometric Operations)");
        String operation = scanner.nextLine();
        
        System.out.println("Enter the First Number");
        double first_num = scanner.nextDouble();
        
        if ("Addition".equals (operation)) {
            System.out.println("Enter the Second Number");
            double second_num = scanner.nextDouble();
            System.out.println("Result is " + (first_num + second_num));
        }
         else if ("Subtraction".equals (operation)) {
             System.out.println("Enter the Second Number");
            double second_num = scanner.nextDouble();
            System.out.println("Result is " + (first_num - second_num));
        }
        else if ("Division".equals (operation)) {
            System.out.println("Enter the Second Number");
            double second_num = scanner.nextDouble();
            System.out.println("Result is " + (first_num / second_num));
        }
        else if ("Multiplication".equals (operation)) {
            System.out.println("Enter the Second Number");
            double second_num = scanner.nextDouble();
            System.out.println("Result is " + (first_num * second_num));
        }
        else if ("Square Root".equals (operation)) {
            System.out.println("Result is " + Math.sqrt(first_num));
        }
        else if ("Trigonometric Operations".equals (operation)) {
            System.out.println("Select Operation (Sin, Cos, Tan, Cot, Asin, Acos");
            scanner.nextLine(); //dummy
            String trigo_selection = scanner.nextLine();
            
            if ("Sin".equals(trigo_selection)) {
                System.out.println("Result is " + Math.sin(Math.toRadians(first_num)));
            }
            else if ("Cos".equals(trigo_selection)) {
                System.out.println("Result is " + Math.cos(Math.toRadians(first_num)));
            } 
            else if ("Tan".equals(trigo_selection)) {
                System.out.println("Result is " + Math.tan(Math.toRadians(first_num)));
            }
            else if ("Cot".equals(trigo_selection)) {
                double cotresult = Math.tan(Math.toRadians(first_num));
                if (cotresult != 0) {
                    System.out.println("Result is " + (1 / cotresult));
                } else {
                    System.out.println("Error: Cotangent is undefined at this angle.");
                }
            }
            else if ("Asin".equals(trigo_selection)) {
                if (first_num >= -1 && first_num <= 1) {
                    System.out.println("Result is " + Math.toDegrees(Math.asin(first_num)));
                } else {
                    System.out.println("Error: Input should be between -1 and 1 for Asin.");
                }
            }
            else if ("Acos".equals(trigo_selection)) {
                if (first_num >= -1 && first_num <= 1) {
                    System.out.println("Result is " + Math.toDegrees(Math.acos(first_num)));
                } else {
                    System.out.println("Error: Input should be between -1 and 1 for Acos.");
                }
            }
            else {
                System.out.println("Invalid Trigonometric Operation Selected.");
            }
        }
        else {
            System.out.println("Invalid Operation Selected.");
        }
        
       
    }
}
