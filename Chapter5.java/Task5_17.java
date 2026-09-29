import java.util.Scanner;

public class Task5_17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int countA = 0;
    int countB = 0;
    int countC = 0;
    int countD = 0;

    for (int i = 1; i <= 5; i++) {
      System.out.print("Enter name of student: ");
      String name = input.next();

      System.out.print("Enter grade (A, B, C, D): ");
      char grade = input.next().toUpperCase().charAt(0);

      switch (grade) {
        case 'A':
          countA++;
          break;
        case 'B':
          countB++;
          break;
        case 'C':
          countC++;
          break;
        case 'D':
          countD++;
          break;
        default:
          System.out.println("Invalid grade!");
          break;
        }
      System.out.println();
}

    System.out.println("----- Results -----");
    System.out.println("Total count of score A: " + countA);
    System.out.println("Total count of score B: " + countB);
    System.out.println("Total count of score C: " + countC);
    System.out.println("Total count of score D: " + countD);

}
}
