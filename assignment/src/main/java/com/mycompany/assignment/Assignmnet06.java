
package com.mycompany.assignment;

import java.util.Scanner;
public class Assignmnet06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any number between 0-9 = ");
        num = input.nextInt();
        
        if(num == 0){
            System.out.println("Zero");
        }
        else if(num == 1){
            System.out.println("One");
        }
        else if(num == 2){
            System.out.println("two");
        }
        else if(num == 3){
            System.out.println("three");
        }
        else if(num == 4){
            System.out.println("four");
        }
        else if(num == 5){
            System.out.println("five");
        }
        else if(num == 6){
            System.out.println("six");
        }
        else if(num == 7){
            System.out.println("seven");
        }
        else if(num == 8){
            System.out.println("eight");
        }
        else if(num == 9){
            System.out.println("nine");
        }
        else{
            System.out.println("not in library");
        }
    }
     
}
