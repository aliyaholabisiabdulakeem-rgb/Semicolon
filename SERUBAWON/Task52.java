import java.util.Scanner;
public class Task52{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and Type 0 to stop: ");
        int number = input.nextInt();
        int total = 0;

        while(true){
            if(number == 0){
                break;
            }
            total += number;
            System.out.print("Enter a number and Type 0 to stop: ");
            number = input.nextInt();
        }

        System.out.println("Total is " + total);
    }
}
