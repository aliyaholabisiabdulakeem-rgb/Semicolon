import java.util.Scanner;
public class Task18{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter a score out of 50: ");
    double score = input.nextDouble();
    double scaledmark = 100;
System.out.println("Original mark = " + score);
System.out.println("scaled mark = " + score  + "/ 100");
}
}

