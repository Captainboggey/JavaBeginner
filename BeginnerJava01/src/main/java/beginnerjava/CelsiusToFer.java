package beginnerjava;


import java.util.Scanner;

public class CelsiusToFer {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f , c ;
        System.out.print("Enter Tempreture in F = ");
        f = input.nextDouble();
        
        c = 0.5555555555555556 * (f - 32) ;
        System.out.println("Your result in C = "+c);
    }
    
}
