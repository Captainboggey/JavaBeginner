
package beginnerjava;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n,fact=1;
        System.out.print("Enter number to find factorial = ");
        n = input.nextInt();
        for ( i = n; i >= 1; i--) {
            
            fact = fact * i;
            
        }
        System.out.println("factorial of "+n+" = "+fact);
    }
    
}
