import java.util.Scanner;
public class DiscountEligibility{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter your total bill: ");
    double totalbill = input.nextDouble;
System.out.print("Are you a member? true/false: ");
    boolean ismember = input.nextBoolean;
if(total bill >= 1000 && ismember == "true"){
    System.out.println("10% off");
        }
else if(totalbill >= 1000 && ismember =="false"){
    system.out.println(5% off);
        }
else{
    System.out.println("No discount");
        }
}
}
