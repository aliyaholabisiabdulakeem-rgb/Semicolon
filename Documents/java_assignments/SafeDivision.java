import java.util.Scanner;
public class SafeDivision{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter first integer: ");
    int valuex = input.nextInt();
System.out.print("enter second integer: ");
    int valuey = input.nextInt();
    
    int result = valuex / valuey;
if (valuey != 0){
System.out.println("Result");
}
else
if(valuey == 0){
System.out.println("cannot be divided by zero");

}

}

}
