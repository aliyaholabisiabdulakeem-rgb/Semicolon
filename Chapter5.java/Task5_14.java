public class Task5_14 {
   public static void main(String[] args) {
      double principal = 1000.0;
      double rate;
      double amount;
      int year;

      for (rate = 0.05; rate <= 0.10; rate = rate + 0.01) {
          System.out.println("\n");
          System.out.println("Rate is " + rate);
          System.out.println("Year \t Amount");

          for (year = 1; year <= 10; year++) {
              amount = principal * Math.pow(1.0 + rate, year);
              System.out.println(year + " \t " + amount);
          }
      }
   }
}
