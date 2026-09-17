import java.util.Scanner;
public class SquaremeterToPing{
public static void main(String[] ars){
    Scanner input =  new Scanner(System.in);
System.out.print("Enter a digit in squaremeter: ");
    double squaremeter = input.nextDouble();
    
    double ping = Squaremeter * 0.3025;
System.out.println("ping is " + ping);

}

}
