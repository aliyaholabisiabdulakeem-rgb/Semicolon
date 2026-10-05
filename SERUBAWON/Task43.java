import java.util.Scanner;
public class Task43{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter first side: ");
    float side1 = input.nextInt();
System.out.print("Enter second number: ");
    float side2 = input.nextInt();
System.out.print("Enter third numbber: ");
    float side3 = input.nextInt();

if(side1 == side2 && side2 == side3){
    System.out.println("Equilateral triangle");
}
else if(side1 == side2 || side2 == side3 || side1 == side3){
    System.out.println("Isosceles triangle");
}
else if(side1 <= 0 || side2 <= 0 || side3 <=0){
    System.out.println("Invalid");
}
else if(side1 + side2 <= side3){
    System.out.println("Invalid");
}
else if(side1 + side3 <= side2){
    System.out.println("Invalid");
}
else{
    System.out.println("scalene triangle");
}
}
}
