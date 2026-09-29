public class Task5_21{
public static void main(String[] args){
    System.out.print("Side1 \t Side2 \t Hypotenuse");
for(int Side1 = 1; Side1 <= 500; Side1++){
    for (int Side2 = 1; Side2 <= 500; Side2++){
        for(int Hypotenuse = 1; Hypotenuse <= 500; Hypotenuse++){

    if(Side1 * Side1 + Side2 * Side2 == Hypotenuse * Hypotenuse){
System.out.println(Side1 + "\t" + Side2 + "\t" + Hypotenuse);
}
}
}
}
}
}

