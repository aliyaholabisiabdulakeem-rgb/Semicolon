import java.util.Scanner;
public class LargestSmallest{
public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 
System.out.println("Enter the first integer: ");
 int number1 = input.nextInt();
System.out.println("Enter the second integer: ");
 int number2 = input.nextInt();
System.out.println("Enter the third integer: ");
 int number3 = input.nextInt();
System.out.println("Enter the fourth integer: ");
  int number4 = input.nextInt();
System.out.println("Enter the fifth integer: ");
  int number5 = input.nextInt();

 int largest = number5;
 int smallest = number5;

if (number1 > number5){
 System.out.println("The largest number is " , number1 );
}
if (number2 > number5){
 System.out.println("The largest number is " , number2);
}
if (number3 > number5){
 System.out.println("The largest number is " , number3);
}
if (number4 > number5){
 System.out.println("The largest number is " , number4);
}
if (number1 < number5){
 System.out.println("The smallest number is " , number1);
}
if (number2 < number5){
 System.out.println("The smallest number is " , number2);
}
if (number3 < number5){
 System.out.println("The smallest number is " , number3);
}
if (number4 < number5){
 System.out.println("The smallest number is " , number4);
}
}
}
