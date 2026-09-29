public class Task5_20{
    public static void main(String[] args){
        double pi = 0;
        for (int i = 1; i <= 200000; i++){
            int denominator = i * 2 - 1;
            double fraction = 4.0 / denominator;
            if (i % 2 == 1){
                pi = pi + fraction;
            } 
            else{
                pi = pi - fraction;
            }
        }
        System.out.println("Pi is: " + pi);
    }
} 
