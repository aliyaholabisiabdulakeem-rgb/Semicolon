import java.util.Scanner;
public class TaskTwo{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.println("Enter first score: ");
    double number1 = input.nextInt();
System.out.println("Enter second score: ");
    double number2 = input.nextInt();
System.out.println("Enter third score: ");
    double number3 = input.nextInt();
System.out.println("Enter fourth score: ");
    double number4 = input.nextInt();
System.out.println("Enter fifth score: ");
    double number5 = input.nextInt();
System.out.println("Enter sixth score: ");
    double number6 = input.nextInt();
System.out.println("Enter seventh score: ");
    double number7 = input.nextInt();
System.out.println("Enter eighth score: ");
    double number8 = input.nextInt();
System.out.println("Enter nineth score: ");
    double number9 = input.nextInt();
System.out.println("Enter tenth score: ");
    double number10 = input.nextInt();


double Sum = (number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10);
double total = (10);
double average = (Sum / total);

System.out.println(average);

}
}
