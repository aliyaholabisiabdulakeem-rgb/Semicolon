import java.util.Scanner;
public class Task36{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter a character: ");
    String character = input.next().toLowerCase();

    String Vowel = "aeiou";
    String Consonant = "bcdfghjklmnpqrstvwxyz";

if(Vowel.contains(character)){
    System.out.println("Vowel");
    }
else if(Consonant.contains(character)){
    System.out.println("Consonant");
    }
else{
    System.out.println("Not a leter");
}
}
}
