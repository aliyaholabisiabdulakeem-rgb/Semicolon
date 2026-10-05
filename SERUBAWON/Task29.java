import java.util.Scanner;
public class Task29{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter username; ");
    String username = input.next();
System.out.print("Enter password; ");
    int password = input.nextInt();

 if(username.equals("admin") && password == 1234){ 
System.out.println("Access granted");
}
    else{
System.out.println("Access denied");
}
}
}
