import java.util.Scanner;
public class SmallestLargest{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first integer: ");
    int number1 = input.nextInt();
    System.out.println("Enter second integer: ");
    int number2 = input.nextInt();
    System.out.println("Enter third integer: ");
    int number3 = input.nextInt();

int sum = number1 + number2 + number3;
float average = sum / 3;
int product = (number1 * number2 * number3);

int smallest = number1;
if (number2 < number1){
    smallest = number2;
}
    if (number3 < number1){
        smallest = number3;
}
int largest = number1;
        if (number2 > number1){
            largest = number2;
 }
            if (number3 > number1){
                largest = number3;
 }
   
   System.out.println("sum: " + sum);
        System.out.println("average: " + average);
        System.out.println("product: " + product);
        System.out.println("smallest: " + smallest);
        System.out.println("largest: " + largest);
    
    
    }
}