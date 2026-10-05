import java.util.Scanner;

public class TaskThree{

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int Number = input.nextInt();

        boolean result = isPrime(Number);
        System.out.println(result);
    }
}
