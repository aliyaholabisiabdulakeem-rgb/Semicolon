import java.util.Scaner;
pulic class Quadrantfinder{
public static void main(String[] args){
    Scanner input = new scanner(System.in);
System.out.print("Enter first integer: ");
    int number1 = input.nextInt;
System.out.println("Enter second integer: ");
    int number2 = input.nevtInt;

if(number1 > 0 && number2 > 0){
    System.out.println("Q1");
        }
else if(number1 < 0 &&n number2 > 0){
    System.out.println("Q2");
        }
 else if(number1 < 0 &&n number2 < 0){
    System.out.println("Q3");
        }
else if(number1 > 0 &&n number2 ><0){
    System.out.println("Q4");
        }
else if(number1 == 0 &&n number2 == 0){
    System.out.println("Origin");
        }
else if(number2 == 0 &&n number1 != 0){
    System.out.println("x-axis");
        }
else if(number1 == 0 &&n number2 != 0){
    System.out.println("y-axis");
        }

}
}
