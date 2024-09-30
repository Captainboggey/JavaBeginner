
package beginnerjava;

import java.util.Scanner;
public class ArithmeticDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 , num2, result ;
        System.out.print("Enter first number = ");
        num1 = input.nextInt();
        System.out.print("Enter second number = ");
        num2 = input.nextInt();
        
        result= num1+num2;
        System.out.println("addition = "+result);
        result= num1-num2;
        System.out.println("sub = "+result);
        result= num1*num2;
        System.out.println("multipication = "+result);
        double result2= (double) num1/num2;
        System.out.println("devider = "+result2);
        result= num1%num2;
        System.out.println("reminder = "+result);
        
        
    }
    
}
