
package beginnerjava;
import java.util.Scanner;
public class VowelConstant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char letter;
        
        System.out.print("Enter your letter = ");
        letter = input.next().charAt(0);
        
        if(letter == 'a'){
            System.out.print("vowel");
        }
        
        else if(letter == 'i'){
            System.out.print("vowel");
        }
        else if(letter == 'o'){
            System.out.print("vowel");
        }
        else if(letter == 'u'){
            System.out.print("vowel");
        }
        else{
            System.out.print("constant");
        }
    }
         
}
