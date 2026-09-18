import java.util.Scanner;
public class BmiCaetgry{
public static void main(String[] arg){
   Scanner input = new Scanner(System.in);
System.out.print("Enter weight in kg: ");
    double weight = input.nextDouble;
System.out.print("Enter height in meters: ");
    double height = input.nextDouble;

    double computebmi = weight / (height * height);
if(bmi < 18.5){
    System.out.println("Underweight");
        } 
else if(bmi >= 18.5 && bmi <= 24.9){
    System.out.println("Normal");
        } 
else if(bmi >= 25 && bmi <= 29.9){
    System.out.println("Overweight");
        }
else{
    System.out.println("Obese");
        }
    }
}

