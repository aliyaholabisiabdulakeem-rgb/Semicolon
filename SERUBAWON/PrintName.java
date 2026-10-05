import java.util.Scanner;
public class PrintName{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter your name: ");
    String Name = input.next();
System.out.print("Enter your age: ");
    int Age = input.nextInt();

System.out.println("Hello " + Name + " You are " + Age + " years old.");
}
}

