import java.util.Scanner;
public class Task5_16{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.println("Enter 5 numbers between 1 and 30: ");
for(int count = 1; count <= 5; count++){
     int number = input.nextInt();

for(int counter = 1; counter <= number; counter++){
System.out.print("*");
}

System.out.println(" ");
}
}
}
