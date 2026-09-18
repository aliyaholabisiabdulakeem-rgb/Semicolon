import java.util.Scanner;
	public class Barchart {
	public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter the first number between 1 and 30: ");
	  int number1 = input.nextInt();
	  System.out.println("Enter the second number between 1 and 30: ");
	  int number2 = input.nextInt();
          System.out.println("Enter the third number between 1 and 30: ");
	  int number3 = input.nextInt();
	  System.out.println("Enter the fourth number between 1 and 30: ");
	  int number4 = input.nextInt();
	  System.out.println("Enter the fifth number between 1 and 30: ");
	  int number5 = input.nextInt();

	int starter1 = 1;
	while ( starter1 <= number1){
	System.out.print("*");
	starter1++;
}

	System.out.print("\n");

	int Starter2 = 1;
	while ( starter2 <= number2){
	System.out.print("*");
	starter2++;
}

	System.out.print("\n");

	int starter3 = 1;
	while ( starter3 <= number3){
	System.out.print("*");
	starter3++;
}

	System.out.print("\n");
	
	int starter4 = 1;
	while ( starter4 <= number4){
	System.out.print("*");
	starter4++;
}

	System.out.print("\n"),

	int starter5 =1;
	while ( starter5 <= number5){
	System.out.print("*");
	starter5++;
}

	}

}