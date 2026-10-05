import java.util.Scanner;
public class TriangleVolume{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);

System.out.print("Enter the lenght: ");
    double lenght = input.nextDouble();
    double area = (Math.sqrt(3/4)) * lenght * lenght;
    double volume = area * lenght;
System.out.println("The area is" + area);
System.out.println("The volume is" + volume);

}


}
