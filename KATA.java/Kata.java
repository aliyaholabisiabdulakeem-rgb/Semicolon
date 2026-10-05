public class Kata{

// 1.maximum numbers.
public static int maximum(int a, int b){
if(a > b){
    return a;
}
else{
    return b;
}
}


// 2.isEven(integer) 
public static boolean isEven(int integer){
if(integer % 2 == 0){
    return true;
}
else{
    return false;
}
}


// 3. isPrimeNumber(integer) 
public static boolean isPrime(int integer){
for(int index = 2; index < integer; index++){
if(integer % index == 0){
    return false;
}
}
    return true;

}


// 4.subtract(integer, integer) 
public static int subtract(int a, int b){
if(a > b){
    return a - b;
}

else{
    return b - a;
}
}


//5.divide(integer,integer)
public static float divide(float a, float b){
if(b == 0){
    return 0;
}
    return (float) (a / b);ss
}


//6.factorOf(integer)
public static int factor(int number){
int count = 0;
for(int index = 1; index <= number; index++){
if(number % index == 0){
   count++;
}
}
    return count;

}


//7.isPerfectSquare(integer)
public static boolean isPerfectSquare(int number){
    int square = (int) Math.sqrt(number);
if(square * square == number){
    return true;
}
else{
    return false;
}
}


//8.isPalindrome(integer)
public static boolean isPalindrome(int number){
int first = number / 10000;
int second = (number / 1000) % 10;
int third = (number / 100) % 10;
int fourth = (number / 10) % 10;
int last = number %  10;
    
if(first == last && second == fourth){
   return true; 
}
else{    
    return false;
}
}

//9.factorialOf(integer)
public static long factorialOf(long number){
    long factorial = 1;
for(long index = 1; index <= number; index++){
    factorial *= index;
}
return factorial;
}


//10.squareOf(integer)
public static long squareOf(long number){
    return number * number;
}
public static void main(String[] args){
System.out.println("Maximum is " + maximum(3, 7));
System.out.println(isEven(15));
System.out.println(isPrime(9));
System.out.println(subtract(3,7));
System.out.println(divide(6,2));
System.out.println(factor(10));
System.out.println(isPerfectSquare(25));
System.out.println(isPalindrome(54145));
System.out.println(factorialOf(12));
System.out.println(squareOf(13));

}
}
