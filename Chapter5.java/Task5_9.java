public class Task5_9{
public static void main(String[] args){

// a)
//while(i = 1; i <= 10, i+)
//    System.out.println(i);
  
  int i = 1;
while(i <= 10){
System.out.println(i);
i++; 
}

// b)
// switch(value){
//    Case value < 0:
//        System.out.println("Negative");
//    Case 0:
//        System.out.println("Zero");

//}

switch (value) {
  case 0:
    System.out.println("Zero");
    break;
  default:
    System.out.println("Negative");
    break;
}


// c)
//for (int i = 19; i > 1; i =+ 1)
//System.out.println(i);

for (int i = 19; i >= 1; i -= 2) {
  System.out.println(i);
}


// d)
//counter = 0;
//do {
//System.out.println(counter + 1);
//counter += 2;
//} while (counter <= 51);


int counter = 2;
do {
  System.out.println(counter);
  counter += 2;
} 
while (counter <= 50);

}
}
