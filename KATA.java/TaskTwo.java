import java.util.Scanner;
public class TaskTwo{
public static boolean iseven(int number) {
    
    if (number % 2 == 0) {
    return true;
}
    else{
    return false;
}
}

public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int Number = input.nextInt();

        boolean result = iseven(Number);
        System.out.println(result);
    }
}
