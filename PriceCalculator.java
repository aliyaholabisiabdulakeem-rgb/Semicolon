import java.util.Scanner;
public class PriceCalculator{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter your Age: ");
    int age = input.nextInt();
if(age < 5 ){
    System.out.println("Free");
        }
 else if(age >= 5 && age <= 12){
    System.out.println("$5");
        }  
 else if(age >= 13 && age <= 64){
    System.out.println("$12");
        }
else{
    System.out.println("$8");
        }
    }
}
