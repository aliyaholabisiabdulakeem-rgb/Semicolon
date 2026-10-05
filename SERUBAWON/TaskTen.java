import java.util.Scanner;
public class TaskTen{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter first name: ");
    String firstname = input.next();
System.out.print("Enter last name: ");
    String lastname = input.next();
System.out.print("Enter year of birth: ");
    int yearOfBirth = input.nextInt();

    int currentYear = 2025;
    int age = currentYear - yearOfBirth;
System.out.println("====profile====");
System.out.println("Fist Name     :  " + firstname);
System.out.println("Last Name     :  " + lastname);
System.out.println("Year Of Birth :  " + yearOfBirth);
System.out.println("Age           :  " + age);
}
}
