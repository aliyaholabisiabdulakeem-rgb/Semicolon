import java.util.Scanner;

public class Task5_25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter odd number between 1 to 19: ");
        int number = input.nextInt();
        
        int middle = (number + 1) / 2;

        
        for(int count = 1; count <= middle; count++){
            for(int space = 0; space < middle - count; space++){ 
            System.out.print(" ");
            }
            for(int star = 0; star < 2*count - 1; star++){ 
            System.out.print("*");
            }
            System.out.println();
        }
       
        for(int count = middle - 1; count >= 1; count--){
            for(int space = 0; space < middle - count; space++){
            System.out.print(" ");
            }
            for(int star = 0; star < 2*count - 1; star++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
