import java.util.Scanner;
public class Factorial{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);

System.out.print("Enter an integer: ");
    int number = input.nextInt();

    long product = 1;
for(int counter = 1; counter <= number; counter++){
product = (product * counter);
System.out.println(product);

}

}
}

