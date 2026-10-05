import java.util.Scanner;
public class PrimeNumbers{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);

System.out.print("Enter an integer: ");
 int number = input.nextInt();
    
    for(int count = 2; count <= number; count++){
   
    while(number % count == 0){
    
    System.out.println(count);
    number /= count;  
    }
    
}
}
}


