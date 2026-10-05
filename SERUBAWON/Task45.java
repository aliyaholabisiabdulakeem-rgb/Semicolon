import java.util.Scanner;
public class MonthDays {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
System.out.print("Enter month between 1 to 12: ");
    int month = input.nextInt();

if(month == 2){
     System.out.print("Enter year: ");
     int year = input.nextInt();
            if(year % 400 == 0){
                System.out.println("29 days");
                }
            else if(year % 4 == 0){
                System.out.println("29 days");
                }
            else if(year % 100 != 0){
                System.out.println("29 days");
                }
             else {
                System.out.println("28 days");
                }
        }
else if(month == 4 || month == 6 || month == 9 || month == 11){
    System.out.println("30 days");
}

else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
    System.out.println("31 days");
}
else {
    System.out.println("Invalid month");
}
    }
}
