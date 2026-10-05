import java.util.Scanner;
public class TaskSix{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter first number: ");
    double number1 = input.nextDouble();
System.out.print("Enter second number");
    double number2 = input.nextDouble();

double sum = number1 + number2;
double difference = number1 - number2;
double product = number1 * number2;
double quotient = number1 / number2;

System.out.println("Sum = " + sum);
System.out.println("Difference = " + difference);
System.out.println("Product = " + product);
System.out.println("Quotient = " + quotient);
