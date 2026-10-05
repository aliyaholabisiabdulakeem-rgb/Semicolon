import java.util.Scanner;
public class Task31{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter units: ");
    double unit = input.nextDouble();

    if(unit >= 0 && unit <=100){
System.out.println("4 naira");
}
    else if(unit >= 101 && unit <= 300){
System.out.println("75 naira");
}
    else if(unit > 300){
System.out.println("100 naira");
}
    else{
System.out.println("invalid");
}
}
}
