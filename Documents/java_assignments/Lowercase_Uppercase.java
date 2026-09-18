import java.util.Scanner;
public class UppercaseLowercase{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        String character = input.next();
        if (character >= 'A' && character <= 'z'){
            System.out.println("Uppercase");
             }
            else if (character >= 'a' && character <= 'z'){
            System.out.println("Lowercase");
            }
            else if(character >= '0' && character <= '9'){
                System.out.println("Digits");
            }
            else{
                System.out.println("Special Symbols");
            }
    }
}