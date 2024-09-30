
package com.mycompany.assignment;
import java.util.Scanner;

public class Assignmnet5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Enter Your Age = ");
        num = input.nextInt();
        
        if(18<=num){
            System.out.println("You are vaild for voting");
        }
        else{
            System.out.println("You are not valid for voting");
        }
    }
}
