import java.util.Scanner;
public class Circle{
public static void main(String[] args){
 Scanner input = new Scanner(System.in);

System.out.print("Enter the radius of the circle: ");
 int radius = input.nextInt();

 double pi = 3.14159;
System.out.println("diameter = %f%n", 2 * radius);
System.out.println("circumference = %f%n", 2 *pi * radius);
System.out.println("area = %f%n", pi * radius * radius);

}
}
