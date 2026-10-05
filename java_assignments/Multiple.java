import java.util.Scanner;
public class Multiple{
public static void main(String[] args){
 Scanner input = new Scanner(SYstem.in);

System.out.println("Enter the fist variable: ");
 int number1 = input.nextInt();
System.out.println("Enter the second variable: ");
 int number2 = input.nextInt();

 int tripled = number1 * 3;
 int doubled = number2 *2;

if (tripled % doubled == 0){
 System.out.println(tripled, "is a multiple of", doubled);
}
if (tripled % doubled != 0){
 System.out.println(tripled, "is not a multiple of", doubled);
}



}



}
