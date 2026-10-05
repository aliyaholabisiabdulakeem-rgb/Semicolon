import java.util.Scanner;
public class TemperatureConversion{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter a number in celsius: ");
    double Number = input.nextDouble();
    double Fahrenheit = (Number * 9/5) + 32;
System.out.println("Conersion = " + Fahrenheit);
}
}
