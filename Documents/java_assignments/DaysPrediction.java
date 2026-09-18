import java.util.Scanner;
public class DaysPrediction{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter a day: ");
    int day = input.nextInt();

if (day % 7 == 0){
System.out.println("monday");
}
if (day % 7 == 1){
System.out.println("Tuesday");
}
if (day % 7 == 2){
System.out.println("wednesday");
}
if (day % 7 == 3){
System.out.prnttln("thursday");
}
if (day % 7 == 4){
System.outprintln("friday");
}
if (day % 7 == 5){
System.out.println("Saturday");
}
if (day % 7 == 6){
System.out.println("Sunday");
}



}



}
