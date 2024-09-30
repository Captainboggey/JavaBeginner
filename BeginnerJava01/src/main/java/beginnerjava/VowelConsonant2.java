
package beginnerjava;

import java.util.Scanner;
public class VowelConsonant2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char letter;
        
        System.out.print("Enter your letter = ");
        letter = input.next().charAt(0);
        
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ){
            System.out.print("vowel");
        }
        
      
        else{
            System.out.print("constant");
        }
    
    }
           
    
}
