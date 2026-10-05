import java.util.Scanner;
public class Task33{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter first integer: ");
    int number1 = input.nextInt();
System.out.print("Enter second integer: ");
    int number2 = input.nextInt();
System.out.print("Enter third integer: ");
    int number3 = input.nextInt();

    int largest = number1;
    if(number2 > largest){
largest = number2;
}
    if(number3 > largest){
largest = number3;
}

System.out.println("Largest = " + largest);
}
}
