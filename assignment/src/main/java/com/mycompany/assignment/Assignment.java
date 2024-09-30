
package com.mycompany.assignment;

import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1 = 1800 , num2  , result;
        
        
        
        System.out.print("Enter Months = ");

        num2 = input.nextInt();
         result= num1/num2;
         
         System.out.println("Your Monthly Installment= "+result);
        
        
    }  
}
