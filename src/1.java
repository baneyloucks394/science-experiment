import java.util.Scanner;
public class JavaApplication {
public static void main(String[] args) {
// Create a new scanner object to read from System.in
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
// Read in the number entered by the user
int num1 = sc.nextInt();
System.out.print("Enter another number: ");
int num2 = sc.nextInt();
System.out.println("The sum of these two numbers is " + (num1 + num2));
}
}