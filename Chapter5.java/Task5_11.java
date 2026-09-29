import java.util.Scanner;
public class Task5_11 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
System.out.print("How many numbers? ");
    int count = input.nextInt();

System.out.print("Enter number: ");
    int number = input.nextInt();
    int minimum = number;
    int maximum = number;
    int sum = minimum + maximum;    
        int i = 1;

        while (i < count) {
            System.out.print("Enter number: ");
            number = input.nextInt();
            if (number < minimum) minimum = number;
            if (number > maximum) maximum = number;
            i++;
  }
    
System.out.println("Minimum: " + minimum);
System.out.println("Maximum: " + maximum);
System.out.println("Sum: " + sum);
}
}
