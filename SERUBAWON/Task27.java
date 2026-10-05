import java.util.Scanner;
public class Task27{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter first integer; ");
    int number1 = input.nextInt();
System.out.print("Entersceond integer; ");
    int number2 = input.nextInt();
    if(number1 > number2){ 
System.out.println(number1 + " is larger than " + number2);
}
    else if(number1 < number2){
System.out.println(number1 + " is smaller than " + number2);
}
    else if(number1 == number2){
System.out.println(number1 + " is equal to " + number2);
}
}
}
