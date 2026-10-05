import java.util.Scanner;
public class TaskEight{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter radius: ");
    double radius = input.nextDouble();
double pi = 3.14159;
double area = pi * radius * radius;
System.out.printf("Area = %.2f\n", area);
    }
}
