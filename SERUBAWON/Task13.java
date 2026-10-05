import java.util.Scanner;
public class Task13{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter item price: ");
    double price = input.nextDouble();
System.out.print("Enter quantity: ");
    int quantity = input.nextInt();
    
    double subtotal = price * quantity;
    double VAT = subtotal * 0.20;
    double grandtotal = subtotal + VAT;

System.out.println("Grand Total = " + grandtotal);
    
}
}
