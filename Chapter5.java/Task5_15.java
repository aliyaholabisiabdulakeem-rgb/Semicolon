public class Task5_15 {
public static void main(String[] args) {
for (int row = 1; row <= 10; row++) {

    for (int count = 1; count <= 10; count++) {
        if (count <= row){
        System.out.print("*");
        }
        else{
        System.out.print(" ");
        }
          }
          System.out.print("   ");

          
    for (int count = 10; count >= 1; count--) {
        if (count >= row){ 
        System.out.print("*");
        }
        else{ 
        System.out.print(" ");
        }
          }
          System.out.print("   ");

          
    for (int count = 1; count <= 10; count++) {
        if (count < row){
        System.out.print(" ");
        }
        else{ 
        System.out.print("*");
        }
          }
          System.out.print("   ");

          
    for (int count = 10; count >= 1; count--) {
        if (count <= row){
        System.out.print("*");
        }
        else{ 
        System.out.print(" ");
        }
          }

          System.out.println();
      }
   }
}

