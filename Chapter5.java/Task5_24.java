public class Task5_24{
    public static void main(String[] args){
        for(int count = 1; count <= 9; count++){
            int n = count;
            if(count > 5){
                n = 10 - count;
            }
            for(int space = 1; space <= 5 - n; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= 2*n - 1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
