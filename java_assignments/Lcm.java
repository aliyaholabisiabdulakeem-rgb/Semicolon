import java.util.Scanner;
public class Lcm{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer: ");
    int number1 = input.nextInt();
System.out.print("Enter the second integer: ");
    int number2 = input.nextInt();


for(int count = 2; count <= number1 && count <= number2; count++){

if(number1 % count == 0 && number2 % count == 0){

      int lcm = count;
System.out.println("lcm = ", lcm);

    }

}

}

}
