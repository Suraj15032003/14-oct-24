package array;
import java.util.*;
public class avg {
//public static void main(String args[]) {
//	Scanner sc =new Scanner (System.in);
//	Random rand = new Random();
//	int a=rand.nextInt(3);
//	System.out.println(a);
////	int b=sc.nextInt();
////	int c=sc.nextInt();
////	System.out.println((a+b+c)/3);
//	if(a==1) {
//		System.err.println(" halfday present");
//	}
//	else if(a==2) {
//		System.out.println("full day present");
//	}
//	else {
//		System.out.println("absent");
//	}
//}
//public static void main(String args[]) {
//        Random rand = new Random();
//        int halfDays = 0, fullDays = 0, absentDays = 0;
//
//       
//        for (int i = 1; i <= 30; i++) {
//            int a = rand.nextInt(3);  
//            System.out.print("Day " + i + ": ");
//
//            if (a == 1) {
//                System.err.println("Half day present");
//                halfDays++;
//            } else if (a == 2) {
//                System.out.println("Full day present");
//                fullDays++;
//            } else {
//                System.out.println("Absent");
//                absentDays++;
//            }
//        }
//
//        // Display total results after 30 days
//        System.out.println("\nAttendance Summary for 30 Days:");
//        System.out.println("Half days present: " + halfDays);
//        System.out.println("Full days present: " + fullDays);
//        System.out.println("Absent days: " + absentDays);
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        double sum = num1 + num2;
	        double difference = num1 - num2;
	        double product = num1 * num2;
	        
	       
	        if (num2 != 0) {
	            double quotient = num1 / num2;
	            double remainder = num1 % num2;

	       
	            System.out.println("Addition: " + sum);
	            System.out.println("Subtraction: " + difference);
	            System.out.println("Multiplication: " + product);
	            System.out.println("Division: " + quotient);
	            System.out.println("Modulus (Remainder): " + remainder);
	        } else {
	            System.out.println("Cannot divide by zero.");
	            System.out.println("Addition: " + sum);
	            System.out.println("Subtraction: " + difference);
	            System.out.println("Multiplication: " + product);
	        }

    }
}
