import java.util.scanner;
public class AscendingOrder{
    public static void main(String[] args){
    Scanner input = new Scanner(Sysrem.in);

    System.out.print("enter first integer: ");
        int number1 = input.nextInt();
    System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
    System.out.print("Enter third integer: ");
        int number3 = input.nextInt();

if (number1 < number2 < number3){
    System.out,println(number1, number2, number3);
}
else
    if(number1 < number3 < number2){
        System.out.println(number1, number3, number2);
}
else
    if(number2  < number1 < number3){
        System.out.println(number2, number1, number3);
}
else
    if(number2 < number3 < number1){
        System.out.println(number2, number3, number1);
}
else
    if(number3 < number2 < number1){
        System.out.println(number3, number2, number1);
}
else{
    System.out,println(number3, number1, number2);
}    
    
    }
}