
package com.mycompany.assignment;
import java.util.Scanner;

public class SwitchAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        
        System.out.print("Option 1\n option2\n option3\n option4\n =" );
               
        option = input.nextInt();
        
        switch(option){
            case 0:
                System.out.println("Selected language bengali");
                break;
            case 1:
                System.out.println("You selected english");
                break;
            case 2:
                System.out.println("You selected pakistani");
                break;
            case 3:
                System.out.println("You selected hibru");
                break;
                
        }
    }
  
}
